package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xv2  reason: default package */
/* loaded from: classes.dex */
public final class xv2 {
    public final android.content.SharedPreferences a;

    public xv2(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "hardcore_offline_loss_tracker"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r2.a = r3
            return
    }

    public final void a() {
            r1 = this;
            android.content.SharedPreferences r1 = r1.a
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "user_id"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "content_id"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "game_title"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "achievement_count"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "leaderboard_count"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            r1.commit()
            return
    }

    public final void b(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            wv2 r0 = r2.d()
            if (r0 != 0) goto Ld
            goto L20
        Ld:
            java.lang.String r1 = r0.a
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L20
            java.lang.String r3 = r0.b
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L20
            r2.a()
        L20:
            return
    }

    public final void c(int r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r1 = this;
            r6.getClass()
            java.lang.String r0 = "Failed requirement."
            if (r2 < 0) goto L3d
            if (r3 < 0) goto L39
            int r0 = r2 + r3
            if (r0 != 0) goto L11
            r1.b(r4, r5)
            return
        L11:
            android.content.SharedPreferences r1 = r1.a
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "user_id"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r4)
            java.lang.String r4 = "content_id"
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r5)
            java.lang.String r4 = "game_title"
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r6)
            java.lang.String r4 = "achievement_count"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r4, r2)
            java.lang.String r2 = "leaderboard_count"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r2, r3)
            r1.commit()
            return
        L39:
            defpackage.i.h(r0)
            return
        L3d:
            defpackage.i.h(r0)
            return
    }

    public final defpackage.wv2 d() {
            r8 = this;
            android.content.SharedPreferences r8 = r8.a
            java.lang.String r0 = "user_id"
            r1 = 0
            java.lang.String r5 = r8.getString(r0, r1)
            if (r5 != 0) goto Lc
            goto L14
        Lc:
            java.lang.String r0 = "content_id"
            java.lang.String r6 = r8.getString(r0, r1)
            if (r6 != 0) goto L15
        L14:
            return r1
        L15:
            java.lang.String r0 = "game_title"
            java.lang.String r0 = r8.getString(r0, r1)
            if (r0 != 0) goto L1f
            java.lang.String r0 = ""
        L1f:
            boolean r1 = defpackage.qs6.v0(r0)
            if (r1 == 0) goto L27
            r7 = r6
            goto L28
        L27:
            r7 = r0
        L28:
            java.lang.String r0 = "achievement_count"
            boolean r1 = r8.contains(r0)
            r2 = 0
            int r0 = r8.getInt(r0, r2)
            java.lang.String r3 = "leaderboard_count"
            boolean r4 = r8.contains(r3)
            int r8 = r8.getInt(r3, r2)
            if (r1 != 0) goto L50
            if (r4 != 0) goto L50
            r8 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            vr4 r1 = new vr4
            r1.<init>(r8, r0)
            goto L64
        L50:
            if (r0 >= 0) goto L53
            r0 = r2
        L53:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r8 >= 0) goto L5a
            goto L5b
        L5a:
            r2 = r8
        L5b:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            vr4 r1 = new vr4
            r1.<init>(r0, r8)
        L64:
            wv2 r2 = new wv2
            java.lang.Object r8 = r1.A
            java.lang.Number r8 = (java.lang.Number) r8
            int r3 = r8.intValue()
            java.lang.Object r8 = r1.B
            java.lang.Number r8 = (java.lang.Number) r8
            int r4 = r8.intValue()
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }
}
