package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class k4 implements defpackage.qn2 {
    public final /* synthetic */ int A;

    public /* synthetic */ k4(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public /* synthetic */ k4(defpackage.e70 r1) {
            r0 = this;
            r1 = 22
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r9) {
            r8 = this;
            int r8 = r8.A
            java.lang.String r0 = "leaderboard"
            java.lang.String r1 = "leaderboard-"
            r2 = 3
            r3 = 6
            jg7 r4 = defpackage.jg7.a
            r5 = 0
            r6 = 0
            r7 = 1
            switch(r8) {
                case 0: goto L31f;
                case 1: goto L317;
                case 2: goto L30b;
                case 3: goto L305;
                case 4: goto L2f4;
                case 5: goto L2b1;
                case 6: goto L2a5;
                case 7: goto L23e;
                case 8: goto L22e;
                case 9: goto L211;
                case 10: goto L20e;
                case 11: goto L204;
                case 12: goto L1fa;
                case 13: goto L1f7;
                case 14: goto L1eb;
                case 15: goto L1df;
                case 16: goto L1d3;
                case 17: goto L1c9;
                case 18: goto L1bd;
                case 19: goto L1b8;
                case 20: goto L1b2;
                case 21: goto L1a3;
                case 22: goto Lf7;
                case 23: goto Le6;
                case 24: goto Lc2;
                case 25: goto Lbc;
                case 26: goto Lb6;
                case 27: goto L6d;
                case 28: goto L56;
                default: goto L10;
            }
        L10:
            java.util.List r9 = (java.util.List) r9
            r9.getClass()
            java.lang.Object r8 = r9.get(r5)
            boolean r0 = r8 instanceof java.lang.Integer
            if (r0 == 0) goto L20
            java.lang.Integer r8 = (java.lang.Integer) r8
            goto L21
        L20:
            r8 = r6
        L21:
            if (r8 != 0) goto L24
            goto L2d
        L24:
            int r0 = r8.intValue()
            if (r0 != 0) goto L2d
            hn0 r6 = defpackage.hn0.b
            goto L55
        L2d:
            if (r8 != 0) goto L30
            goto L39
        L30:
            int r0 = r8.intValue()
            if (r0 != r7) goto L39
            in0 r6 = defpackage.in0.b
            goto L55
        L39:
            if (r8 != 0) goto L3c
            goto L55
        L3c:
            int r8 = r8.intValue()
            r0 = 2
            if (r8 != r0) goto L55
            gn0 r6 = new gn0
            java.lang.Object r8 = r9.get(r7)
            r8.getClass()
            ho0 r8 = (defpackage.ho0) r8
            me.magnum.melonds.domain.model.Cheat r8 = r8.a()
            r6.<init>(r8)
        L55:
            return r6
        L56:
            e36 r9 = (defpackage.e36) r9
            r9.getClass()
            java.lang.String r8 = "DELETE FROM cheat_folder WHERE id NOT IN (SELECT DISTINCT cheat_folder_id FROM cheat)"
            j36 r8 = r9.i0(r8)
            r8.f0()     // Catch: java.lang.Throwable -> L68
            r8.close()
            return r4
        L68:
            r9 = move-exception
            r8.close()
            throw r9
        L6d:
            e36 r9 = (defpackage.e36) r9
            r9.getClass()
            java.lang.String r8 = "SELECT * FROM cheat_database"
            j36 r8 = r9.i0(r8)
            java.lang.String r9 = "id"
            int r9 = defpackage.ej2.B(r8, r9)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "name"
            int r0 = defpackage.ej2.B(r8, r0)     // Catch: java.lang.Throwable -> Lac
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lac
            r1.<init>()     // Catch: java.lang.Throwable -> Lac
        L89:
            boolean r2 = r8.f0()     // Catch: java.lang.Throwable -> Lac
            if (r2 == 0) goto Lae
            boolean r2 = r8.isNull(r9)     // Catch: java.lang.Throwable -> Lac
            if (r2 == 0) goto L97
            r2 = r6
            goto L9f
        L97:
            long r2 = r8.getLong(r9)     // Catch: java.lang.Throwable -> Lac
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Lac
        L9f:
            java.lang.String r3 = r8.R(r0)     // Catch: java.lang.Throwable -> Lac
            ym0 r4 = new ym0     // Catch: java.lang.Throwable -> Lac
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> Lac
            r1.add(r4)     // Catch: java.lang.Throwable -> Lac
            goto L89
        Lac:
            r9 = move-exception
            goto Lb2
        Lae:
            r8.close()
            return r1
        Lb2:
            r8.close()
            throw r9
        Lb6:
            a47 r9 = (defpackage.a47) r9
            r9.getClass()
            return r4
        Lbc:
            gb6 r9 = (defpackage.gb6) r9
            defpackage.eb6.d(r9, r5)
            return r4
        Lc2:
            xv4 r9 = (defpackage.xv4) r9
            nq6 r8 = defpackage.kf.b
            r9.getClass()
            java.lang.Object r8 = defpackage.q60.U(r9, r8)
            android.content.Context r8 = (android.content.Context) r8
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            java.lang.String r9 = "android.software.leanback"
            boolean r8 = r8.hasSystemFeature(r9)
            if (r8 != 0) goto Le3
            y70 r8 = defpackage.z70.a
            r8.getClass()
            x70 r8 = defpackage.y70.c
            goto Le5
        Le3:
            a80 r8 = defpackage.b80.b
        Le5:
            return r8
        Le6:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            java.lang.String r8 = "/.."
            boolean r8 = defpackage.qs6.j0(r9, r8, r5)
            r8 = r8 ^ r7
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        Lf7:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            r8 = 9
            int r8 = defpackage.qs6.s0(r8, r5, r3, r9)
            r0 = -1
            if (r8 == r0) goto L114
            java.lang.String r0 = r9.substring(r5, r8)
            int r8 = r8 + r7
            java.lang.String r8 = r9.substring(r8)
            vr4 r9 = new vr4
            r9.<init>(r0, r8)
            goto L11c
        L114:
            vr4 r8 = new vr4
            java.lang.String r0 = "DS"
            r8.<init>(r0, r9)
            r9 = r8
        L11c:
            java.lang.Object r8 = r9.A
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r9.B
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = "DSI"
            boolean r8 = defpackage.nb3.k(r8, r0)
            if (r8 == 0) goto L12f
            java.lang.String r8 = "https://thumbnails.libretro.com/Nintendo%20-%20Nintendo%20DSi/Named_Boxarts/"
            goto L131
        L12f:
            java.lang.String r8 = "https://thumbnails.libretro.com/Nintendo%20-%20Nintendo%20DS/Named_Boxarts/"
        L131:
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r9, r0)     // Catch: java.lang.Throwable -> L138
            goto L13f
        L138:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L13f:
            boolean r1 = r0 instanceof defpackage.em5
            if (r1 == 0) goto L145
            r0 = r9
        L145:
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            java.lang.String r1 = ".png"
            java.lang.String r0 = defpackage.qs6.E0(r0, r1)
            java.lang.String r1 = " ("
            java.lang.String r0 = defpackage.qs6.Q0(r0, r1)
            java.lang.String r0 = defpackage.e70.f(r0)
            boolean r1 = defpackage.qs6.v0(r0)
            if (r1 != 0) goto L1a2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r9)
            java.lang.String r8 = r1.toString()
            char[] r9 = new char[r7]
            r1 = 32
            r9[r5] = r1
            java.util.List r9 = defpackage.qs6.J0(r0, r9, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L182:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L199
            java.lang.Object r2 = r9.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L182
            r1.add(r2)
            goto L182
        L199:
            java.util.Set r9 = defpackage.gt0.p1(r1)
            d70 r6 = new d70
            r6.<init>(r8, r0, r9)
        L1a2:
            return r6
        L1a3:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            boolean r8 = defpackage.qs6.v0(r9)
            r8 = r8 ^ r7
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L1b2:
            um3 r9 = (defpackage.um3) r9
            r9.b()
            return r4
        L1b8:
            a47 r9 = (defpackage.a47) r9
            int r8 = defpackage.k30.a
            return r4
        L1bd:
            yn r9 = (defpackage.yn) r9
            int r8 = me.magnum.melonds.ui.backgrounds.BackgroundsActivity.B0
            r9.getClass()
            z72 r8 = defpackage.i52.e(r6, r2)
            return r8
        L1c9:
            yn r9 = (defpackage.yn) r9
            int r8 = me.magnum.melonds.ui.backgrounds.BackgroundsActivity.B0
            r9.getClass()
            o52 r8 = defpackage.o52.b
            return r8
        L1d3:
            yn r9 = (defpackage.yn) r9
            int r8 = me.magnum.melonds.ui.backgrounds.BackgroundsActivity.B0
            r9.getClass()
            o52 r8 = defpackage.i52.d(r6, r2)
            return r8
        L1df:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            int r8 = -r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L1eb:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            int r8 = -r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L1f7:
            hw r9 = (defpackage.hw) r9
            return r9
        L1fa:
            rd3 r9 = (defpackage.rd3) r9
            r9.getClass()
            r9.b = r7
            r9.a = r5
            return r4
        L204:
            bp r9 = (defpackage.bp) r9
            boolean r8 = r9 instanceof defpackage.ds4
            r8 = r8 ^ r7
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L20e:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L211:
            java.io.File r9 = (java.io.File) r9
            r9.getClass()
            boolean r8 = r9.isFile()
            if (r8 == 0) goto L229
            java.lang.String r8 = defpackage.jc2.y0(r9)
            java.lang.String r9 = "so"
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L229
            r5 = r7
        L229:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            return r8
        L22e:
            android.content.Context r9 = (android.content.Context) r9
            r9.getClass()
            boolean r8 = r9 instanceof android.content.ContextWrapper
            if (r8 == 0) goto L23d
            android.content.ContextWrapper r9 = (android.content.ContextWrapper) r9
            android.content.Context r6 = r9.getBaseContext()
        L23d:
            return r6
        L23e:
            v3 r9 = (defpackage.v3) r9
            r9.getClass()
            boolean r8 = r9 instanceof defpackage.k3
            if (r8 == 0) goto L252
            k3 r9 = (defpackage.k3) r9
            long r8 = r9.c
            java.lang.String r0 = "primed-"
        L24d:
            java.lang.String r6 = defpackage.lb1.h(r8, r0)
            goto L2a4
        L252:
            boolean r8 = r9 instanceof defpackage.l3
            if (r8 == 0) goto L25d
            l3 r9 = (defpackage.l3) r9
            long r8 = r9.f
            java.lang.String r0 = "progress-"
            goto L24d
        L25d:
            boolean r8 = r9 instanceof defpackage.o3
            if (r8 == 0) goto L268
            o3 r9 = (defpackage.o3) r9
            long r8 = r9.f
            java.lang.String r0 = "leaderboard-attempt-"
            goto L24d
        L268:
            boolean r8 = r9 instanceof defpackage.p3
            if (r8 == 0) goto L273
            p3 r9 = (defpackage.p3) r9
            long r8 = r9.g
            java.lang.String r0 = "leaderboard-result-"
            goto L24d
        L273:
            boolean r8 = r9 instanceof defpackage.r3
            if (r8 == 0) goto L27e
            r3 r9 = (defpackage.r3) r9
            long r8 = r9.f
            java.lang.String r0 = "leaderboard-pending-"
            goto L24d
        L27e:
            boolean r8 = r9 instanceof defpackage.q3
            if (r8 == 0) goto L28b
            q3 r9 = (defpackage.q3) r9
            long r8 = r9.j
            java.lang.String r6 = defpackage.lb1.h(r8, r1)
            goto L2a4
        L28b:
            boolean r8 = r9 instanceof defpackage.m3
            if (r8 == 0) goto L296
            m3 r9 = (defpackage.m3) r9
            long r8 = r9.d
            java.lang.String r0 = "challenge-result-"
            goto L24d
        L296:
            boolean r8 = r9 instanceof defpackage.u3
            if (r8 == 0) goto L2a1
            u3 r9 = (defpackage.u3) r9
            long r8 = r9.d
            java.lang.String r0 = "server-error-"
            goto L24d
        L2a1:
            defpackage.i.d()
        L2a4:
            return r6
        L2a5:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            int r8 = -r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L2b1:
            yn r9 = (defpackage.yn) r9
            r9.getClass()
            java.lang.Object r8 = r9.c()
            h05 r9 = defpackage.h05.SHOW_TITLE
            if (r8 != r9) goto L2cd
            r8 = 13
            o52 r8 = defpackage.i52.a(r8)
            z72 r9 = defpackage.i52.e(r6, r2)
            b41 r8 = defpackage.f04.U(r8, r9)
            goto L2f3
        L2cd:
            vn0 r8 = new vn0
            r8.<init>(r3)
            o52 r8 = defpackage.i52.i(r7, r8)
            o52 r9 = defpackage.i52.d(r6, r2)
            o52 r8 = r8.a(r9)
            k4 r9 = new k4
            r9.<init>(r3)
            z72 r9 = defpackage.i52.k(r9)
            z72 r0 = defpackage.i52.e(r6, r2)
            z72 r9 = r9.a(r0)
            b41 r8 = defpackage.f04.U(r8, r9)
        L2f3:
            return r8
        L2f4:
            h3 r9 = (defpackage.h3) r9
            r9.getClass()
            java.util.List r8 = r9.b
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r7
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L305:
            ta5 r9 = (defpackage.ta5) r9
            r9.getClass()
            return r0
        L30b:
            ta5 r9 = (defpackage.ta5) r9
            r9.getClass()
            long r8 = r9.a
            java.lang.String r8 = defpackage.lb1.h(r8, r1)
            return r8
        L317:
            o6 r9 = (defpackage.o6) r9
            r9.getClass()
            java.lang.String r8 = "achievement"
            return r8
        L31f:
            za5 r9 = (defpackage.za5) r9
            r9.getClass()
            return r0
    }
}
