package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class PlatformInitializer implements gz2 {
    @Override // defpackage.gz2
    public final List a() {
        return pp1.A;
    }

    @Override // defpackage.gz2
    public final Object b(Context context) {
        y01 y01Var;
        context.getClass();
        fo4 fo4Var = fo4.a;
        fo4 fo4Var2 = fo4.a;
        if (fo4Var2 != null) {
            y01Var = (y01) fo4Var2;
        } else {
            y01Var = null;
        }
        if (y01Var != null) {
            y01Var.a(context);
        }
        return fo4.a;
    }
}
