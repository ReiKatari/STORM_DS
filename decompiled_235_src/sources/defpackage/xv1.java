package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xv1  reason: default package */
/* loaded from: classes.dex */
public final class xv1 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ nx1 B;

    public /* synthetic */ xv1(nx1 nx1Var, int i) {
        this.A = i;
        this.B = nx1Var;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        nx1 nx1Var = this.B;
        switch (i) {
            case 0:
                ba5 ba5Var = (ba5) obj;
                nx1Var.o = yt1.A;
                return jg7Var;
            default:
                l95 l95Var = (l95) obj;
                if (l95Var instanceof p85) {
                    nx1Var.o = gt0.U0(new Long(((p85) l95Var).a), nx1Var.o);
                } else if (l95Var instanceof t85) {
                    nx1Var.o = gt0.T0(nx1Var.o, new Long(((t85) l95Var).a));
                } else if (l95Var instanceof s85) {
                    nx1Var.p = gt0.U0(new gx1(((s85) l95Var).a, u83.a.b()), nx1Var.p);
                }
                return jg7Var;
        }
    }
}
