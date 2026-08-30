package defpackage;

import android.view.View;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vl6  reason: default package */
/* loaded from: classes.dex */
public final class vl6 extends g23 {
    public mi2 m0;
    public dg7 n0;

    @Override // defpackage.a23, defpackage.yy3
    public final void J0() {
        View S = se.S(this);
        WeakHashMap weakHashMap = dg7.w;
        dg7 q = hm1.q(S);
        q.a(S);
        re7 re7Var = (re7) this.m0.n(q);
        if (!b53.x(re7Var, this.l0)) {
            this.l0 = re7Var;
            S0();
        }
        this.n0 = q;
        super.J0();
    }

    @Override // defpackage.a23, defpackage.yy3
    public final void K0() {
        View S = se.S(this);
        dg7 dg7Var = this.n0;
        if (dg7Var != null) {
            int i = dg7Var.u - 1;
            dg7Var.u = i;
            if (i == 0) {
                WeakHashMap weakHashMap = aa7.a;
                s97.c(S, null);
                aa7.p(S, null);
                S.removeOnAttachStateChangeListener(dg7Var.v);
            }
        }
        super.K0();
    }
}
