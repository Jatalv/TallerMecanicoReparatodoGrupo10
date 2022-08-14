import javax.swing.JOptionPane;
public class MenuPrincipal {
    private int mod1, mod2, mod3, mod4, mod5;

    public void mostrarMenu() {
        while (mod1 != 5) {
            mod1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "   MENÚ PRINCIPAL   \n\n"
                            + "1. Registro de Usuarios\n"
                            + "2. Catalogos\n"
                            + "3. Facturas\n"
                            + "4. Cajas\n"
                            + "5. Salir del Menú\n\n"
                            + "Digite el numero de opción: "));
            switch (mod1) {
                case 1: {
                    mostrarModuloUsuarios();
                    break;
                }
                case 2: {
                    mostrarModuloCatalogos();
                    break;
                }
                case 3: {
                    mostrarModuloFacturas();
                    break;
                }
                case 4: {
                    mostarModuloCajas();
                    break;
                }
                case 5: {
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null,
                            "\nPorfavor ingrese una opcion correcta!\n");
                }
            }
        }
    }

    public void mostrarModuloUsuarios() {
        while (mod2 != 4) {
            mod2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "   MODULO DE REGISTRO DE USUARIOS   \n\n"
                            + "1. Agregar Usuario / Cliente\n"
                            + "2. Ver Usuario / Cliente\n"
                            + "3. Inactivar Usuario / Cliente\n"
                            + "4. Regresar\n\n"
                            + "Digite su opción:"));
            switch (mod2) {
                case 1: {
                    JOptionPane.showMessageDialog(null, "AGREGAR USUARIO / CLIENTE");
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "VER USUARIO / CLIENTE");
                    break;
                }
                case 3:{
                    JOptionPane.showMessageDialog(null, "INACTIVAR USUARIO / CLIENTE");
                    break;
                }
                case 4:{
                    mostrarMenu();
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null,
                            "\nPorfavor ingrese una opcion correcta!\n");
                }
            }
        }
    }
    public void mostrarModuloCatalogos() {
        RutinaCatalogos rc = new RutinaCatalogos();
        int x;
        while (mod3 != 5) {
            mod3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "   MODULO DE CATALOGOS   \n\n"
                            + "1. Agregar Catalogos\n"
                            + "2. Mostrar Catalogos\n"
                            + "3. Buscar Catalogos\n"
                            + "4. Inactivar Catalogos\n"
                            + "5. Regresar\n\n"
                            + "Digite su opción:"));
            switch (mod3) {
                case 1: {
                    JOptionPane.showMessageDialog(null, "AGREGAR CATALOGOS");
                    rc.llenarArregloOpeCli();
                    rc.llenarArregloVehiculo();
                    rc.llenarArregloReparacion();
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "MOSTRAR CATALOGOS");
                    x=Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite 1 para recorrer el catalogo de Operarios / Clientes\n"
                    +"Digite 2 para recorrer el catalogo de Vehiculos\n"
                    +"Digite 3 para recorrer el catalogo de Reparaciones\n"
                    +"Digite 4 para recorrer todos los catalogos\n"+
                    "Digite un numero diferente para salir\n\n"+": "));
                    if (x==1){
                        rc.mostrarArregloOpeCli();
                    }else if (x==2){
                        rc.mostrarArregloVehiculo();
                    }else if (x==3){
                        rc.mostrarArregloReparacion();
                    }else if (x==4){
                        rc.mostrarArregloOpeCli();
                        rc.mostrarArregloVehiculo();
                        rc.mostrarArregloReparacion();
                    }else{
                        break;
                    }
                    break;
                }
                case 3:{
                    JOptionPane.showMessageDialog(null, "BUSCAR CATALOGOS");
                    break;
                }
                case 4:{
                    JOptionPane.showMessageDialog(null, "INACTIVAR CATALOGOS");
                    break;
                }
                case 5:{
                    mostrarMenu();
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null,
                            "\nPorfavor ingrese una opcion correcta!\n");
                }
            }
        }
    }
    public void mostrarModuloFacturas(){
        while (mod4!=5){
            mod4=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "   MODULO DE FACTURAS   \n\n"
            +"1. Emitir facturas\n"
            +"2. Anular facturas\n"
            +"3. Mostrar facturas\n"
            +"4. Regresar\n\n"
            +"Digite su opcion: "));

            switch (mod4){

                case 1:{
                    JOptionPane.showMessageDialog(null, "EMITIR FACTURAS");
                    break;
                }
                case 2:{
                    JOptionPane.showMessageDialog(null,"ANULAR FACTURAS");
                    break;
                }
                case 3:{
                    JOptionPane.showMessageDialog(null,"MOSTRAR FACTURAS");
                }
                case 4:{
                    mostrarMenu();
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null,
                            "\nPorfavor ingrese una opcion correcta!\n");
                }
            }
        }
    }
    public void mostarModuloCajas(){
        while (mod5!=3){
            mod5=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "   MODULO DE CAJAS   \n\n"
            +"1. Sumar ingresos del dia\n"
            +"2. Mostrar ingresos del dia\n"
            +"3. Regresar\n\n"));

            switch (mod5){

                case 1:{
                    JOptionPane.showMessageDialog(null, "SUMA DE INGRESOS");
                    break;
                }
                case 2:{
                    JOptionPane.showMessageDialog(null, "MOSTRAR INGRESOS");
                    break;
                }
                case 3:{
                    mostrarMenu();
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null,
                            "\nPorfavor ingrese una opcion correcta!\n");
                }
            }
        }
    }
}
