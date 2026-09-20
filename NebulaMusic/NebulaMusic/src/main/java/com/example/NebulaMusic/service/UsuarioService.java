package com.example.NebulaMusic.service;

import com.example.NebulaMusic.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UsuarioService {

    //Recibe clave-valor
    private final Map<String, Usuario> usuarios = new ConcurrentHashMap<>();

    public UsuarioService(){
        //Constructor vacío
    }

    //Registro de usuario
    public void registrar(Usuario usuario) {
        //Reglas de negocio

        //Registra un nuevo usuario
        usuarios.put(usuario.getCorreo(), usuario);
    }

    //Validar si existe
    public boolean existeCorreo(String correo) {
        return usuarios.containsKey(correo);
    }

    //Auténtico que el usuario exista ya registrado
    public boolean autenticar(String correo, String contraseña) {
        Usuario usuario = usuarios.get(correo);

        //Si el usuario no es NULL y la contraseña es igual a la que ingresamos
        return usuario != null && usuario.getContraseña().equals(contraseña);

    }
}

