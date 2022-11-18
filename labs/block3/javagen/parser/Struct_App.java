// HASH COLLISIONS: YES
// timestamp: 1.667742586212E12

package parser;

import com.area9innovation.flow.*;

public class Struct_App extends Struct {
	public Struct_Var f_a;
	public Struct_Int f_i;

	public Struct_App() {}
	public Struct_App(Struct_Var a_a, Struct_Int a_i) {
		f_a = a_a;
		f_i = a_i;
	}

	public int getTypeId() { return 8; }
	public String getTypeName() { return "App"; }

	private static final String[] field_names = new String[] {
		"a", "i"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_a, f_i
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in App");
		f_a = (Struct_Var)values[0];
		f_i = (Struct_Int)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 8) return 8-tmp;
		Struct_App other = (Struct_App)other_gen;
		tmp = f_a.compareTo(other.f_a);
		if (tmp != 0) return tmp;
		tmp = f_i.compareTo(other.f_i);
		return tmp;
	}
}