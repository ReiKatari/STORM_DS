package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r02  reason: default package */
/* loaded from: classes.dex */
public final class r02 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.sz1 Z;
    public boolean d0;

    public r02(defpackage.sz1 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.Z = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    public r02(defpackage.sz1 r2, boolean r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.Z = r2
            r1.d0 = r3
            r2 = 2
            r1.<init>(r2, r4)
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
            r02 r2 = (defpackage.r02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            r02 r2 = (defpackage.r02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            sz1 r0 = r1.Z
            switch(r3) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            r02 r3 = new r02
            boolean r1 = r1.d0
            r3.<init>(r0, r1, r2)
            return r3
        Lf:
            r02 r1 = new r02
            r1.<init>(r0, r2)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.X
            r3 = 5
            r4 = 4
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            sz1 r6 = r0.Z
            r7 = 1
            r8 = 2
            r9 = 3
            jg7 r10 = defpackage.jg7.a
            r11 = 0
            switch(r1) {
                case 0: goto L123;
                default: goto L13;
            }
        L13:
            tp6 r1 = r6.p0
            kd6 r12 = r6.c
            x61 r13 = defpackage.x61.COROUTINE_SUSPENDED
            int r14 = r0.Y
            if (r14 == 0) goto L38
            if (r14 == r7) goto L34
            if (r14 == r8) goto L2e
            if (r14 != r9) goto L28
            defpackage.oi2.Y(r19)
            goto L122
        L28:
            defpackage.i.m(r5)
            r10 = r11
            goto L122
        L2e:
            defpackage.oi2.Y(r19)
            r5 = r19
            goto L5e
        L34:
            defpackage.oi2.Y(r19)
            goto L49
        L38:
            defpackage.oi2.Y(r19)
            jh r5 = r6.v
            r0.Y = r7
            r5.getClass()
            defpackage.jh.i()
            if (r10 != r13) goto L49
            goto L121
        L49:
            boolean r5 = r0.d0
            if (r5 == 0) goto L122
            r5 = r12
            ng6 r5 = (defpackage.ng6) r5
            wp0 r5 = r5.C()
            r0.Y = r8
            java.lang.Object r5 = defpackage.f04.D(r5, r0)
            if (r5 != r13) goto L5e
            goto L121
        L5e:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            boolean r5 = defpackage.nb3.k(r5, r14)
            java.lang.Object r14 = r1.getValue()
            hy1 r14 = (defpackage.hy1) r14
            boolean r15 = r14 instanceof defpackage.dy1
            if (r15 == 0) goto Le5
            t52 r11 = defpackage.xz5.getEntries()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r11 = r11.iterator()
        L7b:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto Le3
            java.lang.Object r15 = r11.next()
            r16 = r15
            xz5 r16 = (defpackage.xz5) r16
            sx1 r7 = r6.w
            int[] r17 = defpackage.wz1.d
            int r16 = r16.ordinal()
            r2 = r17[r16]
            if (r2 == r8) goto Ld4
            if (r2 == r9) goto Ld0
            if (r2 == r4) goto Lcb
            if (r2 == r3) goto Lb3
            r3 = 7
            if (r2 == r3) goto Lb0
            r3 = 8
            if (r2 == r3) goto La9
            r3 = 10
            if (r2 == r3) goto La7
            goto Lc7
        La7:
            r2 = r5
            goto Lda
        La9:
            cd5 r2 = r6.f0()
            boolean r2 = r2.a
            goto Lda
        Lb0:
            boolean r2 = r7.b
            goto Lda
        Lb3:
            r2 = r12
            ng6 r2 = (defpackage.ng6) r2
            android.content.SharedPreferences r2 = r2.b
            java.lang.String r3 = "enable_rewind"
            r4 = 0
            boolean r2 = r2.getBoolean(r3, r4)
            if (r2 == 0) goto Lc9
            boolean r2 = r7.b()
            if (r2 == 0) goto Lc9
        Lc7:
            r2 = 1
            goto Lda
        Lc9:
            r2 = r4
            goto Lda
        Lcb:
            boolean r2 = r7.b()
            goto Lda
        Ld0:
            r7.getClass()
            goto Lc7
        Ld4:
            java.lang.Object r2 = r1.getValue()
            boolean r2 = r2 instanceof defpackage.dy1
        Lda:
            if (r2 == 0) goto Ldf
            r14.add(r15)
        Ldf:
            r3 = 5
            r4 = 4
            r7 = 1
            goto L7b
        Le3:
            r11 = r14
            goto Led
        Le5:
            boolean r1 = r14 instanceof defpackage.cy1
            if (r1 == 0) goto Led
            t52 r11 = defpackage.cd2.getEntries()
        Led:
            if (r11 == 0) goto L122
            cd5 r1 = r6.f0()
            java.lang.String r2 = r1.c
            boolean r1 = r1.a
            if (r1 == 0) goto L10b
            if (r2 == 0) goto L10b
            xz5 r1 = defpackage.xz5.SYNC_RETRO_ACHIEVEMENTS
            boolean r3 = r11.contains(r1)
            if (r3 == 0) goto L10b
            java.util.Map r1 = java.util.Collections.singletonMap(r1, r2)
            r1.getClass()
            goto L10d
        L10b:
            zt1 r1 = defpackage.zt1.A
        L10d:
            of6 r2 = r6.T0
            sy1 r3 = new sy1
            mu4 r4 = new mu4
            r4.<init>(r1, r11)
            r3.<init>(r4)
            r0.Y = r9
            java.lang.Object r0 = r2.a(r3, r0)
            if (r0 != r13) goto L122
        L121:
            r10 = r13
        L122:
            return r10
        L123:
            of6 r1 = r6.J0
            kd6 r2 = r6.c
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r0.Y
            k77 r6 = defpackage.k77.a
            if (r4 == 0) goto L156
            r7 = 1
            if (r4 == r7) goto L150
            if (r4 == r8) goto L13c
            if (r4 == r9) goto L147
            r2 = 4
            if (r4 == r2) goto L13c
            r0 = 5
            if (r4 != r0) goto L141
        L13c:
            defpackage.oi2.Y(r19)
            goto L1bc
        L141:
            defpackage.i.m(r5)
            r10 = r11
            goto L1bc
        L147:
            boolean r2 = r0.d0
            defpackage.oi2.Y(r19)
            r4 = r2
            r2 = r19
            goto L197
        L150:
            defpackage.oi2.Y(r19)
            r4 = r19
            goto L16a
        L156:
            defpackage.oi2.Y(r19)
            r4 = r2
            ng6 r4 = (defpackage.ng6) r4
            wp0 r4 = r4.C()
            r7 = 1
            r0.Y = r7
            java.lang.Object r4 = defpackage.f04.D(r4, r0)
            if (r4 != r3) goto L16a
            goto L1bb
        L16a:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L17d
            r0.d0 = r4
            r0.Y = r8
            java.lang.Object r0 = r1.a(r6, r0)
            if (r0 != r3) goto L1bc
            goto L1bb
        L17d:
            ng6 r2 = (defpackage.ng6) r2
            me.magnum.melonds.domain.model.VideoRenderer r2 = r2.e()
            xe1 r5 = defpackage.xk1.a
            y3 r7 = new y3
            r8 = 10
            r7.<init>(r2, r11, r8)
            r0.d0 = r4
            r0.Y = r9
            java.lang.Object r2 = defpackage.hv.d0(r5, r7, r0)
            if (r2 != r3) goto L197
            goto L1bb
        L197:
            ak5 r2 = (defpackage.ak5) r2
            boolean r5 = r2.b
            if (r5 == 0) goto L1b0
            l77 r5 = new l77
            java.lang.String r2 = r2.a
            r5.<init>(r2)
            r0.d0 = r4
            r2 = 4
            r0.Y = r2
            java.lang.Object r0 = r1.a(r5, r0)
            if (r0 != r3) goto L1bc
            goto L1bb
        L1b0:
            r0.d0 = r4
            r2 = 5
            r0.Y = r2
            java.lang.Object r0 = r1.a(r6, r0)
            if (r0 != r3) goto L1bc
        L1bb:
            r10 = r3
        L1bc:
            return r10
    }
}
