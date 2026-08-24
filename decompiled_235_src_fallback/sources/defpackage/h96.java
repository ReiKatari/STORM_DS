package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h96  reason: default package */
/* loaded from: classes.dex */
public final class h96 extends defpackage.hw6 implements defpackage.qn2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.n96 Z;
    public final /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ defpackage.ga7 e0;

    public h96(defpackage.ga7 r2, defpackage.n96 r3, java.lang.Object r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.e0 = r2
            r1.Z = r3
            r1.d0 = r4
            r2 = 1
            r1.<init>(r2, r5)
            return
    }

    public h96(defpackage.n96 r2, java.lang.Object r3, defpackage.ga7 r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.Z = r2
            r1.d0 = r3
            r1.e0 = r4
            r1.<init>(r0, r5)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.X
            jg7 r1 = defpackage.jg7.a
            ga7 r2 = r4.e0
            java.lang.Object r3 = r4.d0
            n96 r4 = r4.Z
            r41 r5 = (defpackage.r41) r5
            switch(r0) {
                case 0: goto L19;
                default: goto Lf;
            }
        Lf:
            h96 r0 = new h96
            r0.<init>(r4, r3, r2, r5)
            java.lang.Object r4 = r0.s(r1)
            return r4
        L19:
            h96 r0 = new h96
            r0.<init>(r2, r4, r3, r5)
            java.lang.Object r4 = r0.s(r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.X
            jg7 r1 = defpackage.jg7.a
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            n96 r3 = r11.Z
            java.lang.Object r4 = r11.d0
            ga7 r5 = r11.e0
            r6 = 1
            r7 = 0
            switch(r0) {
                case 0: goto L77;
                default: goto L11;
            }
        L11:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r11.Y
            if (r8 == 0) goto L22
            if (r8 != r6) goto L1d
            defpackage.oi2.Y(r12)
            goto L73
        L1d:
            defpackage.i.m(r2)
            r1 = r7
            goto L76
        L22:
            defpackage.oi2.Y(r12)
            r3.t()
            vs4 r12 = r3.b
            r7 = -9223372036854775808
            r3.m = r7
            r2 = 0
            r3.x(r2)
            vs4 r7 = r3.c
            java.lang.Object r7 = r7.getValue()
            boolean r7 = r4.equals(r7)
            r8 = -1069547520(0xffffffffc0400000, float:-3.0)
            if (r7 == 0) goto L43
            r7 = -1065353216(0xffffffffc0800000, float:-4.0)
            goto L51
        L43:
            java.lang.Object r7 = r12.getValue()
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L50
            r7 = -1063256064(0xffffffffc0a00000, float:-5.0)
            goto L51
        L50:
            r7 = r8
        L51:
            r5.p(r4)
            r9 = 0
            r5.n(r9)
            r12.setValue(r4)
            r3.x(r2)
            r3.l(r4)
            r5.j(r7)
            int r12 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r12 != 0) goto L73
            r11.Y = r6
            java.lang.Object r11 = defpackage.n96.r(r3, r11)
            if (r11 != r0) goto L73
            r1 = r0
            goto L76
        L73:
            r5.i()
        L76:
            return r1
        L77:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r11.Y
            if (r8 == 0) goto L88
            if (r8 != r6) goto L83
            defpackage.oi2.Y(r12)
            goto L9a
        L83:
            defpackage.i.m(r2)
            r1 = r7
            goto L9d
        L88:
            defpackage.oi2.Y(r12)
            ji r12 = new ji
            r12.<init>(r3, r4, r5, r7)
            r11.Y = r6
            java.lang.Object r11 = defpackage.g04.C(r12, r11)
            if (r11 != r0) goto L9a
            r1 = r0
            goto L9d
        L9a:
            r5.i()
        L9d:
            return r1
    }
}
