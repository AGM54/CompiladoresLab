import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {

        String inputFile = Paths.get("src/test.txt").toAbsolutePath().toString();

        // Lee el archivo de entrada
        CharStream input = CharStreams.fromFileName(inputFile);

        // Crea el lexer y el parser
        ConfRoomSchedulerLexer lexer = new ConfRoomSchedulerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ConfRoomSchedulerParser parser = new ConfRoomSchedulerParser(tokens);

        // Parse el archivo de entrada y obtén el árbol de sintaxis
        ParseTree tree = parser.prog();

        // Crea el listener y el walker
        ConfRoomSchedulerSemanticChecker semanticChecker = new ConfRoomSchedulerSemanticChecker();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(semanticChecker, tree);
    }
}
