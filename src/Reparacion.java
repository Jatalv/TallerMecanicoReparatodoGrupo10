public class Reparacion {

        private String descripcion;
        private double costo;


        public Reparacion() {
            this.descripcion="";
            this.costo=0.00;

        }

        public Reparacion(String descripcion, double costo)
        {

            this.descripcion = descripcion;
            this.costo = costo;

        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public double getCosto() {
            return costo;
        }

        public void setCosto(double costo) {
            this.costo = costo;
        }




    }
