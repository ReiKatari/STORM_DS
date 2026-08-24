package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xc0  reason: default package */
/* loaded from: classes.dex */
public final class xc0 {
    public final defpackage.me0 a;
    public final defpackage.t57 b;
    public final int c;
    public final java.util.Map d;
    public final java.util.Map e;
    public final defpackage.jr6 f;
    public final defpackage.ks6 g;
    public final boolean h;
    public final int i;
    public final java.lang.Object j;
    public boolean k;
    public defpackage.vc0 l;
    public final defpackage.di m;

    public xc0(defpackage.me0 r2, defpackage.t57 r3, int r4, java.util.Map r5, java.util.Map r6, defpackage.jr6 r7, defpackage.ks6 r8, boolean r9) {
            r1 = this;
            java.lang.String r0 = "CXCP"
            r2.getClass()
            r3.getClass()
            r5.getClass()
            r6.getClass()
            r8.getClass()
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            r1.f = r7
            r1.g = r8
            r1.h = r9
            uw r4 = defpackage.yc0.a
            r4.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.uw.b
            int r4 = r5.incrementAndGet(r4)
            r1.i = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r1.j = r4
            java.util.List r4 = r7.Y
            boolean r5 = r4.isEmpty()
            r6 = 0
            if (r5 != 0) goto L9c
            java.lang.Object r4 = defpackage.gt0.H0(r4)
            gr6 r4 = (defpackage.gr6) r4
            android.view.Surface r2 = r2.getInputSurface()
            if (r2 == 0) goto L96
            int r5 = r4.a     // Catch: java.lang.RuntimeException -> L5f
            int r4 = r4.b     // Catch: java.lang.RuntimeException -> L5f
            fr6 r7 = new fr6     // Catch: java.lang.RuntimeException -> L5f
            r7.<init>(r4)     // Catch: java.lang.RuntimeException -> L5f
            android.os.Handler r3 = r3.a()     // Catch: java.lang.RuntimeException -> L5f
            di r6 = defpackage.hf.H(r2, r5, r7, r3)     // Catch: java.lang.RuntimeException -> L5f
            goto L78
        L5f:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to create ImageWriter for session "
            r3.<init>(r4)
            me0 r4 = r1.a
            r3.append(r4)
            java.lang.String r4 = "! Reprocessing will not be supported!"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r0, r3, r2)
        L78:
            if (r6 == 0) goto L9c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Created ImageWriter "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r3 = " for session "
            r2.append(r3)
            me0 r3 = r1.a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
            goto L9c
        L96:
            java.lang.String r1 = "inputSurface is required to create instance of imageWriter."
            defpackage.i.m(r1)
            throw r6
        L9c:
            r1.m = r6
            return
    }

    public static final void a(defpackage.xc0 r5, defpackage.vc0 r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Waiting for the last repeating request sequence: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            t57 r0 = r5.b
            wc0 r2 = new wc0
            r3 = 0
            r4 = 0
            r2.<init>(r6, r3, r4)
            r3 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = r0.b(r3, r2)
            jg7 r0 = (defpackage.jg7) r0
            if (r0 != 0) goto L3d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = "
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            android.util.Log.e(r1, r5)
        L3d:
            return
    }

    public final defpackage.vc0 b(boolean r34, java.util.List r35, java.util.Map r36, java.util.Map r37, java.util.Map r38, defpackage.d51 r39, java.util.List r40) {
            r33 = this;
            r1 = r33
            r5 = r36
            r7 = r38
            r5.getClass()
            r37.getClass()
            r7.getClass()
            r39.getClass()
            r40.getClass()
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = r35.size()
            r13.<init>(r0)
            java.util.ArrayList r14 = new java.util.ArrayList
            int r0 = r35.size()
            r14.<init>(r0)
            android.util.ArrayMap r15 = new android.util.ArrayMap
            r15.<init>()
            android.util.ArrayMap r2 = new android.util.ArrayMap
            r2.<init>()
            android.util.ArrayMap r8 = new android.util.ArrayMap
            r8.<init>()
            boolean r0 = r35.isEmpty()
            java.lang.String r3 = "build(...) should never be called with an empty request list!"
            r16 = 0
            if (r0 != 0) goto L59a
            me0 r4 = r1.a
            boolean r0 = r4 instanceof defpackage.qd
            java.lang.String r6 = "CXCP"
            r17 = 1
            jr6 r9 = r1.f
            if (r0 == 0) goto L21d
            java.util.Iterator r0 = r35.iterator()
            r10 = r16
            r21 = r10
        L54:
            boolean r22 = r0.hasNext()
            if (r22 == 0) goto L21d
            java.lang.Object r22 = r0.next()
            r11 = r22
            kk5 r11 = (defpackage.kk5) r11
            java.util.List r12 = r11.a
            if (r12 == 0) goto L77
            boolean r22 = r12.isEmpty()
            if (r22 == 0) goto L77
        L6c:
            r22 = r0
            r25 = r3
            r26 = r4
            r30 = r13
            r0 = 0
            goto L101
        L77:
            java.util.Iterator r12 = r12.iterator()
        L7b:
            boolean r22 = r12.hasNext()
            if (r22 == 0) goto L6c
            java.lang.Object r22 = r12.next()
            kr6 r22 = (defpackage.kr6) r22
            r22.getClass()
            r22 = r0
            java.util.ArrayList r0 = r9.d0
            if (r0 == 0) goto L9f
            boolean r25 = r0.isEmpty()
            if (r25 == 0) goto L9f
            r25 = r3
            r26 = r4
        L9a:
            r31 = r12
            r30 = r13
            goto Lf5
        L9f:
            r25 = r3
            int r3 = r0.size()
            r26 = r4
            r4 = 0
        La8:
            if (r4 >= r3) goto L9a
            java.lang.Object r27 = r0.get(r4)
            int r4 = r4 + 1
            r28 = r0
            r0 = r27
            ir6 r0 = (defpackage.ir6) r0
            r27 = r3
            sp4 r3 = r0.g
            tp4 r0 = r0.i
            if (r3 != 0) goto Lc6
            r29 = r4
            r31 = r12
            r30 = r13
            r3 = 0
            goto Ld4
        Lc6:
            r29 = r4
            long r3 = r3.a
            r31 = r12
            r30 = r13
            r12 = 1
            boolean r3 = defpackage.sp4.a(r3, r12)
        Ld4:
            if (r3 != 0) goto Lf2
            if (r0 != 0) goto Lda
            r3 = 0
            goto Le2
        Lda:
            long r3 = r0.a
            r12 = 0
            boolean r3 = defpackage.tp4.a(r3, r12)
        Le2:
            if (r3 != 0) goto Lf2
            if (r0 != 0) goto Le7
            goto Lf2
        Le7:
            r3 = r27
            r0 = r28
            r4 = r29
            r13 = r30
            r12 = r31
            goto La8
        Lf2:
            r0 = r17
            goto L101
        Lf5:
            r0 = r22
            r3 = r25
            r4 = r26
            r13 = r30
            r12 = r31
            goto L7b
        L101:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r4 = 46
            if (r10 == 0) goto L12f
            boolean r12 = r10.equals(r3)
            if (r12 != 0) goto L12f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "The previous high speed request and the current high speed request must both have a preview stream use case or hint. Previous request contains preview stream use case or hint: "
            r12.<init>(r13)
            boolean r10 = r10.booleanValue()
            r12.append(r10)
            java.lang.String r10 = ". Current request contains preview stream use case or hint: "
            r12.append(r10)
            r12.append(r0)
            r12.append(r4)
            java.lang.String r0 = r12.toString()
            android.util.Log.e(r6, r0)
        L12f:
            java.util.List r0 = r11.a
            if (r0 == 0) goto L13e
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L13e
        L139:
            r28 = r3
            r0 = 0
            goto L1ab
        L13e:
            java.util.Iterator r0 = r0.iterator()
        L142:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L139
            java.lang.Object r10 = r0.next()
            kr6 r10 = (defpackage.kr6) r10
            r10.getClass()
            java.util.ArrayList r10 = r9.d0
            if (r10 == 0) goto L15e
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L15e
        L15b:
            r28 = r3
            goto L1a6
        L15e:
            int r11 = r10.size()
            r12 = 0
        L163:
            if (r12 >= r11) goto L15b
            java.lang.Object r13 = r10.get(r12)
            int r12 = r12 + 1
            ir6 r13 = (defpackage.ir6) r13
            sp4 r4 = r13.g
            if (r4 != 0) goto L179
            r28 = r3
            r29 = r10
            r31 = r11
            r3 = 0
            goto L187
        L179:
            r28 = r3
            long r3 = r4.a
            r29 = r10
            r31 = r11
            r10 = 3
            boolean r3 = defpackage.sp4.a(r3, r10)
        L187:
            if (r3 != 0) goto L1a3
            tp4 r3 = r13.i
            if (r3 != 0) goto L18f
            r3 = 0
            goto L197
        L18f:
            long r3 = r3.a
            r10 = 1
            boolean r3 = defpackage.tp4.a(r3, r10)
        L197:
            if (r3 == 0) goto L19a
            goto L1a3
        L19a:
            r3 = r28
            r10 = r29
            r11 = r31
            r4 = 46
            goto L163
        L1a3:
            r0 = r17
            goto L1ab
        L1a6:
            r3 = r28
            r4 = 46
            goto L142
        L1ab:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r4 = r21
            if (r4 == 0) goto L1db
            boolean r10 = r4.equals(r3)
            if (r10 != 0) goto L1db
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "The previous high speed request and the current high speed request do not have the same video stream use case. Previous request contains video stream use case: "
            r10.<init>(r11)
            boolean r4 = r4.booleanValue()
            r10.append(r4)
            java.lang.String r4 = ". Current request contains video stream use case: "
            r10.append(r4)
            r10.append(r0)
            r0 = 46
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            android.util.Log.e(r6, r0)
        L1db:
            java.util.ArrayList r0 = r9.d0
            if (r0 == 0) goto L1e6
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L1e6
            goto L20f
        L1e6:
            int r4 = r0.size()
            r10 = 0
        L1eb:
            if (r10 >= r4) goto L20f
            java.lang.Object r11 = r0.get(r10)
            int r10 = r10 + 1
            ir6 r11 = (defpackage.ir6) r11
            boolean r11 = r11.a()
            if (r11 != 0) goto L1eb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are "
            r0.<init>(r1)
            java.util.ArrayList r1 = r9.d0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r6, r0)
            return r16
        L20f:
            r21 = r3
            r0 = r22
            r3 = r25
            r4 = r26
            r10 = r28
            r13 = r30
            goto L54
        L21d:
            r25 = r3
            r26 = r4
            r30 = r13
            boolean r0 = r35.isEmpty()
            if (r0 != 0) goto L596
            java.util.Iterator r0 = r35.iterator()
        L22d:
            boolean r3 = r0.hasNext()
            java.lang.String r13 = "Check failed."
            if (r3 == 0) goto L2f7
            java.lang.Object r3 = r0.next()
            kk5 r3 = (defpackage.kk5) r3
            java.util.List r10 = r3.a
            java.util.Iterator r10 = r10.iterator()
            r11 = 0
        L242:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L2d2
            java.lang.Object r12 = r10.next()
            kr6 r12 = (defpackage.kr6) r12
            int r12 = r12.a
            kr6 r4 = new kr6
            r4.<init>(r12)
            boolean r4 = r8.containsKey(r4)
            if (r4 == 0) goto L25e
            r11 = r17
            goto L242
        L25e:
            kr6 r4 = new kr6
            r4.<init>(r12)
            r22 = r0
            java.util.Map r0 = r1.d
            java.lang.Object r0 = r0.get(r4)
            android.view.Surface r0 = (android.view.Surface) r0
            if (r0 == 0) goto L2c8
            kr6 r4 = new kr6
            r4.<init>(r12)
            r15.put(r0, r4)
            kr6 r4 = new kr6
            r4.<init>(r12)
            r8.put(r4, r0)
            ki0 r0 = r9.e(r12)
            java.lang.String r4 = "Required value was null."
            if (r0 == 0) goto L2cc
            java.util.ArrayList r0 = r0.b
            int r11 = r0.size()
            r12 = 0
        L28e:
            if (r12 >= r11) goto L2c6
            java.lang.Object r25 = r0.get(r12)
            int r12 = r12 + 1
            r27 = r0
            r0 = r25
            ir6 r0 = (defpackage.ir6) r0
            r25 = r4
            int r4 = r0.a
            r28 = r10
            gp4 r10 = new gp4
            r10.<init>(r4)
            java.util.Map r4 = r1.e
            java.lang.Object r4 = r4.get(r10)
            if (r4 == 0) goto L2c2
            android.view.Surface r4 = (android.view.Surface) r4
            int r0 = r0.a
            gp4 r10 = new gp4
            r10.<init>(r0)
            r2.put(r4, r10)
            r4 = r25
            r0 = r27
            r10 = r28
            goto L28e
        L2c2:
            defpackage.i.m(r25)
            return r16
        L2c6:
            r11 = r17
        L2c8:
            r0 = r22
            goto L242
        L2cc:
            r25 = r4
            defpackage.i.m(r25)
            return r16
        L2d2:
            r22 = r0
            if (r11 != 0) goto L2ed
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "  Failed to bind any surfaces for "
            r0.<init>(r1)
            r0.append(r3)
            r1 = 33
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r6, r0)
            return r16
        L2ed:
            if (r11 == 0) goto L2f3
            r0 = r22
            goto L22d
        L2f3:
            defpackage.i.m(r13)
            return r16
        L2f7:
            java.util.Iterator r22 = r35.iterator()
        L2fb:
            boolean r0 = r22.hasNext()
            if (r0 == 0) goto L56f
            java.lang.Object r0 = r22.next()
            r10 = r0
            kk5 r10 = (defpackage.kk5) r10
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Building CaptureRequest for "
            r0.<init>(r3)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r6, r0)
            bl5 r0 = r10.e
            if (r0 == 0) goto L320
            int r0 = r0.a
            goto L322
        L320:
            int r0 = r1.c
        L322:
            bf0 r3 = r26.L()
            android.hardware.camera2.CaptureRequest$Builder r3 = r3.D(r0)
            if (r3 != 0) goto L349
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to create a CaptureRequest.Builder from "
            r3.<init>(r4)
            java.lang.String r0 = defpackage.bl5.b(r0)
            r3.append(r0)
            r4 = 33
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            android.util.Log.i(r6, r0)
            r3 = r16
            goto L34b
        L349:
            r4 = 33
        L34b:
            if (r3 != 0) goto L34f
            goto L595
        L34f:
            k54 r0 = defpackage.ug0.b
            java.lang.Object r11 = r7.get(r0)
            if (r11 != 0) goto L35b
            java.lang.Object r11 = r5.get(r0)
        L35b:
            r3.setTag(r11)
            java.util.List r0 = r10.a
            int r0 = r0.size()
            r11 = 0
            r12 = 0
        L366:
            if (r11 >= r0) goto L380
            java.util.List r4 = r10.a
            java.lang.Object r4 = r4.get(r11)
            java.lang.Object r4 = r8.get(r4)
            android.view.Surface r4 = (android.view.Surface) r4
            if (r4 == 0) goto L37b
            r3.addTarget(r4)
            r12 = r17
        L37b:
            int r11 = r11 + 1
            r4 = 33
            goto L366
        L380:
            if (r12 == 0) goto L569
            defpackage.yh2.R(r3, r5)
            r4 = r37
            defpackage.yh2.R(r3, r4)
            java.util.Map r0 = r10.b
            defpackage.yh2.R(r3, r0)
            defpackage.yh2.R(r3, r7)
            ww r0 = defpackage.yc0.c
            r0.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = defpackage.ww.b
            long r11 = r11.incrementAndGet(r0)
            android.hardware.camera2.CaptureRequest r0 = r3.build()
            r0.getClass()
            me0 r3 = r1.a
            r27 = r2
            boolean r2 = r3 instanceof defpackage.qd
            if (r2 == 0) goto L543
            qd r3 = (defpackage.qd) r3
            java.lang.String r2 = "Failed to createHighSpeedRequestList from "
            bf0 r4 = r3.A
            java.lang.String r25 = "CXCP#createHighSpeedRequestList"
            android.os.Trace.beginSection(r25)     // Catch: java.lang.Throwable -> L3c1
            android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession r3 = r3.X     // Catch: java.lang.Throwable -> L3c1
            java.util.List r0 = r3.createHighSpeedRequestList(r0)     // Catch: java.lang.Throwable -> L3c1
            android.os.Trace.endSection()     // Catch: java.lang.UnsupportedOperationException -> L3c6 java.lang.IllegalArgumentException -> L3db java.lang.IllegalStateException -> L3f0
            goto L408
        L3c1:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.UnsupportedOperationException -> L3c6 java.lang.IllegalArgumentException -> L3db java.lang.IllegalStateException -> L3f0
            throw r0     // Catch: java.lang.UnsupportedOperationException -> L3c6 java.lang.IllegalArgumentException -> L3db java.lang.IllegalStateException -> L3f0
        L3c6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r2 = " because the output surface was not available."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r6, r0)
            goto L406
        L3db:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r2 = " because the output surface was destroyed before calling createHighSpeedRequestList."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r6, r0)
            goto L406
        L3f0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to createHighSpeedRequestList. "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r2 = " may be closed."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r6, r0)
        L406:
            r0 = r16
        L408:
            if (r0 != 0) goto L40c
            goto L595
        L40c:
            java.util.List r2 = r10.a
            if (r2 == 0) goto L429
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L429
        L416:
            r31 = r6
            r20 = r9
            r19 = r13
            r32 = r15
            r3 = r30
            r15 = 0
            r21 = 33
            r23 = 3
            r28 = 1
            goto L51b
        L429:
            java.util.Iterator r2 = r2.iterator()
        L42d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L416
            java.lang.Object r3 = r2.next()
            kr6 r3 = (defpackage.kr6) r3
            r3.getClass()
            java.util.ArrayList r3 = r9.d0
            if (r3 == 0) goto L45b
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L45b
            r35 = r2
        L448:
            r31 = r6
            r20 = r9
            r19 = r13
            r32 = r15
            r3 = r30
            r15 = 0
            r21 = 33
            r23 = 3
            r28 = 1
            goto L509
        L45b:
            int r4 = r3.size()
            r35 = r2
            r2 = 0
        L462:
            if (r2 >= r4) goto L448
            java.lang.Object r25 = r3.get(r2)
            int r2 = r2 + 1
            r28 = r2
            r2 = r25
            ir6 r2 = (defpackage.ir6) r2
            r25 = r3
            sp4 r3 = r2.g
            if (r3 != 0) goto L47e
            r29 = r4
            r31 = r6
            r3 = 0
            r5 = 3
            goto L48a
        L47e:
            r29 = r4
            long r3 = r3.a
            r31 = r6
            r5 = 3
            boolean r3 = defpackage.sp4.a(r3, r5)
        L48a:
            if (r3 != 0) goto L4aa
            tp4 r2 = r2.i
            if (r2 != 0) goto L494
            r2 = 0
            r5 = 1
            goto L49c
        L494:
            long r2 = r2.a
            r5 = 1
            boolean r2 = defpackage.tp4.a(r2, r5)
        L49c:
            if (r2 == 0) goto L49f
            goto L4ac
        L49f:
            r5 = r36
            r3 = r25
            r2 = r28
            r4 = r29
            r6 = r31
            goto L462
        L4aa:
            r5 = 1
        L4ac:
            int r2 = r0.size()
            r3 = 0
        L4b1:
            if (r3 >= r2) goto L4f8
            r4 = r2
            od0 r2 = new od0
            java.lang.Object r23 = r0.get(r3)
            android.hardware.camera2.CaptureRequest r23 = (android.hardware.camera2.CaptureRequest) r23
            r24 = r3
            me0 r3 = r1.a
            r18 = r4
            r28 = r5
            r20 = r9
            r19 = r13
            r32 = r15
            r4 = r23
            r13 = r24
            r15 = 0
            r21 = 33
            r23 = 3
            r9 = r34
            r5 = r36
            r6 = r37
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r3 = r0.get(r13)
            r14.add(r3)
            r3 = r30
            r3.add(r2)
            int r2 = r13 + 1
            r7 = r38
            r13 = r19
            r9 = r20
            r5 = r28
            r15 = r32
            r3 = r2
            r2 = r18
            goto L4b1
        L4f8:
            r32 = r15
            r15 = 0
            r21 = 33
            r5 = r36
            r7 = r38
        L501:
            r2 = r27
            r6 = r31
            r15 = r32
            goto L2fb
        L509:
            r2 = r35
            r5 = r36
            r7 = r38
            r30 = r3
            r13 = r19
            r9 = r20
            r6 = r31
            r15 = r32
            goto L42d
        L51b:
            od0 r2 = new od0
            java.lang.Object r4 = r0.get(r15)
            android.hardware.camera2.CaptureRequest r4 = (android.hardware.camera2.CaptureRequest) r4
            r30 = r3
            me0 r3 = r1.a
            r9 = r34
            r5 = r36
            r6 = r37
            r7 = r38
            r13 = r30
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = r0.get(r15)
            r14.add(r0)
            r13.add(r2)
        L53e:
            r13 = r19
            r9 = r20
            goto L501
        L543:
            r31 = r6
            r20 = r9
            r19 = r13
            r32 = r15
            r13 = r30
            r15 = 0
            r21 = 33
            r23 = 3
            r28 = 1
            od0 r2 = new od0
            r9 = r34
            r5 = r36
            r6 = r37
            r7 = r38
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r14.add(r4)
            r13.add(r2)
            goto L53e
        L569:
            r19 = r13
            defpackage.i.m(r19)
            return r16
        L56f:
            r27 = r2
            r32 = r15
            r13 = r30
            vc0 r0 = new vc0
            bf0 r2 = r26.L()
            java.lang.String r2 = r2.h()
            jr6 r9 = r1.f
            ks6 r10 = r1.g
            r6 = r39
            r5 = r40
            r1 = r2
            r4 = r13
            r3 = r14
            r8 = r27
            r7 = r32
            r2 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r16 = r0
        L595:
            return r16
        L596:
            defpackage.i.m(r25)
            return r16
        L59a:
            r25 = r3
            defpackage.i.m(r25)
            return r16
    }

    public final void c() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = "#disconnect"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r2.j     // Catch: java.lang.Throwable -> L47
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L47
            boolean r1 = r2.k     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L36
            r1 = 1
            r2.k = r1     // Catch: java.lang.Throwable -> L26
            di r1 = r2.m     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L28
            defpackage.i61.z(r1)     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r2 = move-exception
            goto L45
        L28:
            me0 r1 = r2.a     // Catch: java.lang.Throwable -> L26
            android.view.Surface r1 = r1.getInputSurface()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L33
            r1.release()     // Catch: java.lang.Throwable -> L26
        L33:
            vc0 r1 = r2.l     // Catch: java.lang.Throwable -> L26
            goto L37
        L36:
            r1 = 0
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            boolean r0 = r2.h     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L41
            if (r1 == 0) goto L41
            a(r2, r1)     // Catch: java.lang.Throwable -> L47
        L41:
            android.os.Trace.endSection()
            return
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r2     // Catch: java.lang.Throwable -> L47
        L47:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
    }

    public final java.lang.Integer d(defpackage.vc0 r5) {
            r4 = this;
            java.lang.Object r0 = r4.j
            monitor-enter(r0)
            boolean r1 = r4.k     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2a
            java.lang.String r1 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            r2.append(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = " disconnected. "
            r2.append(r4)     // Catch: java.lang.Throwable -> L28
            r2.append(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = " won't be submitted"
            r2.append(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L28
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)
            r4 = 0
            return r4
        L28:
            r4 = move-exception
            goto L71
        L2a:
            java.util.ArrayList r1 = r5.c     // Catch: java.lang.Throwable -> L28
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L28
            r2 = 1
            if (r1 != r2) goto L5e
            me0 r1 = r4.a     // Catch: java.lang.Throwable -> L28
            boolean r2 = r1 instanceof defpackage.qd     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L5e
            boolean r2 = r5.b     // Catch: java.lang.Throwable -> L28
            r3 = 0
            if (r2 == 0) goto L51
            boolean r2 = r4.h     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L44
            r4.l = r5     // Catch: java.lang.Throwable -> L28
        L44:
            java.util.ArrayList r4 = r5.c     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L28
            android.hardware.camera2.CaptureRequest r4 = (android.hardware.camera2.CaptureRequest) r4     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r4 = r1.i(r4, r5)     // Catch: java.lang.Throwable -> L28
            goto L6f
        L51:
            java.util.ArrayList r4 = r5.c     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L28
            android.hardware.camera2.CaptureRequest r4 = (android.hardware.camera2.CaptureRequest) r4     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r4 = r1.d0(r4, r5)     // Catch: java.lang.Throwable -> L28
            goto L6f
        L5e:
            boolean r1 = r5.b     // Catch: java.lang.Throwable -> L28
            me0 r4 = r4.a
            java.util.ArrayList r2 = r5.c
            if (r1 == 0) goto L6b
            java.lang.Integer r4 = r4.o(r2, r5)     // Catch: java.lang.Throwable -> L28
            goto L6f
        L6b:
            java.lang.Integer r4 = r4.Q(r2, r5)     // Catch: java.lang.Throwable -> L28
        L6f:
            monitor-exit(r0)
            return r4
        L71:
            monitor-exit(r0)
            throw r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Camera2CaptureSequenceProcessor-"
            r0.<init>(r1)
            int r2 = r2.i
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
