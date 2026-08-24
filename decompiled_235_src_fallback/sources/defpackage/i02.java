package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i02  reason: default package */
/* loaded from: classes.dex */
public final class i02 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.sz1 Z;
    public final /* synthetic */ java.lang.String d0;
    public final /* synthetic */ java.lang.String e0;

    public /* synthetic */ i02(defpackage.sz1 r1, java.lang.String r2, java.lang.String r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r1 = 2
            r0.<init>(r1, r4)
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
                case 0: goto L42;
                case 1: goto L37;
                case 2: goto L2c;
                case 3: goto L21;
                case 4: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            i02 r2 = (defpackage.i02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            i02 r2 = (defpackage.i02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            i02 r2 = (defpackage.i02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            i02 r2 = (defpackage.i02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L37:
            r41 r2 = r2.q(r4, r3)
            i02 r2 = (defpackage.i02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L42:
            r41 r2 = r2.q(r4, r3)
            i02 r2 = (defpackage.i02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            int r9 = r7.X
            switch(r9) {
                case 0: goto L4b;
                case 1: goto L3d;
                case 2: goto L2f;
                case 3: goto L21;
                case 4: goto L13;
                default: goto L5;
            }
        L5:
            i02 r0 = new i02
            java.lang.String r3 = r7.e0
            r5 = 5
            sz1 r1 = r7.Z
            java.lang.String r2 = r7.d0
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L13:
            r5 = r8
            i02 r1 = new i02
            java.lang.String r4 = r7.e0
            r6 = 4
            sz1 r2 = r7.Z
            java.lang.String r3 = r7.d0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L21:
            r5 = r8
            i02 r1 = new i02
            java.lang.String r4 = r7.e0
            r6 = 3
            sz1 r2 = r7.Z
            java.lang.String r3 = r7.d0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L2f:
            r5 = r8
            i02 r1 = new i02
            java.lang.String r4 = r7.e0
            r6 = 2
            sz1 r2 = r7.Z
            java.lang.String r3 = r7.d0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L3d:
            r5 = r8
            i02 r1 = new i02
            java.lang.String r4 = r7.e0
            r6 = 1
            sz1 r2 = r7.Z
            java.lang.String r3 = r7.d0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L4b:
            r5 = r8
            i02 r1 = new i02
            java.lang.String r4 = r7.e0
            r6 = 0
            sz1 r2 = r7.Z
            java.lang.String r3 = r7.d0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            java.lang.String r1 = r8.e0
            java.lang.String r2 = r8.d0
            sz1 r3 = r8.Z
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            switch(r0) {
                case 0: goto Lb8;
                case 1: goto L98;
                case 2: goto L78;
                case 3: goto L4f;
                case 4: goto L2f;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L20
            if (r7 != r6) goto L1b
            defpackage.oi2.Y(r9)
            goto L2e
        L1b:
            defpackage.i.m(r5)
            r9 = r4
            goto L2e
        L20:
            defpackage.oi2.Y(r9)
            oj4 r9 = r3.i
            r8.Y = r6
            java.lang.Object r9 = r9.g(r2, r1, r8)
            if (r9 != r0) goto L2e
            r9 = r0
        L2e:
            return r9
        L2f:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L40
            if (r7 != r6) goto L3b
            defpackage.oi2.Y(r9)
            goto L4e
        L3b:
            defpackage.i.m(r5)
            r9 = r4
            goto L4e
        L40:
            defpackage.oi2.Y(r9)
            oj4 r9 = r3.i
            r8.Y = r6
            java.lang.Object r9 = r9.g(r2, r1, r8)
            if (r9 != r0) goto L4e
            r9 = r0
        L4e:
            return r9
        L4f:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L63
            if (r7 != r6) goto L5f
            defpackage.oi2.Y(r9)
            hm5 r9 = (defpackage.hm5) r9
            java.lang.Object r8 = r9.A
            goto L72
        L5f:
            defpackage.i.m(r5)
            goto L77
        L63:
            defpackage.oi2.Y(r9)
            oj4 r9 = r3.i
            r8.Y = r6
            java.lang.Object r8 = r9.i(r2, r1, r8)
            if (r8 != r0) goto L72
            r4 = r0
            goto L77
        L72:
            hm5 r4 = new hm5
            r4.<init>(r8)
        L77:
            return r4
        L78:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L89
            if (r7 != r6) goto L84
            defpackage.oi2.Y(r9)
            goto L97
        L84:
            defpackage.i.m(r5)
            r9 = r4
            goto L97
        L89:
            defpackage.oi2.Y(r9)
            oj4 r9 = r3.i
            r8.Y = r6
            java.lang.Object r9 = r9.g(r2, r1, r8)
            if (r9 != r0) goto L97
            r9 = r0
        L97:
            return r9
        L98:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto La9
            if (r7 != r6) goto La4
            defpackage.oi2.Y(r9)
            goto Lb7
        La4:
            defpackage.i.m(r5)
            r9 = r4
            goto Lb7
        La9:
            defpackage.oi2.Y(r9)
            oj4 r9 = r3.i
            r8.Y = r6
            java.lang.Object r9 = r9.g(r2, r1, r8)
            if (r9 != r0) goto Lb7
            r9 = r0
        Lb7:
            return r9
        Lb8:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto Lc9
            if (r7 != r6) goto Lc4
            defpackage.oi2.Y(r9)
            goto Ld7
        Lc4:
            defpackage.i.m(r5)
            r9 = r4
            goto Ld7
        Lc9:
            defpackage.oi2.Y(r9)
            ck4 r9 = r3.j
            r8.Y = r6
            java.lang.Object r9 = r9.b(r2, r1, r8)
            if (r9 != r0) goto Ld7
            r9 = r0
        Ld7:
            return r9
    }
}
