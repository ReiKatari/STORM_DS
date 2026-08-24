package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t90  reason: default package */
/* loaded from: classes.dex */
public final class t90 {
    public static final int[] c = null;
    public byte[] a;
    public int b;

    static {
            r0 = 65
            int[] r1 = new int[r0]
            r2 = 0
        L5:
            if (r2 >= r0) goto L10
            int r3 = 63 - r2
            int r3 = r3 / 7
            r1[r2] = r3
            int r2 = r2 + 1
            goto L5
        L10:
            defpackage.t90.c = r1
            return
    }

    public t90() {
            r1 = this;
            r1.<init>()
            r0 = 32
            byte[] r0 = new byte[r0]
            r1.a = r0
            return
    }

    public final void a(int r8, long r9) {
            r7 = this;
            r0 = 0
        L1:
            byte[] r1 = r7.a
            int r2 = r7.b
            if (r0 >= r8) goto L17
            int r2 = r2 + r0
            r3 = 127(0x7f, double:6.27E-322)
            long r3 = r3 & r9
            r5 = 128(0x80, double:6.3E-322)
            long r3 = r3 | r5
            int r3 = (int) r3
            byte r3 = (byte) r3
            r1[r2] = r3
            r1 = 7
            long r9 = r9 >>> r1
            int r0 = r0 + 1
            goto L1
        L17:
            int r0 = r2 + r8
            int r9 = (int) r9
            byte r9 = (byte) r9
            r1[r0] = r9
            int r8 = r8 + 1
            int r8 = r8 + r2
            r7.b = r8
            return
    }

    public final void b(int r4) {
            r3 = this;
            int r0 = r3.b
            int r0 = r0 + r4
            byte[] r4 = r3.a
            int r4 = r4.length
            if (r0 > r4) goto L9
            return
        L9:
            int r4 = java.lang.Integer.highestOneBit(r0)
            int r4 = r4 << 1
            byte[] r4 = new byte[r4]
            byte[] r0 = r3.a
            r1 = 14
            r2 = 0
            defpackage.fv.u0(r2, r2, r1, r0, r4)
            r3.a = r4
            return
    }

    public final void c(int r5) {
            r4 = this;
            r0 = 4
            r4.b(r0)
            r0 = 3
        L5:
            r1 = -1
            if (r1 >= r0) goto L1a
            byte[] r1 = r4.a
            int r2 = r4.b
            int r3 = r2 + 1
            r4.b = r3
            int r3 = r0 * 8
            int r3 = r5 >> r3
            byte r3 = (byte) r3
            r1[r2] = r3
            int r0 = r0 + (-1)
            goto L5
        L1a:
            return
    }

    public final void d(long r6) {
            r5 = this;
            r0 = 8
            r5.b(r0)
            r0 = 7
        L6:
            r1 = -1
            if (r1 >= r0) goto L1c
            byte[] r1 = r5.a
            int r2 = r5.b
            int r3 = r2 + 1
            r5.b = r3
            int r3 = r0 * 8
            long r3 = r6 >> r3
            int r3 = (int) r3
            byte r3 = (byte) r3
            r1[r2] = r3
            int r0 = r0 + (-1)
            goto L6
        L1c:
            return
    }
}
