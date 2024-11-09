public class VetoresMaisDe2Dimensoes {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 7.6. Declarando vetores com mais de 2 dimensões<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   09/11/2024
     */
    public static void main(String[] args) {
        Double[] faturamentoJaneiro = new Double[] {1500.0,2000.0, 1700.0};
        Double[] faturamentoFevereiro = new Double[] {1000.0,2500.0, 1800.0};

        Double[][] faturamentoAnual = new Double[][]{faturamentoJaneiro, faturamentoFevereiro};
        Double[][][] faturamentoQuinquenal = new Double[][][] {faturamentoAnual};
        Double[][][][] faturamentoDaDecada = new Double[][][][] {faturamentoQuinquenal};
//        for(int i = 0; i < faturamentoAnual.length; i++){
//            System.out.println("Mês: " + (i+1));
//
//            Double[] mes = faturamentoAnual[i];
//
//            for(int y = 0; y < mes.length; y++){
//                Double dia = mes[y]; // Double dia = faturamentoAnual[i][y];
//                System.out.println("Dia  " + (y+1) + ": " + dia);
//            }
//        }
    }
}

