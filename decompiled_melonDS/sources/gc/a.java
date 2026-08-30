package gc;

import java.lang.reflect.Method;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f5636a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f5637b;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i2 = 0;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 < length) {
                method2 = methods[i10];
                if (k.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length == 1) {
                        cls = parameterTypes[0];
                    } else {
                        cls = null;
                    }
                    if (k.a(cls, Throwable.class)) {
                        break;
                    }
                }
                i10++;
            } else {
                method2 = null;
                break;
            }
        }
        f5636a = method2;
        int length2 = methods.length;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            Method method3 = methods[i2];
            if (k.a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i2++;
        }
        f5637b = method;
    }
}
