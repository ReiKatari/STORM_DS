package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: re2  reason: default package */
/* loaded from: classes.dex */
public final class re2 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.le2 Z;
    public final /* synthetic */ defpackage.q35 d0;

    public /* synthetic */ re2(defpackage.le2 r1, defpackage.q35 r2, defpackage.r41 r3, int r4) {
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
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            re2 r2 = (defpackage.re2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            re2 r2 = (defpackage.re2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            switch(r4) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            re2 r4 = new re2
            q35 r0 = r2.d0
            r1 = 1
            le2 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            re2 r4 = new re2
            q35 r0 = r2.d0
            r1 = 0
            le2 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.X
            jg7 r1 = defpackage.jg7.a
            r2 = 2
            q35 r3 = r9.d0
            le2 r4 = r9.Z
            r5 = 0
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 1
            switch(r0) {
                case 0: goto L33;
                default: goto L10;
            }
        L10:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r9.Y
            if (r8 == 0) goto L21
            if (r8 != r7) goto L1c
            defpackage.oi2.Y(r10)
            goto L32
        L1c:
            defpackage.i.m(r6)
            r1 = r5
            goto L32
        L21:
            defpackage.oi2.Y(r10)
            qe2 r10 = new qe2
            r10.<init>(r3, r2)
            r9.Y = r7
            java.lang.Object r9 = r4.b(r10, r9)
            if (r9 != r0) goto L32
            r1 = r0
        L32:
            return r1
        L33:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r9.Y
            if (r8 == 0) goto L47
            if (r8 == r7) goto L43
            if (r8 != r2) goto L3e
            goto L43
        L3e:
            defpackage.i.m(r6)
            r1 = r5
            goto L59
        L43:
            defpackage.oi2.Y(r10)
            goto L59
        L47:
            defpackage.oi2.Y(r10)
            qe2 r10 = new qe2
            r2 = 0
            r10.<init>(r3, r2)
            r9.Y = r7
            java.lang.Object r9 = r4.b(r10, r9)
            if (r9 != r0) goto L59
            r1 = r0
        L59:
            return r1
    }
}
