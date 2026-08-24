package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z43  reason: default package */
/* loaded from: classes.dex */
public final class z43 {
    public final defpackage.yn1 a;
    public defpackage.u43 b;
    public defpackage.x43 c;
    public defpackage.w43 d;
    public defpackage.v43 e;
    public defpackage.np2 f;
    public defpackage.j97 g;
    public long h;
    public defpackage.kk i;
    public final defpackage.zb j;
    public final defpackage.zb k;
    public long l;

    public z43(defpackage.yn1 r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.h = r0
            zb r3 = new zb
            r0 = 0
            r1 = 6
            r3.<init>(r0, r1)
            ca4 r1 = new ca4
            r1.<init>()
            r3.L = r1
            r2.j = r3
            zb r3 = new zb
            r1 = 9
            r3.<init>(r0, r1)
            t94 r0 = new t94
            r0.<init>()
            r3.L = r0
            r2.k = r3
            r0 = 0
            r2.l = r0
            return
    }

    public static void c(defpackage.z43 r4, defpackage.s43 r5, long r6, long r8, int r10) {
            r10 = r10 & 4
            if (r10 == 0) goto L6
            r8 = 0
        L6:
            yn1 r10 = r4.a
            w43 r0 = r4.d
            r1 = 0
            if (r0 != 0) goto L21
            w43 r0 = new w43
            r2 = 2
            r0.<init>(r2)
            r2 = 0
            r0.e = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.f = r2
            r0.g = r1
            r4.d = r0
        L21:
            r0.e = r5
            r0.f = r6
            kk r5 = r4.i
            lo4 r6 = r10.m0
            if (r5 != 0) goto L33
            kk r5 = new kk
            r5.<init>(r6)
            r4.i = r5
            goto L37
        L33:
            r5.L = r6
            r5.B = r8
        L37:
            r0.g = r1
            r4.f = r0
            return
    }

    public final void a() {
            r4 = this;
            u43 r0 = r4.b
            r1 = 0
            if (r0 != 0) goto L13
            u43 r0 = new u43
            t43 r2 = defpackage.t43.NotInitialized
            r3 = 2
            r0.<init>(r3)
            r0.e = r2
            r0.f = r1
            r4.b = r0
        L13:
            t43 r2 = defpackage.t43.NotInitialized
            r0.e = r2
            r0.f = r1
            r4.f = r0
            return
    }

    public final void b(defpackage.s43 r4, long r5, defpackage.kk r7) {
            r3 = this;
            v43 r0 = r3.e
            if (r0 != 0) goto L16
            v43 r0 = new v43
            r1 = 2
            r0.<init>(r1)
            r1 = 0
            r0.e = r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.f = r1
            r3.e = r0
        L16:
            r0.e = r4
            r0.f = r5
            r4 = 0
            r7.B = r4
            r3.f = r0
            return
    }

    public final defpackage.j97 d() {
            r0 = this;
            j97 r0 = r0.g
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Velocity Tracker not initialized."
            defpackage.i.h(r0)
            r0 = 0
            return r0
    }

