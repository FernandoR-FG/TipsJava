package com.javacourse.tips.enums;

//Esto puede ser llamado desde cualquier otra clase (public)
enum Season{
	WINTER(1),SPRING(2),SUMMER(3),FALL(4);
	private int value = 0;
	private Season(int value) {
		this.value = value;
	}
	
}

public class EnumRunner {

	public static void main(String[] args) {
	//	Season season = "Hola"; //No permite otro valor a los indicados
		Season season2 = Season.valueOf("WINTER");
		Season.SPRING.ordinal();
		Season.values();
		
	}

}
