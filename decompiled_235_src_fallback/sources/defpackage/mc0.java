package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mc0  reason: default package */
/* loaded from: classes.dex */
public final class mc0 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.nc0 B;

    public /* synthetic */ mc0(defpackage.nc0 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r9 = this;
            int r0 = r9.A
            java.lang.String r1 = "! Caching {} and ignoring exception."
            r2 = 33
            du1 r3 = defpackage.du1.A
            java.lang.String r4 = "! Caching false and ignoring exception."
            r5 = 34
            r6 = 0
            java.lang.String r7 = "Failed to get "
            java.lang.String r8 = "CXCP"
            nc0 r9 = r9.B
            switch(r0) {
                case 0: goto Lff;
                case 1: goto Lae;
                case 2: goto L62;
                default: goto L16;
            }
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.A
            java.lang.String r1 = defpackage.xf0.b(r1)
            r0.append(r1)
            java.lang.String r1 = "#isCaptureProgressSupported"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L3d
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L3d
            if (r1 < r5) goto L3f
            android.hardware.camera2.CameraExtensionCharacteristics r1 = r9.L     // Catch: java.lang.Throwable -> L3d
            int r9 = r9.B     // Catch: java.lang.Throwable -> L3d
            boolean r9 = defpackage.gi.x(r1, r9)     // Catch: java.lang.Throwable -> L3d
            goto L40
        L3d:
            r9 = move-exception
            goto L47
        L3f:
            r9 = r6
        L40:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L45
            r6 = r9
            goto L5d
        L45:
            r9 = move-exception
            goto L4b
        L47:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L45
            throw r9     // Catch: java.lang.Throwable -> L45
        L4b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r8, r0, r9)
        L5d:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        L62:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.A
            java.lang.String r1 = defpackage.xf0.b(r1)
            r0.append(r1)
            java.lang.String r1 = "#isPostviewSupported"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L89
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L89
            if (r1 < r5) goto L8b
            android.hardware.camera2.CameraExtensionCharacteristics r1 = r9.L     // Catch: java.lang.Throwable -> L89
            int r9 = r9.B     // Catch: java.lang.Throwable -> L89
            boolean r9 = defpackage.gi.r(r1, r9)     // Catch: java.lang.Throwable -> L89
            goto L8c
        L89:
            r9 = move-exception
            goto L93
        L8b:
            r9 = r6
        L8c:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L91
            r6 = r9
            goto La9
        L91:
            r9 = move-exception
            goto L97
        L93:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L91
            throw r9     // Catch: java.lang.Throwable -> L91
        L97:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r8, r0, r9)
        La9:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        Lae:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r9.A
            java.lang.String r4 = defpackage.xf0.b(r4)
            r0.append(r4)
            java.lang.String r4 = "#availableCaptureResultKeys"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> Lde
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lde
            if (r4 < r2) goto Le0
            android.hardware.camera2.CameraExtensionCharacteristics r2 = r9.L     // Catch: java.lang.Throwable -> Lde
            int r9 = r9.B     // Catch: java.lang.Throwable -> Lde
            java.util.Set r9 = defpackage.o2.q(r2, r9)     // Catch: java.lang.Throwable -> Lde
            r9.getClass()     // Catch: java.lang.Throwable -> Lde
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> Lde
            java.util.Set r9 = defpackage.gt0.p1(r9)     // Catch: java.lang.Throwable -> Lde
            goto Le1
        Lde:
            r9 = move-exception
            goto Le8
        Le0:
            r9 = r3
        Le1:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Le6
            r3 = r9
            goto Lfe
        Le6:
            r9 = move-exception
            goto Lec
        Le8:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Le6
            throw r9     // Catch: java.lang.Throwable -> Le6
        Lec:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r8, r0, r9)
        Lfe:
            return r3
        Lff:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r9.A
            java.lang.String r4 = defpackage.xf0.b(r4)
            r0.append(r4)
            java.lang.String r4 = "#availableCaptureRequestKeys"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L12f
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L12f
            if (r4 < r2) goto L131
            android.hardware.camera2.CameraExtensionCharacteristics r2 = r9.L     // Catch: java.lang.Throwable -> L12f
            int r9 = r9.B     // Catch: java.lang.Throwable -> L12f
            java.util.Set r9 = defpackage.o2.A(r2, r9)     // Catch: java.lang.Throwable -> L12f
            r9.getClass()     // Catch: java.lang.Throwable -> L12f
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L12f
            java.util.Set r9 = defpackage.gt0.p1(r9)     // Catch: java.lang.Throwable -> L12f
            goto L132
        L12f:
            r9 = move-exception
            goto L139
        L131:
            r9 = r3
        L132:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L137
            r3 = r9
            goto L14f
        L137:
            r9 = move-exception
            goto L13d
        L139:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L137
            throw r9     // Catch: java.lang.Throwable -> L137
        L13d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r8, r0, r9)
        L14f:
            return r3
    }
}
