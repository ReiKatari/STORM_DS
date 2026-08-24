package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ae0  reason: default package */
/* loaded from: classes.dex */
public final class ae0 implements defpackage.jk5 {
    public final java.util.LinkedHashMap A;
    public final defpackage.ex6 B;
    public volatile java.util.Map L;

    public ae0() {
            r2 = this;
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.A = r0
            c5 r0 = new c5
            r1 = 12
            r0.<init>(r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r2.B = r1
            zt1 r0 = defpackage.zt1.A
            r2.L = r0
            return
    }

    public static int b(defpackage.yk5 r2) {
            k54 r0 = defpackage.uy6.a
            java.lang.Object r2 = r2.b(r0)
            sy6 r2 = (defpackage.sy6) r2
            r0 = 0
            if (r2 == 0) goto L14
            java.lang.String r1 = "CAPTURE_CONFIG_ID_KEY"
            android.util.ArrayMap r2 = r2.a
            java.lang.Object r2 = r2.get(r1)
            goto L15
        L14:
            r2 = r0
        L15:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 == 0) goto L1c
            r0 = r2
            java.lang.Integer r0 = (java.lang.Integer) r0
        L1c:
            if (r0 == 0) goto L23
            int r2 = r0.intValue()
            return r2
        L23:
            r2 = -1
            return r2
    }

    @Override // defpackage.jk5
    public final void D(defpackage.yk5 r8, long r9, defpackage.uh r11) {
            r7 = this;
            r8.getClass()
            java.util.Map r7 = r7.L
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        Ld:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L63
            java.lang.Object r9 = r7.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            be0 r10 = (defpackage.be0) r10
            java.lang.Object r9 = r9.getValue()
            java.util.concurrent.Executor r9 = (java.util.concurrent.Executor) r9
            boolean r0 = r10 instanceof defpackage.ti0
            if (r0 == 0) goto Ld
            java.lang.Class<android.hardware.camera2.CameraCaptureSession> r0 = android.hardware.camera2.CameraCaptureSession.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.Object r0 = r8.e(r0)
            r3 = r0
            android.hardware.camera2.CameraCaptureSession r3 = (android.hardware.camera2.CameraCaptureSession) r3
            java.lang.Class<android.hardware.camera2.CaptureRequest> r0 = android.hardware.camera2.CaptureRequest.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.Object r0 = r8.e(r0)
            r4 = r0
            android.hardware.camera2.CaptureRequest r4 = (android.hardware.camera2.CaptureRequest) r4
            java.lang.Class<android.hardware.camera2.CaptureResult> r0 = android.hardware.camera2.CaptureResult.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.Object r0 = r11.e(r0)
            r5 = r0
            android.hardware.camera2.CaptureResult r5 = (android.hardware.camera2.CaptureResult) r5
            if (r3 == 0) goto Ld
            if (r4 == 0) goto Ld
            if (r5 == 0) goto Ld
            wd0 r1 = new wd0
            r2 = r10
            ti0 r2 = (defpackage.ti0) r2
            r6 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            r9.execute(r1)
            goto Ld
        L63:
            return
    }

    @Override // defpackage.jk5
    public final void F(defpackage.yk5 r10, long r11, defpackage.wk5 r13) {
            r9 = this;
            java.util.Map r11 = r9.L
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        La:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L6d
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r0 = r12.getKey()
            r2 = r0
            be0 r2 = (defpackage.be0) r2
            java.lang.Object r12 = r12.getValue()
            java.util.concurrent.Executor r12 = (java.util.concurrent.Executor) r12
            boolean r0 = r2 instanceof defpackage.ti0
            if (r0 == 0) goto L58
            android.hardware.camera2.CameraCaptureSession r5 = r9.a(r10)
            java.lang.Class<android.hardware.camera2.CaptureRequest> r0 = android.hardware.camera2.CaptureRequest.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.Object r0 = r10.e(r0)
            r6 = r0
            android.hardware.camera2.CaptureRequest r6 = (android.hardware.camera2.CaptureRequest) r6
            java.lang.Class<android.hardware.camera2.CaptureFailure> r0 = android.hardware.camera2.CaptureFailure.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.Object r0 = r13.e(r0)
            r7 = r0
            android.hardware.camera2.CaptureFailure r7 = (android.hardware.camera2.CaptureFailure) r7
            if (r5 == 0) goto La
            if (r6 == 0) goto La
            if (r7 == 0) goto La
            vd0 r3 = new vd0
            r4 = r2
            ti0 r4 = (defpackage.ti0) r4
            r8 = 1
            r3.<init>(r4, r5, r6, r7, r8)
            r12.execute(r3)
            goto La
        L58:
            d90 r5 = new d90
            ee0 r0 = defpackage.ee0.ERROR
            r0 = 27
            r5.<init>(r0)
            v r1 = new v
            r6 = 5
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r12.execute(r1)
            goto La
        L6d:
            return
    }

