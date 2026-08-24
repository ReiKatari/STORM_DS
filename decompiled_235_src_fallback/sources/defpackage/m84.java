package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m84  reason: default package */
/* loaded from: classes.dex */
public final class m84 extends defpackage.ng4 {
    public final defpackage.os0 f;
    public final defpackage.v80 g;
    public defpackage.ap6 h;

    public m84(defpackage.m86 r1, defpackage.os0 r2, defpackage.yv0 r3, defpackage.qh1 r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r0.f = r2
            r1 = 0
            r2 = 6
            r3 = 2147483647(0x7fffffff, float:NaN)
            v80 r1 = defpackage.nb3.c(r3, r1, r1, r2)
            r0.g = r1
            return
    }

    public static final java.lang.Object c(defpackage.m84 r21, defpackage.m86 r22, defpackage.i84 r23, float r24, float r25, defpackage.s41 r26) {
            r5 = r21
            r7 = r22
            r0 = r23
            r1 = r26
            r5.getClass()
            yc1 r9 = r5.e
            boolean r2 = r1 instanceof defpackage.j84
            if (r2 == 0) goto L21
            r2 = r1
            j84 r2 = (defpackage.j84) r2
            int r3 = r2.e0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r3 & r4
            if (r6 == 0) goto L21
            int r3 = r3 - r4
            r2.e0 = r3
        L1f:
            r10 = r2
            goto L27
        L21:
            j84 r2 = new j84
            r2.<init>(r5, r1)
            goto L1f
        L27:
            java.lang.Object r1 = r10.Z
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r10.e0
            r13 = 0
            jg7 r14 = defpackage.jg7.a
            r15 = 2
            r3 = 1
            if (r2 == 0) goto L4f
            if (r2 == r3) goto L42
            if (r2 != r15) goto L3c
            defpackage.oi2.Y(r1)
            return r14
        L3c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r13
        L42:
            float r0 = r10.Y
            ah5 r2 = r10.X
            m86 r3 = r10.R
            defpackage.oi2.Y(r1)
            r16 = r14
            goto L101
        L4f:
            defpackage.oi2.Y(r1)
            r1 = r3
            dh5 r3 = new dh5
            r3.<init>()
            r3.A = r0
            long r1 = r0.b
            r16 = r14
            long r13 = r0.a
            java.lang.Object r0 = r9.A
            rl7 r0 = (defpackage.rl7) r0
            r4 = 32
            r17 = r13
            long r12 = r17 >> r4
            int r6 = (int) r12
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r0.a(r6, r1)
            java.lang.Object r0 = r9.B
            rl7 r0 = (defpackage.rl7) r0
            r19 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r17 & r19
            int r6 = (int) r12
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r0.a(r6, r1)
            v80 r0 = r5.g
            i84 r0 = g(r0)
            if (r0 == 0) goto Lb7
            long r1 = r0.b
            long r12 = r0.a
            java.lang.Object r6 = r9.A
            rl7 r6 = (defpackage.rl7) r6
            long r4 = r12 >> r4
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r6.a(r4, r1)
            java.lang.Object r4 = r9.B
            rl7 r4 = (defpackage.rl7) r4
            long r5 = r12 & r19
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r4.a(r5, r1)
            java.lang.Object r1 = r3.A
            i84 r1 = (defpackage.i84) r1
            i84 r0 = r1.a(r0)
            r3.A = r0
        Lb7:
            ah5 r1 = new ah5
            r1.<init>()
            java.lang.Object r0 = r3.A
            i84 r0 = (defpackage.i84) r0
            long r4 = r0.a
            long r4 = r7.e(r4)
            float r0 = r7.g(r4)
            r1.A = r0
            boolean r0 = defpackage.nj2.f(r0)
            if (r0 == 0) goto Ld4
            goto L166
        Ld4:
            dh5 r2 = new dh5
            r2.<init>()
            r0 = 30
            r4 = 0
            uo r0 = defpackage.ak7.f(r4, r4, r0)
            r2.A = r0
            k84 r0 = new k84
            r8 = 0
            r5 = r21
            r4 = r24
            r6 = r25
            r12 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.R = r7
            r10.X = r1
            r10.Y = r6
            r10.e0 = r12
            java.lang.Object r0 = r5.b(r0, r10)
            if (r0 != r11) goto Lfe
            goto L165
        Lfe:
            r2 = r1
            r0 = r6
            r3 = r7
        L101:
            java.lang.Object r1 = r9.A
            rl7 r1 = (defpackage.rl7) r1
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r1 = r1.b(r4)
            java.lang.Object r6 = r9.B
            rl7 r6 = (defpackage.rl7) r6
            float r4 = r6.b(r4)
            long r6 = defpackage.qo2.k(r1, r4)
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L151
            float r1 = r2.A
            float r1 = java.lang.Math.abs(r1)
            r4 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r4
            float r0 = java.lang.Math.min(r1, r0)
            float r1 = r2.A
            float r1 = java.lang.Math.signum(r1)
            float r1 = r3.d(r1)
            float r1 = r1 * r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r0
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L140
            r6 = r8
            goto L151
        L140:
            lo4 r0 = r3.d
            lo4 r2 = defpackage.lo4.Horizontal
            if (r0 != r2) goto L14c
            long r0 = defpackage.qo2.k(r1, r4)
        L14a:
            r6 = r0
            goto L151
        L14c:
            long r0 = defpackage.qo2.k(r4, r1)
            goto L14a
        L151:
            eo2 r0 = r5.b
            ol7 r1 = new ol7
            r1.<init>(r6)
            r2 = 0
            r10.R = r2
            r10.X = r2
            r10.e0 = r15
            java.lang.Object r0 = r0.o(r1, r10)
            if (r0 != r11) goto L166
        L165:
            return r11
        L166:
            return r16
    }

