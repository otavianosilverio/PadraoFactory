public class FabricaVeiculos {
    public static Veiculo criarVeiculo(String tipo){
        if (tipo.equalsIgnoreCase("carro")){
            return new Carro();
        } else if (tipo.equalsIgnoreCase("moto")){
            return new Moto();
        }
        throw new IllegalArgumentException("Tipo de veiculo Desconhecido");
    }
}
