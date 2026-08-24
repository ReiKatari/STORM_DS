package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ut2  reason: default package */
/* loaded from: classes.dex */
public final class ut2 {
    public final defpackage.wt2 a;
    public defpackage.qh1 b;
    public defpackage.kk3 c;
    public defpackage.qn2 d;
    public final defpackage.mc e;
    public android.graphics.Outline f;
    public boolean g;
    public long h;
    public long i;
    public float j;
    public defpackage.mp2 k;
    public defpackage.hj l;
    public defpackage.hj m;
    public boolean n;
    public defpackage.zj0 o;
    public defpackage.aj p;
    public int q;
    public final defpackage.ka0 r;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public android.graphics.RectF x;

    static {
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            java.lang.String r1 = "robolectric"
            r0.equals(r1)
            return
    }

    public ut2(defpackage.wt2 r6) {
            r5 = this;
            r5.<init>()
            r5.a = r6
            th1 r0 = defpackage.hv.f
            r5.b = r0
            kk3 r0 = defpackage.kk3.Ltr
            r5.c = r0
            hh2 r0 = defpackage.hh2.X
            r5.d = r0
            mc r0 = new mc
            r1 = 15
            r0.<init>(r5, r1)
            r5.e = r0
            r0 = 1
            r5.g = r0
            r0 = 0
            r5.h = r0
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r5.i = r2
            ka0 r4 = new ka0
            r4.<init>()
            r5.r = r4
            r4 = 0
            r6.E(r4)
            r5.t = r0
            r5.u = r0
            r5.v = r2
            return
    }

