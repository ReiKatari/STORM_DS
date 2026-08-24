package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ct2  reason: default package */
/* loaded from: classes.dex */
public final class ct2 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.dk0 Z;

    public /* synthetic */ ct2(defpackage.dk0 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
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
            ct2 r2 = (defpackage.ct2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            ct2 r2 = (defpackage.ct2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            switch(r3) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            ct2 r3 = new ct2
            dk0 r1 = r1.Z
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            ct2 r3 = new ct2
            dk0 r1 = r1.Z
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.X
            dk0 r1 = r7.Z
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            jg7 r5 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L2b;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L1d
            if (r6 != r4) goto L19
            defpackage.oi2.Y(r8)
            goto L29
        L19:
            defpackage.i.m(r3)
            goto L2a
        L1d:
            defpackage.oi2.Y(r8)
            r7.Y = r4
            r1.w()
            if (r5 != r0) goto L29
            r2 = r0
            goto L2a
        L29:
            r2 = r5
        L2a:
            return r2
        L2b:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L3b
            if (r6 != r4) goto L37
            defpackage.oi2.Y(r8)
            goto L47
        L37:
            defpackage.i.m(r3)
            goto L48
        L3b:
            defpackage.oi2.Y(r8)
            r7.Y = r4
            r1.w()
            if (r5 != r0) goto L47
            r2 = r0
            goto L48
        L47:
            r2 = r5
        L48:
            return r2
    }
}
