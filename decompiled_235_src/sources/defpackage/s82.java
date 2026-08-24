package defpackage;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s82  reason: default package */
/* loaded from: classes.dex */
public abstract class s82 {
    public static final String a = gh5.a(s82.class).c();

    public static int a() {
        String str = a;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (b90.a == vl7.LOG) {
                Log.d(str, "Embedding extension version not found");
                return 0;
            }
            return 0;
        } catch (NullPointerException unused2) {
            if (b90.a == vl7.LOG) {
                Log.d(str, "Error with Extension implementation");
                return 0;
            }
            return 0;
        } catch (UnsupportedOperationException unused3) {
            if (b90.a == vl7.LOG) {
                Log.d(str, "Stub Extension");
                return 0;
            }
            return 0;
        }
    }
}
