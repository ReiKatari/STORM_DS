package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x36  reason: default package */
/* loaded from: classes.dex */
public final class x36 {
    public final ClassLoader a;
    public final e31 b;
    public final e31 c;

    public x36(ClassLoader classLoader, e31 e31Var) {
        this.a = classLoader;
        this.b = e31Var;
        this.c = new e31(classLoader, 1);
    }

    public static final boolean d(x36 x36Var) {
        Class<?> loadClass = x36Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
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
        e31 e31Var = this.c;
        e31Var.getClass();
        boolean z = false;
        try {
            e31Var.a.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (xk2.L("WindowExtensionsProvider#getWindowExtensions is not valid", new er2(e31Var, 27)) && xk2.L("WindowExtensions#getWindowLayoutComponent is not valid", new w36(this, 0)) && xk2.L("FoldingFeature class is not valid", new w36(this, 1)) && (a = s82.a()) >= 1) {
                if (a == 1) {
                    z = b();
                } else if (a < 5) {
                    z = c();
                } else if (c() && xk2.L("DisplayFoldFeature is not valid", new w36(this, 3)) && xk2.L("SupportedWindowFeatures is not valid", new w36(this, 2)) && xk2.L("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new w36(this, 4))) {
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
        return xk2.L("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new w36(this, 5));
    }

    public final boolean c() {
        if (b()) {
            if (xk2.L("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new w36(this, 6))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
