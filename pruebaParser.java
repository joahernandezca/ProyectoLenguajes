// Generated from prueba.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pruebaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, O=2, Y=3, THEN=4, EQUAL=5, DIFFERENT=6, GREATER=7, MINOR=8, 
		GREATER_THAN=9, MINOR_THAN=10, ADD=11, MINUS=12, MULT=13, DIV=14, MOD=15, 
		EXP=16, NOT=17, RETURN=18, INT=19, DOUBLE=20, STRING=21, BOOL=22, SEMICOLON=23, 
		ASSING=24, LF_PAREN=25, RG_PAREN=26, LF_BRACE=27, RG_BRACE=28, LF_SPARE=29, 
		RG_SPARE=30, COMMA=31, TWO_POINTS=32, TRUE=33, FALSE=34, NULL=35, IF=36, 
		ELSE=37, WHILE=38, BREAK=39, DO=40, FOR=41, ID=42, INTEGER=43, REAL=44, 
		WS=45, OTHER=46, SIM_DIF=47, UNION=48, INTERSETION=49, DIFFERENCE=50, 
		CARTESIAN=51, IN=52, NOTIN=53, WITHIN=54, NOTWITHIN=55, SELECCIONAR=56, 
		CASO=57, DEFECTO=58, DEF=59;
	public static final int
		RULE_list_of_ids = 0, RULE_simple_exp = 1, RULE_expression = 2, RULE_variable = 3, 
		RULE_term = 4, RULE_factor = 5, RULE_param_list = 6, RULE_set = 7, RULE_type = 8, 
		RULE_bloq = 9, RULE_propot_sec = 10, RULE_propot = 11, RULE_assigment = 12, 
		RULE_if_sent = 13, RULE_cond_bloq = 14, RULE_while_sent = 15, RULE_do_while_sent = 16, 
		RULE_seleccionar_senten = 17, RULE_casos = 18, RULE_for = 19, RULE_funct_sent = 20, 
		RULE_proc_sent = 21, RULE_funcion = 22;
	public static final String[] ruleNames = {
		"list_of_ids", "simple_exp", "expression", "variable", "term", "factor", 
		"param_list", "set", "type", "bloq", "propot_sec", "propot", "assigment", 
		"if_sent", "cond_bloq", "while_sent", "do_while_sent", "seleccionar_senten", 
		"casos", "for", "funct_sent", "proc_sent", "funcion"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'||'", "'&&'", "'then'", "'=='", "'!='", "'>'", "'<'", "'>='", 
		"'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'return'", "'int'", 
		"'double'", "'string'", "'boolean'", "';'", "'='", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "','", "':'", "'true'", "'false'", "'nnul'", "'if'", 
		"'else'", "'while'", "'break'", "'do'", "'for'", null, "'[0-9]+'", null, 
		"'[ \t\r\n] -> skip'", null, "'simdif'", "'union'", "'intersec'", "'dif'", 
		"'cart'", "'in'", "'notin'", "'within'", "'notwithin'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "O", "Y", "THEN", "EQUAL", "DIFFERENT", "GREATER", "MINOR", 
		"GREATER_THAN", "MINOR_THAN", "ADD", "MINUS", "MULT", "DIV", "MOD", "EXP", 
		"NOT", "RETURN", "INT", "DOUBLE", "STRING", "BOOL", "SEMICOLON", "ASSING", 
		"LF_PAREN", "RG_PAREN", "LF_BRACE", "RG_BRACE", "LF_SPARE", "RG_SPARE", 
		"COMMA", "TWO_POINTS", "TRUE", "FALSE", "NULL", "IF", "ELSE", "WHILE", 
		"BREAK", "DO", "FOR", "ID", "INTEGER", "REAL", "WS", "OTHER", "SIM_DIF", 
		"UNION", "INTERSETION", "DIFFERENCE", "CARTESIAN", "IN", "NOTIN", "WITHIN", 
		"NOTWITHIN", "SELECCIONAR", "CASO", "DEFECTO", "DEF"
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
	public String getGrammarFileName() { return "prueba.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pruebaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class List_of_idsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pruebaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pruebaParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pruebaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pruebaParser.COMMA, i);
		}
		public List_of_idsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_of_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterList_of_ids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitList_of_ids(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitList_of_ids(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_of_idsContext list_of_ids() throws RecognitionException {
		List_of_idsContext _localctx = new List_of_idsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_list_of_ids);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(ID);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(47);
					match(COMMA);
					setState(48);
					match(ID);
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RG_PAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Simple_expContext extends ParserRuleContext {
		public Token op;
		public Token op2;
		public TerminalNode LF_PAREN() { return getToken(pruebaParser.LF_PAREN, 0); }
		public Simple_expContext simple_exp() {
			return getRuleContext(Simple_expContext.class,0);
		}
		public TerminalNode RG_PAREN() { return getToken(pruebaParser.RG_PAREN, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(pruebaParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(pruebaParser.ADD, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(pruebaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(pruebaParser.MINUS, i);
		}
		public List<TerminalNode> O() { return getTokens(pruebaParser.O); }
		public TerminalNode O(int i) {
			return getToken(pruebaParser.O, i);
		}
		public Simple_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterSimple_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitSimple_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSimple_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expContext simple_exp() throws RecognitionException {
		Simple_expContext _localctx = new Simple_expContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simple_exp);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(LF_PAREN);
				setState(58);
				simple_exp();
				setState(59);
				match(RG_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==MINUS) {
					{
					setState(61);
					((Simple_expContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==MINUS) ) {
						((Simple_expContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(64);
				term();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << ADD) | (1L << MINUS))) != 0)) {
					{
					{
					setState(65);
					((Simple_expContext)_localctx).op2 = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << ADD) | (1L << MINUS))) != 0)) ) {
						((Simple_expContext)_localctx).op2 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(66);
					term();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				term();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LF_PAREN() { return getToken(pruebaParser.LF_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RG_PAREN() { return getToken(pruebaParser.RG_PAREN, 0); }
		public List<Simple_expContext> simple_exp() {
			return getRuleContexts(Simple_expContext.class);
		}
		public Simple_expContext simple_exp(int i) {
			return getRuleContext(Simple_expContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(pruebaParser.EQUAL, 0); }
		public TerminalNode DIFFERENT() { return getToken(pruebaParser.DIFFERENT, 0); }
		public TerminalNode MINOR_THAN() { return getToken(pruebaParser.MINOR_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(pruebaParser.GREATER_THAN, 0); }
		public TerminalNode MINOR() { return getToken(pruebaParser.MINOR, 0); }
		public TerminalNode GREATER() { return getToken(pruebaParser.GREATER, 0); }
		public TerminalNode NOT() { return getToken(pruebaParser.NOT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(LF_PAREN);
				setState(76);
				expression();
				setState(77);
				match(RG_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				simple_exp();
				setState(80);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << DIFFERENT) | (1L << GREATER) | (1L << MINOR) | (1L << GREATER_THAN) | (1L << MINOR_THAN))) != 0)) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(81);
				simple_exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(LF_PAREN);
				setState(84);
				simple_exp();
				setState(85);
				match(RG_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				simple_exp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				match(NOT);
				setState(89);
				expression();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(ID);
				setState(93);
				set();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(ID);
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

	public static class TermContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LF_PAREN() { return getToken(pruebaParser.LF_PAREN, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode RG_PAREN() { return getToken(pruebaParser.RG_PAREN, 0); }
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(pruebaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(pruebaParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(pruebaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(pruebaParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(pruebaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(pruebaParser.MOD, i);
		}
		public List<TerminalNode> Y() { return getTokens(pruebaParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(pruebaParser.Y, i);
		}
		public List<TerminalNode> O() { return getTokens(pruebaParser.O); }
		public TerminalNode O(int i) {
			return getToken(pruebaParser.O, i);
		}
		public List<TerminalNode> EXP() { return getTokens(pruebaParser.EXP); }
		public TerminalNode EXP(int i) {
			return getToken(pruebaParser.EXP, i);
		}
		public TerminalNode NOT() { return getToken(pruebaParser.NOT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		int _la;
		try {
			int _alt;
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(LF_PAREN);
				setState(98);
				term();
				setState(99);
				match(RG_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				factor();
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(102);
						((TermContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << Y) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << EXP))) != 0)) ) {
							((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						factor();
						}
						} 
					}
					setState(108);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(NOT);
				setState(110);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(pruebaParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(pruebaParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(pruebaParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(pruebaParser.NULL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public List<TerminalNode> LF_SPARE() { return getTokens(pruebaParser.LF_SPARE); }
		public TerminalNode LF_SPARE(int i) {
			return getToken(pruebaParser.LF_SPARE, i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> RG_SPARE() { return getTokens(pruebaParser.RG_SPARE); }
		public TerminalNode RG_SPARE(int i) {
			return getToken(pruebaParser.RG_SPARE, i);
		}
		public TerminalNode NOT() { return getToken(pruebaParser.NOT, 0); }
		public TerminalNode TRUE() { return getToken(pruebaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(pruebaParser.FALSE, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode LF_PAREN() { return getToken(pruebaParser.LF_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RG_PAREN() { return getToken(pruebaParser.RG_PAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factor);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				match(ID);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LF_PAREN) {
					{
					setState(120);
					param_list();
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				match(ID);
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					match(LF_SPARE);
					setState(125);
					factor();
					setState(126);
					match(RG_SPARE);
					}
					}
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LF_SPARE );
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(132);
				match(ID);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(133);
				match(NOT);
				setState(134);
				factor();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(135);
				match(TRUE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(136);
				match(FALSE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(137);
				set();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(138);
				match(LF_PAREN);
				setState(139);
				expression();
				setState(140);
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

	public static class Param_listContext extends ParserRuleContext {
		public TerminalNode LF_PAREN() { return getToken(pruebaParser.LF_PAREN, 0); }
		public TerminalNode RG_PAREN() { return getToken(pruebaParser.RG_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(pruebaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pruebaParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pruebaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pruebaParser.COMMA, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param_list);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(LF_PAREN);
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(145);
					expression();
					}
					break;
				case 2:
					{
					setState(146);
					variable();
					}
					break;
				case 3:
					{
					setState(147);
					match(ID);
					}
					break;
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(150);
					match(COMMA);
					setState(154);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(151);
						expression();
						}
						break;
					case 2:
						{
						setState(152);
						variable();
						}
						break;
					case 3:
						{
						setState(153);
						match(ID);
						}
						break;
					}
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(RG_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(LF_PAREN);
				setState(163);
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode LF_BRACE() { return getToken(pruebaParser.LF_BRACE, 0); }
		public TerminalNode RG_BRACE() { return getToken(pruebaParser.RG_BRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pruebaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pruebaParser.COMMA, i);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(LF_BRACE);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << STRING) | (1L << LF_PAREN) | (1L << LF_BRACE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << ID) | (1L << INTEGER) | (1L << REAL))) != 0)) {
				{
				setState(167);
				expression();
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(168);
					match(COMMA);
					setState(169);
					expression();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(177);
			match(RG_BRACE);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(pruebaParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(pruebaParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(pruebaParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(pruebaParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
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

	public static class BloqContext extends ParserRuleContext {
		public TerminalNode LF_BRACE() { return getToken(pruebaParser.LF_BRACE, 0); }
		public TerminalNode RG_BRACE() { return getToken(pruebaParser.RG_BRACE, 0); }
		public Propot_secContext propot_sec() {
			return getRuleContext(Propot_secContext.class,0);
		}
		public BloqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterBloq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitBloq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitBloq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqContext bloq() throws RecognitionException {
		BloqContext _localctx = new BloqContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloq);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(LF_BRACE);
				setState(182);
				match(RG_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(LF_BRACE);
				setState(184);
				propot_sec();
				setState(185);
				match(RG_BRACE);
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

	public static class Propot_secContext extends ParserRuleContext {
		public List<PropotContext> propot() {
			return getRuleContexts(PropotContext.class);
		}
		public PropotContext propot(int i) {
			return getRuleContext(PropotContext.class,i);
		}
		public Propot_secContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propot_sec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterPropot_sec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitPropot_sec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitPropot_sec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Propot_secContext propot_sec() throws RecognitionException {
		Propot_secContext _localctx = new Propot_secContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_propot_sec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					propot();
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(195);
			propot();
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

	public static class PropotContext extends ParserRuleContext {
		public Token OTHER;
		public TerminalNode RETURN() { return getToken(pruebaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(pruebaParser.SEMICOLON, 0); }
		public Funct_sentContext funct_sent() {
			return getRuleContext(Funct_sentContext.class,0);
		}
		public Proc_sentContext proc_sent() {
			return getRuleContext(Proc_sentContext.class,0);
		}
		public If_sentContext if_sent() {
			return getRuleContext(If_sentContext.class,0);
		}
		public Seleccionar_sentenContext seleccionar_senten() {
			return getRuleContext(Seleccionar_sentenContext.class,0);
		}
		public While_sentContext while_sent() {
			return getRuleContext(While_sentContext.class,0);
		}
		public ForContext for() {
			return getRuleContext(ForContext.class,0);
		}
		public Do_while_sentContext do_while_sent() {
			return getRuleContext(Do_while_sentContext.class,0);
		}
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode LF_BRACE() { return getToken(pruebaParser.LF_BRACE, 0); }
		public Propot_secContext propot_sec() {
			return getRuleContext(Propot_secContext.class,0);
		}
		public TerminalNode RG_BRACE() { return getToken(pruebaParser.RG_BRACE, 0); }
		public TerminalNode OTHER() { return getToken(pruebaParser.OTHER, 0); }
		public PropotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterPropot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitPropot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitPropot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropotContext propot() throws RecognitionException {
		PropotContext _localctx = new PropotContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_propot);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(RETURN);
				setState(198);
				expression();
				setState(199);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				funct_sent();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				proc_sent();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				if_sent();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				seleccionar_senten();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				while_sent();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				for();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				do_while_sent();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				assigment();
				setState(209);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(211);
				match(ID);
				setState(212);
				param_list();
				setState(213);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(215);
				match(LF_BRACE);
				setState(216);
				propot_sec();
				setState(217);
				match(RG_BRACE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(219);
				((PropotContext)_localctx).OTHER = match(OTHER);
				System.err.println("Caracter desconocido: " + (((PropotContext)_localctx).OTHER!=null?((PropotContext)_localctx).OTHER.getText():null));
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

	public static class AssigmentContext extends ParserRuleContext {
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
	 
		public AssigmentContext() { }
		public void copyFrom(AssigmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsigVecContext extends AssigmentContext {
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public TerminalNode ASSING() { return getToken(pruebaParser.ASSING, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public AsigVecContext(AssigmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterAsigVec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitAsigVec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitAsigVec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsigNumContext extends AssigmentContext {
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public TerminalNode ASSING() { return getToken(pruebaParser.ASSING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AsigNumContext(AssigmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterAsigNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitAsigNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitAsigNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assigment);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new AsigNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(ID);
				setState(224);
				match(ASSING);
				setState(225);
				expression();
				}
				break;
			case 2:
				_localctx = new AsigVecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(ID);
				setState(227);
				match(ASSING);
				setState(228);
				set();
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

	public static class If_sentContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(pruebaParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(pruebaParser.IF, i);
		}
		public List<Cond_bloqContext> cond_bloq() {
			return getRuleContexts(Cond_bloqContext.class);
		}
		public Cond_bloqContext cond_bloq(int i) {
			return getRuleContext(Cond_bloqContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(pruebaParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(pruebaParser.ELSE, i);
		}
		public BloqContext bloq() {
			return getRuleContext(BloqContext.class,0);
		}
		public TerminalNode THEN() { return getToken(pruebaParser.THEN, 0); }
		public If_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterIf_sent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitIf_sent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitIf_sent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_sentContext if_sent() throws RecognitionException {
		If_sentContext _localctx = new If_sentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_sent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(IF);
			setState(232);
			cond_bloq();
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					match(ELSE);
					setState(234);
					match(IF);
					setState(235);
					cond_bloq();
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(241);
				match(ELSE);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(242);
					match(THEN);
					}
				}

				setState(245);
				bloq();
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

	public static class Cond_bloqContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BloqContext bloq() {
			return getRuleContext(BloqContext.class,0);
		}
		public TerminalNode THEN() { return getToken(pruebaParser.THEN, 0); }
		public Cond_bloqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_bloq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterCond_bloq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitCond_bloq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitCond_bloq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_bloqContext cond_bloq() throws RecognitionException {
		Cond_bloqContext _localctx = new Cond_bloqContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cond_bloq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			expression();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(249);
				match(THEN);
				}
			}

			setState(252);
			bloq();
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

	public static class While_sentContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(pruebaParser.WHILE, 0); }
		public Cond_bloqContext cond_bloq() {
			return getRuleContext(Cond_bloqContext.class,0);
		}
		public While_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterWhile_sent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitWhile_sent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitWhile_sent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_sentContext while_sent() throws RecognitionException {
		While_sentContext _localctx = new While_sentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_sent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(WHILE);
			setState(255);
			cond_bloq();
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

	public static class Do_while_sentContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(pruebaParser.DO, 0); }
		public BloqContext bloq() {
			return getRuleContext(BloqContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(pruebaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_while_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterDo_while_sent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitDo_while_sent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitDo_while_sent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_sentContext do_while_sent() throws RecognitionException {
		Do_while_sentContext _localctx = new Do_while_sentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_do_while_sent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(DO);
			setState(258);
			bloq();
			setState(259);
			match(WHILE);
			setState(260);
			expression();
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

	public static class Seleccionar_sentenContext extends ParserRuleContext {
		public TerminalNode SELECCIONAR() { return getToken(pruebaParser.SELECCIONAR, 0); }
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public TerminalNode LF_BRACE() { return getToken(pruebaParser.LF_BRACE, 0); }
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public TerminalNode RG_BRACE() { return getToken(pruebaParser.RG_BRACE, 0); }
		public Seleccionar_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccionar_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterSeleccionar_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitSeleccionar_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSeleccionar_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Seleccionar_sentenContext seleccionar_senten() throws RecognitionException {
		Seleccionar_sentenContext _localctx = new Seleccionar_sentenContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_seleccionar_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(SELECCIONAR);
			setState(263);
			match(ID);
			setState(264);
			match(LF_BRACE);
			setState(265);
			casos();
			setState(266);
			match(RG_BRACE);
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

	public static class CasosContext extends ParserRuleContext {
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos; }
	 
		public CasosContext() { }
		public void copyFrom(CasosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CasosDefContext extends CasosContext {
		public TerminalNode DEFECTO() { return getToken(pruebaParser.DEFECTO, 0); }
		public TerminalNode TWO_POINTS() { return getToken(pruebaParser.TWO_POINTS, 0); }
		public Propot_secContext propot_sec() {
			return getRuleContext(Propot_secContext.class,0);
		}
		public CasosDefContext(CasosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterCasosDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitCasosDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitCasosDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CasosGenContext extends CasosContext {
		public TerminalNode CASO() { return getToken(pruebaParser.CASO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TWO_POINTS() { return getToken(pruebaParser.TWO_POINTS, 0); }
		public Propot_secContext propot_sec() {
			return getRuleContext(Propot_secContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(pruebaParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(pruebaParser.SEMICOLON, 0); }
		public CasosGenContext(CasosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterCasosGen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitCasosGen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitCasosGen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_casos);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASO:
				_localctx = new CasosGenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(CASO);
				setState(269);
				expression();
				setState(270);
				match(TWO_POINTS);
				setState(271);
				propot_sec();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(272);
					match(BREAK);
					setState(273);
					match(SEMICOLON);
					}
				}

				setState(276);
				casos();
				}
				break;
			case DEFECTO:
				_localctx = new CasosDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(DEFECTO);
				setState(279);
				match(TWO_POINTS);
				setState(280);
				propot_sec();
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

	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(pruebaParser.FOR, 0); }
		public List<AssigmentContext> assigment() {
			return getRuleContexts(AssigmentContext.class);
		}
		public AssigmentContext assigment(int i) {
			return getRuleContext(AssigmentContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(pruebaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(pruebaParser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BloqContext bloq() {
			return getRuleContext(BloqContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(pruebaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pruebaParser.COMMA, i);
		}
		public TerminalNode LF_PAREN() { return getToken(pruebaParser.LF_PAREN, 0); }
		public TerminalNode RG_PAREN() { return getToken(pruebaParser.RG_PAREN, 0); }
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for);
		int _la;
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(FOR);
				setState(284);
				assigment();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(285);
					match(COMMA);
					setState(286);
					assigment();
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(292);
				match(SEMICOLON);
				setState(293);
				expression();
				setState(294);
				match(SEMICOLON);
				setState(295);
				assigment();
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(296);
					match(COMMA);
					setState(297);
					assigment();
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(303);
				bloq();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(FOR);
				setState(306);
				match(LF_PAREN);
				setState(307);
				assigment();
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(308);
					match(COMMA);
					setState(309);
					assigment();
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(315);
				match(SEMICOLON);
				setState(316);
				expression();
				setState(317);
				match(SEMICOLON);
				setState(318);
				assigment();
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(319);
					match(COMMA);
					setState(320);
					assigment();
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(326);
				match(RG_PAREN);
				setState(327);
				bloq();
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

	public static class Funct_sentContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(pruebaParser.DEF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public TerminalNode LF_PAREN() { return getToken(pruebaParser.LF_PAREN, 0); }
		public List_of_idsContext list_of_ids() {
			return getRuleContext(List_of_idsContext.class,0);
		}
		public TerminalNode RG_PAREN() { return getToken(pruebaParser.RG_PAREN, 0); }
		public BloqContext bloq() {
			return getRuleContext(BloqContext.class,0);
		}
		public Funct_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funct_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterFunct_sent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitFunct_sent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitFunct_sent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funct_sentContext funct_sent() throws RecognitionException {
		Funct_sentContext _localctx = new Funct_sentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funct_sent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(DEF);
			setState(332);
			type();
			setState(333);
			match(ID);
			setState(334);
			match(LF_PAREN);
			setState(335);
			list_of_ids();
			setState(336);
			match(RG_PAREN);
			setState(337);
			bloq();
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

	public static class Proc_sentContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(pruebaParser.DEF, 0); }
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public TerminalNode LF_PAREN() { return getToken(pruebaParser.LF_PAREN, 0); }
		public List_of_idsContext list_of_ids() {
			return getRuleContext(List_of_idsContext.class,0);
		}
		public TerminalNode RG_PAREN() { return getToken(pruebaParser.RG_PAREN, 0); }
		public BloqContext bloq() {
			return getRuleContext(BloqContext.class,0);
		}
		public Proc_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterProc_sent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitProc_sent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitProc_sent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_sentContext proc_sent() throws RecognitionException {
		Proc_sentContext _localctx = new Proc_sentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_proc_sent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(DEF);
			setState(340);
			match(ID);
			setState(341);
			match(LF_PAREN);
			setState(342);
			list_of_ids();
			setState(343);
			match(RG_PAREN);
			setState(344);
			bloq();
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode LF_BRACE() { return getToken(pruebaParser.LF_BRACE, 0); }
		public Propot_secContext propot_sec() {
			return getRuleContext(Propot_secContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(pruebaParser.SEMICOLON, 0); }
		public TerminalNode RG_BRACE() { return getToken(pruebaParser.RG_BRACE, 0); }
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pruebaListener ) ((pruebaListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(LF_BRACE);
			setState(347);
			propot_sec();
			setState(348);
			match(SEMICOLON);
			setState(349);
			match(RG_BRACE);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0162\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\5\2:\n\2\3\3\3\3\3\3\3\3\3\3\5\3A\n"+
		"\3\3\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4]\n\4\3\5\3\5\3\5\5\5b\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6\3\6\3\6\5\6"+
		"s\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7|\n\7\3\7\3\7\3\7\3\7\3\7\6\7\u0083"+
		"\n\7\r\7\16\7\u0084\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0091"+
		"\n\7\3\b\3\b\3\b\3\b\5\b\u0097\n\b\3\b\3\b\3\b\3\b\5\b\u009d\n\b\7\b\u009f"+
		"\n\b\f\b\16\b\u00a2\13\b\3\b\3\b\3\b\5\b\u00a7\n\b\3\t\3\t\3\t\3\t\7\t"+
		"\u00ad\n\t\f\t\16\t\u00b0\13\t\5\t\u00b2\n\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00be\n\13\3\f\7\f\u00c1\n\f\f\f\16\f\u00c4"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e0\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00e8\n\16\3\17\3\17\3\17\3\17\3\17\7\17\u00ef\n"+
		"\17\f\17\16\17\u00f2\13\17\3\17\3\17\5\17\u00f6\n\17\3\17\5\17\u00f9\n"+
		"\17\3\20\3\20\5\20\u00fd\n\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0115\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u011c\n\24\3\25\3\25\3"+
		"\25\3\25\7\25\u0122\n\25\f\25\16\25\u0125\13\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\7\25\u012d\n\25\f\25\16\25\u0130\13\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\7\25\u0139\n\25\f\25\16\25\u013c\13\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\7\25\u0144\n\25\f\25\16\25\u0147\13\25\3\25\3\25\3\25\5"+
		"\25\u014c\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\7\3\2\r\16\4\2\4\4\r\16\3\2\7\f"+
		"\4\2\4\5\17\22\3\2\25\30\2\u0188\29\3\2\2\2\4K\3\2\2\2\6\\\3\2\2\2\ba"+
		"\3\2\2\2\nr\3\2\2\2\f\u0090\3\2\2\2\16\u00a6\3\2\2\2\20\u00a8\3\2\2\2"+
		"\22\u00b5\3\2\2\2\24\u00bd\3\2\2\2\26\u00c2\3\2\2\2\30\u00df\3\2\2\2\32"+
		"\u00e7\3\2\2\2\34\u00e9\3\2\2\2\36\u00fa\3\2\2\2 \u0100\3\2\2\2\"\u0103"+
		"\3\2\2\2$\u0108\3\2\2\2&\u011b\3\2\2\2(\u014b\3\2\2\2*\u014d\3\2\2\2,"+
		"\u0155\3\2\2\2.\u015c\3\2\2\2\60\65\7,\2\2\61\62\7!\2\2\62\64\7,\2\2\63"+
		"\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66:\3\2\2\2\67\65"+
		"\3\2\2\28:\3\2\2\29\60\3\2\2\298\3\2\2\2:\3\3\2\2\2;<\7\33\2\2<=\5\4\3"+
		"\2=>\7\34\2\2>L\3\2\2\2?A\t\2\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BG\5\n"+
		"\6\2CD\t\3\2\2DF\5\n\6\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HL\3\2"+
		"\2\2IG\3\2\2\2JL\5\n\6\2K;\3\2\2\2K@\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2MN\7"+
		"\33\2\2NO\5\6\4\2OP\7\34\2\2P]\3\2\2\2QR\5\4\3\2RS\t\4\2\2ST\5\4\3\2T"+
		"]\3\2\2\2UV\7\33\2\2VW\5\4\3\2WX\7\34\2\2X]\3\2\2\2Y]\5\4\3\2Z[\7\23\2"+
		"\2[]\5\6\4\2\\M\3\2\2\2\\Q\3\2\2\2\\U\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2]\7"+
		"\3\2\2\2^_\7,\2\2_b\5\20\t\2`b\7,\2\2a^\3\2\2\2a`\3\2\2\2b\t\3\2\2\2c"+
		"d\7\33\2\2de\5\n\6\2ef\7\34\2\2fs\3\2\2\2gl\5\f\7\2hi\t\5\2\2ik\5\f\7"+
		"\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2ms\3\2\2\2nl\3\2\2\2op\7\23"+
		"\2\2ps\5\n\6\2qs\5\f\7\2rc\3\2\2\2rg\3\2\2\2ro\3\2\2\2rq\3\2\2\2s\13\3"+
		"\2\2\2t\u0091\7-\2\2u\u0091\7.\2\2v\u0091\7\27\2\2w\u0091\7%\2\2x\u0091"+
		"\5\b\5\2y{\7,\2\2z|\5\16\b\2{z\3\2\2\2{|\3\2\2\2|\u0091\3\2\2\2}\u0082"+
		"\7,\2\2~\177\7\37\2\2\177\u0080\5\f\7\2\u0080\u0081\7 \2\2\u0081\u0083"+
		"\3\2\2\2\u0082~\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0091\3\2\2\2\u0086\u0091\7,\2\2\u0087\u0088\7\23"+
		"\2\2\u0088\u0091\5\f\7\2\u0089\u0091\7#\2\2\u008a\u0091\7$\2\2\u008b\u0091"+
		"\5\20\t\2\u008c\u008d\7\33\2\2\u008d\u008e\5\6\4\2\u008e\u008f\7\34\2"+
		"\2\u008f\u0091\3\2\2\2\u0090t\3\2\2\2\u0090u\3\2\2\2\u0090v\3\2\2\2\u0090"+
		"w\3\2\2\2\u0090x\3\2\2\2\u0090y\3\2\2\2\u0090}\3\2\2\2\u0090\u0086\3\2"+
		"\2\2\u0090\u0087\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008a\3\2\2\2\u0090"+
		"\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0091\r\3\2\2\2\u0092\u0096\7\33\2"+
		"\2\u0093\u0097\5\6\4\2\u0094\u0097\5\b\5\2\u0095\u0097\7,\2\2\u0096\u0093"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u00a0\3\2\2\2\u0098"+
		"\u009c\7!\2\2\u0099\u009d\5\6\4\2\u009a\u009d\5\b\5\2\u009b\u009d\7,\2"+
		"\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u009f"+
		"\3\2\2\2\u009e\u0098\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a7\7\34"+
		"\2\2\u00a4\u00a5\7\33\2\2\u00a5\u00a7\7\34\2\2\u00a6\u0092\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\17\3\2\2\2\u00a8\u00b1\7\35\2\2\u00a9\u00ae\5\6\4"+
		"\2\u00aa\u00ab\7!\2\2\u00ab\u00ad\5\6\4\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b4\7\36\2\2\u00b4\21\3\2\2\2\u00b5\u00b6\t\6\2\2\u00b6\23"+
		"\3\2\2\2\u00b7\u00b8\7\35\2\2\u00b8\u00be\7\36\2\2\u00b9\u00ba\7\35\2"+
		"\2\u00ba\u00bb\5\26\f\2\u00bb\u00bc\7\36\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00b7\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be\25\3\2\2\2\u00bf\u00c1\5\30\r"+
		"\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\5\30\r\2"+
		"\u00c6\27\3\2\2\2\u00c7\u00c8\7\24\2\2\u00c8\u00c9\5\6\4\2\u00c9\u00ca"+
		"\7\31\2\2\u00ca\u00e0\3\2\2\2\u00cb\u00e0\5*\26\2\u00cc\u00e0\5,\27\2"+
		"\u00cd\u00e0\5\34\17\2\u00ce\u00e0\5$\23\2\u00cf\u00e0\5 \21\2\u00d0\u00e0"+
		"\5(\25\2\u00d1\u00e0\5\"\22\2\u00d2\u00d3\5\32\16\2\u00d3\u00d4\7\31\2"+
		"\2\u00d4\u00e0\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6\u00d7\5\16\b\2\u00d7\u00d8"+
		"\7\31\2\2\u00d8\u00e0\3\2\2\2\u00d9\u00da\7\35\2\2\u00da\u00db\5\26\f"+
		"\2\u00db\u00dc\7\36\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00de\7\60\2\2\u00de"+
		"\u00e0\b\r\1\2\u00df\u00c7\3\2\2\2\u00df\u00cb\3\2\2\2\u00df\u00cc\3\2"+
		"\2\2\u00df\u00cd\3\2\2\2\u00df\u00ce\3\2\2\2\u00df\u00cf\3\2\2\2\u00df"+
		"\u00d0\3\2\2\2\u00df\u00d1\3\2\2\2\u00df\u00d2\3\2\2\2\u00df\u00d5\3\2"+
		"\2\2\u00df\u00d9\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\31\3\2\2\2\u00e1\u00e2"+
		"\7,\2\2\u00e2\u00e3\7\32\2\2\u00e3\u00e8\5\6\4\2\u00e4\u00e5\7,\2\2\u00e5"+
		"\u00e6\7\32\2\2\u00e6\u00e8\5\20\t\2\u00e7\u00e1\3\2\2\2\u00e7\u00e4\3"+
		"\2\2\2\u00e8\33\3\2\2\2\u00e9\u00ea\7&\2\2\u00ea\u00f0\5\36\20\2\u00eb"+
		"\u00ec\7\'\2\2\u00ec\u00ed\7&\2\2\u00ed\u00ef\5\36\20\2\u00ee\u00eb\3"+
		"\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f8\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\7\'\2\2\u00f4\u00f6\7\6"+
		"\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\5\24\13\2\u00f8\u00f3\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\35\3\2"+
		"\2\2\u00fa\u00fc\5\6\4\2\u00fb\u00fd\7\6\2\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\5\24\13\2\u00ff\37\3\2"+
		"\2\2\u0100\u0101\7(\2\2\u0101\u0102\5\36\20\2\u0102!\3\2\2\2\u0103\u0104"+
		"\7*\2\2\u0104\u0105\5\24\13\2\u0105\u0106\7(\2\2\u0106\u0107\5\6\4\2\u0107"+
		"#\3\2\2\2\u0108\u0109\7:\2\2\u0109\u010a\7,\2\2\u010a\u010b\7\35\2\2\u010b"+
		"\u010c\5&\24\2\u010c\u010d\7\36\2\2\u010d%\3\2\2\2\u010e\u010f\7;\2\2"+
		"\u010f\u0110\5\6\4\2\u0110\u0111\7\"\2\2\u0111\u0114\5\26\f\2\u0112\u0113"+
		"\7)\2\2\u0113\u0115\7\31\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\5&\24\2\u0117\u011c\3\2\2\2\u0118\u0119\7<"+
		"\2\2\u0119\u011a\7\"\2\2\u011a\u011c\5\26\f\2\u011b\u010e\3\2\2\2\u011b"+
		"\u0118\3\2\2\2\u011c\'\3\2\2\2\u011d\u011e\7+\2\2\u011e\u0123\5\32\16"+
		"\2\u011f\u0120\7!\2\2\u0120\u0122\5\32\16\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\31\2\2\u0127\u0128\5\6\4\2\u0128"+
		"\u0129\7\31\2\2\u0129\u012e\5\32\16\2\u012a\u012b\7!\2\2\u012b\u012d\5"+
		"\32\16\2\u012c\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\5\24"+
		"\13\2\u0132\u014c\3\2\2\2\u0133\u0134\7+\2\2\u0134\u0135\7\33\2\2\u0135"+
		"\u013a\5\32\16\2\u0136\u0137\7!\2\2\u0137\u0139\5\32\16\2\u0138\u0136"+
		"\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7\31\2\2\u013e\u013f\5"+
		"\6\4\2\u013f\u0140\7\31\2\2\u0140\u0145\5\32\16\2\u0141\u0142\7!\2\2\u0142"+
		"\u0144\5\32\16\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3"+
		"\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u0149\7\34\2\2\u0149\u014a\5\24\13\2\u014a\u014c\3\2\2\2\u014b\u011d"+
		"\3\2\2\2\u014b\u0133\3\2\2\2\u014c)\3\2\2\2\u014d\u014e\7=\2\2\u014e\u014f"+
		"\5\22\n\2\u014f\u0150\7,\2\2\u0150\u0151\7\33\2\2\u0151\u0152\5\2\2\2"+
		"\u0152\u0153\7\34\2\2\u0153\u0154\5\24\13\2\u0154+\3\2\2\2\u0155\u0156"+
		"\7=\2\2\u0156\u0157\7,\2\2\u0157\u0158\7\33\2\2\u0158\u0159\5\2\2\2\u0159"+
		"\u015a\7\34\2\2\u015a\u015b\5\24\13\2\u015b-\3\2\2\2\u015c\u015d\7\35"+
		"\2\2\u015d\u015e\5\26\f\2\u015e\u015f\7\31\2\2\u015f\u0160\7\36\2\2\u0160"+
		"/\3\2\2\2#\659@GK\\alr{\u0084\u0090\u0096\u009c\u00a0\u00a6\u00ae\u00b1"+
		"\u00bd\u00c2\u00df\u00e7\u00f0\u00f5\u00f8\u00fc\u0114\u011b\u0123\u012e"+
		"\u013a\u0145\u014b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}