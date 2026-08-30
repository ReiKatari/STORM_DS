package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cd6  reason: default package */
/* loaded from: classes.dex */
public final class cd6 implements j11, q31 {
    public final j11 A;
    public final e31 B;

    public cd6(j11 j11Var, e31 e31Var) {
        this.A = j11Var;
        this.B = e31Var;
    }

    @Override // defpackage.j11
    public final e31 a() {
        return this.B;
    }

    @Override // defpackage.q31
    public final q31 g() {
        j11 j11Var = this.A;
        if (j11Var instanceof q31) {
            return (q31) j11Var;
        }
        return null;
    }

    @Override // defpackage.j11
    public final void k(Object obj) {
        this.A.k(obj);
    }
}
