package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xh6  reason: default package */
/* loaded from: classes.dex */
public final class xh6 implements defpackage.e82 {
    public final androidx.window.sidecar.SidecarInterface a;
    public final defpackage.uh6 b;
    public final java.util.LinkedHashMap c;
    public final java.util.LinkedHashMap d;
    public defpackage.m44 e;

    public xh6(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            androidx.window.sidecar.SidecarInterface r2 = defpackage.vh6.a(r2)
            uh6 r0 = new uh6
            r0.<init>()
            r1.<init>()
            r1.a = r2
            r1.b = r0
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.c = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.d = r2
            return
    }

    public final defpackage.kv7 a(android.app.Activity r3) {
            r2 = this;
            android.view.Window r3 = r3.getWindow()
            r0 = 0
            if (r3 == 0) goto L10
            android.view.WindowManager$LayoutParams r3 = r3.getAttributes()
            if (r3 == 0) goto L10
            android.os.IBinder r3 = r3.token
            goto L11
        L10:
            r3 = r0
        L11:
            if (r3 != 0) goto L1b
            kv7 r2 = new kv7
            yt1 r3 = defpackage.yt1.A
            r2.<init>(r3)
            return r2
        L1b:
            androidx.window.sidecar.SidecarInterface r1 = r2.a
            if (r1 == 0) goto L23
            androidx.window.sidecar.SidecarWindowLayoutInfo r0 = r1.getWindowLayoutInfo(r3)
        L23:
            androidx.window.sidecar.SidecarInterface r3 = r2.a
            if (r3 == 0) goto L2d
            androidx.window.sidecar.SidecarDeviceState r3 = r3.getDeviceState()
            if (r3 != 0) goto L32
        L2d:
            androidx.window.sidecar.SidecarDeviceState r3 = new androidx.window.sidecar.SidecarDeviceState
            r3.<init>()
        L32:
            uh6 r2 = r2.b
            kv7 r2 = r2.c(r0, r3)
            return r2
    }

