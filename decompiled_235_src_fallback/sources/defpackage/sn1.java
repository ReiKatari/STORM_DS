package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sn1  reason: default package */
/* loaded from: classes.dex */
public abstract class sn1 {
    public static final float a = 0.0f;

    static {
            r0 = 1040187392(0x3e000000, float:0.125)
            r1 = 1099956224(0x41900000, float:18.0)
            float r0 = r0 / r1
            defpackage.sn1.a = r0
            return
    }

    public static final java.lang.Object a(defpackage.mw6 r17, long r18, defpackage.s41 r20) {
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof defpackage.jn1
            if (r3 == 0) goto L17
            r3 = r2
            jn1 r3 = (defpackage.jn1) r3
            int r4 = r3.Z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.Z = r4
            goto L1c
        L17:
            jn1 r3 = new jn1
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.Y
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.Z
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L36
            if (r5 != r6) goto L30
            ch5 r0 = r3.X
            mw6 r1 = r3.R
            defpackage.oi2.Y(r2)
            goto L63
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r7
        L36:
            defpackage.oi2.Y(r2)
            r2 = r17
            ow6 r5 = r2.Y
            oy4 r5 = r5.p0
            boolean r5 = f(r5, r0)
            if (r5 == 0) goto L47
            goto Lc8
        L47:
            ch5 r5 = new ch5
            r5.<init>()
            r5.A = r0
            r0 = r5
        L4f:
            r3.R = r2
            r3.X = r0
            r3.Z = r6
            py4 r1 = defpackage.py4.Main
            java.lang.Object r1 = r2.c(r1, r3)
            if (r1 != r4) goto L5e
            return r4
        L5e:
            r16 = r2
            r2 = r1
            r1 = r16
        L63:
            oy4 r2 = (defpackage.oy4) r2
            java.util.List r5 = r2.a
            int r8 = r5.size()
            r9 = 0
            r10 = r9
        L6d:
            if (r10 >= r8) goto L84
            java.lang.Object r11 = r5.get(r10)
            r12 = r11
            vy4 r12 = (defpackage.vy4) r12
            long r12 = r12.a
            long r14 = r0.A
            boolean r12 = defpackage.nj2.o(r12, r14)
            if (r12 == 0) goto L81
            goto L85
        L81:
            int r10 = r10 + 1
            goto L6d
        L84:
            r11 = r7
        L85:
            vy4 r11 = (defpackage.vy4) r11
            if (r11 != 0) goto L8b
            r11 = r7
            goto Lbf
        L8b:
            boolean r5 = defpackage.ej2.p(r11)
            if (r5 == 0) goto Lb3
            java.util.List r2 = r2.a
            int r5 = r2.size()
        L97:
            if (r9 >= r5) goto La8
            java.lang.Object r8 = r2.get(r9)
            r10 = r8
            vy4 r10 = (defpackage.vy4) r10
            boolean r10 = r10.d
            if (r10 == 0) goto La5
            goto La9
        La5:
            int r9 = r9 + 1
            goto L97
        La8:
            r8 = r7
        La9:
            vy4 r8 = (defpackage.vy4) r8
            if (r8 != 0) goto Lae
            goto Lbf
        Lae:
            long r8 = r8.a
            r0.A = r8
            goto Lc9
        Lb3:
            long r8 = defpackage.ej2.R(r11, r6)
            r12 = 0
            boolean r2 = defpackage.jk4.c(r8, r12)
            if (r2 != 0) goto Lc9
        Lbf:
            if (r11 == 0) goto Lc8
            boolean r0 = r11.c()
            if (r0 != 0) goto Lc8
            return r11
        Lc8:
            return r7
        Lc9:
            r2 = r1
            goto L4f
    }

    public static final java.lang.Object b(defpackage.mw6 r9, long r10, defpackage.s41 r12) {
            boolean r0 = r12 instanceof defpackage.kn1
            if (r0 == 0) goto L13
            r0 = r12
            kn1 r0 = (defpackage.kn1) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            kn1 r0 = new kn1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            zg5 r9 = r0.Y
            dh5 r10 = r0.X
            vy4 r11 = r0.R
            defpackage.oi2.Y(r12)     // Catch: defpackage.qy4 -> La4
            goto L97
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            return r4
        L34:
            defpackage.oi2.Y(r12)
            ow6 r12 = r9.Y
            oy4 r12 = r12.p0
            boolean r12 = f(r12, r10)
            if (r12 == 0) goto L42
            goto La3
        L42:
            ow6 r12 = r9.Y
            oy4 r12 = r12.p0
            java.util.List r12 = r12.a
            int r2 = r12.size()
            r5 = 0
        L4d:
            if (r5 >= r2) goto L62
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            vy4 r7 = (defpackage.vy4) r7
            long r7 = r7.a
            boolean r7 = defpackage.nj2.o(r7, r10)
            if (r7 == 0) goto L5f
            goto L63
        L5f:
            int r5 = r5 + 1
            goto L4d
        L62:
            r6 = r4
        L63:
            r11 = r6
            vy4 r11 = (defpackage.vy4) r11
            if (r11 != 0) goto L69
            goto La3
        L69:
            dh5 r10 = new dh5
            r10.<init>()
            dh5 r12 = new dh5
            r12.<init>()
            r12.A = r11
            fo7 r2 = r9.f()
            long r5 = r2.b()
            zg5 r2 = new zg5     // Catch: defpackage.qy4 -> La4
            r2.<init>()     // Catch: defpackage.qy4 -> La4
            ln1 r7 = new ln1     // Catch: defpackage.qy4 -> La4
            r7.<init>(r2, r12, r10, r4)     // Catch: defpackage.qy4 -> La4
            r0.R = r11     // Catch: defpackage.qy4 -> La4
            r0.X = r10     // Catch: defpackage.qy4 -> La4
            r0.Y = r2     // Catch: defpackage.qy4 -> La4
            r0.d0 = r3     // Catch: defpackage.qy4 -> La4
            java.lang.Object r9 = r9.k(r5, r7, r0)     // Catch: defpackage.qy4 -> La4
            if (r9 != r1) goto L96
            return r1
        L96:
            r9 = r2
        L97:
            boolean r9 = r9.A     // Catch: defpackage.qy4 -> La4
            if (r9 == 0) goto La3
            java.lang.Object r9 = r10.A     // Catch: defpackage.qy4 -> La4
            vy4 r9 = (defpackage.vy4) r9     // Catch: defpackage.qy4 -> La4
            if (r9 != 0) goto La2
            return r11
        La2:
            return r9
        La3:
            return r4
        La4:
            java.lang.Object r9 = r10.A
            vy4 r9 = (defpackage.vy4) r9
            if (r9 != 0) goto Lab
            goto Lac
        Lab:
            r11 = r9
        Lac:
            return r11
    }

