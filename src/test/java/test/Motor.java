package test;

class Motor{
    int numeroCilindros;
    String tipo;
    int registro;
    String[] tipoDeMotor = {"electrico","gasolina"};

    public void cambiarRegistro(int registro){
        this.registro = registro;
    }
    public void asignarTipo(String tipo){
        for(String p : tipoDeMotor){
            if (p.equals(tipo)){
                this.tipo = tipo;
            }
        }
    }
}