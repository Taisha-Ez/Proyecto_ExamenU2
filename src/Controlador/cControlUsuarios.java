/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author taish
 */
public class cControlUsuarios {
    // Guarda el usuario y la contraseña
    private static Map<String, String> usuarios = new HashMap<>();
    
    // Registra un nuevo usuario
    public static void registrarUsuario(String nombre, String contrasena) {
        usuarios.put(nombre, contrasena);
    }
    // Valida el inicio de sesion
    public static boolean validarUsuario(String nombre, String contrasena) {
        return usuarios.containsKey(nombre) && usuarios.get(nombre).equals(contrasena);
    }
}