    public static final java.lang.Object c(defpackage.mw6 r18, long r19, defpackage.y36 r21, defpackage.d20 r22) {
            r0 = r19
            r2 = r22
            boolean r3 = r2 instanceof defpackage.mn1
            if (r3 == 0) goto L17
            r3 = r2
            mn1 r3 = (defpackage.mn1) r3
            int r4 = r3.g0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.g0 = r4
            goto L1c
        L17:
            mn1 r3 = new mn1
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f0
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.g0
            r6 = 0
            r8 = 2
            r9 = 1
            r10 = 0
            if (r5 == 0) goto L64
            if (r5 == r9) goto L50
            if (r5 != r8) goto L4a
            float r0 = r3.e0
            vy4 r1 = r3.d0
            kk r5 = r3.Z
            ch5 r11 = r3.Y
            mw6 r12 = r3.X
            eo2 r13 = r3.R
            defpackage.oi2.Y(r2)
            r22 = r12
            r12 = r11
            r11 = r22
            r15 = r8
            r2 = r9
            r22 = r10
            r7 = r6
            r6 = r0
            r0 = r13
            goto L165
        L4a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r10
        L50:
            float r0 = r3.e0
            kk r1 = r3.Z
            ch5 r5 = r3.Y
            mw6 r11 = r3.X
            eo2 r12 = r3.R
            defpackage.oi2.Y(r2)
            r17 = r5
            r5 = r0
            r0 = r12
        L61:
            r12 = r17
            goto Lab
        L64:
            defpackage.oi2.Y(r2)
            r2 = r18
            ow6 r5 = r2.Y
            oy4 r5 = r5.p0
            boolean r5 = f(r5, r0)
            if (r5 == 0) goto L77
            r22 = r10
            goto L16b
        L77:
            fo7 r5 = r2.f()
            float r5 = r5.f()
            ch5 r11 = new ch5
            r11.<init>()
            r11.A = r0
            kk r0 = new kk
            r0.<init>(r6, r10)
            r1 = r0
            r0 = r21
        L8e:
            r3.R = r0
            r3.X = r2
            r3.Y = r11
            r3.Z = r1
            r3.d0 = r10
            r3.e0 = r5
            r3.g0 = r9
            py4 r12 = defpackage.py4.Main
            java.lang.Object r12 = r2.c(r12, r3)
            if (r12 != r4) goto La6
            goto L15e
        La6:
            r17 = r11
            r11 = r2
            r2 = r12
            goto L61
        Lab:
            oy4 r2 = (defpackage.oy4) r2
            java.util.List r13 = r2.a
            int r14 = r13.size()
            r22 = r10
            r10 = 0
        Lb6:
            if (r10 >= r14) goto Ld2
            java.lang.Object r16 = r13.get(r10)
            r15 = r16
            vy4 r15 = (defpackage.vy4) r15
            long r6 = r15.a
            long r8 = r12.A
            boolean r6 = defpackage.nj2.o(r6, r8)
            if (r6 == 0) goto Lcb
            goto Ld4
        Lcb:
            int r10 = r10 + 1
            r6 = 0
            r8 = 2
            r9 = 1
            goto Lb6
        Ld2:
            r16 = r22
        Ld4:
            r6 = r16
            vy4 r6 = (defpackage.vy4) r6
            if (r6 != 0) goto Ldc
            goto L16b
        Ldc:
            boolean r7 = r6.c()
            if (r7 == 0) goto Le4
            goto L16b
        Le4:
            boolean r7 = defpackage.ej2.p(r6)
            if (r7 == 0) goto L111
            java.util.List r2 = r2.a
            int r6 = r2.size()
            r7 = 0
        Lf1:
            if (r7 >= r6) goto L102
            java.lang.Object r8 = r2.get(r7)
            r9 = r8
            vy4 r9 = (defpackage.vy4) r9
            boolean r9 = r9.d
            if (r9 == 0) goto Lff
            goto L104
        Lff:
            int r7 = r7 + 1
            goto Lf1
        L102:
            r8 = r22
        L104:
            vy4 r8 = (defpackage.vy4) r8
            if (r8 != 0) goto L109
            goto L16b
        L109:
            long r6 = r8.a
            r12.A = r6
            r2 = 1
            r7 = 0
            goto L13c
        L111:
            r2 = 1
            long r7 = defpackage.ej2.R(r6, r2)
            long r7 = r1.e(r5, r7, r2)
            r9 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r9 = r9 & r7
            r13 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L145
            jk4 r9 = new jk4
            r9.<init>(r7)
            r0.o(r6, r9)
            boolean r7 = r6.c()
            if (r7 == 0) goto L138
            return r6
        L138:
            r7 = 0
            r1.B = r7
        L13c:
            r10 = r22
            r9 = r2
            r6 = r7
            r2 = r11
            r11 = r12
            r8 = 2
            goto L8e
        L145:
            r7 = 0
            py4 r9 = defpackage.py4.Final
            r3.R = r0
            r3.X = r11
            r3.Y = r12
            r3.Z = r1
            r3.d0 = r6
            r3.e0 = r5
            r15 = 2
            r3.g0 = r15
            java.lang.Object r9 = r11.c(r9, r3)
            if (r9 != r4) goto L15f
        L15e:
            return r4
        L15f:
            r17 = r5
            r5 = r1
            r1 = r6
            r6 = r17
        L165:
            boolean r1 = r1.c()
            if (r1 == 0) goto L16c
        L16b:
            return r22
        L16c:
            r10 = r22
            r9 = r2
            r1 = r5
            r5 = r6
            r6 = r7
            r2 = r11
            r11 = r12
            r8 = r15
            goto L8e
    }

