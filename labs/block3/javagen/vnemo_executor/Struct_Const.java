// HASH COLLISIONS: YES
// timestamp: 1.668108779018E12

package vnemo_executor;

import com.area9innovation.flow.*;

public class Struct_Const extends Struct {
	public int f_i;

	public Struct_Const() {}
	public Struct_Const(int a_i) {
		f_i = a_i;
	}

	public int getTypeId() { return 18; }
	public String getTypeName() { return "Const"; }

	private static final String[] field_names = new String[] {
		"i"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_i
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Const");
		f_i = (Integer)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 18) return 18-tmp;
		Struct_Const other = (Struct_Const)other_gen;
		if (f_i != other.f_i)
			return (f_i > other.f_i) ? 1 : -1;
		return 0;
	}
}
