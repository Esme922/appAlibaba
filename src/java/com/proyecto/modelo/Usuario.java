
package com.proyecto.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {
    private int idUsuario;
    private String nombre;
     private String apellidos;
      private String usuarios;
       private String password;
       private int idRol;
       private String estado;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String apellidos, String usuarios, String password, int idRol, String estado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuarios = usuarios;
        this.password = password;
        this.idRol = idRol;
        this.estado = estado;
    } 
    public static Usuario load(ResultSet rs)throws SQLException{
        Usuario objUsuario = new Usuario ();
        objUsuario.setIdUsuario(rs.getInt(1));
        objUsuario.setNombre(rs.getString(2));
        objUsuario.setApellidos(rs.getString(3));
        objUsuario.setUsuarios(rs.getString(4));
        objUsuario.setPassword(rs.getString(5));
        objUsuario.setIdRol(rs.getInt(6));     
        objUsuario.setEstado(rs.getString(7));
        
        return objUsuario;
         }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

  
    }
    
       
     
   
   
    
