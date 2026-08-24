package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sd  reason: default package */
/* loaded from: classes.dex */
public final class sd extends android.hardware.camera2.CameraExtensionSession$ExtensionCaptureCallback {
    public final /* synthetic */ int a;
    public final defpackage.vc0 b;
    public final /* synthetic */ defpackage.td c;
    public final java.io.Serializable d;

    public sd(defpackage.td r2, defpackage.vc0 r3) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.c = r2
            r1.<init>()
            r1.b = r3
            java.util.concurrent.ConcurrentLinkedQueue r2 = new java.util.concurrent.ConcurrentLinkedQueue
            r2.<init>()
            r1.d = r2
            return
    }

    public sd(defpackage.td r2, defpackage.vc0 r3, java.util.LinkedHashMap r4) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.c = r2
            r1.<init>()
            r1.b = r3
            r1.d = r4
            return
    }

    public final void onCaptureFailed(android.hardware.camera2.CameraExtensionSession r6, android.hardware.camera2.CaptureRequest r7) {
            r5 = this;
            int r0 = r5.a
            vc0 r1 = r5.b
            java.io.Serializable r2 = r5.d
            r6.getClass()
            r7.getClass()
            switch(r0) {
                case 0: goto L5d;
                default: goto Lf;
            }
        Lf:
            r5 = r2
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            java.lang.Object r5 = r5.get(r7)
            r5.getClass()
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            r6 = 1
            if (r5 != r6) goto L3c
            java.lang.Object r5 = r2.get(r7)
            r5.getClass()
            java.util.List r5 = (java.util.List) r5
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            r1.d(r7, r5)
            goto L5c
        L3c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "onCaptureFailed is not triggered for repeating requests. Request frame numbers: "
            r5.<init>(r6)
            java.lang.Object r6 = r2.get(r7)
            r6.getClass()
            java.util.List r6 = (java.util.List) r6
            java.util.stream.Stream r6 = r6.stream()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "CXCP"
            android.util.Log.i(r6, r5)
        L5c:
            return
        L5d:
            r0 = r2
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L86
            td r5 = r5.c
            ww r0 = r5.X
            r0.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.ww.b
            long r3 = r3.incrementAndGet(r0)
            java.util.HashMap r5 = r5.Y
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r5.put(r6, r0)
            r5 = r2
            java.util.concurrent.ConcurrentLinkedQueue r5 = (java.util.concurrent.ConcurrentLinkedQueue) r5
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r5.add(r6)
        L86:
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            java.lang.Object r5 = r2.remove()
            r5.getClass()
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            r1.d(r7, r5)
            return
    }

    public final void onCaptureProcessProgressed(android.hardware.camera2.CameraExtensionSession r2, android.hardware.camera2.CaptureRequest r3, int r4) {
            r1 = this;
            int r0 = r1.a
            vc0 r1 = r1.b
            r2.getClass()
            r3.getClass()
            switch(r0) {
                case 0: goto L11;
                default: goto Ld;
            }
        Ld:
            r1.e(r3, r4)
            return
        L11:
            r1.e(r3, r4)
            return
    }

    public final void onCaptureProcessStarted(android.hardware.camera2.CameraExtensionSession r1, android.hardware.camera2.CaptureRequest r2) {
            r0 = this;
            int r0 = r0.a
            r1.getClass()
            r2.getClass()
            return
    }

    public void onCaptureResultAvailable(android.hardware.camera2.CameraExtensionSession r6, android.hardware.camera2.CaptureRequest r7, android.hardware.camera2.TotalCaptureResult r8) {
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.onCaptureResultAvailable(r6, r7, r8)
            return
        L9:
            r6.getClass()
            r7.getClass()
            r8.getClass()
            java.io.Serializable r0 = r5.d
            r1 = r0
            java.util.concurrent.ConcurrentLinkedQueue r1 = (java.util.concurrent.ConcurrentLinkedQueue) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3d
            td r1 = r5.c
            ww r2 = r1.X
            r2.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.ww.b
            long r2 = r3.incrementAndGet(r2)
            java.util.HashMap r1 = r1.Y
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r1.put(r6, r4)
            r6 = r0
            java.util.concurrent.ConcurrentLinkedQueue r6 = (java.util.concurrent.ConcurrentLinkedQueue) r6
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r6.add(r1)
        L3d:
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.lang.Object r6 = r0.remove()
            r6.getClass()
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            vc0 r5 = r5.b
            r5.c(r7, r8, r0)
            return
    }

    public final void onCaptureSequenceAborted(android.hardware.camera2.CameraExtensionSession r2, int r3) {
            r1 = this;
            int r0 = r1.a
            vc0 r1 = r1.b
            r2.getClass()
            switch(r0) {
                case 0: goto Le;
                default: goto La;
            }
        La:
            r1.f(r3)
            return
        Le:
            r1.f(r3)
            return
    }

    public final void onCaptureSequenceCompleted(android.hardware.camera2.CameraExtensionSession r3, int r4) {
            r2 = this;
            int r0 = r2.a
            vc0 r1 = r2.b
            td r2 = r2.c
            r3.getClass()
            switch(r0) {
                case 0: goto L1f;
                default: goto Lc;
            }
        Lc:
            java.util.HashMap r2 = r2.Y
            java.lang.Object r2 = r2.get(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            r2.getClass()
            long r2 = r2.longValue()
            r1.g(r4, r2)
            return
        L1f:
            java.util.HashMap r2 = r2.Y
            java.lang.Object r2 = r2.get(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            r2.getClass()
            long r2 = r2.longValue()
            r1.g(r4, r2)
            return
    }

    public final void onCaptureStarted(android.hardware.camera2.CameraExtensionSession r9, android.hardware.camera2.CaptureRequest r10, long r11) {
            r8 = this;
            int r3 = r8.a
            java.io.Serializable r4 = r8.d
            td r5 = r8.c
            r9.getClass()
            r10.getClass()
            switch(r3) {
                case 0: goto L45;
                default: goto Lf;
            }
        Lf:
            ww r3 = r5.X
            r3.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = defpackage.ww.b
            long r6 = r6.incrementAndGet(r3)
            java.util.HashMap r3 = r5.Y
            java.lang.Long r5 = java.lang.Long.valueOf(r6)
            r3.put(r9, r5)
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.lang.Object r1 = r4.get(r10)
            if (r1 != 0) goto L33
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.put(r10, r1)
        L33:
            java.util.List r1 = (java.util.List) r1
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r1.add(r3)
            vc0 r0 = r8.b
            r1 = r10
            r4 = r11
            r2 = r6
            r0.h(r1, r2, r4)
            return
        L45:
            ww r2 = r5.X
            r2.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.ww.b
            long r2 = r3.incrementAndGet(r2)
            java.util.HashMap r5 = r5.Y
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            r5.put(r9, r6)
            java.util.concurrent.ConcurrentLinkedQueue r4 = (java.util.concurrent.ConcurrentLinkedQueue) r4
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r4.add(r1)
            vc0 r0 = r8.b
            r1 = r10
            r4 = r11
            r0.h(r1, r2, r4)
            return
    }
}
