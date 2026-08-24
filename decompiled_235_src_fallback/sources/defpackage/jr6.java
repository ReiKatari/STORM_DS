package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jr6  reason: default package */
/* loaded from: classes.dex */
public final class jr6 implements java.lang.AutoCloseable {
    public static final defpackage.uw e0 = null;
    public static final defpackage.uw f0 = null;
    public static final defpackage.uw g0 = null;
    public static final defpackage.uw h0 = null;
    public static final defpackage.uw i0 = null;
    public static final java.util.List j0 = null;
    public static final defpackage.tp5 k0 = null;
    public static final java.util.List l0 = null;
    public static final defpackage.tp5 m0 = null;
    public final defpackage.kf0 A;
    public final java.util.LinkedHashMap B;
    public final java.util.List L;
    public final java.util.LinkedHashMap R;
    public final defpackage.p04 X;
    public final java.util.List Y;
    public final java.util.ArrayList Z;
    public final java.util.ArrayList d0;

    static {
            r0 = 0
            uw r1 = defpackage.g04.t(r0)
            defpackage.jr6.e0 = r1
            uw r1 = defpackage.g04.t(r0)
            defpackage.jr6.f0 = r1
            uw r1 = defpackage.g04.t(r0)
            defpackage.jr6.g0 = r1
            uw r1 = defpackage.g04.t(r0)
            defpackage.jr6.h0 = r1
            uw r1 = defpackage.g04.t(r0)
            defpackage.jr6.i0 = r1
            vs0 r1 = defpackage.vs0.n0
            vs0 r2 = defpackage.vs0.o0
            vs0[] r1 = new defpackage.vs0[]{r1, r2}
            java.util.List r1 = defpackage.hf.c0(r1)
            defpackage.jr6.j0 = r1
            tp5 r1 = new tp5
            r2 = 10
            r1.<init>(r2)
            defpackage.jr6.k0 = r1
            fr6 r1 = new fr6
            r1.<init>(r0)
            fr6 r0 = new fr6
            r2 = 34
            r0.<init>(r2)
            fr6[] r0 = new defpackage.fr6[]{r1, r0}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.jr6.l0 = r0
            tp5 r0 = new tp5
            r1 = 11
            r0.<init>(r1)
            defpackage.jr6.m0 = r0
            return
    }

