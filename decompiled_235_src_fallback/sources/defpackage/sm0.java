package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sm0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sm0 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.String B;
    public final /* synthetic */ java.lang.String L;

    public /* synthetic */ sm0(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.L = r3
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r23) {
            r22 = this;
            r0 = r22
            int r1 = r0.A
            java.lang.String r2 = "name"
            java.lang.String r3 = "id"
            r4 = 2
            r5 = 1
            r6 = 0
            java.lang.String r7 = r0.L
            java.lang.String r0 = r0.B
            switch(r1) {
                case 0: goto L6b;
                default: goto L12;
            }
        L12:
            r1 = r23
            e36 r1 = (defpackage.e36) r1
            r1.getClass()
            java.lang.String r8 = "SELECT * FROM game WHERE game_code = ? AND game_checksum = ?"
            j36 r1 = r1.i0(r8)
            r1.w(r5, r0)     // Catch: java.lang.Throwable -> L61
            r1.w(r4, r7)     // Catch: java.lang.Throwable -> L61
            int r0 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L61
            int r2 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "game_code"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = "game_checksum"
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L61
            boolean r5 = r1.f0()     // Catch: java.lang.Throwable -> L61
            if (r5 == 0) goto L63
            boolean r5 = r1.isNull(r0)     // Catch: java.lang.Throwable -> L61
            if (r5 == 0) goto L46
            goto L4e
        L46:
            long r5 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.Long r6 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L61
        L4e:
            java.lang.String r0 = r1.R(r2)     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = r1.R(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = r1.R(r4)     // Catch: java.lang.Throwable -> L61
            lp2 r4 = new lp2     // Catch: java.lang.Throwable -> L61
            r4.<init>(r6, r0, r2, r3)     // Catch: java.lang.Throwable -> L61
            r6 = r4
            goto L63
        L61:
            r0 = move-exception
            goto L67
        L63:
            r1.close()
            return r6
        L67:
            r1.close()
            throw r0
        L6b:
            r1 = r23
            e36 r1 = (defpackage.e36) r1
            r1.getClass()
            java.lang.String r8 = "SELECT cheat.* FROM game LEFT JOIN cheat_folder ON game.id = cheat_folder.game_id LEFT JOIN cheat ON cheat_folder.id = cheat.cheat_folder_id WHERE game.game_code = ? AND (? IS NULL OR game.game_checksum IS NULL OR game.game_checksum = ?) AND cheat.enabled = 1"
            j36 r1 = r1.i0(r8)
            r1.w(r5, r0)     // Catch: java.lang.Throwable -> Lf9
            r1.w(r4, r7)     // Catch: java.lang.Throwable -> Lf9
            r0 = 3
            r1.w(r0, r7)     // Catch: java.lang.Throwable -> Lf9
            int r0 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r3 = "cheat_folder_id"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r4 = "cheat_database_id"
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> Lf9
            int r2 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r7 = "description"
            int r7 = defpackage.ej2.B(r1, r7)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r8 = "code"
            int r8 = defpackage.ej2.B(r1, r8)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r9 = "enabled"
            int r9 = defpackage.ej2.B(r1, r9)     // Catch: java.lang.Throwable -> Lf9
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf9
            r10.<init>()     // Catch: java.lang.Throwable -> Lf9
        Lad:
            boolean r11 = r1.f0()     // Catch: java.lang.Throwable -> Lf9
            if (r11 == 0) goto Lfb
            boolean r11 = r1.isNull(r0)     // Catch: java.lang.Throwable -> Lf9
            if (r11 == 0) goto Lbb
            r13 = r6
            goto Lc4
        Lbb:
            long r11 = r1.getLong(r0)     // Catch: java.lang.Throwable -> Lf9
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> Lf9
            r13 = r11
        Lc4:
            long r14 = r1.getLong(r3)     // Catch: java.lang.Throwable -> Lf9
            long r16 = r1.getLong(r4)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r18 = r1.R(r2)     // Catch: java.lang.Throwable -> Lf9
            boolean r11 = r1.isNull(r7)     // Catch: java.lang.Throwable -> Lf9
            if (r11 == 0) goto Ld9
            r19 = r6
            goto Ldf
        Ld9:
            java.lang.String r11 = r1.R(r7)     // Catch: java.lang.Throwable -> Lf9
            r19 = r11
        Ldf:
            java.lang.String r20 = r1.R(r8)     // Catch: java.lang.Throwable -> Lf9
            long r11 = r1.getLong(r9)     // Catch: java.lang.Throwable -> Lf9
            int r11 = (int) r11     // Catch: java.lang.Throwable -> Lf9
            if (r11 == 0) goto Led
            r21 = r5
            goto Lf0
        Led:
            r11 = 0
            r21 = r11
        Lf0:
            zm0 r12 = new zm0     // Catch: java.lang.Throwable -> Lf9
            r12.<init>(r13, r14, r16, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> Lf9
            r10.add(r12)     // Catch: java.lang.Throwable -> Lf9
            goto Lad
        Lf9:
            r0 = move-exception
            goto Lff
        Lfb:
            r1.close()
            return r10
        Lff:
            r1.close()
            throw r0
    }
}
