// HASH COLLISIONS: YES
// timestamp: 1.668753222785E12

package main;

import com.area9innovation.flow.*;

public class Struct_Choice extends Struct {
	public Object[] f_b;

	public Struct_Choice() {}
	public Struct_Choice(Object[] a_b) {
		f_b = a_b;
	}

	public int getTypeId() { return 15; }
	public String getTypeName() { return "Choice"; }

	private static final String[] field_names = new String[] {
		"b"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_b
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Choice");
		f_b = (Object[])values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 15) return 15-tmp;
		Struct_Choice other = (Struct_Choice)other_gen;
		tmp = FlowRuntime.compareByValue(f_b, other.f_b);
		return tmp;
	}
}
