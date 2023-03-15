import Netology.MavenPackage.CalcService;

public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        int count = service.calc(5000, 10000);
        System.out.println(count);
    }
}
