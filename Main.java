import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int descuentoUno = 25;
        int descuentoDos = 50;
        System.out.println("Ingrese el numero de piezas: ");
        int numPiezas = scanner.nextInt();
        System.out.println("Ingrese el importe inicial: ");
        int importeInicial = scanner.nextInt();
        int importeDescontado;
        float importeFinal;




        if(numPiezas<= 3) {
            importeDescontado = (importeInicial * descuentoUno) / 100;
        }else{
            importeDescontado =  (importeInicial * descuentoDos) / 100;
        }
        importeFinal = importeInicial-importeDescontado;
        scanner.close();
        System.out.println("El importe final es = "+importeFinal);
    }
}