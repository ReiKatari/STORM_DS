package za;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m9.o;
import p7.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends n {

    /* renamed from: d  reason: collision with root package name */
    public final Method f15001d = Class.class.getMethod("isRecord", null);

    /* renamed from: e  reason: collision with root package name */
    public final Method f15002e = Class.class.getMethod("getRecordComponents", null);

    /* renamed from: f  reason: collision with root package name */
    public final Method f15003f;

    /* renamed from: g  reason: collision with root package name */
    public final Method f15004g;

    public b() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f15003f = cls.getMethod("getName", null);
        this.f15004g = cls.getMethod("getType", null);
    }

    @Override // p7.n
    public final Method j(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e6) {
            o.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
            return null;
        }
    }

    @Override // p7.n
    public final Constructor k(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f15002e.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                clsArr[i2] = (Class) this.f15004g.invoke(objArr[i2], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e6) {
            o.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
            return null;
        }
    }

    @Override // p7.n
    public final String[] l(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f15002e.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                strArr[i2] = (String) this.f15003f.invoke(objArr[i2], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e6) {
            o.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
            return null;
        }
    }

    @Override // p7.n
    public final boolean m(Class cls) {
        try {
            return ((Boolean) this.f15001d.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e6) {
            o.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
            return false;
        }
    }
}
