package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ve2  reason: default package */
/* loaded from: classes.dex */
public final class ve2 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ defpackage.ne2 d0;

    public /* synthetic */ ve2(defpackage.ne2 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.d0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L14;
                default: goto L7;
            }
        L7:
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ve2 r2 = (defpackage.ve2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L14:
            gm0 r3 = (defpackage.gm0) r3
            java.lang.Object r3 = r3.a
            r41 r4 = (defpackage.r41) r4
            gm0 r0 = new gm0
            r0.<init>(r3)
            r41 r2 = r2.q(r4, r0)
            ve2 r2 = (defpackage.ve2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            ve2 r0 = new ve2
            ne2 r2 = r2.d0
            r1 = 1
            r0.<init>(r2, r3, r1)
            r0.Z = r4
            return r0
        L10:
            ve2 r0 = new ve2
            ne2 r2 = r2.d0
            r1 = 0
            r0.<init>(r2, r3, r1)
            r0.Z = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.X
            ne2 r1 = r6.d0
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            switch(r0) {
                case 0: goto L2d;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L1b
            if (r5 != r4) goto L17
            defpackage.oi2.Y(r7)
            goto L2a
        L17:
            defpackage.i.m(r3)
            goto L2c
        L1b:
            defpackage.oi2.Y(r7)
            java.lang.Object r7 = r6.Z
            r6.Y = r4
            java.lang.Object r6 = r1.a(r7, r6)
            if (r6 != r0) goto L2a
            r2 = r0
            goto L2c
        L2a:
            jg7 r2 = defpackage.jg7.a
        L2c:
            return r2
        L2d:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L3f
            if (r5 != r4) goto L3b
            java.lang.Object r6 = r6.Z
            defpackage.oi2.Y(r7)
            goto L59
        L3b:
            defpackage.i.m(r3)
            goto L6b
        L3f:
            defpackage.oi2.Y(r7)
            java.lang.Object r7 = r6.Z
            gm0 r7 = (defpackage.gm0) r7
            java.lang.Object r7 = r7.a
            boolean r2 = r7 instanceof defpackage.fm0
            if (r2 != 0) goto L5a
            r6.Z = r7
            r6.Y = r4
            java.lang.Object r6 = r1.a(r7, r6)
            if (r6 != r0) goto L58
            r2 = r0
            goto L6b
        L58:
            r6 = r7
        L59:
            r7 = r6
        L5a:
            boolean r6 = r7 instanceof defpackage.em0
            if (r6 == 0) goto L69
            em0 r7 = (defpackage.em0) r7
            java.lang.Throwable r6 = r7.a
            if (r6 != 0) goto L68
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L6b
        L68:
            throw r6
        L69:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
        L6b:
            return r2
    }
}
