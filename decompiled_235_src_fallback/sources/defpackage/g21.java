package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g21  reason: default package */
/* loaded from: classes.dex */
public final class g21 implements defpackage.le2 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;

    public /* synthetic */ g21(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r11, defpackage.r41 r12) {
            r10 = this;
            int r0 = r10.A
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1
            java.lang.Object r5 = r10.B
            jg7 r6 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L120;
                case 1: goto L10d;
                case 2: goto Lfa;
                case 3: goto Ldf;
                case 4: goto Ld5;
                case 5: goto L7d;
                case 6: goto L6a;
                default: goto Lf;
            }
        Lf:
            boolean r0 = r12 instanceof defpackage.s0
            if (r0 == 0) goto L20
            r0 = r12
            s0 r0 = (defpackage.s0) r0
            int r7 = r0.Z
            r8 = r7 & r2
            if (r8 == 0) goto L20
            int r7 = r7 - r2
            r0.Z = r7
            goto L25
        L20:
            s0 r0 = new s0
            r0.<init>(r10, r12)
        L25:
            java.lang.Object r10 = r0.X
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L37
            k36 r11 = r0.R
            defpackage.oi2.Y(r10)     // Catch: java.lang.Throwable -> L35
            goto L5b
        L35:
            r10 = move-exception
            goto L66
        L37:
            defpackage.i.m(r1)
            goto L5f
        L3b:
            defpackage.oi2.Y(r10)
            k36 r10 = new k36
            l61 r1 = r0.B
            r1.getClass()
            r10.<init>(r11, r1)
            r0.R = r10     // Catch: java.lang.Throwable -> L64
            r0.Z = r4     // Catch: java.lang.Throwable -> L64
            eo2 r5 = (defpackage.eo2) r5     // Catch: java.lang.Throwable -> L64
            java.lang.Object r11 = r5.o(r10, r0)     // Catch: java.lang.Throwable -> L64
            if (r11 != r12) goto L55
            goto L56
        L55:
            r11 = r6
        L56:
            if (r11 != r12) goto L5a
            r3 = r12
            goto L5f
        L5a:
            r11 = r10
        L5b:
            r11.u()
            r3 = r6
        L5f:
            return r3
        L60:
            r9 = r11
            r11 = r10
            r10 = r9
            goto L66
        L64:
            r11 = move-exception
            goto L60
        L66:
            r11.u()
            throw r10
        L6a:
            pa3 r5 = (defpackage.pa3) r5
            a7 r10 = new a7
            r0 = 18
            r10.<init>(r11, r0)
            java.lang.Object r10 = r5.b(r10, r12)
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            if (r10 != r11) goto L7c
            r6 = r10
        L7c:
            return r6
        L7d:
            boolean r0 = r12 instanceof defpackage.kf2
            if (r0 == 0) goto L8e
            r0 = r12
            kf2 r0 = (defpackage.kf2) r0
            int r7 = r0.X
            r8 = r7 & r2
            if (r8 == 0) goto L8e
            int r7 = r7 - r2
            r0.X = r7
            goto L93
        L8e:
            kf2 r0 = new kf2
            r0.<init>(r10, r12)
        L93:
            java.lang.Object r10 = r0.R
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            if (r2 == 0) goto La9
            if (r2 != r4) goto La5
            java.lang.Object r11 = r0.Z
            defpackage.oi2.Y(r10)     // Catch: defpackage.o -> La3
            goto Ld2
        La3:
            r10 = move-exception
            goto Lce
        La5:
            defpackage.i.m(r1)
            goto Ld3
        La9:
            defpackage.oi2.Y(r10)
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            bh5 r1 = new bh5
            r1.<init>()
            b7 r5 = (defpackage.b7) r5     // Catch: defpackage.o -> Lca
            vc r2 = new vc     // Catch: defpackage.o -> Lca
            r3 = 5
            r2.<init>(r1, r11, r10, r3)     // Catch: defpackage.o -> Lca
            r0.Z = r10     // Catch: defpackage.o -> Lca
            r0.X = r4     // Catch: defpackage.o -> Lca
            java.lang.Object r10 = r5.b(r2, r0)     // Catch: defpackage.o -> Lca
            if (r10 != r12) goto Ld2
            r3 = r12
            goto Ld3
        Lca:
            r11 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
        Lce:
            java.lang.Object r12 = r10.A
            if (r12 != r11) goto Ld4
        Ld2:
            r3 = r6
        Ld3:
            return r3
        Ld4:
            throw r10
        Ld5:
            java.lang.Object r10 = r11.a(r5, r12)
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            if (r10 != r11) goto Lde
            r6 = r10
        Lde:
            return r6
        Ldf:
            u12 r10 = new u12
            fo2 r5 = (defpackage.fo2) r5
            r0 = 7
            r10.<init>(r5, r11, r3, r0)
            pe2 r11 = new pe2
            l61 r0 = r12.b()
            r11.<init>(r12, r0)
            java.lang.Object r10 = defpackage.mp2.Z(r11, r4, r11, r10)
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            if (r10 != r11) goto Lf9
            r6 = r10
        Lf9:
            return r6
        Lfa:
            g21 r5 = (defpackage.g21) r5
            a7 r10 = new a7
            r0 = 15
            r10.<init>(r11, r0)
            java.lang.Object r10 = r5.b(r10, r12)
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            if (r10 != r11) goto L10c
            r6 = r10
        L10c:
            return r6
        L10d:
            g21 r5 = (defpackage.g21) r5
            a7 r10 = new a7
            r0 = 10
            r10.<init>(r11, r0)
            java.lang.Object r10 = r5.b(r10, r12)
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            if (r10 != r11) goto L11f
            r6 = r10
        L11f:
            return r6
        L120:
            cf2 r5 = (defpackage.cf2) r5
            a7 r10 = new a7
            r0 = 8
            r10.<init>(r11, r0)
            java.lang.Object r10 = r5.b(r10, r12)
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            if (r10 != r11) goto L132
            r6 = r10
        L132:
            return r6
    }
}
