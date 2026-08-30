package defpackage;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a42  reason: default package */
/* loaded from: classes.dex */
public abstract class a42 {
    public static final String a = q75.a(a42.class).c();

    public static int a() {
        String str = a;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (w60.a == w77.LOG) {
                Log.d(str, "Embedding extension version not found");
                return 0;
            }
            return 0;
        } catch (NullPointerException unused2) {
            if (w60.a == w77.LOG) {
                Log.d(str, "Error with Extension implementation");
                return 0;
            }
            return 0;
        } catch (UnsupportedOperationException unused3) {
            if (w60.a == w77.LOG) {
                Log.d(str, "Stub Extension");
                return 0;
            }
            return 0;
        }
    }
}
