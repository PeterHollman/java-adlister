public class Config {
    private static String url = "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false";
    private static String user = "root";
    private static String password = "codeup";

    public static String getUrl() {return url;}
    public static String getUsername() {return user;}
    public static String getPassword() {return password;}
}