    public static final java.lang.Object d(defpackage.m84 r13, defpackage.dh5 r14, defpackage.ah5 r15, defpackage.m86 r16, defpackage.dh5 r17, long r18, defpackage.s41 r20) {
            r1 = r18
            r3 = r20
            boolean r4 = r3 instanceof defpackage.l84
            if (r4 == 0) goto L17
            r4 = r3
            l84 r4 = (defpackage.l84) r4
            int r5 = r4.f0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L17
            int r5 = r5 - r6
            r4.f0 = r5
            goto L1c
        L17:
            l84 r4 = new l84
            r4.<init>(r3)
        L1c:
            java.lang.Object r3 = r4.e0
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r4.f0
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L3f
            if (r6 != r8) goto L39
            dh5 r0 = r4.d0
            m86 r1 = r4.Z
            ah5 r2 = r4.Y
            dh5 r5 = r4.X
            m84 r4 = r4.R
            defpackage.oi2.Y(r3)
            r10 = r0
            r9 = r1
            r0 = r4
            goto L6b
        L39:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r7
        L3f:
            defpackage.oi2.Y(r3)
            r9 = 0
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 >= 0) goto L4b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L4b:
            ns3 r3 = new ns3
            r6 = 3
            r3.<init>(r13, r7, r6)
            r4.R = r13
            r4.X = r14
            r4.Y = r15
            r9 = r16
            r4.Z = r9
            r10 = r17
            r4.d0 = r10
            r4.f0 = r8
            java.lang.Object r3 = defpackage.xk2.N(r1, r3, r4)
            if (r3 != r5) goto L68
            return r5
        L68:
            r0 = r13
            r5 = r14
            r2 = r15
        L6b:
            i84 r3 = (defpackage.i84) r3
            if (r3 == 0) goto Lca
            java.lang.Object r1 = r5.A
            i84 r1 = (defpackage.i84) r1
            boolean r1 = r1.c
            long r6 = r3.a
            long r11 = r3.b
            i84 r4 = new i84
            r18 = r1
            r13 = r4
            r14 = r6
            r16 = r11
            r13.<init>(r14, r16, r18)
            r1 = r13
            r5.A = r1
            long r4 = r9.e(r6)
            float r1 = r9.i(r4)
            r2.A = r1
            r1 = 30
            r4 = 0
            uo r1 = defpackage.ak7.f(r4, r4, r1)
            r10.A = r1
            yc1 r0 = r0.e
            long r4 = r3.b
            long r6 = r3.a
            java.lang.Object r1 = r0.A
            rl7 r1 = (defpackage.rl7) r1
            r3 = 32
            long r9 = r6 >> r3
            int r3 = (int) r9
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r1.a(r3, r4)
            java.lang.Object r0 = r0.B
            rl7 r0 = (defpackage.rl7) r0
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r9
            int r1 = (int) r6
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r0.a(r1, r4)
            float r0 = r2.A
            boolean r0 = defpackage.nj2.f(r0)
            r0 = r0 ^ r8
            goto Lcb
        Lca:
            r0 = 0
        Lcb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    public static defpackage.i84 g(defpackage.v80 r3) {
            h84 r0 = new h84
            r1 = 0
            r0.<init>(r3, r1)
            tj2 r3 = new tj2
            r1 = 2
            r2 = 0
            r3.<init>(r0, r2, r1)
            rb6 r3 = defpackage.qo2.C(r3)
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            i84 r0 = (defpackage.i84) r0
            if (r2 != 0) goto L21
        L1f:
            r2 = r0
            goto L11
        L21:
            i84 r0 = r2.a(r0)
            goto L1f
        L26:
            return r2
    }

    public final float e(defpackage.k86 r4, float r5) {
            r3 = this;
            m86 r3 = r3.a
            float r5 = r3.d(r5)
            long r0 = r3.h(r5)
            m86 r4 = r4.a
            p76 r5 = r4.k
            r2 = 1
            long r4 = r4.c(r5, r0, r2)
            long r4 = r3.e(r4)
            float r3 = r3.g(r4)
            return r3
    }

    public final boolean f(defpackage.oy4 r9) {
            r8 = this;
            os0 r0 = r8.f
            qh1 r1 = r8.c
            long r3 = r0.P(r1, r9)
            m86 r0 = r8.a
            long r1 = r0.e(r3)
            float r1 = r0.i(r1)
            r2 = 0
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L19
            r0 = 0
            goto L28
        L19:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            f86 r0 = r0.a
            if (r1 <= 0) goto L24
            boolean r0 = r0.c()
            goto L28
        L24:
            boolean r0 = r0.b()
        L28:
            if (r0 == 0) goto L45
            i84 r2 = new i84
            java.util.List r9 = r9.a
            java.lang.Object r9 = defpackage.gt0.H0(r9)
            vy4 r9 = (defpackage.vy4) r9
            long r5 = r9.b
            r7 = 0
            r2.<init>(r3, r5, r7)
            v80 r8 = r8.g
            java.lang.Object r8 = r8.c(r2)
            boolean r8 = r8 instanceof defpackage.fm0
            r8 = r8 ^ 1
            return r8
        L45:
            boolean r8 = r8.d
            return r8
    }
}
