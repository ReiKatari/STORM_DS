package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sz2  reason: default package */
/* loaded from: classes.dex */
public final class sz2 implements defpackage.in6 {
    public final defpackage.z80 A;
    public int B;
    public int L;
    public int R;
    public int X;
    public int Y;

    public sz2(defpackage.z80 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.in6
    public final defpackage.b67 b() {
            r0 = this;
            z80 r0 = r0.A
            b67 r0 = r0.b()
            return r0
    }

    @Override // defpackage.in6
    public final long b0(defpackage.k80 r9, long r10) {
            r8 = this;
            r9.getClass()
        L3:
            int r0 = r8.X
            z80 r1 = r8.A
            r2 = -1
            if (r0 != 0) goto L7d
            int r0 = r8.Y
            long r4 = (long) r0
            r1.skip(r4)
            r0 = 0
            r8.Y = r0
            int r0 = r8.L
            r0 = r0 & 4
            if (r0 == 0) goto L1b
            goto L8a
        L1b:
            int r0 = r8.R
            int r2 = defpackage.yy7.o(r1)
            r8.X = r2
            r8.B = r2
            byte r2 = r1.readByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r3 = r1.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r8.L = r3
            java.util.logging.Logger r3 = defpackage.tz2.R
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            boolean r4 = r3.isLoggable(r4)
            if (r4 == 0) goto L4d
            da0 r4 = defpackage.iz2.a
            int r4 = r8.R
            int r5 = r8.B
            int r6 = r8.L
            r7 = 1
            java.lang.String r4 = defpackage.iz2.b(r7, r4, r5, r2, r6)
            r3.fine(r4)
        L4d:
            int r1 = r1.readInt()
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r3
            r8.R = r1
            r3 = 9
            if (r2 != r3) goto L66
            if (r1 != r0) goto L5e
            goto L3
        L5e:
            java.lang.String r8 = "TYPE_CONTINUATION streamId changed"
            defpackage.e41.i(r8)
            r8 = 0
            return r8
        L66:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            java.lang.String r10 = " != TYPE_CONTINUATION"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L7d:
            long r4 = (long) r0
            long r10 = java.lang.Math.min(r10, r4)
            long r9 = r1.b0(r9, r10)
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 != 0) goto L8b
        L8a:
            return r2
        L8b:
            int r11 = r8.X
            int r0 = (int) r9
            int r11 = r11 - r0
            r8.X = r11
            return r9
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }
}
