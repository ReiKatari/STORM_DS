package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vc0  reason: default package */
/* loaded from: classes.dex */
public final class vc0 extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
    public final java.lang.String a;
    public final boolean b;
    public final java.util.ArrayList c;
    public final java.util.ArrayList d;
    public final java.util.List e;
    public final defpackage.d51 f;
    public final android.util.ArrayMap g;
    public final android.util.ArrayMap h;
    public final defpackage.jr6 i;
    public final defpackage.ks6 j;
    public final long k;
    public final defpackage.tu0 l;
    public volatile java.lang.Integer m;

    public vc0(java.lang.String r1, boolean r2, java.util.ArrayList r3, java.util.ArrayList r4, java.util.List r5, defpackage.d51 r6, android.util.ArrayMap r7, android.util.ArrayMap r8, defpackage.jr6 r9, defpackage.ks6 r10) {
            r0 = this;
            r1.getClass()
            r5.getClass()
            r6.getClass()
            r10.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            ww r1 = defpackage.yc0.b
            r1.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.ww.b
            long r1 = r2.incrementAndGet(r1)
            r0.k = r1
            tu0 r1 = new tu0
            r1.<init>()
            r0.l = r1
            int r0 = r3.size()
            int r1 = r4.size()
            if (r0 != r1) goto L42
            return
        L42:
            java.lang.String r0 = "CaptureRequestList and CaptureMetadataList must have a 1:1 mapping."
            defpackage.i.m(r0)
            r0 = 0
            throw r0
    }

    public final int a() {
            r3 = this;
            java.lang.String r0 = "SequenceNumber has not been set for "
            java.lang.Integer r1 = r3.m
            r2 = 33
            if (r1 != 0) goto L30
            monitor-enter(r3)
            java.lang.Integer r1 = r3.m     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            int r0 = r1.intValue()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r3)
            return r0
        L13:
            r0 = move-exception
            goto L2e
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L13
            r1.append(r3)     // Catch: java.lang.Throwable -> L13
            r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L13
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L13
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L13
            throw r1     // Catch: java.lang.Throwable -> L13
        L2e:
            monitor-exit(r3)
            throw r0
        L30:
            java.lang.Integer r0 = r3.m
            if (r0 == 0) goto L39
            int r3 = r0.intValue()
            return r3
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SequenceNumber has not been set for "
            r0.<init>(r1)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public final void b(defpackage.yk5 r5, long r6, defpackage.wk5 r8) {
            r4 = this;
            d51 r0 = r4.f
            r0.m(r4)
            java.lang.String r0 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r0)
            java.util.List r4 = r4.e
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L12:
            if (r2 >= r0) goto L20
            java.lang.Object r3 = r4.get(r2)
            jk5 r3 = (defpackage.jk5) r3
            r3.F(r5, r6, r8)
            int r2 = r2 + 1
            goto L12
        L20:
            android.os.Trace.endSection()
            java.lang.String r4 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r4)
            kk5 r4 = r5.c0()
            java.util.List r4 = r4.d
            int r4 = r4.size()
        L32:
            if (r1 >= r4) goto L46
            kk5 r0 = r5.c0()
            java.util.List r0 = r0.d
            java.lang.Object r0 = r0.get(r1)
            jk5 r0 = (defpackage.jk5) r0
            r0.F(r5, r6, r8)
            int r1 = r1 + 1
            goto L32
        L46:
            android.os.Trace.endSection()
            return
    }

    public final void c(android.hardware.camera2.CaptureRequest r7, android.hardware.camera2.TotalCaptureResult r8, long r9) {
            r6 = this;
            java.lang.String r0 = "onCaptureCompleted"
            android.os.Trace.beginSection(r0)
            java.lang.String r0 = "onCaptureSequenceComplete"
            android.os.Trace.beginSection(r0)
            d51 r0 = r6.f
            r0.m(r6)
            android.os.Trace.endSection()
            yk5 r7 = r6.i(r7)
            th r0 = new th
            java.lang.String r1 = r6.a
            r0.<init>(r8, r1, r7)
            java.lang.String r8 = "onTotalCaptureResult"
            android.os.Trace.beginSection(r8)
            java.lang.String r8 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r8)
            java.util.List r6 = r6.e
            int r1 = r6.size()
            r2 = 0
            r3 = r2
        L2f:
            if (r3 >= r1) goto L3d
            java.lang.Object r4 = r6.get(r3)
            jk5 r4 = (defpackage.jk5) r4
            r4.x(r7, r9, r0)
            int r3 = r3 + 1
            goto L2f
        L3d:
            android.os.Trace.endSection()
            java.lang.String r1 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r1)
            kk5 r3 = r7.c0()
            java.util.List r3 = r3.d
            int r3 = r3.size()
            r4 = r2
        L50:
            if (r4 >= r3) goto L64
            kk5 r5 = r7.c0()
            java.util.List r5 = r5.d
            java.lang.Object r5 = r5.get(r4)
            jk5 r5 = (defpackage.jk5) r5
            r5.x(r7, r9, r0)
            int r4 = r4 + 1
            goto L50
        L64:
            android.os.Trace.endSection()
            android.os.Trace.endSection()
            java.lang.String r3 = "onComplete"
            android.os.Trace.beginSection(r3)
            android.os.Trace.beginSection(r8)
            int r8 = r6.size()
            r3 = r2
        L77:
            if (r3 >= r8) goto L85
            java.lang.Object r4 = r6.get(r3)
            jk5 r4 = (defpackage.jk5) r4
            r4.J(r7, r9, r0)
            int r3 = r3 + 1
            goto L77
        L85:
            android.os.Trace.endSection()
            android.os.Trace.beginSection(r1)
            kk5 r6 = r7.c0()
            java.util.List r6 = r6.d
            int r6 = r6.size()
        L95:
            if (r2 >= r6) goto La9
            kk5 r8 = r7.c0()
            java.util.List r8 = r8.d
            java.lang.Object r8 = r8.get(r2)
            jk5 r8 = (defpackage.jk5) r8
            r8.J(r7, r9, r0)
            int r2 = r2 + 1
            goto L95
        La9:
            android.os.Trace.endSection()
            android.os.Trace.endSection()
            android.os.Trace.endSection()
            return
    }

    public final void d(android.hardware.camera2.CaptureRequest r3, long r4) {
            r2 = this;
            java.lang.String r0 = "onCaptureFailed"
            android.os.Trace.beginSection(r0)
            tu0 r0 = r2.l
            jg7 r1 = defpackage.jg7.a
            r0.b0(r1)
            yk5 r3 = r2.i(r3)
            h82 r0 = new h82
            r0.<init>(r3, r4)
            r2.b(r3, r4, r0)
            android.os.Trace.endSection()
            return
    }

    public final void e(android.hardware.camera2.CaptureRequest r5, int r6) {
            r4 = this;
            java.lang.String r0 = "onCaptureProcessProgressed"
            android.os.Trace.beginSection(r0)
            yk5 r5 = r4.i(r5)
            java.lang.String r0 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r0)
            java.util.List r4 = r4.e
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L16:
            if (r2 >= r0) goto L24
            java.lang.Object r3 = r4.get(r2)
            jk5 r3 = (defpackage.jk5) r3
            r3.v(r5, r6)
            int r2 = r2 + 1
            goto L16
        L24:
            android.os.Trace.endSection()
            java.lang.String r4 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r4)
            kk5 r4 = r5.c0()
            java.util.List r4 = r4.d
            int r4 = r4.size()
        L36:
            if (r1 >= r4) goto L4a
            kk5 r0 = r5.c0()
            java.util.List r0 = r0.d
            java.lang.Object r0 = r0.get(r1)
            jk5 r0 = (defpackage.jk5) r0
            r0.v(r5, r6)
            int r1 = r1 + 1
            goto L36
        L4a:
            android.os.Trace.endSection()
            android.os.Trace.endSection()
            return
    }

    public final void f(int r9) {
            r8 = this;
            java.lang.String r0 = "onCaptureSequenceAborted"
            android.os.Trace.beginSection(r0)
            tu0 r0 = r8.l
            jg7 r1 = defpackage.jg7.a
            r0.b0(r1)
            d51 r0 = r8.f
            r0.m(r8)
            int r0 = r8.a()
            if (r0 != r9) goto L18
            goto L41
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onCaptureSequenceAborted was invoked on "
            r0.<init>(r1)
            int r1 = r8.a()
            r0.append(r1)
            java.lang.String r1 = ", but expected "
            r0.append(r1)
            r0.append(r9)
            r9 = 33
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            ks6 r0 = r8.j
            r0.getClass()
            java.lang.String r0 = "CXCP"
            android.util.Log.w(r0, r9)
        L41:
            java.lang.String r9 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r9)
            java.util.ArrayList r9 = r8.d
            int r0 = r9.size()
            r1 = 0
            r2 = r1
        L4e:
            if (r2 >= r0) goto L6e
            java.lang.Object r3 = r9.get(r2)
            yk5 r3 = (defpackage.yk5) r3
            java.util.List r4 = r8.e
            int r5 = r4.size()
            r6 = r1
        L5d:
            if (r6 >= r5) goto L6b
            java.lang.Object r7 = r4.get(r6)
            jk5 r7 = (defpackage.jk5) r7
            r7.r(r3)
            int r6 = r6 + 1
            goto L5d
        L6b:
            int r2 = r2 + 1
            goto L4e
        L6e:
            android.os.Trace.endSection()
            java.lang.String r8 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r8)
            int r8 = r9.size()
            r0 = r1
        L7b:
            if (r0 >= r8) goto La5
            java.lang.Object r2 = r9.get(r0)
            yk5 r2 = (defpackage.yk5) r2
            kk5 r3 = r2.c0()
            java.util.List r3 = r3.d
            int r3 = r3.size()
            r4 = r1
        L8e:
            if (r4 >= r3) goto La2
            kk5 r5 = r2.c0()
            java.util.List r5 = r5.d
            java.lang.Object r5 = r5.get(r4)
            jk5 r5 = (defpackage.jk5) r5
            r5.r(r2)
            int r4 = r4 + 1
            goto L8e
        La2:
            int r0 = r0 + 1
            goto L7b
        La5:
            android.os.Trace.endSection()
            android.os.Trace.endSection()
            return
    }

    public final void g(int r9, long r10) {
            r8 = this;
            java.lang.String r0 = "onCaptureSequenceCompleted"
            android.os.Trace.beginSection(r0)
            tu0 r0 = r8.l
            jg7 r1 = defpackage.jg7.a
            r0.b0(r1)
            d51 r0 = r8.f
            r0.m(r8)
            int r0 = r8.a()
            if (r0 != r9) goto L18
            goto L41
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onCaptureSequenceCompleted was invoked on "
            r0.<init>(r1)
            int r1 = r8.a()
            r0.append(r1)
            java.lang.String r1 = ", but expected "
            r0.append(r1)
            r0.append(r9)
            r9 = 33
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            ks6 r0 = r8.j
            r0.getClass()
            java.lang.String r0 = "CXCP"
            android.util.Log.w(r0, r9)
        L41:
            java.lang.String r9 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r9)
            java.util.ArrayList r9 = r8.d
            int r0 = r9.size()
            r1 = 0
            r2 = r1
        L4e:
            if (r2 >= r0) goto L6e
            java.lang.Object r3 = r9.get(r2)
            yk5 r3 = (defpackage.yk5) r3
            java.util.List r4 = r8.e
            int r5 = r4.size()
            r6 = r1
        L5d:
            if (r6 >= r5) goto L6b
            java.lang.Object r7 = r4.get(r6)
            jk5 r7 = (defpackage.jk5) r7
            r7.n(r3, r10)
            int r6 = r6 + 1
            goto L5d
        L6b:
            int r2 = r2 + 1
            goto L4e
        L6e:
            android.os.Trace.endSection()
            java.lang.String r8 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r8)
            int r8 = r9.size()
            r0 = r1
        L7b:
            if (r0 >= r8) goto La5
            java.lang.Object r2 = r9.get(r0)
            yk5 r2 = (defpackage.yk5) r2
            kk5 r3 = r2.c0()
            java.util.List r3 = r3.d
            int r3 = r3.size()
            r4 = r1
        L8e:
            if (r4 >= r3) goto La2
            kk5 r5 = r2.c0()
            java.util.List r5 = r5.d
            java.lang.Object r5 = r5.get(r4)
            jk5 r5 = (defpackage.jk5) r5
            r5.n(r2, r10)
            int r4 = r4 + 1
            goto L8e
        La2:
            int r0 = r0 + 1
            goto L7b
        La5:
            android.os.Trace.endSection()
            android.os.Trace.endSection()
            return
    }

    public final void h(android.hardware.camera2.CaptureRequest r5, long r6, long r8) {
            r4 = this;
            java.lang.String r0 = "onCaptureStarted"
            android.os.Trace.beginSection(r0)
            tu0 r0 = r4.l
            jg7 r1 = defpackage.jg7.a
            r0.b0(r1)
            yk5 r5 = r4.i(r5)
            java.lang.String r0 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r0)
            java.util.List r0 = r4.e
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L1d:
            if (r3 >= r1) goto L2b
            java.lang.Object r4 = r0.get(r3)
            jk5 r4 = (defpackage.jk5) r4
            r4.u(r5, r6, r8)
            int r3 = r3 + 1
            goto L1d
        L2b:
            android.os.Trace.endSection()
            java.lang.String r4 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r4)
            kk5 r4 = r5.c0()
            java.util.List r4 = r4.d
            int r0 = r4.size()
        L3d:
            if (r2 >= r0) goto L51
            kk5 r4 = r5.c0()
            java.util.List r4 = r4.d
            java.lang.Object r4 = r4.get(r2)
            jk5 r4 = (defpackage.jk5) r4
            r4.u(r5, r6, r8)
            int r2 = r2 + 1
            goto L3d
        L51:
            android.os.Trace.endSection()
            android.os.Trace.endSection()
            return
    }

    public final defpackage.yk5 i(android.hardware.camera2.CaptureRequest r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.c
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L1b
            java.lang.Object r3 = r0.get(r2)
            if (r3 != r5) goto L18
            java.util.ArrayList r4 = r4.d
            java.lang.Object r4 = r4.get(r2)
            yk5 r4 = (defpackage.yk5) r4
            return r4
        L18:
            int r2 = r2 + 1
            goto L7
        L1b:
            java.lang.String r4 = "Failed to find CaptureRequest "
            java.lang.String r1 = " in "
            defpackage.fa6.f(r4, r5, r1, r0)
            r4 = 0
            return r4
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession r10, android.hardware.camera2.CaptureRequest r11, android.view.Surface r12, long r13) {
            r9 = this;
            r10.getClass()
            r11.getClass()
            r12.getClass()
            java.lang.String r10 = "onCaptureBufferLost"
            android.os.Trace.beginSection(r10)
            android.util.ArrayMap r10 = r9.g
            java.lang.Object r10 = r10.get(r12)
            kr6 r10 = (defpackage.kr6) r10
            android.util.ArrayMap r0 = r9.h
            r1 = 0
            if (r10 == 0) goto L1c
            goto L5a
        L1c:
            java.lang.Object r10 = r0.get(r12)
            gp4 r10 = (defpackage.gp4) r10
            r2 = 0
            if (r10 == 0) goto L44
            int r10 = r10.a
            jr6 r3 = r9.i
            java.util.ArrayList r3 = r3.d0
            int r4 = r3.size()
            r5 = r1
        L30:
            if (r5 >= r4) goto L40
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            r7 = r6
            ir6 r7 = (defpackage.ir6) r7
            int r7 = r7.a
            if (r7 != r10) goto L30
            goto L41
        L40:
            r6 = r2
        L41:
            ir6 r6 = (defpackage.ir6) r6
            goto L45
        L44:
            r6 = r2
        L45:
            if (r6 == 0) goto L52
            ki0 r10 = r6.j
            if (r10 == 0) goto L54
            int r10 = r10.a
            kr6 r2 = new kr6
            r2.<init>(r10)
        L52:
            r10 = r2
            goto L5a
        L54:
            java.lang.String r9 = "stream"
            defpackage.nb3.a0(r9)
            throw r2
        L5a:
            java.lang.Object r0 = r0.get(r12)
            gp4 r0 = (defpackage.gp4) r0
            java.lang.String r2 = " on "
            if (r10 == 0) goto L110
            if (r0 == 0) goto Lfd
            yk5 r4 = r9.i(r11)
            java.lang.String r11 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r11)
            java.util.List r9 = r9.e
            int r12 = r9.size()
            r2 = r1
        L76:
            if (r2 >= r12) goto L87
            java.lang.Object r3 = r9.get(r2)
            jk5 r3 = (defpackage.jk5) r3
            r3.getClass()
            r4.getClass()
            int r2 = r2 + 1
            goto L76
        L87:
            android.os.Trace.endSection()
            java.lang.String r12 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r12)
            kk5 r2 = r4.c0()
            java.util.List r2 = r2.d
            int r2 = r2.size()
            r3 = r1
        L9a:
            if (r3 >= r2) goto Lae
            kk5 r5 = r4.c0()
            java.util.List r5 = r5.d
            java.lang.Object r5 = r5.get(r3)
            jk5 r5 = (defpackage.jk5) r5
            r5.getClass()
            int r3 = r3 + 1
            goto L9a
        Lae:
            android.os.Trace.endSection()
            android.os.Trace.beginSection(r11)
            int r11 = r9.size()
            r2 = r1
        Lb9:
            if (r2 >= r11) goto Lcc
            java.lang.Object r3 = r9.get(r2)
            jk5 r3 = (defpackage.jk5) r3
            int r7 = r10.a
            int r8 = r0.a
            r5 = r13
            r3.e(r4, r5, r7, r8)
            int r2 = r2 + 1
            goto Lb9
        Lcc:
            r5 = r13
            android.os.Trace.endSection()
            android.os.Trace.beginSection(r12)
            kk5 r9 = r4.c0()
            java.util.List r9 = r9.d
            int r9 = r9.size()
        Ldd:
            if (r1 >= r9) goto Lf6
            kk5 r11 = r4.c0()
            java.util.List r11 = r11.d
            java.lang.Object r11 = r11.get(r1)
            r3 = r11
            jk5 r3 = (defpackage.jk5) r3
            int r7 = r10.a
            int r8 = r0.a
            r3.e(r4, r5, r7, r8)
            int r1 = r1 + 1
            goto Ldd
        Lf6:
            android.os.Trace.endSection()
            android.os.Trace.endSection()
            return
        Lfd:
            r5 = r13
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unable to find the outputId for "
            r9.<init>(r10)
            r9.append(r12)
            java.lang.String r10 = defpackage.nm2.a(r5)
            defpackage.i.k(r9, r2, r10)
            return
        L110:
            r5 = r13
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unable to find the streamId for "
            r9.<init>(r10)
            r9.append(r12)
            java.lang.String r10 = defpackage.nm2.a(r5)
            defpackage.i.k(r9, r2, r10)
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession r3, android.hardware.camera2.CaptureRequest r4, android.hardware.camera2.TotalCaptureResult r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            long r0 = r5.getFrameNumber()
            r2.c(r4, r5, r0)
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(android.hardware.camera2.CameraCaptureSession r3, android.hardware.camera2.CaptureRequest r4, android.hardware.camera2.CaptureFailure r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            java.lang.String r3 = "onCaptureFailed"
            android.os.Trace.beginSection(r3)
            tu0 r3 = r2.l
            jg7 r0 = defpackage.jg7.a
            r3.b0(r0)
            yk5 r3 = r2.i(r4)
            yd r4 = new yd
            r4.<init>(r3, r5)
            long r0 = r5.getFrameNumber()
            r2.b(r3, r0, r4)
            android.os.Trace.endSection()
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession r6, android.hardware.camera2.CaptureRequest r7, android.hardware.camera2.CaptureResult r8) {
            r5 = this;
            r6.getClass()
            r7.getClass()
            r8.getClass()
            java.lang.String r6 = "onCaptureProgressed"
            android.os.Trace.beginSection(r6)
            long r0 = r8.getFrameNumber()
            uh r6 = new uh
            java.lang.String r2 = r5.a
            r6.<init>(r8, r2)
            yk5 r7 = r5.i(r7)
            java.lang.String r8 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r8)
            java.util.List r5 = r5.e
            int r8 = r5.size()
            r2 = 0
            r3 = r2
        L2a:
            if (r3 >= r8) goto L38
            java.lang.Object r4 = r5.get(r3)
            jk5 r4 = (defpackage.jk5) r4
            r4.D(r7, r0, r6)
            int r3 = r3 + 1
            goto L2a
        L38:
            android.os.Trace.endSection()
            java.lang.String r5 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r5)
            kk5 r5 = r7.c0()
            java.util.List r5 = r5.d
            int r5 = r5.size()
        L4a:
            if (r2 >= r5) goto L5e
            kk5 r8 = r7.c0()
            java.util.List r8 = r8.d
            java.lang.Object r8 = r8.get(r2)
            jk5 r8 = (defpackage.jk5) r8
            r8.D(r7, r0, r6)
            int r2 = r2 + 1
            goto L4a
        L5e:
            android.os.Trace.endSection()
            android.os.Trace.endSection()
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession r1, int r2) {
            r0 = this;
            r1.getClass()
            r0.f(r2)
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession r1, int r2, long r3) {
            r0 = this;
            r1.getClass()
            r0.g(r2, r3)
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(android.hardware.camera2.CameraCaptureSession r3, android.hardware.camera2.CaptureRequest r4, long r5, long r7) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r3 = r4
            r0 = r7
            r6 = r5
            r4 = r0
            r2.h(r3, r4, r6)
            return
    }

    public void onReadoutStarted(android.hardware.camera2.CameraCaptureSession r8, android.hardware.camera2.CaptureRequest r9, long r10, long r12) {
            r7 = this;
            r8.getClass()
            r9.getClass()
            java.lang.String r8 = "onReadoutStarted"
            android.os.Trace.beginSection(r8)
            yk5 r1 = r7.i(r9)
            java.lang.String r8 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r8)
            java.util.List r7 = r7.e
            int r8 = r7.size()
            r9 = 0
            r6 = r9
        L1c:
            if (r6 >= r8) goto L2c
            java.lang.Object r0 = r7.get(r6)
            jk5 r0 = (defpackage.jk5) r0
            r4 = r10
            r2 = r12
            r0.h(r1, r2, r4)
            int r6 = r6 + 1
            goto L1c
        L2c:
            r4 = r10
            r2 = r12
            android.os.Trace.endSection()
            java.lang.String r7 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r7)
            kk5 r7 = r1.c0()
            java.util.List r7 = r7.d
            int r7 = r7.size()
        L40:
            if (r9 >= r7) goto L55
            kk5 r8 = r1.c0()
            java.util.List r8 = r8.d
            java.lang.Object r8 = r8.get(r9)
            r0 = r8
            jk5 r0 = (defpackage.jk5) r0
            r0.h(r1, r2, r4)
            int r9 = r9 + 1
            goto L40
        L55:
            android.os.Trace.endSection()
            android.os.Trace.endSection()
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Camera2CaptureSequence-"
            r0.<init>(r1)
            long r1 = r3.k
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
