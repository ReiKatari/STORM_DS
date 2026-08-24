package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gi1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gi1 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;

    public /* synthetic */ gi1(java.lang.Object r1, java.lang.Object r2, int r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.A = r5
            r0.L = r1
            r0.R = r2
            r0.B = r3
            r0.X = r4
            r0.<init>()
            return
    }

    public /* synthetic */ gi1(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4, int r5) {
            r0 = this;
            r0.A = r5
            r0.L = r1
            r0.R = r2
            r0.X = r3
            r0.B = r4
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.A
            r1 = 0
            r2 = 1
            jg7 r3 = defpackage.jg7.a
            r4 = 0
            int r5 = r14.B
            java.lang.Object r6 = r14.X
            java.lang.Object r7 = r14.R
            java.lang.Object r14 = r14.L
            switch(r0) {
                case 0: goto Ld9;
                case 1: goto L96;
                case 2: goto L7b;
                case 3: goto L39;
                default: goto L12;
            }
        L12:
            java.util.List r14 = (java.util.List) r14
            qn2 r7 = (defpackage.qn2) r7
            on2 r6 = (defpackage.on2) r6
            er3 r15 = (defpackage.er3) r15
            r15.getClass()
            int r0 = r14.size()
            j5 r1 = new j5
            r8 = 23
            r1.<init>(r8, r14)
            pi6 r8 = new pi6
            r8.<init>(r14, r7, r6, r5)
            zv0 r14 = new zv0
            r5 = 2039820996(0x799532c4, float:9.683524E34)
            r14.<init>(r5, r2, r8)
            r15.h0(r0, r4, r1, r14)
            return r3
        L39:
            dx4[] r14 = (defpackage.dx4[]) r14
            l26 r7 = (defpackage.l26) r7
            int[] r6 = (int[]) r6
            cx4 r15 = (defpackage.cx4) r15
            int r0 = r14.length
            r2 = r1
        L43:
            if (r1 >= r0) goto L7a
            r8 = r14[r1]
            int r9 = r2 + 1
            r8.getClass()
            java.lang.Object r10 = r8.B()
            boolean r11 = r10 instanceof defpackage.j26
            if (r11 == 0) goto L57
            j26 r10 = (defpackage.j26) r10
            goto L58
        L57:
            r10 = r4
        L58:
            if (r10 == 0) goto L5d
            lb4 r10 = r10.c
            goto L5e
        L5d:
            r10 = r4
        L5e:
            if (r10 == 0) goto L69
            int r11 = r8.B
            kk3 r12 = defpackage.kk3.Ltr
            int r10 = r10.m(r5, r11, r12)
            goto L71
        L69:
            d40 r10 = r7.b
            int r11 = r8.B
            int r10 = r10.a(r11, r5)
        L71:
            r2 = r6[r2]
            defpackage.cx4.j(r15, r8, r2, r10)
            int r1 = r1 + 1
            r2 = r9
            goto L43
        L7a:
            return r3
        L7b:
            qn2 r14 = (defpackage.qn2) r14
            ss5 r7 = (defpackage.ss5) r7
            ss4 r6 = (defpackage.ss4) r6
            gl1 r15 = (defpackage.gl1) r15
            r15.getClass()
            sr5 r15 = new sr5
            r15.<init>(r7, r5, r6, r1)
            r14.g(r15)
            z3 r15 = new z3
            r0 = 13
            r15.<init>(r14, r0)
            return r15
        L96:
            iy2 r14 = (defpackage.iy2) r14
            g34 r7 = (defpackage.g34) r7
            dx4 r6 = (defpackage.dx4) r6
            r8 = r15
            cx4 r8 = (defpackage.cx4) r8
            int r9 = r14.b
            i27 r15 = r14.a
            p97 r10 = r14.c
            on2 r14 = r14.d
            java.lang.Object r14 = r14.c()
            b47 r14 = (defpackage.b47) r14
            if (r14 == 0) goto Lb1
            a47 r4 = r14.a
        Lb1:
            r11 = r4
            kk3 r14 = r7.getLayoutDirection()
            kk3 r0 = defpackage.kk3.Rtl
            if (r14 != r0) goto Lbc
            r12 = r2
            goto Lbd
        Lbc:
            r12 = r1
        Lbd:
            int r13 = r6.A
            of5 r14 = defpackage.xk2.f(r8, r9, r10, r11, r12, r13)
            lo4 r0 = defpackage.lo4.Horizontal
            int r2 = r6.A
            r15.a(r0, r14, r5, r2)
            rs4 r14 = r15.a
            float r14 = r14.h()
            float r14 = -r14
            int r14 = java.lang.Math.round(r14)
            defpackage.cx4.l(r8, r6, r14, r1)
            return r3
        Ld9:
            ii1 r14 = (defpackage.ii1) r14
            n93 r7 = (defpackage.n93) r7
            y94 r6 = (defpackage.y94) r6
            if (r15 == r14) goto Lfe
            boolean r14 = r15 instanceof defpackage.eq6
            if (r14 == 0) goto L104
            int r14 = r7.a
            int r14 = r14 - r5
            int r0 = r6.d(r15)
            if (r0 < 0) goto Lf3
            int[] r1 = r6.c
            r0 = r1[r0]
            goto Lf6
        Lf3:
            r0 = 2147483647(0x7fffffff, float:NaN)
        Lf6:
            int r14 = java.lang.Math.min(r14, r0)
            r6.g(r14, r15)
            goto L104
        Lfe:
            java.lang.String r14 = "A derived state calculation cannot read itself"
            defpackage.i.m(r14)
            r3 = r4
        L104:
            return r3
    }
}
