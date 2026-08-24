package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fn5  reason: default package */
/* loaded from: classes.dex */
public abstract class fn5 {
    public static final java.util.Set a = null;

    static {
            java.lang.String r4 = "ra_hardcore_enabled"
            java.lang.String r5 = "ra_offline_softcore_enabled"
            java.lang.String r0 = "ra_offline_backend"
            java.lang.String r1 = "ra_offline_proxy_external_active"
            java.lang.String r2 = "ra_offline_proxy_client_host"
            java.lang.String r3 = "ra_endpoint_generation"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            java.util.Set r0 = defpackage.fv.V0(r0)
            defpackage.fn5.a = r0
            return
    }

    public static void a(defpackage.en5 r9, java.lang.String r10) {
            r9.getClass()
            ln5 r0 = r9.a
            java.lang.String r0 = r0.name()
            ln5 r1 = r9.b
            java.lang.String r1 = r1.name()
            dn5 r2 = r9.c
            java.lang.String r3 = r2.name()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            dn5 r4 = defpackage.dn5.OFFICIAL
            if (r2 != r4) goto L25
            java.lang.String r2 = "official"
            goto L27
        L25:
            java.lang.String r2 = "loopback-redacted"
        L27:
            boolean r4 = r9.h
            boolean r5 = r9.i
            java.lang.String r9 = r9.e
            if (r9 == 0) goto L31
            r9 = 1
            goto L32
        L31:
            r9 = 0
        L32:
            java.lang.String r6 = " backendSelected="
            java.lang.String r7 = " backendEffective="
            java.lang.String r8 = "reason="
            java.lang.StringBuilder r10 = defpackage.i61.u(r8, r10, r6, r0, r7)
            java.lang.String r0 = " hostSource="
            java.lang.String r6 = " host="
            defpackage.i61.B(r10, r1, r0, r3, r6)
            r10.append(r2)
            java.lang.String r0 = " builtInLedgerEnabled="
            r10.append(r0)
            r10.append(r4)
            java.lang.String r0 = " builtInSyncEnabled="
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = " nativeClientHostConfigured="
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "RAEndpoint"
            android.util.Log.i(r10, r9)
            return
    }

    public static long b(android.content.SharedPreferences r4) {
            java.lang.String r0 = "ra_endpoint_generation"
            r1 = 0
            long r0 = r4.getLong(r0, r1)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = 1
            if (r4 != 0) goto L14
            return r2
        L14:
            long r0 = r0 + r2
            return r0
    }

    public static defpackage.en5 c(android.content.SharedPreferences r14) {
            kn5 r0 = defpackage.ln5.Companion
            ln5 r1 = defpackage.ln5.BUILT_IN
            java.lang.String r2 = r1.getPreferenceValue()
            java.lang.String r3 = "ra_offline_backend"
            java.lang.String r2 = r14.getString(r3, r2)
            r0.getClass()
            ln5 r4 = defpackage.kn5.a(r2)
            java.lang.String r0 = "ra_offline_proxy_external_active"
            r2 = 0
            boolean r11 = r14.getBoolean(r0, r2)
            if (r11 == 0) goto L22
            ln5 r0 = defpackage.ln5.RA_OFFLINE_PROXY
            r5 = r0
            goto L23
        L22:
            r5 = r4
        L23:
            java.lang.String r0 = "ra_offline_proxy_client_host"
            r3 = 0
            java.lang.String r0 = r14.getString(r0, r3)
            if (r0 == 0) goto L38
            java.lang.Object r0 = defpackage.ej2.c0(r0)
            boolean r6 = r0 instanceof defpackage.em5
            if (r6 == 0) goto L35
            r0 = r3
        L35:
            ik7 r0 = (defpackage.ik7) r0
            goto L39
        L38:
            r0 = r3
        L39:
            ln5 r6 = defpackage.ln5.RA_OFFLINE_PROXY
            r7 = 1
            if (r5 != r6) goto L42
            if (r0 == 0) goto L42
            r6 = r7
            goto L43
        L42:
            r6 = r2
        L43:
            if (r5 != r1) goto L50
            java.lang.String r8 = "ra_offline_softcore_enabled"
            boolean r8 = r14.getBoolean(r8, r7)
            if (r8 == 0) goto L50
            r12 = r7
        L4e:
            r2 = r3
            goto L52
        L50:
            r12 = r2
            goto L4e
        L52:
            en5 r3 = new en5
            if (r5 != r1) goto L59
            dn5 r6 = defpackage.dn5.OFFICIAL
            goto L60
        L59:
            if (r6 == 0) goto L5e
            dn5 r6 = defpackage.dn5.RA_OFFLINE_PROXY
            goto L60
        L5e:
            dn5 r6 = defpackage.dn5.RA_OFFLINE_PROXY_UNAVAILABLE
        L60:
            if (r5 != r1) goto L65
            java.lang.String r7 = "https://retroachievements.org/dorequest.php"
            goto L6b
        L65:
            if (r0 == 0) goto L6a
            java.lang.String r7 = r0.b
            goto L6b
        L6a:
            r7 = r2
        L6b:
            if (r5 != r1) goto L71
            java.lang.String r0 = "https://retroachievements.org"
        L6f:
            r8 = r0
            goto L77
        L71:
            if (r0 == 0) goto L76
            java.lang.String r0 = r0.a
            goto L6f
        L76:
            r8 = r2
        L77:
            java.lang.String r0 = "ra_endpoint_generation"
            r1 = 0
            long r9 = r14.getLong(r0, r1)
            r13 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r12, r13)
            return r3
    }
}
