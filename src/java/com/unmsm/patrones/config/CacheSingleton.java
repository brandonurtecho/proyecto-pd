/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.config;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bluq1
 */
public class CacheSingleton {
    /*
    private static CacheSingleton cache;    
    private static List<Filial> listaFilial;
    private static List<TipoEmpleado> listaTipoEmpleado;
        
    private CacheSingleton() {
        IFilialService filialService = new FilialService();
        ITipoEmpleadoService tipoEmpleadoService = new TipoEmpleadoService();
        listaFilial = filialService.showFiliales();          
        listaTipoEmpleado = tipoEmpleadoService.showTipoEmpleado();
        System.out.println(listaFilial);
        System.out.println(listaTipoEmpleado);
    }
    
    public static CacheSingleton getInstance(){
        if(cache == null){
            cache = new CacheSingleton();
        }
        return cache;
    }*/
/*
    public static List<Filial> getListaFilial() {        
        return listaFilial;
    }
    
    public Filial getFilial(Filial filialParam){
        for (Filial filial : listaFilial) {
            if(filial.getNombre().equals(filialParam.getNombre())){
                return filial;
            }
        }
        return null;
    }

    public static List<TipoEmpleado> getListaTipoEmpleado() {
        return listaTipoEmpleado;
    } 
    
    public TipoEmpleado getFilial(TipoEmpleado tipoEmpleadoParam){
        for (TipoEmpleado tipoEmpleado : listaTipoEmpleado) {
            if(tipoEmpleado.getDescripcion().equals(tipoEmpleadoParam.getDescripcion())){
                return tipoEmpleado;
            }
        }
        return null;
    }
*/
}
