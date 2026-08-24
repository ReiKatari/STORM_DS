package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wx2  reason: default package */
/* loaded from: classes.dex */
public final class wx2 {
    public final defpackage.jk3 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final defpackage.ca4 f;
    public final defpackage.jg4 g;
    public final defpackage.u94 h;

    public wx2(defpackage.jk3 r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            ca4 r2 = new ca4
            r2.<init>()
            r1.f = r2
            jg4 r2 = new jg4
            r2.<init>()
            r1.g = r2
            u94 r2 = new u94
            r0 = 10
            r2.<init>(r0)
            r1.h = r2
            return
    }

    public final void a(long r19, java.util.List r21, boolean r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            int r3 = r21.size()
            jg4 r4 = r0.g
            r5 = 1
            r9 = r4
            r8 = r5
            r7 = 0
        Le:
            u94 r10 = r0.h
            if (r7 >= r3) goto L93
            r11 = r21
            java.lang.Object r12 = r11.get(r7)
            z64 r12 = (defpackage.z64) r12
            boolean r13 = r12.j0
            if (r13 == 0) goto L8f
            le r13 = new le
            r14 = 6
            r13.<init>(r14, r0, r12)
            r12.i0 = r13
            if (r8 == 0) goto L6a
            ua4 r13 = r9.a
            java.lang.Object[] r14 = r13.A
            int r13 = r13.L
            r15 = 0
        L2f:
            if (r15 >= r13) goto L43
            r16 = r14[r15]
            r6 = r16
            zf4 r6 = (defpackage.zf4) r6
            z64 r6 = r6.c
            boolean r6 = defpackage.nb3.k(r6, r12)
            if (r6 == 0) goto L40
            goto L45
        L40:
            int r15 = r15 + 1
            goto L2f
        L43:
            r16 = 0
        L45:
            r6 = r16
            zf4 r6 = (defpackage.zf4) r6
            if (r6 == 0) goto L69
            r6.i = r5
            zb r9 = r6.d
            r9.i(r1)
            if (r22 == 0) goto L67
            java.lang.Object r9 = r10.d(r1)
            if (r9 != 0) goto L62
            ca4 r9 = new ca4
            r9.<init>()
            r10.g(r1, r9)
        L62:
            ca4 r9 = (defpackage.ca4) r9
            r9.a(r6)
        L67:
            r9 = r6
            goto L8f
        L69:
            r8 = 0
        L6a:
            zf4 r6 = new zf4
            r6.<init>(r12)
            zb r12 = r6.d
            r12.i(r1)
            if (r22 == 0) goto L89
            java.lang.Object r12 = r10.d(r1)
            if (r12 != 0) goto L84
            ca4 r12 = new ca4
            r12.<init>()
            r10.g(r1, r12)
        L84:
            ca4 r12 = (defpackage.ca4) r12
            r12.a(r6)
        L89:
            ua4 r9 = r9.a
            r9.b(r6)
            goto L67
        L8f:
            int r7 = r7 + 1
            goto Le
        L93:
            if (r22 == 0) goto L106
            long[] r0 = r10.b
            java.lang.Object[] r1 = r10.c
            long[] r2 = r10.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L106
            r5 = 0
        La1:
            r6 = r2[r5]
            long r8 = ~r6
            r11 = 7
            long r8 = r8 << r11
            long r8 = r8 & r6
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto Lfd
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r11 = 0
        Lbb:
            if (r11 >= r8) goto Lf7
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r6
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto Lea
            int r12 = r5 << 3
            int r12 = r12 + r11
            r13 = r0[r12]
            r12 = r1[r12]
            ca4 r12 = (defpackage.ca4) r12
            ua4 r15 = r4.a
            r18 = r9
            java.lang.Object[] r9 = r15.A
            int r15 = r15.L
            r16 = r0
            r0 = 0
        Lda:
            if (r0 >= r15) goto Lee
            r17 = r9[r0]
            r19 = r0
            r0 = r17
            zf4 r0 = (defpackage.zf4) r0
            r0.f(r13, r12)
            int r0 = r19 + 1
            goto Lda
        Lea:
            r16 = r0
            r18 = r9
        Lee:
            long r6 = r6 >> r18
            int r11 = r11 + 1
            r9 = r18
            r0 = r16
            goto Lbb
        Lf7:
            r16 = r0
            r0 = r9
            if (r8 != r0) goto L106
            goto Lff
        Lfd:
            r16 = r0
        Lff:
            if (r5 == r3) goto L106
            int r5 = r5 + 1
            r0 = r16
            goto La1
        L106:
            r10.a()
            return
    }

