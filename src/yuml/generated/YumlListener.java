package yuml.generated;

// Generated from Yuml.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YumlParser}.
 */
public interface YumlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YumlParser#yuml}.
	 * @param ctx the parse tree
	 */
	void enterYuml(@NotNull YumlParser.YumlContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#yuml}.
	 * @param ctx the parse tree
	 */
	void exitYuml(@NotNull YumlParser.YumlContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(@NotNull YumlParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(@NotNull YumlParser.RoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#yclassname}.
	 * @param ctx the parse tree
	 */
	void enterYclassname(@NotNull YumlParser.YclassnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#yclassname}.
	 * @param ctx the parse tree
	 */
	void exitYclassname(@NotNull YumlParser.YclassnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull YumlParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull YumlParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#yparameter}.
	 * @param ctx the parse tree
	 */
	void enterYparameter(@NotNull YumlParser.YparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#yparameter}.
	 * @param ctx the parse tree
	 */
	void exitYparameter(@NotNull YumlParser.YparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull YumlParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull YumlParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#visibilite}.
	 * @param ctx the parse tree
	 */
	void enterVisibilite(@NotNull YumlParser.VisibiliteContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#visibilite}.
	 * @param ctx the parse tree
	 */
	void exitVisibilite(@NotNull YumlParser.VisibiliteContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#box}.
	 * @param ctx the parse tree
	 */
	void enterBox(@NotNull YumlParser.BoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#box}.
	 * @param ctx the parse tree
	 */
	void exitBox(@NotNull YumlParser.BoxContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#ymethod}.
	 * @param ctx the parse tree
	 */
	void enterYmethod(@NotNull YumlParser.YmethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#ymethod}.
	 * @param ctx the parse tree
	 */
	void exitYmethod(@NotNull YumlParser.YmethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#nb}.
	 * @param ctx the parse tree
	 */
	void enterNb(@NotNull YumlParser.NbContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#nb}.
	 * @param ctx the parse tree
	 */
	void exitNb(@NotNull YumlParser.NbContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#yattributes}.
	 * @param ctx the parse tree
	 */
	void enterYattributes(@NotNull YumlParser.YattributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#yattributes}.
	 * @param ctx the parse tree
	 */
	void exitYattributes(@NotNull YumlParser.YattributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#listymethods}.
	 * @param ctx the parse tree
	 */
	void enterListymethods(@NotNull YumlParser.ListymethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#listymethods}.
	 * @param ctx the parse tree
	 */
	void exitListymethods(@NotNull YumlParser.ListymethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#listyparameters}.
	 * @param ctx the parse tree
	 */
	void enterListyparameters(@NotNull YumlParser.ListyparametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#listyparameters}.
	 * @param ctx the parse tree
	 */
	void exitListyparameters(@NotNull YumlParser.ListyparametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#connection}.
	 * @param ctx the parse tree
	 */
	void enterConnection(@NotNull YumlParser.ConnectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#connection}.
	 * @param ctx the parse tree
	 */
	void exitConnection(@NotNull YumlParser.ConnectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(@NotNull YumlParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(@NotNull YumlParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#listyattributes}.
	 * @param ctx the parse tree
	 */
	void enterListyattributes(@NotNull YumlParser.ListyattributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#listyattributes}.
	 * @param ctx the parse tree
	 */
	void exitListyattributes(@NotNull YumlParser.ListyattributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#card}.
	 * @param ctx the parse tree
	 */
	void enterCard(@NotNull YumlParser.CardContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#card}.
	 * @param ctx the parse tree
	 */
	void exitCard(@NotNull YumlParser.CardContext ctx);
	/**
	 * Enter a parse tree produced by {@link YumlParser#yclass}.
	 * @param ctx the parse tree
	 */
	void enterYclass(@NotNull YumlParser.YclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link YumlParser#yclass}.
	 * @param ctx the parse tree
	 */
	void exitYclass(@NotNull YumlParser.YclassContext ctx);
}