// Generated from UNML.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UNMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, SEMICOLON=2, ASSING=3, ALLOCATE=4, LF_PAREN=5, RG_PAREN=6, 
		LF_BRACE=7, RG_BRACE=8, LF_SPARE=9, RG_SPARE=10, SEPARATOR=11, COMMA=12, 
		TWO_POINTS=13, DELIMITER_BEGIN=14, DELIMITER_END=15, MODEL=16, ENDMODEL=17, 
		UNION=18, BY=19, CROSS=20, IN=21, WITHIN=22, DIFF=23, INTER=24, SYMDIFF=25, 
		SET=26, VECTOR=27, MATRIX=28, SIMPLEX=29, MINIMIZE=30, MAXIMIZE=31, CONSTRAIN=32, 
		SOLVE=33, VARIBLE=34, PARAMETER=35, INT=36, DOUBLE=37, STRING=38, BOOL=39, 
		NULL=40, IF=41, ELSE=42, THEN=43, WHILE=44, BREAK=45, DO=46, FOR=47, SELECT=48, 
		CASE=49, EQUAL=50, DIFFERENT=51, GREATER=52, MINOR=53, GREATER_THAN=54, 
		MINOR_THAN=55, AND=56, OR=57, NOT=58, TRUE=59, FALSE=60, ADD=61, MINUS=62, 
		MULT=63, DIV=64, MOD=65, EXP=66, ABS=67, ATAN=68, CARD=69, CEIL=70, COS=71, 
		EXP_FUN=72, FLOOR=73, LENGTH=74, LOG=75, LOGTEN=76, ROUND=77, SIN=78, 
		SQRT=79, TAN=80, TRUNCT=81, UNIFORM=82, NORMAL=83, SUBSTR=84, VAR_ID=85, 
		ID=86, INTEGER=87, REAL=88, WORD=89, WS=90, OTHER=91;
	public static final int
		RULE_compilationUnit = 0, RULE_block = 1, RULE_propositions_sequence = 2, 
		RULE_proposition = 3, RULE_assign_statement = 4, RULE_inequation_operator = 5, 
		RULE_numeric_literal = 6, RULE_numeric_unsing = 7, RULE_building_block = 8, 
		RULE_function_statement = 9, RULE_constrain_statement = 10, RULE_type_objective = 11, 
		RULE_short_lineal_exp = 12, RULE_lineal_expression = 13, RULE_numeric_operation = 14, 
		RULE_lineal_operator = 15, RULE_aritmetic_operator = 16, RULE_numeric_expression = 17, 
		RULE_aritmetic_expression = 18, RULE_logical_expression = 19, RULE_subscripted_parameters = 20, 
		RULE_function_reference = 21, RULE_conditional_expression = 22, RULE_list_of_ids = 23, 
		RULE_logic_operator = 24, RULE_prop_solve = 25;
	public static final String[] ruleNames = {
		"compilationUnit", "block", "propositions_sequence", "proposition", "assign_statement", 
		"inequation_operator", "numeric_literal", "numeric_unsing", "building_block", 
		"function_statement", "constrain_statement", "type_objective", "short_lineal_exp", 
		"lineal_expression", "numeric_operation", "lineal_operator", "aritmetic_operator", 
		"numeric_expression", "aritmetic_expression", "logical_expression", "subscripted_parameters", 
		"function_reference", "conditional_expression", "list_of_ids", "logic_operator", 
		"prop_solve"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "';'", "'='", "':='", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"'X~'", "','", "':'", "'begin'", "'end'", "'MODEL'", "'ENDMODEL'", "'union'", 
		"'by'", "'cross'", "'in'", "'within'", "'diff'", "'inter'", "'symdiff'", 
		"'set'", "'vector'", "'matrix'", "'simplex'", "'minimize'", "'maximize'", 
		"'constrain'", "'solve'", "'var'", "'param'", "'int'", "'double'", "'string'", 
		"'boolean'", "'null'", "'if'", "'else'", "'then'", "'while'", "'break'", 
		"'do'", "'for'", "'select'", "'case'", "'=='", null, "'>'", "'<'", "'>='", 
		"'<='", null, null, null, "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", null, "'abs'", "'atan'", "'card'", "'ceil'", "'cos'", "'exp'", 
		"'floor'", "'length'", "'log'", "'log10'", "'round'", "'sin'", "'sqrt'", 
		"'tan'", "'trunc'", "'uniform'", "'normal'", "'substr'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "SEMICOLON", "ASSING", "ALLOCATE", "LF_PAREN", "RG_PAREN", 
		"LF_BRACE", "RG_BRACE", "LF_SPARE", "RG_SPARE", "SEPARATOR", "COMMA", 
		"TWO_POINTS", "DELIMITER_BEGIN", "DELIMITER_END", "MODEL", "ENDMODEL", 
		"UNION", "BY", "CROSS", "IN", "WITHIN", "DIFF", "INTER", "SYMDIFF", "SET", 
		"VECTOR", "MATRIX", "SIMPLEX", "MINIMIZE", "MAXIMIZE", "CONSTRAIN", "SOLVE", 
		"VARIBLE", "PARAMETER", "INT", "DOUBLE", "STRING", "BOOL", "NULL", "IF", 
		"ELSE", "THEN", "WHILE", "BREAK", "DO", "FOR", "SELECT", "CASE", "EQUAL", 
		"DIFFERENT", "GREATER", "MINOR", "GREATER_THAN", "MINOR_THAN", "AND", 
		"OR", "NOT", "TRUE", "FALSE", "ADD", "MINUS", "MULT", "DIV", "MOD", "EXP", 
		"ABS", "ATAN", "CARD", "CEIL", "COS", "EXP_FUN", "FLOOR", "LENGTH", "LOG", 
		"LOGTEN", "ROUND", "SIN", "SQRT", "TAN", "TRUNCT", "UNIFORM", "NORMAL", 
		"SUBSTR", "VAR_ID", "ID", "INTEGER", "REAL", "WORD", "WS", "OTHER"
	};
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
	public String getGrammarFileName() { return "UNML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UNMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode MODEL() { return getToken(UNMLParser.MODEL, 0); }
		public TerminalNode LF_BRACE() { return getToken(UNMLParser.LF_BRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RG_BRACE() { return getToken(UNMLParser.RG_BRACE, 0); }
		public TerminalNode ENDMODEL() { return getToken(UNMLParser.ENDMODEL, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(MODEL);
				setState(53);
				match(LF_BRACE);
				setState(54);
				block();
				setState(55);
				match(RG_BRACE);
				setState(56);
				match(ENDMODEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(MODEL);
				setState(59);
				match(LF_BRACE);
				setState(60);
				match(RG_BRACE);
				setState(61);
				match(ENDMODEL);
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

	public static class BlockContext extends ParserRuleContext {
		public Propositions_sequenceContext propositions_sequence() {
			return getRuleContext(Propositions_sequenceContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			propositions_sequence();
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

	public static class Propositions_sequenceContext extends ParserRuleContext {
		public List<PropositionContext> proposition() {
			return getRuleContexts(PropositionContext.class);
		}
		public PropositionContext proposition(int i) {
			return getRuleContext(PropositionContext.class,i);
		}
		public Propositions_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propositions_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterPropositions_sequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitPropositions_sequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitPropositions_sequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Propositions_sequenceContext propositions_sequence() throws RecognitionException {
		Propositions_sequenceContext _localctx = new Propositions_sequenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_propositions_sequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					proposition();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(72);
			proposition();
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

	public static class PropositionContext extends ParserRuleContext {
		public Prop_solveContext prop_solve() {
			return getRuleContext(Prop_solveContext.class,0);
		}
		public List<Assign_statementContext> assign_statement() {
			return getRuleContexts(Assign_statementContext.class);
		}
		public Assign_statementContext assign_statement(int i) {
			return getRuleContext(Assign_statementContext.class,i);
		}
		public List<Building_blockContext> building_block() {
			return getRuleContexts(Building_blockContext.class);
		}
		public Building_blockContext building_block(int i) {
			return getRuleContext(Building_blockContext.class,i);
		}
		public PropositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterProposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitProposition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitProposition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropositionContext proposition() throws RecognitionException {
		PropositionContext _localctx = new PropositionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_proposition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				assign_statement();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIBLE || _la==PARAMETER );
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				building_block();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DELIMITER_BEGIN );
			setState(84);
			prop_solve();
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

	public static class Assign_statementContext extends ParserRuleContext {
		public TerminalNode VARIBLE() { return getToken(UNMLParser.VARIBLE, 0); }
		public TerminalNode VAR_ID() { return getToken(UNMLParser.VAR_ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(UNMLParser.SEMICOLON, 0); }
		public TerminalNode PARAMETER() { return getToken(UNMLParser.PARAMETER, 0); }
		public TerminalNode ID() { return getToken(UNMLParser.ID, 0); }
		public TerminalNode ALLOCATE() { return getToken(UNMLParser.ALLOCATE, 0); }
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterAssign_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitAssign_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitAssign_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign_statement);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(VARIBLE);
				setState(87);
				match(VAR_ID);
				setState(88);
				match(SEMICOLON);
				}
				break;
			case PARAMETER:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(PARAMETER);
				setState(90);
				match(ID);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALLOCATE) {
					{
					setState(91);
					match(ALLOCATE);
					setState(92);
					numeric_literal();
					}
				}

				setState(95);
				match(SEMICOLON);
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

	public static class Inequation_operatorContext extends ParserRuleContext {
		public TerminalNode GREATER_THAN() { return getToken(UNMLParser.GREATER_THAN, 0); }
		public TerminalNode ASSING() { return getToken(UNMLParser.ASSING, 0); }
		public TerminalNode MINOR_THAN() { return getToken(UNMLParser.MINOR_THAN, 0); }
		public Inequation_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inequation_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterInequation_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitInequation_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitInequation_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inequation_operatorContext inequation_operator() throws RecognitionException {
		Inequation_operatorContext _localctx = new Inequation_operatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inequation_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSING) | (1L << GREATER_THAN) | (1L << MINOR_THAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Numeric_literalContext extends ParserRuleContext {
		public Token OP;
		public Numeric_unsingContext numeric_unsing() {
			return getRuleContext(Numeric_unsingContext.class,0);
		}
		public TerminalNode ADD() { return getToken(UNMLParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(UNMLParser.MINUS, 0); }
		public TerminalNode ID() { return getToken(UNMLParser.ID, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_numeric_literal);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case MINUS:
			case INTEGER:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==MINUS) {
					{
					setState(100);
					((Numeric_literalContext)_localctx).OP = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==MINUS) ) {
						((Numeric_literalContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(103);
				numeric_unsing();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(ID);
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

	public static class Numeric_unsingContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(UNMLParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(UNMLParser.REAL, 0); }
		public Numeric_unsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_unsing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterNumeric_unsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitNumeric_unsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitNumeric_unsing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_unsingContext numeric_unsing() throws RecognitionException {
		Numeric_unsingContext _localctx = new Numeric_unsingContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numeric_unsing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Building_blockContext extends ParserRuleContext {
		public TerminalNode DELIMITER_BEGIN() { return getToken(UNMLParser.DELIMITER_BEGIN, 0); }
		public Function_statementContext function_statement() {
			return getRuleContext(Function_statementContext.class,0);
		}
		public TerminalNode DELIMITER_END() { return getToken(UNMLParser.DELIMITER_END, 0); }
		public List<Constrain_statementContext> constrain_statement() {
			return getRuleContexts(Constrain_statementContext.class);
		}
		public Constrain_statementContext constrain_statement(int i) {
			return getRuleContext(Constrain_statementContext.class,i);
		}
		public Building_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_building_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterBuilding_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitBuilding_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitBuilding_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Building_blockContext building_block() throws RecognitionException {
		Building_blockContext _localctx = new Building_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_building_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(DELIMITER_BEGIN);
			setState(110);
			function_statement();
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				constrain_statement();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONSTRAIN );
			setState(116);
			match(DELIMITER_END);
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

	public static class Function_statementContext extends ParserRuleContext {
		public Type_objectiveContext type_objective() {
			return getRuleContext(Type_objectiveContext.class,0);
		}
		public TerminalNode ID() { return getToken(UNMLParser.ID, 0); }
		public TerminalNode TWO_POINTS() { return getToken(UNMLParser.TWO_POINTS, 0); }
		public Lineal_expressionContext lineal_expression() {
			return getRuleContext(Lineal_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UNMLParser.SEMICOLON, 0); }
		public Function_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterFunction_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitFunction_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitFunction_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_statementContext function_statement() throws RecognitionException {
		Function_statementContext _localctx = new Function_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			type_objective();
			setState(119);
			match(ID);
			setState(120);
			match(TWO_POINTS);
			setState(121);
			lineal_expression();
			setState(122);
			match(SEMICOLON);
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

	public static class Constrain_statementContext extends ParserRuleContext {
		public TerminalNode CONSTRAIN() { return getToken(UNMLParser.CONSTRAIN, 0); }
		public TerminalNode ID() { return getToken(UNMLParser.ID, 0); }
		public TerminalNode TWO_POINTS() { return getToken(UNMLParser.TWO_POINTS, 0); }
		public Lineal_expressionContext lineal_expression() {
			return getRuleContext(Lineal_expressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(UNMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UNMLParser.COMMA, i);
		}
		public List<Inequation_operatorContext> inequation_operator() {
			return getRuleContexts(Inequation_operatorContext.class);
		}
		public Inequation_operatorContext inequation_operator(int i) {
			return getRuleContext(Inequation_operatorContext.class,i);
		}
		public List<Numeric_literalContext> numeric_literal() {
			return getRuleContexts(Numeric_literalContext.class);
		}
		public Numeric_literalContext numeric_literal(int i) {
			return getRuleContext(Numeric_literalContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UNMLParser.SEMICOLON, 0); }
		public Constrain_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrain_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterConstrain_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitConstrain_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitConstrain_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constrain_statementContext constrain_statement() throws RecognitionException {
		Constrain_statementContext _localctx = new Constrain_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constrain_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(CONSTRAIN);
			setState(125);
			match(ID);
			setState(126);
			match(TWO_POINTS);
			setState(127);
			lineal_expression();
			setState(128);
			match(COMMA);
			setState(129);
			inequation_operator();
			setState(130);
			numeric_literal();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131);
				match(COMMA);
				setState(132);
				inequation_operator();
				setState(133);
				numeric_literal();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(SEMICOLON);
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

	public static class Type_objectiveContext extends ParserRuleContext {
		public TerminalNode MAXIMIZE() { return getToken(UNMLParser.MAXIMIZE, 0); }
		public TerminalNode MINIMIZE() { return getToken(UNMLParser.MINIMIZE, 0); }
		public Type_objectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_objective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterType_objective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitType_objective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitType_objective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_objectiveContext type_objective() throws RecognitionException {
		Type_objectiveContext _localctx = new Type_objectiveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_objective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==MINIMIZE || _la==MAXIMIZE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Short_lineal_expContext extends ParserRuleContext {
		public TerminalNode VAR_ID() { return getToken(UNMLParser.VAR_ID, 0); }
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Numeric_operationContext numeric_operation() {
			return getRuleContext(Numeric_operationContext.class,0);
		}
		public TerminalNode LF_PAREN() { return getToken(UNMLParser.LF_PAREN, 0); }
		public Short_lineal_expContext short_lineal_exp() {
			return getRuleContext(Short_lineal_expContext.class,0);
		}
		public TerminalNode RG_PAREN() { return getToken(UNMLParser.RG_PAREN, 0); }
		public Short_lineal_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_short_lineal_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterShort_lineal_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitShort_lineal_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitShort_lineal_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Short_lineal_expContext short_lineal_exp() throws RecognitionException {
		Short_lineal_expContext _localctx = new Short_lineal_expContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_short_lineal_exp);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(VAR_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				numeric_literal();
				setState(146);
				match(VAR_ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(148);
				numeric_operation(0);
				}
				setState(149);
				match(VAR_ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(LF_PAREN);
				setState(152);
				short_lineal_exp();
				setState(153);
				match(RG_PAREN);
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

	public static class Lineal_expressionContext extends ParserRuleContext {
		public List<Short_lineal_expContext> short_lineal_exp() {
			return getRuleContexts(Short_lineal_expContext.class);
		}
		public Short_lineal_expContext short_lineal_exp(int i) {
			return getRuleContext(Short_lineal_expContext.class,i);
		}
		public List<Lineal_operatorContext> lineal_operator() {
			return getRuleContexts(Lineal_operatorContext.class);
		}
		public Lineal_operatorContext lineal_operator(int i) {
			return getRuleContext(Lineal_operatorContext.class,i);
		}
		public List<Numeric_operationContext> numeric_operation() {
			return getRuleContexts(Numeric_operationContext.class);
		}
		public Numeric_operationContext numeric_operation(int i) {
			return getRuleContext(Numeric_operationContext.class,i);
		}
		public Lineal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineal_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterLineal_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitLineal_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitLineal_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lineal_expressionContext lineal_expression() throws RecognitionException {
		Lineal_expressionContext _localctx = new Lineal_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lineal_expression);
		int _la;
		try {
			int _alt;
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				short_lineal_exp();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD || _la==MINUS) {
					{
					{
					setState(158);
					lineal_operator();
					setState(159);
					short_lineal_exp();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(166);
						numeric_operation(0);
						}
						} 
					}
					setState(171);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(172);
				lineal_operator();
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

	public static class Numeric_operationContext extends ParserRuleContext {
		public TerminalNode LF_PAREN() { return getToken(UNMLParser.LF_PAREN, 0); }
		public List<Numeric_operationContext> numeric_operation() {
			return getRuleContexts(Numeric_operationContext.class);
		}
		public Numeric_operationContext numeric_operation(int i) {
			return getRuleContext(Numeric_operationContext.class,i);
		}
		public TerminalNode RG_PAREN() { return getToken(UNMLParser.RG_PAREN, 0); }
		public List<Numeric_literalContext> numeric_literal() {
			return getRuleContexts(Numeric_literalContext.class);
		}
		public Numeric_literalContext numeric_literal(int i) {
			return getRuleContext(Numeric_literalContext.class,i);
		}
		public List<Aritmetic_operatorContext> aritmetic_operator() {
			return getRuleContexts(Aritmetic_operatorContext.class);
		}
		public Aritmetic_operatorContext aritmetic_operator(int i) {
			return getRuleContext(Aritmetic_operatorContext.class,i);
		}
		public Numeric_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterNumeric_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitNumeric_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitNumeric_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_operationContext numeric_operation() throws RecognitionException {
		return numeric_operation(0);
	}

	private Numeric_operationContext numeric_operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Numeric_operationContext _localctx = new Numeric_operationContext(_ctx, _parentState);
		Numeric_operationContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_numeric_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(176);
				match(LF_PAREN);
				setState(177);
				numeric_operation(0);
				setState(178);
				match(RG_PAREN);
				}
				break;
			case 2:
				{
				setState(183); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(180);
						numeric_literal();
						setState(181);
						aritmetic_operator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(185); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(187);
				numeric_operation(0);
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(188);
						aritmetic_operator();
						setState(189);
						numeric_literal();
						}
						} 
					}
					setState(195);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 3:
				{
				{
				setState(196);
				numeric_literal();
				setState(197);
				aritmetic_operator();
				setState(198);
				numeric_literal();
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Numeric_operationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_numeric_operation);
					setState(202);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(203);
					aritmetic_operator();
					setState(204);
					numeric_operation(2);
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Lineal_operatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(UNMLParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(UNMLParser.MINUS, 0); }
		public Lineal_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineal_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterLineal_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitLineal_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitLineal_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lineal_operatorContext lineal_operator() throws RecognitionException {
		Lineal_operatorContext _localctx = new Lineal_operatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lineal_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Aritmetic_operatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(UNMLParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(UNMLParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(UNMLParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(UNMLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(UNMLParser.MOD, 0); }
		public TerminalNode EXP() { return getToken(UNMLParser.EXP, 0); }
		public Aritmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterAritmetic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitAritmetic_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitAritmetic_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aritmetic_operatorContext aritmetic_operator() throws RecognitionException {
		Aritmetic_operatorContext _localctx = new Aritmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_aritmetic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (ADD - 61)) | (1L << (MINUS - 61)) | (1L << (MULT - 61)) | (1L << (DIV - 61)) | (1L << (MOD - 61)) | (1L << (EXP - 61)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Numeric_expressionContext extends ParserRuleContext {
		public TerminalNode LF_PAREN() { return getToken(UNMLParser.LF_PAREN, 0); }
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public TerminalNode RG_PAREN() { return getToken(UNMLParser.RG_PAREN, 0); }
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Subscripted_parametersContext subscripted_parameters() {
			return getRuleContext(Subscripted_parametersContext.class,0);
		}
		public Function_referenceContext function_reference() {
			return getRuleContext(Function_referenceContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Numeric_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterNumeric_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitNumeric_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitNumeric_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_expressionContext numeric_expression() throws RecognitionException {
		Numeric_expressionContext _localctx = new Numeric_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numeric_expression);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(LF_PAREN);
				setState(216);
				numeric_expression();
				setState(217);
				match(RG_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				numeric_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				subscripted_parameters();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				function_reference();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				conditional_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
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

	public static class Aritmetic_expressionContext extends ParserRuleContext {
		public TerminalNode LF_PAREN() { return getToken(UNMLParser.LF_PAREN, 0); }
		public List<Aritmetic_expressionContext> aritmetic_expression() {
			return getRuleContexts(Aritmetic_expressionContext.class);
		}
		public Aritmetic_expressionContext aritmetic_expression(int i) {
			return getRuleContext(Aritmetic_expressionContext.class,i);
		}
		public TerminalNode RG_PAREN() { return getToken(UNMLParser.RG_PAREN, 0); }
		public List<Numeric_literalContext> numeric_literal() {
			return getRuleContexts(Numeric_literalContext.class);
		}
		public Numeric_literalContext numeric_literal(int i) {
			return getRuleContext(Numeric_literalContext.class,i);
		}
		public List<Aritmetic_operatorContext> aritmetic_operator() {
			return getRuleContexts(Aritmetic_operatorContext.class);
		}
		public Aritmetic_operatorContext aritmetic_operator(int i) {
			return getRuleContext(Aritmetic_operatorContext.class,i);
		}
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public Aritmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterAritmetic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitAritmetic_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitAritmetic_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aritmetic_expressionContext aritmetic_expression() throws RecognitionException {
		Aritmetic_expressionContext _localctx = new Aritmetic_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_aritmetic_expression);
		try {
			int _alt;
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(LF_PAREN);
				setState(227);
				aritmetic_expression();
				setState(228);
				match(RG_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				numeric_literal();
				setState(231);
				aritmetic_operator();
				setState(232);
				numeric_literal();
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(233);
						aritmetic_operator();
						setState(234);
						aritmetic_expression();
						}
						} 
					}
					setState(240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				numeric_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				logical_expression();
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

	public static class Logical_expressionContext extends ParserRuleContext {
		public TerminalNode LF_PAREN() { return getToken(UNMLParser.LF_PAREN, 0); }
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public TerminalNode RG_PAREN() { return getToken(UNMLParser.RG_PAREN, 0); }
		public TerminalNode NOT() { return getToken(UNMLParser.NOT, 0); }
		public List<TerminalNode> ID() { return getTokens(UNMLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UNMLParser.ID, i);
		}
		public Inequation_operatorContext inequation_operator() {
			return getRuleContext(Inequation_operatorContext.class,0);
		}
		public Logic_operatorContext logic_operator() {
			return getRuleContext(Logic_operatorContext.class,0);
		}
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitLogical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitLogical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logical_expression);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(LF_PAREN);
				setState(246);
				logical_expression();
				setState(247);
				match(RG_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(NOT);
				setState(250);
				match(LF_PAREN);
				setState(251);
				match(ID);
				setState(252);
				match(RG_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(NOT);
				setState(254);
				match(LF_PAREN);
				setState(255);
				logical_expression();
				setState(256);
				match(RG_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				match(LF_PAREN);
				setState(259);
				match(ID);
				setState(260);
				inequation_operator();
				setState(261);
				match(ID);
				setState(262);
				match(RG_PAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
				match(LF_PAREN);
				setState(265);
				match(ID);
				setState(266);
				logic_operator();
				setState(267);
				match(ID);
				setState(268);
				match(RG_PAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(270);
				match(LF_PAREN);
				setState(271);
				logical_expression();
				setState(272);
				logic_operator();
				setState(273);
				logical_expression();
				setState(274);
				match(RG_PAREN);
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

	public static class Subscripted_parametersContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UNMLParser.ID, 0); }
		public TerminalNode LF_SPARE() { return getToken(UNMLParser.LF_SPARE, 0); }
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UNMLParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UNMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UNMLParser.COMMA, i);
		}
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public Subscripted_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscripted_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterSubscripted_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitSubscripted_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitSubscripted_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscripted_parametersContext subscripted_parameters() throws RecognitionException {
		Subscripted_parametersContext _localctx = new Subscripted_parametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_subscripted_parameters);
		int _la;
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(ID);
				setState(279);
				match(LF_SPARE);
				setState(280);
				logical_expression();
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(281);
					match(COMMA);
					setState(282);
					logical_expression();
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(ID);
				setState(291);
				match(LF_SPARE);
				setState(292);
				numeric_expression();
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(293);
					match(COMMA);
					setState(294);
					numeric_expression();
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300);
				match(SEMICOLON);
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

	public static class Function_referenceContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(UNMLParser.ABS, 0); }
		public TerminalNode LF_PAREN() { return getToken(UNMLParser.LF_PAREN, 0); }
		public List<Numeric_literalContext> numeric_literal() {
			return getRuleContexts(Numeric_literalContext.class);
		}
		public Numeric_literalContext numeric_literal(int i) {
			return getRuleContext(Numeric_literalContext.class,i);
		}
		public TerminalNode RG_PAREN() { return getToken(UNMLParser.RG_PAREN, 0); }
		public TerminalNode ATAN() { return getToken(UNMLParser.ATAN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UNMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UNMLParser.COMMA, i);
		}
		public TerminalNode CARD() { return getToken(UNMLParser.CARD, 0); }
		public TerminalNode CEIL() { return getToken(UNMLParser.CEIL, 0); }
		public TerminalNode COS() { return getToken(UNMLParser.COS, 0); }
		public TerminalNode FLOOR() { return getToken(UNMLParser.FLOOR, 0); }
		public TerminalNode LENGTH() { return getToken(UNMLParser.LENGTH, 0); }
		public TerminalNode LOG() { return getToken(UNMLParser.LOG, 0); }
		public TerminalNode LOGTEN() { return getToken(UNMLParser.LOGTEN, 0); }
		public TerminalNode MAXIMIZE() { return getToken(UNMLParser.MAXIMIZE, 0); }
		public List_of_idsContext list_of_ids() {
			return getRuleContext(List_of_idsContext.class,0);
		}
		public TerminalNode MINIMIZE() { return getToken(UNMLParser.MINIMIZE, 0); }
		public TerminalNode ROUND() { return getToken(UNMLParser.ROUND, 0); }
		public TerminalNode SIN() { return getToken(UNMLParser.SIN, 0); }
		public TerminalNode SQRT() { return getToken(UNMLParser.SQRT, 0); }
		public TerminalNode TAN() { return getToken(UNMLParser.TAN, 0); }
		public TerminalNode TRUNCT() { return getToken(UNMLParser.TRUNCT, 0); }
		public TerminalNode UNIFORM() { return getToken(UNMLParser.UNIFORM, 0); }
		public TerminalNode NORMAL() { return getToken(UNMLParser.NORMAL, 0); }
		public TerminalNode SUBSTR() { return getToken(UNMLParser.SUBSTR, 0); }
		public Function_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterFunction_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitFunction_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitFunction_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_referenceContext function_reference() throws RecognitionException {
		Function_referenceContext _localctx = new Function_referenceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_reference);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(ABS);
				setState(305);
				match(LF_PAREN);
				setState(306);
				numeric_literal();
				setState(307);
				match(RG_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(ATAN);
				setState(310);
				match(LF_PAREN);
				setState(311);
				numeric_literal();
				setState(312);
				match(RG_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(ATAN);
				setState(315);
				match(LF_PAREN);
				setState(316);
				numeric_literal();
				setState(317);
				match(COMMA);
				setState(318);
				numeric_literal();
				setState(319);
				match(RG_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				match(CARD);
				setState(322);
				match(LF_PAREN);
				setState(323);
				numeric_literal();
				setState(324);
				match(RG_PAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				match(CEIL);
				setState(327);
				match(LF_PAREN);
				setState(328);
				numeric_literal();
				setState(329);
				match(RG_PAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(331);
				match(COS);
				setState(332);
				match(LF_PAREN);
				setState(333);
				numeric_literal();
				setState(334);
				match(RG_PAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(336);
				match(FLOOR);
				setState(337);
				match(LF_PAREN);
				setState(338);
				numeric_literal();
				setState(339);
				match(RG_PAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(341);
				match(LENGTH);
				setState(342);
				match(LF_PAREN);
				setState(343);
				numeric_literal();
				setState(344);
				match(RG_PAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(346);
				match(LOG);
				setState(347);
				match(LF_PAREN);
				setState(348);
				numeric_literal();
				setState(349);
				match(RG_PAREN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(351);
				match(LOGTEN);
				setState(352);
				match(LF_PAREN);
				setState(353);
				numeric_literal();
				setState(354);
				match(RG_PAREN);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(356);
				match(MAXIMIZE);
				setState(357);
				match(LF_PAREN);
				setState(358);
				list_of_ids();
				setState(359);
				match(RG_PAREN);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(361);
				match(MINIMIZE);
				setState(362);
				match(LF_PAREN);
				setState(363);
				list_of_ids();
				setState(364);
				match(RG_PAREN);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(366);
				match(ROUND);
				setState(367);
				match(LF_PAREN);
				setState(368);
				numeric_literal();
				setState(369);
				match(RG_PAREN);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(371);
				match(ROUND);
				setState(372);
				match(LF_PAREN);
				setState(373);
				numeric_literal();
				setState(374);
				match(COMMA);
				setState(375);
				numeric_literal();
				setState(376);
				match(RG_PAREN);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(378);
				match(SIN);
				setState(379);
				match(LF_PAREN);
				setState(380);
				numeric_literal();
				setState(381);
				match(RG_PAREN);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(383);
				match(SQRT);
				setState(384);
				match(LF_PAREN);
				setState(385);
				numeric_literal();
				setState(386);
				match(RG_PAREN);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(388);
				match(TAN);
				setState(389);
				match(LF_PAREN);
				setState(390);
				numeric_literal();
				setState(391);
				match(RG_PAREN);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(393);
				match(TRUNCT);
				setState(394);
				match(LF_PAREN);
				setState(395);
				numeric_literal();
				setState(396);
				match(RG_PAREN);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(398);
				match(UNIFORM);
				setState(399);
				match(LF_PAREN);
				setState(400);
				match(RG_PAREN);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(401);
				match(UNIFORM);
				setState(402);
				match(LF_PAREN);
				setState(403);
				numeric_literal();
				setState(404);
				match(COMMA);
				setState(405);
				numeric_literal();
				setState(406);
				match(RG_PAREN);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(408);
				match(NORMAL);
				setState(409);
				match(LF_PAREN);
				setState(410);
				match(RG_PAREN);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(411);
				match(NORMAL);
				setState(412);
				match(LF_PAREN);
				setState(413);
				numeric_literal();
				setState(414);
				match(COMMA);
				setState(415);
				numeric_literal();
				setState(416);
				match(RG_PAREN);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(418);
				match(SUBSTR);
				setState(419);
				match(LF_PAREN);
				setState(420);
				numeric_literal();
				setState(421);
				match(COMMA);
				setState(422);
				numeric_literal();
				setState(423);
				match(RG_PAREN);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(425);
				match(SUBSTR);
				setState(426);
				match(LF_PAREN);
				setState(427);
				numeric_literal();
				setState(428);
				match(COMMA);
				setState(429);
				numeric_literal();
				setState(430);
				match(COMMA);
				setState(431);
				numeric_literal();
				setState(432);
				match(RG_PAREN);
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

	public static class Conditional_expressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(UNMLParser.IF, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(UNMLParser.THEN, 0); }
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(UNMLParser.ELSE, 0); }
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitConditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_conditional_expression);
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(IF);
				setState(437);
				logical_expression();
				setState(438);
				match(THEN);
				setState(439);
				numeric_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				match(IF);
				setState(442);
				logical_expression();
				setState(443);
				match(THEN);
				setState(444);
				numeric_expression();
				setState(445);
				match(ELSE);
				setState(446);
				numeric_expression();
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

	public static class List_of_idsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(UNMLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UNMLParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UNMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UNMLParser.COMMA, i);
		}
		public List_of_idsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_of_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterList_of_ids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitList_of_ids(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitList_of_ids(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_of_idsContext list_of_ids() throws RecognitionException {
		List_of_idsContext _localctx = new List_of_idsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_list_of_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(ID);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(451);
				match(COMMA);
				setState(452);
				match(ID);
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Logic_operatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(UNMLParser.AND, 0); }
		public TerminalNode OR() { return getToken(UNMLParser.OR, 0); }
		public Logic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterLogic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitLogic_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitLogic_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_operatorContext logic_operator() throws RecognitionException {
		Logic_operatorContext _localctx = new Logic_operatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Prop_solveContext extends ParserRuleContext {
		public TerminalNode SOLVE() { return getToken(UNMLParser.SOLVE, 0); }
		public TerminalNode SEMICOLON() { return getToken(UNMLParser.SEMICOLON, 0); }
		public Prop_solveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop_solve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).enterProp_solve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UNMLListener ) ((UNMLListener)listener).exitProp_solve(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UNMLVisitor ) return ((UNMLVisitor<? extends T>)visitor).visitProp_solve(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prop_solveContext prop_solve() throws RecognitionException {
		Prop_solveContext _localctx = new Prop_solveContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_prop_solve);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(SOLVE);
			setState(461);
			match(SEMICOLON);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return numeric_operation_sempred((Numeric_operationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean numeric_operation_sempred(Numeric_operationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u01d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2A\n\2"+
		"\3\3\3\3\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\3\5\6\5N\n\5\r\5\16\5O\3"+
		"\5\6\5S\n\5\r\5\16\5T\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6`\n\6\3\6"+
		"\5\6c\n\6\3\7\3\7\3\b\5\bh\n\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\n\3\n\3\n\6"+
		"\ns\n\n\r\n\16\nt\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008a\n\f\f\f\16\f\u008d\13\f\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u009e\n\16\3\17\3\17\3\17\3\17\7\17\u00a4\n\17\f\17\16\17\u00a7\13\17"+
		"\3\17\7\17\u00aa\n\17\f\17\16\17\u00ad\13\17\3\17\5\17\u00b0\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00ba\n\20\r\20\16\20\u00bb\3"+
		"\20\3\20\3\20\3\20\7\20\u00c2\n\20\f\20\16\20\u00c5\13\20\3\20\3\20\3"+
		"\20\3\20\5\20\u00cb\n\20\3\20\3\20\3\20\3\20\7\20\u00d1\n\20\f\20\16\20"+
		"\u00d4\13\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u00e3\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00ef\n\24\f\24\16\24\u00f2\13\24\3\24\3\24\5\24\u00f6\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0117\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u011e\n"+
		"\26\f\26\16\26\u0121\13\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u012a"+
		"\n\26\f\26\16\26\u012d\13\26\3\26\3\26\5\26\u0131\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u01b5\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u01c3\n\30\3\31\3\31\3\31\7\31\u01c8\n\31\f\31\16\31\u01cb"+
		"\13\31\3\32\3\32\3\33\3\33\3\33\3\33\2\3\36\34\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\2\b\4\2\5\589\3\2?@\3\2YZ\3\2 !\3\2"+
		"?D\3\2:;\2\u01f6\2@\3\2\2\2\4B\3\2\2\2\6G\3\2\2\2\bM\3\2\2\2\nb\3\2\2"+
		"\2\fd\3\2\2\2\16k\3\2\2\2\20m\3\2\2\2\22o\3\2\2\2\24x\3\2\2\2\26~\3\2"+
		"\2\2\30\u0090\3\2\2\2\32\u009d\3\2\2\2\34\u00af\3\2\2\2\36\u00ca\3\2\2"+
		"\2 \u00d5\3\2\2\2\"\u00d7\3\2\2\2$\u00e2\3\2\2\2&\u00f5\3\2\2\2(\u0116"+
		"\3\2\2\2*\u0130\3\2\2\2,\u01b4\3\2\2\2.\u01c2\3\2\2\2\60\u01c4\3\2\2\2"+
		"\62\u01cc\3\2\2\2\64\u01ce\3\2\2\2\66\67\7\22\2\2\678\7\t\2\289\5\4\3"+
		"\29:\7\n\2\2:;\7\23\2\2;A\3\2\2\2<=\7\22\2\2=>\7\t\2\2>?\7\n\2\2?A\7\23"+
		"\2\2@\66\3\2\2\2@<\3\2\2\2A\3\3\2\2\2BC\5\6\4\2C\5\3\2\2\2DF\5\b\5\2E"+
		"D\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\5\b\5\2"+
		"K\7\3\2\2\2LN\5\n\6\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2"+
		"\2QS\5\22\n\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\5\64"+
		"\33\2W\t\3\2\2\2XY\7$\2\2YZ\7W\2\2Zc\7\4\2\2[\\\7%\2\2\\_\7X\2\2]^\7\6"+
		"\2\2^`\5\16\b\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\7\4\2\2bX\3\2\2\2b[\3"+
		"\2\2\2c\13\3\2\2\2de\t\2\2\2e\r\3\2\2\2fh\t\3\2\2gf\3\2\2\2gh\3\2\2\2"+
		"hi\3\2\2\2il\5\20\t\2jl\7X\2\2kg\3\2\2\2kj\3\2\2\2l\17\3\2\2\2mn\t\4\2"+
		"\2n\21\3\2\2\2op\7\20\2\2pr\5\24\13\2qs\5\26\f\2rq\3\2\2\2st\3\2\2\2t"+
		"r\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\21\2\2w\23\3\2\2\2xy\5\30\r\2yz\7X\2"+
		"\2z{\7\17\2\2{|\5\34\17\2|}\7\4\2\2}\25\3\2\2\2~\177\7\"\2\2\177\u0080"+
		"\7X\2\2\u0080\u0081\7\17\2\2\u0081\u0082\5\34\17\2\u0082\u0083\7\16\2"+
		"\2\u0083\u0084\5\f\7\2\u0084\u008b\5\16\b\2\u0085\u0086\7\16\2\2\u0086"+
		"\u0087\5\f\7\2\u0087\u0088\5\16\b\2\u0088\u008a\3\2\2\2\u0089\u0085\3"+
		"\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\4\2\2\u008f\27\3\2\2"+
		"\2\u0090\u0091\t\5\2\2\u0091\31\3\2\2\2\u0092\u009e\7W\2\2\u0093\u0094"+
		"\5\16\b\2\u0094\u0095\7W\2\2\u0095\u009e\3\2\2\2\u0096\u0097\5\36\20\2"+
		"\u0097\u0098\7W\2\2\u0098\u009e\3\2\2\2\u0099\u009a\7\7\2\2\u009a\u009b"+
		"\5\32\16\2\u009b\u009c\7\b\2\2\u009c\u009e\3\2\2\2\u009d\u0092\3\2\2\2"+
		"\u009d\u0093\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u0099\3\2\2\2\u009e\33"+
		"\3\2\2\2\u009f\u00a5\5\32\16\2\u00a0\u00a1\5 \21\2\u00a1\u00a2\5\32\16"+
		"\2\u00a2\u00a4\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00b0\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00aa\5\36\20\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00b0\5 \21\2\u00af\u009f\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\35\3\2\2"+
		"\2\u00b1\u00b2\b\20\1\2\u00b2\u00b3\7\7\2\2\u00b3\u00b4\5\36\20\2\u00b4"+
		"\u00b5\7\b\2\2\u00b5\u00cb\3\2\2\2\u00b6\u00b7\5\16\b\2\u00b7\u00b8\5"+
		"\"\22\2\u00b8\u00ba\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c3\5\36"+
		"\20\2\u00be\u00bf\5\"\22\2\u00bf\u00c0\5\16\b\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00be\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00cb\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\5\16\b\2\u00c7"+
		"\u00c8\5\"\22\2\u00c8\u00c9\5\16\b\2\u00c9\u00cb\3\2\2\2\u00ca\u00b1\3"+
		"\2\2\2\u00ca\u00b9\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\u00d2\3\2\2\2\u00cc"+
		"\u00cd\f\3\2\2\u00cd\u00ce\5\"\22\2\u00ce\u00cf\5\36\20\4\u00cf\u00d1"+
		"\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\37\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\t\3\2"+
		"\2\u00d6!\3\2\2\2\u00d7\u00d8\t\6\2\2\u00d8#\3\2\2\2\u00d9\u00da\7\7\2"+
		"\2\u00da\u00db\5$\23\2\u00db\u00dc\7\b\2\2\u00dc\u00e3\3\2\2\2\u00dd\u00e3"+
		"\5\16\b\2\u00de\u00e3\5*\26\2\u00df\u00e3\5,\27\2\u00e0\u00e3\5.\30\2"+
		"\u00e1\u00e3\3\2\2\2\u00e2\u00d9\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00de"+
		"\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"%\3\2\2\2\u00e4\u00e5\7\7\2\2\u00e5\u00e6\5&\24\2\u00e6\u00e7\7\b\2\2"+
		"\u00e7\u00f6\3\2\2\2\u00e8\u00e9\5\16\b\2\u00e9\u00ea\5\"\22\2\u00ea\u00f0"+
		"\5\16\b\2\u00eb\u00ec\5\"\22\2\u00ec\u00ed\5&\24\2\u00ed\u00ef\3\2\2\2"+
		"\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f6\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\5$\23\2\u00f4"+
		"\u00f6\5(\25\2\u00f5\u00e4\3\2\2\2\u00f5\u00e8\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f4\3\2\2\2\u00f6\'\3\2\2\2\u00f7\u00f8\7\7\2\2\u00f8\u00f9"+
		"\5(\25\2\u00f9\u00fa\7\b\2\2\u00fa\u0117\3\2\2\2\u00fb\u00fc\7<\2\2\u00fc"+
		"\u00fd\7\7\2\2\u00fd\u00fe\7X\2\2\u00fe\u0117\7\b\2\2\u00ff\u0100\7<\2"+
		"\2\u0100\u0101\7\7\2\2\u0101\u0102\5(\25\2\u0102\u0103\7\b\2\2\u0103\u0117"+
		"\3\2\2\2\u0104\u0105\7\7\2\2\u0105\u0106\7X\2\2\u0106\u0107\5\f\7\2\u0107"+
		"\u0108\7X\2\2\u0108\u0109\7\b\2\2\u0109\u0117\3\2\2\2\u010a\u010b\7\7"+
		"\2\2\u010b\u010c\7X\2\2\u010c\u010d\5\62\32\2\u010d\u010e\7X\2\2\u010e"+
		"\u010f\7\b\2\2\u010f\u0117\3\2\2\2\u0110\u0111\7\7\2\2\u0111\u0112\5("+
		"\25\2\u0112\u0113\5\62\32\2\u0113\u0114\5(\25\2\u0114\u0115\7\b\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u00f7\3\2\2\2\u0116\u00fb\3\2\2\2\u0116\u00ff\3\2"+
		"\2\2\u0116\u0104\3\2\2\2\u0116\u010a\3\2\2\2\u0116\u0110\3\2\2\2\u0117"+
		")\3\2\2\2\u0118\u0119\7X\2\2\u0119\u011a\7\13\2\2\u011a\u011f\5(\25\2"+
		"\u011b\u011c\7\16\2\2\u011c\u011e\5(\25\2\u011d\u011b\3\2\2\2\u011e\u0121"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0123\7\4\2\2\u0123\u0131\3\2\2\2\u0124\u0125\7X"+
		"\2\2\u0125\u0126\7\13\2\2\u0126\u012b\5$\23\2\u0127\u0128\7\16\2\2\u0128"+
		"\u012a\5$\23\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u012f\7\4\2\2\u012f\u0131\3\2\2\2\u0130\u0118\3\2\2\2\u0130\u0124\3\2"+
		"\2\2\u0131+\3\2\2\2\u0132\u0133\7E\2\2\u0133\u0134\7\7\2\2\u0134\u0135"+
		"\5\16\b\2\u0135\u0136\7\b\2\2\u0136\u01b5\3\2\2\2\u0137\u0138\7F\2\2\u0138"+
		"\u0139\7\7\2\2\u0139\u013a\5\16\b\2\u013a\u013b\7\b\2\2\u013b\u01b5\3"+
		"\2\2\2\u013c\u013d\7F\2\2\u013d\u013e\7\7\2\2\u013e\u013f\5\16\b\2\u013f"+
		"\u0140\7\16\2\2\u0140\u0141\5\16\b\2\u0141\u0142\7\b\2\2\u0142\u01b5\3"+
		"\2\2\2\u0143\u0144\7G\2\2\u0144\u0145\7\7\2\2\u0145\u0146\5\16\b\2\u0146"+
		"\u0147\7\b\2\2\u0147\u01b5\3\2\2\2\u0148\u0149\7H\2\2\u0149\u014a\7\7"+
		"\2\2\u014a\u014b\5\16\b\2\u014b\u014c\7\b\2\2\u014c\u01b5\3\2\2\2\u014d"+
		"\u014e\7I\2\2\u014e\u014f\7\7\2\2\u014f\u0150\5\16\b\2\u0150\u0151\7\b"+
		"\2\2\u0151\u01b5\3\2\2\2\u0152\u0153\7K\2\2\u0153\u0154\7\7\2\2\u0154"+
		"\u0155\5\16\b\2\u0155\u0156\7\b\2\2\u0156\u01b5\3\2\2\2\u0157\u0158\7"+
		"L\2\2\u0158\u0159\7\7\2\2\u0159\u015a\5\16\b\2\u015a\u015b\7\b\2\2\u015b"+
		"\u01b5\3\2\2\2\u015c\u015d\7M\2\2\u015d\u015e\7\7\2\2\u015e\u015f\5\16"+
		"\b\2\u015f\u0160\7\b\2\2\u0160\u01b5\3\2\2\2\u0161\u0162\7N\2\2\u0162"+
		"\u0163\7\7\2\2\u0163\u0164\5\16\b\2\u0164\u0165\7\b\2\2\u0165\u01b5\3"+
		"\2\2\2\u0166\u0167\7!\2\2\u0167\u0168\7\7\2\2\u0168\u0169\5\60\31\2\u0169"+
		"\u016a\7\b\2\2\u016a\u01b5\3\2\2\2\u016b\u016c\7 \2\2\u016c\u016d\7\7"+
		"\2\2\u016d\u016e\5\60\31\2\u016e\u016f\7\b\2\2\u016f\u01b5\3\2\2\2\u0170"+
		"\u0171\7O\2\2\u0171\u0172\7\7\2\2\u0172\u0173\5\16\b\2\u0173\u0174\7\b"+
		"\2\2\u0174\u01b5\3\2\2\2\u0175\u0176\7O\2\2\u0176\u0177\7\7\2\2\u0177"+
		"\u0178\5\16\b\2\u0178\u0179\7\16\2\2\u0179\u017a\5\16\b\2\u017a\u017b"+
		"\7\b\2\2\u017b\u01b5\3\2\2\2\u017c\u017d\7P\2\2\u017d\u017e\7\7\2\2\u017e"+
		"\u017f\5\16\b\2\u017f\u0180\7\b\2\2\u0180\u01b5\3\2\2\2\u0181\u0182\7"+
		"Q\2\2\u0182\u0183\7\7\2\2\u0183\u0184\5\16\b\2\u0184\u0185\7\b\2\2\u0185"+
		"\u01b5\3\2\2\2\u0186\u0187\7R\2\2\u0187\u0188\7\7\2\2\u0188\u0189\5\16"+
		"\b\2\u0189\u018a\7\b\2\2\u018a\u01b5\3\2\2\2\u018b\u018c\7S\2\2\u018c"+
		"\u018d\7\7\2\2\u018d\u018e\5\16\b\2\u018e\u018f\7\b\2\2\u018f\u01b5\3"+
		"\2\2\2\u0190\u0191\7T\2\2\u0191\u0192\7\7\2\2\u0192\u01b5\7\b\2\2\u0193"+
		"\u0194\7T\2\2\u0194\u0195\7\7\2\2\u0195\u0196\5\16\b\2\u0196\u0197\7\16"+
		"\2\2\u0197\u0198\5\16\b\2\u0198\u0199\7\b\2\2\u0199\u01b5\3\2\2\2\u019a"+
		"\u019b\7U\2\2\u019b\u019c\7\7\2\2\u019c\u01b5\7\b\2\2\u019d\u019e\7U\2"+
		"\2\u019e\u019f\7\7\2\2\u019f\u01a0\5\16\b\2\u01a0\u01a1\7\16\2\2\u01a1"+
		"\u01a2\5\16\b\2\u01a2\u01a3\7\b\2\2\u01a3\u01b5\3\2\2\2\u01a4\u01a5\7"+
		"V\2\2\u01a5\u01a6\7\7\2\2\u01a6\u01a7\5\16\b\2\u01a7\u01a8\7\16\2\2\u01a8"+
		"\u01a9\5\16\b\2\u01a9\u01aa\7\b\2\2\u01aa\u01b5\3\2\2\2\u01ab\u01ac\7"+
		"V\2\2\u01ac\u01ad\7\7\2\2\u01ad\u01ae\5\16\b\2\u01ae\u01af\7\16\2\2\u01af"+
		"\u01b0\5\16\b\2\u01b0\u01b1\7\16\2\2\u01b1\u01b2\5\16\b\2\u01b2\u01b3"+
		"\7\b\2\2\u01b3\u01b5\3\2\2\2\u01b4\u0132\3\2\2\2\u01b4\u0137\3\2\2\2\u01b4"+
		"\u013c\3\2\2\2\u01b4\u0143\3\2\2\2\u01b4\u0148\3\2\2\2\u01b4\u014d\3\2"+
		"\2\2\u01b4\u0152\3\2\2\2\u01b4\u0157\3\2\2\2\u01b4\u015c\3\2\2\2\u01b4"+
		"\u0161\3\2\2\2\u01b4\u0166\3\2\2\2\u01b4\u016b\3\2\2\2\u01b4\u0170\3\2"+
		"\2\2\u01b4\u0175\3\2\2\2\u01b4\u017c\3\2\2\2\u01b4\u0181\3\2\2\2\u01b4"+
		"\u0186\3\2\2\2\u01b4\u018b\3\2\2\2\u01b4\u0190\3\2\2\2\u01b4\u0193\3\2"+
		"\2\2\u01b4\u019a\3\2\2\2\u01b4\u019d\3\2\2\2\u01b4\u01a4\3\2\2\2\u01b4"+
		"\u01ab\3\2\2\2\u01b5-\3\2\2\2\u01b6\u01b7\7+\2\2\u01b7\u01b8\5(\25\2\u01b8"+
		"\u01b9\7-\2\2\u01b9\u01ba\5$\23\2\u01ba\u01c3\3\2\2\2\u01bb\u01bc\7+\2"+
		"\2\u01bc\u01bd\5(\25\2\u01bd\u01be\7-\2\2\u01be\u01bf\5$\23\2\u01bf\u01c0"+
		"\7,\2\2\u01c0\u01c1\5$\23\2\u01c1\u01c3\3\2\2\2\u01c2\u01b6\3\2\2\2\u01c2"+
		"\u01bb\3\2\2\2\u01c3/\3\2\2\2\u01c4\u01c9\7X\2\2\u01c5\u01c6\7\16\2\2"+
		"\u01c6\u01c8\7X\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7"+
		"\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\61\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc"+
		"\u01cd\t\7\2\2\u01cd\63\3\2\2\2\u01ce\u01cf\7#\2\2\u01cf\u01d0\7\4\2\2"+
		"\u01d0\65\3\2\2\2\36@GOT_bgkt\u008b\u009d\u00a5\u00ab\u00af\u00bb\u00c3"+
		"\u00ca\u00d2\u00e2\u00f0\u00f5\u0116\u011f\u012b\u0130\u01b4\u01c2\u01c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}