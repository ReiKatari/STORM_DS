package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uh5  reason: default package */
/* loaded from: classes.dex */
public final class uh5 extends rh5 {
    public static final HashMap e;
    public final Constructor b;
    public final Object[] c;
    public final HashMap d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf((float) RecyclerView.B1));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        e = hashMap;
    }

    public uh5(Class cls, th5 th5Var, boolean z) {
        super(th5Var);
        this.d = new HashMap();
        uj2 uj2Var = oh5.a;
        Constructor F = uj2Var.F(cls);
        this.b = F;
        if (z) {
            vh5.b(null, F);
        } else {
            oh5.f(F);
        }
        String[] M = uj2Var.M(cls);
        for (int i = 0; i < M.length; i++) {
            this.d.put(M[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        this.c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.c[i2] = e.get(parameterTypes[i2]);
        }
    }

    @Override // defpackage.rh5
    public final Object d() {
        return (Object[]) this.c.clone();
    }

    @Override // defpackage.rh5
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            uj2 uj2Var = oh5.a;
            u34.p("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            String b = oh5.b(constructor);
            String arrays = Arrays.toString(objArr);
            throw new RuntimeException("Failed to invoke constructor '" + b + "' with args " + arrays, e);
        } catch (InstantiationException e4) {
            e = e4;
            String b2 = oh5.b(constructor);
            String arrays2 = Arrays.toString(objArr);
            throw new RuntimeException("Failed to invoke constructor '" + b2 + "' with args " + arrays2, e);
        } catch (InvocationTargetException e5) {
            u34.p("Failed to invoke constructor '" + oh5.b(constructor) + "' with args " + Arrays.toString(objArr), e5.getCause());
            return null;
        }
    }

    @Override // defpackage.rh5
    public final void f(Object obj, hf3 hf3Var, qh5 qh5Var) {
        Object[] objArr = (Object[]) obj;
        String str = qh5Var.c;
        Integer num = (Integer) this.d.get(str);
        if (num != null) {
            int intValue = num.intValue();
            Object b = qh5Var.g.b(hf3Var);
            if (b == null && qh5Var.h) {
                StringBuilder t = i61.t("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                t.append(hf3Var.x());
                throw new RuntimeException(t.toString());
            }
            objArr[intValue] = b;
            return;
        }
        String b2 = oh5.b(this.b);
        throw new IllegalStateException("Could not find the index in the constructor '" + b2 + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }
}
