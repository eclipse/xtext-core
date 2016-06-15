/*
 * generated by Xtext
 */
package org.eclipse.xtext.parsetree.reconstr.parseTreeConstruction;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;

import org.eclipse.xtext.parsetree.reconstr.services.SerializationErrorTestLanguageGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class SerializationErrorTestLanguageParsetreeConstructor extends org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor {
		
	@Inject
	private SerializationErrorTestLanguageGrammarAccess grammarAccess;
	
	@Override
	protected AbstractToken getRootToken(IEObjectConsumer inst) {
		return new ThisRootNode(inst);	
	}
	
protected class ThisRootNode extends RootToken {
	public ThisRootNode(IEObjectConsumer inst) {
		super(inst);
	}
	
	@Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Model_Alternatives(this, this, 0, inst);
			case 1: return new Parenthesis_Group(this, this, 1, inst);
			case 2: return new Test_Alternatives(this, this, 2, inst);
			case 3: return new TwoRequired_Group(this, this, 3, inst);
			case 4: return new TwoOptions_Group(this, this, 4, inst);
			case 5: return new Indent_Group(this, this, 5, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule Model ****************
 *
 * Model:
 * 	test=Test | test=Parenthesis;
 *
 **/

// test=Test | test=Parenthesis
protected class Model_Alternatives extends AlternativesToken {

	public Model_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getModelAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Model_TestAssignment_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Model_TestAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getModelRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// test=Test
protected class Model_TestAssignment_0 extends AssignmentToken  {
	
	public Model_TestAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getModelAccess().getTestAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Test_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("test",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("test");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTestRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getModelAccess().getTestTestParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, consumed);
		}	
	}	
}

// test=Parenthesis
protected class Model_TestAssignment_1 extends AssignmentToken  {
	
	public Model_TestAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getModelAccess().getTestAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Parenthesis_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("test",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("test");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getParenthesisRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getModelAccess().getTestParenthesisParserRuleCall_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, consumed);
		}	
	}	
}


/************ end Rule Model ****************/


/************ begin Rule Parenthesis ****************
 *
 * Parenthesis Test:
 * 	"(" Test ")"
 *
 **/

// "(" Test ")"
protected class Parenthesis_Group extends GroupToken {
	
	public Parenthesis_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getParenthesisAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Parenthesis_RightParenthesisKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getIndentRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getTwoOptionsRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getTwoRequiredRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "("
protected class Parenthesis_LeftParenthesisKeyword_0 extends KeywordToken  {
	
	public Parenthesis_LeftParenthesisKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// Test
protected class Parenthesis_TestParserRuleCall_1 extends RuleCallToken {
	
	public Parenthesis_TestParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getParenthesisAccess().getTestParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Test_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(checkForRecursion(Test_Alternatives.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Parenthesis_LeftParenthesisKeyword_0(lastRuleCallOrigin, next, actIndex, inst);
			default: return null;
		}	
	}	
}

// ")"
protected class Parenthesis_RightParenthesisKeyword_2 extends KeywordToken  {
	
	public Parenthesis_RightParenthesisKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Parenthesis_TestParserRuleCall_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule Parenthesis ****************/


/************ begin Rule Test ****************
 *
 * Test:
 * 	TwoRequired | TwoOptions | Indent;
 *
 **/

// TwoRequired | TwoOptions | Indent
protected class Test_Alternatives extends AlternativesToken {

	public Test_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getTestAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Test_TwoRequiredParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Test_TwoOptionsParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new Test_IndentParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getIndentRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getTwoOptionsRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getTwoRequiredRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// TwoRequired
protected class Test_TwoRequiredParserRuleCall_0 extends RuleCallToken {
	