    public static final java.lang.Object d(defpackage.mw6 r18, long r19, int r21, defpackage.z5 r22, defpackage.d20 r23) {
            r0 = r19
            r2 = r23
            boolean r3 = r2 instanceof defpackage.nn1
            if (r3 == 0) goto L17
            r3 = r2
            nn1 r3 = (defpackage.nn1) r3
            int r4 = r3.g0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.g0 = r4
            goto L1c
        L17:
            nn1 r3 = new nn1
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f0
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.g0
            r6 = 0
            r8 = 2
            r9 = 1
            r10 = 0
            if (r5 == 0) goto L61
            if (r5 == r9) goto L4c
            if (r5 != r8) goto L46
            float r0 = r3.e0
            vy4 r1 = r3.d0
            kk r5 = r3.Z
            ch5 r11 = r3.Y
            mw6 r12 = r3.X
            eo2 r13 = r3.R
            defpackage.oi2.Y(r2)
            r15 = r8
            r2 = r9
            r23 = r10
            r7 = r6
            r6 = r11
            r11 = r0
            r0 = r13
            goto L16c
        L46:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r10
        L4c:
            float r0 = r3.e0
            kk r1 = r3.Z
            ch5 r5 = r3.Y
            mw6 r11 = r3.X
            eo2 r12 = r3.R
            defpackage.oi2.Y(r2)
            r17 = r11
            r11 = r0
            r0 = r12
            r12 = r5
            r5 = r17
            goto La7
        L61:
            defpackage.oi2.Y(r2)
            lo4 r2 = defpackage.lo4.Vertical
            r5 = r18
            ow6 r11 = r5.Y
            oy4 r11 = r11.p0
            boolean r11 = f(r11, r0)
            if (r11 == 0) goto L76
            r23 = r10
            goto L172
        L76:
            fo7 r11 = r5.f()
            r12 = r21
            float r11 = g(r11, r12)
            ch5 r12 = new ch5
            r12.<init>()
            r12.A = r0
            kk r0 = new kk
            r0.<init>(r6, r2)
            r1 = r0
            r0 = r22
        L8f:
            r3.R = r0
            r3.X = r5
            r3.Y = r12
            r3.Z = r1
            r3.d0 = r10
            r3.e0 = r11
            r3.g0 = r9
            py4 r2 = defpackage.py4.Main
            java.lang.Object r2 = r5.c(r2, r3)
            if (r2 != r4) goto La7
            goto L164
        La7:
            oy4 r2 = (defpackage.oy4) r2
            java.util.List r13 = r2.a
            int r14 = r13.size()
            r23 = r10
            r10 = 0
        Lb2:
            if (r10 >= r14) goto Lce
            java.lang.Object r16 = r13.get(r10)
            r15 = r16
            vy4 r15 = (defpackage.vy4) r15
            long r6 = r15.a
            long r8 = r12.A
            boolean r6 = defpackage.nj2.o(r6, r8)
            if (r6 == 0) goto Lc7
            goto Ld0
        Lc7:
            int r10 = r10 + 1
            r6 = 0
            r8 = 2
            r9 = 1
            goto Lb2
        Lce:
            r16 = r23
        Ld0:
            r6 = r16
            vy4 r6 = (defpackage.vy4) r6
            if (r6 != 0) goto Ld8
            goto L172
        Ld8:
            boolean r7 = r6.c()
            if (r7 == 0) goto Le0
            goto L172
        Le0:
            boolean r7 = defpackage.ej2.p(r6)
            if (r7 == 0) goto L10e
            java.util.List r2 = r2.a
            int r6 = r2.size()
            r7 = 0
        Led:
            if (r7 >= r6) goto Lfe
            java.lang.Object r8 = r2.get(r7)
            r9 = r8
            vy4 r9 = (defpackage.vy4) r9
            boolean r9 = r9.d
            if (r9 == 0) goto Lfb
            goto L100
        Lfb:
            int r7 = r7 + 1
            goto Led
        Lfe:
            r8 = r23
        L100:
            vy4 r8 = (defpackage.vy4) r8
            if (r8 != 0) goto L106
            goto L172
        L106:
            long r6 = r8.a
            r12.A = r6
            r2 = 1
            r7 = 0
            goto L144
        L10e:
            r2 = 1
            long r7 = defpackage.ej2.R(r6, r2)
            long r7 = r1.e(r11, r7, r2)
            r9 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r9 = r9 & r7
            r13 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L14b
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            r0.o(r6, r8)
            boolean r7 = r6.c()
            if (r7 == 0) goto L140
            return r6
        L140:
            r7 = 0
            r1.B = r7
        L144:
            r10 = r23
            r9 = r2
            r6 = r7
            r8 = 2
            goto L8f
        L14b:
            r7 = 0
            py4 r9 = defpackage.py4.Final
            r3.R = r0
            r3.X = r5
            r3.Y = r12
            r3.Z = r1
            r3.d0 = r6
            r3.e0 = r11
            r15 = 2
            r3.g0 = r15
            java.lang.Object r9 = r5.c(r9, r3)
            if (r9 != r4) goto L165
        L164:
            return r4
        L165:
            r17 = r5
            r5 = r1
            r1 = r6
            r6 = r12
            r12 = r17
        L16c:
            boolean r1 = r1.c()
            if (r1 == 0) goto L173
        L172:
            return r23
        L173:
            r10 = r23
            r9 = r2
            r1 = r5
            r5 = r12
            r12 = r6
            r6 = r7
            r8 = r15
            goto L8f
    }

