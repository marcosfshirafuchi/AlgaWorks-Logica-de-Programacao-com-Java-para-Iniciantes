public class TipoLogico {
    public static void main(String[] args) {
        Boolean variavelVerdadeira = true;
        System.out.println("Variável verdadeira: " + variavelVerdadeira);
        Boolean variavelFalsa = false;
        System.out.println("Variável falsa: " + variavelFalsa);
        System.out.println("----------------------------------------------------------");
        Integer idade = 20;

        Boolean podeTirarCarteira = idade >= 18;

        //System.out.println("Pode tirar carteira? " + podeTirarCarteira);

        if(podeTirarCarteira){
            System.out.println("Sim! Ele(a) pode tirar a carteira");

        }else{
            System.out.println("Não! Ele(a) não pode tirar a carteira");
        }

    }
}
