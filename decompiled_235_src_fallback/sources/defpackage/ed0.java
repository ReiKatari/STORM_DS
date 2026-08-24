package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed0  reason: default package */
/* loaded from: classes.dex */
public final class ed0 {
    public final defpackage.n55 a;
    public final defpackage.t57 b;
    public final defpackage.id0 c;
    public final defpackage.n55 d;
    public final defpackage.o41 e;
    public final java.lang.Object f;
    public java.util.ArrayList g;
    public final java.util.LinkedHashMap h;
    public final java.util.LinkedHashMap i;
    public final int j;
    public final defpackage.be5 k;
    public final defpackage.ex6 l;

    public ed0(defpackage.n55 r1, defpackage.t57 r2, android.content.Context r3, android.content.pm.PackageManager r4, defpackage.id0 r5, defpackage.n55 r6, defpackage.zg0 r7, defpackage.rc3 r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r5
            r0.d = r6
            gu6 r1 = new gu6
            r1.<init>(r8)
            n61 r2 = r2.h
            l61 r1 = defpackage.jw2.y(r1, r2)
            r61 r2 = new r61
            java.lang.String r3 = "Camera2DeviceCache"
            r2.<init>(r3)
            l61 r1 = r1.N(r2)
            o41 r1 = defpackage.g04.i(r1)
            r0.e = r1
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r0.f = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r0.h = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r0.i = r2
            java.lang.String r2 = "android.hardware.camera"
            boolean r2 = r4.hasSystemFeature(r2)
            java.lang.String r3 = "android.hardware.camera.front"
            boolean r3 = r4.hasSystemFeature(r3)
            if (r3 == 0) goto L61
            int r2 = r2 + 1
        L61:
            r0.j = r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Camera2DeviceCache: Expected minimum camera count = "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "CXCP"
            android.util.Log.d(r3, r2)
            wg0 r2 = defpackage.wg0.SCOPE
            n0 r3 = new n0
            r4 = 7
            r3.<init>(r0, r4)
            r7.a(r2, r3)
            z r2 = new z
            r3 = 12
            r4 = 0
            r2.<init>(r0, r4, r3)
            pb0 r2 = defpackage.f04.p(r2)
            le2 r2 = defpackage.f04.z(r2)
            mp6 r3 = new mp6
            r4 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.<init>(r4, r6)
            r4 = 1
            be5 r1 = defpackage.f04.P(r2, r1, r3, r4)
            r0.k = r1
            a5 r1 = new a5
            r2 = 11
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.l = r2
            return
    }

