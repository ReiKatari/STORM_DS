package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bz1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bz1 implements defpackage.qn2 {
    public final /* synthetic */ int A;

    public /* synthetic */ bz1(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public /* synthetic */ bz1(me.magnum.melonds.ui.inputsetup.InputSetupActivity r1) {
            r0 = this;
            r1 = 23
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r11) {
            r10 = this;
            int r10 = r10.A
            r0 = 0
            r1 = 45
            r2 = 2
            r3 = 0
            r4 = 1
            switch(r10) {
                case 0: goto L332;
                case 1: goto L326;
                case 2: goto L317;
                case 3: goto L305;
                case 4: goto L2f3;
                case 5: goto L2e3;
                case 6: goto L2db;
                case 7: goto L2c2;
                case 8: goto L265;
                case 9: goto L253;
                case 10: goto L225;
                case 11: goto L1f7;
                case 12: goto L1d9;
                case 13: goto L1b8;
                case 14: goto L18a;
                case 15: goto L16c;
                case 16: goto L14e;
                case 17: goto L11a;
                case 18: goto L10d;
                case 19: goto L108;
                case 20: goto Lfc;
                case 21: goto Ldd;
                case 22: goto Ld8;
                case 23: goto Lb2;
                case 24: goto La5;
                case 25: goto L9d;
                case 26: goto L2f;
                case 27: goto L27;
                case 28: goto L19;
                default: goto Lb;
            }
        Lb:
            java.lang.Character r11 = (java.lang.Character) r11
            char r10 = r11.charValue()
            if (r10 != r1) goto L14
            r3 = r4
        L14:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        L19:
            java.lang.Character r11 = (java.lang.Character) r11
            char r10 = r11.charValue()
            if (r10 != r1) goto L22
            r3 = r4
        L22:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        L27:
            i63 r11 = (defpackage.i63) r11
            r11.getClass()
            b63 r10 = r11.a
            return r10
        L2f:
            java.lang.String r10 = " "
            java.lang.String r1 = "_"
            h63 r11 = (defpackage.h63) r11
            java.lang.String r2 = ""
            r11.getClass()
            boolean r3 = r11 instanceof defpackage.f63
            if (r3 == 0) goto L5c
            f63 r11 = (defpackage.f63) r11
            int r11 = r11.b
            java.lang.String r11 = android.view.KeyEvent.keyCodeToString(r11)
            r11.getClass()
            java.lang.String r0 = "KEYCODE"
            java.lang.String r11 = defpackage.xs6.e0(r11, r0, r2)
            java.lang.String r10 = defpackage.xs6.e0(r11, r1, r10)
            java.lang.CharSequence r10 = defpackage.qs6.T0(r10)
            java.lang.String r0 = r10.toString()
            goto L9c
        L5c:
            boolean r3 = r11 instanceof defpackage.e63
            if (r3 == 0) goto L8f
            e63 r11 = (defpackage.e63) r11
            int r0 = r11.b
            java.lang.String r0 = android.view.MotionEvent.axisToString(r0)
            r0.getClass()
            java.lang.String r10 = defpackage.xs6.e0(r0, r1, r10)
            java.lang.CharSequence r10 = defpackage.qs6.T0(r10)
            java.lang.String r10 = r10.toString()
            d63 r11 = r11.c
            d63 r0 = defpackage.d63.NEGATIVE
            if (r11 != r0) goto L7f
            java.lang.String r2 = "-"
        L7f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r11.append(r10)
            java.lang.String r0 = r11.toString()
            goto L9c
        L8f:
            g63 r10 = defpackage.g63.a
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L99
            r0 = r2
            goto L9c
        L99:
            defpackage.i.d()
        L9c:
            return r0
        L9d:
            i63 r11 = (defpackage.i63) r11
            r11.getClass()
            b63 r10 = r11.a
            return r10
        La5:
            android.view.InputDevice$MotionRange r11 = (android.view.InputDevice.MotionRange) r11
            int r10 = me.magnum.melonds.ui.inputsetup.InputSetupActivity.D0
            int r10 = r11.getAxis()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
        Lb2:
            android.view.InputDevice$MotionRange r11 = (android.view.InputDevice.MotionRange) r11
            int r10 = me.magnum.melonds.ui.inputsetup.InputSetupActivity.D0
            r11.getClass()
            r10 = 16
            boolean r10 = r11.isFromSource(r10)
            if (r10 != 0) goto Ld2
            r10 = 16777232(0x1000010, float:2.3509932E-38)
            boolean r10 = r11.isFromSource(r10)
            if (r10 != 0) goto Ld2
            r10 = 1025(0x401, float:1.436E-42)
            boolean r10 = r11.isFromSource(r10)
            if (r10 == 0) goto Ld3
        Ld2:
            r3 = r4
        Ld3:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        Ld8:
            cx4 r11 = (defpackage.cx4) r11
            jg7 r10 = defpackage.jg7.a
            return r10
        Ldd:
            java.lang.Object r10 = defpackage.bm6.c
            monitor-enter(r10)
            java.util.List r0 = defpackage.bm6.i     // Catch: java.lang.Throwable -> Lf4
            int r1 = r0.size()     // Catch: java.lang.Throwable -> Lf4
        Le6:
            if (r3 >= r1) goto Lf6
            java.lang.Object r2 = r0.get(r3)     // Catch: java.lang.Throwable -> Lf4
            qn2 r2 = (defpackage.qn2) r2     // Catch: java.lang.Throwable -> Lf4
            r2.g(r11)     // Catch: java.lang.Throwable -> Lf4
            int r3 = r3 + 1
            goto Le6
        Lf4:
            r11 = move-exception
            goto Lfa
        Lf6:
            monitor-exit(r10)
            jg7 r10 = defpackage.jg7.a
            return r10
        Lfa:
            monitor-exit(r10)
            throw r11
        Lfc:
            ki5 r11 = (defpackage.ki5) r11
            r11.getClass()
            boolean r10 = r11.g
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        L108:
            ta7 r11 = (defpackage.ta7) r11
            java.lang.String r10 = r11.b
            return r10
        L10d:
            ta7 r11 = (defpackage.ta7) r11
            java.lang.String r10 = r11.a
            java.lang.CharSequence r10 = defpackage.qs6.T0(r10)
            java.lang.String r10 = r10.toString()
            return r10
        L11a:
            n14 r11 = (defpackage.n14) r11
            r11.getClass()
            java.util.List r10 = r11.a()
            l14 r10 = (defpackage.l14) r10
            java.lang.Object r10 = r10.get(r4)
            java.util.List r11 = r11.a()
            l14 r11 = (defpackage.l14) r11
            java.lang.Object r11 = r11.get(r2)
            java.lang.String r11 = (java.lang.String) r11
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r11 = r11.toUpperCase(r0)
            r11.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = r0.toString()
            return r10
        L14e:
            n14 r11 = (defpackage.n14) r11
            r11.getClass()
            java.util.List r10 = r11.a()
            l14 r10 = (defpackage.l14) r10
            java.lang.Object r10 = r10.get(r4)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "B"
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            return r10
        L16c:
            n14 r11 = (defpackage.n14) r11
            r11.getClass()
            java.util.List r10 = r11.a()
            l14 r10 = (defpackage.l14) r10
            java.lang.Object r10 = r10.get(r4)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "S"
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            return r10
        L18a:
            n14 r11 = (defpackage.n14) r11
            r11.getClass()
            java.util.List r10 = r11.a()
            l14 r10 = (defpackage.l14) r10
            java.lang.Object r10 = r10.get(r4)
            java.util.List r11 = r11.a()
            l14 r11 = (defpackage.l14) r11
            java.lang.Object r11 = r11.get(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = "o"
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = r0.toString()
            return r10
        L1b8:
            n14 r11 = (defpackage.n14) r11
            r11.getClass()
            java.util.List r10 = r11.a()
            l14 r10 = (defpackage.l14) r10
            java.lang.Object r10 = r10.get(r4)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r10 = "l"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            return r10
        L1d9:
            n14 r11 = (defpackage.n14) r11
            r11.getClass()
            java.util.List r10 = r11.a()
            l14 r10 = (defpackage.l14) r10
            java.lang.Object r10 = r10.get(r4)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "l"
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            return r10
        L1f7:
            n14 r11 = (defpackage.n14) r11
            r11.getClass()
            java.util.List r10 = r11.a()
            l14 r10 = (defpackage.l14) r10
            java.lang.Object r10 = r10.get(r4)
            java.util.List r11 = r11.a()
            l14 r11 = (defpackage.l14) r11
            java.lang.Object r11 = r11.get(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = "l"
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = r0.toString()
            return r10
        L225:
            n14 r11 = (defpackage.n14) r11
            r11.getClass()
            java.util.List r10 = r11.a()
            l14 r10 = (defpackage.l14) r10
            java.lang.Object r10 = r10.get(r4)
            java.util.List r11 = r11.a()
            l14 r11 = (defpackage.l14) r11
            java.lang.Object r11 = r11.get(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = "l"
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = r0.toString()
            return r10
        L253:
            yn r11 = (defpackage.yn) r11
            r11.getClass()
            r10 = 13
            o52 r10 = defpackage.i52.a(r10)
            z72 r11 = defpackage.z72.b
            b41 r10 = defpackage.f04.U(r10, r11)
            return r10
        L265:
            java.lang.String r10 = "SELECT * FROM game"
            e36 r11 = (defpackage.e36) r11
            r11.getClass()
            j36 r10 = r11.i0(r10)
            java.lang.String r11 = "id"
            int r11 = defpackage.ej2.B(r10, r11)     // Catch: java.lang.Throwable -> L2b8
            java.lang.String r1 = "name"
            int r1 = defpackage.ej2.B(r10, r1)     // Catch: java.lang.Throwable -> L2b8
            java.lang.String r2 = "game_code"
            int r2 = defpackage.ej2.B(r10, r2)     // Catch: java.lang.Throwable -> L2b8
            java.lang.String r3 = "game_checksum"
            int r3 = defpackage.ej2.B(r10, r3)     // Catch: java.lang.Throwable -> L2b8
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b8
            r4.<init>()     // Catch: java.lang.Throwable -> L2b8
        L28d:
            boolean r5 = r10.f0()     // Catch: java.lang.Throwable -> L2b8
            if (r5 == 0) goto L2ba
            boolean r5 = r10.isNull(r11)     // Catch: java.lang.Throwable -> L2b8
            if (r5 == 0) goto L29b
            r5 = r0
            goto L2a3
        L29b:
            long r5 = r10.getLong(r11)     // Catch: java.lang.Throwable -> L2b8
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L2b8
        L2a3:
            java.lang.String r6 = r10.R(r1)     // Catch: java.lang.Throwable -> L2b8
            java.lang.String r7 = r10.R(r2)     // Catch: java.lang.Throwable -> L2b8
            java.lang.String r8 = r10.R(r3)     // Catch: java.lang.Throwable -> L2b8
            lp2 r9 = new lp2     // Catch: java.lang.Throwable -> L2b8
            r9.<init>(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2b8
            r4.add(r9)     // Catch: java.lang.Throwable -> L2b8
            goto L28d
        L2b8:
            r11 = move-exception
            goto L2be
        L2ba:
            r10.close()
            return r4
        L2be:
            r10.close()
            throw r11
        L2c2:
            java.lang.String r10 = "DELETE FROM game WHERE id NOT IN (SELECT DISTINCT game_id FROM cheat_folder)"
            e36 r11 = (defpackage.e36) r11
            r11.getClass()
            j36 r10 = r11.i0(r10)
            r10.f0()     // Catch: java.lang.Throwable -> L2d6
            r10.close()
            jg7 r10 = defpackage.jg7.a
            return r10
        L2d6:
            r11 = move-exception
            r10.close()
            throw r11
        L2db:
            gb6 r11 = (defpackage.gb6) r11
            defpackage.eb6.d(r11, r3)
            jg7 r10 = defpackage.jg7.a
            return r10
        L2e3:
            android.view.View r11 = (android.view.View) r11
            java.util.List r10 = me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference.B
            r11.getClass()
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            ev r10 = new ev
            r0 = 5
            r10.<init>(r11, r0)
            return r10
        L2f3:
            co0 r11 = (defpackage.co0) r11
            r11.getClass()
            me.magnum.melonds.domain.model.Cheat r10 = r11.a
            java.lang.Long r11 = r10.getId()
            if (r11 != 0) goto L304
            java.lang.String r11 = r10.getCode()
        L304:
            return r11
        L305:
            vb5 r11 = (defpackage.vb5) r11
            yb5 r10 = r11.a
            java.lang.String r10 = r10.name()
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toLowerCase(r11)
            r10.getClass()
            return r10
        L317:
            sj4 r11 = (defpackage.sj4) r11
            r11.getClass()
            me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement r10 = new me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement
            long r0 = r11.a
            java.lang.String r11 = r11.b
            r10.<init>(r0, r11)
            return r10
        L326:
            yj4 r11 = (defpackage.yj4) r11
            r11.getClass()
            long r10 = r11.a
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            return r10
        L332:
            ta5 r11 = (defpackage.ta5) r11
            r11.getClass()
            yj4 r10 = new yj4
            long r0 = r11.a
            java.lang.String r2 = r11.d
            java.lang.String r11 = r11.e
            r10.<init>(r0, r2, r11)
            return r10
    }
}
