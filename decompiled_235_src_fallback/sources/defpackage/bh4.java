package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bh4  reason: default package */
/* loaded from: classes.dex */
public final class bh4 implements android.os.Handler.Callback, android.content.ServiceConnection {
    public final android.content.Context a;
    public final android.os.Handler b;
    public final java.util.HashMap c;
    public java.util.HashSet d;

    public bh4(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.c = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.d = r0
            r1.a = r2
            android.os.HandlerThread r2 = new android.os.HandlerThread
            java.lang.String r0 = "NotificationManagerCompat"
            r2.<init>(r0)
            r2.start()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = r2.getLooper()
            r0.<init>(r2, r1)
            r1.b = r0
            return
    }

    public final void a(defpackage.ah4 r8) {
            r7 = this;
            java.util.ArrayDeque r0 = r8.d
            android.content.ComponentName r1 = r8.a
            java.lang.String r2 = "NotifManCompat"
            r3 = 3
            boolean r4 = android.util.Log.isLoggable(r2, r3)
            if (r4 == 0) goto L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Processing component "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r5 = ", "
            r4.append(r5)
            int r5 = r0.size()
            r4.append(r5)
            java.lang.String r5 = " queued tasks"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r2, r4)
        L2f:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L37
            goto Ld6
        L37:
            boolean r4 = r8.b
            if (r4 == 0) goto L3d
            r4 = 1
            goto L6e
        L3d:
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r4.<init>(r5)
            android.content.Intent r4 = r4.setComponent(r1)
            r5 = 33
            android.content.Context r6 = r7.a
            boolean r4 = r6.bindService(r4, r7, r5)
            r8.b = r4
            if (r4 == 0) goto L58
            r4 = 0
            r8.e = r4
            goto L6c
        L58:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to bind to listener "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r2, r4)
            r6.unbindService(r7)
        L6c:
            boolean r4 = r8.b
        L6e:
            if (r4 == 0) goto Ld7
            y03 r4 = r8.c
            if (r4 != 0) goto L75
            goto Ld7
        L75:
            java.lang.Object r4 = r0.peek()
            yg4 r4 = (defpackage.yg4) r4
            if (r4 != 0) goto L7e
            goto Lcd
        L7e:
            boolean r5 = android.util.Log.isLoggable(r2, r3)     // Catch: android.os.RemoteException -> L99 android.os.DeadObjectException -> Lb6
            if (r5 == 0) goto L9b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L99 android.os.DeadObjectException -> Lb6
            r5.<init>()     // Catch: android.os.RemoteException -> L99 android.os.DeadObjectException -> Lb6
            java.lang.String r6 = "Sending task "
            r5.append(r6)     // Catch: android.os.RemoteException -> L99 android.os.DeadObjectException -> Lb6
            r5.append(r4)     // Catch: android.os.RemoteException -> L99 android.os.DeadObjectException -> Lb6
            java.lang.String r5 = r5.toString()     // Catch: android.os.RemoteException -> L99 android.os.DeadObjectException -> Lb6
            android.util.Log.d(r2, r5)     // Catch: android.os.RemoteException -> L99 android.os.DeadObjectException -> Lb6
            goto L9b
        L99:
            r3 = move-exception
            goto La4
        L9b:
            y03 r5 = r8.c     // Catch: android.os.RemoteException -> L99 android.os.DeadObjectException -> Lb6
            r4.a(r5)     // Catch: android.os.RemoteException -> L99 android.os.DeadObjectException -> Lb6
            r0.remove()     // Catch: android.os.RemoteException -> L99 android.os.DeadObjectException -> Lb6
            goto L75
        La4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "RemoteException communicating with "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.w(r2, r1, r3)
            goto Lcd
        Lb6:
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto Lcd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Remote service has died: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.d(r2, r1)
        Lcd:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld6
            r7.b(r8)
        Ld6:
            return
        Ld7:
            r7.b(r8)
            return
    }

    public final void b(defpackage.ah4 r8) {
            r7 = this;
            android.content.ComponentName r0 = r8.a
            java.util.ArrayDeque r1 = r8.d
            android.os.Handler r7 = r7.b
            r2 = 3
            boolean r3 = r7.hasMessages(r2, r0)
            if (r3 == 0) goto Le
            return
        Le:
            int r3 = r8.e
            int r4 = r3 + 1
            r8.e = r4
            r5 = 6
            java.lang.String r6 = "NotifManCompat"
            if (r4 <= r5) goto L49
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "Giving up on delivering "
            r7.<init>(r2)
            int r2 = r1.size()
            r7.append(r2)
            java.lang.String r2 = " tasks to "
            r7.append(r2)
            r7.append(r0)
            java.lang.String r0 = " after "
            r7.append(r0)
            int r8 = r8.e
            r7.append(r8)
            java.lang.String r8 = " retries"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r6, r7)
            r1.clear()
            return
        L49:
            r8 = 1
            int r8 = r8 << r3
            int r8 = r8 * 1000
            boolean r1 = android.util.Log.isLoggable(r6, r2)
            if (r1 == 0) goto L69
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Scheduling retry for "
            r1.<init>(r3)
            r1.append(r8)
            java.lang.String r3 = " ms"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r6, r1)
        L69:
            android.os.Message r0 = r7.obtainMessage(r2, r0)
            long r1 = (long) r8
            r7.sendMessageDelayed(r0, r1)
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r12) {
            r11 = this;
            int r0 = r12.what
            r1 = 0
            r2 = 3
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L73
            if (r0 == r4) goto L3e
            r5 = 2
            if (r0 == r5) goto L22
            if (r0 == r2) goto L10
            return r3
        L10:
            java.lang.Object r12 = r12.obj
            android.content.ComponentName r12 = (android.content.ComponentName) r12
            java.util.HashMap r0 = r11.c
            java.lang.Object r12 = r0.get(r12)
            ah4 r12 = (defpackage.ah4) r12
            if (r12 == 0) goto L1e0
            r11.a(r12)
            return r4
        L22:
            java.lang.Object r12 = r12.obj
            android.content.ComponentName r12 = (android.content.ComponentName) r12
            java.util.HashMap r0 = r11.c
            java.lang.Object r12 = r0.get(r12)
            ah4 r12 = (defpackage.ah4) r12
            if (r12 == 0) goto L1e0
            boolean r0 = r12.b
            if (r0 == 0) goto L3b
            android.content.Context r0 = r11.a
            r0.unbindService(r11)
            r12.b = r3
        L3b:
            r12.c = r1
            return r4
        L3e:
            java.lang.Object r12 = r12.obj
            zg4 r12 = (defpackage.zg4) r12
            android.content.ComponentName r0 = r12.a
            android.os.IBinder r12 = r12.b
            java.util.HashMap r2 = r11.c
            java.lang.Object r0 = r2.get(r0)
            ah4 r0 = (defpackage.ah4) r0
            if (r0 == 0) goto L1e0
            int r2 = defpackage.x03.d
            if (r12 != 0) goto L55
            goto L6b
        L55:
            java.lang.String r1 = defpackage.y03.c
            android.os.IInterface r1 = r12.queryLocalInterface(r1)
            if (r1 == 0) goto L64
            boolean r2 = r1 instanceof defpackage.y03
            if (r2 == 0) goto L64
            y03 r1 = (defpackage.y03) r1
            goto L6b
        L64:
            w03 r1 = new w03
            r1.<init>()
            r1.d = r12
        L6b:
            r0.c = r1
            r0.e = r3
            r11.a(r0)
            return r4
        L73:
            java.lang.Object r12 = r12.obj
            yg4 r12 = (defpackage.yg4) r12
            android.content.Context r0 = r11.a
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r5 = "enabled_notification_listeners"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r5)
            java.lang.Object r5 = defpackage.ch4.c
            monitor-enter(r5)
            if (r0 == 0) goto Lbb
            java.lang.String r6 = defpackage.ch4.d     // Catch: java.lang.Throwable -> Lb1
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Throwable -> Lb1
            if (r6 != 0) goto Lbb
            java.lang.String r6 = ":"
            r7 = -1
            java.lang.String[] r6 = r0.split(r6, r7)     // Catch: java.lang.Throwable -> Lb1
            java.util.HashSet r7 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lb1
            int r8 = r6.length     // Catch: java.lang.Throwable -> Lb1
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lb1
            int r8 = r6.length     // Catch: java.lang.Throwable -> Lb1
            r9 = r3
        L9f:
            if (r9 >= r8) goto Lb7
            r10 = r6[r9]     // Catch: java.lang.Throwable -> Lb1
            android.content.ComponentName r10 = android.content.ComponentName.unflattenFromString(r10)     // Catch: java.lang.Throwable -> Lb1
            if (r10 == 0) goto Lb4
            java.lang.String r10 = r10.getPackageName()     // Catch: java.lang.Throwable -> Lb1
            r7.add(r10)     // Catch: java.lang.Throwable -> Lb1
            goto Lb4
        Lb1:
            r11 = move-exception
            goto L1e1
        Lb4:
            int r9 = r9 + 1
            goto L9f
        Lb7:
            defpackage.ch4.e = r7     // Catch: java.lang.Throwable -> Lb1
            defpackage.ch4.d = r0     // Catch: java.lang.Throwable -> Lb1
        Lbb:
            java.util.HashSet r0 = defpackage.ch4.e     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb1
            java.util.HashSet r5 = r11.d
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto Lc8
            goto L1c1
        Lc8:
            r11.d = r0
            android.content.Context r5 = r11.a
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r7 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            android.content.Intent r6 = r6.setAction(r7)
            java.util.List r5 = r5.queryIntentServices(r6, r3)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        Le8:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L12d
            java.lang.Object r7 = r5.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.pm.ServiceInfo r8 = r7.serviceInfo
            java.lang.String r8 = r8.packageName
            boolean r8 = r0.contains(r8)
            if (r8 != 0) goto Lff
            goto Le8
        Lff:
            android.content.ComponentName r8 = new android.content.ComponentName
            android.content.pm.ServiceInfo r9 = r7.serviceInfo
            java.lang.String r10 = r9.packageName
            java.lang.String r9 = r9.name
            r8.<init>(r10, r9)
            android.content.pm.ServiceInfo r7 = r7.serviceInfo
            java.lang.String r7 = r7.permission
            if (r7 == 0) goto L129
            java.lang.String r7 = "NotifManCompat"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Permission present on component "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = ", not adding listener record."
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.w(r7, r8)
            goto Le8
        L129:
            r6.add(r8)
            goto Le8
        L12d:
            java.util.Iterator r0 = r6.iterator()
        L131:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L16b
            java.lang.Object r5 = r0.next()
            android.content.ComponentName r5 = (android.content.ComponentName) r5
            java.util.HashMap r7 = r11.c
            boolean r7 = r7.containsKey(r5)
            if (r7 != 0) goto L131
            java.lang.String r7 = "NotifManCompat"
            boolean r7 = android.util.Log.isLoggable(r7, r2)
            if (r7 == 0) goto L160
            java.lang.String r7 = "NotifManCompat"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Adding listener record for "
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r7, r8)
        L160:
            java.util.HashMap r7 = r11.c
            ah4 r8 = new ah4
            r8.<init>(r5)
            r7.put(r5, r8)
            goto L131
        L16b:
            java.util.HashMap r0 = r11.c
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L175:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L1c1
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getKey()
            boolean r7 = r6.contains(r7)
            if (r7 != 0) goto L175
            java.lang.String r7 = "NotifManCompat"
            boolean r7 = android.util.Log.isLoggable(r7, r2)
            if (r7 == 0) goto L1aa
            java.lang.String r7 = "NotifManCompat"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Removing listener record for "
            r8.<init>(r9)
            java.lang.Object r9 = r5.getKey()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r7, r8)
        L1aa:
            java.lang.Object r5 = r5.getValue()
            ah4 r5 = (defpackage.ah4) r5
            boolean r7 = r5.b
            if (r7 == 0) goto L1bb
            android.content.Context r7 = r11.a
            r7.unbindService(r11)
            r5.b = r3
        L1bb:
            r5.c = r1
            r0.remove()
            goto L175
        L1c1:
            java.util.HashMap r0 = r11.c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L1cb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e0
            java.lang.Object r1 = r0.next()
            ah4 r1 = (defpackage.ah4) r1
            java.util.ArrayDeque r2 = r1.d
            r2.add(r12)
            r11.a(r1)
            goto L1cb
        L1e0:
            return r4
        L1e1:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb1
            throw r11
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            r3 = this;
            r0 = 3
            java.lang.String r1 = "NotifManCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Connected to service "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1a:
            zg4 r0 = new zg4
            r0.<init>(r4, r5)
            android.os.Handler r3 = r3.b
            r4 = 1
            android.os.Message r3 = r3.obtainMessage(r4, r0)
            r3.sendToTarget()
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r4) {
            r3 = this;
            r0 = 3
            java.lang.String r1 = "NotifManCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Disconnected from service "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1a:
            android.os.Handler r3 = r3.b
            r0 = 2
            android.os.Message r3 = r3.obtainMessage(r0, r4)
            r3.sendToTarget()
            return
    }
}
