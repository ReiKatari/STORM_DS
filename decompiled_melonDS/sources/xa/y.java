package xa;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends v {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f14527e;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor f14528b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f14529c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f14530d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        f14527e = hashMap;
    }

    public y(Class cls, x xVar, boolean z10) {
        super(xVar);
        this.f14530d = new HashMap();
        p7.n nVar = za.c.f15005a;
        Constructor k10 = nVar.k(cls);
        this.f14528b = k10;
        if (z10) {
            z.b(null, k10);
        } else {
            za.c.f(k10);
        }
        String[] l10 = nVar.l(cls);
        for (int i2 = 0; i2 < l10.length; i2++) {
            this.f14530d.put(l10[i2], Integer.valueOf(i2));
        }
        Class<?>[] parameterTypes = this.f14528b.getParameterTypes();
        this.f14529c = new Object[parameterTypes.length];
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            this.f14529c[i10] = f14527e.get(parameterTypes[i10]);
        }
    }

    @Override // xa.v
    public final Object d() {
        return (Object[]) this.f14529c.clone();
    }

    @Override // xa.v
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f14528b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e6) {
            p7.n nVar = za.c.f15005a;
            m9.o.m("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
            return null;
        } catch (IllegalArgumentException e10) {
            e = e10;
            String b10 = za.c.b(constructor);
            String arrays = Arrays.toString(objArr);
            throw new RuntimeException("Failed to invoke constructor '" + b10 + "' with args " + arrays, e);
        } catch (InstantiationException e11) {
            e = e11;
            String b102 = za.c.b(constructor);
            String arrays2 = Arrays.toString(objArr);
            throw new RuntimeException("Failed to invoke constructor '" + b102 + "' with args " + arrays2, e);
        } catch (InvocationTargetException e12) {
            m9.o.m("Failed to invoke constructor '" + za.c.b(constructor) + "' with args " + Arrays.toString(objArr), e12.getCause());
            return null;
        }
    }

    @Override // xa.v
    public final void f(Object obj, cb.a aVar, u uVar) {
        Object[] objArr = (Object[]) obj;
        String str = uVar.f14515c;
        Integer num = (Integer) this.f14530d.get(str);
        if (num != null) {
            int intValue = num.intValue();
            Object b10 = uVar.f14519g.b(aVar);
            if (b10 == null && uVar.f14520h) {
                StringBuilder u4 = w.d.u("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                u4.append(aVar.B(false));
                throw new RuntimeException(u4.toString());
            }
            objArr[intValue] = b10;
            return;
        }
        String b11 = za.c.b(this.f14528b);
        throw new IllegalStateException("Could not find the index in the constructor '" + b11 + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }
}
