package me.magnum.melonds.initializer;

import android.content.Context;
import b9.h;
import java.util.ArrayList;
import java.util.List;
import nc.k;
import ne.a;
import rd.g;
import y7.b;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class CoilInitializer implements b {
    @Override // y7.b
    public final List a() {
        return new ArrayList();
    }

    @Override // y7.b
    public final Object b(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            h hVar = (h) ((g) ((a) pc.a.u(applicationContext, a.class))).f12683v.get();
            if (hVar != null) {
                synchronized (b9.a.class) {
                    b9.a.f2112b = hVar;
                }
                return y.f14813a;
            }
            k.f("imageLoader");
            throw null;
        }
        throw new IllegalStateException();
    }
}