    public jr6(defpackage.lg0 r28, defpackage.kf0 r29, defpackage.jd1 r30, defpackage.yg1 r31) {
            r27 = this;
            r0 = r27
            r1 = r29
            r28.getClass()
            r1.getClass()
            r31.getClass()
            r0.<init>()
            r0.A = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r6 < r7) goto L6b
            int r7 = r1.h
            if (r7 != 0) goto L6b
            kg0 r7 = defpackage.lg0.g
            r7.getClass()
            boolean r7 = defpackage.kg0.c(r28)
            if (r7 != 0) goto L6b
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            r7.getClass()
            r9 = r28
            qc0 r9 = (defpackage.qc0) r9
            java.lang.Object r10 = r9.c(r7)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L4d
            goto L54
        L4d:
            int r10 = r10.intValue()
            if (r10 != 0) goto L54
            goto L6b
        L54:
            r10 = 28
            if (r6 < r10) goto L69
            java.lang.Object r6 = r9.c(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 != 0) goto L61
            goto L69
        L61:
            int r6 = r6.intValue()
            r7 = 4
            if (r6 != r7) goto L69
            goto L6b
        L69:
            r6 = 1
            goto L6c
        L6b:
            r6 = 0
        L6c:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.List r1 = r1.c
            java.util.Iterator r1 = r1.iterator()
        L77:
            boolean r9 = r1.hasNext()
            r10 = 0
            if (r9 == 0) goto L113
            java.lang.Object r9 = r1.next()
            java.util.List r9 = (java.util.List) r9
            boolean r11 = r9.isEmpty()
            java.lang.String r12 = "Check failed."
            if (r11 != 0) goto L10f
            kf0 r11 = r0.A
            java.util.List r11 = r11.b
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r11 = r11.iterator()
        L99:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto Lab
            java.lang.Object r14 = r11.next()
            ji0 r14 = (defpackage.ji0) r14
            java.util.List r14 = r14.a
            defpackage.gt0.A0(r13, r14)
            goto L99
        Lab:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r14 = r13.size()
            r15 = 0
        Lb5:
            if (r15 >= r14) goto Lbd
            r13.get(r15)
            int r15 = r15 + 1
            goto Lb5
        Lbd:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r11 = r11.iterator()
            boolean r14 = r11.hasNext()
            if (r14 != 0) goto L10a
            uw r11 = defpackage.jr6.i0
            r11.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r14 = defpackage.uw.b
            int r14 = r14.incrementAndGet(r11)
        Ld7:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            boolean r15 = r13.contains(r15)
            if (r15 == 0) goto Le8
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r14 = defpackage.uw.b
            int r14 = r14.incrementAndGet(r11)
            goto Ld7
        Le8:
            java.util.Iterator r9 = r9.iterator()
        Lec:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L77
            java.lang.Object r11 = r9.next()
            ji0 r11 = (defpackage.ji0) r11
            boolean r13 = r7.containsKey(r11)
            if (r13 != 0) goto L106
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            r7.put(r11, r13)
            goto Lec
        L106:
            defpackage.i.m(r12)
            throw r10
        L10a:
            java.lang.ClassCastException r0 = defpackage.i61.j(r11)
            throw r0
        L10f:
            defpackage.i.m(r12)
            throw r10
        L113:
            kf0 r1 = r0.A
            java.util.List r1 = r1.b
            java.util.Iterator r1 = r1.iterator()
        L11b:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L19e
            java.lang.Object r9 = r1.next()
            ji0 r9 = (defpackage.ji0) r9
            java.util.List r11 = r9.a
            java.util.Iterator r11 = r11.iterator()
        L12d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L11b
            java.lang.Object r12 = r11.next()
            pp4 r12 = (defpackage.pp4) r12
            boolean r13 = r3.containsKey(r12)
            if (r13 == 0) goto L140
            goto L12d
        L140:
            uw r13 = defpackage.jr6.h0
            r13.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r14 = defpackage.uw.b
            int r16 = r14.incrementAndGet(r13)
            android.util.Size r13 = r12.a
            int r14 = r12.b
            java.lang.String r15 = r12.c
            if (r15 != 0) goto L157
            kf0 r15 = r0.A
            java.lang.String r15 = r15.a
        L157:
            r19 = r15
            java.lang.Object r15 = r7.get(r9)
            r20 = r15
            java.lang.Integer r20 = (java.lang.Integer) r20
            if (r6 == 0) goto L173
            boolean r15 = r12 instanceof defpackage.np4
            if (r15 == 0) goto L16b
            r15 = r12
            np4 r15 = (defpackage.np4) r15
            goto L16c
        L16b:
            r15 = r10
        L16c:
            if (r15 == 0) goto L173
            vs0 r15 = r15.i
            r21 = r15
            goto L175
        L173:
            r21 = r10
        L175:
            rp4 r15 = r12.d
            qp4 r8 = r12.e
            sp4 r10 = r12.f
            r29 = r1
            tp4 r1 = r12.g
            r25 = r1
            java.util.List r1 = r12.h
            r22 = r15
            hr6 r15 = new hr6
            r26 = r1
            r23 = r8
            r24 = r10
            r17 = r13
            r18 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r3.put(r12, r15)
            r2.add(r15)
            r1 = r29
            r10 = 0
            goto L12d
        L19e:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            kf0 r6 = r0.A
            java.util.List r6 = r6.b
            int r6 = r6.size()
            r7 = 0
        L1ac:
            kf0 r8 = r0.A
            r9 = 10
            if (r7 >= r6) goto L269
            java.util.List r8 = r8.b
            java.lang.Object r8 = r8.get(r7)
            ji0 r8 = (defpackage.ji0) r8
            java.util.List r10 = r8.a
            java.util.ArrayList r11 = new java.util.ArrayList
            int r9 = defpackage.ht0.v0(r10, r9)
            r11.<init>(r9)
            java.util.Iterator r9 = r10.iterator()
        L1c9:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L215
            java.lang.Object r10 = r9.next()
            pp4 r10 = (defpackage.pp4) r10
            java.lang.Object r10 = r3.get(r10)
            r10.getClass()
            hr6 r10 = (defpackage.hr6) r10
            ir6 r12 = new ir6
            uw r13 = defpackage.jr6.f0
            r13.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r14 = defpackage.uw.b
            int r13 = r14.incrementAndGet(r13)
            android.util.Size r14 = r10.b
            r20 = r14
            int r14 = r10.c
            java.lang.String r15 = r10.d
            r28 = r6
            rp4 r6 = r10.g
            r17 = r6
            qp4 r6 = r10.h
            r16 = r6
            sp4 r6 = r10.i
            r21 = r15
            vs0 r15 = r10.f
            r18 = r6
            tp4 r6 = r10.j
            r19 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.put(r12, r10)
            r11.add(r12)
            r6 = r28
            goto L1c9
        L215:
            r28 = r6
            ki0 r6 = new ki0
            uw r9 = defpackage.jr6.e0
            r9.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r10 = defpackage.uw.b
            int r9 = r10.incrementAndGet(r9)
            r6.<init>(r9, r11)
            r5.put(r8, r6)
            r4.add(r6)
            int r9 = r11.size()
            r10 = 0
        L232:
            if (r10 >= r9) goto L242
            java.lang.Object r12 = r11.get(r10)
            int r10 = r10 + 1
            ir6 r12 = (defpackage.ir6) r12
            r12.getClass()
            r12.j = r6
            goto L232
        L242:
            java.util.List r8 = r8.a
            java.util.Iterator r8 = r8.iterator()
        L248:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L263
            java.lang.Object r9 = r8.next()
            pp4 r9 = (defpackage.pp4) r9
            java.lang.Object r9 = r3.get(r9)
            r9.getClass()
            hr6 r9 = (defpackage.hr6) r9
            java.util.ArrayList r9 = r9.l
            r9.add(r6)
            goto L248
        L263:
            int r7 = r7 + 1
            r6 = r28
            goto L1ac
        L269:
            java.util.ArrayList r3 = r8.d
            if (r3 == 0) goto L29e
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = defpackage.ht0.v0(r3, r9)
            r6.<init>(r7)
            int r7 = r3.size()
            r8 = 0
        L27b:
            if (r8 >= r7) goto L2a0
            java.lang.Object r10 = r3.get(r8)
            int r8 = r8 + 1
            y73 r10 = (defpackage.y73) r10
            gr6 r11 = new gr6
            uw r12 = defpackage.jr6.g0
            r12.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = defpackage.uw.b
            int r12 = r13.incrementAndGet(r12)
            r10.getClass()
            int r10 = r10.b
            r11.<init>(r12, r10)
            r6.add(r11)
            goto L27b
        L29e:
            yt1 r6 = defpackage.yt1.A
        L2a0:
            r0.Y = r6
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r4.size()
            r8 = 0
        L2b1:
            r10 = 1
            if (r8 >= r7) goto L307
            java.lang.Object r12 = r4.get(r8)
            int r8 = r8 + 1
            r13 = r12
            ki0 r13 = (defpackage.ki0) r13
            java.util.ArrayList r13 = r13.b
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L2cb
        L2c6:
            r29 = r7
            r31 = r8
            goto L2fd
        L2cb:
            int r14 = r13.size()
            r15 = 0
        L2d0:
            if (r15 >= r14) goto L2c6
            java.lang.Object r16 = r13.get(r15)
            int r15 = r15 + 1
            r9 = r16
            ir6 r9 = (defpackage.ir6) r9
            sp4 r9 = r9.g
            if (r9 != 0) goto L2e6
            r29 = r7
            r31 = r8
            r7 = 0
            goto L2f0
        L2e6:
            r29 = r7
            r31 = r8
            long r7 = r9.a
            boolean r7 = defpackage.sp4.a(r7, r10)
        L2f0:
            if (r7 == 0) goto L2f6
            r3.add(r12)
            goto L300
        L2f6:
            r7 = r29
            r8 = r31
            r9 = 10
            goto L2d0
        L2fd:
            r6.add(r12)
        L300:
            r7 = r29
            r8 = r31
            r9 = 10
            goto L2b1
        L307:
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L313
            java.util.ArrayList r4 = defpackage.gt0.V0(r3, r6)
            goto L3c6
        L313:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r4.size()
            r8 = 0
        L322:
            if (r8 >= r7) goto L35c
            java.lang.Object r9 = r4.get(r8)
            int r8 = r8 + 1
            r12 = r9
            ki0 r12 = (defpackage.ki0) r12
            java.util.ArrayList r12 = r12.b
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L336
            goto L356
        L336:
            int r13 = r12.size()
            r14 = 0
        L33b:
            if (r14 >= r13) goto L356
            java.lang.Object r15 = r12.get(r14)
            int r14 = r14 + 1
            ir6 r15 = (defpackage.ir6) r15
            java.util.List r10 = defpackage.jr6.j0
            vs0 r11 = r15.h
            boolean r10 = defpackage.gt0.C0(r10, r11)
            if (r10 == 0) goto L353
            r3.add(r9)
            goto L359
        L353:
            r10 = 1
            goto L33b
        L356:
            r6.add(r9)
        L359:
            r10 = 1
            goto L322
        L35c:
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L36d
            tp5 r4 = defpackage.jr6.k0
            java.util.List r3 = defpackage.gt0.d1(r3, r4)
            java.util.ArrayList r4 = defpackage.gt0.V0(r3, r6)
            goto L3c6
        L36d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r4.size()
            r8 = 0
        L37c:
            if (r8 >= r7) goto L3b6
            java.lang.Object r9 = r4.get(r8)
            int r8 = r8 + 1
            r10 = r9
            ki0 r10 = (defpackage.ki0) r10
            java.util.ArrayList r10 = r10.b
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L390
            goto L3b2
        L390:
            int r11 = r10.size()
            r12 = 0
        L395:
            if (r12 >= r11) goto L3b2
            java.lang.Object r13 = r10.get(r12)
            int r12 = r12 + 1
            ir6 r13 = (defpackage.ir6) r13
            int r13 = r13.c
            fr6 r14 = new fr6
            r14.<init>(r13)
            java.util.List r13 = defpackage.jr6.l0
            boolean r13 = r13.contains(r14)
            if (r13 == 0) goto L395
            r3.add(r9)
            goto L37c
        L3b2:
            r6.add(r9)
            goto L37c
        L3b6:
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L3c6
            tp5 r4 = defpackage.jr6.m0
            java.util.List r3 = defpackage.gt0.d1(r3, r4)
            java.util.ArrayList r4 = defpackage.gt0.V0(r3, r6)
        L3c6:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r4.size()
            r8 = 0
        L3d5:
            if (r8 >= r7) goto L425
            java.lang.Object r9 = r4.get(r8)
            int r8 = r8 + 1
            r10 = r9
            ki0 r10 = (defpackage.ki0) r10
            java.util.ArrayList r10 = r10.b
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L3ed
        L3e8:
            r29 = r7
            r31 = r8
            goto L41d
        L3ed:
            int r11 = r10.size()
            r12 = 0
        L3f2:
            if (r12 >= r11) goto L3e8
            java.lang.Object r13 = r10.get(r12)
            int r12 = r12 + 1
            ir6 r13 = (defpackage.ir6) r13
            sp4 r13 = r13.g
            if (r13 != 0) goto L406
            r29 = r7
            r31 = r8
            r7 = 0
            goto L412
        L406:
            long r13 = r13.a
            r29 = r7
            r31 = r8
            r7 = 3
            boolean r7 = defpackage.sp4.a(r13, r7)
        L412:
            if (r7 == 0) goto L418
            r3.add(r9)
            goto L420
        L418:
            r7 = r29
            r8 = r31
            goto L3f2
        L41d:
            r6.add(r9)
        L420:
            r7 = r29
            r8 = r31
            goto L3d5
        L425:
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L431
            java.util.ArrayList r4 = defpackage.gt0.V0(r6, r3)
            goto L49e
        L431:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r4.size()
            r8 = 0
        L440:
            if (r8 >= r7) goto L494
            java.lang.Object r9 = r4.get(r8)
            int r8 = r8 + 1
            r10 = r9
            ki0 r10 = (defpackage.ki0) r10
            java.util.ArrayList r10 = r10.b
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L45a
        L453:
            r29 = r7
            r31 = r8
            r7 = 1
            goto L48c
        L45a:
            int r11 = r10.size()
            r12 = 0
        L45f:
            if (r12 >= r11) goto L453
            java.lang.Object r13 = r10.get(r12)
            int r12 = r12 + 1
            ir6 r13 = (defpackage.ir6) r13
            tp4 r13 = r13.i
            if (r13 != 0) goto L475
            r29 = r7
            r31 = r8
            r7 = 1
            r13 = 0
            goto L481
        L475:
            long r13 = r13.a
            r29 = r7
            r31 = r8
            r7 = 1
            boolean r13 = defpackage.tp4.a(r13, r7)
        L481:
            if (r13 == 0) goto L487
            r3.add(r9)
            goto L48f
        L487:
            r7 = r29
            r8 = r31
            goto L45f
        L48c:
            r6.add(r9)
        L48f:
            r7 = r29
            r8 = r31
            goto L440
        L494:
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L49e
            java.util.ArrayList r4 = defpackage.gt0.V0(r6, r3)
        L49e:
            r0.Z = r4
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.ht0.v0(r4, r6)
            r3.<init>(r6)
            int r6 = r4.size()
            r7 = 0
        L4b0:
            if (r7 >= r6) goto L4c5
            java.lang.Object r8 = r4.get(r7)
            int r7 = r7 + 1
            ki0 r8 = (defpackage.ki0) r8
            int r8 = r8.a
            kr6 r9 = new kr6
            r9.<init>(r8)
            r3.add(r9)
            goto L4b0
        L4c5:
            defpackage.gt0.p1(r3)
            r0.B = r5
            ix1 r3 = new ix1
            r4 = 8
            r3.<init>(r0, r4)
            java.util.List r2 = defpackage.gt0.d1(r2, r3)
            r0.L = r2
            r0.R = r1
            java.util.ArrayList r1 = r0.Z
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.size()
            r8 = 0
        L4e5:
            if (r8 >= r3) goto L4f5
            java.lang.Object r4 = r1.get(r8)
            int r8 = r8 + 1
            ki0 r4 = (defpackage.ki0) r4
            java.util.ArrayList r4 = r4.b
            defpackage.gt0.A0(r2, r4)
            goto L4e5
        L4f5:
            r0.d0 = r2
            p04 r1 = new p04
            r1.<init>()
            kf0 r2 = r0.A
            java.util.List r2 = r2.b
            java.util.Iterator r2 = r2.iterator()
        L504:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L514
            java.lang.Object r3 = r2.next()
            ji0 r3 = (defpackage.ji0) r3
            r3.getClass()
            goto L504
        L514:
            p04 r1 = r1.b()
            r0.X = r1
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r6 = this;
            p04 r6 = r6.X
            java.util.Collection r6 = r6.values()
            r04 r6 = (defpackage.r04) r6
            java.util.Iterator r6 = r6.iterator()
        Lc:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r6.next()
            t23 r0 = (defpackage.t23) r0
            boolean r1 = r0 instanceof java.lang.AutoCloseable
            if (r1 == 0) goto L20
            r0.close()
            goto Lc
        L20:
            boolean r1 = r0 instanceof java.util.concurrent.ExecutorService
            if (r1 == 0) goto L53
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            java.util.concurrent.ForkJoinPool r1 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r0 != r1) goto L2d
            goto Lc
        L2d:
            boolean r1 = r0.isTerminated()
            if (r1 != 0) goto Lc
            r0.shutdown()
            r2 = 0
        L37:
            if (r1 != 0) goto L49
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L42
            r4 = 1
            boolean r1 = r0.awaitTermination(r4, r3)     // Catch: java.lang.InterruptedException -> L42
            goto L37
        L42:
            if (r2 != 0) goto L37
            r0.shutdownNow()
            r2 = 1
            goto L37
        L49:
            if (r2 == 0) goto Lc
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto Lc
        L53:
            defpackage.u34.t()
        L56:
            return
    }

    public final defpackage.ki0 e(int r5) {
            r4 = this;
            java.util.ArrayList r4 = r4.Z
            int r0 = r4.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.lang.Object r2 = r4.get(r1)
            int r1 = r1 + 1
            r3 = r2
            ki0 r3 = (defpackage.ki0) r3
            int r3 = r3.a
            if (r3 != r5) goto L7
            goto L18
        L17:
            r2 = 0
        L18:
            ki0 r2 = (defpackage.ki0) r2
            return r2
    }

    public final defpackage.ji0 h(int r4) {
            r3 = this;
            java.util.LinkedHashMap r3 = r3.B
            java.util.Set r3 = r3.entrySet()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            r2 = r0
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            ki0 r2 = (defpackage.ki0) r2
            int r2 = r2.a
            if (r2 != r4) goto Lc
            goto L26
        L25:
            r0 = r1
        L26:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L31
            java.lang.Object r3 = r0.getKey()
            ji0 r3 = (defpackage.ji0) r3
            return r3
        L31:
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StreamGraph("
            r0.<init>(r1)
            java.util.LinkedHashMap r2 = r2.B
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
