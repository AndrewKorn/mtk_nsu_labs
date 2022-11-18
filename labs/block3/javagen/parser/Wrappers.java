// HASH COLLISIONS: YES
// timestamp: 1.667742586227E12

package parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
public final class Wrappers {

	// Functional wrappers for methods: 8
	static Func1<String,Struct> w_action2string = Module_peg::f_action2string;
	static Func1<Struct_Production,Struct_Production> w_optimizeProduction = Module_optimize_grammar::f_optimizeProduction;
	static Func1<String,Object> w_toString = Module_dynamic::f_toString;
	static Func1<Struct_Production,Struct_Production> w_renameBindingsInProduction = Module_rename_bindings::f_renameBindingsInProduction;
	static Func1<Struct_Seq,Struct_Seq> w_renameBindingsInChoice = Module_rename_bindings::f_renameBindingsInChoice;
	static Func1<Struct_Union,Object[]> w_BuildUnion = Module_parser::f_BuildUnion;
	static Func1<Struct_Sequence,Object[]> w_BuildSeq = Module_parser::f_BuildSeq;
	static Func1<Struct_Sequence,Object[]> w_BuildWhile = Module_parser::f_BuildWhile;
}