    @Override // defpackage.jk5
    public final void J(defpackage.yk5 r10, long r11, defpackage.th r13) {
            r9 = this;
            java.util.Map r11 = r9.L
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        La:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L69
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r0 = r12.getKey()
            r2 = r0
            be0 r2 = (defpackage.be0) r2
            java.lang.Object r12 = r12.getValue()
            java.util.concurrent.Executor r12 = (java.util.concurrent.Executor) r12
            boolean r0 = r2 instanceof defpackage.ti0
            if (r0 == 0) goto L58
            android.hardware.camera2.CameraCaptureSession r5 = r9.a(r10)
            java.lang.Class<android.hardware.camera2.CaptureRequest> r0 = android.hardware.camera2.CaptureRequest.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.Object r0 = r10.e(r0)
            r6 = r0
            android.hardware.camera2.CaptureRequest r6 = (android.hardware.camera2.CaptureRequest) r6
            java.lang.Class<android.hardware.camera2.TotalCaptureResult> r0 = android.hardware.camera2.TotalCaptureResult.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.Object r0 = r13.e(r0)
            r7 = r0
            android.hardware.camera2.TotalCaptureResult r7 = (android.hardware.camera2.TotalCaptureResult) r7
            if (r5 == 0) goto La
            if (r6 == 0) goto La
            if (r7 == 0) goto La
            vd0 r3 = new vd0
            r4 = r2
            ti0 r4 = (defpackage.ti0) r4
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r12.execute(r3)
            goto La
        L58:
            th r5 = new th
            r5.<init>(r10, r13)
            v r1 = new v
            r6 = 4
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r12.execute(r1)
            goto La
        L69:
            return
    }

    @Override // defpackage.jk5
    public final void N(defpackage.kk5 r6) {
            r5 = this;
            r6.getClass()
            java.util.Map r5 = r5.L
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            be0 r1 = (defpackage.be0) r1
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            java.util.Map r2 = r6.c
            k54 r3 = defpackage.uy6.a
            java.lang.Object r2 = r2.get(r3)
            boolean r3 = r2 instanceof defpackage.sy6
            r4 = 0
            if (r3 == 0) goto L35
            sy6 r2 = (defpackage.sy6) r2
            goto L36
        L35:
            r2 = r4
        L36:
            if (r2 == 0) goto L41
            java.lang.String r3 = "CAPTURE_CONFIG_ID_KEY"
            android.util.ArrayMap r2 = r2.a
            java.lang.Object r2 = r2.get(r3)
            goto L42
        L41:
            r2 = r4
        L42:
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L49
            r4 = r2
            java.lang.Integer r4 = (java.lang.Integer) r4
        L49:
            if (r4 == 0) goto L50
            int r2 = r4.intValue()
            goto L51
        L50:
            r2 = -1
        L51:
            om r3 = new om
            r4 = 2
            r3.<init>(r1, r2, r4)
            r0.execute(r3)
            goto Ld
        L5b:
            return
    }

    public final android.hardware.camera2.CameraCaptureSession a(defpackage.yk5 r3) {
            r2 = this;
            java.lang.Class<android.hardware.camera2.CameraCaptureSession> r0 = android.hardware.camera2.CameraCaptureSession.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.Object r0 = r3.e(r0)
            android.hardware.camera2.CameraCaptureSession r0 = (android.hardware.camera2.CameraCaptureSession) r0
            if (r0 != 0) goto L31
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L2f
            java.lang.Class r0 = defpackage.ma.B()
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.Object r3 = r3.e(r0)
            android.hardware.camera2.CameraExtensionSession r3 = defpackage.sd0.f(r3)
            if (r3 == 0) goto L2f
            ex6 r2 = r2.B
            java.lang.Object r2 = r2.getValue()
            android.hardware.camera2.CameraCaptureSession r2 = (android.hardware.camera2.CameraCaptureSession) r2
            return r2
        L2f:
            r2 = 0
            return r2
        L31:
            return r0
    }

