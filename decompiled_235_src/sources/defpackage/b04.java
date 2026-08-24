package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b04  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b04 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ c04 B;

    public /* synthetic */ b04(c04 c04Var, int i) {
        this.A = i;
        this.B = c04Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        long j;
        int i = this.A;
        c04 c04Var = this.B;
        switch (i) {
            case 0:
                c04Var.T0();
                return jg7.a;
            case 1:
                return new jk4(c04Var.s0);
            default:
                jk3 jk3Var = (jk3) c04Var.q0.getValue();
                if (jk3Var != null) {
                    j = jk3Var.P(0L);
                } else {
                    j = 9205357640488583168L;
                }
                return new jk4(j);
        }
    }
}
