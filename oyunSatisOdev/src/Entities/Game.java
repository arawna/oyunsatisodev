package Entities;

public class Game {
	private int id;
	private String name;
	private int price;
	private String img;
	private String details;
	
	public Game() {
		
	}

	public Game(int id, String name, int price, String img, String details) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.img = img;
		this.details = details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
}
