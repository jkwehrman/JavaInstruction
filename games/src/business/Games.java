//updated 511

package business;

public class Games {
	private String name;
	private String type;
	private int minimumPlayers;
	private int maximumPlayers;
	private String description;
	
	public Games() {
		super();
	}

	public Games(String name, String type, int minimumPlayers, int maximumPlayers, String description) {
		super();
		this.name = name;
		this.type = type;
		this.minimumPlayers = minimumPlayers;
		this.maximumPlayers = maximumPlayers;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMinimumPlayers() {
		return minimumPlayers;
	}

	public void setMinimumPlayers(int minimumPlayers) {
		this.minimumPlayers = minimumPlayers;
	}

	public int getMaximumPlayers() {
		return maximumPlayers;
	}

	public void setMaximumPlayers(int maximumPlayers) {
		this.maximumPlayers = maximumPlayers;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Games [name=" + name + ", type=" + type + ", minimumPlayers=" + minimumPlayers + ", maximumPlayers="
				+ maximumPlayers + ", description=" + description + "]";
	}
	
	
}
	
	
	

	

	
//	  Name						VARCHAR(25)             NOT NULL,
//	  Type        				VARCHAR(15)    			NOT NULL,    
//	  MinimumPlayers			INT   					NOT NULL,
//	  MaximumPlayers			INT   					NOT NULL,
//	  Description				VARCHAR(125)    		NOT NULL