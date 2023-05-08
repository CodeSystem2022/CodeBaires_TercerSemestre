package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan", 10000);
        determinarTipo(empleado1);

        empleado1 = new Gerente("JosÃ©", 5000, "Sistemas");
        determinarTipo(empleado1);

    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente) empleado;
            //((Gerente) empleado).getDepartamento();
            System.out.println("Gerente = " + gerente.getDepartamento());

        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }

}
