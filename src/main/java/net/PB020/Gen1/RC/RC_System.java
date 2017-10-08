package net.PB020.Gen1.RC;

import com.fasterxml.jackson.annotation.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "@class")
@JsonIdentityInfo(generator = ObjectIdGenerators.StringIdGenerator.class)
public class RC_System {
	private String SystemName;
	private String SystemOS;

	private int SystemType;

	private int SystemStorage;

	private String CPUModel;

	private double ProcessorSpeed;

	private int NumberOfProcessors;

	private int RamSize;

	private boolean isConnectedtoNetwork;

	@JsonCreator
	public RC_System(@JsonProperty(required = true) String systemName,
	                 @JsonProperty(required = true) String systemOS,
	                 @JsonProperty(required = true) int systemType,
	                 @JsonProperty(required = true) int systemStorage,
	                 @JsonProperty(required = true) String processorModel,
	                 @JsonProperty(required = true) double processorSpeed,
	                 @JsonProperty(required = true) int numberOfProcessors,
	                 @JsonProperty(required = true) int systemRam,
	                 @JsonProperty(required = true) boolean isConnectedtoNetwork) {

		this.SystemName = systemName;
		this.SystemOS = systemOS;
		this.SystemType = systemType;
		this.SystemStorage = systemStorage;
		this.CPUModel = processorModel;
		this.ProcessorSpeed = processorSpeed;
		this.NumberOfProcessors = numberOfProcessors;
		this.RamSize = systemRam;
		this.isConnectedtoNetwork = isConnectedtoNetwork;
	}

	public String getSystemName() {
		return SystemName;
	}

	public void setSystemName(String systemName) {
		SystemName = systemName;
	}

	public String getSystemOS() {
		return SystemOS;
	}

	public void setSystemOS(String systemOS) {
		SystemOS = systemOS;
	}

	public int getSystemType() {
		return SystemType;
	}

	public void setSystemType(int systemType) {
		SystemType = systemType;
	}

	public int getSystemStorage() {
		return SystemStorage;
	}

	public void setSystemStorage(int systemStorage) {
		SystemStorage = systemStorage;
	}

	public String getCPUModel() {
		return CPUModel;
	}

	public void setCPUModel(String CPUModel) {
		this.CPUModel = CPUModel;
	}

	public double getProcessorSpeed() {
		return ProcessorSpeed;
	}

	public void setProcessorSpeed(double processorSpeed) {
		ProcessorSpeed = processorSpeed;
	}

	public int getNumberOfProcessors() {
		return NumberOfProcessors;
	}

	public void setNumberOfProcessors(int numberOfProcessors) {
		NumberOfProcessors = numberOfProcessors;
	}

	public int getRamSize() {
		return RamSize;
	}

	public void setRamSize(int ramSize) {
		RamSize = ramSize;
	}

	public boolean getNetworkConnection() {
		return isConnectedtoNetwork;
	}

	public void setNetworkConnection(boolean networkConnection) {
		isConnectedtoNetwork = networkConnection;
	}

	@Override
	public String toString() {
		return  "\n\n\"" + SystemName + "\" System Specs: \n" +
				"SystemName = '" + SystemName + '\'' +
				"\nSystem OS = '" + SystemOS + '\'' +
				"\nSystem Type = " + SystemType +
				"bit \nSystem Storage = " + SystemStorage +
				"GB \nCPU Model = '" + CPUModel + '\'' +
				"\nProcessor Speed = " + ProcessorSpeed +
				"GHz \nNumber Of Processors = " + NumberOfProcessors +
				"\nRam Size (MB) =" + RamSize +
				"MB \nRam Size (GB) = " + (RamSize / 1024) + "GB" +
				"\nIs Connected to the Network = " + isConnectedtoNetwork;
	}
}
