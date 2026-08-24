package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wy2  reason: default package */
/* loaded from: classes.dex */
public final class wy2 {
    public final defpackage.k80 a;
    public int b;
    public boolean c;
    public int d;
    public defpackage.uw2[] e;
    public int f;
    public int g;
    public int h;

    public wy2(defpackage.k80 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.b = r1
            r1 = 4096(0x1000, float:5.74E-42)
            r0.d = r1
            r1 = 8
            uw2[] r1 = new defpackage.uw2[r1]
            r0.e = r1
            r1 = 7
            r0.f = r1
            return
    }

    public final void a(int r5) {
            r4 = this;
            if (r5 <= 0) goto L4d
            uw2[] r0 = r4.e
            int r0 = r0.length
            int r0 = r0 + (-1)
            r1 = 0
        L8:
            int r2 = r4.f
            if (r0 < r2) goto L31
            if (r5 <= 0) goto L31
            uw2[] r2 = r4.e
            r2 = r2[r0]
            r2.getClass()
            int r2 = r2.c
            int r5 = r5 - r2
            int r2 = r4.h
            uw2[] r3 = r4.e
            r3 = r3[r0]
            r3.getClass()
            int r3 = r3.c
            int r2 = r2 - r3
            r4.h = r2
            int r2 = r4.g
            int r2 = r2 + (-1)
            r4.g = r2
            int r1 = r1 + 1
            int r0 = r0 + (-1)
            goto L8
        L31:
            uw2[] r5 = r4.e
            int r2 = r2 + 1
            int r0 = r2 + r1
            int r3 = r4.g
            java.lang.System.arraycopy(r5, r2, r5, r0, r3)
            uw2[] r5 = r4.e
            int r0 = r4.f
            int r0 = r0 + 1
            int r2 = r0 + r1
            r3 = 0
            java.util.Arrays.fill(r5, r0, r2, r3)
            int r5 = r4.f
            int r5 = r5 + r1
            r4.f = r5
        L4d:
            return
    }

    public final void b(defpackage.uw2 r7) {
            r6 = this;
            int r0 = r7.c
            int r1 = r6.d
            r2 = 0
            if (r0 <= r1) goto L1a
            uw2[] r7 = r6.e
            r0 = 0
            int r1 = r7.length
            defpackage.fv.z0(r2, r1, r0, r7)
            uw2[] r7 = r6.e
            int r7 = r7.length
            int r7 = r7 + (-1)
            r6.f = r7
            r6.g = r2
            r6.h = r2
            return
        L1a:
            int r3 = r6.h
            int r3 = r3 + r0
            int r3 = r3 - r1
            r6.a(r3)
            int r1 = r6.g
            int r1 = r1 + 1
            uw2[] r3 = r6.e
            int r4 = r3.length
            if (r1 <= r4) goto L3d
            int r1 = r3.length
            int r1 = r1 * 2
            uw2[] r1 = new defpackage.uw2[r1]
            int r4 = r3.length
            int r5 = r3.length
            java.lang.System.arraycopy(r3, r2, r1, r4, r5)
            uw2[] r2 = r6.e
            int r2 = r2.length
            int r2 = r2 + (-1)
            r6.f = r2
            r6.e = r1
        L3d:
            int r1 = r6.f
            int r2 = r1 + (-1)
            r6.f = r2
            uw2[] r2 = r6.e
            r2[r1] = r7
            int r7 = r6.g
            int r7 = r7 + 1
            r6.g = r7
            int r7 = r6.h
            int r7 = r7 + r0
            r6.h = r7
            return
    }

    public final void c(defpackage.da0 r12) {
            r11 = this;
            r12.getClass()
            int[] r0 = defpackage.j03.a
            int r0 = r12.d()
            r1 = 0
            r3 = 0
            r5 = r1
            r4 = r3
        Le:
            if (r4 >= r0) goto L21
            byte r7 = r12.i(r4)
            byte[] r8 = defpackage.yy7.a
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte[] r8 = defpackage.j03.b
            r7 = r8[r7]
            long r7 = (long) r7
            long r5 = r5 + r7
            int r4 = r4 + 1
            goto Le
        L21:
            r7 = 7
            long r5 = r5 + r7
            r0 = 3
            long r4 = r5 >> r0
            int r0 = (int) r4
            int r4 = r12.d()
            k80 r5 = r11.a
            r6 = 127(0x7f, float:1.78E-43)
            if (r0 >= r4) goto L84
            k80 r0 = new k80
            r0.<init>()
            int[] r4 = defpackage.j03.a
            int r4 = r12.d()
            r7 = r3
        L3e:
            if (r3 >= r4) goto L64
            byte r8 = r12.i(r3)
            byte[] r9 = defpackage.yy7.a
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = defpackage.j03.a
            r9 = r9[r8]
            byte[] r10 = defpackage.j03.b
            r8 = r10[r8]
            long r1 = r1 << r8
            long r9 = (long) r9
            long r1 = r1 | r9
            int r7 = r7 + r8
        L54:
            r8 = 8
            if (r7 < r8) goto L61
            int r7 = r7 + (-8)
            long r8 = r1 >> r7
            int r8 = (int) r8
            r0.n0(r8)
            goto L54
        L61:
            int r3 = r3 + 1
            goto L3e
        L64:
            if (r7 <= 0) goto L71
            int r12 = 8 - r7
            long r1 = r1 << r12
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 >>> r7
            long r1 = r1 | r3
            int r12 = (int) r1
            r0.n0(r12)
        L71:
            long r1 = r0.B
            da0 r12 = r0.l(r1)
            int r0 = r12.d()
            r1 = 128(0x80, float:1.8E-43)
            r11.e(r0, r6, r1)
            r5.k0(r12)
            return
        L84:
            int r0 = r12.d()
            r11.e(r0, r6, r3)
            r5.k0(r12)
            return
    }

