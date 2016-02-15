/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.modulo.factory;

/**
 *
 * @author Sebestian
 */
public abstract class AbstrctFactory implements DAOFactory {

    public static final int MYSQL_FACTORY = 1;

    public static final AbstrctFactory GETDAO_FACTORY(int factoryType) {
        switch (factoryType) {
            case MYSQL_FACTORY:
                return new MYSQL_FACTORY();
            default:
                System.out.println("Esta base de datos no esta disponible.");
                return null;
        }
    }

}
