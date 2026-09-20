package com.example.NebulaMusic.model;

public class Usuario {
     /*
     Estos atributos tienen que cuadrar con los "name" del
     formulario del HTML
      */
    private String nombre;
    private String correo;
    private String contraseña;
    private String pseudonimo;
    private String genero;
    private String suscripcion;
    private String fecha_nacimiento;
    private String terminos;
    private String comentarios;

    //Constructor vacio
    public Usuario() {
    }

    //Constructor con todos los atributos
    public Usuario(String nombre, String correo, String contraseña, String pseudonimo, String genero, String suscripcion, String fecha_nacimiento, String terminos, String comentarios) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.pseudonimo = pseudonimo;
        this.genero = genero;
        this.suscripcion = suscripcion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.terminos = terminos;
        this.comentarios = comentarios;
    }

    //Gets and Sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTerminos() {
        return terminos;
    }

    public void setTerminos(String terminos) {
        this.terminos = terminos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    //toString
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", pseudonimo='" + pseudonimo + '\'' +
                ", genero='" + genero + '\'' +
                ", suscripcion='" + suscripcion + '\'' +
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                ", terminos='" + terminos + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}

