/*
 * generated by Xtext
 */
grammar DebugInternalAssignmentsTestLanguage ;

// Rule Model
ruleModel :
	'simple' (
		ruleSingleValue |
		ruleMultiValue |
		ruleSingleDatatype |
		ruleMultiDatatype
	) |
	'complex' (
		ruleSingleValue |
		ruleMultiValue |
		ruleSingleDatatype |
		ruleMultiDatatype
	)
;

// Rule SingleValue
ruleSingleValue :
	'id' RULE_ID |
	'alternative' (
		RULE_ID |
		RULE_STRING
	) |
	'string' RULE_STRING
;

// Rule MultiValue
ruleMultiValue :
	'ids' RULE_ID |
	'alternatives' (
		RULE_ID |
		RULE_STRING
	) |
	'strings' RULE_STRING
;

// Rule SingleDatatype
ruleSingleDatatype :
	'datatypeid' ruleIdDatatype |
	'datatypealternative' (
		ruleIdDatatype |
		ruleStringDatatype
	) |
	'datatypestring' ruleStringDatatype
;

// Rule MultiDatatype
ruleMultiDatatype :
	'datatypeids' ruleIdDatatype |
	'datatypealternatives' (
		ruleIdDatatype |
		ruleStringDatatype
	) |
	'datatypestrings' ruleStringDatatype
;

// Rule IdDatatype
ruleIdDatatype :
	RULE_ID
;

// Rule StringDatatype
ruleStringDatatype :
	RULE_STRING
;

RULE_ID :
	'^'? (
		'a' .. 'z' |
		'A' .. 'Z' |
		'_'
	) (
		'a' .. 'z' |
		'A' .. 'Z' |
		'_' |
		'0' .. '9'
	)*
;

RULE_INT :
	'0' .. '9'+
;

RULE_STRING :
	'"' (
		'\\' . |
		~ (
			'\\' |
			'"'
		)
	)* '"' |
	'\'' (
		'\\' . |
		~ (
			'\\' |
			'\''
		)
	)* '\''
;

RULE_ML_COMMENT :
	'/*' (
		options { greedy = false ; } : .
	)* '*/' { skip(); }
;

RULE_SL_COMMENT :
	'//' ~ (
		'\n' |
		'\r'
	)* (
		'\r'? '\n'
	)? { skip(); }
;

RULE_WS :
	(
		' ' |
		'\t' |
		'\r' |
		'\n'
	)+ { skip(); }
;

RULE_ANY_OTHER :
	.
;