import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int a, b;
    System.out.println("number daal: ");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    System.out.println("ek aur: ");
    Scanner sc2 = new Scanner(System.in);
    b = sc.nextInt();
    int c = a + b;
    System.out.println("ye le output: "+c);
}
