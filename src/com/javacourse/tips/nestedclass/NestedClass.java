package com.javacourse.tips.nestedclass;

class DefaultPerson{
	
}

public class NestedClass {

	class InnerClass{
		//No necesita el static
		//Necesita una instancia de la clase base
		//puede acceder a variables miembro
	}
	
	static class StaticNestedClass{
		//Es una funcion que siempre va estar
		//No puede ocupar variables no staticas
	}
	
	public static void main(String[] args) {
		//InnerClass InnerClass = new InnerClass(); No permite
		StaticNestedClass staticNested = new StaticNestedClass();
	
		//Para ocupar una inner class
		//Debo isntanciar la clase
		//y llamar en un metodo 
		NestedClass nestedClassR = new NestedClass();
		InnerClass innerClass = nestedClassR.new InnerClass();
	}

}
