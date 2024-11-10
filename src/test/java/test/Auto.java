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
    static int cantidadCreados;

    int cantidadAsientos(){
        num_asientos = 0;
        for(Asiento a : asientos){
            if (a instanceof Asientos){
                cantidadCreados = ++num_asientos;
            }
        }
    }
    public void verificarIntegridad(){
        if (registro == men1.registro && men1.registro == men2.registro){
            System.out.println("Auto original");
        }   else{
            System.out.println("Las piezas no son originales");
        }

    }
}