    public final void d(java.util.ArrayList r14) {
            r13 = this;
            boolean r0 = r13.c
            r1 = 0
            if (r0 == 0) goto L1e
            int r0 = r13.b
            int r2 = r13.d
            r3 = 32
            r4 = 31
            if (r0 >= r2) goto L12
            r13.e(r0, r4, r3)
        L12:
            r13.c = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            r13.b = r0
            int r0 = r13.d
            r13.e(r0, r4, r3)
        L1e:
            int r0 = r14.size()
            r2 = r1
        L23:
            if (r2 >= r0) goto Lfb
            java.lang.Object r3 = r14.get(r2)
            uw2 r3 = (defpackage.uw2) r3
            da0 r4 = r3.a
            da0 r4 = r4.q()
            da0 r5 = r3.b
            java.util.Map r6 = defpackage.xy2.b
            java.lang.Object r6 = r6.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r7 = -1
            if (r6 == 0) goto L6c
            int r6 = r6.intValue()
            int r8 = r6 + 1
            r9 = 2
            if (r9 > r8) goto L69
            r9 = 8
            if (r8 >= r9) goto L69
            uw2[] r9 = defpackage.xy2.a
            r10 = r9[r6]
            da0 r10 = r10.b
            boolean r10 = defpackage.nb3.k(r10, r5)
            if (r10 == 0) goto L59
            r6 = r8
            goto L6e
        L59:
            r9 = r9[r8]
            da0 r9 = r9.b
            boolean r9 = defpackage.nb3.k(r9, r5)
            if (r9 == 0) goto L69
            int r6 = r6 + 2
            r12 = r8
            r8 = r6
            r6 = r12
            goto L6e
        L69:
            r6 = r8
            r8 = r7
            goto L6e
        L6c:
            r6 = r7
            r8 = r6
        L6e:
            if (r8 != r7) goto Lac
            int r9 = r13.f
            int r9 = r9 + 1
            uw2[] r10 = r13.e
            int r10 = r10.length
        L77:
            if (r9 >= r10) goto Lac
            uw2[] r11 = r13.e
            r11 = r11[r9]
            r11.getClass()
            da0 r11 = r11.a
            boolean r11 = defpackage.nb3.k(r11, r4)
            if (r11 == 0) goto La9
            uw2[] r11 = r13.e
            r11 = r11[r9]
            r11.getClass()
            da0 r11 = r11.b
            boolean r11 = defpackage.nb3.k(r11, r5)
            if (r11 == 0) goto L9f
            int r8 = r13.f
            int r9 = r9 - r8
            uw2[] r8 = defpackage.xy2.a
            int r8 = r8.length
            int r8 = r8 + r9
            goto Lac
        L9f:
            if (r6 != r7) goto La9
            int r6 = r13.f
            int r6 = r9 - r6
            uw2[] r11 = defpackage.xy2.a
            int r11 = r11.length
            int r6 = r6 + r11
        La9:
            int r9 = r9 + 1
            goto L77
        Lac:
            if (r8 == r7) goto Lb6
            r3 = 127(0x7f, float:1.78E-43)
            r4 = 128(0x80, float:1.8E-43)
            r13.e(r8, r3, r4)
            goto Lf7
        Lb6:
            r8 = 64
            if (r6 != r7) goto Lc9
            k80 r6 = r13.a
            r6.n0(r8)
            r13.c(r4)
            r13.c(r5)
            r13.b(r3)
            goto Lf7
        Lc9:
            da0 r7 = defpackage.uw2.d
            r4.getClass()
            r7.getClass()
            int r9 = r7.d()
            boolean r7 = r4.l(r1, r7, r9)
            if (r7 == 0) goto Lec
            da0 r7 = defpackage.uw2.i
            boolean r4 = defpackage.nb3.k(r7, r4)
            if (r4 != 0) goto Lec
            r3 = 15
            r13.e(r6, r3, r1)
            r13.c(r5)
            goto Lf7
        Lec:
            r4 = 63
            r13.e(r6, r4, r8)
            r13.c(r5)
            r13.b(r3)
        Lf7:
            int r2 = r2 + 1
            goto L23
        Lfb:
            return
    }

    public final void e(int r1, int r2, int r3) {
            r0 = this;
            k80 r0 = r0.a
            if (r1 >= r2) goto L9
            r1 = r1 | r3
            r0.n0(r1)
            return
        L9:
            r3 = r3 | r2
            r0.n0(r3)
            int r1 = r1 - r2
        Le:
            r2 = 128(0x80, float:1.8E-43)
            if (r1 < r2) goto L1b
            r3 = r1 & 127(0x7f, float:1.78E-43)
            r2 = r2 | r3
            r0.n0(r2)
            int r1 = r1 >>> 7
            goto Le
        L1b:
            r0.n0(r1)
            return
    }
}
