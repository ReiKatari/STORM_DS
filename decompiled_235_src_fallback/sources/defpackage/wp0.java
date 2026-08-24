package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wp0  reason: default package */
/* loaded from: classes.dex */
public final class wp0 implements defpackage.le2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ wp0(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.<init>()
            return
    }

    @Override // defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r18, defpackage.r41 r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r0.A
            r4 = 3
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1
            r8 = 2
            r9 = 0
            java.lang.Object r10 = r0.L
            java.lang.Object r11 = r0.B
            jg7 r12 = defpackage.jg7.a
            switch(r3) {
                case 0: goto L1e3;
                case 1: goto L184;
                case 2: goto Lef;
                case 3: goto L98;
                case 4: goto L83;
                case 5: goto L6e;
                case 6: goto L58;
                case 7: goto L43;
                case 8: goto L2e;
                default: goto L19;
            }
        L19:
            wp0 r11 = (defpackage.wp0) r11
            zb0 r0 = new zb0
            ng6 r10 = (defpackage.ng6) r10
            r3 = 18
            r0.<init>(r3, r1, r10)
            java.lang.Object r0 = r11.b(r0, r2)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L2d
            r12 = r0
        L2d:
            return r12
        L2e:
            na4 r11 = (defpackage.na4) r11
            zb0 r0 = new zb0
            on2 r10 = (defpackage.on2) r10
            r3 = 17
            r0.<init>(r3, r1, r10)
            java.lang.Object r0 = r11.b(r0, r2)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L42
            r12 = r0
        L42:
            return r12
        L43:
            pa3 r11 = (defpackage.pa3) r11
            zb0 r0 = new zb0
            java.util.UUID r10 = (java.util.UUID) r10
            r3 = 11
            r0.<init>(r3, r1, r10)
            java.lang.Object r0 = r11.b(r0, r2)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L57
            r12 = r0
        L57:
            return r12
        L58:
            le2[] r11 = (defpackage.le2[]) r11
            jz r0 = defpackage.jz.R
            o12 r3 = new o12
            io2 r10 = (defpackage.io2) r10
            r4 = 4
            r3.<init>(r9, r10, r4)
            java.lang.Object r0 = defpackage.nb3.o(r2, r1, r0, r3, r11)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L6d
            r12 = r0
        L6d:
            return r12
        L6e:
            le2[] r11 = (defpackage.le2[]) r11
            jz r0 = defpackage.jz.R
            o12 r3 = new o12
            ho2 r10 = (defpackage.ho2) r10
            r3.<init>(r9, r10, r4)
            java.lang.Object r0 = defpackage.nb3.o(r2, r1, r0, r3, r11)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L82
            r12 = r0
        L82:
            return r12
        L83:
            le2[] r11 = (defpackage.le2[]) r11
            jz r0 = defpackage.jz.R
            o12 r3 = new o12
            go2 r10 = (defpackage.go2) r10
            r3.<init>(r9, r10, r8)
            java.lang.Object r0 = defpackage.nb3.o(r2, r1, r0, r3, r11)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L97
            r12 = r0
        L97:
            return r12
        L98:
            boolean r3 = r2 instanceof defpackage.mf2
            if (r3 == 0) goto La9
            r3 = r2
            mf2 r3 = (defpackage.mf2) r3
            int r4 = r3.X
            r8 = r4 & r6
            if (r8 == 0) goto La9
            int r4 = r4 - r6
            r3.X = r4
            goto Lae
        La9:
            mf2 r3 = new mf2
            r3.<init>(r0, r2)
        Lae:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            if (r4 == 0) goto Lc4
            if (r4 != r7) goto Lc0
            zb0 r1 = r3.Z
            defpackage.oi2.Y(r0)     // Catch: defpackage.o -> Lbe
            goto Lec
        Lbe:
            r0 = move-exception
            goto Le0
        Lc0:
            defpackage.i.m(r5)
            goto Led
        Lc4:
            defpackage.oi2.Y(r0)
            wp0 r11 = (defpackage.wp0) r11
            zb0 r4 = new zb0
            m8 r10 = (defpackage.m8) r10
            r0 = 8
            r4.<init>(r0, r10, r1)
            r3.Z = r4     // Catch: defpackage.o -> Lde
            r3.X = r7     // Catch: defpackage.o -> Lde
            java.lang.Object r0 = r11.b(r4, r3)     // Catch: defpackage.o -> Lde
            if (r0 != r2) goto Lec
            r9 = r2
            goto Led
        Lde:
            r0 = move-exception
            r1 = r4
        Le0:
            java.lang.Object r2 = r0.A
            if (r2 != r1) goto Lee
            l61 r0 = r3.B
            r0.getClass()
            defpackage.yh2.o(r0)
        Lec:
            r9 = r12
        Led:
            return r9
        Lee:
            throw r0
        Lef:
            boolean r3 = r2 instanceof defpackage.gf2
            if (r3 == 0) goto L100
            r3 = r2
            gf2 r3 = (defpackage.gf2) r3
            int r4 = r3.X
            r10 = r4 & r6
            if (r10 == 0) goto L100
            int r4 = r4 - r6
            r3.X = r4
            goto L105
        L100:
            gf2 r3 = new gf2
            r3.<init>(r0, r2)
        L105:
            java.lang.Object r2 = r3.R
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r3.X
            if (r6 == 0) goto L12e
            if (r6 == r7) goto L122
            if (r6 != r8) goto L11d
            long r0 = r3.f0
            java.lang.Throwable r5 = r3.e0
            ne2 r6 = r3.d0
            wp0 r10 = r3.Z
            defpackage.oi2.Y(r2)
            goto L16c
        L11d:
            defpackage.i.m(r5)
            goto L183
        L122:
            long r0 = r3.f0
            ne2 r5 = r3.d0
            wp0 r6 = r3.Z
            defpackage.oi2.Y(r2)
            r10 = r6
            r6 = r5
            goto L14c
        L12e:
            defpackage.oi2.Y(r2)
            r5 = 0
        L133:
            java.lang.Object r2 = r0.B
            ng2 r2 = (defpackage.ng2) r2
            r3.Z = r0
            r3.d0 = r1
            r3.e0 = r9
            r3.f0 = r5
            r3.X = r7
            java.io.Serializable r2 = defpackage.f04.q(r2, r1, r3)
            if (r2 != r4) goto L148
            goto L16a
        L148:
            r10 = r0
            r15 = r5
            r6 = r1
            r0 = r15
        L14c:
            r5 = r2
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L17e
            java.lang.Object r2 = r10.L
            gg7 r2 = (defpackage.gg7) r2
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r0)
            r3.Z = r10
            r3.d0 = r6
            r3.e0 = r5
            r3.f0 = r0
            r3.X = r8
            java.lang.Object r2 = r2.l(r6, r5, r11, r3)
            if (r2 != r4) goto L16c
        L16a:
            r9 = r4
            goto L183
        L16c:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L17d
            r13 = 1
            long r0 = r0 + r13
            r2 = r7
        L178:
            r15 = r0
            r1 = r6
            r5 = r15
            r0 = r10
            goto L180
        L17d:
            throw r5
        L17e:
            r2 = 0
            goto L178
        L180:
            if (r2 != 0) goto L133
            r9 = r12
        L183:
            return r9
        L184:
            boolean r3 = r2 instanceof defpackage.df2
            if (r3 == 0) goto L195
            r3 = r2
            df2 r3 = (defpackage.df2) r3
            int r4 = r3.X
            r10 = r4 & r6
            if (r10 == 0) goto L195
            int r4 = r4 - r6
            r3.X = r4
            goto L19a
        L195:
            df2 r3 = new df2
            r3.<init>(r0, r2)
        L19a:
            java.lang.Object r2 = r3.R
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r3.X
            if (r6 == 0) goto L1b9
            if (r6 == r7) goto L1ae
            if (r6 != r8) goto L1aa
            defpackage.oi2.Y(r2)
            goto L1e1
        L1aa:
            defpackage.i.m(r5)
            goto L1e2
        L1ae:
            ne2 r0 = r3.d0
            wp0 r1 = r3.Z
            defpackage.oi2.Y(r2)
            r15 = r1
            r1 = r0
            r0 = r15
            goto L1cb
        L1b9:
            defpackage.oi2.Y(r2)
            le2 r11 = (defpackage.le2) r11
            r3.Z = r0
            r3.d0 = r1
            r3.X = r7
            java.io.Serializable r2 = defpackage.f04.q(r11, r1, r3)
            if (r2 != r4) goto L1cb
            goto L1df
        L1cb:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L1e1
            java.lang.Object r0 = r0.L
            fo2 r0 = (defpackage.fo2) r0
            r3.Z = r9
            r3.d0 = r9
            r3.X = r8
            java.lang.Object r0 = r0.e(r1, r2, r3)
            if (r0 != r4) goto L1e1
        L1df:
            r9 = r4
            goto L1e2
        L1e1:
            r9 = r12
        L1e2:
            return r9
        L1e3:
            b7 r11 = (defpackage.b7) r11
            zb0 r0 = new zb0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r0.<init>(r4, r1, r10)
            java.lang.Object r0 = r11.b(r0, r2)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L1f5
            r12 = r0
        L1f5:
            return r12
    }
}