    public final void e(defpackage.s43 r17, defpackage.r43 r18, long r19) {
            r16 = this;
            r0 = r16
            r1 = r19
            yn1 r3 = r0.a
            eg4 r4 = defpackage.nc1.e0(r3)
            r5 = 0
            long r4 = r4.w(r5)
            long r6 = r0.h
            r8 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r6 = defpackage.jk4.c(r6, r8)
            if (r6 != 0) goto L33
            long r6 = r0.h
            boolean r6 = defpackage.jk4.c(r4, r6)
            if (r6 != 0) goto L33
            long r6 = r0.h
            long r6 = defpackage.jk4.e(r4, r6)
            long r8 = r0.l
            long r6 = defpackage.jk4.f(r8, r6)
            r0.l = r6
        L33:
            r0.h = r4
            lo4 r4 = r3.m0
            r4.getClass()
            do1 r5 = defpackage.eo1.a
            lo4 r5 = defpackage.lo4.Vertical
            r6 = 32
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r4 != r5) goto L4f
            long r4 = r1 & r7
        L49:
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            goto L52
        L4f:
            long r4 = r1 >> r6
            goto L49
        L52:
            float r4 = java.lang.Math.abs(r4)
            r5 = 1073741824(0x40000000, float:2.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Ldd
            j97 r9 = r0.d()
            lo4 r11 = r3.m0
            zb r13 = r0.j
            long r14 = r0.l
            r10 = r17
            r12 = r18
            defpackage.jx2.h(r9, r10, r11, r12, r13, r14)
            fn1 r4 = new fn1
            zb r0 = r0.k
            java.lang.Object r5 = r0.L
            t94 r5 = (defpackage.t94) r5
            int r9 = r5.b
            r10 = 3
            if (r9 != r10) goto L91
            int r11 = r0.B
            int r12 = r11 + 1
            r0.B = r12
            if (r11 < 0) goto L8b
            if (r11 >= r9) goto L8b
            long[] r9 = r5.a
            r12 = r9[r11]
            r9[r11] = r1
            goto L94
        L8b:
            java.lang.String r0 = "Index must be between 0 and size"
            defpackage.e41.q(r0)
            return
        L91:
            r5.a(r1)
        L94:
            int r1 = r0.B
            r2 = 0
            if (r1 != r10) goto L9b
            r0.B = r2
        L9b:
            long[] r0 = r5.a
            int r1 = r5.b
            r9 = 0
            r10 = r2
            r11 = r9
        La2:
            if (r10 >= r1) goto Lb0
            r12 = r0[r10]
            long r12 = r12 >> r6
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            float r11 = r11 + r12
            int r10 = r10 + 1
            goto La2
        Lb0:
            int r0 = r5.b
            float r1 = (float) r0
            float r11 = r11 / r1
            long[] r1 = r5.a
        Lb6:
            if (r2 >= r0) goto Lc4
            r12 = r1[r2]
            long r12 = r12 & r7
            int r10 = (int) r12
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r9 = r9 + r10
            int r2 = r2 + 1
            goto Lb6
        Lc4:
            int r0 = r5.b
            float r0 = (float) r0
            float r9 = r9 / r0
            int r0 = java.lang.Float.floatToRawIntBits(r11)
            long r0 = (long) r0
            int r2 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r2
            long r0 = r0 << r6
            long r5 = r9 & r7
            long r0 = r0 | r5
            r2 = 1
            r4.<init>(r0, r2)
            r3.c1(r4)
        Ldd:
            return
    }

    public final void f(defpackage.s43 r11, defpackage.s43 r12, defpackage.r43 r13, long r14) {
            r10 = this;
            j97 r0 = r10.g
            if (r0 != 0) goto Lb
            j97 r0 = new j97
            r0.<init>()
            r10.g = r0
        Lb:
            r0 = 0
            r10.l = r0
            j97 r2 = r10.d()
            yn1 r9 = r10.a
            lo4 r4 = r9.m0
            zb r6 = r10.j
            long r7 = r10.l
            r3 = r11
            r5 = r13
            defpackage.jx2.h(r2, r3, r4, r5, r6, r7)
            lo4 r11 = r9.m0
            long r11 = defpackage.jx2.I(r12, r11, r5)
            long r11 = defpackage.jk4.e(r11, r14)
            qn2 r13 = r9.n0
            bz4 r14 = new bz4
            r15 = 1
            r14.<init>(r15)
            java.lang.Object r13 = r13.g(r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L50
            eg4 r13 = defpackage.nc1.e0(r9)
            long r13 = r13.w(r0)
            r10.h = r13
            gn1 r13 = new gn1
            r13.<init>(r11)
            r9.c1(r13)
        L50:
            zb r10 = r10.k
            r11 = 0
            r10.B = r11
            java.lang.Object r10 = r10.L
            t94 r10 = (defpackage.t94) r10
            r10.b = r11
            return
    }
}
