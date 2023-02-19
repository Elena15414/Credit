public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int payment = service.calculate(1_000_000,36);


        System.out.println(payment);
    }
}

//"C:\Program Files\Eclipse Adoptium\jdk-11.0.17.8-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=63970:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Татьяна\Credit\out\production\Credit Main
//87911
//
//Process finished with exit code 0

//"C:\Program Files\Eclipse Adoptium\jdk-11.0.17.8-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=63977:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Татьяна\Credit\out\production\Credit Main
//46140
//
//Process finished with exit code 0

//"C:\Program Files\Eclipse Adoptium\jdk-11.0.17.8-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=64010:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Татьяна\Credit\out\production\Credit Main
//32262
//
//Process finished with exit code 0
