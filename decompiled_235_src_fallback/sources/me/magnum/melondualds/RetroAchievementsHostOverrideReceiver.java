package me.magnum.melondualds;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RetroAchievementsHostOverrideReceiver extends android.content.BroadcastReceiver {
    public RetroAchievementsHostOverrideReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r11, android.content.Intent r12) {
            r10 = this;
            r11.getClass()
            r12.getClass()
            android.content.Context r10 = r11.getApplicationContext()
            android.content.SharedPreferences r10 = defpackage.v15.a(r10)
            java.lang.String r11 = r12.getAction()
            java.lang.String r0 = "RAHostOverrideReceiver"
            if (r11 == 0) goto L138
            int r1 = r11.hashCode()
            r2 = 263098673(0xfae9131, float:1.721365E-29)
            java.lang.String r3 = "ra_proxy_hardcore_restore_pending"
            r4 = 1
            java.lang.String r5 = "ra_hardcore_enabled"
            java.lang.String r6 = "ra_endpoint_generation"
            java.lang.String r7 = "ra_offline_proxy_client_host"
            java.lang.String r8 = "ra_offline_proxy_external_active"
            r9 = 0
            if (r1 == r2) goto Lc3
            r2 = 938132102(0x37eac286, float:2.7985556E-5)
            if (r1 == r2) goto L32
            goto L138
        L32:
            java.lang.String r1 = "me.magnum.melondualds.action.SET_RETROACHIEVEMENTS_HOST_OVERRIDE"
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L3c
            goto L138
        L3c:
            java.util.Set r11 = defpackage.fn5.a
            r10.getClass()
            java.lang.String r11 = "host"
            java.lang.String r11 = r12.getStringExtra(r11)
            java.lang.Object r11 = defpackage.ej2.c0(r11)
            java.lang.Throwable r12 = defpackage.hm5.a(r11)
            if (r12 != 0) goto L96
            ik7 r11 = (defpackage.ik7) r11
            en5 r12 = defpackage.fn5.c(r10)
            ln5 r12 = r12.b
            ln5 r1 = defpackage.ln5.RA_OFFLINE_PROXY
            if (r12 != r1) goto L5f
            r12 = r4
            goto L60
        L5f:
            r12 = r9
        L60:
            android.content.SharedPreferences$Editor r1 = r10.edit()
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r8, r4)
            java.lang.String r11 = r11.a
            android.content.SharedPreferences$Editor r11 = r1.putString(r7, r11)
            long r1 = defpackage.fn5.b(r10)
            android.content.SharedPreferences$Editor r11 = r11.putLong(r6, r1)
            if (r12 != 0) goto L85
            boolean r12 = r10.getBoolean(r5, r9)
            if (r12 == 0) goto L85
            android.content.SharedPreferences$Editor r12 = r11.putBoolean(r3, r4)
            r12.putBoolean(r5, r9)
        L85:
            boolean r11 = r11.commit()
            if (r11 == 0) goto L90
            en5 r10 = defpackage.fn5.c(r10)
            goto L9b
        L90:
            java.lang.String r10 = "Could not persist RAOfflineProxy activation"
            defpackage.i.m(r10)
            return
        L96:
            em5 r10 = new em5
            r10.<init>(r12)
        L9b:
            boolean r11 = r10 instanceof defpackage.em5
            if (r11 != 0) goto La7
            r11 = r10
            en5 r11 = (defpackage.en5) r11
            java.lang.String r12 = "external_set"
            defpackage.fn5.a(r11, r12)
        La7:
            java.lang.Throwable r10 = defpackage.hm5.a(r10)
            if (r10 == 0) goto Lc2
            java.lang.String r10 = r10.getMessage()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Rejected RAOfflineProxy host: "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            android.util.Log.w(r0, r10)
        Lc2:
            return
        Lc3:
            java.lang.String r12 = "me.magnum.melondualds.action.CLEAR_RETROACHIEVEMENTS_HOST_OVERRIDE"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto Lcc
            goto L138
        Lcc:
            java.util.Set r11 = defpackage.fn5.a
            r10.getClass()
            boolean r11 = r10.getBoolean(r8, r9)
            if (r11 != 0) goto Le2
            boolean r11 = r10.contains(r7)
            if (r11 != 0) goto Le2
            en5 r10 = defpackage.fn5.c(r10)
            goto L12c
        Le2:
            kn5 r11 = defpackage.ln5.Companion
            ln5 r12 = defpackage.ln5.BUILT_IN
            java.lang.String r0 = r12.getPreferenceValue()
            java.lang.String r1 = "ra_offline_backend"
            java.lang.String r0 = r10.getString(r1, r0)
            r11.getClass()
            ln5 r11 = defpackage.kn5.a(r0)
            android.content.SharedPreferences$Editor r0 = r10.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r8, r9)
            android.content.SharedPreferences$Editor r0 = r0.remove(r7)
            long r1 = defpackage.fn5.b(r10)
            android.content.SharedPreferences$Editor r0 = r0.putLong(r6, r1)
            if (r11 != r12) goto L122
            r0.getClass()
            boolean r11 = r10.getBoolean(r3, r9)
            if (r11 == 0) goto L11f
            boolean r11 = r10.getBoolean(r5, r9)
            if (r11 != 0) goto L11f
            r0.putBoolean(r5, r4)
        L11f:
            r0.remove(r3)
        L122:
            boolean r11 = r0.commit()
            if (r11 == 0) goto L132
            en5 r10 = defpackage.fn5.c(r10)
        L12c:
            java.lang.String r11 = "external_clear"
            defpackage.fn5.a(r10, r11)
            return
        L132:
            java.lang.String r10 = "Could not persist RAOfflineProxy clear"
            defpackage.i.m(r10)
            return
        L138:
            java.lang.String r10 = "Ignored unsupported action"
            android.util.Log.w(r0, r10)
            return
    }
}
