package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dv4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dv4 implements defpackage.qn2 {
    public final /* synthetic */ int A;

    public /* synthetic */ dv4(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public /* synthetic */ dv4(defpackage.uh1 r1) {
            r0 = this;
            r1 = 3
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            int r0 = r0.A
            r1 = 1133576192(0x43910000, float:290.0)
            r2 = 666(0x29a, float:9.33E-43)
            r3 = 1332(0x534, float:1.867E-42)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1800(0x708, float:2.522E-42)
            r6 = 1
            r7 = 0
            r8 = 0
            jg7 r9 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L35b;
                case 1: goto L349;
                case 2: goto L33b;
                case 3: goto L318;
                case 4: goto L311;
                case 5: goto L2b9;
                case 6: goto L29f;
                case 7: goto L298;
                case 8: goto L27c;
                case 9: goto L260;
                case 10: goto L242;
                case 11: goto L224;
                case 12: goto L208;
                case 13: goto L1f6;
                case 14: goto L1ee;
                case 15: goto L1e7;
                case 16: goto L1b5;
                case 17: goto L19c;
                case 18: goto L18e;
                case 19: goto L180;
                case 20: goto L168;
                case 21: goto L150;
                case 22: goto L130;
                case 23: goto Ld7;
                case 24: goto Lad;
                case 25: goto L94;
                case 26: goto L7b;
                case 27: goto L62;
                case 28: goto L2f;
                default: goto L16;
            }
        L16:
            r0 = r18
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "DELETE FROM ra_game_hash_library"
            j36 r1 = r0.i0(r1)
            r1.f0()     // Catch: java.lang.Throwable -> L2a
            r1.close()
            return r9
        L2a:
            r0 = move-exception
            r1.close()
            throw r0
        L2f:
            r0 = r18
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "\n        SELECT gh.game_hash AS hash, g.icon AS iconUrl\n        FROM ra_game_hash_library gh\n        INNER JOIN ra_game g ON g.game_id = gh.game_id\n    "
            j36 r1 = r0.i0(r1)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L58
            r0.<init>()     // Catch: java.lang.Throwable -> L58
        L41:
            boolean r2 = r1.f0()     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L5a
            java.lang.String r2 = r1.R(r8)     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = r1.R(r6)     // Catch: java.lang.Throwable -> L58
            nw2 r4 = new nw2     // Catch: java.lang.Throwable -> L58
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> L58
            r0.add(r4)     // Catch: java.lang.Throwable -> L58
            goto L41
        L58:
            r0 = move-exception
            goto L5e
        L5a:
            r1.close()
            return r0
        L5e:
            r1.close()
            throw r0
        L62:
            r0 = r18
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "DELETE FROM ra_pending_achievement_award"
            j36 r1 = r0.i0(r1)
            r1.f0()     // Catch: java.lang.Throwable -> L76
            r1.close()
            return r9
        L76:
            r0 = move-exception
            r1.close()
            throw r0
        L7b:
            r0 = r18
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "UPDATE ra_game_set_metadata SET last_user_data_updated = NULL, last_hardcore_user_data_updated = NULL"
            j36 r1 = r0.i0(r1)
            r1.f0()     // Catch: java.lang.Throwable -> L8f
            r1.close()
            return r9
        L8f:
            r0 = move-exception
            r1.close()
            throw r0
        L94:
            r0 = r18
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "DELETE FROM ra_user_achievement"
            j36 r1 = r0.i0(r1)
            r1.f0()     // Catch: java.lang.Throwable -> La8
            r1.close()
            return r9
        La8:
            r0 = move-exception
            r1.close()
            throw r0
        Lad:
            r0 = r18
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT game_hash FROM ra_game_hash_library"
            j36 r1 = r0.i0(r1)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcd
            r0.<init>()     // Catch: java.lang.Throwable -> Lcd
        Lbf:
            boolean r2 = r1.f0()     // Catch: java.lang.Throwable -> Lcd
            if (r2 == 0) goto Lcf
            java.lang.String r2 = r1.R(r8)     // Catch: java.lang.Throwable -> Lcd
            r0.add(r2)     // Catch: java.lang.Throwable -> Lcd
            goto Lbf
        Lcd:
            r0 = move-exception
            goto Ld3
        Lcf:
            r1.close()
            return r0
        Ld3:
            r1.close()
            throw r0
        Ld7:
            r0 = r18
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM ra_pending_achievement_award"
            j36 r1 = r0.i0(r1)
            java.lang.String r0 = "achievement_id"
            int r0 = defpackage.ej2.B(r1, r0)     // Catch: java.lang.Throwable -> L126
            java.lang.String r2 = "game_id"
            int r2 = defpackage.ej2.B(r1, r2)     // Catch: java.lang.Throwable -> L126
            java.lang.String r3 = "for_hardcore_mode"
            int r3 = defpackage.ej2.B(r1, r3)     // Catch: java.lang.Throwable -> L126
            java.lang.String r4 = "created_at_epoch_ms"
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L126
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L126
            r5.<init>()     // Catch: java.lang.Throwable -> L126
        L101:
            boolean r7 = r1.f0()     // Catch: java.lang.Throwable -> L126
            if (r7 == 0) goto L128
            long r10 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L126
            long r12 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L126
            long r14 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L126
            int r7 = (int) r14     // Catch: java.lang.Throwable -> L126
            if (r7 == 0) goto L118
            r14 = r6
            goto L119
        L118:
            r14 = r8
        L119:
            long r15 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L126
            ab5 r9 = new ab5     // Catch: java.lang.Throwable -> L126
            r9.<init>(r10, r12, r14, r15)     // Catch: java.lang.Throwable -> L126
            r5.add(r9)     // Catch: java.lang.Throwable -> L126
            goto L101
        L126:
            r0 = move-exception
            goto L12c
        L128:
            r1.close()
            return r5
        L12c:
            r1.close()
            throw r0
        L130:
            r0 = r18
            vr4 r0 = (defpackage.vr4) r0
            r0.getClass()
            java.lang.Object r1 = r0.A
            java.lang.Object r0 = r0.B
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ":"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L150:
            r0 = r18
            vj5 r0 = (defpackage.vj5) r0
            r0.getClass()
            java.lang.String r0 = r0.name()
            java.util.Locale r1 = java.util.Locale.US
            r1.getClass()
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            return r0
        L168:
            r0 = r18
            vj5 r0 = (defpackage.vj5) r0
            r0.getClass()
            java.lang.String r0 = r0.name()
            java.util.Locale r1 = java.util.Locale.US
            r1.getClass()
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            return r0
        L180:
            r0 = r18
            b63 r0 = (defpackage.b63) r0
            o41 r1 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a
            r0.getClass()
            java.lang.String r0 = r0.name()
            return r0
        L18e:
            r0 = r18
            b63 r0 = (defpackage.b63) r0
            o41 r1 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a
            r0.getClass()
            java.lang.String r0 = r0.name()
            return r0
        L19c:
            r0 = r18
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L1ab
            java.lang.String r1 = "User already has"
            boolean r1 = defpackage.xs6.g0(r0, r1, r8)
            if (r1 != r6) goto L1ab
            return r9
        L1ab:
            kh7 r1 = new kh7
            if (r0 != 0) goto L1b1
            java.lang.String r0 = "Unknown reason"
        L1b1:
            r1.<init>(r0)
            throw r1
        L1b5:
            r0 = r18
            um3 r0 = (defpackage.um3) r0
            zj0 r1 = r0.A
            bt r1 = r1.B
            long r2 = r1.L()
            xj0 r4 = r1.G()
            r4.h()
            java.lang.Object r4 = r1.B     // Catch: java.lang.Throwable -> L1e2
            r10 = r4
            os0 r10 = (defpackage.os0) r10     // Catch: java.lang.Throwable -> L1e2
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r12 = 0
            r13 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r14 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r15 = 1
            r10.Q(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L1e2
            r0.b()     // Catch: java.lang.Throwable -> L1e2
            defpackage.xg6.v(r1, r2)
            return r9
        L1e2:
            r0 = move-exception
            defpackage.xg6.v(r1, r2)
            throw r0
        L1e7:
            r0 = r18
            gb6 r0 = (defpackage.gb6) r0
            y16 r0 = defpackage.k65.a
            return r9
        L1ee:
            r0 = r18
            java.util.List r0 = (java.util.List) r0
            r0.getClass()
            return r9
        L1f6:
            r0 = r18
            gb6 r0 = (defpackage.gb6) r0
            x35 r1 = defpackage.x35.d
            fg3[] r2 = defpackage.eb6.a
            fb6 r2 = defpackage.bb6.c
            fg3[] r3 = defpackage.eb6.a
            r3 = r3[r6]
            r0.a(r2, r1)
            return r9
        L208:
            r0 = r18
            bi3 r0 = (defpackage.bi3) r0
            r0.a = r5
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            r2 = 1267(0x4f3, float:1.775E-42)
            ai3 r1 = r0.a(r1, r2)
            v71 r2 = defpackage.e45.d
            r1.b = r2
            java.lang.Float r1 = java.lang.Float.valueOf(r4)
            r0.a(r1, r5)
            return r9
        L224:
            r0 = r18
            bi3 r0 = (defpackage.bi3) r0
            r0.a = r5
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            r2 = 1000(0x3e8, float:1.401E-42)
            ai3 r1 = r0.a(r1, r2)
            v71 r2 = defpackage.e45.c
            r1.b = r2
            java.lang.Float r1 = java.lang.Float.valueOf(r4)
            r2 = 1567(0x61f, float:2.196E-42)
            r0.a(r1, r2)
            return r9
        L242:
            r0 = r18
            bi3 r0 = (defpackage.bi3) r0
            r0.a = r5
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            r2 = 333(0x14d, float:4.67E-43)
            ai3 r1 = r0.a(r1, r2)
            v71 r2 = defpackage.e45.b
            r1.b = r2
            java.lang.Float r1 = java.lang.Float.valueOf(r4)
            r2 = 1183(0x49f, float:1.658E-42)
            r0.a(r1, r2)
            return r9
        L260:
            r0 = r18
            bi3 r0 = (defpackage.bi3) r0
            r0.a = r5
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            ai3 r1 = r0.a(r1, r8)
            v71 r2 = defpackage.e45.a
            r1.b = r2
            java.lang.Float r1 = java.lang.Float.valueOf(r4)
            r2 = 750(0x2ee, float:1.051E-42)
            r0.a(r1, r2)
            return r9
        L27c:
            r0 = r18
            bi3 r0 = (defpackage.bi3) r0
            r0.a = r3
            java.lang.Float r3 = java.lang.Float.valueOf(r7)
            ai3 r2 = r0.a(r3, r2)
            v71 r3 = defpackage.e45.e
            r2.b = r3
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            int r2 = r0.a
            r0.a(r1, r2)
            return r9
        L298:
            r0 = r18
            gb6 r0 = (defpackage.gb6) r0
            v71 r0 = defpackage.e45.a
            return r9
        L29f:
            r0 = r18
            bi3 r0 = (defpackage.bi3) r0
            r0.a = r3
            java.lang.Float r3 = java.lang.Float.valueOf(r7)
            ai3 r3 = r0.a(r3, r8)
            v71 r4 = defpackage.e45.e
            r3.b = r4
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0.a(r1, r2)
            return r9
        L2b9:
            r0 = r18
            android.content.Context r0 = (android.content.Context) r0
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "android.intent.action.PROCESS_TEXT"
            android.content.Intent r2 = r2.setAction(r3)
            java.lang.String r3 = "text/plain"
            android.content.Intent r2 = r2.setType(r3)
            java.util.List r1 = r1.queryIntentActivities(r2, r8)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            int r3 = r1.size()
        L2e3:
            if (r8 >= r3) goto L310
            java.lang.Object r4 = r1.get(r8)
            r5 = r4
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            java.lang.String r6 = r0.getPackageName()
            android.content.pm.ActivityInfo r7 = r5.activityInfo
            java.lang.String r7 = r7.packageName
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L30a
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            boolean r6 = r5.exported
            if (r6 == 0) goto L30d
            java.lang.String r5 = r5.permission
            if (r5 == 0) goto L30a
            int r5 = r0.checkSelfPermission(r5)
            if (r5 != 0) goto L30d
        L30a:
            r2.add(r4)
        L30d:
            int r8 = r8 + 1
            goto L2e3
        L310:
            return r2
        L311:
            r0 = r18
            java.lang.Void r0 = (java.lang.Void) r0
            f35 r0 = defpackage.f35.b
            return r0
        L318:
            r0 = r18
            lj2 r0 = (defpackage.lj2) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "'"
            r1.<init>(r2)
            java.lang.String r2 = r0.a()
            r1.append(r2)
            java.lang.String r2 = "' "
            r1.append(r2)
            float r0 = r0.b()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L33b:
            r0 = r18
            av4 r0 = (defpackage.av4) r0
            r0.getClass()
            zu4 r0 = r0.a
            java.lang.String r0 = r0.c()
            return r0
        L349:
            r0 = r18
            av4 r0 = (defpackage.av4) r0
            r0.getClass()
            zu4 r0 = r0.a
            long r0 = r0.f()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L35b:
            r0 = r18
            av4 r0 = (defpackage.av4) r0
            r0.getClass()
            zu4 r0 = r0.a
            long r0 = r0.d()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }
}
