public class App {
    public static void main(String[] args) throws Exception {
        Veiculo gol = new Veiculo (); //Criar um objeto. Nome objeto do objeto gol
        Veiculo palio = new Veiculo ();
        //Voce cria varios objetos quando voce quer separar ou distinguir cada u. Misturar veiciulos


        System.out.println(gol .buzinar());
        System.out.println(palio .buzinar());

        gol .acelerar(10);
        System.out.println(gol.velocidade);

        gol .acelerar(15);
        System.out.println(gol.velocidade);

        System.out.println(palio.velocidade);


    }
}
