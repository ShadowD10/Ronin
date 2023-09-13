/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import objetos.dado;

/**
 *
 * @author Usuario
 */
public interface actor {
    public void seleccionarSexo();
    public void seleccionarNombre(dado dn, dado db);
    public void seleccionarApariencia (dado dn, dado db);
    void seleccionarTecnica (dado dn);
    void actor(dado dn, dado db);
}