    @Override // defpackage.jk5
    public final void e(defpackage.yk5 r10, long r11, int r13, int r14) {
            r9 = this;
            java.util.Map r9 = r9.L
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        La:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L63
            java.lang.Object r14 = r9.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r0 = r14.getKey()
            be0 r0 = (defpackage.be0) r0
            java.lang.Object r14 = r14.getValue()
            java.util.concurrent.Executor r14 = (java.util.concurrent.Executor) r14
            boolean r1 = r0 instanceof defpackage.ti0
            if (r1 == 0) goto La
            java.lang.Class<android.hardware.camera2.CameraCaptureSession> r1 = android.hardware.camera2.CameraCaptureSession.class
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.Object r1 = r10.e(r1)
            r4 = r1
            android.hardware.camera2.CameraCaptureSession r4 = (android.hardware.camera2.CameraCaptureSession) r4
            java.lang.Class<android.hardware.camera2.CaptureRequest> r1 = android.hardware.camera2.CaptureRequest.class
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.Object r1 = r10.e(r1)
            r5 = r1
            android.hardware.camera2.CaptureRequest r5 = (android.hardware.camera2.CaptureRequest) r5
            java.util.Map r1 = r10.x()
            kr6 r2 = new kr6
            r2.<init>(r13)
            java.lang.Object r1 = r1.get(r2)
            r6 = r1
            android.view.Surface r6 = (android.view.Surface) r6
            if (r4 == 0) goto La
            if (r5 == 0) goto La
            if (r6 == 0) goto La
            yd0 r2 = new yd0
            r3 = r0
            ti0 r3 = (defpackage.ti0) r3
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r14.execute(r2)
            goto La
        L63:
            return
    }

    @Override // defpackage.jk5
    public final void h(defpackage.yk5 r13, long r14, long r16) {
            r12 = this;
            r13.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto La
            goto L5e
        La:
            java.util.Map r12 = r12.L
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L14:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            be0 r1 = (defpackage.be0) r1
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            boolean r2 = r1 instanceof defpackage.ti0
            if (r2 == 0) goto L14
            java.lang.Class<android.hardware.camera2.CameraCaptureSession> r2 = android.hardware.camera2.CameraCaptureSession.class
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.Object r2 = r13.e(r2)
            r5 = r2
            android.hardware.camera2.CameraCaptureSession r5 = (android.hardware.camera2.CameraCaptureSession) r5
            java.lang.Class<android.hardware.camera2.CaptureRequest> r2 = android.hardware.camera2.CaptureRequest.class
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.Object r2 = r13.e(r2)
            r6 = r2
            android.hardware.camera2.CaptureRequest r6 = (android.hardware.camera2.CaptureRequest) r6
            if (r5 == 0) goto L14
            if (r6 == 0) goto L14
            td0 r3 = new td0
            r4 = r1
            ti0 r4 = (defpackage.ti0) r4
            r11 = 1
            r9 = r14
            r7 = r16
            r3.<init>(r4, r5, r6, r7, r9, r11)
            r0.execute(r3)
            goto L14
        L5e:
            return
    }

    @Override // defpackage.jk5
    public final void n(defpackage.yk5 r11, long r12) {
            r10 = this;
            r11.getClass()
            java.util.Map r0 = r10.L
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            be0 r2 = (defpackage.be0) r2
            java.lang.Object r1 = r1.getValue()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            boolean r3 = r2 instanceof defpackage.ti0
            if (r3 == 0) goto Ld
            android.hardware.camera2.CameraCaptureSession r6 = r10.a(r11)
            java.lang.Class<android.hardware.camera2.CaptureRequest> r3 = android.hardware.camera2.CaptureRequest.class
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.Object r3 = r11.e(r3)
            android.hardware.camera2.CaptureRequest r3 = (android.hardware.camera2.CaptureRequest) r3
            if (r6 == 0) goto Ld
            if (r3 == 0) goto Ld
            zd0 r4 = new zd0
            r5 = r2
            ti0 r5 = (defpackage.ti0) r5
            r9 = 0
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            r1.execute(r4)
            goto Ld
        L4b:
            return
    }

