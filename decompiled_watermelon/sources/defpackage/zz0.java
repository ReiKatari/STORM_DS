package defpackage;

import android.app.Activity;
import java.lang.reflect.Proxy;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zz0  reason: default package */
/* loaded from: classes.dex */
public final class zz0 {
    public final ClassLoader a;

    public zz0(ClassLoader classLoader, int i) {
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

    public yz0 a(Object obj, qo0 qo0Var, Activity activity, v32 v32Var) {
        xz0 xz0Var = new xz0(qo0Var, v32Var);
        ClassLoader classLoader = this.a;
        Class<?> loadClass = classLoader.loadClass("java.util.function.Consumer");
        loadClass.getClass();
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{loadClass}, xz0Var);
        newProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> loadClass2 = classLoader.loadClass("java.util.function.Consumer");
        loadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, loadClass2).invoke(obj, activity, newProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> loadClass3 = classLoader.loadClass("java.util.function.Consumer");
        loadClass3.getClass();
        return new yz0(cls2.getMethod("removeWindowLayoutInfoListener", loadClass3), obj, newProxyInstance);
    }
}
