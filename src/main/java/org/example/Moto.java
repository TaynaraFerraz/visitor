package org.example;

public class Moto implements Veiculo{

    private int placa;
    private String modelo;
    private String cilindrada;

    public Moto(int placa, String modelo, String cilindrada) {
        this.placa = placa;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public int getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMoto(this);
    }
}
