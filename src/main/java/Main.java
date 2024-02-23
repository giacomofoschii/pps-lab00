import model.Person;
import utils.Logger;

public class Main {
    public static void main(final String[] args){
        final Logger l = new Logger();
        Person p = new Person("Bob", 33);
        Logger.logPrintString("Hello " + p);
    }
}
