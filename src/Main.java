import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = Paths.get("src/test.txt").toAbsolutePath().toString();
        CharStream input = CharStreams.fromFileName(inputFile);

        ConfRoomSchedulerLexer lexer = new ConfRoomSchedulerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ConfRoomSchedulerParser parser = new ConfRoomSchedulerParser(tokens);


        ParseTree tree = parser.prog();
        ConfRoomSchedulerSemanticChecker semanticChecker = new ConfRoomSchedulerSemanticChecker();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(semanticChecker, tree);
    }
}