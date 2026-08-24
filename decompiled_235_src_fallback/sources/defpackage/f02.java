package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f02  reason: default package */
/* loaded from: classes.dex */
public final class f02 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.sz1 Z;
    public final /* synthetic */ defpackage.pq5 d0;

    public /* synthetic */ f02(defpackage.sz1 r1, defpackage.pq5 r2, defpackage.r41 r3, int r4) {
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
                case 0: goto L37;
                case 1: goto L2c;
                case 2: goto L21;
                case 3: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            f02 r2 = (defpackage.f02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            f02 r2 = (defpackage.f02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            f02 r2 = (defpackage.f02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            f02 r2 = (defpackage.f02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L37:
            r41 r2 = r2.q(r4, r3)
            f02 r2 = (defpackage.f02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            pq5 r0 = r2.d0
            sz1 r2 = r2.Z
            switch(r4) {
                case 0: goto L25;
                case 1: goto L1e;
                case 2: goto L17;
                case 3: goto L10;
                default: goto L9;
            }
        L9:
            f02 r4 = new f02
            r1 = 4
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            f02 r4 = new f02
            r1 = 3
            r4.<init>(r2, r0, r3, r1)
            return r4
        L17:
            f02 r4 = new f02
            r1 = 2
            r4.<init>(r2, r0, r3, r1)
            return r4
        L1e:
            f02 r4 = new f02
            r1 = 1
            r4.<init>(r2, r0, r3, r1)
            return r4
        L25:
            f02 r4 = new f02
            r1 = 0
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.X
            jg7 r1 = defpackage.jg7.a
            pq5 r2 = r9.d0
            sz1 r3 = r9.Z
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            switch(r0) {
                case 0: goto Laf;
                case 1: goto L8b;
                case 2: goto L4d;
                case 3: goto L2f;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r9.Y
            if (r7 == 0) goto L20
            if (r7 != r6) goto L1b
            defpackage.oi2.Y(r10)
            goto L2e
        L1b:
            defpackage.i.m(r5)
            r1 = r4
            goto L2e
        L20:
            defpackage.oi2.Y(r10)
            jh r10 = r3.v
            r9.Y = r6
            java.lang.Object r9 = r10.m(r2, r9)
            if (r9 != r0) goto L2e
            r1 = r0
        L2e:
            return r1
        L2f:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r9.Y
            if (r1 == 0) goto L40
            if (r1 != r6) goto L3b
            defpackage.oi2.Y(r10)
            goto L4c
        L3b:
            defpackage.i.m(r5)
            r10 = r4
            goto L4c
        L40:
            defpackage.oi2.Y(r10)
            r9.Y = r6
            java.lang.Object r10 = defpackage.sz1.v(r3, r2, r9)
            if (r10 != r0) goto L4c
            r10 = r0
        L4c:
            return r10
        L4d:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r9.Y
            r8 = 2
            if (r7 == 0) goto L65
            if (r7 == r6) goto L61
            if (r7 != r8) goto L5c
            defpackage.oi2.Y(r10)
            goto L8a
        L5c:
            defpackage.i.m(r5)
            r1 = r4
            goto L8a
        L61:
            defpackage.oi2.Y(r10)
            goto L77
        L65:
            defpackage.oi2.Y(r10)
            p06 r10 = r3.e
            android.net.Uri r2 = r2.d
            r9.Y = r6
            xb2 r10 = (defpackage.xb2) r10
            java.lang.Object r10 = r10.l(r2, r9)
            if (r10 != r0) goto L77
            goto L89
        L77:
            pq5 r10 = (defpackage.pq5) r10
            if (r10 != 0) goto L7c
            goto L8a
        L7c:
            r3.i1(r10)
            jh r2 = r3.v
            r9.Y = r8
            java.lang.Object r9 = r2.m(r10, r9)
            if (r9 != r0) goto L8a
        L89:
            r1 = r0
        L8a:
            return r1
        L8b:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r9.Y
            if (r1 == 0) goto L9c
            if (r1 != r6) goto L97
            defpackage.oi2.Y(r10)
            goto Lae
        L97:
            defpackage.i.m(r5)
            r10 = r4
            goto Lae
        L9c:
            defpackage.oi2.Y(r10)
            pn5 r10 = r3.g
            java.lang.String r1 = r2.i
            r9.Y = r6
            pl r10 = (defpackage.pl) r10
            java.lang.Object r10 = r10.l(r1, r9)
            if (r10 != r0) goto Lae
            r10 = r0
        Lae:
            return r10
        Laf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r9.Y
            if (r1 == 0) goto Lc0
            if (r1 != r6) goto Lbb
            defpackage.oi2.Y(r10)
            goto Ld2
        Lbb:
            defpackage.i.m(r5)
            r10 = r4
            goto Ld2
        Lc0:
            defpackage.oi2.Y(r10)
            pn5 r10 = r3.g
            java.lang.String r1 = r2.i
            r9.Y = r6
            pl r10 = (defpackage.pl) r10
            java.lang.Object r10 = r10.l(r1, r9)
            if (r10 != r0) goto Ld2
            r10 = r0
        Ld2:
            return r10
    }
}
