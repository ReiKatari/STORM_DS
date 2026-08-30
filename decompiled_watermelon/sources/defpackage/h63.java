package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h63  reason: default package */
/* loaded from: classes.dex */
public final class h63 extends ih0 {
    public final p63 f0;

    public h63(j11 j11Var, p63 p63Var) {
        super(1, j11Var);
        this.f0 = p63Var;
    }

    @Override // defpackage.ih0
    public final String D() {
        return "AwaitContinuation";
    }

    @Override // defpackage.ih0
    public final Throwable t(p63 p63Var) {
        Throwable c;
        Object S = this.f0.S();
        if ((S instanceof j63) && (c = ((j63) S).c()) != null) {
            return c;
        }
        if (S instanceof ns0) {
            return ((ns0) S).a;
        }
        return p63Var.K();
    }
}
