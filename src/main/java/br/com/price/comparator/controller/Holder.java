package br.com.softplan.sider.mat.poc.price.comparator.controller;

import java.util.List;

public class Holder<T> {

    private List<T> data;
    private long quantidadeTotalRegistro;
    
    public Holder(){
    }
    
    public Holder(List<T> data) {
        this.data = data;
    }
    
    public List<T> getData() {
        return data;
    }
    public void setData(List<T> data) {
        this.data = data;
    }
    public long getQuantidadeTotalRegistro() {
        return quantidadeTotalRegistro;
    }
    public void setQuantidadeTotalRegistro(long quantidadeTotalRegistro) {
        this.quantidadeTotalRegistro = quantidadeTotalRegistro;
    }
    
    
    
}
