public class Veiculo {
    public String modelo;
    public String descricaoVeiculo;
    String marca; //sem o modificador de acesso - automaticamente é public
    public int velocidade = 0; //inicializando uma variavel (não é comum inicilizar com valores)
    // String marca; Ele não permite repetir os nomes dos atributos
    private Float capacidadeTanque;
    private Float potenciaMotor;
    private boolean status;
    private char cor;


    public String buzinar(){
        String buzina = "Bi=bi";
        return buzina;
    }

    public void acelerar(int valor){
        velocidade = velocidade + valor;
    }
}