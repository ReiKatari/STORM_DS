package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: en  reason: default package */
/* loaded from: classes.dex */
public final class en extends defpackage.hw6 implements defpackage.qn2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ java.lang.Object Z;

    public /* synthetic */ en(java.lang.Object r1, java.lang.Object r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Y = r1
            r0.Z = r2
            r1 = 1
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.X
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r4.Z
            java.lang.Object r4 = r4.Y
            r41 r5 = (defpackage.r41) r5
            switch(r0) {
                case 0: goto L37;
                case 1: goto L29;
                case 2: goto L1b;
                default: goto Ld;
            }
        Ld:
            en r0 = new en
            yk0 r4 = (defpackage.yk0) r4
            dk0 r2 = (defpackage.dk0) r2
            r3 = 3
            r0.<init>(r4, r2, r5, r3)
            r0.s(r1)
            return r1
        L1b:
            en r0 = new en
            yk0 r4 = (defpackage.yk0) r4
            tk0 r2 = (defpackage.tk0) r2
            r3 = 2
            r0.<init>(r4, r2, r5, r3)
            r0.s(r1)
            return r1
        L29:
            en r0 = new en
            android.hardware.camera2.CameraDevice r4 = (android.hardware.camera2.CameraDevice) r4
            zg5 r2 = (defpackage.zg5) r2
            r3 = 1
            r0.<init>(r4, r2, r5, r3)
            r0.s(r1)
            return r1
        L37:
            en r0 = new en
            gn r4 = (defpackage.gn) r4
            r3 = 0
            r0.<init>(r4, r2, r5, r3)
            r0.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.X
            java.lang.String r1 = "CXCP"
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r3 = r12.Z
            java.lang.Object r12 = r12.Y
            switch(r0) {
                case 0: goto L11d;
                case 1: goto L91;
                case 2: goto L55;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            yk0 r12 = (defpackage.yk0) r12
            r13.append(r12)
            java.lang.String r0 = " stopRepeating"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            dk0 r3 = (defpackage.dk0) r3
            android.os.Trace.beginSection(r13)     // Catch: java.lang.Throwable -> L50
            r3.x()     // Catch: java.lang.Throwable -> L50
            android.os.Trace.endSection()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            java.lang.String r12 = " abortCaptures"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            android.os.Trace.beginSection(r12)     // Catch: java.lang.Throwable -> L4b
            r3.a()     // Catch: java.lang.Throwable -> L4b
            android.os.Trace.endSection()
            return r2
        L4b:
            r12 = move-exception
            android.os.Trace.endSection()
            throw r12
        L50:
            r12 = move-exception
            android.os.Trace.endSection()
            throw r12
        L55:
            java.lang.String r0 = "Closing capture session for "
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            yk0 r12 = (defpackage.yk0) r12
            r13.append(r12)
            java.lang.String r4 = " CameraCaptureSessionWrapper#close"
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            tk0 r3 = (defpackage.tk0) r3
            android.os.Trace.beginSection(r13)     // Catch: java.lang.Throwable -> L8c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L8c
            r13.append(r12)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L8c
            android.util.Log.d(r1, r12)     // Catch: java.lang.Throwable -> L8c
            me0 r12 = r3.a     // Catch: java.lang.Throwable -> L8c
            defpackage.i61.z(r12)     // Catch: java.lang.Throwable -> L8c
            android.os.Trace.endSection()
            return r2
        L8c:
            r12 = move-exception
            android.os.Trace.endSection()
            throw r12
        L91:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r13)
            android.hardware.camera2.CameraDevice r12 = (android.hardware.camera2.CameraDevice) r12
            java.lang.String r13 = "%.3f ms"
            java.lang.String r0 = " - "
            r4 = 1
            if (r12 == 0) goto L118
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Closing Camera "
            r5.<init>(r6)
            java.lang.String r6 = r12.getId()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.i(r1, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "CXCP#CameraDevice-"
            r5.<init>(r6)
            java.lang.String r6 = r12.getId()
            r5.append(r6)
            java.lang.String r6 = "#close"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            long r6 = android.os.SystemClock.elapsedRealtimeNanos()
            r8 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r10 = 0
            android.os.Trace.beginSection(r5)     // Catch: java.lang.Throwable -> Ldc
            r12.close()     // Catch: java.lang.Throwable -> Ldc java.lang.NullPointerException -> Lde
            goto Le4
        Ldc:
            r12 = move-exception
            goto Lfe
        Lde:
            r12 = move-exception
            java.lang.String r11 = "NPE encountered during CameraDevice.close()"
            android.util.Log.w(r1, r11, r12)     // Catch: java.lang.Throwable -> Ldc
        Le4:
            long r6 = defpackage.i61.d(r6)
            java.lang.StringBuilder r12 = defpackage.i61.r(r5, r0)
            double r5 = (double) r6
            double r5 = r5 / r8
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r12 = defpackage.i61.p(r0, r4, r10, r13, r12)
            android.util.Log.d(r1, r12)
            goto L118
        Lfe:
            long r2 = defpackage.i61.d(r6)
            java.lang.StringBuilder r0 = defpackage.i61.r(r5, r0)
            double r2 = (double) r2
            double r2 = r2 / r8
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r13 = defpackage.i61.p(r2, r4, r10, r13, r0)
            android.util.Log.d(r1, r13)
            throw r12
        L118:
            zg5 r3 = (defpackage.zg5) r3
            r3.A = r4
            return r2
        L11d:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r13)
            gn r12 = (defpackage.gn) r12
            defpackage.gn.b(r12)
            java.lang.Object r13 = defpackage.gn.a(r12, r3)
            uo r0 = r12.c
            vs4 r0 = r0.B
            r0.setValue(r13)
            vs4 r12 = r12.e
            r12.setValue(r13)
            return r2
    }
}
