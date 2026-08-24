package defpackage;

import android.view.Surface;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ov6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ov6 implements aw {
    public final /* synthetic */ qv6 A;
    public final /* synthetic */ pv6 B;
    public final /* synthetic */ int L;
    public final /* synthetic */ zy R;
    public final /* synthetic */ zy X;

    public /* synthetic */ ov6(qv6 qv6Var, pv6 pv6Var, int i, zy zyVar, zy zyVar2) {
        this.A = qv6Var;
        this.B = pv6Var;
        this.L = i;
        this.R = zyVar;
        this.X = zyVar2;
    }

    @Override // defpackage.aw, defpackage.mo2
    public final gx3 apply(Object obj) {
        pv6 pv6Var = this.B;
        Surface surface = (Surface) obj;
        qv6 qv6Var = this.A;
        qv6Var.getClass();
        surface.getClass();
        boolean z = true;
        try {
            pv6Var.d();
            wv6 wv6Var = new wv6(surface, this.L, qv6Var.g.a, this.R, this.X);
            lv6 lv6Var = new lv6(pv6Var, 1);
            wv6Var.g0.B.a(u24.j(), lv6Var);
            if (pv6Var.q != null) {
                z = false;
            }
            np2.A("Consumer can only be linked once.", z);
            pv6Var.q = wv6Var;
            return l.z(wv6Var);
        } catch (hg1 e) {
            return new n33(e, 1);
        }
    }
}
