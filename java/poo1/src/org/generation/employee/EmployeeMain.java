package org.generation.employee;

public class EmployeeMain {
	public static void main(String[] args) {
		//Instanciar los objetos
		Employee Daniel = new Employee ("Daniel", "Maldonado",7836, 8596.33, "Instructor");
		Employee Abigail = new Employee ("Abigail", "Martinez",5274, 1975.20, "Desarrolladora Frontend");
		Employee Arturo = new Employee ("Arturo", "Avila",4483, 17999, "Desarrollador backend");
		
		System.out.println(Daniel);
		System.out.println(Abigail);
		System.out.println(Arturo);
		
		
		//Invocando métodos deinidos previamente (trabajar, calcularSalario, capacitarse,info.General)
		
		Daniel.infoGeneral();
		Arturo.calcularSalario();
		Abigail.capacitarse();
		
		
		
		//Utilizar información especifica de cada objeto mediante sus propieddades
		//Usando getter
		System.out.println(Daniel.getNombre () + " " + Daniel.getApellido() + " ocupa el puesto de " + Daniel.getPuesto());
		//Accediendo a la propiedad del objeto
		System.out.println(Abigail.puesto + " gana $" +Abigail.salario + " pesos");
		
		
		//Actualizar la informaión con un Setter
		Arturo.setSalario(15000);
		Arturo.calcularSalario();
		
	}//MAIN
}
