package com.chaingame.store.models;

import java.util.List;

public class Accesorio {
    
    int idAccesorio;
    String material;
    Producto producto;
    List<Foto> listaFotos;

    public Accesorio(){}

    public Accesorio(int idAccesorio, String material, Producto producto, List<Foto> listaFotos) {
        this.idAccesorio = idAccesorio;
        this.material = material;
        this.producto = producto;
        this.listaFotos = listaFotos;
    }

    public int getIdAccesorio() {
        return idAccesorio;
    }
    public void setIdAccesorio(int idAccesorio) {
        this.idAccesorio = idAccesorio;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public List<Foto> getListaFotos() {
        return listaFotos;
    }
    public void setListaFotos(List<Foto> listaFotos) {
        this.listaFotos = listaFotos;
    }


    

    


}
