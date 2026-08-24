package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i20  reason: default package */
/* loaded from: classes.dex */
public final class i20 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.fk3 Z;
    public final /* synthetic */ defpackage.m20 d0;

    public i20(defpackage.fk3 r2, defpackage.m20 r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.Z = r2
            r1.d0 = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public i20(defpackage.m20 r2, defpackage.fk3 r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.d0 = r2
            r1.Z = r3
            r2 = 2
            r1.<init>(r2, r4)
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
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            i20 r2 = (defpackage.i20) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            i20 r2 = (defpackage.i20) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            switch(r3) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            i20 r3 = new i20
            fk3 r0 = r1.Z
            m20 r1 = r1.d0
            r3.<init>(r0, r1, r2)
            return r3
        Lf:
            i20 r3 = new i20
            m20 r0 = r1.d0
            fk3 r1 = r1.Z
            r3.<init>(r0, r1, r2)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            m20 r4 = r8.d0
            r5 = 1
            fk3 r6 = r8.Z
            switch(r0) {
                case 0: goto L44;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L20
            if (r7 != r5) goto L1b
            defpackage.oi2.Y(r9)
            goto L43
        L1b:
            defpackage.i.m(r3)
            r1 = r2
            goto L43
        L20:
            defpackage.oi2.Y(r9)
            java.util.UUID r9 = r6.a
            de5 r2 = r4.f()
            rp6 r2 = r2.A
            java.lang.Object r2 = r2.getValue()
            boolean r9 = defpackage.nb3.k(r9, r2)
            if (r9 == 0) goto L38
            r4.e()
        L38:
            wa3 r9 = r4.b
            r8.Y = r5
            java.lang.Object r8 = r9.b(r6, r8)
            if (r8 != r0) goto L43
            r1 = r0
        L43:
            return r1
        L44:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L55
            if (r7 != r5) goto L50
            defpackage.oi2.Y(r9)
            goto L63
        L50:
            defpackage.i.m(r3)
            r1 = r2
            goto L63
        L55:
            defpackage.oi2.Y(r9)
            wa3 r9 = r4.b
            r8.Y = r5
            java.lang.Object r8 = r9.f(r6, r8)
            if (r8 != r0) goto L63
            r1 = r0
        L63:
            return r1
    }
}
