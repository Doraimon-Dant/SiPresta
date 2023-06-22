/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CRUD;

import java.util.List;

/**
 *
 * @author CHRISTOPHERURIELTAFO
 */
public interface CrudContratoAD<T> {
    public List<T> listarAD(int id);
    public boolean Validar (int id);
    public boolean Denegar (int id);
}
