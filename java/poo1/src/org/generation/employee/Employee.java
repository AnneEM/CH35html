package org.generation.employee;

/*  ESTRUCTURA BÁSICA PARA CREAR OBJETOS
 * 1. Atributos o propiedades
 * 2. Método constructor (1- n métodos)
 * 3. Métodos del objeto (Comportamiento)
 * 4. Métodos Getters y Setters
 * 5. Método string
 * 
 */


public class Employee {
	
	// 1. Atributos o propiedades
	String nombre;
	String apellido;
	int id;
	double salario;
	String puesto;
	
	
	// 2. Método constructor. Tiene el mismo nombre que la clase,  no retorna nada, recibe parámetros (Atributos) y los asigna a variables del constructor (this)
	Employee(String nombre, String apellido, int id, double salario, String puesto){
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.salario = salario;
		this.puesto = puesto;
	}
	
	//3. Métodos de comportamiento
	void trabajar() {
		System.out.println("Estoy trabajando");
	}
	
	void calcularSalario() {
		System.out.println("El salario del empleado " + this.nombre + " " + this.apellido + " es de " + this.salario + " pesos");
	}
	
	void capacitarse() {
		System.out.println("El trabajador del puesto " + this.puesto + " se capacita");
	}
	
	void infoGeneral() {
		System.out.println("ID:" + this.id + " Nombre:" + this.nombre + " Apellido:" + this.apellido);
	}


	
	// 4. Getters y Setters. Son métodos que nos permiten obtener o enviar información que está protegida por modificadores de acceso y de esta manera interactar con los objetos. Los getter nos permiten obtener la info y los  setters nos permiten enviarla. NO SE UTILZAN SI NO SON NECESARIOS
	/*
	 * !!! Estructura de getter:
	 *     public tipoDato getNombreVariable (){
	 *     return nombreVariable
	 *     }
	 *     
	 * !!! Estructura del setter:
	 *     public void sterNombreVariable (variable) {
	 *     this.variable = variable;
	 *     }
	 *     
	 *     Podemos inicializar getters y setters con clic derecho > Soursce > Generate getters y setters > Select all > Generate
	 * */
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}


	// 5. Método toString. Es un "Override" que se refiere a la capacitación de proporcionar información específica de una clase en forma de cadena de caracteres. Nos permite imprimir nuestros objetos en formato to.string.
	
	/*
	 * click derecho > src > generate toString > Fields > generate
	 */
	
		@Override
	public String toString() {
		return "Employee [nombre=" + nombre +
				", apellido=" + apellido + 
				", id=" + id + 
				", salario=" + salario
				+ 
				", puesto=" + puesto + "]";
	}
	
		
	
	
	
}
