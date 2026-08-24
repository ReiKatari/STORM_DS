package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mi0  reason: default package */
/* loaded from: classes.dex */
public final class mi0 implements defpackage.ia3 {
    public final android.content.Context a;
    public final defpackage.eb1 b;
    public final java.lang.Object c;
    public java.util.Map d;

    public mi0(android.content.Context r1, defpackage.eb1 r2, java.util.Set r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r2.getClass()
            r0.b = r2
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.c = r1
            zt1 r1 = defpackage.zt1.A
            r0.d = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: defpackage.qi0 -> L22
            java.util.List r1 = defpackage.gt0.k1(r3)     // Catch: defpackage.qi0 -> L22
            r0.a(r1)     // Catch: defpackage.qi0 -> L22
            return
        L22:
            r0 = move-exception
            i53 r1 = new i53
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.ia3
    public final void a(java.util.List r13) {
            r12 = this;
            java.lang.Object r0 = r12.c
            monitor-enter(r0)
            java.util.Map r1 = r12.d     // Catch: java.lang.Throwable -> L143
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L143
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L143
            r1.getClass()     // Catch: java.lang.Throwable -> L143
            boolean r2 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L143
            if (r2 == 0) goto L15
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L143
            goto L19
        L15:
            java.util.List r1 = defpackage.gt0.k1(r1)     // Catch: java.lang.Throwable -> L143
        L19:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L143
            if (r2 == 0) goto L24
            java.util.List r1 = defpackage.gt0.k1(r13)     // Catch: java.lang.Throwable -> L143
            goto L42
        L24:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L143
            r2.<init>()     // Catch: java.lang.Throwable -> L143
            java.util.Iterator r3 = r13.iterator()     // Catch: java.lang.Throwable -> L143
        L2d:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L143
            if (r4 == 0) goto L41
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L143
            boolean r5 = r1.contains(r4)     // Catch: java.lang.Throwable -> L143
            if (r5 != 0) goto L2d
            r2.add(r4)     // Catch: java.lang.Throwable -> L143
            goto L2d
        L41:
            r1 = r2
        L42:
            monitor-exit(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L64
            java.lang.String r0 = "CXCP"
            boolean r0 = defpackage.kj2.F(r0)
            if (r0 == 0) goto L64
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Creating new surface combinations for: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
        L64:
            eb1 r0 = r12.b
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L72
            goto Ld7
        L72:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
        L76:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            if (r3 == 0) goto Ld7
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            cf0 r4 = r0.a()     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            defpackage.xf0.a(r3)     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            lg0 r4 = defpackage.cf0.b(r4, r3)     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            r5.getClass()     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            r6 = r4
            qc0 r6 = (defpackage.qc0) r6     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            java.lang.Object r5 = r6.c(r5)     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            android.hardware.camera2.params.StreamConfigurationMap r5 = (android.hardware.camera2.params.StreamConfigurationMap) r5     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            jh0 r6 = new jh0     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            dr6 r7 = new dr6     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            lp4 r8 = new lp4     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            r8.<init>(r4)     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            r7.<init>(r5, r8)     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            r6.<init>(r4, r7)     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            dv6 r5 = new dv6     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            android.content.Context r7 = r12.a     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            b42 r8 = new b42     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            y65 r9 = r6.a()     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            r8.<init>(r3, r9)     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            r10 = 35
            if (r9 < r10) goto Lce
            bt r9 = new bt     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            pa r10 = r0.a     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            java.lang.Object r10 = r10.R     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            tg0 r10 = (defpackage.tg0) r10     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            defpackage.mp2.o(r10)     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            r11 = 23
            r9.<init>(r4, r10, r6, r11)     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            goto Ld0
        Lce:
            x31 r9 = defpackage.x92.k     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
        Ld0:
            r5.<init>(r7, r4, r8, r9)     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            r2.put(r3, r5)     // Catch: java.lang.Exception -> L131 defpackage.xl1 -> L13a
            goto L76
        Ld7:
            java.lang.Object r0 = r12.c
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L104
            r1.<init>()     // Catch: java.lang.Throwable -> L104
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L104
        Le3:
            boolean r3 = r13.hasNext()     // Catch: java.lang.Throwable -> L104
            if (r3 == 0) goto L106
            java.lang.Object r3 = r13.next()     // Catch: java.lang.Throwable -> L104
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L104
            java.util.Map r4 = r12.d     // Catch: java.lang.Throwable -> L104
            boolean r4 = r4.containsKey(r3)     // Catch: java.lang.Throwable -> L104
            if (r4 == 0) goto Le3
            java.util.Map r4 = r12.d     // Catch: java.lang.Throwable -> L104
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L104
            r4.getClass()     // Catch: java.lang.Throwable -> L104
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L104
            goto Le3
        L104:
            r12 = move-exception
            goto L12f
        L106:
            r1.putAll(r2)     // Catch: java.lang.Throwable -> L104
            r12.d = r1     // Catch: java.lang.Throwable -> L104
            java.lang.String r12 = "CXCP"
            boolean r12 = defpackage.kj2.F(r12)     // Catch: java.lang.Throwable -> L104
            if (r12 == 0) goto L12d
            java.lang.String r12 = "CXCP"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L104
            r13.<init>()     // Catch: java.lang.Throwable -> L104
            java.lang.String r2 = "Committed new surface combination map. Total cameras: "
            r13.append(r2)     // Catch: java.lang.Throwable -> L104
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L104
            r13.append(r1)     // Catch: java.lang.Throwable -> L104
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L104
            android.util.Log.d(r12, r13)     // Catch: java.lang.Throwable -> L104
        L12d:
            monitor-exit(r0)
            return
        L12f:
            monitor-exit(r0)
            throw r12
        L131:
            r12 = move-exception
            qi0 r13 = new qi0
            java.lang.String r0 = "Failed to build surface combinations"
            r13.<init>(r0, r12)
            throw r13
        L13a:
            r12 = move-exception
            qi0 r13 = new qi0
            java.lang.String r0 = "Failed to query camera metadata"
            r13.<init>(r0, r12)
            throw r13
        L143:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
    }
}
