package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tc3  reason: default package */
/* loaded from: classes.dex */
public class tc3 extends ed3 {
    public final boolean X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc3(rc3 rc3Var) {
        super(true);
        iq0 iq0Var;
        iq0 iq0Var2;
        boolean z = true;
        T(rc3Var);
        hq0 P = P();
        if (P instanceof iq0) {
            iq0Var = (iq0) P;
        } else {
            iq0Var = null;
        }
        if (iq0Var != null) {
            ed3 p = iq0Var.p();
            while (!p.L()) {
                hq0 P2 = p.P();
                if (P2 instanceof iq0) {
                    iq0Var2 = (iq0) P2;
                } else {
                    iq0Var2 = null;
                }
                if (iq0Var2 != null) {
                    p = iq0Var2.p();
                }
            }
            this.X = z;
        }
        z = false;
        this.X = z;
    }

    @Override // defpackage.ed3
    public final boolean L() {
        return this.X;
    }

    @Override // defpackage.ed3
    public final boolean M() {
        return true;
    }
}
