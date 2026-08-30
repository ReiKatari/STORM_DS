package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e85  reason: default package */
/* loaded from: classes.dex */
public final class e85 extends b85 {
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
        hashMap.put(Float.TYPE, Float.valueOf((float) RecyclerView.A1));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        e = hashMap;
    }

    public e85(Class cls, d85 d85Var, boolean z) {
        super(d85Var);
        this.d = new HashMap();
        hi2 hi2Var = y75.a;
        Constructor p = hi2Var.p(cls);
        this.b = p;
        if (z) {
            f85.b(null, p);
        } else {
            y75.f(p);
        }
        String[] y = hi2Var.y(cls);
        for (int i = 0; i < y.length; i++) {
            this.d.put(y[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        this.c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.c[i2] = e.get(parameterTypes[i2]);
        }
    }

    @Override // defpackage.b85
    public final Object d() {
        return (Object[]) this.c.clone();
    }

    @Override // defpackage.b85
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            hi2 hi2Var = y75.a;
            c44.o("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            String b = y75.b(constructor);
            String arrays = Arrays.toString(objArr);
            throw new RuntimeException("Failed to invoke constructor '" + b + "' with args " + arrays, e);
        } catch (InstantiationException e4) {
            e = e4;
            String b2 = y75.b(constructor);
            String arrays2 = Arrays.toString(objArr);
            throw new RuntimeException("Failed to invoke constructor '" + b2 + "' with args " + arrays2, e);
        } catch (InvocationTargetException e5) {
            c44.o("Failed to invoke constructor '" + y75.b(constructor) + "' with args " + Arrays.toString(objArr), e5.getCause());
            return null;
        }
    }

    @Override // defpackage.b85
    public final void f(Object obj, o83 o83Var, a85 a85Var) {
        Object[] objArr = (Object[]) obj;
        String str = a85Var.c;
        Integer num = (Integer) this.d.get(str);
        if (num != null) {
            int intValue = num.intValue();
            Object b = a85Var.g.b(o83Var);
            if (b == null && a85Var.h) {
                StringBuilder u = b31.u("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                u.append(o83Var.D());
                throw new RuntimeException(u.toString());
            }
            objArr[intValue] = b;
            return;
        }
        String b2 = y75.b(this.b);
        throw new IllegalStateException("Could not find the index in the constructor '" + b2 + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }
}
