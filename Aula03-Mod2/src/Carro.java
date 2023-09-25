public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private boolean estaLigado;
    private Integer qtdCombustivel;

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        if(!marca.equals("Fiat")){
            this.marca = marca;
        }
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public boolean isEstaLigado(){
        return this.estaLigado;
    }

    public void setEstaLigado(boolean estaLigado){
        this.estaLigado = estaLigado;
    }

    public Integer getQtdCombustivel(){
        return this.qtdCombustivel;
    }

    public void setQtdCombustivel(Integer qtdCombustivel){
        this.qtdCombustivel = qtdCombustivel;
    }
}
