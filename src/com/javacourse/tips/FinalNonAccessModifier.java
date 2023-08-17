package com.javacourse.tips;

final class FinalClass{
	//No puede heradar a nadie
}
//class SomeClass extends FinalClass{} No se permmite porque final no deja heredar

//Los metodos finales no se pueden sobreescribir cuando otra clase lo hereda
class algunaClase{
	final public void hasAlgoNoSeSobreescribe() {}
	public void algoMas(final int arg) {
		//Un argumento final no puede ser cambiado en la funcion o metodo
	}
}

class algunaClaseHereda extends algunaClase{
	//public void hasAlgoNoSeSobreescribe(){}
	//No se puede sobreescribir un metodo final 
}


class Jugador{
	private String name;
	private static int count = 0; //Esto hara que el valor de static se mantenga
	public Jugador(String name) {
		super();
		this.name = name;
		count++; //Se intenta contar el numero de jugador
		//pero cada jugador al iniciar repite el contador por eso la variable count se cambia a static
	}
	
	
	public static int getCount() { //Los metodos statics no pueden tener un valor no static en su interior
		return count;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

public class FinalNonAccessModifier {

	public static void main(String[] args) {
		final int i = 5;
		//i = 8; este valor no puede cambiar es final/cosntante
		Jugador j1 = new Jugador("Yo");
		Jugador j2 = new Jugador("Yo");
		Jugador j3 = new Jugador("Yo");
		System.out.println(Jugador.getCount()); //Se lo llama desde la clase y no la instancia porque 
		//La clase Jugador tiene como static count y eso significa que es la misma para todos los objetos de la clase
		
	}

}
