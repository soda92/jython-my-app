package com.mycompany.app;
import org.python.core.PyException;
import org.python.util.PythonInterpreter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws PyException {
        PythonInterpreter intrp = new PythonInterpreter();
        intrp.exec("import hello");
        intrp.close();
    }
}
