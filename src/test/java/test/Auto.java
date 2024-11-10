package test;

class Auto{
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    public int cantidadAsientos(){
        int num_asientos = 0;
        for(Asiento a : this.asientos){
            if (a instanceof Asiento){
                ++num_asientos;
            }
        }
        return num_asientos;
    }
    public String verificarIntegridad(){
        for (Asiento a : this.asientos){
            if (a instanceof Asiento){
                if(a.registro != this.motor.registro || this.motor.registro != this.registro || a.registro != this.registro) {
                    return "Las piezas no son originales";
                }   
            }
        }
        return "Auto original";
    }
}