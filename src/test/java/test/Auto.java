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

    public int cantidadAsientos(){
        num_asientos = 0;
        for(Asiento a : this.asientos){
            if (a instanceof Asientos){
                ++num_asientos;
            }
        }
        return num_asientos;
    }
    public String verificarIntegridad(){
        for (Asiento a : this.asientos){
            if (a instanceof Asiento){
                if (a.registro == motor.registro && motor.registro == this.registro) {
                    return "Auto Original";
                }
            }
        }
        return "Las piezas no son originales";
    }
}