// Generated from ConfigA.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConfigAParser}.
 */
public interface ConfigAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConfigAParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(ConfigAParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigAParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(ConfigAParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigAParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ConfigAParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigAParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ConfigAParser.StatementContext ctx);
}