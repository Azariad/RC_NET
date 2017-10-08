package net.PB020.Gen1.RC;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.yaml.snakeyaml.Yaml;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by Abenezer Adane on 9/29/17.
 */
public class RC_1 {

	private String host;
	private List<String> ConnectedSystemIP;
	private String network;
	private List<RC_System> Systems;

	@JsonCreator
	public RC_1(@JsonProperty(required = true) String host,
	            @JsonProperty(required = true)  List<String> ConnectedSystemIP,
	            @JsonProperty(required = true) String network,
	            @JsonProperty(required = true) List<RC_System> Systems) {
		this.host = host;
		this.ConnectedSystemIP = ConnectedSystemIP;
		this.network = network;
		this.Systems = Systems;
	}

	public static void main(String[] args) throws IOException {
		Yaml yaml = new Yaml();
		Map<?, ?> normalized = (Map<?, ?>) yaml.load(new FileReader("RC_1.yml"));
		YAMLMapper mapper = new YAMLMapper();
		//Turn the Map read by SnakeYaml into a String so Jackson can read it.
		String fixed = mapper.writeValueAsString(normalized);
		//Use a parameter name module so we don't have to specify name for every field.
		mapper.registerModule(new ParameterNamesModule(JsonCreator.Mode.PROPERTIES));
		//Deserialize the map into an object.
		RC_1 output = mapper.readValue(fixed, RC_1.class);
		System.out.println("Network Name: " + output.network);
		System.out.println("Host: " + output.host);
		System.out.println("Connected System IP: " + output.ConnectedSystemIP);
		System.out.println("Systems: " + output.Systems);
	}
}

