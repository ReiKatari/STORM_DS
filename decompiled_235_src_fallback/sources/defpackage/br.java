package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: br  reason: default package */
/* loaded from: classes.dex */
public final class br extends defpackage.d2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ defpackage.fr d;
    public final java.lang.Object e;

    public br(defpackage.fr r2, android.content.Context r3) {
            r1 = this;
            r0 = 0
            r1.c = r0
            r1.d = r2
            r1.<init>(r2)
            android.content.Context r2 = r3.getApplicationContext()
            java.lang.String r3 = "power"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            r1.e = r2
            return
    }

    public br(defpackage.fr r2, defpackage.m44 r3) {
            r1 = this;
            r0 = 1
            r1.c = r0
            r1.d = r2
            r1.<init>(r2)
            r1.e = r3
            return
    }

    @Override // defpackage.d2
    public final android.content.IntentFilter e() {
            r1 = this;
            int r1 = r1.c
            switch(r1) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r0 = "android.intent.action.TIME_SET"
            r1.addAction(r0)
            java.lang.String r0 = "android.intent.action.TIMEZONE_CHANGED"
            r1.addAction(r0)
            java.lang.String r0 = "android.intent.action.TIME_TICK"
            r1.addAction(r0)
            return r1
        L1a:
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r0 = "android.os.action.POWER_SAVE_MODE_CHANGED"
            r1.addAction(r0)
            return r1
    }

    @Override // defpackage.d2
    public final int g() {
            r24 = this;
            r0 = r24
            int r1 = r0.c
            r2 = 2
            r3 = 1
            java.lang.Object r0 = r0.e
            switch(r1) {
                case 0: goto L104;
                default: goto Lb;
            }
        Lb:
            m44 r0 = (defpackage.m44) r0
            java.lang.Object r1 = r0.R
            ck r1 = (defpackage.ck) r1
            java.lang.Object r4 = r0.L
            android.location.LocationManager r4 = (android.location.LocationManager) r4
            long r5 = r1.b
            long r7 = java.lang.System.currentTimeMillis()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L23
            boolean r0 = r1.a
            goto Lff
        L23:
            java.lang.Object r0 = r0.B
            r5 = r0
            android.content.Context r5 = (android.content.Context) r5
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = defpackage.mp2.p(r5, r0)
            java.lang.String r6 = "Failed to get last known location"
            java.lang.String r7 = "TwilightManager"
            r8 = 0
            if (r0 != 0) goto L49
            java.lang.String r0 = "network"
            boolean r9 = r4.isProviderEnabled(r0)     // Catch: java.lang.Exception -> L42
            if (r9 == 0) goto L46
            android.location.Location r0 = r4.getLastKnownLocation(r0)     // Catch: java.lang.Exception -> L42
            goto L47
        L42:
            r0 = move-exception
            android.util.Log.d(r7, r6, r0)
        L46:
            r0 = r8
        L47:
            r9 = r0
            goto L4a
        L49:
            r9 = r8
        L4a:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = defpackage.mp2.p(r5, r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "gps"
            boolean r5 = r4.isProviderEnabled(r0)     // Catch: java.lang.Exception -> L5f
            if (r5 == 0) goto L63
            android.location.Location r8 = r4.getLastKnownLocation(r0)     // Catch: java.lang.Exception -> L5f
            goto L63
        L5f:
            r0 = move-exception
            android.util.Log.d(r7, r6, r0)
        L63:
            if (r8 == 0) goto L75
            if (r9 == 0) goto L75
            long r4 = r8.getTime()
            long r10 = r9.getTime()
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 <= 0) goto L78
        L73:
            r9 = r8
            goto L78
        L75:
            if (r8 == 0) goto L78
            goto L73
        L78:
            r0 = 0
            if (r9 == 0) goto Le8
            long r15 = java.lang.System.currentTimeMillis()
            tc7 r4 = defpackage.tc7.e
            if (r4 != 0) goto L8a
            tc7 r4 = new tc7
            r4.<init>()
            defpackage.tc7.e = r4
        L8a:
            tc7 r17 = defpackage.tc7.e
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            long r22 = r15 - r4
            double r18 = r9.getLatitude()
            double r20 = r9.getLongitude()
            r17.a(r18, r20, r22)
            double r11 = r9.getLatitude()
            double r13 = r9.getLongitude()
            r10 = r17
            r10.a(r11, r13, r15)
            int r6 = r10.b
            if (r6 != r3) goto Lae
            r0 = r3
        Lae:
            long r6 = r10.d
            long r11 = r10.c
            long r22 = r15 + r4
            double r18 = r9.getLatitude()
            double r20 = r9.getLongitude()
            r17 = r10
            r17.a(r18, r20, r22)
            long r4 = r10.d
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto Lde
            int r8 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r8 != 0) goto Lce
            goto Lde
        Lce:
            int r8 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r8 <= 0) goto Ld4
            r6 = r4
            goto Ld9
        Ld4:
            int r4 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r4 <= 0) goto Ld9
            r6 = r11
        Ld9:
            r4 = 60000(0xea60, double:2.9644E-319)
            long r6 = r6 + r4
            goto Le3
        Lde:
            r4 = 43200000(0x2932e00, double:2.1343636E-316)
            long r6 = r15 + r4
        Le3:
            r1.a = r0
            r1.b = r6
            goto Lff
        Le8:
            java.lang.String r1 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
            android.util.Log.i(r7, r1)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r4 = 11
            int r1 = r1.get(r4)
            r4 = 6
            if (r1 < r4) goto Lfe
            r4 = 22
            if (r1 < r4) goto Lff
        Lfe:
            r0 = r3
        Lff:
            if (r0 == 0) goto L102
            goto L103
        L102:
            r2 = r3
        L103:
            return r2
        L104:
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            boolean r0 = defpackage.xq.a(r0)
            if (r0 == 0) goto L10d
            goto L10e
        L10d:
            r2 = r3
        L10e:
            return r2
    }

    @Override // defpackage.d2
    public final void p() {
            r2 = this;
            int r0 = r2.c
            r1 = 1
            fr r2 = r2.d
            switch(r0) {
                case 0: goto Lc;
                default: goto L8;
            }
        L8:
            r2.q(r1, r1)
            return
        Lc:
            r2.q(r1, r1)
            return
    }
}
