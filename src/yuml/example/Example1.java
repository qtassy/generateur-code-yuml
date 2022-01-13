package yuml.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import yuml.generated.YumlParser;
import yuml.generated.YumlLexer;
import org.antlr.v4.runtime.Lexer;

public class Example1 {

	public static void main(String[] args) {
		String input = 
				" [ Balise ] ";
		CharStream stream = CharStreams.fromString(input);
		TokenStream tokens = new CommonTokenStream(new YumlLexer(stream));
		YumlParser parser = new YumlParser(tokens);
		ParseTree tree = parser.yuml();
		System.out.println(tree.toStringTree());
	}
}
