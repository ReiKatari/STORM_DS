package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: up4  reason: default package */
/* loaded from: classes.dex */
public final class up4 implements defpackage.ui6 {
    public final java.io.FileOutputStream A;
    public final defpackage.b67 B;

    public up4(java.io.FileOutputStream r1, defpackage.b67 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.ui6
    public final void O(defpackage.k80 r8, long r9) {
            r7 = this;
            long r0 = r8.B
            r2 = 0
            r4 = r9
            defpackage.hf.D(r0, r2, r4)
        L8:
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L46
            b67 r0 = r7.B
            r0.f()
            o96 r0 = r8.A
            r0.getClass()
            int r1 = r0.c
            int r2 = r0.b
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r9, r1)
            int r1 = (int) r1
            byte[] r2 = r0.a
            int r3 = r0.b
            java.io.FileOutputStream r4 = r7.A
            r4.write(r2, r3, r1)
            int r2 = r0.b
            int r2 = r2 + r1
            r0.b = r2
            long r3 = (long) r1
            long r9 = r9 - r3
            long r5 = r8.B
            long r5 = r5 - r3
            r8.B = r5
            int r1 = r0.c
            if (r2 != r1) goto L8
            o96 r1 = r0.a()
            r8.A = r1
            defpackage.r96.a(r0)
            goto L8
        L46:
            return
    }

    @Override // defpackage.ui6
    public final defpackage.b67 b() {
            r0 = this;
            b67 r0 = r0.B
            return r0
    }

    @Override // defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            java.io.FileOutputStream r0 = r0.A
            r0.close()
            return
    }

    @Override // defpackage.ui6, java.io.Flushable
    public final void flush() {
            r0 = this;
            java.io.FileOutputStream r0 = r0.A
            r0.flush()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "sink("
            r0.<init>(r1)
            java.io.FileOutputStream r2 = r2.A
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