    public final void a() {
            r17 = this;
            r0 = r17
            boolean r1 = r0.g
            r2 = 0
            if (r1 == 0) goto L133
            boolean r1 = r0.w
            r3 = 0
            wt2 r4 = r0.a
            if (r1 != 0) goto L22
            float r1 = r4.M()
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L18
            goto L22
        L18:
            r4.E(r2)
            r5 = 0
            r4.g(r3, r5)
            goto L133
        L22:
            hj r1 = r0.l
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = 32
            if (r1 == 0) goto Lc4
            android.graphics.RectF r8 = r0.x
            if (r8 != 0) goto L38
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r0.x = r8
        L38:
            boolean r9 = r1 instanceof defpackage.hj
            java.lang.String r10 = "Unable to obtain android.graphics.Path"
            if (r9 == 0) goto Lc0
            android.graphics.Path r11 = r1.a
            r11.computeBounds(r8, r2)
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 28
            r14 = 1
            if (r12 > r13) goto L5c
            boolean r13 = r11.isConvex()
            if (r13 == 0) goto L51
            goto L5c
        L51:
            android.graphics.Outline r9 = r0.f
            if (r9 == 0) goto L58
            r9.setEmpty()
        L58:
            r0.n = r14
            r13 = r3
            goto L81
        L5c:
            android.graphics.Outline r13 = r0.f
            if (r13 != 0) goto L67
            android.graphics.Outline r13 = new android.graphics.Outline
            r13.<init>()
            r0.f = r13
        L67:
            r15 = 30
            if (r12 < r15) goto L75
            if (r9 == 0) goto L71
            defpackage.m2.B(r13, r11)
            goto L7a
        L71:
            defpackage.fa6.h(r10)
            return
        L75:
            if (r9 == 0) goto Lbc
            r13.setConvexPath(r11)
        L7a:
            boolean r9 = r13.canClip()
            r9 = r9 ^ r14
            r0.n = r9
        L81:
            r0.l = r1
            if (r13 == 0) goto L8d
            float r1 = r4.a()
            r13.setAlpha(r1)
            r3 = r13
        L8d:
            float r1 = r8.width()
            int r1 = java.lang.Math.round(r1)
            float r8 = r8.height()
            int r8 = java.lang.Math.round(r8)
            long r9 = (long) r1
            long r9 = r9 << r7
            long r7 = (long) r8
            long r5 = r5 & r7
            long r5 = r5 | r9
            r4.g(r3, r5)
            boolean r1 = r0.n
            if (r1 == 0) goto Lb5
            boolean r1 = r0.w
            if (r1 == 0) goto Lb5
            r4.E(r2)
            r4.i()
            goto L133
        Lb5:
            boolean r1 = r0.w
            r4.E(r1)
            goto L133
        Lbc:
            defpackage.fa6.h(r10)
            return
        Lc0:
            defpackage.fa6.h(r10)
            return
        Lc4:
            boolean r1 = r0.w
            r4.E(r1)
            android.graphics.Outline r1 = r0.f
            if (r1 != 0) goto Ld4
            android.graphics.Outline r1 = new android.graphics.Outline
            r1.<init>()
            r0.f = r1
        Ld4:
            r8 = r1
            long r9 = r0.u
            long r9 = defpackage.qo2.S(r9)
            long r11 = r0.h
            long r13 = r0.i
            r15 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r1 != 0) goto Lea
            r14 = r9
            goto Leb
        Lea:
            r14 = r13
        Leb:
            long r9 = r11 >> r7
            int r1 = (int) r9
            float r3 = java.lang.Float.intBitsToFloat(r1)
            int r9 = java.lang.Math.round(r3)
            long r10 = r11 & r5
            int r3 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r3)
            int r10 = java.lang.Math.round(r10)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r11 = r14 >> r7
            int r7 = (int) r11
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r7 = r7 + r1
            int r11 = java.lang.Math.round(r7)
            float r1 = java.lang.Float.intBitsToFloat(r3)
            long r5 = r5 & r14
            int r3 = (int) r5
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r3 = r3 + r1
            int r12 = java.lang.Math.round(r3)
            float r13 = r0.j
            r8.setRoundRect(r9, r10, r11, r12, r13)
            float r1 = r4.a()
            r8.setAlpha(r1)
            long r5 = defpackage.qo2.Q(r14)
            r4.g(r8, r5)
        L133:
            r0.g = r2
            return
    }

    public final void b() {
            r15 = this;
            boolean r0 = r15.s
            if (r0 == 0) goto L75
            int r0 = r15.q
            if (r0 != 0) goto L75
            ka0 r0 = r15.r
            java.lang.Object r1 = r0.b
            ut2 r1 = (defpackage.ut2) r1
            if (r1 == 0) goto L1c
            int r2 = r1.q
            int r2 = r2 + (-1)
            r1.q = r2
            r1.b()
            r1 = 0
            r0.b = r1
        L1c:
            java.lang.Object r0 = r0.d
            ka4 r0 = (defpackage.ka4) r0
            if (r0 == 0) goto L70
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6d
            r4 = 0
            r5 = r4
        L2d:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L68
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L47:
            if (r10 >= r8) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L62
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            ut2 r11 = (defpackage.ut2) r11
            int r12 = r11.q
            int r12 = r12 + (-1)
            r11.q = r12
            r11.b()
        L62:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L47
        L66:
            if (r8 != r9) goto L6d
        L68:
            if (r5 == r3) goto L6d
            int r5 = r5 + 1
            goto L2d
        L6d:
            r0.b()
        L70:
            wt2 r15 = r15.a
            r15.i()
        L75:
            return
    }

    public final void c(defpackage.no1 r14) {
            r13 = this;
            ka0 r0 = r13.r
            java.lang.Object r1 = r0.b
            ut2 r1 = (defpackage.ut2) r1
            r0.c = r1
            java.lang.Object r1 = r0.d
            ka4 r1 = (defpackage.ka4) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.h()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.e
            ka4 r2 = (defpackage.ka4) r2
            if (r2 != 0) goto L23
            ka4 r2 = defpackage.c66.a
            ka4 r2 = new ka4
            r2.<init>()
            r0.e = r2
        L23:
            r2.j(r1)
            r1.b()
        L29:
            r1 = 1
            r0.a = r1
            qn2 r13 = r13.d
            r13.g(r14)
            r13 = 0
            r0.a = r13
            java.lang.Object r14 = r0.c
            ut2 r14 = (defpackage.ut2) r14
            if (r14 == 0) goto L43
            int r1 = r14.q
            int r1 = r1 + (-1)
            r14.q = r1
            r14.b()
        L43:
            java.lang.Object r14 = r0.e
            ka4 r14 = (defpackage.ka4) r14
            if (r14 == 0) goto L9c
            boolean r0 = r14.h()
            if (r0 == 0) goto L9c
            java.lang.Object[] r0 = r14.b
            long[] r1 = r14.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L99
            r3 = r13
        L59:
            r4 = r1[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L94
            int r6 = r3 - r2
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r13
        L73:
            if (r8 >= r6) goto L92
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L8e
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            ut2 r9 = (defpackage.ut2) r9
            int r10 = r9.q
            int r10 = r10 + (-1)
            r9.q = r10
            r9.b()
        L8e:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L73
        L92:
            if (r6 != r7) goto L99
        L94:
            if (r3 == r2) goto L99
            int r3 = r3 + 1
            goto L59
        L99:
            r14.b()
        L9c:
            return
    }

    public final defpackage.mp2 d() {
            r14 = this;
            mp2 r0 = r14.k
            hj r1 = r14.l
            if (r0 == 0) goto L7
            return r0
        L7:
            if (r1 == 0) goto L11
            po4 r0 = new po4
            r0.<init>(r1)
            r14.k = r0
            return r0
        L11:
            long r0 = r14.u
            long r0 = defpackage.qo2.S(r0)
            long r2 = r14.h
            long r4 = r14.i
            r6 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 != 0) goto L25
            goto L26
        L25:
            r0 = r4
        L26:
            r4 = 32
            long r5 = r2 >> r4
            int r5 = (int) r5
            float r6 = java.lang.Float.intBitsToFloat(r5)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r7
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r9 = r0 >> r4
            int r3 = (int) r9
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r3 = r3 + r6
            long r0 = r0 & r7
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r9 = r0 + r2
            float r0 = r14.j
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L6c
            ro4 r1 = new ro4
            int r5 = java.lang.Float.floatToRawIntBits(r0)
            long r10 = (long) r5
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r12 = (long) r0
            long r4 = r10 << r4
            long r7 = r7 & r12
            long r10 = r4 | r7
            r7 = r2
            r8 = r3
            u16 r0 = defpackage.mp2.c(r6, r7, r8, r9, r10)
            r1.<init>(r0)
            goto L78
        L6c:
            r7 = r2
            r8 = r3
            qo4 r1 = new qo4
            of5 r0 = new of5
            r0.<init>(r6, r7, r8, r9)
            r1.<init>(r0)
        L78:
            r14.k = r1
            return r1
    }

    public final void e(defpackage.qh1 r7, defpackage.kk3 r8, long r9, defpackage.qn2 r11) {
            r6 = this;
            long r0 = r6.u
            boolean r0 = defpackage.q93.b(r0, r9)
            wt2 r1 = r6.a
            if (r0 != 0) goto L2e
            r6.u = r9
            long r2 = r6.t
            r0 = 32
            long r4 = r2 >> r0
            int r0 = (int) r4
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            r1.B(r9, r0, r2)
            long r9 = r6.i
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 != 0) goto L2e
            r9 = 1
            r6.g = r9
            r6.a()
        L2e:
            r6.b = r7
            r6.c = r8
            r6.d = r11
            mc r9 = r6.e
            r1.G(r7, r8, r6, r9)
            return
    }

    public final void f(float r3, long r4, long r6) {
            r2 = this;
            long r0 = r2.h
            boolean r0 = defpackage.jk4.c(r0, r4)
            if (r0 == 0) goto L1c
            long r0 = r2.i
            boolean r0 = defpackage.xi6.b(r0, r6)
            if (r0 == 0) goto L1c
            float r0 = r2.j
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L1c
            hj r0 = r2.l
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            return
        L1c:
            r0 = 0
            r2.k = r0
            r2.l = r0
            r0 = 1
            r2.g = r0
            r0 = 0
            r2.n = r0
            r2.h = r4
            r2.i = r6
            r2.j = r3
            r2.a()
            return
    }
}
