package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ja1  reason: default package */
/* loaded from: classes.dex */
public final class ja1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public java.lang.Object Z;
    public java.lang.Object d0;
    public java.lang.Object e0;
    public java.lang.Object f0;
    public java.lang.Object g0;
    public java.lang.Object h0;
    public final /* synthetic */ java.lang.Object i0;

    public ja1(android.content.ContentResolver r2, android.net.Uri r3, defpackage.x71 r4, defpackage.v80 r5, android.content.Context r6, defpackage.r41 r7) {
            r1 = this;
            r0 = 9
            r1.X = r0
            r1.e0 = r2
            r1.f0 = r3
            r1.g0 = r4
            r1.h0 = r5
            r1.i0 = r6
            r2 = 2
            r1.<init>(r2, r7)
            return
    }

    public /* synthetic */ ja1(java.lang.Enum r1, java.lang.Object r2, defpackage.qn2 r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.g0 = r1
            r0.h0 = r2
            r0.i0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public /* synthetic */ ja1(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, defpackage.r41 r8, int r9) {
            r0 = this;
            r0.X = r9
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r0.f0 = r4
            r0.g0 = r5
            r0.h0 = r6
            r0.i0 = r7
            r1 = 2
            r0.<init>(r1, r8)
            return
    }

    public ja1(java.lang.String r2, java.lang.String r3, me.magnum.melonds.database.MelonDatabase r4, java.lang.String r5, defpackage.r41 r6) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.f0 = r2
            r1.g0 = r3
            r1.h0 = r4
            r1.i0 = r5
            r2 = 2
            r1.<init>(r2, r6)
            return
    }

    public ja1(defpackage.la1 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.i0 = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    public ja1(defpackage.sz1 r2, defpackage.yh2 r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 2
            r1.X = r0
            r1.h0 = r2
            r1.i0 = r3
            r1.<init>(r0, r4)
            return
    }

    private final java.lang.Object A(java.lang.Object r9) {
            r8 = this;
            java.lang.Object r0 = r8.h0
            db4 r0 = (defpackage.db4) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r8.Y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L2b
            if (r2 != r3) goto L25
            java.lang.Object r0 = r8.d0
            db4 r0 = (defpackage.db4) r0
            java.lang.Object r1 = r8.Z
            fb4 r1 = (defpackage.fb4) r1
            java.lang.Object r8 = r8.f0
            ab4 r8 = (defpackage.ab4) r8
            defpackage.oi2.Y(r9)     // Catch: java.lang.Throwable -> L22
            goto L90
        L22:
            r9 = move-exception
            goto La9
        L25:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r5
        L2b:
            java.lang.Object r0 = r8.e0
            db4 r0 = (defpackage.db4) r0
            java.lang.Object r2 = r8.d0
            qn2 r2 = (defpackage.qn2) r2
            java.lang.Object r4 = r8.Z
            fb4 r4 = (defpackage.fb4) r4
            java.lang.Object r6 = r8.f0
            ab4 r6 = (defpackage.ab4) r6
            defpackage.oi2.Y(r9)
            r9 = r6
            r6 = r2
            r2 = r9
            r9 = r4
            goto L7c
        L43:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r8.f0
            w61 r9 = (defpackage.w61) r9
            ab4 r2 = new ab4
            java.lang.Object r6 = r8.g0
            xa4 r6 = (defpackage.xa4) r6
            l61 r9 = r9.A()
            vs0 r7 = defpackage.vs0.h0
            j61 r9 = r9.Z(r7)
            r9.getClass()
            rc3 r9 = (defpackage.rc3) r9
            r2.<init>(r6, r9)
            defpackage.db4.a(r0, r2)
            hb4 r9 = r0.b
            java.lang.Object r6 = r8.i0
            qn2 r6 = (defpackage.qn2) r6
            r8.f0 = r2
            r8.Z = r9
            r8.d0 = r6
            r8.e0 = r0
            r8.Y = r4
            java.lang.Object r4 = r9.e(r8)
            if (r4 != r1) goto L7c
            goto L8c
        L7c:
            r8.f0 = r2     // Catch: java.lang.Throwable -> La5
            r8.Z = r9     // Catch: java.lang.Throwable -> La5
            r8.d0 = r0     // Catch: java.lang.Throwable -> La5
            r8.e0 = r5     // Catch: java.lang.Throwable -> La5
            r8.Y = r3     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r6.g(r8)     // Catch: java.lang.Throwable -> La5
            if (r8 != r1) goto L8d
        L8c:
            return r1
        L8d:
            r1 = r9
            r9 = r8
            r8 = r2
        L90:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        L92:
            boolean r2 = r0.compareAndSet(r8, r5)     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L99
            goto L9f
        L99:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 == r8) goto L92
        L9f:
            r1.h(r5)
            return r9
        La3:
            r8 = move-exception
            goto Lb9
        La5:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r2
        La9:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        Lab:
            boolean r2 = r0.compareAndSet(r8, r5)     // Catch: java.lang.Throwable -> La3
            if (r2 != 0) goto Lb8
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 != r8) goto Lb8
            goto Lab
        Lb8:
            throw r9     // Catch: java.lang.Throwable -> La3
        Lb9:
            r1.h(r5)
            throw r8
    }

    private final java.lang.Object v(java.lang.Object r33) {
            r32 = this;
            r6 = r32
            java.lang.Object r0 = r6.g0
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r6.h0
            me.magnum.melonds.database.MelonDatabase r1 = (me.magnum.melonds.database.MelonDatabase) r1
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r6.Y
            r3 = 0
            r4 = 1
            r5 = 3
            r8 = 2
            r9 = 4
            r10 = 0
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L4d
            if (r2 == r8) goto L3d
            if (r2 == r5) goto L29
            if (r2 != r9) goto L23
            defpackage.oi2.Y(r33)
            goto La33
        L23:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r10
        L29:
            java.lang.Object r1 = r6.e0
            lp2 r1 = (defpackage.lp2) r1
            java.lang.Object r2 = r6.d0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r6.Z
            java.lang.String r4 = (java.lang.String) r4
            defpackage.oi2.Y(r33)
            r8 = r1
            r1 = r33
            goto Lfb
        L3d:
            java.lang.Object r2 = r6.d0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r8 = r6.Z
            java.lang.String r8 = (java.lang.String) r8
            defpackage.oi2.Y(r33)
            r11 = r8
            r8 = r33
            goto Lcf
        L4d:
            java.lang.Object r2 = r6.d0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r11 = r6.Z
            java.lang.String r11 = (java.lang.String) r11
            defpackage.oi2.Y(r33)
            r12 = r33
            goto Laf
        L5b:
            defpackage.oi2.Y(r33)
            java.lang.Object r2 = r6.f0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = defpackage.qs6.T0(r2)
            java.lang.String r2 = r2.toString()
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r11)
            r2.getClass()
            java.lang.CharSequence r12 = defpackage.qs6.T0(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r11 = r12.toUpperCase(r11)
            r11.getClass()
            boolean r12 = defpackage.qs6.v0(r2)
            if (r12 == 0) goto L91
            boolean r12 = defpackage.qs6.v0(r11)
            if (r12 == 0) goto L91
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L91:
            boolean r12 = defpackage.qs6.v0(r11)
            if (r12 != 0) goto Lb2
            ip2 r12 = r1.v()
            r6.Z = r2
            r6.d0 = r11
            r6.Y = r4
            java.lang.Object r12 = r12.b(r11, r6)
            if (r12 != r7) goto Laa
        La7:
            r1 = r7
            goto La32
        Laa:
            r31 = r11
            r11 = r2
            r2 = r31
        Laf:
            lp2 r12 = (defpackage.lp2) r12
            goto Lb6
        Lb2:
            r12 = r11
            r11 = r2
            r2 = r12
            r12 = r10
        Lb6:
            if (r12 != 0) goto Ld4
            boolean r12 = defpackage.qs6.v0(r11)
            if (r12 != 0) goto Ld2
            ip2 r12 = r1.v()
            r6.Z = r11
            r6.d0 = r2
            r6.Y = r8
            java.lang.Object r8 = r12.c(r11, r6)
            if (r8 != r7) goto Lcf
            goto La7
        Lcf:
            lp2 r8 = (defpackage.lp2) r8
            goto Ld5
        Ld2:
            r8 = r10
            goto Ld5
        Ld4:
            r8 = r12
        Ld5:
            if (r8 == 0) goto L108
            java.lang.Long r12 = r8.a
            if (r12 == 0) goto L108
            bn0 r1 = r1.u()
            long r12 = r12.longValue()
            r6.Z = r11
            r6.d0 = r2
            r6.e0 = r8
            r6.Y = r5
            m16 r1 = r1.a
            t4 r14 = new t4
            r15 = 6
            r14.<init>(r15, r12)
            java.lang.Object r1 = defpackage.hv.S(r6, r1, r4, r3, r14)
            if (r1 != r7) goto Lfa
            goto La7
        Lfa:
            r4 = r11
        Lfb:
            java.util.List r1 = (java.util.List) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L106
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L106:
            r1 = r4
            goto L109
        L108:
            r1 = r11
        L109:
            java.lang.String r4 = defpackage.qs6.S0(r9, r1)
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toUpperCase(r11)
            r4.getClass()
            java.lang.String r5 = defpackage.qs6.S0(r5, r4)
            java.lang.String r0 = r0.toUpperCase(r11)
            r0.getClass()
            java.lang.String r16 = "IPKS"
            java.lang.String r17 = "IPKI"
            java.lang.String r12 = "IPKE"
            java.lang.String r13 = "IPKJ"
            java.lang.String r14 = "IPKP"
            java.lang.String r15 = "IPKD"
            java.lang.String[] r12 = new java.lang.String[]{r12, r13, r14, r15, r16, r17}
            java.util.List r12 = defpackage.hf.c0(r12)
            boolean r12 = r12.contains(r4)
            yt1 r13 = defpackage.yt1.A
            java.lang.String r14 = "0206D0BC 47084900\n0206D0C0 02000001\nE2000000 00000020\n68004804 49042040\n47086840 00000000\n0206D0C5 00000000"
            java.lang.String r15 = "92247612 00002801\n12247612 00004280\nD0000000 00000000"
            java.lang.String r10 = "Ловля и покемоны"
            java.lang.String r3 = "94000130 FCFF0000\n62111880 00000000\nB2111880 00000000\n10000090 0000270F\nD2000000 00000000"
            java.lang.String r9 = "Максимум очков BP (9,999)"
            r33 = r2
            java.lang.String r2 = "94000130 FCFF0000\n62111880 00000000\nB2111880 00000000\n00000088 000F423F\nD2000000 00000000"
            r18 = r12
            java.lang.String r12 = "Основное и валюта"
            r19 = r13
            java.lang.String r13 = "Максимум денег (999,999$)"
            r20 = r7
            java.lang.String r7 = "Нажмите L+R"
            if (r18 != 0) goto L90d
            r18 = r8
            java.lang.String r8 = "E4B0DC73"
            java.lang.String r6 = "020F423F"
            java.lang.String[] r6 = new java.lang.String[]{r8, r6}
            java.util.List r6 = defpackage.hf.c0(r6)
            boolean r6 = r6.contains(r0)
            if (r6 == 0) goto L16d
            goto L90f
        L16d:
            java.lang.String r25 = "IPGS"
            java.lang.String r26 = "IPGI"
            java.lang.String r21 = "IPGE"
            java.lang.String r22 = "IPGJ"
            java.lang.String r23 = "IPGP"
            java.lang.String r24 = "IPGD"
            java.lang.String[] r6 = new java.lang.String[]{r21, r22, r23, r24, r25, r26}
            java.util.List r6 = defpackage.hf.c0(r6)
            boolean r6 = r6.contains(r4)
            if (r6 == 0) goto L1c7
            td5 r0 = new td5
            sd5 r4 = new sd5
            r4.<init>(r13, r7, r2)
            sd5 r2 = new sd5
            r2.<init>(r9, r7, r3)
            sd5[] r2 = new defpackage.sd5[]{r4, r2}
            java.util.List r2 = defpackage.hf.c0(r2)
            r0.<init>(r12, r2)
            td5 r2 = new td5
            sd5 r3 = new sd5
            java.lang.String r4 = "100% Шанс поимки"
            java.lang.String r5 = "100% успешный захват любым покеболом"
            r3.<init>(r4, r5, r15)
            sd5 r4 = new sd5
            java.lang.String r5 = "Все покемоны Shiny"
            java.lang.String r6 = "Блестящие дикие покемоны"
            r4.<init>(r5, r6, r14)
            sd5[] r3 = new defpackage.sd5[]{r3, r4}
            java.util.List r3 = defpackage.hf.c0(r3)
            r2.<init>(r10, r3)
            td5[] r0 = new defpackage.td5[]{r0, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            goto L965
        L1c7:
            java.lang.String r25 = "CPUS"
            java.lang.String r26 = "CPUI"
            java.lang.String r21 = "CPUE"
            java.lang.String r22 = "CPUJ"
            java.lang.String r23 = "CPUP"
            java.lang.String r24 = "CPUD"
            java.lang.String[] r2 = new java.lang.String[]{r21, r22, r23, r24, r25, r26}
            java.util.List r2 = defpackage.hf.c0(r2)
            boolean r2 = r2.contains(r4)
            java.lang.String r3 = "922467FA 00002801\n122467FA 00004280\nD0000000 00000000"
            java.lang.String r6 = "94000130 FCFF0000\nB2101140 00000000\n00000090 000F423F\nD2000000 00000000"
            if (r2 == 0) goto L231
            td5 r0 = new td5
            sd5 r2 = new sd5
            r2.<init>(r13, r7, r6)
            sd5 r4 = new sd5
            java.lang.String r5 = "Нажмите L+R для наполнения сумки"
            java.lang.String r6 = "94000130 FCFF0000\nB2101140 00000000\nE0000D00 00000040\n03E30001 03E30002\n03E30003 03E30004\nD2000000 00000000"
            java.lang.String r7 = "Все Pokéballs x995"
            r4.<init>(r7, r5, r6)
            sd5[] r2 = new defpackage.sd5[]{r2, r4}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r4 = "Экономика и инвентарь"
            r0.<init>(r4, r2)
            td5 r2 = new td5
            sd5 r4 = new sd5
            java.lang.String r5 = "100% Успешный захват"
            java.lang.String r6 = "Любой шар ловит без осечек"
            r4.<init>(r5, r6, r3)
            sd5 r3 = new sd5
            java.lang.String r5 = "Удерживайте кнопку B во время движения"
            java.lang.String r6 = "120610BE 00000200\n94000130 FDFD0000\n120610BE 00001C20\nD0000000 00000000"
            java.lang.String r7 = "Проход сквозь стены (Hold B)"
            r3.<init>(r7, r5, r6)
            sd5[] r3 = new defpackage.sd5[]{r4, r3}
            java.util.List r3 = defpackage.hf.c0(r3)
            java.lang.String r4 = "Битвы и путешествия"
            r2.<init>(r4, r3)
            td5[] r0 = new defpackage.td5[]{r0, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            goto L965
        L231:
            java.lang.String r27 = "APAP"
            java.lang.String r28 = "APAD"
            java.lang.String r21 = "ADAE"
            java.lang.String r22 = "ADAJ"
            java.lang.String r23 = "ADAP"
            java.lang.String r24 = "ADAD"
            java.lang.String r25 = "APAE"
            java.lang.String r26 = "APAJ"
            java.lang.String[] r2 = new java.lang.String[]{r21, r22, r23, r24, r25, r26, r27, r28}
            java.util.List r2 = defpackage.hf.c0(r2)
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L272
            td5 r0 = new td5
            sd5 r2 = new sd5
            r2.<init>(r13, r7, r6)
            sd5 r4 = new sd5
            java.lang.String r5 = "100% Захват покемонов"
            java.lang.String r6 = "Всегда успешная поимка"
            r4.<init>(r5, r6, r3)
            sd5[] r2 = new defpackage.sd5[]{r2, r4}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Экономика и предметы"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L272:
            java.lang.String r29 = "IRDF"
            java.lang.String r30 = "IRDD"
            java.lang.String r21 = "IRBO"
            java.lang.String r22 = "IRBJ"
            java.lang.String r23 = "IRAE"
            java.lang.String r24 = "IRAJ"
            java.lang.String r25 = "IREO"
            java.lang.String r26 = "IREJ"
            java.lang.String r27 = "IRDO"
            java.lang.String r28 = "IRDJ"
            java.lang.String[] r2 = new java.lang.String[]{r21, r22, r23, r24, r25, r26, r27, r28, r29, r30}
            java.util.List r2 = defpackage.hf.c0(r2)
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L2e8
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r3 = "Нажмите Select"
            java.lang.String r4 = "94000130 FFFB0000\n0223CC0C 0098967F\nD2000000 00000000"
            java.lang.String r5 = "Максимум денег (9,999,999$)"
            r2.<init>(r5, r3, r4)
            sd5 r3 = new sd5
            java.lang.String r4 = "Шаги репела не заканчиваются"
            java.lang.String r5 = "12019688 000000FA"
            java.lang.String r6 = "Бесконечные репелы от покемонов"
            r3.<init>(r6, r4, r5)
            sd5[] r2 = new defpackage.sd5[]{r2, r3}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Деньги и предметы"
            r0.<init>(r3, r2)
            td5 r2 = new td5
            sd5 r3 = new sd5
            java.lang.String r4 = "Любой покебол ловит сразу"
            java.lang.String r5 = "521CA2EC D1062800\n121CA2F0 000046C0\nD2000000 00000000"
            java.lang.String r6 = "100% Захват диких покемонов"
            r3.<init>(r6, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Умножение опыта в 16 раз"
            java.lang.String r6 = "521CC5DC 0C040400\n021CC5E0 00040400\nD2000000 00000000"
            java.lang.String r7 = "Быстрая прокачка (Опыт x16)"
            r4.<init>(r7, r5, r6)
            sd5[] r3 = new defpackage.sd5[]{r3, r4}
            java.util.List r3 = defpackage.hf.c0(r3)
            java.lang.String r4 = "Битвы и опыт"
            r2.<init>(r4, r3)
            td5[] r0 = new defpackage.td5[]{r0, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            goto L965
        L2e8:
            java.lang.String r2 = "BBTE"
            java.lang.String r3 = "BBTJ"
            java.lang.String r6 = "UBTE"
            java.lang.String r8 = "UBTJ"
            java.lang.String[] r2 = new java.lang.String[]{r6, r8, r2, r3}
            java.util.List r2 = defpackage.hf.c0(r2)
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L8d8
            java.lang.String r2 = "08D5D422"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L308
            goto L8d8
        L308:
            java.lang.String r0 = "A2DJ"
            java.lang.String r2 = "A2DP"
            java.lang.String r3 = "A2DE"
            java.lang.String[] r0 = new java.lang.String[]{r3, r0, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            java.lang.String r2 = "Бесконечные жизни (99)"
            if (r0 == 0) goto L352
            td5 r0 = new td5
            sd5 r3 = new sd5
            java.lang.String r4 = "99 жизней Марио"
            java.lang.String r5 = "0208AC64 00000063"
            r3.<init>(r2, r4, r5)
            sd5 r2 = new sd5
            java.lang.String r4 = "Удерживайте L при входе в уровень"
            java.lang.String r5 = "94000130 FDFF0000\n0208AC68 00000003\nD0000000 00000000"
            java.lang.String r6 = "Всегда Мега-Марио (Hold L)"
            r2.<init>(r6, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Таймер зафиксирован"
            java.lang.String r6 = "1208AC70 00000384"
            java.lang.String r7 = "Бесконечное время на уровне"
            r4.<init>(r7, r5, r6)
            sd5[] r2 = new defpackage.sd5[]{r3, r2, r4}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Жизни и форма"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L352:
            java.lang.String r0 = "ASMJ"
            java.lang.String r3 = "ASMP"
            java.lang.String r6 = "ASME"
            java.lang.String[] r0 = new java.lang.String[]{r6, r0, r3}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L39c
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r3 = "Максимальное HP"
            java.lang.String r4 = "0209A7F8 00000800"
            java.lang.String r5 = "Бесконечное здоровье (8 секторов)"
            r2.<init>(r5, r3, r4)
            sd5 r3 = new sd5
            java.lang.String r4 = "Мгновенный доступ ко всем дверям замка"
            java.lang.String r5 = "0209A7FC 00000096"
            java.lang.String r6 = "Все 150 Звезд открыты"
            r3.<init>(r6, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Прыжок в небеса"
            java.lang.String r6 = "94000130 FFFE0000\n0209A810 00003000\nD0000000 00000000"
            java.lang.String r7 = "Супер-высокий прыжок (Hold A)"
            r4.<init>(r7, r5, r6)
            sd5[] r2 = new defpackage.sd5[]{r2, r3, r4}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Марио и звезды"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L39c:
            java.lang.String r0 = "AMCJ"
            java.lang.String r3 = "AMCP"
            java.lang.String r6 = "AMCE"
            java.lang.String[] r0 = new java.lang.String[]{r6, r0, r3}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L3e6
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r3 = "Используйте предмет в любой момент"
            java.lang.String r4 = "02165038 00000008"
            java.lang.String r5 = "Всегда синий панцирь (Blue Spiny Shell)"
            r2.<init>(r5, r3, r4)
            sd5 r3 = new sd5
            java.lang.String r4 = "Ускорение не заканчивается"
            java.lang.String r5 = "02165040 00000003"
            java.lang.String r6 = "Бесконечные грибы ускорения (Mushrooms)"
            r3.<init>(r6, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Полный ростер гонщиков"
            java.lang.String r6 = "02165080 FFFFFFFF"
            java.lang.String r7 = "Все кубки и персонажи открыты"
            r4.<init>(r7, r5, r6)
            sd5[] r2 = new defpackage.sd5[]{r2, r3, r4}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Гонка и предметы"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L3e6:
            java.lang.String r0 = "AZEJ"
            java.lang.String r3 = "AZEP"
            java.lang.String r6 = "AZEE"
            java.lang.String[] r0 = new java.lang.String[]{r6, r0, r3}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            java.lang.String r3 = "Максимум рупий (9999)"
            if (r0 == 0) goto L430
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r4 = "Линк не теряет HP"
            java.lang.String r5 = "02163420 00000040"
            java.lang.String r6 = "Бесконечное здоровье (Все сердца)"
            r2.<init>(r6, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Полный кошелек"
            java.lang.String r6 = "12163424 0000270F"
            r4.<init>(r3, r5, r6)
            sd5 r3 = new sd5
            java.lang.String r5 = "Время в Храме Океана не убывает"
            java.lang.String r6 = "02163430 00003A98"
            java.lang.String r7 = "Бесконечный песок в Песочных часах"
            r3.<init>(r7, r5, r6)
            sd5[] r2 = new defpackage.sd5[]{r2, r4, r3}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Линк и ресурсы"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L430:
            java.lang.String r0 = "BKIJ"
            java.lang.String r6 = "BKIP"
            java.lang.String r8 = "BKIE"
            java.lang.String[] r0 = new java.lang.String[]{r8, r0, r6}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L478
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r4 = "Бессмертие в подземельях"
            java.lang.String r5 = "0215F120 00000040"
            java.lang.String r6 = "Бесконечное HP Линка"
            r2.<init>(r6, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "9999 рупий"
            java.lang.String r6 = "1215F124 0000270F"
            r4.<init>(r3, r5, r6)
            sd5 r3 = new sd5
            java.lang.String r5 = "Поезд не получает урона от бомб и врагов"
            java.lang.String r6 = "0215F130 00000064"
            java.lang.String r7 = "Неуязвимость Поезда"
            r3.<init>(r7, r5, r6)
            sd5[] r2 = new defpackage.sd5[]{r2, r4, r3}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Линк и поезд"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L478:
            java.lang.String r28 = "YC3J"
            java.lang.String r29 = "YC3P"
            java.lang.String r21 = "ACVE"
            java.lang.String r22 = "ACVJ"
            java.lang.String r23 = "ACVP"
            java.lang.String r24 = "BQRE"
            java.lang.String r25 = "BQRJ"
            java.lang.String r26 = "BQRP"
            java.lang.String r27 = "YC3E"
            java.lang.String[] r0 = new java.lang.String[]{r21, r22, r23, r24, r25, r26, r27, r28, r29}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            java.lang.String r3 = "Максимум золота (9,999,999)"
            java.lang.String r6 = "Бесконечное MP"
            if (r0 == 0) goto L4f7
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r4 = "Сома / Джонатан / Шаноа бессмертны"
            java.lang.String r5 = "020F7140 000003E7"
            java.lang.String r7 = "Бесконечное HP"
            r2.<init>(r7, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Магия не истощается"
            java.lang.String r7 = "020F7144 000003E7"
            r4.<init>(r6, r5, r7)
            sd5 r5 = new sd5
            java.lang.String r6 = "Полный баланс"
            java.lang.String r7 = "020F7150 0098967F"
            r5.<init>(r3, r6, r7)
            sd5[] r2 = new defpackage.sd5[]{r2, r4, r5}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Здоровье и магия"
            r0.<init>(r3, r2)
            td5 r2 = new td5
            sd5 r3 = new sd5
            java.lang.String r4 = "Каждый враг отдает свою душу при поражении"
            java.lang.String r5 = "020F7160 00000064"
            java.lang.String r6 = "100% Шанс выпадения Душ / Глифов"
            r3.<init>(r6, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Опыт за врагов умножен на 10"
            java.lang.String r6 = "020F7148 000F4240"
            java.lang.String r7 = "Быстрая прокачка (Опыт x10)"
            r4.<init>(r7, r5, r6)
            sd5[] r3 = new defpackage.sd5[]{r3, r4}
            java.util.List r3 = defpackage.hf.c0(r3)
            java.lang.String r4 = "Души и глифы"
            r2.<init>(r4, r3)
            td5[] r0 = new defpackage.td5[]{r0, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            goto L965
        L4f7:
            java.lang.String r25 = "AGQJ"
            java.lang.String r26 = "AGMJ"
            java.lang.String r21 = "AGQE"
            java.lang.String r22 = "BG3E"
            java.lang.String r23 = "AGME"
            java.lang.String r24 = "BG3J"
            java.lang.String[] r0 = new java.lang.String[]{r21, r22, r23, r24, r25, r26}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L53c
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r3 = "Здоровье защиты никогда не убывает при ошибках"
            java.lang.String r4 = "020EA210 00000005"
            java.lang.String r5 = "Бесконечное доверие судьи (HP)"
            r2.<init>(r5, r3, r4)
            sd5 r3 = new sd5
            java.lang.String r4 = "Мгновенный доступ ко всем уликам"
            java.lang.String r5 = "020EA220 FFFFFFFF"
            java.lang.String r6 = "Все улики в материалах дела"
            r3.<init>(r6, r4, r5)
            sd5[] r2 = new defpackage.sd5[]{r2, r3}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Судебный процесс"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L53c:
            java.lang.String r0 = "AL5J"
            java.lang.String r8 = "CLJJ"
            java.lang.String r9 = "AL5E"
            java.lang.String r10 = "CLJE"
            java.lang.String r12 = "C3JE"
            java.lang.String[] r0 = new java.lang.String[]{r9, r10, r12, r0, r8}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L57f
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r3 = "Бесконечные Hint Coins"
            java.lang.String r4 = "020D8400 000003E7"
            java.lang.String r5 = "Максимум монет подсказок (999)"
            r2.<init>(r5, r3, r4)
            sd5 r3 = new sd5
            java.lang.String r4 = "Всегда высшая оценка за разгадку"
            java.lang.String r5 = "020D8404 0000270F"
            java.lang.String r6 = "Максимум Picarats (Очков)"
            r3.<init>(r6, r4, r5)
            sd5[] r2 = new defpackage.sd5[]{r2, r3}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Головоломки и монеты"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L57f:
            java.lang.String r0 = "YDQE"
            java.lang.String r8 = "YDQJ"
            java.lang.String[] r0 = new java.lang.String[]{r0, r8}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            java.lang.String r8 = "Бесконечное HP отряда"
            if (r0 == 0) goto L5c3
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r4 = "HP команды зафиксировано на максимуме"
            java.lang.String r5 = "020E5100 000003E7"
            r2.<init>(r8, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Магия не заканчивается"
            java.lang.String r7 = "020E5104 000003E7"
            r4.<init>(r6, r5, r7)
            sd5 r5 = new sd5
            java.lang.String r6 = "Полный кошель золота"
            java.lang.String r7 = "020E5110 0098967F"
            r5.<init>(r3, r6, r7)
            sd5[] r2 = new defpackage.sd5[]{r2, r4, r5}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Персонажи и битвы"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L5c3:
            java.lang.String r0 = "YQT"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L899
            java.lang.String r0 = "YQTJ"
            java.lang.String r9 = "YQTP"
            java.lang.String r10 = "YQTE"
            java.lang.String[] r0 = new java.lang.String[]{r10, r0, r9}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L5e1
            goto L899
        L5e1:
            java.lang.String r0 = "CLT"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L863
            java.lang.String r0 = "CLTJ"
            java.lang.String r6 = "CLTP"
            java.lang.String r9 = "CLTE"
            java.lang.String[] r0 = new java.lang.String[]{r9, r0, r6}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L5ff
            goto L863
        L5ff:
            java.lang.String r0 = "ADM"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L82f
            java.lang.String r0 = "ADMJ"
            java.lang.String r6 = "ADMP"
            java.lang.String r9 = "ADME"
            java.lang.String[] r0 = new java.lang.String[]{r9, r0, r6}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L61d
            goto L82f
        L61d:
            java.lang.String r0 = "AWL"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L7f9
            java.lang.String r0 = "AWLJ"
            java.lang.String r6 = "AWLP"
            java.lang.String r7 = "AWLE"
            java.lang.String[] r0 = new java.lang.String[]{r7, r0, r6}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L63b
            goto L7f9
        L63b:
            java.lang.String r0 = "AKW"
            java.lang.String r6 = "AK8"
            java.lang.String r7 = "YAK"
            java.lang.String[] r0 = new java.lang.String[]{r7, r0, r6}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r5)
            java.lang.String r6 = "99 жизней"
            if (r0 != 0) goto L7c7
            java.lang.String r0 = "YAKJ"
            java.lang.String r7 = "YAKP"
            java.lang.String r9 = "YAKE"
            java.lang.String[] r0 = new java.lang.String[]{r9, r0, r7}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L667
            goto L7c7
        L667:
            java.lang.String r0 = "VSN"
            java.lang.String r7 = "VSJ"
            java.lang.String r9 = "ASC"
            java.lang.String[] r0 = new java.lang.String[]{r9, r0, r7}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L795
            java.lang.String r0 = "ASCJ"
            java.lang.String r7 = "ASCP"
            java.lang.String r9 = "ASCE"
            java.lang.String[] r0 = new java.lang.String[]{r9, r0, r7}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L691
            goto L795
        L691:
            java.lang.String r0 = "AMH"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L75f
            java.lang.String r0 = "AMHJ"
            java.lang.String r2 = "AMHP"
            java.lang.String r6 = "AMHE"
            java.lang.String[] r0 = new java.lang.String[]{r6, r0, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L6af
            goto L75f
        L6af:
            java.lang.String r0 = "BO5"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L72d
            java.lang.String r0 = "BO5J"
            java.lang.String r2 = "BO5P"
            java.lang.String r6 = "BO5E"
            java.lang.String[] r0 = new java.lang.String[]{r6, r0, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L6cc
            goto L72d
        L6cc:
            java.lang.String r0 = "BEB"
            java.lang.String r2 = "INA"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L6f7
            java.lang.String r0 = "BEBJ"
            java.lang.String r2 = "BEBP"
            java.lang.String r3 = "BEBE"
            java.lang.String[] r0 = new java.lang.String[]{r3, r0, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L6f3
            goto L6f7
        L6f3:
            r0 = r19
            goto L965
        L6f7:
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r3 = "Футболисты не устают"
            java.lang.String r4 = "02162120 000003E7"
            java.lang.String r5 = "Бесконечное GP (Выносливость)"
            r2.<init>(r5, r3, r4)
            sd5 r3 = new sd5
            java.lang.String r4 = "Любые спецприемы без затрат"
            java.lang.String r5 = "02162124 000003E7"
            java.lang.String r6 = "Бесконечное TP (Очки суперприемов)"
            r3.<init>(r6, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Максимальный баланс"
            java.lang.String r6 = "02162130 0098967F"
            java.lang.String r7 = "Максимум очков Prestige / Бонусных очков"
            r4.<init>(r7, r5, r6)
            sd5[] r2 = new defpackage.sd5[]{r2, r3, r4}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Команда и энергия"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L72d:
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r4 = "Все адепты бессмертны"
            java.lang.String r5 = "02179120 000003E7"
            r2.<init>(r8, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Очки псинергии зафиксированы"
            java.lang.String r6 = "02179124 000003E7"
            java.lang.String r7 = "Бесконечное PP (Псинергия)"
            r4.<init>(r7, r5, r6)
            sd5 r5 = new sd5
            java.lang.String r6 = "Максимум монет"
            java.lang.String r7 = "02179130 0098967F"
            r5.<init>(r3, r6, r7)
            sd5[] r2 = new defpackage.sd5[]{r2, r4, r5}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Адепты и джинны"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L75f:
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r3 = "Самус бессмертна"
            java.lang.String r4 = "020DE110 000003E7"
            java.lang.String r5 = "Бесконечная энергия (Energy Tanks)"
            r2.<init>(r5, r3, r4)
            sd5 r3 = new sd5
            java.lang.String r4 = "Ракеты не истощаются"
            java.lang.String r5 = "020DE120 000003E7"
            java.lang.String r6 = "Бесконечные ракеты (Missiles)"
            r3.<init>(r6, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Максимум патронов"
            java.lang.String r6 = "020DE130 000003E7"
            java.lang.String r7 = "Бесконечные боеприпасы универсального оружия"
            r4.<init>(r7, r5, r6)
            sd5[] r2 = new defpackage.sd5[]{r2, r3, r4}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Самус и оружие"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L795:
            td5 r0 = new td5
            sd5 r3 = new sd5
            java.lang.String r4 = "Кольца не заканчиваются"
            java.lang.String r5 = "02159110 000003E7"
            java.lang.String r7 = "Бесконечные кольца (999 Rings)"
            r3.<init>(r7, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "02159114 00000063"
            r4.<init>(r2, r6, r5)
            sd5 r2 = new sd5
            java.lang.String r5 = "Шкала Boost всегда заполнена"
            java.lang.String r6 = "02159120 00000064"
            java.lang.String r7 = "Постоянное ускорение (Infinite Boost)"
            r2.<init>(r7, r5, r6)
            sd5[] r2 = new defpackage.sd5[]{r3, r4, r2}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Соник и кольца"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L7c7:
            td5 r0 = new td5
            sd5 r3 = new sd5
            java.lang.String r4 = "Кирби не теряет здоровье"
            java.lang.String r5 = "020F3120 00000050"
            java.lang.String r7 = "Бесконечное HP Кирби"
            r3.<init>(r7, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "020F3124 00000063"
            r4.<init>(r2, r6, r5)
            sd5 r2 = new sd5
            java.lang.String r5 = "Неограниченное время парения"
            java.lang.String r6 = "020F3130 00000001"
            java.lang.String r7 = "Постоянный полет"
            r2.<init>(r7, r5, r6)
            sd5[] r2 = new defpackage.sd5[]{r3, r4, r2}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Кирби и жизни"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L7f9:
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r3 = "Бессмертие в боях Сибуи"
            java.lang.String r4 = "02148110 0000270F"
            java.lang.String r5 = "Бесконечное HP Нэку"
            r2.<init>(r5, r3, r4)
            sd5 r3 = new sd5
            java.lang.String r4 = "Максимум йен"
            java.lang.String r5 = "02148120 0098967F"
            java.lang.String r6 = "Максимум денег (9,999,999 Yen)"
            r3.<init>(r6, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Значки готовы к атаке мгновенно"
            java.lang.String r6 = "02148130 00000000"
            java.lang.String r7 = "Быстрая перезарядка всех значков"
            r4.<init>(r7, r5, r6)
            sd5[] r2 = new defpackage.sd5[]{r2, r3, r4}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Нэку и значки"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L82f:
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r3 = "Максимум колокольчиков (Bells 99,999)"
            java.lang.String r4 = "94000130 FCFF0000\n021D88FC 0001869F\nD2000000 00000000"
            r2.<init>(r3, r7, r4)
            sd5 r3 = new sd5
            java.lang.String r4 = "В сумке появляются все золотые инструменты"
            java.lang.String r5 = "021D8910 0000101F"
            java.lang.String r6 = "Все золотые инструменты (Gold Tools)"
            r3.<init>(r6, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Идеальный город"
            java.lang.String r6 = "021D8940 00000000"
            java.lang.String r7 = "Сорняки никогда не растут"
            r4.<init>(r7, r5, r6)
            sd5[] r2 = new defpackage.sd5[]{r2, r3, r4}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Карманы и колокольчики"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L863:
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r3 = "Роксас не получает урона"
            java.lang.String r4 = "021C4510 000003E7"
            java.lang.String r5 = "Бесконечное HP Роксаса"
            r2.<init>(r5, r3, r4)
            sd5 r3 = new sd5
            java.lang.String r4 = "Максимум валюты"
            java.lang.String r5 = "021C4520 0098967F"
            java.lang.String r6 = "Максимум очков Munny (9,999,999)"
            r3.<init>(r6, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Постоянный режим Limit Break"
            java.lang.String r6 = "021C4530 000003E7"
            java.lang.String r7 = "Бесконечный Limit Break"
            r4.<init>(r7, r5, r6)
            sd5[] r2 = new defpackage.sd5[]{r2, r3, r4}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Роксас и магия"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L899:
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r3 = "Все персонажи бессмертны в бою"
            java.lang.String r4 = "0205D120 000003E7"
            java.lang.String r5 = "Бесконечное HP (Кроно и отряд)"
            r2.<init>(r5, r3, r4)
            sd5 r3 = new sd5
            java.lang.String r4 = "Магические очки не убывают"
            java.lang.String r5 = "0205D124 00000063"
            r3.<init>(r6, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Максимальное количество денег"
            java.lang.String r6 = "0205D130 0098967F"
            java.lang.String r7 = "Максимум золота (9,999,999G)"
            r4.<init>(r7, r5, r6)
            sd5 r5 = new sd5
            java.lang.String r6 = "Мгновенное повышение уровня"
            java.lang.String r7 = "0205D140 00000010"
            java.lang.String r8 = "Опыт x16 после боя"
            r5.<init>(r8, r6, r7)
            sd5[] r2 = new defpackage.sd5[]{r2, r3, r4, r5}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Персонажи и золото"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L8d8:
            td5 r0 = new td5
            sd5 r2 = new sd5
            java.lang.String r3 = "Здоровье Бэтмена зафиксировано"
            java.lang.String r4 = "020F0124 00000064"
            java.lang.String r5 = "Бесконечное здоровье (HP)"
            r2.<init>(r5, r3, r4)
            sd5 r3 = new sd5
            java.lang.String r4 = "999,999 очков для гаджетов"
            java.lang.String r5 = "020F0128 000F423F"
            java.lang.String r6 = "Максимум очков улучшений"
            r3.<init>(r6, r4, r5)
            sd5 r4 = new sd5
            java.lang.String r5 = "Полный арсенал Бэтмена"
            java.lang.String r6 = "020F0130 FFFFFFFF"
            java.lang.String r7 = "Все бэтаранги и гаджеты открыты"
            r4.<init>(r7, r5, r6)
            sd5[] r2 = new defpackage.sd5[]{r2, r3, r4}
            java.util.List r2 = defpackage.hf.c0(r2)
            java.lang.String r3 = "Бэтмен и способности"
            r0.<init>(r3, r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            goto L965
        L90d:
            r18 = r8
        L90f:
            td5 r0 = new td5
            sd5 r4 = new sd5
            java.lang.String r5 = "Нажмите L+R для получения максимума денег"
            r4.<init>(r13, r5, r2)
            sd5 r2 = new sd5
            r2.<init>(r9, r7, r3)
            sd5 r3 = new sd5
            java.lang.String r5 = "Бег на B везде, включая здания"
            java.lang.String r6 = "E2000000 00000018\n78012101 22000000\n70014770 00000000\n020409A8 F800F7BF"
            java.lang.String r7 = "Быстрый бег / Speed Shoes"
            r3.<init>(r7, r5, r6)
            sd5[] r2 = new defpackage.sd5[]{r4, r2, r3}
            java.util.List r2 = defpackage.hf.c0(r2)
            r0.<init>(r12, r2)
            td5 r2 = new td5
            sd5 r3 = new sd5
            java.lang.String r4 = "100% Шанс поимки покемона"
            java.lang.String r5 = "Любой Pokéball ловит покемона с 1-го раза"
            r3.<init>(r4, r5, r15)
            sd5 r4 = new sd5
            java.lang.String r5 = "Покемоны всегда Shiny (Блестящие)"
            java.lang.String r6 = "Все дикие покемоны появляются в форме Shiny"
            r4.<init>(r5, r6, r14)
            sd5 r5 = new sd5
            java.lang.String r6 = "Увеличение получаемого опыта в 10 раз"
            java.lang.String r7 = "92244454 00000000\n02244454 0000000A\nD0000000 00000000"
            java.lang.String r8 = "Опыт x10 после битвы"
            r5.<init>(r8, r6, r7)
            sd5[] r3 = new defpackage.sd5[]{r3, r4, r5}
            java.util.List r3 = defpackage.hf.c0(r3)
            r2.<init>(r10, r3)
            td5[] r0 = new defpackage.td5[]{r0, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
        L965:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto La00
            r2 = 4
            java.lang.String r0 = defpackage.qs6.S0(r2, r1)
            java.lang.String r0 = r0.toUpperCase(r11)
            r0.getClass()
            int r3 = r0.length()
            if (r3 < r2) goto L9fc
            java.lang.String r2 = "_"
            r3 = 0
            boolean r2 = defpackage.qs6.j0(r0, r2, r3)
            if (r2 == 0) goto L988
            goto L9fc
        L988:
            java.lang.String r2 = "https://raw.githubusercontent.com/DeadSkullzJr/NDS-i-Cheat-Databases/main/Cheats/"
            java.lang.String r3 = ".txt"
            java.lang.String r2 = defpackage.lb1.A(r2, r0, r3)
            java.lang.String r4 = "https://raw.githubusercontent.com/DeadSkullzJr/NDS-i-Cheat-Databases/master/Cheats/"
            java.lang.String r0 = defpackage.lb1.A(r4, r0, r3)
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}
            java.util.List r0 = defpackage.hf.c0(r0)
            wk4 r2 = new wk4
            r2.<init>()
            r3 = 5
            r2.a(r3)
            r3 = 8
            r2.b(r3)
            xk4 r3 = new xk4
            r3.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L9b6:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9fc
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            s9 r4 = new s9     // Catch: java.lang.Throwable -> L9fa
            r5 = 13
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L9fa
            r4.I(r2)     // Catch: java.lang.Throwable -> L9fa
            java.lang.String r2 = "User-Agent"
            java.lang.String r5 = "STORM_DS_Cheats"
            r4.B(r2, r5)     // Catch: java.lang.Throwable -> L9fa
            pa r2 = new pa     // Catch: java.lang.Throwable -> L9fa
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L9fa
            je5 r4 = new je5     // Catch: java.lang.Throwable -> L9fa
            r5 = 0
            r4.<init>(r3, r2, r5)     // Catch: java.lang.Throwable -> L9b6
            wl5 r2 = r4.e()     // Catch: java.lang.Throwable -> L9b6
            boolean r4 = r2.m0     // Catch: java.lang.Throwable -> L9b6
            if (r4 == 0) goto L9b6
            yl5 r2 = r2.Z     // Catch: java.lang.Throwable -> L9b6
            if (r2 == 0) goto L9b6
            java.lang.String r2 = r2.r()     // Catch: java.lang.Throwable -> L9b6
            java.util.ArrayList r2 = defpackage.cs1.s(r2)     // Catch: java.lang.Throwable -> L9b6
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Throwable -> L9b6
            if (r4 != 0) goto L9b6
            r13 = r2
            goto L9fe
        L9fa:
            r5 = 0
            goto L9b6
        L9fc:
            r13 = r19
        L9fe:
            r4 = r13
            goto La01
        La00:
            r4 = r0
        La01:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto La0a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        La0a:
            r6 = r32
            java.lang.Object r0 = r6.h0
            me.magnum.melonds.database.MelonDatabase r0 = (me.magnum.melonds.database.MelonDatabase) r0
            java.lang.Object r2 = r6.i0
            java.lang.String r2 = (java.lang.String) r2
            if (r18 == 0) goto La1d
            r8 = r18
            java.lang.Long r3 = r8.a
            r5 = r3
        La1b:
            r3 = 0
            goto La1f
        La1d:
            r5 = 0
            goto La1b
        La1f:
            r6.Z = r3
            r6.d0 = r3
            r6.e0 = r3
            r3 = 4
            r6.Y = r3
            r3 = r33
            java.lang.Object r0 = defpackage.cs1.m(r0, r1, r2, r3, r4, r5, r6)
            r1 = r20
            if (r0 != r1) goto La33
        La32:
            return r1
        La33:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
    }

    private final java.lang.Object x(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = r9.h0
            ya3 r0 = (defpackage.ya3) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r9.Y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L2b
            if (r2 != r3) goto L25
            java.lang.Object r0 = r9.d0
            ya3 r0 = (defpackage.ya3) r0
            java.lang.Object r1 = r9.Z
            fb4 r1 = (defpackage.fb4) r1
            java.lang.Object r9 = r9.f0
            xa3 r9 = (defpackage.xa3) r9
            defpackage.oi2.Y(r10)     // Catch: java.lang.Throwable -> L22
            goto Lb7
        L22:
            r10 = move-exception
            goto Ld0
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            return r5
        L2b:
            java.lang.Object r0 = r9.e0
            ya3 r0 = (defpackage.ya3) r0
            java.lang.Object r2 = r9.d0
            qn2 r2 = (defpackage.qn2) r2
            java.lang.Object r4 = r9.Z
            fb4 r4 = (defpackage.fb4) r4
            java.lang.Object r6 = r9.f0
            xa3 r6 = (defpackage.xa3) r6
            defpackage.oi2.Y(r10)
            r10 = r6
            r6 = r2
            r2 = r10
            r10 = r4
            goto La3
        L43:
            defpackage.oi2.Y(r10)
            java.lang.Object r10 = r9.f0
            w61 r10 = (defpackage.w61) r10
            xa3 r2 = new xa3
            java.lang.Object r6 = r9.g0
            xa4 r6 = (defpackage.xa4) r6
            l61 r10 = r10.A()
            vs0 r7 = defpackage.vs0.h0
            j61 r10 = r10.Z(r7)
            r10.getClass()
            rc3 r10 = (defpackage.rc3) r10
            r2.<init>(r6, r10)
            java.util.concurrent.atomic.AtomicReference r10 = r0.a
        L64:
            java.lang.Object r6 = r10.get()
            xa3 r6 = (defpackage.xa3) r6
            if (r6 == 0) goto L7f
            xa4 r7 = r2.a
            xa4 r8 = r6.a
            int r7 = r7.compareTo(r8)
            if (r7 < 0) goto L77
            goto L7f
        L77:
            java.util.concurrent.CancellationException r9 = new java.util.concurrent.CancellationException
            java.lang.String r10 = "Current mutation had a higher priority"
            r9.<init>(r10)
            throw r9
        L7f:
            boolean r7 = r10.compareAndSet(r6, r2)
            if (r7 == 0) goto Le4
            if (r6 == 0) goto L8c
            rc3 r10 = r6.b
            r10.h(r5)
        L8c:
            hb4 r10 = r0.b
            java.lang.Object r6 = r9.i0
            qn2 r6 = (defpackage.qn2) r6
            r9.f0 = r2
            r9.Z = r10
            r9.d0 = r6
            r9.e0 = r0
            r9.Y = r4
            java.lang.Object r4 = r10.e(r9)
            if (r4 != r1) goto La3
            goto Lb3
        La3:
            r9.f0 = r2     // Catch: java.lang.Throwable -> Lcc
            r9.Z = r10     // Catch: java.lang.Throwable -> Lcc
            r9.d0 = r0     // Catch: java.lang.Throwable -> Lcc
            r9.e0 = r5     // Catch: java.lang.Throwable -> Lcc
            r9.Y = r3     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r9 = r6.g(r9)     // Catch: java.lang.Throwable -> Lcc
            if (r9 != r1) goto Lb4
        Lb3:
            return r1
        Lb4:
            r1 = r10
            r10 = r9
            r9 = r2
        Lb7:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> Lca
        Lb9:
            boolean r2 = r0.compareAndSet(r9, r5)     // Catch: java.lang.Throwable -> Lca
            if (r2 == 0) goto Lc0
            goto Lc6
        Lc0:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> Lca
            if (r2 == r9) goto Lb9
        Lc6:
            r1.h(r5)
            return r10
        Lca:
            r9 = move-exception
            goto Le0
        Lcc:
            r9 = move-exception
            r1 = r10
            r10 = r9
            r9 = r2
        Ld0:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> Lca
        Ld2:
            boolean r2 = r0.compareAndSet(r9, r5)     // Catch: java.lang.Throwable -> Lca
            if (r2 != 0) goto Ldf
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> Lca
            if (r2 != r9) goto Ldf
            goto Ld2
        Ldf:
            throw r10     // Catch: java.lang.Throwable -> Lca
        Le0:
            r1.h(r5)
            throw r9
        Le4:
            java.lang.Object r7 = r10.get()
            if (r7 == r6) goto L7f
            goto L64
    }

    private final java.lang.Object z(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = r9.h0
            eb4 r0 = (defpackage.eb4) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r9.Y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L2b
            if (r2 != r3) goto L25
            java.lang.Object r0 = r9.d0
            eb4 r0 = (defpackage.eb4) r0
            java.lang.Object r1 = r9.Z
            fb4 r1 = (defpackage.fb4) r1
            java.lang.Object r9 = r9.f0
            bb4 r9 = (defpackage.bb4) r9
            defpackage.oi2.Y(r10)     // Catch: java.lang.Throwable -> L22
            goto Lbe
        L22:
            r10 = move-exception
            goto Ld7
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            return r5
        L2b:
            java.lang.Object r0 = r9.e0
            eb4 r0 = (defpackage.eb4) r0
            java.lang.Object r2 = r9.d0
            qn2 r2 = (defpackage.qn2) r2
            java.lang.Object r4 = r9.Z
            fb4 r4 = (defpackage.fb4) r4
            java.lang.Object r6 = r9.f0
            bb4 r6 = (defpackage.bb4) r6
            defpackage.oi2.Y(r10)
            r10 = r6
            r6 = r2
            r2 = r10
            r10 = r4
            goto Laa
        L43:
            defpackage.oi2.Y(r10)
            java.lang.Object r10 = r9.f0
            w61 r10 = (defpackage.w61) r10
            bb4 r2 = new bb4
            java.lang.Object r6 = r9.g0
            ya4 r6 = (defpackage.ya4) r6
            l61 r10 = r10.A()
            vs0 r7 = defpackage.vs0.h0
            j61 r10 = r10.Z(r7)
            r10.getClass()
            rc3 r10 = (defpackage.rc3) r10
            r2.<init>(r6, r10)
            java.util.concurrent.atomic.AtomicReference r10 = r0.a
        L64:
            java.lang.Object r6 = r10.get()
            bb4 r6 = (defpackage.bb4) r6
            if (r6 == 0) goto L7f
            ya4 r7 = r2.a
            ya4 r8 = r6.a
            int r7 = r7.compareTo(r8)
            if (r7 < 0) goto L77
            goto L7f
        L77:
            java.util.concurrent.CancellationException r9 = new java.util.concurrent.CancellationException
            java.lang.String r10 = "Current mutation had a higher priority"
            r9.<init>(r10)
            throw r9
        L7f:
            boolean r7 = r10.compareAndSet(r6, r2)
            if (r7 == 0) goto Leb
            if (r6 == 0) goto L93
            rc3 r10 = r6.b
            za4 r6 = new za4
            java.lang.String r7 = "Mutation interrupted"
            r6.<init>(r7)
            r10.h(r6)
        L93:
            hb4 r10 = r0.b
            java.lang.Object r6 = r9.i0
            qn2 r6 = (defpackage.qn2) r6
            r9.f0 = r2
            r9.Z = r10
            r9.d0 = r6
            r9.e0 = r0
            r9.Y = r4
            java.lang.Object r4 = r10.e(r9)
            if (r4 != r1) goto Laa
            goto Lba
        Laa:
            r9.f0 = r2     // Catch: java.lang.Throwable -> Ld3
            r9.Z = r10     // Catch: java.lang.Throwable -> Ld3
            r9.d0 = r0     // Catch: java.lang.Throwable -> Ld3
            r9.e0 = r5     // Catch: java.lang.Throwable -> Ld3
            r9.Y = r3     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r9 = r6.g(r9)     // Catch: java.lang.Throwable -> Ld3
            if (r9 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            r1 = r10
            r10 = r9
            r9 = r2
        Lbe:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> Ld1
        Lc0:
            boolean r2 = r0.compareAndSet(r9, r5)     // Catch: java.lang.Throwable -> Ld1
            if (r2 == 0) goto Lc7
            goto Lcd
        Lc7:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> Ld1
            if (r2 == r9) goto Lc0
        Lcd:
            r1.h(r5)
            return r10
        Ld1:
            r9 = move-exception
            goto Le7
        Ld3:
            r9 = move-exception
            r1 = r10
            r10 = r9
            r9 = r2
        Ld7:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> Ld1
        Ld9:
            boolean r2 = r0.compareAndSet(r9, r5)     // Catch: java.lang.Throwable -> Ld1
            if (r2 != 0) goto Le6
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> Ld1
            if (r2 != r9) goto Le6
            goto Ld9
        Le6:
            throw r10     // Catch: java.lang.Throwable -> Ld1
        Le7:
            r1.h(r5)
            throw r9
        Leb:
            java.lang.Object r7 = r10.get()
            if (r7 == r6) goto L7f
            goto L64
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L8e;
                case 1: goto L7f;
                case 2: goto L70;
                case 3: goto L61;
                case 4: goto L52;
                case 5: goto L43;
                case 6: goto L34;
                case 7: goto L25;
                case 8: goto L16;
                default: goto L7;
            }
        L7:
            ne2 r3 = (defpackage.ne2) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ja1 r2 = (defpackage.ja1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ja1 r2 = (defpackage.ja1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L25:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ja1 r2 = (defpackage.ja1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L34:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ja1 r2 = (defpackage.ja1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L43:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ja1 r2 = (defpackage.ja1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L52:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ja1 r2 = (defpackage.ja1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L61:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ja1 r2 = (defpackage.ja1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L70:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ja1 r2 = (defpackage.ja1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L7f:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ja1 r2 = (defpackage.ja1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L8e:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ja1 r2 = (defpackage.ja1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r14, java.lang.Object r15) {
            r13 = this;
            int r0 = r13.X
            java.lang.Object r1 = r13.i0
            switch(r0) {
                case 0: goto L10c;
                case 1: goto Lf2;
                case 2: goto Le5;
                case 3: goto Lbe;
                case 4: goto L97;
                case 5: goto L6d;
                case 6: goto L56;
                case 7: goto L3f;
                case 8: goto L27;
                default: goto L7;
            }
        L7:
            ja1 r2 = new ja1
            java.lang.Object r0 = r13.e0
            r3 = r0
            android.content.ContentResolver r3 = (android.content.ContentResolver) r3
            java.lang.Object r0 = r13.f0
            r4 = r0
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.Object r0 = r13.g0
            r5 = r0
            x71 r5 = (defpackage.x71) r5
            java.lang.Object r13 = r13.h0
            r6 = r13
            v80 r6 = (defpackage.v80) r6
            r7 = r1
            android.content.Context r7 = (android.content.Context) r7
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2.d0 = r15
            return r2
        L27:
            r7 = r14
            ja1 r3 = new ja1
            java.lang.Object r14 = r13.g0
            r4 = r14
            ya4 r4 = (defpackage.ya4) r4
            java.lang.Object r13 = r13.h0
            r5 = r13
            eb4 r5 = (defpackage.eb4) r5
            r6 = r1
            qn2 r6 = (defpackage.qn2) r6
            r8 = 8
            r3.<init>(r4, r5, r6, r7, r8)
            r3.f0 = r15
            return r3
        L3f:
            r7 = r14
            ja1 r3 = new ja1
            java.lang.Object r14 = r13.g0
            r4 = r14
            xa4 r4 = (defpackage.xa4) r4
            java.lang.Object r13 = r13.h0
            r5 = r13
            db4 r5 = (defpackage.db4) r5
            r6 = r1
            qn2 r6 = (defpackage.qn2) r6
            r8 = 7
            r3.<init>(r4, r5, r6, r7, r8)
            r3.f0 = r15
            return r3
        L56:
            r7 = r14
            ja1 r3 = new ja1
            java.lang.Object r14 = r13.g0
            r4 = r14
            xa4 r4 = (defpackage.xa4) r4
            java.lang.Object r13 = r13.h0
            r5 = r13
            ya3 r5 = (defpackage.ya3) r5
            r6 = r1
            qn2 r6 = (defpackage.qn2) r6
            r8 = 6
            r3.<init>(r4, r5, r6, r7, r8)
            r3.f0 = r15
            return r3
        L6d:
            r7 = r14
            ja1 r3 = new ja1
            java.lang.Object r14 = r13.Z
            r4 = r14
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r14 = r13.d0
            r5 = r14
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r14 = r13.e0
            r6 = r14
            pq5 r6 = (defpackage.pq5) r6
            java.lang.Object r14 = r13.f0
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r13.g0
            r8 = r15
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r13 = r13.h0
            r9 = r13
            android.graphics.Bitmap$CompressFormat r9 = (android.graphics.Bitmap.CompressFormat) r9
            r10 = r1
            qa4 r10 = (defpackage.qa4) r10
            r12 = 5
            r11 = r7
            r7 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        L97:
            r7 = r14
            ja1 r3 = new ja1
            java.lang.Object r14 = r13.Z
            r4 = r14
            w42 r4 = (defpackage.w42) r4
            java.lang.Object r14 = r13.d0
            r5 = r14
            z23 r5 = (defpackage.z23) r5
            java.lang.Object r6 = r13.e0
            java.lang.Object r14 = r13.f0
            fo4 r14 = (defpackage.fo4) r14
            java.lang.Object r15 = r13.g0
            r8 = r15
            k62 r8 = (defpackage.k62) r8
            java.lang.Object r13 = r13.h0
            r9 = r13
            c44 r9 = (defpackage.c44) r9
            r10 = r1
            re5 r10 = (defpackage.re5) r10
            r12 = 4
            r11 = r7
            r7 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        Lbe:
            r7 = r14
            ja1 r3 = new ja1
            java.lang.Object r14 = r13.Z
            r4 = r14
            w42 r4 = (defpackage.w42) r4
            java.lang.Object r14 = r13.d0
            r5 = r14
            dh5 r5 = (defpackage.dh5) r5
            java.lang.Object r14 = r13.e0
            r6 = r14
            dh5 r6 = (defpackage.dh5) r6
            java.lang.Object r14 = r13.f0
            z23 r14 = (defpackage.z23) r14
            java.lang.Object r8 = r13.g0
            java.lang.Object r13 = r13.h0
            r9 = r13
            dh5 r9 = (defpackage.dh5) r9
            r10 = r1
            k62 r10 = (defpackage.k62) r10
            r12 = 3
            r11 = r7
            r7 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        Le5:
            r7 = r14
            ja1 r14 = new ja1
            java.lang.Object r13 = r13.h0
            sz1 r13 = (defpackage.sz1) r13
            yh2 r1 = (defpackage.yh2) r1
            r14.<init>(r13, r1, r7)
            return r14
        Lf2:
            r7 = r14
            ja1 r3 = new ja1
            java.lang.Object r14 = r13.f0
            r4 = r14
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r14 = r13.g0
            r5 = r14
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r13 = r13.h0
            r6 = r13
            me.magnum.melonds.database.MelonDatabase r6 = (me.magnum.melonds.database.MelonDatabase) r6
            java.lang.String r1 = (java.lang.String) r1
            r8 = r7
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L10c:
            r7 = r14
            ja1 r13 = new ja1
            la1 r1 = (defpackage.la1) r1
            r13.<init>(r1, r7)
            return r13
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r22) {
            r21 = this;
            r5 = r21
            int r0 = r5.X
            r3 = 8
            r4 = 6
            r6 = 5
            r7 = 7
            r8 = 3
            r9 = 4
            r10 = 2
            r11 = 0
            r12 = 1
            switch(r0) {
                case 0: goto L633;
                case 1: goto L62e;
                case 2: goto L3b0;
                case 3: goto L362;
                case 4: goto L26b;
                case 5: goto Lc5;
                case 6: goto Lc0;
                case 7: goto Lbb;
                case 8: goto Lb6;
                default: goto L11;
            }
        L11:
            java.lang.Object r0 = r5.g0
            r1 = r0
            x71 r1 = (defpackage.x71) r1
            java.lang.Object r0 = r5.e0
            r2 = r0
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r5.Y
            if (r3 == 0) goto L4d
            if (r3 == r12) goto L3e
            if (r3 != r10) goto L36
            java.lang.Object r3 = r5.Z
            n80 r3 = (defpackage.n80) r3
            java.lang.Object r4 = r5.d0
            ne2 r4 = (defpackage.ne2) r4
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L33
            r6 = r3
            r3 = r4
            goto L64
        L33:
            r0 = move-exception
            goto Lb2
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r13 = 0
            goto Lb1
        L3e:
            java.lang.Object r3 = r5.Z
            n80 r3 = (defpackage.n80) r3
            java.lang.Object r4 = r5.d0
            ne2 r4 = (defpackage.ne2) r4
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L33
            r6 = r4
            r4 = r22
            goto L76
        L4d:
            defpackage.oi2.Y(r22)
            java.lang.Object r3 = r5.d0
            ne2 r3 = (defpackage.ne2) r3
            java.lang.Object r4 = r5.f0
            android.net.Uri r4 = (android.net.Uri) r4
            r2.registerContentObserver(r4, r11, r1)
            java.lang.Object r4 = r5.h0     // Catch: java.lang.Throwable -> L33
            v80 r4 = (defpackage.v80) r4     // Catch: java.lang.Throwable -> L33
            n80 r6 = new n80     // Catch: java.lang.Throwable -> L33
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L33
        L64:
            r5.d0 = r3     // Catch: java.lang.Throwable -> L33
            r5.Z = r6     // Catch: java.lang.Throwable -> L33
            r5.Y = r12     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r6.b(r5)     // Catch: java.lang.Throwable -> L33
            if (r4 != r0) goto L71
            goto La4
        L71:
            r20 = r6
            r6 = r3
            r3 = r20
        L76:
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L33
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto Lac
            r3.c()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r5.i0     // Catch: java.lang.Throwable -> L33
            android.content.Context r4 = (android.content.Context) r4     // Catch: java.lang.Throwable -> L33
            ja4 r7 = defpackage.uv7.a     // Catch: java.lang.Throwable -> L33
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L33
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r4 = android.provider.Settings.Global.getFloat(r4, r7, r8)     // Catch: java.lang.Throwable -> L33
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L33
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L33
            r5.d0 = r6     // Catch: java.lang.Throwable -> L33
            r5.Z = r3     // Catch: java.lang.Throwable -> L33
            r5.Y = r10     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r6.a(r7, r5)     // Catch: java.lang.Throwable -> L33
            if (r4 != r0) goto La6
        La4:
            r13 = r0
            goto Lb1
        La6:
            r20 = r6
            r6 = r3
            r3 = r20
            goto L64
        Lac:
            r2.unregisterContentObserver(r1)
            jg7 r13 = defpackage.jg7.a
        Lb1:
            return r13
        Lb2:
            r2.unregisterContentObserver(r1)
            throw r0
        Lb6:
            java.lang.Object r0 = r21.z(r22)
            return r0
        Lbb:
            java.lang.Object r0 = r21.A(r22)
            return r0
        Lc0:
            java.lang.Object r0 = r21.x(r22)
            return r0
        Lc5:
            java.lang.String r0 = "/STORM_DS"
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r5.e0
            pq5 r2 = (defpackage.pq5) r2
            java.lang.Object r3 = r5.Z
            r15 = r3
            android.content.Context r15 = (android.content.Context) r15
            java.lang.String r3 = "STORM_"
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r5.Y
            r7 = 0
            if (r6 == 0) goto Lff
            if (r6 == r12) goto Lf9
            if (r6 == r10) goto Lef
            if (r6 == r8) goto Lef
            if (r6 != r9) goto Le7
            defpackage.oi2.Y(r22)
            goto Lf2
        Le7:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r13 = 0
            goto L26a
        Lef:
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> Lf5
        Lf2:
            r13 = r1
            goto L26a
        Lf5:
            r0 = move-exception
            r2 = r7
            goto L255
        Lf9:
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> Lf5
            r6 = r22
            goto L139
        Lff:
            defpackage.oi2.Y(r22)
            pa r6 = new pa     // Catch: java.lang.Throwable -> Lf5
            r6.<init>(r15)     // Catch: java.lang.Throwable -> Lf5
            pe5 r6 = r6.g()     // Catch: java.lang.Throwable -> Lf5
            x23 r13 = new x23     // Catch: java.lang.Throwable -> Lf5
            r13.<init>(r15)     // Catch: java.lang.Throwable -> Lf5
            java.lang.Object r14 = r5.d0     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> Lf5
            if (r14 != 0) goto L11a
            z23 r14 = defpackage.hf.m0(r15, r2)     // Catch: java.lang.Throwable -> Lf5
        L11a:
            r13.c = r14     // Catch: java.lang.Throwable -> Lf5
            java.lang.Boolean r14 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lf5
            r13.m = r14     // Catch: java.lang.Throwable -> Lf5
            z23 r13 = r13.a()     // Catch: java.lang.Throwable -> Lf5
            r5.Y = r12     // Catch: java.lang.Throwable -> Lf5
            xe1 r14 = defpackage.xk1.a     // Catch: java.lang.Throwable -> Lf5
            jv2 r14 = defpackage.e04.a     // Catch: java.lang.Throwable -> Lf5
            jv2 r14 = r14.Y     // Catch: java.lang.Throwable -> Lf5
            ne5 r9 = new ne5     // Catch: java.lang.Throwable -> Lf5
            r9.<init>(r6, r13, r7, r12)     // Catch: java.lang.Throwable -> Lf5
            java.lang.Object r6 = defpackage.hv.d0(r14, r9, r5)     // Catch: java.lang.Throwable -> Lf5
            if (r6 != r4) goto L139
            goto L269
        L139:
            boolean r9 = r6 instanceof defpackage.bu6     // Catch: java.lang.Throwable -> Lf5
            if (r9 == 0) goto L140
            bu6 r6 = (defpackage.bu6) r6     // Catch: java.lang.Throwable -> Lf5
            goto L141
        L140:
            r6 = r7
        L141:
            if (r6 == 0) goto L146
            android.graphics.drawable.Drawable r6 = r6.a     // Catch: java.lang.Throwable -> Lf5
            goto L147
        L146:
            r6 = r7
        L147:
            boolean r9 = r6 instanceof android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Throwable -> Lf5
            if (r9 == 0) goto L14e
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6     // Catch: java.lang.Throwable -> Lf5
            goto L14f
        L14e:
            r6 = r7
        L14f:
            if (r6 == 0) goto L156
            android.graphics.Bitmap r6 = r6.getBitmap()     // Catch: java.lang.Throwable -> Lf5
            goto L157
        L156:
            r6 = r7
        L157:
            if (r6 != 0) goto L16c
            xe1 r0 = defpackage.xk1.a     // Catch: java.lang.Throwable -> Lf5
            jv2 r0 = defpackage.e04.a     // Catch: java.lang.Throwable -> Lf5
            jn2 r2 = new jn2     // Catch: java.lang.Throwable -> Lf5
            r2.<init>(r15, r7, r11)     // Catch: java.lang.Throwable -> Lf5
            r5.Y = r10     // Catch: java.lang.Throwable -> Lf5
            java.lang.Object r0 = defpackage.hv.d0(r0, r2, r5)     // Catch: java.lang.Throwable -> Lf5
            if (r0 != r4) goto Lf2
            goto L269
        L16c:
            java.lang.String r2 = defpackage.hf.k0(r2)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r9 = "[^a-zA-Z0-9_-]"
            java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r9)     // Catch: java.lang.Throwable -> Lf5
            r9.getClass()     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r10 = "_"
            r2.getClass()     // Catch: java.lang.Throwable -> Lf5
            java.util.regex.Matcher r2 = r9.matcher(r2)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r2 = r2.replaceAll(r10)     // Catch: java.lang.Throwable -> Lf5
            r2.getClass()     // Catch: java.lang.Throwable -> Lf5
            java.lang.Object r9 = r5.f0     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> Lf5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf5
            r10.<init>(r3)     // Catch: java.lang.Throwable -> Lf5
            r10.append(r2)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r2 = "_cover."
            r10.append(r2)     // Catch: java.lang.Throwable -> Lf5
            r10.append(r9)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> Lf5
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lf5
            r9 = 29
            if (r3 < r9) goto L1e8
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Lf5
            r3.<init>()     // Catch: java.lang.Throwable -> Lf5
            java.lang.Object r9 = r5.g0     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r10 = "_display_name"
            r3.put(r10, r2)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r10 = "mime_type"
            r3.put(r10, r9)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r9 = "relative_path"
            java.lang.String r10 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Throwable -> Lf5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf5
            r11.<init>()     // Catch: java.lang.Throwable -> Lf5
            r11.append(r10)     // Catch: java.lang.Throwable -> Lf5
            r11.append(r0)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> Lf5
            r3.put(r9, r0)     // Catch: java.lang.Throwable -> Lf5
            android.content.ContentResolver r0 = r15.getContentResolver()     // Catch: java.lang.Throwable -> Lf5
            android.net.Uri r9 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> Lf5
            android.net.Uri r0 = r0.insert(r9, r3)     // Catch: java.lang.Throwable -> Lf5
            if (r0 == 0) goto L1e6
            android.content.ContentResolver r3 = r15.getContentResolver()     // Catch: java.lang.Throwable -> Lf5
            java.io.OutputStream r0 = r3.openOutputStream(r0)     // Catch: java.lang.Throwable -> Lf5
            r3 = r0
            goto L219
        L1e6:
            r3 = r7
            goto L219
        L1e8:
            java.lang.String r3 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Throwable -> Lf5
            java.io.File r3 = android.os.Environment.getExternalStoragePublicDirectory(r3)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lf5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf5
            r9.<init>()     // Catch: java.lang.Throwable -> Lf5
            r9.append(r3)     // Catch: java.lang.Throwable -> Lf5
            r9.append(r0)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> Lf5
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> Lf5
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lf5
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> Lf5
            if (r0 != 0) goto L20f
            r3.mkdirs()     // Catch: java.lang.Throwable -> Lf5
        L20f:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Lf5
            r0.<init>(r3, r2)     // Catch: java.lang.Throwable -> Lf5
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lf5
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lf5
        L219:
            if (r3 == 0) goto L230
            java.lang.Object r0 = r5.h0     // Catch: java.lang.Throwable -> Lf5
            android.graphics.Bitmap$CompressFormat r0 = (android.graphics.Bitmap.CompressFormat) r0     // Catch: java.lang.Throwable -> Lf5
            r9 = 100
            r6.compress(r0, r9, r3)     // Catch: java.lang.Throwable -> L228
            r3.close()     // Catch: java.lang.Throwable -> Lf5
            goto L230
        L228:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L22b
        L22b:
            r0 = move-exception
            defpackage.ge7.t(r3, r2)     // Catch: java.lang.Throwable -> Lf5
            throw r0     // Catch: java.lang.Throwable -> Lf5
        L230:
            xe1 r0 = defpackage.xk1.a     // Catch: java.lang.Throwable -> Lf5
            jv2 r0 = defpackage.e04.a     // Catch: java.lang.Throwable -> Lf5
            ag r14 = new ag     // Catch: java.lang.Throwable -> Lf5
            java.lang.Object r3 = r5.i0     // Catch: java.lang.Throwable -> Lf5
            r17 = r3
            qa4 r17 = (defpackage.qa4) r17     // Catch: java.lang.Throwable -> Lf5
            r19 = 8
            r16 = r2
            r18 = r7
            r14.<init>(r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L252
            r2 = r18
            r5.Y = r8     // Catch: java.lang.Throwable -> L250
            java.lang.Object r0 = defpackage.hv.d0(r0, r14, r5)     // Catch: java.lang.Throwable -> L250
            if (r0 != r4) goto Lf2
            goto L269
        L250:
            r0 = move-exception
            goto L255
        L252:
            r0 = move-exception
            r2 = r18
        L255:
            xe1 r3 = defpackage.xk1.a
            jv2 r3 = defpackage.e04.a
            m5 r6 = new m5
            r7 = 15
            r6.<init>(r15, r0, r2, r7)
            r2 = 4
            r5.Y = r2
            java.lang.Object r0 = defpackage.hv.d0(r3, r6, r5)
            if (r0 != r4) goto Lf2
        L269:
            r13 = r4
        L26a:
            return r13
        L26b:
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r5.Y
            if (r0 == 0) goto L281
            if (r0 != r12) goto L279
            defpackage.oi2.Y(r22)
            r0 = r22
            goto L2a1
        L279:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r13 = 0
            goto L35f
        L281:
            defpackage.oi2.Y(r22)
            java.lang.Object r0 = r5.Z
            w42 r0 = (defpackage.w42) r0
            java.lang.Object r1 = r5.d0
            z23 r1 = (defpackage.z23) r1
            java.lang.Object r2 = r5.e0
            java.lang.Object r3 = r5.f0
            fo4 r3 = (defpackage.fo4) r3
            java.lang.Object r4 = r5.g0
            k62 r4 = (defpackage.k62) r4
            r5.Y = r12
            java.lang.Object r0 = defpackage.w42.b(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto L2a1
            r13 = r6
            goto L35f
        L2a1:
            q42 r0 = (defpackage.q42) r0
            java.lang.Object r1 = r5.Z
            w42 r1 = (defpackage.w42) r1
            jx6 r1 = r1.b
            monitor-enter(r1)
            java.lang.ref.WeakReference r2 = r1.A     // Catch: java.lang.Throwable -> L2c0
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L2c0
            pe5 r2 = (defpackage.pe5) r2     // Catch: java.lang.Throwable -> L2c0
            if (r2 == 0) goto L2c3
            android.content.Context r3 = r1.B     // Catch: java.lang.Throwable -> L2c0
            if (r3 != 0) goto L2c6
            android.content.Context r2 = r2.a     // Catch: java.lang.Throwable -> L2c0
            r1.B = r2     // Catch: java.lang.Throwable -> L2c0
            r2.registerComponentCallbacks(r1)     // Catch: java.lang.Throwable -> L2c0
            goto L2c6
        L2c0:
            r0 = move-exception
            goto L360
        L2c3:
            r1.b()     // Catch: java.lang.Throwable -> L2c0
        L2c6:
            monitor-exit(r1)
            java.lang.Object r1 = r5.Z
            w42 r1 = (defpackage.w42) r1
            s63 r1 = r1.d
            java.lang.Object r2 = r5.h0
            c44 r2 = (defpackage.c44) r2
            java.lang.Object r3 = r5.d0
            z23 r3 = (defpackage.z23) r3
            ra0 r3 = r3.p
            boolean r3 = r3.getWriteEnabled()
            if (r3 != 0) goto L2df
        L2dd:
            r1 = r11
            goto L333
        L2df:
            java.lang.Object r1 = r1.B
            pe5 r1 = (defpackage.pe5) r1
            ex6 r1 = r1.c
            java.lang.Object r1 = r1.getValue()
            se5 r1 = (defpackage.se5) r1
            if (r1 == 0) goto L2dd
            if (r2 != 0) goto L2f0
            goto L2dd
        L2f0:
            android.graphics.drawable.Drawable r3 = r0.a
            boolean r4 = r3 instanceof android.graphics.drawable.BitmapDrawable
            if (r4 == 0) goto L2f9
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            goto L2fa
        L2f9:
            r3 = 0
        L2fa:
            if (r3 == 0) goto L2dd
            android.graphics.Bitmap r3 = r3.getBitmap()
            if (r3 != 0) goto L303
            goto L2dd
        L303:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.String r6 = "coil#is_sampled"
            boolean r7 = r0.b
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r4.put(r6, r7)
            java.lang.String r6 = r0.d
            if (r6 == 0) goto L31c
            java.lang.String r7 = "coil#disk_cache_key"
            r4.put(r7, r6)
        L31c:
            at6 r1 = r1.a
            java.util.Map r6 = r2.B
            java.util.Map r6 = defpackage.g04.V(r6)
            java.lang.String r2 = r2.A
            c44 r7 = new c44
            r7.<init>(r2, r6)
            java.util.Map r2 = defpackage.g04.V(r4)
            r1.h(r7, r3, r2)
            r1 = r12
        L333:
            android.graphics.drawable.Drawable r3 = r0.a
            java.lang.Object r2 = r5.d0
            r4 = r2
            z23 r4 = (defpackage.z23) r4
            zb1 r2 = r0.c
            java.lang.Object r6 = r5.h0
            c44 r6 = (defpackage.c44) r6
            if (r1 == 0) goto L343
            goto L344
        L343:
            r6 = 0
        L344:
            java.lang.String r7 = r0.d
            boolean r8 = r0.b
            java.lang.Object r0 = r5.i0
            re5 r0 = (defpackage.re5) r0
            android.graphics.Bitmap$Config[] r1 = defpackage.k.a
            if (r0 == 0) goto L357
            boolean r0 = r0.A
            if (r0 == 0) goto L357
            r9 = r12
        L355:
            r5 = r2
            goto L359
        L357:
            r9 = r11
            goto L355
        L359:
            bu6 r2 = new bu6
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r13 = r2
        L35f:
            return r13
        L360:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c0
            throw r0
        L362:
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r5.Y
            if (r0 == 0) goto L377
            if (r0 != r12) goto L370
            defpackage.oi2.Y(r22)
            r0 = r22
            goto L3af
        L370:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            goto L3af
        L377:
            defpackage.oi2.Y(r22)
            java.lang.Object r0 = r5.Z
            w42 r0 = (defpackage.w42) r0
            java.lang.Object r1 = r5.d0
            dh5 r1 = (defpackage.dh5) r1
            java.lang.Object r1 = r1.A
            mn6 r1 = (defpackage.mn6) r1
            java.lang.Object r2 = r5.e0
            dh5 r2 = (defpackage.dh5) r2
            java.lang.Object r2 = r2.A
            uv0 r2 = (defpackage.uv0) r2
            java.lang.Object r3 = r5.f0
            z23 r3 = (defpackage.z23) r3
            java.lang.Object r4 = r5.g0
            java.lang.Object r6 = r5.h0
            dh5 r6 = (defpackage.dh5) r6
            java.lang.Object r6 = r6.A
            fo4 r6 = (defpackage.fo4) r6
            java.lang.Object r7 = r5.i0
            k62 r7 = (defpackage.k62) r7
            r5.Y = r12
            r20 = r7
            r7 = r5
            r5 = r6
            r6 = r20
            java.lang.Object r0 = defpackage.w42.a(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r8) goto L3af
            r0 = r8
        L3af:
            return r0
        L3b0:
            jg7 r0 = defpackage.jg7.a
            java.lang.Object r9 = r5.h0
            r15 = r9
            sz1 r15 = (defpackage.sz1) r15
            of6 r9 = r15.J0
            x61 r14 = defpackage.x61.COROUTINE_SUSPENDED
            int r11 = r5.Y
            r13 = 0
            switch(r11) {
                case 0: goto L462;
                case 1: goto L456;
                case 2: goto L445;
                case 3: goto L3d5;
                case 4: goto L436;
                case 5: goto L3d5;
                case 6: goto L426;
                case 7: goto L40c;
                case 8: goto L3ec;
                case 9: goto L3db;
                case 10: goto L3d5;
                case 11: goto L3ce;
                case 12: goto L3c9;
                default: goto L3c1;
            }
        L3c1:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
        L3c6:
            r13 = 0
            goto L62d
        L3c9:
            defpackage.oi2.Y(r22)
            goto L621
        L3ce:
            defpackage.oi2.Y(r22)
            r12 = r13
            r6 = r14
            goto L60b
        L3d5:
            defpackage.oi2.Y(r22)
        L3d8:
            r13 = r0
            goto L62d
        L3db:
            java.lang.Object r2 = r5.d0
            mc5 r2 = (defpackage.mc5) r2
            java.lang.Object r3 = r5.Z
            dy1 r3 = (defpackage.dy1) r3
            defpackage.oi2.Y(r22)
            r1 = r22
            r12 = r13
            r6 = r14
            goto L5aa
        L3ec:
            java.lang.Object r3 = r5.g0
            pj4 r3 = (defpackage.pj4) r3
            java.lang.Object r4 = r5.f0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r5.e0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r5.d0
            mc5 r7 = (defpackage.mc5) r7
            java.lang.Object r8 = r5.Z
            dy1 r8 = (defpackage.dy1) r8
            defpackage.oi2.Y(r22)
            r1 = r3
            r2 = r7
            r12 = r13
            r3 = r22
            r7 = r6
            r6 = r14
            goto L58b
        L40c:
            java.lang.Object r4 = r5.f0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r5.e0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r5.d0
            mc5 r7 = (defpackage.mc5) r7
            java.lang.Object r8 = r5.Z
            dy1 r8 = (defpackage.dy1) r8
            defpackage.oi2.Y(r22)
            r2 = r22
            r1 = r6
            r12 = r13
            r6 = r14
            goto L56d
        L426:
            java.lang.Object r4 = r5.d0
            mc5 r4 = (defpackage.mc5) r4
            java.lang.Object r6 = r5.Z
            dy1 r6 = (defpackage.dy1) r6
            defpackage.oi2.Y(r22)
            r2 = r22
            r8 = r6
            goto L537
        L436:
            java.lang.Object r11 = r5.d0
            mc5 r11 = (defpackage.mc5) r11
            java.lang.Object r1 = r5.Z
            dy1 r1 = (defpackage.dy1) r1
            defpackage.oi2.Y(r22)
            r2 = r22
            goto L4f9
        L445:
            java.lang.Object r1 = r5.d0
            mc5 r1 = (defpackage.mc5) r1
            java.lang.Object r11 = r5.Z
            dy1 r11 = (defpackage.dy1) r11
            defpackage.oi2.Y(r22)
            r2 = r11
            r11 = r1
            r1 = r2
            r2 = r22
            goto L4b1
        L456:
            java.lang.Object r1 = r5.d0
            mc5 r1 = (defpackage.mc5) r1
            java.lang.Object r11 = r5.Z
            dy1 r11 = (defpackage.dy1) r11
            defpackage.oi2.Y(r22)
            goto L49f
        L462:
            defpackage.oi2.Y(r22)
            tp6 r1 = r15.p0
            java.lang.Object r1 = r1.getValue()
            boolean r11 = r1 instanceof defpackage.dy1
            if (r11 == 0) goto L473
            dy1 r1 = (defpackage.dy1) r1
            r11 = r1
            goto L474
        L473:
            r11 = r13
        L474:
            mc5 r1 = defpackage.mc5.RESUMABLE_SESSION
            s35 r2 = r15.V
            r2.getClass()
            r1.getClass()
            java.lang.Object r2 = r2.A
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            boolean r2 = r2.get()
            if (r2 == 0) goto L48a
            mc5 r1 = defpackage.mc5.TERMINAL_STOP
        L48a:
            if (r11 == 0) goto L5f0
            jh r2 = r15.v
            r5.Z = r11
            r5.d0 = r1
            r5.Y = r12
            r2.getClass()
            defpackage.jh.i()
            if (r0 != r14) goto L49f
        L49c:
            r6 = r14
            goto L61f
        L49f:
            r5.Z = r11
            r5.d0 = r1
            r5.Y = r10
            java.lang.Object r2 = r15.P0(r5)
            if (r2 != r14) goto L4ac
            goto L49c
        L4ac:
            r20 = r11
            r11 = r1
            r1 = r20
        L4b1:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L4ce
            g77 r1 = defpackage.g77.a
            r9.k(r1)
            mc5 r1 = defpackage.mc5.RESUMABLE_SESSION
            if (r11 != r1) goto L3d8
            r5.Z = r13
            r5.d0 = r13
            r5.Y = r8
            r15.U0()
            if (r0 != r14) goto L3d8
            goto L49c
        L4ce:
            nv4 r2 = r15.b0
            if (r2 == 0) goto L4e7
            de5 r2 = r2.i
            if (r2 == 0) goto L4e7
            rp6 r2 = r2.A
            java.lang.Object r2 = r2.getValue()
            bv4 r2 = (defpackage.bv4) r2
            if (r2 == 0) goto L4e7
            lc5 r2 = r2.c
            int r2 = r2.a
            r16 = r2
            goto L4e9
        L4e7:
            r16 = 0
        L4e9:
            if (r16 <= 0) goto L521
            r5.Z = r1
            r5.d0 = r11
            r2 = 4
            r5.Y = r2
            java.lang.Enum r2 = defpackage.sz1.C(r15, r11, r5)
            if (r2 != r14) goto L4f9
            goto L49c
        L4f9:
            nc5 r2 = (defpackage.nc5) r2
            int[] r16 = defpackage.w22.a
            int r2 = r2.ordinal()
            r2 = r16[r2]
            if (r2 == r12) goto L521
            if (r2 == r10) goto L510
            if (r2 != r8) goto L50b
            goto L3d8
        L50b:
            defpackage.i.d()
            goto L3c6
        L510:
            mc5 r1 = defpackage.mc5.RESUMABLE_SESSION
            if (r11 != r1) goto L3d8
            r5.Z = r13
            r5.d0 = r13
            r5.Y = r6
            r15.U0()
            if (r0 != r14) goto L3d8
            goto L49c
        L521:
            pn5 r2 = r15.g
            r5.Z = r1
            r5.d0 = r11
            r5.Y = r4
            pl r2 = (defpackage.pl) r2
            hk r2 = r2.c
            java.lang.Object r2 = r2.b(r5)
            if (r2 != r14) goto L535
            goto L49c
        L535:
            r8 = r1
            r4 = r11
        L537:
            jb5 r2 = (defpackage.jb5) r2
            if (r2 == 0) goto L5ed
            java.lang.String r16 = r2.a()
            pq5 r1 = r8.a
            java.lang.String r1 = r1.i
            xe1 r2 = defpackage.xk1.a
            de1 r2 = defpackage.de1.L
            r6 = r14
            i02 r14 = new i02
            r19 = 4
            r17 = r1
            r18 = r13
            r14.<init>(r15, r16, r17, r18, r19)
            r1 = r16
            r10 = r17
            r12 = r18
            r5.Z = r8
            r5.d0 = r4
            r5.e0 = r1
            r5.f0 = r10
            r5.Y = r7
            java.lang.Object r2 = defpackage.hv.d0(r2, r14, r5)
            if (r2 != r6) goto L56b
            goto L61f
        L56b:
            r7 = r4
            r4 = r10
        L56d:
            pj4 r2 = (defpackage.pj4) r2
            iw2 r10 = r15.o0
            r5.Z = r8
            r5.d0 = r7
            r5.e0 = r1
            r5.f0 = r4
            r5.g0 = r2
            r5.Y = r3
            java.lang.Object r3 = r10.f(r5)
            if (r3 != r6) goto L585
            goto L61f
        L585:
            r20 = r7
            r7 = r1
            r1 = r2
            r2 = r20
        L58b:
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 <= 0) goto L5cc
            r5.Z = r8
            r5.d0 = r2
            r5.e0 = r12
            r5.f0 = r12
            r5.g0 = r12
            r1 = 9
            r5.Y = r1
            java.lang.Object r1 = defpackage.sz1.A(r15, r7, r4, r2, r5)
            if (r1 != r6) goto L5a9
            goto L61f
        L5a9:
            r3 = r8
        L5aa:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L5ca
            mc5 r1 = defpackage.mc5.RESUMABLE_SESSION
            if (r2 != r1) goto L3d8
            r5.Z = r12
            r5.d0 = r12
            r5.e0 = r12
            r5.f0 = r12
            r5.g0 = r12
            r1 = 10
            r5.Y = r1
            r15.U0()
            if (r0 != r6) goto L3d8
            goto L61f
        L5ca:
            r11 = r3
            goto L5f2
        L5cc:
            ui4 r2 = r1.a
            ui4 r3 = defpackage.ui4.OK
            if (r2 != r3) goto L5eb
            xv2 r2 = r15.m
            r2.b(r7, r4)
            int r2 = r1.b()
            if (r2 <= 0) goto L5eb
            f77 r2 = new f77
            int r3 = r1.b()
            java.lang.Long r1 = r1.e
            r2.<init>(r3, r1)
            r9.k(r2)
        L5eb:
            r11 = r8
            goto L5f2
        L5ed:
            r12 = r13
            r6 = r14
            goto L5eb
        L5f0:
            r12 = r13
            r6 = r14
        L5f2:
            if (r11 == 0) goto L60b
            pq5 r1 = r11.a
            r5.Z = r12
            r5.d0 = r12
            r5.e0 = r12
            r5.f0 = r12
            r5.g0 = r12
            r2 = 11
            r5.Y = r2
            java.lang.Object r1 = defpackage.sz1.I(r15, r1, r5)
            if (r1 != r6) goto L60b
            goto L61f
        L60b:
            r5.Z = r12
            r5.d0 = r12
            r5.e0 = r12
            r5.f0 = r12
            r5.g0 = r12
            r1 = 12
            r5.Y = r1
            java.lang.Object r1 = r15.l0(r5)
            if (r1 != r6) goto L621
        L61f:
            r13 = r6
            goto L62d
        L621:
            r15.a1()
            java.lang.Object r1 = r5.i0
            yh2 r1 = (defpackage.yh2) r1
            r15.x0(r1)
            goto L3d8
        L62d:
            return r13
        L62e:
            java.lang.Object r0 = r21.v(r22)
            return r0
        L633:
            java.lang.String r0 = ".dsi"
            java.lang.Object r1 = r5.i0
            la1 r1 = (defpackage.la1) r1
            fg r2 = r1.b
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            int r11 = r5.Y
            switch(r11) {
                case 0: goto L6aa;
                case 1: goto L6a4;
                case 2: goto L69e;
                case 3: goto L692;
                case 4: goto L672;
                case 5: goto L657;
                case 6: goto L64f;
                case 7: goto L64a;
                case 8: goto L64a;
                default: goto L642;
            }
        L642:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r13 = 0
            goto L8ec
        L64a:
            defpackage.oi2.Y(r22)
            goto L8ea
        L64f:
            defpackage.oi2.Y(r22)
            r0 = r22
            r13 = 0
            goto L8be
        L657:
            java.lang.Object r0 = r5.h0
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r8 = r5.g0
            java.util.Set r8 = (java.util.Set) r8
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Object r10 = r5.f0
            java.util.Set r10 = (java.util.Set) r10
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r11 = r5.e0
            java.util.Set r11 = (java.util.Set) r11
            java.util.Set r11 = (java.util.Set) r11
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L8a7
            goto L8a4
        L672:
            java.lang.Object r0 = r5.h0
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r8 = r5.g0
            java.util.Set r8 = (java.util.Set) r8
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Object r10 = r5.f0
            java.util.Set r10 = (java.util.Set) r10
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r11 = r5.e0
            java.util.Set r11 = (java.util.Set) r11
            java.util.Set r11 = (java.util.Set) r11
            java.lang.Object r12 = r5.d0
            java.util.List r12 = (java.util.List) r12
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L8a7
            r13 = 4
            goto L7c6
        L692:
            java.lang.Object r0 = r5.Z
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L8a7
            r11 = r0
            r0 = r22
            goto L713
        L69e:
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L8a7
            r10 = r22
            goto L6d1
        L6a4:
            defpackage.oi2.Y(r22)
            r11 = r22
            goto L6b7
        L6aa:
            defpackage.oi2.Y(r22)
            r5.Y = r12
            java.lang.Enum r11 = r2.i(r5)
            if (r11 != r9) goto L6b7
            goto L8e8
        L6b7:
            mm4 r11 = (defpackage.mm4) r11
            boolean r11 = r11.isSuccess()
            if (r11 == 0) goto L8d5
            p06 r11 = r1.f     // Catch: java.lang.Throwable -> L8a7
            xb2 r11 = (defpackage.xb2) r11     // Catch: java.lang.Throwable -> L8a7
            g21 r11 = r11.o()     // Catch: java.lang.Throwable -> L8a7
            r5.Y = r10     // Catch: java.lang.Throwable -> L8a7
            java.lang.Object r10 = defpackage.f04.B(r11, r5)     // Catch: java.lang.Throwable -> L8a7
            if (r10 != r9) goto L6d1
            goto L8e8
        L6d1:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L8a7
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8a7
            r11.<init>()     // Catch: java.lang.Throwable -> L8a7
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L8a7
        L6dc:
            boolean r13 = r10.hasNext()     // Catch: java.lang.Throwable -> L8a7
            if (r13 == 0) goto L707
            java.lang.Object r13 = r10.next()     // Catch: java.lang.Throwable -> L8a7
            r14 = r13
            pq5 r14 = (defpackage.pq5) r14     // Catch: java.lang.Throwable -> L8a7
            boolean r15 = r14.h     // Catch: java.lang.Throwable -> L8a7
            if (r15 != 0) goto L703
            java.lang.String r15 = r14.c     // Catch: java.lang.Throwable -> L8a7
            boolean r15 = defpackage.xs6.Y(r15, r0, r12)     // Catch: java.lang.Throwable -> L8a7
            if (r15 != 0) goto L703
            android.net.Uri r14 = r14.d     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r14 = r14.getPath()     // Catch: java.lang.Throwable -> L8a7
            if (r14 == 0) goto L6dc
            boolean r14 = defpackage.xs6.Y(r14, r0, r12)     // Catch: java.lang.Throwable -> L8a7
            if (r14 != r12) goto L6dc
        L703:
            r11.add(r13)     // Catch: java.lang.Throwable -> L8a7
            goto L6dc
        L707:
            r5.Z = r11     // Catch: java.lang.Throwable -> L8a7
            r5.Y = r8     // Catch: java.lang.Throwable -> L8a7
            java.io.Serializable r0 = r2.h(r5)     // Catch: java.lang.Throwable -> L8a7
            if (r0 != r9) goto L713
            goto L8e8
        L713:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L8a7
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8a7
            r10 = 10
            int r12 = defpackage.ht0.v0(r0, r10)     // Catch: java.lang.Throwable -> L8a7
            r8.<init>(r12)     // Catch: java.lang.Throwable -> L8a7
            java.util.Iterator r10 = r0.iterator()     // Catch: java.lang.Throwable -> L8a7
        L724:
            boolean r12 = r10.hasNext()     // Catch: java.lang.Throwable -> L8a7
            if (r12 == 0) goto L749
            java.lang.Object r12 = r10.next()     // Catch: java.lang.Throwable -> L8a7
            me.magnum.melonds.domain.model.DSiWareTitle r12 = (me.magnum.melonds.domain.model.DSiWareTitle) r12     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r12 = r12.getName()     // Catch: java.lang.Throwable -> L8a7
            java.lang.CharSequence r12 = defpackage.qs6.T0(r12)     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L8a7
            java.util.Locale r13 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r12 = r12.toLowerCase(r13)     // Catch: java.lang.Throwable -> L8a7
            r12.getClass()     // Catch: java.lang.Throwable -> L8a7
            r8.add(r12)     // Catch: java.lang.Throwable -> L8a7
            goto L724
        L749:
            java.util.Set r8 = defpackage.gt0.p1(r8)     // Catch: java.lang.Throwable -> L8a7
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8a7
            r12 = 10
            int r13 = defpackage.ht0.v0(r11, r12)     // Catch: java.lang.Throwable -> L8a7
            r10.<init>(r13)     // Catch: java.lang.Throwable -> L8a7
            int r12 = r11.size()     // Catch: java.lang.Throwable -> L8a7
            r13 = 0
        L75d:
            if (r13 >= r12) goto L77e
            java.lang.Object r14 = r11.get(r13)     // Catch: java.lang.Throwable -> L8a7
            int r13 = r13 + 1
            pq5 r14 = (defpackage.pq5) r14     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r14 = r14.a     // Catch: java.lang.Throwable -> L8a7
            java.lang.CharSequence r14 = defpackage.qs6.T0(r14)     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L8a7
            java.util.Locale r15 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r14 = r14.toLowerCase(r15)     // Catch: java.lang.Throwable -> L8a7
            r14.getClass()     // Catch: java.lang.Throwable -> L8a7
            r10.add(r14)     // Catch: java.lang.Throwable -> L8a7
            goto L75d
        L77e:
            java.util.Set r10 = defpackage.gt0.p1(r10)     // Catch: java.lang.Throwable -> L8a7
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8a7
            r13 = 10
            int r13 = defpackage.ht0.v0(r11, r13)     // Catch: java.lang.Throwable -> L8a7
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L8a7
            int r13 = r11.size()     // Catch: java.lang.Throwable -> L8a7
            r14 = 0
        L792:
            if (r14 >= r13) goto L7ba
            java.lang.Object r15 = r11.get(r14)     // Catch: java.lang.Throwable -> L8a7
            int r14 = r14 + 1
            pq5 r15 = (defpackage.pq5) r15     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r15 = r15.c     // Catch: java.lang.Throwable -> L8a7
            r7 = 46
            java.lang.String r7 = defpackage.qs6.R0(r7, r15, r15)     // Catch: java.lang.Throwable -> L8a7
            java.lang.CharSequence r7 = defpackage.qs6.T0(r7)     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L8a7
            java.util.Locale r15 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r7 = r7.toLowerCase(r15)     // Catch: java.lang.Throwable -> L8a7
            r7.getClass()     // Catch: java.lang.Throwable -> L8a7
            r12.add(r7)     // Catch: java.lang.Throwable -> L8a7
            r7 = 7
            goto L792
        L7ba:
            java.util.Set r7 = defpackage.gt0.p1(r12)     // Catch: java.lang.Throwable -> L8a7
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L8a7
            r12 = r0
            r0 = r11
            r11 = r8
            r8 = r7
        L7c6:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L8a7
            if (r7 == 0) goto L80e
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L8a7
            pq5 r7 = (defpackage.pq5) r7     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r13 = r7.a     // Catch: java.lang.Throwable -> L8a7
            java.lang.CharSequence r13 = defpackage.qs6.T0(r13)     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L8a7
            java.util.Locale r14 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r13 = r13.toLowerCase(r14)     // Catch: java.lang.Throwable -> L8a7
            r13.getClass()     // Catch: java.lang.Throwable -> L8a7
            boolean r13 = r11.contains(r13)     // Catch: java.lang.Throwable -> L8a7
            if (r13 != 0) goto L7c6
            android.net.Uri r7 = r7.d     // Catch: java.lang.Throwable -> L8a7
            r13 = 0
            r5.Z = r13     // Catch: java.lang.Throwable -> L8a7
            r5.d0 = r12     // Catch: java.lang.Throwable -> L8a7
            r13 = r11
            java.util.Set r13 = (java.util.Set) r13     // Catch: java.lang.Throwable -> L8a7
            r5.e0 = r13     // Catch: java.lang.Throwable -> L8a7
            r13 = r10
            java.util.Set r13 = (java.util.Set) r13     // Catch: java.lang.Throwable -> L8a7
            r5.f0 = r13     // Catch: java.lang.Throwable -> L8a7
            r13 = r8
            java.util.Set r13 = (java.util.Set) r13     // Catch: java.lang.Throwable -> L8a7
            r5.g0 = r13     // Catch: java.lang.Throwable -> L8a7
            r5.h0 = r0     // Catch: java.lang.Throwable -> L8a7
            r13 = 4
            r5.Y = r13     // Catch: java.lang.Throwable -> L8a7
            java.lang.Enum r7 = r2.f(r7, r5)     // Catch: java.lang.Throwable -> L8a7
            if (r7 != r9) goto L7c6
            goto L8e8
        L80e:
            java.util.Iterator r0 = r12.iterator()     // Catch: java.lang.Throwable -> L8a7
        L812:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L8a7
            if (r7 == 0) goto L8a7
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L8a7
            me.magnum.melonds.domain.model.DSiWareTitle r7 = (me.magnum.melonds.domain.model.DSiWareTitle) r7     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r11 = r7.getName()     // Catch: java.lang.Throwable -> L8a7
            java.lang.CharSequence r11 = defpackage.qs6.T0(r11)     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L8a7
            java.util.Locale r12 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r11 = r11.toLowerCase(r12)     // Catch: java.lang.Throwable -> L8a7
            r11.getClass()     // Catch: java.lang.Throwable -> L8a7
            db1 r13 = r1.e     // Catch: java.lang.Throwable -> L8a7
            long r14 = r7.getTitleId()     // Catch: java.lang.Throwable -> L8a7
            r13.getClass()     // Catch: java.lang.Throwable -> L8a7
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r14 & r18
            r4 = 16
            defpackage.g04.y(r4)     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r4 = java.lang.Long.toString(r14, r4)     // Catch: java.lang.Throwable -> L8a7
            r4.getClass()     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r4 = defpackage.qs6.B0(r3, r4)     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r4 = r4.toLowerCase(r12)     // Catch: java.lang.Throwable -> L8a7
            r4.getClass()     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r4 = r13.b(r4)     // Catch: java.lang.Throwable -> L8a7
            if (r4 == 0) goto L872
            java.lang.CharSequence r4 = defpackage.qs6.T0(r4)     // Catch: java.lang.Throwable -> L8a7
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L8a7
            if (r4 == 0) goto L872
            java.lang.String r4 = r4.toLowerCase(r12)     // Catch: java.lang.Throwable -> L8a7
            r4.getClass()     // Catch: java.lang.Throwable -> L8a7
            goto L873
        L872:
            r4 = 0
        L873:
            boolean r12 = r10.contains(r11)     // Catch: java.lang.Throwable -> L8a7
            if (r12 != 0) goto L8a4
            if (r4 == 0) goto L881
            boolean r4 = r8.contains(r4)     // Catch: java.lang.Throwable -> L8a7
            if (r4 != 0) goto L8a4
        L881:
            boolean r4 = r8.contains(r11)     // Catch: java.lang.Throwable -> L8a7
            if (r4 == 0) goto L888
            goto L8a4
        L888:
            r13 = 0
            r5.Z = r13     // Catch: java.lang.Throwable -> L8a7
            r5.d0 = r13     // Catch: java.lang.Throwable -> L8a7
            r5.e0 = r13     // Catch: java.lang.Throwable -> L8a7
            r4 = r10
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L8a7
            r5.f0 = r4     // Catch: java.lang.Throwable -> L8a7
            r4 = r8
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L8a7
            r5.g0 = r4     // Catch: java.lang.Throwable -> L8a7
            r5.h0 = r0     // Catch: java.lang.Throwable -> L8a7
            r5.Y = r6     // Catch: java.lang.Throwable -> L8a7
            java.lang.Object r4 = r2.c(r7, r5)     // Catch: java.lang.Throwable -> L8a7
            if (r4 != r9) goto L8a4
            goto L8e8
        L8a4:
            r4 = 6
            goto L812
        L8a7:
            r13 = 0
            r5.Z = r13
            r5.d0 = r13
            r5.e0 = r13
            r5.f0 = r13
            r5.g0 = r13
            r5.h0 = r13
            r0 = 6
            r5.Y = r0
            java.io.Serializable r0 = r2.h(r5)
            if (r0 != r9) goto L8be
            goto L8e8
        L8be:
            java.util.List r0 = (java.util.List) r0
            xe1 r2 = defpackage.xk1.a
            jv2 r2 = defpackage.e04.a
            m5 r3 = new m5
            r4 = 9
            r3.<init>(r1, r0, r13, r4)
            r0 = 7
            r5.Y = r0
            java.lang.Object r0 = defpackage.hv.d0(r2, r3, r5)
            if (r0 != r9) goto L8ea
            goto L8e8
        L8d5:
            r0 = r7
            r13 = 0
            xe1 r2 = defpackage.xk1.a
            jv2 r2 = defpackage.e04.a
            y3 r4 = new y3
            r4.<init>(r1, r13, r0)
            r5.Y = r3
            java.lang.Object r0 = defpackage.hv.d0(r2, r4, r5)
            if (r0 != r9) goto L8ea
        L8e8:
            r13 = r9
            goto L8ec
        L8ea:
            jg7 r13 = defpackage.jg7.a
        L8ec:
            return r13
    }
}
