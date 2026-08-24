package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w36  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w36 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ x36 B;

    public /* synthetic */ w36(x36 x36Var, int i) {
        this.A = i;
        this.B = x36Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
        if (java.lang.reflect.Modifier.isPublic(r9.getModifiers()) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
        if (r0.getReturnType().equals(r9) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0111, code lost:
        if (r9.getReturnType().equals(r0) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x015e, code lost:
        if (r1.equals(r9) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e2, code lost:
        if (java.lang.reflect.Modifier.isPublic(r9.getModifiers()) != false) goto L64;
     */
    @Override // defpackage.on2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c() {
        int i = this.A;
        Class cls = Integer.TYPE;
        boolean z = true;
        Class<?> cls2 = null;
        boolean z2 = false;
        x36 x36Var = this.B;
        switch (i) {
            case 0:
                Class<?> loadClass = x36Var.c.a.loadClass("androidx.window.extensions.WindowExtensions");
                loadClass.getClass();
                Method method = loadClass.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass2 = x36Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass2.getClass();
                method.getClass();
                if (!Modifier.isPublic(method.getModifiers()) || !method.getReturnType().equals(loadClass2)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Class<?> loadClass3 = x36Var.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                loadClass3.getClass();
                Method method2 = loadClass3.getMethod("getBounds", null);
                Method method3 = loadClass3.getMethod("getType", null);
                Method method4 = loadClass3.getMethod("getState", null);
                method2.getClass();
                Class cls3 = gh5.a(Rect.class).a;
                cls3.getClass();
                if (method2.getReturnType().equals(cls3) && Modifier.isPublic(method2.getModifiers())) {
                    method3.getClass();
                    Class cls4 = gh5.a(cls).a;
                    cls4.getClass();
                    if (method3.getReturnType().equals(cls4) && Modifier.isPublic(method3.getModifiers())) {
                        method4.getClass();
                        Class cls5 = gh5.a(cls).a;
                        cls5.getClass();
                        if (method4.getReturnType().equals(cls5)) {
                            break;
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 2:
                ClassLoader classLoader = x36Var.a;
                Class<?> loadClass4 = classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                loadClass4.getClass();
                Method method5 = loadClass4.getMethod("getDisplayFoldFeatures", null);
                Type genericReturnType = method5.getGenericReturnType();
                genericReturnType.getClass();
                Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                type.getClass();
                Class cls6 = (Class) type;
                if (Modifier.isPublic(method5.getModifiers()) && method5.getReturnType().equals(List.class)) {
                    Class<?> loadClass5 = classLoader.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                    loadClass5.getClass();
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 3:
                Class<?> loadClass6 = x36Var.a.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                loadClass6.getClass();
                Method method6 = loadClass6.getMethod("getType", null);
                Method method7 = loadClass6.getMethod("hasProperty", cls);
                Method method8 = loadClass6.getMethod("hasProperties", int[].class);
                method6.getClass();
                if (Modifier.isPublic(method6.getModifiers())) {
                    cls.getClass();
                    if (method6.getReturnType().equals(cls)) {
                        method7.getClass();
                        if (Modifier.isPublic(method7.getModifiers())) {
                            Class cls7 = Boolean.TYPE;
                            cls7.getClass();
                            if (method7.getReturnType().equals(cls7)) {
                                method8.getClass();
                                if (Modifier.isPublic(method8.getModifiers())) {
                                    break;
                                }
                            }
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 4:
                ClassLoader classLoader2 = x36Var.a;
                Class<?> loadClass7 = classLoader2.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass7.getClass();
                Method method9 = loadClass7.getMethod("getSupportedWindowFeatures", null);
                method9.getClass();
                if (Modifier.isPublic(method9.getModifiers())) {
                    Class<?> loadClass8 = classLoader2.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                    loadClass8.getClass();
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 5:
                try {
                    Class<?> loadClass9 = x36Var.b.a.loadClass("java.util.function.Consumer");
                    loadClass9.getClass();
                    cls2 = loadClass9;
                } catch (ClassNotFoundException unused) {
                }
                if (cls2 != null) {
                    Class<?> loadClass10 = x36Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                    loadClass10.getClass();
                    Method method10 = loadClass10.getMethod("addWindowLayoutInfoListener", Activity.class, cls2);
                    Method method11 = loadClass10.getMethod("removeWindowLayoutInfoListener", cls2);
                    method10.getClass();
                    if (Modifier.isPublic(method10.getModifiers())) {
                        method11.getClass();
                        break;
                    }
                    z = false;
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            default:
                return Boolean.valueOf(x36.d(x36Var));
        }
    }
}
