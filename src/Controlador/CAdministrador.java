/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author taish
 */
public class CAdministrador {
    private String aUsuario, aContraseña;

    public CAdministrador() {
        aUsuario = "Admin";
        aContraseña = "1234";
    }

    
    public String getaUsuario() {
        return aUsuario;
    }

    public void setaUsuario(String aUsuario) {
        this.aUsuario = aUsuario;
    }

    public String getaContraseña() {
        return aContraseña;
    }

    public void setaContraseña(String aContraseña) {
        this.aContraseña = aContraseña;
    }
    
     public boolean validarCuenta(String user, String contra){
    if (getaUsuario().equals(user)&& getaContraseña().equals(contra))
    {
        return true;
    }
    else
    {
        return false;
    }
    

    }
}
