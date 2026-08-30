package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x75  reason: default package */
/* loaded from: classes.dex */
public final class x75 extends hi2 {
    public final Method d = Class.class.getMethod("isRecord", null);
    public final Method e = Class.class.getMethod("getRecordComponents", null);
    public final Method f;
    public final Method g;

    public x75() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f = cls.getMethod("getName", null);
        this.g = cls.getMethod("getType", null);
    }

    @Override // defpackage.hi2
    public final boolean F(Class cls) {
        try {
            return ((Boolean) this.d.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            c44.o("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }

    @Override // defpackage.hi2
    public final Method o(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            c44.o("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.hi2
    public final Constructor p(Class cls) {
        try {
            Object[] objArr = (Object[]) this.e.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.g.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            c44.o("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.hi2
    public final String[] y(Class cls) {
        try {
            Object[] objArr = (Object[]) this.e.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            c44.o("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }
}
