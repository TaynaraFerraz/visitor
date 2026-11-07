package org.example;

public class Carro implements Veiculo {
    private int placa;
    private String modelo;
    private Marca marca;

    public Carro(int placa, String modelo, Marca marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    public int getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNomeMarca() {
        return this.marca.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCarro(this);
    }
}
