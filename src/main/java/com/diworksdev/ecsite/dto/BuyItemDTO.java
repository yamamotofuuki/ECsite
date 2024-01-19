package com.diworksdev.ecsite.dto;

public class BuyItemDTO {
	
	public int id;
	
	//テーブルカラムに対応したフィールド変数を宣言
	public String itemName;
	public String itemPrice;
	
	//フィールド変数に対応したGetter Setterを定義
	public String getItemName(){
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getItemPrice() {
		return itemPrice;
	}
	
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

}
