//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Veiculo v1 = FabricaVeiculos.criarVeiculo("Carro");
        v1.dirigir();

        Veiculo v2 = FabricaVeiculos.criarVeiculo("Moto");
        v2.dirigir();



    }
}