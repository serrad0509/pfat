package AST;

import Errors.*;
import java.io.IOException;
import java.io.BufferedWriter;

public class SentList2 implements Sentencia{
	public final Sentencia sentsimp;
	public final Sentencia sentlist;

	public SentList2(Sentencia sentsimp, Sentencia sentlist) {
		this.sentsimp = sentsimp;
		this.sentlist = sentlist;
	}
        public void computeAH1() throws CompilerExc {
                        sentsimp.computeAH1();
                        sentlist.computeAH1();
        }
        public void checkBreak(int num_breaks) throws CompilerExc {
            sentsimp.checkBreak(num_breaks);
            sentlist.checkBreak(num_breaks);
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            sentsimp.generateCode(w,tabs);
            w.newLine();
            sentlist.generateCode(w,tabs);
        }
}
