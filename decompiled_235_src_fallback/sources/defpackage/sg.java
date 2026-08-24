package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sg  reason: default package */
/* loaded from: classes.dex */
public final class sg {
    public final defpackage.qh1 a;
    public long b;
    public final defpackage.mr1 c;
    public final defpackage.vs4 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final defpackage.zg1 i;

    public sg(android.content.Context r3, defpackage.qh1 r4, long r5, defpackage.lq4 r7) {
            r2 = this;
            r2.<init>()
            r2.a = r4
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.b = r0
            mr1 r4 = new mr1
            int r5 = defpackage.hv.b0(r5)
            r4.<init>(r3, r5)
            r2.c = r4
            vs0 r3 = defpackage.vs0.j0
            vs4 r5 = new vs4
            jg7 r6 = defpackage.jg7.a
            r5.<init>(r6, r3)
            r2.d = r5
            r3 = 1
            r2.e = r3
            r5 = 0
            r2.g = r5
            r5 = -1
            r2.h = r5
            rg r3 = new rg
            r5 = 0
            r3.<init>(r2, r5)
            oy4 r5 = defpackage.jw6.a
            ow6 r5 = new ow6
            r6 = 0
            r5.<init>(r6, r6, r6, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 31
            if (r3 < r6) goto L47
            rs2 r3 = new rs2
            r3.<init>(r5, r2, r4)
            goto L4c
        L47:
            rs2 r3 = new rs2
            r3.<init>(r5, r2, r4, r7)
        L4c:
            r2.i = r3
            return
    }

    public final void a() {
            r5 = this;
            mr1 r0 = r5.c
            android.widget.EdgeEffect r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L11
            r1.onRelease()
            boolean r1 = r1.isFinished()
            r1 = r1 ^ r2
            goto L12
        L11:
            r1 = r3
        L12:
            android.widget.EdgeEffect r4 = r0.e
            if (r4 == 0) goto L25
            r4.onRelease()
            boolean r4 = r4.isFinished()
            if (r4 == 0) goto L24
            if (r1 == 0) goto L22
            goto L24
        L22:
            r1 = r3
            goto L25
        L24:
            r1 = r2
        L25:
            android.widget.EdgeEffect r4 = r0.f
            if (r4 == 0) goto L38
            r4.onRelease()
            boolean r4 = r4.isFinished()
            if (r4 == 0) goto L37
            if (r1 == 0) goto L35
            goto L37
        L35:
            r1 = r3
            goto L38
        L37:
            r1 = r2
        L38:
            android.widget.EdgeEffect r0 = r0.g
            if (r0 == 0) goto L4a
            r0.onRelease()
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L49
            if (r1 == 0) goto L48
            goto L49
        L48:
            r2 = r3
        L49:
            r1 = r2
        L4a:
            if (r1 == 0) goto L4f
            r5.d()
        L4f:
            return
    }

    public final java.lang.Object b(long r19, defpackage.l86 r21, defpackage.s41 r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            r4 = r22
            boolean r5 = r4 instanceof defpackage.pg
            if (r5 == 0) goto L1b
            r5 = r4
            pg r5 = (defpackage.pg) r5
            int r6 = r5.Z
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1b
            int r6 = r6 - r7
            r5.Z = r6
            goto L20
        L1b:
            pg r5 = new pg
            r5.<init>(r0, r4)
        L20:
            java.lang.Object r4 = r5.X
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r5.Z
            jg7 r8 = defpackage.jg7.a
            r9 = 2
            r10 = 1
            r11 = 0
            mr1 r12 = r0.c
            if (r7 == 0) goto L45
            if (r7 == r10) goto L41
            if (r7 != r9) goto L3a
            long r1 = r5.R
            defpackage.oi2.Y(r4)
            goto L13a
        L3a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L41:
            defpackage.oi2.Y(r4)
            return r8
        L45:
            defpackage.oi2.Y(r4)
            long r13 = r0.g
            boolean r4 = defpackage.xi6.f(r13)
            if (r4 == 0) goto L67
            r5.Z = r10
            r3.getClass()
            l86 r0 = new l86
            m86 r3 = r3.d0
            r0.<init>(r3, r5)
            r0.Z = r1
            java.lang.Object r0 = r0.s(r8)
            if (r0 != r6) goto L66
            goto L139
        L66:
            return r8
        L67:
            android.widget.EdgeEffect r4 = r12.f
            boolean r4 = defpackage.mr1.g(r4)
            r7 = 32
            qh1 r10 = r0.a
            if (r4 == 0) goto L90
            float r4 = defpackage.ol7.b(r1)
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 >= 0) goto L90
            android.widget.EdgeEffect r4 = r12.c()
            float r13 = defpackage.ol7.b(r1)
            long r14 = r0.g
            long r14 = r14 >> r7
            int r7 = (int) r14
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r4 = defpackage.vy7.G(r4, r13, r7, r10)
            goto Lb8
        L90:
            android.widget.EdgeEffect r4 = r12.g
            boolean r4 = defpackage.mr1.g(r4)
            if (r4 == 0) goto Lb7
            float r4 = defpackage.ol7.b(r1)
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 <= 0) goto Lb7
            android.widget.EdgeEffect r4 = r12.d()
            float r13 = defpackage.ol7.b(r1)
            float r13 = -r13
            long r14 = r0.g
            long r14 = r14 >> r7
            int r7 = (int) r14
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r4 = defpackage.vy7.G(r4, r13, r7, r10)
            float r4 = -r4
            goto Lb8
        Lb7:
            r4 = r11
        Lb8:
            android.widget.EdgeEffect r7 = r12.d
            boolean r7 = defpackage.mr1.g(r7)
            if (r7 == 0) goto Le3
            float r7 = defpackage.ol7.c(r1)
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 >= 0) goto Le3
            android.widget.EdgeEffect r7 = r12.e()
            float r15 = defpackage.ol7.c(r1)
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r0.g
            long r13 = r13 & r16
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            float r7 = defpackage.vy7.G(r7, r15, r13, r10)
            goto L111
        Le3:
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            android.widget.EdgeEffect r7 = r12.e
            boolean r7 = defpackage.mr1.g(r7)
            if (r7 == 0) goto L110
            float r7 = defpackage.ol7.c(r1)
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 <= 0) goto L110
            android.widget.EdgeEffect r7 = r12.b()
            float r13 = defpackage.ol7.c(r1)
            float r13 = -r13
            long r14 = r0.g
            long r14 = r14 & r16
            int r14 = (int) r14
            float r14 = java.lang.Float.intBitsToFloat(r14)
            float r7 = defpackage.vy7.G(r7, r13, r14, r10)
            float r7 = -r7
            goto L111
        L110:
            r7 = r11
        L111:
            long r13 = defpackage.qo2.k(r4, r7)
            r15 = 0
            int r4 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r4 != 0) goto L11c
            goto L11f
        L11c:
            r0.d()
        L11f:
            long r1 = defpackage.ol7.d(r1, r13)
            r5.R = r1
            r5.Z = r9
            r3.getClass()
            l86 r4 = new l86
            m86 r3 = r3.d0
            r4.<init>(r3, r5)
            r4.Z = r1
            java.lang.Object r4 = r4.s(r8)
            if (r4 != r6) goto L13a
        L139:
            return r6
        L13a:
            ol7 r4 = (defpackage.ol7) r4
            long r3 = r4.a
            long r1 = defpackage.ol7.d(r1, r3)
            r3 = 0
            r0.f = r3
            float r3 = defpackage.ol7.b(r1)
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            r4 = 31
            if (r3 <= 0) goto L16d
            android.widget.EdgeEffect r3 = r12.c()
            float r5 = defpackage.ol7.b(r1)
            int r5 = defpackage.u24.E(r5)
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L163
            r3.onAbsorb(r5)
            goto L193
        L163:
            boolean r6 = r3.isFinished()
            if (r6 == 0) goto L193
            r3.onAbsorb(r5)
            goto L193
        L16d:
            float r3 = defpackage.ol7.b(r1)
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 >= 0) goto L193
            android.widget.EdgeEffect r3 = r12.d()
            float r5 = defpackage.ol7.b(r1)
            int r5 = defpackage.u24.E(r5)
            int r5 = -r5
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L18a
            r3.onAbsorb(r5)
            goto L193
        L18a:
            boolean r6 = r3.isFinished()
            if (r6 == 0) goto L193
            r3.onAbsorb(r5)
        L193:
            float r3 = defpackage.ol7.c(r1)
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 <= 0) goto L1b9
            android.widget.EdgeEffect r3 = r12.e()
            float r1 = defpackage.ol7.c(r1)
            int r1 = defpackage.u24.E(r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L1af
            r3.onAbsorb(r1)
            goto L1df
        L1af:
            boolean r2 = r3.isFinished()
            if (r2 == 0) goto L1df
            r3.onAbsorb(r1)
            goto L1df
        L1b9:
            float r3 = defpackage.ol7.c(r1)
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 >= 0) goto L1df
            android.widget.EdgeEffect r3 = r12.b()
            float r1 = defpackage.ol7.c(r1)
            int r1 = defpackage.u24.E(r1)
            int r1 = -r1
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L1d6
            r3.onAbsorb(r1)
            goto L1df
        L1d6:
            boolean r2 = r3.isFinished()
            if (r2 == 0) goto L1df
            r3.onAbsorb(r1)
        L1df:
            r0.a()
            return r8
    }

    public final long c() {
            r8 = this;
            long r0 = r8.b
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r2 = r2 & r0
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L12
            goto L18
        L12:
            long r0 = r8.g
            long r0 = defpackage.ii2.v(r0)
        L18:
            r2 = 32
            long r3 = r0 >> r2
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            long r4 = r8.g
            long r4 = r4 >> r2
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r3 = r3 / r4
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r6 = r8.g
            long r6 = r6 & r4
            int r8 = (int) r6
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r0 = r0 / r8
            int r8 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r8
            int r8 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r8
            long r2 = r6 << r2
            long r0 = r0 & r4
            long r0 = r0 | r2
            return r0
    }

    public final void d() {
            r1 = this;
            boolean r0 = r1.e
            if (r0 == 0) goto Lb
            vs4 r1 = r1.d
            jg7 r0 = defpackage.jg7.a
            r1.setValue(r0)
        Lb:
            return
    }

    public final float e(long r9) {
            r8 = this;
            long r0 = r8.c()
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r1
            int r9 = (int) r9
            float r10 = java.lang.Float.intBitsToFloat(r9)
            long r3 = r8.g
            long r3 = r3 & r1
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r10 = r10 / r3
            mr1 r3 = r8.c
            android.widget.EdgeEffect r3 = r3.b()
            float r10 = -r10
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r0 < r5) goto L35
            float r10 = defpackage.up.g(r3, r10, r4)
            goto L38
        L35:
            r3.onPull(r10, r4)
        L38:
            float r10 = -r10
            long r6 = r8.g
            long r1 = r1 & r6
            int r8 = (int) r1
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = r8 * r10
            r10 = 0
            if (r0 < r5) goto L4a
            float r0 = defpackage.up.e(r3)
            goto L4b
        L4a:
            r0 = r10
        L4b:
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 != 0) goto L50
            return r8
        L50:
            float r8 = java.lang.Float.intBitsToFloat(r9)
            return r8
    }

    public final float f(long r8) {
            r7 = this;
            long r0 = r7.c()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 32
            long r8 = r8 >> r1
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            long r2 = r7.g
            long r2 = r2 >> r1
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r9 = r9 / r2
            mr1 r2 = r7.c
            android.widget.EdgeEffect r2 = r2.c()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r0 < r4) goto L34
            float r9 = defpackage.up.g(r2, r9, r3)
            goto L37
        L34:
            r2.onPull(r9, r3)
        L37:
            long r5 = r7.g
            long r5 = r5 >> r1
            int r7 = (int) r5
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r7 = r7 * r9
            r9 = 0
            if (r0 < r4) goto L48
            float r0 = defpackage.up.e(r2)
            goto L49
        L48:
            r0 = r9
        L49:
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 != 0) goto L4e
            return r7
        L4e:
            float r7 = java.lang.Float.intBitsToFloat(r8)
            return r7
    }

    public final float g(long r8) {
            r7 = this;
            long r0 = r7.c()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 32
            long r8 = r8 >> r1
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            long r2 = r7.g
            long r2 = r2 >> r1
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r9 = r9 / r2
            mr1 r2 = r7.c
            android.widget.EdgeEffect r2 = r2.d()
            float r9 = -r9
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L32
            float r9 = defpackage.up.g(r2, r9, r0)
            goto L35
        L32:
            r2.onPull(r9, r0)
        L35:
            float r9 = -r9
            long r5 = r7.g
            long r0 = r5 >> r1
            int r7 = (int) r0
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r7 = r7 * r9
            r9 = 0
            if (r3 < r4) goto L48
            float r0 = defpackage.up.e(r2)
            goto L49
        L48:
            r0 = r9
        L49:
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 != 0) goto L4e
            return r7
        L4e:
            float r7 = java.lang.Float.intBitsToFloat(r8)
            return r7
    }

    public final float h(long r9) {
            r8 = this;
            long r0 = r8.c()
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r1
            int r9 = (int) r9
            float r10 = java.lang.Float.intBitsToFloat(r9)
            long r3 = r8.g
            long r3 = r3 & r1
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r10 = r10 / r3
            mr1 r3 = r8.c
            android.widget.EdgeEffect r3 = r3.e()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L31
            float r10 = defpackage.up.g(r3, r10, r0)
            goto L34
        L31:
            r3.onPull(r10, r0)
        L34:
            long r6 = r8.g
            long r0 = r6 & r1
            int r8 = (int) r0
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = r8 * r10
            r10 = 0
            if (r4 < r5) goto L46
            float r0 = defpackage.up.e(r3)
            goto L47
        L46:
            r0 = r10
        L47:
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 != 0) goto L4c
            return r8
        L4c:
            float r8 = java.lang.Float.intBitsToFloat(r9)
            return r8
    }

    public final void i(long r11) {
            r10 = this;
            long r0 = r10.g
            r2 = 0
            boolean r0 = defpackage.xi6.b(r0, r2)
            long r1 = r10.g
            boolean r1 = defpackage.xi6.b(r11, r1)
            r10.g = r11
            if (r1 != 0) goto L9d
            r2 = 32
            long r3 = r11 >> r2
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            int r3 = defpackage.u24.E(r3)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r4
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            int r11 = defpackage.u24.E(r11)
            long r6 = (long) r3
            long r6 = r6 << r2
            long r11 = (long) r11
            long r11 = r11 & r4
            long r11 = r11 | r6
            mr1 r3 = r10.c
            r3.c = r11
            android.widget.EdgeEffect r6 = r3.d
            if (r6 == 0) goto L44
            long r7 = r11 >> r2
            int r7 = (int) r7
            long r8 = r11 & r4
            int r8 = (int) r8
            r6.setSize(r7, r8)
        L44:
            android.widget.EdgeEffect r6 = r3.e
            if (r6 == 0) goto L51
            long r7 = r11 >> r2
            int r7 = (int) r7
            long r8 = r11 & r4
            int r8 = (int) r8
            r6.setSize(r7, r8)
        L51:
            android.widget.EdgeEffect r6 = r3.f
            if (r6 == 0) goto L5e
            long r7 = r11 & r4
            int r7 = (int) r7
            long r8 = r11 >> r2
            int r8 = (int) r8
            r6.setSize(r7, r8)
        L5e:
            android.widget.EdgeEffect r6 = r3.g
            if (r6 == 0) goto L6b
            long r7 = r11 & r4
            int r7 = (int) r7
            long r8 = r11 >> r2
            int r8 = (int) r8
            r6.setSize(r7, r8)
        L6b:
            android.widget.EdgeEffect r6 = r3.h
            if (r6 == 0) goto L78
            long r7 = r11 >> r2
            int r7 = (int) r7
            long r8 = r11 & r4
            int r8 = (int) r8
            r6.setSize(r7, r8)
        L78:
            android.widget.EdgeEffect r6 = r3.i
            if (r6 == 0) goto L85
            long r7 = r11 >> r2
            int r7 = (int) r7
            long r8 = r11 & r4
            int r8 = (int) r8
            r6.setSize(r7, r8)
        L85:
            android.widget.EdgeEffect r6 = r3.j
            if (r6 == 0) goto L92
            long r7 = r11 & r4
            int r7 = (int) r7
            long r8 = r11 >> r2
            int r8 = (int) r8
            r6.setSize(r7, r8)
        L92:
            android.widget.EdgeEffect r3 = r3.k
            if (r3 == 0) goto L9d
            long r4 = r4 & r11
            int r4 = (int) r4
            long r11 = r11 >> r2
            int r11 = (int) r11
            r3.setSize(r4, r11)
        L9d:
            if (r0 != 0) goto La4
            if (r1 != 0) goto La4
            r10.a()
        La4:
            return
    }
}
