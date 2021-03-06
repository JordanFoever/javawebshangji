package com.huxt.model;

public class Goods {
	private int id;
	private String name;  //产品名称
	private String cover;
	private String image1; //图片
	private String image2;
	private float price;
	private String intro;  //简介
	private int stock;  //产品库存

	@Override
	public String toString() {
		return "Goods{" +
				"id=" + id +
				", name='" + name + '\'' +
				", cover='" + cover + '\'' +
				", image1='" + image1 + '\'' +
				", image2='" + image2 + '\'' +
				", price=" + price +
				", intro='" + intro + '\'' +
				", stock=" + stock +
				'}';
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

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
