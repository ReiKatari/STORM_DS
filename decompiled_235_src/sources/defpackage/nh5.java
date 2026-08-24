package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nh5  reason: default package */
/* loaded from: classes.dex */
public final class nh5 extends uj2 {
    public final Method h = Class.class.getMethod("isRecord", null);
    public final Method i = Class.class.getMethod("getRecordComponents", null);
    public final Method j;
    public final Method k;

    public nh5() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.j = cls.getMethod("getName", null);
        this.k = cls.getMethod("getType", null);
    }

    @Override // defpackage.uj2
    public final Method E(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            u34.p("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.uj2
    public final Constructor F(Class cls) {
        try {
            Object[] objArr = (Object[]) this.i.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.k.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            u34.p("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.uj2
    public final String[] M(Class cls) {
        try {
            Object[] objArr = (Object[]) this.i.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.j.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            u34.p("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.uj2
    public final boolean Y(Class cls) {
        try {
            return ((Boolean) this.h.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            u34.p("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }
}
