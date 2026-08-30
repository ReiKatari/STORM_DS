package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ah1  reason: default package */
/* loaded from: classes.dex */
public final class ah1 implements l95 {
    public final mi2 A;
    public bh1 B;

    public ah1(mi2 mi2Var) {
        this.A = mi2Var;
    }

    @Override // defpackage.l95
    public final void a() {
        this.B = (bh1) this.A.n(l.f);
    }

    @Override // defpackage.l95
    public final void c() {
        bh1 bh1Var = this.B;
        if (bh1Var != null) {
            bh1Var.dispose();
        }
        this.B = null;
    }

    @Override // defpackage.l95
    public final void b() {
    }
}