    @Override // defpackage.jk5
    public final void r(defpackage.yk5 r7) {
            r6 = this;
            r7.getClass()
            java.util.Map r0 = r6.L
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            be0 r2 = (defpackage.be0) r2
            java.lang.Object r1 = r1.getValue()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            boolean r3 = r2 instanceof defpackage.ti0
            if (r3 == 0) goto L51
            java.lang.Class<android.hardware.camera2.CameraCaptureSession> r3 = android.hardware.camera2.CameraCaptureSession.class
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.Object r3 = r7.e(r3)
            android.hardware.camera2.CameraCaptureSession r3 = (android.hardware.camera2.CameraCaptureSession) r3
            java.lang.Class<android.hardware.camera2.CaptureRequest> r4 = android.hardware.camera2.CaptureRequest.class
            ar0 r4 = defpackage.gh5.a(r4)
            java.lang.Object r4 = r7.e(r4)
            android.hardware.camera2.CaptureRequest r4 = (android.hardware.camera2.CaptureRequest) r4
            if (r3 == 0) goto Ld
            if (r4 == 0) goto Ld
            mf r4 = new mf
            ti0 r2 = (defpackage.ti0) r2
            r5 = 3
            r4.<init>(r5, r2, r3)
            r1.execute(r4)
            goto Ld
        L51:
            ud0 r3 = new ud0
            r4 = 1
            r3.<init>(r2, r6, r7, r4)
            r1.execute(r3)
            goto Ld
        L5b:
            return
    }

    @Override // defpackage.jk5
    public final void u(defpackage.yk5 r14, long r15, long r17) {
            r13 = this;
            r14.getClass()
            java.util.Map r0 = r13.L
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            be0 r2 = (defpackage.be0) r2
            java.lang.Object r1 = r1.getValue()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            boolean r3 = r2 instanceof defpackage.ti0
            if (r3 == 0) goto L4e
            android.hardware.camera2.CameraCaptureSession r6 = r13.a(r14)
            java.lang.Class<android.hardware.camera2.CaptureRequest> r3 = android.hardware.camera2.CaptureRequest.class
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.Object r3 = r14.e(r3)
            r7 = r3
            android.hardware.camera2.CaptureRequest r7 = (android.hardware.camera2.CaptureRequest) r7
            if (r6 == 0) goto Ld
            if (r7 == 0) goto Ld
            td0 r4 = new td0
            r5 = r2
            ti0 r5 = (defpackage.ti0) r5
            r12 = 0
            r10 = r15
            r8 = r17
            r4.<init>(r5, r6, r7, r8, r10, r12)
            r1.execute(r4)
            goto Ld
        L4e:
            ud0 r3 = new ud0
            r4 = 0
            r3.<init>(r2, r13, r14, r4)
            r1.execute(r3)
            goto Ld
        L58:
            return
    }

    @Override // defpackage.jk5
    public final void v(defpackage.yk5 r11, int r12) {
            r10 = this;
            r11.getClass()
            java.util.Map r0 = r10.L
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            be0 r2 = (defpackage.be0) r2
            java.lang.Object r1 = r1.getValue()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            boolean r3 = r2 instanceof defpackage.ti0
            if (r3 == 0) goto L63
            java.lang.Class<android.hardware.camera2.CameraCaptureSession> r3 = android.hardware.camera2.CameraCaptureSession.class
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.Object r3 = r11.e(r3)
            r6 = r3
            android.hardware.camera2.CameraCaptureSession r6 = (android.hardware.camera2.CameraCaptureSession) r6
            java.lang.Class<android.hardware.camera2.CaptureRequest> r3 = android.hardware.camera2.CaptureRequest.class
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.Object r3 = r11.e(r3)
            r7 = r3
            android.hardware.camera2.CaptureRequest r7 = (android.hardware.camera2.CaptureRequest) r7
            java.lang.Class<android.hardware.camera2.CaptureResult> r3 = android.hardware.camera2.CaptureResult.class
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.Object r3 = r11.e(r3)
            r8 = r3
            android.hardware.camera2.CaptureResult r8 = (android.hardware.camera2.CaptureResult) r8
            if (r6 == 0) goto Ld
            if (r7 == 0) goto Ld
            if (r8 == 0) goto Ld
            wd0 r4 = new wd0
            r5 = r2
            ti0 r5 = (defpackage.ti0) r5
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r1.execute(r4)
            goto Ld
        L63:
            xd0 r3 = new xd0
            r3.<init>(r2, r10, r11, r12)
            r1.execute(r3)
            goto Ld
        L6c:
            return
    }
}
