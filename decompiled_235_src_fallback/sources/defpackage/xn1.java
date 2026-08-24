package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xn1  reason: default package */
/* loaded from: classes.dex */
public final class xn1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public defpackage.dh5 Y;
    public defpackage.dh5 Z;
    public int d0;
    public /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ defpackage.yn1 f0;

    public xn1(defpackage.dh5 r2, defpackage.yn1 r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.Z = r2
            r1.f0 = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public xn1(defpackage.yn1 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.f0 = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xn1 r2 = (defpackage.xn1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            qn2 r3 = (defpackage.qn2) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xn1 r2 = (defpackage.xn1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            yn1 r1 = r2.f0
            switch(r0) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            xn1 r2 = new xn1
            r2.<init>(r1, r3)
            r2.e0 = r4
            return r2
        Lf:
            xn1 r0 = new xn1
            dh5 r2 = r2.Z
            r0.<init>(r2, r1, r3)
            r0.e0 = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            r2 = 1
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            yn1 r4 = r8.f0
            r5 = 0
            switch(r0) {
                case 0: goto Leb;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r8.d0
            switch(r6) {
                case 0: goto L56;
                case 1: goto L4a;
                case 2: goto L40;
                case 3: goto L31;
                case 4: goto L2a;
                case 5: goto L22;
                case 6: goto L1a;
                default: goto L14;
            }
        L14:
            defpackage.i.m(r3)
            r1 = r5
            goto Lea
        L1a:
            java.lang.Object r3 = r8.e0
            w61 r3 = (defpackage.w61) r3
            defpackage.oi2.Y(r9)
            goto L2f
        L22:
            java.lang.Object r3 = r8.e0
            w61 r3 = (defpackage.w61) r3
        L26:
            defpackage.oi2.Y(r9)     // Catch: java.util.concurrent.CancellationException -> Ldc
            goto L2f
        L2a:
            java.lang.Object r3 = r8.e0
            w61 r3 = (defpackage.w61) r3
            goto L26
        L2f:
            r7 = r3
            goto L5e
        L31:
            dh5 r3 = r8.Y
            java.lang.Object r6 = r8.e0
            w61 r6 = (defpackage.w61) r6
            defpackage.oi2.Y(r9)     // Catch: java.util.concurrent.CancellationException -> L3d
        L3a:
            r7 = r6
            goto Lb2
        L3d:
            r3 = r6
            goto Ldc
        L40:
            dh5 r3 = r8.Y
            java.lang.Object r6 = r8.e0
            w61 r6 = (defpackage.w61) r6
            defpackage.oi2.Y(r9)
            goto L9f
        L4a:
            dh5 r3 = r8.Z
            dh5 r6 = r8.Y
            java.lang.Object r7 = r8.e0
            w61 r7 = (defpackage.w61) r7
            defpackage.oi2.Y(r9)
            goto L7e
        L56:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r8.e0
            w61 r9 = (defpackage.w61) r9
            r7 = r9
        L5e:
            boolean r9 = defpackage.g04.H(r7)
            if (r9 == 0) goto Lea
            dh5 r3 = new dh5
            r3.<init>()
            v80 r9 = r4.r0
            if (r9 == 0) goto L81
            r8.e0 = r7
            r8.Y = r3
            r8.Z = r3
            r8.d0 = r2
            java.lang.Object r9 = defpackage.v80.L(r9, r8)
            if (r9 != r0) goto L7d
            goto Le9
        L7d:
            r6 = r3
        L7e:
            in1 r9 = (defpackage.in1) r9
            goto L83
        L81:
            r6 = r3
            r9 = r5
        L83:
            r3.A = r9
            java.lang.Object r9 = r6.A
            boolean r3 = r9 instanceof defpackage.gn1
            if (r3 == 0) goto L5e
            gn1 r9 = (defpackage.gn1) r9
            r8.e0 = r7
            r8.Y = r6
            r8.Z = r5
            r3 = 2
            r8.d0 = r3
            java.lang.Object r9 = defpackage.yn1.V0(r4, r9, r8)
            if (r9 != r0) goto L9d
            goto Le9
        L9d:
            r3 = r6
            r6 = r7
        L9f:
            xn1 r9 = new xn1     // Catch: java.util.concurrent.CancellationException -> L3d
            r9.<init>(r3, r4, r5)     // Catch: java.util.concurrent.CancellationException -> L3d
            r8.e0 = r6     // Catch: java.util.concurrent.CancellationException -> L3d
            r8.Y = r3     // Catch: java.util.concurrent.CancellationException -> L3d
            r7 = 3
            r8.d0 = r7     // Catch: java.util.concurrent.CancellationException -> L3d
            java.lang.Object r9 = r4.Y0(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L3d
            if (r9 != r0) goto L3a
            goto Le9
        Lb2:
            java.lang.Object r9 = r3.A     // Catch: java.util.concurrent.CancellationException -> Lc8
            boolean r3 = r9 instanceof defpackage.hn1     // Catch: java.util.concurrent.CancellationException -> Lc8
            if (r3 == 0) goto Lca
            hn1 r9 = (defpackage.hn1) r9     // Catch: java.util.concurrent.CancellationException -> Lc8
            r8.e0 = r7     // Catch: java.util.concurrent.CancellationException -> Lc8
            r8.Y = r5     // Catch: java.util.concurrent.CancellationException -> Lc8
            r3 = 4
            r8.d0 = r3     // Catch: java.util.concurrent.CancellationException -> Lc8
            java.lang.Object r9 = defpackage.yn1.W0(r4, r9, r8)     // Catch: java.util.concurrent.CancellationException -> Lc8
            if (r9 != r0) goto L5e
            goto Le9
        Lc8:
            r3 = r7
            goto Ldc
        Lca:
            boolean r9 = r9 instanceof defpackage.en1     // Catch: java.util.concurrent.CancellationException -> Lc8
            if (r9 == 0) goto L5e
            r8.e0 = r7     // Catch: java.util.concurrent.CancellationException -> Lc8
            r8.Y = r5     // Catch: java.util.concurrent.CancellationException -> Lc8
            r9 = 5
            r8.d0 = r9     // Catch: java.util.concurrent.CancellationException -> Lc8
            java.lang.Object r9 = defpackage.yn1.U0(r4, r8)     // Catch: java.util.concurrent.CancellationException -> Lc8
            if (r9 != r0) goto L5e
            goto Le9
        Ldc:
            r8.e0 = r3
            r8.Y = r5
            r9 = 6
            r8.d0 = r9
            java.lang.Object r9 = defpackage.yn1.U0(r4, r8)
            if (r9 != r0) goto L2f
        Le9:
            r1 = r0
        Lea:
            return r1
        Leb:
            dh5 r0 = r8.Z
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.d0
            if (r7 == 0) goto L104
            if (r7 != r2) goto Lff
            dh5 r3 = r8.Y
            java.lang.Object r7 = r8.e0
            qn2 r7 = (defpackage.qn2) r7
            defpackage.oi2.Y(r9)
            goto L136
        Lff:
            defpackage.i.m(r3)
            r1 = r5
            goto L13e
        L104:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r8.e0
            qn2 r9 = (defpackage.qn2) r9
            r7 = r9
        L10c:
            java.lang.Object r9 = r0.A
            boolean r3 = r9 instanceof defpackage.hn1
            if (r3 != 0) goto L13e
            boolean r3 = r9 instanceof defpackage.en1
            if (r3 != 0) goto L13e
            boolean r3 = r9 instanceof defpackage.fn1
            if (r3 == 0) goto L11d
            fn1 r9 = (defpackage.fn1) r9
            goto L11e
        L11d:
            r9 = r5
        L11e:
            if (r9 == 0) goto L123
            r7.g(r9)
        L123:
            v80 r9 = r4.r0
            if (r9 == 0) goto L139
            r8.e0 = r7
            r8.Y = r0
            r8.d0 = r2
            java.lang.Object r9 = defpackage.v80.L(r9, r8)
            if (r9 != r6) goto L135
            r1 = r6
            goto L13e
        L135:
            r3 = r0
        L136:
            in1 r9 = (defpackage.in1) r9
            goto L13b
        L139:
            r3 = r0
            r9 = r5
        L13b:
            r3.A = r9
            goto L10c
        L13e:
            return r1
    }
}
