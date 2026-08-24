package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s41  reason: default package */
/* loaded from: classes.dex */
public abstract class s41 extends d20 {
    public final l61 B;
    public transient r41 L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s41(r41 r41Var) {
        this(r41Var, r0);
        l61 l61Var;
        if (r41Var != null) {
            l61Var = r41Var.b();
        } else {
            l61Var = null;
        }
    }

    @Override // defpackage.r41
    public l61 b() {
        l61 l61Var = this.B;
        l61Var.getClass();
        return l61Var;
    }

    @Override // defpackage.d20
    public void u() {
        r41 r41Var = this.L;
        if (r41Var != null && r41Var != this) {
            j61 Z = b().Z(d90.r0);
            Z.getClass();
            n61 n61Var = (n61) Z;
            nk1 nk1Var = (nk1) r41Var;
            nk1Var.l();
            rj0 n = nk1Var.n();
            if (n != null) {
                n.o();
            }
        }
        this.L = zu0.B;
    }

    public s41(r41 r41Var, l61 l61Var) {
        super(r41Var);
        this.B = l61Var;
    }
}
