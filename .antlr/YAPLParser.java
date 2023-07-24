// Generated from c:\Users\cjrba\OneDrive\Documentos\Universidad\2023Parte2\Compiladores\Laboratorio0-GeneracionDeScannerYParser-ConstruccionDeCompiladores\YAPL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YAPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, OPEN_COMMENT=11, CLOSE_COMMENT=12, COMMENT=13, ONE_LINE_COMMENT=14, 
		WHITESPACE=15, CLASS=16, INHERITS=17, TRUE=18, FALSE=19, ASSIGNMENT=20, 
		IF=21, ELSE=22, THEN=23, FI=24, WHILE=25, LOOP=26, POOL=27, LET=28, IN=29, 
		CASE=30, OF=31, ESAC=32, CASEARR=33, NEW=34, ISVOID=35, ADD=36, MINUS=37, 
		MULT=38, DIV=39, NOT=40, LT=41, LE=42, EQ=43, TYPE=44, STR=45, ID=46, 
		INT=47;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_class_exp = 2, RULE_feature = 3, 
		RULE_formal = 4, RULE_declaration = 5, RULE_expr = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "class_exp", "feature", "formal", "declaration", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "','", "')'", "':'", "'@'", "'.'", 
			"'~'", "'(*'", "'*)'", null, null, null, null, null, null, null, "'<-'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'=>'", null, null, "'+'", "'-'", "'*'", "'/'", null, "'<'", "'<='", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "OPEN_COMMENT", 
			"CLOSE_COMMENT", "COMMENT", "ONE_LINE_COMMENT", "WHITESPACE", "CLASS", 
			"INHERITS", "TRUE", "FALSE", "ASSIGNMENT", "IF", "ELSE", "THEN", "FI", 
			"WHILE", "LOOP", "POOL", "LET", "IN", "CASE", "OF", "ESAC", "CASEARR", 
			"NEW", "ISVOID", "ADD", "MINUS", "MULT", "DIV", "NOT", "LT", "LE", "EQ", 
			"TYPE", "STR", "ID", "INT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "YAPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YAPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			program();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EndContext extends ProgramContext {
		public TerminalNode EOF() { return getToken(YAPLParser.EOF, 0); }
		public EndContext(ProgramContext ctx) { copyFrom(ctx); }
	}
	public static class Class_listContext extends ProgramContext {
		public Class_expContext class_exp() {
			return getRuleContext(Class_expContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Class_listContext(ProgramContext ctx) { copyFrom(ctx); }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				_localctx = new Class_listContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				class_exp();
				setState(17);
				match(T__0);
				setState(18);
				program();
				}
				break;
			case EOF:
				_localctx = new EndContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_expContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(YAPLParser.CLASS, 0); }
		public List<TerminalNode> TYPE() { return getTokens(YAPLParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(YAPLParser.TYPE, i);
		}
		public TerminalNode INHERITS() { return getToken(YAPLParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public Class_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_exp; }
	}

	public final Class_expContext class_exp() throws RecognitionException {
		Class_expContext _localctx = new Class_expContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(CLASS);
			setState(24);
			match(TYPE);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(25);
				match(INHERITS);
				setState(26);
				match(TYPE);
				}
			}

			setState(29);
			match(T__1);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(30);
				feature();
				setState(31);
				match(T__0);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodContext extends FeatureContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public MethodContext(FeatureContext ctx) { copyFrom(ctx); }
	}
	public static class AttributeContext extends FeatureContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(YAPLParser.ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttributeContext(FeatureContext ctx) { copyFrom(ctx); }
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_feature);
		int _la;
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new MethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(ID);
				setState(41);
				match(T__3);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(42);
					formal();
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(43);
						match(T__4);
						setState(44);
						formal();
						}
						}
						setState(49);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				match(T__5);
				setState(56);
				match(T__6);
				setState(57);
				match(TYPE);
				setState(58);
				match(T__1);
				setState(59);
				expr(0);
				setState(60);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new AttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(ID);
				setState(63);
				match(T__6);
				setState(64);
				match(TYPE);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(65);
					match(ASSIGNMENT);
					setState(66);
					expr(0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ID);
			setState(72);
			match(T__6);
			setState(73);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(YAPLParser.ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
			setState(76);
			match(T__6);
			setState(77);
			match(TYPE);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(78);
				match(ASSIGNMENT);
				setState(79);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetInContext extends ExprContext {
		public TerminalNode LET() { return getToken(YAPLParser.LET, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode IN() { return getToken(YAPLParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LetInContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MinusContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(YAPLParser.MINUS, 0); }
		public MinusContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NegationContext extends ExprContext {
		public TerminalNode NOT() { return getToken(YAPLParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegationContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DispatchContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public DispatchContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class WhileContext extends ExprContext {
		public TerminalNode WHILE() { return getToken(YAPLParser.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(YAPLParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(YAPLParser.POOL, 0); }
		public WhileContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DivisionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(YAPLParser.DIV, 0); }
		public DivisionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NewObjectContext extends ExprContext {
		public TerminalNode NEW() { return getToken(YAPLParser.NEW, 0); }
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public NewObjectContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(YAPLParser.LT, 0); }
		public LessThanContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BlockContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NegIntegerContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegIntegerContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IfContext extends ExprContext {
		public TerminalNode IF() { return getToken(YAPLParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(YAPLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(YAPLParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(YAPLParser.FI, 0); }
		public IfContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CaseContext extends ExprContext {
		public TerminalNode CASE() { return getToken(YAPLParser.CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OF() { return getToken(YAPLParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(YAPLParser.ESAC, 0); }
		public List<TerminalNode> ID() { return getTokens(YAPLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(YAPLParser.ID, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(YAPLParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(YAPLParser.TYPE, i);
		}
		public List<TerminalNode> CASEARR() { return getTokens(YAPLParser.CASEARR); }
		public TerminalNode CASEARR(int i) {
			return getToken(YAPLParser.CASEARR, i);
		}
		public CaseContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(YAPLParser.ADD, 0); }
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class StarContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(YAPLParser.MULT, 0); }
		public StarContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentContext extends ExprContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(YAPLParser.ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FalseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(YAPLParser.FALSE, 0); }
		public FalseContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(YAPLParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class StrContext extends ExprContext {
		public TerminalNode STR() { return getToken(YAPLParser.STR, 0); }
		public StrContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(YAPLParser.EQ, 0); }
		public EqualContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IsVoidContext extends ExprContext {
		public TerminalNode ISVOID() { return getToken(YAPLParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IsVoidContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class TrueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(YAPLParser.TRUE, 0); }
		public TrueContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(YAPLParser.LE, 0); }
		public LessEqualContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83);
				match(ID);
				setState(84);
				match(T__3);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << LET) | (1L << CASE) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << STR) | (1L << ID) | (1L << INT))) != 0)) {
					{
					{
					setState(85);
					expr(0);
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(86);
						match(T__4);
						setState(87);
						expr(0);
						}
						}
						setState(92);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(T__5);
				}
				break;
			case 2:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(IF);
				setState(100);
				expr(0);
				setState(101);
				match(THEN);
				setState(102);
				expr(0);
				setState(103);
				match(ELSE);
				setState(104);
				expr(0);
				setState(105);
				match(FI);
				}
				break;
			case 3:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(WHILE);
				setState(108);
				expr(0);
				setState(109);
				match(LOOP);
				setState(110);
				expr(0);
				setState(111);
				match(POOL);
				}
				break;
			case 4:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(T__1);
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(114);
					expr(0);
					setState(115);
					match(T__0);
					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << LET) | (1L << CASE) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << STR) | (1L << ID) | (1L << INT))) != 0) );
				setState(121);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new LetInContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(LET);
				setState(124);
				declaration();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(125);
					match(T__4);
					setState(126);
					declaration();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				match(IN);
				setState(133);
				expr(20);
				}
				break;
			case 6:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(CASE);
				setState(136);
				expr(0);
				setState(137);
				match(OF);
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					match(ID);
					setState(139);
					match(T__6);
					setState(140);
					match(TYPE);
					setState(141);
					match(CASEARR);
					setState(142);
					expr(0);
					setState(143);
					match(T__0);
					}
					}
					setState(147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(149);
				match(ESAC);
				}
				break;
			case 7:
				{
				_localctx = new NewObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(NEW);
				setState(152);
				match(TYPE);
				}
				break;
			case 8:
				{
				_localctx = new IsVoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(ISVOID);
				setState(154);
				expr(17);
				}
				break;
			case 9:
				{
				_localctx = new NegIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(T__9);
				setState(156);
				expr(12);
				}
				break;
			case 10:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(NOT);
				setState(158);
				expr(8);
				}
				break;
			case 11:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(T__3);
				setState(160);
				expr(0);
				setState(161);
				match(T__5);
				}
				break;
			case 12:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(INT);
				}
				break;
			case 13:
				{
				_localctx = new StrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(STR);
				}
				break;
			case 14:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(TRUE);
				}
				break;
			case 15:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(FALSE);
				}
				break;
			case 16:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(ID);
				}
				break;
			case 17:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(ID);
				setState(169);
				match(ASSIGNMENT);
				setState(170);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new StarContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(174);
						match(MULT);
						setState(175);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(177);
						match(DIV);
						setState(178);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(180);
						match(ADD);
						setState(181);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new MinusContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(183);
						match(MINUS);
						setState(184);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new LessThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(186);
						match(LT);
						setState(187);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new LessEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(189);
						match(LE);
						setState(190);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(192);
						match(EQ);
						setState(193);
						expr(10);
						}
						break;
					case 8:
						{
						_localctx = new DispatchContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(197);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__7) {
							{
							setState(195);
							match(T__7);
							setState(196);
							match(TYPE);
							}
						}

						setState(199);
						match(T__8);
						setState(200);
						match(ID);
						setState(201);
						match(T__3);
						setState(212);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << LET) | (1L << CASE) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << STR) | (1L << ID) | (1L << INT))) != 0)) {
							{
							{
							setState(202);
							expr(0);
							setState(207);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__4) {
								{
								{
								setState(203);
								match(T__4);
								setState(204);
								expr(0);
								}
								}
								setState(209);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							}
							setState(214);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(215);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 25);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00e0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\30\n\3\3\4\3\4\3\4\3\4\5\4\36\n\4\3\4\3\4\3\4\3\4\7\4$\n\4"+
		"\f\4\16\4\'\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5\60\n\5\f\5\16\5\63\13"+
		"\5\7\5\65\n\5\f\5\16\58\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5F\n\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7S\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b[\n\b\f\b\16\b^\13\b\7\b`\n\b\f\b\16\bc\13"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\6\bx\n\b\r\b\16\by\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0082\n\b\f\b"+
		"\16\b\u0085\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6"+
		"\b\u0094\n\b\r\b\16\b\u0095\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ae\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00c8\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00d0\n\b\f"+
		"\b\16\b\u00d3\13\b\7\b\u00d5\n\b\f\b\16\b\u00d8\13\b\3\b\7\b\u00db\n\b"+
		"\f\b\16\b\u00de\13\b\3\b\2\3\16\t\2\4\6\b\n\f\16\2\2\2\u0100\2\20\3\2"+
		"\2\2\4\27\3\2\2\2\6\31\3\2\2\2\bG\3\2\2\2\nI\3\2\2\2\fM\3\2\2\2\16\u00ad"+
		"\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\23\5\6\4\2\23\24\7\3\2\2\24\25"+
		"\5\4\3\2\25\30\3\2\2\2\26\30\7\2\2\3\27\22\3\2\2\2\27\26\3\2\2\2\30\5"+
		"\3\2\2\2\31\32\7\22\2\2\32\35\7.\2\2\33\34\7\23\2\2\34\36\7.\2\2\35\33"+
		"\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37%\7\4\2\2 !\5\b\5\2!\"\7\3\2\2"+
		"\"$\3\2\2\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2"+
		"\2\2()\7\5\2\2)\7\3\2\2\2*+\7\60\2\2+\66\7\6\2\2,\61\5\n\6\2-.\7\7\2\2"+
		".\60\5\n\6\2/-\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\65\3"+
		"\2\2\2\63\61\3\2\2\2\64,\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2"+
		"\2\679\3\2\2\28\66\3\2\2\29:\7\b\2\2:;\7\t\2\2;<\7.\2\2<=\7\4\2\2=>\5"+
		"\16\b\2>?\7\5\2\2?H\3\2\2\2@A\7\60\2\2AB\7\t\2\2BE\7.\2\2CD\7\26\2\2D"+
		"F\5\16\b\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2G*\3\2\2\2G@\3\2\2\2H\t\3\2\2"+
		"\2IJ\7\60\2\2JK\7\t\2\2KL\7.\2\2L\13\3\2\2\2MN\7\60\2\2NO\7\t\2\2OR\7"+
		".\2\2PQ\7\26\2\2QS\5\16\b\2RP\3\2\2\2RS\3\2\2\2S\r\3\2\2\2TU\b\b\1\2U"+
		"V\7\60\2\2Va\7\6\2\2W\\\5\16\b\2XY\7\7\2\2Y[\5\16\b\2ZX\3\2\2\2[^\3\2"+
		"\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2\2\2_W\3\2\2\2`c\3\2\2\2a_"+
		"\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2d\u00ae\7\b\2\2ef\7\27\2\2fg\5\16"+
		"\b\2gh\7\31\2\2hi\5\16\b\2ij\7\30\2\2jk\5\16\b\2kl\7\32\2\2l\u00ae\3\2"+
		"\2\2mn\7\33\2\2no\5\16\b\2op\7\34\2\2pq\5\16\b\2qr\7\35\2\2r\u00ae\3\2"+
		"\2\2sw\7\4\2\2tu\5\16\b\2uv\7\3\2\2vx\3\2\2\2wt\3\2\2\2xy\3\2\2\2yw\3"+
		"\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\5\2\2|\u00ae\3\2\2\2}~\7\36\2\2~\u0083"+
		"\5\f\7\2\177\u0080\7\7\2\2\u0080\u0082\5\f\7\2\u0081\177\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\37\2\2\u0087\u0088\5\16\b\26\u0088"+
		"\u00ae\3\2\2\2\u0089\u008a\7 \2\2\u008a\u008b\5\16\b\2\u008b\u0093\7!"+
		"\2\2\u008c\u008d\7\60\2\2\u008d\u008e\7\t\2\2\u008e\u008f\7.\2\2\u008f"+
		"\u0090\7#\2\2\u0090\u0091\5\16\b\2\u0091\u0092\7\3\2\2\u0092\u0094\3\2"+
		"\2\2\u0093\u008c\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\"\2\2\u0098\u00ae\3\2"+
		"\2\2\u0099\u009a\7$\2\2\u009a\u00ae\7.\2\2\u009b\u009c\7%\2\2\u009c\u00ae"+
		"\5\16\b\23\u009d\u009e\7\f\2\2\u009e\u00ae\5\16\b\16\u009f\u00a0\7*\2"+
		"\2\u00a0\u00ae\5\16\b\n\u00a1\u00a2\7\6\2\2\u00a2\u00a3\5\16\b\2\u00a3"+
		"\u00a4\7\b\2\2\u00a4\u00ae\3\2\2\2\u00a5\u00ae\7\61\2\2\u00a6\u00ae\7"+
		"/\2\2\u00a7\u00ae\7\24\2\2\u00a8\u00ae\7\25\2\2\u00a9\u00ae\7\60\2\2\u00aa"+
		"\u00ab\7\60\2\2\u00ab\u00ac\7\26\2\2\u00ac\u00ae\5\16\b\3\u00adT\3\2\2"+
		"\2\u00ade\3\2\2\2\u00adm\3\2\2\2\u00ads\3\2\2\2\u00ad}\3\2\2\2\u00ad\u0089"+
		"\3\2\2\2\u00ad\u0099\3\2\2\2\u00ad\u009b\3\2\2\2\u00ad\u009d\3\2\2\2\u00ad"+
		"\u009f\3\2\2\2\u00ad\u00a1\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a6\3\2"+
		"\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad"+
		"\u00aa\3\2\2\2\u00ae\u00dc\3\2\2\2\u00af\u00b0\f\22\2\2\u00b0\u00b1\7"+
		"(\2\2\u00b1\u00db\5\16\b\23\u00b2\u00b3\f\21\2\2\u00b3\u00b4\7)\2\2\u00b4"+
		"\u00db\5\16\b\22\u00b5\u00b6\f\20\2\2\u00b6\u00b7\7&\2\2\u00b7\u00db\5"+
		"\16\b\21\u00b8\u00b9\f\17\2\2\u00b9\u00ba\7\'\2\2\u00ba\u00db\5\16\b\20"+
		"\u00bb\u00bc\f\r\2\2\u00bc\u00bd\7+\2\2\u00bd\u00db\5\16\b\16\u00be\u00bf"+
		"\f\f\2\2\u00bf\u00c0\7,\2\2\u00c0\u00db\5\16\b\r\u00c1\u00c2\f\13\2\2"+
		"\u00c2\u00c3\7-\2\2\u00c3\u00db\5\16\b\f\u00c4\u00c7\f\33\2\2\u00c5\u00c6"+
		"\7\n\2\2\u00c6\u00c8\7.\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\7\13\2\2\u00ca\u00cb\7\60\2\2\u00cb\u00d6\7"+
		"\6\2\2\u00cc\u00d1\5\16\b\2\u00cd\u00ce\7\7\2\2\u00ce\u00d0\5\16\b\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\7\b\2\2\u00da\u00af\3\2\2\2\u00da"+
		"\u00b2\3\2\2\2\u00da\u00b5\3\2\2\2\u00da\u00b8\3\2\2\2\u00da\u00bb\3\2"+
		"\2\2\u00da\u00be\3\2\2\2\u00da\u00c1\3\2\2\2\u00da\u00c4\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\17\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\25\27\35%\61\66EGR\\ay\u0083\u0095\u00ad\u00c7"+
		"\u00d1\u00d6\u00da\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}