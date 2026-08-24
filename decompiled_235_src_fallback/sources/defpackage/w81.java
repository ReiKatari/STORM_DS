package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w81  reason: default package */
/* loaded from: classes.dex */
public final class w81 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ defpackage.qn2 d0;

    public /* synthetic */ w81(int r1, defpackage.r41 r2, defpackage.qn2 r3) {
            r0 = this;
            r0.X = r1
            r0.d0 = r3
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    public w81(defpackage.qn2 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 2
            r1.X = r0
            r1.d0 = r2
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
                case 0: goto L25;
                case 1: goto L16;
                default: goto L7;
            }
        L7:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            w81 r2 = (defpackage.w81) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            bt4 r3 = (defpackage.bt4) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            w81 r2 = (defpackage.w81) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L25:
            bt4 r3 = (defpackage.bt4) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            w81 r2 = (defpackage.w81) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            switch(r0) {
                case 0: goto L1a;
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            w81 r0 = new w81
            qn2 r2 = r2.d0
            r0.<init>(r2, r3)
            r0.Z = r4
            return r0
        Lf:
            w81 r0 = new w81
            qn2 r2 = r2.d0
            r1 = 1
            r0.<init>(r1, r3, r2)
            r0.Z = r4
            return r0
        L1a:
            w81 r0 = new w81
            qn2 r2 = r2.d0
            r1 = 0
            r0.<init>(r1, r3, r2)
            r0.Z = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.X
            qn2 r1 = r6.d0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L62;
                case 1: goto L40;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L1c
            if (r5 != r3) goto L17
            defpackage.oi2.Y(r7)
            goto L3f
        L17:
            defpackage.i.m(r2)
        L1a:
            r7 = r4
            goto L3f
        L1c:
            defpackage.oi2.Y(r7)
            java.lang.Object r7 = r6.Z
            w61 r7 = (defpackage.w61) r7
            l61 r7 = r7.A()
            w31 r2 = defpackage.b97.B
            j61 r7 = r7.Z(r2)
            if (r7 == 0) goto L39
            r6.Y = r3
            java.lang.Object r7 = r1.g(r6)
            if (r7 != r0) goto L3f
            r7 = r0
            goto L3f
        L39:
            java.lang.String r6 = "Expected a TransactionElement in the CoroutineContext but none was found."
            defpackage.i.m(r6)
            goto L1a
        L3f:
            return r7
        L40:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L51
            if (r5 != r3) goto L4c
            defpackage.oi2.Y(r7)
            goto L61
        L4c:
            defpackage.i.m(r2)
            r7 = r4
            goto L61
        L51:
            defpackage.oi2.Y(r7)
            java.lang.Object r7 = r6.Z
            bt4 r7 = (defpackage.bt4) r7
            r6.Y = r3
            java.lang.Object r7 = r1.g(r6)
            if (r7 != r0) goto L61
            r7 = r0
        L61:
            return r7
        L62:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L73
            if (r5 != r3) goto L6e
            defpackage.oi2.Y(r7)
            goto L83
        L6e:
            defpackage.i.m(r2)
            r7 = r4
            goto L83
        L73:
            defpackage.oi2.Y(r7)
            java.lang.Object r7 = r6.Z
            bt4 r7 = (defpackage.bt4) r7
            r6.Y = r3
            java.lang.Object r7 = r1.g(r6)
            if (r7 != r0) goto L83
            r7 = r0
        L83:
            return r7
    }
}
