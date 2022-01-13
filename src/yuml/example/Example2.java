package yuml.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import yuml.generated.YumlLexer;
import yuml.generated.YumlParser;
import yuml.generated.YumlParser.YumlContext;

public class Example2 {
	public static void main(String[] args) throws IOException {
		// read from standard input
		InputStream is = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		
		System.out.println("yuml input :");
		String input = br.readLine(); 	// get first expression
		int line = 1; 					// track input line numbers

		YumlParser parser = new YumlParser(null); // share single parser instance
		
		while (input != null) { // while we have more expressions (Ctrl-D for EOF)
			CharStream stream = CharStreams.fromString(input);
			YumlLexer lexer = new YumlLexer(stream);

			lexer.setLine(line); // notify lexer of input position
			lexer.setCharPositionInLine(0);

			TokenStream tokens = new CommonTokenStream(lexer);
			parser.setInputStream(tokens);

			YumlContext o = parser.yuml();
			System.out.println(o.getText());
			System.out.println("yuml input : ");
			input = br.readLine(); // see if there's another line
			line++;
		}
	}

}
