package ej4;

public class Forma {

        private String nombre;

        public Forma(String nombre) {
            this.nombre = nombre;
        }

        public double area() {
            return 0;
        }

        @Override
        public String toString() {
            return nombre;
        }


}
