public class PlanoOperadora {
    public static void main(String[] args) {
        // Switch Case
        // Atenção nos break ok.

        String plano = "M";

        switch (plano) {
            case "T":{
                System.out.println("5G + Youtub");
                break;
            }
            case "M":{
                System.out.println("5G + Instagram grátis");
                break;
            }
            case "B":{
                System.out.println("5G + 100 minutos de ligação");
                break;
            }
                
            default:
        }
    }
}
