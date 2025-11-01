/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author taish
 */
public class cProovedor {
    private String pUsuario, pContraseña;

    public cProovedor() {
        pUsuario = "Proveedor";
        pContraseña = "1234";
    }

    public String getpUsuario() {
        return pUsuario;
    }

    public void setpUsuario(String pUsuario) {
        this.pUsuario = pUsuario;
    }

    public String getpContraseña() {
        return pContraseña;
    }

    public void setpContraseña(String pContraseña) {
        this.pContraseña = pContraseña;
    }
    
    public boolean validarCuenta(String user, String contra){
    if (getpUsuario().equals(user)&& getpContraseña().equals(contra))
    {
        return true;
    }
    else
    {
        return false;
    }
    

    }
}
