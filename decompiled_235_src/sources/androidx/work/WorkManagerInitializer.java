package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements j53 {
    public static final String a = ga0.h("WrkMgrInitializer");

    @Override // defpackage.j53
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.j53
    public final Object b(Context context) {
        ga0.f().b(a, "Initializing WorkManager with default configuration.");
        az0 az0Var = new az0(new os0(26, false));
        context.getClass();
        lw7.d(context, az0Var);
        lw7 b = lw7.b(context);
        b.getClass();
        return b;
    }
}
