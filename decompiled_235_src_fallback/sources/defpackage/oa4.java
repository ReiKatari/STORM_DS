package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oa4  reason: default package */
/* loaded from: classes.dex */
public class oa4 extends defpackage.vl6 {
    public static final int[] n = null;
    public final defpackage.qn2 e;
    public final defpackage.qn2 f;
    public int g;
    public defpackage.ka4 h;
    public java.util.ArrayList i;
    public defpackage.zl6 j;
    public int[] k;
    public int l;
    public boolean m;

    static {
            r0 = 0
            int[] r0 = new int[r0]
            defpackage.oa4.n = r0
            return
    }

    public oa4(long r1, defpackage.zl6 r3, defpackage.qn2 r4, defpackage.qn2 r5) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.e = r4
            r0.f = r5
            zl6 r1 = defpackage.zl6.X
            r0.j = r1
            int[] r1 = defpackage.oa4.n
            r0.k = r1
            r1 = 1
            r0.l = r1
            return
    }

    public final void A(long r3) {
            r2 = this;
            java.lang.Object r0 = defpackage.bm6.c
            monitor-enter(r0)
            zl6 r1 = r2.j     // Catch: java.lang.Throwable -> Ld
            zl6 r3 = r1.f(r3)     // Catch: java.lang.Throwable -> Ld
            r2.j = r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public void B(defpackage.ka4 r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public defpackage.oa4 C(defpackage.qn2 r12, defpackage.qn2 r13) {
            r11 = this;
            boolean r0 = r11.c
            if (r0 == 0) goto L9
            java.lang.String r0 = "Cannot use a disposed snapshot"
            defpackage.r05.a(r0)
        L9:
            boolean r0 = r11.m
            if (r0 == 0) goto L17
            int r0 = r11.d
            if (r0 < 0) goto L12
            goto L17
        L12:
            java.lang.String r0 = "Unsupported operation on a disposed or applied snapshot"
            defpackage.r05.b(r0)
        L17:
            long r0 = r11.g()
            r11.A(r0)
            java.lang.Object r1 = defpackage.bm6.c
            monitor-enter(r1)
            long r3 = defpackage.bm6.e     // Catch: java.lang.Throwable -> L96
            r9 = 1
            long r5 = r3 + r9
            defpackage.bm6.e = r5     // Catch: java.lang.Throwable -> L96
            zl6 r0 = defpackage.bm6.d     // Catch: java.lang.Throwable -> L96
            zl6 r0 = r0.f(r3)     // Catch: java.lang.Throwable -> L96
            defpackage.bm6.d = r0     // Catch: java.lang.Throwable -> L96
            zl6 r0 = r11.d()     // Catch: java.lang.Throwable -> L96
            zl6 r2 = r0.f(r3)     // Catch: java.lang.Throwable -> L96
            r11.r(r2)     // Catch: java.lang.Throwable -> L96
            xd4 r2 = new xd4     // Catch: java.lang.Throwable -> L96
            long r5 = r11.g()     // Catch: java.lang.Throwable -> L96
            long r5 = r5 + r9
            zl6 r5 = defpackage.bm6.d(r0, r5, r3)     // Catch: java.lang.Throwable -> L96
            qn2 r0 = r11.y()     // Catch: java.lang.Throwable -> L96
            r6 = 1
            qn2 r6 = defpackage.bm6.k(r12, r0, r6)     // Catch: java.lang.Throwable -> L96
            qn2 r12 = r11.i()     // Catch: java.lang.Throwable -> L96
            qn2 r7 = defpackage.bm6.l(r13, r12)     // Catch: java.lang.Throwable -> L96
            r8 = r11
            r2.<init>(r3, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r1)
            boolean r11 = r8.m
            if (r11 != 0) goto L95
            boolean r11 = r8.c
            if (r11 != 0) goto L95
            long r11 = r8.g()
            monitor-enter(r1)
            long r3 = defpackage.bm6.e     // Catch: java.lang.Throwable -> L91
            long r5 = r3 + r9
            defpackage.bm6.e = r5     // Catch: java.lang.Throwable -> L91
            r8.s(r3)     // Catch: java.lang.Throwable -> L91
            zl6 r13 = defpackage.bm6.d     // Catch: java.lang.Throwable -> L91
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L91
            zl6 r13 = r13.f(r3)     // Catch: java.lang.Throwable -> L91
            defpackage.bm6.d = r13     // Catch: java.lang.Throwable -> L91
            monitor-exit(r1)
            zl6 r13 = r8.d()
            long r11 = r11 + r9
            long r0 = r8.g()
            zl6 r11 = defpackage.bm6.d(r13, r11, r0)
            r8.r(r11)
            return r2
        L91:
            r0 = move-exception
            r11 = r0
            monitor-exit(r1)
            throw r11
        L95:
            return r2
        L96:
            r0 = move-exception
            r11 = r0
            monitor-exit(r1)
            throw r11
    }

    @Override // defpackage.vl6
    public final void b() {
            r3 = this;
            zl6 r0 = defpackage.bm6.d
            long r1 = r3.g()
            zl6 r0 = r0.b(r1)
            zl6 r3 = r3.j
            zl6 r3 = r0.a(r3)
            defpackage.bm6.d = r3
            return
    }

    @Override // defpackage.vl6
    public void c() {
            r1 = this;
            boolean r0 = r1.c
            if (r0 != 0) goto L15
            r0 = 1
            r1.c = r0
            java.lang.Object r0 = defpackage.bm6.c
            monitor-enter(r0)
            r1.o()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            r1.l()
            return
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L15:
            return
    }

    @Override // defpackage.vl6
    public /* bridge */ /* synthetic */ defpackage.qn2 e() {
            r0 = this;
            qn2 r0 = r0.y()
            return r0
    }

    @Override // defpackage.vl6
    public boolean f() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.vl6
    public int h() {
            r0 = this;
            int r0 = r0.g
            return r0
    }

    @Override // defpackage.vl6
    public defpackage.qn2 i() {
            r0 = this;
            qn2 r0 = r0.f
            return r0
    }

    @Override // defpackage.vl6
    public void k() {
            r1 = this;
            int r0 = r1.l
            int r0 = r0 + 1
            r1.l = r0
            return
    }

    @Override // defpackage.vl6
    public void l() {
            r17 = this;
            r0 = r17
            int r1 = r0.l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            defpackage.r05.a(r1)
        Lc:
            int r1 = r0.l
            int r1 = r1 + (-1)
            r0.l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.m
            if (r1 != 0) goto L94
            ka4 r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            defpackage.r05.b(r2)
        L27:
            r2 = 0
            r0.B(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            eq6 r13 = (defpackage.eq6) r13
            hq6 r13 = r13.a()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            zl6 r6 = r0.j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = defpackage.gt0.C0(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            r76 r6 = defpackage.bm6.a
            r14 = 0
            r13.a = r14
        L83:
            hq6 r13 = r13.b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
    }

    @Override // defpackage.vl6
    public void m() {
            r1 = this;
            boolean r0 = r1.m
            if (r0 != 0) goto Lc
            boolean r0 = r1.c
            if (r0 == 0) goto L9
            goto Lc
        L9:
            r1.v()
        Lc:
            return
    }

    @Override // defpackage.vl6
    public void n(defpackage.eq6 r2) {
            r1 = this;
            ka4 r0 = r1.x()
            if (r0 != 0) goto L10
            ka4 r0 = defpackage.c66.a
            ka4 r0 = new ka4
            r0.<init>()
            r1.B(r0)
        L10:
            r0.a(r2)
            return
    }

    @Override // defpackage.vl6
    public final void p() {
            r3 = this;
            int[] r0 = r3.k
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L10
            int[] r2 = r3.k
            r2 = r2[r1]
            defpackage.bm6.u(r2)
            int r1 = r1 + 1
            goto L4
        L10:
            r3.o()
            return
    }

    @Override // defpackage.vl6
    public void t(int r1) {
            r0 = this;
            r0.g = r1
            return
    }

    @Override // defpackage.vl6
    public defpackage.vl6 u(defpackage.qn2 r12) {
            r11 = this;
            boolean r0 = r11.c
            if (r0 == 0) goto L9
            java.lang.String r0 = "Cannot use a disposed snapshot"
            defpackage.r05.a(r0)
        L9:
            boolean r0 = r11.m
            if (r0 == 0) goto L17
            int r0 = r11.d
            if (r0 < 0) goto L12
            goto L17
        L12:
            java.lang.String r0 = "Unsupported operation on a disposed or applied snapshot"
            defpackage.r05.b(r0)
        L17:
            long r0 = r11.g()
            long r2 = r11.g()
            r11.A(r2)
            java.lang.Object r2 = defpackage.bm6.c
            monitor-enter(r2)
            long r4 = defpackage.bm6.e     // Catch: java.lang.Throwable -> L87
            r9 = 1
            long r6 = r4 + r9
            defpackage.bm6.e = r6     // Catch: java.lang.Throwable -> L87
            zl6 r3 = defpackage.bm6.d     // Catch: java.lang.Throwable -> L87
            zl6 r3 = r3.f(r4)     // Catch: java.lang.Throwable -> L87
            defpackage.bm6.d = r3     // Catch: java.lang.Throwable -> L87
            yd4 r3 = new yd4     // Catch: java.lang.Throwable -> L87
            zl6 r6 = r11.d()     // Catch: java.lang.Throwable -> L87
            long r0 = r0 + r9
            zl6 r6 = defpackage.bm6.d(r6, r0, r4)     // Catch: java.lang.Throwable -> L87
            qn2 r0 = r11.y()     // Catch: java.lang.Throwable -> L87
            r1 = 1
            qn2 r7 = defpackage.bm6.k(r12, r0, r1)     // Catch: java.lang.Throwable -> L87
            r8 = r11
            r3.<init>(r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r2)
            boolean r11 = r8.m
            if (r11 != 0) goto L86
            boolean r11 = r8.c
            if (r11 != 0) goto L86
            long r11 = r8.g()
            monitor-enter(r2)
            long r0 = defpackage.bm6.e     // Catch: java.lang.Throwable -> L82
            long r4 = r0 + r9
            defpackage.bm6.e = r4     // Catch: java.lang.Throwable -> L82
            r8.s(r0)     // Catch: java.lang.Throwable -> L82
            zl6 r0 = defpackage.bm6.d     // Catch: java.lang.Throwable -> L82
            long r4 = r8.g()     // Catch: java.lang.Throwable -> L82
            zl6 r0 = r0.f(r4)     // Catch: java.lang.Throwable -> L82
            defpackage.bm6.d = r0     // Catch: java.lang.Throwable -> L82
            monitor-exit(r2)
            zl6 r0 = r8.d()
            long r11 = r11 + r9
            long r1 = r8.g()
            zl6 r11 = defpackage.bm6.d(r0, r11, r1)
            r8.r(r11)
            return r3
        L82:
            r0 = move-exception
            r11 = r0
            monitor-exit(r2)
            throw r11
        L86:
            return r3
        L87:
            r0 = move-exception
            r11 = r0
            monitor-exit(r2)
            throw r11
    }

    public final void v() {
            r9 = this;
            long r0 = r9.g()
            r9.A(r0)
            boolean r0 = r9.m
            if (r0 != 0) goto L42
            boolean r0 = r9.c
            if (r0 != 0) goto L42
            long r0 = r9.g()
            java.lang.Object r2 = defpackage.bm6.c
            monitor-enter(r2)
            long r3 = defpackage.bm6.e     // Catch: java.lang.Throwable -> L3f
            r5 = 1
            long r7 = r3 + r5
            defpackage.bm6.e = r7     // Catch: java.lang.Throwable -> L3f
            r9.s(r3)     // Catch: java.lang.Throwable -> L3f
            zl6 r3 = defpackage.bm6.d     // Catch: java.lang.Throwable -> L3f
            long r7 = r9.g()     // Catch: java.lang.Throwable -> L3f
            zl6 r3 = r3.f(r7)     // Catch: java.lang.Throwable -> L3f
            defpackage.bm6.d = r3     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r2)
            zl6 r2 = r9.d()
            long r0 = r0 + r5
            long r3 = r9.g()
            zl6 r0 = defpackage.bm6.d(r2, r0, r3)
            r9.r(r0)
            return
        L3f:
            r9 = move-exception
            monitor-exit(r2)
            throw r9
        L42:
            return
    }

    public defpackage.qo2 w() {
            r22 = this;
            r0 = r22
            ka4 r3 = r0.x()
            r6 = 0
            if (r3 == 0) goto L19
            os2 r1 = defpackage.bm6.j
            long r1 = r1.b
            zl6 r4 = defpackage.bm6.d
            zl6 r4 = r4.b(r1)
            java.util.HashMap r1 = defpackage.bm6.b(r1, r0, r4)
            r4 = r1
            goto L1a
        L19:
            r4 = r6
        L1a:
            yt1 r1 = defpackage.yt1.A
            java.lang.Object r7 = defpackage.bm6.c
            monitor-enter(r7)
            defpackage.bm6.c(r0)     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L58
            int r2 = r3.d     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L29
            goto L58
        L29:
            os2 r8 = defpackage.bm6.j     // Catch: java.lang.Throwable -> L55
            long r1 = defpackage.bm6.e     // Catch: java.lang.Throwable -> L55
            zl6 r5 = defpackage.bm6.d     // Catch: java.lang.Throwable -> L55
            long r9 = r8.b     // Catch: java.lang.Throwable -> L55
            zl6 r5 = r5.b(r9)     // Catch: java.lang.Throwable -> L55
            qo2 r1 = r0.z(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L55
            xl6 r2 = defpackage.xl6.b     // Catch: java.lang.Throwable -> L55
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L43
            monitor-exit(r7)
            return r1
        L43:
            r0.b()     // Catch: java.lang.Throwable -> L55
            ka4 r1 = r8.h     // Catch: java.lang.Throwable -> L55
            r76 r2 = defpackage.bm6.a     // Catch: java.lang.Throwable -> L55
            defpackage.bm6.v(r8, r2)     // Catch: java.lang.Throwable -> L55
            r0.B(r6)     // Catch: java.lang.Throwable -> L55
            r8.h = r6     // Catch: java.lang.Throwable -> L55
            java.util.List r2 = defpackage.bm6.h     // Catch: java.lang.Throwable -> L55
            goto L73
        L55:
            r0 = move-exception
            goto L169
        L58:
            r0.b()     // Catch: java.lang.Throwable -> L55
            os2 r2 = defpackage.bm6.j     // Catch: java.lang.Throwable -> L55
            ka4 r4 = r2.h     // Catch: java.lang.Throwable -> L55
            r76 r5 = defpackage.bm6.a     // Catch: java.lang.Throwable -> L55
            defpackage.bm6.v(r2, r5)     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L71
            boolean r2 = r4.h()     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L71
            java.util.List r1 = defpackage.bm6.h     // Catch: java.lang.Throwable -> L55
            r2 = r1
            r1 = r4
            goto L73
        L71:
            r2 = r1
            r1 = r6
        L73:
            monitor-exit(r7)
            r4 = 1
            r0.m = r4
            if (r1 == 0) goto L97
            d66 r5 = new d66
            r5.<init>(r1)
            boolean r7 = r1.g()
            if (r7 != 0) goto L97
            int r7 = r2.size()
            r8 = 0
        L89:
            if (r8 >= r7) goto L97
            java.lang.Object r9 = r2.get(r8)
            eo2 r9 = (defpackage.eo2) r9
            r9.o(r5, r0)
            int r8 = r8 + 1
            goto L89
        L97:
            if (r3 == 0) goto Lb7
            boolean r5 = r3.h()
            if (r5 == 0) goto Lb7
            d66 r5 = new d66
            r5.<init>(r3)
            int r7 = r2.size()
            r8 = 0
        La9:
            if (r8 >= r7) goto Lb7
            java.lang.Object r9 = r2.get(r8)
            eo2 r9 = (defpackage.eo2) r9
            r9.o(r5, r0)
            int r8 = r8 + 1
            goto La9
        Lb7:
            java.lang.Object r2 = defpackage.bm6.c
            monitor-enter(r2)
            r0.p()     // Catch: java.lang.Throwable -> Lfe
            defpackage.bm6.f()     // Catch: java.lang.Throwable -> Lfe
            r5 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            if (r1 == 0) goto L10b
            java.lang.Object[] r14 = r1.b     // Catch: java.lang.Throwable -> Lfe
            long[] r1 = r1.a     // Catch: java.lang.Throwable -> Lfe
            int r15 = r1.length     // Catch: java.lang.Throwable -> Lfe
            int r15 = r15 + (-2)
            if (r15 < 0) goto L10b
            r4 = 0
            r16 = 128(0x80, double:6.3E-322)
        Ld6:
            r7 = r1[r4]     // Catch: java.lang.Throwable -> Lfe
            r18 = 255(0xff, double:1.26E-321)
            long r9 = ~r7     // Catch: java.lang.Throwable -> Lfe
            long r9 = r9 << r5
            long r9 = r9 & r7
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L106
            int r9 = r4 - r15
            int r9 = ~r9     // Catch: java.lang.Throwable -> Lfe
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        Lea:
            if (r10 >= r9) goto L104
            long r20 = r7 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L100
            int r20 = r4 << 3
            int r20 = r20 + r10
            r20 = r14[r20]     // Catch: java.lang.Throwable -> Lfe
            eq6 r20 = (defpackage.eq6) r20     // Catch: java.lang.Throwable -> Lfe
            defpackage.bm6.q(r20)     // Catch: java.lang.Throwable -> Lfe
            goto L100
        Lfe:
            r0 = move-exception
            goto L167
        L100:
            long r7 = r7 >> r13
            int r10 = r10 + 1
            goto Lea
        L104:
            if (r9 != r13) goto L10f
        L106:
            if (r4 == r15) goto L10f
            int r4 = r4 + 1
            goto Ld6
        L10b:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L10f:
            if (r3 == 0) goto L14a
            java.lang.Object[] r1 = r3.b     // Catch: java.lang.Throwable -> Lfe
            long[] r3 = r3.a     // Catch: java.lang.Throwable -> Lfe
            int r4 = r3.length     // Catch: java.lang.Throwable -> Lfe
            int r4 = r4 + (-2)
            if (r4 < 0) goto L14a
            r7 = 0
        L11b:
            r8 = r3[r7]     // Catch: java.lang.Throwable -> Lfe
            long r14 = ~r8     // Catch: java.lang.Throwable -> Lfe
            long r14 = r14 << r5
            long r14 = r14 & r8
            long r14 = r14 & r11
            int r10 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r10 == 0) goto L145
            int r10 = r7 - r4
            int r10 = ~r10     // Catch: java.lang.Throwable -> Lfe
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r14 = 0
        L12d:
            if (r14 >= r10) goto L143
            long r20 = r8 & r18
            int r15 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r15 >= 0) goto L13f
            int r15 = r7 << 3
            int r15 = r15 + r14
            r15 = r1[r15]     // Catch: java.lang.Throwable -> Lfe
            eq6 r15 = (defpackage.eq6) r15     // Catch: java.lang.Throwable -> Lfe
            defpackage.bm6.q(r15)     // Catch: java.lang.Throwable -> Lfe
        L13f:
            long r8 = r8 >> r13
            int r14 = r14 + 1
            goto L12d
        L143:
            if (r10 != r13) goto L14a
        L145:
            if (r7 == r4) goto L14a
            int r7 = r7 + 1
            goto L11b
        L14a:
            java.util.ArrayList r1 = r0.i     // Catch: java.lang.Throwable -> Lfe
            if (r1 == 0) goto L161
            int r3 = r1.size()     // Catch: java.lang.Throwable -> Lfe
            r4 = 0
        L153:
            if (r4 >= r3) goto L161
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Throwable -> Lfe
            eq6 r5 = (defpackage.eq6) r5     // Catch: java.lang.Throwable -> Lfe
            defpackage.bm6.q(r5)     // Catch: java.lang.Throwable -> Lfe
            int r4 = r4 + 1
            goto L153
        L161:
            r0.i = r6     // Catch: java.lang.Throwable -> Lfe
            monitor-exit(r2)
            xl6 r0 = defpackage.xl6.b
            return r0
        L167:
            monitor-exit(r2)
            throw r0
        L169:
            monitor-exit(r7)
            throw r0
    }

    public defpackage.ka4 x() {
            r0 = this;
            ka4 r0 = r0.h
            return r0
    }

    public defpackage.qn2 y() {
            r0 = this;
            qn2 r0 = r0.e
            return r0
    }

    public final defpackage.qo2 z(long r28, defpackage.ka4 r30, java.util.HashMap r31, defpackage.zl6 r32) {
            r27 = this;
            r0 = r27
            r1 = r28
            r3 = r30
            r4 = r31
            zl6 r5 = r0.d()
            long r6 = r0.g()
            zl6 r5 = r5.f(r6)
            zl6 r6 = r0.j
            zl6 r5 = r5.d(r6)
            java.lang.Object[] r6 = r3.b
            long[] r7 = r3.a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L169
            r11 = 0
            r12 = 0
            r13 = 0
        L26:
            r14 = r7[r11]
            r16 = 0
            long r9 = ~r14
            r17 = 7
            long r9 = r9 << r17
            long r9 = r9 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r17
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 == 0) goto L153
            int r9 = r11 - r8
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r17 = r10
            r10 = 0
        L47:
            if (r10 >= r9) goto L142
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L125
            int r18 = r11 << 3
            int r18 = r18 + r10
            r18 = r6[r18]
            r19 = r6
            r6 = r18
            eq6 r6 = (defpackage.eq6) r6
            r18 = r7
            hq6 r7 = r6.a()
            r20 = r10
            r21 = r12
            r10 = r32
            hq6 r12 = defpackage.bm6.s(r7, r1, r10)
            if (r12 != 0) goto L76
            r22 = r13
            r23 = r14
            goto L8d
        L76:
            r22 = r13
            r23 = r14
            long r13 = r0.g()
            hq6 r13 = defpackage.bm6.s(r7, r13, r5)
            if (r13 != 0) goto L85
            goto L8d
        L85:
            long r14 = r13.a
            r25 = 1
            int r14 = (r14 > r25 ? 1 : (r14 == r25 ? 0 : -1))
            if (r14 != 0) goto L91
        L8d:
            r25 = r5
            goto L122
        L91:
            boolean r14 = r12.equals(r13)
            if (r14 != 0) goto L8d
            long r14 = r0.g()
            r25 = r5
            zl6 r5 = r0.d()
            hq6 r5 = defpackage.bm6.s(r7, r14, r5)
            if (r5 == 0) goto L11e
            if (r4 == 0) goto Lb1
            java.lang.Object r7 = r4.get(r12)
            hq6 r7 = (defpackage.hq6) r7
            if (r7 != 0) goto Lb5
        Lb1:
            hq6 r7 = r6.b(r13, r12, r5)
        Lb5:
            if (r7 != 0) goto Lbd
            wl6 r1 = new wl6
            r1.<init>(r0)
            return r1
        Lbd:
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L122
            boolean r5 = r7.equals(r12)
            if (r5 == 0) goto Lf3
            if (r21 != 0) goto Ld1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            goto Ld3
        Ld1:
            r5 = r21
        Ld3:
            long r13 = r0.g()
            hq6 r7 = r12.b(r13)
            vr4 r12 = new vr4
            r12.<init>(r6, r7)
            r5.add(r12)
            if (r22 != 0) goto Lec
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r13 = r7
            goto Lee
        Lec:
            r13 = r22
        Lee:
            r13.add(r6)
            r12 = r5
            goto L135
        Lf3:
            if (r21 != 0) goto Lfc
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r12 = r5
            goto Lfe
        Lfc:
            r12 = r21
        Lfe:
            boolean r5 = r7.equals(r13)
            if (r5 != 0) goto L10a
            vr4 r5 = new vr4
            r5.<init>(r6, r7)
            goto L118
        L10a:
            long r14 = r0.g()
            hq6 r5 = r13.b(r14)
            vr4 r7 = new vr4
            r7.<init>(r6, r5)
            r5 = r7
        L118:
            r12.add(r5)
        L11b:
            r13 = r22
            goto L135
        L11e:
            defpackage.bm6.r()
            throw r16
        L122:
            r12 = r21
            goto L11b
        L125:
            r25 = r5
            r19 = r6
            r18 = r7
            r20 = r10
            r21 = r12
            r22 = r13
            r23 = r14
            r10 = r32
        L135:
            long r14 = r23 >> r17
            int r5 = r20 + 1
            r10 = r5
            r7 = r18
            r6 = r19
            r5 = r25
            goto L47
        L142:
            r10 = r32
            r25 = r5
            r19 = r6
            r18 = r7
            r21 = r12
            r22 = r13
            r5 = r17
            if (r9 != r5) goto L16f
            goto L15b
        L153:
            r10 = r32
            r25 = r5
            r19 = r6
            r18 = r7
        L15b:
            if (r11 == r8) goto L167
            int r11 = r11 + 1
            r7 = r18
            r6 = r19
            r5 = r25
            goto L26
        L167:
            r9 = r12
            goto L16e
        L169:
            r16 = 0
            r9 = r16
            r13 = r9
        L16e:
            r12 = r9
        L16f:
            if (r12 == 0) goto L19e
            r0.v()
            int r4 = r12.size()
            r5 = 0
        L179:
            if (r5 >= r4) goto L19e
            java.lang.Object r6 = r12.get(r5)
            vr4 r6 = (defpackage.vr4) r6
            java.lang.Object r7 = r6.A
            eq6 r7 = (defpackage.eq6) r7
            java.lang.Object r6 = r6.B
            hq6 r6 = (defpackage.hq6) r6
            r6.a = r1
            java.lang.Object r8 = defpackage.bm6.c
            monitor-enter(r8)
            hq6 r9 = r7.a()     // Catch: java.lang.Throwable -> L19b
            r6.b = r9     // Catch: java.lang.Throwable -> L19b
            r7.f(r6)     // Catch: java.lang.Throwable -> L19b
            monitor-exit(r8)
            int r5 = r5 + 1
            goto L179
        L19b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L19e:
            if (r13 == 0) goto L1be
            int r1 = r13.size()
            r10 = 0
        L1a5:
            if (r10 >= r1) goto L1b3
            java.lang.Object r2 = r13.get(r10)
            eq6 r2 = (defpackage.eq6) r2
            r3.l(r2)
            int r10 = r10 + 1
            goto L1a5
        L1b3:
            java.util.ArrayList r1 = r0.i
            if (r1 != 0) goto L1b8
            goto L1bc
        L1b8:
            java.util.ArrayList r13 = defpackage.gt0.V0(r1, r13)
        L1bc:
            r0.i = r13
        L1be:
            xl6 r0 = defpackage.xl6.b
            return r0
    }
}
