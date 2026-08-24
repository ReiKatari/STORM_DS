package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: im5  reason: default package */
/* loaded from: classes.dex */
public final class im5 extends uc3 {
    public final wc3 d0;

    public im5(wc3 wc3Var) {
        this.d0 = wc3Var;
    }

    @Override // defpackage.uc3
    public final boolean q() {
        return false;
    }

    @Override // defpackage.uc3
    public final void r(Throwable th) {
        Object Q = p().Q();
        boolean z = Q instanceof av0;
        wc3 wc3Var = this.d0;
        if (z) {
            wc3Var.i(oi2.p(((av0) Q).a));
        } else {
            wc3Var.i(fd3.a(Q));
        }
    }
}
