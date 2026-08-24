package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k40  reason: default package */
/* loaded from: classes.dex */
public final class k40 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ defpackage.m40 Y;
    public final /* synthetic */ defpackage.qn2 Z;

    public /* synthetic */ k40(defpackage.m40 r1, defpackage.qn2 r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Y = r1
            r0.Z = r2
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
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            k40 r2 = (defpackage.k40) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            k40 r2 = (defpackage.k40) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            qn2 r0 = r2.Z
            m40 r2 = r2.Y
            switch(r4) {
                case 0: goto L10;
                default: goto L9;
            }
        L9:
            k40 r4 = new k40
            r1 = 1
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            k40 r4 = new k40
            r1 = 0
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r25) {
            r24 = this;
            r0 = r24
            int r1 = r0.X
            java.lang.String r2 = "use_custom_bios"
            r3 = 100
            java.lang.String r4 = "firmware.bin"
            java.lang.String r5 = "bios9.bin"
            java.lang.String r6 = "bios7.bin"
            java.lang.String r8 = ".zip"
            m40 r9 = r0.Y
            qn2 r10 = r0.Z
            r11 = 1
            switch(r1) {
                case 0: goto L2ce;
                default: goto L18;
            }
        L18:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r25)
            java.io.File r1 = new java.io.File
            kd6 r13 = r9.b
            android.content.Context r14 = r9.a
            java.io.File r0 = r14.getFilesDir()
            java.lang.String r15 = "bios/dsi"
            r1.<init>(r0, r15)
            r1.mkdirs()
            java.io.File r15 = new java.io.File
            java.io.File r0 = r14.getCacheDir()
            r25 = r13
            r24 = 0
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = "temp_dsi_bios_"
            java.lang.String r7 = defpackage.lb1.i(r12, r7, r8)
            r15.<init>(r0, r7)
            java.util.List r0 = defpackage.m40.d
            java.util.Iterator r7 = r0.iterator()
            r16 = 0
        L4e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            defpackage.m40.a(r9, r0, r15, r10)     // Catch: java.lang.Throwable -> L6f
            defpackage.m40.b(r9, r15, r1, r11)     // Catch: java.lang.Throwable -> L6f
            boolean r0 = defpackage.m40.d(r9, r1)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L6b
            r15.delete()
            r7 = r11
            goto L75
        L6b:
            r15.delete()
            goto L4e
        L6f:
            r0 = move-exception
            r16 = r0
            goto L6b
        L73:
            r7 = r24
        L75:
            if (r7 != 0) goto L26a
            java.lang.String[] r0 = new java.lang.String[]{r6, r5, r4}     // Catch: java.lang.Throwable -> Ld0
            java.util.List r0 = defpackage.hf.c0(r0)     // Catch: java.lang.Throwable -> Ld0
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Ld0
        L83:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> Ld0
            if (r4 == 0) goto Ld0
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Ld0
            android.content.res.AssetManager r5 = r14.getAssets()     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r6.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r8 = "bios/dsi/"
            r6.append(r8)     // Catch: java.lang.Throwable -> Ld0
            r6.append(r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Ld0
            java.io.InputStream r5 = r5.open(r6)     // Catch: java.lang.Throwable -> Ld0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lbf
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> Lbf
            r8.<init>(r1, r4)     // Catch: java.lang.Throwable -> Lbf
            r6.<init>(r8)     // Catch: java.lang.Throwable -> Lbf
            r5.getClass()     // Catch: java.lang.Throwable -> Lc2
            defpackage.f04.w(r5, r6)     // Catch: java.lang.Throwable -> Lc2
            r6.close()     // Catch: java.lang.Throwable -> Lbf
            r5.close()     // Catch: java.lang.Throwable -> Ld0
            goto L83
        Lbf:
            r0 = move-exception
            r4 = r0
            goto Lca
        Lc2:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch: java.lang.Throwable -> Lc5
        Lc5:
            r0 = move-exception
            defpackage.ge7.t(r6, r4)     // Catch: java.lang.Throwable -> Lbf
            throw r0     // Catch: java.lang.Throwable -> Lbf
        Lca:
            throw r4     // Catch: java.lang.Throwable -> Lcb
        Lcb:
            r0 = move-exception
            defpackage.ge7.t(r5, r4)     // Catch: java.lang.Throwable -> Ld0
            throw r0     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            boolean r0 = defpackage.m40.d(r9, r1)
            if (r0 != 0) goto Lea
            java.io.File r0 = new java.io.File
            java.lang.String r4 = "nand.bin"
            r0.<init>(r1, r4)
            boolean r4 = r0.exists()
            if (r4 == 0) goto Lf0
            boolean r4 = defpackage.m40.d(r9, r1)
            if (r4 != 0) goto Lea
            goto Lf0
        Lea:
            r17 = r7
            r21 = r11
            goto L261
        Lf0:
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> Lea
            java.lang.String r5 = "rw"
            r4.<init>(r0, r5)     // Catch: java.lang.Throwable -> Lea
            r5 = 251658240(0xf000000, double:1.24335691E-315)
            r4.setLength(r5)     // Catch: java.lang.Throwable -> L257
            r0 = 512(0x200, float:7.17E-43)
            byte[] r5 = new byte[r0]     // Catch: java.lang.Throwable -> L257
            r6 = 446(0x1be, float:6.25E-43)
            r8 = -128(0xffffffffffffff80, float:NaN)
            r5[r6] = r8     // Catch: java.lang.Throwable -> L257
            r6 = 450(0x1c2, float:6.3E-43)
            r8 = 6
            r5[r6] = r8     // Catch: java.lang.Throwable -> L257
            r6 = 454(0x1c6, float:6.36E-43)
            r5[r6] = r24     // Catch: java.lang.Throwable -> L257
            r6 = 455(0x1c7, float:6.38E-43)
            r12 = 8
            r5[r6] = r12     // Catch: java.lang.Throwable -> L257
            r6 = 456(0x1c8, float:6.39E-43)
            r5[r6] = r24     // Catch: java.lang.Throwable -> L257
            r6 = 457(0x1c9, float:6.4E-43)
            r5[r6] = r24     // Catch: java.lang.Throwable -> L257
            r6 = 458(0x1ca, float:6.42E-43)
            r5[r6] = r24     // Catch: java.lang.Throwable -> L257
            r6 = 459(0x1cb, float:6.43E-43)
            r5[r6] = r24     // Catch: java.lang.Throwable -> L257
            r6 = 460(0x1cc, float:6.45E-43)
            r5[r6] = r8     // Catch: java.lang.Throwable -> L257
            r6 = 461(0x1cd, float:6.46E-43)
            r5[r6] = r24     // Catch: java.lang.Throwable -> L257
            r6 = 85
            r13 = 510(0x1fe, float:7.15E-43)
            r5[r13] = r6     // Catch: java.lang.Throwable -> L257
            r14 = -86
            r15 = 511(0x1ff, float:7.16E-43)
            r5[r15] = r14     // Catch: java.lang.Throwable -> L257
            r18 = r6
            r17 = r7
            r6 = 0
            r4.seek(r6)     // Catch: java.lang.Throwable -> L253
            r4.write(r5)     // Catch: java.lang.Throwable -> L253
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L253
            r5 = -21
            r0[r24] = r5     // Catch: java.lang.Throwable -> L253
            r5 = 60
            r0[r11] = r5     // Catch: java.lang.Throwable -> L253
            r5 = -112(0xffffffffffffff90, float:NaN)
            r6 = 2
            r0[r6] = r5     // Catch: java.lang.Throwable -> L253
            java.lang.String r5 = "MSDOS5.0"
            java.nio.charset.Charset r7 = defpackage.qm0.d     // Catch: java.lang.Throwable -> L253
            byte[] r5 = r5.getBytes(r7)     // Catch: java.lang.Throwable -> L253
            r5.getClass()     // Catch: java.lang.Throwable -> L253
            r19 = r6
            r6 = 3
            r20 = r8
            r8 = r24
            java.lang.System.arraycopy(r5, r8, r0, r6, r12)     // Catch: java.lang.Throwable -> L253
            r5 = 11
            r0[r5] = r8     // Catch: java.lang.Throwable -> L253
            r6 = 12
            r0[r6] = r19     // Catch: java.lang.Throwable -> L253
            r6 = 13
            r0[r6] = r12     // Catch: java.lang.Throwable -> L253
            r6 = 14
            r8 = 4
            r0[r6] = r8     // Catch: java.lang.Throwable -> L253
            r6 = 15
            r21 = 0
            r0[r6] = r21     // Catch: java.lang.Throwable -> L253
            r6 = 16
            r0[r6] = r19     // Catch: java.lang.Throwable -> L253
            r22 = 17
            r0[r22] = r21     // Catch: java.lang.Throwable -> L253
            r22 = 18
            r0[r22] = r19     // Catch: java.lang.Throwable -> L253
            r19 = 21
            r22 = -8
            r0[r19] = r22     // Catch: java.lang.Throwable -> L253
            r19 = 22
            r0[r19] = r21     // Catch: java.lang.Throwable -> L253
            r19 = 23
            r0[r19] = r11     // Catch: java.lang.Throwable -> L253
            r19 = 24
            r22 = 32
            r0[r19] = r22     // Catch: java.lang.Throwable -> L253
            r19 = 25
            r0[r19] = r21     // Catch: java.lang.Throwable -> L253
            r19 = 26
            r23 = r13
            r13 = 64
            r0[r19] = r13     // Catch: java.lang.Throwable -> L253
            r19 = 27
            r0[r19] = r21     // Catch: java.lang.Throwable -> L253
            r19 = 28
            r0[r19] = r21     // Catch: java.lang.Throwable -> L253
            r19 = 29
            r0[r19] = r12     // Catch: java.lang.Throwable -> L253
            r19 = 30
            r0[r19] = r21     // Catch: java.lang.Throwable -> L253
            r19 = 31
            r0[r19] = r21     // Catch: java.lang.Throwable -> L253
            r0[r22] = r21     // Catch: java.lang.Throwable -> L253
            r19 = 33
            r0[r19] = r21     // Catch: java.lang.Throwable -> L253
            r19 = 34
            r0[r19] = r20     // Catch: java.lang.Throwable -> L253
            r19 = 35
            r0[r19] = r21     // Catch: java.lang.Throwable -> L253
            r19 = 38
            r20 = 41
            r0[r19] = r20     // Catch: java.lang.Throwable -> L253
            r19 = r14
            java.lang.String r14 = "DSi NAND   "
            byte[] r14 = r14.getBytes(r7)     // Catch: java.lang.Throwable -> L253
            r14.getClass()     // Catch: java.lang.Throwable -> L253
            r20 = r15
            r15 = 43
            r21 = r11
            r11 = 0
            java.lang.System.arraycopy(r14, r11, r0, r15, r5)     // Catch: java.lang.Throwable -> L250
            java.lang.String r5 = "FAT16   "
            byte[] r5 = r5.getBytes(r7)     // Catch: java.lang.Throwable -> L250
            r5.getClass()     // Catch: java.lang.Throwable -> L250
            r14 = 54
            java.lang.System.arraycopy(r5, r11, r0, r14, r12)     // Catch: java.lang.Throwable -> L250
            r0[r23] = r18     // Catch: java.lang.Throwable -> L250
            r0[r20] = r19     // Catch: java.lang.Throwable -> L250
            r11 = 1048576(0x100000, double:5.180654E-318)
            r4.seek(r11)     // Catch: java.lang.Throwable -> L250
            r4.write(r0)     // Catch: java.lang.Throwable -> L250
            byte[] r0 = new byte[r8]     // Catch: java.lang.Throwable -> L250
            r0 = {x03ee: FILL_ARRAY_DATA  , data: [-8, -1, -1, -1} // fill-array     // Catch: java.lang.Throwable -> L250
            r11 = 1050624(0x100800, double:5.19077E-318)
            r4.seek(r11)     // Catch: java.lang.Throwable -> L250
            r4.write(r0)     // Catch: java.lang.Throwable -> L250
            r11 = 1181696(0x120800, double:5.838354E-318)
            r4.seek(r11)     // Catch: java.lang.Throwable -> L250
            r4.write(r0)     // Catch: java.lang.Throwable -> L250
            byte[] r0 = new byte[r13]     // Catch: java.lang.Throwable -> L250
            java.lang.String r5 = "DSi eMMC CID/CPU"
            byte[] r5 = r5.getBytes(r7)     // Catch: java.lang.Throwable -> L250
            r5.getClass()     // Catch: java.lang.Throwable -> L250
            int r7 = r5.length     // Catch: java.lang.Throwable -> L250
            r8 = 0
            java.lang.System.arraycopy(r5, r8, r0, r8, r7)     // Catch: java.lang.Throwable -> L250
            byte[] r5 = new byte[r6]     // Catch: java.lang.Throwable -> L250
            r5 = {x03f4: FILL_ARRAY_DATA  , data: [21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1} // fill-array     // Catch: java.lang.Throwable -> L250
            java.lang.System.arraycopy(r5, r8, r0, r6, r6)     // Catch: java.lang.Throwable -> L250
            r0[r22] = r21     // Catch: java.lang.Throwable -> L250
            r5 = 36
            r0[r5] = r21     // Catch: java.lang.Throwable -> L250
            r5 = 1046528(0xff800, double:5.170535E-318)
            r4.seek(r5)     // Catch: java.lang.Throwable -> L250
            r4.write(r0)     // Catch: java.lang.Throwable -> L250
            r5 = 251658176(0xeffffc0, double:1.243356593E-315)
            r4.seek(r5)     // Catch: java.lang.Throwable -> L250
            r4.write(r0)     // Catch: java.lang.Throwable -> L250
            r4.close()     // Catch: java.lang.Throwable -> L261
            goto L261
        L250:
            r0 = move-exception
        L251:
            r5 = r0
            goto L25b
        L253:
            r0 = move-exception
        L254:
            r21 = r11
            goto L251
        L257:
            r0 = move-exception
            r17 = r7
            goto L254
        L25b:
            throw r5     // Catch: java.lang.Throwable -> L25c
        L25c:
            r0 = move-exception
            defpackage.ge7.t(r4, r5)     // Catch: java.lang.Throwable -> L261
            throw r0     // Catch: java.lang.Throwable -> L261
        L261:
            boolean r0 = defpackage.m40.d(r9, r1)
            if (r0 == 0) goto L26e
            r7 = r21
            goto L270
        L26a:
            r17 = r7
            r21 = r11
        L26e:
            r7 = r17
        L270:
            if (r7 == 0) goto L2b7
            boolean r0 = defpackage.m40.d(r9, r1)
            if (r0 == 0) goto L2b7
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r3)
            r10.g(r0)
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            r0.getClass()
            r13 = r25
            ng6 r13 = (defpackage.ng6) r13
            r13.getClass()
            android.content.SharedPreferences r3 = r13.b
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r0 = r0.toString()
            java.util.Set r0 = defpackage.ii2.R(r0)
            java.lang.String r4 = "dsi_bios_dir"
            r3.putStringSet(r4, r0)
            r3.apply()
            r13 = r25
            ng6 r13 = (defpackage.ng6) r13
            android.content.SharedPreferences r0 = r13.b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r3 = r21
            r0.putBoolean(r2, r3)
            r0.apply()
            goto L2c8
        L2b7:
            if (r16 != 0) goto L2c1
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Не удалось скачать файлы BIOS DSi и образ NAND."
            r0.<init>(r1)
            goto L2c3
        L2c1:
            r0 = r16
        L2c3:
            em5 r1 = new em5
            r1.<init>(r0)
        L2c8:
            hm5 r0 = new hm5
            r0.<init>(r1)
            return r0
        L2ce:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r25)
            java.io.File r1 = new java.io.File
            kd6 r7 = r9.b
            android.content.Context r11 = r9.a
            java.io.File r0 = r11.getFilesDir()
            java.lang.String r12 = "bios/ds"
            r1.<init>(r0, r12)
            r1.mkdirs()
            java.io.File r12 = new java.io.File
            java.io.File r0 = r11.getCacheDir()
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.String r15 = "temp_ds_bios_"
            java.lang.String r8 = defpackage.lb1.i(r13, r15, r8)
            r12.<init>(r0, r8)
            java.util.List r0 = defpackage.m40.c
            java.util.Iterator r8 = r0.iterator()
            r16 = 0
        L300:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L329
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            defpackage.m40.a(r9, r0, r12, r10)     // Catch: java.lang.Throwable -> L326
            r13 = 0
            defpackage.m40.b(r9, r12, r1, r13)     // Catch: java.lang.Throwable -> L322
            boolean r0 = defpackage.m40.c(r9, r1)     // Catch: java.lang.Throwable -> L322
            if (r0 == 0) goto L31e
            r12.delete()
            r12 = 1
            goto L32b
        L31e:
            r12.delete()
            goto L300
        L322:
            r0 = move-exception
        L323:
            r16 = r0
            goto L31e
        L326:
            r0 = move-exception
            r13 = 0
            goto L323
        L329:
            r13 = 0
            r12 = r13
        L32b:
            if (r12 != 0) goto L38d
            java.lang.String[] r0 = new java.lang.String[]{r6, r5, r4}     // Catch: java.lang.Throwable -> L38d
            java.util.List r0 = defpackage.hf.c0(r0)     // Catch: java.lang.Throwable -> L38d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L38d
        L339:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L38d
            if (r4 == 0) goto L386
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L38d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L38d
            android.content.res.AssetManager r5 = r11.getAssets()     // Catch: java.lang.Throwable -> L38d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38d
            r6.<init>()     // Catch: java.lang.Throwable -> L38d
            java.lang.String r8 = "bios/ds/"
            r6.append(r8)     // Catch: java.lang.Throwable -> L38d
            r6.append(r4)     // Catch: java.lang.Throwable -> L38d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L38d
            java.io.InputStream r5 = r5.open(r6)     // Catch: java.lang.Throwable -> L38d
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L375
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L375
            r8.<init>(r1, r4)     // Catch: java.lang.Throwable -> L375
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L375
            r5.getClass()     // Catch: java.lang.Throwable -> L378
            defpackage.f04.w(r5, r6)     // Catch: java.lang.Throwable -> L378
            r6.close()     // Catch: java.lang.Throwable -> L375
            r5.close()     // Catch: java.lang.Throwable -> L38d
            goto L339
        L375:
            r0 = move-exception
            r4 = r0
            goto L380
        L378:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch: java.lang.Throwable -> L37b
        L37b:
            r0 = move-exception
            defpackage.ge7.t(r6, r4)     // Catch: java.lang.Throwable -> L375
            throw r0     // Catch: java.lang.Throwable -> L375
        L380:
            throw r4     // Catch: java.lang.Throwable -> L381
        L381:
            r0 = move-exception
            defpackage.ge7.t(r5, r4)     // Catch: java.lang.Throwable -> L38d
            throw r0     // Catch: java.lang.Throwable -> L38d
        L386:
            boolean r0 = defpackage.m40.c(r9, r1)
            if (r0 == 0) goto L38d
            r12 = 1
        L38d:
            if (r12 == 0) goto L3d0
            boolean r0 = defpackage.m40.c(r9, r1)
            if (r0 == 0) goto L3d0
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r3)
            r10.g(r0)
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            r0.getClass()
            r3 = r7
            ng6 r3 = (defpackage.ng6) r3
            r3.getClass()
            android.content.SharedPreferences r3 = r3.b
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r0 = r0.toString()
            java.util.Set r0 = defpackage.ii2.R(r0)
            java.lang.String r4 = "bios_dir"
            r3.putStringSet(r4, r0)
            r3.apply()
            ng6 r7 = (defpackage.ng6) r7
            android.content.SharedPreferences r0 = r7.b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r3 = 1
            r0.putBoolean(r2, r3)
            r0.apply()
            goto L3e1
        L3d0:
            if (r16 != 0) goto L3da
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Не удалось скачать файлы BIOS DS."
            r0.<init>(r1)
            goto L3dc
        L3da:
            r0 = r16
        L3dc:
            em5 r1 = new em5
            r1.<init>(r0)
        L3e1:
            hm5 r0 = new hm5
            r0.<init>(r1)
            return r0
    }
}
