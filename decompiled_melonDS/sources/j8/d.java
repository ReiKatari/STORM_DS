package j8;

import android.app.Activity;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import nc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ e B;

    public /* synthetic */ d(e eVar, int i2) {
        this.A = i2;
        this.B = eVar;
    }

    @Override // mc.a
    public final Object b() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Class<?> cls;
        switch (this.A) {
            case 0:
                e eVar = this.B;
                Class<?> loadClass = eVar.f7769c.f5603a.loadClass("androidx.window.extensions.WindowExtensions");
                loadClass.getClass();
                Method method = loadClass.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass2 = eVar.f7767a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass2.getClass();
                method.getClass();
                if (Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(loadClass2)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case DSiCameraSource.FrontCamera /* 1 */:
                Class<?> loadClass3 = this.B.f7767a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                loadClass3.getClass();
                Method method2 = loadClass3.getMethod("getBounds", null);
                Method method3 = loadClass3.getMethod("getType", null);
                Method method4 = loadClass3.getMethod("getState", null);
                method2.getClass();
                Class cls2 = u.a(Rect.class).f10259a;
                cls2.getClass();
                if (method2.getReturnType().equals(cls2) && Modifier.isPublic(method2.getModifiers())) {
                    method3.getClass();
                    Class cls3 = Integer.TYPE;
                    Class cls4 = u.a(cls3).f10259a;
                    cls4.getClass();
                    if (method3.getReturnType().equals(cls4) && Modifier.isPublic(method3.getModifiers())) {
                        method4.getClass();
                        Class cls5 = u.a(cls3).f10259a;
                        cls5.getClass();
                        if (method4.getReturnType().equals(cls5) && Modifier.isPublic(method4.getModifiers())) {
                            z11 = true;
                            return Boolean.valueOf(z11);
                        }
                    }
                }
                z11 = false;
                return Boolean.valueOf(z11);
            case 2:
                ClassLoader classLoader = this.B.f7767a;
                Class<?> loadClass4 = classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                loadClass4.getClass();
                Method method5 = loadClass4.getMethod("getDisplayFoldFeatures", null);
                Type genericReturnType = method5.getGenericReturnType();
                genericReturnType.getClass();
                boolean z14 = false;
                Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                type.getClass();
                Class cls6 = (Class) type;
                if (Modifier.isPublic(method5.getModifiers()) && method5.getReturnType().equals(List.class)) {
                    Class<?> loadClass5 = classLoader.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                    loadClass5.getClass();
                    if (cls6.equals(loadClass5)) {
                        z14 = true;
                    }
                }
                return Boolean.valueOf(z14);
            case 3:
                Class<?> loadClass6 = this.B.f7767a.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                loadClass6.getClass();
                Method method6 = loadClass6.getMethod("getType", null);
                Class cls7 = Integer.TYPE;
                Method method7 = loadClass6.getMethod("hasProperty", cls7);
                Method method8 = loadClass6.getMethod("hasProperties", int[].class);
                method6.getClass();
                if (Modifier.isPublic(method6.getModifiers())) {
                    cls7.getClass();
                    if (method6.getReturnType().equals(cls7)) {
                        method7.getClass();
                        if (Modifier.isPublic(method7.getModifiers())) {
                            Class cls8 = Boolean.TYPE;
                            cls8.getClass();
                            if (method7.getReturnType().equals(cls8)) {
                                method8.getClass();
                                if (Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(cls8)) {
                                    z12 = true;
                                    return Boolean.valueOf(z12);
                                }
                            }
                        }
                    }
                }
                z12 = false;
                return Boolean.valueOf(z12);
            case 4:
                ClassLoader classLoader2 = this.B.f7767a;
                Class<?> loadClass7 = classLoader2.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass7.getClass();
                Method method9 = loadClass7.getMethod("getSupportedWindowFeatures", null);
                method9.getClass();
                if (Modifier.isPublic(method9.getModifiers())) {
                    Class<?> loadClass8 = classLoader2.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                    loadClass8.getClass();
                    if (method9.getReturnType().equals(loadClass8)) {
                        z13 = true;
                        return Boolean.valueOf(z13);
                    }
                }
                z13 = false;
                return Boolean.valueOf(z13);
            case l1.c.f8511g /* 5 */:
                e eVar2 = this.B;
                try {
                    cls = eVar2.f7768b.f5603a.loadClass("java.util.function.Consumer");
                    cls.getClass();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                boolean z15 = false;
                if (cls != null) {
                    Class<?> loadClass9 = eVar2.f7767a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                    loadClass9.getClass();
                    Method method10 = loadClass9.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                    Method method11 = loadClass9.getMethod("removeWindowLayoutInfoListener", cls);
                    method10.getClass();
                    if (Modifier.isPublic(method10.getModifiers())) {
                        method11.getClass();
                        if (Modifier.isPublic(method11.getModifiers())) {
                            z15 = true;
                        }
                    }
                }
                return Boolean.valueOf(z15);
            default:
                return Boolean.valueOf(e.d(this.B));
        }
    }
}
