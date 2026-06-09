//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double resultado;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese su peso en kg: ");
    double peso = scanner.nextDouble();

    System.out.print("Ingrese su estatura en metros (ej. 1.75): ");
    double estatura = scanner.nextDouble();

}

public static double calcularIMC(double peso, double estatura) {
    return peso / (estatura * estatura);
}