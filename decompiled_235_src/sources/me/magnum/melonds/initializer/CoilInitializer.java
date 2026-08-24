package me.magnum.melonds.initializer;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CoilInitializer implements j53 {
    @Override // defpackage.j53
    public final List a() {
        return new ArrayList();
    }

    @Override // defpackage.j53
    public final Object b(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            pe5 pe5Var = (pe5) ((sb1) ((k53) hv.D(applicationContext, k53.class))).F.get();
            if (pe5Var != null) {
                synchronized (vs0.class) {
                    vs0.L = pe5Var;
                }
                return jg7.a;
            }
            nb3.a0("imageLoader");
            throw null;
        }
        e41.m();
        return null;
    }
}
