package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gt2  reason: default package */
/* loaded from: classes.dex */
public final class gt2 extends bt2 {
    public boolean X;

    @Override // defpackage.bt2, defpackage.sb6
    public final long L(f60 f60Var, long j) {
        f60Var.getClass();
        if (j >= 0) {
            if (!this.L) {
                if (this.X) {
                    return -1L;
                }
                long L = super.L(f60Var, j);
                if (L == -1) {
                    this.X = true;
                    d(xq2.B);
                    return -1L;
                }
                return L;
            }
            i.n("closed");
            return 0L;
        }
        i.g(wh1.h(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.L) {
            return;
        }
        if (!this.X) {
            d(ht2.f);
        }
        this.L = true;
    }
}