    public final void b(android.app.Activity r6) {
            r5 = this;
            android.view.Window r0 = r6.getWindow()
            r1 = 0
            if (r0 == 0) goto L10
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            if (r0 == 0) goto L10
            android.os.IBinder r0 = r0.token
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 != 0) goto L14
            goto L66
        L14:
            androidx.window.sidecar.SidecarInterface r2 = r5.a
            if (r2 == 0) goto L1b
            r2.onWindowLayoutChangeListenerRemoved(r0)
        L1b:
            java.util.LinkedHashMap r2 = r5.d
            java.lang.Object r3 = r2.get(r6)
            b31 r3 = (defpackage.b31) r3
            if (r3 != 0) goto L26
            goto L33
        L26:
            boolean r4 = r6 instanceof defpackage.kl4
            if (r4 == 0) goto L30
            r4 = r6
            kl4 r4 = (defpackage.kl4) r4
            r4.l(r3)
        L30:
            r2.remove(r6)
        L33:
            m44 r2 = r5.e
            if (r2 == 0) goto L4e
            java.lang.Object r3 = r2.L
            java.util.concurrent.locks.ReentrantLock r3 = (java.util.concurrent.locks.ReentrantLock) r3
            r3.lock()
            java.lang.Object r2 = r2.R     // Catch: java.lang.Throwable -> L49
            java.util.WeakHashMap r2 = (java.util.WeakHashMap) r2     // Catch: java.lang.Throwable -> L49
            r2.put(r6, r1)     // Catch: java.lang.Throwable -> L49
            r3.unlock()
            goto L4e
        L49:
            r5 = move-exception
            r3.unlock()
            throw r5
        L4e:
            java.util.LinkedHashMap r6 = r5.c
            int r1 = r6.size()
            r2 = 1
            if (r1 != r2) goto L59
            r1 = r2
            goto L5a
        L59:
            r1 = 0
        L5a:
            r6.remove(r0)
            if (r1 == 0) goto L66
            androidx.window.sidecar.SidecarInterface r5 = r5.a
            if (r5 == 0) goto L66
            r5.onDeviceStateListenersChanged(r2)
        L66:
            return
    }

    public final void c(android.os.IBinder r3, android.app.Activity r4) {
            r2 = this;
            java.util.LinkedHashMap r0 = r2.c
            r0.put(r3, r4)
            androidx.window.sidecar.SidecarInterface r1 = r2.a
            if (r1 == 0) goto Lc
            r1.onWindowLayoutChangeListenerAdded(r3)
        Lc:
            int r3 = r0.size()
            r0 = 1
            if (r3 != r0) goto L1b
            androidx.window.sidecar.SidecarInterface r3 = r2.a
            if (r3 == 0) goto L1b
            r0 = 0
            r3.onDeviceStateListenersChanged(r0)
        L1b:
            m44 r3 = r2.e
            if (r3 == 0) goto L26
            kv7 r0 = r2.a(r4)
            r3.B(r4, r0)
        L26:
            java.util.LinkedHashMap r3 = r2.d
            java.lang.Object r0 = r3.get(r4)
            if (r0 != 0) goto L40
            boolean r0 = r4 instanceof defpackage.kl4
            if (r0 == 0) goto L40
            ri0 r0 = new ri0
            r1 = 3
            r0.<init>(r1, r2, r4)
            r3.put(r4, r0)
            kl4 r4 = (defpackage.kl4) r4
            r4.k(r0)
        L40:
            return
    }

    public final void d(defpackage.s35 r3) {
            r2 = this;
            m44 r0 = new m44
            r0.<init>(r3)
            r2.e = r0
            androidx.window.sidecar.SidecarInterface r3 = r2.a
            if (r3 == 0) goto L1e
            androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback r0 = new androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback
            androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback r1 = new androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
            r1.<init>(r2)
            androidx.window.sidecar.SidecarInterface$SidecarCallback r1 = (androidx.window.sidecar.SidecarInterface.SidecarCallback) r1
            uh6 r2 = r2.b
            r0.<init>(r2, r1)
            androidx.window.sidecar.SidecarInterface$SidecarCallback r0 = (androidx.window.sidecar.SidecarInterface.SidecarCallback) r0
            r3.setSidecarCallback(r0)
        L1e:
            return
    }

    public final boolean e() {
            r10 = this;
            java.lang.String r0 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            java.lang.String r1 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            java.lang.String r2 = "Illegal return type for 'getWindowLayoutInfo': "
            java.lang.String r3 = "Illegal return type for 'setSidecarCallback': "
            androidx.window.sidecar.SidecarInterface r4 = r10.a     // Catch: java.lang.Throwable -> L194
            r5 = 0
            if (r4 == 0) goto L20
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L194
            if (r4 == 0) goto L20
            java.lang.String r6 = "setSidecarCallback"
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r7 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L194
            java.lang.reflect.Method r4 = r4.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L194
            goto L21
        L20:
            r4 = r5
        L21:
            if (r4 == 0) goto L28
            java.lang.Class r4 = r4.getReturnType()     // Catch: java.lang.Throwable -> L194
            goto L29
        L28:
            r4 = r5
        L29:
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L194
            boolean r7 = defpackage.nb3.k(r4, r6)     // Catch: java.lang.Throwable -> L194
            if (r7 == 0) goto L182
            androidx.window.sidecar.SidecarInterface r3 = r10.a     // Catch: java.lang.Throwable -> L194
            if (r3 == 0) goto L38
            r3.getDeviceState()     // Catch: java.lang.Throwable -> L194
        L38:
            androidx.window.sidecar.SidecarInterface r3 = r10.a     // Catch: java.lang.Throwable -> L194
            r4 = 1
            if (r3 == 0) goto L40
            r3.onDeviceStateListenersChanged(r4)     // Catch: java.lang.Throwable -> L194
        L40:
            androidx.window.sidecar.SidecarInterface r3 = r10.a     // Catch: java.lang.Throwable -> L194
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            if (r3 == 0) goto L57
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L194
            if (r3 == 0) goto L57
            java.lang.String r8 = "getWindowLayoutInfo"
            java.lang.Class[] r9 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L194
            java.lang.reflect.Method r3 = r3.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L194
            goto L58
        L57:
            r3 = r5
        L58:
            if (r3 == 0) goto L5f
            java.lang.Class r3 = r3.getReturnType()     // Catch: java.lang.Throwable -> L194
            goto L60
        L5f:
            r3 = r5
        L60:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r8 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r8 = defpackage.nb3.k(r3, r8)     // Catch: java.lang.Throwable -> L194
            if (r8 == 0) goto L170
            androidx.window.sidecar.SidecarInterface r2 = r10.a     // Catch: java.lang.Throwable -> L194
            if (r2 == 0) goto L7d
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L194
            if (r2 == 0) goto L7d
            java.lang.String r3 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class[] r8 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L194
            java.lang.reflect.Method r2 = r2.getMethod(r3, r8)     // Catch: java.lang.Throwable -> L194
            goto L7e
        L7d:
            r2 = r5
        L7e:
            if (r2 == 0) goto L85
            java.lang.Class r2 = r2.getReturnType()     // Catch: java.lang.Throwable -> L194
            goto L86
        L85:
            r2 = r5
        L86:
            boolean r3 = defpackage.nb3.k(r2, r6)     // Catch: java.lang.Throwable -> L194
            if (r3 == 0) goto L15e
            androidx.window.sidecar.SidecarInterface r10 = r10.a     // Catch: java.lang.Throwable -> L194
            if (r10 == 0) goto La1
            java.lang.Class r10 = r10.getClass()     // Catch: java.lang.Throwable -> L194
            if (r10 == 0) goto La1
            java.lang.String r1 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class[] r2 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L194
            java.lang.reflect.Method r10 = r10.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L194
            goto La2
        La1:
            r10 = r5
        La2:
            if (r10 == 0) goto La9
            java.lang.Class r10 = r10.getReturnType()     // Catch: java.lang.Throwable -> L194
            goto Laa
        La9:
            r10 = r5
        Laa:
            boolean r1 = defpackage.nb3.k(r10, r6)     // Catch: java.lang.Throwable -> L194
            if (r1 == 0) goto L14c
            androidx.window.sidecar.SidecarDeviceState r10 = new androidx.window.sidecar.SidecarDeviceState     // Catch: java.lang.Throwable -> L194
            r10.<init>()     // Catch: java.lang.Throwable -> L194
            r0 = 3
            r10.posture = r0     // Catch: java.lang.NoSuchFieldError -> Lb9 java.lang.Throwable -> L194
            goto Le9
        Lb9:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r1 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r2 = "setPosture"
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L194
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L194
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L194
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L194
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L194
            r1.invoke(r10, r2)     // Catch: java.lang.Throwable -> L194
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r1 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r2 = "getPosture"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L194
            java.lang.Object r10 = r1.invoke(r10, r5)     // Catch: java.lang.Throwable -> L194
            r10.getClass()     // Catch: java.lang.Throwable -> L194
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Throwable -> L194
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L194
            if (r10 != r0) goto L144
        Le9:
            androidx.window.sidecar.SidecarDisplayFeature r10 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch: java.lang.Throwable -> L194
            r10.<init>()     // Catch: java.lang.Throwable -> L194
            android.graphics.Rect r0 = r10.getRect()     // Catch: java.lang.Throwable -> L194
            r0.getClass()     // Catch: java.lang.Throwable -> L194
            r10.setRect(r0)     // Catch: java.lang.Throwable -> L194
            r10.getType()     // Catch: java.lang.Throwable -> L194
            r10.setType(r4)     // Catch: java.lang.Throwable -> L194
            androidx.window.sidecar.SidecarWindowLayoutInfo r0 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch: java.lang.Throwable -> L194
            r0.<init>()     // Catch: java.lang.Throwable -> L194
            java.util.List r10 = r0.displayFeatures     // Catch: java.lang.NoSuchFieldError -> L107 java.lang.Throwable -> L194
            goto L195
        L107:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L194
            r1.<init>()     // Catch: java.lang.Throwable -> L194
            r1.add(r10)     // Catch: java.lang.Throwable -> L194
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r10 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r2 = "setDisplayFeatures"
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L194
            java.lang.reflect.Method r10 = r10.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L194
            java.lang.Object[] r2 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L194
            r10.invoke(r0, r2)     // Catch: java.lang.Throwable -> L194
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r10 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r2 = "getDisplayFeatures"
            java.lang.reflect.Method r10 = r10.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L194
            java.lang.Object r10 = r10.invoke(r0, r5)     // Catch: java.lang.Throwable -> L194
            r10.getClass()     // Catch: java.lang.Throwable -> L194
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L194
            boolean r10 = r1.equals(r10)     // Catch: java.lang.Throwable -> L194
            if (r10 == 0) goto L13c
            goto L195
        L13c:
            java.lang.Exception r10 = new java.lang.Exception     // Catch: java.lang.Throwable -> L194
            java.lang.String r0 = "Invalid display feature getter/setter"
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L194
            throw r10     // Catch: java.lang.Throwable -> L194
        L144:
            java.lang.Exception r10 = new java.lang.Exception     // Catch: java.lang.Throwable -> L194
            java.lang.String r0 = "Invalid device posture getter/setter"
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L194
            throw r10     // Catch: java.lang.Throwable -> L194
        L14c:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> L194
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L194
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L194
            r2.append(r10)     // Catch: java.lang.Throwable -> L194
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L194
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L194
            throw r1     // Catch: java.lang.Throwable -> L194
        L15e:
            java.lang.NoSuchMethodException r10 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> L194
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L194
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L194
            r0.append(r2)     // Catch: java.lang.Throwable -> L194
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L194
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L194
            throw r10     // Catch: java.lang.Throwable -> L194
        L170:
            java.lang.NoSuchMethodException r10 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> L194
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L194
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L194
            r0.append(r3)     // Catch: java.lang.Throwable -> L194
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L194
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L194
            throw r10     // Catch: java.lang.Throwable -> L194
        L182:
            java.lang.NoSuchMethodException r10 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> L194
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L194
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L194
            r0.append(r4)     // Catch: java.lang.Throwable -> L194
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L194
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L194
            throw r10     // Catch: java.lang.Throwable -> L194
        L194:
            r4 = 0
        L195:
            return r4
    }
}
