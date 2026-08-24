package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: km6  reason: default package */
/* loaded from: classes.dex */
public final class km6 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ defpackage.eo2 d0;
    public final /* synthetic */ defpackage.qa4 e0;

    public /* synthetic */ km6(defpackage.eo2 r1, defpackage.qa4 r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.d0 = r1
            r0.e0 = r2
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
                case 0: goto L2c;
                case 1: goto L21;
                case 2: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            km6 r2 = (defpackage.km6) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            km6 r2 = (defpackage.km6) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            km6 r2 = (defpackage.km6) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            km6 r2 = (defpackage.km6) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.X
            switch(r0) {
                case 0: goto L2c;
                case 1: goto L1f;
                case 2: goto L12;
                default: goto L5;
            }
        L5:
            km6 r0 = new km6
            qa4 r1 = r3.e0
            r2 = 3
            eo2 r3 = r3.d0
            r0.<init>(r3, r1, r4, r2)
            r0.Z = r5
            return r0
        L12:
            km6 r0 = new km6
            qa4 r1 = r3.e0
            r2 = 2
            eo2 r3 = r3.d0
            r0.<init>(r3, r1, r4, r2)
            r0.Z = r5
            return r0
        L1f:
            km6 r0 = new km6
            qa4 r1 = r3.e0
            r2 = 1
            eo2 r3 = r3.d0
            r0.<init>(r3, r1, r4, r2)
            r0.Z = r5
            return r0
        L2c:
            km6 r0 = new km6
            qa4 r1 = r3.e0
            r2 = 0
            eo2 r3 = r3.d0
            r0.<init>(r3, r1, r4, r2)
            r0.Z = r5
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            qa4 r2 = r8.e0
            eo2 r3 = r8.d0
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            switch(r0) {
                case 0: goto L90;
                case 1: goto L65;
                case 2: goto L3a;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L20
            if (r7 != r6) goto L1b
            defpackage.oi2.Y(r9)
            goto L39
        L1b:
            defpackage.i.m(r5)
            r1 = r4
            goto L39
        L20:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r8.Z
            w61 r9 = (defpackage.w61) r9
            q35 r4 = new q35
            l61 r9 = r9.A()
            r4.<init>(r2, r9)
            r8.Y = r6
            java.lang.Object r8 = r3.o(r4, r8)
            if (r8 != r0) goto L39
            r1 = r0
        L39:
            return r1
        L3a:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L4b
            if (r7 != r6) goto L46
            defpackage.oi2.Y(r9)
            goto L64
        L46:
            defpackage.i.m(r5)
            r1 = r4
            goto L64
        L4b:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r8.Z
            w61 r9 = (defpackage.w61) r9
            q35 r4 = new q35
            l61 r9 = r9.A()
            r4.<init>(r2, r9)
            r8.Y = r6
            java.lang.Object r8 = r3.o(r4, r8)
            if (r8 != r0) goto L64
            r1 = r0
        L64:
            return r1
        L65:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L76
            if (r7 != r6) goto L71
            defpackage.oi2.Y(r9)
            goto L8f
        L71:
            defpackage.i.m(r5)
            r1 = r4
            goto L8f
        L76:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r8.Z
            w61 r9 = (defpackage.w61) r9
            q35 r4 = new q35
            l61 r9 = r9.A()
            r4.<init>(r2, r9)
            r8.Y = r6
            java.lang.Object r8 = r3.o(r4, r8)
            if (r8 != r0) goto L8f
            r1 = r0
        L8f:
            return r1
        L90:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto La1
            if (r7 != r6) goto L9c
            defpackage.oi2.Y(r9)
            goto Lba
        L9c:
            defpackage.i.m(r5)
            r1 = r4
            goto Lba
        La1:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r8.Z
            w61 r9 = (defpackage.w61) r9
            q35 r4 = new q35
            l61 r9 = r9.A()
            r4.<init>(r2, r9)
            r8.Y = r6
            java.lang.Object r8 = r3.o(r4, r8)
            if (r8 != r0) goto Lba
            r1 = r0
        Lba:
            return r1
    }
}
