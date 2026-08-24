package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j96  reason: default package */
/* loaded from: classes.dex */
public final class j96 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ defpackage.n96 e0;
    public final /* synthetic */ defpackage.ga7 f0;
    public final /* synthetic */ float g0;

    public j96(java.lang.Object r1, java.lang.Object r2, defpackage.n96 r3, defpackage.ga7 r4, float r5, defpackage.r41 r6) {
            r0 = this;
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r0.f0 = r4
            r0.g0 = r5
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            j96 r0 = (defpackage.j96) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            j96 r0 = new j96
            ga7 r4 = r7.f0
            float r5 = r7.g0
            java.lang.Object r1 = r7.Z
            java.lang.Object r2 = r7.d0
            n96 r3 = r7.e0
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.Y = r9
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r10.X
            jg7 r2 = defpackage.jg7.a
            r3 = 0
            r4 = 1
            n96 r5 = r10.e0
            if (r1 == 0) goto L18
            if (r1 != r4) goto L12
            defpackage.oi2.Y(r11)
            goto L7a
        L12:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r3
        L18:
            defpackage.oi2.Y(r11)
            java.lang.Object r11 = r10.Y
            w61 r11 = (defpackage.w61) r11
            java.lang.Object r1 = r10.Z
            java.lang.Object r6 = r10.d0
            boolean r7 = defpackage.nb3.k(r1, r6)
            if (r7 != 0) goto L2d
            defpackage.n96.o(r5)
            goto L3c
        L2d:
            r5.o = r3
            vs4 r7 = r5.c
            java.lang.Object r7 = r7.getValue()
            boolean r7 = defpackage.nb3.k(r7, r1)
            if (r7 == 0) goto L3c
            return r2
        L3c:
            boolean r6 = defpackage.nb3.k(r1, r6)
            float r7 = r10.g0
            if (r6 != 0) goto L56
            ga7 r6 = r10.f0
            r6.p(r1)
            r8 = 0
            r6.n(r8)
            vs4 r8 = r5.b
            r8.setValue(r1)
            r6.j(r7)
        L56:
            r5.x(r7)
            ca4 r1 = r5.n
            boolean r1 = r1.i()
            if (r1 == 0) goto L6d
            ns3 r1 = new ns3
            r6 = 10
            r1.<init>(r5, r3, r6)
            r6 = 3
            defpackage.hv.L(r11, r3, r3, r1, r6)
            goto L71
        L6d:
            r6 = -9223372036854775808
            r5.m = r6
        L71:
            r10.X = r4
            java.lang.Object r10 = defpackage.n96.r(r5, r10)
            if (r10 != r0) goto L7a
            return r0
        L7a:
            r5.w()
            return r2
    }
}
