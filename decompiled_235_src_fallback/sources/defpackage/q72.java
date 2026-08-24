package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q72  reason: default package */
/* loaded from: classes.dex */
public final class q72 extends defpackage.i72 {
    public q72(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r1.markSupported()
            if (r1 == 0) goto L12
            java.io.DataInputStream r0 = r0.A
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.mark(r1)
            return
        L12:
            java.lang.String r0 = "Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset"
            defpackage.i.h(r0)
            r0 = 0
            throw r0
    }

    public q72(byte[] r1) {
            r0 = this;
            r0.<init>(r1)
            java.io.DataInputStream r0 = r0.A
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.mark(r1)
            return
    }

    public final void h(long r4) {
            r3 = this;
            int r0 = r3.B
            long r1 = (long) r0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L10
            r0 = 0
            r3.B = r0
            java.io.DataInputStream r0 = r3.A
            r0.reset()
            goto L12
        L10:
            long r0 = (long) r0
            long r4 = r4 - r0
        L12:
            int r4 = (int) r4
            r3.e(r4)
            return
    }
}
