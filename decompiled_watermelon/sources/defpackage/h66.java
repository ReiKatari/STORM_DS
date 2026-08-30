package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h66  reason: default package */
/* loaded from: classes.dex */
public abstract class h66 {
    public static SidecarInterface a(Context context) {
        context.getClass();
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    public static d87 b() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (!TextUtils.isEmpty(apiVersion)) {
                d87 d87Var = d87.Y;
                return io2.f0(apiVersion);
            }
            return null;
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }
}
