/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensegundoparcial;

/**
 *
 * @author tavoGeek
 */
public class ExamenSegundoParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Docente docente = new Docente(11965, "Arturo");
        Alumno alumno = new Alumno(112336, "Gustavo");

        System.out.println("ALUMNO");
        System.out.println(alumno.getNombre());
        alumno.setNombre("Gustavo Castillo");
        System.out.println(alumno.getNombre());
        System.out.println(alumno.Asistir());
        System.out.println(alumno.Estudiar());
        System.out.println(alumno.Practicar());
        alumno.setCurp("abcd");
        System.out.println(alumno.getCurp());
        System.out.println(alumno.getMatricula());
        alumno.setMatricula(666);
        System.out.println(alumno.getMatricula());
        System.out.println(alumno.imitarvoz(10));
        System.out.println("");

        System.out.println("DOCENTE");
        System.out.println(docente.getNombre());
        docente.setNombre("Arturo Alegria");
        System.out.println(docente.getNombre());
        System.out.println(docente.Asistir());
        System.out.println(docente.Practicar());
        System.out.println(docente.getNumEmp());
        docente.setNumEmp(3333);
        System.out.println(docente.getNumEmp());
        docente.setCurp("absssss");
        System.out.println(docente.getCurp());
        System.out.println(docente.Evaluar(alumno.getMatricula()));
        docente.edad = 30;
        System.out.println(docente.edad);
        System.out.println(docente.imitarvoz(20));
        System.out.println("");

        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("");

        Automovil auto = new Automovil("ABCD");
        Bicicleta bici = new Bicicleta();

        System.out.println("AUTOMOVIL");
        auto.Frenar();
        auto.Acelerar();
        auto.setColor("ROJO");
        auto.setModelo("CHEVY");
        auto.setNumllantas(4);
        auto.setPlacas("666");
        System.out.println(auto.getColor());
        System.out.println(auto.getModelo());
        System.out.println(auto.getNumllantas());
        System.out.println(auto.getPlacas());
        System.out.println("");
        
        System.out.println("BICICLETA");
        bici.setColor("AZUL");
        bici.setDiablito(1);
        bici.setModelo("BICICLON");
        bici.setNumllantas(2);
        System.out.println(bici.getColor());
        System.out.println(bici.getDiablito());
        System.out.println(bici.getModelo());
        System.out.println(bici.getNumllantas());
        System.out.println(bici.ponerDablos());
        System.out.println(bici.Apagar());
    }

}
