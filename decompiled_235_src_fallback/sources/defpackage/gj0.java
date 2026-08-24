package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gj0  reason: default package */
/* loaded from: classes.dex */
public final class gj0 {
    public static final java.lang.Object s = null;
    public static final android.util.SparseArray t = null;
    public final defpackage.kh0 a;
    public final java.lang.Object b;
    public final defpackage.ij0 c;
    public final java.util.concurrent.Executor d;
    public final android.os.Handler e;
    public final android.os.HandlerThread f;
    public defpackage.if0 g;
    public defpackage.mi0 h;
    public defpackage.aj0 i;
    public defpackage.rr6 j;
    public defpackage.eb k;
    public final defpackage.jp5 l;
    public final defpackage.tb0 m;
    public final defpackage.gh0 n;
    public final defpackage.ex6 o;
    public defpackage.fj0 p;
    public defpackage.gx3 q;
    public final java.lang.Integer r;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.gj0.s = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            defpackage.gj0.t = r0
            return
    }

    public gj0(android.content.Context r10, defpackage.wt3 r11) {
            r9 = this;
            r9.<init>()
            kh0 r11 = new kh0
            r11.<init>()
            r9.a = r11
            java.lang.Object r11 = new java.lang.Object
            r11.<init>()
            r9.b = r11
            fj0 r11 = defpackage.fj0.UNINITIALIZED
            r9.p = r11
            n33 r11 = defpackage.n33.L
            r9.q = r11
            android.content.Context r2 = defpackage.q41.a(r10)
            java.lang.String r11 = "CameraX"
            android.content.Context r0 = r10.getApplicationContext()
        L23:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            r3 = 0
            if (r1 == 0) goto L36
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L2f
            android.app.Application r0 = (android.app.Application) r0
            goto L37
        L2f:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L23
        L36:
            r0 = r3
        L37:
            boolean r1 = r0 instanceof defpackage.hj0
            r4 = 640(0x280, float:8.97E-43)
            if (r1 == 0) goto L40
            hj0 r0 = (defpackage.hj0) r0
            goto L8d
        L40:
            android.content.Context r10 = defpackage.q41.a(r10)     // Catch: java.lang.NullPointerException -> L5e java.lang.IllegalAccessException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.ClassNotFoundException -> L69 android.content.pm.PackageManager.NameNotFoundException -> L6b
            android.content.pm.PackageManager r0 = r10.getPackageManager()     // Catch: java.lang.NullPointerException -> L5e java.lang.IllegalAccessException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.ClassNotFoundException -> L69 android.content.pm.PackageManager.NameNotFoundException -> L6b
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.NullPointerException -> L5e java.lang.IllegalAccessException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.ClassNotFoundException -> L69 android.content.pm.PackageManager.NameNotFoundException -> L6b
            java.lang.Class<androidx.camera.core.impl.MetadataHolderService> r5 = androidx.camera.core.impl.MetadataHolderService.class
            r1.<init>(r10, r5)     // Catch: java.lang.NullPointerException -> L5e java.lang.IllegalAccessException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.ClassNotFoundException -> L69 android.content.pm.PackageManager.NameNotFoundException -> L6b
            android.content.pm.ServiceInfo r10 = r0.getServiceInfo(r1, r4)     // Catch: java.lang.NullPointerException -> L5e java.lang.IllegalAccessException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.ClassNotFoundException -> L69 android.content.pm.PackageManager.NameNotFoundException -> L6b
            android.os.Bundle r10 = r10.metaData     // Catch: java.lang.NullPointerException -> L5e java.lang.IllegalAccessException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.ClassNotFoundException -> L69 android.content.pm.PackageManager.NameNotFoundException -> L6b
            if (r10 == 0) goto L6d
            java.lang.String r0 = "androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER"
            java.lang.String r10 = r10.getString(r0)     // Catch: java.lang.NullPointerException -> L5e java.lang.IllegalAccessException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.ClassNotFoundException -> L69 android.content.pm.PackageManager.NameNotFoundException -> L6b
            goto L6e
        L5e:
            r0 = move-exception
        L5f:
            r10 = r0
            goto L87
        L61:
            r0 = move-exception
            goto L5f
        L63:
            r0 = move-exception
            goto L5f
        L65:
            r0 = move-exception
            goto L5f
        L67:
            r0 = move-exception
            goto L5f
        L69:
            r0 = move-exception
            goto L5f
        L6b:
            r0 = move-exception
            goto L5f
        L6d:
            r10 = r3
        L6e:
            if (r10 != 0) goto L77
            java.lang.String r10 = "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'."
            defpackage.kj2.v(r11, r10)     // Catch: java.lang.NullPointerException -> L5e java.lang.IllegalAccessException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.ClassNotFoundException -> L69 android.content.pm.PackageManager.NameNotFoundException -> L6b
        L75:
            r0 = r3
            goto L8d
        L77:
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.NullPointerException -> L5e java.lang.IllegalAccessException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.ClassNotFoundException -> L69 android.content.pm.PackageManager.NameNotFoundException -> L6b
            java.lang.reflect.Constructor r10 = r10.getDeclaredConstructor(r3)     // Catch: java.lang.NullPointerException -> L5e java.lang.IllegalAccessException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.ClassNotFoundException -> L69 android.content.pm.PackageManager.NameNotFoundException -> L6b
            java.lang.Object r10 = r10.newInstance(r3)     // Catch: java.lang.NullPointerException -> L5e java.lang.IllegalAccessException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.ClassNotFoundException -> L69 android.content.pm.PackageManager.NameNotFoundException -> L6b
            r0 = r10
            hj0 r0 = (defpackage.hj0) r0     // Catch: java.lang.NullPointerException -> L5e java.lang.IllegalAccessException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.ClassNotFoundException -> L69 android.content.pm.PackageManager.NameNotFoundException -> L6b
            goto L8d
        L87:
            java.lang.String r0 = "Failed to retrieve default CameraXConfig.Provider from meta-data"
            defpackage.kj2.w(r11, r0, r10)
            goto L75
        L8d:
            if (r0 == 0) goto L297
            ij0 r10 = r0.getCameraXConfig()
            r9.c = r10
            go4 r10 = r10.A
            xx r11 = defpackage.ij0.g0
            java.lang.Object r10 = r10.b(r11, r3)
            v65 r10 = (defpackage.v65) r10
            if (r10 == 0) goto Lb5
            java.lang.String r11 = "CameraX"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "QuirkSettings from CameraXConfig: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            defpackage.kj2.t(r11, r0)
            goto Lef
        Lb5:
            java.lang.String r10 = "QuirkSettingsLoader"
            android.content.pm.PackageManager r11 = r2.getPackageManager()
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld6
            java.lang.Class<x65> r1 = defpackage.x65.class
            r0.<init>(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld6
            android.content.pm.ServiceInfo r11 = r11.getServiceInfo(r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld6
            android.os.Bundle r11 = r11.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld6
            if (r11 != 0) goto Ld1
            java.lang.String r11 = "No metadata in MetadataHolderService."
            defpackage.kj2.f0(r10, r11)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld6
        Lcf:
            r10 = r3
            goto Ldc
        Ld1:
            v65 r10 = defpackage.bl2.m(r2, r11)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld6
            goto Ldc
        Ld6:
            java.lang.String r11 = "QuirkSettings$MetadataHolderService is not found."
            defpackage.kj2.t(r10, r11)
            goto Lcf
        Ldc:
            java.lang.String r11 = "CameraX"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "QuirkSettings from app metadata: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            defpackage.kj2.t(r11, r0)
        Lef:
            if (r10 != 0) goto L106
            v65 r10 = defpackage.w65.b
            java.lang.String r11 = "CameraX"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "QuirkSettings by default: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            defpackage.kj2.t(r11, r0)
        L106:
            w65 r11 = defpackage.w65.c
            ra4 r11 = r11.a
            java.lang.Object r1 = r11.c
            monitor-enter(r1)
            java.lang.Object r0 = r11.d     // Catch: java.lang.Throwable -> L11f
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch: java.lang.Throwable -> L11f
            java.lang.Object r0 = r0.getAndSet(r10)     // Catch: java.lang.Throwable -> L11f
            boolean r10 = java.util.Objects.equals(r0, r10)     // Catch: java.lang.Throwable -> L11f
            r0 = 0
            r4 = 1
            if (r10 == 0) goto L123
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11f
            goto L153
        L11f:
            r0 = move-exception
            r9 = r0
            goto L295
        L123:
            int r10 = r11.a     // Catch: java.lang.Throwable -> L11f
            int r10 = r10 + r4
            r11.a = r10     // Catch: java.lang.Throwable -> L11f
            boolean r5 = r11.b     // Catch: java.lang.Throwable -> L11f
            if (r5 == 0) goto L12e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11f
            goto L153
        L12e:
            r11.b = r4     // Catch: java.lang.Throwable -> L11f
            java.lang.Object r5 = r11.f     // Catch: java.lang.Throwable -> L11f
            java.util.concurrent.CopyOnWriteArraySet r5 = (java.util.concurrent.CopyOnWriteArraySet) r5     // Catch: java.lang.Throwable -> L11f
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L11f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11f
        L139:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L149
            java.lang.Object r1 = r5.next()
            gq6 r1 = (defpackage.gq6) r1
            r1.a(r10)
            goto L139
        L149:
            java.lang.Object r5 = r11.c
            monitor-enter(r5)
            int r1 = r11.a     // Catch: java.lang.Throwable -> L280
            if (r1 != r10) goto L283
            r11.b = r0     // Catch: java.lang.Throwable -> L280
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L280
        L153:
            ij0 r10 = r9.c
            go4 r10 = r10.A
            xx r11 = defpackage.ij0.X
            java.lang.Object r10 = r10.b(r11, r3)
            java.util.concurrent.Executor r10 = (java.util.concurrent.Executor) r10
            ij0 r11 = r9.c
            go4 r11 = r11.A
            xx r1 = defpackage.ij0.Y
            java.lang.Object r11 = r11.b(r1, r3)
            android.os.Handler r11 = (android.os.Handler) r11
            if (r10 != 0) goto L172
            gf0 r10 = new gf0
            r10.<init>()
        L172:
            r9.d = r10
            if (r11 != 0) goto L18f
            android.os.HandlerThread r11 = new android.os.HandlerThread
            java.lang.String r1 = "CameraX-scheduler"
            r5 = 10
            r11.<init>(r1, r5)
            r9.f = r11
            r11.start()
            android.os.Looper r11 = r11.getLooper()
            android.os.Handler r11 = defpackage.uj2.u(r11)
            r9.e = r11
            goto L193
        L18f:
            r9.f = r3
            r9.e = r11
        L193:
            ij0 r11 = r9.c
            xx r1 = defpackage.ij0.Z
            java.lang.Object r11 = r11.b(r1, r3)
            java.lang.Integer r11 = (java.lang.Integer) r11
            r9.r = r11
            java.lang.Object r1 = defpackage.gj0.s
            monitor-enter(r1)
            if (r11 != 0) goto L1aa
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a6
            goto L1e1
        L1a6:
            r0 = move-exception
            r9 = r0
            goto L27e
        L1aa:
            int r3 = r11.intValue()     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r5 = "minLogLevel"
            r6 = 3
            r7 = 6
            defpackage.np2.u(r3, r6, r7, r5)     // Catch: java.lang.Throwable -> L1a6
            android.util.SparseArray r3 = defpackage.gj0.t     // Catch: java.lang.Throwable -> L1a6
            int r5 = r11.intValue()     // Catch: java.lang.Throwable -> L1a6
            java.lang.Object r5 = r3.get(r5)     // Catch: java.lang.Throwable -> L1a6
            if (r5 == 0) goto L1d1
            int r5 = r11.intValue()     // Catch: java.lang.Throwable -> L1a6
            java.lang.Object r5 = r3.get(r5)     // Catch: java.lang.Throwable -> L1a6
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L1a6
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L1a6
            int r5 = r5 + r4
            goto L1d2
        L1d1:
            r5 = r4
        L1d2:
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L1a6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L1a6
            r3.put(r11, r5)     // Catch: java.lang.Throwable -> L1a6
            c()     // Catch: java.lang.Throwable -> L1a6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a6
        L1e1:
            ij0 r11 = r9.c
            go4 r11 = r11.A
            xx r1 = defpackage.ij0.f0
            ih0 r3 = defpackage.jp5.a
            java.lang.Object r11 = r11.b(r1, r3)
            jp5 r11 = (defpackage.jp5) r11
            java.util.Objects.requireNonNull(r11)
            long r5 = r11.a()
            boolean r1 = r11 instanceof defpackage.ih0
            if (r1 == 0) goto L20d
            ih0 r11 = (defpackage.ih0) r11
            int r11 = r11.b
            switch(r11) {
                case 0: goto L207;
                default: goto L201;
            }
        L201:
            ih0 r11 = new ih0
            r11.<init>(r4, r5)
            goto L213
        L207:
            ih0 r11 = new ih0
            r11.<init>(r0, r5)
            goto L213
        L20d:
            f67 r1 = new f67
            r1.<init>(r5, r11)
            r11 = r1
        L213:
            r9.l = r11
            gh0 r11 = new gh0
            android.os.Handler r1 = r9.e
            ov2 r3 = new ov2
            r3.<init>(r1)
            r11.<init>(r10, r3)
            r9.n = r11
            ej0 r11 = new ej0
            r11.<init>(r2, r0)
            ex6 r1 = new ex6
            r1.<init>(r11)
            r9.o = r1
            java.lang.Object r11 = r9.b
            monitor-enter(r11)
            fj0 r1 = r9.p     // Catch: java.lang.Throwable -> L27a
            fj0 r3 = defpackage.fj0.UNINITIALIZED     // Catch: java.lang.Throwable -> L27a
            if (r1 != r3) goto L239
            r0 = r4
        L239:
            java.lang.String r1 = "CameraX.initInternal() should only be called once per instance"
            defpackage.np2.A(r1, r0)     // Catch: java.lang.Throwable -> L27a
            fj0 r0 = defpackage.fj0.INITIALIZING     // Catch: java.lang.Throwable -> L27a
            r9.p = r0     // Catch: java.lang.Throwable -> L27a
            qb0 r5 = new qb0     // Catch: java.lang.Throwable -> L27a
            r5.<init>()     // Catch: java.lang.Throwable -> L27a
            hl5 r0 = new hl5     // Catch: java.lang.Throwable -> L27a
            r0.<init>()     // Catch: java.lang.Throwable -> L27a
            r5.c = r0     // Catch: java.lang.Throwable -> L27a
            tb0 r8 = new tb0     // Catch: java.lang.Throwable -> L27a
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L27a
            r5.b = r8     // Catch: java.lang.Throwable -> L27a
            java.lang.Class<i61> r0 = defpackage.i61.class
            r5.a = r0     // Catch: java.lang.Throwable -> L27a
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> L270 java.lang.Throwable -> L27a
            dj0 r0 = new dj0     // Catch: java.lang.Exception -> L270 java.lang.Throwable -> L27a
            r4 = 1
            r1 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L26d java.lang.Throwable -> L27a
            r3.execute(r0)     // Catch: java.lang.Exception -> L26d java.lang.Throwable -> L27a
            java.lang.String r9 = "CameraX initInternal"
            r5.a = r9     // Catch: java.lang.Exception -> L26d java.lang.Throwable -> L27a
            goto L276
        L26d:
            r0 = move-exception
        L26e:
            r9 = r0
            goto L273
        L270:
            r0 = move-exception
            r1 = r9
            goto L26e
        L273:
            r8.b(r9)     // Catch: java.lang.Throwable -> L27a
        L276:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L27a
            r1.m = r8
            return
        L27a:
            r0 = move-exception
            r9 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L27a
            throw r9
        L27e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a6
            throw r9
        L280:
            r0 = move-exception
            r9 = r0
            goto L293
        L283:
            r1 = r9
            java.lang.Object r9 = r11.f     // Catch: java.lang.Throwable -> L280
            java.util.concurrent.CopyOnWriteArraySet r9 = (java.util.concurrent.CopyOnWriteArraySet) r9     // Catch: java.lang.Throwable -> L280
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L280
            int r10 = r11.a     // Catch: java.lang.Throwable -> L280
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L280
            r5 = r9
            r9 = r1
            goto L139
        L293:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L280
            throw r9
        L295:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11f
            throw r9
        L297:
            java.lang.String r9 = "CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'."
            defpackage.i.m(r9)
            throw r3
    }

    public static void a(java.lang.Integer r3) {
            java.lang.Object r0 = defpackage.gj0.s
            monitor-enter(r0)
            if (r3 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r3 = move-exception
            goto L35
        L9:
            android.util.SparseArray r1 = defpackage.gj0.t     // Catch: java.lang.Throwable -> L7
            int r2 = r3.intValue()     // Catch: java.lang.Throwable -> L7
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L7
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L7
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7
            int r2 = r2 + (-1)
            if (r2 != 0) goto L25
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L7
            r1.remove(r3)     // Catch: java.lang.Throwable -> L7
            goto L30
        L25:
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L7
        L30:
            c()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r3
    }

    public static void b(defpackage.ou r6) {
            boolean r0 = defpackage.ln2.H()
            if (r0 == 0) goto L5d
            if (r6 == 0) goto Lb
            int r6 = r6.a
            goto Lc
        Lb:
            r6 = -1
        Lc:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            java.lang.String r2 = "CX:CameraProvider-RetryStatus"
            if (r0 < r1) goto L1c
            java.lang.String r0 = defpackage.ln2.f0(r2)
            defpackage.rp.t(r6, r0)
            return
        L1c:
            java.lang.String r0 = defpackage.ln2.f0(r2)
            java.lang.String r1 = "traceCounter"
            java.lang.reflect.Method r2 = defpackage.ln2.f     // Catch: java.lang.Exception -> L39
            if (r2 != 0) goto L3b
            java.lang.Class<android.os.Trace> r2 = android.os.Trace.class
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L39
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L39
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4, r5}     // Catch: java.lang.Exception -> L39
            java.lang.reflect.Method r2 = r2.getMethod(r1, r3)     // Catch: java.lang.Exception -> L39
            defpackage.ln2.f = r2     // Catch: java.lang.Exception -> L39
            goto L3b
        L39:
            r6 = move-exception
            goto L5a
        L3b:
            java.lang.reflect.Method r2 = defpackage.ln2.f     // Catch: java.lang.Exception -> L39
            if (r2 == 0) goto L52
            long r3 = defpackage.ln2.b     // Catch: java.lang.Exception -> L39
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L39
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L39
            java.lang.Object[] r6 = new java.lang.Object[]{r3, r0, r6}     // Catch: java.lang.Exception -> L39
            r0 = 0
            r2.invoke(r0, r6)     // Catch: java.lang.Exception -> L39
            goto L5d
        L52:
            java.lang.String r6 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L39
            r0.<init>(r6)     // Catch: java.lang.Exception -> L39
            throw r0     // Catch: java.lang.Exception -> L39
        L5a:
            defpackage.ln2.F(r1, r6)
        L5d:
            return
    }

    public static void c() {
            android.util.SparseArray r0 = defpackage.gj0.t
            int r1 = r0.size()
            r2 = 3
            if (r1 != 0) goto Lc
            defpackage.kj2.c = r2
            return
        Lc:
            java.lang.Object r1 = r0.get(r2)
            if (r1 == 0) goto L15
            defpackage.kj2.c = r2
            return
        L15:
            r1 = 4
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L1f
            defpackage.kj2.c = r1
            return
        L1f:
            r1 = 5
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L29
            defpackage.kj2.c = r1
            return
        L29:
            r1 = 6
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L32
            defpackage.kj2.c = r1
        L32:
            return
    }
}
