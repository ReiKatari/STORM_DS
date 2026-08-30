package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements gz2 {
    public static final String a = y70.h("WrkMgrInitializer");

    @Override // defpackage.gz2
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.gz2
    public final Object b(Context context) {
        y70.f().b(a, "Initializing WorkManager with default configuration.");
        ew0 ew0Var = new ew0(new bq0(24, false));
        context.getClass();
        kh7.d(context, ew0Var);
        kh7 b = kh7.b(context);
        b.getClass();
        return b;
    }
}
