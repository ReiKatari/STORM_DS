package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sf0  reason: default package */
/* loaded from: classes.dex */
public final class sf0 implements java.lang.AutoCloseable, defpackage.ye0 {
    public final defpackage.gt2 A;
    public final defpackage.gt2 B;
    public final defpackage.jr6 L;
    public final defpackage.rv6 R;
    public final defpackage.kc0 X;
    public final defpackage.lm2 Y;
    public final defpackage.km2 Z;
    public final defpackage.bx d0;
    public final defpackage.qf0 e0;
    public final defpackage.tf0 f0;
    public final defpackage.uf0 g0;
    public final defpackage.jt2 h0;
    public final defpackage.w61 i0;
    public final defpackage.t41 j0;
    public final defpackage.sw k0;

    public sf0(defpackage.kf0 r21, defpackage.lg0 r22, defpackage.gt2 r23, defpackage.gt2 r24, defpackage.jr6 r25, defpackage.rv6 r26, defpackage.kc0 r27, defpackage.lm2 r28, defpackage.km2 r29, defpackage.bx r30, defpackage.qf0 r31, defpackage.tf0 r32, defpackage.uf0 r33, defpackage.jt2 r34, defpackage.w61 r35, defpackage.t41 r36) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r25
            r1.getClass()
            java.util.ArrayList r3 = r1.d
            int r4 = r1.h
            r22.getClass()
            r23.getClass()
            r24.getClass()
            r2.getClass()
            java.util.List r5 = r2.Y
            r26.getClass()
            r27.getClass()
            r28.getClass()
            r29.getClass()
            r30.getClass()
            r32.getClass()
            r33.getClass()
            r34.getClass()
            r35.getClass()
            r36.getClass()
            r0.<init>()
            r6 = r23
            r0.A = r6
            r6 = r24
            r0.B = r6
            r0.L = r2
            r6 = r26
            r0.R = r6
            r6 = r27
            r0.X = r6
            r6 = r28
            r0.Y = r6
            r6 = r29
            r0.Z = r6
            r6 = r30
            r0.d0 = r6
            r6 = r31
            r0.e0 = r6
            r6 = r32
            r0.f0 = r6
            r6 = r33
            r0.g0 = r6
            r6 = r34
            r0.h0 = r6
            r6 = r35
            r0.i0 = r6
            r6 = r36
            r0.j0 = r6
            r6 = 0
            sw r7 = defpackage.g04.s(r6)
            r0.k0 = r7
            java.lang.String r7 = r1.a
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            r8.getClass()
            r9 = r22
            qc0 r9 = (defpackage.qc0) r9
            java.lang.Object r8 = r9.c(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.String r10 = "External"
            java.lang.String r11 = "Unknown"
            r12 = 2
            r13 = 1
            if (r8 != 0) goto L93
            goto L9c
        L93:
            int r14 = r8.intValue()
            if (r14 != 0) goto L9c
            java.lang.String r8 = "Front"
            goto Lb4
        L9c:
            if (r8 != 0) goto L9f
            goto La8
        L9f:
            int r14 = r8.intValue()
            if (r14 != r13) goto La8
            java.lang.String r8 = "Back"
            goto Lb4
        La8:
            if (r8 != 0) goto Lab
            goto Lb3
        Lab:
            int r8 = r8.intValue()
            if (r8 != r12) goto Lb3
            r8 = r10
            goto Lb4
        Lb3:
            r8 = r11
        Lb4:
            android.hardware.camera2.CameraCharacteristics$Key r14 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            r14.getClass()
            java.lang.Object r14 = r9.c(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            if (r14 != 0) goto Lc2
            goto Lcb
        Lc2:
            int r15 = r14.intValue()
            if (r15 != 0) goto Lcb
            java.lang.String r10 = "Limited"
            goto Lfc
        Lcb:
            if (r14 != 0) goto Lce
            goto Ld7
        Lce:
            int r15 = r14.intValue()
            if (r15 != r13) goto Ld7
            java.lang.String r10 = "Full"
            goto Lfc
        Ld7:
            if (r14 != 0) goto Lda
            goto Le3
        Lda:
            int r15 = r14.intValue()
            if (r15 != r12) goto Le3
            java.lang.String r10 = "Legacy"
            goto Lfc
        Le3:
            if (r14 != 0) goto Le6
            goto Lf0
        Le6:
            int r15 = r14.intValue()
            r6 = 3
            if (r15 != r6) goto Lf0
            java.lang.String r10 = "Level 3"
            goto Lfc
        Lf0:
            if (r14 != 0) goto Lf3
            goto Lfb
        Lf3:
            int r6 = r14.intValue()
            r14 = 4
            if (r6 != r14) goto Lfb
            goto Lfc
        Lfb:
            r10 = r11
        Lfc:
            if (r4 != r13) goto L101
            java.lang.String r11 = "High Speed"
            goto L10a
        L101:
            if (r4 != 0) goto L106
            java.lang.String r11 = "Normal"
            goto L10a
        L106:
            if (r4 != r12) goto L10a
            java.lang.String r11 = "Extension"
        L10a:
            android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            r6.getClass()
            java.lang.Object r6 = r9.c(r6)
            int[] r6 = (int[]) r6
            if (r6 == 0) goto L122
            r9 = 11
            boolean r6 = defpackage.fv.m0(r6, r9)
            if (r6 == 0) goto L122
            java.lang.String r6 = "Logical"
            goto L124
        L122:
            java.lang.String r6 = "Physical"
        L124:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r0)
            java.lang.String r15 = " (Camera "
            r14.append(r15)
            r14.append(r7)
            java.lang.String r15 = ")\n"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r9.append(r14)
            java.lang.String r14 = " ("
            java.lang.String r12 = ", "
            r24 = r13
            java.lang.String r13 = "  Facing:    "
            java.lang.StringBuilder r6 = defpackage.i61.u(r13, r8, r14, r6, r12)
            r6.append(r10)
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            r9.append(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "  Mode:      "
            r6.<init>(r8)
            r6.append(r11)
            r8 = 10
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r9.append(r6)
            java.lang.String r6 = "Outputs:\n"
            r9.append(r6)
            java.util.ArrayList r2 = r2.Z
            int r6 = r2.size()
            r10 = 0
        L180:
            java.lang.String r12 = "\n"
            if (r10 >= r6) goto L2e1
            java.lang.Object r14 = r2.get(r10)
            int r10 = r10 + 1
            ki0 r14 = (defpackage.ki0) r14
            java.util.ArrayList r14 = r14.b
            int r15 = r14.size()
            r25 = 0
            r11 = 0
            r16 = 0
        L197:
            if (r11 >= r15) goto L2dd
            java.lang.Object r17 = r14.get(r11)
            int r11 = r11 + 1
            int r18 = r16 + 1
            if (r16 < 0) goto L2d9
            r8 = r17
            ir6 r8 = (defpackage.ir6) r8
            java.lang.String r13 = "  "
            r9.append(r13)
            if (r16 != 0) goto L1c3
            ki0 r13 = r8.j
            if (r13 == 0) goto L1bd
            int r13 = r13.a
            java.lang.String r13 = defpackage.kr6.a(r13)
        L1b8:
            r16 = r2
            r2 = 12
            goto L1c6
        L1bd:
            java.lang.String r0 = "stream"
            defpackage.nb3.a0(r0)
            throw r25
        L1c3:
            java.lang.String r13 = ""
            goto L1b8
        L1c6:
            java.lang.String r13 = defpackage.qs6.A0(r2, r13)
            r9.append(r13)
            int r13 = r8.a
            java.lang.String r2 = r8.d
            r17 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r19 = r5
            java.lang.String r5 = "Output-"
            r3.<init>(r5)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            r5 = 12
            java.lang.String r3 = defpackage.qs6.A0(r5, r3)
            r9.append(r3)
            android.util.Size r3 = r8.b
            java.lang.String r3 = r3.toString()
            r3.getClass()
            java.lang.String r3 = defpackage.qs6.A0(r5, r3)
            r9.append(r3)
            int r3 = r8.c
            java.lang.String r3 = defpackage.fr6.a(r3)
            r5 = 16
            java.lang.String r3 = defpackage.qs6.A0(r5, r3)
            r9.append(r3)
            rp4 r3 = r8.e
            java.lang.String r13 = " ["
            if (r3 == 0) goto L22b
            int r3 = r3.a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r13)
            java.lang.String r3 = defpackage.rp4.a(r3)
            r5.append(r3)
            r3 = 93
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r9.append(r3)
        L22b:
            qp4 r3 = r8.f
            r29 = r6
            if (r3 == 0) goto L24b
            long r5 = r3.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r13)
            java.lang.String r5 = defpackage.qp4.a(r5)
            r3.append(r5)
            r5 = 93
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r9.append(r3)
        L24b:
            sp4 r3 = r8.g
            if (r3 == 0) goto L27d
            long r5 = r3.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r13)
            r31 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r32 = r11
            java.lang.String r11 = "StreamUseCase(value="
            r10.<init>(r11)
            r10.append(r5)
            r5 = 41
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            r3.append(r5)
            r5 = 93
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r9.append(r3)
            goto L281
        L27d:
            r31 = r10
            r32 = r11
        L281:
            tp4 r3 = r8.i
            if (r3 == 0) goto L2ae
            long r5 = r3.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r13)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "StreamUseHint(value="
            r8.<init>(r10)
            r8.append(r5)
            r5 = 41
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r3.append(r5)
            r5 = 93
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r9.append(r3)
        L2ae:
            boolean r3 = defpackage.nb3.k(r2, r7)
            if (r3 != 0) goto L2c4
            r9.append(r13)
            xf0 r3 = new xf0
            r3.<init>(r2)
            r9.append(r3)
            java.lang.String r2 = "]"
            r9.append(r2)
        L2c4:
            r9.append(r12)
            r6 = r29
            r10 = r31
            r11 = r32
            r2 = r16
            r3 = r17
            r16 = r18
            r5 = r19
            r8 = 10
            goto L197
        L2d9:
            defpackage.hf.q0()
            throw r25
        L2dd:
            r31 = r10
            goto L180
        L2e1:
            r17 = r3
            r19 = r5
            r25 = 0
            boolean r2 = r19.isEmpty()
            if (r2 != 0) goto L33c
            java.lang.String r2 = "Inputs:\n"
            r9.append(r2)
            java.util.Iterator r2 = r19.iterator()
        L2f6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L33c
            java.lang.Object r3 = r2.next()
            gr6 r3 = (defpackage.gr6) r3
            java.lang.String r5 = " "
            r9.append(r5)
            int r5 = r3.a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Input-"
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r6 = 12
            java.lang.String r5 = defpackage.qs6.A0(r6, r5)
            r9.append(r5)
            int r3 = r3.b
            java.lang.String r3 = defpackage.fr6.b(r3)
            java.lang.String r3 = defpackage.qs6.A0(r6, r3)
            r9.append(r3)
            java.lang.String r3 = java.lang.String.valueOf(r24)
            java.lang.String r3 = defpackage.qs6.A0(r6, r3)
            r9.append(r3)
            r9.append(r12)
            goto L2f6
        L33c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Session Template: "
            r2.<init>(r3)
            int r3 = r1.f
            java.lang.String r3 = defpackage.bl5.a(r3)
            r2.append(r3)
            r3 = 10
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r9.append(r2)
            java.lang.String r2 = "Session Parameters"
            java.util.Map r3 = r1.g
            defpackage.n16.l(r9, r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Default Template: "
            r2.<init>(r3)
            int r3 = r1.i
            java.lang.String r3 = defpackage.bl5.a(r3)
            r2.append(r3)
            r3 = 10
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r9.append(r2)
            java.lang.String r2 = "Default Parameters"
            java.util.Map r3 = r1.j
            defpackage.n16.l(r9, r2, r3)
            java.lang.String r2 = "Required Parameters"
            java.util.Map r1 = r1.m
            defpackage.n16.l(r9, r2, r1)
            java.lang.String r1 = r9.toString()
            java.lang.String r2 = "CXCP"
            android.util.Log.i(r2, r1)
            r1 = r24
            if (r4 != r1) goto L3e6
            jr6 r1 = r0.L
            java.util.ArrayList r1 = r1.d0
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L3e0
            jr6 r1 = r0.L
            java.util.ArrayList r1 = r1.d0
            int r1 = r1.size()
            jr6 r2 = r0.L
            r3 = 2
            if (r1 > r3) goto L3d8
            java.util.ArrayList r1 = r2.d0
            if (r1 == 0) goto L3b8
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L3b8
            goto L3e6
        L3b8:
            int r2 = r1.size()
            r6 = 0
        L3bd:
            if (r6 >= r2) goto L3e6
            java.lang.Object r3 = r1.get(r6)
            int r6 = r6 + 1
            ir6 r3 = (defpackage.ir6) r3
            boolean r3 = r3.a()
            if (r3 == 0) goto L3ce
            goto L3bd
        L3ce:
            jr6 r0 = r0.L
            java.util.ArrayList r0 = r0.d0
            java.lang.String r1 = "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are "
            defpackage.u34.w(r0, r1)
            throw r25
        L3d8:
            java.lang.String r0 = "Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are "
            java.util.ArrayList r1 = r2.d0
            defpackage.u34.w(r1, r0)
            throw r25
        L3e0:
            java.lang.String r0 = "Cannot create a HIGH_SPEED CameraGraph without outputs."
            defpackage.i.h(r0)
            throw r25
        L3e6:
            if (r17 == 0) goto L408
            boolean r1 = r17.isEmpty()
            if (r1 != 0) goto L402
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 >= r2) goto L408
            int r1 = r17.size()
            r2 = 1
            if (r1 > r2) goto L3fc
            goto L408
        L3fc:
            java.lang.String r0 = "Multi resolution reprocessing not supported under Android S"
            defpackage.i.h(r0)
            throw r25
        L402:
            java.lang.String r0 = "At least one InputConfiguration is required for reprocessing"
            defpackage.i.h(r0)
            throw r25
        L408:
            jr6 r1 = r0.L
            p04 r1 = r1.X
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L417
            rv6 r0 = r0.R
            r0.e()
        L417:
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r8 = this;
            sw r0 = r8.k0
            boolean r0 = r0.a()
            if (r0 == 0) goto L134
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = "#close"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Closing "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r0, r1)
            gt2 r0 = r8.A
            ft2 r0 = r0.b
            r0.close()
            kc0 r0 = r8.X
            java.lang.String r1 = "Quirk: Closing "
            java.lang.String r2 = "Closed "
            java.lang.Object r3 = r0.q
            monitor-enter(r3)
            boolean r4 = r0.e()     // Catch: java.lang.Throwable -> L6e
            r5 = 0
            if (r4 == 0) goto L49
        L46:
            monitor-exit(r3)
            goto Ld7
        L49:
            xe0 r4 = defpackage.xe0.v     // Catch: java.lang.Throwable -> L6e
            r0.s = r4     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "CXCP"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L6e
            r6.append(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L6e
            android.util.Log.d(r4, r2)     // Catch: java.lang.Throwable -> L6e
            pq7 r2 = r0.y     // Catch: java.lang.Throwable -> L6e
            yk0 r4 = r0.z     // Catch: java.lang.Throwable -> L6e
            r0.y = r5     // Catch: java.lang.Throwable -> L6e
            r0.z = r5     // Catch: java.lang.Throwable -> L6e
            ap6 r6 = r0.w     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L71
            r6.h(r5)     // Catch: java.lang.Throwable -> L6e
            goto L71
        L6e:
            r8 = move-exception
            goto L132
        L71:
            ap6 r6 = r0.B     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L78
            r6.h(r5)     // Catch: java.lang.Throwable -> L6e
        L78:
            r0.B = r5     // Catch: java.lang.Throwable -> L6e
            ap6 r6 = r0.C     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L81
            r6.h(r5)     // Catch: java.lang.Throwable -> L6e
        L81:
            r0.C = r5     // Catch: java.lang.Throwable -> L6e
            ap6 r6 = r0.D     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L8a
            r6.h(r5)     // Catch: java.lang.Throwable -> L6e
        L8a:
            r0.D = r5     // Catch: java.lang.Throwable -> L6e
            sc0 r6 = r0.g     // Catch: java.lang.Throwable -> L6e
            defpackage.i61.z(r6)     // Catch: java.lang.Throwable -> L6e
            r0.d(r4, r2)     // Catch: java.lang.Throwable -> L6e
            kf0 r2 = r0.d     // Catch: java.lang.Throwable -> L6e
            mf0 r4 = r2.o     // Catch: java.lang.Throwable -> L6e
            boolean r4 = r4.e     // Catch: java.lang.Throwable -> L6e
            if (r4 != 0) goto La6
            nd0 r4 = r0.l     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = r2.a     // Catch: java.lang.Throwable -> L6e
            boolean r2 = r4.a(r2)     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L46
        La6:
            java.lang.String r2 = "CXCP"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L6e
            kf0 r1 = r0.d     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = r1.a     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = defpackage.xf0.b(r1)     // Catch: java.lang.Throwable -> L6e
            r4.append(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = " during "
            r4.append(r1)     // Catch: java.lang.Throwable -> L6e
            r4.append(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "#close"
            r4.append(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L6e
            android.util.Log.d(r2, r1)     // Catch: java.lang.Throwable -> L6e
            e65 r1 = r0.j     // Catch: java.lang.Throwable -> L6e
            kf0 r0 = r0.d     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = r0.a     // Catch: java.lang.Throwable -> L6e
            r1.a(r0)     // Catch: java.lang.Throwable -> L6e
            goto L46
        Ld7:
            lm2 r0 = r8.Y
            r0.close()
            km2 r0 = r8.Z
            r0.close()
            rv6 r0 = r8.R
            r0.close()
            jr6 r0 = r8.L
            r0.close()
            bx r0 = r8.d0
            r0.getClass()
            java.lang.Object r1 = r0.c
            monitor-enter(r1)
            cx r2 = r0.a()     // Catch: java.lang.Throwable -> L12f
            java.util.LinkedHashMap r3 = r0.d     // Catch: java.lang.Throwable -> L12f
            r3.remove(r8)     // Catch: java.lang.Throwable -> L12f
            cx r3 = r0.a()     // Catch: java.lang.Throwable -> L12f
            if (r3 == 0) goto L125
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L12f
            if (r2 != 0) goto L125
            d51 r2 = r0.b     // Catch: java.lang.Throwable -> L12f
            o41 r4 = r0.a     // Catch: java.lang.Throwable -> L12f
            m5 r6 = new m5     // Catch: java.lang.Throwable -> L12f
            r7 = 3
            r6.<init>(r0, r3, r5, r7)     // Catch: java.lang.Throwable -> L12f
            r2.getClass()     // Catch: java.lang.Throwable -> L12f
            r4.getClass()     // Catch: java.lang.Throwable -> L12f
            a71 r0 = defpackage.a71.UNDISPATCHED     // Catch: java.lang.Throwable -> L12f
            l5 r3 = new l5     // Catch: java.lang.Throwable -> L12f
            r7 = 21
            r3.<init>(r2, r6, r5, r7)     // Catch: java.lang.Throwable -> L12f
            r2 = 1
            defpackage.hv.L(r4, r5, r0, r3, r2)     // Catch: java.lang.Throwable -> L12f
        L125:
            monitor-exit(r1)
            w61 r8 = r8.i0
            defpackage.g04.x(r8, r5)
            android.os.Trace.endSection()
            return
        L12f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        L132:
            monitor-exit(r3)
            throw r8
        L134:
            return
    }

    public final java.lang.Object h(defpackage.s41 r8) {
            r7 = this;
            boolean r0 = r8 instanceof defpackage.rf0
            if (r0 == 0) goto L13
            r0 = r8
            rf0 r0 = (defpackage.rf0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            rf0 r0 = new rf0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r8)
            goto L3c
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.oi2.Y(r8)
            r0.Y = r3
            jt2 r8 = r7.h0
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L3c
            return r1
        L3c:
            r1 = r8
            jb4 r1 = (defpackage.jb4) r1
            vf0 r0 = new vf0
            tf0 r5 = r7.f0
            uf0 r6 = r7.g0
            gt2 r2 = r7.A
            t41 r3 = r7.j0
            km2 r4 = r7.Z
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final void k(int r7, android.view.Surface r8) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = defpackage.kr6.a(r7)
            r0.append(r1)
            java.lang.String r1 = "#setSurface"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)
            if (r8 == 0) goto L3e
            boolean r0 = r8.isValid()
            if (r0 != 0) goto L3e
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r2 = "#setSurface: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = " is invalid"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
        L3e:
            rv6 r6 = r6.R
            java.lang.String r0 = "Surface ("
            java.lang.String r1 = "Removed surface for "
            java.lang.String r2 = "Configured "
            java.lang.String r3 = "Refusing to configure "
            java.util.Map r4 = r6.R
            java.util.Set r4 = r4.keySet()
            kr6 r5 = new kr6
            r5.<init>(r7)
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L19d
            java.lang.Object r4 = r6.X
            monitor-enter(r4)
            boolean r5 = r6.e0     // Catch: java.lang.Throwable -> L85
            if (r5 == 0) goto L8b
            if (r8 == 0) goto L88
            java.lang.String r6 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = defpackage.kr6.a(r7)     // Catch: java.lang.Throwable -> L85
            r0.append(r7)     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = " with "
            r0.append(r7)     // Catch: java.lang.Throwable -> L85
            r0.append(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = " after close!"
            r0.append(r7)     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L85
            android.util.Log.w(r6, r7)     // Catch: java.lang.Throwable -> L85
            goto L88
        L85:
            r6 = move-exception
            goto L19b
        L88:
            monitor-exit(r4)
            goto L197
        L8b:
            java.lang.String r3 = "CXCP"
            if (r8 == 0) goto La8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = defpackage.kr6.a(r7)     // Catch: java.lang.Throwable -> L85
            r1.append(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = " with "
            r1.append(r2)     // Catch: java.lang.Throwable -> L85
            r1.append(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L85
            goto Lb8
        La8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = defpackage.kr6.a(r7)     // Catch: java.lang.Throwable -> L85
            r2.append(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L85
        Lb8:
            android.util.Log.i(r3, r1)     // Catch: java.lang.Throwable -> L85
            java.util.LinkedHashMap r1 = r6.Y
            if (r8 != 0) goto Ld9
            kr6 r8 = new kr6     // Catch: java.lang.Throwable -> L85
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r7 = r1.remove(r8)     // Catch: java.lang.Throwable -> L85
            android.view.Surface r7 = (android.view.Surface) r7     // Catch: java.lang.Throwable -> L85
            boolean r8 = r6.d0     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L133
            if (r7 == 0) goto L133
            java.util.LinkedHashMap r8 = r6.Z     // Catch: java.lang.Throwable -> L85
            java.lang.Object r7 = r8.remove(r7)     // Catch: java.lang.Throwable -> L85
            java.lang.AutoCloseable r7 = (java.lang.AutoCloseable) r7     // Catch: java.lang.Throwable -> L85
            goto L134
        Ld9:
            kr6 r2 = new kr6     // Catch: java.lang.Throwable -> L85
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L85
            android.view.Surface r1 = (android.view.Surface) r1     // Catch: java.lang.Throwable -> L85
            java.util.LinkedHashMap r2 = r6.Y     // Catch: java.lang.Throwable -> L85
            kr6 r3 = new kr6     // Catch: java.lang.Throwable -> L85
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L85
            r2.put(r3, r8)     // Catch: java.lang.Throwable -> L85
            boolean r7 = r6.d0     // Catch: java.lang.Throwable -> L85
            if (r7 == 0) goto L133
            boolean r7 = defpackage.nb3.k(r1, r8)     // Catch: java.lang.Throwable -> L85
            if (r7 != 0) goto L133
            java.util.LinkedHashMap r7 = r6.Z     // Catch: java.lang.Throwable -> L85
            boolean r7 = r7.containsKey(r8)     // Catch: java.lang.Throwable -> L85
            if (r7 != 0) goto L118
            java.util.LinkedHashMap r7 = r6.Z     // Catch: java.lang.Throwable -> L85
            java.util.Map r7 = defpackage.ge7.n(r7)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r7 = r7.remove(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.AutoCloseable r7 = (java.lang.AutoCloseable) r7     // Catch: java.lang.Throwable -> L85
            oi0 r0 = r6.L     // Catch: java.lang.Throwable -> L85
            ni0 r0 = r0.a(r8)     // Catch: java.lang.Throwable -> L85
            java.util.LinkedHashMap r1 = r6.Z     // Catch: java.lang.Throwable -> L85
            r1.put(r8, r0)     // Catch: java.lang.Throwable -> L85
            goto L134
        L118:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L85
            r6.append(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = ") is already in use!"
            r6.append(r7)     // Catch: java.lang.Throwable -> L85
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L85
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L85
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L85
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L85
            throw r7     // Catch: java.lang.Throwable -> L85
        L133:
            r7 = 0
        L134:
            monitor-exit(r4)
            r6.e()
            if (r7 == 0) goto L197
            boolean r6 = r7 instanceof java.lang.AutoCloseable
            if (r6 == 0) goto L142
            r7.close()
            goto L197
        L142:
            boolean r6 = r7 instanceof java.util.concurrent.ExecutorService
            if (r6 == 0) goto L175
            java.util.concurrent.ExecutorService r7 = (java.util.concurrent.ExecutorService) r7
            java.util.concurrent.ForkJoinPool r6 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r7 != r6) goto L14f
            goto L197
        L14f:
            boolean r6 = r7.isTerminated()
            if (r6 != 0) goto L197
            r7.shutdown()
            r8 = 0
        L159:
            if (r6 != 0) goto L16b
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L164
            r1 = 1
            boolean r6 = r7.awaitTermination(r1, r0)     // Catch: java.lang.InterruptedException -> L164
            goto L159
        L164:
            if (r8 != 0) goto L159
            r7.shutdownNow()
            r8 = 1
            goto L159
        L16b:
            if (r8 == 0) goto L197
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
            goto L197
        L175:
            boolean r6 = r7 instanceof android.content.res.TypedArray
            if (r6 == 0) goto L17f
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            r7.recycle()
            goto L197
        L17f:
            boolean r6 = r7 instanceof android.media.MediaMetadataRetriever
            if (r6 == 0) goto L189
            android.media.MediaMetadataRetriever r7 = (android.media.MediaMetadataRetriever) r7
            r7.release()
            goto L197
        L189:
            boolean r6 = r7 instanceof android.media.MediaDrm
            if (r6 == 0) goto L193
            android.media.MediaDrm r7 = (android.media.MediaDrm) r7
            r7.release()
            goto L197
        L193:
            defpackage.u34.t()
            return
        L197:
            android.os.Trace.endSection()
            return
        L19b:
            monitor-exit(r4)
            throw r6
        L19d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot configure surface for "
            r8.<init>(r0)
            java.lang.String r0 = defpackage.kr6.a(r7)
            r8.append(r0)
            java.lang.String r0 = ", it is permanently assigned to "
            java.util.Map r6 = r6.R
            kr6 r1 = new kr6
            r1.<init>(r7)
            java.lang.Object r6 = r6.get(r1)
            defpackage.i.k(r8, r0, r6)
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            qf0 r0 = r0.e0
            java.lang.String r0 = r0.a
            return r0
    }
}
