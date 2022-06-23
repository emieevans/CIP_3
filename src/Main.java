public class Main {
    public static void main(String[] args) {
        var res = Sumar(17,4,8);
        System.out.println("El resultado de la suma es: "+res);

        //COCHE OBJECT
        Coche miCoche;
        miCoche = new Coche();
        miCoche.getDoors();
        System.out.println("El objeto tiene: "+miCoche.doors+" puertas.");
    }
    //PART 1
    public static int Sumar (int a, int b, int c) {
        var resultado = a + b +c;
        return (resultado);
    }
    //PART 2
    public static class Coche {
        int doors = 1;
        public int getDoors() {
            doors = doors + 1;
            return doors;
        }
    }
}