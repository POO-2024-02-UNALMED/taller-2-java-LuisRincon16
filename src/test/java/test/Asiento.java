package test;

class Asiento{
    String color;
    int precio;
    int registro;

    String[] colores_disponibles = {"rojo", "verde", "amarillo", "negro", "blanco"};

    public void cambiarColor(String color){
        for(String colores : colores_disponibles){
            if (colores.equals(color)){
                this.color = color;
            }
        }
    }
}