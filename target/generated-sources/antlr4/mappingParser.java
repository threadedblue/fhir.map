// Generated from mapping.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mappingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, BOOL=40, DATETIME=41, TIME=42, IDENTIFIER=43, DELIMITEDIDENTIFIER=44, 
		STRING=45, INTEGER=46, NUMBER=47, WS=48, COMMENT=49, LINE_COMMENT=50;
	public static final int
		RULE_structureMap = 0, RULE_mapId = 1, RULE_url = 2, RULE_identifier = 3, 
		RULE_structure = 4, RULE_structureAlias = 5, RULE_imports = 6, RULE_group = 7, 
		RULE_rules = 8, RULE_typeMode = 9, RULE_extends_ = 10, RULE_parameters = 11, 
		RULE_parameter = 12, RULE_type = 13, RULE_rule_ = 14, RULE_ruleName = 15, 
		RULE_ruleSources = 16, RULE_ruleSource = 17, RULE_ruleTargets = 18, RULE_sourceType = 19, 
		RULE_upperBound = 20, RULE_ruleContext = 21, RULE_sourceDefault = 22, 
		RULE_alias = 23, RULE_whereClause = 24, RULE_checkClause = 25, RULE_log = 26, 
		RULE_dependent = 27, RULE_ruleTarget = 28, RULE_transform = 29, RULE_invocation = 30, 
		RULE_paramList = 31, RULE_param = 32, RULE_fhirPath = 33, RULE_literal = 34, 
		RULE_groupTypeMode = 35, RULE_sourceListMode = 36, RULE_targetListMode = 37, 
		RULE_inputMode = 38, RULE_modelMode = 39;
	public static final String[] ruleNames = {
		"structureMap", "mapId", "url", "identifier", "structure", "structureAlias", 
		"imports", "group", "rules", "typeMode", "extends_", "parameters", "parameter", 
		"type", "rule_", "ruleName", "ruleSources", "ruleSource", "ruleTargets", 
		"sourceType", "upperBound", "ruleContext", "sourceDefault", "alias", "whereClause", 
		"checkClause", "log", "dependent", "ruleTarget", "transform", "invocation", 
		"paramList", "param", "fhirPath", "literal", "groupTypeMode", "sourceListMode", 
		"targetListMode", "inputMode", "modelMode"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'map'", "'='", "'uses'", "'as'", "'alias'", "'imports'", "'group'", 
		"'{'", "'}'", "'<<'", "'>>'", "'extends_'", "'('", "','", "')'", "':'", 
		"'->'", "';'", "'..'", "'*'", "'.'", "'default'", "'where'", "'check'", 
		"'log'", "'then'", "'types'", "'type+'", "'first'", "'not_first'", "'last'", 
		"'not_last'", "'only_one'", "'share'", "'collate'", "'source'", "'target'", 
		"'queried'", "'produced'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "BOOL", "DATETIME", "TIME", "IDENTIFIER", "DELIMITEDIDENTIFIER", 
		"STRING", "INTEGER", "NUMBER", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "mapping.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mappingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StructureMapContext extends ParserRuleContext {
		public MapIdContext mapId() {
			return getRuleContext(MapIdContext.class,0);
		}
		public TerminalNode EOF() { return getToken(mappingParser.EOF, 0); }
		public List<StructureContext> structure() {
			return getRuleContexts(StructureContext.class);
		}
		public StructureContext structure(int i) {
			return getRuleContext(StructureContext.class,i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<GroupContext> group() {
			return getRuleContexts(GroupContext.class);
		}
		public GroupContext group(int i) {
			return getRuleContext(GroupContext.class,i);
		}
		public StructureMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterStructureMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitStructureMap(this);
		}
	}

	public final StructureMapContext structureMap() throws RecognitionException {
		StructureMapContext _localctx = new StructureMapContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_structureMap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			mapId();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(81);
				structure();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(87);
				imports();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				group();
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(98);
			match(EOF);
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

	public static class MapIdContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MapIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterMapId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitMapId(this);
		}
	}

	public final MapIdContext mapId() throws RecognitionException {
		MapIdContext _localctx = new MapIdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mapId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__0);
			setState(101);
			url();
			setState(102);
			match(T__1);
			setState(103);
			identifier();
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

	public static class UrlContext extends ParserRuleContext {
		public TerminalNode DELIMITEDIDENTIFIER() { return getToken(mappingParser.DELIMITEDIDENTIFIER, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitUrl(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(DELIMITEDIDENTIFIER);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(mappingParser.IDENTIFIER, 0); }
		public TerminalNode DELIMITEDIDENTIFIER() { return getToken(mappingParser.DELIMITEDIDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==DELIMITEDIDENTIFIER) ) {
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

	public static class StructureContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public ModelModeContext modelMode() {
			return getRuleContext(ModelModeContext.class,0);
		}
		public StructureAliasContext structureAlias() {
			return getRuleContext(StructureAliasContext.class,0);
		}
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitStructure(this);
		}
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__2);
			setState(110);
			url();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(111);
				structureAlias();
				}
			}

			setState(114);
			match(T__3);
			setState(115);
			modelMode();
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

	public static class StructureAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StructureAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterStructureAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitStructureAlias(this);
		}
	}

	public final StructureAliasContext structureAlias() throws RecognitionException {
		StructureAliasContext _localctx = new StructureAliasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structureAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__4);
			setState(118);
			identifier();
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

	public static class ImportsContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitImports(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_imports);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__5);
			setState(121);
			url();
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

	public static class GroupContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public Extends_Context extends_() {
			return getRuleContext(Extends_Context.class,0);
		}
		public TypeModeContext typeMode() {
			return getRuleContext(TypeModeContext.class,0);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitGroup(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__6);
			setState(124);
			identifier();
			setState(125);
			parameters();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(126);
				extends_();
				}
			}

			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(129);
				typeMode();
				}
			}

			setState(132);
			rules();
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

	public static class RulesContext extends ParserRuleContext {
		public List<Rule_Context> rule_() {
			return getRuleContexts(Rule_Context.class);
		}
		public Rule_Context rule_(int i) {
			return getRuleContext(Rule_Context.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitRules(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__7);
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				rule_();
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER || _la==DELIMITEDIDENTIFIER );
			setState(140);
			match(T__8);
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

	public static class TypeModeContext extends ParserRuleContext {
		public GroupTypeModeContext groupTypeMode() {
			return getRuleContext(GroupTypeModeContext.class,0);
		}
		public TypeModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterTypeMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitTypeMode(this);
		}
	}

	public final TypeModeContext typeMode() throws RecognitionException {
		TypeModeContext _localctx = new TypeModeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeMode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__9);
			setState(143);
			groupTypeMode();
			setState(144);
			match(T__10);
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

	public static class Extends_Context extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Extends_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extends_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterExtends_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitExtends_(this);
		}
	}

	public final Extends_Context extends_() throws RecognitionException {
		Extends_Context _localctx = new Extends_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_extends_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__11);
			setState(147);
			identifier();
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__12);
			setState(150);
			parameter();
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				match(T__13);
				setState(152);
				parameter();
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 );
			setState(157);
			match(T__14);
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

	public static class ParameterContext extends ParserRuleContext {
		public InputModeContext inputMode() {
			return getRuleContext(InputModeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			inputMode();
			setState(160);
			identifier();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(161);
				type();
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

	public static class TypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__15);
			setState(165);
			identifier();
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

	public static class Rule_Context extends ParserRuleContext {
		public RuleSourcesContext ruleSources() {
			return getRuleContext(RuleSourcesContext.class,0);
		}
		public RuleTargetsContext ruleTargets() {
			return getRuleContext(RuleTargetsContext.class,0);
		}
		public DependentContext dependent() {
			return getRuleContext(DependentContext.class,0);
		}
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public Rule_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterRule_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitRule_(this);
		}
	}

	public final Rule_Context rule_() throws RecognitionException {
		Rule_Context _localctx = new Rule_Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_rule_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			ruleSources();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(168);
				match(T__16);
				setState(169);
				ruleTargets();
				}
			}

			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(172);
				dependent();
				}
			}

			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DELIMITEDIDENTIFIER) {
				{
				setState(175);
				ruleName();
				}
			}

			setState(178);
			match(T__17);
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

	public static class RuleNameContext extends ParserRuleContext {
		public TerminalNode DELIMITEDIDENTIFIER() { return getToken(mappingParser.DELIMITEDIDENTIFIER, 0); }
		public RuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterRuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitRuleName(this);
		}
	}

	public final RuleNameContext ruleName() throws RecognitionException {
		RuleNameContext _localctx = new RuleNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ruleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(DELIMITEDIDENTIFIER);
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

	public static class RuleSourcesContext extends ParserRuleContext {
		public List<RuleSourceContext> ruleSource() {
			return getRuleContexts(RuleSourceContext.class);
		}
		public RuleSourceContext ruleSource(int i) {
			return getRuleContext(RuleSourceContext.class,i);
		}
		public RuleSourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterRuleSources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitRuleSources(this);
		}
	}

	public final RuleSourcesContext ruleSources() throws RecognitionException {
		RuleSourcesContext _localctx = new RuleSourcesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ruleSources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			ruleSource();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(183);
				match(T__13);
				setState(184);
				ruleSource();
				}
				}
				setState(189);
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

	public static class RuleSourceContext extends ParserRuleContext {
		public RuleContextContext ruleContext() {
			return getRuleContext(RuleContextContext.class,0);
		}
		public SourceTypeContext sourceType() {
			return getRuleContext(SourceTypeContext.class,0);
		}
		public SourceDefaultContext sourceDefault() {
			return getRuleContext(SourceDefaultContext.class,0);
		}
		public SourceListModeContext sourceListMode() {
			return getRuleContext(SourceListModeContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public CheckClauseContext checkClause() {
			return getRuleContext(CheckClauseContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public RuleSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterRuleSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitRuleSource(this);
		}
	}

	public final RuleSourceContext ruleSource() throws RecognitionException {
		RuleSourceContext _localctx = new RuleSourceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ruleSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			ruleContext();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(191);
				sourceType();
				}
			}

			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(194);
				sourceDefault();
				}
			}

			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) {
				{
				setState(197);
				sourceListMode();
				}
			}

			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(200);
				alias();
				}
			}

			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(203);
				whereClause();
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(206);
				checkClause();
				}
			}

			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(209);
				log();
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

	public static class RuleTargetsContext extends ParserRuleContext {
		public List<RuleTargetContext> ruleTarget() {
			return getRuleContexts(RuleTargetContext.class);
		}
		public RuleTargetContext ruleTarget(int i) {
			return getRuleContext(RuleTargetContext.class,i);
		}
		public RuleTargetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTargets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterRuleTargets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitRuleTargets(this);
		}
	}

	public final RuleTargetsContext ruleTargets() throws RecognitionException {
		RuleTargetsContext _localctx = new RuleTargetsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ruleTargets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			ruleTarget();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(213);
				match(T__13);
				setState(214);
				ruleTarget();
				}
				}
				setState(219);
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

	public static class SourceTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(mappingParser.INTEGER, 0); }
		public UpperBoundContext upperBound() {
			return getRuleContext(UpperBoundContext.class,0);
		}
		public SourceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterSourceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitSourceType(this);
		}
	}

	public final SourceTypeContext sourceType() throws RecognitionException {
		SourceTypeContext _localctx = new SourceTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sourceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__15);
			setState(221);
			identifier();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(222);
				match(INTEGER);
				setState(223);
				match(T__18);
				setState(224);
				upperBound();
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

	public static class UpperBoundContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(mappingParser.INTEGER, 0); }
		public UpperBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upperBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterUpperBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitUpperBound(this);
		}
	}

	public final UpperBoundContext upperBound() throws RecognitionException {
		UpperBoundContext _localctx = new UpperBoundContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_upperBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==INTEGER) ) {
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

	public static class RuleContextContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RuleContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleContext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterRuleContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitRuleContext(this);
		}
	}

	public final RuleContextContext ruleContext() throws RecognitionException {
		RuleContextContext _localctx = new RuleContextContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ruleContext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			identifier();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(230);
				match(T__20);
				setState(231);
				identifier();
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

	public static class SourceDefaultContext extends ParserRuleContext {
		public FhirPathContext fhirPath() {
			return getRuleContext(FhirPathContext.class,0);
		}
		public SourceDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterSourceDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitSourceDefault(this);
		}
	}

	public final SourceDefaultContext sourceDefault() throws RecognitionException {
		SourceDefaultContext _localctx = new SourceDefaultContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sourceDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__21);
			setState(235);
			fhirPath();
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

	public static class AliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitAlias(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__3);
			setState(238);
			identifier();
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

	public static class WhereClauseContext extends ParserRuleContext {
		public FhirPathContext fhirPath() {
			return getRuleContext(FhirPathContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__22);
			setState(241);
			fhirPath();
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

	public static class CheckClauseContext extends ParserRuleContext {
		public FhirPathContext fhirPath() {
			return getRuleContext(FhirPathContext.class,0);
		}
		public CheckClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterCheckClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitCheckClause(this);
		}
	}

	public final CheckClauseContext checkClause() throws RecognitionException {
		CheckClauseContext _localctx = new CheckClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_checkClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__23);
			setState(244);
			fhirPath();
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

	public static class LogContext extends ParserRuleContext {
		public FhirPathContext fhirPath() {
			return getRuleContext(FhirPathContext.class,0);
		}
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitLog(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__24);
			setState(247);
			fhirPath();
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

	public static class DependentContext extends ParserRuleContext {
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public DependentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterDependent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitDependent(this);
		}
	}

	public final DependentContext dependent() throws RecognitionException {
		DependentContext _localctx = new DependentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dependent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__25);
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case DELIMITEDIDENTIFIER:
				{
				setState(250);
				invocation();
				}
				break;
			case T__7:
				{
				setState(251);
				rules();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class RuleTargetContext extends ParserRuleContext {
		public RuleContextContext ruleContext() {
			return getRuleContext(RuleContextContext.class,0);
		}
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TargetListModeContext targetListMode() {
			return getRuleContext(TargetListModeContext.class,0);
		}
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public RuleTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterRuleTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitRuleTarget(this);
		}
	}

	public final RuleTargetContext ruleTarget() throws RecognitionException {
		RuleTargetContext _localctx = new RuleTargetContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ruleTarget);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				ruleContext();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(255);
					match(T__1);
					setState(256);
					transform();
					}
				}

				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(259);
					alias();
					}
				}

				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__30) | (1L << T__33) | (1L << T__34))) != 0)) {
					{
					setState(262);
					targetListMode();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				invocation();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(266);
					alias();
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

	public static class TransformContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public RuleContextContext ruleContext() {
			return getRuleContext(RuleContextContext.class,0);
		}
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitTransform(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_transform);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				ruleContext();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				invocation();
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

	public static class InvocationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitInvocation(this);
		}
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			identifier();
			setState(277);
			match(T__12);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << DATETIME) | (1L << TIME) | (1L << IDENTIFIER) | (1L << DELIMITEDIDENTIFIER) | (1L << STRING) | (1L << INTEGER) | (1L << NUMBER))) != 0)) {
				{
				setState(278);
				paramList();
				}
			}

			setState(281);
			match(T__14);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			param();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(284);
				match(T__13);
				setState(285);
				param();
				}
				}
				setState(290);
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

	public static class ParamContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_param);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case DATETIME:
			case TIME:
			case STRING:
			case INTEGER:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				literal();
				}
				break;
			case IDENTIFIER:
			case DELIMITEDIDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				identifier();
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

	public static class FhirPathContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FhirPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fhirPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterFhirPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitFhirPath(this);
		}
	}

	public final FhirPathContext fhirPath() throws RecognitionException {
		FhirPathContext _localctx = new FhirPathContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fhirPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			literal();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(mappingParser.INTEGER, 0); }
		public TerminalNode NUMBER() { return getToken(mappingParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(mappingParser.STRING, 0); }
		public TerminalNode DATETIME() { return getToken(mappingParser.DATETIME, 0); }
		public TerminalNode TIME() { return getToken(mappingParser.TIME, 0); }
		public TerminalNode BOOL() { return getToken(mappingParser.BOOL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << DATETIME) | (1L << TIME) | (1L << STRING) | (1L << INTEGER) | (1L << NUMBER))) != 0)) ) {
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

	public static class GroupTypeModeContext extends ParserRuleContext {
		public GroupTypeModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupTypeMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterGroupTypeMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitGroupTypeMode(this);
		}
	}

	public final GroupTypeModeContext groupTypeMode() throws RecognitionException {
		GroupTypeModeContext _localctx = new GroupTypeModeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_groupTypeMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
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

	public static class SourceListModeContext extends ParserRuleContext {
		public SourceListModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceListMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterSourceListMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitSourceListMode(this);
		}
	}

	public final SourceListModeContext sourceListMode() throws RecognitionException {
		SourceListModeContext _localctx = new SourceListModeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sourceListMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
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

	public static class TargetListModeContext extends ParserRuleContext {
		public TargetListModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetListMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterTargetListMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitTargetListMode(this);
		}
	}

	public final TargetListModeContext targetListMode() throws RecognitionException {
		TargetListModeContext _localctx = new TargetListModeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_targetListMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__30) | (1L << T__33) | (1L << T__34))) != 0)) ) {
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

	public static class InputModeContext extends ParserRuleContext {
		public InputModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterInputMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitInputMode(this);
		}
	}

	public final InputModeContext inputMode() throws RecognitionException {
		InputModeContext _localctx = new InputModeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_inputMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
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

	public static class ModelModeContext extends ParserRuleContext {
		public ModelModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).enterModelMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mappingListener ) ((mappingListener)listener).exitModelMode(this);
		}
	}

	public final ModelModeContext modelMode() throws RecognitionException {
		ModelModeContext _localctx = new ModelModeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_modelMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0138\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\7\2U\n"+
		"\2\f\2\16\2X\13\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\6\2a\n\2\r\2\16\2b\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\5\6s\n\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\t\5\t\u0085"+
		"\n\t\3\t\3\t\3\n\3\n\6\n\u008b\n\n\r\n\16\n\u008c\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\6\r\u009c\n\r\r\r\16\r\u009d\3\r"+
		"\3\r\3\16\3\16\3\16\5\16\u00a5\n\16\3\17\3\17\3\17\3\20\3\20\3\20\5\20"+
		"\u00ad\n\20\3\20\5\20\u00b0\n\20\3\20\5\20\u00b3\n\20\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\7\22\u00bc\n\22\f\22\16\22\u00bf\13\22\3\23\3\23\5"+
		"\23\u00c3\n\23\3\23\5\23\u00c6\n\23\3\23\5\23\u00c9\n\23\3\23\5\23\u00cc"+
		"\n\23\3\23\5\23\u00cf\n\23\3\23\5\23\u00d2\n\23\3\23\5\23\u00d5\n\23\3"+
		"\24\3\24\3\24\7\24\u00da\n\24\f\24\16\24\u00dd\13\24\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u00e4\n\25\3\26\3\26\3\27\3\27\3\27\5\27\u00eb\n\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\5\35\u00ff\n\35\3\36\3\36\3\36\5\36\u0104\n\36\3\36\5"+
		"\36\u0107\n\36\3\36\5\36\u010a\n\36\3\36\3\36\5\36\u010e\n\36\5\36\u0110"+
		"\n\36\3\37\3\37\3\37\5\37\u0115\n\37\3 \3 \3 \5 \u011a\n \3 \3 \3!\3!"+
		"\3!\7!\u0121\n!\f!\16!\u0124\13!\3\"\3\"\5\"\u0128\n\"\3#\3#\3$\3$\3%"+
		"\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\2\2*\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\n\3\2-.\4\2\26\26\60\60\4\2"+
		"*,/\61\3\2\35\36\3\2\37#\5\2\37\37!!$%\3\2&\'\3\2&)\2\u0131\2R\3\2\2\2"+
		"\4f\3\2\2\2\6k\3\2\2\2\bm\3\2\2\2\no\3\2\2\2\fw\3\2\2\2\16z\3\2\2\2\20"+
		"}\3\2\2\2\22\u0088\3\2\2\2\24\u0090\3\2\2\2\26\u0094\3\2\2\2\30\u0097"+
		"\3\2\2\2\32\u00a1\3\2\2\2\34\u00a6\3\2\2\2\36\u00a9\3\2\2\2 \u00b6\3\2"+
		"\2\2\"\u00b8\3\2\2\2$\u00c0\3\2\2\2&\u00d6\3\2\2\2(\u00de\3\2\2\2*\u00e5"+
		"\3\2\2\2,\u00e7\3\2\2\2.\u00ec\3\2\2\2\60\u00ef\3\2\2\2\62\u00f2\3\2\2"+
		"\2\64\u00f5\3\2\2\2\66\u00f8\3\2\2\28\u00fb\3\2\2\2:\u010f\3\2\2\2<\u0114"+
		"\3\2\2\2>\u0116\3\2\2\2@\u011d\3\2\2\2B\u0127\3\2\2\2D\u0129\3\2\2\2F"+
		"\u012b\3\2\2\2H\u012d\3\2\2\2J\u012f\3\2\2\2L\u0131\3\2\2\2N\u0133\3\2"+
		"\2\2P\u0135\3\2\2\2RV\5\4\3\2SU\5\n\6\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2"+
		"VW\3\2\2\2W\\\3\2\2\2XV\3\2\2\2Y[\5\16\b\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2\2\2_a\5\20\t\2`_\3\2\2\2ab\3\2\2\2b`"+
		"\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\2\2\3e\3\3\2\2\2fg\7\3\2\2gh\5\6\4\2"+
		"hi\7\4\2\2ij\5\b\5\2j\5\3\2\2\2kl\7.\2\2l\7\3\2\2\2mn\t\2\2\2n\t\3\2\2"+
		"\2op\7\5\2\2pr\5\6\4\2qs\5\f\7\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\6\2"+
		"\2uv\5P)\2v\13\3\2\2\2wx\7\7\2\2xy\5\b\5\2y\r\3\2\2\2z{\7\b\2\2{|\5\6"+
		"\4\2|\17\3\2\2\2}~\7\t\2\2~\177\5\b\5\2\177\u0081\5\30\r\2\u0080\u0082"+
		"\5\26\f\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2"+
		"\u0083\u0085\5\24\13\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0087\5\22\n\2\u0087\21\3\2\2\2\u0088\u008a\7\n\2\2\u0089"+
		"\u008b\5\36\20\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\13\2\2\u008f"+
		"\23\3\2\2\2\u0090\u0091\7\f\2\2\u0091\u0092\5H%\2\u0092\u0093\7\r\2\2"+
		"\u0093\25\3\2\2\2\u0094\u0095\7\16\2\2\u0095\u0096\5\b\5\2\u0096\27\3"+
		"\2\2\2\u0097\u0098\7\17\2\2\u0098\u009b\5\32\16\2\u0099\u009a\7\20\2\2"+
		"\u009a\u009c\5\32\16\2\u009b\u0099\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\21\2\2"+
		"\u00a0\31\3\2\2\2\u00a1\u00a2\5N(\2\u00a2\u00a4\5\b\5\2\u00a3\u00a5\5"+
		"\34\17\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\33\3\2\2\2\u00a6"+
		"\u00a7\7\22\2\2\u00a7\u00a8\5\b\5\2\u00a8\35\3\2\2\2\u00a9\u00ac\5\"\22"+
		"\2\u00aa\u00ab\7\23\2\2\u00ab\u00ad\5&\24\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00b0\58\35\2\u00af\u00ae\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00b3\5 \21\2\u00b2"+
		"\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\24"+
		"\2\2\u00b5\37\3\2\2\2\u00b6\u00b7\7.\2\2\u00b7!\3\2\2\2\u00b8\u00bd\5"+
		"$\23\2\u00b9\u00ba\7\20\2\2\u00ba\u00bc\5$\23\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be#\3\2\2\2"+
		"\u00bf\u00bd\3\2\2\2\u00c0\u00c2\5,\27\2\u00c1\u00c3\5(\25\2\u00c2\u00c1"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c6\5.\30\2\u00c5"+
		"\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c9\5J"+
		"&\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00cc\5\60\31\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3"+
		"\2\2\2\u00cd\u00cf\5\62\32\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00d2\5\64\33\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3"+
		"\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d5\5\66\34\2\u00d4\u00d3\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5%\3\2\2\2\u00d6\u00db\5:\36\2\u00d7\u00d8\7\20\2\2"+
		"\u00d8\u00da\5:\36\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\'\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00df\7\22\2\2\u00df\u00e3\5\b\5\2\u00e0\u00e1\7\60\2\2\u00e1\u00e2\7"+
		"\25\2\2\u00e2\u00e4\5*\26\2\u00e3\u00e0\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		")\3\2\2\2\u00e5\u00e6\t\3\2\2\u00e6+\3\2\2\2\u00e7\u00ea\5\b\5\2\u00e8"+
		"\u00e9\7\27\2\2\u00e9\u00eb\5\b\5\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3"+
		"\2\2\2\u00eb-\3\2\2\2\u00ec\u00ed\7\30\2\2\u00ed\u00ee\5D#\2\u00ee/\3"+
		"\2\2\2\u00ef\u00f0\7\6\2\2\u00f0\u00f1\5\b\5\2\u00f1\61\3\2\2\2\u00f2"+
		"\u00f3\7\31\2\2\u00f3\u00f4\5D#\2\u00f4\63\3\2\2\2\u00f5\u00f6\7\32\2"+
		"\2\u00f6\u00f7\5D#\2\u00f7\65\3\2\2\2\u00f8\u00f9\7\33\2\2\u00f9\u00fa"+
		"\5D#\2\u00fa\67\3\2\2\2\u00fb\u00fe\7\34\2\2\u00fc\u00ff\5> \2\u00fd\u00ff"+
		"\5\22\n\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff9\3\2\2\2\u0100"+
		"\u0103\5,\27\2\u0101\u0102\7\4\2\2\u0102\u0104\5<\37\2\u0103\u0101\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0107\5\60\31\2\u0106"+
		"\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u010a\5L"+
		"\'\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0110\3\2\2\2\u010b"+
		"\u010d\5> \2\u010c\u010e\5\60\31\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0110\3\2\2\2\u010f\u0100\3\2\2\2\u010f\u010b\3\2\2\2\u0110"+
		";\3\2\2\2\u0111\u0115\5F$\2\u0112\u0115\5,\27\2\u0113\u0115\5> \2\u0114"+
		"\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115=\3\2\2\2"+
		"\u0116\u0117\5\b\5\2\u0117\u0119\7\17\2\2\u0118\u011a\5@!\2\u0119\u0118"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\21\2\2"+
		"\u011c?\3\2\2\2\u011d\u0122\5B\"\2\u011e\u011f\7\20\2\2\u011f\u0121\5"+
		"B\"\2\u0120\u011e\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123A\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0128\5F$\2\u0126"+
		"\u0128\5\b\5\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128C\3\2\2\2"+
		"\u0129\u012a\5F$\2\u012aE\3\2\2\2\u012b\u012c\t\4\2\2\u012cG\3\2\2\2\u012d"+
		"\u012e\t\5\2\2\u012eI\3\2\2\2\u012f\u0130\t\6\2\2\u0130K\3\2\2\2\u0131"+
		"\u0132\t\7\2\2\u0132M\3\2\2\2\u0133\u0134\t\b\2\2\u0134O\3\2\2\2\u0135"+
		"\u0136\t\t\2\2\u0136Q\3\2\2\2#V\\br\u0081\u0084\u008c\u009d\u00a4\u00ac"+
		"\u00af\u00b2\u00bd\u00c2\u00c5\u00c8\u00cb\u00ce\u00d1\u00d4\u00db\u00e3"+
		"\u00ea\u00fe\u0103\u0106\u0109\u010d\u010f\u0114\u0119\u0122\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}