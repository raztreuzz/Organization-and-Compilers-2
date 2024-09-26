// Generated from ConfigD.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConfigDParser}.
 */
public interface ConfigDListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConfigDParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(ConfigDParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigDParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(ConfigDParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigDParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ConfigDParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigDParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ConfigDParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigDParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ConfigDParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigDParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ConfigDParser.ConditionContext ctx);
}