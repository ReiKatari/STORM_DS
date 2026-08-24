package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ct5  reason: default package */
/* loaded from: classes.dex */
public final class ct5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.hp0 Z;
    public final /* synthetic */ android.content.Context d0;
    public final /* synthetic */ defpackage.w61 e0;
    public final /* synthetic */ defpackage.pq5 f0;
    public final /* synthetic */ me.magnum.melonds.database.MelonDatabase g0;
    public final /* synthetic */ defpackage.qa4 h0;
    public final /* synthetic */ defpackage.qa4 i0;
    public final /* synthetic */ defpackage.qa4 j0;
    public final /* synthetic */ defpackage.qa4 k0;
    public final /* synthetic */ defpackage.om6 l0;
    public final /* synthetic */ java.lang.Object m0;

    public ct5(defpackage.hp0 r2, android.net.Uri r3, android.content.Context r4, defpackage.w61 r5, defpackage.pq5 r6, me.magnum.melonds.database.MelonDatabase r7, defpackage.qa4 r8, defpackage.qa4 r9, defpackage.qa4 r10, defpackage.qa4 r11, defpackage.om6 r12, defpackage.r41 r13) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.Z = r2
            r1.m0 = r3
            r1.d0 = r4
            r1.e0 = r5
            r1.f0 = r6
            r1.g0 = r7
            r1.h0 = r8
            r1.i0 = r9
            r1.j0 = r10
            r1.k0 = r11
            r1.l0 = r12
            r2 = 2
            r1.<init>(r2, r13)
            return
    }

    public ct5(defpackage.pq5 r2, me.magnum.melonds.database.MelonDatabase r3, android.content.Context r4, defpackage.hp0 r5, defpackage.qa4 r6, defpackage.qa4 r7, defpackage.w61 r8, defpackage.qa4 r9, defpackage.qa4 r10, defpackage.qa4 r11, defpackage.om6 r12, defpackage.r41 r13) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.f0 = r2
            r1.g0 = r3
            r1.d0 = r4
            r1.Z = r5
            r1.h0 = r6
            r1.i0 = r7
            r1.e0 = r8
            r1.j0 = r9
            r1.k0 = r10
            r1.m0 = r11
            r1.l0 = r12
            r2 = 2
            r1.<init>(r2, r13)
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
            ct5 r2 = (defpackage.ct5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            ct5 r2 = (defpackage.ct5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r18, java.lang.Object r19) {
            r17 = this;
            r0 = r17
            int r1 = r0.X
            java.lang.Object r2 = r0.m0
            switch(r1) {
                case 0: goto L28;
                default: goto L9;
            }
        L9:
            ct5 r3 = new ct5
            r5 = r2
            android.net.Uri r5 = (android.net.Uri) r5
            qa4 r13 = r0.k0
            om6 r14 = r0.l0
            hp0 r4 = r0.Z
            android.content.Context r6 = r0.d0
            w61 r7 = r0.e0
            pq5 r8 = r0.f0
            me.magnum.melonds.database.MelonDatabase r9 = r0.g0
            qa4 r10 = r0.h0
            qa4 r11 = r0.i0
            qa4 r12 = r0.j0
            r15 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r3
        L28:
            ct5 r4 = new ct5
            r14 = r2
            qa4 r14 = (defpackage.qa4) r14
            om6 r15 = r0.l0
            pq5 r5 = r0.f0
            me.magnum.melonds.database.MelonDatabase r6 = r0.g0
            android.content.Context r7 = r0.d0
            hp0 r8 = r0.Z
            qa4 r9 = r0.h0
            qa4 r10 = r0.i0
            w61 r11 = r0.e0
            qa4 r12 = r0.j0
            qa4 r13 = r0.k0
            r16 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r26) {
            r25 = this;
            r1 = r25
            int r0 = r1.X
            jg7 r2 = defpackage.jg7.a
            android.content.Context r3 = r1.d0
            java.lang.Object r4 = r1.m0
            hp0 r5 = r1.Z
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 1
            r8 = 0
            switch(r0) {
                case 0: goto L59;
                default: goto L13;
            }
        L13:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r1.Y
            if (r9 == 0) goto L24
            if (r9 != r7) goto L1f
            defpackage.oi2.Y(r26)
            goto L41
        L1f:
            defpackage.i.m(r6)
            r2 = r8
            goto L58
        L24:
            defpackage.oi2.Y(r26)
            android.net.Uri r4 = (android.net.Uri) r4
            h16 r5 = (defpackage.h16) r5
            r5.l(r4)
            xe1 r4 = defpackage.xk1.a
            jv2 r4 = defpackage.e04.a
            jn2 r5 = new jn2
            r5.<init>(r3, r8, r7)
            r1.Y = r7
            java.lang.Object r3 = defpackage.hv.d0(r4, r5, r1)
            if (r3 != r0) goto L41
            r2 = r0
            goto L58
        L41:
            qa4 r9 = r1.k0
            om6 r11 = r1.l0
            hp0 r4 = r1.Z
            w61 r5 = r1.e0
            qa4 r6 = r1.h0
            qa4 r7 = r1.i0
            qa4 r8 = r1.j0
            pq5 r10 = r1.f0
            android.content.Context r12 = r1.d0
            me.magnum.melonds.database.MelonDatabase r13 = r1.g0
            defpackage.vy7.H(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L58:
            return r2
        L59:
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r1.Y
            qa4 r10 = r1.h0
            r11 = 2
            if (r0 == 0) goto L77
            if (r0 == r7) goto L71
            if (r0 != r11) goto L6b
            defpackage.oi2.Y(r26)
            goto L1ab
        L6b:
            defpackage.i.m(r6)
            r2 = r8
            goto L1ab
        L71:
            defpackage.oi2.Y(r26)
            r0 = r26
            goto Ld1
        L77:
            defpackage.oi2.Y(r26)
            java.lang.Object r0 = r10.getValue()
            lx5 r0 = (defpackage.lx5) r0
            pq5 r6 = r1.f0
            if (r0 == 0) goto L95
            java.lang.String r0 = r0.a
            if (r0 == 0) goto L95
            boolean r12 = defpackage.qs6.v0(r0)
            if (r12 != 0) goto L8f
            goto L90
        L8f:
            r0 = r8
        L90:
            if (r0 != 0) goto L93
            goto L95
        L93:
            r13 = r0
            goto L9a
        L95:
            java.lang.String r0 = defpackage.vy7.c0(r6)
            goto L93
        L9a:
            java.lang.Object r0 = r10.getValue()
            lx5 r0 = (defpackage.lx5) r0
            if (r0 == 0) goto Lb3
            java.lang.String r0 = r0.c
            if (r0 == 0) goto Lb3
            boolean r12 = defpackage.qs6.v0(r0)
            if (r12 != 0) goto Lad
            r8 = r0
        Lad:
            if (r8 != 0) goto Lb0
            goto Lb3
        Lb0:
            r16 = r8
            goto Lb8
        Lb3:
            java.lang.String r8 = defpackage.hf.k0(r6)
            goto Lb0
        Lb8:
            r1.Y = r7
            xe1 r0 = defpackage.xk1.a
            de1 r0 = defpackage.de1.L
            ja1 r12 = new ja1
            r17 = 0
            java.lang.String r14 = ""
            me.magnum.melonds.database.MelonDatabase r15 = r1.g0
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.Object r0 = defpackage.hv.d0(r0, r12, r1)
            if (r0 != r9) goto Ld1
            goto L1aa
        Ld1:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r6 = r0.booleanValue()
            zg5 r12 = new zg5
            r12.<init>()
            java.lang.String r0 = "https://raw.githubusercontent.com/libretro/libretro-database/master/cht/Nintendo%20-%20Nintendo%20DS/Pokemon%20-%20HeartGold%20Version%20(USA).cht"
            java.lang.String r8 = "https://raw.githubusercontent.com/ahezard/nds-rom-info/master/usrcheat.dat"
            java.lang.String[] r0 = new java.lang.String[]{r0, r8}
            java.util.List r0 = defpackage.hf.c0(r0)
            wk4 r8 = new wk4
            r8.<init>()
            r8.i = r7
            r8.j = r7
            r13 = 10
            r8.a(r13)
            r13 = 30
            r8.b(r13)
            xk4 r13 = new xk4
            r13.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
        L104:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L171
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            s9 r14 = new s9     // Catch: java.lang.Throwable -> L16f
            r15 = 13
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L16f
            r14.I(r0)     // Catch: java.lang.Throwable -> L16f
            java.lang.String r0 = "User-Agent"
            java.lang.String r15 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64)"
            r14.B(r0, r15)     // Catch: java.lang.Throwable -> L16f
            pa r0 = new pa     // Catch: java.lang.Throwable -> L16f
            r0.<init>(r14)     // Catch: java.lang.Throwable -> L16f
            je5 r14 = new je5     // Catch: java.lang.Throwable -> L16f
            r15 = 0
            r14.<init>(r13, r0, r15)     // Catch: java.lang.Throwable -> L16f
            wl5 r0 = r14.e()     // Catch: java.lang.Throwable -> L16f
            boolean r14 = r0.m0     // Catch: java.lang.Throwable -> L16f
            if (r14 == 0) goto L104
            yl5 r14 = r0.Z     // Catch: java.lang.Throwable -> L16f
            if (r14 == 0) goto L104
            java.io.File r14 = new java.io.File     // Catch: java.lang.Throwable -> L16f
            java.io.File r15 = r3.getCacheDir()     // Catch: java.lang.Throwable -> L16f
            java.lang.String r11 = "usrcheat_downloaded.dat"
            r14.<init>(r15, r11)     // Catch: java.lang.Throwable -> L16f
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L16f
            r11.<init>(r14)     // Catch: java.lang.Throwable -> L16f
            yl5 r0 = r0.Z     // Catch: java.lang.Throwable -> L167
            r0.getClass()     // Catch: java.lang.Throwable -> L167
            byte[] r0 = r0.e()     // Catch: java.lang.Throwable -> L167
            r11.write(r0)     // Catch: java.lang.Throwable -> L167
            r11.close()     // Catch: java.lang.Throwable -> L16f
            android.net.Uri r0 = android.net.Uri.fromFile(r14)     // Catch: java.lang.Throwable -> L16f
            r0.getClass()     // Catch: java.lang.Throwable -> L16f
            r11 = r5
            h16 r11 = (defpackage.h16) r11     // Catch: java.lang.Throwable -> L16f
            r11.l(r0)     // Catch: java.lang.Throwable -> L16f
            r12.A = r7     // Catch: java.lang.Throwable -> L16f
            goto L171
        L167:
            r0 = move-exception
            r14 = r0
            throw r14     // Catch: java.lang.Throwable -> L16a
        L16a:
            r0 = move-exception
            defpackage.ge7.t(r11, r14)     // Catch: java.lang.Throwable -> L16f
            throw r0     // Catch: java.lang.Throwable -> L16f
        L16f:
            r11 = 2
            goto L104
        L171:
            xe1 r0 = defpackage.xk1.a
            jv2 r0 = defpackage.e04.a
            r20 = r10
            bt5 r10 = new bt5
            r22 = r4
            qa4 r22 = (defpackage.qa4) r22
            om6 r3 = r1.l0
            r24 = 0
            android.content.Context r13 = r1.d0
            qa4 r14 = r1.i0
            w61 r15 = r1.e0
            pq5 r4 = r1.f0
            me.magnum.melonds.database.MelonDatabase r5 = r1.g0
            hp0 r7 = r1.Z
            qa4 r8 = r1.j0
            qa4 r11 = r1.k0
            r23 = r3
            r16 = r4
            r17 = r5
            r18 = r7
            r19 = r8
            r21 = r11
            r3 = 2
            r11 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1.Y = r3
            java.lang.Object r0 = defpackage.hv.d0(r0, r10, r1)
            if (r0 != r9) goto L1ab
        L1aa:
            r2 = r9
        L1ab:
            return r2
    }
}
