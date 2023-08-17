package com.javacourse.tips;

//Imports
/* Todos los import parte de java.lag
 * Se puede hacer imports staticos*/
import static java.lang.System.out;

//Se importan arraylist y collection
//tambien se puede hacer static
 import java.util.ArrayList;
//import java.util.Collection;
import java.util.Objects;

import static java.util.Collections.*; //imoprt static


//Metodo equals
class Client {
	private int id;

	
	public Client(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//equals y hashcode
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object that) {
		if (this == that)
			return true;
		if (that == null)
			return false;
		if (getClass() != that.getClass())
			return false;
		Client other = (Client) that;
		if(id != other.id)
			return false;
		return true;
	}
	
	
	
}

/*
 * Access Modifiers
 * Public
 * Protected No se puede usar en clases
 * (default) Solo se puede acceder desde el mismo package
 * Private No se puede usar en clases
 * */
public class TipsOfJva {

	public static void main(String[] args) {
		//Probando el import statico
		out.print("Import Static\n\n");
		//Collection.sort(new ArrayList<String>());
		sort(new ArrayList<String>()); //Usando el collections static
	
		Client c1 = new Client(1);
		Client c2 = new Client(1);
		Client c3 = new Client(2);
		
		out.println(c1.equals(c3));
		out.println(c1.equals(c1));
		
	}

}
