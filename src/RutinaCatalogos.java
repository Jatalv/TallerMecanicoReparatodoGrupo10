import javax.swing.JOptionPane;
public class RutinaCatalogos {
    final private OperarioCliente arregloOperarioCliente[] = new OperarioCliente[5];
    final private Vehiculo arregloVehiculo[] = new Vehiculo[5];
    final private Reparacion arregloReparacion[] = new Reparacion[5];

    public void llenarArregloVehiculo() {
        JOptionPane.showMessageDialog(null,"LLENADO DEL CATALOGO DE VEHICULOS");
        int x;
        for (x = 0; x <arregloVehiculo.length; x++) {
            Vehiculo v = new Vehiculo();
            v.setMarca(JOptionPane.showInputDialog(null, "Digite la marca del vehiculo #"+(x+1)+": "));
            v.setEstilo(JOptionPane.showInputDialog(null, "Digite el estilo del vehiculo #"+(x+1)+": "));
            v.setPaisDeOrigen(JOptionPane.showInputDialog(null, "Digite el pais de origen del vehiculo #"+(x+1)+": "));
            v.setCaracteristicas(JOptionPane.showInputDialog(null, "Digite las caracteristicas del vehiculo #"+(x+1)+": "));
            v.setEstado(JOptionPane.showInputDialog(null, "Digite el estado del Vehiculo #"+(x+1)+": "));
            arregloVehiculo[x] = v;

        }
    }

    public void llenarArregloOpeCli() {
        JOptionPane.showMessageDialog(null,"LLENADO DEL CATALOGO DE OPERARIOS / CLIENTES");
        int x;
        for (x = 0; x < arregloOperarioCliente.length; x++) {
            OperarioCliente p = new OperarioCliente();
            p.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre del operario / cliente #"+(x+1)+": "));
            p.setApellidos(JOptionPane.showInputDialog(null, "Digite los apellidos del operario / cliente #"+(x+1)+": "));
            p.setCiudad(JOptionPane.showInputDialog(null, "Digite la ciudad del operario / cliente #"+(x+1)+": "));
            p.setDireccion(JOptionPane.showInputDialog(null, "Digite la direccion del operario / cliente #"+(x+1)+": "));
            p.setTelefono(Long.parseLong(JOptionPane.showInputDialog(null, "Digite el telefono del operario / cliente #"+(x+1)+": ")));
            p.setCorreo(JOptionPane.showInputDialog(null, "Digite el correo del operario / cliente #"+(x+1)+": "));
            p.setEstado(JOptionPane.showInputDialog(null, "Digite el estado del operario / cliente #"+(x+1)+": "));
            arregloOperarioCliente[x] = p;
        }
    }

    public void llenarArregloReparacion() {
        JOptionPane.showMessageDialog(null,"LLENADO DEL CATALOGO DE REPARACIONES");
        int x;
        for (x = 0; x < arregloReparacion.length; x++) {
            Reparacion c = new Reparacion();
            c.setDescripcion(JOptionPane.showInputDialog(null, "Digite la descripción de la reparación #"+(x+1)+": "));
            c.setCosto(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el costo de la reparacion #"+(x+1)+": ")));
            arregloReparacion[x] = c;
        }
    }
    public void mostrarArregloVehiculo(){
        JOptionPane.showMessageDialog(null,"CATALOGO DE VEHICULOS");
        int x;
        String s="";
        for(x=0;x<arregloVehiculo.length;x++,s=""){
            s=s+"VEHICULO #"+(x+1)+"\n\n"
                    +"Marca: "+arregloVehiculo[x].getMarca()+"\n"
                    +"Estilo:"+arregloVehiculo[x].getEstilo()+"\n"
                    +"Pais de Origen: "+arregloVehiculo[x].getPaisDeOrigen()+"\n"
                    +"Caracteristicas: "+arregloVehiculo[x].getCaracteristicas()+"\n"
                    +"Estado: "+arregloVehiculo[x].getEstado()+"\n\n";
            JOptionPane.showMessageDialog(null, "CATALOGO DE VEHICULOS\n\n"+s);
        }
    }
    public void mostrarArregloOpeCli(){
        JOptionPane.showMessageDialog(null,"CATALOGO DE OPERARIOS / CLIENTES");
        int x;
        String s="";
        for(x=0;x<arregloOperarioCliente.length;x++,s=""){
            s=s+"OPERARIO / CLIENTE #"+(x+1)+"\n\n"
                    +"Nombre: "+arregloOperarioCliente[x].getNombre()+"\n"
                    +"Apellido: "+arregloOperarioCliente[x].getApellidos()+"\n"
                    +"Ciudad: "+arregloOperarioCliente[x].getCiudad()+"\n"
                    +"Direccion: "+arregloOperarioCliente[x].getDireccion()+"\n"
                    +"Telefono: "+arregloOperarioCliente[x].getTelefono()+"\n"
                    +"Correo Electronico: "+arregloOperarioCliente[x].getCorreo()+"\n"
                    +"Estado: "+arregloOperarioCliente[x].getEstado()+"\n\n";
            JOptionPane.showMessageDialog(null, "CATALOGO DE OPERARIOS / CLIENTES\n\n"+s);
        }
    }
    public void mostrarArregloReparacion(){
        JOptionPane.showMessageDialog(null,"CATALOGO DE REPARACIONES");
        int x;
        String s="";
        for (x=0;x<arregloReparacion.length;x++,s="") {
            s=s+"REPARACION #"+(x+1)+"\n\n"
                    +"Descripcion: "+arregloReparacion[x].getDescripcion()+"\n"
                    +"Costo: "+arregloReparacion[x].getCosto()+"\n\n";
            JOptionPane.showMessageDialog(null, "CATALOGO DE REPARACIONES\n\n"+s);
        }
    }
}

