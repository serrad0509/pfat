package AST;

import Errors.*;
import java.io.IOException;
import java.io.BufferedWriter;

public interface Exp {
    public int computeType() throws CompilerExc;
    public void generateCode(BufferedWriter w, String tabs) throws IOException;
}
