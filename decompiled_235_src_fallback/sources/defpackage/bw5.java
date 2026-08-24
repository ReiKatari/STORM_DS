package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bw5  reason: default package */
/* loaded from: classes.dex */
public final class bw5 {
    public final android.content.Context a;
    public final defpackage.wa3 b;

    public bw5(android.content.Context r1, defpackage.wa3 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final java.lang.Object a(defpackage.jt5 r38, me.magnum.melonds.domain.model.ConsoleType r39, me.magnum.melonds.domain.model.MicSource r40, me.magnum.melonds.domain.model.VideoRenderer r41, boolean r42, int r43, me.magnum.melonds.domain.model.VideoFiltering r44, java.lang.String r45, java.lang.String r46, boolean r47, boolean r48, defpackage.s41 r49) {
            r37 = this;
            r0 = r37
            r1 = r38
            r2 = r49
            boolean r3 = r2 instanceof defpackage.aw5
            if (r3 == 0) goto L19
            r3 = r2
            aw5 r3 = (defpackage.aw5) r3
            int r4 = r3.p0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.p0 = r4
            goto L1e
        L19:
            aw5 r3 = new aw5
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.n0
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.p0
            wa3 r6 = r0.b
            r7 = 1
            if (r5 == 0) goto L5f
            if (r5 != r7) goto L57
            boolean r1 = r3.l0
            boolean r4 = r3.k0
            int r5 = r3.m0
            boolean r7 = r3.j0
            java.util.UUID r9 = r3.i0
            me.magnum.melonds.domain.model.MicSource r10 = r3.h0
            a36 r11 = r3.g0
            me.magnum.melonds.domain.model.ConsoleType r12 = r3.f0
            u26 r13 = r3.e0
            java.lang.String r14 = r3.d0
            java.lang.String r15 = r3.Z
            r49 = 0
            me.magnum.melonds.domain.model.VideoFiltering r8 = r3.Y
            r38 = r1
            me.magnum.melonds.domain.model.VideoRenderer r1 = r3.X
            jt5 r3 = r3.R
            defpackage.oi2.Y(r2)
            r16 = r13
            r13 = r11
            r11 = r9
            r9 = r2
            r2 = r38
            goto Lba
        L57:
            r49 = 0
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r49
        L5f:
            r49 = 0
            defpackage.oi2.Y(r2)
            u26 r13 = r1.a
            a36 r11 = r1.b
            java.util.UUID r9 = r1.c
            if (r9 == 0) goto Lde
            r3.R = r1
            r2 = r41
            r3.X = r2
            r5 = r44
            r3.Y = r5
            r8 = r45
            r3.Z = r8
            r10 = r46
            r3.d0 = r10
            r3.e0 = r13
            r12 = r39
            r3.f0 = r12
            r3.g0 = r11
            r14 = r40
            r3.h0 = r14
            r3.i0 = r9
            r15 = r42
            r3.j0 = r15
            r7 = r43
            r3.m0 = r7
            r1 = r47
            r3.k0 = r1
            r1 = r48
            r3.l0 = r1
            r1 = 1
            r3.p0 = r1
            java.lang.Object r1 = r6.d(r9, r3)
            if (r1 != r4) goto La6
            return r4
        La6:
            r3 = r8
            r8 = r5
            r5 = r7
            r7 = r15
            r15 = r3
            r3 = r14
            r14 = r10
            r10 = r3
            r3 = r38
            r4 = r47
            r16 = r13
            r13 = r11
            r11 = r9
            r9 = r1
            r1 = r2
            r2 = r48
        Lba:
            fk3 r9 = (defpackage.fk3) r9
            if (r9 == 0) goto Lc1
            java.lang.String r9 = r9.b
            goto Lc3
        Lc1:
            r9 = r49
        Lc3:
            r20 = r13
            r13 = r9
            r9 = r12
            r12 = r11
            r11 = r10
            r10 = r20
            r20 = r1
            r33 = r2
            r31 = r4
            r24 = r5
            r22 = r7
            r26 = r8
            r30 = r14
            r28 = r15
            r8 = r16
            goto L108
        Lde:
            r12 = r39
            r14 = r40
            r2 = r41
            r15 = r42
            r7 = r43
            r5 = r44
            r8 = r45
            r10 = r46
            r3 = r12
            r12 = r9
            r9 = r3
            r3 = r38
            r31 = r47
            r33 = r48
            r20 = r2
            r26 = r5
            r24 = r7
            r28 = r8
            r30 = r10
            r10 = r11
            r8 = r13
            r11 = r14
            r22 = r15
            r13 = r49
        L108:
            ex6 r1 = r6.g
            java.lang.Object r1 = r1.getValue()
            fk3 r1 = (defpackage.fk3) r1
            java.lang.String r14 = r1.b
            hi2 r1 = r3.d
            boolean r2 = r1 instanceof defpackage.uw5
            if (r2 == 0) goto L123
            bx5 r0 = new bx5
            ax5 r1 = defpackage.ax5.None
            r2 = r49
            r0.<init>(r1, r2, r2)
        L121:
            r15 = r0
            goto L182
        L123:
            boolean r2 = r1 instanceof defpackage.sw5
            if (r2 == 0) goto L150
            ax5 r2 = defpackage.ax5.GbaRom
            sw5 r1 = (defpackage.sw5) r1
            android.net.Uri r4 = r1.o
            android.content.Context r0 = r0.a
            if (r4 == 0) goto L13a
            qi6 r4 = defpackage.zl1.g(r0, r4)
            java.lang.String r4 = r4.i()
            goto L13b
        L13a:
            r4 = 0
        L13b:
            android.net.Uri r1 = r1.p
            if (r1 == 0) goto L148
            qi6 r0 = defpackage.zl1.g(r0, r1)
            java.lang.String r0 = r0.i()
            goto L149
        L148:
            r0 = 0
        L149:
            bx5 r1 = new bx5
            r1.<init>(r2, r4, r0)
            r15 = r1
            goto L182
        L150:
            vw5 r0 = defpackage.vw5.o
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 == 0) goto L161
            bx5 r0 = new bx5
            ax5 r1 = defpackage.ax5.RumblePak
            r2 = 0
            r0.<init>(r1, r2, r2)
            goto L121
        L161:
            r2 = 0
            tw5 r0 = defpackage.tw5.o
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 == 0) goto L172
            bx5 r0 = new bx5
            ax5 r1 = defpackage.ax5.MemoryExpansion
            r0.<init>(r1, r2, r2)
            goto L121
        L172:
            rw5 r0 = defpackage.rw5.o
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 == 0) goto L1bc
            bx5 r0 = new bx5
            ax5 r1 = defpackage.ax5.AnalogInput
            r0.<init>(r1, r2, r2)
            goto L121
        L182:
            java.lang.String r0 = r3.e
            boolean r1 = r3.f
            nx5 r2 = r3.g
            me.magnum.melonds.domain.model.VideoRenderer r4 = r3.i
            java.lang.Boolean r5 = r3.j
            java.lang.Integer r6 = r3.k
            me.magnum.melonds.domain.model.VideoFiltering r7 = r3.l
            r16 = r0
            java.lang.String r0 = r3.m
            r27 = r0
            java.lang.String r0 = r3.n
            r29 = r0
            java.lang.Boolean r0 = r3.o
            r32 = r0
            jq1 r0 = r3.p
            r34 = r0
            java.lang.Boolean r0 = r3.q
            java.lang.Boolean r3 = r3.r
            r25 = r7
            zt5 r7 = new zt5
            r35 = r0
            r17 = r1
            r18 = r2
            r36 = r3
            r19 = r4
            r21 = r5
            r23 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return r7
        L1bc:
            defpackage.i.d()
            r2 = 0
            return r2
    }
}
