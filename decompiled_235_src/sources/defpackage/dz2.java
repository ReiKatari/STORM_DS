package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dz2  reason: default package */
/* loaded from: classes.dex */
public final class dz2 implements ui6 {
    public final lk2 A;
    public boolean B;
    public final /* synthetic */ hz2 L;

    public dz2(hz2 hz2Var) {
        this.L = hz2Var;
        this.A = new lk2(((ee5) hz2Var.c.R).A.b());
    }

    @Override // defpackage.ui6
    public final void O(k80 k80Var, long j) {
        if (!this.B) {
            if (j == 0) {
                return;
            }
            ee5 ee5Var = (ee5) this.L.c.R;
            if (!ee5Var.L) {
                ee5Var.B.p0(j);
                ee5Var.e();
                ee5Var.H("\r\n");
                ee5Var.O(k80Var, j);
                ee5Var.H("\r\n");
                return;
            }
            i.m("closed");
            return;
        }
        i.m("closed");
    }

    @Override // defpackage.ui6
    public final b67 b() {
        return this.A;
    }

    @Override // defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.B) {
            return;
        }
        this.B = true;
        ((ee5) this.L.c.R).H("0\r\n\r\n");
        lk2 lk2Var = this.A;
        b67 b67Var = lk2Var.e;
        lk2Var.e = b67.d;
        b67Var.a();
        b67Var.b();
        this.L.d = 3;
    }

    @Override // defpackage.ui6, java.io.Flushable
    public final synchronized void flush() {
        if (this.B) {
            return;
        }
        ((ee5) this.L.c.R).flush();
    }
}
