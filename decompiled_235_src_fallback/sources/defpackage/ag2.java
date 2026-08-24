package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ag2  reason: default package */
/* loaded from: classes.dex */
public final class ag2 {
    public final defpackage.gg2 a;
    public final long b;
    public final int c;
    public final int d;

    public ag2(defpackage.gg2 r1, long r2, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            return
    }

    public final defpackage.yf2 a(defpackage.zf2 r5, boolean r6, int r7, int r8, int r9, int r10) {
            r4 = this;
            boolean r5 = r5.B
            r0 = 0
            if (r5 != 0) goto L6
            goto L49
        L6:
            gg2 r4 = r4.a
            cg2 r5 = r4.a
            int[] r1 = defpackage.fg2.a
            int r5 = r5.ordinal()
            r5 = r1[r5]
            r1 = 1
            if (r5 == r1) goto L3b
            r2 = 2
            if (r5 == r2) goto L3b
            r2 = 3
            if (r5 == r2) goto L23
            r2 = 4
            if (r5 != r2) goto L1f
            goto L23
        L1f:
            defpackage.i.d()
            return r0
        L23:
            if (r6 == 0) goto L2c
            x24 r5 = r4.b
            d93 r6 = r4.f
            dx4 r4 = r4.c
            goto L39
        L2c:
            r5 = -1
            if (r7 < r5) goto L34
            if (r8 < 0) goto L34
            x24 r5 = r4.d
            goto L35
        L34:
            r5 = r0
        L35:
            d93 r6 = r4.g
            dx4 r4 = r4.e
        L39:
            if (r5 != 0) goto L3d
        L3b:
            r8 = r0
            goto L47
        L3d:
            yf2 r8 = new yf2
            r6.getClass()
            long r2 = r6.a
            r8.<init>(r5, r4, r2)
        L47:
            if (r8 != 0) goto L4a
        L49:
            return r0
        L4a:
            if (r7 < 0) goto L5d
            if (r10 == 0) goto L5e
            long r4 = r8.c
            r6 = 32
            long r4 = r4 >> r6
            int r4 = (int) r4
            int r9 = r9 - r4
            if (r9 < 0) goto L5d
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r10 >= r4) goto L5d
            goto L5e
        L5d:
            r1 = 0
        L5e:
            r8.d = r1
            return r8
    }

    public final defpackage.zf2 b(boolean r20, int r21, long r22, defpackage.d93 r24, int r25, int r26, int r27, boolean r28, boolean r29) {
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r24
            r3 = r25
            r4 = r27
            int r7 = r26 + r4
            r11 = 1
            if (r2 != 0) goto L15
            zf2 r0 = new zf2
            r0.<init>(r11, r11)
            return r0
        L15:
            long r5 = r2.a
            gg2 r2 = r0.a
            cg2 r8 = r2.a
            cg2 r9 = defpackage.cg2.Visible
            r10 = 2147483647(0x7fffffff, float:NaN)
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r8 != r9) goto L28
            goto L3a
        L28:
            if (r3 < r10) goto L2b
            goto L34
        L2b:
            long r8 = r22 & r12
            int r8 = (int) r8
            long r14 = r5 & r12
            int r9 = (int) r14
            int r8 = r8 - r9
            if (r8 >= 0) goto L3a
        L34:
            zf2 r0 = new zf2
            r0.<init>(r11, r11)
            return r0
        L3a:
            int r8 = r0.c
            int r9 = r0.d
            long r14 = r0.b
            r16 = 32
            if (r1 != 0) goto L47
            r17 = r12
            goto L94
        L47:
            if (r1 < r10) goto L4c
            r17 = r12
            goto L57
        L4c:
            r17 = r12
            long r12 = r22 >> r16
            int r12 = (int) r12
            long r10 = r5 >> r16
            int r10 = (int) r10
            int r12 = r12 - r10
            if (r12 >= 0) goto L94
        L57:
            if (r28 == 0) goto L60
            zf2 r0 = new zf2
            r13 = 1
            r0.<init>(r13, r13)
            return r0
        L60:
            int r1 = defpackage.q21.h(r14)
            long r10 = r22 & r17
            int r2 = (int) r10
            int r2 = r2 - r9
            int r2 = r2 - r4
            long r1 = defpackage.d93.a(r1, r2)
            long r9 = r5 >> r16
            int r4 = (int) r9
            int r4 = r4 - r8
            long r5 = r5 & r17
            int r5 = (int) r5
            long r4 = defpackage.d93.a(r4, r5)
            d93 r6 = new d93
            r6.<init>(r4)
            r5 = r6
            r13 = 1
            int r6 = r3 + 1
            r9 = 1
            r10 = 0
            r3 = r1
            r2 = 0
            r8 = 0
            r1 = r20
            zf2 r0 = r0.b(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            zf2 r1 = new zf2
            boolean r0 = r0.B
            r1.<init>(r13, r0)
            return r1
        L94:
            long r10 = r5 & r17
            int r0 = (int) r10
            int r7 = java.lang.Math.max(r4, r0)
            int r7 = r7 + r26
            if (r29 == 0) goto La1
            r2 = 0
            goto La7
        La1:
            r10 = r20
            d93 r2 = r2.a(r3, r10, r7)
        La7:
            if (r2 == 0) goto Lf3
            r13 = 1
            int r1 = r1 + r13
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r1 < r10) goto Lb1
            goto Lc1
        Lb1:
            long r10 = r22 >> r16
            int r1 = (int) r10
            long r5 = r5 >> r16
            int r5 = (int) r5
            int r1 = r1 - r5
            int r1 = r1 - r8
            long r5 = r2.a
            long r5 = r5 >> r16
            int r5 = (int) r5
            int r1 = r1 - r5
            if (r1 >= 0) goto Lf3
        Lc1:
            if (r29 == 0) goto Lca
            zf2 r0 = new zf2
            r13 = 1
            r0.<init>(r13, r13)
            return r0
        Lca:
            r13 = 1
            int r1 = defpackage.q21.h(r14)
            long r5 = r22 & r17
            int r5 = (int) r5
            int r5 = r5 - r9
            int r0 = java.lang.Math.max(r4, r0)
            int r5 = r5 - r0
            long r0 = defpackage.d93.a(r1, r5)
            int r6 = r3 + 1
            r9 = 1
            r10 = 1
            r3 = r0
            r1 = 0
            r5 = r2
            r2 = 0
            r8 = 0
            r0 = r19
            zf2 r0 = r0.b(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            zf2 r1 = new zf2
            boolean r0 = r0.B
            r1.<init>(r0, r0)
            return r1
        Lf3:
            zf2 r0 = new zf2
            r1 = 0
            r0.<init>(r1, r1)
            return r0
    }
}