    public final boolean b(defpackage.yc1 r10, boolean r11) {
            r9 = this;
            java.lang.Object r0 = r10.A
            hz3 r0 = (defpackage.hz3) r0
            jk3 r1 = r9.a
            jg4 r2 = r9.g
            boolean r0 = r2.a(r0, r1, r10, r11)
            ua4 r1 = r2.a
            r3 = 0
            if (r0 != 0) goto L12
            return r3
        L12:
            r0 = 1
            r9.b = r0
            java.lang.Object[] r4 = r1.A
            int r5 = r1.L
            r6 = r3
            r7 = r6
        L1b:
            if (r6 >= r5) goto L30
            r8 = r4[r6]
            zf4 r8 = (defpackage.zf4) r8
            boolean r8 = r8.e(r10, r11)
            if (r8 != 0) goto L2c
            if (r7 == 0) goto L2a
            goto L2c
        L2a:
            r7 = r3
            goto L2d
        L2c:
            r7 = r0
        L2d:
            int r6 = r6 + 1
            goto L1b
        L30:
            java.lang.Object[] r11 = r1.A
            int r1 = r1.L
            r4 = r3
            r5 = r4
        L36:
            if (r4 >= r1) goto L4b
            r6 = r11[r4]
            zf4 r6 = (defpackage.zf4) r6
            boolean r6 = r6.d(r10)
            if (r6 != 0) goto L47
            if (r5 == 0) goto L45
            goto L47
        L45:
            r5 = r3
            goto L48
        L47:
            r5 = r0
        L48:
            int r4 = r4 + 1
            goto L36
        L4b:
            r2.b(r10)
            if (r5 != 0) goto L54
            if (r7 == 0) goto L53
            goto L54
        L53:
            r0 = r3
        L54:
            r9.b = r3
            boolean r10 = r9.e
            if (r10 == 0) goto L72
            r9.e = r3
            ca4 r10 = r9.f
            int r11 = r10.b
            r1 = r3
        L61:
            if (r1 >= r11) goto L6f
            java.lang.Object r4 = r10.f(r1)
            z64 r4 = (defpackage.z64) r4
            r9.d(r4)
            int r1 = r1 + 1
            goto L61
        L6f:
            r10.d()
        L72:
            boolean r10 = r9.c
            if (r10 == 0) goto L7b
            r9.c = r3
            r9.c()
        L7b:
            boolean r10 = r9.d
            if (r10 == 0) goto L86
            r9.d = r3
            ua4 r9 = r2.a
            r9.g()
        L86:
            return r0
    }

    public final void c() {
            r6 = this;
            boolean r0 = r6.b
            r1 = 1
            if (r0 == 0) goto L8
            r6.c = r1
            return
        L8:
            jg4 r0 = r6.g
            ua4 r2 = r0.a
            java.lang.Object[] r3 = r2.A
            int r2 = r2.L
            r4 = 0
        L11:
            if (r4 >= r2) goto L1d
            r5 = r3[r4]
            zf4 r5 = (defpackage.zf4) r5
            r5.c()
            int r4 = r4 + 1
            goto L11
        L1d:
            boolean r2 = r6.d
            if (r2 == 0) goto L24
            r6.d = r1
            return
        L24:
            ua4 r6 = r0.a
            r6.g()
            return
    }

    public final void d(defpackage.z64 r6) {
            r5 = this;
            boolean r0 = r5.b
            r1 = 1
            if (r0 == 0) goto Ld
            r5.e = r1
            ca4 r5 = r5.f
            r5.a(r6)
            return
        Ld:
            jg4 r5 = r5.g
            ca4 r0 = r5.b
            r0.d()
            r0.a(r5)
        L17:
            boolean r5 = r0.i()
            if (r5 == 0) goto L4a
            int r5 = r0.b
            int r5 = r5 - r1
            java.lang.Object r5 = r0.k(r5)
            jg4 r5 = (defpackage.jg4) r5
            r2 = 0
        L27:
            ua4 r3 = r5.a
            int r4 = r3.L
            if (r2 >= r4) goto L17
            java.lang.Object[] r3 = r3.A
            r3 = r3[r2]
            zf4 r3 = (defpackage.zf4) r3
            z64 r4 = r3.c
            boolean r4 = defpackage.nb3.k(r4, r6)
            if (r4 == 0) goto L44
            ua4 r4 = r5.a
            r4.j(r3)
            r3.c()
            goto L27
        L44:
            r0.a(r3)
            int r2 = r2 + 1
            goto L27
        L4a:
            return
    }
}
