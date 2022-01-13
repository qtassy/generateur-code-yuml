package yuml.generated;

// Generated from Yuml.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YumlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, STRING=20, INTEGER=21, WS=22;
	public static final String[] tokenNames = {
		"<INVALID>", "'):'", "':'", "';'", "'['", "'|'", "'..'", "'<'", "'++'", 
		"']'", "'>'", "'^'", "'<>'", "'#'", "'('", "')'", "'*'", "'+'", "','", 
		"'-'", "STRING", "INTEGER", "WS"
	};
	public static final int
		RULE_yuml = 0, RULE_line = 1, RULE_box = 2, RULE_role = 3, RULE_connection = 4, 
		RULE_end = 5, RULE_card = 6, RULE_nb = 7, RULE_yclass = 8, RULE_yclassname = 9, 
		RULE_listyattributes = 10, RULE_yattributes = 11, RULE_listymethods = 12, 
		RULE_ymethod = 13, RULE_listyparameters = 14, RULE_yparameter = 15, RULE_string = 16, 
		RULE_visibilite = 17;
	public static final String[] ruleNames = {
		"yuml", "line", "box", "role", "connection", "end", "card", "nb", "yclass", 
		"yclassname", "listyattributes", "yattributes", "listymethods", "ymethod", 
		"listyparameters", "yparameter", "string", "visibilite"
	};

	@Override
	public String getGrammarFileName() { return "Yuml.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YumlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class YumlContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public YumlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yuml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterYuml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitYuml(this);
		}
	}

	public final YumlContext yuml() throws RecognitionException {
		YumlContext _localctx = new YumlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_yuml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36); line();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
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

	public static class LineContext extends ParserRuleContext {
		public BoxContext box() {
			return getRuleContext(BoxContext.class,0);
		}
		public ConnectionContext connection() {
			return getRuleContext(ConnectionContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(43);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); box();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); connection();
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

	public static class BoxContext extends ParserRuleContext {
		public YclassContext yclass() {
			return getRuleContext(YclassContext.class,0);
		}
		public BoxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_box; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitBox(this);
		}
	}

	public final BoxContext box() throws RecognitionException {
		BoxContext _localctx = new BoxContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_box);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(T__15);
			setState(46); yclass();
			setState(47); match(T__10);
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

	public static class RoleContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitRole(this);
		}
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_role);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); string();
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

	public static class ConnectionContext extends ParserRuleContext {
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public List<RoleContext> role() {
			return getRuleContexts(RoleContext.class);
		}
		public BoxContext box(int i) {
			return getRuleContext(BoxContext.class,i);
		}
		public List<CardContext> card() {
			return getRuleContexts(CardContext.class);
		}
		public List<BoxContext> box() {
			return getRuleContexts(BoxContext.class);
		}
		public RoleContext role(int i) {
			return getRuleContext(RoleContext.class,i);
		}
		public CardContext card(int i) {
			return getRuleContext(CardContext.class,i);
		}
		public ConnectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterConnection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitConnection(this);
		}
	}

	public final ConnectionContext connection() throws RecognitionException {
		ConnectionContext _localctx = new ConnectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_connection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); box();
			setState(53);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__11) | (1L << T__9) | (1L << T__8) | (1L << T__7))) != 0)) {
				{
				setState(52); end();
				}
			}

			setState(55); card();
			setState(57);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(56); role();
				}
			}

			setState(59); match(T__0);
			setState(61);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(60); role();
				}
			}

			setState(63); card();
			setState(65);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__11) | (1L << T__9) | (1L << T__8) | (1L << T__7))) != 0)) {
				{
				setState(64); end();
				}
			}

			setState(67); box();
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

	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__11) | (1L << T__9) | (1L << T__8) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CardContext extends ParserRuleContext {
		public List<NbContext> nb() {
			return getRuleContexts(NbContext.class);
		}
		public NbContext nb(int i) {
			return getRuleContext(NbContext.class,i);
		}
		public CardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitCard(this);
		}
	}

	public final CardContext card() throws RecognitionException {
		CardContext _localctx = new CardContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_card);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(71); nb();
				}
				break;
			case T__3:
				{
				setState(72); match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(80);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(75); match(T__13);
				setState(78);
				switch (_input.LA(1)) {
				case INTEGER:
					{
					setState(76); nb();
					}
					break;
				case T__3:
					{
					setState(77); match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class NbContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(YumlParser.INTEGER, 0); }
		public NbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterNb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitNb(this);
		}
	}

	public final NbContext nb() throws RecognitionException {
		NbContext _localctx = new NbContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(INTEGER);
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

	public static class YclassContext extends ParserRuleContext {
		public ListyattributesContext listyattributes() {
			return getRuleContext(ListyattributesContext.class,0);
		}
		public ListymethodsContext listymethods() {
			return getRuleContext(ListymethodsContext.class,0);
		}
		public YclassnameContext yclassname() {
			return getRuleContext(YclassnameContext.class,0);
		}
		public YclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterYclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitYclass(this);
		}
	}

	public final YclassContext yclass() throws RecognitionException {
		YclassContext _localctx = new YclassContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_yclass);
		try {
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); yclassname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); yclassname();
				setState(86); match(T__14);
				setState(87); listyattributes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89); yclassname();
				setState(90); match(T__14);
				setState(91); listyattributes();
				setState(92); match(T__14);
				setState(93); listymethods();
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

	public static class YclassnameContext extends ParserRuleContext {
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public VisibiliteContext visibilite() {
			return getRuleContext(VisibiliteContext.class,0);
		}
		public YclassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yclassname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterYclassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitYclassname(this);
		}
	}

	public final YclassnameContext yclassname() throws RecognitionException {
		YclassnameContext _localctx = new YclassnameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_yclassname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << T__0))) != 0)) {
				{
				setState(97); visibilite();
				}
			}

			setState(100); string();
			setState(101); match(T__5);
			setState(102); string();
			setState(103); match(T__4);
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

	public static class ListyattributesContext extends ParserRuleContext {
		public YattributesContext yattributes() {
			return getRuleContext(YattributesContext.class,0);
		}
		public ListyattributesContext listyattributes() {
			return getRuleContext(ListyattributesContext.class,0);
		}
		public ListyattributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listyattributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterListyattributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitListyattributes(this);
		}
	}

	public final ListyattributesContext listyattributes() throws RecognitionException {
		ListyattributesContext _localctx = new ListyattributesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listyattributes);
		try {
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); yattributes();
				setState(106); match(T__16);
				setState(107); listyattributes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); yattributes();
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

	public static class YattributesContext extends ParserRuleContext {
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public VisibiliteContext visibilite() {
			return getRuleContext(VisibiliteContext.class,0);
		}
		public YattributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yattributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterYattributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitYattributes(this);
		}
	}

	public final YattributesContext yattributes() throws RecognitionException {
		YattributesContext _localctx = new YattributesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_yattributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << T__0))) != 0)) {
				{
				setState(112); visibilite();
				}
			}

			setState(115); string();
			setState(116); match(T__17);
			setState(117); string();
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

	public static class ListymethodsContext extends ParserRuleContext {
		public ListymethodsContext listymethods() {
			return getRuleContext(ListymethodsContext.class,0);
		}
		public YmethodContext ymethod() {
			return getRuleContext(YmethodContext.class,0);
		}
		public ListymethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listymethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterListymethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitListymethods(this);
		}
	}

	public final ListymethodsContext listymethods() throws RecognitionException {
		ListymethodsContext _localctx = new ListymethodsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listymethods);
		try {
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); ymethod();
				setState(120); match(T__16);
				setState(121); listymethods();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); ymethod();
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

	public static class YmethodContext extends ParserRuleContext {
		public ListyparametersContext listyparameters() {
			return getRuleContext(ListyparametersContext.class,0);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public VisibiliteContext visibilite() {
			return getRuleContext(VisibiliteContext.class,0);
		}
		public YmethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ymethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterYmethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitYmethod(this);
		}
	}

	public final YmethodContext ymethod() throws RecognitionException {
		YmethodContext _localctx = new YmethodContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ymethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << T__0))) != 0)) {
				{
				setState(126); visibilite();
				}
			}

			setState(129); string();
			setState(130); match(T__5);
			setState(132);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(131); listyparameters();
				}
			}

			setState(134); match(T__18);
			setState(135); string();
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

	public static class ListyparametersContext extends ParserRuleContext {
		public ListyparametersContext listyparameters() {
			return getRuleContext(ListyparametersContext.class,0);
		}
		public YparameterContext yparameter() {
			return getRuleContext(YparameterContext.class,0);
		}
		public ListyparametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listyparameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterListyparameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitListyparameters(this);
		}
	}

	public final ListyparametersContext listyparameters() throws RecognitionException {
		ListyparametersContext _localctx = new ListyparametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listyparameters);
		try {
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); yparameter();
				setState(138); match(T__1);
				setState(139); listyparameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); yparameter();
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

	public static class YparameterContext extends ParserRuleContext {
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public YparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterYparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitYparameter(this);
		}
	}

	public final YparameterContext yparameter() throws RecognitionException {
		YparameterContext _localctx = new YparameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_yparameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); string();
			setState(145); match(T__17);
			setState(146); string();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(YumlParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(STRING);
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

	public static class VisibiliteContext extends ParserRuleContext {
		public VisibiliteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).enterVisibilite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YumlListener ) ((YumlListener)listener).exitVisibilite(this);
		}
	}

	public final VisibiliteContext visibilite() throws RecognitionException {
		VisibiliteContext _localctx = new VisibiliteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_visibilite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u009b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\5\68\n\6\3\6\3\6\5\6<\n\6\3\6\3\6\5\6@\n\6\3\6\3\6\5\6D\n"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\5\bL\n\b\3\b\3\b\3\b\5\bQ\n\b\5\bS\n\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nb\n\n\3\13\5\13e\n"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\fq\n\f\3\r\5\rt\n\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\177\n\16\3\17\5\17\u0082"+
		"\n\17\3\17\3\17\3\17\5\17\u0087\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0091\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\2\2"+
		"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\4\2\t\n\f\16\5\2\17"+
		"\17\23\23\25\25\u009a\2\'\3\2\2\2\4-\3\2\2\2\6/\3\2\2\2\b\63\3\2\2\2\n"+
		"\65\3\2\2\2\fG\3\2\2\2\16K\3\2\2\2\20T\3\2\2\2\22a\3\2\2\2\24d\3\2\2\2"+
		"\26p\3\2\2\2\30s\3\2\2\2\32~\3\2\2\2\34\u0081\3\2\2\2\36\u0090\3\2\2\2"+
		" \u0092\3\2\2\2\"\u0096\3\2\2\2$\u0098\3\2\2\2&(\5\4\3\2\'&\3\2\2\2()"+
		"\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+.\5\6\4\2,.\5\n\6\2-+\3\2\2\2"+
		"-,\3\2\2\2.\5\3\2\2\2/\60\7\6\2\2\60\61\5\22\n\2\61\62\7\13\2\2\62\7\3"+
		"\2\2\2\63\64\5\"\22\2\64\t\3\2\2\2\65\67\5\6\4\2\668\5\f\7\2\67\66\3\2"+
		"\2\2\678\3\2\2\289\3\2\2\29;\5\16\b\2:<\5\b\5\2;:\3\2\2\2;<\3\2\2\2<="+
		"\3\2\2\2=?\7\25\2\2>@\5\b\5\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AC\5\16\b\2"+
		"BD\5\f\7\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\5\6\4\2F\13\3\2\2\2GH\t\2\2"+
		"\2H\r\3\2\2\2IL\5\20\t\2JL\7\22\2\2KI\3\2\2\2KJ\3\2\2\2LR\3\2\2\2MP\7"+
		"\b\2\2NQ\5\20\t\2OQ\7\22\2\2PN\3\2\2\2PO\3\2\2\2QS\3\2\2\2RM\3\2\2\2R"+
		"S\3\2\2\2S\17\3\2\2\2TU\7\27\2\2U\21\3\2\2\2Vb\5\24\13\2WX\5\24\13\2X"+
		"Y\7\7\2\2YZ\5\26\f\2Zb\3\2\2\2[\\\5\24\13\2\\]\7\7\2\2]^\5\26\f\2^_\7"+
		"\7\2\2_`\5\32\16\2`b\3\2\2\2aV\3\2\2\2aW\3\2\2\2a[\3\2\2\2b\23\3\2\2\2"+
		"ce\5$\23\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\5\"\22\2gh\7\20\2\2hi\5\"\22"+
		"\2ij\7\21\2\2j\25\3\2\2\2kl\5\30\r\2lm\7\5\2\2mn\5\26\f\2nq\3\2\2\2oq"+
		"\5\30\r\2pk\3\2\2\2po\3\2\2\2q\27\3\2\2\2rt\5$\23\2sr\3\2\2\2st\3\2\2"+
		"\2tu\3\2\2\2uv\5\"\22\2vw\7\4\2\2wx\5\"\22\2x\31\3\2\2\2yz\5\34\17\2z"+
		"{\7\5\2\2{|\5\32\16\2|\177\3\2\2\2}\177\5\34\17\2~y\3\2\2\2~}\3\2\2\2"+
		"\177\33\3\2\2\2\u0080\u0082\5$\23\2\u0081\u0080\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\5\"\22\2\u0084\u0086\7\20\2\2\u0085"+
		"\u0087\5\36\20\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0089\7\3\2\2\u0089\u008a\5\"\22\2\u008a\35\3\2\2\2\u008b"+
		"\u008c\5 \21\2\u008c\u008d\7\24\2\2\u008d\u008e\5\36\20\2\u008e\u0091"+
		"\3\2\2\2\u008f\u0091\5 \21\2\u0090\u008b\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\37\3\2\2\2\u0092\u0093\5\"\22\2\u0093\u0094\7\4\2\2\u0094\u0095\5\"\22"+
		"\2\u0095!\3\2\2\2\u0096\u0097\7\26\2\2\u0097#\3\2\2\2\u0098\u0099\t\3"+
		"\2\2\u0099%\3\2\2\2\23)-\67;?CKPRadps~\u0081\u0086\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}