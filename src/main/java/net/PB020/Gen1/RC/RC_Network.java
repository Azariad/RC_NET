package net.PB020.Gen1.RC;

import com.fasterxml.jackson.annotation.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "@class")
@JsonIdentityInfo(generator = ObjectIdGenerators.StringIdGenerator.class)
public class RC_Network extends RC_System{
	private String DNSServer;
	private String DefaultGateway;
	private String IPv4Address;
	private String TransmissionMedia;
	private String NetworkInterfaceCard;
	private String NetworkOperatingSystem;
	private String DNSSuffix;
	private boolean isConnectedtoLAN;

	@JsonCreator
	public RC_Network(@JsonProperty(required = true) String systemName,
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
	                  @JsonProperty(required = true) boolean isConnectedtoLAN) {
		super(systemName, systemOS, systemType, systemStorage, processorModel, processorSpeed, numberOfProcessors, systemRam, isConnectedtoNetwork);
		this.DNSServer = DNSServer;
		DefaultGateway = defaultGateway;
		this.IPv4Address = IPv4Address;
		TransmissionMedia = transmissionMedia;
		NetworkInterfaceCard = networkInterfaceCard;
		NetworkOperatingSystem = networkOperatingSystem;
		this.DNSSuffix = DNSSuffix;
		this.isConnectedtoLAN = isConnectedtoLAN;
	}

	public String getDNSServer() {
		return DNSServer;
	}

	public void setDNSServer(String DNSServer) {
		this.DNSServer = DNSServer;
	}

	public String getDefaultGateway() {
		return DefaultGateway;
	}

	public void setDefaultGateway(String defaultGateway) {
		DefaultGateway = defaultGateway;
	}

	public String getIPv4Address() {
		return IPv4Address;
	}

	public void setIPv4Address(String IPv4Address) {
		this.IPv4Address = IPv4Address;
	}

	public String getTransmissionMedia() {
		return TransmissionMedia;
	}

	public void setTransmissionMedia(String transmissionMedia) {
		TransmissionMedia = transmissionMedia;
	}

	public String getNetworkInterfaceCard() {
		return NetworkInterfaceCard;
	}

	public void setNetworkInterfaceCard(String networkInterfaceCard) {
		NetworkInterfaceCard = networkInterfaceCard;
	}

	public String getNetworkOperatingSystem() {
		return NetworkOperatingSystem;
	}

	public void setNetworkOperatingSystem(String networkOperatingSystem) {
		NetworkOperatingSystem = networkOperatingSystem;
	}

	public String getDNSSuffix() {
		return DNSSuffix;
	}

	public void setDNSSuffix(String DNSSuffix) {
		this.DNSSuffix = DNSSuffix;
	}

	public boolean getisConnectedtoLAN(){
		return isConnectedtoLAN;
	}

	public void setisConnectedtoLAN(boolean isConnectedtoLAN){
		this.isConnectedtoLAN = isConnectedtoLAN;
	}

	@Override
	public String toString() {
		return "\n\nNetwork Specs: \n" +
				"DNSServer = " + DNSServer +
				"\nDefaultGateway = " + DefaultGateway +
				"\nIPv4Address = " + IPv4Address +
				"\nTransmissionMedia = '" + TransmissionMedia + '\'' +
				"\nNetworkInterfaceCard = '" + NetworkInterfaceCard + '\'' +
				"\nNetworkOperatingSystem = '" + NetworkOperatingSystem + '\'' +
				"\nDNSSuffix = '" + DNSSuffix + '\'';
	}
}
