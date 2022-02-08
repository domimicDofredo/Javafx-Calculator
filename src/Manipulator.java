import javafx.beans.binding.StringBinding;

public class Manipulator {
    public static String deleteLastChar(String string) {
        return string.substring(0, string.length() - 1);
    }
}
