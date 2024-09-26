// Generated from ConfigB.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConfigBParser}.
 */
public interface ConfigBListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConfigBParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(ConfigBParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigBParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(ConfigBParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigBParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ConfigBParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigBParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ConfigBParser.StatementContext ctx);
}