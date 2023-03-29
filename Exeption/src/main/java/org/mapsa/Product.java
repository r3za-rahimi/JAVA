package org.mapsa;

public class Product {

private int weight;


public Product(int weight){
	
	this.weight = weight;
}

public void setWeight(int weight){
	
	this.weight = weight;
}

public int getWeight(){
	
	return weight;
}




public void checkWeight(){
	

if ( this.weight< 100){

throw new InvalidProductException("weight is less than 100");
	
}

}


public static void main(String[] args){


Product p = new Product(500);

p.checkWeight();

p.setWeight(10);
p.checkWeight();

p.setWeight(200);
p.checkWeight();

}


















}