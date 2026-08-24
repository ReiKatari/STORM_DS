package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hl0  reason: default package */
/* loaded from: classes.dex */
public final class hl0 implements defpackage.pb7 {
    public final defpackage.s63 a;
    public final android.net.ConnectivityManager b;
    public final android.content.Context c;
    public final java.net.URL d;
    public final defpackage.wr0 e;
    public final defpackage.wr0 f;
    public final int g;

    public hl0(android.content.Context r4, defpackage.wr0 r5, defpackage.wr0 r6) {
            r3 = this;
            r3.<init>()
            xd3 r0 = new xd3
            r0.<init>()
            d90 r1 = defpackage.d90.n0
            r1.configure(r0)
            r1 = 1
            r0.d = r1
            s63 r1 = new s63
            r2 = 2
            r1.<init>(r0, r2)
            r3.a = r1
            r3.c = r4
            java.lang.String r0 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            r3.b = r4
            java.lang.String r4 = defpackage.fa0.c
            java.net.URL r4 = b(r4)
            r3.d = r4
            r3.e = r6
            r3.f = r5
            r4 = 40000(0x9c40, float:5.6052E-41)
            r3.g = r4
            return
    }

    public static java.net.URL b(java.lang.String r3) {
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L6
            r0.<init>(r3)     // Catch: java.net.MalformedURLException -> L6
            return r0
        L6:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid url: "
            java.lang.String r3 = defpackage.i61.m(r2, r3)
            r1.<init>(r3, r0)
            throw r1
    }

    public final defpackage.hy a(defpackage.hy r8) {
            r7 = this;
            android.net.ConnectivityManager r0 = r7.b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            pa r8 = r8.c()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r2 = r8.Z
            java.util.HashMap r2 = (java.util.HashMap) r2
            r3 = 0
            java.lang.String r4 = "Property \"autoMetadata\" has not been set"
            if (r2 == 0) goto L123
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r5 = "sdk-version"
            r2.put(r5, r1)
            java.lang.String r1 = "model"
            java.lang.String r2 = android.os.Build.MODEL
            r8.b(r1, r2)
            java.lang.String r1 = "hardware"
            java.lang.String r2 = android.os.Build.HARDWARE
            r8.b(r1, r2)
            java.lang.String r1 = "device"
            java.lang.String r2 = android.os.Build.DEVICE
            r8.b(r1, r2)
            java.lang.String r1 = "product"
            java.lang.String r2 = android.os.Build.PRODUCT
            r8.b(r1, r2)
            java.lang.String r1 = "os-uild"
            java.lang.String r2 = android.os.Build.ID
            r8.b(r1, r2)
            java.lang.String r1 = "manufacturer"
            java.lang.String r2 = android.os.Build.MANUFACTURER
            r8.b(r1, r2)
            java.lang.String r1 = "fingerprint"
            java.lang.String r2 = android.os.Build.FINGERPRINT
            r8.b(r1, r2)
            java.util.Calendar.getInstance()
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r5 = r2.getTimeInMillis()
            int r1 = r1.getOffset(r5)
            int r1 = r1 / 1000
            long r1 = (long) r1
            java.lang.Object r5 = r8.Z
            java.util.HashMap r5 = (java.util.HashMap) r5
            if (r5 == 0) goto L11f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "tz-offset"
            r5.put(r2, r1)
            if (r0 != 0) goto L7d
            se4 r1 = defpackage.se4.NONE
            int r1 = r1.getValue()
            goto L81
        L7d:
            int r1 = r0.getType()
        L81:
            java.lang.Object r2 = r8.Z
            java.util.HashMap r2 = (java.util.HashMap) r2
            if (r2 == 0) goto L11b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r5 = "net-type"
            r2.put(r5, r1)
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L9b
            re4 r0 = defpackage.re4.UNKNOWN_MOBILE_SUBTYPE
            int r0 = r0.getValue()
            goto Lb0
        L9b:
            int r0 = r0.getSubtype()
            if (r0 != r2) goto La8
            re4 r0 = defpackage.re4.COMBINED
            int r0 = r0.getValue()
            goto Lb0
        La8:
            re4 r5 = defpackage.re4.forNumber(r0)
            if (r5 == 0) goto Laf
            goto Lb0
        Laf:
            r0 = r1
        Lb0:
            java.lang.Object r5 = r8.Z
            java.util.HashMap r5 = (java.util.HashMap) r5
            if (r5 == 0) goto L117
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "mobile-subtype"
            r5.put(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r3 = "country"
            r8.b(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r3 = "locale"
            r8.b(r3, r0)
            java.lang.String r0 = "phone"
            android.content.Context r7 = r7.c
            java.lang.Object r0 = r7.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = r0.getSimOperator()
            java.lang.String r3 = "mcc_mnc"
            r8.b(r3, r0)
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lfb
            java.lang.String r7 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lfb
            android.content.pm.PackageInfo r7 = r0.getPackageInfo(r7, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lfb
            int r2 = r7.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lfb
            goto L109
        Lfb:
            r7 = move-exception
            java.lang.String r0 = "TransportRuntime."
            java.lang.String r1 = "CctTransportBackend"
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "Unable to find version code for package"
            android.util.Log.e(r0, r1, r7)
        L109:
            java.lang.String r7 = java.lang.Integer.toString(r2)
            java.lang.String r0 = "application_build"
            r8.b(r0, r7)
            hy r7 = r8.f()
            return r7
        L117:
            defpackage.i.m(r4)
            return r3
        L11b:
            defpackage.i.m(r4)
            return r3
        L11f:
            defpackage.i.m(r4)
            return r3
        L123:
            defpackage.i.m(r4)
            return r3
    }
}
