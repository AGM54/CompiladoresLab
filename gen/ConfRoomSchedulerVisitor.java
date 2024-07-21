// Generated from C:/Users/marce/Desktop/funciones/src/ConfRoomScheduler.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ConfRoomSchedulerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ConfRoomSchedulerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ConfRoomSchedulerParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ConfRoomSchedulerParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reserveStat}
	 * labeled alternative in {@link ConfRoomSchedulerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserveStat(ConfRoomSchedulerParser.ReserveStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cancelStat}
	 * labeled alternative in {@link ConfRoomSchedulerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelStat(ConfRoomSchedulerParser.CancelStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listarStat}
	 * labeled alternative in {@link ConfRoomSchedulerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListarStat(ConfRoomSchedulerParser.ListarStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ConfRoomSchedulerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(ConfRoomSchedulerParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfRoomSchedulerParser#reserve}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserve(ConfRoomSchedulerParser.ReserveContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfRoomSchedulerParser#cancel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancel(ConfRoomSchedulerParser.CancelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfRoomSchedulerParser#listar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListar(ConfRoomSchedulerParser.ListarContext ctx);
}