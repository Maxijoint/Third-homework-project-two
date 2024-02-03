//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BMiService service = new BMiService();
        float result = service.calculate(83f, 1.85f);
        System.out.println("Ваш индекс тела составляет:" + result);
    }
}