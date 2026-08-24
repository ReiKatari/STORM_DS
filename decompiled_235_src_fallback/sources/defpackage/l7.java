package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l7  reason: default package */
/* loaded from: classes.dex */
public final class l7 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ java.lang.Object d0;

    public /* synthetic */ l7(java.lang.Object r1, int r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.d0 = r1
            r0.Z = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public l7(defpackage.qg1 r2, defpackage.r41 r3, int r4) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.d0 = r2
            r1.Z = r4
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
                case 0: goto L43;
                case 1: goto L34;
                case 2: goto L25;
                case 3: goto L16;
                default: goto L7;
            }
        L7:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l7 r2 = (defpackage.l7) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            p76 r3 = (defpackage.p76) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l7 r2 = (defpackage.l7) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L25:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l7 r2 = (defpackage.l7) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L34:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l7 r2 = (defpackage.l7) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L43:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l7 r2 = (defpackage.l7) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            int r0 = r2.Z
            java.lang.Object r2 = r2.d0
            switch(r4) {
                case 0: goto L2c;
                case 1: goto L24;
                case 2: goto L1b;
                case 3: goto L12;
                default: goto L9;
            }
        L9:
            l7 r4 = new l7
            nw4 r2 = (defpackage.nw4) r2
            r1 = 4
            r4.<init>(r2, r0, r3, r1)
            return r4
        L12:
            l7 r4 = new l7
            ue1 r2 = (defpackage.ue1) r2
            r1 = 3
            r4.<init>(r2, r0, r3, r1)
            return r4
        L1b:
            l7 r4 = new l7
            zq3 r2 = (defpackage.zq3) r2
            r1 = 2
            r4.<init>(r2, r0, r3, r1)
            return r4
        L24:
            l7 r4 = new l7
            qg1 r2 = (defpackage.qg1) r2
            r4.<init>(r2, r3, r0)
            return r4
        L2c:
            l7 r4 = new l7
            pr3 r2 = (defpackage.pr3) r2
            r1 = 0
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            int r2 = r8.Z
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            java.lang.Object r6 = r8.d0
            switch(r0) {
                case 0: goto Lac;
                case 1: goto L82;
                case 2: goto L60;
                case 3: goto L37;
                default: goto Lf;
            }
        Lf:
            nw4 r6 = (defpackage.nw4) r6
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L22
            if (r7 != r5) goto L1d
            defpackage.oi2.Y(r9)
            goto L33
        L1d:
            defpackage.i.m(r4)
            r1 = r3
            goto L36
        L22:
            defpackage.oi2.Y(r9)
            uv4 r9 = r6.c
            r8.Y = r5
            java.lang.String r3 = "android.permission.CAMERA"
            java.lang.Object r8 = r9.a(r3, r8)
            if (r8 != r0) goto L33
            r1 = r0
            goto L36
        L33:
            r6.a(r2)
        L36:
            return r1
        L37:
            ue1 r6 = (defpackage.ue1) r6
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L4a
            if (r7 != r5) goto L45
            defpackage.oi2.Y(r9)
            goto L57
        L45:
            defpackage.i.m(r4)
            r1 = r3
            goto L5f
        L4a:
            defpackage.oi2.Y(r9)
            r8.Y = r5
            java.lang.Object r8 = r6.i(r8)
            if (r8 != r0) goto L57
            r1 = r0
            goto L5f
        L57:
            int r8 = r6.j(r2)
            r9 = 0
            r6.t(r9, r8, r5)
        L5f:
            return r1
        L60:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L71
            if (r7 != r5) goto L6c
            defpackage.oi2.Y(r9)
            goto L81
        L6c:
            defpackage.i.m(r4)
            r1 = r3
            goto L81
        L71:
            defpackage.oi2.Y(r9)
            zq3 r6 = (defpackage.zq3) r6
            tq3 r9 = r6.l0
            r8.Y = r5
            java.lang.Object r8 = r9.f(r2, r8)
            if (r8 != r0) goto L81
            r1 = r0
        L81:
            return r1
        L82:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto L93
            if (r1 != r5) goto L8e
            defpackage.oi2.Y(r9)
            goto Lab
        L8e:
            defpackage.i.m(r4)
            r9 = r3
            goto Lab
        L93:
            defpackage.oi2.Y(r9)
            qg1 r6 = (defpackage.qg1) r6
            ri7 r9 = defpackage.qg1.k(r6)
            jg1 r9 = r9.e(r2)
            r8.Y = r5
            tu0 r9 = (defpackage.tu0) r9
            java.lang.Object r9 = r9.q(r8)
            if (r9 != r0) goto Lab
            r9 = r0
        Lab:
            return r9
        Lac:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto Lbd
            if (r7 != r5) goto Lb8
            defpackage.oi2.Y(r9)
            goto Lcd
        Lb8:
            defpackage.i.m(r4)
            r1 = r3
            goto Lcd
        Lbd:
            defpackage.oi2.Y(r9)
            pr3 r6 = (defpackage.pr3) r6
            r8.Y = r5
            ap3 r9 = defpackage.pr3.y
            java.lang.Object r8 = r6.f(r2, r8)
            if (r8 != r0) goto Lcd
            r1 = r0
        Lcd:
            return r1
    }
}
