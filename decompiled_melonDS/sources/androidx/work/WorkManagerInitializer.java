package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import l.i0;
import p8.v;
import q8.p;
import y7.b;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1713a = v.g("WrkMgrInitializer");

    @Override // y7.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // y7.b
    public final Object b(Context context) {
        v.e().a(f1713a, "Initializing WorkManager with default configuration.");
        p8.b bVar = new p8.b(new i0(19, false));
        context.getClass();
        p.b(context, bVar);
        p a10 = p.a(context);
        a10.getClass();
        return a10;
    }
}
