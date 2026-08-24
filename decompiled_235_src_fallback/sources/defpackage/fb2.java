package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fb2  reason: default package */
/* loaded from: classes.dex */
public final class fb2 {
    public final defpackage.kd6 a;
    public final android.content.Context b;

    public fb2(android.content.Context r1, defpackage.kd6 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r1
            return
    }

    public final defpackage.dz0 a(me.magnum.melonds.domain.model.ConsoleType r28, android.net.Uri r29) {
            r27 = this;
            r1 = r28
            r0 = r29
            int[] r2 = defpackage.eb2.a
            int r3 = r1.ordinal()
            r2 = r2[r3]
            r3 = 0
            java.lang.String r4 = "firmware.bin"
            java.lang.String r5 = "bios9.bin"
            java.lang.String r6 = "bios7.bin"
            r7 = 1
            if (r2 == r7) goto L84
            r8 = 2
            if (r2 != r8) goto L80
            a0 r9 = new a0
            r16 = 0
            r17 = 11
            r10 = 1
            java.lang.Class<fb2> r12 = defpackage.fb2.class
            java.lang.String r13 = "getDSiBios7Status"
            java.lang.String r14 = "getDSiBios7Status(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;"
            r15 = 0
            r11 = r27
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            vr4 r2 = new vr4
            r2.<init>(r6, r9)
            a0 r18 = new a0
            r25 = 0
            r26 = 12
            r19 = 1
            java.lang.Class<fb2> r21 = defpackage.fb2.class
            java.lang.String r22 = "getDSiBios9Status"
            java.lang.String r23 = "getDSiBios9Status(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;"
            r24 = 0
            r20 = r27
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r6 = r18
            vr4 r8 = new vr4
            r8.<init>(r5, r6)
            a0 r18 = new a0
            r26 = 13
            java.lang.Class<fb2> r21 = defpackage.fb2.class
            java.lang.String r22 = "getDSiFirmwareStatus"
            java.lang.String r23 = "getDSiFirmwareStatus(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;"
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r5 = r18
            vr4 r6 = new vr4
            r6.<init>(r4, r5)
            a0 r18 = new a0
            r26 = 14
            java.lang.Class<fb2> r21 = defpackage.fb2.class
            java.lang.String r22 = "getDSiNandStatus"
            java.lang.String r23 = "getDSiNandStatus(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;"
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r18
            vr4 r5 = new vr4
            java.lang.String r9 = "nand.bin"
            r5.<init>(r9, r4)
            vr4[] r2 = new defpackage.vr4[]{r2, r8, r6, r5}
            java.util.Map r2 = defpackage.c14.m0(r2)
            goto Ld0
        L80:
            defpackage.i.d()
            return r3
        L84:
            a0 r18 = new a0
            r25 = 0
            r26 = 8
            r19 = 1
            java.lang.Class<fb2> r21 = defpackage.fb2.class
            java.lang.String r22 = "getDSBios7Status"
            java.lang.String r23 = "getDSBios7Status(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;"
            r24 = 0
            r20 = r27
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = r18
            vr4 r8 = new vr4
            r8.<init>(r6, r2)
            a0 r18 = new a0
            r26 = 9
            java.lang.Class<fb2> r21 = defpackage.fb2.class
            java.lang.String r22 = "getDSBios9Status"
            java.lang.String r23 = "getDSBios9Status(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;"
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = r18
            vr4 r6 = new vr4
            r6.<init>(r5, r2)
            a0 r18 = new a0
            r26 = 10
            java.lang.Class<fb2> r21 = defpackage.fb2.class
            java.lang.String r22 = "getDSFirmwareStatus"
            java.lang.String r23 = "getDSFirmwareStatus(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;"
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = r18
            vr4 r5 = new vr4
            r5.<init>(r4, r2)
            vr4[] r2 = new defpackage.vr4[]{r8, r6, r5}
            java.util.Map r2 = defpackage.c14.m0(r2)
        Ld0:
            r4 = 0
            if (r0 != 0) goto L11d
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r2.size()
            r0.<init>(r3)
            java.util.Set r3 = r2.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Le4:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lff
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getKey()
            bz0 r6 = defpackage.bz0.MISSING
            vr4 r7 = new vr4
            r7.<init>(r5, r6)
            r0.add(r7)
            goto Le4
        Lff:
            dz0 r3 = new dz0
            cz0 r5 = defpackage.cz0.UNSET
            java.util.Set r2 = r2.keySet()
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.Object[] r2 = r2.toArray(r6)
            java.lang.String[] r2 = (java.lang.String[]) r2
            vr4[] r4 = new defpackage.vr4[r4]
            java.lang.Object[] r0 = r0.toArray(r4)
            vr4[] r0 = (defpackage.vr4[]) r0
            r3.<init>(r1, r5, r2, r0)
            return r3
        L11d:
            java.lang.String r5 = r0.getScheme()     // Catch: java.lang.Throwable -> L147
            java.lang.String r6 = "file"
            boolean r5 = defpackage.nb3.k(r5, r6)     // Catch: java.lang.Throwable -> L147
            if (r5 == 0) goto L14b
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L147
            if (r0 != 0) goto L130
            goto L149
        L130:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L147
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L147
            boolean r0 = r5.exists()     // Catch: java.lang.Throwable -> L147
            if (r0 == 0) goto L149
            boolean r0 = r5.isDirectory()     // Catch: java.lang.Throwable -> L147
            if (r0 == 0) goto L149
            vd5 r0 = new vd5     // Catch: java.lang.Throwable -> L147
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L147
            goto L15a
        L147:
            r0 = move-exception
            goto L154
        L149:
            r0 = r3
            goto L15a
        L14b:
            r11 = r27
            android.content.Context r5 = r11.b     // Catch: java.lang.Throwable -> L147
            qi6 r0 = defpackage.zl1.h(r5, r0)     // Catch: java.lang.Throwable -> L147
            goto L15a
        L154:
            em5 r5 = new em5
            r5.<init>(r0)
            r0 = r5
        L15a:
            boolean r5 = r0 instanceof defpackage.em5
            if (r5 == 0) goto L160
            goto L161
        L160:
            r3 = r0
        L161:
            zl1 r3 = (defpackage.zl1) r3
            if (r3 == 0) goto L16c
            boolean r0 = r3.k()     // Catch: java.lang.Throwable -> L16e
            if (r0 != r7) goto L16c
            goto L170
        L16c:
            r7 = r4
            goto L170
        L16e:
            r0 = move-exception
            goto L175
        L170:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L16e
            goto L17b
        L175:
            em5 r5 = new em5
            r5.<init>(r0)
            r0 = r5
        L17b:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r6 = r0 instanceof defpackage.em5
            if (r6 == 0) goto L182
            r0 = r5
        L182:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1d4
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r2.size()
            r0.<init>(r3)
            java.util.Set r3 = r2.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L19b:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L1b6
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getKey()
            bz0 r6 = defpackage.bz0.MISSING
            vr4 r7 = new vr4
            r7.<init>(r5, r6)
            r0.add(r7)
            goto L19b
        L1b6:
            dz0 r3 = new dz0
            cz0 r5 = defpackage.cz0.INVALID
            java.util.Set r2 = r2.keySet()
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.Object[] r2 = r2.toArray(r6)
            java.lang.String[] r2 = (java.lang.String[]) r2
            vr4[] r4 = new defpackage.vr4[r4]
            java.lang.Object[] r0 = r0.toArray(r4)
            vr4[] r0 = (defpackage.vr4[]) r0
            r3.<init>(r1, r5, r2, r0)
            return r3
        L1d4:
            if (r3 != 0) goto L220
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r2.size()
            r0.<init>(r3)
            java.util.Set r3 = r2.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1e7:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L202
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getKey()
            bz0 r6 = defpackage.bz0.MISSING
            vr4 r7 = new vr4
            r7.<init>(r5, r6)
            r0.add(r7)
            goto L1e7
        L202:
            dz0 r3 = new dz0
            cz0 r5 = defpackage.cz0.INVALID
            java.util.Set r2 = r2.keySet()
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.Object[] r2 = r2.toArray(r6)
            java.lang.String[] r2 = (java.lang.String[]) r2
            vr4[] r4 = new defpackage.vr4[r4]
            java.lang.Object[] r0 = r0.toArray(r4)
            vr4[] r0 = (defpackage.vr4[]) r0
            r3.<init>(r1, r5, r2, r0)
            return r3
        L220:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r5 = r2.size()
            r0.<init>(r5)
            java.util.Set r5 = r2.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L231:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L254
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.Object r6 = r6.getValue()
            qn2 r6 = (defpackage.qn2) r6
            java.lang.Object r6 = r6.g(r3)
            vr4 r8 = new vr4
            r8.<init>(r7, r6)
            r0.add(r8)
            goto L231
        L254:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L25b
            goto L273
        L25b:
            int r3 = r0.size()
            r5 = r4
        L260:
            if (r5 >= r3) goto L273
            java.lang.Object r6 = r0.get(r5)
            int r5 = r5 + 1
            vr4 r6 = (defpackage.vr4) r6
            java.lang.Object r6 = r6.B
            bz0 r7 = defpackage.bz0.PRESENT
            if (r6 == r7) goto L260
            cz0 r3 = defpackage.cz0.INVALID
            goto L275
        L273:
            cz0 r3 = defpackage.cz0.VALID
        L275:
            dz0 r5 = new dz0
            java.util.Set r2 = r2.keySet()
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.Object[] r2 = r2.toArray(r6)
            java.lang.String[] r2 = (java.lang.String[]) r2
            vr4[] r4 = new defpackage.vr4[r4]
            java.lang.Object[] r0 = r0.toArray(r4)
            vr4[] r0 = (defpackage.vr4[]) r0
            r5.<init>(r1, r3, r2, r0)
            return r5
    }

