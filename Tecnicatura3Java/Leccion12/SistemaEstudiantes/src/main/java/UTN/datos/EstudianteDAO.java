package UTN.datos;

import UTN.dominio.Estudiante;
import static UTN.conexion.Conexion.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {

    //Método Listar
    public List<Estudiante> listarEstudiantes(){
        List<Estudiante> estudiantes = new ArrayList<>();
        //Creamos algunos objetos que son necesarios para comunicarnos
        //con la base de datos
        PreparedStatement ps; //Envía la sentencia a la base de datos
        ResultSet rs; //Obtenemos el resultado de la base de datos
        //Creamos un objeto de tipo conexión
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                //Falta agregarlo a la lista
                estudiantes.add(estudiante);
            }
        } catch (Exception e){
            System.out.println("Ocurrió un error al seleccionar datos: "+e.getMessage());
        }
        finally {
            try{
                CON.close();
            } catch (Exception e){
                System.out.println("Ocurrió un error al cerrar la conexión: "+e.getMessage());
            }
        }//Fin finally
        return estudiantes;
    }//Fin método Listar

     //Metodo por id -> fin  by id
     public boolean_buscarEstudiantePor id(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        conection con = getConnection();
        String sql = "SELECT * FROM estudiante2022 WHERE idestudientes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if(rs.next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString)("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true; //Se encontro un registro
            }// Fin if
        } catch (Exception e){
            System.out.println("Ocurrio un error al buscar estudiante: "+e.getMessage());
        }//fin catch
        finally {
             try{
                con.close();
             } catch (Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion: "+e.getMessage());
        }//fin catch
     }//Fin finally     
     return false;
     }

    
     // Método agregarEstudiante() 
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps; //creamos el objeto
        Connection con = getConnection(); //ara generar conex
        String sql = "INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES (?, ?, ?, ?)";//La sentencia vamos a usar
        try { // para establecer la consexion
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getEmail());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4,estudiante.getEmail());
            ps.execute(); //es solo para insertar
            return true;
        }catch (Exception e ){
            System.out.println("Ocurrio un error al agregar el estudiante "+e.getMessage());
        }//fin catch
        finally {//cerramos la conexion
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la conexion: "+e.getMessage());
            }//FIn carch
        }//Fin finally
        return false;
    }//Fin metodo agregarEstudiante

    //Metodo para modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE estudiantes2022 SET nombre=?, apellido=?, telefono:?, email=? WHERE idestudiantes2022=?"
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1,estudiante.getNombre());
            ps.setString(2,estudiante.getApellido());
            ps.setString(3,estudiante.getTelefono());
            ps.setString(4,estudiante.getEmail());
            ps.setInt(5,estudiante.getIdEstudiante());
            ps.execute();
            return true;

        } catch(Exception e){
            System.out.println("Error al modificar estudiante "+e.getMessage());
        }//Fin catch
        finally{
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la conexion "+e.getMessage());
            }//Fin catch
        }//Fin  finally
        return false;
    }//Fin metodo modificarEstudiante

    
    public static void main(String[] args) {
        //listar los estudiantes
        var estudianteDao = new EstudianteDAO();
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println);// funcion lambda para imprimir

        //Agregar estudiante
        //var nuevoEstudiante = new Estudiante("Carlos","Lara","4567893245","carlosl@mail.com");
        //var agregado = estudianteDao.agregarEstudiante(nuevoEstudiante);
        //if (agregado)
        //    System.out.println("Estudiante agregado: "+nuevoEstudiante);
        //else
        //    System.out.println("No se ha agregado estudiante: "+nuevoEstudiante);


        //Buscar de estudiante por id
        //var estudiante1 = new Estudiante(1);
        //System.out.println("Estudiantes antes de la bisqueda: "+estudiante1);
        //var encontrado = estudianteDao.buscarEstudiantePorId(estudiante1);
        //comprobamos
        //if(encontrado) // si encontrado es verdadero
        //    System.out.println("estudiante encontrado "+estudiante1);
        //else
        //    System.out.println("NO se encontro el estudiante: "+estudiante1.getIdEstudiante());
        
    }
}
