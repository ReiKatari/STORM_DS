package j8;

import a2.n;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f7767a;

    /* renamed from: b  reason: collision with root package name */
    public final g8.a f7768b;

    /* renamed from: c  reason: collision with root package name */
    public final g8.a f7769c;

    public e(ClassLoader classLoader, g8.a aVar) {
        this.f7767a = classLoader;
        this.f7768b = aVar;
        this.f7769c = new g8.a(classLoader, 0);
    }

    public static final boolean d(e eVar) {
        Class<?> loadClass = eVar.f7767a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
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
        int a10;
        g8.a aVar = this.f7769c;
        aVar.getClass();
        boolean z10 = false;
        try {
            aVar.f5603a.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (d0.d.l0("WindowExtensionsProvider#getWindowExtensions is not valid", new n(18, aVar)) && d0.d.l0("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 0)) && d0.d.l0("FoldingFeature class is not valid", new d(this, 1)) && (a10 = h8.e.a()) >= 1) {
                if (a10 == 1) {
                    z10 = b();
                } else if (a10 < 5) {
                    z10 = c();
                } else if (c() && d0.d.l0("DisplayFoldFeature is not valid", new d(this, 3)) && d0.d.l0("SupportedWindowFeatures is not valid", new d(this, 2)) && d0.d.l0("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new d(this, 4))) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z10) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return d0.d.l0("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 5));
    }

    public final boolean c() {
        if (b()) {
            if (d0.d.l0("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 6))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
