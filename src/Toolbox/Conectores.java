package Toolbox;


import Objetos.ObjetoCliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
                                                                                                                            

/**
 * 
 *  Programa:   Conectores.java - (UTF-8)
 *  Autor:      McKyavelik
 * 
**/

public class Conectores {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String BASE_DE_DATOS = "jdbc:mysql://isicomputerbcn.com:3306/gestor_reparaciones";
    private static final String USUARIO = "iGimenezSan";
    private static final String PASSWORD = "Flotill4";
    
    public void insertarCliente(ObjetoCliente datosCliente) {
        
        try {
            Class.forName(DRIVER);
            Connection c = (Connection) DriverManager.getConnection(BASE_DE_DATOS, USUARIO, PASSWORD);
            
            try (Statement consultador = (Statement) c.createStatement()) {
                consultador.executeUpdate("INSERT INTO clientes (NIF, Nombre, Apellidos, Domicilio, Codigo_Postal, Poblacion, Provincia, Telefono, Email) VALUES ('" + datosCliente.getNIF() + "','" + datosCliente.getNombre() + "','" + datosCliente.getApellidos() + "','" + datosCliente.getDomicilio() + "','" + datosCliente.getCodigo_Postal() + "','" + datosCliente.getPoblacion() + "','" + datosCliente.getProvincia() + "','" + datosCliente.getTelefono() + "','" + datosCliente.getEmail() + "');");
            }
        } catch (SQLException ex) {
            System.out.println("Error de consulta SQL: " + ex);
        } catch (ClassNotFoundException ex2) {
            System.out.println("No se pudo cargar el driver: " + ex2);
        }
        
    }
    
    public ArrayList<ObjetoCliente> obtenerArrayListClientes() {
        
        ArrayList<ObjetoCliente> listaClientes = new ArrayList<>();
        ResultSet resultadoConsultaClientes;
        ResultSetMetaData metaDatosResultado;
        
        try {
            Class.forName(DRIVER);
            Connection c = (Connection) DriverManager.getConnection(BASE_DE_DATOS, USUARIO, PASSWORD);
            
            try (Statement consultador = (Statement) c.createStatement()) {
                resultadoConsultaClientes = consultador.executeQuery("SELECT * FROM clientes");
                metaDatosResultado = resultadoConsultaClientes.getMetaData();
                
                                
                // Bucle general para recorrer el resultset fila a fila
                while (resultadoConsultaClientes.next() == true) {
                    
                    ObjetoCliente fila = new ObjetoCliente(resultadoConsultaClientes.getString("NIF"), resultadoConsultaClientes.getString("Nombre"), resultadoConsultaClientes.getString("Apellidos"), resultadoConsultaClientes.getString("Domicilio"), resultadoConsultaClientes.getString("Codigo_Postal"), resultadoConsultaClientes.getString("Poblacion"), resultadoConsultaClientes.getString("Provincia"), resultadoConsultaClientes.getString("Telefono"), resultadoConsultaClientes.getString("Email"));
                    
                    // Paso de la fila al arraylist de objetos
                    listaClientes.add(fila);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error de consulta SQL: " + ex);
            return listaClientes;
        } catch (ClassNotFoundException ex2) {
            System.out.println("No se pudo cargar el driver: " + ex2);
            return listaClientes;
        }   
        
        
        return listaClientes;
    }

}