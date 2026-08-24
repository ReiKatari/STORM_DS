package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x52  reason: default package */
/* loaded from: classes.dex */
public final class x52 extends yc7 {
    public static final w52 d = new w52();
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;

    public x52(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            int ceil = (int) Math.ceil(i / 0.75f);
            this.a = new HashMap(ceil);
            this.b = new HashMap(ceil);
            this.c = new HashMap(ceil);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String name = r4.name();
                String str = r4.toString();
                gc6 gc6Var = (gc6) field2.getAnnotation(gc6.class);
                if (gc6Var != null) {
                    name = gc6Var.value();
                    for (String str2 : gc6Var.alternate()) {
                        this.a.put(str2, r4);
                    }
                }
                this.a.put(name, r4);
                this.b.put(str, r4);
                this.c.put(r4, name);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        if (hf3Var.n0() == jf3.NULL) {
            hf3Var.j0();
            return null;
        }
        String l0 = hf3Var.l0();
        Enum r0 = (Enum) this.a.get(l0);
        if (r0 == null) {
            return (Enum) this.b.get(l0);
        }
        return r0;
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        String str;
        Enum r2 = (Enum) obj;
        if (r2 == null) {
            str = null;
        } else {
            str = (String) this.c.get(r2);
        }
        vf3Var.c0(str);
    }
}
