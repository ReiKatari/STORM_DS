package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gt5  reason: default package */
/* loaded from: classes.dex */
public final class gt5 extends defpackage.hw6 implements defpackage.eo2 {
    public defpackage.lx5 X;
    public java.lang.String Y;
    public java.lang.String Z;
    public java.lang.String d0;
    public int e0;
    public final /* synthetic */ android.content.Context f0;
    public final /* synthetic */ defpackage.pq5 g0;
    public final /* synthetic */ me.magnum.melonds.database.MelonDatabase h0;
    public final /* synthetic */ defpackage.hp0 i0;
    public final /* synthetic */ defpackage.qa4 j0;
    public final /* synthetic */ defpackage.qa4 k0;
    public final /* synthetic */ defpackage.qa4 l0;
    public final /* synthetic */ defpackage.qa4 m0;
    public final /* synthetic */ defpackage.om6 n0;

    public gt5(android.content.Context r1, defpackage.pq5 r2, me.magnum.melonds.database.MelonDatabase r3, defpackage.hp0 r4, defpackage.qa4 r5, defpackage.qa4 r6, defpackage.qa4 r7, defpackage.qa4 r8, defpackage.om6 r9, defpackage.r41 r10) {
            r0 = this;
            r0.f0 = r1
            r0.g0 = r2
            r0.h0 = r3
            r0.i0 = r4
            r0.j0 = r5
            r0.k0 = r6
            r0.l0 = r7
            r0.m0 = r8
            r0.n0 = r9
            r1 = 2
            r0.<init>(r1, r10)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            gt5 r0 = (defpackage.gt5) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r12, java.lang.Object r13) {
            r11 = this;
            gt5 r0 = new gt5
            qa4 r8 = r11.m0
            om6 r9 = r11.n0
            android.content.Context r1 = r11.f0
            pq5 r2 = r11.g0
            me.magnum.melonds.database.MelonDatabase r3 = r11.h0
            hp0 r4 = r11.i0
            qa4 r5 = r11.j0
            qa4 r6 = r11.k0
            qa4 r7 = r11.l0
            r10 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r24) {
            r23 = this;
            r1 = r23
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r1.e0
            yt1 r8 = defpackage.yt1.A
            hp0 r9 = r1.i0
            r3 = 4
            qa4 r10 = r1.j0
            r4 = 3
            me.magnum.melonds.database.MelonDatabase r5 = r1.h0
            r6 = 0
            r7 = 1
            r11 = 0
            switch(r0) {
                case 0: goto L73;
                case 1: goto L66;
                case 2: goto L59;
                case 3: goto L4c;
                case 4: goto L3d;
                case 5: goto L2f;
                case 6: goto L21;
                case 7: goto L1c;
                default: goto L16;
            }
        L16:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r11
        L1c:
            defpackage.oi2.Y(r24)
            goto L2b8
        L21:
            java.lang.String r0 = r1.d0
            java.lang.String r3 = r1.Z
            java.lang.String r4 = r1.Y
            defpackage.oi2.Y(r24)
            r12 = r3
            r3 = r24
            goto L25b
        L2f:
            java.lang.String r0 = r1.d0
            java.lang.String r3 = r1.Z
            java.lang.String r4 = r1.Y
            defpackage.oi2.Y(r24)
            r12 = r3
            r3 = r24
            goto L235
        L3d:
            java.lang.String r0 = r1.d0
            java.lang.String r3 = r1.Z
            java.lang.String r12 = r1.Y
            defpackage.oi2.Y(r24)
            r13 = r12
            r12 = r3
            r3 = r24
            goto L204
        L4c:
            java.lang.String r0 = r1.d0
            java.lang.String r12 = r1.Z
            java.lang.String r13 = r1.Y
            defpackage.oi2.Y(r24)
            r6 = r24
            goto L1e8
        L59:
            java.lang.String r0 = r1.d0
            java.lang.String r12 = r1.Z
            java.lang.String r13 = r1.Y
            defpackage.oi2.Y(r24)
            r6 = r24
            goto L1c6
        L66:
            java.lang.String r0 = r1.d0
            java.lang.String r12 = r1.Z
            java.lang.String r13 = r1.Y
            lx5 r14 = r1.X
            defpackage.oi2.Y(r24)
            goto L1ae
        L73:
            defpackage.oi2.Y(r24)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10.setValue(r0)
            android.content.Context r0 = r1.f0
            pq5 r12 = r1.g0
            boolean r13 = r12.c()
            if (r13 == 0) goto La6
            java.lang.String r15 = defpackage.vy7.c0(r12)
            java.lang.Long r0 = r12.l
            if (r0 == 0) goto L92
            long r13 = r0.longValue()
            goto L94
        L92:
            r13 = 0
        L94:
            int r0 = (int) r13
            lx5 r14 = new lx5
            java.lang.String r13 = r12.a
            r19 = 1
            r18 = r13
            r16 = r0
            r17 = r13
            r14.<init>(r15, r16, r17, r18, r19)
            goto L14b
        La6:
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L12d
            android.net.Uri r13 = r12.d     // Catch: java.lang.Throwable -> L12d
            java.io.InputStream r0 = r0.openInputStream(r13)     // Catch: java.lang.Throwable -> L12d
            if (r0 != 0) goto Lb3
            goto L11b
        Lb3:
            boolean r13 = r0 instanceof java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L12d
            if (r13 == 0) goto Lbb
            java.io.BufferedInputStream r0 = (java.io.BufferedInputStream) r0     // Catch: java.lang.Throwable -> L12d
            r13 = r0
            goto Lc2
        Lbb:
            java.io.BufferedInputStream r13 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L12d
            r14 = 8192(0x2000, float:1.148E-41)
            r13.<init>(r0, r14)     // Catch: java.lang.Throwable -> L12d
        Lc2:
            r13.mark(r3)     // Catch: java.lang.Throwable -> L12d
            byte[] r0 = new byte[r3]     // Catch: java.lang.Throwable -> L12d
            int r14 = r13.read(r0)     // Catch: java.lang.Throwable -> L12d
            r13.reset()     // Catch: java.lang.Throwable -> L12d
            if (r14 != r3) goto L11d
            r14 = r0[r6]     // Catch: java.lang.Throwable -> L12d
            r15 = 80
            if (r14 != r15) goto L11d
            r0 = r0[r7]     // Catch: java.lang.Throwable -> L12d
            r14 = 75
            if (r0 != r14) goto L11d
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L12d
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L12d
            java.util.zip.ZipEntry r13 = r0.getNextEntry()     // Catch: java.lang.Throwable -> L12d
        Le5:
            if (r13 == 0) goto L11b
            java.lang.String r13 = r13.getName()     // Catch: java.lang.Throwable -> L12d
            r13.getClass()     // Catch: java.lang.Throwable -> L12d
            java.util.Locale r14 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L12d
            java.lang.String r13 = r13.toLowerCase(r14)     // Catch: java.lang.Throwable -> L12d
            r13.getClass()     // Catch: java.lang.Throwable -> L12d
            java.lang.String r14 = ".nds"
            boolean r14 = defpackage.xs6.Y(r13, r14, r6)     // Catch: java.lang.Throwable -> L12d
            if (r14 != 0) goto L115
            java.lang.String r14 = ".dsi"
            boolean r14 = defpackage.xs6.Y(r13, r14, r6)     // Catch: java.lang.Throwable -> L12d
            if (r14 != 0) goto L115
            java.lang.String r14 = ".ids"
            boolean r13 = defpackage.xs6.Y(r13, r14, r6)     // Catch: java.lang.Throwable -> L12d
            if (r13 == 0) goto L110
            goto L115
        L110:
            java.util.zip.ZipEntry r13 = r0.getNextEntry()     // Catch: java.lang.Throwable -> L12d
            goto Le5
        L115:
            lx5 r0 = defpackage.kn2.J(r12, r0)     // Catch: java.lang.Throwable -> L12d
        L119:
            r14 = r0
            goto L14b
        L11b:
            r14 = r11
            goto L14b
        L11d:
            lx5 r0 = defpackage.kn2.J(r12, r13)     // Catch: java.lang.Throwable -> L125
            r13.close()     // Catch: java.lang.Throwable -> L12d
            goto L119
        L125:
            r0 = move-exception
            r14 = r0
            throw r14     // Catch: java.lang.Throwable -> L128
        L128:
            r0 = move-exception
            defpackage.ge7.t(r13, r14)     // Catch: java.lang.Throwable -> L12d
            throw r0     // Catch: java.lang.Throwable -> L12d
        L12d:
            java.lang.String r16 = defpackage.vy7.c0(r12)
            java.lang.String r0 = r12.a
            int r0 = r0.hashCode()
            int r17 = java.lang.Math.abs(r0)
            lx5 r15 = new lx5
            java.lang.String r0 = r12.a
            boolean r13 = r12.h
            r19 = r0
            r18 = r0
            r20 = r13
            r15.<init>(r16, r17, r18, r19, r20)
            r14 = r15
        L14b:
            qa4 r0 = r1.k0
            r0.setValue(r14)
            if (r14 == 0) goto L157
            java.lang.String r0 = r14.b()
            goto L159
        L157:
            java.lang.String r0 = ""
        L159:
            if (r14 == 0) goto L169
            java.lang.String r13 = r14.a
            if (r13 == 0) goto L169
            boolean r15 = defpackage.qs6.v0(r13)
            if (r15 != 0) goto L166
            goto L167
        L166:
            r13 = r11
        L167:
            if (r13 != 0) goto L16d
        L169:
            java.lang.String r13 = defpackage.vy7.c0(r12)
        L16d:
            if (r14 == 0) goto L17d
            java.lang.String r15 = r14.c
            if (r15 == 0) goto L17d
            boolean r16 = defpackage.qs6.v0(r15)
            if (r16 != 0) goto L17a
            goto L17b
        L17a:
            r15 = r11
        L17b:
            if (r15 != 0) goto L181
        L17d:
            java.lang.String r15 = defpackage.hf.k0(r12)
        L181:
            r1.X = r14
            r1.Y = r0
            r1.Z = r13
            r1.d0 = r15
            r1.e0 = r7
            xe1 r12 = defpackage.xk1.a
            de1 r12 = defpackage.de1.L
            r19 = r15
            ja1 r15 = new ja1
            r20 = 0
            me.magnum.melonds.database.MelonDatabase r6 = r1.h0
            r17 = r0
            r18 = r6
            r16 = r13
            r15.<init>(r16, r17, r18, r19, r20)
            java.lang.Object r0 = defpackage.hv.d0(r12, r15, r1)
            if (r0 != r2) goto L1a8
            goto L2ad
        L1a8:
            r12 = r16
            r13 = r17
            r0 = r19
        L1ae:
            if (r14 == 0) goto L1c9
            r1.X = r11
            r1.Y = r13
            r1.Z = r12
            r1.d0 = r0
            r6 = 2
            r1.e0 = r6
            r6 = r9
            h16 r6 = (defpackage.h16) r6
            java.lang.Object r6 = r6.h(r14, r1)
            if (r6 != r2) goto L1c6
            goto L2ad
        L1c6:
            cp2 r6 = (defpackage.cp2) r6
            goto L1ca
        L1c9:
            r6 = r11
        L1ca:
            if (r6 != 0) goto L276
            boolean r6 = defpackage.qs6.v0(r13)
            if (r6 != 0) goto L1eb
            ip2 r6 = r5.v()
            r1.X = r11
            r1.Y = r13
            r1.Z = r12
            r1.d0 = r0
            r1.e0 = r4
            java.lang.Object r6 = r6.b(r13, r1)
            if (r6 != r2) goto L1e8
            goto L2ad
        L1e8:
            lp2 r6 = (defpackage.lp2) r6
            goto L1ec
        L1eb:
            r6 = r11
        L1ec:
            if (r6 != 0) goto L25f
            ip2 r6 = r5.v()
            r1.X = r11
            r1.Y = r13
            r1.Z = r12
            r1.d0 = r0
            r1.e0 = r3
            java.lang.Object r3 = r6.c(r12, r1)
            if (r3 != r2) goto L204
            goto L2ad
        L204:
            r6 = r3
            lp2 r6 = (defpackage.lp2) r6
            if (r6 != 0) goto L25f
            int r3 = r12.length()
            if (r3 < r4) goto L23a
            ip2 r3 = r5.v()
            java.lang.String r4 = defpackage.qs6.S0(r4, r12)
            r1.X = r11
            r1.Y = r13
            r1.Z = r12
            r1.d0 = r0
            r5 = 5
            r1.e0 = r5
            m16 r3 = r3.a
            c70 r5 = new c70
            r6 = 9
            r5.<init>(r4, r6)
            r4 = 0
            java.lang.Object r3 = defpackage.hv.S(r1, r3, r7, r4, r5)
            if (r3 != r2) goto L234
            goto L2ad
        L234:
            r4 = r13
        L235:
            r6 = r3
            lp2 r6 = (defpackage.lp2) r6
        L238:
            r13 = r4
            goto L25f
        L23a:
            ip2 r3 = r5.v()
            r1.X = r11
            r1.Y = r13
            r1.Z = r12
            r1.d0 = r0
            r4 = 6
            r1.e0 = r4
            m16 r3 = r3.a
            c70 r4 = new c70
            r5 = 10
            r4.<init>(r0, r5)
            r5 = 0
            java.lang.Object r3 = defpackage.hv.S(r1, r3, r7, r5, r4)
            if (r3 != r2) goto L25a
            goto L2ad
        L25a:
            r4 = r13
        L25b:
            r6 = r3
            lp2 r6 = (defpackage.lp2) r6
            goto L238
        L25f:
            if (r6 == 0) goto L275
            cp2 r3 = new cp2
            java.lang.Long r4 = r6.a
            java.lang.String r5 = r6.b
            java.lang.String r7 = r6.c
            java.lang.String r6 = r6.d
            r22 = r7
            r7 = r6
            r6 = r22
            r3.<init>(r4, r5, r6, r7, r8)
            r6 = r3
            goto L276
        L275:
            r6 = r11
        L276:
            r17 = r0
            r16 = r12
            r18 = r13
            qa4 r0 = r1.l0
            r0.setValue(r6)
            if (r6 == 0) goto L2ae
            h16 r9 = (defpackage.h16) r9
            le2 r0 = r9.i(r6)
            ft5 r14 = new ft5
            om6 r3 = r1.n0
            qa4 r4 = r1.j0
            me.magnum.melonds.database.MelonDatabase r15 = r1.h0
            qa4 r5 = r1.m0
            r20 = r3
            r21 = r4
            r19 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r1.X = r11
            r1.Y = r11
            r1.Z = r11
            r1.d0 = r11
            r3 = 7
            r1.e0 = r3
            java.lang.Object r0 = r0.b(r14, r1)
            if (r0 != r2) goto L2b8
        L2ad:
            return r2
        L2ae:
            qa4 r0 = r1.m0
            r0.setValue(r8)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.setValue(r0)
        L2b8:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