    public static final java.lang.Object e(defpackage.mw6 r4, long r5, defpackage.qn2 r7, defpackage.s41 r8) {
            boolean r0 = r8 instanceof defpackage.pn1
            if (r0 == 0) goto L13
            r0 = r8
            pn1 r0 = (defpackage.pn1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            pn1 r0 = new pn1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            qn2 r4 = r0.X
            mw6 r5 = r0.R
            defpackage.oi2.Y(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L34:
            defpackage.oi2.Y(r8)
        L37:
            r0.R = r4
            r0.X = r7
            r0.Z = r3
            java.lang.Object r8 = a(r4, r5, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            vy4 r8 = (defpackage.vy4) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = defpackage.ej2.p(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.g(r8)
            long r5 = r8.a
            goto L37
    }

    public static final boolean f(defpackage.oy4 r6, long r7) {
            java.util.List r6 = r6.a
            int r0 = r6.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1d
            java.lang.Object r3 = r6.get(r2)
            r4 = r3
            vy4 r4 = (defpackage.vy4) r4
            long r4 = r4.a
            boolean r4 = defpackage.nj2.o(r4, r7)
            if (r4 == 0) goto L1a
            goto L1e
        L1a:
            int r2 = r2 + 1
            goto L8
        L1d:
            r3 = 0
        L1e:
            vy4 r3 = (defpackage.vy4) r3
            r6 = 1
            if (r3 == 0) goto L28
            boolean r7 = r3.d
            if (r7 != r6) goto L28
            r1 = r6
        L28:
            r6 = r6 ^ r1
            return r6
    }

    public static final float g(defpackage.fo7 r1, int r2) {
            r0 = 2
            if (r2 != r0) goto Lb
            float r1 = r1.f()
            float r2 = defpackage.sn1.a
            float r1 = r1 * r2
            return r1
        Lb:
            float r1 = r1.f()
            return r1
    }

    public static final java.lang.Object h(defpackage.mw6 r25, defpackage.vy4 r26, defpackage.c5 r27, defpackage.ov4 r28, defpackage.z5 r29, defpackage.dz3 r30, defpackage.k0 r31, defpackage.d20 r32) {
            r0 = r25
            r1 = r32
            boolean r2 = r1 instanceof defpackage.qn1
            if (r2 == 0) goto L17
            r2 = r1
            qn1 r2 = (defpackage.qn1) r2
            int r3 = r2.o0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.o0 = r3
            goto L1c
        L17:
            qn1 r2 = new qn1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.n0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.o0
            r6 = 0
            switch(r4) {
                case 0: goto L1d1;
                case 1: goto L19b;
                case 2: goto L157;
                case 3: goto L10f;
                case 4: goto Ldb;
                case 5: goto L94;
                case 6: goto L4b;
                case 7: goto L2c;
                default: goto L26;
            }
        L26:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r6
        L2c:
            java.lang.Object r0 = r2.e0
            ch5 r0 = (defpackage.ch5) r0
            java.lang.Object r4 = r2.d0
            mw6 r4 = (defpackage.mw6) r4
            java.lang.Object r5 = r2.Z
            mw6 r5 = (defpackage.mw6) r5
            ao2 r7 = r2.Y
            qn2 r7 = (defpackage.qn2) r7
            java.lang.Object r8 = r2.X
            on2 r8 = (defpackage.on2) r8
            java.lang.Object r9 = r2.R
            eo2 r9 = (defpackage.eo2) r9
            defpackage.oi2.Y(r1)
            r14 = r3
            r3 = r6
            goto L601
        L4b:
            float r0 = r2.m0
            vy4 r4 = r2.k0
            kk r5 = r2.j0
            ch5 r15 = r2.i0
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            java.lang.Object r7 = r2.h0
            mw6 r7 = (defpackage.mw6) r7
            java.lang.Object r8 = r2.g0
            ch5 r8 = (defpackage.ch5) r8
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            java.lang.Object r9 = r2.f0
            vy4 r9 = (defpackage.vy4) r9
            java.lang.Object r10 = r2.e0
            qn2 r10 = (defpackage.qn2) r10
            java.lang.Object r13 = r2.d0
            on2 r13 = (defpackage.on2) r13
            java.lang.Object r11 = r2.Z
            eo2 r11 = (defpackage.eo2) r11
            ao2 r12 = r2.Y
            fo2 r12 = (defpackage.fo2) r12
            java.lang.Object r14 = r2.X
            lo4 r14 = (defpackage.lo4) r14
            java.lang.Object r6 = r2.R
            mw6 r6 = (defpackage.mw6) r6
            defpackage.oi2.Y(r1)
            r1 = r14
            r14 = r3
            r3 = r6
            r6 = r10
            r10 = r1
            r1 = r12
            r12 = r5
            r5 = r9
            r9 = r1
            r1 = r0
            r0 = r8
            r8 = r11
            r11 = r7
            r7 = r13
            goto L585
        L94:
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            float r0 = r2.m0
            kk r4 = r2.j0
            ch5 r5 = r2.i0
            java.lang.Object r6 = r2.h0
            mw6 r6 = (defpackage.mw6) r6
            java.lang.Object r7 = r2.g0
            ch5 r7 = (defpackage.ch5) r7
            java.lang.Object r8 = r2.f0
            vy4 r8 = (defpackage.vy4) r8
            java.lang.Object r9 = r2.e0
            qn2 r9 = (defpackage.qn2) r9
            java.lang.Object r10 = r2.d0
            on2 r10 = (defpackage.on2) r10
            java.lang.Object r11 = r2.Z
            eo2 r11 = (defpackage.eo2) r11
            ao2 r12 = r2.Y
            fo2 r12 = (defpackage.fo2) r12
            java.lang.Object r13 = r2.X
            lo4 r13 = (defpackage.lo4) r13
            java.lang.Object r14 = r2.R
            mw6 r14 = (defpackage.mw6) r14
            defpackage.oi2.Y(r1)
            r15 = r5
            r5 = r8
            r8 = r11
            r11 = r6
            r6 = r9
            r9 = r12
            r12 = r4
            r4 = r14
            r14 = r3
            r3 = r2
            r2 = r0
            r0 = r7
            r7 = r10
            r10 = r13
            goto L493
        Ldb:
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            java.lang.Object r0 = r2.h0
            ch5 r0 = (defpackage.ch5) r0
            java.lang.Object r4 = r2.g0
            vy4 r4 = (defpackage.vy4) r4
            java.lang.Object r5 = r2.f0
            vy4 r5 = (defpackage.vy4) r5
            java.lang.Object r6 = r2.e0
            qn2 r6 = (defpackage.qn2) r6
            java.lang.Object r7 = r2.d0
            on2 r7 = (defpackage.on2) r7
            java.lang.Object r8 = r2.Z
            eo2 r8 = (defpackage.eo2) r8
            ao2 r9 = r2.Y
            fo2 r9 = (defpackage.fo2) r9
            java.lang.Object r10 = r2.X
            lo4 r10 = (defpackage.lo4) r10
            java.lang.Object r11 = r2.R
            mw6 r11 = (defpackage.mw6) r11
            defpackage.oi2.Y(r1)
            r14 = r3
            goto L3e4
        L10f:
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            float r0 = r2.m0
            vy4 r4 = r2.k0
            kk r6 = r2.j0
            ch5 r7 = r2.i0
            java.lang.Object r8 = r2.h0
            mw6 r8 = (defpackage.mw6) r8
            java.lang.Object r9 = r2.g0
            ch5 r9 = (defpackage.ch5) r9
            java.lang.Object r10 = r2.f0
            vy4 r10 = (defpackage.vy4) r10
            java.lang.Object r11 = r2.e0
            qn2 r11 = (defpackage.qn2) r11
            java.lang.Object r12 = r2.d0
            on2 r12 = (defpackage.on2) r12
            java.lang.Object r13 = r2.Z
            eo2 r13 = (defpackage.eo2) r13
            ao2 r14 = r2.Y
            fo2 r14 = (defpackage.fo2) r14
            java.lang.Object r15 = r2.X
            lo4 r15 = (defpackage.lo4) r15
            java.lang.Object r5 = r2.R
            mw6 r5 = (defpackage.mw6) r5
            defpackage.oi2.Y(r1)
            r1 = r13
            r13 = r6
            r6 = r1
            r1 = r9
            r9 = r7
            r7 = r12
            r12 = r1
            r1 = r10
            r10 = r8
            r8 = r11
            r11 = r5
            r5 = r14
            r14 = r3
            goto L37e
        L157:
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            float r0 = r2.m0
            kk r4 = r2.j0
            ch5 r5 = r2.i0
            java.lang.Object r6 = r2.h0
            mw6 r6 = (defpackage.mw6) r6
            java.lang.Object r7 = r2.g0
            ch5 r7 = (defpackage.ch5) r7
            java.lang.Object r8 = r2.f0
            vy4 r8 = (defpackage.vy4) r8
            java.lang.Object r9 = r2.e0
            qn2 r9 = (defpackage.qn2) r9
            java.lang.Object r10 = r2.d0
            on2 r10 = (defpackage.on2) r10
            java.lang.Object r11 = r2.Z
            eo2 r11 = (defpackage.eo2) r11
            ao2 r12 = r2.Y
            fo2 r12 = (defpackage.fo2) r12
            java.lang.Object r13 = r2.X
            lo4 r13 = (defpackage.lo4) r13
            java.lang.Object r14 = r2.R
            mw6 r14 = (defpackage.mw6) r14
            defpackage.oi2.Y(r1)
            r15 = r11
            r11 = r6
            r6 = r15
            r15 = r4
            r4 = r13
            r13 = r7
            r7 = r10
            r10 = r5
            r5 = r12
            r12 = r14
            r14 = 2
            goto L284
        L19b:
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            boolean r0 = r2.l0
            java.lang.Object r4 = r2.f0
            qn2 r4 = (defpackage.qn2) r4
            java.lang.Object r5 = r2.e0
            on2 r5 = (defpackage.on2) r5
            java.lang.Object r6 = r2.d0
            eo2 r6 = (defpackage.eo2) r6
            java.lang.Object r7 = r2.Z
            fo2 r7 = (defpackage.fo2) r7
            ao2 r8 = r2.Y
            lo4 r8 = (defpackage.lo4) r8
            java.lang.Object r9 = r2.X
            vy4 r9 = (defpackage.vy4) r9
            java.lang.Object r10 = r2.R
            mw6 r10 = (defpackage.mw6) r10
            defpackage.oi2.Y(r1)
            r24 = r8
            r8 = r4
            r4 = r24
            r24 = r7
            r7 = r5
            r5 = r24
            goto L21a
        L1d1:
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            defpackage.oi2.Y(r1)
            r27.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L1ec
            r26.a()
        L1ec:
            r2.R = r0
            r4 = r26
            r2.X = r4
            r5 = 0
            r2.Y = r5
            r5 = r28
            r2.Z = r5
            r6 = r29
            r2.d0 = r6
            r7 = r30
            r2.e0 = r7
            r8 = r31
            r2.f0 = r8
            r2.l0 = r1
            r9 = 1
            r2.o0 = r9
            r9 = 2
            java.lang.Object r10 = defpackage.hz6.b(r0, r2, r9)
            if (r10 != r3) goto L214
        L211:
            r14 = r3
            goto L600
        L214:
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r9
            r9 = r4
            r4 = 0
        L21a:
            vy4 r1 = (defpackage.vy4) r1
            ch5 r11 = new ch5
            r11.<init>()
            r12 = 0
            r11.A = r12
            if (r0 == 0) goto L39b
        L227:
            long r12 = r1.a
            int r0 = r1.i
            ow6 r9 = r10.Y
            oy4 r9 = r9.p0
            boolean r9 = f(r9, r12)
            if (r9 == 0) goto L239
            r14 = r3
        L236:
            r0 = 0
            goto L389
        L239:
            fo7 r9 = r10.f()
            float r0 = g(r9, r0)
            ch5 r9 = new ch5
            r9.<init>()
            r9.A = r12
            kk r12 = new kk
            r13 = 0
            r12.<init>(r13, r4)
            r13 = r12
            r12 = r11
            r11 = r10
        L252:
            r2.R = r11
            r2.X = r4
            r2.Y = r5
            r2.Z = r6
            r2.d0 = r7
            r2.e0 = r8
            r2.f0 = r1
            r2.g0 = r12
            r2.h0 = r10
            r2.i0 = r9
            r2.j0 = r13
            r14 = 0
            r2.k0 = r14
            r2.m0 = r0
            r14 = 2
            r2.o0 = r14
            py4 r15 = defpackage.py4.Main
            java.lang.Object r15 = r10.c(r15, r2)
            if (r15 != r3) goto L279
            goto L211
        L279:
            r24 = r8
            r8 = r1
            r1 = r15
            r15 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r24
        L284:
            oy4 r1 = (defpackage.oy4) r1
            java.util.List r14 = r1.a
            r21 = r3
            int r3 = r14.size()
            r25 = r11
            r11 = 0
        L291:
            if (r11 >= r3) goto L2bb
            java.lang.Object r22 = r14.get(r11)
            r26 = r3
            r3 = r22
            vy4 r3 = (defpackage.vy4) r3
            r27 = r8
            r28 = r9
            long r8 = r3.a
            r3 = r6
            r29 = r7
            long r6 = r10.A
            boolean r6 = defpackage.nj2.o(r8, r6)
            if (r6 == 0) goto L2af
            goto L2c4
        L2af:
            int r11 = r11 + 1
            r8 = r27
            r9 = r28
            r7 = r29
            r6 = r3
            r3 = r26
            goto L291
        L2bb:
            r3 = r6
            r29 = r7
            r27 = r8
            r28 = r9
            r22 = 0
        L2c4:
            r6 = r22
            vy4 r6 = (defpackage.vy4) r6
            if (r6 != 0) goto L2d7
        L2ca:
            r1 = r27
            r8 = r28
            r7 = r29
            r6 = r3
            r10 = r12
            r11 = r13
            r14 = r21
            goto L236
        L2d7:
            boolean r7 = r6.c()
            if (r7 == 0) goto L2de
            goto L2ca
        L2de:
            boolean r7 = defpackage.ej2.p(r6)
            if (r7 == 0) goto L307
            java.util.List r1 = r1.a
            int r6 = r1.size()
            r7 = 0
        L2eb:
            if (r7 >= r6) goto L2fc
            java.lang.Object r8 = r1.get(r7)
            r9 = r8
            vy4 r9 = (defpackage.vy4) r9
            boolean r9 = r9.d
            if (r9 == 0) goto L2f9
            goto L2fd
        L2f9:
            int r7 = r7 + 1
            goto L2eb
        L2fc:
            r8 = 0
        L2fd:
            vy4 r8 = (defpackage.vy4) r8
            if (r8 != 0) goto L302
            goto L2ca
        L302:
            long r6 = r8.a
            r10.A = r6
            goto L333
        L307:
            r9 = 1
            long r7 = defpackage.ej2.R(r6, r9)
            long r7 = r15.e(r0, r7, r9)
            long r22 = r7 & r18
            int r1 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r1 == 0) goto L344
            r6.a()
            r13.A = r7
            boolean r1 = r6.c()
            if (r1 == 0) goto L32f
            r1 = r27
            r8 = r28
            r7 = r29
            r0 = r6
            r10 = r12
            r11 = r13
            r14 = r21
            r6 = r3
            goto L389
        L32f:
            r6 = 0
            r15.B = r6
        L333:
            r1 = r27
            r8 = r28
            r7 = r29
            r6 = r3
            r9 = r10
            r11 = r12
            r12 = r13
            r13 = r15
            r3 = r21
            r10 = r25
            goto L252
        L344:
            py4 r1 = defpackage.py4.Final
            r2.R = r12
            r2.X = r4
            r2.Y = r5
            r2.Z = r3
            r7 = r29
            r2.d0 = r7
            r8 = r28
            r2.e0 = r8
            r9 = r27
            r2.f0 = r9
            r2.g0 = r13
            r11 = r25
            r2.h0 = r11
            r2.i0 = r10
            r2.j0 = r15
            r2.k0 = r6
            r2.m0 = r0
            r14 = 3
            r2.o0 = r14
            java.lang.Object r1 = r11.c(r1, r2)
            r14 = r21
            if (r1 != r14) goto L375
            goto L600
        L375:
            r1 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r15
            r15 = r4
            r4 = r6
            r6 = r3
        L37e:
            boolean r3 = r4.c()
            if (r3 == 0) goto L397
            r10 = r11
            r11 = r12
            r4 = r15
            goto L236
        L389:
            if (r0 == 0) goto L395
            boolean r3 = r0.c()
            if (r3 == 0) goto L392
            goto L395
        L392:
            r3 = r14
            goto L227
        L395:
            r9 = r0
            goto L39c
        L397:
            r3 = r14
            r4 = r15
            goto L252
        L39b:
            r14 = r3
        L39c:
            if (r9 != 0) goto L5a9
            ow6 r0 = r10.Y
            oy4 r0 = r0.p0
            java.util.List r0 = r0.a
            int r3 = r0.size()
            r12 = 0
        L3a9:
            if (r12 >= r3) goto L5a9
            java.lang.Object r13 = r0.get(r12)
            vy4 r13 = (defpackage.vy4) r13
            boolean r13 = r13.d
            if (r13 == 0) goto L5a5
            r0 = r8
            r8 = r6
            r6 = r0
            r0 = r11
            r11 = r10
            r10 = r4
            r4 = r9
            r9 = r5
            r5 = r1
        L3be:
            py4 r1 = defpackage.py4.Final
            r2.R = r11
            r2.X = r10
            r2.Y = r9
            r2.Z = r8
            r2.d0 = r7
            r2.e0 = r6
            r2.f0 = r5
            r2.g0 = r4
            r2.h0 = r0
            r3 = 0
            r2.i0 = r3
            r2.j0 = r3
            r2.k0 = r3
            r3 = 4
            r2.o0 = r3
            java.lang.Object r1 = r11.c(r1, r2)
            if (r1 != r14) goto L3e4
            goto L600
        L3e4:
            oy4 r1 = (defpackage.oy4) r1
            java.util.List r1 = r1.a
            int r3 = r1.size()
            r12 = 0
        L3ed:
            if (r12 >= r3) goto L413
            java.lang.Object r13 = r1.get(r12)
            vy4 r13 = (defpackage.vy4) r13
            boolean r13 = r13.c()
            if (r13 == 0) goto L410
            int r3 = r1.size()
            r12 = 0
        L400:
            if (r12 >= r3) goto L413
            java.lang.Object r13 = r1.get(r12)
            vy4 r13 = (defpackage.vy4) r13
            boolean r13 = r13.d
            if (r13 == 0) goto L40d
            goto L3be
        L40d:
            int r12 = r12 + 1
            goto L400
        L410:
            int r12 = r12 + 1
            goto L3ed
        L413:
            int r3 = r1.size()
            r12 = 0
        L418:
            if (r12 >= r3) goto L59a
            java.lang.Object r13 = r1.get(r12)
            vy4 r13 = (defpackage.vy4) r13
            boolean r13 = r13.d
            if (r13 == 0) goto L596
            java.lang.Object r1 = defpackage.gt0.J0(r1)
            vy4 r1 = (defpackage.vy4) r1
            if (r1 == 0) goto L42f
            long r12 = r1.c
            goto L431
        L42f:
            r12 = 0
        L431:
            long r3 = r5.c
            long r3 = defpackage.jk4.e(r12, r3)
            long r12 = r5.a
            int r1 = r5.i
            ow6 r15 = r11.Y
            oy4 r15 = r15.p0
            boolean r15 = f(r15, r12)
            if (r15 == 0) goto L44f
            r1 = r8
            r8 = r6
            r6 = r1
            r1 = r5
            r5 = r9
            r4 = r10
            r10 = r11
            r9 = 0
            goto L5a2
        L44f:
            fo7 r15 = r11.f()
            float r1 = g(r15, r1)
            ch5 r15 = new ch5
            r15.<init>()
            r15.A = r12
            kk r12 = new kk
            r12.<init>(r3, r10)
            r3 = r11
        L464:
            r2.R = r3
            r2.X = r10
            r2.Y = r9
            r2.Z = r8
            r2.d0 = r7
            r2.e0 = r6
            r2.f0 = r5
            r2.g0 = r0
            r2.h0 = r11
            r2.i0 = r15
            r2.j0 = r12
            r4 = 0
            r2.k0 = r4
            r2.m0 = r1
            r4 = 5
            r2.o0 = r4
            py4 r4 = defpackage.py4.Main
            java.lang.Object r4 = r11.c(r4, r2)
            if (r4 != r14) goto L48c
            goto L600
        L48c:
            r24 = r2
            r2 = r1
            r1 = r4
            r4 = r3
            r3 = r24
        L493:
            oy4 r1 = (defpackage.oy4) r1
            java.util.List r13 = r1.a
            r21 = r14
            int r14 = r13.size()
            r20 = r11
            r11 = 0
        L4a0:
            if (r11 >= r14) goto L4cc
            java.lang.Object r22 = r13.get(r11)
            r23 = r11
            r11 = r22
            vy4 r11 = (defpackage.vy4) r11
            r25 = r13
            r26 = r14
            long r13 = r11.a
            r11 = r5
            r27 = r6
            long r5 = r15.A
            boolean r5 = defpackage.nj2.o(r13, r5)
            if (r5 == 0) goto L4c0
            r5 = r22
            goto L4d0
        L4c0:
            int r5 = r23 + 1
            r6 = r11
            r11 = r5
            r5 = r6
            r13 = r25
            r14 = r26
            r6 = r27
            goto L4a0
        L4cc:
            r11 = r5
            r27 = r6
            r5 = 0
        L4d0:
            vy4 r5 = (defpackage.vy4) r5
            if (r5 != 0) goto L4e2
        L4d4:
            r1 = r10
            r10 = r4
            r4 = r1
            r2 = r3
            r6 = r8
            r5 = r9
            r1 = r11
            r14 = r21
            r9 = 0
        L4de:
            r8 = r27
            goto L5a2
        L4e2:
            boolean r6 = r5.c()
            if (r6 == 0) goto L4e9
            goto L4d4
        L4e9:
            boolean r6 = defpackage.ej2.p(r5)
            if (r6 == 0) goto L515
            java.util.List r1 = r1.a
            int r5 = r1.size()
            r6 = 0
        L4f6:
            if (r6 >= r5) goto L508
            java.lang.Object r13 = r1.get(r6)
            r14 = r13
            vy4 r14 = (defpackage.vy4) r14
            boolean r14 = r14.d
            if (r14 == 0) goto L505
            r5 = r13
            goto L509
        L505:
            int r6 = r6 + 1
            goto L4f6
        L508:
            r5 = 0
        L509:
            vy4 r5 = (defpackage.vy4) r5
            if (r5 != 0) goto L50e
            goto L4d4
        L50e:
            long r5 = r5.a
            r15.A = r5
            r13 = 0
            goto L544
        L515:
            r1 = 1
            long r13 = defpackage.ej2.R(r5, r1)
            long r13 = r12.e(r2, r13, r1)
            long r13 = r13 & r18
            int r1 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r1 == 0) goto L550
            r5.a()
            r1 = 0
            long r13 = defpackage.ej2.R(r5, r1)
            r0.A = r13
            boolean r1 = r5.c()
            if (r1 == 0) goto L540
            r1 = r10
            r10 = r4
            r4 = r1
            r1 = r9
            r9 = r5
            r5 = r1
            r2 = r3
            r6 = r8
            r1 = r11
            r14 = r21
            goto L4de
        L540:
            r13 = 0
            r12.B = r13
        L544:
            r6 = r27
            r1 = r2
            r2 = r3
            r3 = r4
            r5 = r11
            r11 = r20
            r14 = r21
            goto L464
        L550:
            r13 = 0
            py4 r1 = defpackage.py4.Final
            r3.R = r4
            r3.X = r10
            r3.Y = r9
            r3.Z = r8
            r3.d0 = r7
            r6 = r27
            r3.e0 = r6
            r3.f0 = r11
            r3.g0 = r0
            r13 = r20
            r3.h0 = r13
            r3.i0 = r15
            r3.j0 = r12
            r3.k0 = r5
            r3.m0 = r2
            r14 = 6
            r3.o0 = r14
            java.lang.Object r1 = r13.c(r1, r3)
            r14 = r21
            if (r1 != r14) goto L57f
            goto L600
        L57f:
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r11
            r11 = r13
        L585:
            boolean r4 = r4.c()
            if (r4 == 0) goto L464
            r1 = r8
            r8 = r6
            r6 = r1
            r11 = r0
            r1 = r5
            r5 = r9
            r4 = r10
            r9 = 0
            r10 = r3
            goto L39c
        L596:
            int r12 = r12 + 1
            goto L418
        L59a:
            r1 = r8
            r8 = r6
            r6 = r1
            r1 = r5
            r5 = r9
            r9 = r4
            r4 = r10
            r10 = r11
        L5a2:
            r11 = r0
            goto L39c
        L5a5:
            int r12 = r12 + 1
            goto L3a9
        L5a9:
            if (r9 == 0) goto L6b5
            long r3 = r11.A
            jk4 r0 = new jk4
            r0.<init>(r3)
            r5.e(r1, r9, r0)
            long r0 = r11.A
            jk4 r3 = new jk4
            r3.<init>(r0)
            r6.o(r9, r3)
            long r0 = r9.a
            ow6 r3 = r10.Y
            oy4 r3 = r3.p0
            boolean r3 = f(r3, r0)
            if (r3 == 0) goto L5ce
        L5cb:
            r6 = 0
            goto L690
        L5ce:
            ch5 r3 = new ch5
            r3.<init>()
            r3.A = r0
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r3
            r9 = r6
            r4 = r10
            r5 = r4
        L5dc:
            r2.R = r9
            r2.X = r8
            r2.Y = r7
            r2.Z = r5
            r2.d0 = r4
            r2.e0 = r0
            r3 = 0
            r2.f0 = r3
            r2.g0 = r3
            r2.h0 = r3
            r2.i0 = r3
            r2.j0 = r3
            r2.k0 = r3
            r1 = 7
            r2.o0 = r1
            py4 r1 = defpackage.py4.Main
            java.lang.Object r1 = r4.c(r1, r2)
            if (r1 != r14) goto L601
        L600:
            return r14
        L601:
            oy4 r1 = (defpackage.oy4) r1
            java.util.List r6 = r1.a
            int r10 = r6.size()
            r11 = 0
        L60a:
            if (r11 >= r10) goto L62d
            java.lang.Object r12 = r6.get(r11)
            r13 = r12
            vy4 r13 = (defpackage.vy4) r13
            r25 = r4
            long r3 = r13.a
            r26 = r5
            r13 = r6
            long r5 = r0.A
            boolean r3 = defpackage.nj2.o(r3, r5)
            if (r3 == 0) goto L624
            r5 = r12
            goto L632
        L624:
            int r11 = r11 + 1
            r4 = r25
            r5 = r26
            r6 = r13
            r3 = 0
            goto L60a
        L62d:
            r25 = r4
            r26 = r5
            r5 = 0
        L632:
            vy4 r5 = (defpackage.vy4) r5
            if (r5 != 0) goto L639
            r1 = 1
            r5 = 0
            goto L678
        L639:
            boolean r3 = defpackage.ej2.p(r5)
            if (r3 == 0) goto L664
            java.util.List r1 = r1.a
            int r3 = r1.size()
            r4 = 0
        L646:
            if (r4 >= r3) goto L657
            java.lang.Object r6 = r1.get(r4)
            r10 = r6
            vy4 r10 = (defpackage.vy4) r10
            boolean r10 = r10.d
            if (r10 == 0) goto L654
            goto L658
        L654:
            int r4 = r4 + 1
            goto L646
        L657:
            r6 = 0
        L658:
            vy4 r6 = (defpackage.vy4) r6
            if (r6 != 0) goto L65e
            r1 = 1
            goto L678
        L65e:
            long r3 = r6.a
            r0.A = r3
            r1 = 1
            goto L672
        L664:
            r1 = 1
            long r3 = defpackage.ej2.R(r5, r1)
            float r3 = defpackage.jk4.d(r3)
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L678
        L672:
            r4 = r25
            r5 = r26
            goto L5dc
        L678:
            if (r5 != 0) goto L67f
        L67a:
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5cb
        L67f:
            boolean r0 = r5.c()
            if (r0 == 0) goto L686
            goto L67a
        L686:
            boolean r0 = defpackage.ej2.p(r5)
            if (r0 == 0) goto L69a
            r6 = r8
            r8 = r7
            r7 = r6
            r6 = r5
        L690:
            if (r6 != 0) goto L696
            r7.c()
            goto L6b5
        L696:
            r8.g(r6)
            goto L6b5
        L69a:
            r0 = 0
            long r3 = defpackage.ej2.R(r5, r0)
            jk4 r6 = new jk4
            r6.<init>(r3)
            r9.o(r5, r6)
            r5.a()
            long r3 = r5.a
            r0 = r8
            r8 = r7
            r7 = r0
            r10 = r26
            r0 = r3
            r6 = r9
            goto L5ce
        L6b5:
            jg7 r0 = defpackage.jg7.a
            return r0
    }

    public static final java.lang.Object i(defpackage.mw6 r17, long r18, defpackage.k0 r20, defpackage.d20 r21) {
            r0 = r21
            boolean r1 = r0 instanceof defpackage.rn1
            if (r1 == 0) goto L15
            r1 = r0
            rn1 r1 = (defpackage.rn1) r1
            int r2 = r1.f0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f0 = r2
            goto L1a
        L15:
            rn1 r1 = new rn1
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.e0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.f0
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L3f
            if (r3 != r6) goto L39
            ch5 r3 = r1.d0
            mw6 r7 = r1.Z
            lo4 r8 = r1.Y
            mw6 r9 = r1.X
            qn2 r10 = r1.R
            defpackage.oi2.Y(r0)
            r16 = r9
            r9 = r3
            r3 = r16
            goto L7e
        L39:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r5
        L3f:
            defpackage.oi2.Y(r0)
            lo4 r0 = defpackage.lo4.Vertical
            r3 = r17
            ow6 r7 = r3.Y
            oy4 r7 = r7.p0
            r8 = r18
            boolean r7 = f(r7, r8)
            if (r7 == 0) goto L55
            r15 = r6
            goto L117
        L55:
            r7 = r1
            r1 = r0
            r0 = r20
        L59:
            ch5 r10 = new ch5
            r10.<init>()
            r10.A = r8
            r8 = r1
            r1 = r7
            r7 = r3
        L63:
            r1.R = r0
            r1.X = r3
            r1.Y = r8
            r1.Z = r7
            r1.d0 = r10
            r1.f0 = r6
            py4 r9 = defpackage.py4.Main
            java.lang.Object r9 = r7.c(r9, r1)
            if (r9 != r2) goto L78
            return r2
        L78:
            r16 = r10
            r10 = r0
            r0 = r9
            r9 = r16
        L7e:
            oy4 r0 = (defpackage.oy4) r0
            java.util.List r11 = r0.a
            int r12 = r11.size()
            r13 = 0
        L87:
            if (r13 >= r12) goto La4
            java.lang.Object r14 = r11.get(r13)
            r15 = r14
            vy4 r15 = (defpackage.vy4) r15
            long r4 = r15.a
            r17 = r7
            long r6 = r9.A
            boolean r4 = defpackage.nj2.o(r4, r6)
            if (r4 == 0) goto L9d
            goto La7
        L9d:
            int r13 = r13 + 1
            r7 = r17
            r5 = 0
            r6 = 1
            goto L87
        La4:
            r17 = r7
            r14 = 0
        La7:
            vy4 r14 = (defpackage.vy4) r14
            if (r14 != 0) goto Lae
            r14 = 0
        Lac:
            r15 = 1
            goto L105
        Lae:
            boolean r4 = defpackage.ej2.p(r14)
            if (r4 == 0) goto Ld8
            java.util.List r0 = r0.a
            int r4 = r0.size()
            r5 = 0
        Lbb:
            if (r5 >= r4) goto Lcc
            java.lang.Object r6 = r0.get(r5)
            r7 = r6
            vy4 r7 = (defpackage.vy4) r7
            boolean r7 = r7.d
            if (r7 == 0) goto Lc9
            goto Lcd
        Lc9:
            int r5 = r5 + 1
            goto Lbb
        Lcc:
            r6 = 0
        Lcd:
            vy4 r6 = (defpackage.vy4) r6
            if (r6 != 0) goto Ld2
            goto Lac
        Ld2:
            long r4 = r6.a
            r9.A = r4
            r15 = 1
            goto Lfd
        Ld8:
            r15 = 1
            long r4 = defpackage.ej2.R(r14, r15)
            if (r8 != 0) goto Le4
            float r0 = defpackage.jk4.d(r4)
            goto Lf8
        Le4:
            lo4 r0 = defpackage.lo4.Vertical
            if (r8 != r0) goto Lf4
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
        Lee:
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
            goto Lf8
        Lf4:
            r0 = 32
            long r4 = r4 >> r0
            goto Lee
        Lf8:
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L105
        Lfd:
            r7 = r17
            r0 = r10
            r6 = r15
            r5 = 0
            r10 = r9
            goto L63
        L105:
            if (r14 != 0) goto L109
        L107:
            r5 = 0
            goto L117
        L109:
            boolean r0 = r14.c()
            if (r0 == 0) goto L110
            goto L107
        L110:
            boolean r0 = defpackage.ej2.p(r14)
            if (r0 == 0) goto L121
            r5 = r14
        L117:
            if (r5 == 0) goto L11b
            r4 = r15
            goto L11c
        L11b:
            r4 = 0
        L11c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L121:
            r10.g(r14)
            long r4 = r14.a
            r7 = r1
            r1 = r8
            r0 = r10
            r6 = r15
            r8 = r4
            r5 = 0
            goto L59
    }
}
