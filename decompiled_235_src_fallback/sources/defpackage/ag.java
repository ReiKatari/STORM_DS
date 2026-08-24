package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ag  reason: default package */
/* loaded from: classes.dex */
public final class ag extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ java.lang.Object d0;

    public /* synthetic */ ag(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public /* synthetic */ ag(java.lang.Object r1, java.lang.Object r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Z = r1
            r0.d0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    private final java.lang.Object v(java.lang.Object r4) {
            r3 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            java.lang.Object r4 = r3.Y
            ue1 r4 = (defpackage.ue1) r4
            int r0 = r4.k()
            vv5 r1 = defpackage.vv5.RETRO_ACHIEVEMENTS
            int r1 = r1.getTabIndex()
            r2 = 0
            if (r0 == r1) goto L1d
            java.lang.Object r0 = r3.Z
            qn2 r0 = (defpackage.qn2) r0
            r0.g(r2)
        L1d:
            int r4 = r4.k()
            vv5 r0 = defpackage.vv5.CONFIG
            int r0 = r0.getTabIndex()
            if (r4 == r0) goto L30
            java.lang.Object r3 = r3.d0
            eo2 r3 = (defpackage.eo2) r3
            r3.o(r2, r2)
        L30:
            jg7 r3 = defpackage.jg7.a
            return r3
    }

    private final java.lang.Object x(java.lang.Object r2) {
            r1 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r2)
            java.lang.Object r2 = r1.Y
            me.magnum.melonds.ui.romlist.a r2 = (me.magnum.melonds.ui.romlist.a) r2
            l06 r2 = r2.Y
            if (r2 == 0) goto L1b
            java.lang.Object r0 = r1.Z
            pq5 r0 = (defpackage.pq5) r0
            java.lang.Object r1 = r1.d0
            android.net.Uri r1 = (android.net.Uri) r1
            r2.b(r0, r1)
            jg7 r1 = defpackage.jg7.a
            return r1
        L1b:
            java.lang.String r1 = "romSaveFileManager"
            defpackage.nb3.a0(r1)
            r1 = 0
            throw r1
    }

    private final java.lang.Object z(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = r6.Y
            w61 r0 = (defpackage.w61) r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r7)
            java.lang.Object r7 = r6.Z
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r6.d0
            tz5 r6 = (defpackage.tz5) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ht0.v0(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L20:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r7.next()
            pq5 r1 = (defpackage.pq5) r1
            android.net.Uri r2 = r1.e
            r3 = 0
            if (r2 == 0) goto L65
            java.lang.String r4 = android.provider.DocumentsContract.getDocumentId(r2)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r4 = move-exception
            em5 r5 = new em5
            r5.<init>(r4)
            r4 = r5
        L3d:
            boolean r5 = r4 instanceof defpackage.em5
            if (r5 == 0) goto L43
            r4 = r3
        L43:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L64
            java.lang.String r4 = android.provider.DocumentsContract.getTreeDocumentId(r2)     // Catch: java.lang.Throwable -> L4c
            goto L53
        L4c:
            r4 = move-exception
            em5 r5 = new em5
            r5.<init>(r4)
            r4 = r5
        L53:
            boolean r5 = r4 instanceof defpackage.em5
            if (r5 == 0) goto L59
            goto L5a
        L59:
            r3 = r4
        L5a:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L65
            java.lang.String r2 = r2.getLastPathSegment()
            r3 = r2
            goto L65
        L64:
            r3 = r4
        L65:
            kz5 r1 = defpackage.tz5.e(r6, r1, r3)
            r0.add(r1)
            goto L20
        L6d:
            return r0
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto Lb1;
                case 1: goto La7;
                case 2: goto L9d;
                case 3: goto L93;
                case 4: goto L88;
                case 5: goto L7e;
                case 6: goto L73;
                case 7: goto L68;
                case 8: goto L5e;
                case 9: goto L53;
                case 10: goto L48;
                case 11: goto L3e;
                case 12: goto L34;
                case 13: goto L2a;
                case 14: goto L20;
                case 15: goto L15;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            r2.s(r1)
            return r1
        L15:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L20:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            r2.s(r1)
            return r1
        L2a:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            r2.s(r1)
            return r1
        L34:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            r2.s(r1)
            return r1
        L3e:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            r2.s(r1)
            return r1
        L48:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L53:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L5e:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            r2.s(r1)
            return r1
        L68:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L73:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L7e:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            r2.s(r1)
            return r1
        L88:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L93:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            r2.s(r1)
            return r1
        L9d:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            r2.s(r1)
            return r1
        La7:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            r2.s(r1)
            return r1
        Lb1:
            r41 r2 = r2.q(r4, r3)
            ag r2 = (defpackage.ag) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.X
            java.lang.Object r1 = r10.d0
            java.lang.Object r2 = r10.Z
            switch(r0) {
                case 0: goto L133;
                case 1: goto L120;
                case 2: goto L10d;
                case 3: goto Lfa;
                case 4: goto Le7;
                case 5: goto Ld4;
                case 6: goto Lc1;
                case 7: goto Lb3;
                case 8: goto L9f;
                case 9: goto L90;
                case 10: goto L7c;
                case 11: goto L68;
                case 12: goto L54;
                case 13: goto L40;
                case 14: goto L2c;
                case 15: goto L1d;
                default: goto L9;
            }
        L9:
            ag r3 = new ag
            java.lang.Object r10 = r10.Y
            r4 = r10
            qn2 r4 = (defpackage.qn2) r4
            r5 = r2
            o6 r5 = (defpackage.o6) r5
            r6 = r1
            qa4 r6 = (defpackage.qa4) r6
            r8 = 16
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L1d:
            r8 = r11
            ag r10 = new ag
            java.util.List r2 = (java.util.List) r2
            tz5 r1 = (defpackage.tz5) r1
            r11 = 15
            r10.<init>(r2, r1, r8, r11)
            r10.Y = r12
            return r10
        L2c:
            r8 = r11
            ag r4 = new ag
            java.lang.Object r10 = r10.Y
            r5 = r10
            me.magnum.melonds.ui.romlist.a r5 = (me.magnum.melonds.ui.romlist.a) r5
            r6 = r2
            pq5 r6 = (defpackage.pq5) r6
            r7 = r1
            android.net.Uri r7 = (android.net.Uri) r7
            r9 = 14
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L40:
            r8 = r11
            ag r4 = new ag
            java.lang.Object r10 = r10.Y
            r5 = r10
            ue1 r5 = (defpackage.ue1) r5
            r6 = r2
            qn2 r6 = (defpackage.qn2) r6
            r7 = r1
            eo2 r7 = (defpackage.eo2) r7
            r9 = 13
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L54:
            r8 = r11
            ag r4 = new ag
            java.lang.Object r10 = r10.Y
            r5 = r10
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r5 = (me.magnum.melonds.ui.romdetails.RomDetailsActivity) r5
            r6 = r2
            pq5 r6 = (defpackage.pq5) r6
            r7 = r1
            android.net.Uri r7 = (android.net.Uri) r7
            r9 = 12
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L68:
            r8 = r11
            ag r4 = new ag
            java.lang.Object r10 = r10.Y
            r5 = r10
            ss5 r5 = (defpackage.ss5) r5
            r6 = r2
            qn2 r6 = (defpackage.qn2) r6
            r7 = r1
            ss4 r7 = (defpackage.ss4) r7
            r9 = 11
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L7c:
            r8 = r11
            ag r4 = new ag
            java.lang.Object r10 = r10.Y
            r5 = r10
            java.lang.String r5 = (java.lang.String) r5
            r6 = r2
            ng0 r6 = (defpackage.ng0) r6
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r9 = 10
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L90:
            r8 = r11
            ag r10 = new ag
            zy4 r2 = (defpackage.zy4) r2
            g17 r1 = (defpackage.g17) r1
            r11 = 9
            r10.<init>(r2, r1, r8, r11)
            r10.Y = r12
            return r10
        L9f:
            r8 = r11
            ag r4 = new ag
            java.lang.Object r10 = r10.Y
            r5 = r10
            android.content.Context r5 = (android.content.Context) r5
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            r7 = r1
            qa4 r7 = (defpackage.qa4) r7
            r9 = 8
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        Lb3:
            r8 = r11
            ag r10 = new ag
            sz1 r2 = (defpackage.sz1) r2
            android.net.Uri r1 = (android.net.Uri) r1
            r11 = 7
            r10.<init>(r2, r1, r8, r11)
            r10.Y = r12
            return r10
        Lc1:
            r8 = r11
            ag r4 = new ag
            java.lang.Object r10 = r10.Y
            r5 = r10
            sz1 r5 = (defpackage.sz1) r5
            r6 = r2
            dy1 r6 = (defpackage.dy1) r6
            r7 = r1
            c46 r7 = (defpackage.c46) r7
            r9 = 6
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        Ld4:
            r8 = r11
            ag r4 = new ag
            java.lang.Object r10 = r10.Y
            r5 = r10
            qa4 r5 = (defpackage.qa4) r5
            r6 = r2
            ij1 r6 = (defpackage.ij1) r6
            r7 = r1
            mm6 r7 = (defpackage.mm6) r7
            r9 = 5
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        Le7:
            r8 = r11
            ag r4 = new ag
            java.lang.Object r10 = r10.Y
            r5 = r10
            eb r5 = (defpackage.eb) r5
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r9 = 4
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        Lfa:
            r8 = r11
            ag r4 = new ag
            java.lang.Object r10 = r10.Y
            r5 = r10
            m20 r5 = (defpackage.m20) r5
            r6 = r2
            fk3 r6 = (defpackage.fk3) r6
            r7 = r1
            zn3 r7 = (defpackage.zn3) r7
            r9 = 3
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L10d:
            r8 = r11
            ag r4 = new ag
            java.lang.Object r10 = r10.Y
            r5 = r10
            java.io.File r5 = (java.io.File) r5
            r6 = r2
            kh r6 = (defpackage.kh) r6
            r7 = r1
            byte[] r7 = (byte[]) r7
            r9 = 2
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L120:
            r8 = r11
            ag r4 = new ag
            java.lang.Object r10 = r10.Y
            r5 = r10
            ep2 r5 = (defpackage.ep2) r5
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            r7 = r1
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r7 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r7
            r9 = 1
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L133:
            r8 = r11
            ag r10 = new ag
            fg r2 = (defpackage.fg) r2
            android.net.Uri r1 = (android.net.Uri) r1
            r11 = 0
            r10.<init>(r2, r1, r8, r11)
            r10.Y = r12
            return r10
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r37) {
            r36 = this;
            r1 = r36
            int r0 = r1.X
            r2 = 13
            r5 = 4
            r6 = 3
            r9 = 12
            r10 = -1
            r11 = 10
            r12 = 2
            r13 = 8
            r14 = 1
            r15 = 0
            r16 = 24
            r3 = 0
            jg7 r17 = defpackage.jg7.a
            r18 = 16
            java.lang.Object r4 = r1.Z
            r19 = 0
            java.lang.Object r7 = r1.d0
            switch(r0) {
                case 0: goto L58c;
                case 1: goto L55a;
                case 2: goto L4d0;
                case 3: goto L4b8;
                case 4: goto L389;
                case 5: goto L341;
                case 6: goto L2d1;
                case 7: goto L1e8;
                case 8: goto L1c8;
                case 9: goto L1a7;
                case 10: goto L90;
                case 11: goto L69;
                case 12: goto L4e;
                case 13: goto L49;
                case 14: goto L44;
                case 15: goto L3f;
                default: goto L22;
            }
        L22:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r37)
            qa4 r7 = (defpackage.qa4) r7
            java.lang.Object r0 = r7.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r1.Y
            qn2 r0 = (defpackage.qn2) r0
            o6 r4 = (defpackage.o6) r4
            r0.g(r4)
        L3e:
            return r17
        L3f:
            java.lang.Object r0 = r36.z(r37)
            return r0
        L44:
            java.lang.Object r0 = r36.x(r37)
            return r0
        L49:
            java.lang.Object r0 = r36.v(r37)
            return r0
        L4e:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r37)
            java.lang.Object r0 = r1.Y
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r0 = (me.magnum.melonds.ui.romdetails.RomDetailsActivity) r0
            l06 r0 = r0.B0
            if (r0 == 0) goto L63
            pq5 r4 = (defpackage.pq5) r4
            android.net.Uri r7 = (android.net.Uri) r7
            r0.b(r4, r7)
            return r17
        L63:
            java.lang.String r0 = "romSaveFileManager"
            defpackage.nb3.a0(r0)
            throw r15
        L69:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r37)
            java.lang.Object r0 = r1.Y
            ss5 r0 = (defpackage.ss5) r0
            java.util.List r0 = r0.a
            ss4 r7 = (defpackage.ss4) r7
            int r1 = r7.h()
            java.lang.Object r0 = defpackage.gt0.K0(r1, r0)
            boolean r1 = r0 instanceof defpackage.mr5
            if (r1 == 0) goto L85
            mr5 r0 = (defpackage.mr5) r0
            goto L86
        L85:
            r0 = r15
        L86:
            if (r0 == 0) goto L8a
            pq5 r15 = r0.a
        L8a:
            qn2 r4 = (defpackage.qn2) r4
            r4.g(r15)
            return r17
        L90:
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            ng0 r4 = (defpackage.ng0) r4
            java.util.Map r2 = r4.A
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r37)
            java.lang.Object r1 = r1.Y
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r4 = defpackage.qs6.T0(r1)
            java.lang.String r5 = r4.toString()
            boolean r4 = defpackage.qs6.v0(r5)
            if (r4 == 0) goto Lb0
            goto L1a6
        Lb0:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r5.toLowerCase(r1)
            r1.getClass()
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lc3
            goto L1a6
        Lc3:
            java.lang.String r1 = defpackage.qp2.a(r5, r0)
            boolean r4 = defpackage.nb3.k(r1, r5)
            if (r4 != 0) goto Lcf
            goto L1a6
        Lcf:
            java.lang.String r1 = "\\s+"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            defpackage.qs6.H0(r3)
            java.util.regex.Matcher r6 = r1.matcher(r5)
            boolean r1 = r6.find()
            if (r1 != 0) goto Lee
            java.lang.String r1 = r5.toString()
            java.util.List r1 = defpackage.hf.b0(r1)
            goto L11d
        Lee:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r11)
            r1 = r3
        Lf4:
            int r4 = r6.start()
            java.lang.CharSequence r1 = r5.subSequence(r1, r4)
            java.lang.String r1 = r1.toString()
            r8.add(r1)
            int r1 = r6.end()
            boolean r4 = r6.find()
            if (r4 != 0) goto Lf4
            int r4 = r5.length()
            java.lang.CharSequence r1 = r5.subSequence(r1, r4)
            java.lang.String r1 = r1.toString()
            r8.add(r1)
            r1 = r8
        L11d:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = defpackage.ht0.v0(r1, r11)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L12a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L197
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.CharSequence r6 = defpackage.qs6.T0(r5)
            java.lang.String r6 = r6.toString()
            char[] r7 = new char[r13]
            r7 = {x09e6: FILL_ARRAY_DATA  , data: [44, 46, 33, 63, 58, 59, 34, 39} // fill-array
            java.lang.String r6 = defpackage.qs6.U0(r6, r7)
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r7)
            r6.getClass()
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L193
            int r7 = r5.length()
            int r7 = r7 - r14
        L15d:
            java.lang.String r8 = ",.!:;?\"'"
            if (r10 >= r7) goto L175
            char r9 = r5.charAt(r7)
            boolean r9 = defpackage.qs6.k0(r8, r9)
            if (r9 != 0) goto L172
            int r7 = r7 + 1
            java.lang.String r7 = r5.substring(r7)
            goto L176
        L172:
            int r7 = r7 + (-1)
            goto L15d
        L175:
            r7 = r5
        L176:
            int r9 = r5.length()
            r11 = r3
        L17b:
            if (r11 >= r9) goto L18f
            char r12 = r5.charAt(r11)
            boolean r12 = defpackage.qs6.k0(r8, r12)
            if (r12 != 0) goto L18c
            java.lang.String r5 = r5.substring(r3, r11)
            goto L18f
        L18c:
            int r11 = r11 + 1
            goto L17b
        L18f:
            java.lang.String r5 = defpackage.lb1.m(r5, r6, r7)
        L193:
            r4.add(r5)
            goto L12a
        L197:
            r8 = 0
            r9 = 62
            java.lang.String r5 = " "
            r6 = 0
            r7 = 0
            java.lang.String r1 = defpackage.gt0.P0(r4, r5, r6, r7, r8, r9)
            java.lang.String r1 = defpackage.qp2.a(r1, r0)
        L1a6:
            return r1
        L1a7:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r37)
            java.lang.Object r0 = r1.Y
            w61 r0 = (defpackage.w61) r0
            a71 r1 = defpackage.a71.UNDISPATCHED
            z51 r2 = new z51
            zy4 r4 = (defpackage.zy4) r4
            g17 r7 = (defpackage.g17) r7
            r2.<init>(r4, r7, r15, r14)
            defpackage.hv.L(r0, r15, r1, r2, r14)
            z51 r2 = new z51
            r2.<init>(r4, r7, r15, r12)
            ap6 r0 = defpackage.hv.L(r0, r15, r1, r2, r14)
            return r0
        L1c8:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r37)
            java.lang.Object r0 = r1.Y
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = "Обложка сохранена: "
            java.lang.String r1 = r1.concat(r4)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r3)
            r0.show()
            qa4 r7 = (defpackage.qa4) r7
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.setValue(r0)
            return r17
        L1e8:
            java.lang.Object r0 = r1.Y
            w61 r0 = (defpackage.w61) r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r37)
            sz1 r4 = (defpackage.sz1) r4
            android.net.Uri r7 = (android.net.Uri) r7
            android.content.Context r0 = r4.b     // Catch: java.lang.Throwable -> L295
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L295
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r1 = r0.openFileDescriptor(r7, r1)     // Catch: java.lang.Throwable -> L295
            if (r1 == 0) goto L2a5
            long r21 = r1.getStatSize()     // Catch: java.lang.Throwable -> L243
            int r0 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r0 > 0) goto L214
            r23 = 12
            int r0 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r0 >= 0) goto L214
        L211:
            r14 = r3
            goto L290
        L214:
            byte[] r0 = new byte[r9]     // Catch: java.lang.Throwable -> L243
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L243
            java.io.FileDescriptor r8 = r1.getFileDescriptor()     // Catch: java.lang.Throwable -> L243
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L243
            int r8 = r4.read(r0)     // Catch: java.lang.Throwable -> L297
            r4.close()     // Catch: java.lang.Throwable -> L243
            if (r8 >= r9) goto L229
            goto L211
        L229:
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L243
            r8 = 77
            if (r4 != r8) goto L246
            r4 = r0[r14]     // Catch: java.lang.Throwable -> L243
            r8 = 69
            if (r4 != r8) goto L246
            r4 = r0[r12]     // Catch: java.lang.Throwable -> L243
            r8 = 76
            if (r4 != r8) goto L246
            r4 = r0[r6]     // Catch: java.lang.Throwable -> L243
            r6 = 78
            if (r4 != r6) goto L246
            r4 = r14
            goto L247
        L243:
            r0 = move-exception
            r2 = r0
            goto L29f
        L246:
            r4 = r3
        L247:
            r5 = r0[r5]     // Catch: java.lang.Throwable -> L243
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 5
            r6 = r0[r6]     // Catch: java.lang.Throwable -> L243
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << r13
            r5 = r5 | r6
            r6 = 6
            r6 = r0[r6]     // Catch: java.lang.Throwable -> L243
            r6 = r6 & 255(0xff, float:3.57E-43)
            r8 = 7
            r8 = r0[r8]     // Catch: java.lang.Throwable -> L243
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r13
            r6 = r6 | r8
            r8 = r0[r13]     // Catch: java.lang.Throwable -> L243
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L243
            r23 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r23
            r10 = 9
            r10 = r0[r10]     // Catch: java.lang.Throwable -> L243
            r25 = r11
            long r11 = (long) r10     // Catch: java.lang.Throwable -> L243
            long r10 = r11 & r23
            long r10 = r10 << r13
            long r8 = r8 | r10
            r10 = r0[r25]     // Catch: java.lang.Throwable -> L243
            long r10 = (long) r10     // Catch: java.lang.Throwable -> L243
            long r10 = r10 & r23
            long r10 = r10 << r18
            long r8 = r8 | r10
            r10 = 11
            r0 = r0[r10]     // Catch: java.lang.Throwable -> L243
            long r10 = (long) r0
            long r10 = r10 & r23
            long r10 = r10 << r16
            long r8 = r8 | r10
            if (r4 == 0) goto L211
            if (r5 != r2) goto L211
            if (r6 > 0) goto L211
            int r0 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r0 < 0) goto L290
            int r0 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r0 != 0) goto L211
        L290:
            r1.close()     // Catch: java.lang.Throwable -> L295
            r3 = r14
            goto L2a5
        L295:
            r0 = move-exception
            goto L2aa
        L297:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L29a
        L29a:
            r0 = move-exception
            defpackage.ge7.t(r4, r2)     // Catch: java.lang.Throwable -> L243
            throw r0     // Catch: java.lang.Throwable -> L243
        L29f:
            throw r2     // Catch: java.lang.Throwable -> L2a0
        L2a0:
            r0 = move-exception
            defpackage.ge7.t(r1, r2)     // Catch: java.lang.Throwable -> L295
            throw r0     // Catch: java.lang.Throwable -> L295
        L2a5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L295
            goto L2b0
        L2aa:
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L2b0:
            java.lang.Throwable r1 = defpackage.hm5.a(r0)
            if (r1 == 0) goto L2c9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to validate savestate header for "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "AutoState"
            android.util.Log.w(r3, r2, r1)
        L2c9:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof defpackage.em5
            if (r2 == 0) goto L2d0
            r0 = r1
        L2d0:
            return r0
        L2d1:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r37)
            java.lang.Object r0 = r1.Y
            sz1 r0 = (defpackage.sz1) r0
            yb2 r0 = r0.s
            dy1 r4 = (defpackage.dy1) r4
            pq5 r1 = r4.a
            c46 r7 = (defpackage.c46) r7
            r0.getClass()
            r1.getClass()
            r7.getClass()
            int r2 = r7.a
            boolean r4 = r7.b
            if (r4 != 0) goto L2f2
            goto L32c
        L2f2:
            zl1 r4 = r0.e(r1)
            if (r4 == 0) goto L339
            java.lang.String r5 = r0.a(r1)
            if (r5 == 0) goto L331
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = ".ml"
            r6.append(r5)
            r6.append(r2)
            java.lang.String r5 = r6.toString()
            zl1 r4 = r4.f(r5)
            if (r4 == 0) goto L31b
            r4.d()
        L31b:
            b46 r4 = r0.c
            java.io.File r3 = r4.a(r1, r7, r3)
            if (r3 == 0) goto L329
            r4.c(r3)
            r3.delete()
        L329:
            r0.f(r1, r2, r15)
        L32c:
            java.util.List r0 = r0.c(r1)
            return r0
        L331:
            se0 r0 = new se0
            java.lang.String r1 = "Could not determine ROM file name"
            r0.<init>(r1)
            throw r0
        L339:
            se0 r0 = new se0
            java.lang.String r1 = "Could not create parent directory document"
            r0.<init>(r1)
            throw r0
        L341:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r37)
            java.lang.Object r0 = r1.Y
            qa4 r0 = (defpackage.qa4) r0
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            ij1 r4 = (defpackage.ij1) r4
            mm6 r7 = (defpackage.mm6) r7
            java.util.Iterator r0 = r0.iterator()
        L35a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L388
            java.lang.Object r1 = r0.next()
            sb4 r1 = (defpackage.sb4) r1
            vb4 r2 = r4.b()
            de5 r2 = r2.e
            rp6 r2 = r2.A
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L35a
            boolean r2 = r7.contains(r1)
            if (r2 != 0) goto L35a
            vb4 r2 = r4.b()
            r2.c(r1)
            goto L35a
        L388:
            return r17
        L389:
            java.lang.String r4 = (java.lang.String) r4
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r37)
            java.lang.Object r0 = r1.Y
            eb r0 = (defpackage.eb) r0
            java.lang.Object r1 = r0.L
            xp2 r1 = (defpackage.xp2) r1
            java.lang.Object r1 = r1.c()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = defpackage.qs6.T0(r1)
            java.lang.String r1 = r1.toString()
            int r5 = r1.length()
            if (r5 != 0) goto L3ae
            goto L4b1
        L3ae:
            boolean r5 = defpackage.qs6.v0(r4)
            if (r5 == 0) goto L3b6
            goto L4b1
        L3b6:
            java.lang.Object r5 = r0.R
            xp2 r5 = (defpackage.xp2) r5
            java.lang.Object r5 = r5.c()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r6 = defpackage.qs6.v0(r5)
            if (r6 == 0) goto L3c8
            java.lang.String r5 = "https://api.openai.com/v1/chat/completions"
        L3c8:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.X
            xp2 r6 = (defpackage.xp2) r6
            java.lang.Object r6 = r6.c()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r8 = defpackage.qs6.v0(r6)
            if (r8 == 0) goto L3dc
            java.lang.String r6 = "gpt-4o-mini"
        L3dc:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "You are a professional video game localization expert. Translate the provided in-game dialogue/UI text accurately into natural, immersive "
            java.lang.String r9 = ". Output ONLY the translated text without notes or quotes."
            java.lang.String r7 = defpackage.lb1.A(r8, r7, r9)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = "model"
            r8.put(r9, r6)
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r10 = "system"
            java.lang.String r11 = "role"
            r9.put(r11, r10)
            java.lang.String r10 = "content"
            r9.put(r10, r7)
            r6.put(r9)
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r9 = "user"
            r7.put(r11, r9)
            r7.put(r10, r4)
            r6.put(r7)
            java.lang.String r7 = "messages"
            r8.put(r7, r6)
            java.lang.String r6 = "temperature"
            r11 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            r8.put(r6, r11)
            int r6 = defpackage.mk5.a
            java.lang.String r6 = r8.toString()
            r6.getClass()
            xh5 r7 = defpackage.n34.d
            java.lang.String r7 = "application/json"
            n34 r7 = defpackage.xk2.k(r7)
            lk5 r6 = defpackage.jx2.q(r6, r7)
            s9 r7 = new s9
            r7.<init>(r2)
            r7.I(r5)
            java.lang.String r2 = "Bearer "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "Authorization"
            r7.B(r2, r1)
            java.lang.String r1 = "POST"
            r7.D(r1, r6)
            pa r1 = new pa
            r1.<init>(r7)
            java.lang.Object r0 = r0.B
            xk4 r0 = (defpackage.xk4) r0
            r0.getClass()
            je5 r2 = new je5
            r2.<init>(r0, r1, r3)
            wl5 r1 = r2.e()
            boolean r0 = r1.m0     // Catch: java.lang.Throwable -> L499
            if (r0 != 0) goto L474
        L470:
            r1.close()
            goto L4b1
        L474:
            yl5 r0 = r1.Z     // Catch: java.lang.Throwable -> L499
            if (r0 == 0) goto L470
            java.lang.String r0 = r0.r()     // Catch: java.lang.Throwable -> L499
            if (r0 != 0) goto L47f
            goto L470
        L47f:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L499
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L499
            java.lang.String r0 = "choices"
            org.json.JSONArray r0 = r2.optJSONArray(r0)     // Catch: java.lang.Throwable -> L499
            if (r0 == 0) goto L49c
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L499
            if (r0 == 0) goto L49c
            java.lang.String r2 = "message"
            org.json.JSONObject r15 = r0.optJSONObject(r2)     // Catch: java.lang.Throwable -> L499
            goto L49c
        L499:
            r0 = move-exception
            r2 = r0
            goto L4b2
        L49c:
            if (r15 == 0) goto L470
            java.lang.String r0 = r15.optString(r10)     // Catch: java.lang.Throwable -> L499
            if (r0 == 0) goto L470
            java.lang.CharSequence r0 = defpackage.qs6.T0(r0)     // Catch: java.lang.Throwable -> L499
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L499
            if (r0 != 0) goto L4af
            goto L470
        L4af:
            r4 = r0
            goto L470
        L4b1:
            return r4
        L4b2:
            throw r2     // Catch: java.lang.Throwable -> L4b3
        L4b3:
            r0 = move-exception
            defpackage.ge7.t(r1, r2)
            throw r0
        L4b8:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r37)
            java.lang.Object r0 = r1.Y
            m20 r0 = (defpackage.m20) r0
            fk3 r4 = (defpackage.fk3) r4
            java.util.UUID r1 = r4.a
            r0.g(r1)
            zn3 r7 = (defpackage.zn3) r7
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.g(r0)
            return r17
        L4d0:
            byte[] r7 = (byte[]) r7
            kh r4 = (defpackage.kh) r4
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r37)
            java.lang.Object r0 = r1.Y
            java.io.File r0 = (java.io.File) r0
            java.io.File r1 = r0.getParentFile()
            if (r1 != 0) goto L503
            boolean r1 = r0.exists()
            if (r1 == 0) goto L4ec
            r0.delete()
        L4ec:
            yc1 r0 = defpackage.kh.a(r4, r0)
            f42 r1 = r0.J()
            r1.write(r7)     // Catch: java.lang.Throwable -> L4fb
            r1.close()
            goto L551
        L4fb:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L4fe
        L4fe:
            r0 = move-exception
            defpackage.ge7.t(r1, r2)
            throw r0
        L503:
            boolean r2 = r1.exists()
            if (r2 != 0) goto L50c
            r1.mkdirs()
        L50c:
            java.io.File r2 = new java.io.File
            java.lang.String r3 = ".tmp"
            r2.<init>(r1, r3)
            boolean r1 = r2.exists()
            if (r1 != 0) goto L51c
            r2.mkdirs()
        L51c:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = r0.getName()
            r1.<init>(r2, r3)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L52e
            r1.delete()
        L52e:
            yc1 r2 = defpackage.kh.a(r4, r1)
            f42 r2 = r2.J()
            r2.write(r7)     // Catch: java.lang.Throwable -> L552
            r2.close()
            boolean r2 = r0.exists()
            if (r2 == 0) goto L545
            r0.delete()
        L545:
            boolean r2 = r1.renameTo(r0)
            if (r2 != 0) goto L551
            defpackage.jc2.w0(r1, r0)
            r1.delete()
        L551:
            return r17
        L552:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L555
        L555:
            r0 = move-exception
            defpackage.ge7.t(r2, r1)
            throw r0
        L55a:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r37)
            java.lang.Object r0 = r1.Y
            ep2 r0 = (defpackage.ep2) r0
            java.util.List r1 = r0.b
            me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement[] r2 = new me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement[r3]
            java.lang.Object[] r1 = r1.toArray(r2)
            me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement[] r1 = (me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement[]) r1
            java.util.List r0 = r0.c
            me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard[] r2 = new me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard[r3]
            java.lang.Object[] r0 = r0.toArray(r2)
            me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard[] r0 = (me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard[]) r0
            java.lang.String r4 = (java.lang.String) r4
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r7 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r7
            me.magnum.melonds.MelonEmulator r2 = me.magnum.melonds.MelonEmulator.a
            boolean r0 = r2.setupAchievements(r1, r0, r4, r7)
            if (r0 == 0) goto L584
            return r17
        L584:
            ug r0 = new ug
            java.lang.String r1 = "RetroAchievements runtime setup failed"
            r0.<init>(r1)
            throw r0
        L58c:
            java.lang.String r2 = "_display_name"
            me.magnum.melonds.MelonDSiNand r8 = me.magnum.melonds.MelonDSiNand.a
            r11 = r7
            android.net.Uri r11 = (android.net.Uri) r11
            java.lang.Object r0 = r1.Y
            w61 r0 = (defpackage.w61) r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r37)
            fg r4 = (defpackage.fg) r4
            r0 = r13
            db1 r13 = r4.d
            android.content.Context r15 = r4.a
            r37 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.g
            boolean r0 = r0.get()
            if (r0 != 0) goto L5b1
            t33 r0 = defpackage.t33.NAND_NOT_OPEN
            goto L9a8
        L5b1:
            java.io.File r10 = new java.io.File
            java.io.File r0 = r15.getCacheDir()
            r24 = r7
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r12 = "dsiware_import_"
            java.lang.String r14 = ".nds"
            java.lang.String r6 = defpackage.lb1.i(r6, r12, r14)
            r10.<init>(r0, r6)
            android.content.ContentResolver r0 = r15.getContentResolver()     // Catch: java.lang.Throwable -> L7ba
            java.io.InputStream r7 = r0.openInputStream(r11)     // Catch: java.lang.Throwable -> L7ba
            if (r7 == 0) goto L7b2
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L79a
            r12.<init>(r10)     // Catch: java.lang.Throwable -> L79a
            r0 = 576(0x240, float:8.07E-43)
            byte[] r14 = new byte[r0]     // Catch: java.lang.Throwable -> L637
            r6 = r3
        L5dc:
            if (r6 >= r0) goto L5f7
            int r0 = 576 - r6
            int r0 = r7.read(r14, r6, r0)     // Catch: java.lang.Throwable -> L5ea
            if (r0 <= 0) goto L5f7
            int r6 = r6 + r0
            r0 = 576(0x240, float:8.07E-43)
            goto L5dc
        L5ea:
            r0 = move-exception
            r5 = r3
            r9 = r5
            r26 = r9
            r27 = r26
            r6 = 196612(0x30004, float:2.75512E-40)
            r3 = r0
            goto L78e
        L5f7:
            r0 = 352(0x160, float:4.93E-43)
            if (r6 < r0) goto L786
            r12.write(r14, r3, r6)     // Catch: java.lang.Throwable -> L637
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII     // Catch: java.lang.Throwable -> L637
            r0.getClass()     // Catch: java.lang.Throwable -> L637
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L637
            r3.<init>(r14, r9, r5, r0)     // Catch: java.lang.Throwable -> L637
            r0 = 30
            r0 = r14[r0]     // Catch: java.lang.Throwable -> L637
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r5 = (short) r0     // Catch: java.lang.Throwable -> L637
            r0 = 564(0x234, float:7.9E-43)
            if (r6 < r0) goto L644
            r9 = 560(0x230, float:7.85E-43)
            r9 = r14[r9]     // Catch: java.lang.Throwable -> L637
            r9 = r9 & 255(0xff, float:3.57E-43)
            r27 = 561(0x231, float:7.86E-43)
            r28 = r0
            r0 = r14[r27]     // Catch: java.lang.Throwable -> L637
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r9
            r9 = 562(0x232, float:7.88E-43)
            r9 = r14[r9]     // Catch: java.lang.Throwable -> L637
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 16
            r0 = r0 | r9
            r9 = 563(0x233, float:7.89E-43)
            r9 = r14[r9]     // Catch: java.lang.Throwable -> L637
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 24
            r0 = r0 | r9
            goto L647
        L637:
            r0 = move-exception
            r3 = r0
            r5 = 0
            r6 = 196612(0x30004, float:2.75512E-40)
            r9 = 0
            r26 = 0
            r27 = 0
            goto L78e
        L644:
            r28 = r0
            r0 = 0
        L647:
            r9 = 568(0x238, float:7.96E-43)
            if (r6 < r9) goto L66f
            r27 = r9
            r9 = r14[r28]     // Catch: java.lang.Throwable -> L637
            r9 = r9 & 255(0xff, float:3.57E-43)
            r28 = 565(0x235, float:7.92E-43)
            r29 = r0
            r0 = r14[r28]     // Catch: java.lang.Throwable -> L637
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r9
            r9 = 566(0x236, float:7.93E-43)
            r9 = r14[r9]     // Catch: java.lang.Throwable -> L637
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 16
            r0 = r0 | r9
            r9 = 567(0x237, float:7.95E-43)
            r9 = r14[r9]     // Catch: java.lang.Throwable -> L637
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 24
            r0 = r0 | r9
            goto L674
        L66f:
            r29 = r0
            r27 = r9
            r0 = 0
        L674:
            r9 = 572(0x23c, float:8.02E-43)
            if (r6 < r9) goto L69f
            r28 = r9
            r9 = r14[r27]     // Catch: java.lang.Throwable -> L637
            r9 = r9 & 255(0xff, float:3.57E-43)
            r27 = 569(0x239, float:7.97E-43)
            r30 = r0
            r0 = r14[r27]     // Catch: java.lang.Throwable -> L637
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r9
            r9 = 570(0x23a, float:7.99E-43)
            r9 = r14[r9]     // Catch: java.lang.Throwable -> L637
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 16
            r0 = r0 | r9
            r9 = 571(0x23b, float:8.0E-43)
            r9 = r14[r9]     // Catch: java.lang.Throwable -> L637
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 24
            r0 = r0 | r9
            r9 = r0
        L69c:
            r0 = 576(0x240, float:8.07E-43)
            goto L6a5
        L69f:
            r30 = r0
            r28 = r9
            r9 = 0
            goto L69c
        L6a5:
            if (r6 < r0) goto L6d2
            r0 = r14[r28]     // Catch: java.lang.Throwable -> L637
            r0 = r0 & 255(0xff, float:3.57E-43)
            r26 = 573(0x23d, float:8.03E-43)
            r27 = r0
            r0 = r14[r26]     // Catch: java.lang.Throwable -> L637
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r27 | r0
            r26 = 574(0x23e, float:8.04E-43)
            r27 = r0
            r0 = r14[r26]     // Catch: java.lang.Throwable -> L637
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            r0 = r27 | r0
            r26 = 575(0x23f, float:8.06E-43)
            r27 = r0
            r0 = r14[r26]     // Catch: java.lang.Throwable -> L637
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r0 = r27 | r0
            r26 = r0
            goto L6d4
        L6d2:
            r26 = 0
        L6d4:
            if (r29 == 0) goto L6d9
            r27 = r5
            goto L71b
        L6d9:
            r27 = r5
            r5 = 0
            java.lang.Character r0 = defpackage.qs6.p0(r5, r3)     // Catch: java.lang.Throwable -> L637
            if (r0 == 0) goto L6e8
            char r5 = r0.charValue()     // Catch: java.lang.Throwable -> L637
        L6e6:
            r0 = 1
            goto L6ea
        L6e8:
            r5 = 0
            goto L6e6
        L6ea:
            java.lang.Character r0 = defpackage.qs6.p0(r0, r3)     // Catch: java.lang.Throwable -> L637
            if (r0 == 0) goto L6f5
            char r0 = r0.charValue()     // Catch: java.lang.Throwable -> L637
            goto L6f6
        L6f5:
            r0 = 0
        L6f6:
            int r0 = r0 << 8
            r0 = r0 | r5
            r5 = 2
            java.lang.Character r5 = defpackage.qs6.p0(r5, r3)     // Catch: java.lang.Throwable -> L637
            if (r5 == 0) goto L705
            char r5 = r5.charValue()     // Catch: java.lang.Throwable -> L637
            goto L706
        L705:
            r5 = 0
        L706:
            int r5 = r5 << 16
            r0 = r0 | r5
            r5 = 3
            java.lang.Character r3 = defpackage.qs6.p0(r5, r3)     // Catch: java.lang.Throwable -> L637
            if (r3 == 0) goto L715
            char r5 = r3.charValue()     // Catch: java.lang.Throwable -> L637
            goto L716
        L715:
            r5 = 0
        L716:
            int r3 = r5 << 24
            r0 = r0 | r3
            r29 = r0
        L71b:
            if (r30 == 0) goto L71e
            goto L721
        L71e:
            r30 = 196612(0x30004, float:2.75512E-40)
        L721:
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L783
            r5 = 0
            r0.update(r14, r5, r6)     // Catch: java.lang.Throwable -> L783
            long r5 = (long) r6
            r3 = 65536(0x10000, float:9.1835E-41)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L77e
        L730:
            int r14 = r7.read(r3)     // Catch: java.lang.Throwable -> L77a
            if (r14 <= 0) goto L74c
            r18 = r5
            r5 = 0
            r0.update(r3, r5, r14)     // Catch: java.lang.Throwable -> L743
            r12.write(r3, r5, r14)     // Catch: java.lang.Throwable -> L743
            long r5 = (long) r14     // Catch: java.lang.Throwable -> L743
            long r5 = r18 + r5
            goto L730
        L743:
            r0 = move-exception
        L744:
            r3 = r0
            r19 = r18
        L747:
            r5 = r29
            r6 = r30
            goto L78e
        L74c:
            r18 = r5
            byte[] r3 = r0.digest()     // Catch: java.lang.Throwable -> L743
            r12.close()     // Catch: java.lang.Throwable -> L772
            r7.close()     // Catch: java.lang.Throwable -> L76a
            r35 = r3
            r1 = r17
            r5 = r18
            r3 = r29
            r0 = r30
            r31 = r26
            r32 = r27
            r30 = r9
            goto L7de
        L76a:
            r0 = move-exception
            r19 = r18
            r5 = r29
            r6 = r30
            goto L7c5
        L772:
            r0 = move-exception
            r5 = r3
            r19 = r18
            r6 = r30
            r3 = r0
            goto L7a7
        L77a:
            r0 = move-exception
            r18 = r5
            goto L744
        L77e:
            r0 = move-exception
            r3 = r0
            r19 = r5
            goto L747
        L783:
            r0 = move-exception
            r3 = r0
            goto L747
        L786:
            java.io.EOFException r0 = new java.io.EOFException     // Catch: java.lang.Throwable -> L637
            java.lang.String r3 = "Unable to read selected title header (too small)"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L637
            throw r0     // Catch: java.lang.Throwable -> L637
        L78e:
            throw r3     // Catch: java.lang.Throwable -> L78f
        L78f:
            r0 = move-exception
            defpackage.ge7.t(r12, r3)     // Catch: java.lang.Throwable -> L794
            throw r0     // Catch: java.lang.Throwable -> L794
        L794:
            r0 = move-exception
            r3 = r0
            r29 = r5
            r5 = 0
            goto L7a7
        L79a:
            r0 = move-exception
            r3 = r0
            r5 = 0
            r6 = 196612(0x30004, float:2.75512E-40)
            r9 = 0
            r26 = 0
            r27 = 0
            r29 = 0
        L7a7:
            throw r3     // Catch: java.lang.Throwable -> L7a8
        L7a8:
            r0 = move-exception
            defpackage.ge7.t(r7, r3)     // Catch: java.lang.Throwable -> L7ad
            throw r0     // Catch: java.lang.Throwable -> L7ad
        L7ad:
            r0 = move-exception
            r3 = r5
            r5 = r29
            goto L7c5
        L7b2:
            java.io.EOFException r0 = new java.io.EOFException     // Catch: java.lang.Throwable -> L7ba
            java.lang.String r3 = "Unable to open selected title"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L7ba
            throw r0     // Catch: java.lang.Throwable -> L7ba
        L7ba:
            r0 = move-exception
            r3 = 0
            r5 = 0
            r6 = 196612(0x30004, float:2.75512E-40)
            r9 = 0
            r26 = 0
            r27 = 0
        L7c5:
            l61 r1 = r1.B
            r1.getClass()
            defpackage.yh2.o(r1)
            em5 r1 = new em5
            r1.<init>(r0)
            r35 = r3
            r3 = r5
            r0 = r6
            r5 = r19
            r30 = r9
            r31 = r26
            r32 = r27
        L7de:
            boolean r7 = r1 instanceof defpackage.em5
            java.lang.String r9 = "DSiNandManager"
            if (r7 == 0) goto L7f8
            java.lang.String r0 = "DSiWareImport: failed to read selected title id uri="
            java.lang.String r0 = defpackage.xg6.n(r11, r0)
            java.lang.Throwable r1 = defpackage.hm5.a(r1)
            android.util.Log.w(r9, r0, r1)
            r10.delete()     // Catch: java.lang.Throwable -> L7f4
        L7f4:
            t33 r0 = defpackage.t33.ERROR_OPENING_FILE
            goto L9a8
        L7f8:
            java.lang.String r1 = defpackage.fg.a(r4, r0)
            java.lang.String r7 = defpackage.fg.a(r4, r3)
            java.lang.String r12 = "DSiWareImport: selected category="
            java.lang.String r14 = " size="
            r37 = r10
            java.lang.String r10 = " title="
            java.lang.StringBuilder r1 = defpackage.i61.u(r12, r1, r10, r7, r14)
            r1.append(r5)
            java.lang.String r7 = " uri="
            r1.append(r7)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r9, r1)
            java.util.ArrayList r1 = r8.listTitles()     // Catch: java.lang.Throwable -> L831
            if (r1 == 0) goto L836
            boolean r7 = r1.isEmpty()     // Catch: java.lang.Throwable -> L831
            if (r7 == 0) goto L836
        L82a:
            r28 = r0
            r29 = r3
            r33 = r5
            goto L87a
        L831:
            r0 = move-exception
            r6 = r37
            goto L9a9
        L836:
            int r7 = r1.size()     // Catch: java.lang.Throwable -> L831
            r11 = 0
        L83b:
            if (r11 >= r7) goto L82a
            java.lang.Object r12 = r1.get(r11)     // Catch: java.lang.Throwable -> L831
            int r11 = r11 + 1
            me.magnum.melonds.domain.model.DSiWareTitle r12 = (me.magnum.melonds.domain.model.DSiWareTitle) r12     // Catch: java.lang.Throwable -> L831
            r33 = r5
            long r5 = r12.getTitleId()     // Catch: java.lang.Throwable -> L831
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L831
            if (r5 != r3) goto L877
            java.lang.String r0 = defpackage.fg.a(r4, r0)     // Catch: java.lang.Throwable -> L831
            java.lang.String r1 = defpackage.fg.a(r4, r3)     // Catch: java.lang.Throwable -> L831
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L831
            r2.<init>()     // Catch: java.lang.Throwable -> L831
            java.lang.String r3 = "DSiWareImport: title already imported category="
            r2.append(r3)     // Catch: java.lang.Throwable -> L831
            r2.append(r0)     // Catch: java.lang.Throwable -> L831
            r2.append(r10)     // Catch: java.lang.Throwable -> L831
            r2.append(r1)     // Catch: java.lang.Throwable -> L831
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L831
            android.util.Log.w(r9, r0)     // Catch: java.lang.Throwable -> L831
            t33 r0 = defpackage.t33.TITLE_ALREADY_IMPORTED     // Catch: java.lang.Throwable -> L831
            r37.delete()     // Catch: java.lang.Throwable -> L9a8
            goto L9a8
        L877:
            r5 = r33
            goto L83b
        L87a:
            byte[] r0 = defpackage.mp2.r(r28, r29, r30, r31, r32, r33, r35)     // Catch: java.lang.Throwable -> L831
            r6 = r28
            r5 = r29
            java.lang.String r1 = r37.getAbsolutePath()     // Catch: java.lang.Throwable -> L831
            r1.getClass()     // Catch: java.lang.Throwable -> L831
            int r0 = r8.importTitle(r1, r0)     // Catch: java.lang.Throwable -> L831
            switch(r0) {
                case 0: goto L8a9;
                case 1: goto L8a6;
                case 2: goto L8a3;
                case 3: goto L8a0;
                case 4: goto L89d;
                case 5: goto L89a;
                case 6: goto L897;
                case 7: goto L894;
                default: goto L890;
            }     // Catch: java.lang.Throwable -> L831
        L890:
            t33 r0 = defpackage.t33.UNKNOWN     // Catch: java.lang.Throwable -> L831
        L892:
            r1 = r0
            goto L8ac
        L894:
            t33 r0 = defpackage.t33.DSI_MEMORY_FULL     // Catch: java.lang.Throwable -> L831
            goto L892
        L897:
            t33 r0 = defpackage.t33.TITLE_LIMIT_REACHED     // Catch: java.lang.Throwable -> L831
            goto L892
        L89a:
            t33 r0 = defpackage.t33.INSATLL_FAILED     // Catch: java.lang.Throwable -> L831
            goto L892
        L89d:
            t33 r0 = defpackage.t33.TITLE_ALREADY_IMPORTED     // Catch: java.lang.Throwable -> L831
            goto L892
        L8a0:
            t33 r0 = defpackage.t33.NOT_DSIWARE_TITLE     // Catch: java.lang.Throwable -> L831
            goto L892
        L8a3:
            t33 r0 = defpackage.t33.ERROR_OPENING_FILE     // Catch: java.lang.Throwable -> L831
            goto L892
        L8a6:
            t33 r0 = defpackage.t33.NAND_NOT_OPEN     // Catch: java.lang.Throwable -> L831
            goto L892
        L8a9:
            t33 r0 = defpackage.t33.SUCCESS     // Catch: java.lang.Throwable -> L831
            goto L892
        L8ac:
            java.lang.String r0 = defpackage.fg.a(r4, r6)     // Catch: java.lang.Throwable -> L831
            java.lang.String r3 = defpackage.fg.a(r4, r5)     // Catch: java.lang.Throwable -> L831
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L831
            r4.<init>()     // Catch: java.lang.Throwable -> L831
            java.lang.String r6 = "DSiWareImport: native result="
            r4.append(r6)     // Catch: java.lang.Throwable -> L831
            r4.append(r1)     // Catch: java.lang.Throwable -> L831
            java.lang.String r6 = " category="
            r4.append(r6)     // Catch: java.lang.Throwable -> L831
            r4.append(r0)     // Catch: java.lang.Throwable -> L831
            r4.append(r10)     // Catch: java.lang.Throwable -> L831
            r4.append(r3)     // Catch: java.lang.Throwable -> L831
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L831
            android.util.Log.i(r9, r0)     // Catch: java.lang.Throwable -> L831
            t33 r0 = defpackage.t33.SUCCESS     // Catch: java.lang.Throwable -> L831
            if (r1 != r0) goto L9a2
            r7 = r24
            android.net.Uri r7 = (android.net.Uri) r7     // Catch: java.lang.Throwable -> L831
            qi6 r0 = defpackage.zl1.g(r15, r7)     // Catch: java.lang.Throwable -> L913
            java.lang.String r0 = r0.i()     // Catch: java.lang.Throwable -> L913
            if (r0 != 0) goto L929
            android.content.ContentResolver r6 = r15.getContentResolver()     // Catch: java.lang.Throwable -> L913
            java.lang.String[] r8 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L913
            r10 = 0
            r11 = 0
            r9 = 0
            android.database.Cursor r3 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L913
            if (r3 == 0) goto L91b
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L90b
            if (r0 == 0) goto L90e
            int r0 = r3.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L90b
            r2 = -1
            if (r0 == r2) goto L90e
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Throwable -> L90b
            goto L90f
        L90b:
            r0 = move-exception
            r2 = r0
            goto L915
        L90e:
            r0 = 0
        L90f:
            r3.close()     // Catch: java.lang.Throwable -> L913
            goto L91c
        L913:
            r0 = move-exception
            goto L923
        L915:
            throw r2     // Catch: java.lang.Throwable -> L916
        L916:
            r0 = move-exception
            defpackage.ge7.t(r3, r2)     // Catch: java.lang.Throwable -> L913
            throw r0     // Catch: java.lang.Throwable -> L913
        L91b:
            r0 = 0
        L91c:
            if (r0 != 0) goto L929
            java.lang.String r0 = r7.getLastPathSegment()     // Catch: java.lang.Throwable -> L913
            goto L929
        L923:
            em5 r2 = new em5     // Catch: java.lang.Throwable -> L831
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L831
            r0 = r2
        L929:
            boolean r2 = r0 instanceof defpackage.em5     // Catch: java.lang.Throwable -> L831
            if (r2 == 0) goto L92f
            r0 = 0
        L92f:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L831
            if (r0 == 0) goto L940
            r2 = 46
            java.lang.String r0 = defpackage.qs6.R0(r2, r0, r0)     // Catch: java.lang.Throwable -> L831
            boolean r2 = defpackage.qs6.v0(r0)     // Catch: java.lang.Throwable -> L831
            if (r2 != 0) goto L940
            goto L941
        L940:
            r0 = 0
        L941:
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 == 0) goto L954
            boolean r4 = defpackage.qs6.v0(r0)     // Catch: java.lang.Throwable -> L831
            if (r4 == 0) goto L94f
            goto L954
        L94f:
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L831
            long r6 = r6 & r2
            r13.d(r6, r0)     // Catch: java.lang.Throwable -> L831
        L954:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L974
            r6 = r37
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L96c
            uz5 r0 = defpackage.kn2.K(r4)     // Catch: java.lang.Throwable -> L964
            if (r0 == 0) goto L967
            java.lang.String r0 = r0.d     // Catch: java.lang.Throwable -> L964
            goto L968
        L964:
            r0 = move-exception
            r7 = r0
            goto L96e
        L967:
            r0 = 0
        L968:
            r4.close()     // Catch: java.lang.Throwable -> L96c
            goto L97d
        L96c:
            r0 = move-exception
            goto L977
        L96e:
            throw r7     // Catch: java.lang.Throwable -> L96f
        L96f:
            r0 = move-exception
            defpackage.ge7.t(r4, r7)     // Catch: java.lang.Throwable -> L96c
            throw r0     // Catch: java.lang.Throwable -> L96c
        L974:
            r0 = move-exception
            r6 = r37
        L977:
            em5 r4 = new em5     // Catch: java.lang.Throwable -> L991
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L991
            r0 = r4
        L97d:
            boolean r4 = r0 instanceof defpackage.em5     // Catch: java.lang.Throwable -> L991
            if (r4 == 0) goto L983
            r0 = 0
        L983:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L991
            if (r0 == 0) goto L98f
            boolean r4 = defpackage.qs6.v0(r0)     // Catch: java.lang.Throwable -> L991
            if (r4 != 0) goto L98f
            r15 = r0
            goto L993
        L98f:
            r15 = 0
            goto L993
        L991:
            r0 = move-exception
            goto L9a9
        L993:
            if (r15 == 0) goto L9a4
            boolean r0 = defpackage.qs6.v0(r15)     // Catch: java.lang.Throwable -> L991
            if (r0 == 0) goto L99c
            goto L9a4
        L99c:
            long r4 = (long) r5     // Catch: java.lang.Throwable -> L991
            long r2 = r2 & r4
            r13.e(r2, r15)     // Catch: java.lang.Throwable -> L991
            goto L9a4
        L9a2:
            r6 = r37
        L9a4:
            r6.delete()     // Catch: java.lang.Throwable -> L9a7
        L9a7:
            r0 = r1
        L9a8:
            return r0
        L9a9:
            r6.delete()     // Catch: java.lang.Throwable -> L9ac
        L9ac:
            throw r0
    }
}