    public final defpackage.dz0 b(me.magnum.melonds.domain.model.ConsoleType r3) {
            r2 = this;
            r3.getClass()
            int[] r0 = defpackage.ez0.a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L1b
            r0 = 2
            if (r3 != r0) goto L17
            dz0 r2 = r2.c()
            return r2
        L17:
            defpackage.i.d()
            return r1
        L1b:
            kd6 r3 = r2.a
            ng6 r3 = (defpackage.ng6) r3
            android.content.SharedPreferences r3 = r3.b
            java.lang.String r0 = "bios_dir"
            java.util.Set r3 = r3.getStringSet(r0, r1)
            if (r3 == 0) goto L32
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object r3 = defpackage.gt0.I0(r3)
            java.lang.String r3 = (java.lang.String) r3
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 == 0) goto L39
            android.net.Uri r1 = android.net.Uri.parse(r3)
        L39:
            me.magnum.melonds.domain.model.ConsoleType r3 = me.magnum.melonds.domain.model.ConsoleType.DS
            dz0 r2 = r2.a(r3, r1)
            return r2
    }

    public final defpackage.dz0 c() {
            r5 = this;
            kd6 r0 = r5.a
            r1 = r0
            ng6 r1 = (defpackage.ng6) r1
            android.content.SharedPreferences r1 = r1.b
            java.lang.String r2 = "dsi_bios_dir"
            r3 = 0
            java.util.Set r1 = r1.getStringSet(r2, r3)
            if (r1 == 0) goto L19
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = defpackage.gt0.I0(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L1a
        L19:
            r1 = r3
        L1a:
            if (r1 == 0) goto L21
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L22
        L21:
            r1 = r3
        L22:
            me.magnum.melonds.domain.model.ConsoleType r2 = me.magnum.melonds.domain.model.ConsoleType.DSi
            dz0 r1 = r5.a(r2, r1)
            cz0 r2 = r1.b
            cz0 r4 = defpackage.cz0.VALID
            if (r2 == r4) goto L2f
            return r1
        L2f:
            ng6 r0 = (defpackage.ng6) r0
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "bios_dir"
            java.util.Set r0 = r0.getStringSet(r1, r3)
            if (r0 == 0) goto L44
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = defpackage.gt0.I0(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L45
        L44:
            r0 = r3
        L45:
            if (r0 == 0) goto L4b
            android.net.Uri r3 = android.net.Uri.parse(r0)
        L4b:
            me.magnum.melonds.domain.model.ConsoleType r0 = me.magnum.melonds.domain.model.ConsoleType.DS
            dz0 r5 = r5.a(r0, r3)
            return r5
    }

    public final defpackage.bz0 d(defpackage.zl1 r3, java.lang.String r4, long r5) {
            r2 = this;
            zl1 r3 = r3.f(r4)
            if (r3 != 0) goto L9
            bz0 r2 = defpackage.bz0.MISSING
            return r2
        L9:
            android.net.Uri r4 = r3.j()     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = r4.getScheme()     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = "file"
            boolean r4 = defpackage.nb3.k(r4, r0)     // Catch: java.lang.Throwable -> L65
            r0 = -1
            if (r4 == 0) goto L31
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L65
            android.net.Uri r3 = r3.j()     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = r3.getPath()     // Catch: java.lang.Throwable -> L65
            if (r3 != 0) goto L29
            java.lang.String r3 = ""
        L29:
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L65
            long r2 = r2.length()     // Catch: java.lang.Throwable -> L65
            goto L54
        L31:
            android.content.Context r2 = r2.b     // Catch: java.lang.Throwable -> L65
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L65
            android.net.Uri r3 = r3.j()     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "r"
            android.content.res.AssetFileDescriptor r2 = r2.openAssetFileDescriptor(r3, r4)     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto L53
            long r3 = r2.getLength()     // Catch: java.lang.Throwable -> L4c
            r2.close()     // Catch: java.lang.Throwable -> L65
            r2 = r3
            goto L54
        L4c:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L4e
        L4e:
            r4 = move-exception
            defpackage.ge7.t(r2, r3)     // Catch: java.lang.Throwable -> L65
            throw r4     // Catch: java.lang.Throwable -> L65
        L53:
            r2 = r0
        L54:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L5b
            bz0 r2 = defpackage.bz0.MISSING     // Catch: java.lang.Throwable -> L65
            goto L6c
        L5b:
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L62
            bz0 r2 = defpackage.bz0.PRESENT     // Catch: java.lang.Throwable -> L65
            goto L6c
        L62:
            bz0 r2 = defpackage.bz0.INVALID     // Catch: java.lang.Throwable -> L65
            goto L6c
        L65:
            r2 = move-exception
            em5 r3 = new em5
            r3.<init>(r2)
            r2 = r3
        L6c:
            bz0 r3 = defpackage.bz0.MISSING
            boolean r4 = r2 instanceof defpackage.em5
            if (r4 == 0) goto L73
            r2 = r3
        L73:
            bz0 r2 = (defpackage.bz0) r2
            return r2
    }
}