    public static final void a(defpackage.ed0 r4, defpackage.r35 r5, java.lang.String r6, boolean r7) {
            java.lang.Object r0 = r4.f
            monitor-enter(r0)
            java.util.ArrayList r1 = r4.g     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r0)
            r0 = 0
            r2 = 1
            r3 = 0
            if (r7 != r2) goto L48
            if (r1 == 0) goto L2b
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L14
            goto L2b
        L14:
            int r7 = r1.size()
        L18:
            if (r0 >= r7) goto L2b
            java.lang.Object r2 = r1.get(r0)
            int r0 = r0 + 1
            xf0 r2 = (defpackage.xf0) r2
            java.lang.String r2 = r2.a
            boolean r2 = defpackage.nb3.k(r2, r6)
            if (r2 == 0) goto L18
            goto L85
        L2b:
            java.lang.String r7 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "New camera "
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r6 = " detected"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.i(r7, r6)
            java.util.ArrayList r3 = r4.d()
            goto L85
        L48:
            if (r7 != 0) goto L99
            if (r1 == 0) goto L69
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L53
            goto L85
        L53:
            int r7 = r1.size()
        L57:
            if (r0 >= r7) goto L85
            java.lang.Object r2 = r1.get(r0)
            int r0 = r0 + 1
            xf0 r2 = (defpackage.xf0) r2
            java.lang.String r2 = r2.a
            boolean r2 = defpackage.nb3.k(r2, r6)
            if (r2 == 0) goto L57
        L69:
            java.lang.String r7 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unavailable camera "
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r6 = " detected"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.i(r7, r6)
            java.util.ArrayList r3 = r4.d()
        L85:
            if (r3 == 0) goto L93
            int r6 = r3.size()
            int r4 = r4.j
            if (r6 < r4) goto L90
            goto L92
        L90:
            if (r1 != 0) goto L93
        L92:
            r1 = r3
        L93:
            if (r1 == 0) goto L98
            e(r5, r1)
        L98:
            return
        L99:
            defpackage.i.d()
            return
        L9d:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    public static void e(defpackage.r35 r2, java.util.ArrayList r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Emitting camera ID list: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            java.lang.Object r2 = defpackage.f04.W(r2, r3)
            boolean r2 = r2 instanceof defpackage.fm0
            if (r2 == 0) goto L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to send camera ID list: "
            r2.<init>(r0)
            r2.append(r3)
            r3 = 33
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r1, r2)
        L31:
            return
    }

    public final java.lang.Object b(java.lang.String r11, defpackage.s41 r12) {
            r10 = this;
            boolean r0 = r12 instanceof defpackage.bd0
            if (r0 == 0) goto L13
            r0 = r12
            bd0 r0 = (defpackage.bd0) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            bd0 r0 = new bd0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            jg1 r11 = r0.X
            java.lang.String r0 = r0.R
            defpackage.oi2.Y(r12)
            r2 = r11
            r11 = r0
            goto L76
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r3
        L34:
            defpackage.oi2.Y(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r12 >= r2) goto L3e
            return r3
        L3e:
            java.lang.Object r12 = r10.f
            monitor-enter(r12)
            java.util.LinkedHashMap r2 = r10.h     // Catch: java.lang.Throwable -> L63
            xf0 r5 = new xf0     // Catch: java.lang.Throwable -> L63
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L63
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L63
            if (r6 != 0) goto L65
            o41 r6 = r10.e     // Catch: java.lang.Throwable -> L63
            t57 r7 = r10.b     // Catch: java.lang.Throwable -> L63
            n61 r7 = r7.f     // Catch: java.lang.Throwable -> L63
            cd0 r8 = new cd0     // Catch: java.lang.Throwable -> L63
            r9 = 0
            r8.<init>(r11, r10, r3, r9)     // Catch: java.lang.Throwable -> L63
            r9 = 2
            kg1 r6 = defpackage.hv.i(r6, r7, r3, r8, r9)     // Catch: java.lang.Throwable -> L63
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r10 = move-exception
            goto La4
        L65:
            r2 = r6
            jg1 r2 = (defpackage.jg1) r2     // Catch: java.lang.Throwable -> L63
            monitor-exit(r12)
            r0.R = r11
            r0.X = r2
            r0.d0 = r4
            java.lang.Object r12 = r2.X(r0)
            if (r12 != r1) goto L76
            return r1
        L76:
            rb r12 = (defpackage.rb) r12
            if (r12 != 0) goto La3
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Removing null CameraDeviceSetupCompat from cache for "
            r1.<init>(r3)
            java.lang.String r3 = defpackage.xf0.b(r11)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.lang.Object r0 = r10.f
            monitor-enter(r0)
            java.util.LinkedHashMap r10 = r10.h     // Catch: java.lang.Throwable -> La0
            xf0 r1 = new xf0     // Catch: java.lang.Throwable -> La0
            r1.<init>(r11)     // Catch: java.lang.Throwable -> La0
            r10.remove(r1, r2)     // Catch: java.lang.Throwable -> La0
            monitor-exit(r0)
            return r12
        La0:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        La3:
            return r12
        La4:
            monitor-exit(r12)
            throw r10
    }

    public final java.lang.Object c(java.lang.String r11, defpackage.s41 r12) {
            r10 = this;
            boolean r0 = r12 instanceof defpackage.dd0
            if (r0 == 0) goto L13
            r0 = r12
            dd0 r0 = (defpackage.dd0) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            dd0 r0 = new dd0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            jg1 r11 = r0.X
            java.lang.String r0 = r0.R
            defpackage.oi2.Y(r12)
            r2 = r11
            r11 = r0
            goto L6e
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r3
        L34:
            defpackage.oi2.Y(r12)
            java.lang.Object r12 = r10.f
            monitor-enter(r12)
            java.util.LinkedHashMap r2 = r10.i     // Catch: java.lang.Throwable -> L5b
            xf0 r5 = new xf0     // Catch: java.lang.Throwable -> L5b
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L5b
            if (r6 != 0) goto L5d
            o41 r6 = r10.e     // Catch: java.lang.Throwable -> L5b
            t57 r7 = r10.b     // Catch: java.lang.Throwable -> L5b
            n61 r7 = r7.f     // Catch: java.lang.Throwable -> L5b
            cd0 r8 = new cd0     // Catch: java.lang.Throwable -> L5b
            r8.<init>(r11, r10, r3, r4)     // Catch: java.lang.Throwable -> L5b
            r9 = 2
            kg1 r6 = defpackage.hv.i(r6, r7, r3, r8, r9)     // Catch: java.lang.Throwable -> L5b
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r10 = move-exception
            goto L9c
        L5d:
            r2 = r6
            jg1 r2 = (defpackage.jg1) r2     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r12)
            r0.R = r11
            r0.X = r2
            r0.d0 = r4
            java.lang.Object r12 = r2.X(r0)
            if (r12 != r1) goto L6e
            return r1
        L6e:
            hd0 r12 = (defpackage.hd0) r12
            if (r12 != 0) goto L9b
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Removing null camera2DeviceSetupWrapper from cache for "
            r1.<init>(r3)
            java.lang.String r3 = defpackage.xf0.b(r11)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.lang.Object r0 = r10.f
            monitor-enter(r0)
            java.util.LinkedHashMap r10 = r10.i     // Catch: java.lang.Throwable -> L98
            xf0 r1 = new xf0     // Catch: java.lang.Throwable -> L98
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L98
            r10.remove(r1, r2)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r0)
            return r12
        L98:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L9b:
            return r12
        L9c:
            monitor-exit(r12)
            throw r10
    }

    public final java.util.ArrayList d() {
            r6 = this;
            n55 r0 = r6.a
            java.lang.Object r0 = r0.get()
            android.hardware.camera2.CameraManager r0 = (android.hardware.camera2.CameraManager) r0
            r1 = 0
            java.lang.String[] r0 = r0.getCameraIdList()     // Catch: java.lang.NullPointerException -> L6a java.lang.ArrayIndexOutOfBoundsException -> L6c android.hardware.camera2.CameraAccessException -> L6e
            r0.getClass()     // Catch: java.lang.NullPointerException -> L6a java.lang.ArrayIndexOutOfBoundsException -> L6c android.hardware.camera2.CameraAccessException -> L6e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        L17:
            if (r3 >= r2) goto L2c
            r4 = r0[r3]
            r4.getClass()
            defpackage.xf0.a(r4)
            xf0 r5 = new xf0
            r5.<init>(r4)
            r1.add(r5)
            int r3 = r3 + 1
            goto L17
        L2c:
            int r0 = r1.size()
            int r2 = r6.j
            if (r0 < r2) goto L51
            java.lang.Object r0 = r6.f
            monitor-enter(r0)
            r6.g = r1     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)
            java.lang.String r6 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Loaded CameraIdList "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r6, r0)
            return r1
        L4e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L51:
            java.lang.String r6 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to query camera ID list: Invalid list returned: "
            r0.<init>(r2)
            r0.append(r1)
            r2 = 46
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r6, r0)
            return r1
        L6a:
            r6 = move-exception
            goto L70
        L6c:
            r6 = move-exception
            goto L78
        L6e:
            r6 = move-exception
            goto L80
        L70:
            java.lang.String r0 = "CXCP"
            java.lang.String r2 = "Failed to query CameraManager#getCameraIdList!Null was returned by framework."
            android.util.Log.w(r0, r2, r6)
            return r1
        L78:
            java.lang.String r0 = "CXCP"
            java.lang.String r2 = "Failed to query CameraManager#getCameraIdList!Unexpected ArrayIndexOutOfBoundsException thrown by framework."
            android.util.Log.w(r0, r2, r6)
            return r1
        L80:
            java.lang.String r0 = "CXCP"
            java.lang.String r2 = "Failed to query CameraManager#getCameraIdList!"
            android.util.Log.w(r0, r2, r6)
            return r1
    }
}
