package defpackage;

import android.app.Activity;
import java.lang.reflect.Proxy;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e31  reason: default package */
/* loaded from: classes.dex */
public final class e31 {
    public final ClassLoader a;

    public e31(ClassLoader classLoader, int i) {
        switch (i) {
            case 1:
                this.a = classLoader;
                return;
            default:
                classLoader.getClass();
                this.a = classLoader;
                return;
        }
    }

    public d31 a(Object obj, ar0 ar0Var, Activity activity, n82 n82Var) {
        c31 c31Var = new c31(ar0Var, n82Var);
        ClassLoader classLoader = this.a;
        Class<?> loadClass = classLoader.loadClass("java.util.function.Consumer");
        loadClass.getClass();
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{loadClass}, c31Var);
        newProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> loadClass2 = classLoader.loadClass("java.util.function.Consumer");
        loadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, loadClass2).invoke(obj, activity, newProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> loadClass3 = classLoader.loadClass("java.util.function.Consumer");
        loadClass3.getClass();
        return new d31(cls2.getMethod("removeWindowLayoutInfoListener", loadClass3), obj, newProxyInstance);
    }
}
