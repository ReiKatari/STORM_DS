package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x51  reason: default package */
/* loaded from: classes.dex */
public final class x51 implements defpackage.e34 {
    public final /* synthetic */ defpackage.jt3 a;
    public final /* synthetic */ defpackage.qn2 b;
    public final /* synthetic */ defpackage.c37 c;
    public final /* synthetic */ defpackage.mk4 d;
    public final /* synthetic */ defpackage.qh1 e;
    public final /* synthetic */ int f;

    public x51(defpackage.jt3 r1, defpackage.qn2 r2, defpackage.c37 r3, defpackage.mk4 r4, defpackage.qh1 r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    @Override // defpackage.e34
    public final int a(defpackage.eb3 r1, java.util.List r2, int r3) {
            r0 = this;
            jt3 r0 = r0.a
            d17 r2 = r0.a
            kk3 r1 = r1.getLayoutDirection()
            r2.a(r1)
            d17 r0 = r0.a
            s9 r0 = r0.j
            if (r0 == 0) goto L1a
            float r0 = r0.c()
            int r0 = defpackage.ii2.q(r0)
            return r0
        L1a:
            java.lang.String r0 = "layoutIntrinsics must be called first"
            defpackage.i.m(r0)
            r0 = 0
            return r0
    }

    @Override // defpackage.e34
    public final defpackage.f34 d(defpackage.g34 r34, java.util.List r35, long r36) {
            r33 = this;
            r0 = r33
            jt3 r13 = r0.a
            vl6 r1 = defpackage.ln2.t()
            if (r1 == 0) goto Lf
            qn2 r2 = r1.e()
            goto L10
        Lf:
            r2 = 0
        L10:
            vl6 r3 = defpackage.ln2.N(r1)
            b47 r15 = r13.d()     // Catch: java.lang.Throwable -> L24c
            defpackage.ln2.V(r1, r3, r2)
            if (r15 == 0) goto L20
            a47 r1 = r15.a
            goto L21
        L20:
            r1 = 0
        L21:
            d17 r2 = r13.a
            kk3 r9 = r34.getLayoutDirection()
            int r3 = r2.f
            boolean r4 = r2.e
            int r5 = r2.c
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r18 = 32
            if (r1 == 0) goto L105
            v84 r10 = r1.b
            z37 r11 = r1.a
            fp r12 = r2.a
            s47 r6 = r2.b
            java.util.List r7 = r2.i
            r19 = 0
            qh1 r14 = r2.g
            ki2 r8 = r2.h
            r21 = r1
            s9 r1 = r10.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L55
            r11 = r36
            r6 = r9
            goto Lfb
        L55:
            fp r1 = r11.a
            r23 = r8
            r22 = r9
            long r8 = r11.j
            boolean r1 = defpackage.nb3.k(r1, r12)
            if (r1 == 0) goto Lfe
            s47 r1 = r11.b
            boolean r1 = r1.c(r6)
            if (r1 == 0) goto Lfe
            java.util.List r1 = r11.c
            boolean r1 = defpackage.nb3.k(r1, r7)
            if (r1 == 0) goto Lfe
            int r1 = r11.d
            if (r1 != r5) goto Lfe
            boolean r1 = r11.e
            if (r1 != r4) goto Lfe
            int r1 = r11.f
            if (r1 != r3) goto Lfe
            qh1 r1 = r11.g
            boolean r1 = defpackage.nb3.k(r1, r14)
            if (r1 == 0) goto Lfe
            kk3 r1 = r11.h
            r6 = r22
            if (r1 != r6) goto Lf9
            ki2 r1 = r11.i
            r7 = r23
            boolean r1 = defpackage.nb3.k(r1, r7)
            if (r1 != 0) goto L98
            goto Lf9
        L98:
            int r1 = defpackage.q21.j(r36)
            int r7 = defpackage.q21.j(r8)
            if (r1 == r7) goto La3
            goto Lf9
        La3:
            if (r4 != 0) goto La8
            r1 = 2
            if (r3 != r1) goto Lbc
        La8:
            int r1 = defpackage.q21.h(r36)
            int r7 = defpackage.q21.h(r8)
            if (r1 != r7) goto Lf9
            int r1 = defpackage.q21.g(r36)
            int r7 = defpackage.q21.g(r8)
            if (r1 != r7) goto Lf9
        Lbc:
            z37 r1 = new z37
            fp r3 = r11.a
            r4 = r3
            s47 r3 = r2.b
            r2 = r4
            java.util.List r4 = r11.c
            int r5 = r11.d
            boolean r6 = r11.e
            int r7 = r11.f
            qh1 r8 = r11.g
            kk3 r9 = r11.h
            ki2 r11 = r11.i
            r14 = r10
            r10 = r11
            r24 = r21
            r11 = r36
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            float r2 = r14.d
            int r2 = defpackage.ii2.q(r2)
            float r3 = r14.e
            int r3 = defpackage.ii2.q(r3)
            long r4 = (long) r2
            long r4 = r4 << r18
            long r2 = (long) r3
            long r2 = r2 & r16
            long r2 = r2 | r4
            long r2 = defpackage.s21.d(r11, r2)
            a47 r4 = new a47
            r4.<init>(r1, r14, r2)
            goto L1a5
        Lf9:
            r11 = r36
        Lfb:
            r24 = r21
            goto L10c
        Lfe:
            r11 = r36
            r24 = r21
            r6 = r22
            goto L10c
        L105:
            r11 = r36
            r24 = r1
            r6 = r9
            r19 = 0
        L10c:
            r2.a(r6)
            int r1 = defpackage.q21.j(r11)
            if (r4 != 0) goto L118
            r7 = 2
            if (r3 != r7) goto L123
        L118:
            boolean r7 = defpackage.q21.d(r11)
            if (r7 == 0) goto L123
            int r7 = defpackage.q21.h(r11)
            goto L126
        L123:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L126:
            if (r4 != 0) goto L12e
            r4 = 2
            if (r3 != r4) goto L12e
            r29 = 1
            goto L130
        L12e:
            r29 = r5
        L130:
            java.lang.String r3 = "layoutIntrinsics must be called first"
            if (r1 != r7) goto L135
            goto L145
        L135:
            s9 r4 = r2.j
            if (r4 == 0) goto L248
            float r4 = r4.c()
            int r4 = defpackage.ii2.q(r4)
            int r7 = defpackage.gi2.q(r4, r1, r7)
        L145:
            v84 r25 = new v84
            s9 r1 = r2.j
            if (r1 == 0) goto L244
            int r3 = defpackage.q21.g(r11)
            r4 = 0
            long r27 = defpackage.nb3.t(r4, r7, r4, r3)
            int r3 = r2.f
            r26 = r1
            r30 = r3
            r25.<init>(r26, r27, r29, r30)
            r14 = r25
            float r1 = r14.d
            int r1 = defpackage.ii2.q(r1)
            float r3 = r14.e
            int r3 = defpackage.ii2.q(r3)
            long r4 = (long) r1
            long r4 = r4 << r18
            long r7 = (long) r3
            long r7 = r7 & r16
            long r3 = r4 | r7
            long r3 = defpackage.s21.d(r11, r3)
            a47 r1 = new a47
            r5 = r1
            z37 r1 = new z37
            fp r7 = r2.a
            r8 = r3
            s47 r3 = r2.b
            java.util.List r4 = r2.i
            r10 = r5
            int r5 = r2.c
            r22 = r6
            boolean r6 = r2.e
            r20 = r7
            int r7 = r2.f
            r25 = r8
            qh1 r8 = r2.g
            ki2 r2 = r2.h
            r0 = r10
            r9 = r22
            r31 = r25
            r10 = r2
            r2 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r8 = r31
            r0.<init>(r1, r14, r8)
            r4 = r0
        L1a5:
            long r0 = r4.c
            long r2 = r0 >> r18
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            long r0 = r0 & r16
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r2.intValue()
            int r0 = r0.intValue()
            r14 = r24
            boolean r2 = defpackage.nb3.k(r14, r4)
            if (r2 != 0) goto L1e8
            b47 r2 = new b47
            if (r15 == 0) goto L1cc
            jk3 r14 = r15.c
            goto L1ce
        L1cc:
            r14 = r19
        L1ce:
            r2.<init>(r4, r14)
            vs4 r3 = r13.i
            r3.setValue(r2)
            r2 = 0
            r13.p = r2
            r3 = r33
            qn2 r5 = r3.b
            r5.g(r4)
            c37 r5 = r3.c
            mk4 r6 = r3.d
            defpackage.hf.e0(r13, r5, r6)
            goto L1eb
        L1e8:
            r2 = 0
            r3 = r33
        L1eb:
            int r5 = r3.f
            r6 = 1
            if (r5 != r6) goto L1fb
            v84 r5 = r4.b
            float r2 = r5.b(r2)
            int r7 = defpackage.ii2.q(r2)
            goto L1fc
        L1fb:
            r7 = r2
        L1fc:
            qh1 r2 = r3.e
            float r2 = r2.Q(r7)
            vs4 r3 = r13.g
            om1 r5 = new om1
            r5.<init>(r2)
            r3.setValue(r5)
            ey2 r2 = defpackage.lc.a
            float r3 = r4.d
            int r3 = java.lang.Math.round(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            vr4 r5 = new vr4
            r5.<init>(r2, r3)
            ey2 r2 = defpackage.lc.b
            float r3 = r4.e
            int r3 = java.lang.Math.round(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            vr4 r4 = new vr4
            r4.<init>(r2, r3)
            vr4[] r2 = new defpackage.vr4[]{r5, r4}
            java.util.Map r2 = defpackage.c14.m0(r2)
            bz1 r3 = new bz1
            r4 = 22
            r3.<init>(r4)
            r4 = r34
            f34 r0 = r4.K(r1, r0, r2, r3)
            return r0
        L244:
            defpackage.i.m(r3)
            return r19
        L248:
            defpackage.i.m(r3)
            return r19
        L24c:
            r0 = move-exception
            defpackage.ln2.V(r1, r3, r2)
            throw r0
    }
}
