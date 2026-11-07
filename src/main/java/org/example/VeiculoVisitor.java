package org.example;

public class VeiculoVisitor implements Visitor {

    public String exibir(Veiculo veiculo) {
        return veiculo.aceitar((Visitor) this);
    }

    public String exibirCarro(Carro carro) {
        return "Carro{" +
                "placa=" + carro.getPlaca() +
                ", modelo='" + carro.getModelo() + '\'' +
                ", marca=" + carro.getNomeMarca() +
                '}';
    }

    public String exibirMoto(Moto moto) {
        return "Moto{" +
                "placa=" + moto.getPlaca() +
                ", modelo='" + moto.getModelo() + '\'' +
                ", cilindrada='" + moto.getCilindrada() + '\'' +
                '}';
    }

    public String exibirCaminhao(Caminhao caminhao) {
        return "Caminhao{" +
                "codigo=" + caminhao.getCodigo() +
                ", modelo='" + caminhao.getModelo() + '\'' +
                ", capacidadeCarga=" + caminhao.getCapacidadeCarga() +
                '}';
    }
}
