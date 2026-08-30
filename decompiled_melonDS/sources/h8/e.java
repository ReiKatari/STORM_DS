package h8;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import nc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6328a = u.a(e.class).c();

    public static int a() {
        String str = f6328a;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (c.f6324a == i.LOG) {
                Log.d(str, "Embedding extension version not found");
                return 0;
            }
            return 0;
        } catch (NullPointerException unused2) {
            if (c.f6324a == i.LOG) {
                Log.d(str, "Error with Extension implementation");
                return 0;
            }
            return 0;
        } catch (UnsupportedOperationException unused3) {
            if (c.f6324a == i.LOG) {
                Log.d(str, "Stub Extension");
                return 0;
            }
            return 0;
        }
    }
}
