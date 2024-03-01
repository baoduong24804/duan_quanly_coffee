/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g5.DAO;

import java.util.List;

/**
 *
 * @author Asus
 */
public interface EntityDAOinterface<Entity, ID> {

    Entity getByID(ID id);

    List<Entity> getAll();

    ID create(Entity entity);

    void update(Entity entity);

    void deteleByID(ID id);

}
