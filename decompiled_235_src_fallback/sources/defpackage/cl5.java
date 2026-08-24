package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cl5  reason: default package */
/* loaded from: classes.dex */
public final class cl5 extends defpackage.i64 {
    public final /* synthetic */ int c;
    public final android.content.Context d;

    public cl5(android.content.Context r3) {
            r2 = this;
            r0 = 1
            r2.c = r0
            r0 = 9
            r1 = 10
            r2.<init>(r0, r1)
            r2.d = r3
            return
    }

    public cl5(android.content.Context r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.c = r0
            r1.<init>(r3, r4)
            r1.d = r2
            return
    }

    @Override // defpackage.i64
    public final void a(defpackage.vm2 r11) {
            r10 = this;
            int r0 = r10.c
            java.lang.String r1 = "reschedule_needed"
            r2 = 0
            java.lang.String r3 = "androidx.work.util.preferences"
            java.lang.String r4 = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)"
            android.content.Context r5 = r10.d
            r11.getClass()
            switch(r0) {
                case 0: goto Lb3;
                default: goto L11;
            }
        L11:
            java.lang.String r10 = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))"
            r11.r(r10)
            android.content.SharedPreferences r10 = r5.getSharedPreferences(r3, r2)
            boolean r0 = r10.contains(r1)
            java.lang.String r3 = "last_cancel_all_time_ms"
            if (r0 != 0) goto L28
            boolean r0 = r10.contains(r3)
            if (r0 == 0) goto L60
        L28:
            r6 = 0
            long r8 = r10.getLong(r3, r6)
            boolean r0 = r10.getBoolean(r1, r2)
            if (r0 == 0) goto L36
            r6 = 1
        L36:
            r11.e()
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}     // Catch: java.lang.Throwable -> Lae
            r11.u(r4, r0)     // Catch: java.lang.Throwable -> Lae
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Lae
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch: java.lang.Throwable -> Lae
            r11.u(r4, r0)     // Catch: java.lang.Throwable -> Lae
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch: java.lang.Throwable -> Lae
            android.content.SharedPreferences$Editor r10 = r10.clear()     // Catch: java.lang.Throwable -> Lae
            r10.apply()     // Catch: java.lang.Throwable -> Lae
            r11.D()     // Catch: java.lang.Throwable -> Lae
            r11.n()
        L60:
            java.lang.String r10 = "androidx.work.util.id"
            android.content.SharedPreferences r10 = r5.getSharedPreferences(r10, r2)
            java.lang.String r0 = "next_job_scheduler_id"
            boolean r1 = r10.contains(r0)
            if (r1 != 0) goto L74
            boolean r1 = r10.contains(r0)
            if (r1 == 0) goto La8
        L74:
            int r1 = r10.getInt(r0, r2)
            java.lang.String r3 = "next_alarm_manager_id"
            int r2 = r10.getInt(r3, r2)
            r11.e()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> La9
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}     // Catch: java.lang.Throwable -> La9
            r11.u(r4, r0)     // Catch: java.lang.Throwable -> La9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> La9
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}     // Catch: java.lang.Throwable -> La9
            r11.u(r4, r0)     // Catch: java.lang.Throwable -> La9
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch: java.lang.Throwable -> La9
            android.content.SharedPreferences$Editor r10 = r10.clear()     // Catch: java.lang.Throwable -> La9
            r10.apply()     // Catch: java.lang.Throwable -> La9
            r11.D()     // Catch: java.lang.Throwable -> La9
            r11.n()
        La8:
            return
        La9:
            r10 = move-exception
            r11.n()
            throw r10
        Lae:
            r10 = move-exception
            r11.n()
            throw r10
        Lb3:
            int r10 = r10.b
            r0 = 10
            r6 = 1
            if (r10 < r0) goto Lc6
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r10}
            r11.u(r4, r10)
            goto Ld5
        Lc6:
            android.content.SharedPreferences r10 = r5.getSharedPreferences(r3, r2)
            android.content.SharedPreferences$Editor r10 = r10.edit()
            android.content.SharedPreferences$Editor r10 = r10.putBoolean(r1, r6)
            r10.apply()
        Ld5:
            return
    }
}
