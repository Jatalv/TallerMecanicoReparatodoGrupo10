public class Vehiculo {

        private String marca;
        private String estilo;
        private String paisDeOrigen;
        private String caracteristicas;
        private String estado;


        public Vehiculo() {
            this.marca = "";
            this.estilo = "";
            this.paisDeOrigen="";
            this.caracteristicas="";
            this.estado="";
        }

        public Vehiculo(String marca, String estilo, String paisDeOrigen, String caracteristicas, String estado)
        {

            this.marca="";
            this.estilo="";
            this.paisDeOrigen="";
            this.caracteristicas="";
            this.estado=estado;

        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getEstilo() {
            return estilo;
        }

        public void setEstilo(String estilo) {
            this.estilo = estilo;
        }

        public String getPaisDeOrigen() {
            return paisDeOrigen;
        }

        public void setPaisDeOrigen(String paisDeOrigen) {
            this.paisDeOrigen = paisDeOrigen;
        }

        public String getCaracteristicas() {
            return caracteristicas;
        }

        public void setCaracteristicas(String caracteristicas) {
            this.caracteristicas = caracteristicas;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

}

