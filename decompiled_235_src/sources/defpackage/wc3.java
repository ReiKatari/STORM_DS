package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wc3  reason: default package */
/* loaded from: classes.dex */
public final class wc3 extends rj0 {
    public final ed3 g0;

    public wc3(r41 r41Var, ed3 ed3Var) {
        super(1, r41Var);
        this.g0 = ed3Var;
    }

    @Override // defpackage.rj0
    public final String D() {
        return "AwaitContinuation";
    }

    @Override // defpackage.rj0
    public final Throwable q(ed3 ed3Var) {
        Throwable c;
        Object Q = this.g0.Q();
        if ((Q instanceof yc3) && (c = ((yc3) Q).c()) != null) {
            return c;
        }
        if (Q instanceof av0) {
            return ((av0) Q).a;
        }
        return ed3Var.v();
    }
}
