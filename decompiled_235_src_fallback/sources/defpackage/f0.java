package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f0  reason: default package */
/* loaded from: classes.dex */
public final class f0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.h0 Z;
    public final /* synthetic */ defpackage.l25 d0;

    public /* synthetic */ f0(defpackage.h0 r1, defpackage.l25 r2, defpackage.r41 r3, int r4) {
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
            f0 r2 = (defpackage.f0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            f0 r2 = (defpackage.f0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            f0 r2 = (defpackage.f0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            f0 r2 = (defpackage.f0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            l25 r0 = r2.d0
            h0 r2 = r2.Z
            switch(r4) {
                case 0: goto L1e;
                case 1: goto L17;
                case 2: goto L10;
                default: goto L9;
            }
        L9:
            f0 r4 = new f0
            r1 = 3
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            f0 r4 = new f0
            r1 = 2
            r4.<init>(r2, r0, r3, r1)
            return r4
        L17:
            f0 r4 = new f0
            r1 = 1
            r4.<init>(r2, r0, r3, r1)
            return r4
        L1e:
            f0 r4 = new f0
            r1 = 0
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            l25 r2 = r8.d0
            h0 r3 = r8.Z
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            switch(r0) {
                case 0: goto L7f;
                case 1: goto L58;
                case 2: goto L36;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L20
            if (r7 != r6) goto L1b
            defpackage.oi2.Y(r9)
            goto L35
        L1b:
            defpackage.i.m(r5)
            r1 = r4
            goto L35
        L20:
            defpackage.oi2.Y(r9)
            r94 r9 = r3.m0
            if (r9 == 0) goto L35
            m25 r3 = new m25
            r3.<init>(r2)
            r8.Y = r6
            java.lang.Object r8 = r9.a(r3, r8)
            if (r8 != r0) goto L35
            r1 = r0
        L35:
            return r1
        L36:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L47
            if (r7 != r6) goto L42
            defpackage.oi2.Y(r9)
            goto L57
        L42:
            defpackage.i.m(r5)
            r1 = r4
            goto L57
        L47:
            defpackage.oi2.Y(r9)
            r94 r9 = r3.m0
            if (r9 == 0) goto L57
            r8.Y = r6
            java.lang.Object r8 = r9.a(r2, r8)
            if (r8 != r0) goto L57
            r1 = r0
        L57:
            return r1
        L58:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L69
            if (r7 != r6) goto L64
            defpackage.oi2.Y(r9)
            goto L7e
        L64:
            defpackage.i.m(r5)
            r1 = r4
            goto L7e
        L69:
            defpackage.oi2.Y(r9)
            r94 r9 = r3.m0
            if (r9 == 0) goto L7e
            k25 r3 = new k25
            r3.<init>(r2)
            r8.Y = r6
            java.lang.Object r8 = r9.a(r3, r8)
            if (r8 != r0) goto L7e
            r1 = r0
        L7e:
            return r1
        L7f:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L90
            if (r7 != r6) goto L8b
            defpackage.oi2.Y(r9)
            goto La5
        L8b:
            defpackage.i.m(r5)
            r1 = r4
            goto La5
        L90:
            defpackage.oi2.Y(r9)
            r94 r9 = r3.m0
            if (r9 == 0) goto La5
            k25 r3 = new k25
            r3.<init>(r2)
            r8.Y = r6
            java.lang.Object r8 = r9.a(r3, r8)
            if (r8 != r0) goto La5
            r1 = r0
        La5:
            return r1
    }
}