	public Test_TwoRequiredParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTestAccess().getTwoRequiredParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TwoRequired_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getTwoRequiredRule().getType().getClassifier())
			return null;
		if(checkForRecursion(TwoRequired_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// TwoOptions
protected class Test_TwoOptionsParserRuleCall_1 extends RuleCallToken {
	
	public Test_TwoOptionsParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTestAccess().getTwoOptionsParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TwoOptions_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getTwoOptionsRule().getType().getClassifier())
			return null;
		if(checkForRecursion(TwoOptions_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// Indent
protected class Test_IndentParserRuleCall_2 extends RuleCallToken {
	
	public Test_IndentParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTestAccess().getIndentParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Indent_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getIndentRule().getType().getClassifier())
			return null;
		if(checkForRecursion(Indent_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule Test ****************/


/************ begin Rule TwoRequired ****************
 *
 * TwoRequired:
 * 	"tworequired" one=ID two=ID;
 *
 **/

// "tworequired" one=ID two=ID
protected class TwoRequired_Group extends GroupToken {
	
	public TwoRequired_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTwoRequiredAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TwoRequired_TwoAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getTwoRequiredRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "tworequired"
protected class TwoRequired_TworequiredKeyword_0 extends KeywordToken  {
	
	public TwoRequired_TworequiredKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTwoRequiredAccess().getTworequiredKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// one=ID
protected class TwoRequired_OneAssignment_1 extends AssignmentToken  {
	
	public TwoRequired_OneAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTwoRequiredAccess().getOneAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TwoRequired_TworequiredKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("one",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("one");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getTwoRequiredAccess().getOneIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getTwoRequiredAccess().getOneIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// two=ID
protected class TwoRequired_TwoAssignment_2 extends AssignmentToken  {
	
	public TwoRequired_TwoAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTwoRequiredAccess().getTwoAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TwoRequired_OneAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("two",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("two");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getTwoRequiredAccess().getTwoIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getTwoRequiredAccess().getTwoIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule TwoRequired ****************/


/************ begin Rule TwoOptions ****************
 *
 * TwoOptions:
 * 	"twooptions" ("one" one=ID | "two" two=ID);
 *
 **/

// "twooptions" ("one" one=ID | "two" two=ID)
protected class TwoOptions_Group extends GroupToken {
	
	public TwoOptions_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTwoOptionsAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TwoOptions_Alternatives_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getTwoOptionsRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "twooptions"
protected class TwoOptions_TwooptionsKeyword_0 extends KeywordToken  {
	
	public TwoOptions_TwooptionsKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTwoOptionsAccess().getTwooptionsKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// ("one" one=ID | "two" two=ID)
protected class TwoOptions_Alternatives_1 extends AlternativesToken {

	public TwoOptions_Alternatives_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getTwoOptionsAccess().getAlternatives_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TwoOptions_Group_1_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new TwoOptions_Group_1_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "one" one=ID
protected class TwoOptions_Group_1_0 extends GroupToken {
	
	public TwoOptions_Group_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTwoOptionsAccess().getGroup_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TwoOptions_OneAssignment_1_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "one"
protected class TwoOptions_OneKeyword_1_0_0 extends KeywordToken  {
	
	public TwoOptions_OneKeyword_1_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTwoOptionsAccess().getOneKeyword_1_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TwoOptions_TwooptionsKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// one=ID
protected class TwoOptions_OneAssignment_1_0_1 extends AssignmentToken  {
	
	public TwoOptions_OneAssignment_1_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTwoOptionsAccess().getOneAssignment_1_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TwoOptions_OneKeyword_1_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("one",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("one");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getTwoOptionsAccess().getOneIDTerminalRuleCall_1_0_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getTwoOptionsAccess().getOneIDTerminalRuleCall_1_0_1_0();
			return obj;
		}
		return null;
	}

}


// "two" two=ID
protected class TwoOptions_Group_1_1 extends GroupToken {
	
	public TwoOptions_Group_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTwoOptionsAccess().getGroup_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TwoOptions_TwoAssignment_1_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "two"
protected class TwoOptions_TwoKeyword_1_1_0 extends KeywordToken  {
	
	public TwoOptions_TwoKeyword_1_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTwoOptionsAccess().getTwoKeyword_1_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TwoOptions_TwooptionsKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// two=ID
protected class TwoOptions_TwoAssignment_1_1_1 extends AssignmentToken  {
	
	public TwoOptions_TwoAssignment_1_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTwoOptionsAccess().getTwoAssignment_1_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TwoOptions_TwoKeyword_1_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("two",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("two");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getTwoOptionsAccess().getTwoIDTerminalRuleCall_1_1_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getTwoOptionsAccess().getTwoIDTerminalRuleCall_1_1_1_0();
			return obj;
		}
		return null;
	}

}




/************ end Rule TwoOptions ****************/


/************ begin Rule Indent ****************
 *
 * / * SuppressWarnings[noInstantiation] * / Indent:
 * 	"{" req=TwoRequired? opt=TwoOptions? indent+=Indent* "}";
 *
 **/

// "{" req=TwoRequired? opt=TwoOptions? indent+=Indent* "}"
protected class Indent_Group extends GroupToken {
	
	public Indent_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getIndentAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Indent_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getIndentRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "{"
protected class Indent_LeftCurlyBracketKeyword_0 extends KeywordToken  {
	
	public Indent_LeftCurlyBracketKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getIndentAccess().getLeftCurlyBracketKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// req=TwoRequired?
protected class Indent_ReqAssignment_1 extends AssignmentToken  {
	
	public Indent_ReqAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIndentAccess().getReqAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TwoRequired_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("req",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("req");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTwoRequiredRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getIndentAccess().getReqTwoRequiredParserRuleCall_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Indent_LeftCurlyBracketKeyword_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// opt=TwoOptions?
protected class Indent_OptAssignment_2 extends AssignmentToken  {
	
	public Indent_OptAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIndentAccess().getOptAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TwoOptions_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("opt",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("opt");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTwoOptionsRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getIndentAccess().getOptTwoOptionsParserRuleCall_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Indent_ReqAssignment_1(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new Indent_LeftCurlyBracketKeyword_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// indent+=Indent*
protected class Indent_IndentAssignment_3 extends AssignmentToken  {
	
	public Indent_IndentAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIndentAccess().getIndentAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Indent_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("indent",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("indent");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getIndentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getIndentAccess().getIndentIndentParserRuleCall_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Indent_IndentAssignment_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new Indent_OptAssignment_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 2: return new Indent_ReqAssignment_1(lastRuleCallOrigin, next, actIndex, consumed);
			case 3: return new Indent_LeftCurlyBracketKeyword_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class Indent_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public Indent_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getIndentAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Indent_IndentAssignment_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Indent_OptAssignment_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new Indent_ReqAssignment_1(lastRuleCallOrigin, this, 2, inst);
			case 3: return new Indent_LeftCurlyBracketKeyword_0(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}


/************ end Rule Indent ****************/

}
