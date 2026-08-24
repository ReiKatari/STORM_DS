package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p02  reason: default package */
/* loaded from: classes.dex */
public final class p02 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.sz1 Z;
    public defpackage.dy1 d0;

    public /* synthetic */ p02(defpackage.sz1 r1, defpackage.dy1 r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Z = r1
            r0.d0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public p02(defpackage.sz1 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 2
            r1.X = r0
            r1.Z = r2
            r1.<init>(r0, r3)
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
            p02 r2 = (defpackage.p02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            p02 r2 = (defpackage.p02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            p02 r2 = (defpackage.p02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            p02 r2 = (defpackage.p02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L37:
            r41 r2 = r2.q(r4, r3)
            p02 r2 = (defpackage.p02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            sz1 r0 = r2.Z
            switch(r4) {
                case 0: goto L28;
                case 1: goto L1f;
                case 2: goto L19;
                case 3: goto L10;
                default: goto L7;
            }
        L7:
            p02 r4 = new p02
            dy1 r2 = r2.d0
            r1 = 4
            r4.<init>(r0, r2, r3, r1)
            return r4
        L10:
            p02 r4 = new p02
            dy1 r2 = r2.d0
            r1 = 3
            r4.<init>(r0, r2, r3, r1)
            return r4
        L19:
            p02 r2 = new p02
            r2.<init>(r0, r3)
            return r2
        L1f:
            p02 r4 = new p02
            dy1 r2 = r2.d0
            r1 = 1
            r4.<init>(r0, r2, r3, r1)
            return r4
        L28:
            p02 r4 = new p02
            dy1 r2 = r2.d0
            r1 = 0
            r4.<init>(r0, r2, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            int r1 = r0.X
            r2 = 3
            r3 = 4
            r4 = 5
            sz1 r5 = r0.Z
            jg7 r6 = defpackage.jg7.a
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r8 = 2
            r9 = 0
            r10 = 1
            switch(r1) {
                case 0: goto L19b;
                case 1: goto L128;
                case 2: goto La7;
                case 3: goto L5d;
                default: goto L13;
            }
        L13:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L2c
            if (r2 == r10) goto L26
            if (r2 != r8) goto L21
            defpackage.oi2.Y(r18)
            goto L5c
        L21:
            defpackage.i.m(r7)
            r6 = r9
            goto L5c
        L26:
            defpackage.oi2.Y(r18)
            r2 = r18
            goto L48
        L2c:
            defpackage.oi2.Y(r18)
            dy1 r2 = r0.d0
            pq5 r2 = r2.a
            r0.Y = r10
            r5.getClass()
            xe1 r3 = defpackage.xk1.a
            de1 r3 = defpackage.de1.L
            g12 r4 = new g12
            r4.<init>(r5, r2, r9, r10)
            java.lang.Object r2 = defpackage.hv.d0(r3, r4, r0)
            if (r2 != r1) goto L48
            goto L5b
        L48:
            java.util.List r2 = (java.util.List) r2
            of6 r3 = r5.T0
            yy1 r4 = new yy1
            xy1 r5 = defpackage.xy1.LOADING
            r4.<init>(r2, r5)
            r0.Y = r8
            java.lang.Object r0 = r3.a(r4, r0)
            if (r0 != r1) goto L5c
        L5b:
            r6 = r1
        L5c:
            return r6
        L5d:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L76
            if (r2 == r10) goto L70
            if (r2 != r8) goto L6b
            defpackage.oi2.Y(r18)
            goto La6
        L6b:
            defpackage.i.m(r7)
            r6 = r9
            goto La6
        L70:
            defpackage.oi2.Y(r18)
            r2 = r18
            goto L92
        L76:
            defpackage.oi2.Y(r18)
            dy1 r2 = r0.d0
            pq5 r2 = r2.a
            r0.Y = r10
            r5.getClass()
            xe1 r3 = defpackage.xk1.a
            de1 r3 = defpackage.de1.L
            g12 r4 = new g12
            r4.<init>(r5, r2, r9, r10)
            java.lang.Object r2 = defpackage.hv.d0(r3, r4, r0)
            if (r2 != r1) goto L92
            goto La5
        L92:
            java.util.List r2 = (java.util.List) r2
            of6 r3 = r5.T0
            yy1 r4 = new yy1
            xy1 r5 = defpackage.xy1.SAVING
            r4.<init>(r2, r5)
            r0.Y = r8
            java.lang.Object r0 = r3.a(r4, r0)
            if (r0 != r1) goto La6
        La5:
            r6 = r1
        La6:
            return r6
        La7:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r15 = 0
            sz1 r12 = r0.Z
            if (r2 == 0) goto Lc9
            if (r2 == r10) goto Lc0
            if (r2 != r8) goto Lba
            defpackage.oi2.Y(r18)
            r0 = r18
            goto L10b
        Lba:
            defpackage.i.m(r7)
            r6 = r9
            goto L127
        Lc0:
            dy1 r2 = r0.d0
            defpackage.oi2.Y(r18)
            r3 = r18
        Lc7:
            r14 = r2
            goto Lee
        Lc9:
            defpackage.oi2.Y(r18)
            tp6 r2 = r12.p0
            java.lang.Object r2 = r2.getValue()
            boolean r3 = r2 instanceof defpackage.dy1
            if (r3 == 0) goto Ld9
            dy1 r2 = (defpackage.dy1) r2
            goto Lda
        Ld9:
            r2 = r15
        Lda:
            if (r2 != 0) goto Ldd
            goto L127
        Ldd:
            pn5 r3 = r12.g
            r0.d0 = r2
            r0.Y = r10
            pl r3 = (defpackage.pl) r3
            hk r3 = r3.c
            java.lang.Object r3 = r3.b(r0)
            if (r3 != r1) goto Lc7
            goto L109
        Lee:
            r13 = r3
            jb5 r13 = (defpackage.jb5) r13
            if (r13 != 0) goto Lf4
            goto L127
        Lf4:
            xe1 r2 = defpackage.xk1.a
            de1 r2 = defpackage.de1.L
            u12 r11 = new u12
            r16 = 3
            r11.<init>(r12, r13, r14, r15, r16)
            r0.d0 = r15
            r0.Y = r8
            java.lang.Object r0 = defpackage.hv.d0(r2, r11, r0)
            if (r0 != r1) goto L10b
        L109:
            r6 = r1
            goto L127
        L10b:
            pj4 r0 = (defpackage.pj4) r0
            ui4 r1 = r0.a
            ui4 r2 = defpackage.ui4.OK
            if (r1 != r2) goto L127
            int r1 = r0.a()
            if (r1 <= 0) goto L127
            of6 r1 = r12.J0
            w67 r2 = new w67
            int r0 = r0.a()
            r2.<init>(r0)
            r1.k(r2)
        L127:
            return r6
        L128:
            dy1 r1 = r0.d0
            pq5 r1 = r1.a
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            int r12 = r0.Y
            if (r12 == 0) goto L159
            if (r12 == r10) goto L155
            if (r12 == r8) goto L14f
            if (r12 == r2) goto L149
            if (r12 == r3) goto L145
            if (r12 != r4) goto L140
            defpackage.oi2.Y(r18)
            goto L19a
        L140:
            defpackage.i.m(r7)
            r6 = r9
            goto L19a
        L145:
            defpackage.oi2.Y(r18)
            goto L192
        L149:
            defpackage.oi2.Y(r18)
            r1 = r18
            goto L17d
        L14f:
            defpackage.oi2.Y(r18)
            r7 = r18
            goto L172
        L155:
            defpackage.oi2.Y(r18)
            goto L169
        L159:
            defpackage.oi2.Y(r18)
            jh r7 = r5.v
            r0.Y = r10
            r7.getClass()
            defpackage.jh.i()
            if (r6 != r11) goto L169
            goto L199
        L169:
            r0.Y = r8
            java.lang.Object r7 = r5.t0(r1, r0)
            if (r7 != r11) goto L172
            goto L199
        L172:
            c46 r7 = (defpackage.c46) r7
            r0.Y = r2
            java.lang.Object r1 = r5.X0(r1, r7, r0)
            if (r1 != r11) goto L17d
            goto L199
        L17d:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L192
            of6 r1 = r5.J0
            r0.Y = r3
            i77 r2 = defpackage.i77.a
            java.lang.Object r1 = r1.a(r2, r0)
            if (r1 != r11) goto L192
            goto L199
        L192:
            r0.Y = r4
            r5.U0()
            if (r6 != r11) goto L19a
        L199:
            r6 = r11
        L19a:
            return r6
        L19b:
            dy1 r1 = r0.d0
            pq5 r1 = r1.a
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            int r12 = r0.Y
            if (r12 == 0) goto L1cc
            if (r12 == r10) goto L1c8
            if (r12 == r8) goto L1c2
            if (r12 == r2) goto L1bc
            if (r12 == r3) goto L1b8
            if (r12 != r4) goto L1b3
            defpackage.oi2.Y(r18)
            goto L20d
        L1b3:
            defpackage.i.m(r7)
            r6 = r9
            goto L20d
        L1b8:
            defpackage.oi2.Y(r18)
            goto L205
        L1bc:
            defpackage.oi2.Y(r18)
            r1 = r18
            goto L1f0
        L1c2:
            defpackage.oi2.Y(r18)
            r7 = r18
            goto L1e5
        L1c8:
            defpackage.oi2.Y(r18)
            goto L1dc
        L1cc:
            defpackage.oi2.Y(r18)
            jh r7 = r5.v
            r0.Y = r10
            r7.getClass()
            defpackage.jh.i()
            if (r6 != r11) goto L1dc
            goto L20c
        L1dc:
            r0.Y = r8
            java.lang.Object r7 = r5.t0(r1, r0)
            if (r7 != r11) goto L1e5
            goto L20c
        L1e5:
            c46 r7 = (defpackage.c46) r7
            r0.Y = r2
            java.lang.Object r1 = r5.A0(r1, r7, r0)
            if (r1 != r11) goto L1f0
            goto L20c
        L1f0:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L205
            of6 r1 = r5.J0
            r0.Y = r3
            h77 r2 = defpackage.h77.a
            java.lang.Object r1 = r1.a(r2, r0)
            if (r1 != r11) goto L205
            goto L20c
        L205:
            r0.Y = r4
            r5.U0()
            if (r6 != r11) goto L20d
        L20c:
            r6 = r11
        L20d:
            return r6
    }
}
