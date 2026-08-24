package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gz2  reason: default package */
/* loaded from: classes.dex */
public final class gz2 extends cz2 {
    public boolean X;

    @Override // defpackage.cz2, defpackage.in6
    public final long b0(k80 k80Var, long j) {
        k80Var.getClass();
        if (j >= 0) {
            if (!this.L) {
                if (this.X) {
                    return -1L;
                }
                long b0 = super.b0(k80Var, j);
                if (b0 == -1) {
                    this.X = true;
                    e(yw2.B);
                    return -1L;
                }
                return b0;
            }
            i.m("closed");
            return 0L;
        }
        i.f(lb1.h(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.L) {
            return;
        }
        if (!this.X) {
            e(hz2.f);
        }
        this.L = true;
    }
}
