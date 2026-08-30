package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oc5  reason: default package */
/* loaded from: classes.dex */
public final class oc5 extends f63 {
    public final h63 c0;

    public oc5(h63 h63Var) {
        this.c0 = h63Var;
    }

    @Override // defpackage.f63
    public final boolean q() {
        return false;
    }

    @Override // defpackage.f63
    public final void r(Throwable th) {
        Object S = p().S();
        boolean z = S instanceof ns0;
        h63 h63Var = this.c0;
        if (z) {
            h63Var.k(me2.o(((ns0) S).a));
        } else {
            h63Var.k(q63.a(S));
        }
    }
}
