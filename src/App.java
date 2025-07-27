public class App {
    public static void main(String[] args) throws Exception {
        int [] numeri = {10, 20, 30, 40, 50, 60, 70};
        CicloInteri ciclo = new CicloInteri(numeri);

        while(ciclo.hasAncoraElementi()){
            System.out.println(ciclo.getElementoSuccessivo());
        }
    }
}
