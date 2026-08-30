package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v21  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class v21 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ x21 B;

    public /* synthetic */ v21(x21 x21Var, int i) {
        this.A = i;
        this.B = x21Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        o27 o27Var = o27.a;
        x21 x21Var = this.B;
        switch (i) {
            case 0:
                l.M(x21Var);
                return o27Var;
            case 1:
                x21Var.r0.h(true);
                break;
            case 2:
                x21Var.r0.d(true);
                break;
            case 3:
                x21Var.r0.f();
                break;
            case 4:
                l.M(x21Var);
                return o27Var;
            case 5:
                x21Var.r0.p();
                break;
            case ig7.b /* 6 */:
                o21 o21Var = x21Var.n0.w;
                o21Var.B.r.b(x21Var.s0.e);
                break;
            default:
                hm3 hm3Var = x21Var.n0;
                wc2 wc2Var = x21Var.t0;
                if (!hm3Var.b()) {
                    wc2.a(wc2Var);
                } else {
                    ib6 ib6Var = hm3Var.c;
                    if (ib6Var != null) {
                        ((zc1) ib6Var).b();
                    }
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
