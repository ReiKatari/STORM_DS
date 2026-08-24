package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cr  reason: default package */
/* loaded from: classes.dex */
public final class cr extends android.content.BroadcastReceiver {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public /* synthetic */ cr(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public cr(defpackage.uk1 r2) {
            r1 = this;
            r0 = 2
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            int r0 = r3.a
            java.lang.Object r3 = r3.b
            switch(r0) {
                case 0: goto L16f;
                case 1: goto L58;
                default: goto L7;
            }
        L7:
            uk1 r3 = (defpackage.uk1) r3
            if (r5 != 0) goto Lc
            goto L57
        Lc:
            java.lang.String r0 = r5.getAction()
            java.lang.String r1 = "android.intent.action.AIRPLANE_MODE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L34
            java.lang.String r4 = "state"
            boolean r0 = r5.hasExtra(r4)
            if (r0 != 0) goto L21
            goto L57
        L21:
            r0 = 0
            boolean r4 = r5.getBooleanExtra(r4, r0)
            java.lang.Object r3 = r3.j
            sk1 r3 = (defpackage.sk1) r3
            r5 = 10
            android.os.Message r4 = r3.obtainMessage(r5, r4, r0)
            r3.sendMessage(r4)
            goto L57
        L34:
            java.lang.String r5 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L57
            java.lang.StringBuilder r5 = defpackage.ck7.a
            java.lang.String r5 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()
            java.lang.Object r3 = r3.j
            sk1 r3 = (defpackage.sk1) r3
            r5 = 9
            android.os.Message r4 = r3.obtainMessage(r5, r4)
            r3.sendMessage(r4)
        L57:
            return
        L58:
            r4.getClass()
            r5.getClass()
            w30 r3 = (defpackage.w30) r3
            int r4 = r3.h
            java.lang.String r0 = "Received "
            switch(r4) {
                case 0: goto L117;
                case 1: goto Lc0;
                default: goto L67;
            }
        L67:
            java.lang.String r4 = r5.getAction()
            if (r4 != 0) goto L6f
            goto L16e
        L6f:
            ga0 r4 = defpackage.ga0.f()
            java.lang.String r1 = defpackage.cr6.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = r5.getAction()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.b(r1, r0)
            java.lang.String r4 = r5.getAction()
            if (r4 == 0) goto L16e
            int r5 = r4.hashCode()
            r0 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r5 == r0) goto Laf
            r0 = -730838620(0xffffffffd47049a4, float:-4.1281105E12)
            if (r5 == r0) goto L9e
            goto L16e
        L9e:
            java.lang.String r5 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto La8
            goto L16e
        La8:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.f(r4)
            goto L16e
        Laf:
            java.lang.String r5 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto Lb9
            goto L16e
        Lb9:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.f(r4)
            goto L16e
        Lc0:
            java.lang.String r4 = r5.getAction()
            if (r4 != 0) goto Lc8
            goto L16e
        Lc8:
            ga0 r4 = defpackage.ga0.f()
            java.lang.String r1 = defpackage.y30.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = r5.getAction()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.b(r1, r0)
            java.lang.String r4 = r5.getAction()
            if (r4 == 0) goto L16e
            int r5 = r4.hashCode()
            r0 = -1980154005(0xffffffff89f93f6b, float:-6.0004207E-33)
            if (r5 == r0) goto L108
            r0 = 490310653(0x1d398bfd, float:2.4556918E-21)
            if (r5 == r0) goto Lf7
            goto L16e
        Lf7:
            java.lang.String r5 = "android.intent.action.BATTERY_LOW"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L101
            goto L16e
        L101:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.f(r4)
            goto L16e
        L108:
            java.lang.String r5 = "android.intent.action.BATTERY_OKAY"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L111
            goto L16e
        L111:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.f(r4)
            goto L16e
        L117:
            java.lang.String r4 = r5.getAction()
            if (r4 != 0) goto L11e
            goto L16e
        L11e:
            ga0 r5 = defpackage.ga0.f()
            java.lang.String r1 = defpackage.x30.a
            java.lang.String r0 = r0.concat(r4)
            r5.b(r1, r0)
            int r5 = r4.hashCode()
            switch(r5) {
                case -1886648615: goto L160;
                case -54942926: goto L151;
                case 948344062: goto L142;
                case 1019184907: goto L133;
                default: goto L132;
            }
        L132:
            goto L16e
        L133:
            java.lang.String r5 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L13c
            goto L16e
        L13c:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.f(r4)
            goto L16e
        L142:
            java.lang.String r5 = "android.os.action.CHARGING"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L14b
            goto L16e
        L14b:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.f(r4)
            goto L16e
        L151:
            java.lang.String r5 = "android.os.action.DISCHARGING"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L15a
            goto L16e
        L15a:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.f(r4)
            goto L16e
        L160:
            java.lang.String r5 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L169
            goto L16e
        L169:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.f(r4)
        L16e:
            return
        L16f:
            d2 r3 = (defpackage.d2) r3
            r3.p()
            return
    }
}
