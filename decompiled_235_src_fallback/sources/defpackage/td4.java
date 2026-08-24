package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td4  reason: default package */
/* loaded from: classes.dex */
public final class td4 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;

    public /* synthetic */ td4(int r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.<init>(r1, r2)
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
            td4 r2 = (defpackage.td4) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            ne2 r3 = (defpackage.ne2) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            td4 r2 = (defpackage.td4) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r2 = r2.X
            switch(r2) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            td4 r2 = new td4
            r0 = 2
            r1 = 1
            r2.<init>(r0, r3, r1)
            r2.Z = r4
            return r2
        Lf:
            td4 r2 = new td4
            r0 = 2
            r1 = 0
            r2.<init>(r0, r3, r1)
            r2.Z = r4
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.X
            jg7 r1 = defpackage.jg7.a
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L4e;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r7.Y
            if (r5 == 0) goto L20
            if (r5 != r3) goto L1b
            java.lang.Object r2 = r7.Z
            w61 r2 = (defpackage.w61) r2
            defpackage.oi2.Y(r8)
            goto L28
        L1b:
            defpackage.i.m(r2)
            r1 = r4
            goto L4d
        L20:
            defpackage.oi2.Y(r8)
            java.lang.Object r8 = r7.Z
            w61 r8 = (defpackage.w61) r8
            r2 = r8
        L28:
            l61 r8 = r2.A()
            boolean r8 = defpackage.yh2.z(r8)
            if (r8 == 0) goto L4d
            v83 r8 = new v83
            r4 = 23
            r8.<init>(r4)
            r7.Z = r2
            r7.Y = r3
            l61 r4 = r7.B
            r4.getClass()
            um r4 = defpackage.ii2.x(r4)
            java.lang.Object r8 = r4.a(r8, r7)
            if (r8 != r0) goto L28
            r1 = r0
        L4d:
            return r1
        L4e:
            java.lang.Object r0 = r7.Z
            ne2 r0 = (defpackage.ne2) r0
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L63
            if (r6 != r3) goto L5e
            defpackage.oi2.Y(r8)
            goto L71
        L5e:
            defpackage.i.m(r2)
            r1 = r4
            goto L71
        L63:
            defpackage.oi2.Y(r8)
            r7.Z = r4
            r7.Y = r3
            java.lang.Object r7 = r0.a(r1, r7)
            if (r7 != r5) goto L71
            r1 = r5
        L71:
            return r1
    }
}
