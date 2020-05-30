import java.io.IOException;
import RootNameExample.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person = new Person("John", 30, "Wall Street");
        JsonMapper json = new JsonMapper(person);
        System.out.println(json.toString());
    }
}

