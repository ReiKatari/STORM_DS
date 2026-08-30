package g8;

import android.app.Activity;
import gk.s0;
import h8.d;
import java.lang.reflect.Proxy;
import l8.b;
import me.magnum.melonds.common.camera.DSiCameraSource;
import nc.e;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f5603a;

    public a(ClassLoader classLoader, int i2) {
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                classLoader.getClass();
                this.f5603a = classLoader;
                return;
            default:
                this.f5603a = classLoader;
                return;
        }
    }

    public d a(Object obj, e eVar, Activity activity, b bVar) {
        s0 s0Var = new s0(eVar, bVar);
        ClassLoader classLoader = this.f5603a;
        Class<?> loadClass = classLoader.loadClass("java.util.function.Consumer");
        loadClass.getClass();
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{loadClass}, s0Var);
        newProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> loadClass2 = classLoader.loadClass("java.util.function.Consumer");
        loadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, loadClass2).invoke(obj, activity, newProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> loadClass3 = classLoader.loadClass("java.util.function.Consumer");
        loadClass3.getClass();
        return new d(cls2.getMethod("removeWindowLayoutInfoListener", loadClass3), obj, newProxyInstance);
    }
}
