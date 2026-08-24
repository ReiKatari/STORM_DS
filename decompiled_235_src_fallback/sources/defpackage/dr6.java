package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dr6  reason: default package */
/* loaded from: classes.dex */
public final class dr6 {
    public final defpackage.lp4 a;
    public final java.util.LinkedHashMap b;
    public final defpackage.s35 c;

    public dr6(android.hardware.camera2.params.StreamConfigurationMap r2, defpackage.lp4 r3) {
            r1 = this;
            r3.getClass()
            r1.<init>()
            r1.a = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r1.b = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r3 < r0) goto L25
            er6 r3 = new er6
            r3.<init>(r2)
            goto L2a
        L25:
            s35 r3 = new s35
            r3.<init>(r2)
        L2a:
            r1.c = r3
            return
    }

    public final android.util.Size[] a(int r30) {
            r29 = this;
            r1 = r29
            r2 = r30
            java.lang.String r3 = "StreamConfigurationMapCompat"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.util.LinkedHashMap r4 = r1.b
            boolean r0 = r4.containsKey(r0)
            r5 = 0
            if (r0 == 0) goto L27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r4.get(r0)
            android.util.Size[] r0 = (android.util.Size[]) r0
            if (r0 == 0) goto L26
            java.lang.Object r0 = r0.clone()
            android.util.Size[] r0 = (android.util.Size[]) r0
            return r0
        L26:
            return r5
        L27:
            s35 r0 = r1.c     // Catch: java.lang.Throwable -> L2e
            android.util.Size[] r5 = r0.y(r2)     // Catch: java.lang.Throwable -> L2e
            goto L40
        L2e:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to get output sizes for "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            defpackage.kj2.g0(r3, r6, r0)
        L40:
            if (r5 == 0) goto L470
            int r0 = r5.length
            if (r0 != 0) goto L47
            goto L470
        L47:
            lp4 r0 = r1.a
            r0.getClass()
            r5.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            ku r3 = new ku
            r6 = 0
            r3.<init>(r5, r6)
            r1.<init>(r3)
            androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk r3 = r0.c
            r5 = 720(0x2d0, float:1.009E-42)
            r7 = 1080(0x438, float:1.513E-42)
            r8 = 1440(0x5a0, float:2.018E-42)
            r9 = 34
            if (r3 != 0) goto L67
            goto Lac
        L67:
            if (r2 != r9) goto L9c
            java.lang.String r3 = android.os.Build.MANUFACTURER
            r3.getClass()
            java.lang.String r10 = "Motorola"
            boolean r3 = r3.equalsIgnoreCase(r10)
            if (r3 != 0) goto L81
            java.lang.String r3 = android.os.Build.BRAND
            r3.getClass()
            boolean r3 = r3.equalsIgnoreCase(r10)
            if (r3 == 0) goto L9c
        L81:
            java.lang.String r3 = "moto e5 play"
            java.lang.String r10 = android.os.Build.MODEL
            boolean r3 = r3.equalsIgnoreCase(r10)
            if (r3 == 0) goto L9c
            android.util.Size r3 = new android.util.Size
            r3.<init>(r8, r7)
            android.util.Size r10 = new android.util.Size
            r11 = 960(0x3c0, float:1.345E-42)
            r10.<init>(r11, r5)
            android.util.Size[] r3 = new android.util.Size[]{r3, r10}
            goto L9e
        L9c:
            android.util.Size[] r3 = new android.util.Size[r6]
        L9e:
            int r10 = r3.length
            if (r10 != 0) goto La2
            goto Lac
        La2:
            java.util.List r3 = java.util.Arrays.asList(r3)
            r3.getClass()
            r1.addAll(r3)
        Lac:
            lg0 r3 = r0.a
            if (r3 == 0) goto L44c
            androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk r0 = r0.b
            if (r0 != 0) goto Lb6
            goto L44c
        Lb6:
            qc0 r3 = (defpackage.qc0) r3
            java.lang.String r0 = r3.A
            r0.getClass()
            boolean r3 = defpackage.nb3.E()
            r10 = 3120(0xc30, float:4.372E-42)
            r11 = 4160(0x1040, float:5.83E-42)
            r12 = 3000(0xbb8, float:4.204E-42)
            r13 = 4000(0xfa0, float:5.605E-42)
            r14 = 256(0x100, float:3.59E-43)
            java.lang.String r15 = "0"
            yt1 r16 = defpackage.yt1.A
            if (r3 == 0) goto Lef
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto Leb
            if (r2 != r14) goto Leb
            android.util.Size r0 = new android.util.Size
            r0.<init>(r11, r10)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r13, r12)
            android.util.Size[] r0 = new android.util.Size[]{r0, r3}
            java.util.List r16 = defpackage.hf.c0(r0)
        Leb:
            r0 = r16
            goto L443
        Lef:
            boolean r3 = defpackage.nb3.F()
            if (r3 == 0) goto L110
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto Leb
            if (r2 != r14) goto Leb
            android.util.Size r0 = new android.util.Size
            r0.<init>(r11, r10)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r13, r12)
            android.util.Size[] r0 = new android.util.Size[]{r0, r3}
            java.util.List r16 = defpackage.hf.c0(r0)
            goto Leb
        L110:
            boolean r3 = defpackage.nb3.C()
            r10 = 35
            if (r3 == 0) goto L138
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto Leb
            if (r2 == r9) goto L123
            if (r2 == r10) goto L123
            goto Leb
        L123:
            android.util.Size r0 = new android.util.Size
            r0.<init>(r5, r5)
            android.util.Size r3 = new android.util.Size
            r5 = 400(0x190, float:5.6E-43)
            r3.<init>(r5, r5)
            android.util.Size[] r0 = new android.util.Size[]{r0, r3}
            java.util.List r16 = defpackage.hf.c0(r0)
            goto Leb
        L138:
            boolean r3 = defpackage.nb3.J()
            r5 = 3088(0xc10, float:4.327E-42)
            r12 = 4128(0x1020, float:5.785E-42)
            r13 = 1836(0x72c, float:2.573E-42)
            r11 = 2322(0x912, float:3.254E-42)
            java.lang.String r7 = "1"
            r8 = 3264(0xcc0, float:4.574E-42)
            r6 = 2448(0x990, float:3.43E-42)
            r14 = 1920(0x780, float:2.69E-42)
            if (r3 == 0) goto L229
            boolean r3 = r0.equals(r15)
            if (r3 == 0) goto L1da
            if (r2 == r9) goto L19b
            if (r2 != r10) goto Leb
            android.util.Size r0 = new android.util.Size
            r0.<init>(r12, r11)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r5, r5)
            android.util.Size r5 = new android.util.Size
            r5.<init>(r8, r6)
            android.util.Size r6 = new android.util.Size
            r6.<init>(r8, r13)
            android.util.Size r7 = new android.util.Size
            r8 = 2048(0x800, float:2.87E-42)
            r9 = 1536(0x600, float:2.152E-42)
            r7.<init>(r8, r9)
            android.util.Size r9 = new android.util.Size
            r10 = 1152(0x480, float:1.614E-42)
            r9.<init>(r8, r10)
            android.util.Size r8 = new android.util.Size
            r10 = 1080(0x438, float:1.513E-42)
            r8.<init>(r14, r10)
            r20 = r0
            r21 = r3
            r22 = r5
            r23 = r6
            r24 = r7
            r26 = r8
            r25 = r9
            android.util.Size[] r0 = new android.util.Size[]{r20, r21, r22, r23, r24, r25, r26}
            java.util.List r16 = defpackage.hf.c0(r0)
            goto Leb
        L19b:
            android.util.Size r0 = new android.util.Size
            r3 = 3096(0xc18, float:4.338E-42)
            r0.<init>(r12, r3)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r12, r11)
            android.util.Size r7 = new android.util.Size
            r7.<init>(r5, r5)
            android.util.Size r5 = new android.util.Size
            r5.<init>(r8, r6)
            android.util.Size r9 = new android.util.Size
            r9.<init>(r8, r13)
            android.util.Size r10 = new android.util.Size
            r6 = 1536(0x600, float:2.152E-42)
            r8 = 2048(0x800, float:2.87E-42)
            r10.<init>(r8, r6)
            android.util.Size r11 = new android.util.Size
            r6 = 1152(0x480, float:1.614E-42)
            r11.<init>(r8, r6)
            android.util.Size r12 = new android.util.Size
            r6 = 1080(0x438, float:1.513E-42)
            r12.<init>(r14, r6)
            r6 = r3
            r8 = r5
            r5 = r0
            android.util.Size[] r0 = new android.util.Size[]{r5, r6, r7, r8, r9, r10, r11, r12}
            java.util.List r16 = defpackage.hf.c0(r0)
            goto Leb
        L1da:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Leb
            if (r2 == r9) goto L1e6
            if (r2 == r10) goto L1e6
            goto Leb
        L1e6:
            android.util.Size r0 = new android.util.Size
            r0.<init>(r8, r6)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r8, r13)
            android.util.Size r5 = new android.util.Size
            r5.<init>(r6, r6)
            android.util.Size r6 = new android.util.Size
            r6.<init>(r14, r14)
            android.util.Size r7 = new android.util.Size
            r8 = 2048(0x800, float:2.87E-42)
            r9 = 1536(0x600, float:2.152E-42)
            r7.<init>(r8, r9)
            android.util.Size r9 = new android.util.Size
            r10 = 1152(0x480, float:1.614E-42)
            r9.<init>(r8, r10)
            android.util.Size r8 = new android.util.Size
            r10 = 1080(0x438, float:1.513E-42)
            r8.<init>(r14, r10)
            r20 = r0
            r21 = r3
            r22 = r5
            r23 = r6
            r24 = r7
            r26 = r8
            r25 = r9
            android.util.Size[] r0 = new android.util.Size[]{r20, r21, r22, r23, r24, r25, r26}
            java.util.List r16 = defpackage.hf.c0(r0)
            goto Leb
        L229:
            boolean r3 = defpackage.nb3.I()
            if (r3 == 0) goto L2e9
            boolean r3 = r0.equals(r15)
            if (r3 == 0) goto L299
            if (r2 == r9) goto L25a
            if (r2 != r10) goto Leb
            android.util.Size r0 = new android.util.Size
            r8 = 2048(0x800, float:2.87E-42)
            r9 = 1536(0x600, float:2.152E-42)
            r0.<init>(r8, r9)
            android.util.Size r3 = new android.util.Size
            r10 = 1152(0x480, float:1.614E-42)
            r3.<init>(r8, r10)
            android.util.Size r5 = new android.util.Size
            r10 = 1080(0x438, float:1.513E-42)
            r5.<init>(r14, r10)
            android.util.Size[] r0 = new android.util.Size[]{r0, r3, r5}
            java.util.List r16 = defpackage.hf.c0(r0)
            goto Leb
        L25a:
            android.util.Size r0 = new android.util.Size
            r3 = 3096(0xc18, float:4.338E-42)
            r0.<init>(r12, r3)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r12, r11)
            android.util.Size r7 = new android.util.Size
            r7.<init>(r5, r5)
            android.util.Size r5 = new android.util.Size
            r5.<init>(r8, r6)
            android.util.Size r9 = new android.util.Size
            r9.<init>(r8, r13)
            android.util.Size r10 = new android.util.Size
            r6 = 1536(0x600, float:2.152E-42)
            r8 = 2048(0x800, float:2.87E-42)
            r10.<init>(r8, r6)
            android.util.Size r11 = new android.util.Size
            r6 = 1152(0x480, float:1.614E-42)
            r11.<init>(r8, r6)
            android.util.Size r12 = new android.util.Size
            r6 = 1080(0x438, float:1.513E-42)
            r12.<init>(r14, r6)
            r6 = r3
            r8 = r5
            r5 = r0
            android.util.Size[] r0 = new android.util.Size[]{r5, r6, r7, r8, r9, r10, r11, r12}
            java.util.List r16 = defpackage.hf.c0(r0)
            goto Leb
        L299:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Leb
            if (r2 == r9) goto L2a5
            if (r2 == r10) goto L2a5
            goto Leb
        L2a5:
            android.util.Size r0 = new android.util.Size
            r3 = 2576(0xa10, float:3.61E-42)
            r5 = 1932(0x78c, float:2.707E-42)
            r0.<init>(r3, r5)
            android.util.Size r3 = new android.util.Size
            r5 = 2560(0xa00, float:3.587E-42)
            r6 = 1440(0x5a0, float:2.018E-42)
            r3.<init>(r5, r6)
            android.util.Size r5 = new android.util.Size
            r5.<init>(r14, r14)
            android.util.Size r6 = new android.util.Size
            r8 = 2048(0x800, float:2.87E-42)
            r9 = 1536(0x600, float:2.152E-42)
            r6.<init>(r8, r9)
            android.util.Size r7 = new android.util.Size
            r10 = 1152(0x480, float:1.614E-42)
            r7.<init>(r8, r10)
            android.util.Size r8 = new android.util.Size
            r10 = 1080(0x438, float:1.513E-42)
            r8.<init>(r14, r10)
            r20 = r0
            r21 = r3
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            android.util.Size[] r0 = new android.util.Size[]{r20, r21, r22, r23, r24, r25}
            java.util.List r16 = defpackage.hf.c0(r0)
            goto Leb
        L2e9:
            boolean r3 = defpackage.nb3.G()
            if (r3 == 0) goto L308
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto Leb
            r0 = 256(0x100, float:3.59E-43)
            if (r2 != r0) goto Leb
            android.util.Size r0 = new android.util.Size
            r3 = 9280(0x2440, float:1.3004E-41)
            r5 = 6944(0x1b20, float:9.73E-42)
            r0.<init>(r3, r5)
            java.util.List r16 = defpackage.hf.b0(r0)
            goto Leb
        L308:
            boolean r3 = defpackage.nb3.H()
            r5 = 3200(0xc80, float:4.484E-42)
            r9 = 2400(0x960, float:3.363E-42)
            if (r3 == 0) goto L35f
            if (r2 != r10) goto Leb
            android.util.Size r0 = new android.util.Size
            r3 = 3840(0xf00, float:5.381E-42)
            r7 = 2160(0x870, float:3.027E-42)
            r0.<init>(r3, r7)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r8, r6)
            android.util.Size r6 = new android.util.Size
            r6.<init>(r5, r9)
            android.util.Size r5 = new android.util.Size
            r7 = 2688(0xa80, float:3.767E-42)
            r8 = 1512(0x5e8, float:2.119E-42)
            r5.<init>(r7, r8)
            android.util.Size r7 = new android.util.Size
            r8 = 1944(0x798, float:2.724E-42)
            r9 = 2592(0xa20, float:3.632E-42)
            r7.<init>(r9, r8)
            android.util.Size r8 = new android.util.Size
            r10 = 1940(0x794, float:2.719E-42)
            r8.<init>(r9, r10)
            android.util.Size r9 = new android.util.Size
            r10 = 1440(0x5a0, float:2.018E-42)
            r9.<init>(r14, r10)
            r17 = r0
            r18 = r3
            r20 = r5
            r19 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            android.util.Size[] r0 = new android.util.Size[]{r17, r18, r19, r20, r21, r22, r23}
            java.util.List r16 = defpackage.hf.c0(r0)
            goto Leb
        L35f:
            boolean r3 = defpackage.nb3.D()
            if (r3 == 0) goto L3ac
            if (r2 != r10) goto Leb
            android.util.Size r0 = new android.util.Size
            r3 = 4032(0xfc0, float:5.65E-42)
            r7 = 3024(0xbd0, float:4.238E-42)
            r0.<init>(r3, r7)
            android.util.Size r3 = new android.util.Size
            r10 = 3000(0xbb8, float:4.204E-42)
            r11 = 4000(0xfa0, float:5.605E-42)
            r3.<init>(r11, r10)
            android.util.Size r10 = new android.util.Size
            r10.<init>(r8, r6)
            android.util.Size r8 = new android.util.Size
            r8.<init>(r5, r9)
            android.util.Size r5 = new android.util.Size
            r5.<init>(r7, r7)
            android.util.Size r7 = new android.util.Size
            r9 = 2976(0xba0, float:4.17E-42)
            r7.<init>(r9, r9)
            android.util.Size r9 = new android.util.Size
            r9.<init>(r6, r6)
            r17 = r0
            r18 = r3
            r21 = r5
            r22 = r7
            r20 = r8
            r23 = r9
            r19 = r10
            android.util.Size[] r0 = new android.util.Size[]{r17, r18, r19, r20, r21, r22, r23}
            java.util.List r16 = defpackage.hf.c0(r0)
            goto Leb
        L3ac:
            boolean r3 = defpackage.nb3.K()
            if (r3 == 0) goto L43a
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Leb
            if (r2 != r10) goto Leb
            android.util.Size r0 = new android.util.Size
            r3 = 1280(0x500, float:1.794E-42)
            r5 = 720(0x2d0, float:1.009E-42)
            r0.<init>(r3, r5)
            android.util.Size r3 = new android.util.Size
            r10 = 1080(0x438, float:1.513E-42)
            r3.<init>(r14, r10)
            android.util.Size r5 = new android.util.Size
            r6 = 2304(0x900, float:3.229E-42)
            r7 = 1296(0x510, float:1.816E-42)
            r5.<init>(r6, r7)
            android.util.Size r6 = new android.util.Size
            r7 = 640(0x280, float:8.97E-43)
            r8 = 360(0x168, float:5.04E-43)
            r6.<init>(r7, r8)
            android.util.Size r7 = new android.util.Size
            r8 = 177(0xb1, float:2.48E-43)
            r10 = 144(0x90, float:2.02E-43)
            r7.<init>(r8, r10)
            android.util.Size r8 = new android.util.Size
            r10 = 2336(0x920, float:3.273E-42)
            r11 = 1080(0x438, float:1.513E-42)
            r8.<init>(r10, r11)
            android.util.Size r10 = new android.util.Size
            r10.<init>(r9, r11)
            android.util.Size r9 = new android.util.Size
            r11 = 824(0x338, float:1.155E-42)
            r9.<init>(r14, r11)
            android.util.Size r11 = new android.util.Size
            r12 = 1088(0x440, float:1.525E-42)
            r11.<init>(r12, r12)
            android.util.Size r12 = new android.util.Size
            r13 = 1728(0x6c0, float:2.421E-42)
            r12.<init>(r13, r13)
            android.util.Size r13 = new android.util.Size
            r14 = 2736(0xab0, float:3.834E-42)
            r13.<init>(r14, r14)
            android.util.Size r14 = new android.util.Size
            r15 = 1824(0x720, float:2.556E-42)
            r17 = r0
            r0 = 712(0x2c8, float:9.98E-43)
            r14.<init>(r15, r0)
            r18 = r3
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r24 = r9
            r23 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r14
            android.util.Size[] r0 = new android.util.Size[]{r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28}
            java.util.List r16 = defpackage.hf.c0(r0)
            goto Leb
        L43a:
            java.lang.String r0 = "ExcludedSupportedSizesQuirk"
            java.lang.String r3 = "Cannot retrieve list of supported sizes to exclude on this device."
            defpackage.kj2.f0(r0, r3)
            goto Leb
        L443:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L44c
            r1.removeAll(r0)
        L44c:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L459
            java.lang.String r0 = "OutputSizesCorrector"
            java.lang.String r3 = "Sizes array becomes empty after excluding problematic output sizes."
            defpackage.kj2.f0(r0, r3)
        L459:
            r0 = 0
            android.util.Size[] r0 = new android.util.Size[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.util.Size[] r0 = (android.util.Size[]) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r4.put(r1, r0)
            java.lang.Object r0 = r0.clone()
            android.util.Size[] r0 = (android.util.Size[]) r0
            return r0
        L470:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Retrieved output sizes array is null or empty for format "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            defpackage.kj2.f0(r3, r0)
            return r5
    }
}
