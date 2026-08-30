package m8;

import android.content.Context;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import k7.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i {
    public static SidecarInterface a(Context context) {
        context.getClass();
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    public static h8.j b() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (!TextUtils.isEmpty(apiVersion)) {
                h8.j jVar = h8.j.Y;
                return w.A(apiVersion);
            }
            return null;
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }
}
