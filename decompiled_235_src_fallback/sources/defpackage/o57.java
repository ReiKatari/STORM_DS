package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o57  reason: default package */
/* loaded from: classes.dex */
public final class o57 {
    public final int a;
    public final long[] b;
    public final java.lang.Object[] c;

    public o57(int r1, long[] r2, java.lang.Object[] r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final int a(long r8) {
            r7 = this;
            int r0 = r7.a
            int r0 = r0 + (-1)
            r1 = -1
            if (r0 == r1) goto L33
            long[] r7 = r7.b
            r2 = 0
            if (r0 == 0) goto L28
        Lc:
            if (r2 > r0) goto L24
            int r1 = r2 + r0
            int r1 = r1 >>> 1
            r3 = r7[r1]
            long r3 = r3 - r8
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L1e
            int r2 = r1 + 1
            goto Lc
        L1e:
            if (r3 <= 0) goto L23
            int r0 = r1 + (-1)
            goto Lc
        L23:
            return r1
        L24:
            int r2 = r2 + 1
            int r7 = -r2
            return r7
        L28:
            r3 = r7[r2]
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 != 0) goto L2f
            return r2
        L2f:
            if (r7 <= 0) goto L33
            r7 = -2
            return r7
        L33:
            return r1
    }

    public final defpackage.o57 b(long r14, java.lang.Object r16) {
            r13 = this;
            java.lang.Object[] r0 = r13.c
            int r1 = r0.length
            r2 = 0
            r3 = r2
            r4 = r3
        L6:
            if (r3 >= r1) goto L11
            r5 = r0[r3]
            if (r5 == 0) goto Le
            int r4 = r4 + 1
        Le:
            int r3 = r3 + 1
            goto L6
        L11:
            int r1 = r4 + 1
            long[] r3 = new long[r1]
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r6 = 1
            if (r1 <= r6) goto L55
            r6 = r2
        L1b:
            long[] r7 = r13.b
            int r8 = r13.a
            if (r2 >= r1) goto L3d
            if (r6 >= r8) goto L3d
            r9 = r7[r6]
            r11 = r0[r6]
            int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r12 <= 0) goto L32
            r3[r2] = r14
            r5[r2] = r16
            int r2 = r2 + 1
            goto L3d
        L32:
            if (r11 == 0) goto L3a
            r3[r2] = r9
            r5[r2] = r11
            int r2 = r2 + 1
        L3a:
            int r6 = r6 + 1
            goto L1b
        L3d:
            if (r6 != r8) goto L44
            r3[r4] = r14
            r5[r4] = r16
            goto L59
        L44:
            if (r2 >= r1) goto L59
            r8 = r7[r6]
            r13 = r0[r6]
            if (r13 == 0) goto L52
            r3[r2] = r8
            r5[r2] = r13
            int r2 = r2 + 1
        L52:
            int r6 = r6 + 1
            goto L44
        L55:
            r3[r2] = r14
            r5[r2] = r16
        L59:
            o57 r13 = new o57
            r13.<init>(r1, r3, r5)
            return r13
    }
}
