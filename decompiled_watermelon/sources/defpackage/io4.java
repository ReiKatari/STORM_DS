package defpackage;

import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: io4  reason: default package */
/* loaded from: classes.dex */
public abstract class io4 {
    public static final Method a;
    public static final Method b;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 < length) {
                method2 = methods[i2];
                if (b53.x(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length == 1) {
                        cls = parameterTypes[0];
                    } else {
                        cls = null;
                    }
                    if (b53.x(cls, Throwable.class)) {
                        break;
                    }
                }
                i2++;
            } else {
                method2 = null;
                break;
            }
        }
        a = method2;
        int length2 = methods.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            Method method3 = methods[i];
            if (b53.x(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        b = method;
    }
}
