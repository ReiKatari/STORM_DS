package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class PlatformInitializer implements j53 {
    @Override // defpackage.j53
    public final List a() {
        return yt1.A;
    }

    @Override // defpackage.j53
    public final Object b(Context context) {
        g41 g41Var;
        context.getClass();
        kx4 kx4Var = kx4.a;
        kx4 kx4Var2 = kx4.a;
        if (kx4Var2 != null) {
            g41Var = (g41) kx4Var2;
        } else {
            g41Var = null;
        }
        if (g41Var != null) {
            g41Var.a(context);
        }
        return kx4.a;
    }
}
