package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: at5  reason: default package */
/* loaded from: classes.dex */
public final class at5 {
    public final ClassLoader a;
    public final zz0 b;
    public final zz0 c;

    public at5(ClassLoader classLoader, zz0 zz0Var) {
        this.a = classLoader;
        this.b = zz0Var;
        this.c = new zz0(classLoader, 1);
    }

    public static final boolean d(at5 at5Var) {
        Class<?> loadClass = at5Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        loadClass.getClass();
        Method method = loadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = loadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        method.getClass();
        if (Modifier.isPublic(method.getModifiers())) {
            method2.getClass();
            if (Modifier.isPublic(method2.getModifiers())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final WindowLayoutComponent a() {
        int a;
        zz0 zz0Var = this.c;
        zz0Var.getClass();
        boolean z = false;
        try {
            zz0Var.a.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (mj2.b0("WindowExtensionsProvider#getWindowExtensions is not valid", new bz2(20, zz0Var)) && mj2.b0("WindowExtensions#getWindowLayoutComponent is not valid", new zs5(this, 0)) && mj2.b0("FoldingFeature class is not valid", new zs5(this, 1)) && (a = a42.a()) >= 1) {
                if (a == 1) {
                    z = b();
                } else if (a < 5) {
                    z = c();
                } else if (c() && mj2.b0("DisplayFoldFeature is not valid", new zs5(this, 3)) && mj2.b0("SupportedWindowFeatures is not valid", new zs5(this, 2)) && mj2.b0("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new zs5(this, 4))) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return mj2.b0("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new zs5(this, 5));
    }

    public final boolean c() {
        if (b()) {
            if (mj2.b0("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new zs5(this, 6))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
