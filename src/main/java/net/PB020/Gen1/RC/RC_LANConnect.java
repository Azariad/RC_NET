package net.PB020.Gen1.RC;

import com.fasterxml.jackson.annotation.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "@class")
@JsonIdentityInfo(generator = ObjectIdGenerators.StringIdGenerator.class)
public class RC_LANConnect extends RC_Network{

	private boolean isWiredConnection;

	@JsonCreator
	public RC_LANConnect(@JsonProperty(required = true) String systemName,
	                     @JsonProperty(required = true) String systemOS,
	                     @JsonProperty(required = true) int systemType,
	                     @JsonProperty(required = true) int systemStorage,
	                     @JsonProperty(required = true) String processorModel,
	                     @JsonProperty(required = true) double processorSpeed,
	                     @JsonProperty(required = true) int numberOfProcessors,
	                     @JsonProperty(required = true) int systemRam,
	                     @JsonProperty(required = true) boolean isConnectedtoNetwork,
	                     String DNSServer,
	                     @JsonProperty(required = true) String defaultGateway,
	                     @JsonProperty(required = true) String IPv4Address,
	                     @JsonProperty(required = true) String transmissionMedia,
	                     String networkInterfaceCard,
	                     String networkOperatingSystem,
	                     @JsonProperty(required = true) String DNSSuffix,
	                     @JsonProperty(required = true) boolean isConnectedtoLAN,
	                     @JsonProperty(required = true) boolean isWiredConnection) {
		super(systemName, systemOS, systemType, systemStorage, processorModel, processorSpeed, numberOfProcessors, systemRam, isConnectedtoNetwork,
				DNSServer, defaultGateway, IPv4Address, transmissionMedia, networkInterfaceCard, networkOperatingSystem, DNSSuffix, isConnectedtoLAN);
		this.isWiredConnection = isWiredConnection;
	}

	public boolean isWiredConnection() {
		return isWiredConnection;
	}

	public void setWiredConnection(boolean wiredConnection) {
		isWiredConnection = wiredConnection;
	}

	@Override
	public String toString() {
		return "\n\nLAN Status: \n" +
				"Wired Connection = " + isWiredConnection;
	}
}

