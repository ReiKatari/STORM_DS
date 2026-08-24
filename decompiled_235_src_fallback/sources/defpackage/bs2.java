package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bs2  reason: default package */
/* loaded from: classes.dex */
public final class bs2 {
    public final android.content.Context a;
    public final defpackage.yr2 b;
    public final android.content.SharedPreferences c;
    public final android.content.SharedPreferences d;
    public final defpackage.on2 e;

    public bs2(android.content.Context r2, defpackage.yr2 r3, android.content.SharedPreferences r4, android.content.SharedPreferences r5) {
            r1 = this;
            zr2 r0 = defpackage.zr2.d0
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r0
            return
    }

    public final java.lang.Object a(defpackage.s41 r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            android.content.Context r2 = r0.a
            boolean r3 = r1 instanceof defpackage.as2
            if (r3 == 0) goto L19
            r3 = r1
            as2 r3 = (defpackage.as2) r3
            int r4 = r3.Y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.Y = r4
            goto L1e
        L19:
            as2 r3 = new as2
            r3.<init>(r0, r1)
        L1e:
            l61 r1 = r3.B
            java.lang.Object r4 = r3.R
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r3.Y
            on2 r7 = r0.e
            java.lang.String r8 = "github_updates_last_check"
            android.content.SharedPreferences r9 = r0.c
            android.content.SharedPreferences r10 = r0.d
            r11 = 1
            r12 = 0
            if (r6 == 0) goto L40
            if (r6 != r11) goto L3a
            defpackage.oi2.Y(r4)     // Catch: java.lang.Throwable -> L38
            goto L76
        L38:
            r0 = move-exception
            goto L79
        L3a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r12
        L40:
            defpackage.oi2.Y(r4)
            java.lang.String r4 = "github_check_for_updates"
            boolean r4 = r9.getBoolean(r4, r11)
            r13 = -1
            long r15 = r10.getLong(r8, r13)
            java.lang.Object r6 = r7.c()
            java.lang.Number r6 = (java.lang.Number) r6
            long r17 = r6.longValue()
            if (r4 != 0) goto L5d
            goto L171
        L5d:
            int r4 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r4 != 0) goto L62
            goto L6b
        L62:
            long r17 = r17 - r15
            r13 = 79200000(0x4b87f00, double:3.9129999E-316)
            int r4 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r4 < 0) goto L171
        L6b:
            yr2 r0 = r0.b     // Catch: java.lang.Throwable -> L38
            r3.Y = r11     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r0.a(r3)     // Catch: java.lang.Throwable -> L38
            if (r4 != r5) goto L76
            return r5
        L76:
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L38
            goto L84
        L79:
            r1.getClass()
            defpackage.yh2.o(r1)
            em5 r4 = new em5
            r4.<init>(r0)
        L84:
            boolean r0 = r4 instanceof defpackage.em5
            if (r0 != 0) goto L165
            defpackage.oi2.Y(r4)     // Catch: java.lang.Throwable -> L14f
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L14f
            android.content.SharedPreferences$Editor r0 = r10.edit()     // Catch: java.lang.Throwable -> L14f
            java.lang.Object r3 = r7.c()     // Catch: java.lang.Throwable -> L14f
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L14f
            long r5 = r3.longValue()     // Catch: java.lang.Throwable -> L14f
            r0.putLong(r8, r5)     // Catch: java.lang.Throwable -> L14f
            r0.apply()     // Catch: java.lang.Throwable -> L14f
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L14f
            r0.getClass()     // Catch: java.lang.Throwable -> L14f
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L14f
            r2.getClass()     // Catch: java.lang.Throwable -> L14f
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L14f
            r5 = 33
            if (r3 < r5) goto Lc3
            r5 = 0
            android.content.pm.PackageManager$PackageInfoFlags r3 = defpackage.a81.b(r5)     // Catch: java.lang.Throwable -> L14f
            android.content.pm.PackageInfo r0 = defpackage.a81.s(r0, r2, r3)     // Catch: java.lang.Throwable -> L14f
            r0.getClass()     // Catch: java.lang.Throwable -> L14f
            goto Lcb
        Lc3:
            r3 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r3)     // Catch: java.lang.Throwable -> L14f
            r0.getClass()     // Catch: java.lang.Throwable -> L14f
        Lcb:
            bm7 r2 = defpackage.bm7.Z     // Catch: java.lang.Throwable -> L14f
            java.lang.String r0 = r0.versionName     // Catch: java.lang.Throwable -> L14f
            if (r0 == 0) goto L151
            bm7 r0 = defpackage.np2.N(r0)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r2 = "github_updates_skip_version"
            java.lang.String r2 = r10.getString(r2, r12)     // Catch: java.lang.Throwable -> L14f
            bm7 r2 = defpackage.np2.Z(r2)     // Catch: java.lang.Throwable -> L14f
            es2 r3 = defpackage.fs2.Companion     // Catch: java.lang.Throwable -> L14f
            java.lang.String r5 = "github_update_channel"
            fs2 r6 = defpackage.fs2.STABLE     // Catch: java.lang.Throwable -> L14f
            java.lang.String r6 = r6.getPreferenceValue()     // Catch: java.lang.Throwable -> L14f
            java.lang.String r5 = r9.getString(r5, r6)     // Catch: java.lang.Throwable -> L14f
            r3.getClass()     // Catch: java.lang.Throwable -> L14f
            t52 r3 = defpackage.fs2.getEntries()     // Catch: java.lang.Throwable -> L14f
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L14f
        Lf8:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L14f
            if (r6 == 0) goto L110
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L14f
            r7 = r6
            fs2 r7 = (defpackage.fs2) r7     // Catch: java.lang.Throwable -> L14f
            java.lang.String r7 = r7.getPreferenceValue()     // Catch: java.lang.Throwable -> L14f
            boolean r7 = defpackage.nb3.k(r7, r5)     // Catch: java.lang.Throwable -> L14f
            if (r7 == 0) goto Lf8
            goto L111
        L110:
            r6 = r12
        L111:
            fs2 r6 = (defpackage.fs2) r6     // Catch: java.lang.Throwable -> L14f
            if (r6 != 0) goto L117
            fs2 r6 = defpackage.fs2.STABLE     // Catch: java.lang.Throwable -> L14f
        L117:
            ds2 r3 = defpackage.ds2.a     // Catch: java.lang.Throwable -> L14f
            cs2 r0 = r3.a(r4, r0, r6, r2)     // Catch: java.lang.Throwable -> L14f
            if (r0 == 0) goto L171
            kt r13 = new kt     // Catch: java.lang.Throwable -> L14f
            jt r14 = defpackage.jt.PRODUCTION     // Catch: java.lang.Throwable -> L14f
            pv r2 = r0.b     // Catch: java.lang.Throwable -> L14f
            long r3 = r2.a     // Catch: java.lang.Throwable -> L14f
            java.lang.String r2 = r2.b     // Catch: java.lang.Throwable -> L14f
            android.net.Uri r17 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L14f
            bm7 r2 = r0.c     // Catch: java.lang.Throwable -> L14f
            ki5 r5 = r0.a     // Catch: java.lang.Throwable -> L14f
            java.lang.String r6 = r5.c     // Catch: java.lang.Throwable -> L14f
            pv r7 = r0.b     // Catch: java.lang.Throwable -> L14f
            long r7 = r7.d     // Catch: java.lang.Throwable -> L14f
            s83 r0 = r0.d     // Catch: java.lang.Throwable -> L14f
            java.lang.String r9 = r5.a     // Catch: java.lang.Throwable -> L14f
            java.lang.String r5 = r5.f     // Catch: java.lang.Throwable -> L14f
            r22 = r0
            r18 = r2
            r15 = r3
            r24 = r5
            r19 = r6
            r20 = r7
            r23 = r9
            r13.<init>(r14, r15, r17, r18, r19, r20, r22, r23, r24)     // Catch: java.lang.Throwable -> L14f
            r12 = r13
            goto L171
        L14f:
            r0 = move-exception
            goto L159
        L151:
            java.lang.String r0 = "Installed versionName is missing"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L14f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L14f
            throw r2     // Catch: java.lang.Throwable -> L14f
        L159:
            r1.getClass()
            defpackage.yh2.o(r1)
            em5 r12 = new em5
            r12.<init>(r0)
            goto L171
        L165:
            java.lang.Throwable r0 = defpackage.hm5.a(r4)
            r0.getClass()
            em5 r12 = new em5
            r12.<init>(r0)
        L171:
            return r12
    }
}
