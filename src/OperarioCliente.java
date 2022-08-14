public class OperarioCliente {
    private String nombre;
    private String apellidos;
    private String ciudad;
    private String direccion;
    private long telefono;
    private String correo;
    private String estado;


    public OperarioCliente() {
        this.nombre = "";
        this.apellidos = "";
        this.ciudad="";
        this.direccion="";
        this.telefono=0;
        this.correo="";
        this.estado="";
    }

    public OperarioCliente(String nombre, String apellidos, String ciudad, String direccion, long telefono, String correo, String estado)
    {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ciudad=ciudad;
        this.direccion=direccion;
        this.telefono=telefono;
        this.correo=correo;
        this.estado=estado;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

