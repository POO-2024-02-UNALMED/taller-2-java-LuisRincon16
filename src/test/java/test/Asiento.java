package test;

class Asiento{
    String color;
    int precio;
    int registro;

    String[] colores_disponibles = {"rojo", "verde", "amarillo", "negro", "blanco"};

    public void cambiarColor(String color){
        for(String k : colores_disponibles){
            if (k.equals(color)){
                this.color = color;
            }
        }
    }
}