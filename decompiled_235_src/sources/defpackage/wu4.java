package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wu4  reason: default package */
/* loaded from: classes.dex */
public final class wu4 implements in6 {
    public final z80 A;
    public final k80 B;
    public o96 L;
    public int R;
    public boolean X;
    public long Y;

    public wu4(z80 z80Var) {
        int i;
        this.A = z80Var;
        k80 a = z80Var.a();
        this.B = a;
        o96 o96Var = a.A;
        this.L = o96Var;
        if (o96Var != null) {
            i = o96Var.b;
        } else {
            i = -1;
        }
        this.R = i;
    }

    @Override // defpackage.in6
    public final b67 b() {
        return this.A.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r3 == r5.b) goto L14;
     */
    @Override // defpackage.in6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b0(k80 k80Var, long j) {
        o96 o96Var;
        k80Var.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.X) {
                o96 o96Var2 = this.L;
                k80 k80Var2 = this.B;
                if (o96Var2 != null) {
                    o96 o96Var3 = k80Var2.A;
                    if (o96Var2 == o96Var3) {
                        int i2 = this.R;
                        o96Var3.getClass();
                    }
                    i.m("Peek source is invalid because upstream source was used");
                    return 0L;
                }
                if (i == 0) {
                    return 0L;
                }
                if (!this.A.T(this.Y + 1)) {
                    return -1L;
                }
                if (this.L == null && (o96Var = k80Var2.A) != null) {
                    this.L = o96Var;
                    this.R = o96Var.b;
                }
                long min = Math.min(j, k80Var2.B - this.Y);
                this.B.n(k80Var, this.Y, min);
                this.Y += min;
                return min;
            }
            i.m("closed");
            return 0L;
        }
        i.f(lb1.h(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.X = true;
    }
}
