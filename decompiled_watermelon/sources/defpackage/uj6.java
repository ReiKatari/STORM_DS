package defpackage;

import android.view.Surface;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uj6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class uj6 implements iv {
    public final /* synthetic */ wj6 A;
    public final /* synthetic */ vj6 B;
    public final /* synthetic */ int L;
    public final /* synthetic */ kx R;
    public final /* synthetic */ kx X;

    public /* synthetic */ uj6(wj6 wj6Var, vj6 vj6Var, int i, kx kxVar, kx kxVar2) {
        this.A = wj6Var;
        this.B = vj6Var;
        this.L = i;
        this.R = kxVar;
        this.X = kxVar2;
    }

    @Override // defpackage.iv, defpackage.ij2
    public final fq3 apply(Object obj) {
        vj6 vj6Var = this.B;
        Surface surface = (Surface) obj;
        wj6 wj6Var = this.A;
        wj6Var.getClass();
        surface.getClass();
        boolean z = true;
        try {
            vj6Var.d();
            ck6 ck6Var = new ck6(surface, this.L, wj6Var.g.a, this.R, this.X);
            ck6Var.f0.B.a(new rj6(vj6Var, 1), iq2.l());
            if (vj6Var.q != null) {
                z = false;
            }
            nl2.D("Consumer can only be linked once.", z);
            vj6Var.q = ck6Var;
            return jv3.K(ck6Var);
        } catch (gc1 e) {
            return new jx2(1, e);
        }
    }
}
