package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mx6  reason: default package */
/* loaded from: classes.dex */
public final class mx6 implements defpackage.ll4, defpackage.b72 {
    public static final java.lang.String f0 = null;
    public final defpackage.lw7 A;
    public final defpackage.ow7 B;
    public final java.lang.Object L;
    public defpackage.gw7 R;
    public final java.util.LinkedHashMap X;
    public final java.util.HashMap Y;
    public final java.util.HashMap Z;
    public final defpackage.ww2 d0;
    public androidx.work.impl.foreground.SystemForegroundService e0;

    static {
            java.lang.String r0 = "SystemFgDispatcher"
            java.lang.String r0 = defpackage.ga0.h(r0)
            defpackage.mx6.f0 = r0
            return
    }

    public mx6(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.L = r0
            lw7 r3 = defpackage.lw7.b(r3)
            r2.A = r3
            ow7 r0 = r3.d
            r2.B = r0
            r0 = 0
            r2.R = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.X = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.Z = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.Y = r0
            ww2 r0 = new ww2
            w87 r1 = r3.j
            r0.<init>(r1)
            r2.d0 = r0
            o35 r3 = r3.f
            r3.a(r2)
            return
    }

    public static android.content.Intent c(android.content.Context r2, defpackage.gw7 r3, defpackage.wj2 r4) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.work.impl.foreground.SystemForegroundService> r1 = androidx.work.impl.foreground.SystemForegroundService.class
            r0.<init>(r2, r1)
            java.lang.String r2 = "ACTION_START_FOREGROUND"
            r0.setAction(r2)
            java.lang.String r2 = "KEY_WORKSPEC_ID"
            java.lang.String r1 = r3.a
            r0.putExtra(r2, r1)
            java.lang.String r2 = "KEY_GENERATION"
            int r3 = r3.b
            r0.putExtra(r2, r3)
            java.lang.String r2 = "KEY_NOTIFICATION_ID"
            int r3 = r4.a
            r0.putExtra(r2, r3)
            java.lang.String r2 = "KEY_FOREGROUND_SERVICE_TYPE"
            int r3 = r4.b
            r0.putExtra(r2, r3)
            java.lang.String r2 = "KEY_NOTIFICATION"
            android.app.Notification r3 = r4.c
            r0.putExtra(r2, r3)
            return r0
    }

    @Override // defpackage.ll4
    public final void a(defpackage.yw7 r5, defpackage.x21 r6) {
            r4 = this;
            boolean r0 = r6 instanceof defpackage.w21
            if (r0 == 0) goto L3b
            java.lang.String r0 = r5.a
            ga0 r1 = defpackage.ga0.f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Constraints unmet for WorkSpec "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = defpackage.mx6.f0
            r1.b(r2, r0)
            gw7 r5 = defpackage.rr7.a(r5)
            w21 r6 = (defpackage.w21) r6
            int r6 = r6.a
            lw7 r4 = r4.A
            ow7 r0 = r4.d
            ar6 r1 = new ar6
            o35 r4 = r4.f
            jp6 r2 = new jp6
            r2.<init>(r5)
            r5 = 1
            r1.<init>(r4, r2, r5, r6)
            zb6 r4 = r0.a
            r4.execute(r1)
        L3b:
            return
    }

    @Override // defpackage.b72
    public final void b(defpackage.gw7 r8, boolean r9) {
            r7 = this;
            java.lang.Object r9 = r7.L
            monitor-enter(r9)
            java.util.HashMap r0 = r7.Y     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.remove(r8)     // Catch: java.lang.Throwable -> L17
            yw7 r0 = (defpackage.yw7) r0     // Catch: java.lang.Throwable -> L17
            r1 = 0
            if (r0 == 0) goto L1a
            java.util.HashMap r0 = r7.Z     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.remove(r8)     // Catch: java.lang.Throwable -> L17
            rc3 r0 = (defpackage.rc3) r0     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r7 = move-exception
            goto Lcd
        L1a:
            r0 = r1
        L1b:
            if (r0 == 0) goto L20
            r0.h(r1)     // Catch: java.lang.Throwable -> L17
        L20:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r9 = r7.X
            java.lang.Object r9 = r9.remove(r8)
            wj2 r9 = (defpackage.wj2) r9
            gw7 r0 = r7.R
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L94
            java.util.LinkedHashMap r0 = r7.X
            int r0 = r0.size()
            if (r0 <= 0) goto L92
            java.util.LinkedHashMap r0 = r7.X
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
        L49:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L49
        L56:
            java.lang.Object r0 = r1.getKey()
            gw7 r0 = (defpackage.gw7) r0
            r7.R = r0
            androidx.work.impl.foreground.SystemForegroundService r0 = r7.e0
            if (r0 == 0) goto L94
            java.lang.Object r0 = r1.getValue()
            wj2 r0 = (defpackage.wj2) r0
            androidx.work.impl.foreground.SystemForegroundService r1 = r7.e0
            int r2 = r0.a
            int r3 = r0.b
            android.app.Notification r4 = r0.c
            r1.getClass()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 31
            if (r5 < r6) goto L7d
            defpackage.rp.w(r1, r2, r4, r3)
            goto L88
        L7d:
            r6 = 29
            if (r5 < r6) goto L85
            defpackage.rp.u(r1, r2, r4, r3)
            goto L88
        L85:
            r1.startForeground(r2, r4)
        L88:
            androidx.work.impl.foreground.SystemForegroundService r1 = r7.e0
            int r0 = r0.a
            android.app.NotificationManager r1 = r1.R
            r1.cancel(r0)
            goto L94
        L92:
            r7.R = r1
        L94:
            androidx.work.impl.foreground.SystemForegroundService r7 = r7.e0
            if (r9 == 0) goto Lcc
            if (r7 == 0) goto Lcc
            ga0 r0 = defpackage.ga0.f()
            java.lang.String r1 = defpackage.mx6.f0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Removing Notification (id: "
            r2.<init>(r3)
            int r3 = r9.a
            r2.append(r3)
            java.lang.String r3 = ", workSpecId: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = ", notificationType: "
            r2.append(r8)
            int r8 = r9.b
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r0.b(r1, r8)
            int r8 = r9.a
            android.app.NotificationManager r7 = r7.R
            r7.cancel(r8)
        Lcc:
            return
        Lcd:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L17
            throw r7
    }

    public final void d(android.content.Intent r9) {
            r8 = this;
            androidx.work.impl.foreground.SystemForegroundService r0 = r8.e0
            if (r0 == 0) goto Lca
            java.lang.String r0 = "KEY_NOTIFICATION_ID"
            r1 = 0
            int r0 = r9.getIntExtra(r0, r1)
            java.lang.String r2 = "KEY_FOREGROUND_SERVICE_TYPE"
            int r2 = r9.getIntExtra(r2, r1)
            java.lang.String r3 = "KEY_WORKSPEC_ID"
            java.lang.String r3 = r9.getStringExtra(r3)
            java.lang.String r4 = "KEY_GENERATION"
            int r4 = r9.getIntExtra(r4, r1)
            gw7 r5 = new gw7
            r5.<init>(r3, r4)
            java.lang.String r4 = "KEY_NOTIFICATION"
            android.os.Parcelable r9 = r9.getParcelableExtra(r4)
            android.app.Notification r9 = (android.app.Notification) r9
            ga0 r4 = defpackage.ga0.f()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Notifying with (id:"
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r7 = ", workSpecId: "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = ", notificationType :"
            r6.append(r3)
            r6.append(r2)
            java.lang.String r3 = ")"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r6 = defpackage.mx6.f0
            r4.b(r6, r3)
            if (r9 == 0) goto Lc4
            wj2 r3 = new wj2
            r3.<init>(r0, r9, r2)
            java.util.LinkedHashMap r2 = r8.X
            r2.put(r5, r3)
            gw7 r4 = r8.R
            java.lang.Object r4 = r2.get(r4)
            wj2 r4 = (defpackage.wj2) r4
            r6 = 29
            if (r4 != 0) goto L71
            r8.R = r5
            goto La5
        L71:
            androidx.work.impl.foreground.SystemForegroundService r3 = r8.e0
            android.app.NotificationManager r3 = r3.R
            r3.notify(r0, r9)
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r6) goto La4
            java.util.Set r9 = r2.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L84:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            wj2 r0 = (defpackage.wj2) r0
            int r0 = r0.b
            r1 = r1 | r0
            goto L84
        L9a:
            wj2 r3 = new wj2
            int r9 = r4.a
            android.app.Notification r0 = r4.c
            r3.<init>(r9, r0, r1)
            goto La5
        La4:
            r3 = r4
        La5:
            androidx.work.impl.foreground.SystemForegroundService r8 = r8.e0
            int r9 = r3.a
            int r0 = r3.b
            android.app.Notification r1 = r3.c
            r8.getClass()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto Lba
            defpackage.rp.w(r8, r9, r1, r0)
            return
        Lba:
            if (r2 < r6) goto Lc0
            defpackage.rp.u(r8, r9, r1, r0)
            return
        Lc0:
            r8.startForeground(r9, r1)
            return
        Lc4:
            java.lang.String r8 = "Notification passed in the intent was null."
            defpackage.i.h(r8)
            return
        Lca:
            java.lang.String r8 = "handleNotify was called on the destroyed dispatcher"
            defpackage.i.m(r8)
            return
    }

    public final void e() {
            r4 = this;
            r0 = 0
            r4.e0 = r0
            java.lang.Object r1 = r4.L
            monitor-enter(r1)
            java.util.HashMap r2 = r4.Z     // Catch: java.lang.Throwable -> L20
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L20
        L10:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L22
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L20
            rc3 r3 = (defpackage.rc3) r3     // Catch: java.lang.Throwable -> L20
            r3.h(r0)     // Catch: java.lang.Throwable -> L20
            goto L10
        L20:
            r4 = move-exception
            goto L34
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            lw7 r0 = r4.A
            o35 r0 = r0.f
            java.lang.Object r2 = r0.k
            monitor-enter(r2)
            java.util.ArrayList r0 = r0.j     // Catch: java.lang.Throwable -> L31
            r0.remove(r4)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            throw r4
        L34:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            throw r4
    }

    public final void f(int r8, int r9) {
            r7 = this;
            ga0 r0 = defpackage.ga0.f()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Foreground service timed out, FGS type: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = defpackage.mx6.f0
            r0.g(r2, r1)
            java.util.LinkedHashMap r0 = r7.X
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getValue()
            wj2 r3 = (defpackage.wj2) r3
            int r3 = r3.b
            if (r3 != r9) goto L21
            java.lang.Object r1 = r1.getKey()
            gw7 r1 = (defpackage.gw7) r1
            lw7 r3 = r7.A
            ow7 r4 = r3.d
            ar6 r5 = new ar6
            o35 r3 = r3.f
            jp6 r6 = new jp6
            r6.<init>(r1)
            r1 = -128(0xffffffffffffff80, float:NaN)
            r5.<init>(r3, r6, r2, r1)
            zb6 r1 = r4.a
            r1.execute(r5)
            goto L21
        L56:
            androidx.work.impl.foreground.SystemForegroundService r7 = r7.e0
            if (r7 == 0) goto L73
            r7.B = r2
            ga0 r9 = defpackage.ga0.f()
            java.lang.String r0 = androidx.work.impl.foreground.SystemForegroundService.X
            java.lang.String r1 = "Shutting down."
            r9.b(r0, r1)
            int r9 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r9 < r0) goto L70
            r7.stopForeground(r2)
        L70:
            r7.stopSelf(r8)
        L73:
            return
    }
}
