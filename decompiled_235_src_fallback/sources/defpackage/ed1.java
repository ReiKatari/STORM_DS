package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed1  reason: default package */
/* loaded from: classes.dex */
public final class ed1 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ defpackage.gn Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ defpackage.fd1 e0;
    public final /* synthetic */ defpackage.t93 f0;

    public ed1(defpackage.gn r1, float r2, boolean r3, defpackage.fd1 r4, defpackage.t93 r5, defpackage.r41 r6) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r0.e0 = r4
            r0.f0 = r5
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
            ed1 r0 = (defpackage.ed1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            ed1 r0 = new ed1
            fd1 r4 = r7.e0
            t93 r5 = r7.f0
            gn r1 = r7.Y
            float r2 = r7.Z
            boolean r3 = r7.d0
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.X
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 == r4) goto L14
            if (r1 != r3) goto Le
            goto L14
        Le:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r2
        L14:
            defpackage.oi2.Y(r9)
            goto L7f
        L18:
            defpackage.oi2.Y(r9)
            gn r9 = r8.Y
            vs4 r1 = r9.e
            java.lang.Object r1 = r1.getValue()
            om1 r1 = (defpackage.om1) r1
            float r1 = r1.A
            float r5 = r8.Z
            boolean r1 = defpackage.om1.b(r1, r5)
            if (r1 != 0) goto L7f
            boolean r1 = r8.d0
            if (r1 != 0) goto L41
            om1 r1 = new om1
            r1.<init>(r5)
            r8.X = r4
            java.lang.Object r8 = r9.e(r8, r1)
            if (r8 != r0) goto L7f
            goto L7e
        L41:
            vs4 r1 = r9.e
            java.lang.Object r1 = r1.getValue()
            om1 r1 = (defpackage.om1) r1
            float r1 = r1.A
            r4 = 1090519040(0x41000000, float:8.0)
            boolean r4 = defpackage.om1.b(r1, r4)
            if (r4 == 0) goto L5b
            l25 r2 = new l25
            r6 = 0
            r2.<init>(r6)
            goto L74
        L5b:
            r4 = 1082130432(0x40800000, float:4.0)
            boolean r6 = defpackage.om1.b(r1, r4)
            if (r6 == 0) goto L69
            oy2 r2 = new oy2
            r2.<init>()
            goto L74
        L69:
            boolean r1 = defpackage.om1.b(r1, r4)
            if (r1 == 0) goto L74
            sg2 r2 = new sg2
            r2.<init>()
        L74:
            r8.X = r3
            t93 r1 = r8.f0
            java.lang.Object r8 = defpackage.ms1.a(r9, r5, r2, r1, r8)
            if (r8 != r0) goto L7f
        L7e:
            return r0
        L7f:
            jg7 r8 = defpackage.jg7.a
            return r8
    }
}
