package xa;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends ua.u {

    /* renamed from: d  reason: collision with root package name */
    public static final i f14496d = new i();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f14497a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f14498b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f14499c = new HashMap();

    public j(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i2 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i2] = field;
                    i2++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i2);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String name = r42.name();
                String str = r42.toString();
                va.b bVar = (va.b) field2.getAnnotation(va.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        this.f14497a.put(str2, r42);
                    }
                }
                this.f14497a.put(name, r42);
                this.f14498b.put(str, r42);
                this.f14499c.put(r42, name);
            }
        } catch (IllegalAccessException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        String b02 = aVar.b0();
        Enum r02 = (Enum) this.f14497a.get(b02);
        if (r02 == null) {
            return (Enum) this.f14498b.get(b02);
        }
        return r02;
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        String str;
        Enum r32 = (Enum) obj;
        if (r32 == null) {
            str = null;
        } else {
            str = (String) this.f14499c.get(r32);
        }
        cVar.Y(str);
    }
}
