package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ft2  reason: default package */
/* loaded from: classes.dex */
public final class ft2 implements g76 {
    public final mf2 A;
    public boolean B;
    public final /* synthetic */ ht2 L;

    public ft2(ht2 ht2Var) {
        this.L = ht2Var;
        this.A = new mf2(((r45) ht2Var.c.R).A.f());
    }

    @Override // defpackage.g76, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.B) {
            return;
        }
        this.B = true;
        mf2 mf2Var = this.A;
        kt6 kt6Var = mf2Var.e;
        mf2Var.e = kt6.d;
        kt6Var.a();
        kt6Var.b();
        this.L.d = 3;
    }

    @Override // defpackage.g76
    public final kt6 f() {
        return this.A;
    }

    @Override // defpackage.g76, java.io.Flushable
    public final void flush() {
        if (this.B) {
            return;
        }
        ((r45) this.L.c.R).flush();
    }

    @Override // defpackage.g76
    public final void l(f60 f60Var, long j) {
        if (!this.B) {
            gk7.a(f60Var.B, 0L, j);
            ((r45) this.L.c.R).l(f60Var, j);
            return;
        }
        i.n("closed");
    }
}
