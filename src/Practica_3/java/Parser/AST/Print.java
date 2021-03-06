package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;

public class Print {
	public final Exp exp;

	public Print(Exp exp) {
		this.exp = exp;
	}
        public void computeAH1() throws CompilerExc {
            int expType = exp.computeType();
            if (!(expType == SymbolTable.STRING)) {
                throw new IlegalTypeExc("Ilegal types: print( " +SymbolTable.typeToString(expType)+ " ) \n" );
            }
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            w.write(tabs+"System.out.println(");
            exp.generateCode(w,"");
            w.write(");");
        }
}
