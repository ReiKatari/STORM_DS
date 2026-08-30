package me.magnum.melonds.initializer;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class CoilInitializer implements gz2 {
    @Override // defpackage.gz2
    public final List a() {
        return new ArrayList();
    }

    @Override // defpackage.gz2
    public final Object b(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            c55 c55Var = (c55) ((b81) ((hz2) mh7.L(applicationContext, hz2.class))).F.get();
            if (c55Var != null) {
                synchronized (iq0.class) {
                    iq0.L = c55Var;
                }
                return o27.a;
            }
            b53.g0("imageLoader");
            throw null;
        }
        f81.o();
        return null;
    }
}
