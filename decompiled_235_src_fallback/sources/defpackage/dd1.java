package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dd1  reason: default package */
/* loaded from: classes.dex */
public final class dd1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.r94 Z;
    public final /* synthetic */ defpackage.mm6 d0;

    public /* synthetic */ dd1(defpackage.r94 r1, defpackage.mm6 r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Z = r1
            r0.d0 = r2
            r1 = 2
            r0.<init>(r1, r3)
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
            dd1 r2 = (defpackage.dd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            dd1 r2 = (defpackage.dd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            dd1 r2 = (defpackage.dd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            switch(r4) {
                case 0: goto L1b;
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            dd1 r4 = new dd1
            mm6 r0 = r2.d0
            r1 = 2
            r94 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            dd1 r4 = new dd1
            mm6 r0 = r2.d0
            r1 = 1
            r94 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
        L1b:
            dd1 r4 = new dd1
            mm6 r0 = r2.d0
            r1 = 0
            r94 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            mm6 r2 = r8.d0
            r94 r3 = r8.Z
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            switch(r0) {
                case 0: goto L60;
                case 1: goto L38;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L20
            if (r7 != r6) goto L1b
            defpackage.oi2.Y(r9)
            goto L37
        L1b:
            defpackage.i.m(r5)
            r1 = r4
            goto L37
        L20:
            defpackage.oi2.Y(r9)
            of6 r9 = r3.a
            cd1 r3 = new cd1
            r4 = 2
            r3.<init>(r2, r4)
            r8.Y = r6
            r9.getClass()
            x61 r8 = defpackage.of6.m(r9, r3, r8)
            if (r8 != r0) goto L37
            r1 = r0
        L37:
            return r1
        L38:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L49
            if (r7 != r6) goto L44
            defpackage.oi2.Y(r9)
            goto L5f
        L44:
            defpackage.i.m(r5)
            r1 = r4
            goto L5f
        L49:
            defpackage.oi2.Y(r9)
            of6 r9 = r3.a
            cd1 r3 = new cd1
            r3.<init>(r2, r6)
            r8.Y = r6
            r9.getClass()
            x61 r8 = defpackage.of6.m(r9, r3, r8)
            if (r8 != r0) goto L5f
            r1 = r0
        L5f:
            return r1
        L60:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L71
            if (r7 != r6) goto L6c
            defpackage.oi2.Y(r9)
            goto L88
        L6c:
            defpackage.i.m(r5)
            r1 = r4
            goto L88
        L71:
            defpackage.oi2.Y(r9)
            of6 r9 = r3.a
            cd1 r3 = new cd1
            r4 = 0
            r3.<init>(r2, r4)
            r8.Y = r6
            r9.getClass()
            x61 r8 = defpackage.of6.m(r9, r3, r8)
            if (r8 != r0) goto L88
            r1 = r0
        L88:
            return r1
    }
}
