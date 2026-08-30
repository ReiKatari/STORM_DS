package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wn0  reason: default package */
/* loaded from: classes.dex */
public final class wn0 extends f63 {
    public final ih0 c0;

    public wn0(ih0 ih0Var) {
        this.c0 = ih0Var;
    }

    @Override // defpackage.f63
    public final boolean q() {
        return true;
    }

    @Override // defpackage.f63
    public final void r(Throwable th) {
        boolean q;
        p63 p = p();
        ih0 ih0Var = this.c0;
        Throwable t = ih0Var.t(p);
        if (!ih0Var.B()) {
            q = false;
        } else {
            q = ((jg1) ih0Var.R).q(t);
        }
        if (!q) {
            ih0Var.r(t);
            if (!ih0Var.B()) {
                ih0Var.p();
            }
        }
    }
}
