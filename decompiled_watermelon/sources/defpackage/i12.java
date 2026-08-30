package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i12  reason: default package */
/* loaded from: classes.dex */
public final class i12 extends dz6 {
    public static final h12 d = new h12();
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;

    public i12(Class cls) {
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
                r06 r06Var = (r06) field2.getAnnotation(r06.class);
                if (r06Var != null) {
                    name = r06Var.value();
                    for (String str2 : r06Var.alternate()) {
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

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        if (o83Var.n0() == q83.NULL) {
            o83Var.j0();
            return null;
        }
        String l0 = o83Var.l0();
        Enum r0 = (Enum) this.a.get(l0);
        if (r0 == null) {
            return (Enum) this.b.get(l0);
        }
        return r0;
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        String str;
        Enum r2 = (Enum) obj;
        if (r2 == null) {
            str = null;
        } else {
            str = (String) this.c.get(r2);
        }
        b93Var.Z(str);
    }
}
