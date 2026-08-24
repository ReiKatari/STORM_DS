package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ci  reason: default package */
/* loaded from: classes.dex */
public final class ci implements defpackage.v23, org.slf4j.ILoggerFactory {
    public final /* synthetic */ int A;
    public boolean B;
    public java.lang.Object L;
    public final java.lang.Object R;

    public ci() {
            r1 = this;
            r0 = 6
            r1.A = r0
            r1.<init>()
            r0 = 0
            r1.B = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.L = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r1.R = r0
            return
    }

    public ci(android.app.Activity r2) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r1.<init>()
            r1.L = r2
            java.lang.String r0 = "media_projection"
            java.lang.Object r2 = r2.getSystemService(r0)
            r2.getClass()
            android.media.projection.MediaProjectionManager r2 = (android.media.projection.MediaProjectionManager) r2
            r1.R = r2
            return
    }

    public ci(android.media.ImageReader r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.R = r0
            r0 = 1
            r1.B = r0
            r1.L = r2
            return
    }

    public ci(java.util.List r2, java.util.Map r3, boolean r4) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.L = r3
            r1.B = r4
            r1.R = r2
            return
    }

    public ci(java.util.concurrent.Executor r3, android.hardware.camera2.CameraCharacteristics r4) {
            r2 = this;
            r4 = 4
            r2.A = r4
            y65 r4 = defpackage.ri1.a
            r2.<init>()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.LowMemoryQuirk> r0 = androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.class
            y65 r1 = defpackage.ri1.a
            u65 r0 = r1.b(r0)
            if (r0 == 0) goto L1a
            vb6 r0 = new vb6
            r0.<init>(r3)
            r2.L = r0
            goto L1c
        L1a:
            r2.L = r3
        L1c:
            r2.R = r4
            java.lang.Class<androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk> r3 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class
            boolean r3 = r4.a(r3)
            r2.B = r3
            return
    }

    public ci(defpackage.lg0 r3) {
            r2 = this;
            r0 = 2
            r2.A = r0
            r3.getClass()
            r2.<init>()
            r2.L = r3
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            r0.getClass()
            r1 = r3
            qc0 r1 = (defpackage.qc0) r1
            java.lang.Object r0 = r1.c(r0)
            int[] r0 = (int[]) r0
            if (r0 == 0) goto L22
            r1 = 18
            boolean r0 = defpackage.fv.m0(r0, r1)
            goto L23
        L22:
            r0 = 0
        L23:
            r2.B = r0
            d51 r3 = defpackage.ak7.T(r3)
            r2.R = r3
            return
    }

    public ci(defpackage.p27 r2) {
            r1 = this;
            r0 = 7
            r1.A = r0
            r1.<init>()
            r1.R = r2
            r2 = 1
            r1.B = r2
            return
    }

    public ci(boolean r2, defpackage.ea6 r3, defpackage.ls0 r4) {
            r1 = this;
            r0 = 5
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            return
    }

    public static boolean c(defpackage.yq1 r5, defpackage.yq1 r6) {
            boolean r0 = r6.b()
            int r1 = r6.a
            r2 = 0
            if (r0 == 0) goto L24
            int r0 = r5.a
            r3 = 1
            r4 = 2
            if (r0 != r4) goto L12
            if (r1 != r3) goto L12
            goto L22
        L12:
            if (r0 == r4) goto L19
            if (r0 == 0) goto L19
            if (r0 == r1) goto L19
            goto L22
        L19:
            int r5 = r5.b
            if (r5 == 0) goto L23
            int r6 = r6.b
            if (r5 != r6) goto L22
            goto L23
        L22:
            return r2
        L23:
            return r3
        L24:
            java.lang.String r5 = "Fully specified range "
            java.lang.String r0 = " not actually fully specified."
            defpackage.e41.g(r6, r0, r5)
            return r2
    }

    public static boolean h(defpackage.yq1 r2, defpackage.yq1 r3, java.util.Set r4) {
            boolean r4 = r4.contains(r3)
            if (r4 != 0) goto L29
            java.lang.String r4 = "CXCP"
            boolean r0 = defpackage.kj2.F(r4)
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DynamicRangeResolver: Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "\nCandidate dynamic range:\n  "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            android.util.Log.d(r4, r2)
        L27:
            r2 = 0
            return r2
        L29:
            boolean r2 = c(r2, r3)
            return r2
    }

    public static java.lang.String i(java.lang.Class r2) {
            int r0 = r2.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isInterface(r0)
            if (r1 == 0) goto L15
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: "
            java.lang.String r2 = r0.concat(r2)
            return r2
        L15:
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = "\nSee "
            r0.append(r2)
            java.lang.String r2 = "r8-abstract-class"
            java.lang.String r1 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r2 = r1.concat(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L3e:
            r2 = 0
            return r2
    }

    public static defpackage.yq1 k(defpackage.yq1 r5, java.util.LinkedHashSet r6, java.util.Set r7) {
            int r0 = r5.a
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L7
            goto L2e
        L7:
            java.util.Iterator r6 = r6.iterator()
        Lb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r6.next()
            yq1 r0 = (defpackage.yq1) r0
            int r3 = r0.a
            boolean r4 = r0.b()
            if (r4 == 0) goto L29
            if (r3 != r2) goto L22
            goto Lb
        L22:
            boolean r3 = h(r5, r0, r7)
            if (r3 == 0) goto Lb
            return r0
        L29:
            java.lang.String r5 = "Fully specified DynamicRange must have fully defined encoding."
            defpackage.i.m(r5)
        L2e:
            return r1
    }

    public static void p(java.util.Set r7, defpackage.yq1 r8, defpackage.d51 r9) {
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ 1
            java.lang.String r2 = "Cannot update already-empty constraints."
            defpackage.np2.A(r2, r1)
            r9.getClass()
            r8.getClass()
            java.lang.Object r9 = r9.B
            br1 r9 = (defpackage.br1) r9
            java.util.Set r4 = r9.c(r8)
            r9 = r4
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L40
            r1 = r7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r6 = defpackage.gt0.p1(r1)
            r7.retainAll(r9)
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L36
            goto L40
        L36:
            java.lang.String r3 = "\nConstraints:\n  "
            java.lang.String r5 = "\nExisting constraints:\n  "
            java.lang.String r1 = "Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  "
            r2 = r8
            defpackage.u34.n(r1, r2, r3, r4, r5, r6)
        L40:
            return
    }

    @Override // defpackage.v23
    public defpackage.s23 a() {
            r4 = this;
            java.lang.Object r0 = r4.R
            monitor-enter(r0)
            r1 = 0
            java.lang.Object r4 = r4.L     // Catch: java.lang.Throwable -> Ld java.lang.RuntimeException -> Lf
            android.media.ImageReader r4 = (android.media.ImageReader) r4     // Catch: java.lang.Throwable -> Ld java.lang.RuntimeException -> Lf
            android.media.Image r4 = r4.acquireLatestImage()     // Catch: java.lang.Throwable -> Ld java.lang.RuntimeException -> Lf
            goto L1d
        Ld:
            r4 = move-exception
            goto L29
        Lf:
            r4 = move-exception
            java.lang.String r2 = "ImageReaderContext is not initialized"
            java.lang.String r3 = r4.getMessage()     // Catch: java.lang.Throwable -> Ld
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto L28
            r4 = r1
        L1d:
            if (r4 != 0) goto L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        L21:
            ai r1 = new ai     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        L28:
            throw r4     // Catch: java.lang.Throwable -> Ld
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r4
    }

    @Override // defpackage.v23
    public int b() {
            r1 = this;
            java.lang.Object r0 = r1.R
            monitor-enter(r0)
            java.lang.Object r1 = r1.L     // Catch: java.lang.Throwable -> Ld
            android.media.ImageReader r1 = (android.media.ImageReader) r1     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.getImageFormat()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // defpackage.v23
    public void close() {
            r1 = this;
            java.lang.Object r0 = r1.R
            monitor-enter(r0)
            java.lang.Object r1 = r1.L     // Catch: java.lang.Throwable -> Lc
            android.media.ImageReader r1 = (android.media.ImageReader) r1     // Catch: java.lang.Throwable -> Lc
            r1.close()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // defpackage.v23
    public void d() {
            r2 = this;
            java.lang.Object r0 = r2.R
            monitor-enter(r0)
            r1 = 1
            r2.B = r1     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r2.L     // Catch: java.lang.Throwable -> L10
            android.media.ImageReader r2 = (android.media.ImageReader) r2     // Catch: java.lang.Throwable -> L10
            r1 = 0
            r2.setOnImageAvailableListener(r1, r1)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    @Override // defpackage.v23
    public void e(defpackage.u23 r3, java.util.concurrent.Executor r4) {
            r2 = this;
            java.lang.Object r0 = r2.R
            monitor-enter(r0)
            r1 = 0
            r2.B = r1     // Catch: java.lang.Throwable -> L32
            bi r1 = new bi     // Catch: java.lang.Throwable -> L32
            r1.<init>(r2, r4, r3)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r2.L     // Catch: java.lang.Throwable -> L32
            android.media.ImageReader r2 = (android.media.ImageReader) r2     // Catch: java.lang.Throwable -> L32
            android.os.Handler r3 = defpackage.f04.a     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L16
            android.os.Handler r3 = defpackage.f04.a     // Catch: java.lang.Throwable -> L32
            goto L2d
        L16:
            java.lang.Class<f04> r3 = defpackage.f04.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L32
            android.os.Handler r4 = defpackage.f04.a     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto L2a
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L28
            android.os.Handler r4 = defpackage.uj2.u(r4)     // Catch: java.lang.Throwable -> L28
            defpackage.f04.a = r4     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r2 = move-exception
            goto L34
        L2a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            android.os.Handler r3 = defpackage.f04.a     // Catch: java.lang.Throwable -> L32
        L2d:
            r2.setOnImageAvailableListener(r1, r3)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r2 = move-exception
            goto L36
        L34:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r2     // Catch: java.lang.Throwable -> L32
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r2
    }

    @Override // defpackage.v23
    public int f() {
            r1 = this;
            java.lang.Object r0 = r1.R
            monitor-enter(r0)
            java.lang.Object r1 = r1.L     // Catch: java.lang.Throwable -> Ld
            android.media.ImageReader r1 = (android.media.ImageReader) r1     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.getMaxImages()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // org.slf4j.ILoggerFactory
    public synchronized defpackage.ry3 g(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.lang.Object r0 = r3.L     // Catch: java.lang.Throwable -> L20
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L20
            zt6 r0 = (defpackage.zt6) r0     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L22
            zt6 r0 = new zt6     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r3.R     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.LinkedBlockingQueue r1 = (java.util.concurrent.LinkedBlockingQueue) r1     // Catch: java.lang.Throwable -> L20
            boolean r2 = r3.B     // Catch: java.lang.Throwable -> L20
            r0.<init>(r4, r1, r2)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r3.L     // Catch: java.lang.Throwable -> L20
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L20
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r4 = move-exception
            goto L24
        L22:
            monitor-exit(r3)
            return r0
        L24:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            throw r4
    }

    @Override // defpackage.v23
    public int getHeight() {
            r1 = this;
            java.lang.Object r0 = r1.R
            monitor-enter(r0)
            java.lang.Object r1 = r1.L     // Catch: java.lang.Throwable -> Ld
            android.media.ImageReader r1 = (android.media.ImageReader) r1     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.getHeight()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // defpackage.v23
    public android.view.Surface getSurface() {
            r1 = this;
            java.lang.Object r0 = r1.R
            monitor-enter(r0)
            java.lang.Object r1 = r1.L     // Catch: java.lang.Throwable -> Ld
            android.media.ImageReader r1 = (android.media.ImageReader) r1     // Catch: java.lang.Throwable -> Ld
            android.view.Surface r1 = r1.getSurface()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // defpackage.v23
    public int getWidth() {
            r1 = this;
            java.lang.Object r0 = r1.R
            monitor-enter(r0)
            java.lang.Object r1 = r1.L     // Catch: java.lang.Throwable -> Ld
            android.media.ImageReader r1 = (android.media.ImageReader) r1     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.getWidth()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // defpackage.v23
    public defpackage.s23 j() {
            r4 = this;
            java.lang.Object r0 = r4.R
            monitor-enter(r0)
            r1 = 0
            java.lang.Object r4 = r4.L     // Catch: java.lang.Throwable -> Ld java.lang.RuntimeException -> Lf
            android.media.ImageReader r4 = (android.media.ImageReader) r4     // Catch: java.lang.Throwable -> Ld java.lang.RuntimeException -> Lf
            android.media.Image r4 = r4.acquireNextImage()     // Catch: java.lang.Throwable -> Ld java.lang.RuntimeException -> Lf
            goto L1d
        Ld:
            r4 = move-exception
            goto L29
        Lf:
            r4 = move-exception
            java.lang.String r2 = "ImageReaderContext is not initialized"
            java.lang.String r3 = r4.getMessage()     // Catch: java.lang.Throwable -> Ld
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto L28
            r4 = r1
        L1d:
            if (r4 != 0) goto L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        L21:
            ai r1 = new ai     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        L28:
            throw r4     // Catch: java.lang.Throwable -> Ld
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r4
    }

    public defpackage.ph4 l(defpackage.ie7 r10, boolean r11) {
            r9 = this;
            java.lang.reflect.Type r0 = r10.b
            java.lang.Class r10 = r10.a
            java.lang.Object r1 = r9.L
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r2 = r1.get(r0)
            r3 = 0
            if (r2 != 0) goto L1f6
            java.lang.Object r1 = r1.get(r10)
            if (r1 != 0) goto L1f2
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            boolean r1 = r1.isAssignableFrom(r10)
            r2 = 1
            r4 = 0
            if (r1 == 0) goto L25
            y21 r1 = new y21
            r1.<init>(r4, r0)
            goto L30
        L25:
            java.lang.Class<java.util.EnumMap> r1 = java.util.EnumMap.class
            if (r10 != r1) goto L2f
            y21 r1 = new y21
            r1.<init>(r2, r0)
            goto L30
        L2f:
            r1 = r3
        L30:
            if (r1 == 0) goto L33
            return r1
        L33:
            java.lang.Object r1 = r9.R
            java.util.List r1 = (java.util.List) r1
            hh5 r1 = defpackage.nj2.q(r1)
            int r5 = r10.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isAbstract(r5)
            r6 = 6
            if (r5 == 0) goto L49
        L46:
            r5 = r3
            goto Lbf
        L49:
            java.lang.reflect.Constructor r5 = r10.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L46
            hh5 r7 = defpackage.hh5.ALLOW
            if (r1 == r7) goto L81
            kh5 r8 = defpackage.kh5.a
            boolean r8 = r8.a(r3, r5)
            if (r8 == 0) goto L68
            hh5 r8 = defpackage.hh5.BLOCK_ALL
            if (r1 != r8) goto L81
            int r8 = r5.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L68
            goto L81
        L68:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to invoke no-args constructor of "
            r2.<init>(r5)
            r2.append(r10)
            java.lang.String r5 = "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            gr1 r5 = new gr1
            r5.<init>(r2, r6)
            goto Lbf
        L81:
            if (r1 != r7) goto Lb8
            uj2 r7 = defpackage.oh5.a
            r5.setAccessible(r2)     // Catch: java.lang.Exception -> L8a
            r2 = r3
            goto Lb0
        L8a:
            r2 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed making constructor '"
            r7.<init>(r8)
            java.lang.String r8 = defpackage.oh5.b(r5)
            r7.append(r8)
            java.lang.String r8 = "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "
            r7.append(r8)
            java.lang.String r8 = r2.getMessage()
            r7.append(r8)
            java.lang.String r2 = defpackage.oh5.e(r2)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
        Lb0:
            if (r2 == 0) goto Lb8
            gr1 r5 = new gr1
            r5.<init>(r2, r6)
            goto Lbf
        Lb8:
            h61 r2 = new h61
            r7 = 5
            r2.<init>(r5, r7)
            r5 = r2
        Lbf:
            if (r5 == 0) goto Lc2
            return r5
        Lc2:
            java.lang.Class<java.util.Collection> r2 = java.util.Collection.class
            boolean r2 = r2.isAssignableFrom(r10)
            if (r2 == 0) goto L10e
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto Ldb
            i r3 = new i
            r0 = 21
            r3.<init>(r0)
            goto L17e
        Ldb:
            java.lang.Class<java.util.LinkedHashSet> r0 = java.util.LinkedHashSet.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto Lec
            i r3 = new i
            r0 = 24
            r3.<init>(r0)
            goto L17e
        Lec:
            java.lang.Class<java.util.TreeSet> r0 = java.util.TreeSet.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto Lfd
            i r3 = new i
            r0 = 25
            r3.<init>(r0)
            goto L17e
        Lfd:
            java.lang.Class<java.util.ArrayDeque> r0 = java.util.ArrayDeque.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto L17e
            i r3 = new i
            r0 = 26
            r3.<init>(r0)
            goto L17e
        L10e:
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            boolean r2 = r2.isAssignableFrom(r10)
            if (r2 == 0) goto L17e
            java.lang.Class<aw3> r2 = defpackage.aw3.class
            boolean r2 = r10.isAssignableFrom(r2)
            if (r2 == 0) goto L13f
            boolean r2 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r2 != 0) goto L123
            goto L137
        L123:
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            int r2 = r0.length
            if (r2 != 0) goto L12d
            goto L13f
        L12d:
            r0 = r0[r4]
            java.lang.Class r0 = defpackage.q60.J(r0)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r0 != r2) goto L13f
        L137:
            i r3 = new i
            r0 = 27
            r3.<init>(r0)
            goto L17e
        L13f:
            java.lang.Class<java.util.LinkedHashMap> r0 = java.util.LinkedHashMap.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto L14f
            i r3 = new i
            r0 = 28
            r3.<init>(r0)
            goto L17e
        L14f:
            java.lang.Class<java.util.TreeMap> r0 = java.util.TreeMap.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto L15f
            i r3 = new i
            r0 = 29
            r3.<init>(r0)
            goto L17e
        L15f:
            java.lang.Class<java.util.concurrent.ConcurrentHashMap> r0 = java.util.concurrent.ConcurrentHashMap.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto L16f
            i r3 = new i
            r0 = 22
            r3.<init>(r0)
            goto L17e
        L16f:
            java.lang.Class<java.util.concurrent.ConcurrentSkipListMap> r0 = java.util.concurrent.ConcurrentSkipListMap.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto L17e
            i r3 = new i
            r0 = 23
            r3.<init>(r0)
        L17e:
            if (r3 == 0) goto L181
            return r3
        L181:
            java.lang.String r0 = i(r10)
            if (r0 == 0) goto L18d
            gr1 r9 = new gr1
            r9.<init>(r0, r6)
            return r9
        L18d:
            java.lang.String r0 = "Unable to create instance of "
            if (r11 != 0) goto L1a8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r10 = "; Register an InstanceCreator or a TypeAdapter for this type."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            gr1 r10 = new gr1
            r10.<init>(r9, r6)
            return r10
        L1a8:
            hh5 r11 = defpackage.hh5.ALLOW
            if (r1 == r11) goto L1c3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r10 = "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            gr1 r10 = new gr1
            r10.<init>(r9, r6)
            return r10
        L1c3:
            boolean r9 = r9.B
            if (r9 == 0) goto L1cd
            h61 r9 = new h61
            r9.<init>(r10, r6)
            goto L1f1
        L1cd:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r11 = "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem."
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.reflect.Constructor[] r10 = r10.getDeclaredConstructors()
            int r10 = r10.length
            if (r10 != 0) goto L1eb
            java.lang.String r10 = " Or adjust your R8 configuration to keep the no-args constructor of the class."
            java.lang.String r9 = r9.concat(r10)
        L1eb:
            gr1 r10 = new gr1
            r10.<init>(r9, r6)
            r9 = r10
        L1f1:
            return r9
        L1f2:
            defpackage.u34.a()
            return r3
        L1f6:
            defpackage.u34.a()
            return r3
    }

    public defpackage.m71 m() {
            r1 = this;
            java.lang.Object r1 = r1.R
            ls0 r1 = (defpackage.ls0) r1
            int r0 = r1.b
            int r1 = r1.c
            if (r0 >= r1) goto Ld
            m71 r1 = defpackage.m71.NOT_CROSSED
            return r1
        Ld:
            if (r0 <= r1) goto L12
            m71 r1 = defpackage.m71.CROSSED
            return r1
        L12:
            m71 r1 = defpackage.m71.COLLAPSED
            return r1
    }

    public void n() {
            r1 = this;
            boolean r0 = r1.B
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r1.R
            p27 r0 = (defpackage.p27) r0
            java.lang.Object r1 = r1.L
            k47 r1 = (defpackage.k47) r1
            defpackage.p27.b(r0, r1)
        Lf:
            return
    }

    public java.util.LinkedHashMap o(java.util.ArrayList r21, java.util.List r22, java.util.List r23) {
            r20 = this;
            r0 = r20
            java.lang.Object r1 = r0.R
            d51 r1 = (defpackage.d51) r1
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            int r3 = r21.size()
            r4 = 0
            r5 = r4
        L11:
            if (r5 >= r3) goto L26
            r6 = r21
            java.lang.Object r7 = r6.get(r5)
            int r5 = r5 + 1
            px r7 = (defpackage.px) r7
            yq1 r7 = r7.d
            r7.getClass()
            r2.add(r7)
            goto L11
        L26:
            java.lang.Object r3 = r1.B
            br1 r3 = (defpackage.br1) r3
            java.util.Set r3 = r3.a()
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Set r5 = defpackage.gt0.o1(r5)
            java.util.Iterator r6 = r2.iterator()
        L39:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L49
            java.lang.Object r7 = r6.next()
            yq1 r7 = (defpackage.yq1) r7
            p(r5, r7, r1)
            goto L39
        L49:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r23.iterator()
        L5c:
            boolean r10 = r9.hasNext()
            yq1 r11 = defpackage.yq1.c
            r12 = 2
            if (r10 == 0) goto La3
            java.lang.Object r10 = r9.next()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r13 = r22
            java.lang.Object r10 = r13.get(r10)
            zi7 r10 = (defpackage.zi7) r10
            xx r14 = defpackage.j23.n
            java.lang.Object r14 = r10.b(r14, r11)
            yq1 r14 = (defpackage.yq1) r14
            r14.getClass()
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L8c
            r8.add(r10)
            goto L5c
        L8c:
            int r11 = r14.a
            int r14 = r14.b
            if (r11 == r12) goto L9f
            if (r11 == 0) goto L96
            if (r14 == 0) goto L9f
        L96:
            if (r11 != 0) goto L9b
            if (r14 == 0) goto L9b
            goto L9f
        L9b:
            r6.add(r10)
            goto L5c
        L9f:
            r7.add(r10)
            goto L5c
        La3:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.addAll(r6)
            r13.addAll(r7)
            r13.addAll(r8)
            int r6 = r13.size()
        Lbf:
            if (r4 >= r6) goto L2a9
            java.lang.Object r7 = r13.get(r4)
            int r4 = r4 + 1
            zi7 r7 = (defpackage.zi7) r7
            xx r8 = defpackage.j23.n
            java.lang.Object r8 = r7.b(r8, r11)
            yq1 r8 = (defpackage.yq1) r8
            r8.getClass()
            xx r14 = defpackage.kz6.C
            java.lang.Object r14 = r7.e(r14)
            java.lang.String r14 = (java.lang.String) r14
            r14.getClass()
            boolean r15 = r8.b()
            r16 = 0
            if (r15 == 0) goto L102
            boolean r14 = r5.contains(r8)
            r19 = r3
            r22 = r4
            r23 = r6
            if (r14 == 0) goto Lfa
            r12 = r8
        Lf4:
            r17 = r11
            r18 = r13
            goto L255
        Lfa:
            r17 = r11
            r18 = r13
        Lfe:
            r12 = r16
            goto L255
        L102:
            int r15 = r8.a
            int r12 = r8.b
            r22 = r4
            r4 = 1
            r23 = r6
            yq1 r6 = defpackage.yq1.d
            if (r15 != r4) goto L11b
            if (r12 != 0) goto L11b
            boolean r4 = r5.contains(r6)
            r19 = r3
            if (r4 == 0) goto Lfa
            r12 = r6
            goto Lf4
        L11b:
            yq1 r4 = k(r8, r2, r5)
            r17 = r11
            java.lang.String r11 = "\n->\n"
            r18 = r13
            java.lang.String r13 = "DynamicRangeResolver: Resolved dynamic range for use case "
            r19 = r3
            java.lang.String r3 = "CXCP"
            if (r4 == 0) goto L153
            boolean r6 = defpackage.kj2.F(r3)
            if (r6 == 0) goto L150
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r13)
            r6.append(r14)
            java.lang.String r12 = " from existing attached surface.\n"
            r6.append(r12)
            r6.append(r8)
            r6.append(r11)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r3, r6)
        L150:
            r12 = r4
            goto L255
        L153:
            yq1 r4 = k(r8, r10, r5)
            if (r4 == 0) goto L17d
            boolean r6 = defpackage.kj2.F(r3)
            if (r6 == 0) goto L150
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r13)
            r6.append(r14)
            java.lang.String r12 = " from concurrently bound use case.\n"
            r6.append(r12)
            r6.append(r8)
            r6.append(r11)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r3, r6)
            goto L150
        L17d:
            boolean r4 = h(r8, r6, r5)
            if (r4 == 0) goto L1a9
            boolean r4 = defpackage.kj2.F(r3)
            if (r4 == 0) goto L1a6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r13)
            r4.append(r14)
            java.lang.String r12 = " to no compatible HDR dynamic ranges.\n"
            r4.append(r12)
            r4.append(r8)
            r4.append(r11)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r3, r4)
        L1a6:
            r12 = r6
            goto L255
        L1a9:
            r4 = 2
            if (r15 != r4) goto L208
            r15 = 10
            if (r12 == r15) goto L1b2
            if (r12 != 0) goto L208
        L1b2:
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            int r15 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r15 < r4) goto L1cb
            java.lang.Object r4 = r0.L
            lg0 r4 = (defpackage.lg0) r4
            yq1 r4 = defpackage.r2.f(r4)
            if (r4 == 0) goto L1cd
            r12.add(r4)
            goto L1cd
        L1cb:
            r4 = r16
        L1cd:
            yq1 r15 = defpackage.yq1.e
            r12.add(r15)
            yq1 r12 = k(r8, r12, r5)
            if (r12 == 0) goto L208
            boolean r6 = defpackage.kj2.F(r3)
            if (r6 == 0) goto L255
            java.lang.String r6 = "from "
            java.lang.StringBuilder r6 = defpackage.i61.t(r13, r14, r6)
            boolean r4 = r12.equals(r4)
            if (r4 == 0) goto L1ed
            java.lang.String r4 = "recommended"
            goto L1ef
        L1ed:
            java.lang.String r4 = "required"
        L1ef:
            r6.append(r4)
            java.lang.String r4 = " 10-bit supported dynamic range.\n"
            r6.append(r4)
            r6.append(r8)
            r6.append(r11)
            r6.append(r12)
            java.lang.String r4 = r6.toString()
            android.util.Log.d(r3, r4)
            goto L255
        L208:
            java.util.Iterator r4 = r5.iterator()
        L20c:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto Lfe
            java.lang.Object r12 = r4.next()
            yq1 r12 = (defpackage.yq1) r12
            boolean r15 = r12.b()
            if (r15 == 0) goto L24f
            boolean r15 = r12.equals(r6)
            if (r15 == 0) goto L225
            goto L20c
        L225:
            boolean r15 = c(r8, r12)
            if (r15 == 0) goto L20c
            boolean r4 = defpackage.kj2.F(r3)
            if (r4 == 0) goto L255
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r13)
            r4.append(r14)
            java.lang.String r6 = " from validated dynamic range constraints or supported HDR dynamic ranges.\n"
            r4.append(r6)
            r4.append(r8)
            r4.append(r11)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r3, r4)
            goto L255
        L24f:
            java.lang.String r0 = "Candidate dynamic range must be fully specified."
            defpackage.i.m(r0)
            return r16
        L255:
            if (r12 == 0) goto L273
            p(r5, r12, r1)
            r9.put(r7, r12)
            boolean r3 = r2.contains(r12)
            if (r3 != 0) goto L266
            r10.add(r12)
        L266:
            r4 = r22
            r6 = r23
            r11 = r17
            r13 = r18
            r3 = r19
            r12 = 2
            goto Lbf
        L273:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            xx r1 = defpackage.kz6.C
            java.lang.Object r1 = r7.e(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "\nRequested dynamic range:\n  "
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = "\nSupported dynamic ranges:\n  "
            r2.append(r1)
            r1 = r19
            r2.append(r1)
            java.lang.String r1 = "\nConstrained set of concurrent dynamic ranges:\n  "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L2a9:
            return r9
    }

    public long q(defpackage.c37 r11, long r12, boolean r14, defpackage.ga6 r15) {
            r10 = this;
            java.lang.Object r0 = r10.R
            r1 = r0
            p27 r1 = (defpackage.p27) r1
            r8 = 0
            r9 = 0
            r6 = 0
            r2 = r11
            r3 = r12
            r5 = r14
            r7 = r15
            long r11 = defpackage.p27.c(r1, r2, r3, r5, r6, r7, r8, r9)
            java.lang.Object r13 = r10.L
            k47 r13 = (defpackage.k47) r13
            boolean r13 = defpackage.k47.a(r11, r13)
            if (r13 != 0) goto L1d
            r13 = 0
            r10.B = r13
        L1d:
            boolean r10 = defpackage.k47.c(r11)
            if (r10 == 0) goto L26
            hv2 r10 = defpackage.hv2.Cursor
            goto L28
        L26:
            hv2 r10 = defpackage.hv2.Selection
        L28:
            r1.q(r10)
            return r11
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 1: goto L38;
                case 5: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SingleSelectionLayout(isStartHandle="
            r0.<init>(r1)
            boolean r1 = r2.B
            r0.append(r1)
            java.lang.String r1 = ", crossed="
            r0.append(r1)
            m71 r1 = r2.m()
            r0.append(r1)
            java.lang.String r1 = ", info=\n\t"
            r0.append(r1)
            java.lang.Object r2 = r2.R
            ls0 r2 = (defpackage.ls0) r2
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L38:
            java.lang.Object r2 = r2.L
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r2 = r2.toString()
            return r2
    }
}
