package test;

class Auto{
    Motor men1 = new Motor();
    Asiento men2 = new Asiento();

    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static String cantidadCreados;

    cantidadAsientos(){

    }
    verificarIntegridad(){
        if (registro == men1.registro && men1.registro == men2.registro){
            System.out.println("Auto original");
        }   else{
            System.out.println("Las piezas no son originales");
        }

    }
}