import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList {
    public static void main(String[] args) {
        List<String> programsLanguage = new ArrayList<>();
        programsLanguage.add("C");
        programsLanguage.add("C++");
        programsLanguage.add("Java");
        programsLanguage.add("Kotlin");
        programsLanguage.add("Python");
        programsLanguage.add("Perl");
        programsLanguage.add("Ruby");
        System.out.println(programsLanguage);

        programsLanguage.remove(5);
        System.out.println("After remove element from list: "+programsLanguage);
        boolean isRemove = programsLanguage.remove("Kotlin");
        System.out.println("After remove object: "+programsLanguage +"\n    "+ isRemove );
        List<String> scriptlanguage = new ArrayList<>();
        scriptlanguage.add("Python");
        scriptlanguage.add("Ruby");
        scriptlanguage.add("Perl");
        programsLanguage.removeAll(scriptlanguage);
        System.out.println("After removeAll: "+programsLanguage);
        programsLanguage.removeIf(n -> (n.charAt(0)=='J'));
        System.out.println("After remove that start with 'J': "+ programsLanguage);
        programsLanguage.clear();
        System.out.println("After clear(): "+ programsLanguage);
        System.out.println(programsLanguage.isEmpty());
    }
}
