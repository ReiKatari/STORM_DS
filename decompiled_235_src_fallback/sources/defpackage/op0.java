package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: op0  reason: default package */
/* loaded from: classes.dex */
public final class op0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.aq0 Z;
    public final /* synthetic */ defpackage.rc4 d0;

    public /* synthetic */ op0(defpackage.aq0 r1, defpackage.rc4 r2, defpackage.r41 r3, int r4) {
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
                case 0: goto L2c;
                case 1: goto L21;
                case 2: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            op0 r2 = (defpackage.op0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            op0 r2 = (defpackage.op0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            op0 r2 = (defpackage.op0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            op0 r2 = (defpackage.op0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            switch(r4) {
                case 0: goto L26;
                case 1: goto L1b;
                case 2: goto L10;
                default: goto L5;
            }
        L5:
            op0 r4 = new op0
            rc4 r0 = r2.d0
            r1 = 3
            aq0 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            op0 r4 = new op0
            rc4 r0 = r2.d0
            r1 = 2
            aq0 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
        L1b:
            op0 r4 = new op0
            rc4 r0 = r2.d0
            r1 = 1
            aq0 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
        L26:
            op0 r4 = new op0
            rc4 r0 = r2.d0
            r1 = 0
            aq0 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            rc4 r2 = r8.d0
            aq0 r3 = r8.Z
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            switch(r0) {
                case 0: goto L80;
                case 1: goto L5b;
                case 2: goto L35;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L20
            if (r7 != r6) goto L1b
            defpackage.oi2.Y(r9)
            goto L34
        L1b:
            defpackage.i.m(r5)
            r1 = r4
            goto L34
        L20:
            defpackage.oi2.Y(r9)
            vl0 r9 = r3.s
            np0 r3 = new np0
            r4 = 3
            r3.<init>(r2, r4)
            r8.Y = r6
            java.lang.Object r8 = r9.b(r3, r8)
            if (r8 != r0) goto L34
            r1 = r0
        L34:
            return r1
        L35:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L46
            if (r7 != r6) goto L41
            defpackage.oi2.Y(r9)
            goto L5a
        L41:
            defpackage.i.m(r5)
            r1 = r4
            goto L5a
        L46:
            defpackage.oi2.Y(r9)
            vl0 r9 = r3.q
            np0 r3 = new np0
            r4 = 2
            r3.<init>(r2, r4)
            r8.Y = r6
            java.lang.Object r8 = r9.b(r3, r8)
            if (r8 != r0) goto L5a
            r1 = r0
        L5a:
            return r1
        L5b:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L6c
            if (r7 != r6) goto L67
            defpackage.oi2.Y(r9)
            goto L7f
        L67:
            defpackage.i.m(r5)
            r1 = r4
            goto L7f
        L6c:
            defpackage.oi2.Y(r9)
            vl0 r9 = r3.o
            np0 r3 = new np0
            r3.<init>(r2, r6)
            r8.Y = r6
            java.lang.Object r8 = r9.b(r3, r8)
            if (r8 != r0) goto L7f
            r1 = r0
        L7f:
            return r1
        L80:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L91
            if (r7 != r6) goto L8c
            defpackage.oi2.Y(r9)
            goto La5
        L8c:
            defpackage.i.m(r5)
            r1 = r4
            goto La5
        L91:
            defpackage.oi2.Y(r9)
            vl0 r9 = r3.m
            np0 r3 = new np0
            r4 = 0
            r3.<init>(r2, r4)
            r8.Y = r6
            java.lang.Object r8 = r9.b(r3, r8)
            if (r8 != r0) goto La5
            r1 = r0
        La5:
            return r1
    }
}
