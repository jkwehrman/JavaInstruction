package business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stuffy {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String type;
	private String color;
	private String size;
	private int limbs;
	
	public Stuffy() {
//		super();
		id= 0;
		type="";
		color="";
		size="";
		limbs= 0;
	}

	public Stuffy(int inId, String inType, String inColor, String inSize, int inLimbs) {
		id = inId;
		type = inType;
		color = inColor;
		size = inSize;
		limbs = inLimbs;	
	}

	public Stuffy(int id, String type, String color, String size, int limbs) {
		super();
		this.id = id;
		this.type = type;
		this.color = color;
		this.size = size;
		this.limbs = limbs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getLimbs() {
		return limbs;
	}

	public void setLimbs(int limbs) {
		this.limbs = limbs;
	}

	@Override
	public String toString() {
		return "Stuffy [id=" + id + ", type=" + type + ", color=" + color + ", size=" + size + ", limbs=" + limbs + "]";
	}
	


	

	
	
}

//updated 511
/*
package business;



public class Stuffy {
	private int id;
	private String type;
	private String color;
	private String size;
	private int limbs;
	


	public Stuffy() {
		super();
	}

	public Stuffy(int id, String type, String color, String size, int limbs) {
		this.id = id;
		this.type = type;
		this.color = color;
		this.size = size;
		this.limbs = limbs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getLimbs() {
		return limbs;
	}

	public void getLimbs(int limbs) {
		this.limbs = limbs;
	}

	@Override
	public String toString() {
		return "Stuffy [id=" + id + ", type=" + type + ", color=" + color + ", size=" + size + ", limbs=" + limbs + "]";
	
}
}

*/

