package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wc4  reason: default package */
/* loaded from: classes.dex */
public final class wc4 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public float Z;
    public /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ java.lang.Object e0;

    public wc4(float r2, defpackage.n96 r3, defpackage.sb4 r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.Z = r2
            r1.d0 = r3
            r1.e0 = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    public wc4(defpackage.ga7 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 2
            r1.X = r0
            r1.e0 = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    public wc4(defpackage.ka0 r2, float r3, defpackage.to r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.d0 = r2
            r1.Z = r3
            r1.e0 = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L21;
                case 1: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            wc4 r2 = (defpackage.wc4) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            wc4 r2 = (defpackage.wc4) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            wc4 r2 = (defpackage.wc4) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            java.lang.Object r1 = r2.e0
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L11;
                default: goto L7;
            }
        L7:
            wc4 r2 = new wc4
            ga7 r1 = (defpackage.ga7) r1
            r2.<init>(r1, r3)
            r2.d0 = r4
            return r2
        L11:
            wc4 r4 = new wc4
            java.lang.Object r0 = r2.d0
            ka0 r0 = (defpackage.ka0) r0
            float r2 = r2.Z
            to r1 = (defpackage.to) r1
            r4.<init>(r0, r2, r1, r3)
            return r4
        L1f:
            wc4 r4 = new wc4
            float r0 = r2.Z
            java.lang.Object r2 = r2.d0
            n96 r2 = (defpackage.n96) r2
            sb4 r1 = (defpackage.sb4) r1
            r4.<init>(r0, r2, r1, r3)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.X
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r11.e0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L8e;
                case 1: goto L59;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r11.Y
            if (r6 == 0) goto L24
            if (r6 != r4) goto L1f
            float r3 = r11.Z
            java.lang.Object r5 = r11.d0
            w61 r5 = (defpackage.w61) r5
            defpackage.oi2.Y(r12)
            goto L34
        L1f:
            defpackage.i.m(r3)
            r1 = r5
            goto L58
        L24:
            defpackage.oi2.Y(r12)
            java.lang.Object r12 = r11.d0
            w61 r12 = (defpackage.w61) r12
            l61 r3 = r12.A()
            float r3 = defpackage.kj2.y(r3)
            r5 = r12
        L34:
            boolean r12 = defpackage.g04.H(r5)
            if (r12 == 0) goto L58
            r12 = r2
            ga7 r12 = (defpackage.ga7) r12
            n4 r6 = new n4
            r6.<init>(r12, r3)
            r11.d0 = r5
            r11.Z = r3
            r11.Y = r4
            l61 r12 = r11.B
            r12.getClass()
            um r12 = defpackage.ii2.x(r12)
            java.lang.Object r12 = r12.a(r6, r11)
            if (r12 != r0) goto L34
            r1 = r0
        L58:
            return r1
        L59:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r11.Y
            if (r6 == 0) goto L6a
            if (r6 != r4) goto L65
            defpackage.oi2.Y(r12)
            goto L8d
        L65:
            defpackage.i.m(r3)
            r1 = r5
            goto L8d
        L6a:
            defpackage.oi2.Y(r12)
            java.lang.Object r12 = r11.d0
            ka0 r12 = (defpackage.ka0) r12
            java.lang.Object r12 = r12.c
            r5 = r12
            gn r5 = (defpackage.gn) r5
            float r12 = r11.Z
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r12)
            r7 = r2
            to r7 = (defpackage.to) r7
            r11.Y = r4
            r8 = 0
            r10 = 12
            r9 = r11
            java.lang.Object r11 = defpackage.gn.c(r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto L8d
            r1 = r0
        L8d:
            return r1
        L8e:
            r9 = r11
            java.lang.Object r11 = r9.d0
            n96 r11 = (defpackage.n96) r11
            float r0 = r9.Z
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r9.Y
            r8 = 0
            r10 = 2
            if (r7 == 0) goto Lae
            if (r7 == r4) goto Laa
            if (r7 != r10) goto La5
            defpackage.oi2.Y(r12)
            goto Lfb
        La5:
            defpackage.i.m(r3)
            r1 = r5
            goto Lfb
        Laa:
            defpackage.oi2.Y(r12)
            goto Lc4
        Lae:
            defpackage.oi2.Y(r12)
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r12 <= 0) goto Lc4
            r9.Y = r4
            vs4 r12 = r11.b
            java.lang.Object r12 = r12.getValue()
            java.lang.Object r12 = r11.v(r0, r12, r9)
            if (r12 != r6) goto Lc4
            goto Lfa
        Lc4:
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r12 != 0) goto Lfb
            sb4 r2 = (defpackage.sb4) r2
            r9.Y = r10
            ga7 r12 = r11.e
            if (r12 != 0) goto Ld2
        Ld0:
            r11 = r1
            goto Lf8
        Ld2:
            vs4 r0 = r11.c
            java.lang.Object r0 = r0.getValue()
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 == 0) goto Leb
            vs4 r0 = r11.b
            java.lang.Object r0 = r0.getValue()
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 == 0) goto Leb
            goto Ld0
        Leb:
            eb4 r0 = r11.l
            h96 r3 = new h96
            r3.<init>(r11, r2, r12, r5)
            java.lang.Object r11 = defpackage.eb4.a(r0, r3, r9)
            if (r11 != r6) goto Ld0
        Lf8:
            if (r11 != r6) goto Lfb
        Lfa:
            r1 = r6
        Lfb:
            return r1
    }
}
