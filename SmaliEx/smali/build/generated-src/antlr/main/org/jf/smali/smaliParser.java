// $ANTLR 3.5.2 smaliParser.g 2020-09-12 15:08:28

package org.jf.smali;

import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.Opcodes;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class smaliParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESS_SPEC", "ANNOTATION_DIRECTIVE", 
		"ANNOTATION_VISIBILITY", "ARRAY_DATA_DIRECTIVE", "ARRAY_TYPE_PREFIX", 
		"ARROW", "AT", "BOOL_LITERAL", "BYTE_LITERAL", "CATCHALL_DIRECTIVE", "CATCH_DIRECTIVE", 
		"CHAR_LITERAL", "CLASS_DESCRIPTOR", "CLASS_DIRECTIVE", "CLOSE_BRACE", 
		"CLOSE_PAREN", "COLON", "COMMA", "DOTDOT", "DOUBLE_LITERAL", "DOUBLE_LITERAL_OR_ID", 
		"END_ANNOTATION_DIRECTIVE", "END_ARRAY_DATA_DIRECTIVE", "END_FIELD_DIRECTIVE", 
		"END_LOCAL_DIRECTIVE", "END_METHOD_DIRECTIVE", "END_PACKED_SWITCH_DIRECTIVE", 
		"END_PARAMETER_DIRECTIVE", "END_SPARSE_SWITCH_DIRECTIVE", "END_SUBANNOTATION_DIRECTIVE", 
		"ENUM_DIRECTIVE", "EPILOGUE_DIRECTIVE", "EQUAL", "FIELD_DIRECTIVE", "FIELD_OFFSET", 
		"FLOAT_LITERAL", "FLOAT_LITERAL_OR_ID", "IMPLEMENTS_DIRECTIVE", "INLINE_INDEX", 
		"INSTRUCTION_FORMAT10t", "INSTRUCTION_FORMAT10x", "INSTRUCTION_FORMAT10x_ODEX", 
		"INSTRUCTION_FORMAT11n", "INSTRUCTION_FORMAT11x", "INSTRUCTION_FORMAT12x", 
		"INSTRUCTION_FORMAT12x_OR_ID", "INSTRUCTION_FORMAT20bc", "INSTRUCTION_FORMAT20t", 
		"INSTRUCTION_FORMAT21c_FIELD", "INSTRUCTION_FORMAT21c_FIELD_ODEX", "INSTRUCTION_FORMAT21c_METHOD_HANDLE", 
		"INSTRUCTION_FORMAT21c_METHOD_TYPE", "INSTRUCTION_FORMAT21c_STRING", "INSTRUCTION_FORMAT21c_TYPE", 
		"INSTRUCTION_FORMAT21ih", "INSTRUCTION_FORMAT21lh", "INSTRUCTION_FORMAT21s", 
		"INSTRUCTION_FORMAT21t", "INSTRUCTION_FORMAT22b", "INSTRUCTION_FORMAT22c_FIELD", 
		"INSTRUCTION_FORMAT22c_FIELD_ODEX", "INSTRUCTION_FORMAT22c_TYPE", "INSTRUCTION_FORMAT22cs_FIELD", 
		"INSTRUCTION_FORMAT22s", "INSTRUCTION_FORMAT22s_OR_ID", "INSTRUCTION_FORMAT22t", 
		"INSTRUCTION_FORMAT22x", "INSTRUCTION_FORMAT23x", "INSTRUCTION_FORMAT30t", 
		"INSTRUCTION_FORMAT31c", "INSTRUCTION_FORMAT31i", "INSTRUCTION_FORMAT31i_OR_ID", 
		"INSTRUCTION_FORMAT31t", "INSTRUCTION_FORMAT32x", "INSTRUCTION_FORMAT35c_CALL_SITE", 
		"INSTRUCTION_FORMAT35c_METHOD", "INSTRUCTION_FORMAT35c_METHOD_ODEX", "INSTRUCTION_FORMAT35c_TYPE", 
		"INSTRUCTION_FORMAT35mi_METHOD", "INSTRUCTION_FORMAT35ms_METHOD", "INSTRUCTION_FORMAT3rc_CALL_SITE", 
		"INSTRUCTION_FORMAT3rc_METHOD", "INSTRUCTION_FORMAT3rc_METHOD_ODEX", "INSTRUCTION_FORMAT3rc_TYPE", 
		"INSTRUCTION_FORMAT3rmi_METHOD", "INSTRUCTION_FORMAT3rms_METHOD", "INSTRUCTION_FORMAT45cc_METHOD", 
		"INSTRUCTION_FORMAT4rcc_METHOD", "INSTRUCTION_FORMAT51l", "INTEGER_LITERAL", 
		"INVALID_TOKEN", "I_ACCESS_LIST", "I_ANNOTATION", "I_ANNOTATIONS", "I_ANNOTATION_ELEMENT", 
		"I_ARRAY_ELEMENTS", "I_ARRAY_ELEMENT_SIZE", "I_CALL_SITE_EXTRA_ARGUMENTS", 
		"I_CALL_SITE_REFERENCE", "I_CATCH", "I_CATCHALL", "I_CATCHES", "I_CLASS_DEF", 
		"I_ENCODED_ARRAY", "I_ENCODED_ENUM", "I_ENCODED_FIELD", "I_ENCODED_METHOD", 
		"I_ENCODED_METHOD_HANDLE", "I_END_LOCAL", "I_EPILOGUE", "I_FIELD", "I_FIELDS", 
		"I_FIELD_INITIAL_VALUE", "I_FIELD_TYPE", "I_IMPLEMENTS", "I_LABEL", "I_LINE", 
		"I_LOCAL", "I_LOCALS", "I_METHOD", "I_METHODS", "I_METHOD_PROTOTYPE", 
		"I_METHOD_RETURN_TYPE", "I_ORDERED_METHOD_ITEMS", "I_PACKED_SWITCH_ELEMENTS", 
		"I_PACKED_SWITCH_START_KEY", "I_PARAMETER", "I_PARAMETERS", "I_PARAMETER_NOT_SPECIFIED", 
		"I_PROLOGUE", "I_REGISTERS", "I_REGISTER_LIST", "I_REGISTER_RANGE", "I_RESTART_LOCAL", 
		"I_SOURCE", "I_SPARSE_SWITCH_ELEMENTS", "I_STATEMENT_ARRAY_DATA", "I_STATEMENT_FORMAT10t", 
		"I_STATEMENT_FORMAT10x", "I_STATEMENT_FORMAT11n", "I_STATEMENT_FORMAT11x", 
		"I_STATEMENT_FORMAT12x", "I_STATEMENT_FORMAT20bc", "I_STATEMENT_FORMAT20t", 
		"I_STATEMENT_FORMAT21c_FIELD", "I_STATEMENT_FORMAT21c_METHOD_HANDLE", 
		"I_STATEMENT_FORMAT21c_METHOD_TYPE", "I_STATEMENT_FORMAT21c_STRING", "I_STATEMENT_FORMAT21c_TYPE", 
		"I_STATEMENT_FORMAT21ih", "I_STATEMENT_FORMAT21lh", "I_STATEMENT_FORMAT21s", 
		"I_STATEMENT_FORMAT21t", "I_STATEMENT_FORMAT22b", "I_STATEMENT_FORMAT22c_FIELD", 
		"I_STATEMENT_FORMAT22c_TYPE", "I_STATEMENT_FORMAT22s", "I_STATEMENT_FORMAT22t", 
		"I_STATEMENT_FORMAT22x", "I_STATEMENT_FORMAT23x", "I_STATEMENT_FORMAT30t", 
		"I_STATEMENT_FORMAT31c", "I_STATEMENT_FORMAT31i", "I_STATEMENT_FORMAT31t", 
		"I_STATEMENT_FORMAT32x", "I_STATEMENT_FORMAT35c_CALL_SITE", "I_STATEMENT_FORMAT35c_METHOD", 
		"I_STATEMENT_FORMAT35c_TYPE", "I_STATEMENT_FORMAT3rc_CALL_SITE", "I_STATEMENT_FORMAT3rc_METHOD", 
		"I_STATEMENT_FORMAT3rc_TYPE", "I_STATEMENT_FORMAT45cc_METHOD", "I_STATEMENT_FORMAT4rcc_METHOD", 
		"I_STATEMENT_FORMAT51l", "I_STATEMENT_PACKED_SWITCH", "I_STATEMENT_SPARSE_SWITCH", 
		"I_SUBANNOTATION", "I_SUPER", "LINE_COMMENT", "LINE_DIRECTIVE", "LOCALS_DIRECTIVE", 
		"LOCAL_DIRECTIVE", "LONG_LITERAL", "MEMBER_NAME", "METHOD_DIRECTIVE", 
		"METHOD_HANDLE_TYPE_FIELD", "METHOD_HANDLE_TYPE_METHOD", "NEGATIVE_INTEGER_LITERAL", 
		"NULL_LITERAL", "OPEN_BRACE", "OPEN_PAREN", "PACKED_SWITCH_DIRECTIVE", 
		"PARAMETER_DIRECTIVE", "PARAM_LIST_OR_ID_PRIMITIVE_TYPE", "POSITIVE_INTEGER_LITERAL", 
		"PRIMITIVE_TYPE", "PROLOGUE_DIRECTIVE", "REGISTER", "REGISTERS_DIRECTIVE", 
		"RESTART_LOCAL_DIRECTIVE", "SHORT_LITERAL", "SIMPLE_NAME", "SOURCE_DIRECTIVE", 
		"SPARSE_SWITCH_DIRECTIVE", "STRING_LITERAL", "SUBANNOTATION_DIRECTIVE", 
		"SUPER_DIRECTIVE", "VERIFICATION_ERROR_TYPE", "VOID_TYPE", "VTABLE_INDEX", 
		"WHITE_SPACE"
	};
	public static final int EOF=-1;
	public static final int ACCESS_SPEC=4;
	public static final int ANNOTATION_DIRECTIVE=5;
	public static final int ANNOTATION_VISIBILITY=6;
	public static final int ARRAY_DATA_DIRECTIVE=7;
	public static final int ARRAY_TYPE_PREFIX=8;
	public static final int ARROW=9;
	public static final int AT=10;
	public static final int BOOL_LITERAL=11;
	public static final int BYTE_LITERAL=12;
	public static final int CATCHALL_DIRECTIVE=13;
	public static final int CATCH_DIRECTIVE=14;
	public static final int CHAR_LITERAL=15;
	public static final int CLASS_DESCRIPTOR=16;
	public static final int CLASS_DIRECTIVE=17;
	public static final int CLOSE_BRACE=18;
	public static final int CLOSE_PAREN=19;
	public static final int COLON=20;
	public static final int COMMA=21;
	public static final int DOTDOT=22;
	public static final int DOUBLE_LITERAL=23;
	public static final int DOUBLE_LITERAL_OR_ID=24;
	public static final int END_ANNOTATION_DIRECTIVE=25;
	public static final int END_ARRAY_DATA_DIRECTIVE=26;
	public static final int END_FIELD_DIRECTIVE=27;
	public static final int END_LOCAL_DIRECTIVE=28;
	public static final int END_METHOD_DIRECTIVE=29;
	public static final int END_PACKED_SWITCH_DIRECTIVE=30;
	public static final int END_PARAMETER_DIRECTIVE=31;
	public static final int END_SPARSE_SWITCH_DIRECTIVE=32;
	public static final int END_SUBANNOTATION_DIRECTIVE=33;
	public static final int ENUM_DIRECTIVE=34;
	public static final int EPILOGUE_DIRECTIVE=35;
	public static final int EQUAL=36;
	public static final int FIELD_DIRECTIVE=37;
	public static final int FIELD_OFFSET=38;
	public static final int FLOAT_LITERAL=39;
	public static final int FLOAT_LITERAL_OR_ID=40;
	public static final int IMPLEMENTS_DIRECTIVE=41;
	public static final int INLINE_INDEX=42;
	public static final int INSTRUCTION_FORMAT10t=43;
	public static final int INSTRUCTION_FORMAT10x=44;
	public static final int INSTRUCTION_FORMAT10x_ODEX=45;
	public static final int INSTRUCTION_FORMAT11n=46;
	public static final int INSTRUCTION_FORMAT11x=47;
	public static final int INSTRUCTION_FORMAT12x=48;
	public static final int INSTRUCTION_FORMAT12x_OR_ID=49;
	public static final int INSTRUCTION_FORMAT20bc=50;
	public static final int INSTRUCTION_FORMAT20t=51;
	public static final int INSTRUCTION_FORMAT21c_FIELD=52;
	public static final int INSTRUCTION_FORMAT21c_FIELD_ODEX=53;
	public static final int INSTRUCTION_FORMAT21c_METHOD_HANDLE=54;
	public static final int INSTRUCTION_FORMAT21c_METHOD_TYPE=55;
	public static final int INSTRUCTION_FORMAT21c_STRING=56;
	public static final int INSTRUCTION_FORMAT21c_TYPE=57;
	public static final int INSTRUCTION_FORMAT21ih=58;
	public static final int INSTRUCTION_FORMAT21lh=59;
	public static final int INSTRUCTION_FORMAT21s=60;
	public static final int INSTRUCTION_FORMAT21t=61;
	public static final int INSTRUCTION_FORMAT22b=62;
	public static final int INSTRUCTION_FORMAT22c_FIELD=63;
	public static final int INSTRUCTION_FORMAT22c_FIELD_ODEX=64;
	public static final int INSTRUCTION_FORMAT22c_TYPE=65;
	public static final int INSTRUCTION_FORMAT22cs_FIELD=66;
	public static final int INSTRUCTION_FORMAT22s=67;
	public static final int INSTRUCTION_FORMAT22s_OR_ID=68;
	public static final int INSTRUCTION_FORMAT22t=69;
	public static final int INSTRUCTION_FORMAT22x=70;
	public static final int INSTRUCTION_FORMAT23x=71;
	public static final int INSTRUCTION_FORMAT30t=72;
	public static final int INSTRUCTION_FORMAT31c=73;
	public static final int INSTRUCTION_FORMAT31i=74;
	public static final int INSTRUCTION_FORMAT31i_OR_ID=75;
	public static final int INSTRUCTION_FORMAT31t=76;
	public static final int INSTRUCTION_FORMAT32x=77;
	public static final int INSTRUCTION_FORMAT35c_CALL_SITE=78;
	public static final int INSTRUCTION_FORMAT35c_METHOD=79;
	public static final int INSTRUCTION_FORMAT35c_METHOD_ODEX=80;
	public static final int INSTRUCTION_FORMAT35c_TYPE=81;
	public static final int INSTRUCTION_FORMAT35mi_METHOD=82;
	public static final int INSTRUCTION_FORMAT35ms_METHOD=83;
	public static final int INSTRUCTION_FORMAT3rc_CALL_SITE=84;
	public static final int INSTRUCTION_FORMAT3rc_METHOD=85;
	public static final int INSTRUCTION_FORMAT3rc_METHOD_ODEX=86;
	public static final int INSTRUCTION_FORMAT3rc_TYPE=87;
	public static final int INSTRUCTION_FORMAT3rmi_METHOD=88;
	public static final int INSTRUCTION_FORMAT3rms_METHOD=89;
	public static final int INSTRUCTION_FORMAT45cc_METHOD=90;
	public static final int INSTRUCTION_FORMAT4rcc_METHOD=91;
	public static final int INSTRUCTION_FORMAT51l=92;
	public static final int INTEGER_LITERAL=93;
	public static final int INVALID_TOKEN=94;
	public static final int I_ACCESS_LIST=95;
	public static final int I_ANNOTATION=96;
	public static final int I_ANNOTATIONS=97;
	public static final int I_ANNOTATION_ELEMENT=98;
	public static final int I_ARRAY_ELEMENTS=99;
	public static final int I_ARRAY_ELEMENT_SIZE=100;
	public static final int I_CALL_SITE_EXTRA_ARGUMENTS=101;
	public static final int I_CALL_SITE_REFERENCE=102;
	public static final int I_CATCH=103;
	public static final int I_CATCHALL=104;
	public static final int I_CATCHES=105;
	public static final int I_CLASS_DEF=106;
	public static final int I_ENCODED_ARRAY=107;
	public static final int I_ENCODED_ENUM=108;
	public static final int I_ENCODED_FIELD=109;
	public static final int I_ENCODED_METHOD=110;
	public static final int I_ENCODED_METHOD_HANDLE=111;
	public static final int I_END_LOCAL=112;
	public static final int I_EPILOGUE=113;
	public static final int I_FIELD=114;
	public static final int I_FIELDS=115;
	public static final int I_FIELD_INITIAL_VALUE=116;
	public static final int I_FIELD_TYPE=117;
	public static final int I_IMPLEMENTS=118;
	public static final int I_LABEL=119;
	public static final int I_LINE=120;
	public static final int I_LOCAL=121;
	public static final int I_LOCALS=122;
	public static final int I_METHOD=123;
	public static final int I_METHODS=124;
	public static final int I_METHOD_PROTOTYPE=125;
	public static final int I_METHOD_RETURN_TYPE=126;
	public static final int I_ORDERED_METHOD_ITEMS=127;
	public static final int I_PACKED_SWITCH_ELEMENTS=128;
	public static final int I_PACKED_SWITCH_START_KEY=129;
	public static final int I_PARAMETER=130;
	public static final int I_PARAMETERS=131;
	public static final int I_PARAMETER_NOT_SPECIFIED=132;
	public static final int I_PROLOGUE=133;
	public static final int I_REGISTERS=134;
	public static final int I_REGISTER_LIST=135;
	public static final int I_REGISTER_RANGE=136;
	public static final int I_RESTART_LOCAL=137;
	public static final int I_SOURCE=138;
	public static final int I_SPARSE_SWITCH_ELEMENTS=139;
	public static final int I_STATEMENT_ARRAY_DATA=140;
	public static final int I_STATEMENT_FORMAT10t=141;
	public static final int I_STATEMENT_FORMAT10x=142;
	public static final int I_STATEMENT_FORMAT11n=143;
	public static final int I_STATEMENT_FORMAT11x=144;
	public static final int I_STATEMENT_FORMAT12x=145;
	public static final int I_STATEMENT_FORMAT20bc=146;
	public static final int I_STATEMENT_FORMAT20t=147;
	public static final int I_STATEMENT_FORMAT21c_FIELD=148;
	public static final int I_STATEMENT_FORMAT21c_METHOD_HANDLE=149;
	public static final int I_STATEMENT_FORMAT21c_METHOD_TYPE=150;
	public static final int I_STATEMENT_FORMAT21c_STRING=151;
	public static final int I_STATEMENT_FORMAT21c_TYPE=152;
	public static final int I_STATEMENT_FORMAT21ih=153;
	public static final int I_STATEMENT_FORMAT21lh=154;
	public static final int I_STATEMENT_FORMAT21s=155;
	public static final int I_STATEMENT_FORMAT21t=156;
	public static final int I_STATEMENT_FORMAT22b=157;
	public static final int I_STATEMENT_FORMAT22c_FIELD=158;
	public static final int I_STATEMENT_FORMAT22c_TYPE=159;
	public static final int I_STATEMENT_FORMAT22s=160;
	public static final int I_STATEMENT_FORMAT22t=161;
	public static final int I_STATEMENT_FORMAT22x=162;
	public static final int I_STATEMENT_FORMAT23x=163;
	public static final int I_STATEMENT_FORMAT30t=164;
	public static final int I_STATEMENT_FORMAT31c=165;
	public static final int I_STATEMENT_FORMAT31i=166;
	public static final int I_STATEMENT_FORMAT31t=167;
	public static final int I_STATEMENT_FORMAT32x=168;
	public static final int I_STATEMENT_FORMAT35c_CALL_SITE=169;
	public static final int I_STATEMENT_FORMAT35c_METHOD=170;
	public static final int I_STATEMENT_FORMAT35c_TYPE=171;
	public static final int I_STATEMENT_FORMAT3rc_CALL_SITE=172;
	public static final int I_STATEMENT_FORMAT3rc_METHOD=173;
	public static final int I_STATEMENT_FORMAT3rc_TYPE=174;
	public static final int I_STATEMENT_FORMAT45cc_METHOD=175;
	public static final int I_STATEMENT_FORMAT4rcc_METHOD=176;
	public static final int I_STATEMENT_FORMAT51l=177;
	public static final int I_STATEMENT_PACKED_SWITCH=178;
	public static final int I_STATEMENT_SPARSE_SWITCH=179;
	public static final int I_SUBANNOTATION=180;
	public static final int I_SUPER=181;
	public static final int LINE_COMMENT=182;
	public static final int LINE_DIRECTIVE=183;
	public static final int LOCALS_DIRECTIVE=184;
	public static final int LOCAL_DIRECTIVE=185;
	public static final int LONG_LITERAL=186;
	public static final int MEMBER_NAME=187;
	public static final int METHOD_DIRECTIVE=188;
	public static final int METHOD_HANDLE_TYPE_FIELD=189;
	public static final int METHOD_HANDLE_TYPE_METHOD=190;
	public static final int NEGATIVE_INTEGER_LITERAL=191;
	public static final int NULL_LITERAL=192;
	public static final int OPEN_BRACE=193;
	public static final int OPEN_PAREN=194;
	public static final int PACKED_SWITCH_DIRECTIVE=195;
	public static final int PARAMETER_DIRECTIVE=196;
	public static final int PARAM_LIST_OR_ID_PRIMITIVE_TYPE=197;
	public static final int POSITIVE_INTEGER_LITERAL=198;
	public static final int PRIMITIVE_TYPE=199;
	public static final int PROLOGUE_DIRECTIVE=200;
	public static final int REGISTER=201;
	public static final int REGISTERS_DIRECTIVE=202;
	public static final int RESTART_LOCAL_DIRECTIVE=203;
	public static final int SHORT_LITERAL=204;
	public static final int SIMPLE_NAME=205;
	public static final int SOURCE_DIRECTIVE=206;
	public static final int SPARSE_SWITCH_DIRECTIVE=207;
	public static final int STRING_LITERAL=208;
	public static final int SUBANNOTATION_DIRECTIVE=209;
	public static final int SUPER_DIRECTIVE=210;
	public static final int VERIFICATION_ERROR_TYPE=211;
	public static final int VOID_TYPE=212;
	public static final int VTABLE_INDEX=213;
	public static final int WHITE_SPACE=214;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public smaliParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public smaliParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return smaliParser.tokenNames; }
	@Override public String getGrammarFileName() { return "smaliParser.g"; }


	  public static final int ERROR_CHANNEL = 100;

	  private boolean verboseErrors = false;
	  private boolean allowOdex = false;
	  private int apiLevel = 15;
	  private Opcodes opcodes = Opcodes.forApi(apiLevel);

	  public void setVerboseErrors(boolean verboseErrors) {
	    this.verboseErrors = verboseErrors;
	  }

	  public void setAllowOdex(boolean allowOdex) {
	      this.allowOdex = allowOdex;
	  }

	  public void setApiLevel(int apiLevel) {
	      this.opcodes = Opcodes.forApi(apiLevel);
	      this.apiLevel = apiLevel;
	  }

	  public String getErrorMessage(RecognitionException e,
	    String[] tokenNames) {

	    if (verboseErrors) {
	      List stack = getRuleInvocationStack(e, this.getClass().getName());
	      String msg = null;

	      if (e instanceof NoViableAltException) {
	        NoViableAltException nvae = (NoViableAltException)e;
	        msg = " no viable alt; token="+getTokenErrorDisplay(e.token)+
	        " (decision="+nvae.decisionNumber+
	        " state "+nvae.stateNumber+")"+
	        " decision=<<"+nvae.grammarDecisionDescription+">>";
	      } else {
	        msg = super.getErrorMessage(e, tokenNames);
	      }

	      return stack + " " + msg;
	    } else {
	      return super.getErrorMessage(e, tokenNames);
	    }
	  }

	  public String getTokenErrorDisplay(Token t) {
	    if (!verboseErrors) {
	      String s = t.getText();
	      if ( s==null ) {
	        if ( t.getType()==Token.EOF ) {
	          s = "<EOF>";
	        }
	        else {
	          s = "<"+tokenNames[t.getType()]+">";
	        }
	      }
	      s = s.replaceAll("\n","\\\\n");
	      s = s.replaceAll("\r","\\\\r");
	      s = s.replaceAll("\t","\\\\t");
	      return "'"+s+"'";
	    }

	    CommonToken ct = (CommonToken)t;

	    String channelStr = "";
	    if (t.getChannel()>0) {
	      channelStr=",channel="+t.getChannel();
	    }
	    String txt = t.getText();
	    if ( txt!=null ) {
	      txt = txt.replaceAll("\n","\\\\n");
	      txt = txt.replaceAll("\r","\\\\r");
	      txt = txt.replaceAll("\t","\\\\t");
	    }
	    else {
	      txt = "<no text>";
	    }
	    return "[@"+t.getTokenIndex()+","+ct.getStartIndex()+":"+ct.getStopIndex()+"='"+txt+"',<"+tokenNames[t.getType()]+">"+channelStr+","+t.getLine()+":"+t.getCharPositionInLine()+"]";
	  }

	  public String getErrorHeader(RecognitionException e) {
	    return getSourceName()+"["+ e.line+","+e.charPositionInLine+"]";
	  }

	  private CommonTree buildTree(int type, String text, List<CommonTree> children) {
	    CommonTree root = new CommonTree(new CommonToken(type, text));
	    for (CommonTree child: children) {
	      root.addChild(child);
	    }
	    return root;
	  }

	  private CommonToken getParamListSubToken(CommonToken baseToken, String str, int typeStartIndex) {
	    CommonToken token = new CommonToken(baseToken);
	    token.setStartIndex(baseToken.getStartIndex() + typeStartIndex);

	    switch (str.charAt(typeStartIndex)) {
	      case 'Z':
	      case 'B':
	      case 'S':
	      case 'C':
	      case 'I':
	      case 'J':
	      case 'F':
	      case 'D':
	      {
	        token.setType(PRIMITIVE_TYPE);
	        token.setText(str.substring(typeStartIndex, typeStartIndex+1));
	        token.setStopIndex(baseToken.getStartIndex() + typeStartIndex);
	        break;
	      }
	      case 'L':
	      {
	        int i = typeStartIndex;
	        while (str.charAt(++i) != ';');

	        token.setType(CLASS_DESCRIPTOR);
	        token.setText(str.substring(typeStartIndex, i + 1));
	        token.setStopIndex(baseToken.getStartIndex() + i);
	        break;
	      }
	      case '[':
	      {
	        int i = typeStartIndex;
	        while (str.charAt(++i) == '[');

	        token.setType(ARRAY_TYPE_PREFIX);
	        token.setText(str.substring(typeStartIndex, i));
	        token.setStopIndex(baseToken.getStartIndex() + i - 1);
	        break;
	      }
	      default:
	        throw new RuntimeException(String.format("Invalid character '%c' in param list \"%s\" at position %d", str.charAt(typeStartIndex), str, typeStartIndex));
	    }

	    return token;
	  }

	  private CommonTree parseParamList(CommonToken paramListToken) {
	    String paramList = paramListToken.getText();
	    CommonTree root = new CommonTree();

	    int startIndex = paramListToken.getStartIndex();

	    int i=0;
	    while (i<paramList.length()) {
	      CommonToken token = getParamListSubToken(paramListToken, paramList, i);
	      root.addChild(new CommonTree(token));
	      i += token.getText().length();
	    }

	    if (root.getChildCount() == 0) {
	      return null;
	    }
	    return root;
	  }

	  private void throwOdexedInstructionException(IntStream input, String odexedInstruction)
	      throws OdexedInstructionException {
	    /*this has to be done in a separate method, otherwise java will complain about the
	    auto-generated code in the rule after the throw not being reachable*/
	    throw new OdexedInstructionException(input, odexedInstruction);
	  }


	protected static class smali_file_scope {
		boolean hasClassSpec;
		boolean hasSuperSpec;
		boolean hasSourceSpec;
		List<CommonTree> classAnnotations;
	}
	protected Stack<smali_file_scope> smali_file_stack = new Stack<smali_file_scope>();

	public static class smali_file_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "smali_file"
	// smaliParser.g:426:1: smali_file : ({...}? => class_spec |{...}? => super_spec | implements_spec |{...}? => source_spec | method | field | annotation )+ EOF -> ^( I_CLASS_DEF class_spec ( super_spec )? ( implements_spec )* ( source_spec )? ^( I_METHODS ( method )* ) ^( I_FIELDS ( field )* ) ) ;
	public final smaliParser.smali_file_return smali_file() throws RecognitionException {
		smali_file_stack.push(new smali_file_scope());
		smaliParser.smali_file_return retval = new smaliParser.smali_file_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF8=null;
		ParserRuleReturnScope class_spec1 =null;
		ParserRuleReturnScope super_spec2 =null;
		ParserRuleReturnScope implements_spec3 =null;
		ParserRuleReturnScope source_spec4 =null;
		ParserRuleReturnScope method5 =null;
		ParserRuleReturnScope field6 =null;
		ParserRuleReturnScope annotation7 =null;

		CommonTree EOF8_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_class_spec=new RewriteRuleSubtreeStream(adaptor,"rule class_spec");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_method=new RewriteRuleSubtreeStream(adaptor,"rule method");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
		RewriteRuleSubtreeStream stream_super_spec=new RewriteRuleSubtreeStream(adaptor,"rule super_spec");
		RewriteRuleSubtreeStream stream_implements_spec=new RewriteRuleSubtreeStream(adaptor,"rule implements_spec");
		RewriteRuleSubtreeStream stream_source_spec=new RewriteRuleSubtreeStream(adaptor,"rule source_spec");

		 smali_file_stack.peek().hasClassSpec = smali_file_stack.peek().hasSuperSpec = smali_file_stack.peek().hasSourceSpec = false;
		    smali_file_stack.peek().classAnnotations = new ArrayList<CommonTree>();
		  
		try {
			// smaliParser.g:438:3: ( ({...}? => class_spec |{...}? => super_spec | implements_spec |{...}? => source_spec | method | field | annotation )+ EOF -> ^( I_CLASS_DEF class_spec ( super_spec )? ( implements_spec )* ( source_spec )? ^( I_METHODS ( method )* ) ^( I_FIELDS ( field )* ) ) )
			// smaliParser.g:439:3: ({...}? => class_spec |{...}? => super_spec | implements_spec |{...}? => source_spec | method | field | annotation )+ EOF
			{
			// smaliParser.g:439:3: ({...}? => class_spec |{...}? => super_spec | implements_spec |{...}? => source_spec | method | field | annotation )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=8;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CLASS_DIRECTIVE) && ((!smali_file_stack.peek().hasClassSpec))) {
					alt1=1;
				}
				else if ( (LA1_0==SUPER_DIRECTIVE) && ((!smali_file_stack.peek().hasSuperSpec))) {
					alt1=2;
				}
				else if ( (LA1_0==IMPLEMENTS_DIRECTIVE) ) {
					alt1=3;
				}
				else if ( (LA1_0==SOURCE_DIRECTIVE) && ((!smali_file_stack.peek().hasSourceSpec))) {
					alt1=4;
				}
				else if ( (LA1_0==METHOD_DIRECTIVE) ) {
					alt1=5;
				}
				else if ( (LA1_0==FIELD_DIRECTIVE) ) {
					alt1=6;
				}
				else if ( (LA1_0==ANNOTATION_DIRECTIVE) ) {
					alt1=7;
				}

				switch (alt1) {
				case 1 :
					// smaliParser.g:439:5: {...}? => class_spec
					{
					if ( !((!smali_file_stack.peek().hasClassSpec)) ) {
						throw new FailedPredicateException(input, "smali_file", "!$smali_file::hasClassSpec");
					}
					pushFollow(FOLLOW_class_spec_in_smali_file1135);
					class_spec1=class_spec();
					state._fsp--;

					stream_class_spec.add(class_spec1.getTree());
					smali_file_stack.peek().hasClassSpec = true;
					}
					break;
				case 2 :
					// smaliParser.g:440:5: {...}? => super_spec
					{
					if ( !((!smali_file_stack.peek().hasSuperSpec)) ) {
						throw new FailedPredicateException(input, "smali_file", "!$smali_file::hasSuperSpec");
					}
					pushFollow(FOLLOW_super_spec_in_smali_file1146);
					super_spec2=super_spec();
					state._fsp--;

					stream_super_spec.add(super_spec2.getTree());
					smali_file_stack.peek().hasSuperSpec = true;
					}
					break;
				case 3 :
					// smaliParser.g:441:5: implements_spec
					{
					pushFollow(FOLLOW_implements_spec_in_smali_file1154);
					implements_spec3=implements_spec();
					state._fsp--;

					stream_implements_spec.add(implements_spec3.getTree());
					}
					break;
				case 4 :
					// smaliParser.g:442:5: {...}? => source_spec
					{
					if ( !((!smali_file_stack.peek().hasSourceSpec)) ) {
						throw new FailedPredicateException(input, "smali_file", "!$smali_file::hasSourceSpec");
					}
					pushFollow(FOLLOW_source_spec_in_smali_file1163);
					source_spec4=source_spec();
					state._fsp--;

					stream_source_spec.add(source_spec4.getTree());
					smali_file_stack.peek().hasSourceSpec = true;
					}
					break;
				case 5 :
					// smaliParser.g:443:5: method
					{
					pushFollow(FOLLOW_method_in_smali_file1171);
					method5=method();
					state._fsp--;

					stream_method.add(method5.getTree());
					}
					break;
				case 6 :
					// smaliParser.g:444:5: field
					{
					pushFollow(FOLLOW_field_in_smali_file1177);
					field6=field();
					state._fsp--;

					stream_field.add(field6.getTree());
					}
					break;
				case 7 :
					// smaliParser.g:445:5: annotation
					{
					pushFollow(FOLLOW_annotation_in_smali_file1183);
					annotation7=annotation();
					state._fsp--;

					stream_annotation.add(annotation7.getTree());
					smali_file_stack.peek().classAnnotations.add((annotation7!=null?((CommonTree)annotation7.getTree()):null));
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_smali_file1194);  
			stream_EOF.add(EOF8);


			    if (!smali_file_stack.peek().hasClassSpec) {
			      throw new SemanticException(input, "The file must contain a .class directive");
			    }

			    if (!smali_file_stack.peek().hasSuperSpec) {
			      if (!(class_spec1!=null?((smaliParser.class_spec_return)class_spec1).className:null).equals("Ljava/lang/Object;")) {
			        throw new SemanticException(input, "The file must contain a .super directive");
			      }
			    }
			  
			// AST REWRITE
			// elements: class_spec, super_spec, source_spec, implements_spec, field, method
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 459:3: -> ^( I_CLASS_DEF class_spec ( super_spec )? ( implements_spec )* ( source_spec )? ^( I_METHODS ( method )* ) ^( I_FIELDS ( field )* ) )
			{
				// smaliParser.g:459:6: ^( I_CLASS_DEF class_spec ( super_spec )? ( implements_spec )* ( source_spec )? ^( I_METHODS ( method )* ) ^( I_FIELDS ( field )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_CLASS_DEF, "I_CLASS_DEF"), root_1);
				adaptor.addChild(root_1, stream_class_spec.nextTree());
				// smaliParser.g:461:8: ( super_spec )?
				if ( stream_super_spec.hasNext() ) {
					adaptor.addChild(root_1, stream_super_spec.nextTree());
				}
				stream_super_spec.reset();

				// smaliParser.g:462:8: ( implements_spec )*
				while ( stream_implements_spec.hasNext() ) {
					adaptor.addChild(root_1, stream_implements_spec.nextTree());
				}
				stream_implements_spec.reset();

				// smaliParser.g:463:8: ( source_spec )?
				if ( stream_source_spec.hasNext() ) {
					adaptor.addChild(root_1, stream_source_spec.nextTree());
				}
				stream_source_spec.reset();

				// smaliParser.g:464:8: ^( I_METHODS ( method )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_METHODS, "I_METHODS"), root_2);
				// smaliParser.g:464:20: ( method )*
				while ( stream_method.hasNext() ) {
					adaptor.addChild(root_2, stream_method.nextTree());
				}
				stream_method.reset();

				adaptor.addChild(root_1, root_2);
				}

				// smaliParser.g:464:29: ^( I_FIELDS ( field )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELDS, "I_FIELDS"), root_2);
				// smaliParser.g:464:40: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_2, stream_field.nextTree());
				}
				stream_field.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, buildTree(I_ANNOTATIONS, "I_ANNOTATIONS", smali_file_stack.peek().classAnnotations));
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			smali_file_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "smali_file"


	public static class class_spec_return extends ParserRuleReturnScope {
		public String className;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "class_spec"
	// smaliParser.g:466:1: class_spec returns [String className] : CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR -> CLASS_DESCRIPTOR access_list ;
	public final smaliParser.class_spec_return class_spec() throws RecognitionException {
		smaliParser.class_spec_return retval = new smaliParser.class_spec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CLASS_DIRECTIVE9=null;
		Token CLASS_DESCRIPTOR11=null;
		ParserRuleReturnScope access_list10 =null;

		CommonTree CLASS_DIRECTIVE9_tree=null;
		CommonTree CLASS_DESCRIPTOR11_tree=null;
		RewriteRuleTokenStream stream_CLASS_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token CLASS_DESCRIPTOR");
		RewriteRuleTokenStream stream_CLASS_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token CLASS_DIRECTIVE");
		RewriteRuleSubtreeStream stream_access_list=new RewriteRuleSubtreeStream(adaptor,"rule access_list");

		try {
			// smaliParser.g:467:3: ( CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR -> CLASS_DESCRIPTOR access_list )
			// smaliParser.g:467:5: CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR
			{
			CLASS_DIRECTIVE9=(Token)match(input,CLASS_DIRECTIVE,FOLLOW_CLASS_DIRECTIVE_in_class_spec1281);  
			stream_CLASS_DIRECTIVE.add(CLASS_DIRECTIVE9);

			pushFollow(FOLLOW_access_list_in_class_spec1283);
			access_list10=access_list();
			state._fsp--;

			stream_access_list.add(access_list10.getTree());
			CLASS_DESCRIPTOR11=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_class_spec1285);  
			stream_CLASS_DESCRIPTOR.add(CLASS_DESCRIPTOR11);

			retval.className = (CLASS_DESCRIPTOR11!=null?CLASS_DESCRIPTOR11.getText():null);
			// AST REWRITE
			// elements: access_list, CLASS_DESCRIPTOR
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 467:89: -> CLASS_DESCRIPTOR access_list
			{
				adaptor.addChild(root_0, stream_CLASS_DESCRIPTOR.nextNode());
				adaptor.addChild(root_0, stream_access_list.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "class_spec"


	public static class super_spec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "super_spec"
	// smaliParser.g:469:1: super_spec : SUPER_DIRECTIVE CLASS_DESCRIPTOR -> ^( I_SUPER[$start, \"I_SUPER\"] CLASS_DESCRIPTOR ) ;
	public final smaliParser.super_spec_return super_spec() throws RecognitionException {
		smaliParser.super_spec_return retval = new smaliParser.super_spec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUPER_DIRECTIVE12=null;
		Token CLASS_DESCRIPTOR13=null;

		CommonTree SUPER_DIRECTIVE12_tree=null;
		CommonTree CLASS_DESCRIPTOR13_tree=null;
		RewriteRuleTokenStream stream_CLASS_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token CLASS_DESCRIPTOR");
		RewriteRuleTokenStream stream_SUPER_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token SUPER_DIRECTIVE");

		try {
			// smaliParser.g:470:3: ( SUPER_DIRECTIVE CLASS_DESCRIPTOR -> ^( I_SUPER[$start, \"I_SUPER\"] CLASS_DESCRIPTOR ) )
			// smaliParser.g:470:5: SUPER_DIRECTIVE CLASS_DESCRIPTOR
			{
			SUPER_DIRECTIVE12=(Token)match(input,SUPER_DIRECTIVE,FOLLOW_SUPER_DIRECTIVE_in_super_spec1303);  
			stream_SUPER_DIRECTIVE.add(SUPER_DIRECTIVE12);

			CLASS_DESCRIPTOR13=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_super_spec1305);  
			stream_CLASS_DESCRIPTOR.add(CLASS_DESCRIPTOR13);

			// AST REWRITE
			// elements: CLASS_DESCRIPTOR
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 470:38: -> ^( I_SUPER[$start, \"I_SUPER\"] CLASS_DESCRIPTOR )
			{
				// smaliParser.g:470:41: ^( I_SUPER[$start, \"I_SUPER\"] CLASS_DESCRIPTOR )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SUPER, (retval.start), "I_SUPER"), root_1);
				adaptor.addChild(root_1, stream_CLASS_DESCRIPTOR.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "super_spec"


	public static class implements_spec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "implements_spec"
	// smaliParser.g:472:1: implements_spec : IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR -> ^( I_IMPLEMENTS[$start, \"I_IMPLEMENTS\"] CLASS_DESCRIPTOR ) ;
	public final smaliParser.implements_spec_return implements_spec() throws RecognitionException {
		smaliParser.implements_spec_return retval = new smaliParser.implements_spec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IMPLEMENTS_DIRECTIVE14=null;
		Token CLASS_DESCRIPTOR15=null;

		CommonTree IMPLEMENTS_DIRECTIVE14_tree=null;
		CommonTree CLASS_DESCRIPTOR15_tree=null;
		RewriteRuleTokenStream stream_IMPLEMENTS_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS_DIRECTIVE");
		RewriteRuleTokenStream stream_CLASS_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token CLASS_DESCRIPTOR");

		try {
			// smaliParser.g:473:3: ( IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR -> ^( I_IMPLEMENTS[$start, \"I_IMPLEMENTS\"] CLASS_DESCRIPTOR ) )
			// smaliParser.g:473:5: IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR
			{
			IMPLEMENTS_DIRECTIVE14=(Token)match(input,IMPLEMENTS_DIRECTIVE,FOLLOW_IMPLEMENTS_DIRECTIVE_in_implements_spec1324);  
			stream_IMPLEMENTS_DIRECTIVE.add(IMPLEMENTS_DIRECTIVE14);

			CLASS_DESCRIPTOR15=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_implements_spec1326);  
			stream_CLASS_DESCRIPTOR.add(CLASS_DESCRIPTOR15);

			// AST REWRITE
			// elements: CLASS_DESCRIPTOR
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 473:43: -> ^( I_IMPLEMENTS[$start, \"I_IMPLEMENTS\"] CLASS_DESCRIPTOR )
			{
				// smaliParser.g:473:46: ^( I_IMPLEMENTS[$start, \"I_IMPLEMENTS\"] CLASS_DESCRIPTOR )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_IMPLEMENTS, (retval.start), "I_IMPLEMENTS"), root_1);
				adaptor.addChild(root_1, stream_CLASS_DESCRIPTOR.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "implements_spec"


	public static class source_spec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "source_spec"
	// smaliParser.g:475:1: source_spec : SOURCE_DIRECTIVE STRING_LITERAL -> ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL ) ;
	public final smaliParser.source_spec_return source_spec() throws RecognitionException {
		smaliParser.source_spec_return retval = new smaliParser.source_spec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SOURCE_DIRECTIVE16=null;
		Token STRING_LITERAL17=null;

		CommonTree SOURCE_DIRECTIVE16_tree=null;
		CommonTree STRING_LITERAL17_tree=null;
		RewriteRuleTokenStream stream_SOURCE_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token SOURCE_DIRECTIVE");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

		try {
			// smaliParser.g:476:3: ( SOURCE_DIRECTIVE STRING_LITERAL -> ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL ) )
			// smaliParser.g:476:5: SOURCE_DIRECTIVE STRING_LITERAL
			{
			SOURCE_DIRECTIVE16=(Token)match(input,SOURCE_DIRECTIVE,FOLLOW_SOURCE_DIRECTIVE_in_source_spec1345);  
			stream_SOURCE_DIRECTIVE.add(SOURCE_DIRECTIVE16);

			STRING_LITERAL17=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_source_spec1347);  
			stream_STRING_LITERAL.add(STRING_LITERAL17);

			// AST REWRITE
			// elements: STRING_LITERAL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 476:37: -> ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL )
			{
				// smaliParser.g:476:40: ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SOURCE, (retval.start), "I_SOURCE"), root_1);
				adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "source_spec"


	public static class access_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "access_list"
	// smaliParser.g:478:1: access_list : ( ACCESS_SPEC )* -> ^( I_ACCESS_LIST[$start,\"I_ACCESS_LIST\"] ( ACCESS_SPEC )* ) ;
	public final smaliParser.access_list_return access_list() throws RecognitionException {
		smaliParser.access_list_return retval = new smaliParser.access_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ACCESS_SPEC18=null;

		CommonTree ACCESS_SPEC18_tree=null;
		RewriteRuleTokenStream stream_ACCESS_SPEC=new RewriteRuleTokenStream(adaptor,"token ACCESS_SPEC");

		try {
			// smaliParser.g:479:3: ( ( ACCESS_SPEC )* -> ^( I_ACCESS_LIST[$start,\"I_ACCESS_LIST\"] ( ACCESS_SPEC )* ) )
			// smaliParser.g:479:5: ( ACCESS_SPEC )*
			{
			// smaliParser.g:479:5: ( ACCESS_SPEC )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ACCESS_SPEC) ) {
					int LA2_2 = input.LA(2);
					if ( (LA2_2==ACCESS_SPEC||LA2_2==ANNOTATION_VISIBILITY||LA2_2==BOOL_LITERAL||LA2_2==CLASS_DESCRIPTOR||LA2_2==DOUBLE_LITERAL_OR_ID||LA2_2==FLOAT_LITERAL_OR_ID||(LA2_2 >= INSTRUCTION_FORMAT10t && LA2_2 <= INSTRUCTION_FORMAT10x_ODEX)||LA2_2==INSTRUCTION_FORMAT11x||LA2_2==INSTRUCTION_FORMAT12x_OR_ID||(LA2_2 >= INSTRUCTION_FORMAT21c_FIELD && LA2_2 <= INSTRUCTION_FORMAT21c_TYPE)||LA2_2==INSTRUCTION_FORMAT21t||(LA2_2 >= INSTRUCTION_FORMAT22c_FIELD && LA2_2 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA2_2 >= INSTRUCTION_FORMAT22s_OR_ID && LA2_2 <= INSTRUCTION_FORMAT22t)||LA2_2==INSTRUCTION_FORMAT23x||(LA2_2 >= INSTRUCTION_FORMAT31i_OR_ID && LA2_2 <= INSTRUCTION_FORMAT31t)||(LA2_2 >= INSTRUCTION_FORMAT35c_CALL_SITE && LA2_2 <= INSTRUCTION_FORMAT35ms_METHOD)||(LA2_2 >= INSTRUCTION_FORMAT45cc_METHOD && LA2_2 <= INSTRUCTION_FORMAT51l)||LA2_2==MEMBER_NAME||(LA2_2 >= METHOD_HANDLE_TYPE_FIELD && LA2_2 <= NULL_LITERAL)||(LA2_2 >= PARAM_LIST_OR_ID_PRIMITIVE_TYPE && LA2_2 <= PRIMITIVE_TYPE)||LA2_2==REGISTER||LA2_2==SIMPLE_NAME||(LA2_2 >= VERIFICATION_ERROR_TYPE && LA2_2 <= VOID_TYPE)) ) {
						alt2=1;
					}

				}

				switch (alt2) {
				case 1 :
					// smaliParser.g:479:5: ACCESS_SPEC
					{
					ACCESS_SPEC18=(Token)match(input,ACCESS_SPEC,FOLLOW_ACCESS_SPEC_in_access_list1366);  
					stream_ACCESS_SPEC.add(ACCESS_SPEC18);

					}
					break;

				default :
					break loop2;
				}
			}

			// AST REWRITE
			// elements: ACCESS_SPEC
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 479:18: -> ^( I_ACCESS_LIST[$start,\"I_ACCESS_LIST\"] ( ACCESS_SPEC )* )
			{
				// smaliParser.g:479:21: ^( I_ACCESS_LIST[$start,\"I_ACCESS_LIST\"] ( ACCESS_SPEC )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ACCESS_LIST, (retval.start), "I_ACCESS_LIST"), root_1);
				// smaliParser.g:479:61: ( ACCESS_SPEC )*
				while ( stream_ACCESS_SPEC.hasNext() ) {
					adaptor.addChild(root_1, stream_ACCESS_SPEC.nextNode());
				}
				stream_ACCESS_SPEC.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "access_list"


	public static class field_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "field"
	// smaliParser.g:486:1: field : FIELD_DIRECTIVE access_list member_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( ({...}? annotation )* ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) ) ) ;
	public final smaliParser.field_return field() throws RecognitionException {
		smaliParser.field_return retval = new smaliParser.field_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FIELD_DIRECTIVE19=null;
		Token COLON22=null;
		Token EQUAL24=null;
		Token END_FIELD_DIRECTIVE27=null;
		ParserRuleReturnScope access_list20 =null;
		ParserRuleReturnScope member_name21 =null;
		ParserRuleReturnScope nonvoid_type_descriptor23 =null;
		ParserRuleReturnScope literal25 =null;
		ParserRuleReturnScope annotation26 =null;

		CommonTree FIELD_DIRECTIVE19_tree=null;
		CommonTree COLON22_tree=null;
		CommonTree EQUAL24_tree=null;
		CommonTree END_FIELD_DIRECTIVE27_tree=null;
		RewriteRuleTokenStream stream_END_FIELD_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_FIELD_DIRECTIVE");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleTokenStream stream_FIELD_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token FIELD_DIRECTIVE");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_access_list=new RewriteRuleSubtreeStream(adaptor,"rule access_list");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");
		RewriteRuleSubtreeStream stream_member_name=new RewriteRuleSubtreeStream(adaptor,"rule member_name");
		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		List<CommonTree> annotations = new ArrayList<CommonTree>();
		try {
			// smaliParser.g:488:3: ( FIELD_DIRECTIVE access_list member_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( ({...}? annotation )* ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) ) ) )
			// smaliParser.g:488:5: FIELD_DIRECTIVE access_list member_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( ({...}? annotation )* ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) ) )
			{
			FIELD_DIRECTIVE19=(Token)match(input,FIELD_DIRECTIVE,FOLLOW_FIELD_DIRECTIVE_in_field1397);  
			stream_FIELD_DIRECTIVE.add(FIELD_DIRECTIVE19);

			pushFollow(FOLLOW_access_list_in_field1399);
			access_list20=access_list();
			state._fsp--;

			stream_access_list.add(access_list20.getTree());
			pushFollow(FOLLOW_member_name_in_field1401);
			member_name21=member_name();
			state._fsp--;

			stream_member_name.add(member_name21.getTree());
			COLON22=(Token)match(input,COLON,FOLLOW_COLON_in_field1403);  
			stream_COLON.add(COLON22);

			pushFollow(FOLLOW_nonvoid_type_descriptor_in_field1405);
			nonvoid_type_descriptor23=nonvoid_type_descriptor();
			state._fsp--;

			stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor23.getTree());
			// smaliParser.g:488:75: ( EQUAL literal )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==EQUAL) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// smaliParser.g:488:76: EQUAL literal
					{
					EQUAL24=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_field1408);  
					stream_EQUAL.add(EQUAL24);

					pushFollow(FOLLOW_literal_in_field1410);
					literal25=literal();
					state._fsp--;

					stream_literal.add(literal25.getTree());
					}
					break;

			}

			// smaliParser.g:489:5: ( ({...}? annotation )* ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) ) )
			// smaliParser.g:489:7: ({...}? annotation )* ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) )
			{
			// smaliParser.g:489:7: ({...}? annotation )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ANNOTATION_DIRECTIVE) ) {
					int LA4_9 = input.LA(2);
					if ( ((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {
						alt4=1;
					}

				}

				switch (alt4) {
				case 1 :
					// smaliParser.g:489:8: {...}? annotation
					{
					if ( !((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {
						throw new FailedPredicateException(input, "field", "input.LA(1) == ANNOTATION_DIRECTIVE");
					}
					pushFollow(FOLLOW_annotation_in_field1423);
					annotation26=annotation();
					state._fsp--;

					stream_annotation.add(annotation26.getTree());
					annotations.add((annotation26!=null?((CommonTree)annotation26.getTree()):null));
					}
					break;

				default :
					break loop4;
				}
			}

			// smaliParser.g:490:7: ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==END_FIELD_DIRECTIVE) ) {
				alt5=1;
			}
			else if ( (LA5_0==EOF||LA5_0==ANNOTATION_DIRECTIVE||LA5_0==CLASS_DIRECTIVE||LA5_0==FIELD_DIRECTIVE||LA5_0==IMPLEMENTS_DIRECTIVE||LA5_0==METHOD_DIRECTIVE||LA5_0==SOURCE_DIRECTIVE||LA5_0==SUPER_DIRECTIVE) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// smaliParser.g:490:9: END_FIELD_DIRECTIVE
					{
					END_FIELD_DIRECTIVE27=(Token)match(input,END_FIELD_DIRECTIVE,FOLLOW_END_FIELD_DIRECTIVE_in_field1437);  
					stream_END_FIELD_DIRECTIVE.add(END_FIELD_DIRECTIVE27);

					// AST REWRITE
					// elements: nonvoid_type_descriptor, literal, access_list, annotation, member_name
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 491:9: -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) )
					{
						// smaliParser.g:491:12: ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD, (retval.start), "I_FIELD"), root_1);
						adaptor.addChild(root_1, stream_member_name.nextTree());
						adaptor.addChild(root_1, stream_access_list.nextTree());
						// smaliParser.g:491:65: ^( I_FIELD_TYPE nonvoid_type_descriptor )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD_TYPE, "I_FIELD_TYPE"), root_2);
						adaptor.addChild(root_2, stream_nonvoid_type_descriptor.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// smaliParser.g:491:105: ( ^( I_FIELD_INITIAL_VALUE literal ) )?
						if ( stream_literal.hasNext() ) {
							// smaliParser.g:491:105: ^( I_FIELD_INITIAL_VALUE literal )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD_INITIAL_VALUE, "I_FIELD_INITIAL_VALUE"), root_2);
							adaptor.addChild(root_2, stream_literal.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_literal.reset();

						// smaliParser.g:491:139: ^( I_ANNOTATIONS ( annotation )* )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATIONS, "I_ANNOTATIONS"), root_2);
						// smaliParser.g:491:155: ( annotation )*
						while ( stream_annotation.hasNext() ) {
							adaptor.addChild(root_2, stream_annotation.nextTree());
						}
						stream_annotation.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// smaliParser.g:492:21: 
					{
					smali_file_stack.peek().classAnnotations.addAll(annotations);
					// AST REWRITE
					// elements: member_name, access_list, literal, nonvoid_type_descriptor
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 493:9: -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) )
					{
						// smaliParser.g:493:12: ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD, (retval.start), "I_FIELD"), root_1);
						adaptor.addChild(root_1, stream_member_name.nextTree());
						adaptor.addChild(root_1, stream_access_list.nextTree());
						// smaliParser.g:493:65: ^( I_FIELD_TYPE nonvoid_type_descriptor )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD_TYPE, "I_FIELD_TYPE"), root_2);
						adaptor.addChild(root_2, stream_nonvoid_type_descriptor.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// smaliParser.g:493:105: ( ^( I_FIELD_INITIAL_VALUE literal ) )?
						if ( stream_literal.hasNext() ) {
							// smaliParser.g:493:105: ^( I_FIELD_INITIAL_VALUE literal )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD_INITIAL_VALUE, "I_FIELD_INITIAL_VALUE"), root_2);
							adaptor.addChild(root_2, stream_literal.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_literal.reset();

						// smaliParser.g:493:139: ^( I_ANNOTATIONS )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATIONS, "I_ANNOTATIONS"), root_2);
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field"


	public static class method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "method"
	// smaliParser.g:497:1: method : METHOD_DIRECTIVE access_list member_name method_prototype statements_and_directives END_METHOD_DIRECTIVE -> ^( I_METHOD[$start, \"I_METHOD\"] member_name method_prototype access_list statements_and_directives ) ;
	public final smaliParser.method_return method() throws RecognitionException {
		smaliParser.method_return retval = new smaliParser.method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token METHOD_DIRECTIVE28=null;
		Token END_METHOD_DIRECTIVE33=null;
		ParserRuleReturnScope access_list29 =null;
		ParserRuleReturnScope member_name30 =null;
		ParserRuleReturnScope method_prototype31 =null;
		ParserRuleReturnScope statements_and_directives32 =null;

		CommonTree METHOD_DIRECTIVE28_tree=null;
		CommonTree END_METHOD_DIRECTIVE33_tree=null;
		RewriteRuleTokenStream stream_END_METHOD_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_METHOD_DIRECTIVE");
		RewriteRuleTokenStream stream_METHOD_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token METHOD_DIRECTIVE");
		RewriteRuleSubtreeStream stream_method_prototype=new RewriteRuleSubtreeStream(adaptor,"rule method_prototype");
		RewriteRuleSubtreeStream stream_access_list=new RewriteRuleSubtreeStream(adaptor,"rule access_list");
		RewriteRuleSubtreeStream stream_member_name=new RewriteRuleSubtreeStream(adaptor,"rule member_name");
		RewriteRuleSubtreeStream stream_statements_and_directives=new RewriteRuleSubtreeStream(adaptor,"rule statements_and_directives");

		try {
			// smaliParser.g:498:3: ( METHOD_DIRECTIVE access_list member_name method_prototype statements_and_directives END_METHOD_DIRECTIVE -> ^( I_METHOD[$start, \"I_METHOD\"] member_name method_prototype access_list statements_and_directives ) )
			// smaliParser.g:498:5: METHOD_DIRECTIVE access_list member_name method_prototype statements_and_directives END_METHOD_DIRECTIVE
			{
			METHOD_DIRECTIVE28=(Token)match(input,METHOD_DIRECTIVE,FOLLOW_METHOD_DIRECTIVE_in_method1548);  
			stream_METHOD_DIRECTIVE.add(METHOD_DIRECTIVE28);

			pushFollow(FOLLOW_access_list_in_method1550);
			access_list29=access_list();
			state._fsp--;

			stream_access_list.add(access_list29.getTree());
			pushFollow(FOLLOW_member_name_in_method1552);
			member_name30=member_name();
			state._fsp--;

			stream_member_name.add(member_name30.getTree());
			pushFollow(FOLLOW_method_prototype_in_method1554);
			method_prototype31=method_prototype();
			state._fsp--;

			stream_method_prototype.add(method_prototype31.getTree());
			pushFollow(FOLLOW_statements_and_directives_in_method1556);
			statements_and_directives32=statements_and_directives();
			state._fsp--;

			stream_statements_and_directives.add(statements_and_directives32.getTree());
			END_METHOD_DIRECTIVE33=(Token)match(input,END_METHOD_DIRECTIVE,FOLLOW_END_METHOD_DIRECTIVE_in_method1562);  
			stream_END_METHOD_DIRECTIVE.add(END_METHOD_DIRECTIVE33);

			// AST REWRITE
			// elements: method_prototype, member_name, access_list, statements_and_directives
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 500:5: -> ^( I_METHOD[$start, \"I_METHOD\"] member_name method_prototype access_list statements_and_directives )
			{
				// smaliParser.g:500:8: ^( I_METHOD[$start, \"I_METHOD\"] member_name method_prototype access_list statements_and_directives )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_METHOD, (retval.start), "I_METHOD"), root_1);
				adaptor.addChild(root_1, stream_member_name.nextTree());
				adaptor.addChild(root_1, stream_method_prototype.nextTree());
				adaptor.addChild(root_1, stream_access_list.nextTree());
				adaptor.addChild(root_1, stream_statements_and_directives.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "method"


	protected static class statements_and_directives_scope {
		boolean hasRegistersDirective;
		List<CommonTree> methodAnnotations;
	}
	protected Stack<statements_and_directives_scope> statements_and_directives_stack = new Stack<statements_and_directives_scope>();

	public static class statements_and_directives_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statements_and_directives"
	// smaliParser.g:502:1: statements_and_directives : ( ordered_method_item | registers_directive | catch_directive | catchall_directive | parameter_directive | annotation )* -> ( registers_directive )? ^( I_ORDERED_METHOD_ITEMS ( ordered_method_item )* ) ^( I_CATCHES ( catch_directive )* ( catchall_directive )* ) ^( I_PARAMETERS ( parameter_directive )* ) ;
	public final smaliParser.statements_and_directives_return statements_and_directives() throws RecognitionException {
		statements_and_directives_stack.push(new statements_and_directives_scope());
		smaliParser.statements_and_directives_return retval = new smaliParser.statements_and_directives_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope ordered_method_item34 =null;
		ParserRuleReturnScope registers_directive35 =null;
		ParserRuleReturnScope catch_directive36 =null;
		ParserRuleReturnScope catchall_directive37 =null;
		ParserRuleReturnScope parameter_directive38 =null;
		ParserRuleReturnScope annotation39 =null;

		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_catchall_directive=new RewriteRuleSubtreeStream(adaptor,"rule catchall_directive");
		RewriteRuleSubtreeStream stream_registers_directive=new RewriteRuleSubtreeStream(adaptor,"rule registers_directive");
		RewriteRuleSubtreeStream stream_catch_directive=new RewriteRuleSubtreeStream(adaptor,"rule catch_directive");
		RewriteRuleSubtreeStream stream_ordered_method_item=new RewriteRuleSubtreeStream(adaptor,"rule ordered_method_item");
		RewriteRuleSubtreeStream stream_parameter_directive=new RewriteRuleSubtreeStream(adaptor,"rule parameter_directive");

		try {
			// smaliParser.g:508:3: ( ( ordered_method_item | registers_directive | catch_directive | catchall_directive | parameter_directive | annotation )* -> ( registers_directive )? ^( I_ORDERED_METHOD_ITEMS ( ordered_method_item )* ) ^( I_CATCHES ( catch_directive )* ( catchall_directive )* ) ^( I_PARAMETERS ( parameter_directive )* ) )
			// smaliParser.g:508:5: ( ordered_method_item | registers_directive | catch_directive | catchall_directive | parameter_directive | annotation )*
			{

			      statements_and_directives_stack.peek().hasRegistersDirective = false;
			      statements_and_directives_stack.peek().methodAnnotations = new ArrayList<CommonTree>();
			    
			// smaliParser.g:512:5: ( ordered_method_item | registers_directive | catch_directive | catchall_directive | parameter_directive | annotation )*
			loop6:
			while (true) {
				int alt6=7;
				switch ( input.LA(1) ) {
				case ARRAY_DATA_DIRECTIVE:
				case COLON:
				case END_LOCAL_DIRECTIVE:
				case EPILOGUE_DIRECTIVE:
				case INSTRUCTION_FORMAT10t:
				case INSTRUCTION_FORMAT10x:
				case INSTRUCTION_FORMAT10x_ODEX:
				case INSTRUCTION_FORMAT11n:
				case INSTRUCTION_FORMAT11x:
				case INSTRUCTION_FORMAT12x:
				case INSTRUCTION_FORMAT12x_OR_ID:
				case INSTRUCTION_FORMAT20bc:
				case INSTRUCTION_FORMAT20t:
				case INSTRUCTION_FORMAT21c_FIELD:
				case INSTRUCTION_FORMAT21c_FIELD_ODEX:
				case INSTRUCTION_FORMAT21c_METHOD_HANDLE:
				case INSTRUCTION_FORMAT21c_METHOD_TYPE:
				case INSTRUCTION_FORMAT21c_STRING:
				case INSTRUCTION_FORMAT21c_TYPE:
				case INSTRUCTION_FORMAT21ih:
				case INSTRUCTION_FORMAT21lh:
				case INSTRUCTION_FORMAT21s:
				case INSTRUCTION_FORMAT21t:
				case INSTRUCTION_FORMAT22b:
				case INSTRUCTION_FORMAT22c_FIELD:
				case INSTRUCTION_FORMAT22c_FIELD_ODEX:
				case INSTRUCTION_FORMAT22c_TYPE:
				case INSTRUCTION_FORMAT22cs_FIELD:
				case INSTRUCTION_FORMAT22s:
				case INSTRUCTION_FORMAT22s_OR_ID:
				case INSTRUCTION_FORMAT22t:
				case INSTRUCTION_FORMAT22x:
				case INSTRUCTION_FORMAT23x:
				case INSTRUCTION_FORMAT30t:
				case INSTRUCTION_FORMAT31c:
				case INSTRUCTION_FORMAT31i:
				case INSTRUCTION_FORMAT31i_OR_ID:
				case INSTRUCTION_FORMAT31t:
				case INSTRUCTION_FORMAT32x:
				case INSTRUCTION_FORMAT35c_CALL_SITE:
				case INSTRUCTION_FORMAT35c_METHOD:
				case INSTRUCTION_FORMAT35c_METHOD_ODEX:
				case INSTRUCTION_FORMAT35c_TYPE:
				case INSTRUCTION_FORMAT35mi_METHOD:
				case INSTRUCTION_FORMAT35ms_METHOD:
				case INSTRUCTION_FORMAT3rc_CALL_SITE:
				case INSTRUCTION_FORMAT3rc_METHOD:
				case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
				case INSTRUCTION_FORMAT3rc_TYPE:
				case INSTRUCTION_FORMAT3rmi_METHOD:
				case INSTRUCTION_FORMAT3rms_METHOD:
				case INSTRUCTION_FORMAT45cc_METHOD:
				case INSTRUCTION_FORMAT4rcc_METHOD:
				case INSTRUCTION_FORMAT51l:
				case LINE_DIRECTIVE:
				case LOCAL_DIRECTIVE:
				case PACKED_SWITCH_DIRECTIVE:
				case PROLOGUE_DIRECTIVE:
				case RESTART_LOCAL_DIRECTIVE:
				case SOURCE_DIRECTIVE:
				case SPARSE_SWITCH_DIRECTIVE:
					{
					alt6=1;
					}
					break;
				case LOCALS_DIRECTIVE:
				case REGISTERS_DIRECTIVE:
					{
					alt6=2;
					}
					break;
				case CATCH_DIRECTIVE:
					{
					alt6=3;
					}
					break;
				case CATCHALL_DIRECTIVE:
					{
					alt6=4;
					}
					break;
				case PARAMETER_DIRECTIVE:
					{
					alt6=5;
					}
					break;
				case ANNOTATION_DIRECTIVE:
					{
					alt6=6;
					}
					break;
				}
				switch (alt6) {
				case 1 :
					// smaliParser.g:512:7: ordered_method_item
					{
					pushFollow(FOLLOW_ordered_method_item_in_statements_and_directives1607);
					ordered_method_item34=ordered_method_item();
					state._fsp--;

					stream_ordered_method_item.add(ordered_method_item34.getTree());
					}
					break;
				case 2 :
					// smaliParser.g:513:7: registers_directive
					{
					pushFollow(FOLLOW_registers_directive_in_statements_and_directives1615);
					registers_directive35=registers_directive();
					state._fsp--;

					stream_registers_directive.add(registers_directive35.getTree());
					}
					break;
				case 3 :
					// smaliParser.g:514:7: catch_directive
					{
					pushFollow(FOLLOW_catch_directive_in_statements_and_directives1623);
					catch_directive36=catch_directive();
					state._fsp--;

					stream_catch_directive.add(catch_directive36.getTree());
					}
					break;
				case 4 :
					// smaliParser.g:515:7: catchall_directive
					{
					pushFollow(FOLLOW_catchall_directive_in_statements_and_directives1631);
					catchall_directive37=catchall_directive();
					state._fsp--;

					stream_catchall_directive.add(catchall_directive37.getTree());
					}
					break;
				case 5 :
					// smaliParser.g:516:7: parameter_directive
					{
					pushFollow(FOLLOW_parameter_directive_in_statements_and_directives1639);
					parameter_directive38=parameter_directive();
					state._fsp--;

					stream_parameter_directive.add(parameter_directive38.getTree());
					}
					break;
				case 6 :
					// smaliParser.g:517:7: annotation
					{
					pushFollow(FOLLOW_annotation_in_statements_and_directives1647);
					annotation39=annotation();
					state._fsp--;

					stream_annotation.add(annotation39.getTree());
					statements_and_directives_stack.peek().methodAnnotations.add((annotation39!=null?((CommonTree)annotation39.getTree()):null));
					}
					break;

				default :
					break loop6;
				}
			}

			// AST REWRITE
			// elements: parameter_directive, catchall_directive, registers_directive, ordered_method_item, catch_directive
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 519:5: -> ( registers_directive )? ^( I_ORDERED_METHOD_ITEMS ( ordered_method_item )* ) ^( I_CATCHES ( catch_directive )* ( catchall_directive )* ) ^( I_PARAMETERS ( parameter_directive )* )
			{
				// smaliParser.g:519:8: ( registers_directive )?
				if ( stream_registers_directive.hasNext() ) {
					adaptor.addChild(root_0, stream_registers_directive.nextTree());
				}
				stream_registers_directive.reset();

				// smaliParser.g:520:8: ^( I_ORDERED_METHOD_ITEMS ( ordered_method_item )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ORDERED_METHOD_ITEMS, "I_ORDERED_METHOD_ITEMS"), root_1);
				// smaliParser.g:520:33: ( ordered_method_item )*
				while ( stream_ordered_method_item.hasNext() ) {
					adaptor.addChild(root_1, stream_ordered_method_item.nextTree());
				}
				stream_ordered_method_item.reset();

				adaptor.addChild(root_0, root_1);
				}

				// smaliParser.g:521:8: ^( I_CATCHES ( catch_directive )* ( catchall_directive )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_CATCHES, "I_CATCHES"), root_1);
				// smaliParser.g:521:20: ( catch_directive )*
				while ( stream_catch_directive.hasNext() ) {
					adaptor.addChild(root_1, stream_catch_directive.nextTree());
				}
				stream_catch_directive.reset();

				// smaliParser.g:521:37: ( catchall_directive )*
				while ( stream_catchall_directive.hasNext() ) {
					adaptor.addChild(root_1, stream_catchall_directive.nextTree());
				}
				stream_catchall_directive.reset();

				adaptor.addChild(root_0, root_1);
				}

				// smaliParser.g:522:8: ^( I_PARAMETERS ( parameter_directive )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PARAMETERS, "I_PARAMETERS"), root_1);
				// smaliParser.g:522:23: ( parameter_directive )*
				while ( stream_parameter_directive.hasNext() ) {
					adaptor.addChild(root_1, stream_parameter_directive.nextTree());
				}
				stream_parameter_directive.reset();

				adaptor.addChild(root_0, root_1);
				}

				adaptor.addChild(root_0, buildTree(I_ANNOTATIONS, "I_ANNOTATIONS", statements_and_directives_stack.peek().methodAnnotations));
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			statements_and_directives_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "statements_and_directives"


	public static class ordered_method_item_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ordered_method_item"
	// smaliParser.g:526:1: ordered_method_item : ( label | instruction | debug_directive );
	public final smaliParser.ordered_method_item_return ordered_method_item() throws RecognitionException {
		smaliParser.ordered_method_item_return retval = new smaliParser.ordered_method_item_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope label40 =null;
		ParserRuleReturnScope instruction41 =null;
		ParserRuleReturnScope debug_directive42 =null;


		try {
			// smaliParser.g:527:3: ( label | instruction | debug_directive )
			int alt7=3;
			switch ( input.LA(1) ) {
			case COLON:
				{
				alt7=1;
				}
				break;
			case ARRAY_DATA_DIRECTIVE:
			case INSTRUCTION_FORMAT10t:
			case INSTRUCTION_FORMAT10x:
			case INSTRUCTION_FORMAT10x_ODEX:
			case INSTRUCTION_FORMAT11n:
			case INSTRUCTION_FORMAT11x:
			case INSTRUCTION_FORMAT12x:
			case INSTRUCTION_FORMAT12x_OR_ID:
			case INSTRUCTION_FORMAT20bc:
			case INSTRUCTION_FORMAT20t:
			case INSTRUCTION_FORMAT21c_FIELD:
			case INSTRUCTION_FORMAT21c_FIELD_ODEX:
			case INSTRUCTION_FORMAT21c_METHOD_HANDLE:
			case INSTRUCTION_FORMAT21c_METHOD_TYPE:
			case INSTRUCTION_FORMAT21c_STRING:
			case INSTRUCTION_FORMAT21c_TYPE:
			case INSTRUCTION_FORMAT21ih:
			case INSTRUCTION_FORMAT21lh:
			case INSTRUCTION_FORMAT21s:
			case INSTRUCTION_FORMAT21t:
			case INSTRUCTION_FORMAT22b:
			case INSTRUCTION_FORMAT22c_FIELD:
			case INSTRUCTION_FORMAT22c_FIELD_ODEX:
			case INSTRUCTION_FORMAT22c_TYPE:
			case INSTRUCTION_FORMAT22cs_FIELD:
			case INSTRUCTION_FORMAT22s:
			case INSTRUCTION_FORMAT22s_OR_ID:
			case INSTRUCTION_FORMAT22t:
			case INSTRUCTION_FORMAT22x:
			case INSTRUCTION_FORMAT23x:
			case INSTRUCTION_FORMAT30t:
			case INSTRUCTION_FORMAT31c:
			case INSTRUCTION_FORMAT31i:
			case INSTRUCTION_FORMAT31i_OR_ID:
			case INSTRUCTION_FORMAT31t:
			case INSTRUCTION_FORMAT32x:
			case INSTRUCTION_FORMAT35c_CALL_SITE:
			case INSTRUCTION_FORMAT35c_METHOD:
			case INSTRUCTION_FORMAT35c_METHOD_ODEX:
			case INSTRUCTION_FORMAT35c_TYPE:
			case INSTRUCTION_FORMAT35mi_METHOD:
			case INSTRUCTION_FORMAT35ms_METHOD:
			case INSTRUCTION_FORMAT3rc_CALL_SITE:
			case INSTRUCTION_FORMAT3rc_METHOD:
			case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
			case INSTRUCTION_FORMAT3rc_TYPE:
			case INSTRUCTION_FORMAT3rmi_METHOD:
			case INSTRUCTION_FORMAT3rms_METHOD:
			case INSTRUCTION_FORMAT45cc_METHOD:
			case INSTRUCTION_FORMAT4rcc_METHOD:
			case INSTRUCTION_FORMAT51l:
			case PACKED_SWITCH_DIRECTIVE:
			case SPARSE_SWITCH_DIRECTIVE:
				{
				alt7=2;
				}
				break;
			case END_LOCAL_DIRECTIVE:
			case EPILOGUE_DIRECTIVE:
			case LINE_DIRECTIVE:
			case LOCAL_DIRECTIVE:
			case PROLOGUE_DIRECTIVE:
			case RESTART_LOCAL_DIRECTIVE:
			case SOURCE_DIRECTIVE:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// smaliParser.g:527:5: label
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_label_in_ordered_method_item1732);
					label40=label();
					state._fsp--;

					adaptor.addChild(root_0, label40.getTree());

					}
					break;
				case 2 :
					// smaliParser.g:528:5: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_ordered_method_item1738);
					instruction41=instruction();
					state._fsp--;

					adaptor.addChild(root_0, instruction41.getTree());

					}
					break;
				case 3 :
					// smaliParser.g:529:5: debug_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_debug_directive_in_ordered_method_item1744);
					debug_directive42=debug_directive();
					state._fsp--;

					adaptor.addChild(root_0, debug_directive42.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ordered_method_item"


	public static class registers_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "registers_directive"
	// smaliParser.g:531:1: registers_directive : (directive= REGISTERS_DIRECTIVE regCount= integral_literal -> ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount) |directive= LOCALS_DIRECTIVE regCount2= integral_literal -> ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2) ) ;
	public final smaliParser.registers_directive_return registers_directive() throws RecognitionException {
		smaliParser.registers_directive_return retval = new smaliParser.registers_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token directive=null;
		ParserRuleReturnScope regCount =null;
		ParserRuleReturnScope regCount2 =null;

		CommonTree directive_tree=null;
		RewriteRuleTokenStream stream_LOCALS_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token LOCALS_DIRECTIVE");
		RewriteRuleTokenStream stream_REGISTERS_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token REGISTERS_DIRECTIVE");
		RewriteRuleSubtreeStream stream_integral_literal=new RewriteRuleSubtreeStream(adaptor,"rule integral_literal");

		try {
			// smaliParser.g:532:3: ( (directive= REGISTERS_DIRECTIVE regCount= integral_literal -> ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount) |directive= LOCALS_DIRECTIVE regCount2= integral_literal -> ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2) ) )
			// smaliParser.g:532:5: (directive= REGISTERS_DIRECTIVE regCount= integral_literal -> ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount) |directive= LOCALS_DIRECTIVE regCount2= integral_literal -> ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2) )
			{
			// smaliParser.g:532:5: (directive= REGISTERS_DIRECTIVE regCount= integral_literal -> ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount) |directive= LOCALS_DIRECTIVE regCount2= integral_literal -> ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==REGISTERS_DIRECTIVE) ) {
				alt8=1;
			}
			else if ( (LA8_0==LOCALS_DIRECTIVE) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// smaliParser.g:533:7: directive= REGISTERS_DIRECTIVE regCount= integral_literal
					{
					directive=(Token)match(input,REGISTERS_DIRECTIVE,FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive1764);  
					stream_REGISTERS_DIRECTIVE.add(directive);

					pushFollow(FOLLOW_integral_literal_in_registers_directive1768);
					regCount=integral_literal();
					state._fsp--;

					stream_integral_literal.add(regCount.getTree());
					// AST REWRITE
					// elements: regCount
					// token labels: 
					// rule labels: regCount, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_regCount=new RewriteRuleSubtreeStream(adaptor,"rule regCount",regCount!=null?regCount.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 533:63: -> ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount)
					{
						// smaliParser.g:533:66: ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_REGISTERS, directive, "I_REGISTERS"), root_1);
						adaptor.addChild(root_1, stream_regCount.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// smaliParser.g:534:7: directive= LOCALS_DIRECTIVE regCount2= integral_literal
					{
					directive=(Token)match(input,LOCALS_DIRECTIVE,FOLLOW_LOCALS_DIRECTIVE_in_registers_directive1788);  
					stream_LOCALS_DIRECTIVE.add(directive);

					pushFollow(FOLLOW_integral_literal_in_registers_directive1792);
					regCount2=integral_literal();
					state._fsp--;

					stream_integral_literal.add(regCount2.getTree());
					// AST REWRITE
					// elements: regCount2
					// token labels: 
					// rule labels: regCount2, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_regCount2=new RewriteRuleSubtreeStream(adaptor,"rule regCount2",regCount2!=null?regCount2.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 534:61: -> ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2)
					{
						// smaliParser.g:534:64: ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_LOCALS, directive, "I_LOCALS"), root_1);
						adaptor.addChild(root_1, stream_regCount2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}


			      if (statements_and_directives_stack.peek().hasRegistersDirective) {
			        throw new SemanticException(input, directive, "There can only be a single .registers or .locals directive in a method");
			      }
			      statements_and_directives_stack.peek().hasRegistersDirective =true;
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "registers_directive"


	public static class param_list_or_id_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "param_list_or_id"
	// smaliParser.g:543:1: param_list_or_id : ( PARAM_LIST_OR_ID_PRIMITIVE_TYPE )+ ;
	public final smaliParser.param_list_or_id_return param_list_or_id() throws RecognitionException {
		smaliParser.param_list_or_id_return retval = new smaliParser.param_list_or_id_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PARAM_LIST_OR_ID_PRIMITIVE_TYPE43=null;

		CommonTree PARAM_LIST_OR_ID_PRIMITIVE_TYPE43_tree=null;

		try {
			// smaliParser.g:544:3: ( ( PARAM_LIST_OR_ID_PRIMITIVE_TYPE )+ )
			// smaliParser.g:544:5: ( PARAM_LIST_OR_ID_PRIMITIVE_TYPE )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// smaliParser.g:544:5: ( PARAM_LIST_OR_ID_PRIMITIVE_TYPE )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==PARAM_LIST_OR_ID_PRIMITIVE_TYPE) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// smaliParser.g:544:5: PARAM_LIST_OR_ID_PRIMITIVE_TYPE
					{
					PARAM_LIST_OR_ID_PRIMITIVE_TYPE43=(Token)match(input,PARAM_LIST_OR_ID_PRIMITIVE_TYPE,FOLLOW_PARAM_LIST_OR_ID_PRIMITIVE_TYPE_in_param_list_or_id1824); 
					PARAM_LIST_OR_ID_PRIMITIVE_TYPE43_tree = (CommonTree)adaptor.create(PARAM_LIST_OR_ID_PRIMITIVE_TYPE43);
					adaptor.addChild(root_0, PARAM_LIST_OR_ID_PRIMITIVE_TYPE43_tree);

					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param_list_or_id"


	public static class simple_name_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simple_name"
	// smaliParser.g:548:1: simple_name : ( SIMPLE_NAME | ACCESS_SPEC -> SIMPLE_NAME[$ACCESS_SPEC] | VERIFICATION_ERROR_TYPE -> SIMPLE_NAME[$VERIFICATION_ERROR_TYPE] | POSITIVE_INTEGER_LITERAL -> SIMPLE_NAME[$POSITIVE_INTEGER_LITERAL] | NEGATIVE_INTEGER_LITERAL -> SIMPLE_NAME[$NEGATIVE_INTEGER_LITERAL] | FLOAT_LITERAL_OR_ID -> SIMPLE_NAME[$FLOAT_LITERAL_OR_ID] | DOUBLE_LITERAL_OR_ID -> SIMPLE_NAME[$DOUBLE_LITERAL_OR_ID] | BOOL_LITERAL -> SIMPLE_NAME[$BOOL_LITERAL] | NULL_LITERAL -> SIMPLE_NAME[$NULL_LITERAL] | REGISTER -> SIMPLE_NAME[$REGISTER] | param_list_or_id ->| PRIMITIVE_TYPE -> SIMPLE_NAME[$PRIMITIVE_TYPE] | VOID_TYPE -> SIMPLE_NAME[$VOID_TYPE] | ANNOTATION_VISIBILITY -> SIMPLE_NAME[$ANNOTATION_VISIBILITY] | METHOD_HANDLE_TYPE_FIELD | METHOD_HANDLE_TYPE_METHOD | INSTRUCTION_FORMAT10t -> SIMPLE_NAME[$INSTRUCTION_FORMAT10t] | INSTRUCTION_FORMAT10x -> SIMPLE_NAME[$INSTRUCTION_FORMAT10x] | INSTRUCTION_FORMAT10x_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT10x_ODEX] | INSTRUCTION_FORMAT11x -> SIMPLE_NAME[$INSTRUCTION_FORMAT11x] | INSTRUCTION_FORMAT12x_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT12x_OR_ID] | INSTRUCTION_FORMAT21c_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD] | INSTRUCTION_FORMAT21c_FIELD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD_ODEX] | INSTRUCTION_FORMAT21c_METHOD_HANDLE -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_METHOD_HANDLE] | INSTRUCTION_FORMAT21c_METHOD_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_METHOD_TYPE] | INSTRUCTION_FORMAT21c_STRING -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_STRING] | INSTRUCTION_FORMAT21c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_TYPE] | INSTRUCTION_FORMAT21t -> SIMPLE_NAME[$INSTRUCTION_FORMAT21t] | INSTRUCTION_FORMAT22c_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD] | INSTRUCTION_FORMAT22c_FIELD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD_ODEX] | INSTRUCTION_FORMAT22c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_TYPE] | INSTRUCTION_FORMAT22cs_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT22cs_FIELD] | INSTRUCTION_FORMAT22s_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT22s_OR_ID] | INSTRUCTION_FORMAT22t -> SIMPLE_NAME[$INSTRUCTION_FORMAT22t] | INSTRUCTION_FORMAT23x -> SIMPLE_NAME[$INSTRUCTION_FORMAT23x] | INSTRUCTION_FORMAT31i_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT31i_OR_ID] | INSTRUCTION_FORMAT31t -> SIMPLE_NAME[$INSTRUCTION_FORMAT31t] | INSTRUCTION_FORMAT35c_CALL_SITE -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_CALL_SITE] | INSTRUCTION_FORMAT35c_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_METHOD] | INSTRUCTION_FORMAT35c_METHOD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_METHOD_ODEX] | INSTRUCTION_FORMAT35c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_TYPE] | INSTRUCTION_FORMAT35mi_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35mi_METHOD] | INSTRUCTION_FORMAT35ms_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35ms_METHOD] | INSTRUCTION_FORMAT45cc_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT45cc_METHOD] | INSTRUCTION_FORMAT4rcc_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT4rcc_METHOD] | INSTRUCTION_FORMAT51l -> SIMPLE_NAME[$INSTRUCTION_FORMAT51l] );
	public final smaliParser.simple_name_return simple_name() throws RecognitionException {
		smaliParser.simple_name_return retval = new smaliParser.simple_name_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SIMPLE_NAME44=null;
		Token ACCESS_SPEC45=null;
		Token VERIFICATION_ERROR_TYPE46=null;
		Token POSITIVE_INTEGER_LITERAL47=null;
		Token NEGATIVE_INTEGER_LITERAL48=null;
		Token FLOAT_LITERAL_OR_ID49=null;
		Token DOUBLE_LITERAL_OR_ID50=null;
		Token BOOL_LITERAL51=null;
		Token NULL_LITERAL52=null;
		Token REGISTER53=null;
		Token PRIMITIVE_TYPE55=null;
		Token VOID_TYPE56=null;
		Token ANNOTATION_VISIBILITY57=null;
		Token METHOD_HANDLE_TYPE_FIELD58=null;
		Token METHOD_HANDLE_TYPE_METHOD59=null;
		Token INSTRUCTION_FORMAT10t60=null;
		Token INSTRUCTION_FORMAT10x61=null;
		Token INSTRUCTION_FORMAT10x_ODEX62=null;
		Token INSTRUCTION_FORMAT11x63=null;
		Token INSTRUCTION_FORMAT12x_OR_ID64=null;
		Token INSTRUCTION_FORMAT21c_FIELD65=null;
		Token INSTRUCTION_FORMAT21c_FIELD_ODEX66=null;
		Token INSTRUCTION_FORMAT21c_METHOD_HANDLE67=null;
		Token INSTRUCTION_FORMAT21c_METHOD_TYPE68=null;
		Token INSTRUCTION_FORMAT21c_STRING69=null;
		Token INSTRUCTION_FORMAT21c_TYPE70=null;
		Token INSTRUCTION_FORMAT21t71=null;
		Token INSTRUCTION_FORMAT22c_FIELD72=null;
		Token INSTRUCTION_FORMAT22c_FIELD_ODEX73=null;
		Token INSTRUCTION_FORMAT22c_TYPE74=null;
		Token INSTRUCTION_FORMAT22cs_FIELD75=null;
		Token INSTRUCTION_FORMAT22s_OR_ID76=null;
		Token INSTRUCTION_FORMAT22t77=null;
		Token INSTRUCTION_FORMAT23x78=null;
		Token INSTRUCTION_FORMAT31i_OR_ID79=null;
		Token INSTRUCTION_FORMAT31t80=null;
		Token INSTRUCTION_FORMAT35c_CALL_SITE81=null;
		Token INSTRUCTION_FORMAT35c_METHOD82=null;
		Token INSTRUCTION_FORMAT35c_METHOD_ODEX83=null;
		Token INSTRUCTION_FORMAT35c_TYPE84=null;
		Token INSTRUCTION_FORMAT35mi_METHOD85=null;
		Token INSTRUCTION_FORMAT35ms_METHOD86=null;
		Token INSTRUCTION_FORMAT45cc_METHOD87=null;
		Token INSTRUCTION_FORMAT4rcc_METHOD88=null;
		Token INSTRUCTION_FORMAT51l89=null;
		ParserRuleReturnScope param_list_or_id54 =null;

		CommonTree SIMPLE_NAME44_tree=null;
		CommonTree ACCESS_SPEC45_tree=null;
		CommonTree VERIFICATION_ERROR_TYPE46_tree=null;
		CommonTree POSITIVE_INTEGER_LITERAL47_tree=null;
		CommonTree NEGATIVE_INTEGER_LITERAL48_tree=null;
		CommonTree FLOAT_LITERAL_OR_ID49_tree=null;
		CommonTree DOUBLE_LITERAL_OR_ID50_tree=null;
		CommonTree BOOL_LITERAL51_tree=null;
		CommonTree NULL_LITERAL52_tree=null;
		CommonTree REGISTER53_tree=null;
		CommonTree PRIMITIVE_TYPE55_tree=null;
		CommonTree VOID_TYPE56_tree=null;
		CommonTree ANNOTATION_VISIBILITY57_tree=null;
		CommonTree METHOD_HANDLE_TYPE_FIELD58_tree=null;
		CommonTree METHOD_HANDLE_TYPE_METHOD59_tree=null;
		CommonTree INSTRUCTION_FORMAT10t60_tree=null;
		CommonTree INSTRUCTION_FORMAT10x61_tree=null;
		CommonTree INSTRUCTION_FORMAT10x_ODEX62_tree=null;
		CommonTree INSTRUCTION_FORMAT11x63_tree=null;
		CommonTree INSTRUCTION_FORMAT12x_OR_ID64_tree=null;
		CommonTree INSTRUCTION_FORMAT21c_FIELD65_tree=null;
		CommonTree INSTRUCTION_FORMAT21c_FIELD_ODEX66_tree=null;
		CommonTree INSTRUCTION_FORMAT21c_METHOD_HANDLE67_tree=null;
		CommonTree INSTRUCTION_FORMAT21c_METHOD_TYPE68_tree=null;
		CommonTree INSTRUCTION_FORMAT21c_STRING69_tree=null;
		CommonTree INSTRUCTION_FORMAT21c_TYPE70_tree=null;
		CommonTree INSTRUCTION_FORMAT21t71_tree=null;
		CommonTree INSTRUCTION_FORMAT22c_FIELD72_tree=null;
		CommonTree INSTRUCTION_FORMAT22c_FIELD_ODEX73_tree=null;
		CommonTree INSTRUCTION_FORMAT22c_TYPE74_tree=null;
		CommonTree INSTRUCTION_FORMAT22cs_FIELD75_tree=null;
		CommonTree INSTRUCTION_FORMAT22s_OR_ID76_tree=null;
		CommonTree INSTRUCTION_FORMAT22t77_tree=null;
		CommonTree INSTRUCTION_FORMAT23x78_tree=null;
		CommonTree INSTRUCTION_FORMAT31i_OR_ID79_tree=null;
		CommonTree INSTRUCTION_FORMAT31t80_tree=null;
		CommonTree INSTRUCTION_FORMAT35c_CALL_SITE81_tree=null;
		CommonTree INSTRUCTION_FORMAT35c_METHOD82_tree=null;
		CommonTree INSTRUCTION_FORMAT35c_METHOD_ODEX83_tree=null;
		CommonTree INSTRUCTION_FORMAT35c_TYPE84_tree=null;
		CommonTree INSTRUCTION_FORMAT35mi_METHOD85_tree=null;
		CommonTree INSTRUCTION_FORMAT35ms_METHOD86_tree=null;
		CommonTree INSTRUCTION_FORMAT45cc_METHOD87_tree=null;
		CommonTree INSTRUCTION_FORMAT4rcc_METHOD88_tree=null;
		CommonTree INSTRUCTION_FORMAT51l89_tree=null;
		RewriteRuleTokenStream stream_ANNOTATION_VISIBILITY=new RewriteRuleTokenStream(adaptor,"token ANNOTATION_VISIBILITY");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_TYPE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22t");
		RewriteRuleTokenStream stream_VOID_TYPE=new RewriteRuleTokenStream(adaptor,"token VOID_TYPE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT10t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT10t");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35mi_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35mi_METHOD");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22s_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22s_OR_ID");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22cs_FIELD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22cs_FIELD");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT12x_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT12x_OR_ID");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35ms_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35ms_METHOD");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_METHOD");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT45cc_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT45cc_METHOD");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_TYPE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT10x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT10x");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_METHOD_HANDLE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_METHOD_HANDLE");
		RewriteRuleTokenStream stream_FLOAT_LITERAL_OR_ID=new RewriteRuleTokenStream(adaptor,"token FLOAT_LITERAL_OR_ID");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_TYPE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_STRING=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_STRING");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_METHOD_ODEX=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_METHOD_ODEX");
		RewriteRuleTokenStream stream_NEGATIVE_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token NEGATIVE_INTEGER_LITERAL");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_FIELD_ODEX=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_FIELD_ODEX");
		RewriteRuleTokenStream stream_DOUBLE_LITERAL_OR_ID=new RewriteRuleTokenStream(adaptor,"token DOUBLE_LITERAL_OR_ID");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT31i_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT31i_OR_ID");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21t");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT31t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT31t");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT23x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT23x");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_CALL_SITE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_CALL_SITE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT51l=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT51l");
		RewriteRuleTokenStream stream_POSITIVE_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token POSITIVE_INTEGER_LITERAL");
		RewriteRuleTokenStream stream_BOOL_LITERAL=new RewriteRuleTokenStream(adaptor,"token BOOL_LITERAL");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT10x_ODEX=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT10x_ODEX");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_FIELD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_FIELD");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_FIELD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_FIELD");
		RewriteRuleTokenStream stream_VERIFICATION_ERROR_TYPE=new RewriteRuleTokenStream(adaptor,"token VERIFICATION_ERROR_TYPE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT11x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT11x");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_METHOD_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_METHOD_TYPE");
		RewriteRuleTokenStream stream_ACCESS_SPEC=new RewriteRuleTokenStream(adaptor,"token ACCESS_SPEC");
		RewriteRuleTokenStream stream_NULL_LITERAL=new RewriteRuleTokenStream(adaptor,"token NULL_LITERAL");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT4rcc_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT4rcc_METHOD");
		RewriteRuleTokenStream stream_PRIMITIVE_TYPE=new RewriteRuleTokenStream(adaptor,"token PRIMITIVE_TYPE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_FIELD_ODEX=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_FIELD_ODEX");
		RewriteRuleSubtreeStream stream_param_list_or_id=new RewriteRuleSubtreeStream(adaptor,"rule param_list_or_id");

		try {
			// smaliParser.g:549:3: ( SIMPLE_NAME | ACCESS_SPEC -> SIMPLE_NAME[$ACCESS_SPEC] | VERIFICATION_ERROR_TYPE -> SIMPLE_NAME[$VERIFICATION_ERROR_TYPE] | POSITIVE_INTEGER_LITERAL -> SIMPLE_NAME[$POSITIVE_INTEGER_LITERAL] | NEGATIVE_INTEGER_LITERAL -> SIMPLE_NAME[$NEGATIVE_INTEGER_LITERAL] | FLOAT_LITERAL_OR_ID -> SIMPLE_NAME[$FLOAT_LITERAL_OR_ID] | DOUBLE_LITERAL_OR_ID -> SIMPLE_NAME[$DOUBLE_LITERAL_OR_ID] | BOOL_LITERAL -> SIMPLE_NAME[$BOOL_LITERAL] | NULL_LITERAL -> SIMPLE_NAME[$NULL_LITERAL] | REGISTER -> SIMPLE_NAME[$REGISTER] | param_list_or_id ->| PRIMITIVE_TYPE -> SIMPLE_NAME[$PRIMITIVE_TYPE] | VOID_TYPE -> SIMPLE_NAME[$VOID_TYPE] | ANNOTATION_VISIBILITY -> SIMPLE_NAME[$ANNOTATION_VISIBILITY] | METHOD_HANDLE_TYPE_FIELD | METHOD_HANDLE_TYPE_METHOD | INSTRUCTION_FORMAT10t -> SIMPLE_NAME[$INSTRUCTION_FORMAT10t] | INSTRUCTION_FORMAT10x -> SIMPLE_NAME[$INSTRUCTION_FORMAT10x] | INSTRUCTION_FORMAT10x_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT10x_ODEX] | INSTRUCTION_FORMAT11x -> SIMPLE_NAME[$INSTRUCTION_FORMAT11x] | INSTRUCTION_FORMAT12x_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT12x_OR_ID] | INSTRUCTION_FORMAT21c_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD] | INSTRUCTION_FORMAT21c_FIELD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD_ODEX] | INSTRUCTION_FORMAT21c_METHOD_HANDLE -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_METHOD_HANDLE] | INSTRUCTION_FORMAT21c_METHOD_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_METHOD_TYPE] | INSTRUCTION_FORMAT21c_STRING -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_STRING] | INSTRUCTION_FORMAT21c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_TYPE] | INSTRUCTION_FORMAT21t -> SIMPLE_NAME[$INSTRUCTION_FORMAT21t] | INSTRUCTION_FORMAT22c_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD] | INSTRUCTION_FORMAT22c_FIELD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD_ODEX] | INSTRUCTION_FORMAT22c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_TYPE] | INSTRUCTION_FORMAT22cs_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT22cs_FIELD] | INSTRUCTION_FORMAT22s_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT22s_OR_ID] | INSTRUCTION_FORMAT22t -> SIMPLE_NAME[$INSTRUCTION_FORMAT22t] | INSTRUCTION_FORMAT23x -> SIMPLE_NAME[$INSTRUCTION_FORMAT23x] | INSTRUCTION_FORMAT31i_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT31i_OR_ID] | INSTRUCTION_FORMAT31t -> SIMPLE_NAME[$INSTRUCTION_FORMAT31t] | INSTRUCTION_FORMAT35c_CALL_SITE -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_CALL_SITE] | INSTRUCTION_FORMAT35c_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_METHOD] | INSTRUCTION_FORMAT35c_METHOD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_METHOD_ODEX] | INSTRUCTION_FORMAT35c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_TYPE] | INSTRUCTION_FORMAT35mi_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35mi_METHOD] | INSTRUCTION_FORMAT35ms_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35ms_METHOD] | INSTRUCTION_FORMAT45cc_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT45cc_METHOD] | INSTRUCTION_FORMAT4rcc_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT4rcc_METHOD] | INSTRUCTION_FORMAT51l -> SIMPLE_NAME[$INSTRUCTION_FORMAT51l] )
			int alt10=46;
			switch ( input.LA(1) ) {
			case SIMPLE_NAME:
				{
				alt10=1;
				}
				break;
			case ACCESS_SPEC:
				{
				alt10=2;
				}
				break;
			case VERIFICATION_ERROR_TYPE:
				{
				alt10=3;
				}
				break;
			case POSITIVE_INTEGER_LITERAL:
				{
				alt10=4;
				}
				break;
			case NEGATIVE_INTEGER_LITERAL:
				{
				alt10=5;
				}
				break;
			case FLOAT_LITERAL_OR_ID:
				{
				alt10=6;
				}
				break;
			case DOUBLE_LITERAL_OR_ID:
				{
				alt10=7;
				}
				break;
			case BOOL_LITERAL:
				{
				alt10=8;
				}
				break;
			case NULL_LITERAL:
				{
				alt10=9;
				}
				break;
			case REGISTER:
				{
				alt10=10;
				}
				break;
			case PARAM_LIST_OR_ID_PRIMITIVE_TYPE:
				{
				alt10=11;
				}
				break;
			case PRIMITIVE_TYPE:
				{
				alt10=12;
				}
				break;
			case VOID_TYPE:
				{
				alt10=13;
				}
				break;
			case ANNOTATION_VISIBILITY:
				{
				alt10=14;
				}
				break;
			case METHOD_HANDLE_TYPE_FIELD:
				{
				alt10=15;
				}
				break;
			case METHOD_HANDLE_TYPE_METHOD:
				{
				alt10=16;
				}
				break;
			case INSTRUCTION_FORMAT10t:
				{
				alt10=17;
				}
				break;
			case INSTRUCTION_FORMAT10x:
				{
				alt10=18;
				}
				break;
			case INSTRUCTION_FORMAT10x_ODEX:
				{
				alt10=19;
				}
				break;
			case INSTRUCTION_FORMAT11x:
				{
				alt10=20;
				}
				break;
			case INSTRUCTION_FORMAT12x_OR_ID:
				{
				alt10=21;
				}
				break;
			case INSTRUCTION_FORMAT21c_FIELD:
				{
				alt10=22;
				}
				break;
			case INSTRUCTION_FORMAT21c_FIELD_ODEX:
				{
				alt10=23;
				}
				break;
			case INSTRUCTION_FORMAT21c_METHOD_HANDLE:
				{
				alt10=24;
				}
				break;
			case INSTRUCTION_FORMAT21c_METHOD_TYPE:
				{
				alt10=25;
				}
				break;
			case INSTRUCTION_FORMAT21c_STRING:
				{
				alt10=26;
				}
				break;
			case INSTRUCTION_FORMAT21c_TYPE:
				{
				alt10=27;
				}
				break;
			case INSTRUCTION_FORMAT21t:
				{
				alt10=28;
				}
				break;
			case INSTRUCTION_FORMAT22c_FIELD:
				{
				alt10=29;
				}
				break;
			case INSTRUCTION_FORMAT22c_FIELD_ODEX:
				{
				alt10=30;
				}
				break;
			case INSTRUCTION_FORMAT22c_TYPE:
				{
				alt10=31;
				}
				break;
			case INSTRUCTION_FORMAT22cs_FIELD:
				{
				alt10=32;
				}
				break;
			case INSTRUCTION_FORMAT22s_OR_ID:
				{
				alt10=33;
				}
				break;
			case INSTRUCTION_FORMAT22t:
				{
				alt10=34;
				}
				break;
			case INSTRUCTION_FORMAT23x:
				{
				alt10=35;
				}
				break;
			case INSTRUCTION_FORMAT31i_OR_ID:
				{
				alt10=36;
				}
				break;
			case INSTRUCTION_FORMAT31t:
				{
				alt10=37;
				}
				break;
			case INSTRUCTION_FORMAT35c_CALL_SITE:
				{
				alt10=38;
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD:
				{
				alt10=39;
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD_ODEX:
				{
				alt10=40;
				}
				break;
			case INSTRUCTION_FORMAT35c_TYPE:
				{
				alt10=41;
				}
				break;
			case INSTRUCTION_FORMAT35mi_METHOD:
				{
				alt10=42;
				}
				break;
			case INSTRUCTION_FORMAT35ms_METHOD:
				{
				alt10=43;
				}
				break;
			case INSTRUCTION_FORMAT45cc_METHOD:
				{
				alt10=44;
				}
				break;
			case INSTRUCTION_FORMAT4rcc_METHOD:
				{
				alt10=45;
				}
				break;
			case INSTRUCTION_FORMAT51l:
				{
				alt10=46;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// smaliParser.g:549:5: SIMPLE_NAME
					{
					root_0 = (CommonTree)adaptor.nil();


					SIMPLE_NAME44=(Token)match(input,SIMPLE_NAME,FOLLOW_SIMPLE_NAME_in_simple_name1837); 
					SIMPLE_NAME44_tree = (CommonTree)adaptor.create(SIMPLE_NAME44);
					adaptor.addChild(root_0, SIMPLE_NAME44_tree);

					}
					break;
				case 2 :
					// smaliParser.g:550:5: ACCESS_SPEC
					{
					ACCESS_SPEC45=(Token)match(input,ACCESS_SPEC,FOLLOW_ACCESS_SPEC_in_simple_name1843);  
					stream_ACCESS_SPEC.add(ACCESS_SPEC45);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 550:17: -> SIMPLE_NAME[$ACCESS_SPEC]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, ACCESS_SPEC45));
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// smaliParser.g:551:5: VERIFICATION_ERROR_TYPE
					{
					VERIFICATION_ERROR_TYPE46=(Token)match(input,VERIFICATION_ERROR_TYPE,FOLLOW_VERIFICATION_ERROR_TYPE_in_simple_name1854);  
					stream_VERIFICATION_ERROR_TYPE.add(VERIFICATION_ERROR_TYPE46);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 551:29: -> SIMPLE_NAME[$VERIFICATION_ERROR_TYPE]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, VERIFICATION_ERROR_TYPE46));
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// smaliParser.g:552:5: POSITIVE_INTEGER_LITERAL
					{
					POSITIVE_INTEGER_LITERAL47=(Token)match(input,POSITIVE_INTEGER_LITERAL,FOLLOW_POSITIVE_INTEGER_LITERAL_in_simple_name1865);  
					stream_POSITIVE_INTEGER_LITERAL.add(POSITIVE_INTEGER_LITERAL47);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 552:30: -> SIMPLE_NAME[$POSITIVE_INTEGER_LITERAL]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, POSITIVE_INTEGER_LITERAL47));
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// smaliParser.g:553:5: NEGATIVE_INTEGER_LITERAL
					{
					NEGATIVE_INTEGER_LITERAL48=(Token)match(input,NEGATIVE_INTEGER_LITERAL,FOLLOW_NEGATIVE_INTEGER_LITERAL_in_simple_name1876);  
					stream_NEGATIVE_INTEGER_LITERAL.add(NEGATIVE_INTEGER_LITERAL48);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 553:30: -> SIMPLE_NAME[$NEGATIVE_INTEGER_LITERAL]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, NEGATIVE_INTEGER_LITERAL48));
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// smaliParser.g:554:5: FLOAT_LITERAL_OR_ID
					{
					FLOAT_LITERAL_OR_ID49=(Token)match(input,FLOAT_LITERAL_OR_ID,FOLLOW_FLOAT_LITERAL_OR_ID_in_simple_name1887);  
					stream_FLOAT_LITERAL_OR_ID.add(FLOAT_LITERAL_OR_ID49);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 554:25: -> SIMPLE_NAME[$FLOAT_LITERAL_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, FLOAT_LITERAL_OR_ID49));
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// smaliParser.g:555:5: DOUBLE_LITERAL_OR_ID
					{
					DOUBLE_LITERAL_OR_ID50=(Token)match(input,DOUBLE_LITERAL_OR_ID,FOLLOW_DOUBLE_LITERAL_OR_ID_in_simple_name1898);  
					stream_DOUBLE_LITERAL_OR_ID.add(DOUBLE_LITERAL_OR_ID50);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 555:26: -> SIMPLE_NAME[$DOUBLE_LITERAL_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, DOUBLE_LITERAL_OR_ID50));
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// smaliParser.g:556:5: BOOL_LITERAL
					{
					BOOL_LITERAL51=(Token)match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_simple_name1909);  
					stream_BOOL_LITERAL.add(BOOL_LITERAL51);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 556:18: -> SIMPLE_NAME[$BOOL_LITERAL]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, BOOL_LITERAL51));
					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// smaliParser.g:557:5: NULL_LITERAL
					{
					NULL_LITERAL52=(Token)match(input,NULL_LITERAL,FOLLOW_NULL_LITERAL_in_simple_name1920);  
					stream_NULL_LITERAL.add(NULL_LITERAL52);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 557:18: -> SIMPLE_NAME[$NULL_LITERAL]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, NULL_LITERAL52));
					}


					retval.tree = root_0;

					}
					break;
				case 10 :
					// smaliParser.g:558:5: REGISTER
					{
					REGISTER53=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_simple_name1931);  
					stream_REGISTER.add(REGISTER53);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 558:14: -> SIMPLE_NAME[$REGISTER]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, REGISTER53));
					}


					retval.tree = root_0;

					}
					break;
				case 11 :
					// smaliParser.g:559:5: param_list_or_id
					{
					pushFollow(FOLLOW_param_list_or_id_in_simple_name1942);
					param_list_or_id54=param_list_or_id();
					state._fsp--;

					stream_param_list_or_id.add(param_list_or_id54.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 559:22: ->
					{
						adaptor.addChild(root_0,  adaptor.create(SIMPLE_NAME, (param_list_or_id54!=null?input.toString(param_list_or_id54.start,param_list_or_id54.stop):null)) );
					}


					retval.tree = root_0;

					}
					break;
				case 12 :
					// smaliParser.g:560:5: PRIMITIVE_TYPE
					{
					PRIMITIVE_TYPE55=(Token)match(input,PRIMITIVE_TYPE,FOLLOW_PRIMITIVE_TYPE_in_simple_name1952);  
					stream_PRIMITIVE_TYPE.add(PRIMITIVE_TYPE55);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 560:20: -> SIMPLE_NAME[$PRIMITIVE_TYPE]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, PRIMITIVE_TYPE55));
					}


					retval.tree = root_0;

					}
					break;
				case 13 :
					// smaliParser.g:561:5: VOID_TYPE
					{
					VOID_TYPE56=(Token)match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_simple_name1963);  
					stream_VOID_TYPE.add(VOID_TYPE56);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 561:15: -> SIMPLE_NAME[$VOID_TYPE]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, VOID_TYPE56));
					}


					retval.tree = root_0;

					}
					break;
				case 14 :
					// smaliParser.g:562:5: ANNOTATION_VISIBILITY
					{
					ANNOTATION_VISIBILITY57=(Token)match(input,ANNOTATION_VISIBILITY,FOLLOW_ANNOTATION_VISIBILITY_in_simple_name1974);  
					stream_ANNOTATION_VISIBILITY.add(ANNOTATION_VISIBILITY57);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 562:27: -> SIMPLE_NAME[$ANNOTATION_VISIBILITY]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, ANNOTATION_VISIBILITY57));
					}


					retval.tree = root_0;

					}
					break;
				case 15 :
					// smaliParser.g:563:5: METHOD_HANDLE_TYPE_FIELD
					{
					root_0 = (CommonTree)adaptor.nil();


					METHOD_HANDLE_TYPE_FIELD58=(Token)match(input,METHOD_HANDLE_TYPE_FIELD,FOLLOW_METHOD_HANDLE_TYPE_FIELD_in_simple_name1985); 
					METHOD_HANDLE_TYPE_FIELD58_tree = (CommonTree)adaptor.create(METHOD_HANDLE_TYPE_FIELD58);
					adaptor.addChild(root_0, METHOD_HANDLE_TYPE_FIELD58_tree);

					}
					break;
				case 16 :
					// smaliParser.g:564:5: METHOD_HANDLE_TYPE_METHOD
					{
					root_0 = (CommonTree)adaptor.nil();


					METHOD_HANDLE_TYPE_METHOD59=(Token)match(input,METHOD_HANDLE_TYPE_METHOD,FOLLOW_METHOD_HANDLE_TYPE_METHOD_in_simple_name1991); 
					METHOD_HANDLE_TYPE_METHOD59_tree = (CommonTree)adaptor.create(METHOD_HANDLE_TYPE_METHOD59);
					adaptor.addChild(root_0, METHOD_HANDLE_TYPE_METHOD59_tree);

					}
					break;
				case 17 :
					// smaliParser.g:565:5: INSTRUCTION_FORMAT10t
					{
					INSTRUCTION_FORMAT10t60=(Token)match(input,INSTRUCTION_FORMAT10t,FOLLOW_INSTRUCTION_FORMAT10t_in_simple_name1997);  
					stream_INSTRUCTION_FORMAT10t.add(INSTRUCTION_FORMAT10t60);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 565:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT10t]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT10t60));
					}


					retval.tree = root_0;

					}
					break;
				case 18 :
					// smaliParser.g:566:5: INSTRUCTION_FORMAT10x
					{
					INSTRUCTION_FORMAT10x61=(Token)match(input,INSTRUCTION_FORMAT10x,FOLLOW_INSTRUCTION_FORMAT10x_in_simple_name2008);  
					stream_INSTRUCTION_FORMAT10x.add(INSTRUCTION_FORMAT10x61);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 566:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT10x]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT10x61));
					}


					retval.tree = root_0;

					}
					break;
				case 19 :
					// smaliParser.g:567:5: INSTRUCTION_FORMAT10x_ODEX
					{
					INSTRUCTION_FORMAT10x_ODEX62=(Token)match(input,INSTRUCTION_FORMAT10x_ODEX,FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_simple_name2019);  
					stream_INSTRUCTION_FORMAT10x_ODEX.add(INSTRUCTION_FORMAT10x_ODEX62);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 567:32: -> SIMPLE_NAME[$INSTRUCTION_FORMAT10x_ODEX]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT10x_ODEX62));
					}


					retval.tree = root_0;

					}
					break;
				case 20 :
					// smaliParser.g:568:5: INSTRUCTION_FORMAT11x
					{
					INSTRUCTION_FORMAT11x63=(Token)match(input,INSTRUCTION_FORMAT11x,FOLLOW_INSTRUCTION_FORMAT11x_in_simple_name2030);  
					stream_INSTRUCTION_FORMAT11x.add(INSTRUCTION_FORMAT11x63);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 568:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT11x]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT11x63));
					}


					retval.tree = root_0;

					}
					break;
				case 21 :
					// smaliParser.g:569:5: INSTRUCTION_FORMAT12x_OR_ID
					{
					INSTRUCTION_FORMAT12x_OR_ID64=(Token)match(input,INSTRUCTION_FORMAT12x_OR_ID,FOLLOW_INSTRUCTION_FORMAT12x_OR_ID_in_simple_name2041);  
					stream_INSTRUCTION_FORMAT12x_OR_ID.add(INSTRUCTION_FORMAT12x_OR_ID64);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 569:33: -> SIMPLE_NAME[$INSTRUCTION_FORMAT12x_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT12x_OR_ID64));
					}


					retval.tree = root_0;

					}
					break;
				case 22 :
					// smaliParser.g:570:5: INSTRUCTION_FORMAT21c_FIELD
					{
					INSTRUCTION_FORMAT21c_FIELD65=(Token)match(input,INSTRUCTION_FORMAT21c_FIELD,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_simple_name2052);  
					stream_INSTRUCTION_FORMAT21c_FIELD.add(INSTRUCTION_FORMAT21c_FIELD65);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 570:33: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21c_FIELD65));
					}


					retval.tree = root_0;

					}
					break;
				case 23 :
					// smaliParser.g:571:5: INSTRUCTION_FORMAT21c_FIELD_ODEX
					{
					INSTRUCTION_FORMAT21c_FIELD_ODEX66=(Token)match(input,INSTRUCTION_FORMAT21c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_simple_name2063);  
					stream_INSTRUCTION_FORMAT21c_FIELD_ODEX.add(INSTRUCTION_FORMAT21c_FIELD_ODEX66);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 571:38: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD_ODEX]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21c_FIELD_ODEX66));
					}


					retval.tree = root_0;

					}
					break;
				case 24 :
					// smaliParser.g:572:5: INSTRUCTION_FORMAT21c_METHOD_HANDLE
					{
					INSTRUCTION_FORMAT21c_METHOD_HANDLE67=(Token)match(input,INSTRUCTION_FORMAT21c_METHOD_HANDLE,FOLLOW_INSTRUCTION_FORMAT21c_METHOD_HANDLE_in_simple_name2074);  
					stream_INSTRUCTION_FORMAT21c_METHOD_HANDLE.add(INSTRUCTION_FORMAT21c_METHOD_HANDLE67);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 572:41: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_METHOD_HANDLE]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21c_METHOD_HANDLE67));
					}


					retval.tree = root_0;

					}
					break;
				case 25 :
					// smaliParser.g:573:5: INSTRUCTION_FORMAT21c_METHOD_TYPE
					{
					INSTRUCTION_FORMAT21c_METHOD_TYPE68=(Token)match(input,INSTRUCTION_FORMAT21c_METHOD_TYPE,FOLLOW_INSTRUCTION_FORMAT21c_METHOD_TYPE_in_simple_name2085);  
					stream_INSTRUCTION_FORMAT21c_METHOD_TYPE.add(INSTRUCTION_FORMAT21c_METHOD_TYPE68);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 573:39: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_METHOD_TYPE]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21c_METHOD_TYPE68));
					}


					retval.tree = root_0;

					}
					break;
				case 26 :
					// smaliParser.g:574:5: INSTRUCTION_FORMAT21c_STRING
					{
					INSTRUCTION_FORMAT21c_STRING69=(Token)match(input,INSTRUCTION_FORMAT21c_STRING,FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_simple_name2096);  
					stream_INSTRUCTION_FORMAT21c_STRING.add(INSTRUCTION_FORMAT21c_STRING69);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 574:34: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_STRING]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21c_STRING69));
					}


					retval.tree = root_0;

					}
					break;
				case 27 :
					// smaliParser.g:575:5: INSTRUCTION_FORMAT21c_TYPE
					{
					INSTRUCTION_FORMAT21c_TYPE70=(Token)match(input,INSTRUCTION_FORMAT21c_TYPE,FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_simple_name2107);  
					stream_INSTRUCTION_FORMAT21c_TYPE.add(INSTRUCTION_FORMAT21c_TYPE70);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 575:32: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_TYPE]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21c_TYPE70));
					}


					retval.tree = root_0;

					}
					break;
				case 28 :
					// smaliParser.g:576:5: INSTRUCTION_FORMAT21t
					{
					INSTRUCTION_FORMAT21t71=(Token)match(input,INSTRUCTION_FORMAT21t,FOLLOW_INSTRUCTION_FORMAT21t_in_simple_name2118);  
					stream_INSTRUCTION_FORMAT21t.add(INSTRUCTION_FORMAT21t71);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 576:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21t]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21t71));
					}


					retval.tree = root_0;

					}
					break;
				case 29 :
					// smaliParser.g:577:5: INSTRUCTION_FORMAT22c_FIELD
					{
					INSTRUCTION_FORMAT22c_FIELD72=(Token)match(input,INSTRUCTION_FORMAT22c_FIELD,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_simple_name2129);  
					stream_INSTRUCTION_FORMAT22c_FIELD.add(INSTRUCTION_FORMAT22c_FIELD72);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 577:33: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22c_FIELD72));
					}


					retval.tree = root_0;

					}
					break;
				case 30 :
					// smaliParser.g:578:5: INSTRUCTION_FORMAT22c_FIELD_ODEX
					{
					INSTRUCTION_FORMAT22c_FIELD_ODEX73=(Token)match(input,INSTRUCTION_FORMAT22c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_simple_name2140);  
					stream_INSTRUCTION_FORMAT22c_FIELD_ODEX.add(INSTRUCTION_FORMAT22c_FIELD_ODEX73);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 578:38: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD_ODEX]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22c_FIELD_ODEX73));
					}


					retval.tree = root_0;

					}
					break;
				case 31 :
					// smaliParser.g:579:5: INSTRUCTION_FORMAT22c_TYPE
					{
					INSTRUCTION_FORMAT22c_TYPE74=(Token)match(input,INSTRUCTION_FORMAT22c_TYPE,FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_simple_name2151);  
					stream_INSTRUCTION_FORMAT22c_TYPE.add(INSTRUCTION_FORMAT22c_TYPE74);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 579:32: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_TYPE]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22c_TYPE74));
					}


					retval.tree = root_0;

					}
					break;
				case 32 :
					// smaliParser.g:580:5: INSTRUCTION_FORMAT22cs_FIELD
					{
					INSTRUCTION_FORMAT22cs_FIELD75=(Token)match(input,INSTRUCTION_FORMAT22cs_FIELD,FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_simple_name2162);  
					stream_INSTRUCTION_FORMAT22cs_FIELD.add(INSTRUCTION_FORMAT22cs_FIELD75);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 580:34: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22cs_FIELD]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22cs_FIELD75));
					}


					retval.tree = root_0;

					}
					break;
				case 33 :
					// smaliParser.g:581:5: INSTRUCTION_FORMAT22s_OR_ID
					{
					INSTRUCTION_FORMAT22s_OR_ID76=(Token)match(input,INSTRUCTION_FORMAT22s_OR_ID,FOLLOW_INSTRUCTION_FORMAT22s_OR_ID_in_simple_name2173);  
					stream_INSTRUCTION_FORMAT22s_OR_ID.add(INSTRUCTION_FORMAT22s_OR_ID76);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 581:33: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22s_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22s_OR_ID76));
					}


					retval.tree = root_0;

					}
					break;
				case 34 :
					// smaliParser.g:582:5: INSTRUCTION_FORMAT22t
					{
					INSTRUCTION_FORMAT22t77=(Token)match(input,INSTRUCTION_FORMAT22t,FOLLOW_INSTRUCTION_FORMAT22t_in_simple_name2184);  
					stream_INSTRUCTION_FORMAT22t.add(INSTRUCTION_FORMAT22t77);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 582:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22t]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22t77));
					}


					retval.tree = root_0;

					}
					break;
				case 35 :
					// smaliParser.g:583:5: INSTRUCTION_FORMAT23x
					{
					INSTRUCTION_FORMAT23x78=(Token)match(input,INSTRUCTION_FORMAT23x,FOLLOW_INSTRUCTION_FORMAT23x_in_simple_name2195);  
					stream_INSTRUCTION_FORMAT23x.add(INSTRUCTION_FORMAT23x78);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 583:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT23x]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT23x78));
					}


					retval.tree = root_0;

					}
					break;
				case 36 :
					// smaliParser.g:584:5: INSTRUCTION_FORMAT31i_OR_ID
					{
					INSTRUCTION_FORMAT31i_OR_ID79=(Token)match(input,INSTRUCTION_FORMAT31i_OR_ID,FOLLOW_INSTRUCTION_FORMAT31i_OR_ID_in_simple_name2206);  
					stream_INSTRUCTION_FORMAT31i_OR_ID.add(INSTRUCTION_FORMAT31i_OR_ID79);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 584:33: -> SIMPLE_NAME[$INSTRUCTION_FORMAT31i_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT31i_OR_ID79));
					}


					retval.tree = root_0;

					}
					break;
				case 37 :
					// smaliParser.g:585:5: INSTRUCTION_FORMAT31t
					{
					INSTRUCTION_FORMAT31t80=(Token)match(input,INSTRUCTION_FORMAT31t,FOLLOW_INSTRUCTION_FORMAT31t_in_simple_name2217);  
					stream_INSTRUCTION_FORMAT31t.add(INSTRUCTION_FORMAT31t80);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 585:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT31t]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT31t80));
					}


					retval.tree = root_0;

					}
					break;
				case 38 :
					// smaliParser.g:586:5: INSTRUCTION_FORMAT35c_CALL_SITE
					{
					INSTRUCTION_FORMAT35c_CALL_SITE81=(Token)match(input,INSTRUCTION_FORMAT35c_CALL_SITE,FOLLOW_INSTRUCTION_FORMAT35c_CALL_SITE_in_simple_name2228);  
					stream_INSTRUCTION_FORMAT35c_CALL_SITE.add(INSTRUCTION_FORMAT35c_CALL_SITE81);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 586:37: -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_CALL_SITE]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT35c_CALL_SITE81));
					}


					retval.tree = root_0;

					}
					break;
				case 39 :
					// smaliParser.g:587:5: INSTRUCTION_FORMAT35c_METHOD
					{
					INSTRUCTION_FORMAT35c_METHOD82=(Token)match(input,INSTRUCTION_FORMAT35c_METHOD,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_simple_name2239);  
					stream_INSTRUCTION_FORMAT35c_METHOD.add(INSTRUCTION_FORMAT35c_METHOD82);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 587:34: -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_METHOD]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT35c_METHOD82));
					}


					retval.tree = root_0;

					}
					break;
				case 40 :
					// smaliParser.g:588:5: INSTRUCTION_FORMAT35c_METHOD_ODEX
					{
					INSTRUCTION_FORMAT35c_METHOD_ODEX83=(Token)match(input,INSTRUCTION_FORMAT35c_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_simple_name2250);  
					stream_INSTRUCTION_FORMAT35c_METHOD_ODEX.add(INSTRUCTION_FORMAT35c_METHOD_ODEX83);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 588:39: -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_METHOD_ODEX]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT35c_METHOD_ODEX83));
					}


					retval.tree = root_0;

					}
					break;
				case 41 :
					// smaliParser.g:589:5: INSTRUCTION_FORMAT35c_TYPE
					{
					INSTRUCTION_FORMAT35c_TYPE84=(Token)match(input,INSTRUCTION_FORMAT35c_TYPE,FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_simple_name2261);  
					stream_INSTRUCTION_FORMAT35c_TYPE.add(INSTRUCTION_FORMAT35c_TYPE84);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 589:32: -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_TYPE]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT35c_TYPE84));
					}


					retval.tree = root_0;

					}
					break;
				case 42 :
					// smaliParser.g:590:5: INSTRUCTION_FORMAT35mi_METHOD
					{
					INSTRUCTION_FORMAT35mi_METHOD85=(Token)match(input,INSTRUCTION_FORMAT35mi_METHOD,FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_simple_name2272);  
					stream_INSTRUCTION_FORMAT35mi_METHOD.add(INSTRUCTION_FORMAT35mi_METHOD85);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 590:35: -> SIMPLE_NAME[$INSTRUCTION_FORMAT35mi_METHOD]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT35mi_METHOD85));
					}


					retval.tree = root_0;

					}
					break;
				case 43 :
					// smaliParser.g:591:5: INSTRUCTION_FORMAT35ms_METHOD
					{
					INSTRUCTION_FORMAT35ms_METHOD86=(Token)match(input,INSTRUCTION_FORMAT35ms_METHOD,FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_simple_name2283);  
					stream_INSTRUCTION_FORMAT35ms_METHOD.add(INSTRUCTION_FORMAT35ms_METHOD86);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 591:35: -> SIMPLE_NAME[$INSTRUCTION_FORMAT35ms_METHOD]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT35ms_METHOD86));
					}


					retval.tree = root_0;

					}
					break;
				case 44 :
					// smaliParser.g:592:5: INSTRUCTION_FORMAT45cc_METHOD
					{
					INSTRUCTION_FORMAT45cc_METHOD87=(Token)match(input,INSTRUCTION_FORMAT45cc_METHOD,FOLLOW_INSTRUCTION_FORMAT45cc_METHOD_in_simple_name2294);  
					stream_INSTRUCTION_FORMAT45cc_METHOD.add(INSTRUCTION_FORMAT45cc_METHOD87);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 592:35: -> SIMPLE_NAME[$INSTRUCTION_FORMAT45cc_METHOD]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT45cc_METHOD87));
					}


					retval.tree = root_0;

					}
					break;
				case 45 :
					// smaliParser.g:593:5: INSTRUCTION_FORMAT4rcc_METHOD
					{
					INSTRUCTION_FORMAT4rcc_METHOD88=(Token)match(input,INSTRUCTION_FORMAT4rcc_METHOD,FOLLOW_INSTRUCTION_FORMAT4rcc_METHOD_in_simple_name2305);  
					stream_INSTRUCTION_FORMAT4rcc_METHOD.add(INSTRUCTION_FORMAT4rcc_METHOD88);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 593:35: -> SIMPLE_NAME[$INSTRUCTION_FORMAT4rcc_METHOD]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT4rcc_METHOD88));
					}


					retval.tree = root_0;

					}
					break;
				case 46 :
					// smaliParser.g:594:5: INSTRUCTION_FORMAT51l
					{
					INSTRUCTION_FORMAT51l89=(Token)match(input,INSTRUCTION_FORMAT51l,FOLLOW_INSTRUCTION_FORMAT51l_in_simple_name2316);  
					stream_INSTRUCTION_FORMAT51l.add(INSTRUCTION_FORMAT51l89);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 594:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT51l]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT51l89));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_name"


	public static class member_name_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "member_name"
	// smaliParser.g:596:1: member_name : ( simple_name | MEMBER_NAME -> SIMPLE_NAME[$MEMBER_NAME] );
	public final smaliParser.member_name_return member_name() throws RecognitionException {
		smaliParser.member_name_return retval = new smaliParser.member_name_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MEMBER_NAME91=null;
		ParserRuleReturnScope simple_name90 =null;

		CommonTree MEMBER_NAME91_tree=null;
		RewriteRuleTokenStream stream_MEMBER_NAME=new RewriteRuleTokenStream(adaptor,"token MEMBER_NAME");

		try {
			// smaliParser.g:597:3: ( simple_name | MEMBER_NAME -> SIMPLE_NAME[$MEMBER_NAME] )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ACCESS_SPEC||LA11_0==ANNOTATION_VISIBILITY||LA11_0==BOOL_LITERAL||LA11_0==DOUBLE_LITERAL_OR_ID||LA11_0==FLOAT_LITERAL_OR_ID||(LA11_0 >= INSTRUCTION_FORMAT10t && LA11_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA11_0==INSTRUCTION_FORMAT11x||LA11_0==INSTRUCTION_FORMAT12x_OR_ID||(LA11_0 >= INSTRUCTION_FORMAT21c_FIELD && LA11_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA11_0==INSTRUCTION_FORMAT21t||(LA11_0 >= INSTRUCTION_FORMAT22c_FIELD && LA11_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA11_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA11_0 <= INSTRUCTION_FORMAT22t)||LA11_0==INSTRUCTION_FORMAT23x||(LA11_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA11_0 <= INSTRUCTION_FORMAT31t)||(LA11_0 >= INSTRUCTION_FORMAT35c_CALL_SITE && LA11_0 <= INSTRUCTION_FORMAT35ms_METHOD)||(LA11_0 >= INSTRUCTION_FORMAT45cc_METHOD && LA11_0 <= INSTRUCTION_FORMAT51l)||(LA11_0 >= METHOD_HANDLE_TYPE_FIELD && LA11_0 <= NULL_LITERAL)||(LA11_0 >= PARAM_LIST_OR_ID_PRIMITIVE_TYPE && LA11_0 <= PRIMITIVE_TYPE)||LA11_0==REGISTER||LA11_0==SIMPLE_NAME||(LA11_0 >= VERIFICATION_ERROR_TYPE && LA11_0 <= VOID_TYPE)) ) {
				alt11=1;
			}
			else if ( (LA11_0==MEMBER_NAME) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// smaliParser.g:597:5: simple_name
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simple_name_in_member_name2331);
					simple_name90=simple_name();
					state._fsp--;

					adaptor.addChild(root_0, simple_name90.getTree());

					}
					break;
				case 2 :
					// smaliParser.g:598:5: MEMBER_NAME
					{
					MEMBER_NAME91=(Token)match(input,MEMBER_NAME,FOLLOW_MEMBER_NAME_in_member_name2337);  
					stream_MEMBER_NAME.add(MEMBER_NAME91);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 598:17: -> SIMPLE_NAME[$MEMBER_NAME]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, MEMBER_NAME91));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "member_name"


	public static class method_prototype_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "method_prototype"
	// smaliParser.g:600:1: method_prototype : OPEN_PAREN param_list CLOSE_PAREN type_descriptor -> ^( I_METHOD_PROTOTYPE[$start, \"I_METHOD_PROTOTYPE\"] ^( I_METHOD_RETURN_TYPE type_descriptor ) ( param_list )? ) ;
	public final smaliParser.method_prototype_return method_prototype() throws RecognitionException {
		smaliParser.method_prototype_return retval = new smaliParser.method_prototype_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OPEN_PAREN92=null;
		Token CLOSE_PAREN94=null;
		ParserRuleReturnScope param_list93 =null;
		ParserRuleReturnScope type_descriptor95 =null;

		CommonTree OPEN_PAREN92_tree=null;
		CommonTree CLOSE_PAREN94_tree=null;
		RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
		RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
		RewriteRuleSubtreeStream stream_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule type_descriptor");
		RewriteRuleSubtreeStream stream_param_list=new RewriteRuleSubtreeStream(adaptor,"rule param_list");

		try {
			// smaliParser.g:601:3: ( OPEN_PAREN param_list CLOSE_PAREN type_descriptor -> ^( I_METHOD_PROTOTYPE[$start, \"I_METHOD_PROTOTYPE\"] ^( I_METHOD_RETURN_TYPE type_descriptor ) ( param_list )? ) )
			// smaliParser.g:601:5: OPEN_PAREN param_list CLOSE_PAREN type_descriptor
			{
			OPEN_PAREN92=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_method_prototype2352);  
			stream_OPEN_PAREN.add(OPEN_PAREN92);

			pushFollow(FOLLOW_param_list_in_method_prototype2354);
			param_list93=param_list();
			state._fsp--;

			stream_param_list.add(param_list93.getTree());
			CLOSE_PAREN94=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_method_prototype2356);  
			stream_CLOSE_PAREN.add(CLOSE_PAREN94);

			pushFollow(FOLLOW_type_descriptor_in_method_prototype2358);
			type_descriptor95=type_descriptor();
			state._fsp--;

			stream_type_descriptor.add(type_descriptor95.getTree());
			// AST REWRITE
			// elements: type_descriptor, param_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 602:5: -> ^( I_METHOD_PROTOTYPE[$start, \"I_METHOD_PROTOTYPE\"] ^( I_METHOD_RETURN_TYPE type_descriptor ) ( param_list )? )
			{
				// smaliParser.g:602:8: ^( I_METHOD_PROTOTYPE[$start, \"I_METHOD_PROTOTYPE\"] ^( I_METHOD_RETURN_TYPE type_descriptor ) ( param_list )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_METHOD_PROTOTYPE, (retval.start), "I_METHOD_PROTOTYPE"), root_1);
				// smaliParser.g:602:59: ^( I_METHOD_RETURN_TYPE type_descriptor )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_METHOD_RETURN_TYPE, "I_METHOD_RETURN_TYPE"), root_2);
				adaptor.addChild(root_2, stream_type_descriptor.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// smaliParser.g:602:99: ( param_list )?
				if ( stream_param_list.hasNext() ) {
					adaptor.addChild(root_1, stream_param_list.nextTree());
				}
				stream_param_list.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "method_prototype"


	public static class param_list_or_id_primitive_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "param_list_or_id_primitive_type"
	// smaliParser.g:604:1: param_list_or_id_primitive_type : PARAM_LIST_OR_ID_PRIMITIVE_TYPE -> PRIMITIVE_TYPE[$PARAM_LIST_OR_ID_PRIMITIVE_TYPE] ;
	public final smaliParser.param_list_or_id_primitive_type_return param_list_or_id_primitive_type() throws RecognitionException {
		smaliParser.param_list_or_id_primitive_type_return retval = new smaliParser.param_list_or_id_primitive_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PARAM_LIST_OR_ID_PRIMITIVE_TYPE96=null;

		CommonTree PARAM_LIST_OR_ID_PRIMITIVE_TYPE96_tree=null;
		RewriteRuleTokenStream stream_PARAM_LIST_OR_ID_PRIMITIVE_TYPE=new RewriteRuleTokenStream(adaptor,"token PARAM_LIST_OR_ID_PRIMITIVE_TYPE");

		try {
			// smaliParser.g:605:3: ( PARAM_LIST_OR_ID_PRIMITIVE_TYPE -> PRIMITIVE_TYPE[$PARAM_LIST_OR_ID_PRIMITIVE_TYPE] )
			// smaliParser.g:605:5: PARAM_LIST_OR_ID_PRIMITIVE_TYPE
			{
			PARAM_LIST_OR_ID_PRIMITIVE_TYPE96=(Token)match(input,PARAM_LIST_OR_ID_PRIMITIVE_TYPE,FOLLOW_PARAM_LIST_OR_ID_PRIMITIVE_TYPE_in_param_list_or_id_primitive_type2388);  
			stream_PARAM_LIST_OR_ID_PRIMITIVE_TYPE.add(PARAM_LIST_OR_ID_PRIMITIVE_TYPE96);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 605:37: -> PRIMITIVE_TYPE[$PARAM_LIST_OR_ID_PRIMITIVE_TYPE]
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(PRIMITIVE_TYPE, PARAM_LIST_OR_ID_PRIMITIVE_TYPE96));
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param_list_or_id_primitive_type"


	public static class param_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "param_list"
	// smaliParser.g:607:1: param_list : ( ( param_list_or_id_primitive_type )+ | ( nonvoid_type_descriptor )* );
	public final smaliParser.param_list_return param_list() throws RecognitionException {
		smaliParser.param_list_return retval = new smaliParser.param_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope param_list_or_id_primitive_type97 =null;
		ParserRuleReturnScope nonvoid_type_descriptor98 =null;


		try {
			// smaliParser.g:608:3: ( ( param_list_or_id_primitive_type )+ | ( nonvoid_type_descriptor )* )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==PARAM_LIST_OR_ID_PRIMITIVE_TYPE) ) {
				alt14=1;
			}
			else if ( (LA14_0==ARRAY_TYPE_PREFIX||LA14_0==CLASS_DESCRIPTOR||LA14_0==CLOSE_PAREN||LA14_0==PRIMITIVE_TYPE) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// smaliParser.g:608:5: ( param_list_or_id_primitive_type )+
					{
					root_0 = (CommonTree)adaptor.nil();


					// smaliParser.g:608:5: ( param_list_or_id_primitive_type )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==PARAM_LIST_OR_ID_PRIMITIVE_TYPE) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// smaliParser.g:608:5: param_list_or_id_primitive_type
							{
							pushFollow(FOLLOW_param_list_or_id_primitive_type_in_param_list2403);
							param_list_or_id_primitive_type97=param_list_or_id_primitive_type();
							state._fsp--;

							adaptor.addChild(root_0, param_list_or_id_primitive_type97.getTree());

							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					}
					break;
				case 2 :
					// smaliParser.g:609:5: ( nonvoid_type_descriptor )*
					{
					root_0 = (CommonTree)adaptor.nil();


					// smaliParser.g:609:5: ( nonvoid_type_descriptor )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==ARRAY_TYPE_PREFIX||LA13_0==CLASS_DESCRIPTOR||LA13_0==PRIMITIVE_TYPE) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// smaliParser.g:609:5: nonvoid_type_descriptor
							{
							pushFollow(FOLLOW_nonvoid_type_descriptor_in_param_list2410);
							nonvoid_type_descriptor98=nonvoid_type_descriptor();
							state._fsp--;

							adaptor.addChild(root_0, nonvoid_type_descriptor98.getTree());

							}
							break;

						default :
							break loop13;
						}
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param_list"


	public static class array_descriptor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "array_descriptor"
	// smaliParser.g:611:1: array_descriptor : ARRAY_TYPE_PREFIX ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR ) ;
	public final smaliParser.array_descriptor_return array_descriptor() throws RecognitionException {
		smaliParser.array_descriptor_return retval = new smaliParser.array_descriptor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ARRAY_TYPE_PREFIX99=null;
		Token set100=null;

		CommonTree ARRAY_TYPE_PREFIX99_tree=null;
		CommonTree set100_tree=null;

		try {
			// smaliParser.g:612:3: ( ARRAY_TYPE_PREFIX ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR ) )
			// smaliParser.g:612:5: ARRAY_TYPE_PREFIX ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR )
			{
			root_0 = (CommonTree)adaptor.nil();


			ARRAY_TYPE_PREFIX99=(Token)match(input,ARRAY_TYPE_PREFIX,FOLLOW_ARRAY_TYPE_PREFIX_in_array_descriptor2421); 
			ARRAY_TYPE_PREFIX99_tree = (CommonTree)adaptor.create(ARRAY_TYPE_PREFIX99);
			adaptor.addChild(root_0, ARRAY_TYPE_PREFIX99_tree);

			set100=input.LT(1);
			if ( input.LA(1)==CLASS_DESCRIPTOR||input.LA(1)==PRIMITIVE_TYPE ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set100));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_descriptor"


	public static class type_descriptor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_descriptor"
	// smaliParser.g:614:1: type_descriptor : ( VOID_TYPE | PRIMITIVE_TYPE | CLASS_DESCRIPTOR | array_descriptor );
	public final smaliParser.type_descriptor_return type_descriptor() throws RecognitionException {
		smaliParser.type_descriptor_return retval = new smaliParser.type_descriptor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token VOID_TYPE101=null;
		Token PRIMITIVE_TYPE102=null;
		Token CLASS_DESCRIPTOR103=null;
		ParserRuleReturnScope array_descriptor104 =null;

		CommonTree VOID_TYPE101_tree=null;
		CommonTree PRIMITIVE_TYPE102_tree=null;
		CommonTree CLASS_DESCRIPTOR103_tree=null;

		try {
			// smaliParser.g:615:3: ( VOID_TYPE | PRIMITIVE_TYPE | CLASS_DESCRIPTOR | array_descriptor )
			int alt15=4;
			switch ( input.LA(1) ) {
			case VOID_TYPE:
				{
				alt15=1;
				}
				break;
			case PRIMITIVE_TYPE:
				{
				alt15=2;
				}
				break;
			case CLASS_DESCRIPTOR:
				{
				alt15=3;
				}
				break;
			case ARRAY_TYPE_PREFIX:
				{
				alt15=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// smaliParser.g:615:5: VOID_TYPE
					{
					root_0 = (CommonTree)adaptor.nil();


					VOID_TYPE101=(Token)match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_type_descriptor2439); 
					VOID_TYPE101_tree = (CommonTree)adaptor.create(VOID_TYPE101);
					adaptor.addChild(root_0, VOID_TYPE101_tree);

					}
					break;
				case 2 :
					// smaliParser.g:616:5: PRIMITIVE_TYPE
					{
					root_0 = (CommonTree)adaptor.nil();


					PRIMITIVE_TYPE102=(Token)match(input,PRIMITIVE_TYPE,FOLLOW_PRIMITIVE_TYPE_in_type_descriptor2445); 
					PRIMITIVE_TYPE102_tree = (CommonTree)adaptor.create(PRIMITIVE_TYPE102);
					adaptor.addChild(root_0, PRIMITIVE_TYPE102_tree);

					}
					break;
				case 3 :
					// smaliParser.g:617:5: CLASS_DESCRIPTOR
					{
					root_0 = (CommonTree)adaptor.nil();


					CLASS_DESCRIPTOR103=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_type_descriptor2451); 
					CLASS_DESCRIPTOR103_tree = (CommonTree)adaptor.create(CLASS_DESCRIPTOR103);
					adaptor.addChild(root_0, CLASS_DESCRIPTOR103_tree);

					}
					break;
				case 4 :
					// smaliParser.g:618:5: array_descriptor
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_descriptor_in_type_descriptor2457);
					array_descriptor104=array_descriptor();
					state._fsp--;

					adaptor.addChild(root_0, array_descriptor104.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_descriptor"


	public static class nonvoid_type_descriptor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nonvoid_type_descriptor"
	// smaliParser.g:620:1: nonvoid_type_descriptor : ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR | array_descriptor );
	public final smaliParser.nonvoid_type_descriptor_return nonvoid_type_descriptor() throws RecognitionException {
		smaliParser.nonvoid_type_descriptor_return retval = new smaliParser.nonvoid_type_descriptor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PRIMITIVE_TYPE105=null;
		Token CLASS_DESCRIPTOR106=null;
		ParserRuleReturnScope array_descriptor107 =null;

		CommonTree PRIMITIVE_TYPE105_tree=null;
		CommonTree CLASS_DESCRIPTOR106_tree=null;

		try {
			// smaliParser.g:621:3: ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR | array_descriptor )
			int alt16=3;
			switch ( input.LA(1) ) {
			case PRIMITIVE_TYPE:
				{
				alt16=1;
				}
				break;
			case CLASS_DESCRIPTOR:
				{
				alt16=2;
				}
				break;
			case ARRAY_TYPE_PREFIX:
				{
				alt16=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// smaliParser.g:621:5: PRIMITIVE_TYPE
					{
					root_0 = (CommonTree)adaptor.nil();


					PRIMITIVE_TYPE105=(Token)match(input,PRIMITIVE_TYPE,FOLLOW_PRIMITIVE_TYPE_in_nonvoid_type_descriptor2467); 
					PRIMITIVE_TYPE105_tree = (CommonTree)adaptor.create(PRIMITIVE_TYPE105);
					adaptor.addChild(root_0, PRIMITIVE_TYPE105_tree);

					}
					break;
				case 2 :
					// smaliParser.g:622:5: CLASS_DESCRIPTOR
					{
					root_0 = (CommonTree)adaptor.nil();


					CLASS_DESCRIPTOR106=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_nonvoid_type_descriptor2473); 
					CLASS_DESCRIPTOR106_tree = (CommonTree)adaptor.create(CLASS_DESCRIPTOR106);
					adaptor.addChild(root_0, CLASS_DESCRIPTOR106_tree);

					}
					break;
				case 3 :
					// smaliParser.g:623:5: array_descriptor
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_descriptor_in_nonvoid_type_descriptor2479);
					array_descriptor107=array_descriptor();
					state._fsp--;

					adaptor.addChild(root_0, array_descriptor107.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nonvoid_type_descriptor"


	public static class reference_type_descriptor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "reference_type_descriptor"
	// smaliParser.g:625:1: reference_type_descriptor : ( CLASS_DESCRIPTOR | array_descriptor );
	public final smaliParser.reference_type_descriptor_return reference_type_descriptor() throws RecognitionException {
		smaliParser.reference_type_descriptor_return retval = new smaliParser.reference_type_descriptor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CLASS_DESCRIPTOR108=null;
		ParserRuleReturnScope array_descriptor109 =null;

		CommonTree CLASS_DESCRIPTOR108_tree=null;

		try {
			// smaliParser.g:626:3: ( CLASS_DESCRIPTOR | array_descriptor )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==CLASS_DESCRIPTOR) ) {
				alt17=1;
			}
			else if ( (LA17_0==ARRAY_TYPE_PREFIX) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// smaliParser.g:626:5: CLASS_DESCRIPTOR
					{
					root_0 = (CommonTree)adaptor.nil();


					CLASS_DESCRIPTOR108=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_reference_type_descriptor2489); 
					CLASS_DESCRIPTOR108_tree = (CommonTree)adaptor.create(CLASS_DESCRIPTOR108);
					adaptor.addChild(root_0, CLASS_DESCRIPTOR108_tree);

					}
					break;
				case 2 :
					// smaliParser.g:627:5: array_descriptor
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_descriptor_in_reference_type_descriptor2495);
					array_descriptor109=array_descriptor();
					state._fsp--;

					adaptor.addChild(root_0, array_descriptor109.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reference_type_descriptor"


	public static class integer_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "integer_literal"
	// smaliParser.g:629:1: integer_literal : ( POSITIVE_INTEGER_LITERAL -> INTEGER_LITERAL[$POSITIVE_INTEGER_LITERAL] | NEGATIVE_INTEGER_LITERAL -> INTEGER_LITERAL[$NEGATIVE_INTEGER_LITERAL] );
	public final smaliParser.integer_literal_return integer_literal() throws RecognitionException {
		smaliParser.integer_literal_return retval = new smaliParser.integer_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token POSITIVE_INTEGER_LITERAL110=null;
		Token NEGATIVE_INTEGER_LITERAL111=null;

		CommonTree POSITIVE_INTEGER_LITERAL110_tree=null;
		CommonTree NEGATIVE_INTEGER_LITERAL111_tree=null;
		RewriteRuleTokenStream stream_NEGATIVE_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token NEGATIVE_INTEGER_LITERAL");
		RewriteRuleTokenStream stream_POSITIVE_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token POSITIVE_INTEGER_LITERAL");

		try {
			// smaliParser.g:630:3: ( POSITIVE_INTEGER_LITERAL -> INTEGER_LITERAL[$POSITIVE_INTEGER_LITERAL] | NEGATIVE_INTEGER_LITERAL -> INTEGER_LITERAL[$NEGATIVE_INTEGER_LITERAL] )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==POSITIVE_INTEGER_LITERAL) ) {
				alt18=1;
			}
			else if ( (LA18_0==NEGATIVE_INTEGER_LITERAL) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// smaliParser.g:630:5: POSITIVE_INTEGER_LITERAL
					{
					POSITIVE_INTEGER_LITERAL110=(Token)match(input,POSITIVE_INTEGER_LITERAL,FOLLOW_POSITIVE_INTEGER_LITERAL_in_integer_literal2505);  
					stream_POSITIVE_INTEGER_LITERAL.add(POSITIVE_INTEGER_LITERAL110);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 630:30: -> INTEGER_LITERAL[$POSITIVE_INTEGER_LITERAL]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INTEGER_LITERAL, POSITIVE_INTEGER_LITERAL110));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// smaliParser.g:631:5: NEGATIVE_INTEGER_LITERAL
					{
					NEGATIVE_INTEGER_LITERAL111=(Token)match(input,NEGATIVE_INTEGER_LITERAL,FOLLOW_NEGATIVE_INTEGER_LITERAL_in_integer_literal2516);  
					stream_NEGATIVE_INTEGER_LITERAL.add(NEGATIVE_INTEGER_LITERAL111);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 631:30: -> INTEGER_LITERAL[$NEGATIVE_INTEGER_LITERAL]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INTEGER_LITERAL, NEGATIVE_INTEGER_LITERAL111));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "integer_literal"


	public static class float_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "float_literal"
	// smaliParser.g:633:1: float_literal : ( FLOAT_LITERAL_OR_ID -> FLOAT_LITERAL[$FLOAT_LITERAL_OR_ID] | FLOAT_LITERAL );
	public final smaliParser.float_literal_return float_literal() throws RecognitionException {
		smaliParser.float_literal_return retval = new smaliParser.float_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FLOAT_LITERAL_OR_ID112=null;
		Token FLOAT_LITERAL113=null;

		CommonTree FLOAT_LITERAL_OR_ID112_tree=null;
		CommonTree FLOAT_LITERAL113_tree=null;
		RewriteRuleTokenStream stream_FLOAT_LITERAL_OR_ID=new RewriteRuleTokenStream(adaptor,"token FLOAT_LITERAL_OR_ID");

		try {
			// smaliParser.g:634:3: ( FLOAT_LITERAL_OR_ID -> FLOAT_LITERAL[$FLOAT_LITERAL_OR_ID] | FLOAT_LITERAL )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==FLOAT_LITERAL_OR_ID) ) {
				alt19=1;
			}
			else if ( (LA19_0==FLOAT_LITERAL) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// smaliParser.g:634:5: FLOAT_LITERAL_OR_ID
					{
					FLOAT_LITERAL_OR_ID112=(Token)match(input,FLOAT_LITERAL_OR_ID,FOLLOW_FLOAT_LITERAL_OR_ID_in_float_literal2531);  
					stream_FLOAT_LITERAL_OR_ID.add(FLOAT_LITERAL_OR_ID112);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 634:25: -> FLOAT_LITERAL[$FLOAT_LITERAL_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(FLOAT_LITERAL, FLOAT_LITERAL_OR_ID112));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// smaliParser.g:635:5: FLOAT_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT_LITERAL113=(Token)match(input,FLOAT_LITERAL,FOLLOW_FLOAT_LITERAL_in_float_literal2542); 
					FLOAT_LITERAL113_tree = (CommonTree)adaptor.create(FLOAT_LITERAL113);
					adaptor.addChild(root_0, FLOAT_LITERAL113_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "float_literal"


	public static class double_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "double_literal"
	// smaliParser.g:637:1: double_literal : ( DOUBLE_LITERAL_OR_ID -> DOUBLE_LITERAL[$DOUBLE_LITERAL_OR_ID] | DOUBLE_LITERAL );
	public final smaliParser.double_literal_return double_literal() throws RecognitionException {
		smaliParser.double_literal_return retval = new smaliParser.double_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token DOUBLE_LITERAL_OR_ID114=null;
		Token DOUBLE_LITERAL115=null;

		CommonTree DOUBLE_LITERAL_OR_ID114_tree=null;
		CommonTree DOUBLE_LITERAL115_tree=null;
		RewriteRuleTokenStream stream_DOUBLE_LITERAL_OR_ID=new RewriteRuleTokenStream(adaptor,"token DOUBLE_LITERAL_OR_ID");

		try {
			// smaliParser.g:638:3: ( DOUBLE_LITERAL_OR_ID -> DOUBLE_LITERAL[$DOUBLE_LITERAL_OR_ID] | DOUBLE_LITERAL )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==DOUBLE_LITERAL_OR_ID) ) {
				alt20=1;
			}
			else if ( (LA20_0==DOUBLE_LITERAL) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// smaliParser.g:638:5: DOUBLE_LITERAL_OR_ID
					{
					DOUBLE_LITERAL_OR_ID114=(Token)match(input,DOUBLE_LITERAL_OR_ID,FOLLOW_DOUBLE_LITERAL_OR_ID_in_double_literal2552);  
					stream_DOUBLE_LITERAL_OR_ID.add(DOUBLE_LITERAL_OR_ID114);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 638:26: -> DOUBLE_LITERAL[$DOUBLE_LITERAL_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(DOUBLE_LITERAL, DOUBLE_LITERAL_OR_ID114));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// smaliParser.g:639:5: DOUBLE_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					DOUBLE_LITERAL115=(Token)match(input,DOUBLE_LITERAL,FOLLOW_DOUBLE_LITERAL_in_double_literal2563); 
					DOUBLE_LITERAL115_tree = (CommonTree)adaptor.create(DOUBLE_LITERAL115);
					adaptor.addChild(root_0, DOUBLE_LITERAL115_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "double_literal"


	public static class literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// smaliParser.g:641:1: literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | STRING_LITERAL | BOOL_LITERAL | NULL_LITERAL | array_literal | subannotation | type_field_method_literal | enum_literal | method_handle_literal | method_prototype );
	public final smaliParser.literal_return literal() throws RecognitionException {
		smaliParser.literal_return retval = new smaliParser.literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LONG_LITERAL116=null;
		Token SHORT_LITERAL118=null;
		Token BYTE_LITERAL119=null;
		Token CHAR_LITERAL122=null;
		Token STRING_LITERAL123=null;
		Token BOOL_LITERAL124=null;
		Token NULL_LITERAL125=null;
		ParserRuleReturnScope integer_literal117 =null;
		ParserRuleReturnScope float_literal120 =null;
		ParserRuleReturnScope double_literal121 =null;
		ParserRuleReturnScope array_literal126 =null;
		ParserRuleReturnScope subannotation127 =null;
		ParserRuleReturnScope type_field_method_literal128 =null;
		ParserRuleReturnScope enum_literal129 =null;
		ParserRuleReturnScope method_handle_literal130 =null;
		ParserRuleReturnScope method_prototype131 =null;

		CommonTree LONG_LITERAL116_tree=null;
		CommonTree SHORT_LITERAL118_tree=null;
		CommonTree BYTE_LITERAL119_tree=null;
		CommonTree CHAR_LITERAL122_tree=null;
		CommonTree STRING_LITERAL123_tree=null;
		CommonTree BOOL_LITERAL124_tree=null;
		CommonTree NULL_LITERAL125_tree=null;

		try {
			// smaliParser.g:642:3: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | STRING_LITERAL | BOOL_LITERAL | NULL_LITERAL | array_literal | subannotation | type_field_method_literal | enum_literal | method_handle_literal | method_prototype )
			int alt21=16;
			switch ( input.LA(1) ) {
			case LONG_LITERAL:
				{
				alt21=1;
				}
				break;
			case POSITIVE_INTEGER_LITERAL:
				{
				int LA21_2 = input.LA(2);
				if ( (LA21_2==EOF||(LA21_2 >= ACCESS_SPEC && LA21_2 <= ANNOTATION_VISIBILITY)||LA21_2==BOOL_LITERAL||(LA21_2 >= CLASS_DIRECTIVE && LA21_2 <= CLOSE_PAREN)||LA21_2==COMMA||(LA21_2 >= DOUBLE_LITERAL_OR_ID && LA21_2 <= END_ANNOTATION_DIRECTIVE)||LA21_2==END_FIELD_DIRECTIVE||LA21_2==END_SUBANNOTATION_DIRECTIVE||LA21_2==FIELD_DIRECTIVE||(LA21_2 >= FLOAT_LITERAL_OR_ID && LA21_2 <= IMPLEMENTS_DIRECTIVE)||(LA21_2 >= INSTRUCTION_FORMAT10t && LA21_2 <= INSTRUCTION_FORMAT10x_ODEX)||LA21_2==INSTRUCTION_FORMAT11x||LA21_2==INSTRUCTION_FORMAT12x_OR_ID||(LA21_2 >= INSTRUCTION_FORMAT21c_FIELD && LA21_2 <= INSTRUCTION_FORMAT21c_TYPE)||LA21_2==INSTRUCTION_FORMAT21t||(LA21_2 >= INSTRUCTION_FORMAT22c_FIELD && LA21_2 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA21_2 >= INSTRUCTION_FORMAT22s_OR_ID && LA21_2 <= INSTRUCTION_FORMAT22t)||LA21_2==INSTRUCTION_FORMAT23x||(LA21_2 >= INSTRUCTION_FORMAT31i_OR_ID && LA21_2 <= INSTRUCTION_FORMAT31t)||(LA21_2 >= INSTRUCTION_FORMAT35c_CALL_SITE && LA21_2 <= INSTRUCTION_FORMAT35ms_METHOD)||(LA21_2 >= INSTRUCTION_FORMAT45cc_METHOD && LA21_2 <= INSTRUCTION_FORMAT51l)||(LA21_2 >= METHOD_DIRECTIVE && LA21_2 <= NULL_LITERAL)||(LA21_2 >= PARAM_LIST_OR_ID_PRIMITIVE_TYPE && LA21_2 <= PRIMITIVE_TYPE)||LA21_2==REGISTER||(LA21_2 >= SIMPLE_NAME && LA21_2 <= SOURCE_DIRECTIVE)||(LA21_2 >= SUPER_DIRECTIVE && LA21_2 <= VOID_TYPE)) ) {
					alt21=2;
				}
				else if ( (LA21_2==COLON||LA21_2==OPEN_PAREN) ) {
					alt21=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NEGATIVE_INTEGER_LITERAL:
				{
				int LA21_3 = input.LA(2);
				if ( (LA21_3==EOF||(LA21_3 >= ACCESS_SPEC && LA21_3 <= ANNOTATION_VISIBILITY)||LA21_3==BOOL_LITERAL||(LA21_3 >= CLASS_DIRECTIVE && LA21_3 <= CLOSE_PAREN)||LA21_3==COMMA||(LA21_3 >= DOUBLE_LITERAL_OR_ID && LA21_3 <= END_ANNOTATION_DIRECTIVE)||LA21_3==END_FIELD_DIRECTIVE||LA21_3==END_SUBANNOTATION_DIRECTIVE||LA21_3==FIELD_DIRECTIVE||(LA21_3 >= FLOAT_LITERAL_OR_ID && LA21_3 <= IMPLEMENTS_DIRECTIVE)||(LA21_3 >= INSTRUCTION_FORMAT10t && LA21_3 <= INSTRUCTION_FORMAT10x_ODEX)||LA21_3==INSTRUCTION_FORMAT11x||LA21_3==INSTRUCTION_FORMAT12x_OR_ID||(LA21_3 >= INSTRUCTION_FORMAT21c_FIELD && LA21_3 <= INSTRUCTION_FORMAT21c_TYPE)||LA21_3==INSTRUCTION_FORMAT21t||(LA21_3 >= INSTRUCTION_FORMAT22c_FIELD && LA21_3 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA21_3 >= INSTRUCTION_FORMAT22s_OR_ID && LA21_3 <= INSTRUCTION_FORMAT22t)||LA21_3==INSTRUCTION_FORMAT23x||(LA21_3 >= INSTRUCTION_FORMAT31i_OR_ID && LA21_3 <= INSTRUCTION_FORMAT31t)||(LA21_3 >= INSTRUCTION_FORMAT35c_CALL_SITE && LA21_3 <= INSTRUCTION_FORMAT35ms_METHOD)||(LA21_3 >= INSTRUCTION_FORMAT45cc_METHOD && LA21_3 <= INSTRUCTION_FORMAT51l)||(LA21_3 >= METHOD_DIRECTIVE && LA21_3 <= NULL_LITERAL)||(LA21_3 >= PARAM_LIST_OR_ID_PRIMITIVE_TYPE && LA21_3 <= PRIMITIVE_TYPE)||LA21_3==REGISTER||(LA21_3 >= SIMPLE_NAME && LA21_3 <= SOURCE_DIRECTIVE)||(LA21_3 >= SUPER_DIRECTIVE && LA21_3 <= VOID_TYPE)) ) {
					alt21=2;
				}
				else if ( (LA21_3==COLON||LA21_3==OPEN_PAREN) ) {
					alt21=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SHORT_LITERAL:
				{
				alt21=3;
				}
				break;
			case BYTE_LITERAL:
				{
				alt21=4;
				}
				break;
			case FLOAT_LITERAL_OR_ID:
				{
				int LA21_6 = input.LA(2);
				if ( (LA21_6==EOF||(LA21_6 >= ACCESS_SPEC && LA21_6 <= ANNOTATION_VISIBILITY)||LA21_6==BOOL_LITERAL||(LA21_6 >= CLASS_DIRECTIVE && LA21_6 <= CLOSE_PAREN)||LA21_6==COMMA||(LA21_6 >= DOUBLE_LITERAL_OR_ID && LA21_6 <= END_ANNOTATION_DIRECTIVE)||LA21_6==END_FIELD_DIRECTIVE||LA21_6==END_SUBANNOTATION_DIRECTIVE||LA21_6==FIELD_DIRECTIVE||(LA21_6 >= FLOAT_LITERAL_OR_ID && LA21_6 <= IMPLEMENTS_DIRECTIVE)||(LA21_6 >= INSTRUCTION_FORMAT10t && LA21_6 <= INSTRUCTION_FORMAT10x_ODEX)||LA21_6==INSTRUCTION_FORMAT11x||LA21_6==INSTRUCTION_FORMAT12x_OR_ID||(LA21_6 >= INSTRUCTION_FORMAT21c_FIELD && LA21_6 <= INSTRUCTION_FORMAT21c_TYPE)||LA21_6==INSTRUCTION_FORMAT21t||(LA21_6 >= INSTRUCTION_FORMAT22c_FIELD && LA21_6 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA21_6 >= INSTRUCTION_FORMAT22s_OR_ID && LA21_6 <= INSTRUCTION_FORMAT22t)||LA21_6==INSTRUCTION_FORMAT23x||(LA21_6 >= INSTRUCTION_FORMAT31i_OR_ID && LA21_6 <= INSTRUCTION_FORMAT31t)||(LA21_6 >= INSTRUCTION_FORMAT35c_CALL_SITE && LA21_6 <= INSTRUCTION_FORMAT35ms_METHOD)||(LA21_6 >= INSTRUCTION_FORMAT45cc_METHOD && LA21_6 <= INSTRUCTION_FORMAT51l)||(LA21_6 >= METHOD_DIRECTIVE && LA21_6 <= NULL_LITERAL)||(LA21_6 >= PARAM_LIST_OR_ID_PRIMITIVE_TYPE && LA21_6 <= PRIMITIVE_TYPE)||LA21_6==REGISTER||(LA21_6 >= SIMPLE_NAME && LA21_6 <= SOURCE_DIRECTIVE)||(LA21_6 >= SUPER_DIRECTIVE && LA21_6 <= VOID_TYPE)) ) {
					alt21=5;
				}
				else if ( (LA21_6==COLON||LA21_6==OPEN_PAREN) ) {
					alt21=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT_LITERAL:
				{
				alt21=5;
				}
				break;
			case DOUBLE_LITERAL_OR_ID:
				{
				int LA21_8 = input.LA(2);
				if ( (LA21_8==EOF||(LA21_8 >= ACCESS_SPEC && LA21_8 <= ANNOTATION_VISIBILITY)||LA21_8==BOOL_LITERAL||(LA21_8 >= CLASS_DIRECTIVE && LA21_8 <= CLOSE_PAREN)||LA21_8==COMMA||(LA21_8 >= DOUBLE_LITERAL_OR_ID && LA21_8 <= END_ANNOTATION_DIRECTIVE)||LA21_8==END_FIELD_DIRECTIVE||LA21_8==END_SUBANNOTATION_DIRECTIVE||LA21_8==FIELD_DIRECTIVE||(LA21_8 >= FLOAT_LITERAL_OR_ID && LA21_8 <= IMPLEMENTS_DIRECTIVE)||(LA21_8 >= INSTRUCTION_FORMAT10t && LA21_8 <= INSTRUCTION_FORMAT10x_ODEX)||LA21_8==INSTRUCTION_FORMAT11x||LA21_8==INSTRUCTION_FORMAT12x_OR_ID||(LA21_8 >= INSTRUCTION_FORMAT21c_FIELD && LA21_8 <= INSTRUCTION_FORMAT21c_TYPE)||LA21_8==INSTRUCTION_FORMAT21t||(LA21_8 >= INSTRUCTION_FORMAT22c_FIELD && LA21_8 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA21_8 >= INSTRUCTION_FORMAT22s_OR_ID && LA21_8 <= INSTRUCTION_FORMAT22t)||LA21_8==INSTRUCTION_FORMAT23x||(LA21_8 >= INSTRUCTION_FORMAT31i_OR_ID && LA21_8 <= INSTRUCTION_FORMAT31t)||(LA21_8 >= INSTRUCTION_FORMAT35c_CALL_SITE && LA21_8 <= INSTRUCTION_FORMAT35ms_METHOD)||(LA21_8 >= INSTRUCTION_FORMAT45cc_METHOD && LA21_8 <= INSTRUCTION_FORMAT51l)||(LA21_8 >= METHOD_DIRECTIVE && LA21_8 <= NULL_LITERAL)||(LA21_8 >= PARAM_LIST_OR_ID_PRIMITIVE_TYPE && LA21_8 <= PRIMITIVE_TYPE)||LA21_8==REGISTER||(LA21_8 >= SIMPLE_NAME && LA21_8 <= SOURCE_DIRECTIVE)||(LA21_8 >= SUPER_DIRECTIVE && LA21_8 <= VOID_TYPE)) ) {
					alt21=6;
				}
				else if ( (LA21_8==COLON||LA21_8==OPEN_PAREN) ) {
					alt21=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE_LITERAL:
				{
				alt21=6;
				}
				break;
			case CHAR_LITERAL:
				{
				alt21=7;
				}
				break;
			case STRING_LITERAL:
				{
				alt21=8;
				}
				break;
			case BOOL_LITERAL:
				{
				int LA21_12 = input.LA(2);
				if ( (LA21_12==EOF||(LA21_12 >= ACCESS_SPEC && LA21_12 <= ANNOTATION_VISIBILITY)||LA21_12==BOOL_LITERAL||(LA21_12 >= CLASS_DIRECTIVE && LA21_12 <= CLOSE_PAREN)||LA21_12==COMMA||(LA21_12 >= DOUBLE_LITERAL_OR_ID && LA21_12 <= END_ANNOTATION_DIRECTIVE)||LA21_12==END_FIELD_DIRECTIVE||LA21_12==END_SUBANNOTATION_DIRECTIVE||LA21_12==FIELD_DIRECTIVE||(LA21_12 >= FLOAT_LITERAL_OR_ID && LA21_12 <= IMPLEMENTS_DIRECTIVE)||(LA21_12 >= INSTRUCTION_FORMAT10t && LA21_12 <= INSTRUCTION_FORMAT10x_ODEX)||LA21_12==INSTRUCTION_FORMAT11x||LA21_12==INSTRUCTION_FORMAT12x_OR_ID||(LA21_12 >= INSTRUCTION_FORMAT21c_FIELD && LA21_12 <= INSTRUCTION_FORMAT21c_TYPE)||LA21_12==INSTRUCTION_FORMAT21t||(LA21_12 >= INSTRUCTION_FORMAT22c_FIELD && LA21_12 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA21_12 >= INSTRUCTION_FORMAT22s_OR_ID && LA21_12 <= INSTRUCTION_FORMAT22t)||LA21_12==INSTRUCTION_FORMAT23x||(LA21_12 >= INSTRUCTION_FORMAT31i_OR_ID && LA21_12 <= INSTRUCTION_FORMAT31t)||(LA21_12 >= INSTRUCTION_FORMAT35c_CALL_SITE && LA21_12 <= INSTRUCTION_FORMAT35ms_METHOD)||(LA21_12 >= INSTRUCTION_FORMAT45cc_METHOD && LA21_12 <= INSTRUCTION_FORMAT51l)||(LA21_12 >= METHOD_DIRECTIVE && LA21_12 <= NULL_LITERAL)||(LA21_12 >= PARAM_LIST_OR_ID_PRIMITIVE_TYPE && LA21_12 <= PRIMITIVE_TYPE)||LA21_12==REGISTER||(LA21_12 >= SIMPLE_NAME && LA21_12 <= SOURCE_DIRECTIVE)||(LA21_12 >= SUPER_DIRECTIVE && LA21_12 <= VOID_TYPE)) ) {
					alt21=9;
				}
				else if ( (LA21_12==COLON||LA21_12==OPEN_PAREN) ) {
					alt21=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NULL_LITERAL:
				{
				int LA21_13 = input.LA(2);
				if ( (LA21_13==EOF||(LA21_13 >= ACCESS_SPEC && LA21_13 <= ANNOTATION_VISIBILITY)||LA21_13==BOOL_LITERAL||(LA21_13 >= CLASS_DIRECTIVE && LA21_13 <= CLOSE_PAREN)||LA21_13==COMMA||(LA21_13 >= DOUBLE_LITERAL_OR_ID && LA21_13 <= END_ANNOTATION_DIRECTIVE)||LA21_13==END_FIELD_DIRECTIVE||LA21_13==END_SUBANNOTATION_DIRECTIVE||LA21_13==FIELD_DIRECTIVE||(LA21_13 >= FLOAT_LITERAL_OR_ID && LA21_13 <= IMPLEMENTS_DIRECTIVE)||(LA21_13 >= INSTRUCTION_FORMAT10t && LA21_13 <= INSTRUCTION_FORMAT10x_ODEX)||LA21_13==INSTRUCTION_FORMAT11x||LA21_13==INSTRUCTION_FORMAT12x_OR_ID||(LA21_13 >= INSTRUCTION_FORMAT21c_FIELD && LA21_13 <= INSTRUCTION_FORMAT21c_TYPE)||LA21_13==INSTRUCTION_FORMAT21t||(LA21_13 >= INSTRUCTION_FORMAT22c_FIELD && LA21_13 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA21_13 >= INSTRUCTION_FORMAT22s_OR_ID && LA21_13 <= INSTRUCTION_FORMAT22t)||LA21_13==INSTRUCTION_FORMAT23x||(LA21_13 >= INSTRUCTION_FORMAT31i_OR_ID && LA21_13 <= INSTRUCTION_FORMAT31t)||(LA21_13 >= INSTRUCTION_FORMAT35c_CALL_SITE && LA21_13 <= INSTRUCTION_FORMAT35ms_METHOD)||(LA21_13 >= INSTRUCTION_FORMAT45cc_METHOD && LA21_13 <= INSTRUCTION_FORMAT51l)||(LA21_13 >= METHOD_DIRECTIVE && LA21_13 <= NULL_LITERAL)||(LA21_13 >= PARAM_LIST_OR_ID_PRIMITIVE_TYPE && LA21_13 <= PRIMITIVE_TYPE)||LA21_13==REGISTER||(LA21_13 >= SIMPLE_NAME && LA21_13 <= SOURCE_DIRECTIVE)||(LA21_13 >= SUPER_DIRECTIVE && LA21_13 <= VOID_TYPE)) ) {
					alt21=10;
				}
				else if ( (LA21_13==COLON||LA21_13==OPEN_PAREN) ) {
					alt21=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OPEN_BRACE:
				{
				alt21=11;
				}
				break;
			case SUBANNOTATION_DIRECTIVE:
				{
				alt21=12;
				}
				break;
			case ACCESS_SPEC:
			case ANNOTATION_VISIBILITY:
			case ARRAY_TYPE_PREFIX:
			case CLASS_DESCRIPTOR:
			case INSTRUCTION_FORMAT10t:
			case INSTRUCTION_FORMAT10x:
			case INSTRUCTION_FORMAT10x_ODEX:
			case INSTRUCTION_FORMAT11x:
			case INSTRUCTION_FORMAT12x_OR_ID:
			case INSTRUCTION_FORMAT21c_FIELD:
			case INSTRUCTION_FORMAT21c_FIELD_ODEX:
			case INSTRUCTION_FORMAT21c_METHOD_HANDLE:
			case INSTRUCTION_FORMAT21c_METHOD_TYPE:
			case INSTRUCTION_FORMAT21c_STRING:
			case INSTRUCTION_FORMAT21c_TYPE:
			case INSTRUCTION_FORMAT21t:
			case INSTRUCTION_FORMAT22c_FIELD:
			case INSTRUCTION_FORMAT22c_FIELD_ODEX:
			case INSTRUCTION_FORMAT22c_TYPE:
			case INSTRUCTION_FORMAT22cs_FIELD:
			case INSTRUCTION_FORMAT22s_OR_ID:
			case INSTRUCTION_FORMAT22t:
			case INSTRUCTION_FORMAT23x:
			case INSTRUCTION_FORMAT31i_OR_ID:
			case INSTRUCTION_FORMAT31t:
			case INSTRUCTION_FORMAT35c_CALL_SITE:
			case INSTRUCTION_FORMAT35c_METHOD:
			case INSTRUCTION_FORMAT35c_METHOD_ODEX:
			case INSTRUCTION_FORMAT35c_TYPE:
			case INSTRUCTION_FORMAT35mi_METHOD:
			case INSTRUCTION_FORMAT35ms_METHOD:
			case INSTRUCTION_FORMAT45cc_METHOD:
			case INSTRUCTION_FORMAT4rcc_METHOD:
			case INSTRUCTION_FORMAT51l:
			case MEMBER_NAME:
			case PARAM_LIST_OR_ID_PRIMITIVE_TYPE:
			case PRIMITIVE_TYPE:
			case REGISTER:
			case SIMPLE_NAME:
			case VERIFICATION_ERROR_TYPE:
			case VOID_TYPE:
				{
				alt21=13;
				}
				break;
			case METHOD_HANDLE_TYPE_FIELD:
				{
				int LA21_17 = input.LA(2);
				if ( (LA21_17==AT) ) {
					alt21=15;
				}
				else if ( (LA21_17==COLON||LA21_17==OPEN_PAREN) ) {
					alt21=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case METHOD_HANDLE_TYPE_METHOD:
				{
				int LA21_18 = input.LA(2);
				if ( (LA21_18==AT) ) {
					alt21=15;
				}
				else if ( (LA21_18==COLON||LA21_18==OPEN_PAREN) ) {
					alt21=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ENUM_DIRECTIVE:
				{
				alt21=14;
				}
				break;
			case OPEN_PAREN:
				{
				alt21=16;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// smaliParser.g:642:5: LONG_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					LONG_LITERAL116=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_literal2573); 
					LONG_LITERAL116_tree = (CommonTree)adaptor.create(LONG_LITERAL116);
					adaptor.addChild(root_0, LONG_LITERAL116_tree);

					}
					break;
				case 2 :
					// smaliParser.g:643:5: integer_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_integer_literal_in_literal2579);
					integer_literal117=integer_literal();
					state._fsp--;

					adaptor.addChild(root_0, integer_literal117.getTree());

					}
					break;
				case 3 :
					// smaliParser.g:644:5: SHORT_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					SHORT_LITERAL118=(Token)match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_literal2585); 
					SHORT_LITERAL118_tree = (CommonTree)adaptor.create(SHORT_LITERAL118);
					adaptor.addChild(root_0, SHORT_LITERAL118_tree);

					}
					break;
				case 4 :
					// smaliParser.g:645:5: BYTE_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					BYTE_LITERAL119=(Token)match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_literal2591); 
					BYTE_LITERAL119_tree = (CommonTree)adaptor.create(BYTE_LITERAL119);
					adaptor.addChild(root_0, BYTE_LITERAL119_tree);

					}
					break;
				case 5 :
					// smaliParser.g:646:5: float_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float_literal_in_literal2597);
					float_literal120=float_literal();
					state._fsp--;

					adaptor.addChild(root_0, float_literal120.getTree());

					}
					break;
				case 6 :
					// smaliParser.g:647:5: double_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_double_literal_in_literal2603);
					double_literal121=double_literal();
					state._fsp--;

					adaptor.addChild(root_0, double_literal121.getTree());

					}
					break;
				case 7 :
					// smaliParser.g:648:5: CHAR_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					CHAR_LITERAL122=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_literal2609); 
					CHAR_LITERAL122_tree = (CommonTree)adaptor.create(CHAR_LITERAL122);
					adaptor.addChild(root_0, CHAR_LITERAL122_tree);

					}
					break;
				case 8 :
					// smaliParser.g:649:5: STRING_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING_LITERAL123=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_literal2615); 
					STRING_LITERAL123_tree = (CommonTree)adaptor.create(STRING_LITERAL123);
					adaptor.addChild(root_0, STRING_LITERAL123_tree);

					}
					break;
				case 9 :
					// smaliParser.g:650:5: BOOL_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOL_LITERAL124=(Token)match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_literal2621); 
					BOOL_LITERAL124_tree = (CommonTree)adaptor.create(BOOL_LITERAL124);
					adaptor.addChild(root_0, BOOL_LITERAL124_tree);

					}
					break;
				case 10 :
					// smaliParser.g:651:5: NULL_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					NULL_LITERAL125=(Token)match(input,NULL_LITERAL,FOLLOW_NULL_LITERAL_in_literal2627); 
					NULL_LITERAL125_tree = (CommonTree)adaptor.create(NULL_LITERAL125);
					adaptor.addChild(root_0, NULL_LITERAL125_tree);

					}
					break;
				case 11 :
					// smaliParser.g:652:5: array_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_literal_in_literal2633);
					array_literal126=array_literal();
					state._fsp--;

					adaptor.addChild(root_0, array_literal126.getTree());

					}
					break;
				case 12 :
					// smaliParser.g:653:5: subannotation
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_subannotation_in_literal2639);
					subannotation127=subannotation();
					state._fsp--;

					adaptor.addChild(root_0, subannotation127.getTree());

					}
					break;
				case 13 :
					// smaliParser.g:654:5: type_field_method_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_type_field_method_literal_in_literal2645);
					type_field_method_literal128=type_field_method_literal();
					state._fsp--;

					adaptor.addChild(root_0, type_field_method_literal128.getTree());

					}
					break;
				case 14 :
					// smaliParser.g:655:5: enum_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_enum_literal_in_literal2651);
					enum_literal129=enum_literal();
					state._fsp--;

					adaptor.addChild(root_0, enum_literal129.getTree());

					}
					break;
				case 15 :
					// smaliParser.g:656:5: method_handle_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_method_handle_literal_in_literal2657);
					method_handle_literal130=method_handle_literal();
					state._fsp--;

					adaptor.addChild(root_0, method_handle_literal130.getTree());

					}
					break;
				case 16 :
					// smaliParser.g:657:5: method_prototype
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_method_prototype_in_literal2663);
					method_prototype131=method_prototype();
					state._fsp--;

					adaptor.addChild(root_0, method_prototype131.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literal"


	public static class parsed_integer_literal_return extends ParserRuleReturnScope {
		public int value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parsed_integer_literal"
	// smaliParser.g:659:1: parsed_integer_literal returns [int value] : integer_literal ;
	public final smaliParser.parsed_integer_literal_return parsed_integer_literal() throws RecognitionException {
		smaliParser.parsed_integer_literal_return retval = new smaliParser.parsed_integer_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope integer_literal132 =null;


		try {
			// smaliParser.g:660:3: ( integer_literal )
			// smaliParser.g:660:5: integer_literal
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_integer_literal_in_parsed_integer_literal2676);
			integer_literal132=integer_literal();
			state._fsp--;

			adaptor.addChild(root_0, integer_literal132.getTree());

			 retval.value = LiteralTools.parseInt((integer_literal132!=null?input.toString(integer_literal132.start,integer_literal132.stop):null)); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parsed_integer_literal"


	public static class integral_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "integral_literal"
	// smaliParser.g:662:1: integral_literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | CHAR_LITERAL | BYTE_LITERAL );
	public final smaliParser.integral_literal_return integral_literal() throws RecognitionException {
		smaliParser.integral_literal_return retval = new smaliParser.integral_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LONG_LITERAL133=null;
		Token SHORT_LITERAL135=null;
		Token CHAR_LITERAL136=null;
		Token BYTE_LITERAL137=null;
		ParserRuleReturnScope integer_literal134 =null;

		CommonTree LONG_LITERAL133_tree=null;
		CommonTree SHORT_LITERAL135_tree=null;
		CommonTree CHAR_LITERAL136_tree=null;
		CommonTree BYTE_LITERAL137_tree=null;

		try {
			// smaliParser.g:663:3: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | CHAR_LITERAL | BYTE_LITERAL )
			int alt22=5;
			switch ( input.LA(1) ) {
			case LONG_LITERAL:
				{
				alt22=1;
				}
				break;
			case NEGATIVE_INTEGER_LITERAL:
			case POSITIVE_INTEGER_LITERAL:
				{
				alt22=2;
				}
				break;
			case SHORT_LITERAL:
				{
				alt22=3;
				}
				break;
			case CHAR_LITERAL:
				{
				alt22=4;
				}
				break;
			case BYTE_LITERAL:
				{
				alt22=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// smaliParser.g:663:5: LONG_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					LONG_LITERAL133=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_integral_literal2688); 
					LONG_LITERAL133_tree = (CommonTree)adaptor.create(LONG_LITERAL133);
					adaptor.addChild(root_0, LONG_LITERAL133_tree);

					}
					break;
				case 2 :
					// smaliParser.g:664:5: integer_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_integer_literal_in_integral_literal2694);
					integer_literal134=integer_literal();
					state._fsp--;

					adaptor.addChild(root_0, integer_literal134.getTree());

					}
					break;
				case 3 :
					// smaliParser.g:665:5: SHORT_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					SHORT_LITERAL135=(Token)match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_integral_literal2700); 
					SHORT_LITERAL135_tree = (CommonTree)adaptor.create(SHORT_LITERAL135);
					adaptor.addChild(root_0, SHORT_LITERAL135_tree);

					}
					break;
				case 4 :
					// smaliParser.g:666:5: CHAR_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					CHAR_LITERAL136=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_integral_literal2706); 
					CHAR_LITERAL136_tree = (CommonTree)adaptor.create(CHAR_LITERAL136);
					adaptor.addChild(root_0, CHAR_LITERAL136_tree);

					}
					break;
				case 5 :
					// smaliParser.g:667:5: BYTE_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					BYTE_LITERAL137=(Token)match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_integral_literal2712); 
					BYTE_LITERAL137_tree = (CommonTree)adaptor.create(BYTE_LITERAL137);
					adaptor.addChild(root_0, BYTE_LITERAL137_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "integral_literal"


	public static class fixed_32bit_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fixed_32bit_literal"
	// smaliParser.g:669:1: fixed_32bit_literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | CHAR_LITERAL | BOOL_LITERAL );
	public final smaliParser.fixed_32bit_literal_return fixed_32bit_literal() throws RecognitionException {
		smaliParser.fixed_32bit_literal_return retval = new smaliParser.fixed_32bit_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LONG_LITERAL138=null;
		Token SHORT_LITERAL140=null;
		Token BYTE_LITERAL141=null;
		Token CHAR_LITERAL143=null;
		Token BOOL_LITERAL144=null;
		ParserRuleReturnScope integer_literal139 =null;
		ParserRuleReturnScope float_literal142 =null;

		CommonTree LONG_LITERAL138_tree=null;
		CommonTree SHORT_LITERAL140_tree=null;
		CommonTree BYTE_LITERAL141_tree=null;
		CommonTree CHAR_LITERAL143_tree=null;
		CommonTree BOOL_LITERAL144_tree=null;

		try {
			// smaliParser.g:670:3: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | CHAR_LITERAL | BOOL_LITERAL )
			int alt23=7;
			switch ( input.LA(1) ) {
			case LONG_LITERAL:
				{
				alt23=1;
				}
				break;
			case NEGATIVE_INTEGER_LITERAL:
			case POSITIVE_INTEGER_LITERAL:
				{
				alt23=2;
				}
				break;
			case SHORT_LITERAL:
				{
				alt23=3;
				}
				break;
			case BYTE_LITERAL:
				{
				alt23=4;
				}
				break;
			case FLOAT_LITERAL:
			case FLOAT_LITERAL_OR_ID:
				{
				alt23=5;
				}
				break;
			case CHAR_LITERAL:
				{
				alt23=6;
				}
				break;
			case BOOL_LITERAL:
				{
				alt23=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// smaliParser.g:670:5: LONG_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					LONG_LITERAL138=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_32bit_literal2722); 
					LONG_LITERAL138_tree = (CommonTree)adaptor.create(LONG_LITERAL138);
					adaptor.addChild(root_0, LONG_LITERAL138_tree);

					}
					break;
				case 2 :
					// smaliParser.g:671:5: integer_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_integer_literal_in_fixed_32bit_literal2728);
					integer_literal139=integer_literal();
					state._fsp--;

					adaptor.addChild(root_0, integer_literal139.getTree());

					}
					break;
				case 3 :
					// smaliParser.g:672:5: SHORT_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					SHORT_LITERAL140=(Token)match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal2734); 
					SHORT_LITERAL140_tree = (CommonTree)adaptor.create(SHORT_LITERAL140);
					adaptor.addChild(root_0, SHORT_LITERAL140_tree);

					}
					break;
				case 4 :
					// smaliParser.g:673:5: BYTE_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					BYTE_LITERAL141=(Token)match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal2740); 
					BYTE_LITERAL141_tree = (CommonTree)adaptor.create(BYTE_LITERAL141);
					adaptor.addChild(root_0, BYTE_LITERAL141_tree);

					}
					break;
				case 5 :
					// smaliParser.g:674:5: float_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float_literal_in_fixed_32bit_literal2746);
					float_literal142=float_literal();
					state._fsp--;

					adaptor.addChild(root_0, float_literal142.getTree());

					}
					break;
				case 6 :
					// smaliParser.g:675:5: CHAR_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					CHAR_LITERAL143=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal2752); 
					CHAR_LITERAL143_tree = (CommonTree)adaptor.create(CHAR_LITERAL143);
					adaptor.addChild(root_0, CHAR_LITERAL143_tree);

					}
					break;
				case 7 :
					// smaliParser.g:676:5: BOOL_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOL_LITERAL144=(Token)match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal2758); 
					BOOL_LITERAL144_tree = (CommonTree)adaptor.create(BOOL_LITERAL144);
					adaptor.addChild(root_0, BOOL_LITERAL144_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fixed_32bit_literal"


	public static class fixed_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fixed_literal"
	// smaliParser.g:678:1: fixed_literal : ( integer_literal | LONG_LITERAL | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | BOOL_LITERAL );
	public final smaliParser.fixed_literal_return fixed_literal() throws RecognitionException {
		smaliParser.fixed_literal_return retval = new smaliParser.fixed_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LONG_LITERAL146=null;
		Token SHORT_LITERAL147=null;
		Token BYTE_LITERAL148=null;
		Token CHAR_LITERAL151=null;
		Token BOOL_LITERAL152=null;
		ParserRuleReturnScope integer_literal145 =null;
		ParserRuleReturnScope float_literal149 =null;
		ParserRuleReturnScope double_literal150 =null;

		CommonTree LONG_LITERAL146_tree=null;
		CommonTree SHORT_LITERAL147_tree=null;
		CommonTree BYTE_LITERAL148_tree=null;
		CommonTree CHAR_LITERAL151_tree=null;
		CommonTree BOOL_LITERAL152_tree=null;

		try {
			// smaliParser.g:679:3: ( integer_literal | LONG_LITERAL | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | BOOL_LITERAL )
			int alt24=8;
			switch ( input.LA(1) ) {
			case NEGATIVE_INTEGER_LITERAL:
			case POSITIVE_INTEGER_LITERAL:
				{
				alt24=1;
				}
				break;
			case LONG_LITERAL:
				{
				alt24=2;
				}
				break;
			case SHORT_LITERAL:
				{
				alt24=3;
				}
				break;
			case BYTE_LITERAL:
				{
				alt24=4;
				}
				break;
			case FLOAT_LITERAL:
			case FLOAT_LITERAL_OR_ID:
				{
				alt24=5;
				}
				break;
			case DOUBLE_LITERAL:
			case DOUBLE_LITERAL_OR_ID:
				{
				alt24=6;
				}
				break;
			case CHAR_LITERAL:
				{
				alt24=7;
				}
				break;
			case BOOL_LITERAL:
				{
				alt24=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// smaliParser.g:679:5: integer_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_integer_literal_in_fixed_literal2768);
					integer_literal145=integer_literal();
					state._fsp--;

					adaptor.addChild(root_0, integer_literal145.getTree());

					}
					break;
				case 2 :
					// smaliParser.g:680:5: LONG_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					LONG_LITERAL146=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_literal2774); 
					LONG_LITERAL146_tree = (CommonTree)adaptor.create(LONG_LITERAL146);
					adaptor.addChild(root_0, LONG_LITERAL146_tree);

					}
					break;
				case 3 :
					// smaliParser.g:681:5: SHORT_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					SHORT_LITERAL147=(Token)match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_literal2780); 
					SHORT_LITERAL147_tree = (CommonTree)adaptor.create(SHORT_LITERAL147);
					adaptor.addChild(root_0, SHORT_LITERAL147_tree);

					}
					break;
				case 4 :
					// smaliParser.g:682:5: BYTE_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					BYTE_LITERAL148=(Token)match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_literal2786); 
					BYTE_LITERAL148_tree = (CommonTree)adaptor.create(BYTE_LITERAL148);
					adaptor.addChild(root_0, BYTE_LITERAL148_tree);

					}
					break;
				case 5 :
					// smaliParser.g:683:5: float_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float_literal_in_fixed_literal2792);
					float_literal149=float_literal();
					state._fsp--;

					adaptor.addChild(root_0, float_literal149.getTree());

					}
					break;
				case 6 :
					// smaliParser.g:684:5: double_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_double_literal_in_fixed_literal2798);
					double_literal150=double_literal();
					state._fsp--;

					adaptor.addChild(root_0, double_literal150.getTree());

					}
					break;
				case 7 :
					// smaliParser.g:685:5: CHAR_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					CHAR_LITERAL151=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_literal2804); 
					CHAR_LITERAL151_tree = (CommonTree)adaptor.create(CHAR_LITERAL151);
					adaptor.addChild(root_0, CHAR_LITERAL151_tree);

					}
					break;
				case 8 :
					// smaliParser.g:686:5: BOOL_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOL_LITERAL152=(Token)match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_literal2810); 
					BOOL_LITERAL152_tree = (CommonTree)adaptor.create(BOOL_LITERAL152);
					adaptor.addChild(root_0, BOOL_LITERAL152_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fixed_literal"


	public static class array_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "array_literal"
	// smaliParser.g:688:1: array_literal : OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE -> ^( I_ENCODED_ARRAY[$start, \"I_ENCODED_ARRAY\"] ( literal )* ) ;
	public final smaliParser.array_literal_return array_literal() throws RecognitionException {
		smaliParser.array_literal_return retval = new smaliParser.array_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OPEN_BRACE153=null;
		Token COMMA155=null;
		Token CLOSE_BRACE157=null;
		ParserRuleReturnScope literal154 =null;
		ParserRuleReturnScope literal156 =null;

		CommonTree OPEN_BRACE153_tree=null;
		CommonTree COMMA155_tree=null;
		CommonTree CLOSE_BRACE157_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		try {
			// smaliParser.g:689:3: ( OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE -> ^( I_ENCODED_ARRAY[$start, \"I_ENCODED_ARRAY\"] ( literal )* ) )
			// smaliParser.g:689:5: OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE
			{
			OPEN_BRACE153=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_array_literal2820);  
			stream_OPEN_BRACE.add(OPEN_BRACE153);

			// smaliParser.g:689:16: ( literal ( COMMA literal )* |)
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==ACCESS_SPEC||LA26_0==ANNOTATION_VISIBILITY||LA26_0==ARRAY_TYPE_PREFIX||(LA26_0 >= BOOL_LITERAL && LA26_0 <= BYTE_LITERAL)||(LA26_0 >= CHAR_LITERAL && LA26_0 <= CLASS_DESCRIPTOR)||(LA26_0 >= DOUBLE_LITERAL && LA26_0 <= DOUBLE_LITERAL_OR_ID)||LA26_0==ENUM_DIRECTIVE||(LA26_0 >= FLOAT_LITERAL && LA26_0 <= FLOAT_LITERAL_OR_ID)||(LA26_0 >= INSTRUCTION_FORMAT10t && LA26_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA26_0==INSTRUCTION_FORMAT11x||LA26_0==INSTRUCTION_FORMAT12x_OR_ID||(LA26_0 >= INSTRUCTION_FORMAT21c_FIELD && LA26_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA26_0==INSTRUCTION_FORMAT21t||(LA26_0 >= INSTRUCTION_FORMAT22c_FIELD && LA26_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA26_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA26_0 <= INSTRUCTION_FORMAT22t)||LA26_0==INSTRUCTION_FORMAT23x||(LA26_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA26_0 <= INSTRUCTION_FORMAT31t)||(LA26_0 >= INSTRUCTION_FORMAT35c_CALL_SITE && LA26_0 <= INSTRUCTION_FORMAT35ms_METHOD)||(LA26_0 >= INSTRUCTION_FORMAT45cc_METHOD && LA26_0 <= INSTRUCTION_FORMAT51l)||(LA26_0 >= LONG_LITERAL && LA26_0 <= MEMBER_NAME)||(LA26_0 >= METHOD_HANDLE_TYPE_FIELD && LA26_0 <= OPEN_PAREN)||(LA26_0 >= PARAM_LIST_OR_ID_PRIMITIVE_TYPE && LA26_0 <= PRIMITIVE_TYPE)||LA26_0==REGISTER||(LA26_0 >= SHORT_LITERAL && LA26_0 <= SIMPLE_NAME)||(LA26_0 >= STRING_LITERAL && LA26_0 <= SUBANNOTATION_DIRECTIVE)||(LA26_0 >= VERIFICATION_ERROR_TYPE && LA26_0 <= VOID_TYPE)) ) {
				alt26=1;
			}
			else if ( (LA26_0==CLOSE_BRACE) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// smaliParser.g:689:17: literal ( COMMA literal )*
					{
					pushFollow(FOLLOW_literal_in_array_literal2823);
					literal154=literal();
					state._fsp--;

					stream_literal.add(literal154.getTree());
					// smaliParser.g:689:25: ( COMMA literal )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==COMMA) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// smaliParser.g:689:26: COMMA literal
							{
							COMMA155=(Token)match(input,COMMA,FOLLOW_COMMA_in_array_literal2826);  
							stream_COMMA.add(COMMA155);

							pushFollow(FOLLOW_literal_in_array_literal2828);
							literal156=literal();
							state._fsp--;

							stream_literal.add(literal156.getTree());
							}
							break;

						default :
							break loop25;
						}
					}

					}
					break;
				case 2 :
					// smaliParser.g:689:44: 
					{
					}
					break;

			}

			CLOSE_BRACE157=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_array_literal2836);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE157);

			// AST REWRITE
			// elements: literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 690:5: -> ^( I_ENCODED_ARRAY[$start, \"I_ENCODED_ARRAY\"] ( literal )* )
			{
				// smaliParser.g:690:8: ^( I_ENCODED_ARRAY[$start, \"I_ENCODED_ARRAY\"] ( literal )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ENCODED_ARRAY, (retval.start), "I_ENCODED_ARRAY"), root_1);
				// smaliParser.g:690:53: ( literal )*
				while ( stream_literal.hasNext() ) {
					adaptor.addChild(root_1, stream_literal.nextTree());
				}
				stream_literal.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_literal"


	public static class annotation_element_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotation_element"
	// smaliParser.g:692:1: annotation_element : simple_name EQUAL literal -> ^( I_ANNOTATION_ELEMENT[$start, \"I_ANNOTATION_ELEMENT\"] simple_name literal ) ;
	public final smaliParser.annotation_element_return annotation_element() throws RecognitionException {
		smaliParser.annotation_element_return retval = new smaliParser.annotation_element_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL159=null;
		ParserRuleReturnScope simple_name158 =null;
		ParserRuleReturnScope literal160 =null;

		CommonTree EQUAL159_tree=null;
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");
		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		try {
			// smaliParser.g:693:3: ( simple_name EQUAL literal -> ^( I_ANNOTATION_ELEMENT[$start, \"I_ANNOTATION_ELEMENT\"] simple_name literal ) )
			// smaliParser.g:693:5: simple_name EQUAL literal
			{
			pushFollow(FOLLOW_simple_name_in_annotation_element2860);
			simple_name158=simple_name();
			state._fsp--;

			stream_simple_name.add(simple_name158.getTree());
			EQUAL159=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_annotation_element2862);  
			stream_EQUAL.add(EQUAL159);

			pushFollow(FOLLOW_literal_in_annotation_element2864);
			literal160=literal();
			state._fsp--;

			stream_literal.add(literal160.getTree());
			// AST REWRITE
			// elements: literal, simple_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 694:5: -> ^( I_ANNOTATION_ELEMENT[$start, \"I_ANNOTATION_ELEMENT\"] simple_name literal )
			{
				// smaliParser.g:694:8: ^( I_ANNOTATION_ELEMENT[$start, \"I_ANNOTATION_ELEMENT\"] simple_name literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATION_ELEMENT, (retval.start), "I_ANNOTATION_ELEMENT"), root_1);
				adaptor.addChild(root_1, stream_simple_name.nextTree());
				adaptor.addChild(root_1, stream_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "annotation_element"


	public static class annotation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotation"
	// smaliParser.g:696:1: annotation : ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE -> ^( I_ANNOTATION[$start, \"I_ANNOTATION\"] ANNOTATION_VISIBILITY ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) ) ;
	public final smaliParser.annotation_return annotation() throws RecognitionException {
		smaliParser.annotation_return retval = new smaliParser.annotation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANNOTATION_DIRECTIVE161=null;
		Token ANNOTATION_VISIBILITY162=null;
		Token CLASS_DESCRIPTOR163=null;
		Token END_ANNOTATION_DIRECTIVE165=null;
		ParserRuleReturnScope annotation_element164 =null;

		CommonTree ANNOTATION_DIRECTIVE161_tree=null;
		CommonTree ANNOTATION_VISIBILITY162_tree=null;
		CommonTree CLASS_DESCRIPTOR163_tree=null;
		CommonTree END_ANNOTATION_DIRECTIVE165_tree=null;
		RewriteRuleTokenStream stream_ANNOTATION_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token ANNOTATION_DIRECTIVE");
		RewriteRuleTokenStream stream_ANNOTATION_VISIBILITY=new RewriteRuleTokenStream(adaptor,"token ANNOTATION_VISIBILITY");
		RewriteRuleTokenStream stream_CLASS_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token CLASS_DESCRIPTOR");
		RewriteRuleTokenStream stream_END_ANNOTATION_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_ANNOTATION_DIRECTIVE");
		RewriteRuleSubtreeStream stream_annotation_element=new RewriteRuleSubtreeStream(adaptor,"rule annotation_element");

		try {
			// smaliParser.g:697:3: ( ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE -> ^( I_ANNOTATION[$start, \"I_ANNOTATION\"] ANNOTATION_VISIBILITY ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) ) )
			// smaliParser.g:697:5: ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE
			{
			ANNOTATION_DIRECTIVE161=(Token)match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_annotation2889);  
			stream_ANNOTATION_DIRECTIVE.add(ANNOTATION_DIRECTIVE161);

			ANNOTATION_VISIBILITY162=(Token)match(input,ANNOTATION_VISIBILITY,FOLLOW_ANNOTATION_VISIBILITY_in_annotation2891);  
			stream_ANNOTATION_VISIBILITY.add(ANNOTATION_VISIBILITY162);

			CLASS_DESCRIPTOR163=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_annotation2893);  
			stream_CLASS_DESCRIPTOR.add(CLASS_DESCRIPTOR163);

			// smaliParser.g:698:5: ( annotation_element )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==ACCESS_SPEC||LA27_0==ANNOTATION_VISIBILITY||LA27_0==BOOL_LITERAL||LA27_0==DOUBLE_LITERAL_OR_ID||LA27_0==FLOAT_LITERAL_OR_ID||(LA27_0 >= INSTRUCTION_FORMAT10t && LA27_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA27_0==INSTRUCTION_FORMAT11x||LA27_0==INSTRUCTION_FORMAT12x_OR_ID||(LA27_0 >= INSTRUCTION_FORMAT21c_FIELD && LA27_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA27_0==INSTRUCTION_FORMAT21t||(LA27_0 >= INSTRUCTION_FORMAT22c_FIELD && LA27_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA27_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA27_0 <= INSTRUCTION_FORMAT22t)||LA27_0==INSTRUCTION_FORMAT23x||(LA27_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA27_0 <= INSTRUCTION_FORMAT31t)||(LA27_0 >= INSTRUCTION_FORMAT35c_CALL_SITE && LA27_0 <= INSTRUCTION_FORMAT35ms_METHOD)||(LA27_0 >= INSTRUCTION_FORMAT45cc_METHOD && LA27_0 <= INSTRUCTION_FORMAT51l)||(LA27_0 >= METHOD_HANDLE_TYPE_FIELD && LA27_0 <= NULL_LITERAL)||(LA27_0 >= PARAM_LIST_OR_ID_PRIMITIVE_TYPE && LA27_0 <= PRIMITIVE_TYPE)||LA27_0==REGISTER||LA27_0==SIMPLE_NAME||(LA27_0 >= VERIFICATION_ERROR_TYPE && LA27_0 <= VOID_TYPE)) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// smaliParser.g:698:5: annotation_element
					{
					pushFollow(FOLLOW_annotation_element_in_annotation2899);
					annotation_element164=annotation_element();
					state._fsp--;

					stream_annotation_element.add(annotation_element164.getTree());
					}
					break;

				default :
					break loop27;
				}
			}

			END_ANNOTATION_DIRECTIVE165=(Token)match(input,END_ANNOTATION_DIRECTIVE,FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation2902);  
			stream_END_ANNOTATION_DIRECTIVE.add(END_ANNOTATION_DIRECTIVE165);

			// AST REWRITE
			// elements: CLASS_DESCRIPTOR, annotation_element, ANNOTATION_VISIBILITY
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 699:5: -> ^( I_ANNOTATION[$start, \"I_ANNOTATION\"] ANNOTATION_VISIBILITY ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) )
			{
				// smaliParser.g:699:8: ^( I_ANNOTATION[$start, \"I_ANNOTATION\"] ANNOTATION_VISIBILITY ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATION, (retval.start), "I_ANNOTATION"), root_1);
				adaptor.addChild(root_1, stream_ANNOTATION_VISIBILITY.nextNode());
				// smaliParser.g:699:69: ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SUBANNOTATION, (retval.start), "I_SUBANNOTATION"), root_2);
				adaptor.addChild(root_2, stream_CLASS_DESCRIPTOR.nextNode());
				// smaliParser.g:699:131: ( annotation_element )*
				while ( stream_annotation_element.hasNext() ) {
					adaptor.addChild(root_2, stream_annotation_element.nextTree());
				}
				stream_annotation_element.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "annotation"


	public static class subannotation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "subannotation"
	// smaliParser.g:701:1: subannotation : SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE -> ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) ;
	public final smaliParser.subannotation_return subannotation() throws RecognitionException {
		smaliParser.subannotation_return retval = new smaliParser.subannotation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUBANNOTATION_DIRECTIVE166=null;
		Token CLASS_DESCRIPTOR167=null;
		Token END_SUBANNOTATION_DIRECTIVE169=null;
		ParserRuleReturnScope annotation_element168 =null;

		CommonTree SUBANNOTATION_DIRECTIVE166_tree=null;
		CommonTree CLASS_DESCRIPTOR167_tree=null;
		CommonTree END_SUBANNOTATION_DIRECTIVE169_tree=null;
		RewriteRuleTokenStream stream_SUBANNOTATION_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token SUBANNOTATION_DIRECTIVE");
		RewriteRuleTokenStream stream_CLASS_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token CLASS_DESCRIPTOR");
		RewriteRuleTokenStream stream_END_SUBANNOTATION_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_SUBANNOTATION_DIRECTIVE");
		RewriteRuleSubtreeStream stream_annotation_element=new RewriteRuleSubtreeStream(adaptor,"rule annotation_element");

		try {
			// smaliParser.g:702:3: ( SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE -> ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) )
			// smaliParser.g:702:5: SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE
			{
			SUBANNOTATION_DIRECTIVE166=(Token)match(input,SUBANNOTATION_DIRECTIVE,FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation2935);  
			stream_SUBANNOTATION_DIRECTIVE.add(SUBANNOTATION_DIRECTIVE166);

			CLASS_DESCRIPTOR167=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_subannotation2937);  
			stream_CLASS_DESCRIPTOR.add(CLASS_DESCRIPTOR167);

			// smaliParser.g:702:46: ( annotation_element )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==ACCESS_SPEC||LA28_0==ANNOTATION_VISIBILITY||LA28_0==BOOL_LITERAL||LA28_0==DOUBLE_LITERAL_OR_ID||LA28_0==FLOAT_LITERAL_OR_ID||(LA28_0 >= INSTRUCTION_FORMAT10t && LA28_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA28_0==INSTRUCTION_FORMAT11x||LA28_0==INSTRUCTION_FORMAT12x_OR_ID||(LA28_0 >= INSTRUCTION_FORMAT21c_FIELD && LA28_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA28_0==INSTRUCTION_FORMAT21t||(LA28_0 >= INSTRUCTION_FORMAT22c_FIELD && LA28_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA28_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA28_0 <= INSTRUCTION_FORMAT22t)||LA28_0==INSTRUCTION_FORMAT23x||(LA28_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA28_0 <= INSTRUCTION_FORMAT31t)||(LA28_0 >= INSTRUCTION_FORMAT35c_CALL_SITE && LA28_0 <= INSTRUCTION_FORMAT35ms_METHOD)||(LA28_0 >= INSTRUCTION_FORMAT45cc_METHOD && LA28_0 <= INSTRUCTION_FORMAT51l)||(LA28_0 >= METHOD_HANDLE_TYPE_FIELD && LA28_0 <= NULL_LITERAL)||(LA28_0 >= PARAM_LIST_OR_ID_PRIMITIVE_TYPE && LA28_0 <= PRIMITIVE_TYPE)||LA28_0==REGISTER||LA28_0==SIMPLE_NAME||(LA28_0 >= VERIFICATION_ERROR_TYPE && LA28_0 <= VOID_TYPE)) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// smaliParser.g:702:46: annotation_element
					{
					pushFollow(FOLLOW_annotation_element_in_subannotation2939);
					annotation_element168=annotation_element();
					state._fsp--;

					stream_annotation_element.add(annotation_element168.getTree());
					}
					break;

				default :
					break loop28;
				}
			}

			END_SUBANNOTATION_DIRECTIVE169=(Token)match(input,END_SUBANNOTATION_DIRECTIVE,FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation2942);  
			stream_END_SUBANNOTATION_DIRECTIVE.add(END_SUBANNOTATION_DIRECTIVE169);

			// AST REWRITE
			// elements: annotation_element, CLASS_DESCRIPTOR
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 703:5: -> ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* )
			{
				// smaliParser.g:703:8: ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SUBANNOTATION, (retval.start), "I_SUBANNOTATION"), root_1);
				adaptor.addChild(root_1, stream_CLASS_DESCRIPTOR.nextNode());
				// smaliParser.g:703:70: ( annotation_element )*
				while ( stream_annotation_element.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation_element.nextTree());
				}
				stream_annotation_element.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subannotation"


	public static class enum_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enum_literal"
	// smaliParser.g:706:1: enum_literal : ENUM_DIRECTIVE field_reference -> ^( I_ENCODED_ENUM field_reference ) ;
	public final smaliParser.enum_literal_return enum_literal() throws RecognitionException {
		smaliParser.enum_literal_return retval = new smaliParser.enum_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ENUM_DIRECTIVE170=null;
		ParserRuleReturnScope field_reference171 =null;

		CommonTree ENUM_DIRECTIVE170_tree=null;
		RewriteRuleTokenStream stream_ENUM_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token ENUM_DIRECTIVE");
		RewriteRuleSubtreeStream stream_field_reference=new RewriteRuleSubtreeStream(adaptor,"rule field_reference");

		try {
			// smaliParser.g:707:3: ( ENUM_DIRECTIVE field_reference -> ^( I_ENCODED_ENUM field_reference ) )
			// smaliParser.g:707:5: ENUM_DIRECTIVE field_reference
			{
			ENUM_DIRECTIVE170=(Token)match(input,ENUM_DIRECTIVE,FOLLOW_ENUM_DIRECTIVE_in_enum_literal2969);  
			stream_ENUM_DIRECTIVE.add(ENUM_DIRECTIVE170);

			pushFollow(FOLLOW_field_reference_in_enum_literal2971);
			field_reference171=field_reference();
			state._fsp--;

			stream_field_reference.add(field_reference171.getTree());
			// AST REWRITE
			// elements: field_reference
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 708:3: -> ^( I_ENCODED_ENUM field_reference )
			{
				// smaliParser.g:708:6: ^( I_ENCODED_ENUM field_reference )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ENCODED_ENUM, "I_ENCODED_ENUM"), root_1);
				adaptor.addChild(root_1, stream_field_reference.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enum_literal"


	public static class type_field_method_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_field_method_literal"
	// smaliParser.g:710:1: type_field_method_literal : ( reference_type_descriptor | ( ( reference_type_descriptor ARROW )? ( member_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD ( reference_type_descriptor )? member_name nonvoid_type_descriptor ) | member_name method_prototype -> ^( I_ENCODED_METHOD ( reference_type_descriptor )? member_name method_prototype ) ) ) | PRIMITIVE_TYPE | VOID_TYPE );
	public final smaliParser.type_field_method_literal_return type_field_method_literal() throws RecognitionException {
		smaliParser.type_field_method_literal_return retval = new smaliParser.type_field_method_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ARROW174=null;
		Token COLON176=null;
		Token PRIMITIVE_TYPE180=null;
		Token VOID_TYPE181=null;
		ParserRuleReturnScope reference_type_descriptor172 =null;
		ParserRuleReturnScope reference_type_descriptor173 =null;
		ParserRuleReturnScope member_name175 =null;
		ParserRuleReturnScope nonvoid_type_descriptor177 =null;
		ParserRuleReturnScope member_name178 =null;
		ParserRuleReturnScope method_prototype179 =null;

		CommonTree ARROW174_tree=null;
		CommonTree COLON176_tree=null;
		CommonTree PRIMITIVE_TYPE180_tree=null;
		CommonTree VOID_TYPE181_tree=null;
		RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_method_prototype=new RewriteRuleSubtreeStream(adaptor,"rule method_prototype");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");
		RewriteRuleSubtreeStream stream_member_name=new RewriteRuleSubtreeStream(adaptor,"rule member_name");
		RewriteRuleSubtreeStream stream_reference_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule reference_type_descriptor");

		try {
			// smaliParser.g:711:3: ( reference_type_descriptor | ( ( reference_type_descriptor ARROW )? ( member_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD ( reference_type_descriptor )? member_name nonvoid_type_descriptor ) | member_name method_prototype -> ^( I_ENCODED_METHOD ( reference_type_descriptor )? member_name method_prototype ) ) ) | PRIMITIVE_TYPE | VOID_TYPE )
			int alt31=4;
			switch ( input.LA(1) ) {
			case CLASS_DESCRIPTOR:
				{
				int LA31_1 = input.LA(2);
				if ( (LA31_1==EOF||(LA31_1 >= ACCESS_SPEC && LA31_1 <= ANNOTATION_VISIBILITY)||LA31_1==BOOL_LITERAL||(LA31_1 >= CLASS_DIRECTIVE && LA31_1 <= CLOSE_PAREN)||LA31_1==COMMA||(LA31_1 >= DOUBLE_LITERAL_OR_ID && LA31_1 <= END_ANNOTATION_DIRECTIVE)||LA31_1==END_FIELD_DIRECTIVE||LA31_1==END_SUBANNOTATION_DIRECTIVE||LA31_1==FIELD_DIRECTIVE||(LA31_1 >= FLOAT_LITERAL_OR_ID && LA31_1 <= IMPLEMENTS_DIRECTIVE)||(LA31_1 >= INSTRUCTION_FORMAT10t && LA31_1 <= INSTRUCTION_FORMAT10x_ODEX)||LA31_1==INSTRUCTION_FORMAT11x||LA31_1==INSTRUCTION_FORMAT12x_OR_ID||(LA31_1 >= INSTRUCTION_FORMAT21c_FIELD && LA31_1 <= INSTRUCTION_FORMAT21c_TYPE)||LA31_1==INSTRUCTION_FORMAT21t||(LA31_1 >= INSTRUCTION_FORMAT22c_FIELD && LA31_1 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA31_1 >= INSTRUCTION_FORMAT22s_OR_ID && LA31_1 <= INSTRUCTION_FORMAT22t)||LA31_1==INSTRUCTION_FORMAT23x||(LA31_1 >= INSTRUCTION_FORMAT31i_OR_ID && LA31_1 <= INSTRUCTION_FORMAT31t)||(LA31_1 >= INSTRUCTION_FORMAT35c_CALL_SITE && LA31_1 <= INSTRUCTION_FORMAT35ms_METHOD)||(LA31_1 >= INSTRUCTION_FORMAT45cc_METHOD && LA31_1 <= INSTRUCTION_FORMAT51l)||(LA31_1 >= METHOD_DIRECTIVE && LA31_1 <= NULL_LITERAL)||(LA31_1 >= PARAM_LIST_OR_ID_PRIMITIVE_TYPE && LA31_1 <= PRIMITIVE_TYPE)||LA31_1==REGISTER||(LA31_1 >= SIMPLE_NAME && LA31_1 <= SOURCE_DIRECTIVE)||(LA31_1 >= SUPER_DIRECTIVE && LA31_1 <= VOID_TYPE)) ) {
					alt31=1;
				}
				else if ( (LA31_1==ARROW) ) {
					alt31=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ARRAY_TYPE_PREFIX:
				{
				int LA31_2 = input.LA(2);
				if ( (LA31_2==CLASS_DESCRIPTOR||LA31_2==PRIMITIVE_TYPE) ) {
					int LA31_7 = input.LA(3);
					if ( (LA31_7==EOF||(LA31_7 >= ACCESS_SPEC && LA31_7 <= ANNOTATION_VISIBILITY)||LA31_7==BOOL_LITERAL||(LA31_7 >= CLASS_DIRECTIVE && LA31_7 <= CLOSE_PAREN)||LA31_7==COMMA||(LA31_7 >= DOUBLE_LITERAL_OR_ID && LA31_7 <= END_ANNOTATION_DIRECTIVE)||LA31_7==END_FIELD_DIRECTIVE||LA31_7==END_SUBANNOTATION_DIRECTIVE||LA31_7==FIELD_DIRECTIVE||(LA31_7 >= FLOAT_LITERAL_OR_ID && LA31_7 <= IMPLEMENTS_DIRECTIVE)||(LA31_7 >= INSTRUCTION_FORMAT10t && LA31_7 <= INSTRUCTION_FORMAT10x_ODEX)||LA31_7==INSTRUCTION_FORMAT11x||LA31_7==INSTRUCTION_FORMAT12x_OR_ID||(LA31_7 >= INSTRUCTION_FORMAT21c_FIELD && LA31_7 <= INSTRUCTION_FORMAT21c_TYPE)||LA31_7==INSTRUCTION_FORMAT21t||(LA31_7 >= INSTRUCTION_FORMAT22c_FIELD && LA31_7 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA31_7 >= INSTRUCTION_FORMAT22s_OR_ID && LA31_7 <= INSTRUCTION_FORMAT22t)||LA31_7==INSTRUCTION_FORMAT23x||(LA31_7 >= INSTRUCTION_FORMAT31i_OR_ID && LA31_7 <= INSTRUCTION_FORMAT31t)||(LA31_7 >= INSTRUCTION_FORMAT35c_CALL_SITE && LA31_7 <= INSTRUCTION_FORMAT35ms_METHOD)||(LA31_7 >= INSTRUCTION_FORMAT45cc_METHOD && LA31_7 <= INSTRUCTION_FORMAT51l)||(LA31_7 >= METHOD_DIRECTIVE && LA31_7 <= NULL_LITERAL)||(LA31_7 >= PARAM_LIST_OR_ID_PRIMITIVE_TYPE && LA31_7 <= PRIMITIVE_TYPE)||LA31_7==REGISTER||(LA31_7 >= SIMPLE_NAME && LA31_7 <= SOURCE_DIRECTIVE)||(LA31_7 >= SUPER_DIRECTIVE && LA31_7 <= VOID_TYPE)) ) {
						alt31=1;
					}
					else if ( (LA31_7==ARROW) ) {
						alt31=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ACCESS_SPEC:
			case ANNOTATION_VISIBILITY:
			case BOOL_LITERAL:
			case DOUBLE_LITERAL_OR_ID:
			case FLOAT_LITERAL_OR_ID:
			case INSTRUCTION_FORMAT10t:
			case INSTRUCTION_FORMAT10x:
			case INSTRUCTION_FORMAT10x_ODEX:
			case INSTRUCTION_FORMAT11x:
			case INSTRUCTION_FORMAT12x_OR_ID:
			case INSTRUCTION_FORMAT21c_FIELD:
			case INSTRUCTION_FORMAT21c_FIELD_ODEX:
			case INSTRUCTION_FORMAT21c_METHOD_HANDLE:
			case INSTRUCTION_FORMAT21c_METHOD_TYPE:
			case INSTRUCTION_FORMAT21c_STRING:
			case INSTRUCTION_FORMAT21c_TYPE:
			case INSTRUCTION_FORMAT21t:
			case INSTRUCTION_FORMAT22c_FIELD:
			case INSTRUCTION_FORMAT22c_FIELD_ODEX:
			case INSTRUCTION_FORMAT22c_TYPE:
			case INSTRUCTION_FORMAT22cs_FIELD:
			case INSTRUCTION_FORMAT22s_OR_ID:
			case INSTRUCTION_FORMAT22t:
			case INSTRUCTION_FORMAT23x:
			case INSTRUCTION_FORMAT31i_OR_ID:
			case INSTRUCTION_FORMAT31t:
			case INSTRUCTION_FORMAT35c_CALL_SITE:
			case INSTRUCTION_FORMAT35c_METHOD:
			case INSTRUCTION_FORMAT35c_METHOD_ODEX:
			case INSTRUCTION_FORMAT35c_TYPE:
			case INSTRUCTION_FORMAT35mi_METHOD:
			case INSTRUCTION_FORMAT35ms_METHOD:
			case INSTRUCTION_FORMAT45cc_METHOD:
			case INSTRUCTION_FORMAT4rcc_METHOD:
			case INSTRUCTION_FORMAT51l:
			case MEMBER_NAME:
			case METHOD_HANDLE_TYPE_FIELD:
			case METHOD_HANDLE_TYPE_METHOD:
			case NEGATIVE_INTEGER_LITERAL:
			case NULL_LITERAL:
			case PARAM_LIST_OR_ID_PRIMITIVE_TYPE:
			case POSITIVE_INTEGER_LITERAL:
			case REGISTER:
			case SIMPLE_NAME:
			case VERIFICATION_ERROR_TYPE:
				{
				alt31=2;
				}
				break;
			case PRIMITIVE_TYPE:
				{
				int LA31_4 = input.LA(2);
				if ( (LA31_4==COLON||LA31_4==OPEN_PAREN) ) {
					alt31=2;
				}
				else if ( (LA31_4==EOF||(LA31_4 >= ACCESS_SPEC && LA31_4 <= ANNOTATION_VISIBILITY)||LA31_4==BOOL_LITERAL||(LA31_4 >= CLASS_DIRECTIVE && LA31_4 <= CLOSE_PAREN)||LA31_4==COMMA||(LA31_4 >= DOUBLE_LITERAL_OR_ID && LA31_4 <= END_ANNOTATION_DIRECTIVE)||LA31_4==END_FIELD_DIRECTIVE||LA31_4==END_SUBANNOTATION_DIRECTIVE||LA31_4==FIELD_DIRECTIVE||(LA31_4 >= FLOAT_LITERAL_OR_ID && LA31_4 <= IMPLEMENTS_DIRECTIVE)||(LA31_4 >= INSTRUCTION_FORMAT10t && LA31_4 <= INSTRUCTION_FORMAT10x_ODEX)||LA31_4==INSTRUCTION_FORMAT11x||LA31_4==INSTRUCTION_FORMAT12x_OR_ID||(LA31_4 >= INSTRUCTION_FORMAT21c_FIELD && LA31_4 <= INSTRUCTION_FORMAT21c_TYPE)||LA31_4==INSTRUCTION_FORMAT21t||(LA31_4 >= INSTRUCTION_FORMAT22c_FIELD && LA31_4 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA31_4 >= INSTRUCTION_FORMAT22s_OR_ID && LA31_4 <= INSTRUCTION_FORMAT22t)||LA31_4==INSTRUCTION_FORMAT23x||(LA31_4 >= INSTRUCTION_FORMAT31i_OR_ID && LA31_4 <= INSTRUCTION_FORMAT31t)||(LA31_4 >= INSTRUCTION_FORMAT35c_CALL_SITE && LA31_4 <= INSTRUCTION_FORMAT35ms_METHOD)||(LA31_4 >= INSTRUCTION_FORMAT45cc_METHOD && LA31_4 <= INSTRUCTION_FORMAT51l)||(LA31_4 >= METHOD_DIRECTIVE && LA31_4 <= NULL_LITERAL)||(LA31_4 >= PARAM_LIST_OR_ID_PRIMITIVE_TYPE && LA31_4 <= PRIMITIVE_TYPE)||LA31_4==REGISTER||(LA31_4 >= SIMPLE_NAME && LA31_4 <= SOURCE_DIRECTIVE)||(LA31_4 >= SUPER_DIRECTIVE && LA31_4 <= VOID_TYPE)) ) {
					alt31=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VOID_TYPE:
				{
				int LA31_5 = input.LA(2);
				if ( (LA31_5==COLON||LA31_5==OPEN_PAREN) ) {
					alt31=2;
				}
				else if ( (LA31_5==EOF||(LA31_5 >= ACCESS_SPEC && LA31_5 <= ANNOTATION_VISIBILITY)||LA31_5==BOOL_LITERAL||(LA31_5 >= CLASS_DIRECTIVE && LA31_5 <= CLOSE_PAREN)||LA31_5==COMMA||(LA31_5 >= DOUBLE_LITERAL_OR_ID && LA31_5 <= END_ANNOTATION_DIRECTIVE)||LA31_5==END_FIELD_DIRECTIVE||LA31_5==END_SUBANNOTATION_DIRECTIVE||LA31_5==FIELD_DIRECTIVE||(LA31_5 >= FLOAT_LITERAL_OR_ID && LA31_5 <= IMPLEMENTS_DIRECTIVE)||(LA31_5 >= INSTRUCTION_FORMAT10t && LA31_5 <= INSTRUCTION_FORMAT10x_ODEX)||LA31_5==INSTRUCTION_FORMAT11x||LA31_5==INSTRUCTION_FORMAT12x_OR_ID||(LA31_5 >= INSTRUCTION_FORMAT21c_FIELD && LA31_5 <= INSTRUCTION_FORMAT21c_TYPE)||LA31_5==INSTRUCTION_FORMAT21t||(LA31_5 >= INSTRUCTION_FORMAT22c_FIELD && LA31_5 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA31_5 >= INSTRUCTION_FORMAT22s_OR_ID && LA31_5 <= INSTRUCTION_FORMAT22t)||LA31_5==INSTRUCTION_FORMAT23x||(LA31_5 >= INSTRUCTION_FORMAT31i_OR_ID && LA31_5 <= INSTRUCTION_FORMAT31t)||(LA31_5 >= INSTRUCTION_FORMAT35c_CALL_SITE && LA31_5 <= INSTRUCTION_FORMAT35ms_METHOD)||(LA31_5 >= INSTRUCTION_FORMAT45cc_METHOD && LA31_5 <= INSTRUCTION_FORMAT51l)||(LA31_5 >= METHOD_DIRECTIVE && LA31_5 <= NULL_LITERAL)||(LA31_5 >= PARAM_LIST_OR_ID_PRIMITIVE_TYPE && LA31_5 <= PRIMITIVE_TYPE)||LA31_5==REGISTER||(LA31_5 >= SIMPLE_NAME && LA31_5 <= SOURCE_DIRECTIVE)||(LA31_5 >= SUPER_DIRECTIVE && LA31_5 <= VOID_TYPE)) ) {
					alt31=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// smaliParser.g:711:5: reference_type_descriptor
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_reference_type_descriptor_in_type_field_method_literal2991);
					reference_type_descriptor172=reference_type_descriptor();
					state._fsp--;

					adaptor.addChild(root_0, reference_type_descriptor172.getTree());

					}
					break;
				case 2 :
					// smaliParser.g:712:5: ( ( reference_type_descriptor ARROW )? ( member_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD ( reference_type_descriptor )? member_name nonvoid_type_descriptor ) | member_name method_prototype -> ^( I_ENCODED_METHOD ( reference_type_descriptor )? member_name method_prototype ) ) )
					{
					// smaliParser.g:712:5: ( ( reference_type_descriptor ARROW )? ( member_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD ( reference_type_descriptor )? member_name nonvoid_type_descriptor ) | member_name method_prototype -> ^( I_ENCODED_METHOD ( reference_type_descriptor )? member_name method_prototype ) ) )
					// smaliParser.g:712:7: ( reference_type_descriptor ARROW )? ( member_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD ( reference_type_descriptor )? member_name nonvoid_type_descriptor ) | member_name method_prototype -> ^( I_ENCODED_METHOD ( reference_type_descriptor )? member_name method_prototype ) )
					{
					// smaliParser.g:712:7: ( reference_type_descriptor ARROW )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==ARRAY_TYPE_PREFIX||LA29_0==CLASS_DESCRIPTOR) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// smaliParser.g:712:8: reference_type_descriptor ARROW
							{
							pushFollow(FOLLOW_reference_type_descriptor_in_type_field_method_literal3000);
							reference_type_descriptor173=reference_type_descriptor();
							state._fsp--;

							stream_reference_type_descriptor.add(reference_type_descriptor173.getTree());
							ARROW174=(Token)match(input,ARROW,FOLLOW_ARROW_in_type_field_method_literal3002);  
							stream_ARROW.add(ARROW174);

							}
							break;

					}

					// smaliParser.g:713:7: ( member_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD ( reference_type_descriptor )? member_name nonvoid_type_descriptor ) | member_name method_prototype -> ^( I_ENCODED_METHOD ( reference_type_descriptor )? member_name method_prototype ) )
					int alt30=2;
					alt30 = dfa30.predict(input);
					switch (alt30) {
						case 1 :
							// smaliParser.g:713:9: member_name COLON nonvoid_type_descriptor
							{
							pushFollow(FOLLOW_member_name_in_type_field_method_literal3014);
							member_name175=member_name();
							state._fsp--;

							stream_member_name.add(member_name175.getTree());
							COLON176=(Token)match(input,COLON,FOLLOW_COLON_in_type_field_method_literal3016);  
							stream_COLON.add(COLON176);

							pushFollow(FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal3018);
							nonvoid_type_descriptor177=nonvoid_type_descriptor();
							state._fsp--;

							stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor177.getTree());
							// AST REWRITE
							// elements: reference_type_descriptor, member_name, nonvoid_type_descriptor
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 713:51: -> ^( I_ENCODED_FIELD ( reference_type_descriptor )? member_name nonvoid_type_descriptor )
							{
								// smaliParser.g:713:54: ^( I_ENCODED_FIELD ( reference_type_descriptor )? member_name nonvoid_type_descriptor )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ENCODED_FIELD, "I_ENCODED_FIELD"), root_1);
								// smaliParser.g:713:72: ( reference_type_descriptor )?
								if ( stream_reference_type_descriptor.hasNext() ) {
									adaptor.addChild(root_1, stream_reference_type_descriptor.nextTree());
								}
								stream_reference_type_descriptor.reset();

								adaptor.addChild(root_1, stream_member_name.nextTree());
								adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// smaliParser.g:714:9: member_name method_prototype
							{
							pushFollow(FOLLOW_member_name_in_type_field_method_literal3041);
							member_name178=member_name();
							state._fsp--;

							stream_member_name.add(member_name178.getTree());
							pushFollow(FOLLOW_method_prototype_in_type_field_method_literal3043);
							method_prototype179=method_prototype();
							state._fsp--;

							stream_method_prototype.add(method_prototype179.getTree());
							// AST REWRITE
							// elements: reference_type_descriptor, method_prototype, member_name
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 714:38: -> ^( I_ENCODED_METHOD ( reference_type_descriptor )? member_name method_prototype )
							{
								// smaliParser.g:714:41: ^( I_ENCODED_METHOD ( reference_type_descriptor )? member_name method_prototype )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ENCODED_METHOD, "I_ENCODED_METHOD"), root_1);
								// smaliParser.g:714:60: ( reference_type_descriptor )?
								if ( stream_reference_type_descriptor.hasNext() ) {
									adaptor.addChild(root_1, stream_reference_type_descriptor.nextTree());
								}
								stream_reference_type_descriptor.reset();

								adaptor.addChild(root_1, stream_member_name.nextTree());
								adaptor.addChild(root_1, stream_method_prototype.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}

					}
					break;
				case 3 :
					// smaliParser.g:717:5: PRIMITIVE_TYPE
					{
					root_0 = (CommonTree)adaptor.nil();


					PRIMITIVE_TYPE180=(Token)match(input,PRIMITIVE_TYPE,FOLLOW_PRIMITIVE_TYPE_in_type_field_method_literal3076); 
					PRIMITIVE_TYPE180_tree = (CommonTree)adaptor.create(PRIMITIVE_TYPE180);
					adaptor.addChild(root_0, PRIMITIVE_TYPE180_tree);

					}
					break;
				case 4 :
					// smaliParser.g:718:5: VOID_TYPE
					{
					root_0 = (CommonTree)adaptor.nil();


					VOID_TYPE181=(Token)match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_type_field_method_literal3082); 
					VOID_TYPE181_tree = (CommonTree)adaptor.create(VOID_TYPE181);
					adaptor.addChild(root_0, VOID_TYPE181_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_field_method_literal"


	public static class call_site_reference_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "call_site_reference"
	// smaliParser.g:720:1: call_site_reference : simple_name OPEN_PAREN STRING_LITERAL COMMA method_prototype ( COMMA literal )* CLOSE_PAREN AT method_reference -> ^( I_CALL_SITE_REFERENCE simple_name STRING_LITERAL method_prototype ^( I_CALL_SITE_EXTRA_ARGUMENTS ( literal )* ) method_reference ) ;
	public final smaliParser.call_site_reference_return call_site_reference() throws RecognitionException {
		smaliParser.call_site_reference_return retval = new smaliParser.call_site_reference_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OPEN_PAREN183=null;
		Token STRING_LITERAL184=null;
		Token COMMA185=null;
		Token COMMA187=null;
		Token CLOSE_PAREN189=null;
		Token AT190=null;
		ParserRuleReturnScope simple_name182 =null;
		ParserRuleReturnScope method_prototype186 =null;
		ParserRuleReturnScope literal188 =null;
		ParserRuleReturnScope method_reference191 =null;

		CommonTree OPEN_PAREN183_tree=null;
		CommonTree STRING_LITERAL184_tree=null;
		CommonTree COMMA185_tree=null;
		CommonTree COMMA187_tree=null;
		CommonTree CLOSE_PAREN189_tree=null;
		CommonTree AT190_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
		RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
		RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
		RewriteRuleSubtreeStream stream_method_reference=new RewriteRuleSubtreeStream(adaptor,"rule method_reference");
		RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");
		RewriteRuleSubtreeStream stream_method_prototype=new RewriteRuleSubtreeStream(adaptor,"rule method_prototype");
		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		try {
			// smaliParser.g:721:3: ( simple_name OPEN_PAREN STRING_LITERAL COMMA method_prototype ( COMMA literal )* CLOSE_PAREN AT method_reference -> ^( I_CALL_SITE_REFERENCE simple_name STRING_LITERAL method_prototype ^( I_CALL_SITE_EXTRA_ARGUMENTS ( literal )* ) method_reference ) )
			// smaliParser.g:721:5: simple_name OPEN_PAREN STRING_LITERAL COMMA method_prototype ( COMMA literal )* CLOSE_PAREN AT method_reference
			{
			pushFollow(FOLLOW_simple_name_in_call_site_reference3092);
			simple_name182=simple_name();
			state._fsp--;

			stream_simple_name.add(simple_name182.getTree());
			OPEN_PAREN183=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_call_site_reference3094);  
			stream_OPEN_PAREN.add(OPEN_PAREN183);

			STRING_LITERAL184=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_call_site_reference3096);  
			stream_STRING_LITERAL.add(STRING_LITERAL184);

			COMMA185=(Token)match(input,COMMA,FOLLOW_COMMA_in_call_site_reference3098);  
			stream_COMMA.add(COMMA185);

			pushFollow(FOLLOW_method_prototype_in_call_site_reference3100);
			method_prototype186=method_prototype();
			state._fsp--;

			stream_method_prototype.add(method_prototype186.getTree());
			// smaliParser.g:721:66: ( COMMA literal )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==COMMA) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// smaliParser.g:721:67: COMMA literal
					{
					COMMA187=(Token)match(input,COMMA,FOLLOW_COMMA_in_call_site_reference3103);  
					stream_COMMA.add(COMMA187);

					pushFollow(FOLLOW_literal_in_call_site_reference3105);
					literal188=literal();
					state._fsp--;

					stream_literal.add(literal188.getTree());
					}
					break;

				default :
					break loop32;
				}
			}

			CLOSE_PAREN189=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_call_site_reference3109);  
			stream_CLOSE_PAREN.add(CLOSE_PAREN189);

			AT190=(Token)match(input,AT,FOLLOW_AT_in_call_site_reference3111);  
			stream_AT.add(AT190);

			pushFollow(FOLLOW_method_reference_in_call_site_reference3113);
			method_reference191=method_reference();
			state._fsp--;

			stream_method_reference.add(method_reference191.getTree());
			// AST REWRITE
			// elements: simple_name, literal, method_reference, STRING_LITERAL, method_prototype
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 722:5: -> ^( I_CALL_SITE_REFERENCE simple_name STRING_LITERAL method_prototype ^( I_CALL_SITE_EXTRA_ARGUMENTS ( literal )* ) method_reference )
			{
				// smaliParser.g:722:8: ^( I_CALL_SITE_REFERENCE simple_name STRING_LITERAL method_prototype ^( I_CALL_SITE_EXTRA_ARGUMENTS ( literal )* ) method_reference )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_CALL_SITE_REFERENCE, "I_CALL_SITE_REFERENCE"), root_1);
				adaptor.addChild(root_1, stream_simple_name.nextTree());
				adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());
				adaptor.addChild(root_1, stream_method_prototype.nextTree());
				// smaliParser.g:722:76: ^( I_CALL_SITE_EXTRA_ARGUMENTS ( literal )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_CALL_SITE_EXTRA_ARGUMENTS, "I_CALL_SITE_EXTRA_ARGUMENTS"), root_2);
				// smaliParser.g:722:106: ( literal )*
				while ( stream_literal.hasNext() ) {
					adaptor.addChild(root_2, stream_literal.nextTree());
				}
				stream_literal.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_method_reference.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "call_site_reference"


	public static class method_handle_reference_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "method_handle_reference"
	// smaliParser.g:725:1: method_handle_reference : ( METHOD_HANDLE_TYPE_FIELD AT field_reference -> METHOD_HANDLE_TYPE_FIELD field_reference | METHOD_HANDLE_TYPE_METHOD AT method_reference -> METHOD_HANDLE_TYPE_METHOD method_reference );
	public final smaliParser.method_handle_reference_return method_handle_reference() throws RecognitionException {
		smaliParser.method_handle_reference_return retval = new smaliParser.method_handle_reference_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token METHOD_HANDLE_TYPE_FIELD192=null;
		Token AT193=null;
		Token METHOD_HANDLE_TYPE_METHOD195=null;
		Token AT196=null;
		ParserRuleReturnScope field_reference194 =null;
		ParserRuleReturnScope method_reference197 =null;

		CommonTree METHOD_HANDLE_TYPE_FIELD192_tree=null;
		CommonTree AT193_tree=null;
		CommonTree METHOD_HANDLE_TYPE_METHOD195_tree=null;
		CommonTree AT196_tree=null;
		RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
		RewriteRuleTokenStream stream_METHOD_HANDLE_TYPE_FIELD=new RewriteRuleTokenStream(adaptor,"token METHOD_HANDLE_TYPE_FIELD");
		RewriteRuleTokenStream stream_METHOD_HANDLE_TYPE_METHOD=new RewriteRuleTokenStream(adaptor,"token METHOD_HANDLE_TYPE_METHOD");
		RewriteRuleSubtreeStream stream_method_reference=new RewriteRuleSubtreeStream(adaptor,"rule method_reference");
		RewriteRuleSubtreeStream stream_field_reference=new RewriteRuleSubtreeStream(adaptor,"rule field_reference");

		try {
			// smaliParser.g:726:3: ( METHOD_HANDLE_TYPE_FIELD AT field_reference -> METHOD_HANDLE_TYPE_FIELD field_reference | METHOD_HANDLE_TYPE_METHOD AT method_reference -> METHOD_HANDLE_TYPE_METHOD method_reference )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==METHOD_HANDLE_TYPE_FIELD) ) {
				alt33=1;
			}
			else if ( (LA33_0==METHOD_HANDLE_TYPE_METHOD) ) {
				alt33=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// smaliParser.g:726:5: METHOD_HANDLE_TYPE_FIELD AT field_reference
					{
					METHOD_HANDLE_TYPE_FIELD192=(Token)match(input,METHOD_HANDLE_TYPE_FIELD,FOLLOW_METHOD_HANDLE_TYPE_FIELD_in_method_handle_reference3157);  
					stream_METHOD_HANDLE_TYPE_FIELD.add(METHOD_HANDLE_TYPE_FIELD192);

					AT193=(Token)match(input,AT,FOLLOW_AT_in_method_handle_reference3159);  
					stream_AT.add(AT193);

					pushFollow(FOLLOW_field_reference_in_method_handle_reference3161);
					field_reference194=field_reference();
					state._fsp--;

					stream_field_reference.add(field_reference194.getTree());
					// AST REWRITE
					// elements: field_reference, METHOD_HANDLE_TYPE_FIELD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 726:49: -> METHOD_HANDLE_TYPE_FIELD field_reference
					{
						adaptor.addChild(root_0, stream_METHOD_HANDLE_TYPE_FIELD.nextNode());
						adaptor.addChild(root_0, stream_field_reference.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// smaliParser.g:727:5: METHOD_HANDLE_TYPE_METHOD AT method_reference
					{
					METHOD_HANDLE_TYPE_METHOD195=(Token)match(input,METHOD_HANDLE_TYPE_METHOD,FOLLOW_METHOD_HANDLE_TYPE_METHOD_in_method_handle_reference3173);  
					stream_METHOD_HANDLE_TYPE_METHOD.add(METHOD_HANDLE_TYPE_METHOD195);

					AT196=(Token)match(input,AT,FOLLOW_AT_in_method_handle_reference3175);  
					stream_AT.add(AT196);

					pushFollow(FOLLOW_method_reference_in_method_handle_reference3177);
					method_reference197=method_reference();
					state._fsp--;

					stream_method_reference.add(method_reference197.getTree());
					// AST REWRITE
					// elements: METHOD_HANDLE_TYPE_METHOD, method_reference
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 727:51: -> METHOD_HANDLE_TYPE_METHOD method_reference
					{
						adaptor.addChild(root_0, stream_METHOD_HANDLE_TYPE_METHOD.nextNode());
						adaptor.addChild(root_0, stream_method_reference.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "method_handle_reference"


	public static class method_handle_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "method_handle_literal"
	// smaliParser.g:729:1: method_handle_literal : method_handle_reference -> ^( I_ENCODED_METHOD_HANDLE method_handle_reference ) ;
	public final smaliParser.method_handle_literal_return method_handle_literal() throws RecognitionException {
		smaliParser.method_handle_literal_return retval = new smaliParser.method_handle_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope method_handle_reference198 =null;

		RewriteRuleSubtreeStream stream_method_handle_reference=new RewriteRuleSubtreeStream(adaptor,"rule method_handle_reference");

		try {
			// smaliParser.g:730:3: ( method_handle_reference -> ^( I_ENCODED_METHOD_HANDLE method_handle_reference ) )
			// smaliParser.g:730:5: method_handle_reference
			{
			pushFollow(FOLLOW_method_handle_reference_in_method_handle_literal3193);
			method_handle_reference198=method_handle_reference();
			state._fsp--;

			stream_method_handle_reference.add(method_handle_reference198.getTree());
			// AST REWRITE
			// elements: method_handle_reference
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 731:3: -> ^( I_ENCODED_METHOD_HANDLE method_handle_reference )
			{
				// smaliParser.g:731:6: ^( I_ENCODED_METHOD_HANDLE method_handle_reference )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ENCODED_METHOD_HANDLE, "I_ENCODED_METHOD_HANDLE"), root_1);
				adaptor.addChild(root_1, stream_method_handle_reference.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "method_handle_literal"


	public static class method_reference_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "method_reference"
	// smaliParser.g:733:1: method_reference : ( reference_type_descriptor ARROW )? member_name method_prototype -> ( reference_type_descriptor )? member_name method_prototype ;
	public final smaliParser.method_reference_return method_reference() throws RecognitionException {
		smaliParser.method_reference_return retval = new smaliParser.method_reference_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ARROW200=null;
		ParserRuleReturnScope reference_type_descriptor199 =null;
		ParserRuleReturnScope member_name201 =null;
		ParserRuleReturnScope method_prototype202 =null;

		CommonTree ARROW200_tree=null;
		RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
		RewriteRuleSubtreeStream stream_method_prototype=new RewriteRuleSubtreeStream(adaptor,"rule method_prototype");
		RewriteRuleSubtreeStream stream_member_name=new RewriteRuleSubtreeStream(adaptor,"rule member_name");
		RewriteRuleSubtreeStream stream_reference_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule reference_type_descriptor");

		try {
			// smaliParser.g:734:3: ( ( reference_type_descriptor ARROW )? member_name method_prototype -> ( reference_type_descriptor )? member_name method_prototype )
			// smaliParser.g:734:5: ( reference_type_descriptor ARROW )? member_name method_prototype
			{
			// smaliParser.g:734:5: ( reference_type_descriptor ARROW )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==ARRAY_TYPE_PREFIX||LA34_0==CLASS_DESCRIPTOR) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// smaliParser.g:734:6: reference_type_descriptor ARROW
					{
					pushFollow(FOLLOW_reference_type_descriptor_in_method_reference3214);
					reference_type_descriptor199=reference_type_descriptor();
					state._fsp--;

					stream_reference_type_descriptor.add(reference_type_descriptor199.getTree());
					ARROW200=(Token)match(input,ARROW,FOLLOW_ARROW_in_method_reference3216);  
					stream_ARROW.add(ARROW200);

					}
					break;

			}

			pushFollow(FOLLOW_member_name_in_method_reference3220);
			member_name201=member_name();
			state._fsp--;

			stream_member_name.add(member_name201.getTree());
			pushFollow(FOLLOW_method_prototype_in_method_reference3222);
			method_prototype202=method_prototype();
			state._fsp--;

			stream_method_prototype.add(method_prototype202.getTree());
			// AST REWRITE
			// elements: member_name, method_prototype, reference_type_descriptor
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 735:3: -> ( reference_type_descriptor )? member_name method_prototype
			{
				// smaliParser.g:735:6: ( reference_type_descriptor )?
				if ( stream_reference_type_descriptor.hasNext() ) {
					adaptor.addChild(root_0, stream_reference_type_descriptor.nextTree());
				}
				stream_reference_type_descriptor.reset();

				adaptor.addChild(root_0, stream_member_name.nextTree());
				adaptor.addChild(root_0, stream_method_prototype.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "method_reference"


	public static class field_reference_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "field_reference"
	// smaliParser.g:737:1: field_reference : ( reference_type_descriptor ARROW )? member_name COLON nonvoid_type_descriptor -> ( reference_type_descriptor )? member_name nonvoid_type_descriptor ;
	public final smaliParser.field_reference_return field_reference() throws RecognitionException {
		smaliParser.field_reference_return retval = new smaliParser.field_reference_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ARROW204=null;
		Token COLON206=null;
		ParserRuleReturnScope reference_type_descriptor203 =null;
		ParserRuleReturnScope member_name205 =null;
		ParserRuleReturnScope nonvoid_type_descriptor207 =null;

		CommonTree ARROW204_tree=null;
		CommonTree COLON206_tree=null;
		RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");
		RewriteRuleSubtreeStream stream_member_name=new RewriteRuleSubtreeStream(adaptor,"rule member_name");
		RewriteRuleSubtreeStream stream_reference_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule reference_type_descriptor");

		try {
			// smaliParser.g:738:3: ( ( reference_type_descriptor ARROW )? member_name COLON nonvoid_type_descriptor -> ( reference_type_descriptor )? member_name nonvoid_type_descriptor )
			// smaliParser.g:738:5: ( reference_type_descriptor ARROW )? member_name COLON nonvoid_type_descriptor
			{
			// smaliParser.g:738:5: ( reference_type_descriptor ARROW )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==ARRAY_TYPE_PREFIX||LA35_0==CLASS_DESCRIPTOR) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// smaliParser.g:738:6: reference_type_descriptor ARROW
					{
					pushFollow(FOLLOW_reference_type_descriptor_in_field_reference3244);
					reference_type_descriptor203=reference_type_descriptor();
					state._fsp--;

					stream_reference_type_descriptor.add(reference_type_descriptor203.getTree());
					ARROW204=(Token)match(input,ARROW,FOLLOW_ARROW_in_field_reference3246);  
					stream_ARROW.add(ARROW204);

					}
					break;

			}

			pushFollow(FOLLOW_member_name_in_field_reference3250);
			member_name205=member_name();
			state._fsp--;

			stream_member_name.add(member_name205.getTree());
			COLON206=(Token)match(input,COLON,FOLLOW_COLON_in_field_reference3252);  
			stream_COLON.add(COLON206);

			pushFollow(FOLLOW_nonvoid_type_descriptor_in_field_reference3254);
			nonvoid_type_descriptor207=nonvoid_type_descriptor();
			state._fsp--;

			stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor207.getTree());
			// AST REWRITE
			// elements: reference_type_descriptor, nonvoid_type_descriptor, member_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 739:3: -> ( reference_type_descriptor )? member_name nonvoid_type_descriptor
			{
				// smaliParser.g:739:6: ( reference_type_descriptor )?
				if ( stream_reference_type_descriptor.hasNext() ) {
					adaptor.addChild(root_0, stream_reference_type_descriptor.nextTree());
				}
				stream_reference_type_descriptor.reset();

				adaptor.addChild(root_0, stream_member_name.nextTree());
				adaptor.addChild(root_0, stream_nonvoid_type_descriptor.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field_reference"


	public static class label_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "label"
	// smaliParser.g:741:1: label : COLON simple_name -> ^( I_LABEL[$COLON, \"I_LABEL\"] simple_name ) ;
	public final smaliParser.label_return label() throws RecognitionException {
		smaliParser.label_return retval = new smaliParser.label_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COLON208=null;
		ParserRuleReturnScope simple_name209 =null;

		CommonTree COLON208_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");

		try {
			// smaliParser.g:742:3: ( COLON simple_name -> ^( I_LABEL[$COLON, \"I_LABEL\"] simple_name ) )
			// smaliParser.g:742:5: COLON simple_name
			{
			COLON208=(Token)match(input,COLON,FOLLOW_COLON_in_label3275);  
			stream_COLON.add(COLON208);

			pushFollow(FOLLOW_simple_name_in_label3277);
			simple_name209=simple_name();
			state._fsp--;

			stream_simple_name.add(simple_name209.getTree());
			// AST REWRITE
			// elements: simple_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 742:23: -> ^( I_LABEL[$COLON, \"I_LABEL\"] simple_name )
			{
				// smaliParser.g:742:26: ^( I_LABEL[$COLON, \"I_LABEL\"] simple_name )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_LABEL, COLON208, "I_LABEL"), root_1);
				adaptor.addChild(root_1, stream_simple_name.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "label"


	public static class label_ref_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "label_ref"
	// smaliParser.g:744:1: label_ref : COLON simple_name -> simple_name ;
	public final smaliParser.label_ref_return label_ref() throws RecognitionException {
		smaliParser.label_ref_return retval = new smaliParser.label_ref_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COLON210=null;
		ParserRuleReturnScope simple_name211 =null;

		CommonTree COLON210_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");

		try {
			// smaliParser.g:745:3: ( COLON simple_name -> simple_name )
			// smaliParser.g:745:5: COLON simple_name
			{
			COLON210=(Token)match(input,COLON,FOLLOW_COLON_in_label_ref3296);  
			stream_COLON.add(COLON210);

			pushFollow(FOLLOW_simple_name_in_label_ref3298);
			simple_name211=simple_name();
			state._fsp--;

			stream_simple_name.add(simple_name211.getTree());
			// AST REWRITE
			// elements: simple_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 745:23: -> simple_name
			{
				adaptor.addChild(root_0, stream_simple_name.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "label_ref"


	public static class register_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "register_list"
	// smaliParser.g:747:1: register_list : ( REGISTER ( COMMA REGISTER )* -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ( REGISTER )* ) | -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ) );
	public final smaliParser.register_list_return register_list() throws RecognitionException {
		smaliParser.register_list_return retval = new smaliParser.register_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token REGISTER212=null;
		Token COMMA213=null;
		Token REGISTER214=null;

		CommonTree REGISTER212_tree=null;
		CommonTree COMMA213_tree=null;
		CommonTree REGISTER214_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");

		try {
			// smaliParser.g:748:3: ( REGISTER ( COMMA REGISTER )* -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ( REGISTER )* ) | -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ) )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==REGISTER) ) {
				alt37=1;
			}
			else if ( (LA37_0==CLOSE_BRACE) ) {
				alt37=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// smaliParser.g:748:5: REGISTER ( COMMA REGISTER )*
					{
					REGISTER212=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_register_list3312);  
					stream_REGISTER.add(REGISTER212);

					// smaliParser.g:748:14: ( COMMA REGISTER )*
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==COMMA) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// smaliParser.g:748:15: COMMA REGISTER
							{
							COMMA213=(Token)match(input,COMMA,FOLLOW_COMMA_in_register_list3315);  
							stream_COMMA.add(COMMA213);

							REGISTER214=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_register_list3317);  
							stream_REGISTER.add(REGISTER214);

							}
							break;

						default :
							break loop36;
						}
					}

					// AST REWRITE
					// elements: REGISTER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 748:32: -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ( REGISTER )* )
					{
						// smaliParser.g:748:35: ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ( REGISTER )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_REGISTER_LIST, (retval.start), "I_REGISTER_LIST"), root_1);
						// smaliParser.g:748:80: ( REGISTER )*
						while ( stream_REGISTER.hasNext() ) {
							adaptor.addChild(root_1, stream_REGISTER.nextNode());
						}
						stream_REGISTER.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// smaliParser.g:749:5: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 749:5: -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] )
					{
						// smaliParser.g:749:7: ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_REGISTER_LIST, (retval.start), "I_REGISTER_LIST"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "register_list"


	public static class register_range_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "register_range"
	// smaliParser.g:751:1: register_range : (startreg= REGISTER ( DOTDOT endreg= REGISTER )? )? -> ^( I_REGISTER_RANGE[$start, \"I_REGISTER_RANGE\"] ( $startreg)? ( $endreg)? ) ;
	public final smaliParser.register_range_return register_range() throws RecognitionException {
		smaliParser.register_range_return retval = new smaliParser.register_range_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token startreg=null;
		Token endreg=null;
		Token DOTDOT215=null;

		CommonTree startreg_tree=null;
		CommonTree endreg_tree=null;
		CommonTree DOTDOT215_tree=null;
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");

		try {
			// smaliParser.g:752:3: ( (startreg= REGISTER ( DOTDOT endreg= REGISTER )? )? -> ^( I_REGISTER_RANGE[$start, \"I_REGISTER_RANGE\"] ( $startreg)? ( $endreg)? ) )
			// smaliParser.g:752:5: (startreg= REGISTER ( DOTDOT endreg= REGISTER )? )?
			{
			// smaliParser.g:752:5: (startreg= REGISTER ( DOTDOT endreg= REGISTER )? )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==REGISTER) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// smaliParser.g:752:6: startreg= REGISTER ( DOTDOT endreg= REGISTER )?
					{
					startreg=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_register_range3352);  
					stream_REGISTER.add(startreg);

					// smaliParser.g:752:24: ( DOTDOT endreg= REGISTER )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==DOTDOT) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// smaliParser.g:752:25: DOTDOT endreg= REGISTER
							{
							DOTDOT215=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_register_range3355);  
							stream_DOTDOT.add(DOTDOT215);

							endreg=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_register_range3359);  
							stream_REGISTER.add(endreg);

							}
							break;

					}

					}
					break;

			}

			// AST REWRITE
			// elements: startreg, endreg
			// token labels: startreg, endreg
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_startreg=new RewriteRuleTokenStream(adaptor,"token startreg",startreg);
			RewriteRuleTokenStream stream_endreg=new RewriteRuleTokenStream(adaptor,"token endreg",endreg);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 752:52: -> ^( I_REGISTER_RANGE[$start, \"I_REGISTER_RANGE\"] ( $startreg)? ( $endreg)? )
			{
				// smaliParser.g:752:55: ^( I_REGISTER_RANGE[$start, \"I_REGISTER_RANGE\"] ( $startreg)? ( $endreg)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_REGISTER_RANGE, (retval.start), "I_REGISTER_RANGE"), root_1);
				// smaliParser.g:752:103: ( $startreg)?
				if ( stream_startreg.hasNext() ) {
					adaptor.addChild(root_1, stream_startreg.nextNode());
				}
				stream_startreg.reset();

				// smaliParser.g:752:114: ( $endreg)?
				if ( stream_endreg.hasNext() ) {
					adaptor.addChild(root_1, stream_endreg.nextNode());
				}
				stream_endreg.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "register_range"


	public static class verification_error_reference_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "verification_error_reference"
	// smaliParser.g:754:1: verification_error_reference : ( CLASS_DESCRIPTOR | field_reference | method_reference );
	public final smaliParser.verification_error_reference_return verification_error_reference() throws RecognitionException {
		smaliParser.verification_error_reference_return retval = new smaliParser.verification_error_reference_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CLASS_DESCRIPTOR216=null;
		ParserRuleReturnScope field_reference217 =null;
		ParserRuleReturnScope method_reference218 =null;

		CommonTree CLASS_DESCRIPTOR216_tree=null;

		try {
			// smaliParser.g:755:3: ( CLASS_DESCRIPTOR | field_reference | method_reference )
			int alt40=3;
			alt40 = dfa40.predict(input);
			switch (alt40) {
				case 1 :
					// smaliParser.g:755:5: CLASS_DESCRIPTOR
					{
					root_0 = (CommonTree)adaptor.nil();


					CLASS_DESCRIPTOR216=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_verification_error_reference3388); 
					CLASS_DESCRIPTOR216_tree = (CommonTree)adaptor.create(CLASS_DESCRIPTOR216);
					adaptor.addChild(root_0, CLASS_DESCRIPTOR216_tree);

					}
					break;
				case 2 :
					// smaliParser.g:755:24: field_reference
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_field_reference_in_verification_error_reference3392);
					field_reference217=field_reference();
					state._fsp--;

					adaptor.addChild(root_0, field_reference217.getTree());

					}
					break;
				case 3 :
					// smaliParser.g:755:42: method_reference
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_method_reference_in_verification_error_reference3396);
					method_reference218=method_reference();
					state._fsp--;

					adaptor.addChild(root_0, method_reference218.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "verification_error_reference"


	public static class catch_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "catch_directive"
	// smaliParser.g:757:1: catch_directive : CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE from= label_ref DOTDOT to= label_ref CLOSE_BRACE using= label_ref -> ^( I_CATCH[$start, \"I_CATCH\"] nonvoid_type_descriptor $from $to $using) ;
	public final smaliParser.catch_directive_return catch_directive() throws RecognitionException {
		smaliParser.catch_directive_return retval = new smaliParser.catch_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CATCH_DIRECTIVE219=null;
		Token OPEN_BRACE221=null;
		Token DOTDOT222=null;
		Token CLOSE_BRACE223=null;
		ParserRuleReturnScope from =null;
		ParserRuleReturnScope to =null;
		ParserRuleReturnScope using =null;
		ParserRuleReturnScope nonvoid_type_descriptor220 =null;

		CommonTree CATCH_DIRECTIVE219_tree=null;
		CommonTree OPEN_BRACE221_tree=null;
		CommonTree DOTDOT222_tree=null;
		CommonTree CLOSE_BRACE223_tree=null;
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
		RewriteRuleTokenStream stream_CATCH_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token CATCH_DIRECTIVE");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");

		try {
			// smaliParser.g:758:3: ( CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE from= label_ref DOTDOT to= label_ref CLOSE_BRACE using= label_ref -> ^( I_CATCH[$start, \"I_CATCH\"] nonvoid_type_descriptor $from $to $using) )
			// smaliParser.g:758:5: CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE from= label_ref DOTDOT to= label_ref CLOSE_BRACE using= label_ref
			{
			CATCH_DIRECTIVE219=(Token)match(input,CATCH_DIRECTIVE,FOLLOW_CATCH_DIRECTIVE_in_catch_directive3406);  
			stream_CATCH_DIRECTIVE.add(CATCH_DIRECTIVE219);

			pushFollow(FOLLOW_nonvoid_type_descriptor_in_catch_directive3408);
			nonvoid_type_descriptor220=nonvoid_type_descriptor();
			state._fsp--;

			stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor220.getTree());
			OPEN_BRACE221=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catch_directive3410);  
			stream_OPEN_BRACE.add(OPEN_BRACE221);

			pushFollow(FOLLOW_label_ref_in_catch_directive3414);
			from=label_ref();
			state._fsp--;

			stream_label_ref.add(from.getTree());
			DOTDOT222=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_catch_directive3416);  
			stream_DOTDOT.add(DOTDOT222);

			pushFollow(FOLLOW_label_ref_in_catch_directive3420);
			to=label_ref();
			state._fsp--;

			stream_label_ref.add(to.getTree());
			CLOSE_BRACE223=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catch_directive3422);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE223);

			pushFollow(FOLLOW_label_ref_in_catch_directive3426);
			using=label_ref();
			state._fsp--;

			stream_label_ref.add(using.getTree());
			// AST REWRITE
			// elements: from, to, nonvoid_type_descriptor, using
			// token labels: 
			// rule labels: using, from, to, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_using=new RewriteRuleSubtreeStream(adaptor,"rule using",using!=null?using.getTree():null);
			RewriteRuleSubtreeStream stream_from=new RewriteRuleSubtreeStream(adaptor,"rule from",from!=null?from.getTree():null);
			RewriteRuleSubtreeStream stream_to=new RewriteRuleSubtreeStream(adaptor,"rule to",to!=null?to.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 759:5: -> ^( I_CATCH[$start, \"I_CATCH\"] nonvoid_type_descriptor $from $to $using)
			{
				// smaliParser.g:759:8: ^( I_CATCH[$start, \"I_CATCH\"] nonvoid_type_descriptor $from $to $using)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_CATCH, (retval.start), "I_CATCH"), root_1);
				adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
				adaptor.addChild(root_1, stream_from.nextTree());
				adaptor.addChild(root_1, stream_to.nextTree());
				adaptor.addChild(root_1, stream_using.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "catch_directive"


	public static class catchall_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "catchall_directive"
	// smaliParser.g:761:1: catchall_directive : CATCHALL_DIRECTIVE OPEN_BRACE from= label_ref DOTDOT to= label_ref CLOSE_BRACE using= label_ref -> ^( I_CATCHALL[$start, \"I_CATCHALL\"] $from $to $using) ;
	public final smaliParser.catchall_directive_return catchall_directive() throws RecognitionException {
		smaliParser.catchall_directive_return retval = new smaliParser.catchall_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CATCHALL_DIRECTIVE224=null;
		Token OPEN_BRACE225=null;
		Token DOTDOT226=null;
		Token CLOSE_BRACE227=null;
		ParserRuleReturnScope from =null;
		ParserRuleReturnScope to =null;
		ParserRuleReturnScope using =null;

		CommonTree CATCHALL_DIRECTIVE224_tree=null;
		CommonTree OPEN_BRACE225_tree=null;
		CommonTree DOTDOT226_tree=null;
		CommonTree CLOSE_BRACE227_tree=null;
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
		RewriteRuleTokenStream stream_CATCHALL_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token CATCHALL_DIRECTIVE");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// smaliParser.g:762:3: ( CATCHALL_DIRECTIVE OPEN_BRACE from= label_ref DOTDOT to= label_ref CLOSE_BRACE using= label_ref -> ^( I_CATCHALL[$start, \"I_CATCHALL\"] $from $to $using) )
			// smaliParser.g:762:5: CATCHALL_DIRECTIVE OPEN_BRACE from= label_ref DOTDOT to= label_ref CLOSE_BRACE using= label_ref
			{
			CATCHALL_DIRECTIVE224=(Token)match(input,CATCHALL_DIRECTIVE,FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive3458);  
			stream_CATCHALL_DIRECTIVE.add(CATCHALL_DIRECTIVE224);

			OPEN_BRACE225=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catchall_directive3460);  
			stream_OPEN_BRACE.add(OPEN_BRACE225);

			pushFollow(FOLLOW_label_ref_in_catchall_directive3464);
			from=label_ref();
			state._fsp--;

			stream_label_ref.add(from.getTree());
			DOTDOT226=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_catchall_directive3466);  
			stream_DOTDOT.add(DOTDOT226);

			pushFollow(FOLLOW_label_ref_in_catchall_directive3470);
			to=label_ref();
			state._fsp--;

			stream_label_ref.add(to.getTree());
			CLOSE_BRACE227=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catchall_directive3472);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE227);

			pushFollow(FOLLOW_label_ref_in_catchall_directive3476);
			using=label_ref();
			state._fsp--;

			stream_label_ref.add(using.getTree());
			// AST REWRITE
			// elements: to, using, from
			// token labels: 
			// rule labels: using, from, to, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_using=new RewriteRuleSubtreeStream(adaptor,"rule using",using!=null?using.getTree():null);
			RewriteRuleSubtreeStream stream_from=new RewriteRuleSubtreeStream(adaptor,"rule from",from!=null?from.getTree():null);
			RewriteRuleSubtreeStream stream_to=new RewriteRuleSubtreeStream(adaptor,"rule to",to!=null?to.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 763:5: -> ^( I_CATCHALL[$start, \"I_CATCHALL\"] $from $to $using)
			{
				// smaliParser.g:763:8: ^( I_CATCHALL[$start, \"I_CATCHALL\"] $from $to $using)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_CATCHALL, (retval.start), "I_CATCHALL"), root_1);
				adaptor.addChild(root_1, stream_from.nextTree());
				adaptor.addChild(root_1, stream_to.nextTree());
				adaptor.addChild(root_1, stream_using.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "catchall_directive"


	public static class parameter_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parameter_directive"
	// smaliParser.g:769:1: parameter_directive : PARAMETER_DIRECTIVE REGISTER ( COMMA STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ) ) ) ;
	public final smaliParser.parameter_directive_return parameter_directive() throws RecognitionException {
		smaliParser.parameter_directive_return retval = new smaliParser.parameter_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PARAMETER_DIRECTIVE228=null;
		Token REGISTER229=null;
		Token COMMA230=null;
		Token STRING_LITERAL231=null;
		Token END_PARAMETER_DIRECTIVE233=null;
		ParserRuleReturnScope annotation232 =null;

		CommonTree PARAMETER_DIRECTIVE228_tree=null;
		CommonTree REGISTER229_tree=null;
		CommonTree COMMA230_tree=null;
		CommonTree STRING_LITERAL231_tree=null;
		CommonTree END_PARAMETER_DIRECTIVE233_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_PARAMETER_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token PARAMETER_DIRECTIVE");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
		RewriteRuleTokenStream stream_END_PARAMETER_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_PARAMETER_DIRECTIVE");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");

		List<CommonTree> annotations = new ArrayList<CommonTree>();
		try {
			// smaliParser.g:771:3: ( PARAMETER_DIRECTIVE REGISTER ( COMMA STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ) ) ) )
			// smaliParser.g:771:5: PARAMETER_DIRECTIVE REGISTER ( COMMA STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ) ) )
			{
			PARAMETER_DIRECTIVE228=(Token)match(input,PARAMETER_DIRECTIVE,FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive3515);  
			stream_PARAMETER_DIRECTIVE.add(PARAMETER_DIRECTIVE228);

			REGISTER229=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_parameter_directive3517);  
			stream_REGISTER.add(REGISTER229);

			// smaliParser.g:771:34: ( COMMA STRING_LITERAL )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==COMMA) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// smaliParser.g:771:35: COMMA STRING_LITERAL
					{
					COMMA230=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_directive3520);  
					stream_COMMA.add(COMMA230);

					STRING_LITERAL231=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parameter_directive3522);  
					stream_STRING_LITERAL.add(STRING_LITERAL231);

					}
					break;

			}

			// smaliParser.g:772:5: ({...}? annotation )*
			loop42:
			while (true) {
				int alt42=2;
				alt42 = dfa42.predict(input);
				switch (alt42) {
				case 1 :
					// smaliParser.g:772:6: {...}? annotation
					{
					if ( !((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {
						throw new FailedPredicateException(input, "parameter_directive", "input.LA(1) == ANNOTATION_DIRECTIVE");
					}
					pushFollow(FOLLOW_annotation_in_parameter_directive3533);
					annotation232=annotation();
					state._fsp--;

					stream_annotation.add(annotation232.getTree());
					annotations.add((annotation232!=null?((CommonTree)annotation232.getTree()):null));
					}
					break;

				default :
					break loop42;
				}
			}

			// smaliParser.g:774:5: ( END_PARAMETER_DIRECTIVE -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ) ) )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==END_PARAMETER_DIRECTIVE) ) {
				alt43=1;
			}
			else if ( (LA43_0==ANNOTATION_DIRECTIVE||LA43_0==ARRAY_DATA_DIRECTIVE||(LA43_0 >= CATCHALL_DIRECTIVE && LA43_0 <= CATCH_DIRECTIVE)||LA43_0==COLON||(LA43_0 >= END_LOCAL_DIRECTIVE && LA43_0 <= END_METHOD_DIRECTIVE)||LA43_0==EPILOGUE_DIRECTIVE||(LA43_0 >= INSTRUCTION_FORMAT10t && LA43_0 <= INSTRUCTION_FORMAT51l)||(LA43_0 >= LINE_DIRECTIVE && LA43_0 <= LOCAL_DIRECTIVE)||(LA43_0 >= PACKED_SWITCH_DIRECTIVE && LA43_0 <= PARAMETER_DIRECTIVE)||LA43_0==PROLOGUE_DIRECTIVE||(LA43_0 >= REGISTERS_DIRECTIVE && LA43_0 <= RESTART_LOCAL_DIRECTIVE)||(LA43_0 >= SOURCE_DIRECTIVE && LA43_0 <= SPARSE_SWITCH_DIRECTIVE)) ) {
				alt43=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// smaliParser.g:774:7: END_PARAMETER_DIRECTIVE
					{
					END_PARAMETER_DIRECTIVE233=(Token)match(input,END_PARAMETER_DIRECTIVE,FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive3546);  
					stream_END_PARAMETER_DIRECTIVE.add(END_PARAMETER_DIRECTIVE233);

					// AST REWRITE
					// elements: annotation, STRING_LITERAL, REGISTER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 775:7: -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) )
					{
						// smaliParser.g:775:10: ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PARAMETER, (retval.start), "I_PARAMETER"), root_1);
						adaptor.addChild(root_1, stream_REGISTER.nextNode());
						// smaliParser.g:775:56: ( STRING_LITERAL )?
						if ( stream_STRING_LITERAL.hasNext() ) {
							adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());
						}
						stream_STRING_LITERAL.reset();

						// smaliParser.g:775:72: ^( I_ANNOTATIONS ( annotation )* )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATIONS, "I_ANNOTATIONS"), root_2);
						// smaliParser.g:775:88: ( annotation )*
						while ( stream_annotation.hasNext() ) {
							adaptor.addChild(root_2, stream_annotation.nextTree());
						}
						stream_annotation.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// smaliParser.g:776:19: 
					{
					statements_and_directives_stack.peek().methodAnnotations.addAll(annotations);
					// AST REWRITE
					// elements: REGISTER, STRING_LITERAL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 777:7: -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ) )
					{
						// smaliParser.g:777:10: ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PARAMETER, (retval.start), "I_PARAMETER"), root_1);
						adaptor.addChild(root_1, stream_REGISTER.nextNode());
						// smaliParser.g:777:56: ( STRING_LITERAL )?
						if ( stream_STRING_LITERAL.hasNext() ) {
							adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());
						}
						stream_STRING_LITERAL.reset();

						// smaliParser.g:777:72: ^( I_ANNOTATIONS )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATIONS, "I_ANNOTATIONS"), root_2);
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter_directive"


	public static class debug_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "debug_directive"
	// smaliParser.g:780:1: debug_directive : ( line_directive | local_directive | end_local_directive | restart_local_directive | prologue_directive | epilogue_directive | source_directive );
	public final smaliParser.debug_directive_return debug_directive() throws RecognitionException {
		smaliParser.debug_directive_return retval = new smaliParser.debug_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope line_directive234 =null;
		ParserRuleReturnScope local_directive235 =null;
		ParserRuleReturnScope end_local_directive236 =null;
		ParserRuleReturnScope restart_local_directive237 =null;
		ParserRuleReturnScope prologue_directive238 =null;
		ParserRuleReturnScope epilogue_directive239 =null;
		ParserRuleReturnScope source_directive240 =null;


		try {
			// smaliParser.g:781:3: ( line_directive | local_directive | end_local_directive | restart_local_directive | prologue_directive | epilogue_directive | source_directive )
			int alt44=7;
			switch ( input.LA(1) ) {
			case LINE_DIRECTIVE:
				{
				alt44=1;
				}
				break;
			case LOCAL_DIRECTIVE:
				{
				alt44=2;
				}
				break;
			case END_LOCAL_DIRECTIVE:
				{
				alt44=3;
				}
				break;
			case RESTART_LOCAL_DIRECTIVE:
				{
				alt44=4;
				}
				break;
			case PROLOGUE_DIRECTIVE:
				{
				alt44=5;
				}
				break;
			case EPILOGUE_DIRECTIVE:
				{
				alt44=6;
				}
				break;
			case SOURCE_DIRECTIVE:
				{
				alt44=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// smaliParser.g:781:5: line_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_line_directive_in_debug_directive3619);
					line_directive234=line_directive();
					state._fsp--;

					adaptor.addChild(root_0, line_directive234.getTree());

					}
					break;
				case 2 :
					// smaliParser.g:782:5: local_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_local_directive_in_debug_directive3625);
					local_directive235=local_directive();
					state._fsp--;

					adaptor.addChild(root_0, local_directive235.getTree());

					}
					break;
				case 3 :
					// smaliParser.g:783:5: end_local_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_end_local_directive_in_debug_directive3631);
					end_local_directive236=end_local_directive();
					state._fsp--;

					adaptor.addChild(root_0, end_local_directive236.getTree());

					}
					break;
				case 4 :
					// smaliParser.g:784:5: restart_local_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_restart_local_directive_in_debug_directive3637);
					restart_local_directive237=restart_local_directive();
					state._fsp--;

					adaptor.addChild(root_0, restart_local_directive237.getTree());

					}
					break;
				case 5 :
					// smaliParser.g:785:5: prologue_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_prologue_directive_in_debug_directive3643);
					prologue_directive238=prologue_directive();
					state._fsp--;

					adaptor.addChild(root_0, prologue_directive238.getTree());

					}
					break;
				case 6 :
					// smaliParser.g:786:5: epilogue_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_epilogue_directive_in_debug_directive3649);
					epilogue_directive239=epilogue_directive();
					state._fsp--;

					adaptor.addChild(root_0, epilogue_directive239.getTree());

					}
					break;
				case 7 :
					// smaliParser.g:787:5: source_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_source_directive_in_debug_directive3655);
					source_directive240=source_directive();
					state._fsp--;

					adaptor.addChild(root_0, source_directive240.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "debug_directive"


	public static class line_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "line_directive"
	// smaliParser.g:789:1: line_directive : LINE_DIRECTIVE integral_literal -> ^( I_LINE[$start, \"I_LINE\"] integral_literal ) ;
	public final smaliParser.line_directive_return line_directive() throws RecognitionException {
		smaliParser.line_directive_return retval = new smaliParser.line_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LINE_DIRECTIVE241=null;
		ParserRuleReturnScope integral_literal242 =null;

		CommonTree LINE_DIRECTIVE241_tree=null;
		RewriteRuleTokenStream stream_LINE_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token LINE_DIRECTIVE");
		RewriteRuleSubtreeStream stream_integral_literal=new RewriteRuleSubtreeStream(adaptor,"rule integral_literal");

		try {
			// smaliParser.g:790:3: ( LINE_DIRECTIVE integral_literal -> ^( I_LINE[$start, \"I_LINE\"] integral_literal ) )
			// smaliParser.g:790:5: LINE_DIRECTIVE integral_literal
			{
			LINE_DIRECTIVE241=(Token)match(input,LINE_DIRECTIVE,FOLLOW_LINE_DIRECTIVE_in_line_directive3665);  
			stream_LINE_DIRECTIVE.add(LINE_DIRECTIVE241);

			pushFollow(FOLLOW_integral_literal_in_line_directive3667);
			integral_literal242=integral_literal();
			state._fsp--;

			stream_integral_literal.add(integral_literal242.getTree());
			// AST REWRITE
			// elements: integral_literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 791:5: -> ^( I_LINE[$start, \"I_LINE\"] integral_literal )
			{
				// smaliParser.g:791:8: ^( I_LINE[$start, \"I_LINE\"] integral_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_LINE, (retval.start), "I_LINE"), root_1);
				adaptor.addChild(root_1, stream_integral_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "line_directive"


	public static class local_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "local_directive"
	// smaliParser.g:793:1: local_directive : LOCAL_DIRECTIVE REGISTER ( COMMA ( NULL_LITERAL |name= STRING_LITERAL ) COLON ( VOID_TYPE | nonvoid_type_descriptor ) ( COMMA signature= STRING_LITERAL )? )? -> ^( I_LOCAL[$start, \"I_LOCAL\"] REGISTER ( NULL_LITERAL )? ( $name)? ( nonvoid_type_descriptor )? ( $signature)? ) ;
	public final smaliParser.local_directive_return local_directive() throws RecognitionException {
		smaliParser.local_directive_return retval = new smaliParser.local_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token name=null;
		Token signature=null;
		Token LOCAL_DIRECTIVE243=null;
		Token REGISTER244=null;
		Token COMMA245=null;
		Token NULL_LITERAL246=null;
		Token COLON247=null;
		Token VOID_TYPE248=null;
		Token COMMA250=null;
		ParserRuleReturnScope nonvoid_type_descriptor249 =null;

		CommonTree name_tree=null;
		CommonTree signature_tree=null;
		CommonTree LOCAL_DIRECTIVE243_tree=null;
		CommonTree REGISTER244_tree=null;
		CommonTree COMMA245_tree=null;
		CommonTree NULL_LITERAL246_tree=null;
		CommonTree COLON247_tree=null;
		CommonTree VOID_TYPE248_tree=null;
		CommonTree COMMA250_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_LOCAL_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token LOCAL_DIRECTIVE");
		RewriteRuleTokenStream stream_VOID_TYPE=new RewriteRuleTokenStream(adaptor,"token VOID_TYPE");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_NULL_LITERAL=new RewriteRuleTokenStream(adaptor,"token NULL_LITERAL");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");

		try {
			// smaliParser.g:794:3: ( LOCAL_DIRECTIVE REGISTER ( COMMA ( NULL_LITERAL |name= STRING_LITERAL ) COLON ( VOID_TYPE | nonvoid_type_descriptor ) ( COMMA signature= STRING_LITERAL )? )? -> ^( I_LOCAL[$start, \"I_LOCAL\"] REGISTER ( NULL_LITERAL )? ( $name)? ( nonvoid_type_descriptor )? ( $signature)? ) )
			// smaliParser.g:794:5: LOCAL_DIRECTIVE REGISTER ( COMMA ( NULL_LITERAL |name= STRING_LITERAL ) COLON ( VOID_TYPE | nonvoid_type_descriptor ) ( COMMA signature= STRING_LITERAL )? )?
			{
			LOCAL_DIRECTIVE243=(Token)match(input,LOCAL_DIRECTIVE,FOLLOW_LOCAL_DIRECTIVE_in_local_directive3690);  
			stream_LOCAL_DIRECTIVE.add(LOCAL_DIRECTIVE243);

			REGISTER244=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_local_directive3692);  
			stream_REGISTER.add(REGISTER244);

			// smaliParser.g:794:30: ( COMMA ( NULL_LITERAL |name= STRING_LITERAL ) COLON ( VOID_TYPE | nonvoid_type_descriptor ) ( COMMA signature= STRING_LITERAL )? )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==COMMA) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// smaliParser.g:794:31: COMMA ( NULL_LITERAL |name= STRING_LITERAL ) COLON ( VOID_TYPE | nonvoid_type_descriptor ) ( COMMA signature= STRING_LITERAL )?
					{
					COMMA245=(Token)match(input,COMMA,FOLLOW_COMMA_in_local_directive3695);  
					stream_COMMA.add(COMMA245);

					// smaliParser.g:794:37: ( NULL_LITERAL |name= STRING_LITERAL )
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==NULL_LITERAL) ) {
						alt45=1;
					}
					else if ( (LA45_0==STRING_LITERAL) ) {
						alt45=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 45, 0, input);
						throw nvae;
					}

					switch (alt45) {
						case 1 :
							// smaliParser.g:794:38: NULL_LITERAL
							{
							NULL_LITERAL246=(Token)match(input,NULL_LITERAL,FOLLOW_NULL_LITERAL_in_local_directive3698);  
							stream_NULL_LITERAL.add(NULL_LITERAL246);

							}
							break;
						case 2 :
							// smaliParser.g:794:53: name= STRING_LITERAL
							{
							name=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_local_directive3704);  
							stream_STRING_LITERAL.add(name);

							}
							break;

					}

					COLON247=(Token)match(input,COLON,FOLLOW_COLON_in_local_directive3707);  
					stream_COLON.add(COLON247);

					// smaliParser.g:794:80: ( VOID_TYPE | nonvoid_type_descriptor )
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==VOID_TYPE) ) {
						alt46=1;
					}
					else if ( (LA46_0==ARRAY_TYPE_PREFIX||LA46_0==CLASS_DESCRIPTOR||LA46_0==PRIMITIVE_TYPE) ) {
						alt46=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 46, 0, input);
						throw nvae;
					}

					switch (alt46) {
						case 1 :
							// smaliParser.g:794:81: VOID_TYPE
							{
							VOID_TYPE248=(Token)match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_local_directive3710);  
							stream_VOID_TYPE.add(VOID_TYPE248);

							}
							break;
						case 2 :
							// smaliParser.g:794:93: nonvoid_type_descriptor
							{
							pushFollow(FOLLOW_nonvoid_type_descriptor_in_local_directive3714);
							nonvoid_type_descriptor249=nonvoid_type_descriptor();
							state._fsp--;

							stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor249.getTree());
							}
							break;

					}

					// smaliParser.g:795:31: ( COMMA signature= STRING_LITERAL )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==COMMA) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// smaliParser.g:795:32: COMMA signature= STRING_LITERAL
							{
							COMMA250=(Token)match(input,COMMA,FOLLOW_COMMA_in_local_directive3748);  
							stream_COMMA.add(COMMA250);

							signature=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_local_directive3752);  
							stream_STRING_LITERAL.add(signature);

							}
							break;

					}

					}
					break;

			}

			// AST REWRITE
			// elements: name, REGISTER, NULL_LITERAL, signature, nonvoid_type_descriptor
			// token labels: signature, name
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_signature=new RewriteRuleTokenStream(adaptor,"token signature",signature);
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 796:5: -> ^( I_LOCAL[$start, \"I_LOCAL\"] REGISTER ( NULL_LITERAL )? ( $name)? ( nonvoid_type_descriptor )? ( $signature)? )
			{
				// smaliParser.g:796:8: ^( I_LOCAL[$start, \"I_LOCAL\"] REGISTER ( NULL_LITERAL )? ( $name)? ( nonvoid_type_descriptor )? ( $signature)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_LOCAL, (retval.start), "I_LOCAL"), root_1);
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				// smaliParser.g:796:46: ( NULL_LITERAL )?
				if ( stream_NULL_LITERAL.hasNext() ) {
					adaptor.addChild(root_1, stream_NULL_LITERAL.nextNode());
				}
				stream_NULL_LITERAL.reset();

				// smaliParser.g:796:61: ( $name)?
				if ( stream_name.hasNext() ) {
					adaptor.addChild(root_1, stream_name.nextNode());
				}
				stream_name.reset();

				// smaliParser.g:796:67: ( nonvoid_type_descriptor )?
				if ( stream_nonvoid_type_descriptor.hasNext() ) {
					adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
				}
				stream_nonvoid_type_descriptor.reset();

				// smaliParser.g:796:93: ( $signature)?
				if ( stream_signature.hasNext() ) {
					adaptor.addChild(root_1, stream_signature.nextNode());
				}
				stream_signature.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "local_directive"


	public static class end_local_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "end_local_directive"
	// smaliParser.g:798:1: end_local_directive : END_LOCAL_DIRECTIVE REGISTER -> ^( I_END_LOCAL[$start, \"I_END_LOCAL\"] REGISTER ) ;
	public final smaliParser.end_local_directive_return end_local_directive() throws RecognitionException {
		smaliParser.end_local_directive_return retval = new smaliParser.end_local_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token END_LOCAL_DIRECTIVE251=null;
		Token REGISTER252=null;

		CommonTree END_LOCAL_DIRECTIVE251_tree=null;
		CommonTree REGISTER252_tree=null;
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_END_LOCAL_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_LOCAL_DIRECTIVE");

		try {
			// smaliParser.g:799:3: ( END_LOCAL_DIRECTIVE REGISTER -> ^( I_END_LOCAL[$start, \"I_END_LOCAL\"] REGISTER ) )
			// smaliParser.g:799:5: END_LOCAL_DIRECTIVE REGISTER
			{
			END_LOCAL_DIRECTIVE251=(Token)match(input,END_LOCAL_DIRECTIVE,FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive3794);  
			stream_END_LOCAL_DIRECTIVE.add(END_LOCAL_DIRECTIVE251);

			REGISTER252=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_end_local_directive3796);  
			stream_REGISTER.add(REGISTER252);

			// AST REWRITE
			// elements: REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 800:5: -> ^( I_END_LOCAL[$start, \"I_END_LOCAL\"] REGISTER )
			{
				// smaliParser.g:800:8: ^( I_END_LOCAL[$start, \"I_END_LOCAL\"] REGISTER )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_END_LOCAL, (retval.start), "I_END_LOCAL"), root_1);
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "end_local_directive"


	public static class restart_local_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "restart_local_directive"
	// smaliParser.g:802:1: restart_local_directive : RESTART_LOCAL_DIRECTIVE REGISTER -> ^( I_RESTART_LOCAL[$start, \"I_RESTART_LOCAL\"] REGISTER ) ;
	public final smaliParser.restart_local_directive_return restart_local_directive() throws RecognitionException {
		smaliParser.restart_local_directive_return retval = new smaliParser.restart_local_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token RESTART_LOCAL_DIRECTIVE253=null;
		Token REGISTER254=null;

		CommonTree RESTART_LOCAL_DIRECTIVE253_tree=null;
		CommonTree REGISTER254_tree=null;
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_RESTART_LOCAL_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token RESTART_LOCAL_DIRECTIVE");

		try {
			// smaliParser.g:803:3: ( RESTART_LOCAL_DIRECTIVE REGISTER -> ^( I_RESTART_LOCAL[$start, \"I_RESTART_LOCAL\"] REGISTER ) )
			// smaliParser.g:803:5: RESTART_LOCAL_DIRECTIVE REGISTER
			{
			RESTART_LOCAL_DIRECTIVE253=(Token)match(input,RESTART_LOCAL_DIRECTIVE,FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive3819);  
			stream_RESTART_LOCAL_DIRECTIVE.add(RESTART_LOCAL_DIRECTIVE253);

			REGISTER254=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_restart_local_directive3821);  
			stream_REGISTER.add(REGISTER254);

			// AST REWRITE
			// elements: REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 804:5: -> ^( I_RESTART_LOCAL[$start, \"I_RESTART_LOCAL\"] REGISTER )
			{
				// smaliParser.g:804:8: ^( I_RESTART_LOCAL[$start, \"I_RESTART_LOCAL\"] REGISTER )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_RESTART_LOCAL, (retval.start), "I_RESTART_LOCAL"), root_1);
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "restart_local_directive"


	public static class prologue_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prologue_directive"
	// smaliParser.g:806:1: prologue_directive : PROLOGUE_DIRECTIVE -> ^( I_PROLOGUE[$start, \"I_PROLOGUE\"] ) ;
	public final smaliParser.prologue_directive_return prologue_directive() throws RecognitionException {
		smaliParser.prologue_directive_return retval = new smaliParser.prologue_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PROLOGUE_DIRECTIVE255=null;

		CommonTree PROLOGUE_DIRECTIVE255_tree=null;
		RewriteRuleTokenStream stream_PROLOGUE_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token PROLOGUE_DIRECTIVE");

		try {
			// smaliParser.g:807:3: ( PROLOGUE_DIRECTIVE -> ^( I_PROLOGUE[$start, \"I_PROLOGUE\"] ) )
			// smaliParser.g:807:5: PROLOGUE_DIRECTIVE
			{
			PROLOGUE_DIRECTIVE255=(Token)match(input,PROLOGUE_DIRECTIVE,FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive3844);  
			stream_PROLOGUE_DIRECTIVE.add(PROLOGUE_DIRECTIVE255);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 808:5: -> ^( I_PROLOGUE[$start, \"I_PROLOGUE\"] )
			{
				// smaliParser.g:808:8: ^( I_PROLOGUE[$start, \"I_PROLOGUE\"] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PROLOGUE, (retval.start), "I_PROLOGUE"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prologue_directive"


	public static class epilogue_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "epilogue_directive"
	// smaliParser.g:810:1: epilogue_directive : EPILOGUE_DIRECTIVE -> ^( I_EPILOGUE[$start, \"I_EPILOGUE\"] ) ;
	public final smaliParser.epilogue_directive_return epilogue_directive() throws RecognitionException {
		smaliParser.epilogue_directive_return retval = new smaliParser.epilogue_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EPILOGUE_DIRECTIVE256=null;

		CommonTree EPILOGUE_DIRECTIVE256_tree=null;
		RewriteRuleTokenStream stream_EPILOGUE_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token EPILOGUE_DIRECTIVE");

		try {
			// smaliParser.g:811:3: ( EPILOGUE_DIRECTIVE -> ^( I_EPILOGUE[$start, \"I_EPILOGUE\"] ) )
			// smaliParser.g:811:5: EPILOGUE_DIRECTIVE
			{
			EPILOGUE_DIRECTIVE256=(Token)match(input,EPILOGUE_DIRECTIVE,FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive3865);  
			stream_EPILOGUE_DIRECTIVE.add(EPILOGUE_DIRECTIVE256);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 812:5: -> ^( I_EPILOGUE[$start, \"I_EPILOGUE\"] )
			{
				// smaliParser.g:812:8: ^( I_EPILOGUE[$start, \"I_EPILOGUE\"] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_EPILOGUE, (retval.start), "I_EPILOGUE"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "epilogue_directive"


	public static class source_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "source_directive"
	// smaliParser.g:814:1: source_directive : SOURCE_DIRECTIVE ( STRING_LITERAL )? -> ^( I_SOURCE[$start, \"I_SOURCE\"] ( STRING_LITERAL )? ) ;
	public final smaliParser.source_directive_return source_directive() throws RecognitionException {
		smaliParser.source_directive_return retval = new smaliParser.source_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SOURCE_DIRECTIVE257=null;
		Token STRING_LITERAL258=null;

		CommonTree SOURCE_DIRECTIVE257_tree=null;
		CommonTree STRING_LITERAL258_tree=null;
		RewriteRuleTokenStream stream_SOURCE_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token SOURCE_DIRECTIVE");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

		try {
			// smaliParser.g:815:3: ( SOURCE_DIRECTIVE ( STRING_LITERAL )? -> ^( I_SOURCE[$start, \"I_SOURCE\"] ( STRING_LITERAL )? ) )
			// smaliParser.g:815:5: SOURCE_DIRECTIVE ( STRING_LITERAL )?
			{
			SOURCE_DIRECTIVE257=(Token)match(input,SOURCE_DIRECTIVE,FOLLOW_SOURCE_DIRECTIVE_in_source_directive3886);  
			stream_SOURCE_DIRECTIVE.add(SOURCE_DIRECTIVE257);

			// smaliParser.g:815:22: ( STRING_LITERAL )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==STRING_LITERAL) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// smaliParser.g:815:22: STRING_LITERAL
					{
					STRING_LITERAL258=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_source_directive3888);  
					stream_STRING_LITERAL.add(STRING_LITERAL258);

					}
					break;

			}

			// AST REWRITE
			// elements: STRING_LITERAL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 816:5: -> ^( I_SOURCE[$start, \"I_SOURCE\"] ( STRING_LITERAL )? )
			{
				// smaliParser.g:816:8: ^( I_SOURCE[$start, \"I_SOURCE\"] ( STRING_LITERAL )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SOURCE, (retval.start), "I_SOURCE"), root_1);
				// smaliParser.g:816:39: ( STRING_LITERAL )?
				if ( stream_STRING_LITERAL.hasNext() ) {
					adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());
				}
				stream_STRING_LITERAL.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "source_directive"


	public static class instruction_format12x_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instruction_format12x"
	// smaliParser.g:818:1: instruction_format12x : ( INSTRUCTION_FORMAT12x | INSTRUCTION_FORMAT12x_OR_ID -> INSTRUCTION_FORMAT12x[$INSTRUCTION_FORMAT12x_OR_ID] );
	public final smaliParser.instruction_format12x_return instruction_format12x() throws RecognitionException {
		smaliParser.instruction_format12x_return retval = new smaliParser.instruction_format12x_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT12x259=null;
		Token INSTRUCTION_FORMAT12x_OR_ID260=null;

		CommonTree INSTRUCTION_FORMAT12x259_tree=null;
		CommonTree INSTRUCTION_FORMAT12x_OR_ID260_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT12x_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT12x_OR_ID");

		try {
			// smaliParser.g:819:3: ( INSTRUCTION_FORMAT12x | INSTRUCTION_FORMAT12x_OR_ID -> INSTRUCTION_FORMAT12x[$INSTRUCTION_FORMAT12x_OR_ID] )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==INSTRUCTION_FORMAT12x) ) {
				alt50=1;
			}
			else if ( (LA50_0==INSTRUCTION_FORMAT12x_OR_ID) ) {
				alt50=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// smaliParser.g:819:5: INSTRUCTION_FORMAT12x
					{
					root_0 = (CommonTree)adaptor.nil();


					INSTRUCTION_FORMAT12x259=(Token)match(input,INSTRUCTION_FORMAT12x,FOLLOW_INSTRUCTION_FORMAT12x_in_instruction_format12x3913); 
					INSTRUCTION_FORMAT12x259_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT12x259);
					adaptor.addChild(root_0, INSTRUCTION_FORMAT12x259_tree);

					}
					break;
				case 2 :
					// smaliParser.g:820:5: INSTRUCTION_FORMAT12x_OR_ID
					{
					INSTRUCTION_FORMAT12x_OR_ID260=(Token)match(input,INSTRUCTION_FORMAT12x_OR_ID,FOLLOW_INSTRUCTION_FORMAT12x_OR_ID_in_instruction_format12x3919);  
					stream_INSTRUCTION_FORMAT12x_OR_ID.add(INSTRUCTION_FORMAT12x_OR_ID260);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 820:33: -> INSTRUCTION_FORMAT12x[$INSTRUCTION_FORMAT12x_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INSTRUCTION_FORMAT12x, INSTRUCTION_FORMAT12x_OR_ID260));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruction_format12x"


	public static class instruction_format22s_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instruction_format22s"
	// smaliParser.g:822:1: instruction_format22s : ( INSTRUCTION_FORMAT22s | INSTRUCTION_FORMAT22s_OR_ID -> INSTRUCTION_FORMAT22s[$INSTRUCTION_FORMAT22s_OR_ID] );
	public final smaliParser.instruction_format22s_return instruction_format22s() throws RecognitionException {
		smaliParser.instruction_format22s_return retval = new smaliParser.instruction_format22s_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22s261=null;
		Token INSTRUCTION_FORMAT22s_OR_ID262=null;

		CommonTree INSTRUCTION_FORMAT22s261_tree=null;
		CommonTree INSTRUCTION_FORMAT22s_OR_ID262_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22s_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22s_OR_ID");

		try {
			// smaliParser.g:823:3: ( INSTRUCTION_FORMAT22s | INSTRUCTION_FORMAT22s_OR_ID -> INSTRUCTION_FORMAT22s[$INSTRUCTION_FORMAT22s_OR_ID] )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==INSTRUCTION_FORMAT22s) ) {
				alt51=1;
			}
			else if ( (LA51_0==INSTRUCTION_FORMAT22s_OR_ID) ) {
				alt51=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// smaliParser.g:823:5: INSTRUCTION_FORMAT22s
					{
					root_0 = (CommonTree)adaptor.nil();


					INSTRUCTION_FORMAT22s261=(Token)match(input,INSTRUCTION_FORMAT22s,FOLLOW_INSTRUCTION_FORMAT22s_in_instruction_format22s3934); 
					INSTRUCTION_FORMAT22s261_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT22s261);
					adaptor.addChild(root_0, INSTRUCTION_FORMAT22s261_tree);

					}
					break;
				case 2 :
					// smaliParser.g:824:5: INSTRUCTION_FORMAT22s_OR_ID
					{
					INSTRUCTION_FORMAT22s_OR_ID262=(Token)match(input,INSTRUCTION_FORMAT22s_OR_ID,FOLLOW_INSTRUCTION_FORMAT22s_OR_ID_in_instruction_format22s3940);  
					stream_INSTRUCTION_FORMAT22s_OR_ID.add(INSTRUCTION_FORMAT22s_OR_ID262);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 824:33: -> INSTRUCTION_FORMAT22s[$INSTRUCTION_FORMAT22s_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INSTRUCTION_FORMAT22s, INSTRUCTION_FORMAT22s_OR_ID262));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruction_format22s"


	public static class instruction_format31i_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instruction_format31i"
	// smaliParser.g:826:1: instruction_format31i : ( INSTRUCTION_FORMAT31i | INSTRUCTION_FORMAT31i_OR_ID -> INSTRUCTION_FORMAT31i[$INSTRUCTION_FORMAT31i_OR_ID] );
	public final smaliParser.instruction_format31i_return instruction_format31i() throws RecognitionException {
		smaliParser.instruction_format31i_return retval = new smaliParser.instruction_format31i_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT31i263=null;
		Token INSTRUCTION_FORMAT31i_OR_ID264=null;

		CommonTree INSTRUCTION_FORMAT31i263_tree=null;
		CommonTree INSTRUCTION_FORMAT31i_OR_ID264_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT31i_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT31i_OR_ID");

		try {
			// smaliParser.g:827:3: ( INSTRUCTION_FORMAT31i | INSTRUCTION_FORMAT31i_OR_ID -> INSTRUCTION_FORMAT31i[$INSTRUCTION_FORMAT31i_OR_ID] )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==INSTRUCTION_FORMAT31i) ) {
				alt52=1;
			}
			else if ( (LA52_0==INSTRUCTION_FORMAT31i_OR_ID) ) {
				alt52=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// smaliParser.g:827:5: INSTRUCTION_FORMAT31i
					{
					root_0 = (CommonTree)adaptor.nil();


					INSTRUCTION_FORMAT31i263=(Token)match(input,INSTRUCTION_FORMAT31i,FOLLOW_INSTRUCTION_FORMAT31i_in_instruction_format31i3955); 
					INSTRUCTION_FORMAT31i263_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT31i263);
					adaptor.addChild(root_0, INSTRUCTION_FORMAT31i263_tree);

					}
					break;
				case 2 :
					// smaliParser.g:828:5: INSTRUCTION_FORMAT31i_OR_ID
					{
					INSTRUCTION_FORMAT31i_OR_ID264=(Token)match(input,INSTRUCTION_FORMAT31i_OR_ID,FOLLOW_INSTRUCTION_FORMAT31i_OR_ID_in_instruction_format31i3961);  
					stream_INSTRUCTION_FORMAT31i_OR_ID.add(INSTRUCTION_FORMAT31i_OR_ID264);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 828:33: -> INSTRUCTION_FORMAT31i[$INSTRUCTION_FORMAT31i_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INSTRUCTION_FORMAT31i, INSTRUCTION_FORMAT31i_OR_ID264));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruction_format31i"


	public static class instruction_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// smaliParser.g:830:1: instruction : ( insn_format10t | insn_format10x | insn_format10x_odex | insn_format11n | insn_format11x | insn_format12x | insn_format20bc | insn_format20t | insn_format21c_field | insn_format21c_field_odex | insn_format21c_method_handle | insn_format21c_method_type | insn_format21c_string | insn_format21c_type | insn_format21ih | insn_format21lh | insn_format21s | insn_format21t | insn_format22b | insn_format22c_field | insn_format22c_field_odex | insn_format22c_type | insn_format22cs_field | insn_format22s | insn_format22t | insn_format22x | insn_format23x | insn_format30t | insn_format31c | insn_format31i | insn_format31t | insn_format32x | insn_format35c_call_site | insn_format35c_method | insn_format35c_type | insn_format35c_method_odex | insn_format35mi_method | insn_format35ms_method | insn_format3rc_call_site | insn_format3rc_method | insn_format3rc_method_odex | insn_format3rc_type | insn_format3rmi_method | insn_format3rms_method | insn_format45cc_method | insn_format4rcc_method | insn_format51l | insn_array_data_directive | insn_packed_switch_directive | insn_sparse_switch_directive );
	public final smaliParser.instruction_return instruction() throws RecognitionException {
		smaliParser.instruction_return retval = new smaliParser.instruction_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope insn_format10t265 =null;
		ParserRuleReturnScope insn_format10x266 =null;
		ParserRuleReturnScope insn_format10x_odex267 =null;
		ParserRuleReturnScope insn_format11n268 =null;
		ParserRuleReturnScope insn_format11x269 =null;
		ParserRuleReturnScope insn_format12x270 =null;
		ParserRuleReturnScope insn_format20bc271 =null;
		ParserRuleReturnScope insn_format20t272 =null;
		ParserRuleReturnScope insn_format21c_field273 =null;
		ParserRuleReturnScope insn_format21c_field_odex274 =null;
		ParserRuleReturnScope insn_format21c_method_handle275 =null;
		ParserRuleReturnScope insn_format21c_method_type276 =null;
		ParserRuleReturnScope insn_format21c_string277 =null;
		ParserRuleReturnScope insn_format21c_type278 =null;
		ParserRuleReturnScope insn_format21ih279 =null;
		ParserRuleReturnScope insn_format21lh280 =null;
		ParserRuleReturnScope insn_format21s281 =null;
		ParserRuleReturnScope insn_format21t282 =null;
		ParserRuleReturnScope insn_format22b283 =null;
		ParserRuleReturnScope insn_format22c_field284 =null;
		ParserRuleReturnScope insn_format22c_field_odex285 =null;
		ParserRuleReturnScope insn_format22c_type286 =null;
		ParserRuleReturnScope insn_format22cs_field287 =null;
		ParserRuleReturnScope insn_format22s288 =null;
		ParserRuleReturnScope insn_format22t289 =null;
		ParserRuleReturnScope insn_format22x290 =null;
		ParserRuleReturnScope insn_format23x291 =null;
		ParserRuleReturnScope insn_format30t292 =null;
		ParserRuleReturnScope insn_format31c293 =null;
		ParserRuleReturnScope insn_format31i294 =null;
		ParserRuleReturnScope insn_format31t295 =null;
		ParserRuleReturnScope insn_format32x296 =null;
		ParserRuleReturnScope insn_format35c_call_site297 =null;
		ParserRuleReturnScope insn_format35c_method298 =null;
		ParserRuleReturnScope insn_format35c_type299 =null;
		ParserRuleReturnScope insn_format35c_method_odex300 =null;
		ParserRuleReturnScope insn_format35mi_method301 =null;
		ParserRuleReturnScope insn_format35ms_method302 =null;
		ParserRuleReturnScope insn_format3rc_call_site303 =null;
		ParserRuleReturnScope insn_format3rc_method304 =null;
		ParserRuleReturnScope insn_format3rc_method_odex305 =null;
		ParserRuleReturnScope insn_format3rc_type306 =null;
		ParserRuleReturnScope insn_format3rmi_method307 =null;
		ParserRuleReturnScope insn_format3rms_method308 =null;
		ParserRuleReturnScope insn_format45cc_method309 =null;
		ParserRuleReturnScope insn_format4rcc_method310 =null;
		ParserRuleReturnScope insn_format51l311 =null;
		ParserRuleReturnScope insn_array_data_directive312 =null;
		ParserRuleReturnScope insn_packed_switch_directive313 =null;
		ParserRuleReturnScope insn_sparse_switch_directive314 =null;


		try {
			// smaliParser.g:831:3: ( insn_format10t | insn_format10x | insn_format10x_odex | insn_format11n | insn_format11x | insn_format12x | insn_format20bc | insn_format20t | insn_format21c_field | insn_format21c_field_odex | insn_format21c_method_handle | insn_format21c_method_type | insn_format21c_string | insn_format21c_type | insn_format21ih | insn_format21lh | insn_format21s | insn_format21t | insn_format22b | insn_format22c_field | insn_format22c_field_odex | insn_format22c_type | insn_format22cs_field | insn_format22s | insn_format22t | insn_format22x | insn_format23x | insn_format30t | insn_format31c | insn_format31i | insn_format31t | insn_format32x | insn_format35c_call_site | insn_format35c_method | insn_format35c_type | insn_format35c_method_odex | insn_format35mi_method | insn_format35ms_method | insn_format3rc_call_site | insn_format3rc_method | insn_format3rc_method_odex | insn_format3rc_type | insn_format3rmi_method | insn_format3rms_method | insn_format45cc_method | insn_format4rcc_method | insn_format51l | insn_array_data_directive | insn_packed_switch_directive | insn_sparse_switch_directive )
			int alt53=50;
			switch ( input.LA(1) ) {
			case INSTRUCTION_FORMAT10t:
				{
				alt53=1;
				}
				break;
			case INSTRUCTION_FORMAT10x:
				{
				alt53=2;
				}
				break;
			case INSTRUCTION_FORMAT10x_ODEX:
				{
				alt53=3;
				}
				break;
			case INSTRUCTION_FORMAT11n:
				{
				alt53=4;
				}
				break;
			case INSTRUCTION_FORMAT11x:
				{
				alt53=5;
				}
				break;
			case INSTRUCTION_FORMAT12x:
			case INSTRUCTION_FORMAT12x_OR_ID:
				{
				alt53=6;
				}
				break;
			case INSTRUCTION_FORMAT20bc:
				{
				alt53=7;
				}
				break;
			case INSTRUCTION_FORMAT20t:
				{
				alt53=8;
				}
				break;
			case INSTRUCTION_FORMAT21c_FIELD:
				{
				alt53=9;
				}
				break;
			case INSTRUCTION_FORMAT21c_FIELD_ODEX:
				{
				alt53=10;
				}
				break;
			case INSTRUCTION_FORMAT21c_METHOD_HANDLE:
				{
				alt53=11;
				}
				break;
			case INSTRUCTION_FORMAT21c_METHOD_TYPE:
				{
				alt53=12;
				}
				break;
			case INSTRUCTION_FORMAT21c_STRING:
				{
				alt53=13;
				}
				break;
			case INSTRUCTION_FORMAT21c_TYPE:
				{
				alt53=14;
				}
				break;
			case INSTRUCTION_FORMAT21ih:
				{
				alt53=15;
				}
				break;
			case INSTRUCTION_FORMAT21lh:
				{
				alt53=16;
				}
				break;
			case INSTRUCTION_FORMAT21s:
				{
				alt53=17;
				}
				break;
			case INSTRUCTION_FORMAT21t:
				{
				alt53=18;
				}
				break;
			case INSTRUCTION_FORMAT22b:
				{
				alt53=19;
				}
				break;
			case INSTRUCTION_FORMAT22c_FIELD:
				{
				alt53=20;
				}
				break;
			case INSTRUCTION_FORMAT22c_FIELD_ODEX:
				{
				alt53=21;
				}
				break;
			case INSTRUCTION_FORMAT22c_TYPE:
				{
				alt53=22;
				}
				break;
			case INSTRUCTION_FORMAT22cs_FIELD:
				{
				alt53=23;
				}
				break;
			case INSTRUCTION_FORMAT22s:
			case INSTRUCTION_FORMAT22s_OR_ID:
				{
				alt53=24;
				}
				break;
			case INSTRUCTION_FORMAT22t:
				{
				alt53=25;
				}
				break;
			case INSTRUCTION_FORMAT22x:
				{
				alt53=26;
				}
				break;
			case INSTRUCTION_FORMAT23x:
				{
				alt53=27;
				}
				break;
			case INSTRUCTION_FORMAT30t:
				{
				alt53=28;
				}
				break;
			case INSTRUCTION_FORMAT31c:
				{
				alt53=29;
				}
				break;
			case INSTRUCTION_FORMAT31i:
			case INSTRUCTION_FORMAT31i_OR_ID:
				{
				alt53=30;
				}
				break;
			case INSTRUCTION_FORMAT31t:
				{
				alt53=31;
				}
				break;
			case INSTRUCTION_FORMAT32x:
				{
				alt53=32;
				}
				break;
			case INSTRUCTION_FORMAT35c_CALL_SITE:
				{
				alt53=33;
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD:
				{
				alt53=34;
				}
				break;
			case INSTRUCTION_FORMAT35c_TYPE:
				{
				alt53=35;
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD_ODEX:
				{
				alt53=36;
				}
				break;
			case INSTRUCTION_FORMAT35mi_METHOD:
				{
				alt53=37;
				}
				break;
			case INSTRUCTION_FORMAT35ms_METHOD:
				{
				alt53=38;
				}
				break;
			case INSTRUCTION_FORMAT3rc_CALL_SITE:
				{
				alt53=39;
				}
				break;
			case INSTRUCTION_FORMAT3rc_METHOD:
				{
				alt53=40;
				}
				break;
			case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
				{
				alt53=41;
				}
				break;
			case INSTRUCTION_FORMAT3rc_TYPE:
				{
				alt53=42;
				}
				break;
			case INSTRUCTION_FORMAT3rmi_METHOD:
				{
				alt53=43;
				}
				break;
			case INSTRUCTION_FORMAT3rms_METHOD:
				{
				alt53=44;
				}
				break;
			case INSTRUCTION_FORMAT45cc_METHOD:
				{
				alt53=45;
				}
				break;
			case INSTRUCTION_FORMAT4rcc_METHOD:
				{
				alt53=46;
				}
				break;
			case INSTRUCTION_FORMAT51l:
				{
				alt53=47;
				}
				break;
			case ARRAY_DATA_DIRECTIVE:
				{
				alt53=48;
				}
				break;
			case PACKED_SWITCH_DIRECTIVE:
				{
				alt53=49;
				}
				break;
			case SPARSE_SWITCH_DIRECTIVE:
				{
				alt53=50;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// smaliParser.g:831:5: insn_format10t
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format10t_in_instruction3976);
					insn_format10t265=insn_format10t();
					state._fsp--;

					adaptor.addChild(root_0, insn_format10t265.getTree());

					}
					break;
				case 2 :
					// smaliParser.g:832:5: insn_format10x
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format10x_in_instruction3982);
					insn_format10x266=insn_format10x();
					state._fsp--;

					adaptor.addChild(root_0, insn_format10x266.getTree());

					}
					break;
				case 3 :
					// smaliParser.g:833:5: insn_format10x_odex
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format10x_odex_in_instruction3988);
					insn_format10x_odex267=insn_format10x_odex();
					state._fsp--;

					adaptor.addChild(root_0, insn_format10x_odex267.getTree());

					}
					break;
				case 4 :
					// smaliParser.g:834:5: insn_format11n
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format11n_in_instruction3994);
					insn_format11n268=insn_format11n();
					state._fsp--;

					adaptor.addChild(root_0, insn_format11n268.getTree());

					}
					break;
				case 5 :
					// smaliParser.g:835:5: insn_format11x
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format11x_in_instruction4000);
					insn_format11x269=insn_format11x();
					state._fsp--;

					adaptor.addChild(root_0, insn_format11x269.getTree());

					}
					break;
				case 6 :
					// smaliParser.g:836:5: insn_format12x
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format12x_in_instruction4006);
					insn_format12x270=insn_format12x();
					state._fsp--;

					adaptor.addChild(root_0, insn_format12x270.getTree());

					}
					break;
				case 7 :
					// smaliParser.g:837:5: insn_format20bc
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format20bc_in_instruction4012);
					insn_format20bc271=insn_format20bc();
					state._fsp--;

					adaptor.addChild(root_0, insn_format20bc271.getTree());

					}
					break;
				case 8 :
					// smaliParser.g:838:5: insn_format20t
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format20t_in_instruction4018);
					insn_format20t272=insn_format20t();
					state._fsp--;

					adaptor.addChild(root_0, insn_format20t272.getTree());

					}
					break;
				case 9 :
					// smaliParser.g:839:5: insn_format21c_field
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21c_field_in_instruction4024);
					insn_format21c_field273=insn_format21c_field();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21c_field273.getTree());

					}
					break;
				case 10 :
					// smaliParser.g:840:5: insn_format21c_field_odex
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21c_field_odex_in_instruction4030);
					insn_format21c_field_odex274=insn_format21c_field_odex();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21c_field_odex274.getTree());

					}
					break;
				case 11 :
					// smaliParser.g:841:5: insn_format21c_method_handle
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21c_method_handle_in_instruction4036);
					insn_format21c_method_handle275=insn_format21c_method_handle();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21c_method_handle275.getTree());

					}
					break;
				case 12 :
					// smaliParser.g:842:5: insn_format21c_method_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21c_method_type_in_instruction4042);
					insn_format21c_method_type276=insn_format21c_method_type();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21c_method_type276.getTree());

					}
					break;
				case 13 :
					// smaliParser.g:843:5: insn_format21c_string
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21c_string_in_instruction4048);
					insn_format21c_string277=insn_format21c_string();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21c_string277.getTree());

					}
					break;
				case 14 :
					// smaliParser.g:844:5: insn_format21c_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21c_type_in_instruction4054);
					insn_format21c_type278=insn_format21c_type();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21c_type278.getTree());

					}
					break;
				case 15 :
					// smaliParser.g:845:5: insn_format21ih
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21ih_in_instruction4060);
					insn_format21ih279=insn_format21ih();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21ih279.getTree());

					}
					break;
				case 16 :
					// smaliParser.g:846:5: insn_format21lh
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21lh_in_instruction4066);
					insn_format21lh280=insn_format21lh();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21lh280.getTree());

					}
					break;
				case 17 :
					// smaliParser.g:847:5: insn_format21s
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21s_in_instruction4072);
					insn_format21s281=insn_format21s();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21s281.getTree());

					}
					break;
				case 18 :
					// smaliParser.g:848:5: insn_format21t
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21t_in_instruction4078);
					insn_format21t282=insn_format21t();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21t282.getTree());

					}
					break;
				case 19 :
					// smaliParser.g:849:5: insn_format22b
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22b_in_instruction4084);
					insn_format22b283=insn_format22b();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22b283.getTree());

					}
					break;
				case 20 :
					// smaliParser.g:850:5: insn_format22c_field
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22c_field_in_instruction4090);
					insn_format22c_field284=insn_format22c_field();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22c_field284.getTree());

					}
					break;
				case 21 :
					// smaliParser.g:851:5: insn_format22c_field_odex
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22c_field_odex_in_instruction4096);
					insn_format22c_field_odex285=insn_format22c_field_odex();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22c_field_odex285.getTree());

					}
					break;
				case 22 :
					// smaliParser.g:852:5: insn_format22c_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22c_type_in_instruction4102);
					insn_format22c_type286=insn_format22c_type();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22c_type286.getTree());

					}
					break;
				case 23 :
					// smaliParser.g:853:5: insn_format22cs_field
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22cs_field_in_instruction4108);
					insn_format22cs_field287=insn_format22cs_field();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22cs_field287.getTree());

					}
					break;
				case 24 :
					// smaliParser.g:854:5: insn_format22s
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22s_in_instruction4114);
					insn_format22s288=insn_format22s();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22s288.getTree());

					}
					break;
				case 25 :
					// smaliParser.g:855:5: insn_format22t
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22t_in_instruction4120);
					insn_format22t289=insn_format22t();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22t289.getTree());

					}
					break;
				case 26 :
					// smaliParser.g:856:5: insn_format22x
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22x_in_instruction4126);
					insn_format22x290=insn_format22x();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22x290.getTree());

					}
					break;
				case 27 :
					// smaliParser.g:857:5: insn_format23x
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format23x_in_instruction4132);
					insn_format23x291=insn_format23x();
					state._fsp--;

					adaptor.addChild(root_0, insn_format23x291.getTree());

					}
					break;
				case 28 :
					// smaliParser.g:858:5: insn_format30t
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format30t_in_instruction4138);
					insn_format30t292=insn_format30t();
					state._fsp--;

					adaptor.addChild(root_0, insn_format30t292.getTree());

					}
					break;
				case 29 :
					// smaliParser.g:859:5: insn_format31c
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format31c_in_instruction4144);
					insn_format31c293=insn_format31c();
					state._fsp--;

					adaptor.addChild(root_0, insn_format31c293.getTree());

					}
					break;
				case 30 :
					// smaliParser.g:860:5: insn_format31i
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format31i_in_instruction4150);
					insn_format31i294=insn_format31i();
					state._fsp--;

					adaptor.addChild(root_0, insn_format31i294.getTree());

					}
					break;
				case 31 :
					// smaliParser.g:861:5: insn_format31t
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format31t_in_instruction4156);
					insn_format31t295=insn_format31t();
					state._fsp--;

					adaptor.addChild(root_0, insn_format31t295.getTree());

					}
					break;
				case 32 :
					// smaliParser.g:862:5: insn_format32x
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format32x_in_instruction4162);
					insn_format32x296=insn_format32x();
					state._fsp--;

					adaptor.addChild(root_0, insn_format32x296.getTree());

					}
					break;
				case 33 :
					// smaliParser.g:863:5: insn_format35c_call_site
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format35c_call_site_in_instruction4168);
					insn_format35c_call_site297=insn_format35c_call_site();
					state._fsp--;

					adaptor.addChild(root_0, insn_format35c_call_site297.getTree());

					}
					break;
				case 34 :
					// smaliParser.g:864:5: insn_format35c_method
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format35c_method_in_instruction4174);
					insn_format35c_method298=insn_format35c_method();
					state._fsp--;

					adaptor.addChild(root_0, insn_format35c_method298.getTree());

					}
					break;
				case 35 :
					// smaliParser.g:865:5: insn_format35c_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format35c_type_in_instruction4180);
					insn_format35c_type299=insn_format35c_type();
					state._fsp--;

					adaptor.addChild(root_0, insn_format35c_type299.getTree());

					}
					break;
				case 36 :
					// smaliParser.g:866:5: insn_format35c_method_odex
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format35c_method_odex_in_instruction4186);
					insn_format35c_method_odex300=insn_format35c_method_odex();
					state._fsp--;

					adaptor.addChild(root_0, insn_format35c_method_odex300.getTree());

					}
					break;
				case 37 :
					// smaliParser.g:867:5: insn_format35mi_method
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format35mi_method_in_instruction4192);
					insn_format35mi_method301=insn_format35mi_method();
					state._fsp--;

					adaptor.addChild(root_0, insn_format35mi_method301.getTree());

					}
					break;
				case 38 :
					// smaliParser.g:868:5: insn_format35ms_method
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format35ms_method_in_instruction4198);
					insn_format35ms_method302=insn_format35ms_method();
					state._fsp--;

					adaptor.addChild(root_0, insn_format35ms_method302.getTree());

					}
					break;
				case 39 :
					// smaliParser.g:869:5: insn_format3rc_call_site
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format3rc_call_site_in_instruction4204);
					insn_format3rc_call_site303=insn_format3rc_call_site();
					state._fsp--;

					adaptor.addChild(root_0, insn_format3rc_call_site303.getTree());

					}
					break;
				case 40 :
					// smaliParser.g:870:5: insn_format3rc_method
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format3rc_method_in_instruction4210);
					insn_format3rc_method304=insn_format3rc_method();
					state._fsp--;

					adaptor.addChild(root_0, insn_format3rc_method304.getTree());

					}
					break;
				case 41 :
					// smaliParser.g:871:5: insn_format3rc_method_odex
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format3rc_method_odex_in_instruction4216);
					insn_format3rc_method_odex305=insn_format3rc_method_odex();
					state._fsp--;

					adaptor.addChild(root_0, insn_format3rc_method_odex305.getTree());

					}
					break;
				case 42 :
					// smaliParser.g:872:5: insn_format3rc_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format3rc_type_in_instruction4222);
					insn_format3rc_type306=insn_format3rc_type();
					state._fsp--;

					adaptor.addChild(root_0, insn_format3rc_type306.getTree());

					}
					break;
				case 43 :
					// smaliParser.g:873:5: insn_format3rmi_method
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format3rmi_method_in_instruction4228);
					insn_format3rmi_method307=insn_format3rmi_method();
					state._fsp--;

					adaptor.addChild(root_0, insn_format3rmi_method307.getTree());

					}
					break;
				case 44 :
					// smaliParser.g:874:5: insn_format3rms_method
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format3rms_method_in_instruction4234);
					insn_format3rms_method308=insn_format3rms_method();
					state._fsp--;

					adaptor.addChild(root_0, insn_format3rms_method308.getTree());

					}
					break;
				case 45 :
					// smaliParser.g:875:5: insn_format45cc_method
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format45cc_method_in_instruction4240);
					insn_format45cc_method309=insn_format45cc_method();
					state._fsp--;

					adaptor.addChild(root_0, insn_format45cc_method309.getTree());

					}
					break;
				case 46 :
					// smaliParser.g:876:5: insn_format4rcc_method
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format4rcc_method_in_instruction4246);
					insn_format4rcc_method310=insn_format4rcc_method();
					state._fsp--;

					adaptor.addChild(root_0, insn_format4rcc_method310.getTree());

					}
					break;
				case 47 :
					// smaliParser.g:877:5: insn_format51l
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format51l_in_instruction4252);
					insn_format51l311=insn_format51l();
					state._fsp--;

					adaptor.addChild(root_0, insn_format51l311.getTree());

					}
					break;
				case 48 :
					// smaliParser.g:878:5: insn_array_data_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_array_data_directive_in_instruction4258);
					insn_array_data_directive312=insn_array_data_directive();
					state._fsp--;

					adaptor.addChild(root_0, insn_array_data_directive312.getTree());

					}
					break;
				case 49 :
					// smaliParser.g:879:5: insn_packed_switch_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_packed_switch_directive_in_instruction4264);
					insn_packed_switch_directive313=insn_packed_switch_directive();
					state._fsp--;

					adaptor.addChild(root_0, insn_packed_switch_directive313.getTree());

					}
					break;
				case 50 :
					// smaliParser.g:880:5: insn_sparse_switch_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_sparse_switch_directive_in_instruction4270);
					insn_sparse_switch_directive314=insn_sparse_switch_directive();
					state._fsp--;

					adaptor.addChild(root_0, insn_sparse_switch_directive314.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class insn_format10t_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format10t"
	// smaliParser.g:882:1: insn_format10t : INSTRUCTION_FORMAT10t label_ref -> ^( I_STATEMENT_FORMAT10t[$start, \"I_STATEMENT_FORMAT10t\"] INSTRUCTION_FORMAT10t label_ref ) ;
	public final smaliParser.insn_format10t_return insn_format10t() throws RecognitionException {
		smaliParser.insn_format10t_return retval = new smaliParser.insn_format10t_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT10t315=null;
		ParserRuleReturnScope label_ref316 =null;

		CommonTree INSTRUCTION_FORMAT10t315_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT10t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT10t");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// smaliParser.g:883:3: ( INSTRUCTION_FORMAT10t label_ref -> ^( I_STATEMENT_FORMAT10t[$start, \"I_STATEMENT_FORMAT10t\"] INSTRUCTION_FORMAT10t label_ref ) )
			// smaliParser.g:885:5: INSTRUCTION_FORMAT10t label_ref
			{
			INSTRUCTION_FORMAT10t315=(Token)match(input,INSTRUCTION_FORMAT10t,FOLLOW_INSTRUCTION_FORMAT10t_in_insn_format10t4290);  
			stream_INSTRUCTION_FORMAT10t.add(INSTRUCTION_FORMAT10t315);

			pushFollow(FOLLOW_label_ref_in_insn_format10t4292);
			label_ref316=label_ref();
			state._fsp--;

			stream_label_ref.add(label_ref316.getTree());
			// AST REWRITE
			// elements: INSTRUCTION_FORMAT10t, label_ref
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 886:5: -> ^( I_STATEMENT_FORMAT10t[$start, \"I_STATEMENT_FORMAT10t\"] INSTRUCTION_FORMAT10t label_ref )
			{
				// smaliParser.g:886:8: ^( I_STATEMENT_FORMAT10t[$start, \"I_STATEMENT_FORMAT10t\"] INSTRUCTION_FORMAT10t label_ref )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT10t, (retval.start), "I_STATEMENT_FORMAT10t"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT10t.nextNode());
				adaptor.addChild(root_1, stream_label_ref.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format10t"


	public static class insn_format10x_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format10x"
	// smaliParser.g:888:1: insn_format10x : INSTRUCTION_FORMAT10x -> ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x ) ;
	public final smaliParser.insn_format10x_return insn_format10x() throws RecognitionException {
		smaliParser.insn_format10x_return retval = new smaliParser.insn_format10x_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT10x317=null;

		CommonTree INSTRUCTION_FORMAT10x317_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT10x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT10x");

		try {
			// smaliParser.g:889:3: ( INSTRUCTION_FORMAT10x -> ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x ) )
			// smaliParser.g:890:5: INSTRUCTION_FORMAT10x
			{
			INSTRUCTION_FORMAT10x317=(Token)match(input,INSTRUCTION_FORMAT10x,FOLLOW_INSTRUCTION_FORMAT10x_in_insn_format10x4322);  
			stream_INSTRUCTION_FORMAT10x.add(INSTRUCTION_FORMAT10x317);

			// AST REWRITE
			// elements: INSTRUCTION_FORMAT10x
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 891:5: -> ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x )
			{
				// smaliParser.g:891:8: ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT10x, (retval.start), "I_STATEMENT_FORMAT10x"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT10x.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format10x"


	public static class insn_format10x_odex_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format10x_odex"
	// smaliParser.g:893:1: insn_format10x_odex : INSTRUCTION_FORMAT10x_ODEX ;
	public final smaliParser.insn_format10x_odex_return insn_format10x_odex() throws RecognitionException {
		smaliParser.insn_format10x_odex_return retval = new smaliParser.insn_format10x_odex_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT10x_ODEX318=null;

		CommonTree INSTRUCTION_FORMAT10x_ODEX318_tree=null;

		try {
			// smaliParser.g:894:3: ( INSTRUCTION_FORMAT10x_ODEX )
			// smaliParser.g:895:5: INSTRUCTION_FORMAT10x_ODEX
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT10x_ODEX318=(Token)match(input,INSTRUCTION_FORMAT10x_ODEX,FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_insn_format10x_odex4350); 
			INSTRUCTION_FORMAT10x_ODEX318_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT10x_ODEX318);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT10x_ODEX318_tree);


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT10x_ODEX318!=null?INSTRUCTION_FORMAT10x_ODEX318.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format10x_odex"


	public static class insn_format11n_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format11n"
	// smaliParser.g:900:1: insn_format11n : INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT11n[$start, \"I_STATEMENT_FORMAT11n\"] INSTRUCTION_FORMAT11n REGISTER integral_literal ) ;
	public final smaliParser.insn_format11n_return insn_format11n() throws RecognitionException {
		smaliParser.insn_format11n_return retval = new smaliParser.insn_format11n_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT11n319=null;
		Token REGISTER320=null;
		Token COMMA321=null;
		ParserRuleReturnScope integral_literal322 =null;

		CommonTree INSTRUCTION_FORMAT11n319_tree=null;
		CommonTree REGISTER320_tree=null;
		CommonTree COMMA321_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT11n=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT11n");
		RewriteRuleSubtreeStream stream_integral_literal=new RewriteRuleSubtreeStream(adaptor,"rule integral_literal");

		try {
			// smaliParser.g:901:3: ( INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT11n[$start, \"I_STATEMENT_FORMAT11n\"] INSTRUCTION_FORMAT11n REGISTER integral_literal ) )
			// smaliParser.g:902:5: INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal
			{
			INSTRUCTION_FORMAT11n319=(Token)match(input,INSTRUCTION_FORMAT11n,FOLLOW_INSTRUCTION_FORMAT11n_in_insn_format11n4371);  
			stream_INSTRUCTION_FORMAT11n.add(INSTRUCTION_FORMAT11n319);

			REGISTER320=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format11n4373);  
			stream_REGISTER.add(REGISTER320);

			COMMA321=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format11n4375);  
			stream_COMMA.add(COMMA321);

			pushFollow(FOLLOW_integral_literal_in_insn_format11n4377);
			integral_literal322=integral_literal();
			state._fsp--;

			stream_integral_literal.add(integral_literal322.getTree());
			// AST REWRITE
			// elements: integral_literal, REGISTER, INSTRUCTION_FORMAT11n
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 903:5: -> ^( I_STATEMENT_FORMAT11n[$start, \"I_STATEMENT_FORMAT11n\"] INSTRUCTION_FORMAT11n REGISTER integral_literal )
			{
				// smaliParser.g:903:8: ^( I_STATEMENT_FORMAT11n[$start, \"I_STATEMENT_FORMAT11n\"] INSTRUCTION_FORMAT11n REGISTER integral_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT11n, (retval.start), "I_STATEMENT_FORMAT11n"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT11n.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_integral_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format11n"


	public static class insn_format11x_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format11x"
	// smaliParser.g:905:1: insn_format11x : INSTRUCTION_FORMAT11x REGISTER -> ^( I_STATEMENT_FORMAT11x[$start, \"I_STATEMENT_FORMAT11x\"] INSTRUCTION_FORMAT11x REGISTER ) ;
	public final smaliParser.insn_format11x_return insn_format11x() throws RecognitionException {
		smaliParser.insn_format11x_return retval = new smaliParser.insn_format11x_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT11x323=null;
		Token REGISTER324=null;

		CommonTree INSTRUCTION_FORMAT11x323_tree=null;
		CommonTree REGISTER324_tree=null;
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT11x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT11x");

		try {
			// smaliParser.g:906:3: ( INSTRUCTION_FORMAT11x REGISTER -> ^( I_STATEMENT_FORMAT11x[$start, \"I_STATEMENT_FORMAT11x\"] INSTRUCTION_FORMAT11x REGISTER ) )
			// smaliParser.g:907:5: INSTRUCTION_FORMAT11x REGISTER
			{
			INSTRUCTION_FORMAT11x323=(Token)match(input,INSTRUCTION_FORMAT11x,FOLLOW_INSTRUCTION_FORMAT11x_in_insn_format11x4409);  
			stream_INSTRUCTION_FORMAT11x.add(INSTRUCTION_FORMAT11x323);

			REGISTER324=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format11x4411);  
			stream_REGISTER.add(REGISTER324);

			// AST REWRITE
			// elements: INSTRUCTION_FORMAT11x, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 908:5: -> ^( I_STATEMENT_FORMAT11x[$start, \"I_STATEMENT_FORMAT11x\"] INSTRUCTION_FORMAT11x REGISTER )
			{
				// smaliParser.g:908:8: ^( I_STATEMENT_FORMAT11x[$start, \"I_STATEMENT_FORMAT11x\"] INSTRUCTION_FORMAT11x REGISTER )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT11x, (retval.start), "I_STATEMENT_FORMAT11x"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT11x.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format11x"


	public static class insn_format12x_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format12x"
	// smaliParser.g:910:1: insn_format12x : instruction_format12x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT12x[$start, \"I_STATEMENT_FORMAT12x\"] instruction_format12x REGISTER REGISTER ) ;
	public final smaliParser.insn_format12x_return insn_format12x() throws RecognitionException {
		smaliParser.insn_format12x_return retval = new smaliParser.insn_format12x_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token REGISTER326=null;
		Token COMMA327=null;
		Token REGISTER328=null;
		ParserRuleReturnScope instruction_format12x325 =null;

		CommonTree REGISTER326_tree=null;
		CommonTree COMMA327_tree=null;
		CommonTree REGISTER328_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleSubtreeStream stream_instruction_format12x=new RewriteRuleSubtreeStream(adaptor,"rule instruction_format12x");

		try {
			// smaliParser.g:911:3: ( instruction_format12x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT12x[$start, \"I_STATEMENT_FORMAT12x\"] instruction_format12x REGISTER REGISTER ) )
			// smaliParser.g:912:5: instruction_format12x REGISTER COMMA REGISTER
			{
			pushFollow(FOLLOW_instruction_format12x_in_insn_format12x4441);
			instruction_format12x325=instruction_format12x();
			state._fsp--;

			stream_instruction_format12x.add(instruction_format12x325.getTree());
			REGISTER326=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format12x4443);  
			stream_REGISTER.add(REGISTER326);

			COMMA327=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format12x4445);  
			stream_COMMA.add(COMMA327);

			REGISTER328=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format12x4447);  
			stream_REGISTER.add(REGISTER328);

			// AST REWRITE
			// elements: REGISTER, REGISTER, instruction_format12x
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 913:5: -> ^( I_STATEMENT_FORMAT12x[$start, \"I_STATEMENT_FORMAT12x\"] instruction_format12x REGISTER REGISTER )
			{
				// smaliParser.g:913:8: ^( I_STATEMENT_FORMAT12x[$start, \"I_STATEMENT_FORMAT12x\"] instruction_format12x REGISTER REGISTER )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT12x, (retval.start), "I_STATEMENT_FORMAT12x"), root_1);
				adaptor.addChild(root_1, stream_instruction_format12x.nextTree());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format12x"


	public static class insn_format20bc_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format20bc"
	// smaliParser.g:915:1: insn_format20bc : INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference -> ^( I_STATEMENT_FORMAT20bc INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE verification_error_reference ) ;
	public final smaliParser.insn_format20bc_return insn_format20bc() throws RecognitionException {
		smaliParser.insn_format20bc_return retval = new smaliParser.insn_format20bc_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT20bc329=null;
		Token VERIFICATION_ERROR_TYPE330=null;
		Token COMMA331=null;
		ParserRuleReturnScope verification_error_reference332 =null;

		CommonTree INSTRUCTION_FORMAT20bc329_tree=null;
		CommonTree VERIFICATION_ERROR_TYPE330_tree=null;
		CommonTree COMMA331_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_VERIFICATION_ERROR_TYPE=new RewriteRuleTokenStream(adaptor,"token VERIFICATION_ERROR_TYPE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT20bc=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT20bc");
		RewriteRuleSubtreeStream stream_verification_error_reference=new RewriteRuleSubtreeStream(adaptor,"rule verification_error_reference");

		try {
			// smaliParser.g:916:3: ( INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference -> ^( I_STATEMENT_FORMAT20bc INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE verification_error_reference ) )
			// smaliParser.g:917:5: INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference
			{
			INSTRUCTION_FORMAT20bc329=(Token)match(input,INSTRUCTION_FORMAT20bc,FOLLOW_INSTRUCTION_FORMAT20bc_in_insn_format20bc4479);  
			stream_INSTRUCTION_FORMAT20bc.add(INSTRUCTION_FORMAT20bc329);

			VERIFICATION_ERROR_TYPE330=(Token)match(input,VERIFICATION_ERROR_TYPE,FOLLOW_VERIFICATION_ERROR_TYPE_in_insn_format20bc4481);  
			stream_VERIFICATION_ERROR_TYPE.add(VERIFICATION_ERROR_TYPE330);

			COMMA331=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format20bc4483);  
			stream_COMMA.add(COMMA331);

			pushFollow(FOLLOW_verification_error_reference_in_insn_format20bc4485);
			verification_error_reference332=verification_error_reference();
			state._fsp--;

			stream_verification_error_reference.add(verification_error_reference332.getTree());

			      if (!allowOdex || opcodes.getOpcodeByName((INSTRUCTION_FORMAT20bc329!=null?INSTRUCTION_FORMAT20bc329.getText():null)) == null || apiLevel >= 14) {
			        throwOdexedInstructionException(input, (INSTRUCTION_FORMAT20bc329!=null?INSTRUCTION_FORMAT20bc329.getText():null));
			      }
			    
			// AST REWRITE
			// elements: verification_error_reference, VERIFICATION_ERROR_TYPE, INSTRUCTION_FORMAT20bc
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 923:5: -> ^( I_STATEMENT_FORMAT20bc INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE verification_error_reference )
			{
				// smaliParser.g:923:8: ^( I_STATEMENT_FORMAT20bc INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE verification_error_reference )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT20bc, "I_STATEMENT_FORMAT20bc"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT20bc.nextNode());
				adaptor.addChild(root_1, stream_VERIFICATION_ERROR_TYPE.nextNode());
				adaptor.addChild(root_1, stream_verification_error_reference.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format20bc"


	public static class insn_format20t_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format20t"
	// smaliParser.g:925:1: insn_format20t : INSTRUCTION_FORMAT20t label_ref -> ^( I_STATEMENT_FORMAT20t[$start, \"I_STATEMENT_FORMAT20t\"] INSTRUCTION_FORMAT20t label_ref ) ;
	public final smaliParser.insn_format20t_return insn_format20t() throws RecognitionException {
		smaliParser.insn_format20t_return retval = new smaliParser.insn_format20t_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT20t333=null;
		ParserRuleReturnScope label_ref334 =null;

		CommonTree INSTRUCTION_FORMAT20t333_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT20t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT20t");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// smaliParser.g:926:3: ( INSTRUCTION_FORMAT20t label_ref -> ^( I_STATEMENT_FORMAT20t[$start, \"I_STATEMENT_FORMAT20t\"] INSTRUCTION_FORMAT20t label_ref ) )
			// smaliParser.g:927:5: INSTRUCTION_FORMAT20t label_ref
			{
			INSTRUCTION_FORMAT20t333=(Token)match(input,INSTRUCTION_FORMAT20t,FOLLOW_INSTRUCTION_FORMAT20t_in_insn_format20t4522);  
			stream_INSTRUCTION_FORMAT20t.add(INSTRUCTION_FORMAT20t333);

			pushFollow(FOLLOW_label_ref_in_insn_format20t4524);
			label_ref334=label_ref();
			state._fsp--;

			stream_label_ref.add(label_ref334.getTree());
			// AST REWRITE
			// elements: INSTRUCTION_FORMAT20t, label_ref
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 928:5: -> ^( I_STATEMENT_FORMAT20t[$start, \"I_STATEMENT_FORMAT20t\"] INSTRUCTION_FORMAT20t label_ref )
			{
				// smaliParser.g:928:8: ^( I_STATEMENT_FORMAT20t[$start, \"I_STATEMENT_FORMAT20t\"] INSTRUCTION_FORMAT20t label_ref )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT20t, (retval.start), "I_STATEMENT_FORMAT20t"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT20t.nextNode());
				adaptor.addChild(root_1, stream_label_ref.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format20t"


	public static class insn_format21c_field_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21c_field"
	// smaliParser.g:930:1: insn_format21c_field : INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA field_reference -> ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD REGISTER field_reference ) ;
	public final smaliParser.insn_format21c_field_return insn_format21c_field() throws RecognitionException {
		smaliParser.insn_format21c_field_return retval = new smaliParser.insn_format21c_field_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21c_FIELD335=null;
		Token REGISTER336=null;
		Token COMMA337=null;
		ParserRuleReturnScope field_reference338 =null;

		CommonTree INSTRUCTION_FORMAT21c_FIELD335_tree=null;
		CommonTree REGISTER336_tree=null;
		CommonTree COMMA337_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_FIELD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_FIELD");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleSubtreeStream stream_field_reference=new RewriteRuleSubtreeStream(adaptor,"rule field_reference");

		try {
			// smaliParser.g:931:3: ( INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA field_reference -> ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD REGISTER field_reference ) )
			// smaliParser.g:932:5: INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA field_reference
			{
			INSTRUCTION_FORMAT21c_FIELD335=(Token)match(input,INSTRUCTION_FORMAT21c_FIELD,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_insn_format21c_field4554);  
			stream_INSTRUCTION_FORMAT21c_FIELD.add(INSTRUCTION_FORMAT21c_FIELD335);

			REGISTER336=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_field4556);  
			stream_REGISTER.add(REGISTER336);

			COMMA337=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_field4558);  
			stream_COMMA.add(COMMA337);

			pushFollow(FOLLOW_field_reference_in_insn_format21c_field4560);
			field_reference338=field_reference();
			state._fsp--;

			stream_field_reference.add(field_reference338.getTree());
			// AST REWRITE
			// elements: REGISTER, field_reference, INSTRUCTION_FORMAT21c_FIELD
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 933:5: -> ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD REGISTER field_reference )
			{
				// smaliParser.g:933:8: ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD REGISTER field_reference )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21c_FIELD, (retval.start), "I_STATEMENT_FORMAT21c_FIELD"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21c_FIELD.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_field_reference.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21c_field"


	public static class insn_format21c_field_odex_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21c_field_odex"
	// smaliParser.g:935:1: insn_format21c_field_odex : INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA field_reference -> ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER field_reference ) ;
	public final smaliParser.insn_format21c_field_odex_return insn_format21c_field_odex() throws RecognitionException {
		smaliParser.insn_format21c_field_odex_return retval = new smaliParser.insn_format21c_field_odex_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21c_FIELD_ODEX339=null;
		Token REGISTER340=null;
		Token COMMA341=null;
		ParserRuleReturnScope field_reference342 =null;

		CommonTree INSTRUCTION_FORMAT21c_FIELD_ODEX339_tree=null;
		CommonTree REGISTER340_tree=null;
		CommonTree COMMA341_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_FIELD_ODEX=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_FIELD_ODEX");
		RewriteRuleSubtreeStream stream_field_reference=new RewriteRuleSubtreeStream(adaptor,"rule field_reference");

		try {
			// smaliParser.g:936:3: ( INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA field_reference -> ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER field_reference ) )
			// smaliParser.g:937:5: INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA field_reference
			{
			INSTRUCTION_FORMAT21c_FIELD_ODEX339=(Token)match(input,INSTRUCTION_FORMAT21c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_insn_format21c_field_odex4592);  
			stream_INSTRUCTION_FORMAT21c_FIELD_ODEX.add(INSTRUCTION_FORMAT21c_FIELD_ODEX339);

			REGISTER340=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_field_odex4594);  
			stream_REGISTER.add(REGISTER340);

			COMMA341=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_field_odex4596);  
			stream_COMMA.add(COMMA341);

			pushFollow(FOLLOW_field_reference_in_insn_format21c_field_odex4598);
			field_reference342=field_reference();
			state._fsp--;

			stream_field_reference.add(field_reference342.getTree());

			      if (!allowOdex || opcodes.getOpcodeByName((INSTRUCTION_FORMAT21c_FIELD_ODEX339!=null?INSTRUCTION_FORMAT21c_FIELD_ODEX339.getText():null)) == null || apiLevel >= 14) {
			        throwOdexedInstructionException(input, (INSTRUCTION_FORMAT21c_FIELD_ODEX339!=null?INSTRUCTION_FORMAT21c_FIELD_ODEX339.getText():null));
			      }
			    
			// AST REWRITE
			// elements: INSTRUCTION_FORMAT21c_FIELD_ODEX, REGISTER, field_reference
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 943:5: -> ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER field_reference )
			{
				// smaliParser.g:943:8: ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER field_reference )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21c_FIELD, (retval.start), "I_STATEMENT_FORMAT21c_FIELD"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21c_FIELD_ODEX.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_field_reference.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21c_field_odex"


	public static class insn_format21c_method_handle_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21c_method_handle"
	// smaliParser.g:945:1: insn_format21c_method_handle : INSTRUCTION_FORMAT21c_METHOD_HANDLE REGISTER COMMA method_handle_reference -> ^( I_STATEMENT_FORMAT21c_METHOD_HANDLE[$start, \"I_STATEMENT_FORMAT21c_METHOD_HANDLE\"] INSTRUCTION_FORMAT21c_METHOD_HANDLE REGISTER method_handle_reference ) ;
	public final smaliParser.insn_format21c_method_handle_return insn_format21c_method_handle() throws RecognitionException {
		smaliParser.insn_format21c_method_handle_return retval = new smaliParser.insn_format21c_method_handle_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21c_METHOD_HANDLE343=null;
		Token REGISTER344=null;
		Token COMMA345=null;
		ParserRuleReturnScope method_handle_reference346 =null;

		CommonTree INSTRUCTION_FORMAT21c_METHOD_HANDLE343_tree=null;
		CommonTree REGISTER344_tree=null;
		CommonTree COMMA345_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_METHOD_HANDLE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_METHOD_HANDLE");
		RewriteRuleSubtreeStream stream_method_handle_reference=new RewriteRuleSubtreeStream(adaptor,"rule method_handle_reference");

		try {
			// smaliParser.g:946:3: ( INSTRUCTION_FORMAT21c_METHOD_HANDLE REGISTER COMMA method_handle_reference -> ^( I_STATEMENT_FORMAT21c_METHOD_HANDLE[$start, \"I_STATEMENT_FORMAT21c_METHOD_HANDLE\"] INSTRUCTION_FORMAT21c_METHOD_HANDLE REGISTER method_handle_reference ) )
			// smaliParser.g:947:5: INSTRUCTION_FORMAT21c_METHOD_HANDLE REGISTER COMMA method_handle_reference
			{
			INSTRUCTION_FORMAT21c_METHOD_HANDLE343=(Token)match(input,INSTRUCTION_FORMAT21c_METHOD_HANDLE,FOLLOW_INSTRUCTION_FORMAT21c_METHOD_HANDLE_in_insn_format21c_method_handle4636);  
			stream_INSTRUCTION_FORMAT21c_METHOD_HANDLE.add(INSTRUCTION_FORMAT21c_METHOD_HANDLE343);

			REGISTER344=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_method_handle4638);  
			stream_REGISTER.add(REGISTER344);

			COMMA345=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_method_handle4640);  
			stream_COMMA.add(COMMA345);

			pushFollow(FOLLOW_method_handle_reference_in_insn_format21c_method_handle4642);
			method_handle_reference346=method_handle_reference();
			state._fsp--;

			stream_method_handle_reference.add(method_handle_reference346.getTree());
			// AST REWRITE
			// elements: method_handle_reference, INSTRUCTION_FORMAT21c_METHOD_HANDLE, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 948:5: -> ^( I_STATEMENT_FORMAT21c_METHOD_HANDLE[$start, \"I_STATEMENT_FORMAT21c_METHOD_HANDLE\"] INSTRUCTION_FORMAT21c_METHOD_HANDLE REGISTER method_handle_reference )
			{
				// smaliParser.g:948:8: ^( I_STATEMENT_FORMAT21c_METHOD_HANDLE[$start, \"I_STATEMENT_FORMAT21c_METHOD_HANDLE\"] INSTRUCTION_FORMAT21c_METHOD_HANDLE REGISTER method_handle_reference )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21c_METHOD_HANDLE, (retval.start), "I_STATEMENT_FORMAT21c_METHOD_HANDLE"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21c_METHOD_HANDLE.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_method_handle_reference.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21c_method_handle"


	public static class insn_format21c_method_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21c_method_type"
	// smaliParser.g:951:1: insn_format21c_method_type : INSTRUCTION_FORMAT21c_METHOD_TYPE REGISTER COMMA method_prototype -> ^( I_STATEMENT_FORMAT21c_METHOD_TYPE[$start, \"I_STATEMENT_FORMAT21c_METHOD_TYPE\"] INSTRUCTION_FORMAT21c_METHOD_TYPE REGISTER method_prototype ) ;
	public final smaliParser.insn_format21c_method_type_return insn_format21c_method_type() throws RecognitionException {
		smaliParser.insn_format21c_method_type_return retval = new smaliParser.insn_format21c_method_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21c_METHOD_TYPE347=null;
		Token REGISTER348=null;
		Token COMMA349=null;
		ParserRuleReturnScope method_prototype350 =null;

		CommonTree INSTRUCTION_FORMAT21c_METHOD_TYPE347_tree=null;
		CommonTree REGISTER348_tree=null;
		CommonTree COMMA349_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_METHOD_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_METHOD_TYPE");
		RewriteRuleSubtreeStream stream_method_prototype=new RewriteRuleSubtreeStream(adaptor,"rule method_prototype");

		try {
			// smaliParser.g:952:5: ( INSTRUCTION_FORMAT21c_METHOD_TYPE REGISTER COMMA method_prototype -> ^( I_STATEMENT_FORMAT21c_METHOD_TYPE[$start, \"I_STATEMENT_FORMAT21c_METHOD_TYPE\"] INSTRUCTION_FORMAT21c_METHOD_TYPE REGISTER method_prototype ) )
			// smaliParser.g:953:5: INSTRUCTION_FORMAT21c_METHOD_TYPE REGISTER COMMA method_prototype
			{
			INSTRUCTION_FORMAT21c_METHOD_TYPE347=(Token)match(input,INSTRUCTION_FORMAT21c_METHOD_TYPE,FOLLOW_INSTRUCTION_FORMAT21c_METHOD_TYPE_in_insn_format21c_method_type4688);  
			stream_INSTRUCTION_FORMAT21c_METHOD_TYPE.add(INSTRUCTION_FORMAT21c_METHOD_TYPE347);

			REGISTER348=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_method_type4690);  
			stream_REGISTER.add(REGISTER348);

			COMMA349=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_method_type4692);  
			stream_COMMA.add(COMMA349);

			pushFollow(FOLLOW_method_prototype_in_insn_format21c_method_type4694);
			method_prototype350=method_prototype();
			state._fsp--;

			stream_method_prototype.add(method_prototype350.getTree());
			// AST REWRITE
			// elements: INSTRUCTION_FORMAT21c_METHOD_TYPE, REGISTER, method_prototype
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 954:5: -> ^( I_STATEMENT_FORMAT21c_METHOD_TYPE[$start, \"I_STATEMENT_FORMAT21c_METHOD_TYPE\"] INSTRUCTION_FORMAT21c_METHOD_TYPE REGISTER method_prototype )
			{
				// smaliParser.g:954:8: ^( I_STATEMENT_FORMAT21c_METHOD_TYPE[$start, \"I_STATEMENT_FORMAT21c_METHOD_TYPE\"] INSTRUCTION_FORMAT21c_METHOD_TYPE REGISTER method_prototype )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21c_METHOD_TYPE, (retval.start), "I_STATEMENT_FORMAT21c_METHOD_TYPE"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21c_METHOD_TYPE.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_method_prototype.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21c_method_type"


	public static class insn_format21c_string_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21c_string"
	// smaliParser.g:957:1: insn_format21c_string : INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL -> ^( I_STATEMENT_FORMAT21c_STRING[$start, \"I_STATEMENT_FORMAT21c_STRING\"] INSTRUCTION_FORMAT21c_STRING REGISTER STRING_LITERAL ) ;
	public final smaliParser.insn_format21c_string_return insn_format21c_string() throws RecognitionException {
		smaliParser.insn_format21c_string_return retval = new smaliParser.insn_format21c_string_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21c_STRING351=null;
		Token REGISTER352=null;
		Token COMMA353=null;
		Token STRING_LITERAL354=null;

		CommonTree INSTRUCTION_FORMAT21c_STRING351_tree=null;
		CommonTree REGISTER352_tree=null;
		CommonTree COMMA353_tree=null;
		CommonTree STRING_LITERAL354_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_STRING=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_STRING");

		try {
			// smaliParser.g:958:3: ( INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL -> ^( I_STATEMENT_FORMAT21c_STRING[$start, \"I_STATEMENT_FORMAT21c_STRING\"] INSTRUCTION_FORMAT21c_STRING REGISTER STRING_LITERAL ) )
			// smaliParser.g:959:5: INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL
			{
			INSTRUCTION_FORMAT21c_STRING351=(Token)match(input,INSTRUCTION_FORMAT21c_STRING,FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_insn_format21c_string4738);  
			stream_INSTRUCTION_FORMAT21c_STRING.add(INSTRUCTION_FORMAT21c_STRING351);

			REGISTER352=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_string4740);  
			stream_REGISTER.add(REGISTER352);

			COMMA353=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_string4742);  
			stream_COMMA.add(COMMA353);

			STRING_LITERAL354=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_insn_format21c_string4744);  
			stream_STRING_LITERAL.add(STRING_LITERAL354);

			// AST REWRITE
			// elements: INSTRUCTION_FORMAT21c_STRING, STRING_LITERAL, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 960:5: -> ^( I_STATEMENT_FORMAT21c_STRING[$start, \"I_STATEMENT_FORMAT21c_STRING\"] INSTRUCTION_FORMAT21c_STRING REGISTER STRING_LITERAL )
			{
				// smaliParser.g:960:8: ^( I_STATEMENT_FORMAT21c_STRING[$start, \"I_STATEMENT_FORMAT21c_STRING\"] INSTRUCTION_FORMAT21c_STRING REGISTER STRING_LITERAL )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21c_STRING, (retval.start), "I_STATEMENT_FORMAT21c_STRING"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21c_STRING.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21c_string"


	public static class insn_format21c_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21c_type"
	// smaliParser.g:962:1: insn_format21c_type : INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT21c_TYPE[$start, \"I_STATEMENT_FORMAT21c\"] INSTRUCTION_FORMAT21c_TYPE REGISTER nonvoid_type_descriptor ) ;
	public final smaliParser.insn_format21c_type_return insn_format21c_type() throws RecognitionException {
		smaliParser.insn_format21c_type_return retval = new smaliParser.insn_format21c_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21c_TYPE355=null;
		Token REGISTER356=null;
		Token COMMA357=null;
		ParserRuleReturnScope nonvoid_type_descriptor358 =null;

		CommonTree INSTRUCTION_FORMAT21c_TYPE355_tree=null;
		CommonTree REGISTER356_tree=null;
		CommonTree COMMA357_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_TYPE");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");

		try {
			// smaliParser.g:963:3: ( INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT21c_TYPE[$start, \"I_STATEMENT_FORMAT21c\"] INSTRUCTION_FORMAT21c_TYPE REGISTER nonvoid_type_descriptor ) )
			// smaliParser.g:964:5: INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA nonvoid_type_descriptor
			{
			INSTRUCTION_FORMAT21c_TYPE355=(Token)match(input,INSTRUCTION_FORMAT21c_TYPE,FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_insn_format21c_type4776);  
			stream_INSTRUCTION_FORMAT21c_TYPE.add(INSTRUCTION_FORMAT21c_TYPE355);

			REGISTER356=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_type4778);  
			stream_REGISTER.add(REGISTER356);

			COMMA357=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_type4780);  
			stream_COMMA.add(COMMA357);

			pushFollow(FOLLOW_nonvoid_type_descriptor_in_insn_format21c_type4782);
			nonvoid_type_descriptor358=nonvoid_type_descriptor();
			state._fsp--;

			stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor358.getTree());
			// AST REWRITE
			// elements: INSTRUCTION_FORMAT21c_TYPE, REGISTER, nonvoid_type_descriptor
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 965:5: -> ^( I_STATEMENT_FORMAT21c_TYPE[$start, \"I_STATEMENT_FORMAT21c\"] INSTRUCTION_FORMAT21c_TYPE REGISTER nonvoid_type_descriptor )
			{
				// smaliParser.g:965:8: ^( I_STATEMENT_FORMAT21c_TYPE[$start, \"I_STATEMENT_FORMAT21c\"] INSTRUCTION_FORMAT21c_TYPE REGISTER nonvoid_type_descriptor )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21c_TYPE, (retval.start), "I_STATEMENT_FORMAT21c"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21c_TYPE.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21c_type"


	public static class insn_format21ih_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21ih"
	// smaliParser.g:967:1: insn_format21ih : INSTRUCTION_FORMAT21ih REGISTER COMMA fixed_32bit_literal -> ^( I_STATEMENT_FORMAT21ih[$start, \"I_STATEMENT_FORMAT21ih\"] INSTRUCTION_FORMAT21ih REGISTER fixed_32bit_literal ) ;
	public final smaliParser.insn_format21ih_return insn_format21ih() throws RecognitionException {
		smaliParser.insn_format21ih_return retval = new smaliParser.insn_format21ih_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21ih359=null;
		Token REGISTER360=null;
		Token COMMA361=null;
		ParserRuleReturnScope fixed_32bit_literal362 =null;

		CommonTree INSTRUCTION_FORMAT21ih359_tree=null;
		CommonTree REGISTER360_tree=null;
		CommonTree COMMA361_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21ih=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21ih");
		RewriteRuleSubtreeStream stream_fixed_32bit_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_32bit_literal");

		try {
			// smaliParser.g:968:3: ( INSTRUCTION_FORMAT21ih REGISTER COMMA fixed_32bit_literal -> ^( I_STATEMENT_FORMAT21ih[$start, \"I_STATEMENT_FORMAT21ih\"] INSTRUCTION_FORMAT21ih REGISTER fixed_32bit_literal ) )
			// smaliParser.g:969:5: INSTRUCTION_FORMAT21ih REGISTER COMMA fixed_32bit_literal
			{
			INSTRUCTION_FORMAT21ih359=(Token)match(input,INSTRUCTION_FORMAT21ih,FOLLOW_INSTRUCTION_FORMAT21ih_in_insn_format21ih4814);  
			stream_INSTRUCTION_FORMAT21ih.add(INSTRUCTION_FORMAT21ih359);

			REGISTER360=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21ih4816);  
			stream_REGISTER.add(REGISTER360);

			COMMA361=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21ih4818);  
			stream_COMMA.add(COMMA361);

			pushFollow(FOLLOW_fixed_32bit_literal_in_insn_format21ih4820);
			fixed_32bit_literal362=fixed_32bit_literal();
			state._fsp--;

			stream_fixed_32bit_literal.add(fixed_32bit_literal362.getTree());
			// AST REWRITE
			// elements: fixed_32bit_literal, INSTRUCTION_FORMAT21ih, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 970:5: -> ^( I_STATEMENT_FORMAT21ih[$start, \"I_STATEMENT_FORMAT21ih\"] INSTRUCTION_FORMAT21ih REGISTER fixed_32bit_literal )
			{
				// smaliParser.g:970:8: ^( I_STATEMENT_FORMAT21ih[$start, \"I_STATEMENT_FORMAT21ih\"] INSTRUCTION_FORMAT21ih REGISTER fixed_32bit_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21ih, (retval.start), "I_STATEMENT_FORMAT21ih"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21ih.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_fixed_32bit_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21ih"


	public static class insn_format21lh_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21lh"
	// smaliParser.g:972:1: insn_format21lh : INSTRUCTION_FORMAT21lh REGISTER COMMA fixed_32bit_literal -> ^( I_STATEMENT_FORMAT21lh[$start, \"I_STATEMENT_FORMAT21lh\"] INSTRUCTION_FORMAT21lh REGISTER fixed_32bit_literal ) ;
	public final smaliParser.insn_format21lh_return insn_format21lh() throws RecognitionException {
		smaliParser.insn_format21lh_return retval = new smaliParser.insn_format21lh_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21lh363=null;
		Token REGISTER364=null;
		Token COMMA365=null;
		ParserRuleReturnScope fixed_32bit_literal366 =null;

		CommonTree INSTRUCTION_FORMAT21lh363_tree=null;
		CommonTree REGISTER364_tree=null;
		CommonTree COMMA365_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21lh=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21lh");
		RewriteRuleSubtreeStream stream_fixed_32bit_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_32bit_literal");

		try {
			// smaliParser.g:973:3: ( INSTRUCTION_FORMAT21lh REGISTER COMMA fixed_32bit_literal -> ^( I_STATEMENT_FORMAT21lh[$start, \"I_STATEMENT_FORMAT21lh\"] INSTRUCTION_FORMAT21lh REGISTER fixed_32bit_literal ) )
			// smaliParser.g:974:5: INSTRUCTION_FORMAT21lh REGISTER COMMA fixed_32bit_literal
			{
			INSTRUCTION_FORMAT21lh363=(Token)match(input,INSTRUCTION_FORMAT21lh,FOLLOW_INSTRUCTION_FORMAT21lh_in_insn_format21lh4852);  
			stream_INSTRUCTION_FORMAT21lh.add(INSTRUCTION_FORMAT21lh363);

			REGISTER364=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21lh4854);  
			stream_REGISTER.add(REGISTER364);

			COMMA365=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21lh4856);  
			stream_COMMA.add(COMMA365);

			pushFollow(FOLLOW_fixed_32bit_literal_in_insn_format21lh4858);
			fixed_32bit_literal366=fixed_32bit_literal();
			state._fsp--;

			stream_fixed_32bit_literal.add(fixed_32bit_literal366.getTree());
			// AST REWRITE
			// elements: INSTRUCTION_FORMAT21lh, REGISTER, fixed_32bit_literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 975:5: -> ^( I_STATEMENT_FORMAT21lh[$start, \"I_STATEMENT_FORMAT21lh\"] INSTRUCTION_FORMAT21lh REGISTER fixed_32bit_literal )
			{
				// smaliParser.g:975:8: ^( I_STATEMENT_FORMAT21lh[$start, \"I_STATEMENT_FORMAT21lh\"] INSTRUCTION_FORMAT21lh REGISTER fixed_32bit_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21lh, (retval.start), "I_STATEMENT_FORMAT21lh"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21lh.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_fixed_32bit_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21lh"


	public static class insn_format21s_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21s"
	// smaliParser.g:977:1: insn_format21s : INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT21s[$start, \"I_STATEMENT_FORMAT21s\"] INSTRUCTION_FORMAT21s REGISTER integral_literal ) ;
	public final smaliParser.insn_format21s_return insn_format21s() throws RecognitionException {
		smaliParser.insn_format21s_return retval = new smaliParser.insn_format21s_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21s367=null;
		Token REGISTER368=null;
		Token COMMA369=null;
		ParserRuleReturnScope integral_literal370 =null;

		CommonTree INSTRUCTION_FORMAT21s367_tree=null;
		CommonTree REGISTER368_tree=null;
		CommonTree COMMA369_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21s=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21s");
		RewriteRuleSubtreeStream stream_integral_literal=new RewriteRuleSubtreeStream(adaptor,"rule integral_literal");

		try {
			// smaliParser.g:978:3: ( INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT21s[$start, \"I_STATEMENT_FORMAT21s\"] INSTRUCTION_FORMAT21s REGISTER integral_literal ) )
			// smaliParser.g:979:5: INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal
			{
			INSTRUCTION_FORMAT21s367=(Token)match(input,INSTRUCTION_FORMAT21s,FOLLOW_INSTRUCTION_FORMAT21s_in_insn_format21s4890);  
			stream_INSTRUCTION_FORMAT21s.add(INSTRUCTION_FORMAT21s367);

			REGISTER368=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21s4892);  
			stream_REGISTER.add(REGISTER368);

			COMMA369=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21s4894);  
			stream_COMMA.add(COMMA369);

			pushFollow(FOLLOW_integral_literal_in_insn_format21s4896);
			integral_literal370=integral_literal();
			state._fsp--;

			stream_integral_literal.add(integral_literal370.getTree());
			// AST REWRITE
			// elements: REGISTER, INSTRUCTION_FORMAT21s, integral_literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 980:5: -> ^( I_STATEMENT_FORMAT21s[$start, \"I_STATEMENT_FORMAT21s\"] INSTRUCTION_FORMAT21s REGISTER integral_literal )
			{
				// smaliParser.g:980:8: ^( I_STATEMENT_FORMAT21s[$start, \"I_STATEMENT_FORMAT21s\"] INSTRUCTION_FORMAT21s REGISTER integral_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21s, (retval.start), "I_STATEMENT_FORMAT21s"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21s.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_integral_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21s"


	public static class insn_format21t_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21t"
	// smaliParser.g:982:1: insn_format21t : INSTRUCTION_FORMAT21t REGISTER COMMA label_ref -> ^( I_STATEMENT_FORMAT21t[$start, \"I_STATEMENT_FORMAT21t\"] INSTRUCTION_FORMAT21t REGISTER label_ref ) ;
	public final smaliParser.insn_format21t_return insn_format21t() throws RecognitionException {
		smaliParser.insn_format21t_return retval = new smaliParser.insn_format21t_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21t371=null;
		Token REGISTER372=null;
		Token COMMA373=null;
		ParserRuleReturnScope label_ref374 =null;

		CommonTree INSTRUCTION_FORMAT21t371_tree=null;
		CommonTree REGISTER372_tree=null;
		CommonTree COMMA373_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21t");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// smaliParser.g:983:3: ( INSTRUCTION_FORMAT21t REGISTER COMMA label_ref -> ^( I_STATEMENT_FORMAT21t[$start, \"I_STATEMENT_FORMAT21t\"] INSTRUCTION_FORMAT21t REGISTER label_ref ) )
			// smaliParser.g:984:5: INSTRUCTION_FORMAT21t REGISTER COMMA label_ref
			{
			INSTRUCTION_FORMAT21t371=(Token)match(input,INSTRUCTION_FORMAT21t,FOLLOW_INSTRUCTION_FORMAT21t_in_insn_format21t4928);  
			stream_INSTRUCTION_FORMAT21t.add(INSTRUCTION_FORMAT21t371);

			REGISTER372=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21t4930);  
			stream_REGISTER.add(REGISTER372);

			COMMA373=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21t4932);  
			stream_COMMA.add(COMMA373);

			pushFollow(FOLLOW_label_ref_in_insn_format21t4934);
			label_ref374=label_ref();
			state._fsp--;

			stream_label_ref.add(label_ref374.getTree());
			// AST REWRITE
			// elements: REGISTER, label_ref, INSTRUCTION_FORMAT21t
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 985:5: -> ^( I_STATEMENT_FORMAT21t[$start, \"I_STATEMENT_FORMAT21t\"] INSTRUCTION_FORMAT21t REGISTER label_ref )
			{
				// smaliParser.g:985:8: ^( I_STATEMENT_FORMAT21t[$start, \"I_STATEMENT_FORMAT21t\"] INSTRUCTION_FORMAT21t REGISTER label_ref )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21t, (retval.start), "I_STATEMENT_FORMAT21t"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21t.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_label_ref.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21t"


	public static class insn_format22b_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22b"
	// smaliParser.g:987:1: insn_format22b : INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT22b[$start, \"I_STATEMENT_FORMAT22b\"] INSTRUCTION_FORMAT22b REGISTER REGISTER integral_literal ) ;
	public final smaliParser.insn_format22b_return insn_format22b() throws RecognitionException {
		smaliParser.insn_format22b_return retval = new smaliParser.insn_format22b_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22b375=null;
		Token REGISTER376=null;
		Token COMMA377=null;
		Token REGISTER378=null;
		Token COMMA379=null;
		ParserRuleReturnScope integral_literal380 =null;

		CommonTree INSTRUCTION_FORMAT22b375_tree=null;
		CommonTree REGISTER376_tree=null;
		CommonTree COMMA377_tree=null;
		CommonTree REGISTER378_tree=null;
		CommonTree COMMA379_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22b=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22b");
		RewriteRuleSubtreeStream stream_integral_literal=new RewriteRuleSubtreeStream(adaptor,"rule integral_literal");

		try {
			// smaliParser.g:988:3: ( INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT22b[$start, \"I_STATEMENT_FORMAT22b\"] INSTRUCTION_FORMAT22b REGISTER REGISTER integral_literal ) )
			// smaliParser.g:989:5: INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal
			{
			INSTRUCTION_FORMAT22b375=(Token)match(input,INSTRUCTION_FORMAT22b,FOLLOW_INSTRUCTION_FORMAT22b_in_insn_format22b4966);  
			stream_INSTRUCTION_FORMAT22b.add(INSTRUCTION_FORMAT22b375);

			REGISTER376=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22b4968);  
			stream_REGISTER.add(REGISTER376);

			COMMA377=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22b4970);  
			stream_COMMA.add(COMMA377);

			REGISTER378=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22b4972);  
			stream_REGISTER.add(REGISTER378);

			COMMA379=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22b4974);  
			stream_COMMA.add(COMMA379);

			pushFollow(FOLLOW_integral_literal_in_insn_format22b4976);
			integral_literal380=integral_literal();
			state._fsp--;

			stream_integral_literal.add(integral_literal380.getTree());
			// AST REWRITE
			// elements: INSTRUCTION_FORMAT22b, REGISTER, integral_literal, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 990:5: -> ^( I_STATEMENT_FORMAT22b[$start, \"I_STATEMENT_FORMAT22b\"] INSTRUCTION_FORMAT22b REGISTER REGISTER integral_literal )
			{
				// smaliParser.g:990:8: ^( I_STATEMENT_FORMAT22b[$start, \"I_STATEMENT_FORMAT22b\"] INSTRUCTION_FORMAT22b REGISTER REGISTER integral_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22b, (retval.start), "I_STATEMENT_FORMAT22b"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22b.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_integral_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22b"


	public static class insn_format22c_field_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22c_field"
	// smaliParser.g:992:1: insn_format22c_field : INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA field_reference -> ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD REGISTER REGISTER field_reference ) ;
	public final smaliParser.insn_format22c_field_return insn_format22c_field() throws RecognitionException {
		smaliParser.insn_format22c_field_return retval = new smaliParser.insn_format22c_field_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22c_FIELD381=null;
		Token REGISTER382=null;
		Token COMMA383=null;
		Token REGISTER384=null;
		Token COMMA385=null;
		ParserRuleReturnScope field_reference386 =null;

		CommonTree INSTRUCTION_FORMAT22c_FIELD381_tree=null;
		CommonTree REGISTER382_tree=null;
		CommonTree COMMA383_tree=null;
		CommonTree REGISTER384_tree=null;
		CommonTree COMMA385_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_FIELD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_FIELD");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleSubtreeStream stream_field_reference=new RewriteRuleSubtreeStream(adaptor,"rule field_reference");

		try {
			// smaliParser.g:993:3: ( INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA field_reference -> ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD REGISTER REGISTER field_reference ) )
			// smaliParser.g:994:5: INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA field_reference
			{
			INSTRUCTION_FORMAT22c_FIELD381=(Token)match(input,INSTRUCTION_FORMAT22c_FIELD,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_insn_format22c_field5010);  
			stream_INSTRUCTION_FORMAT22c_FIELD.add(INSTRUCTION_FORMAT22c_FIELD381);

			REGISTER382=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field5012);  
			stream_REGISTER.add(REGISTER382);

			COMMA383=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field5014);  
			stream_COMMA.add(COMMA383);

			REGISTER384=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field5016);  
			stream_REGISTER.add(REGISTER384);

			COMMA385=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field5018);  
			stream_COMMA.add(COMMA385);

			pushFollow(FOLLOW_field_reference_in_insn_format22c_field5020);
			field_reference386=field_reference();
			state._fsp--;

			stream_field_reference.add(field_reference386.getTree());
			// AST REWRITE
			// elements: REGISTER, field_reference, REGISTER, INSTRUCTION_FORMAT22c_FIELD
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 995:5: -> ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD REGISTER REGISTER field_reference )
			{
				// smaliParser.g:995:8: ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD REGISTER REGISTER field_reference )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22c_FIELD, (retval.start), "I_STATEMENT_FORMAT22c_FIELD"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22c_FIELD.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_field_reference.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22c_field"


	public static class insn_format22c_field_odex_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22c_field_odex"
	// smaliParser.g:997:1: insn_format22c_field_odex : INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA field_reference -> ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER REGISTER field_reference ) ;
	public final smaliParser.insn_format22c_field_odex_return insn_format22c_field_odex() throws RecognitionException {
		smaliParser.insn_format22c_field_odex_return retval = new smaliParser.insn_format22c_field_odex_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22c_FIELD_ODEX387=null;
		Token REGISTER388=null;
		Token COMMA389=null;
		Token REGISTER390=null;
		Token COMMA391=null;
		ParserRuleReturnScope field_reference392 =null;

		CommonTree INSTRUCTION_FORMAT22c_FIELD_ODEX387_tree=null;
		CommonTree REGISTER388_tree=null;
		CommonTree COMMA389_tree=null;
		CommonTree REGISTER390_tree=null;
		CommonTree COMMA391_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_FIELD_ODEX=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_FIELD_ODEX");
		RewriteRuleSubtreeStream stream_field_reference=new RewriteRuleSubtreeStream(adaptor,"rule field_reference");

		try {
			// smaliParser.g:998:3: ( INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA field_reference -> ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER REGISTER field_reference ) )
			// smaliParser.g:999:5: INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA field_reference
			{
			INSTRUCTION_FORMAT22c_FIELD_ODEX387=(Token)match(input,INSTRUCTION_FORMAT22c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_insn_format22c_field_odex5054);  
			stream_INSTRUCTION_FORMAT22c_FIELD_ODEX.add(INSTRUCTION_FORMAT22c_FIELD_ODEX387);

			REGISTER388=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field_odex5056);  
			stream_REGISTER.add(REGISTER388);

			COMMA389=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field_odex5058);  
			stream_COMMA.add(COMMA389);

			REGISTER390=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field_odex5060);  
			stream_REGISTER.add(REGISTER390);

			COMMA391=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field_odex5062);  
			stream_COMMA.add(COMMA391);

			pushFollow(FOLLOW_field_reference_in_insn_format22c_field_odex5064);
			field_reference392=field_reference();
			state._fsp--;

			stream_field_reference.add(field_reference392.getTree());

			      if (!allowOdex || opcodes.getOpcodeByName((INSTRUCTION_FORMAT22c_FIELD_ODEX387!=null?INSTRUCTION_FORMAT22c_FIELD_ODEX387.getText():null)) == null || apiLevel >= 14) {
			        throwOdexedInstructionException(input, (INSTRUCTION_FORMAT22c_FIELD_ODEX387!=null?INSTRUCTION_FORMAT22c_FIELD_ODEX387.getText():null));
			      }
			    
			// AST REWRITE
			// elements: REGISTER, REGISTER, field_reference, INSTRUCTION_FORMAT22c_FIELD_ODEX
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1005:5: -> ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER REGISTER field_reference )
			{
				// smaliParser.g:1005:8: ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER REGISTER field_reference )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22c_FIELD, (retval.start), "I_STATEMENT_FORMAT22c_FIELD"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22c_FIELD_ODEX.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_field_reference.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22c_field_odex"


	public static class insn_format22c_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22c_type"
	// smaliParser.g:1007:1: insn_format22c_type : INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT22c_TYPE[$start, \"I_STATEMENT_FORMAT22c_TYPE\"] INSTRUCTION_FORMAT22c_TYPE REGISTER REGISTER nonvoid_type_descriptor ) ;
	public final smaliParser.insn_format22c_type_return insn_format22c_type() throws RecognitionException {
		smaliParser.insn_format22c_type_return retval = new smaliParser.insn_format22c_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22c_TYPE393=null;
		Token REGISTER394=null;
		Token COMMA395=null;
		Token REGISTER396=null;
		Token COMMA397=null;
		ParserRuleReturnScope nonvoid_type_descriptor398 =null;

		CommonTree INSTRUCTION_FORMAT22c_TYPE393_tree=null;
		CommonTree REGISTER394_tree=null;
		CommonTree COMMA395_tree=null;
		CommonTree REGISTER396_tree=null;
		CommonTree COMMA397_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_TYPE");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");

		try {
			// smaliParser.g:1008:3: ( INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT22c_TYPE[$start, \"I_STATEMENT_FORMAT22c_TYPE\"] INSTRUCTION_FORMAT22c_TYPE REGISTER REGISTER nonvoid_type_descriptor ) )
			// smaliParser.g:1009:5: INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor
			{
			INSTRUCTION_FORMAT22c_TYPE393=(Token)match(input,INSTRUCTION_FORMAT22c_TYPE,FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_insn_format22c_type5104);  
			stream_INSTRUCTION_FORMAT22c_TYPE.add(INSTRUCTION_FORMAT22c_TYPE393);

			REGISTER394=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_type5106);  
			stream_REGISTER.add(REGISTER394);

			COMMA395=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_type5108);  
			stream_COMMA.add(COMMA395);

			REGISTER396=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_type5110);  
			stream_REGISTER.add(REGISTER396);

			COMMA397=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_type5112);  
			stream_COMMA.add(COMMA397);

			pushFollow(FOLLOW_nonvoid_type_descriptor_in_insn_format22c_type5114);
			nonvoid_type_descriptor398=nonvoid_type_descriptor();
			state._fsp--;

			stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor398.getTree());
			// AST REWRITE
			// elements: INSTRUCTION_FORMAT22c_TYPE, REGISTER, nonvoid_type_descriptor, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1010:5: -> ^( I_STATEMENT_FORMAT22c_TYPE[$start, \"I_STATEMENT_FORMAT22c_TYPE\"] INSTRUCTION_FORMAT22c_TYPE REGISTER REGISTER nonvoid_type_descriptor )
			{
				// smaliParser.g:1010:8: ^( I_STATEMENT_FORMAT22c_TYPE[$start, \"I_STATEMENT_FORMAT22c_TYPE\"] INSTRUCTION_FORMAT22c_TYPE REGISTER REGISTER nonvoid_type_descriptor )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22c_TYPE, (retval.start), "I_STATEMENT_FORMAT22c_TYPE"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22c_TYPE.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22c_type"


	public static class insn_format22cs_field_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22cs_field"
	// smaliParser.g:1012:1: insn_format22cs_field : INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET ;
	public final smaliParser.insn_format22cs_field_return insn_format22cs_field() throws RecognitionException {
		smaliParser.insn_format22cs_field_return retval = new smaliParser.insn_format22cs_field_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22cs_FIELD399=null;
		Token REGISTER400=null;
		Token COMMA401=null;
		Token REGISTER402=null;
		Token COMMA403=null;
		Token FIELD_OFFSET404=null;

		CommonTree INSTRUCTION_FORMAT22cs_FIELD399_tree=null;
		CommonTree REGISTER400_tree=null;
		CommonTree COMMA401_tree=null;
		CommonTree REGISTER402_tree=null;
		CommonTree COMMA403_tree=null;
		CommonTree FIELD_OFFSET404_tree=null;

		try {
			// smaliParser.g:1013:3: ( INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET )
			// smaliParser.g:1014:5: INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT22cs_FIELD399=(Token)match(input,INSTRUCTION_FORMAT22cs_FIELD,FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_insn_format22cs_field5148); 
			INSTRUCTION_FORMAT22cs_FIELD399_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT22cs_FIELD399);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT22cs_FIELD399_tree);

			REGISTER400=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22cs_field5150); 
			REGISTER400_tree = (CommonTree)adaptor.create(REGISTER400);
			adaptor.addChild(root_0, REGISTER400_tree);

			COMMA401=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22cs_field5152); 
			COMMA401_tree = (CommonTree)adaptor.create(COMMA401);
			adaptor.addChild(root_0, COMMA401_tree);

			REGISTER402=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22cs_field5154); 
			REGISTER402_tree = (CommonTree)adaptor.create(REGISTER402);
			adaptor.addChild(root_0, REGISTER402_tree);

			COMMA403=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22cs_field5156); 
			COMMA403_tree = (CommonTree)adaptor.create(COMMA403);
			adaptor.addChild(root_0, COMMA403_tree);

			FIELD_OFFSET404=(Token)match(input,FIELD_OFFSET,FOLLOW_FIELD_OFFSET_in_insn_format22cs_field5158); 
			FIELD_OFFSET404_tree = (CommonTree)adaptor.create(FIELD_OFFSET404);
			adaptor.addChild(root_0, FIELD_OFFSET404_tree);


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT22cs_FIELD399!=null?INSTRUCTION_FORMAT22cs_FIELD399.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22cs_field"


	public static class insn_format22s_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22s"
	// smaliParser.g:1019:1: insn_format22s : instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT22s[$start, \"I_STATEMENT_FORMAT22s\"] instruction_format22s REGISTER REGISTER integral_literal ) ;
	public final smaliParser.insn_format22s_return insn_format22s() throws RecognitionException {
		smaliParser.insn_format22s_return retval = new smaliParser.insn_format22s_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token REGISTER406=null;
		Token COMMA407=null;
		Token REGISTER408=null;
		Token COMMA409=null;
		ParserRuleReturnScope instruction_format22s405 =null;
		ParserRuleReturnScope integral_literal410 =null;

		CommonTree REGISTER406_tree=null;
		CommonTree COMMA407_tree=null;
		CommonTree REGISTER408_tree=null;
		CommonTree COMMA409_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleSubtreeStream stream_instruction_format22s=new RewriteRuleSubtreeStream(adaptor,"rule instruction_format22s");
		RewriteRuleSubtreeStream stream_integral_literal=new RewriteRuleSubtreeStream(adaptor,"rule integral_literal");

		try {
			// smaliParser.g:1020:3: ( instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT22s[$start, \"I_STATEMENT_FORMAT22s\"] instruction_format22s REGISTER REGISTER integral_literal ) )
			// smaliParser.g:1021:5: instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal
			{
			pushFollow(FOLLOW_instruction_format22s_in_insn_format22s5179);
			instruction_format22s405=instruction_format22s();
			state._fsp--;

			stream_instruction_format22s.add(instruction_format22s405.getTree());
			REGISTER406=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22s5181);  
			stream_REGISTER.add(REGISTER406);

			COMMA407=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22s5183);  
			stream_COMMA.add(COMMA407);

			REGISTER408=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22s5185);  
			stream_REGISTER.add(REGISTER408);

			COMMA409=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22s5187);  
			stream_COMMA.add(COMMA409);

			pushFollow(FOLLOW_integral_literal_in_insn_format22s5189);
			integral_literal410=integral_literal();
			state._fsp--;

			stream_integral_literal.add(integral_literal410.getTree());
			// AST REWRITE
			// elements: integral_literal, REGISTER, REGISTER, instruction_format22s
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1022:5: -> ^( I_STATEMENT_FORMAT22s[$start, \"I_STATEMENT_FORMAT22s\"] instruction_format22s REGISTER REGISTER integral_literal )
			{
				// smaliParser.g:1022:8: ^( I_STATEMENT_FORMAT22s[$start, \"I_STATEMENT_FORMAT22s\"] instruction_format22s REGISTER REGISTER integral_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22s, (retval.start), "I_STATEMENT_FORMAT22s"), root_1);
				adaptor.addChild(root_1, stream_instruction_format22s.nextTree());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_integral_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22s"


	public static class insn_format22t_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22t"
	// smaliParser.g:1024:1: insn_format22t : INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref -> ^( I_STATEMENT_FORMAT22t[$start, \"I_STATEMENT_FFORMAT22t\"] INSTRUCTION_FORMAT22t REGISTER REGISTER label_ref ) ;
	public final smaliParser.insn_format22t_return insn_format22t() throws RecognitionException {
		smaliParser.insn_format22t_return retval = new smaliParser.insn_format22t_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22t411=null;
		Token REGISTER412=null;
		Token COMMA413=null;
		Token REGISTER414=null;
		Token COMMA415=null;
		ParserRuleReturnScope label_ref416 =null;

		CommonTree INSTRUCTION_FORMAT22t411_tree=null;
		CommonTree REGISTER412_tree=null;
		CommonTree COMMA413_tree=null;
		CommonTree REGISTER414_tree=null;
		CommonTree COMMA415_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22t");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// smaliParser.g:1025:3: ( INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref -> ^( I_STATEMENT_FORMAT22t[$start, \"I_STATEMENT_FFORMAT22t\"] INSTRUCTION_FORMAT22t REGISTER REGISTER label_ref ) )
			// smaliParser.g:1026:5: INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref
			{
			INSTRUCTION_FORMAT22t411=(Token)match(input,INSTRUCTION_FORMAT22t,FOLLOW_INSTRUCTION_FORMAT22t_in_insn_format22t5223);  
			stream_INSTRUCTION_FORMAT22t.add(INSTRUCTION_FORMAT22t411);

			REGISTER412=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22t5225);  
			stream_REGISTER.add(REGISTER412);

			COMMA413=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22t5227);  
			stream_COMMA.add(COMMA413);

			REGISTER414=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22t5229);  
			stream_REGISTER.add(REGISTER414);

			COMMA415=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22t5231);  
			stream_COMMA.add(COMMA415);

			pushFollow(FOLLOW_label_ref_in_insn_format22t5233);
			label_ref416=label_ref();
			state._fsp--;

			stream_label_ref.add(label_ref416.getTree());
			// AST REWRITE
			// elements: REGISTER, INSTRUCTION_FORMAT22t, REGISTER, label_ref
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1027:5: -> ^( I_STATEMENT_FORMAT22t[$start, \"I_STATEMENT_FFORMAT22t\"] INSTRUCTION_FORMAT22t REGISTER REGISTER label_ref )
			{
				// smaliParser.g:1027:8: ^( I_STATEMENT_FORMAT22t[$start, \"I_STATEMENT_FFORMAT22t\"] INSTRUCTION_FORMAT22t REGISTER REGISTER label_ref )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22t, (retval.start), "I_STATEMENT_FFORMAT22t"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22t.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_label_ref.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22t"


	public static class insn_format22x_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22x"
	// smaliParser.g:1029:1: insn_format22x : INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT22x[$start, \"I_STATEMENT_FORMAT22x\"] INSTRUCTION_FORMAT22x REGISTER REGISTER ) ;
	public final smaliParser.insn_format22x_return insn_format22x() throws RecognitionException {
		smaliParser.insn_format22x_return retval = new smaliParser.insn_format22x_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22x417=null;
		Token REGISTER418=null;
		Token COMMA419=null;
		Token REGISTER420=null;

		CommonTree INSTRUCTION_FORMAT22x417_tree=null;
		CommonTree REGISTER418_tree=null;
		CommonTree COMMA419_tree=null;
		CommonTree REGISTER420_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22x");

		try {
			// smaliParser.g:1030:3: ( INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT22x[$start, \"I_STATEMENT_FORMAT22x\"] INSTRUCTION_FORMAT22x REGISTER REGISTER ) )
			// smaliParser.g:1031:5: INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER
			{
			INSTRUCTION_FORMAT22x417=(Token)match(input,INSTRUCTION_FORMAT22x,FOLLOW_INSTRUCTION_FORMAT22x_in_insn_format22x5267);  
			stream_INSTRUCTION_FORMAT22x.add(INSTRUCTION_FORMAT22x417);

			REGISTER418=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22x5269);  
			stream_REGISTER.add(REGISTER418);

			COMMA419=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22x5271);  
			stream_COMMA.add(COMMA419);

			REGISTER420=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22x5273);  
			stream_REGISTER.add(REGISTER420);

			// AST REWRITE
			// elements: REGISTER, REGISTER, INSTRUCTION_FORMAT22x
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1032:5: -> ^( I_STATEMENT_FORMAT22x[$start, \"I_STATEMENT_FORMAT22x\"] INSTRUCTION_FORMAT22x REGISTER REGISTER )
			{
				// smaliParser.g:1032:8: ^( I_STATEMENT_FORMAT22x[$start, \"I_STATEMENT_FORMAT22x\"] INSTRUCTION_FORMAT22x REGISTER REGISTER )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22x, (retval.start), "I_STATEMENT_FORMAT22x"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22x.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22x"


	public static class insn_format23x_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format23x"
	// smaliParser.g:1034:1: insn_format23x : INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT23x[$start, \"I_STATEMENT_FORMAT23x\"] INSTRUCTION_FORMAT23x REGISTER REGISTER REGISTER ) ;
	public final smaliParser.insn_format23x_return insn_format23x() throws RecognitionException {
		smaliParser.insn_format23x_return retval = new smaliParser.insn_format23x_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT23x421=null;
		Token REGISTER422=null;
		Token COMMA423=null;
		Token REGISTER424=null;
		Token COMMA425=null;
		Token REGISTER426=null;

		CommonTree INSTRUCTION_FORMAT23x421_tree=null;
		CommonTree REGISTER422_tree=null;
		CommonTree COMMA423_tree=null;
		CommonTree REGISTER424_tree=null;
		CommonTree COMMA425_tree=null;
		CommonTree REGISTER426_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT23x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT23x");

		try {
			// smaliParser.g:1035:3: ( INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT23x[$start, \"I_STATEMENT_FORMAT23x\"] INSTRUCTION_FORMAT23x REGISTER REGISTER REGISTER ) )
			// smaliParser.g:1036:5: INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER
			{
			INSTRUCTION_FORMAT23x421=(Token)match(input,INSTRUCTION_FORMAT23x,FOLLOW_INSTRUCTION_FORMAT23x_in_insn_format23x5305);  
			stream_INSTRUCTION_FORMAT23x.add(INSTRUCTION_FORMAT23x421);

			REGISTER422=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format23x5307);  
			stream_REGISTER.add(REGISTER422);

			COMMA423=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format23x5309);  
			stream_COMMA.add(COMMA423);

			REGISTER424=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format23x5311);  
			stream_REGISTER.add(REGISTER424);

			COMMA425=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format23x5313);  
			stream_COMMA.add(COMMA425);

			REGISTER426=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format23x5315);  
			stream_REGISTER.add(REGISTER426);

			// AST REWRITE
			// elements: REGISTER, INSTRUCTION_FORMAT23x, REGISTER, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1037:5: -> ^( I_STATEMENT_FORMAT23x[$start, \"I_STATEMENT_FORMAT23x\"] INSTRUCTION_FORMAT23x REGISTER REGISTER REGISTER )
			{
				// smaliParser.g:1037:8: ^( I_STATEMENT_FORMAT23x[$start, \"I_STATEMENT_FORMAT23x\"] INSTRUCTION_FORMAT23x REGISTER REGISTER REGISTER )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT23x, (retval.start), "I_STATEMENT_FORMAT23x"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT23x.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format23x"


	public static class insn_format30t_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format30t"
	// smaliParser.g:1039:1: insn_format30t : INSTRUCTION_FORMAT30t label_ref -> ^( I_STATEMENT_FORMAT30t[$start, \"I_STATEMENT_FORMAT30t\"] INSTRUCTION_FORMAT30t label_ref ) ;
	public final smaliParser.insn_format30t_return insn_format30t() throws RecognitionException {
		smaliParser.insn_format30t_return retval = new smaliParser.insn_format30t_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT30t427=null;
		ParserRuleReturnScope label_ref428 =null;

		CommonTree INSTRUCTION_FORMAT30t427_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT30t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT30t");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// smaliParser.g:1040:3: ( INSTRUCTION_FORMAT30t label_ref -> ^( I_STATEMENT_FORMAT30t[$start, \"I_STATEMENT_FORMAT30t\"] INSTRUCTION_FORMAT30t label_ref ) )
			// smaliParser.g:1041:5: INSTRUCTION_FORMAT30t label_ref
			{
			INSTRUCTION_FORMAT30t427=(Token)match(input,INSTRUCTION_FORMAT30t,FOLLOW_INSTRUCTION_FORMAT30t_in_insn_format30t5349);  
			stream_INSTRUCTION_FORMAT30t.add(INSTRUCTION_FORMAT30t427);

			pushFollow(FOLLOW_label_ref_in_insn_format30t5351);
			label_ref428=label_ref();
			state._fsp--;

			stream_label_ref.add(label_ref428.getTree());
			// AST REWRITE
			// elements: label_ref, INSTRUCTION_FORMAT30t
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1042:5: -> ^( I_STATEMENT_FORMAT30t[$start, \"I_STATEMENT_FORMAT30t\"] INSTRUCTION_FORMAT30t label_ref )
			{
				// smaliParser.g:1042:8: ^( I_STATEMENT_FORMAT30t[$start, \"I_STATEMENT_FORMAT30t\"] INSTRUCTION_FORMAT30t label_ref )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT30t, (retval.start), "I_STATEMENT_FORMAT30t"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT30t.nextNode());
				adaptor.addChild(root_1, stream_label_ref.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format30t"


	public static class insn_format31c_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format31c"
	// smaliParser.g:1044:1: insn_format31c : INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL -> ^( I_STATEMENT_FORMAT31c[$start, \"I_STATEMENT_FORMAT31c\"] INSTRUCTION_FORMAT31c REGISTER STRING_LITERAL ) ;
	public final smaliParser.insn_format31c_return insn_format31c() throws RecognitionException {
		smaliParser.insn_format31c_return retval = new smaliParser.insn_format31c_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT31c429=null;
		Token REGISTER430=null;
		Token COMMA431=null;
		Token STRING_LITERAL432=null;

		CommonTree INSTRUCTION_FORMAT31c429_tree=null;
		CommonTree REGISTER430_tree=null;
		CommonTree COMMA431_tree=null;
		CommonTree STRING_LITERAL432_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT31c=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT31c");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

		try {
			// smaliParser.g:1045:3: ( INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL -> ^( I_STATEMENT_FORMAT31c[$start, \"I_STATEMENT_FORMAT31c\"] INSTRUCTION_FORMAT31c REGISTER STRING_LITERAL ) )
			// smaliParser.g:1046:5: INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL
			{
			INSTRUCTION_FORMAT31c429=(Token)match(input,INSTRUCTION_FORMAT31c,FOLLOW_INSTRUCTION_FORMAT31c_in_insn_format31c5381);  
			stream_INSTRUCTION_FORMAT31c.add(INSTRUCTION_FORMAT31c429);

			REGISTER430=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format31c5383);  
			stream_REGISTER.add(REGISTER430);

			COMMA431=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format31c5385);  
			stream_COMMA.add(COMMA431);

			STRING_LITERAL432=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_insn_format31c5387);  
			stream_STRING_LITERAL.add(STRING_LITERAL432);

			// AST REWRITE
			// elements: INSTRUCTION_FORMAT31c, STRING_LITERAL, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1047:5: -> ^( I_STATEMENT_FORMAT31c[$start, \"I_STATEMENT_FORMAT31c\"] INSTRUCTION_FORMAT31c REGISTER STRING_LITERAL )
			{
				// smaliParser.g:1047:7: ^( I_STATEMENT_FORMAT31c[$start, \"I_STATEMENT_FORMAT31c\"] INSTRUCTION_FORMAT31c REGISTER STRING_LITERAL )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT31c, (retval.start), "I_STATEMENT_FORMAT31c"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT31c.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format31c"


	public static class insn_format31i_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format31i"
	// smaliParser.g:1049:1: insn_format31i : instruction_format31i REGISTER COMMA fixed_32bit_literal -> ^( I_STATEMENT_FORMAT31i[$start, \"I_STATEMENT_FORMAT31i\"] instruction_format31i REGISTER fixed_32bit_literal ) ;
	public final smaliParser.insn_format31i_return insn_format31i() throws RecognitionException {
		smaliParser.insn_format31i_return retval = new smaliParser.insn_format31i_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token REGISTER434=null;
		Token COMMA435=null;
		ParserRuleReturnScope instruction_format31i433 =null;
		ParserRuleReturnScope fixed_32bit_literal436 =null;

		CommonTree REGISTER434_tree=null;
		CommonTree COMMA435_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleSubtreeStream stream_fixed_32bit_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_32bit_literal");
		RewriteRuleSubtreeStream stream_instruction_format31i=new RewriteRuleSubtreeStream(adaptor,"rule instruction_format31i");

		try {
			// smaliParser.g:1050:3: ( instruction_format31i REGISTER COMMA fixed_32bit_literal -> ^( I_STATEMENT_FORMAT31i[$start, \"I_STATEMENT_FORMAT31i\"] instruction_format31i REGISTER fixed_32bit_literal ) )
			// smaliParser.g:1051:5: instruction_format31i REGISTER COMMA fixed_32bit_literal
			{
			pushFollow(FOLLOW_instruction_format31i_in_insn_format31i5418);
			instruction_format31i433=instruction_format31i();
			state._fsp--;

			stream_instruction_format31i.add(instruction_format31i433.getTree());
			REGISTER434=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format31i5420);  
			stream_REGISTER.add(REGISTER434);

			COMMA435=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format31i5422);  
			stream_COMMA.add(COMMA435);

			pushFollow(FOLLOW_fixed_32bit_literal_in_insn_format31i5424);
			fixed_32bit_literal436=fixed_32bit_literal();
			state._fsp--;

			stream_fixed_32bit_literal.add(fixed_32bit_literal436.getTree());
			// AST REWRITE
			// elements: fixed_32bit_literal, REGISTER, instruction_format31i
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1052:5: -> ^( I_STATEMENT_FORMAT31i[$start, \"I_STATEMENT_FORMAT31i\"] instruction_format31i REGISTER fixed_32bit_literal )
			{
				// smaliParser.g:1052:8: ^( I_STATEMENT_FORMAT31i[$start, \"I_STATEMENT_FORMAT31i\"] instruction_format31i REGISTER fixed_32bit_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT31i, (retval.start), "I_STATEMENT_FORMAT31i"), root_1);
				adaptor.addChild(root_1, stream_instruction_format31i.nextTree());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_fixed_32bit_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format31i"


	public static class insn_format31t_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format31t"
	// smaliParser.g:1054:1: insn_format31t : INSTRUCTION_FORMAT31t REGISTER COMMA label_ref -> ^( I_STATEMENT_FORMAT31t[$start, \"I_STATEMENT_FORMAT31t\"] INSTRUCTION_FORMAT31t REGISTER label_ref ) ;
	public final smaliParser.insn_format31t_return insn_format31t() throws RecognitionException {
		smaliParser.insn_format31t_return retval = new smaliParser.insn_format31t_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT31t437=null;
		Token REGISTER438=null;
		Token COMMA439=null;
		ParserRuleReturnScope label_ref440 =null;

		CommonTree INSTRUCTION_FORMAT31t437_tree=null;
		CommonTree REGISTER438_tree=null;
		CommonTree COMMA439_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT31t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT31t");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// smaliParser.g:1055:3: ( INSTRUCTION_FORMAT31t REGISTER COMMA label_ref -> ^( I_STATEMENT_FORMAT31t[$start, \"I_STATEMENT_FORMAT31t\"] INSTRUCTION_FORMAT31t REGISTER label_ref ) )
			// smaliParser.g:1056:5: INSTRUCTION_FORMAT31t REGISTER COMMA label_ref
			{
			INSTRUCTION_FORMAT31t437=(Token)match(input,INSTRUCTION_FORMAT31t,FOLLOW_INSTRUCTION_FORMAT31t_in_insn_format31t5456);  
			stream_INSTRUCTION_FORMAT31t.add(INSTRUCTION_FORMAT31t437);

			REGISTER438=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format31t5458);  
			stream_REGISTER.add(REGISTER438);

			COMMA439=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format31t5460);  
			stream_COMMA.add(COMMA439);

			pushFollow(FOLLOW_label_ref_in_insn_format31t5462);
			label_ref440=label_ref();
			state._fsp--;

			stream_label_ref.add(label_ref440.getTree());
			// AST REWRITE
			// elements: INSTRUCTION_FORMAT31t, label_ref, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1057:5: -> ^( I_STATEMENT_FORMAT31t[$start, \"I_STATEMENT_FORMAT31t\"] INSTRUCTION_FORMAT31t REGISTER label_ref )
			{
				// smaliParser.g:1057:8: ^( I_STATEMENT_FORMAT31t[$start, \"I_STATEMENT_FORMAT31t\"] INSTRUCTION_FORMAT31t REGISTER label_ref )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT31t, (retval.start), "I_STATEMENT_FORMAT31t"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT31t.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_label_ref.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format31t"


	public static class insn_format32x_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format32x"
	// smaliParser.g:1059:1: insn_format32x : INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT32x[$start, \"I_STATEMENT_FORMAT32x\"] INSTRUCTION_FORMAT32x REGISTER REGISTER ) ;
	public final smaliParser.insn_format32x_return insn_format32x() throws RecognitionException {
		smaliParser.insn_format32x_return retval = new smaliParser.insn_format32x_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT32x441=null;
		Token REGISTER442=null;
		Token COMMA443=null;
		Token REGISTER444=null;

		CommonTree INSTRUCTION_FORMAT32x441_tree=null;
		CommonTree REGISTER442_tree=null;
		CommonTree COMMA443_tree=null;
		CommonTree REGISTER444_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT32x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT32x");

		try {
			// smaliParser.g:1060:3: ( INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT32x[$start, \"I_STATEMENT_FORMAT32x\"] INSTRUCTION_FORMAT32x REGISTER REGISTER ) )
			// smaliParser.g:1061:5: INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER
			{
			INSTRUCTION_FORMAT32x441=(Token)match(input,INSTRUCTION_FORMAT32x,FOLLOW_INSTRUCTION_FORMAT32x_in_insn_format32x5494);  
			stream_INSTRUCTION_FORMAT32x.add(INSTRUCTION_FORMAT32x441);

			REGISTER442=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format32x5496);  
			stream_REGISTER.add(REGISTER442);

			COMMA443=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format32x5498);  
			stream_COMMA.add(COMMA443);

			REGISTER444=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format32x5500);  
			stream_REGISTER.add(REGISTER444);

			// AST REWRITE
			// elements: REGISTER, REGISTER, INSTRUCTION_FORMAT32x
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1062:5: -> ^( I_STATEMENT_FORMAT32x[$start, \"I_STATEMENT_FORMAT32x\"] INSTRUCTION_FORMAT32x REGISTER REGISTER )
			{
				// smaliParser.g:1062:8: ^( I_STATEMENT_FORMAT32x[$start, \"I_STATEMENT_FORMAT32x\"] INSTRUCTION_FORMAT32x REGISTER REGISTER )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT32x, (retval.start), "I_STATEMENT_FORMAT32x"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT32x.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format32x"


	public static class insn_format35c_call_site_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format35c_call_site"
	// smaliParser.g:1064:1: insn_format35c_call_site : INSTRUCTION_FORMAT35c_CALL_SITE OPEN_BRACE register_list CLOSE_BRACE COMMA call_site_reference -> ^( I_STATEMENT_FORMAT35c_CALL_SITE[$start, \"I_STATEMENT_FORMAT35c_CALL_SITE\"] INSTRUCTION_FORMAT35c_CALL_SITE register_list call_site_reference ) ;
	public final smaliParser.insn_format35c_call_site_return insn_format35c_call_site() throws RecognitionException {
		smaliParser.insn_format35c_call_site_return retval = new smaliParser.insn_format35c_call_site_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT35c_CALL_SITE445=null;
		Token OPEN_BRACE446=null;
		Token CLOSE_BRACE448=null;
		Token COMMA449=null;
		ParserRuleReturnScope register_list447 =null;
		ParserRuleReturnScope call_site_reference450 =null;

		CommonTree INSTRUCTION_FORMAT35c_CALL_SITE445_tree=null;
		CommonTree OPEN_BRACE446_tree=null;
		CommonTree CLOSE_BRACE448_tree=null;
		CommonTree COMMA449_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_CALL_SITE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_CALL_SITE");
		RewriteRuleSubtreeStream stream_register_list=new RewriteRuleSubtreeStream(adaptor,"rule register_list");
		RewriteRuleSubtreeStream stream_call_site_reference=new RewriteRuleSubtreeStream(adaptor,"rule call_site_reference");

		try {
			// smaliParser.g:1065:3: ( INSTRUCTION_FORMAT35c_CALL_SITE OPEN_BRACE register_list CLOSE_BRACE COMMA call_site_reference -> ^( I_STATEMENT_FORMAT35c_CALL_SITE[$start, \"I_STATEMENT_FORMAT35c_CALL_SITE\"] INSTRUCTION_FORMAT35c_CALL_SITE register_list call_site_reference ) )
			// smaliParser.g:1067:5: INSTRUCTION_FORMAT35c_CALL_SITE OPEN_BRACE register_list CLOSE_BRACE COMMA call_site_reference
			{
			INSTRUCTION_FORMAT35c_CALL_SITE445=(Token)match(input,INSTRUCTION_FORMAT35c_CALL_SITE,FOLLOW_INSTRUCTION_FORMAT35c_CALL_SITE_in_insn_format35c_call_site5537);  
			stream_INSTRUCTION_FORMAT35c_CALL_SITE.add(INSTRUCTION_FORMAT35c_CALL_SITE445);

			OPEN_BRACE446=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35c_call_site5539);  
			stream_OPEN_BRACE.add(OPEN_BRACE446);

			pushFollow(FOLLOW_register_list_in_insn_format35c_call_site5541);
			register_list447=register_list();
			state._fsp--;

			stream_register_list.add(register_list447.getTree());
			CLOSE_BRACE448=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35c_call_site5543);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE448);

			COMMA449=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format35c_call_site5545);  
			stream_COMMA.add(COMMA449);

			pushFollow(FOLLOW_call_site_reference_in_insn_format35c_call_site5547);
			call_site_reference450=call_site_reference();
			state._fsp--;

			stream_call_site_reference.add(call_site_reference450.getTree());
			// AST REWRITE
			// elements: register_list, call_site_reference, INSTRUCTION_FORMAT35c_CALL_SITE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1068:5: -> ^( I_STATEMENT_FORMAT35c_CALL_SITE[$start, \"I_STATEMENT_FORMAT35c_CALL_SITE\"] INSTRUCTION_FORMAT35c_CALL_SITE register_list call_site_reference )
			{
				// smaliParser.g:1068:8: ^( I_STATEMENT_FORMAT35c_CALL_SITE[$start, \"I_STATEMENT_FORMAT35c_CALL_SITE\"] INSTRUCTION_FORMAT35c_CALL_SITE register_list call_site_reference )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT35c_CALL_SITE, (retval.start), "I_STATEMENT_FORMAT35c_CALL_SITE"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT35c_CALL_SITE.nextNode());
				adaptor.addChild(root_1, stream_register_list.nextTree());
				adaptor.addChild(root_1, stream_call_site_reference.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format35c_call_site"


	public static class insn_format35c_method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format35c_method"
	// smaliParser.g:1070:1: insn_format35c_method : INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA method_reference -> ^( I_STATEMENT_FORMAT35c_METHOD[$start, \"I_STATEMENT_FORMAT35c_METHOD\"] INSTRUCTION_FORMAT35c_METHOD register_list method_reference ) ;
	public final smaliParser.insn_format35c_method_return insn_format35c_method() throws RecognitionException {
		smaliParser.insn_format35c_method_return retval = new smaliParser.insn_format35c_method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT35c_METHOD451=null;
		Token OPEN_BRACE452=null;
		Token CLOSE_BRACE454=null;
		Token COMMA455=null;
		ParserRuleReturnScope register_list453 =null;
		ParserRuleReturnScope method_reference456 =null;

		CommonTree INSTRUCTION_FORMAT35c_METHOD451_tree=null;
		CommonTree OPEN_BRACE452_tree=null;
		CommonTree CLOSE_BRACE454_tree=null;
		CommonTree COMMA455_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_METHOD");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleSubtreeStream stream_method_reference=new RewriteRuleSubtreeStream(adaptor,"rule method_reference");
		RewriteRuleSubtreeStream stream_register_list=new RewriteRuleSubtreeStream(adaptor,"rule register_list");

		try {
			// smaliParser.g:1071:3: ( INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA method_reference -> ^( I_STATEMENT_FORMAT35c_METHOD[$start, \"I_STATEMENT_FORMAT35c_METHOD\"] INSTRUCTION_FORMAT35c_METHOD register_list method_reference ) )
			// smaliParser.g:1072:5: INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA method_reference
			{
			INSTRUCTION_FORMAT35c_METHOD451=(Token)match(input,INSTRUCTION_FORMAT35c_METHOD,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_insn_format35c_method5579);  
			stream_INSTRUCTION_FORMAT35c_METHOD.add(INSTRUCTION_FORMAT35c_METHOD451);

			OPEN_BRACE452=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35c_method5581);  
			stream_OPEN_BRACE.add(OPEN_BRACE452);

			pushFollow(FOLLOW_register_list_in_insn_format35c_method5583);
			register_list453=register_list();
			state._fsp--;

			stream_register_list.add(register_list453.getTree());
			CLOSE_BRACE454=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35c_method5585);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE454);

			COMMA455=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format35c_method5587);  
			stream_COMMA.add(COMMA455);

			pushFollow(FOLLOW_method_reference_in_insn_format35c_method5589);
			method_reference456=method_reference();
			state._fsp--;

			stream_method_reference.add(method_reference456.getTree());
			// AST REWRITE
			// elements: register_list, INSTRUCTION_FORMAT35c_METHOD, method_reference
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1073:5: -> ^( I_STATEMENT_FORMAT35c_METHOD[$start, \"I_STATEMENT_FORMAT35c_METHOD\"] INSTRUCTION_FORMAT35c_METHOD register_list method_reference )
			{
				// smaliParser.g:1073:8: ^( I_STATEMENT_FORMAT35c_METHOD[$start, \"I_STATEMENT_FORMAT35c_METHOD\"] INSTRUCTION_FORMAT35c_METHOD register_list method_reference )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT35c_METHOD, (retval.start), "I_STATEMENT_FORMAT35c_METHOD"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT35c_METHOD.nextNode());
				adaptor.addChild(root_1, stream_register_list.nextTree());
				adaptor.addChild(root_1, stream_method_reference.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format35c_method"


	public static class insn_format35c_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format35c_type"
	// smaliParser.g:1075:1: insn_format35c_type : INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT35c_TYPE[$start, \"I_STATEMENT_FORMAT35c_TYPE\"] INSTRUCTION_FORMAT35c_TYPE register_list nonvoid_type_descriptor ) ;
	public final smaliParser.insn_format35c_type_return insn_format35c_type() throws RecognitionException {
		smaliParser.insn_format35c_type_return retval = new smaliParser.insn_format35c_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT35c_TYPE457=null;
		Token OPEN_BRACE458=null;
		Token CLOSE_BRACE460=null;
		Token COMMA461=null;
		ParserRuleReturnScope register_list459 =null;
		ParserRuleReturnScope nonvoid_type_descriptor462 =null;

		CommonTree INSTRUCTION_FORMAT35c_TYPE457_tree=null;
		CommonTree OPEN_BRACE458_tree=null;
		CommonTree CLOSE_BRACE460_tree=null;
		CommonTree COMMA461_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_TYPE");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleSubtreeStream stream_register_list=new RewriteRuleSubtreeStream(adaptor,"rule register_list");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");

		try {
			// smaliParser.g:1076:3: ( INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT35c_TYPE[$start, \"I_STATEMENT_FORMAT35c_TYPE\"] INSTRUCTION_FORMAT35c_TYPE register_list nonvoid_type_descriptor ) )
			// smaliParser.g:1077:5: INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor
			{
			INSTRUCTION_FORMAT35c_TYPE457=(Token)match(input,INSTRUCTION_FORMAT35c_TYPE,FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_insn_format35c_type5621);  
			stream_INSTRUCTION_FORMAT35c_TYPE.add(INSTRUCTION_FORMAT35c_TYPE457);

			OPEN_BRACE458=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35c_type5623);  
			stream_OPEN_BRACE.add(OPEN_BRACE458);

			pushFollow(FOLLOW_register_list_in_insn_format35c_type5625);
			register_list459=register_list();
			state._fsp--;

			stream_register_list.add(register_list459.getTree());
			CLOSE_BRACE460=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35c_type5627);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE460);

			COMMA461=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format35c_type5629);  
			stream_COMMA.add(COMMA461);

			pushFollow(FOLLOW_nonvoid_type_descriptor_in_insn_format35c_type5631);
			nonvoid_type_descriptor462=nonvoid_type_descriptor();
			state._fsp--;

			stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor462.getTree());
			// AST REWRITE
			// elements: register_list, nonvoid_type_descriptor, INSTRUCTION_FORMAT35c_TYPE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1078:5: -> ^( I_STATEMENT_FORMAT35c_TYPE[$start, \"I_STATEMENT_FORMAT35c_TYPE\"] INSTRUCTION_FORMAT35c_TYPE register_list nonvoid_type_descriptor )
			{
				// smaliParser.g:1078:8: ^( I_STATEMENT_FORMAT35c_TYPE[$start, \"I_STATEMENT_FORMAT35c_TYPE\"] INSTRUCTION_FORMAT35c_TYPE register_list nonvoid_type_descriptor )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT35c_TYPE, (retval.start), "I_STATEMENT_FORMAT35c_TYPE"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT35c_TYPE.nextNode());
				adaptor.addChild(root_1, stream_register_list.nextTree());
				adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format35c_type"


	public static class insn_format35c_method_odex_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format35c_method_odex"
	// smaliParser.g:1080:1: insn_format35c_method_odex : INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA method_reference ;
	public final smaliParser.insn_format35c_method_odex_return insn_format35c_method_odex() throws RecognitionException {
		smaliParser.insn_format35c_method_odex_return retval = new smaliParser.insn_format35c_method_odex_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT35c_METHOD_ODEX463=null;
		Token OPEN_BRACE464=null;
		Token CLOSE_BRACE466=null;
		Token COMMA467=null;
		ParserRuleReturnScope register_list465 =null;
		ParserRuleReturnScope method_reference468 =null;

		CommonTree INSTRUCTION_FORMAT35c_METHOD_ODEX463_tree=null;
		CommonTree OPEN_BRACE464_tree=null;
		CommonTree CLOSE_BRACE466_tree=null;
		CommonTree COMMA467_tree=null;

		try {
			// smaliParser.g:1081:3: ( INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA method_reference )
			// smaliParser.g:1082:5: INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA method_reference
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT35c_METHOD_ODEX463=(Token)match(input,INSTRUCTION_FORMAT35c_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_insn_format35c_method_odex5663); 
			INSTRUCTION_FORMAT35c_METHOD_ODEX463_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT35c_METHOD_ODEX463);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT35c_METHOD_ODEX463_tree);

			OPEN_BRACE464=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35c_method_odex5665); 
			OPEN_BRACE464_tree = (CommonTree)adaptor.create(OPEN_BRACE464);
			adaptor.addChild(root_0, OPEN_BRACE464_tree);

			pushFollow(FOLLOW_register_list_in_insn_format35c_method_odex5667);
			register_list465=register_list();
			state._fsp--;

			adaptor.addChild(root_0, register_list465.getTree());

			CLOSE_BRACE466=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35c_method_odex5669); 
			CLOSE_BRACE466_tree = (CommonTree)adaptor.create(CLOSE_BRACE466);
			adaptor.addChild(root_0, CLOSE_BRACE466_tree);

			COMMA467=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format35c_method_odex5671); 
			COMMA467_tree = (CommonTree)adaptor.create(COMMA467);
			adaptor.addChild(root_0, COMMA467_tree);

			pushFollow(FOLLOW_method_reference_in_insn_format35c_method_odex5673);
			method_reference468=method_reference();
			state._fsp--;

			adaptor.addChild(root_0, method_reference468.getTree());


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT35c_METHOD_ODEX463!=null?INSTRUCTION_FORMAT35c_METHOD_ODEX463.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format35c_method_odex"


	public static class insn_format35mi_method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format35mi_method"
	// smaliParser.g:1087:1: insn_format35mi_method : INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX ;
	public final smaliParser.insn_format35mi_method_return insn_format35mi_method() throws RecognitionException {
		smaliParser.insn_format35mi_method_return retval = new smaliParser.insn_format35mi_method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT35mi_METHOD469=null;
		Token OPEN_BRACE470=null;
		Token CLOSE_BRACE472=null;
		Token COMMA473=null;
		Token INLINE_INDEX474=null;
		ParserRuleReturnScope register_list471 =null;

		CommonTree INSTRUCTION_FORMAT35mi_METHOD469_tree=null;
		CommonTree OPEN_BRACE470_tree=null;
		CommonTree CLOSE_BRACE472_tree=null;
		CommonTree COMMA473_tree=null;
		CommonTree INLINE_INDEX474_tree=null;

		try {
			// smaliParser.g:1088:3: ( INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX )
			// smaliParser.g:1089:5: INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT35mi_METHOD469=(Token)match(input,INSTRUCTION_FORMAT35mi_METHOD,FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_insn_format35mi_method5694); 
			INSTRUCTION_FORMAT35mi_METHOD469_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT35mi_METHOD469);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT35mi_METHOD469_tree);

			OPEN_BRACE470=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35mi_method5696); 
			OPEN_BRACE470_tree = (CommonTree)adaptor.create(OPEN_BRACE470);
			adaptor.addChild(root_0, OPEN_BRACE470_tree);

			pushFollow(FOLLOW_register_list_in_insn_format35mi_method5698);
			register_list471=register_list();
			state._fsp--;

			adaptor.addChild(root_0, register_list471.getTree());

			CLOSE_BRACE472=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35mi_method5700); 
			CLOSE_BRACE472_tree = (CommonTree)adaptor.create(CLOSE_BRACE472);
			adaptor.addChild(root_0, CLOSE_BRACE472_tree);

			COMMA473=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format35mi_method5702); 
			COMMA473_tree = (CommonTree)adaptor.create(COMMA473);
			adaptor.addChild(root_0, COMMA473_tree);

			INLINE_INDEX474=(Token)match(input,INLINE_INDEX,FOLLOW_INLINE_INDEX_in_insn_format35mi_method5704); 
			INLINE_INDEX474_tree = (CommonTree)adaptor.create(INLINE_INDEX474);
			adaptor.addChild(root_0, INLINE_INDEX474_tree);


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT35mi_METHOD469!=null?INSTRUCTION_FORMAT35mi_METHOD469.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format35mi_method"


	public static class insn_format35ms_method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format35ms_method"
	// smaliParser.g:1094:1: insn_format35ms_method : INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX ;
	public final smaliParser.insn_format35ms_method_return insn_format35ms_method() throws RecognitionException {
		smaliParser.insn_format35ms_method_return retval = new smaliParser.insn_format35ms_method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT35ms_METHOD475=null;
		Token OPEN_BRACE476=null;
		Token CLOSE_BRACE478=null;
		Token COMMA479=null;
		Token VTABLE_INDEX480=null;
		ParserRuleReturnScope register_list477 =null;

		CommonTree INSTRUCTION_FORMAT35ms_METHOD475_tree=null;
		CommonTree OPEN_BRACE476_tree=null;
		CommonTree CLOSE_BRACE478_tree=null;
		CommonTree COMMA479_tree=null;
		CommonTree VTABLE_INDEX480_tree=null;

		try {
			// smaliParser.g:1095:3: ( INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX )
			// smaliParser.g:1096:5: INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT35ms_METHOD475=(Token)match(input,INSTRUCTION_FORMAT35ms_METHOD,FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_insn_format35ms_method5725); 
			INSTRUCTION_FORMAT35ms_METHOD475_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT35ms_METHOD475);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT35ms_METHOD475_tree);

			OPEN_BRACE476=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35ms_method5727); 
			OPEN_BRACE476_tree = (CommonTree)adaptor.create(OPEN_BRACE476);
			adaptor.addChild(root_0, OPEN_BRACE476_tree);

			pushFollow(FOLLOW_register_list_in_insn_format35ms_method5729);
			register_list477=register_list();
			state._fsp--;

			adaptor.addChild(root_0, register_list477.getTree());

			CLOSE_BRACE478=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35ms_method5731); 
			CLOSE_BRACE478_tree = (CommonTree)adaptor.create(CLOSE_BRACE478);
			adaptor.addChild(root_0, CLOSE_BRACE478_tree);

			COMMA479=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format35ms_method5733); 
			COMMA479_tree = (CommonTree)adaptor.create(COMMA479);
			adaptor.addChild(root_0, COMMA479_tree);

			VTABLE_INDEX480=(Token)match(input,VTABLE_INDEX,FOLLOW_VTABLE_INDEX_in_insn_format35ms_method5735); 
			VTABLE_INDEX480_tree = (CommonTree)adaptor.create(VTABLE_INDEX480);
			adaptor.addChild(root_0, VTABLE_INDEX480_tree);


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT35ms_METHOD475!=null?INSTRUCTION_FORMAT35ms_METHOD475.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format35ms_method"


	public static class insn_format3rc_call_site_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format3rc_call_site"
	// smaliParser.g:1101:1: insn_format3rc_call_site : INSTRUCTION_FORMAT3rc_CALL_SITE OPEN_BRACE register_range CLOSE_BRACE COMMA call_site_reference -> ^( I_STATEMENT_FORMAT3rc_CALL_SITE[$start, \"I_STATEMENT_FORMAT3rc_CALL_SITE\"] INSTRUCTION_FORMAT3rc_CALL_SITE register_range call_site_reference ) ;
	public final smaliParser.insn_format3rc_call_site_return insn_format3rc_call_site() throws RecognitionException {
		smaliParser.insn_format3rc_call_site_return retval = new smaliParser.insn_format3rc_call_site_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT3rc_CALL_SITE481=null;
		Token OPEN_BRACE482=null;
		Token CLOSE_BRACE484=null;
		Token COMMA485=null;
		ParserRuleReturnScope register_range483 =null;
		ParserRuleReturnScope call_site_reference486 =null;

		CommonTree INSTRUCTION_FORMAT3rc_CALL_SITE481_tree=null;
		CommonTree OPEN_BRACE482_tree=null;
		CommonTree CLOSE_BRACE484_tree=null;
		CommonTree COMMA485_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT3rc_CALL_SITE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT3rc_CALL_SITE");
		RewriteRuleSubtreeStream stream_register_range=new RewriteRuleSubtreeStream(adaptor,"rule register_range");
		RewriteRuleSubtreeStream stream_call_site_reference=new RewriteRuleSubtreeStream(adaptor,"rule call_site_reference");

		try {
			// smaliParser.g:1102:3: ( INSTRUCTION_FORMAT3rc_CALL_SITE OPEN_BRACE register_range CLOSE_BRACE COMMA call_site_reference -> ^( I_STATEMENT_FORMAT3rc_CALL_SITE[$start, \"I_STATEMENT_FORMAT3rc_CALL_SITE\"] INSTRUCTION_FORMAT3rc_CALL_SITE register_range call_site_reference ) )
			// smaliParser.g:1104:5: INSTRUCTION_FORMAT3rc_CALL_SITE OPEN_BRACE register_range CLOSE_BRACE COMMA call_site_reference
			{
			INSTRUCTION_FORMAT3rc_CALL_SITE481=(Token)match(input,INSTRUCTION_FORMAT3rc_CALL_SITE,FOLLOW_INSTRUCTION_FORMAT3rc_CALL_SITE_in_insn_format3rc_call_site5761);  
			stream_INSTRUCTION_FORMAT3rc_CALL_SITE.add(INSTRUCTION_FORMAT3rc_CALL_SITE481);

			OPEN_BRACE482=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rc_call_site5763);  
			stream_OPEN_BRACE.add(OPEN_BRACE482);

			pushFollow(FOLLOW_register_range_in_insn_format3rc_call_site5765);
			register_range483=register_range();
			state._fsp--;

			stream_register_range.add(register_range483.getTree());
			CLOSE_BRACE484=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rc_call_site5767);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE484);

			COMMA485=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format3rc_call_site5769);  
			stream_COMMA.add(COMMA485);

			pushFollow(FOLLOW_call_site_reference_in_insn_format3rc_call_site5771);
			call_site_reference486=call_site_reference();
			state._fsp--;

			stream_call_site_reference.add(call_site_reference486.getTree());
			// AST REWRITE
			// elements: INSTRUCTION_FORMAT3rc_CALL_SITE, register_range, call_site_reference
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1105:5: -> ^( I_STATEMENT_FORMAT3rc_CALL_SITE[$start, \"I_STATEMENT_FORMAT3rc_CALL_SITE\"] INSTRUCTION_FORMAT3rc_CALL_SITE register_range call_site_reference )
			{
				// smaliParser.g:1105:8: ^( I_STATEMENT_FORMAT3rc_CALL_SITE[$start, \"I_STATEMENT_FORMAT3rc_CALL_SITE\"] INSTRUCTION_FORMAT3rc_CALL_SITE register_range call_site_reference )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT3rc_CALL_SITE, (retval.start), "I_STATEMENT_FORMAT3rc_CALL_SITE"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT3rc_CALL_SITE.nextNode());
				adaptor.addChild(root_1, stream_register_range.nextTree());
				adaptor.addChild(root_1, stream_call_site_reference.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format3rc_call_site"


	public static class insn_format3rc_method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format3rc_method"
	// smaliParser.g:1107:1: insn_format3rc_method : INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA method_reference -> ^( I_STATEMENT_FORMAT3rc_METHOD[$start, \"I_STATEMENT_FORMAT3rc_METHOD\"] INSTRUCTION_FORMAT3rc_METHOD register_range method_reference ) ;
	public final smaliParser.insn_format3rc_method_return insn_format3rc_method() throws RecognitionException {
		smaliParser.insn_format3rc_method_return retval = new smaliParser.insn_format3rc_method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT3rc_METHOD487=null;
		Token OPEN_BRACE488=null;
		Token CLOSE_BRACE490=null;
		Token COMMA491=null;
		ParserRuleReturnScope register_range489 =null;
		ParserRuleReturnScope method_reference492 =null;

		CommonTree INSTRUCTION_FORMAT3rc_METHOD487_tree=null;
		CommonTree OPEN_BRACE488_tree=null;
		CommonTree CLOSE_BRACE490_tree=null;
		CommonTree COMMA491_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT3rc_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT3rc_METHOD");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleSubtreeStream stream_method_reference=new RewriteRuleSubtreeStream(adaptor,"rule method_reference");
		RewriteRuleSubtreeStream stream_register_range=new RewriteRuleSubtreeStream(adaptor,"rule register_range");

		try {
			// smaliParser.g:1108:3: ( INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA method_reference -> ^( I_STATEMENT_FORMAT3rc_METHOD[$start, \"I_STATEMENT_FORMAT3rc_METHOD\"] INSTRUCTION_FORMAT3rc_METHOD register_range method_reference ) )
			// smaliParser.g:1109:5: INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA method_reference
			{
			INSTRUCTION_FORMAT3rc_METHOD487=(Token)match(input,INSTRUCTION_FORMAT3rc_METHOD,FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_insn_format3rc_method5803);  
			stream_INSTRUCTION_FORMAT3rc_METHOD.add(INSTRUCTION_FORMAT3rc_METHOD487);

			OPEN_BRACE488=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rc_method5805);  
			stream_OPEN_BRACE.add(OPEN_BRACE488);

			pushFollow(FOLLOW_register_range_in_insn_format3rc_method5807);
			register_range489=register_range();
			state._fsp--;

			stream_register_range.add(register_range489.getTree());
			CLOSE_BRACE490=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rc_method5809);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE490);

			COMMA491=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format3rc_method5811);  
			stream_COMMA.add(COMMA491);

			pushFollow(FOLLOW_method_reference_in_insn_format3rc_method5813);
			method_reference492=method_reference();
			state._fsp--;

			stream_method_reference.add(method_reference492.getTree());
			// AST REWRITE
			// elements: method_reference, register_range, INSTRUCTION_FORMAT3rc_METHOD
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1110:5: -> ^( I_STATEMENT_FORMAT3rc_METHOD[$start, \"I_STATEMENT_FORMAT3rc_METHOD\"] INSTRUCTION_FORMAT3rc_METHOD register_range method_reference )
			{
				// smaliParser.g:1110:8: ^( I_STATEMENT_FORMAT3rc_METHOD[$start, \"I_STATEMENT_FORMAT3rc_METHOD\"] INSTRUCTION_FORMAT3rc_METHOD register_range method_reference )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT3rc_METHOD, (retval.start), "I_STATEMENT_FORMAT3rc_METHOD"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT3rc_METHOD.nextNode());
				adaptor.addChild(root_1, stream_register_range.nextTree());
				adaptor.addChild(root_1, stream_method_reference.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format3rc_method"


	public static class insn_format3rc_method_odex_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format3rc_method_odex"
	// smaliParser.g:1112:1: insn_format3rc_method_odex : INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA method_reference ;
	public final smaliParser.insn_format3rc_method_odex_return insn_format3rc_method_odex() throws RecognitionException {
		smaliParser.insn_format3rc_method_odex_return retval = new smaliParser.insn_format3rc_method_odex_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT3rc_METHOD_ODEX493=null;
		Token OPEN_BRACE494=null;
		Token CLOSE_BRACE496=null;
		Token COMMA497=null;
		ParserRuleReturnScope register_list495 =null;
		ParserRuleReturnScope method_reference498 =null;

		CommonTree INSTRUCTION_FORMAT3rc_METHOD_ODEX493_tree=null;
		CommonTree OPEN_BRACE494_tree=null;
		CommonTree CLOSE_BRACE496_tree=null;
		CommonTree COMMA497_tree=null;

		try {
			// smaliParser.g:1113:3: ( INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA method_reference )
			// smaliParser.g:1114:5: INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA method_reference
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT3rc_METHOD_ODEX493=(Token)match(input,INSTRUCTION_FORMAT3rc_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_ODEX_in_insn_format3rc_method_odex5845); 
			INSTRUCTION_FORMAT3rc_METHOD_ODEX493_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT3rc_METHOD_ODEX493);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT3rc_METHOD_ODEX493_tree);

			OPEN_BRACE494=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rc_method_odex5847); 
			OPEN_BRACE494_tree = (CommonTree)adaptor.create(OPEN_BRACE494);
			adaptor.addChild(root_0, OPEN_BRACE494_tree);

			pushFollow(FOLLOW_register_list_in_insn_format3rc_method_odex5849);
			register_list495=register_list();
			state._fsp--;

			adaptor.addChild(root_0, register_list495.getTree());

			CLOSE_BRACE496=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rc_method_odex5851); 
			CLOSE_BRACE496_tree = (CommonTree)adaptor.create(CLOSE_BRACE496);
			adaptor.addChild(root_0, CLOSE_BRACE496_tree);

			COMMA497=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format3rc_method_odex5853); 
			COMMA497_tree = (CommonTree)adaptor.create(COMMA497);
			adaptor.addChild(root_0, COMMA497_tree);

			pushFollow(FOLLOW_method_reference_in_insn_format3rc_method_odex5855);
			method_reference498=method_reference();
			state._fsp--;

			adaptor.addChild(root_0, method_reference498.getTree());


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT3rc_METHOD_ODEX493!=null?INSTRUCTION_FORMAT3rc_METHOD_ODEX493.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format3rc_method_odex"


	public static class insn_format3rc_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format3rc_type"
	// smaliParser.g:1119:1: insn_format3rc_type : INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT3rc_TYPE[$start, \"I_STATEMENT_FORMAT3rc_TYPE\"] INSTRUCTION_FORMAT3rc_TYPE register_range nonvoid_type_descriptor ) ;
	public final smaliParser.insn_format3rc_type_return insn_format3rc_type() throws RecognitionException {
		smaliParser.insn_format3rc_type_return retval = new smaliParser.insn_format3rc_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT3rc_TYPE499=null;
		Token OPEN_BRACE500=null;
		Token CLOSE_BRACE502=null;
		Token COMMA503=null;
		ParserRuleReturnScope register_range501 =null;
		ParserRuleReturnScope nonvoid_type_descriptor504 =null;

		CommonTree INSTRUCTION_FORMAT3rc_TYPE499_tree=null;
		CommonTree OPEN_BRACE500_tree=null;
		CommonTree CLOSE_BRACE502_tree=null;
		CommonTree COMMA503_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT3rc_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT3rc_TYPE");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");
		RewriteRuleSubtreeStream stream_register_range=new RewriteRuleSubtreeStream(adaptor,"rule register_range");

		try {
			// smaliParser.g:1120:3: ( INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT3rc_TYPE[$start, \"I_STATEMENT_FORMAT3rc_TYPE\"] INSTRUCTION_FORMAT3rc_TYPE register_range nonvoid_type_descriptor ) )
			// smaliParser.g:1121:5: INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor
			{
			INSTRUCTION_FORMAT3rc_TYPE499=(Token)match(input,INSTRUCTION_FORMAT3rc_TYPE,FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_insn_format3rc_type5876);  
			stream_INSTRUCTION_FORMAT3rc_TYPE.add(INSTRUCTION_FORMAT3rc_TYPE499);

			OPEN_BRACE500=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rc_type5878);  
			stream_OPEN_BRACE.add(OPEN_BRACE500);

			pushFollow(FOLLOW_register_range_in_insn_format3rc_type5880);
			register_range501=register_range();
			state._fsp--;

			stream_register_range.add(register_range501.getTree());
			CLOSE_BRACE502=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rc_type5882);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE502);

			COMMA503=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format3rc_type5884);  
			stream_COMMA.add(COMMA503);

			pushFollow(FOLLOW_nonvoid_type_descriptor_in_insn_format3rc_type5886);
			nonvoid_type_descriptor504=nonvoid_type_descriptor();
			state._fsp--;

			stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor504.getTree());
			// AST REWRITE
			// elements: INSTRUCTION_FORMAT3rc_TYPE, register_range, nonvoid_type_descriptor
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1122:5: -> ^( I_STATEMENT_FORMAT3rc_TYPE[$start, \"I_STATEMENT_FORMAT3rc_TYPE\"] INSTRUCTION_FORMAT3rc_TYPE register_range nonvoid_type_descriptor )
			{
				// smaliParser.g:1122:8: ^( I_STATEMENT_FORMAT3rc_TYPE[$start, \"I_STATEMENT_FORMAT3rc_TYPE\"] INSTRUCTION_FORMAT3rc_TYPE register_range nonvoid_type_descriptor )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT3rc_TYPE, (retval.start), "I_STATEMENT_FORMAT3rc_TYPE"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT3rc_TYPE.nextNode());
				adaptor.addChild(root_1, stream_register_range.nextTree());
				adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format3rc_type"


	public static class insn_format3rmi_method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format3rmi_method"
	// smaliParser.g:1124:1: insn_format3rmi_method : INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX ;
	public final smaliParser.insn_format3rmi_method_return insn_format3rmi_method() throws RecognitionException {
		smaliParser.insn_format3rmi_method_return retval = new smaliParser.insn_format3rmi_method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT3rmi_METHOD505=null;
		Token OPEN_BRACE506=null;
		Token CLOSE_BRACE508=null;
		Token COMMA509=null;
		Token INLINE_INDEX510=null;
		ParserRuleReturnScope register_range507 =null;

		CommonTree INSTRUCTION_FORMAT3rmi_METHOD505_tree=null;
		CommonTree OPEN_BRACE506_tree=null;
		CommonTree CLOSE_BRACE508_tree=null;
		CommonTree COMMA509_tree=null;
		CommonTree INLINE_INDEX510_tree=null;

		try {
			// smaliParser.g:1125:3: ( INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX )
			// smaliParser.g:1126:5: INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT3rmi_METHOD505=(Token)match(input,INSTRUCTION_FORMAT3rmi_METHOD,FOLLOW_INSTRUCTION_FORMAT3rmi_METHOD_in_insn_format3rmi_method5918); 
			INSTRUCTION_FORMAT3rmi_METHOD505_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT3rmi_METHOD505);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT3rmi_METHOD505_tree);

			OPEN_BRACE506=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rmi_method5920); 
			OPEN_BRACE506_tree = (CommonTree)adaptor.create(OPEN_BRACE506);
			adaptor.addChild(root_0, OPEN_BRACE506_tree);

			pushFollow(FOLLOW_register_range_in_insn_format3rmi_method5922);
			register_range507=register_range();
			state._fsp--;

			adaptor.addChild(root_0, register_range507.getTree());

			CLOSE_BRACE508=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rmi_method5924); 
			CLOSE_BRACE508_tree = (CommonTree)adaptor.create(CLOSE_BRACE508);
			adaptor.addChild(root_0, CLOSE_BRACE508_tree);

			COMMA509=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format3rmi_method5926); 
			COMMA509_tree = (CommonTree)adaptor.create(COMMA509);
			adaptor.addChild(root_0, COMMA509_tree);

			INLINE_INDEX510=(Token)match(input,INLINE_INDEX,FOLLOW_INLINE_INDEX_in_insn_format3rmi_method5928); 
			INLINE_INDEX510_tree = (CommonTree)adaptor.create(INLINE_INDEX510);
			adaptor.addChild(root_0, INLINE_INDEX510_tree);


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT3rmi_METHOD505!=null?INSTRUCTION_FORMAT3rmi_METHOD505.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format3rmi_method"


	public static class insn_format3rms_method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format3rms_method"
	// smaliParser.g:1131:1: insn_format3rms_method : INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX ;
	public final smaliParser.insn_format3rms_method_return insn_format3rms_method() throws RecognitionException {
		smaliParser.insn_format3rms_method_return retval = new smaliParser.insn_format3rms_method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT3rms_METHOD511=null;
		Token OPEN_BRACE512=null;
		Token CLOSE_BRACE514=null;
		Token COMMA515=null;
		Token VTABLE_INDEX516=null;
		ParserRuleReturnScope register_range513 =null;

		CommonTree INSTRUCTION_FORMAT3rms_METHOD511_tree=null;
		CommonTree OPEN_BRACE512_tree=null;
		CommonTree CLOSE_BRACE514_tree=null;
		CommonTree COMMA515_tree=null;
		CommonTree VTABLE_INDEX516_tree=null;

		try {
			// smaliParser.g:1132:3: ( INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX )
			// smaliParser.g:1133:5: INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT3rms_METHOD511=(Token)match(input,INSTRUCTION_FORMAT3rms_METHOD,FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_insn_format3rms_method5949); 
			INSTRUCTION_FORMAT3rms_METHOD511_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT3rms_METHOD511);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT3rms_METHOD511_tree);

			OPEN_BRACE512=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rms_method5951); 
			OPEN_BRACE512_tree = (CommonTree)adaptor.create(OPEN_BRACE512);
			adaptor.addChild(root_0, OPEN_BRACE512_tree);

			pushFollow(FOLLOW_register_range_in_insn_format3rms_method5953);
			register_range513=register_range();
			state._fsp--;

			adaptor.addChild(root_0, register_range513.getTree());

			CLOSE_BRACE514=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rms_method5955); 
			CLOSE_BRACE514_tree = (CommonTree)adaptor.create(CLOSE_BRACE514);
			adaptor.addChild(root_0, CLOSE_BRACE514_tree);

			COMMA515=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format3rms_method5957); 
			COMMA515_tree = (CommonTree)adaptor.create(COMMA515);
			adaptor.addChild(root_0, COMMA515_tree);

			VTABLE_INDEX516=(Token)match(input,VTABLE_INDEX,FOLLOW_VTABLE_INDEX_in_insn_format3rms_method5959); 
			VTABLE_INDEX516_tree = (CommonTree)adaptor.create(VTABLE_INDEX516);
			adaptor.addChild(root_0, VTABLE_INDEX516_tree);


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT3rms_METHOD511!=null?INSTRUCTION_FORMAT3rms_METHOD511.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format3rms_method"


	public static class insn_format45cc_method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format45cc_method"
	// smaliParser.g:1138:1: insn_format45cc_method : INSTRUCTION_FORMAT45cc_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA method_reference COMMA method_prototype -> ^( I_STATEMENT_FORMAT45cc_METHOD[$start, \"I_STATEMENT_FORMAT45cc_METHOD\"] INSTRUCTION_FORMAT45cc_METHOD register_list method_reference method_prototype ) ;
	public final smaliParser.insn_format45cc_method_return insn_format45cc_method() throws RecognitionException {
		smaliParser.insn_format45cc_method_return retval = new smaliParser.insn_format45cc_method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT45cc_METHOD517=null;
		Token OPEN_BRACE518=null;
		Token CLOSE_BRACE520=null;
		Token COMMA521=null;
		Token COMMA523=null;
		ParserRuleReturnScope register_list519 =null;
		ParserRuleReturnScope method_reference522 =null;
		ParserRuleReturnScope method_prototype524 =null;

		CommonTree INSTRUCTION_FORMAT45cc_METHOD517_tree=null;
		CommonTree OPEN_BRACE518_tree=null;
		CommonTree CLOSE_BRACE520_tree=null;
		CommonTree COMMA521_tree=null;
		CommonTree COMMA523_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT45cc_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT45cc_METHOD");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleSubtreeStream stream_method_reference=new RewriteRuleSubtreeStream(adaptor,"rule method_reference");
		RewriteRuleSubtreeStream stream_method_prototype=new RewriteRuleSubtreeStream(adaptor,"rule method_prototype");
		RewriteRuleSubtreeStream stream_register_list=new RewriteRuleSubtreeStream(adaptor,"rule register_list");

		try {
			// smaliParser.g:1139:3: ( INSTRUCTION_FORMAT45cc_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA method_reference COMMA method_prototype -> ^( I_STATEMENT_FORMAT45cc_METHOD[$start, \"I_STATEMENT_FORMAT45cc_METHOD\"] INSTRUCTION_FORMAT45cc_METHOD register_list method_reference method_prototype ) )
			// smaliParser.g:1140:5: INSTRUCTION_FORMAT45cc_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA method_reference COMMA method_prototype
			{
			INSTRUCTION_FORMAT45cc_METHOD517=(Token)match(input,INSTRUCTION_FORMAT45cc_METHOD,FOLLOW_INSTRUCTION_FORMAT45cc_METHOD_in_insn_format45cc_method5980);  
			stream_INSTRUCTION_FORMAT45cc_METHOD.add(INSTRUCTION_FORMAT45cc_METHOD517);

			OPEN_BRACE518=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format45cc_method5982);  
			stream_OPEN_BRACE.add(OPEN_BRACE518);

			pushFollow(FOLLOW_register_list_in_insn_format45cc_method5984);
			register_list519=register_list();
			state._fsp--;

			stream_register_list.add(register_list519.getTree());
			CLOSE_BRACE520=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format45cc_method5986);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE520);

			COMMA521=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format45cc_method5988);  
			stream_COMMA.add(COMMA521);

			pushFollow(FOLLOW_method_reference_in_insn_format45cc_method5990);
			method_reference522=method_reference();
			state._fsp--;

			stream_method_reference.add(method_reference522.getTree());
			COMMA523=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format45cc_method5992);  
			stream_COMMA.add(COMMA523);

			pushFollow(FOLLOW_method_prototype_in_insn_format45cc_method5994);
			method_prototype524=method_prototype();
			state._fsp--;

			stream_method_prototype.add(method_prototype524.getTree());
			// AST REWRITE
			// elements: method_prototype, INSTRUCTION_FORMAT45cc_METHOD, method_reference, register_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1141:5: -> ^( I_STATEMENT_FORMAT45cc_METHOD[$start, \"I_STATEMENT_FORMAT45cc_METHOD\"] INSTRUCTION_FORMAT45cc_METHOD register_list method_reference method_prototype )
			{
				// smaliParser.g:1141:8: ^( I_STATEMENT_FORMAT45cc_METHOD[$start, \"I_STATEMENT_FORMAT45cc_METHOD\"] INSTRUCTION_FORMAT45cc_METHOD register_list method_reference method_prototype )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT45cc_METHOD, (retval.start), "I_STATEMENT_FORMAT45cc_METHOD"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT45cc_METHOD.nextNode());
				adaptor.addChild(root_1, stream_register_list.nextTree());
				adaptor.addChild(root_1, stream_method_reference.nextTree());
				adaptor.addChild(root_1, stream_method_prototype.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format45cc_method"


	public static class insn_format4rcc_method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format4rcc_method"
	// smaliParser.g:1143:1: insn_format4rcc_method : INSTRUCTION_FORMAT4rcc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA method_reference COMMA method_prototype -> ^( I_STATEMENT_FORMAT4rcc_METHOD[$start, \"I_STATEMENT_FORMAT4rcc_METHOD\"] INSTRUCTION_FORMAT4rcc_METHOD register_range method_reference method_prototype ) ;
	public final smaliParser.insn_format4rcc_method_return insn_format4rcc_method() throws RecognitionException {
		smaliParser.insn_format4rcc_method_return retval = new smaliParser.insn_format4rcc_method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT4rcc_METHOD525=null;
		Token OPEN_BRACE526=null;
		Token CLOSE_BRACE528=null;
		Token COMMA529=null;
		Token COMMA531=null;
		ParserRuleReturnScope register_range527 =null;
		ParserRuleReturnScope method_reference530 =null;
		ParserRuleReturnScope method_prototype532 =null;

		CommonTree INSTRUCTION_FORMAT4rcc_METHOD525_tree=null;
		CommonTree OPEN_BRACE526_tree=null;
		CommonTree CLOSE_BRACE528_tree=null;
		CommonTree COMMA529_tree=null;
		CommonTree COMMA531_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT4rcc_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT4rcc_METHOD");
		RewriteRuleSubtreeStream stream_method_reference=new RewriteRuleSubtreeStream(adaptor,"rule method_reference");
		RewriteRuleSubtreeStream stream_method_prototype=new RewriteRuleSubtreeStream(adaptor,"rule method_prototype");
		RewriteRuleSubtreeStream stream_register_range=new RewriteRuleSubtreeStream(adaptor,"rule register_range");

		try {
			// smaliParser.g:1144:3: ( INSTRUCTION_FORMAT4rcc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA method_reference COMMA method_prototype -> ^( I_STATEMENT_FORMAT4rcc_METHOD[$start, \"I_STATEMENT_FORMAT4rcc_METHOD\"] INSTRUCTION_FORMAT4rcc_METHOD register_range method_reference method_prototype ) )
			// smaliParser.g:1145:5: INSTRUCTION_FORMAT4rcc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA method_reference COMMA method_prototype
			{
			INSTRUCTION_FORMAT4rcc_METHOD525=(Token)match(input,INSTRUCTION_FORMAT4rcc_METHOD,FOLLOW_INSTRUCTION_FORMAT4rcc_METHOD_in_insn_format4rcc_method6028);  
			stream_INSTRUCTION_FORMAT4rcc_METHOD.add(INSTRUCTION_FORMAT4rcc_METHOD525);

			OPEN_BRACE526=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format4rcc_method6030);  
			stream_OPEN_BRACE.add(OPEN_BRACE526);

			pushFollow(FOLLOW_register_range_in_insn_format4rcc_method6032);
			register_range527=register_range();
			state._fsp--;

			stream_register_range.add(register_range527.getTree());
			CLOSE_BRACE528=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format4rcc_method6034);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE528);

			COMMA529=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format4rcc_method6036);  
			stream_COMMA.add(COMMA529);

			pushFollow(FOLLOW_method_reference_in_insn_format4rcc_method6038);
			method_reference530=method_reference();
			state._fsp--;

			stream_method_reference.add(method_reference530.getTree());
			COMMA531=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format4rcc_method6040);  
			stream_COMMA.add(COMMA531);

			pushFollow(FOLLOW_method_prototype_in_insn_format4rcc_method6042);
			method_prototype532=method_prototype();
			state._fsp--;

			stream_method_prototype.add(method_prototype532.getTree());
			// AST REWRITE
			// elements: method_prototype, method_reference, register_range, INSTRUCTION_FORMAT4rcc_METHOD
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1146:5: -> ^( I_STATEMENT_FORMAT4rcc_METHOD[$start, \"I_STATEMENT_FORMAT4rcc_METHOD\"] INSTRUCTION_FORMAT4rcc_METHOD register_range method_reference method_prototype )
			{
				// smaliParser.g:1146:8: ^( I_STATEMENT_FORMAT4rcc_METHOD[$start, \"I_STATEMENT_FORMAT4rcc_METHOD\"] INSTRUCTION_FORMAT4rcc_METHOD register_range method_reference method_prototype )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT4rcc_METHOD, (retval.start), "I_STATEMENT_FORMAT4rcc_METHOD"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT4rcc_METHOD.nextNode());
				adaptor.addChild(root_1, stream_register_range.nextTree());
				adaptor.addChild(root_1, stream_method_reference.nextTree());
				adaptor.addChild(root_1, stream_method_prototype.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format4rcc_method"


	public static class insn_format51l_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format51l"
	// smaliParser.g:1148:1: insn_format51l : INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal -> ^( I_STATEMENT_FORMAT51l[$start, \"I_STATEMENT_FORMAT51l\"] INSTRUCTION_FORMAT51l REGISTER fixed_literal ) ;
	public final smaliParser.insn_format51l_return insn_format51l() throws RecognitionException {
		smaliParser.insn_format51l_return retval = new smaliParser.insn_format51l_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT51l533=null;
		Token REGISTER534=null;
		Token COMMA535=null;
		ParserRuleReturnScope fixed_literal536 =null;

		CommonTree INSTRUCTION_FORMAT51l533_tree=null;
		CommonTree REGISTER534_tree=null;
		CommonTree COMMA535_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT51l=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT51l");
		RewriteRuleSubtreeStream stream_fixed_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_literal");

		try {
			// smaliParser.g:1149:3: ( INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal -> ^( I_STATEMENT_FORMAT51l[$start, \"I_STATEMENT_FORMAT51l\"] INSTRUCTION_FORMAT51l REGISTER fixed_literal ) )
			// smaliParser.g:1150:5: INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal
			{
			INSTRUCTION_FORMAT51l533=(Token)match(input,INSTRUCTION_FORMAT51l,FOLLOW_INSTRUCTION_FORMAT51l_in_insn_format51l6076);  
			stream_INSTRUCTION_FORMAT51l.add(INSTRUCTION_FORMAT51l533);

			REGISTER534=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format51l6078);  
			stream_REGISTER.add(REGISTER534);

			COMMA535=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format51l6080);  
			stream_COMMA.add(COMMA535);

			pushFollow(FOLLOW_fixed_literal_in_insn_format51l6082);
			fixed_literal536=fixed_literal();
			state._fsp--;

			stream_fixed_literal.add(fixed_literal536.getTree());
			// AST REWRITE
			// elements: REGISTER, INSTRUCTION_FORMAT51l, fixed_literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1151:5: -> ^( I_STATEMENT_FORMAT51l[$start, \"I_STATEMENT_FORMAT51l\"] INSTRUCTION_FORMAT51l REGISTER fixed_literal )
			{
				// smaliParser.g:1151:8: ^( I_STATEMENT_FORMAT51l[$start, \"I_STATEMENT_FORMAT51l\"] INSTRUCTION_FORMAT51l REGISTER fixed_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT51l, (retval.start), "I_STATEMENT_FORMAT51l"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT51l.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_fixed_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format51l"


	public static class insn_array_data_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_array_data_directive"
	// smaliParser.g:1153:1: insn_array_data_directive : ARRAY_DATA_DIRECTIVE parsed_integer_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE -> ^( I_STATEMENT_ARRAY_DATA[$start, \"I_STATEMENT_ARRAY_DATA\"] ^( I_ARRAY_ELEMENT_SIZE parsed_integer_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) ) ;
	public final smaliParser.insn_array_data_directive_return insn_array_data_directive() throws RecognitionException {
		smaliParser.insn_array_data_directive_return retval = new smaliParser.insn_array_data_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ARRAY_DATA_DIRECTIVE537=null;
		Token END_ARRAY_DATA_DIRECTIVE540=null;
		ParserRuleReturnScope parsed_integer_literal538 =null;
		ParserRuleReturnScope fixed_literal539 =null;

		CommonTree ARRAY_DATA_DIRECTIVE537_tree=null;
		CommonTree END_ARRAY_DATA_DIRECTIVE540_tree=null;
		RewriteRuleTokenStream stream_END_ARRAY_DATA_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_ARRAY_DATA_DIRECTIVE");
		RewriteRuleTokenStream stream_ARRAY_DATA_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token ARRAY_DATA_DIRECTIVE");
		RewriteRuleSubtreeStream stream_parsed_integer_literal=new RewriteRuleSubtreeStream(adaptor,"rule parsed_integer_literal");
		RewriteRuleSubtreeStream stream_fixed_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_literal");

		try {
			// smaliParser.g:1154:3: ( ARRAY_DATA_DIRECTIVE parsed_integer_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE -> ^( I_STATEMENT_ARRAY_DATA[$start, \"I_STATEMENT_ARRAY_DATA\"] ^( I_ARRAY_ELEMENT_SIZE parsed_integer_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) ) )
			// smaliParser.g:1154:5: ARRAY_DATA_DIRECTIVE parsed_integer_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE
			{
			ARRAY_DATA_DIRECTIVE537=(Token)match(input,ARRAY_DATA_DIRECTIVE,FOLLOW_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive6109);  
			stream_ARRAY_DATA_DIRECTIVE.add(ARRAY_DATA_DIRECTIVE537);

			pushFollow(FOLLOW_parsed_integer_literal_in_insn_array_data_directive6115);
			parsed_integer_literal538=parsed_integer_literal();
			state._fsp--;

			stream_parsed_integer_literal.add(parsed_integer_literal538.getTree());

			        int elementWidth = (parsed_integer_literal538!=null?((smaliParser.parsed_integer_literal_return)parsed_integer_literal538).value:0);
			        if (elementWidth != 4 && elementWidth != 8 && elementWidth != 1 && elementWidth != 2) {
			            throw new SemanticException(input, (retval.start), "Invalid element width: %d. Must be 1, 2, 4 or 8", elementWidth);
			        }
			    
			// smaliParser.g:1162:5: ( fixed_literal )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( ((LA54_0 >= BOOL_LITERAL && LA54_0 <= BYTE_LITERAL)||LA54_0==CHAR_LITERAL||(LA54_0 >= DOUBLE_LITERAL && LA54_0 <= DOUBLE_LITERAL_OR_ID)||(LA54_0 >= FLOAT_LITERAL && LA54_0 <= FLOAT_LITERAL_OR_ID)||LA54_0==LONG_LITERAL||LA54_0==NEGATIVE_INTEGER_LITERAL||LA54_0==POSITIVE_INTEGER_LITERAL||LA54_0==SHORT_LITERAL) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// smaliParser.g:1162:5: fixed_literal
					{
					pushFollow(FOLLOW_fixed_literal_in_insn_array_data_directive6127);
					fixed_literal539=fixed_literal();
					state._fsp--;

					stream_fixed_literal.add(fixed_literal539.getTree());
					}
					break;

				default :
					break loop54;
				}
			}

			END_ARRAY_DATA_DIRECTIVE540=(Token)match(input,END_ARRAY_DATA_DIRECTIVE,FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive6130);  
			stream_END_ARRAY_DATA_DIRECTIVE.add(END_ARRAY_DATA_DIRECTIVE540);

			// AST REWRITE
			// elements: fixed_literal, parsed_integer_literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1164:5: -> ^( I_STATEMENT_ARRAY_DATA[$start, \"I_STATEMENT_ARRAY_DATA\"] ^( I_ARRAY_ELEMENT_SIZE parsed_integer_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) )
			{
				// smaliParser.g:1164:8: ^( I_STATEMENT_ARRAY_DATA[$start, \"I_STATEMENT_ARRAY_DATA\"] ^( I_ARRAY_ELEMENT_SIZE parsed_integer_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_ARRAY_DATA, (retval.start), "I_STATEMENT_ARRAY_DATA"), root_1);
				// smaliParser.g:1164:67: ^( I_ARRAY_ELEMENT_SIZE parsed_integer_literal )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ARRAY_ELEMENT_SIZE, "I_ARRAY_ELEMENT_SIZE"), root_2);
				adaptor.addChild(root_2, stream_parsed_integer_literal.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// smaliParser.g:1165:8: ^( I_ARRAY_ELEMENTS ( fixed_literal )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ARRAY_ELEMENTS, "I_ARRAY_ELEMENTS"), root_2);
				// smaliParser.g:1165:27: ( fixed_literal )*
				while ( stream_fixed_literal.hasNext() ) {
					adaptor.addChild(root_2, stream_fixed_literal.nextTree());
				}
				stream_fixed_literal.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_array_data_directive"


	public static class insn_packed_switch_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_packed_switch_directive"
	// smaliParser.g:1167:1: insn_packed_switch_directive : PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref )* END_PACKED_SWITCH_DIRECTIVE -> ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_ELEMENTS[$start, \"I_PACKED_SWITCH_ELEMENTS\"] ( label_ref )* ) ) ;
	public final smaliParser.insn_packed_switch_directive_return insn_packed_switch_directive() throws RecognitionException {
		smaliParser.insn_packed_switch_directive_return retval = new smaliParser.insn_packed_switch_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PACKED_SWITCH_DIRECTIVE541=null;
		Token END_PACKED_SWITCH_DIRECTIVE544=null;
		ParserRuleReturnScope fixed_32bit_literal542 =null;
		ParserRuleReturnScope label_ref543 =null;

		CommonTree PACKED_SWITCH_DIRECTIVE541_tree=null;
		CommonTree END_PACKED_SWITCH_DIRECTIVE544_tree=null;
		RewriteRuleTokenStream stream_END_PACKED_SWITCH_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_PACKED_SWITCH_DIRECTIVE");
		RewriteRuleTokenStream stream_PACKED_SWITCH_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token PACKED_SWITCH_DIRECTIVE");
		RewriteRuleSubtreeStream stream_fixed_32bit_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_32bit_literal");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// smaliParser.g:1168:5: ( PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref )* END_PACKED_SWITCH_DIRECTIVE -> ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_ELEMENTS[$start, \"I_PACKED_SWITCH_ELEMENTS\"] ( label_ref )* ) ) )
			// smaliParser.g:1168:9: PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref )* END_PACKED_SWITCH_DIRECTIVE
			{
			PACKED_SWITCH_DIRECTIVE541=(Token)match(input,PACKED_SWITCH_DIRECTIVE,FOLLOW_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive6176);  
			stream_PACKED_SWITCH_DIRECTIVE.add(PACKED_SWITCH_DIRECTIVE541);

			pushFollow(FOLLOW_fixed_32bit_literal_in_insn_packed_switch_directive6182);
			fixed_32bit_literal542=fixed_32bit_literal();
			state._fsp--;

			stream_fixed_32bit_literal.add(fixed_32bit_literal542.getTree());
			// smaliParser.g:1170:5: ( label_ref )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==COLON) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// smaliParser.g:1170:5: label_ref
					{
					pushFollow(FOLLOW_label_ref_in_insn_packed_switch_directive6188);
					label_ref543=label_ref();
					state._fsp--;

					stream_label_ref.add(label_ref543.getTree());
					}
					break;

				default :
					break loop55;
				}
			}

			END_PACKED_SWITCH_DIRECTIVE544=(Token)match(input,END_PACKED_SWITCH_DIRECTIVE,FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive6195);  
			stream_END_PACKED_SWITCH_DIRECTIVE.add(END_PACKED_SWITCH_DIRECTIVE544);

			// AST REWRITE
			// elements: fixed_32bit_literal, label_ref
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1172:5: -> ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_ELEMENTS[$start, \"I_PACKED_SWITCH_ELEMENTS\"] ( label_ref )* ) )
			{
				// smaliParser.g:1172:8: ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_ELEMENTS[$start, \"I_PACKED_SWITCH_ELEMENTS\"] ( label_ref )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_PACKED_SWITCH, (retval.start), "I_STATEMENT_PACKED_SWITCH"), root_1);
				// smaliParser.g:1173:10: ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PACKED_SWITCH_START_KEY, (retval.start), "I_PACKED_SWITCH_START_KEY"), root_2);
				adaptor.addChild(root_2, stream_fixed_32bit_literal.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// smaliParser.g:1174:10: ^( I_PACKED_SWITCH_ELEMENTS[$start, \"I_PACKED_SWITCH_ELEMENTS\"] ( label_ref )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PACKED_SWITCH_ELEMENTS, (retval.start), "I_PACKED_SWITCH_ELEMENTS"), root_2);
				// smaliParser.g:1175:11: ( label_ref )*
				while ( stream_label_ref.hasNext() ) {
					adaptor.addChild(root_2, stream_label_ref.nextTree());
				}
				stream_label_ref.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_packed_switch_directive"


	public static class insn_sparse_switch_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_sparse_switch_directive"
	// smaliParser.g:1178:1: insn_sparse_switch_directive : SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref )* END_SPARSE_SWITCH_DIRECTIVE -> ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] ^( I_SPARSE_SWITCH_ELEMENTS[$start, \"I_SPARSE_SWITCH_ELEMENTS\"] ( fixed_32bit_literal label_ref )* ) ) ;
	public final smaliParser.insn_sparse_switch_directive_return insn_sparse_switch_directive() throws RecognitionException {
		smaliParser.insn_sparse_switch_directive_return retval = new smaliParser.insn_sparse_switch_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SPARSE_SWITCH_DIRECTIVE545=null;
		Token ARROW547=null;
		Token END_SPARSE_SWITCH_DIRECTIVE549=null;
		ParserRuleReturnScope fixed_32bit_literal546 =null;
		ParserRuleReturnScope label_ref548 =null;

		CommonTree SPARSE_SWITCH_DIRECTIVE545_tree=null;
		CommonTree ARROW547_tree=null;
		CommonTree END_SPARSE_SWITCH_DIRECTIVE549_tree=null;
		RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
		RewriteRuleTokenStream stream_SPARSE_SWITCH_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token SPARSE_SWITCH_DIRECTIVE");
		RewriteRuleTokenStream stream_END_SPARSE_SWITCH_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_SPARSE_SWITCH_DIRECTIVE");
		RewriteRuleSubtreeStream stream_fixed_32bit_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_32bit_literal");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// smaliParser.g:1179:3: ( SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref )* END_SPARSE_SWITCH_DIRECTIVE -> ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] ^( I_SPARSE_SWITCH_ELEMENTS[$start, \"I_SPARSE_SWITCH_ELEMENTS\"] ( fixed_32bit_literal label_ref )* ) ) )
			// smaliParser.g:1179:7: SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref )* END_SPARSE_SWITCH_DIRECTIVE
			{
			SPARSE_SWITCH_DIRECTIVE545=(Token)match(input,SPARSE_SWITCH_DIRECTIVE,FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive6269);  
			stream_SPARSE_SWITCH_DIRECTIVE.add(SPARSE_SWITCH_DIRECTIVE545);

			// smaliParser.g:1180:5: ( fixed_32bit_literal ARROW label_ref )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( ((LA56_0 >= BOOL_LITERAL && LA56_0 <= BYTE_LITERAL)||LA56_0==CHAR_LITERAL||(LA56_0 >= FLOAT_LITERAL && LA56_0 <= FLOAT_LITERAL_OR_ID)||LA56_0==LONG_LITERAL||LA56_0==NEGATIVE_INTEGER_LITERAL||LA56_0==POSITIVE_INTEGER_LITERAL||LA56_0==SHORT_LITERAL) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// smaliParser.g:1180:6: fixed_32bit_literal ARROW label_ref
					{
					pushFollow(FOLLOW_fixed_32bit_literal_in_insn_sparse_switch_directive6276);
					fixed_32bit_literal546=fixed_32bit_literal();
					state._fsp--;

					stream_fixed_32bit_literal.add(fixed_32bit_literal546.getTree());
					ARROW547=(Token)match(input,ARROW,FOLLOW_ARROW_in_insn_sparse_switch_directive6278);  
					stream_ARROW.add(ARROW547);

					pushFollow(FOLLOW_label_ref_in_insn_sparse_switch_directive6280);
					label_ref548=label_ref();
					state._fsp--;

					stream_label_ref.add(label_ref548.getTree());
					}
					break;

				default :
					break loop56;
				}
			}

			END_SPARSE_SWITCH_DIRECTIVE549=(Token)match(input,END_SPARSE_SWITCH_DIRECTIVE,FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive6288);  
			stream_END_SPARSE_SWITCH_DIRECTIVE.add(END_SPARSE_SWITCH_DIRECTIVE549);

			// AST REWRITE
			// elements: fixed_32bit_literal, label_ref
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1182:5: -> ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] ^( I_SPARSE_SWITCH_ELEMENTS[$start, \"I_SPARSE_SWITCH_ELEMENTS\"] ( fixed_32bit_literal label_ref )* ) )
			{
				// smaliParser.g:1182:8: ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] ^( I_SPARSE_SWITCH_ELEMENTS[$start, \"I_SPARSE_SWITCH_ELEMENTS\"] ( fixed_32bit_literal label_ref )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_SPARSE_SWITCH, (retval.start), "I_STATEMENT_SPARSE_SWITCH"), root_1);
				// smaliParser.g:1183:8: ^( I_SPARSE_SWITCH_ELEMENTS[$start, \"I_SPARSE_SWITCH_ELEMENTS\"] ( fixed_32bit_literal label_ref )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SPARSE_SWITCH_ELEMENTS, (retval.start), "I_SPARSE_SWITCH_ELEMENTS"), root_2);
				// smaliParser.g:1183:71: ( fixed_32bit_literal label_ref )*
				while ( stream_fixed_32bit_literal.hasNext()||stream_label_ref.hasNext() ) {
					adaptor.addChild(root_2, stream_fixed_32bit_literal.nextTree());
					adaptor.addChild(root_2, stream_label_ref.nextTree());
				}
				stream_fixed_32bit_literal.reset();
				stream_label_ref.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_sparse_switch_directive"

	// Delegated rules


	protected DFA30 dfa30 = new DFA30(this);
	protected DFA40 dfa40 = new DFA40(this);
	protected DFA42 dfa42 = new DFA42(this);
	static final String DFA30_eotS =
		"\62\uffff";
	static final String DFA30_eofS =
		"\62\uffff";
	static final String DFA30_minS =
		"\1\4\57\24\2\uffff";
	static final String DFA30_maxS =
		"\1\u00d4\12\u00c2\1\u00c5\44\u00c2\2\uffff";
	static final String DFA30_acceptS =
		"\60\uffff\1\1\1\2";
	static final String DFA30_specialS =
		"\62\uffff}>";
	static final String[] DFA30_transitionS = {
			"\1\2\1\uffff\1\16\4\uffff\1\10\14\uffff\1\7\17\uffff\1\6\2\uffff\1\21"+
			"\1\22\1\23\1\uffff\1\24\1\uffff\1\25\2\uffff\1\26\1\27\1\30\1\31\1\32"+
			"\1\33\3\uffff\1\34\1\uffff\1\35\1\36\1\37\1\40\1\uffff\1\41\1\42\1\uffff"+
			"\1\43\3\uffff\1\44\1\45\1\uffff\1\46\1\47\1\50\1\51\1\52\1\53\6\uffff"+
			"\1\54\1\55\1\56\136\uffff\1\57\1\uffff\1\17\1\20\1\5\1\11\4\uffff\1\13"+
			"\1\4\1\14\1\uffff\1\12\3\uffff\1\1\5\uffff\1\3\1\15",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61\2\uffff\1\13",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"\1\60\u00ad\uffff\1\61",
			"",
			""
	};

	static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
	static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
	static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
	static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
	static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
	static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
	static final short[][] DFA30_transition;

	static {
		int numStates = DFA30_transitionS.length;
		DFA30_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
		}
	}

	protected class DFA30 extends DFA {

		public DFA30(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 30;
			this.eot = DFA30_eot;
			this.eof = DFA30_eof;
			this.min = DFA30_min;
			this.max = DFA30_max;
			this.accept = DFA30_accept;
			this.special = DFA30_special;
			this.transition = DFA30_transition;
		}
		@Override
		public String getDescription() {
			return "713:7: ( member_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD ( reference_type_descriptor )? member_name nonvoid_type_descriptor ) | member_name method_prototype -> ^( I_ENCODED_METHOD ( reference_type_descriptor )? member_name method_prototype ) )";
		}
	}

	static final String DFA40_eotS =
		"\67\uffff";
	static final String DFA40_eofS =
		"\67\uffff";
	static final String DFA40_minS =
		"\1\4\1\5\1\20\57\24\1\uffff\1\4\1\11\2\uffff";
	static final String DFA40_maxS =
		"\1\u00d4\1\u00cf\1\u00c7\12\u00c2\1\u00c5\44\u00c2\1\uffff\1\u00d4\1\11"+
		"\2\uffff";
	static final String DFA40_acceptS =
		"\62\uffff\1\1\2\uffff\1\2\1\3";
	static final String DFA40_specialS =
		"\67\uffff}>";
	static final String[] DFA40_transitionS = {
			"\1\4\1\uffff\1\20\1\uffff\1\2\2\uffff\1\12\4\uffff\1\1\7\uffff\1\11\17"+
			"\uffff\1\10\2\uffff\1\23\1\24\1\25\1\uffff\1\26\1\uffff\1\27\2\uffff"+
			"\1\30\1\31\1\32\1\33\1\34\1\35\3\uffff\1\36\1\uffff\1\37\1\40\1\41\1"+
			"\42\1\uffff\1\43\1\44\1\uffff\1\45\3\uffff\1\46\1\47\1\uffff\1\50\1\51"+
			"\1\52\1\53\1\54\1\55\6\uffff\1\56\1\57\1\60\136\uffff\1\61\1\uffff\1"+
			"\21\1\22\1\7\1\13\4\uffff\1\15\1\6\1\16\1\uffff\1\14\3\uffff\1\3\5\uffff"+
			"\1\5\1\17",
			"\1\62\1\uffff\1\62\1\uffff\1\63\3\uffff\2\62\5\uffff\1\62\7\uffff\2"+
			"\62\5\uffff\1\62\7\uffff\62\62\132\uffff\3\62\11\uffff\2\62\3\uffff\1"+
			"\62\1\uffff\2\62\2\uffff\2\62",
			"\1\64\u00b6\uffff\1\64",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66\2\uffff\1\15",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"\1\65\u00ad\uffff\1\66",
			"",
			"\1\4\1\uffff\1\20\4\uffff\1\12\14\uffff\1\11\17\uffff\1\10\2\uffff\1"+
			"\23\1\24\1\25\1\uffff\1\26\1\uffff\1\27\2\uffff\1\30\1\31\1\32\1\33\1"+
			"\34\1\35\3\uffff\1\36\1\uffff\1\37\1\40\1\41\1\42\1\uffff\1\43\1\44\1"+
			"\uffff\1\45\3\uffff\1\46\1\47\1\uffff\1\50\1\51\1\52\1\53\1\54\1\55\6"+
			"\uffff\1\56\1\57\1\60\136\uffff\1\61\1\uffff\1\21\1\22\1\7\1\13\4\uffff"+
			"\1\15\1\6\1\16\1\uffff\1\14\3\uffff\1\3\5\uffff\1\5\1\17",
			"\1\63",
			"",
			""
	};

	static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
	static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
	static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
	static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
	static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
	static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
	static final short[][] DFA40_transition;

	static {
		int numStates = DFA40_transitionS.length;
		DFA40_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
		}
	}

	protected class DFA40 extends DFA {

		public DFA40(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 40;
			this.eot = DFA40_eot;
			this.eof = DFA40_eof;
			this.min = DFA40_min;
			this.max = DFA40_max;
			this.accept = DFA40_accept;
			this.special = DFA40_special;
			this.transition = DFA40_transition;
		}
		@Override
		public String getDescription() {
			return "754:1: verification_error_reference : ( CLASS_DESCRIPTOR | field_reference | method_reference );";
		}
	}

	static final String DFA42_eotS =
		"\107\uffff";
	static final String DFA42_eofS =
		"\107\uffff";
	static final String DFA42_minS =
		"\1\5\104\uffff\1\0\1\uffff";
	static final String DFA42_maxS =
		"\1\u00cf\104\uffff\1\0\1\uffff";
	static final String DFA42_acceptS =
		"\1\uffff\1\2\104\uffff\1\1";
	static final String DFA42_specialS =
		"\105\uffff\1\0\1\uffff}>";
	static final String[] DFA42_transitionS = {
			"\1\105\1\uffff\1\1\5\uffff\2\1\5\uffff\1\1\7\uffff\2\1\1\uffff\1\1\3"+
			"\uffff\1\1\7\uffff\62\1\132\uffff\3\1\11\uffff\2\1\3\uffff\1\1\1\uffff"+
			"\2\1\2\uffff\2\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			""
	};

	static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
	static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
	static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
	static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
	static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
	static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
	static final short[][] DFA42_transition;

	static {
		int numStates = DFA42_transitionS.length;
		DFA42_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
		}
	}

	protected class DFA42 extends DFA {

		public DFA42(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 42;
			this.eot = DFA42_eot;
			this.eof = DFA42_eof;
			this.min = DFA42_min;
			this.max = DFA42_max;
			this.accept = DFA42_accept;
			this.special = DFA42_special;
			this.transition = DFA42_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 772:5: ({...}? annotation )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA42_69 = input.LA(1);
						 
						int index42_69 = input.index();
						input.rewind();
						s = -1;
						if ( ((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index42_69);
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 42, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_class_spec_in_smali_file1135 = new BitSet(new long[]{0x0000022000020020L,0x0000000000000000L,0x1000000000000000L,0x0000000000044000L});
	public static final BitSet FOLLOW_super_spec_in_smali_file1146 = new BitSet(new long[]{0x0000022000020020L,0x0000000000000000L,0x1000000000000000L,0x0000000000044000L});
	public static final BitSet FOLLOW_implements_spec_in_smali_file1154 = new BitSet(new long[]{0x0000022000020020L,0x0000000000000000L,0x1000000000000000L,0x0000000000044000L});
	public static final BitSet FOLLOW_source_spec_in_smali_file1163 = new BitSet(new long[]{0x0000022000020020L,0x0000000000000000L,0x1000000000000000L,0x0000000000044000L});
	public static final BitSet FOLLOW_method_in_smali_file1171 = new BitSet(new long[]{0x0000022000020020L,0x0000000000000000L,0x1000000000000000L,0x0000000000044000L});
	public static final BitSet FOLLOW_field_in_smali_file1177 = new BitSet(new long[]{0x0000022000020020L,0x0000000000000000L,0x1000000000000000L,0x0000000000044000L});
	public static final BitSet FOLLOW_annotation_in_smali_file1183 = new BitSet(new long[]{0x0000022000020020L,0x0000000000000000L,0x1000000000000000L,0x0000000000044000L});
	public static final BitSet FOLLOW_EOF_in_smali_file1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_DIRECTIVE_in_class_spec1281 = new BitSet(new long[]{0x0000000000010010L});
	public static final BitSet FOLLOW_access_list_in_class_spec1283 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_class_spec1285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_DIRECTIVE_in_super_spec1303 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_super_spec1305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPLEMENTS_DIRECTIVE_in_implements_spec1324 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_implements_spec1326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_spec1345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_source_spec1347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCESS_SPEC_in_access_list1366 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_FIELD_DIRECTIVE_in_field1397 = new BitSet(new long[]{0xA3F2B90001000850L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_access_list_in_field1399 = new BitSet(new long[]{0xA3F2B90001000850L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_member_name_in_field1401 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_COLON_in_field1403 = new BitSet(new long[]{0x0000000000010100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_field1405 = new BitSet(new long[]{0x0000001008000022L});
	public static final BitSet FOLLOW_EQUAL_in_field1408 = new BitSet(new long[]{0xA3F2B98401819950L,0x000000001C0FD8B7L,0xEC00000000000000L,0x00000000001B32E7L});
	public static final BitSet FOLLOW_literal_in_field1410 = new BitSet(new long[]{0x0000000008000022L});
	public static final BitSet FOLLOW_annotation_in_field1423 = new BitSet(new long[]{0x0000000008000022L});
	public static final BitSet FOLLOW_END_FIELD_DIRECTIVE_in_field1437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DIRECTIVE_in_method1548 = new BitSet(new long[]{0xA3F2B90001000850L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_access_list_in_method1550 = new BitSet(new long[]{0xA3F2B90001000850L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_member_name_in_method1552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_method_prototype_in_method1554 = new BitSet(new long[]{0xFFFFF808301060A0L,0x000000001FFFFFFFL,0x0380000000000000L,0x000000000000CD18L});
	public static final BitSet FOLLOW_statements_and_directives_in_method1556 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_END_METHOD_DIRECTIVE_in_method1562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ordered_method_item_in_statements_and_directives1607 = new BitSet(new long[]{0xFFFFF808101060A2L,0x000000001FFFFFFFL,0x0380000000000000L,0x000000000000CD18L});
	public static final BitSet FOLLOW_registers_directive_in_statements_and_directives1615 = new BitSet(new long[]{0xFFFFF808101060A2L,0x000000001FFFFFFFL,0x0380000000000000L,0x000000000000CD18L});
	public static final BitSet FOLLOW_catch_directive_in_statements_and_directives1623 = new BitSet(new long[]{0xFFFFF808101060A2L,0x000000001FFFFFFFL,0x0380000000000000L,0x000000000000CD18L});
	public static final BitSet FOLLOW_catchall_directive_in_statements_and_directives1631 = new BitSet(new long[]{0xFFFFF808101060A2L,0x000000001FFFFFFFL,0x0380000000000000L,0x000000000000CD18L});
	public static final BitSet FOLLOW_parameter_directive_in_statements_and_directives1639 = new BitSet(new long[]{0xFFFFF808101060A2L,0x000000001FFFFFFFL,0x0380000000000000L,0x000000000000CD18L});
	public static final BitSet FOLLOW_annotation_in_statements_and_directives1647 = new BitSet(new long[]{0xFFFFF808101060A2L,0x000000001FFFFFFFL,0x0380000000000000L,0x000000000000CD18L});
	public static final BitSet FOLLOW_label_in_ordered_method_item1732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_ordered_method_item1738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_debug_directive_in_ordered_method_item1744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive1764 = new BitSet(new long[]{0x0000000000009000L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_integral_literal_in_registers_directive1768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCALS_DIRECTIVE_in_registers_directive1788 = new BitSet(new long[]{0x0000000000009000L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_integral_literal_in_registers_directive1792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAM_LIST_OR_ID_PRIMITIVE_TYPE_in_param_list_or_id1824 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SIMPLE_NAME_in_simple_name1837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCESS_SPEC_in_simple_name1843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERIFICATION_ERROR_TYPE_in_simple_name1854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POSITIVE_INTEGER_LITERAL_in_simple_name1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATIVE_INTEGER_LITERAL_in_simple_name1876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_LITERAL_OR_ID_in_simple_name1887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_LITERAL_OR_ID_in_simple_name1898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_LITERAL_in_simple_name1909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_LITERAL_in_simple_name1920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGISTER_in_simple_name1931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_list_or_id_in_simple_name1942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIMITIVE_TYPE_in_simple_name1952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_TYPE_in_simple_name1963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNOTATION_VISIBILITY_in_simple_name1974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_HANDLE_TYPE_FIELD_in_simple_name1985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_HANDLE_TYPE_METHOD_in_simple_name1991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT10t_in_simple_name1997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_in_simple_name2008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_simple_name2019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT11x_in_simple_name2030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT12x_OR_ID_in_simple_name2041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_simple_name2052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_simple_name2063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_METHOD_HANDLE_in_simple_name2074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_METHOD_TYPE_in_simple_name2085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_simple_name2096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_simple_name2107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21t_in_simple_name2118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_simple_name2129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_simple_name2140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_simple_name2151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_simple_name2162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22s_OR_ID_in_simple_name2173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22t_in_simple_name2184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT23x_in_simple_name2195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT31i_OR_ID_in_simple_name2206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT31t_in_simple_name2217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_CALL_SITE_in_simple_name2228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_simple_name2239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_simple_name2250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_simple_name2261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_simple_name2272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_simple_name2283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT45cc_METHOD_in_simple_name2294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT4rcc_METHOD_in_simple_name2305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT51l_in_simple_name2316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_name_in_member_name2331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEMBER_NAME_in_member_name2337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_PAREN_in_method_prototype2352 = new BitSet(new long[]{0x0000000000090100L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_param_list_in_method_prototype2354 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_CLOSE_PAREN_in_method_prototype2356 = new BitSet(new long[]{0x0000000000010100L,0x0000000000000000L,0x0000000000000000L,0x0000000000100080L});
	public static final BitSet FOLLOW_type_descriptor_in_method_prototype2358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAM_LIST_OR_ID_PRIMITIVE_TYPE_in_param_list_or_id_primitive_type2388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_list_or_id_primitive_type_in_param_list2403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_param_list2410 = new BitSet(new long[]{0x0000000000010102L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_ARRAY_TYPE_PREFIX_in_array_descriptor2421 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_set_in_array_descriptor2423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_TYPE_in_type_descriptor2439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIMITIVE_TYPE_in_type_descriptor2445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_type_descriptor2451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_descriptor_in_type_descriptor2457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIMITIVE_TYPE_in_nonvoid_type_descriptor2467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_nonvoid_type_descriptor2473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_descriptor_in_nonvoid_type_descriptor2479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_reference_type_descriptor2489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_descriptor_in_reference_type_descriptor2495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POSITIVE_INTEGER_LITERAL_in_integer_literal2505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATIVE_INTEGER_LITERAL_in_integer_literal2516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_LITERAL_OR_ID_in_float_literal2531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_LITERAL_in_float_literal2542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_LITERAL_OR_ID_in_double_literal2552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_LITERAL_in_double_literal2563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_LITERAL_in_literal2573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_literal_in_literal2579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_LITERAL_in_literal2585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_LITERAL_in_literal2591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float_literal_in_literal2597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_double_literal_in_literal2603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_literal2609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_literal2615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_LITERAL_in_literal2621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_LITERAL_in_literal2627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_literal_in_literal2633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subannotation_in_literal2639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_field_method_literal_in_literal2645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_literal_in_literal2651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_handle_literal_in_literal2657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_prototype_in_literal2663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_literal_in_parsed_integer_literal2676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_LITERAL_in_integral_literal2688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_literal_in_integral_literal2694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_LITERAL_in_integral_literal2700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_integral_literal2706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_LITERAL_in_integral_literal2712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_32bit_literal2722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_literal_in_fixed_32bit_literal2728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal2734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal2740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float_literal_in_fixed_32bit_literal2746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal2752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal2758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_literal_in_fixed_literal2768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_literal2774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_literal2780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_literal2786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float_literal_in_fixed_literal2792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_double_literal_in_fixed_literal2798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_literal2804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_literal2810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_array_literal2820 = new BitSet(new long[]{0xA3F2B98401859950L,0x000000001C0FD8B7L,0xEC00000000000000L,0x00000000001B32E7L});
	public static final BitSet FOLLOW_literal_in_array_literal2823 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_COMMA_in_array_literal2826 = new BitSet(new long[]{0xA3F2B98401819950L,0x000000001C0FD8B7L,0xEC00000000000000L,0x00000000001B32E7L});
	public static final BitSet FOLLOW_literal_in_array_literal2828 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_array_literal2836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_name_in_annotation_element2860 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_EQUAL_in_annotation_element2862 = new BitSet(new long[]{0xA3F2B98401819950L,0x000000001C0FD8B7L,0xEC00000000000000L,0x00000000001B32E7L});
	public static final BitSet FOLLOW_literal_in_annotation_element2864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_annotation2889 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ANNOTATION_VISIBILITY_in_annotation2891 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_annotation2893 = new BitSet(new long[]{0xA3F2B90003000850L,0x000000001C0FD8B7L,0xE000000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_annotation_element_in_annotation2899 = new BitSet(new long[]{0xA3F2B90003000850L,0x000000001C0FD8B7L,0xE000000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation2902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation2935 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_subannotation2937 = new BitSet(new long[]{0xA3F2B90201000850L,0x000000001C0FD8B7L,0xE000000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_annotation_element_in_subannotation2939 = new BitSet(new long[]{0xA3F2B90201000850L,0x000000001C0FD8B7L,0xE000000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation2942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENUM_DIRECTIVE_in_enum_literal2969 = new BitSet(new long[]{0xA3F2B90001010950L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_field_reference_in_enum_literal2971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_type_descriptor_in_type_field_method_literal2991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_type_descriptor_in_type_field_method_literal3000 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ARROW_in_type_field_method_literal3002 = new BitSet(new long[]{0xA3F2B90001000850L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_member_name_in_type_field_method_literal3014 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_COLON_in_type_field_method_literal3016 = new BitSet(new long[]{0x0000000000010100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal3018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_member_name_in_type_field_method_literal3041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_method_prototype_in_type_field_method_literal3043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIMITIVE_TYPE_in_type_field_method_literal3076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_TYPE_in_type_field_method_literal3082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_name_in_call_site_reference3092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_OPEN_PAREN_in_call_site_reference3094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_call_site_reference3096 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_call_site_reference3098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_method_prototype_in_call_site_reference3100 = new BitSet(new long[]{0x0000000000280000L});
	public static final BitSet FOLLOW_COMMA_in_call_site_reference3103 = new BitSet(new long[]{0xA3F2B98401819950L,0x000000001C0FD8B7L,0xEC00000000000000L,0x00000000001B32E7L});
	public static final BitSet FOLLOW_literal_in_call_site_reference3105 = new BitSet(new long[]{0x0000000000280000L});
	public static final BitSet FOLLOW_CLOSE_PAREN_in_call_site_reference3109 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_AT_in_call_site_reference3111 = new BitSet(new long[]{0xA3F2B90001010950L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_method_reference_in_call_site_reference3113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_HANDLE_TYPE_FIELD_in_method_handle_reference3157 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_AT_in_method_handle_reference3159 = new BitSet(new long[]{0xA3F2B90001010950L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_field_reference_in_method_handle_reference3161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_HANDLE_TYPE_METHOD_in_method_handle_reference3173 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_AT_in_method_handle_reference3175 = new BitSet(new long[]{0xA3F2B90001010950L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_method_reference_in_method_handle_reference3177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_handle_reference_in_method_handle_literal3193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_type_descriptor_in_method_reference3214 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ARROW_in_method_reference3216 = new BitSet(new long[]{0xA3F2B90001000850L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_member_name_in_method_reference3220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_method_prototype_in_method_reference3222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_type_descriptor_in_field_reference3244 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ARROW_in_field_reference3246 = new BitSet(new long[]{0xA3F2B90001000850L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_member_name_in_field_reference3250 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_COLON_in_field_reference3252 = new BitSet(new long[]{0x0000000000010100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_field_reference3254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_label3275 = new BitSet(new long[]{0xA3F2B90001000850L,0x000000001C0FD8B7L,0xE000000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_simple_name_in_label3277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_label_ref3296 = new BitSet(new long[]{0xA3F2B90001000850L,0x000000001C0FD8B7L,0xE000000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_simple_name_in_label_ref3298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGISTER_in_register_list3312 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_COMMA_in_register_list3315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_register_list3317 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_REGISTER_in_register_range3352 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_DOTDOT_in_register_range3355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_register_range3359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_verification_error_reference3388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_reference_in_verification_error_reference3392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_reference_in_verification_error_reference3396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CATCH_DIRECTIVE_in_catch_directive3406 = new BitSet(new long[]{0x0000000000010100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_catch_directive3408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_catch_directive3410 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_label_ref_in_catch_directive3414 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_DOTDOT_in_catch_directive3416 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_label_ref_in_catch_directive3420 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_catch_directive3422 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_label_ref_in_catch_directive3426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive3458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_catchall_directive3460 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_label_ref_in_catchall_directive3464 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_DOTDOT_in_catchall_directive3466 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_label_ref_in_catchall_directive3470 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_catchall_directive3472 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_label_ref_in_catchall_directive3476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive3515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_parameter_directive3517 = new BitSet(new long[]{0x0000000080200022L});
	public static final BitSet FOLLOW_COMMA_in_parameter_directive3520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_parameter_directive3522 = new BitSet(new long[]{0x0000000080000022L});
	public static final BitSet FOLLOW_annotation_in_parameter_directive3533 = new BitSet(new long[]{0x0000000080000022L});
	public static final BitSet FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive3546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_directive_in_debug_directive3619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_local_directive_in_debug_directive3625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_end_local_directive_in_debug_directive3631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restart_local_directive_in_debug_directive3637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_prologue_directive_in_debug_directive3643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_epilogue_directive_in_debug_directive3649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_source_directive_in_debug_directive3655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINE_DIRECTIVE_in_line_directive3665 = new BitSet(new long[]{0x0000000000009000L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_integral_literal_in_line_directive3667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCAL_DIRECTIVE_in_local_directive3690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_local_directive3692 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_COMMA_in_local_directive3695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010001L});
	public static final BitSet FOLLOW_NULL_LITERAL_in_local_directive3698 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_local_directive3704 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_COLON_in_local_directive3707 = new BitSet(new long[]{0x0000000000010100L,0x0000000000000000L,0x0000000000000000L,0x0000000000100080L});
	public static final BitSet FOLLOW_VOID_TYPE_in_local_directive3710 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_local_directive3714 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_COMMA_in_local_directive3748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_local_directive3752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive3794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_end_local_directive3796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive3819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_restart_local_directive3821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive3844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive3865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_directive3886 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_source_directive3888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT12x_in_instruction_format12x3913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT12x_OR_ID_in_instruction_format12x3919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22s_in_instruction_format22s3934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22s_OR_ID_in_instruction_format22s3940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT31i_in_instruction_format31i3955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT31i_OR_ID_in_instruction_format31i3961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format10t_in_instruction3976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format10x_in_instruction3982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format10x_odex_in_instruction3988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format11n_in_instruction3994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format11x_in_instruction4000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format12x_in_instruction4006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format20bc_in_instruction4012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format20t_in_instruction4018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21c_field_in_instruction4024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21c_field_odex_in_instruction4030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21c_method_handle_in_instruction4036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21c_method_type_in_instruction4042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21c_string_in_instruction4048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21c_type_in_instruction4054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21ih_in_instruction4060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21lh_in_instruction4066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21s_in_instruction4072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21t_in_instruction4078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22b_in_instruction4084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22c_field_in_instruction4090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22c_field_odex_in_instruction4096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22c_type_in_instruction4102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22cs_field_in_instruction4108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22s_in_instruction4114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22t_in_instruction4120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22x_in_instruction4126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format23x_in_instruction4132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format30t_in_instruction4138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format31c_in_instruction4144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format31i_in_instruction4150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format31t_in_instruction4156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format32x_in_instruction4162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35c_call_site_in_instruction4168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35c_method_in_instruction4174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35c_type_in_instruction4180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35c_method_odex_in_instruction4186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35mi_method_in_instruction4192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35ms_method_in_instruction4198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rc_call_site_in_instruction4204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rc_method_in_instruction4210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rc_method_odex_in_instruction4216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rc_type_in_instruction4222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rmi_method_in_instruction4228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rms_method_in_instruction4234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format45cc_method_in_instruction4240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format4rcc_method_in_instruction4246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format51l_in_instruction4252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_array_data_directive_in_instruction4258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_packed_switch_directive_in_instruction4264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_sparse_switch_directive_in_instruction4270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT10t_in_insn_format10t4290 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_label_ref_in_insn_format10t4292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_in_insn_format10x4322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_insn_format10x_odex4350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT11n_in_insn_format11n4371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format11n4373 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format11n4375 = new BitSet(new long[]{0x0000000000009000L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_integral_literal_in_insn_format11n4377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT11x_in_insn_format11x4409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format11x4411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_format12x_in_insn_format12x4441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format12x4443 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format12x4445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format12x4447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT20bc_in_insn_format20bc4479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_VERIFICATION_ERROR_TYPE_in_insn_format20bc4481 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format20bc4483 = new BitSet(new long[]{0xA3F2B90001010950L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_verification_error_reference_in_insn_format20bc4485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT20t_in_insn_format20t4522 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_label_ref_in_insn_format20t4524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_insn_format21c_field4554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21c_field4556 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21c_field4558 = new BitSet(new long[]{0xA3F2B90001010950L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_field_reference_in_insn_format21c_field4560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_insn_format21c_field_odex4592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21c_field_odex4594 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21c_field_odex4596 = new BitSet(new long[]{0xA3F2B90001010950L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_field_reference_in_insn_format21c_field_odex4598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_METHOD_HANDLE_in_insn_format21c_method_handle4636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21c_method_handle4638 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21c_method_handle4640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
	public static final BitSet FOLLOW_method_handle_reference_in_insn_format21c_method_handle4642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_METHOD_TYPE_in_insn_format21c_method_type4688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21c_method_type4690 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21c_method_type4692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_method_prototype_in_insn_format21c_method_type4694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_insn_format21c_string4738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21c_string4740 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21c_string4742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_insn_format21c_string4744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_insn_format21c_type4776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21c_type4778 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21c_type4780 = new BitSet(new long[]{0x0000000000010100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_insn_format21c_type4782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21ih_in_insn_format21ih4814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21ih4816 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21ih4818 = new BitSet(new long[]{0x0000018000009800L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_format21ih4820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21lh_in_insn_format21lh4852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21lh4854 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21lh4856 = new BitSet(new long[]{0x0000018000009800L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_format21lh4858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21s_in_insn_format21s4890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21s4892 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21s4894 = new BitSet(new long[]{0x0000000000009000L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_integral_literal_in_insn_format21s4896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21t_in_insn_format21t4928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21t4930 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21t4932 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_label_ref_in_insn_format21t4934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22b_in_insn_format22b4966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22b4968 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22b4970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22b4972 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22b4974 = new BitSet(new long[]{0x0000000000009000L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_integral_literal_in_insn_format22b4976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_insn_format22c_field5010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field5012 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_field5014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field5016 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_field5018 = new BitSet(new long[]{0xA3F2B90001010950L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_field_reference_in_insn_format22c_field5020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_insn_format22c_field_odex5054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field_odex5056 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_field_odex5058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field_odex5060 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_field_odex5062 = new BitSet(new long[]{0xA3F2B90001010950L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_field_reference_in_insn_format22c_field_odex5064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_insn_format22c_type5104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_type5106 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_type5108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_type5110 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_type5112 = new BitSet(new long[]{0x0000000000010100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_insn_format22c_type5114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_insn_format22cs_field5148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22cs_field5150 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22cs_field5152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22cs_field5154 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22cs_field5156 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_FIELD_OFFSET_in_insn_format22cs_field5158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_format22s_in_insn_format22s5179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22s5181 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22s5183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22s5185 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22s5187 = new BitSet(new long[]{0x0000000000009000L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_integral_literal_in_insn_format22s5189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22t_in_insn_format22t5223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22t5225 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22t5227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22t5229 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22t5231 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_label_ref_in_insn_format22t5233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22x_in_insn_format22x5267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22x5269 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22x5271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22x5273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT23x_in_insn_format23x5305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format23x5307 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format23x5309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format23x5311 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format23x5313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format23x5315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT30t_in_insn_format30t5349 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_label_ref_in_insn_format30t5351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT31c_in_insn_format31c5381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format31c5383 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format31c5385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_insn_format31c5387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_format31i_in_insn_format31i5418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format31i5420 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format31i5422 = new BitSet(new long[]{0x0000018000009800L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_format31i5424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT31t_in_insn_format31t5456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format31t5458 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format31t5460 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_label_ref_in_insn_format31t5462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT32x_in_insn_format32x5494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format32x5496 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format32x5498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format32x5500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_CALL_SITE_in_insn_format35c_call_site5537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35c_call_site5539 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_list_in_insn_format35c_call_site5541 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35c_call_site5543 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35c_call_site5545 = new BitSet(new long[]{0xA3F2B90001000850L,0x000000001C0FD8B7L,0xE000000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_call_site_reference_in_insn_format35c_call_site5547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_insn_format35c_method5579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35c_method5581 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_list_in_insn_format35c_method5583 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35c_method5585 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35c_method5587 = new BitSet(new long[]{0xA3F2B90001010950L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_method_reference_in_insn_format35c_method5589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_insn_format35c_type5621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35c_type5623 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_list_in_insn_format35c_type5625 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35c_type5627 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35c_type5629 = new BitSet(new long[]{0x0000000000010100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_insn_format35c_type5631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_insn_format35c_method_odex5663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35c_method_odex5665 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_list_in_insn_format35c_method_odex5667 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35c_method_odex5669 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35c_method_odex5671 = new BitSet(new long[]{0xA3F2B90001010950L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_method_reference_in_insn_format35c_method_odex5673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_insn_format35mi_method5694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35mi_method5696 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_list_in_insn_format35mi_method5698 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35mi_method5700 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35mi_method5702 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INLINE_INDEX_in_insn_format35mi_method5704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_insn_format35ms_method5725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35ms_method5727 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_list_in_insn_format35ms_method5729 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35ms_method5731 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35ms_method5733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_VTABLE_INDEX_in_insn_format35ms_method5735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_CALL_SITE_in_insn_format3rc_call_site5761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rc_call_site5763 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_range_in_insn_format3rc_call_site5765 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rc_call_site5767 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rc_call_site5769 = new BitSet(new long[]{0xA3F2B90001000850L,0x000000001C0FD8B7L,0xE000000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_call_site_reference_in_insn_format3rc_call_site5771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_insn_format3rc_method5803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rc_method5805 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_range_in_insn_format3rc_method5807 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rc_method5809 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rc_method5811 = new BitSet(new long[]{0xA3F2B90001010950L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_method_reference_in_insn_format3rc_method5813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_ODEX_in_insn_format3rc_method_odex5845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rc_method_odex5847 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_list_in_insn_format3rc_method_odex5849 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rc_method_odex5851 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rc_method_odex5853 = new BitSet(new long[]{0xA3F2B90001010950L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_method_reference_in_insn_format3rc_method_odex5855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_insn_format3rc_type5876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rc_type5878 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_range_in_insn_format3rc_type5880 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rc_type5882 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rc_type5884 = new BitSet(new long[]{0x0000000000010100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_insn_format3rc_type5886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rmi_METHOD_in_insn_format3rmi_method5918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rmi_method5920 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_range_in_insn_format3rmi_method5922 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rmi_method5924 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rmi_method5926 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INLINE_INDEX_in_insn_format3rmi_method5928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_insn_format3rms_method5949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rms_method5951 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_range_in_insn_format3rms_method5953 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rms_method5955 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rms_method5957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_VTABLE_INDEX_in_insn_format3rms_method5959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT45cc_METHOD_in_insn_format45cc_method5980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format45cc_method5982 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_list_in_insn_format45cc_method5984 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format45cc_method5986 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format45cc_method5988 = new BitSet(new long[]{0xA3F2B90001010950L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_method_reference_in_insn_format45cc_method5990 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format45cc_method5992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_method_prototype_in_insn_format45cc_method5994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT4rcc_METHOD_in_insn_format4rcc_method6028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format4rcc_method6030 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_range_in_insn_format4rcc_method6032 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format4rcc_method6034 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format4rcc_method6036 = new BitSet(new long[]{0xA3F2B90001010950L,0x000000001C0FD8B7L,0xE800000000000000L,0x00000000001822E1L});
	public static final BitSet FOLLOW_method_reference_in_insn_format4rcc_method6038 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format4rcc_method6040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_method_prototype_in_insn_format4rcc_method6042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT51l_in_insn_format51l6076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format51l6078 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format51l6080 = new BitSet(new long[]{0x0000018001809800L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_fixed_literal_in_insn_format51l6082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive6109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_parsed_integer_literal_in_insn_array_data_directive6115 = new BitSet(new long[]{0x0000018005809800L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_fixed_literal_in_insn_array_data_directive6127 = new BitSet(new long[]{0x0000018005809800L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive6130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive6176 = new BitSet(new long[]{0x0000018000009800L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_packed_switch_directive6182 = new BitSet(new long[]{0x0000000040100000L});
	public static final BitSet FOLLOW_label_ref_in_insn_packed_switch_directive6188 = new BitSet(new long[]{0x0000000040100000L});
	public static final BitSet FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive6195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive6269 = new BitSet(new long[]{0x0000018100009800L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_sparse_switch_directive6276 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ARROW_in_insn_sparse_switch_directive6278 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_label_ref_in_insn_sparse_switch_directive6280 = new BitSet(new long[]{0x0000018100009800L,0x0000000000000000L,0x8400000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive6288 = new BitSet(new long[]{0x0000000000000002L});
}
