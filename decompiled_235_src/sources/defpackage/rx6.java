package defpackage;

import android.view.View;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rx6  reason: default package */
/* loaded from: classes.dex */
public final class rx6 extends n83 {
    public qn2 n0;
    public dv7 o0;

    @Override // defpackage.h83, defpackage.z64
    public final void J0() {
        View z = jw2.z(this);
        WeakHashMap weakHashMap = dv7.w;
        dv7 e = th7.e(z);
        e.a(z);
        tt7 tt7Var = (tt7) this.n0.g(e);
        if (!nb3.k(tt7Var, this.m0)) {
            this.m0 = tt7Var;
            S0();
        }
        this.o0 = e;
        super.J0();
    }

    @Override // defpackage.h83, defpackage.z64
    public final void K0() {
        View z = jw2.z(this);
        dv7 dv7Var = this.o0;
        if (dv7Var != null) {
            int i = dv7Var.u - 1;
            dv7Var.u = i;
            if (i == 0) {
                WeakHashMap weakHashMap = ao7.a;
                sn7.c(z, null);
                ao7.p(z, null);
                z.removeOnAttachStateChangeListener(dv7Var.v);
            }
        }
        super.K0();
    }
}
