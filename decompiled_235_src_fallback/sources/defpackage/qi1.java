package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qi1  reason: default package */
/* loaded from: classes.dex */
public final class qi1 {
    public final /* synthetic */ int a;
    public boolean b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public java.lang.Object i;

    public qi1(android.content.res.AssetManager r1, java.util.concurrent.Executor r2, defpackage.t35 r3, java.lang.String r4, java.io.File r5) {
            r0 = this;
            r1 = 0
            r0.a = r1
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.h = r4
            r0.g = r5
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L19
            byte[] r1 = defpackage.f04.x
            goto L29
        L19:
            switch(r1) {
                case 24: goto L27;
                case 25: goto L27;
                case 26: goto L24;
                case 27: goto L21;
                case 28: goto L1e;
                case 29: goto L1e;
                case 30: goto L1e;
                default: goto L1c;
            }
        L1c:
            r1 = 0
            goto L29
        L1e:
            byte[] r1 = defpackage.f04.y
            goto L29
        L21:
            byte[] r1 = defpackage.f04.z
            goto L29
        L24:
            byte[] r1 = defpackage.f04.A
            goto L29
        L27:
            byte[] r1 = defpackage.f04.B
        L29:
            r0.e = r1
            return
    }

    public qi1(java.util.ArrayList r13, java.util.List r14) {
            r12 = this;
            r0 = 1
            r12.a = r0
            r14.getClass()
            android.util.Range r1 = defpackage.yy.h
            r1.getClass()
            r12.<init>()
            r12.c = r14
            r12.d = r1
            du1 r14 = defpackage.du1.A
            r12.e = r14
            yt1 r14 = defpackage.yt1.A
            r12.f = r14
            java.util.Set r13 = defpackage.gt0.o1(r13)
            java.util.List r13 = defpackage.gt0.k1(r13)
            r12.g = r13
            hk0 r14 = new hk0
            r2 = 5
            r14.<init>(r2)
            r12.h = r14
            ov2 r14 = defpackage.u24.x()
            r14.getClass()
            r12.i = r14
            boolean r14 = r1.equals(r1)
            r1 = 0
            if (r14 == 0) goto L3d
            goto L5e
        L3d:
            java.util.Iterator r13 = r13.iterator()
        L41:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L5e
            java.lang.Object r14 = r13.next()
            di7 r14 = (defpackage.di7) r14
            zi7 r14 = r14.f
            xx r3 = defpackage.zi7.N
            boolean r14 = r14.i(r3)
            if (r14 != 0) goto L58
            goto L41
        L58:
            java.lang.String r12 = "Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig."
            defpackage.i.h(r12)
            throw r1
        L5e:
            java.lang.Object r13 = r12.f
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r12.e
            java.util.Set r14 = (java.util.Set) r14
            boolean r3 = r14.isEmpty()
            if (r3 == 0) goto L74
            boolean r3 = r13.isEmpty()
            if (r3 == 0) goto L74
            goto L27f
        L74:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.ht0.v0(r14, r4)
            r3.<init>(r4)
            java.util.Iterator r4 = r14.iterator()
        L85:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L99
            java.lang.Object r5 = r4.next()
            qu2 r5 = (defpackage.qu2) r5
            da2 r5 = r5.a()
            r3.add(r5)
            goto L85
        L99:
            java.util.Set r3 = defpackage.gt0.o1(r3)
            java.util.List r3 = defpackage.gt0.k1(r3)
            java.util.Iterator r3 = r3.iterator()
        La5:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lde
            java.lang.Object r4 = r3.next()
            da2 r4 = (defpackage.da2) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r14.iterator()
        Lba:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Ld1
            java.lang.Object r7 = r6.next()
            r8 = r7
            qu2 r8 = (defpackage.qu2) r8
            da2 r8 = r8.a()
            if (r8 != r4) goto Lba
            r5.add(r7)
            goto Lba
        Ld1:
            int r4 = r5.size()
            if (r4 > r0) goto Ld8
            goto La5
        Ld8:
            java.lang.String r12 = "requiredFeatures has conflicting feature values: "
            defpackage.u34.w(r5, r12)
            throw r1
        Lde:
            r13.getClass()
            java.util.Set r3 = defpackage.gt0.o1(r13)
            java.util.List r3 = defpackage.gt0.k1(r3)
            int r3 = r3.size()
            int r4 = r13.size()
            if (r3 != r4) goto L288
            java.util.LinkedHashSet r13 = defpackage.gt0.M0(r14, r13)
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L282
            java.lang.Object r13 = r12.g
            java.util.List r13 = (java.util.List) r13
            java.util.Iterator r13 = r13.iterator()
        L105:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L27f
            java.lang.Object r14 = r13.next()
            di7 r14 = (defpackage.di7) r14
            mj7 r3 = defpackage.oj7.Companion
            r3.getClass()
            oj7 r3 = defpackage.mj7.a(r14)
            oj7 r4 = defpackage.oj7.UNDEFINED
            if (r3 == r4) goto L279
            boolean r3 = r14 instanceof defpackage.p25
            if (r3 == 0) goto L125
            java.lang.String r3 = "Preview"
            goto L13e
        L125:
            boolean r3 = r14 instanceof defpackage.d23
            if (r3 == 0) goto L12c
            java.lang.String r3 = "ImageCapture"
            goto L13e
        L12c:
            boolean r3 = r14 instanceof defpackage.r13
            if (r3 == 0) goto L133
            java.lang.String r3 = "ImageAnalysis"
            goto L13e
        L133:
            boolean r3 = defpackage.ej2.L(r14)
            if (r3 == 0) goto L13c
            java.lang.String r3 = "VideoCapture"
            goto L13e
        L13c:
            java.lang.String r3 = "UseCase"
        L13e:
            t52 r4 = defpackage.da2.getEntries()
            java.util.Iterator r4 = r4.iterator()
        L146:
            boolean r5 = r4.hasNext()
            r6 = 4
            r7 = 3
            r8 = 2
            if (r5 == 0) goto L1b8
            java.lang.Object r5 = r4.next()
            r9 = r5
            da2 r9 = (defpackage.da2) r9
            mj7 r10 = defpackage.oj7.Companion
            r10.getClass()
            int[] r10 = defpackage.lj7.b
            int r9 = r9.ordinal()
            r9 = r10[r9]
            if (r9 == r0) goto L1ad
            if (r9 == r8) goto L1a4
            if (r9 == r7) goto L18b
            if (r9 == r6) goto L182
            if (r9 != r2) goto L17e
            zi7 r9 = r14.f
            xx r10 = defpackage.zi7.W
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            java.lang.Object r9 = r9.b(r10, r11)
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            boolean r9 = defpackage.nb3.k(r9, r10)
            goto L1b5
        L17e:
            defpackage.i.d()
            throw r1
        L182:
            zi7 r9 = r14.f
            xx r10 = defpackage.e23.X
            boolean r9 = r9.i(r10)
            goto L1b5
        L18b:
            zi7 r9 = r14.f
            xx r10 = defpackage.zi7.U
            boolean r9 = r9.i(r10)
            if (r9 != 0) goto L1a2
            zi7 r9 = r14.f
            xx r10 = defpackage.zi7.V
            boolean r9 = r9.i(r10)
            if (r9 == 0) goto L1a0
            goto L1a2
        L1a0:
            r9 = 0
            goto L1b5
        L1a2:
            r9 = r0
            goto L1b5
        L1a4:
            zi7 r9 = r14.f
            xx r10 = defpackage.zi7.N
            boolean r9 = r9.i(r10)
            goto L1b5
        L1ad:
            zi7 r9 = r14.f
            xx r10 = defpackage.j23.n
            boolean r9 = r9.i(r10)
        L1b5:
            if (r9 == 0) goto L146
            goto L1b9
        L1b8:
            r5 = r1
        L1b9:
            da2 r5 = (defpackage.da2) r5
            if (r5 != 0) goto L1bf
            goto L105
        L1bf:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "A "
            r12.<init>(r13)
            java.lang.String r13 = r5.name()
            r12.append(r13)
            java.lang.String r13 = " value is set to "
            r12.append(r13)
            r12.append(r3)
            java.lang.String r13 = " despite using feature groups. Do not use APIs like "
            r12.append(r13)
            int[] r13 = defpackage.qc6.a
            int r4 = r5.ordinal()
            r4 = r13[r4]
            if (r4 == r0) goto L215
            if (r4 == r8) goto L20e
            if (r4 == r7) goto L1fa
            if (r4 == r6) goto L1f3
            if (r4 != r2) goto L1ef
            java.lang.String r14 = "Recorder.Builder.setQualitySelector"
            goto L21b
        L1ef:
            defpackage.i.d()
            throw r1
        L1f3:
            java.lang.String r14 = ".Builder.setOutputFormat"
            java.lang.String r14 = r3.concat(r14)
            goto L21b
        L1fa:
            boolean r14 = defpackage.ej2.L(r14)
            if (r14 == 0) goto L207
            java.lang.String r14 = ".Builder.setVideoStabilizationEnabled"
            java.lang.String r14 = r3.concat(r14)
            goto L21b
        L207:
            java.lang.String r14 = ".Builder.setPreviewStabilizationEnabled"
            java.lang.String r14 = r3.concat(r14)
            goto L21b
        L20e:
            java.lang.String r14 = ".Builder.setTargetFrameRateRange"
            java.lang.String r14 = r3.concat(r14)
            goto L21b
        L215:
            java.lang.String r14 = ".Builder.setDynamicRange"
            java.lang.String r14 = r3.concat(r14)
        L21b:
            r12.append(r14)
            java.lang.String r14 = " while using feature groups. If, for example, "
            r12.append(r14)
            int r14 = r5.ordinal()
            r14 = r13[r14]
            if (r14 == r0) goto L243
            if (r14 == r8) goto L240
            if (r14 == r7) goto L23d
            if (r14 == r6) goto L23a
            if (r14 != r2) goto L236
            java.lang.String r14 = "UHD recording quality"
            goto L245
        L236:
            defpackage.i.d()
            throw r1
        L23a:
            java.lang.String r14 = "JPEG_R output format"
            goto L245
        L23d:
            java.lang.String r14 = "stabilization"
            goto L245
        L240:
            java.lang.String r14 = "60 FPS"
            goto L245
        L243:
            java.lang.String r14 = "HDR"
        L245:
            r12.append(r14)
            java.lang.String r14 = " is required, instead set "
            r12.append(r14)
            int r14 = r5.ordinal()
            r13 = r13[r14]
            if (r13 == r0) goto L26d
            if (r13 == r8) goto L26a
            if (r13 == r7) goto L267
            if (r13 == r6) goto L264
            if (r13 == r2) goto L261
            defpackage.i.d()
            throw r1
        L261:
            java.lang.String r13 = "GroupableFeatures.UHD_RECORDING"
            goto L26f
        L264:
            java.lang.String r13 = "GroupableFeature.IMAGE_ULTRA_HDR"
            goto L26f
        L267:
            java.lang.String r13 = "GroupableFeature.PREVIEW_STABILIZATION"
            goto L26f
        L26a:
            java.lang.String r13 = "GroupableFeature.FPS_60"
            goto L26f
        L26d:
            java.lang.String r13 = "GroupableFeature.HDR_HLG10"
        L26f:
            java.lang.String r14 = " as either a required or preferred feature."
            java.lang.String r12 = defpackage.i61.n(r12, r13, r14)
            defpackage.i.f(r12)
            throw r1
        L279:
            java.lang.String r12 = " is not supported with feature group"
            defpackage.e41.f(r14, r12)
            throw r1
        L27f:
            r12.b = r0
            return
        L282:
            java.lang.String r12 = "requiredFeatures and preferredFeatures have duplicate values: "
            defpackage.u34.w(r13, r12)
            throw r1
        L288:
            java.lang.String r12 = "Duplicate values in preferredFeatures("
            r14 = 41
            defpackage.e41.j(r12, r14, r13)
            throw r1
    }

    public java.io.FileInputStream a(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r2)     // Catch: java.io.FileNotFoundException -> L9
            java.io.FileInputStream r0 = r1.createInputStream()     // Catch: java.io.FileNotFoundException -> L9
            return r0
        L9:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            if (r1 == 0) goto L1f
            java.lang.String r2 = "compressed"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L1f
            java.lang.Object r0 = r0.d
            t35 r0 = (defpackage.t35) r0
            r0.h()
        L1f:
            r0 = 0
            return r0
    }

    public void b(int r4, java.io.Serializable r5) {
            r3 = this;
            java.lang.Object r0 = r3.c
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            xd0 r1 = new xd0
            r2 = 3
            r1.<init>(r3, r4, r2, r5)
            r0.execute(r1)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SessionConfig@"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " {useCases="
            r0.append(r1)
            java.lang.Object r1 = r2.g
            java.util.List r1 = (java.util.List) r1
            r0.append(r1)
            java.lang.String r1 = ", frameRateRange="
            r0.append(r1)
            java.lang.Object r1 = r2.d
            android.util.Range r1 = (android.util.Range) r1
            r0.append(r1)
            java.lang.String r1 = ", requiredFeatureGroup="
            r0.append(r1)
            java.lang.Object r1 = r2.e
            java.util.Set r1 = (java.util.Set) r1
            r0.append(r1)
            java.lang.String r1 = ", preferredFeatureGroup="
            r0.append(r1)
            java.lang.Object r1 = r2.f
            java.util.List r1 = (java.util.List) r1
            r0.append(r1)
            java.lang.String r1 = ", effects="
            r0.append(r1)
            java.lang.Object r2 = r2.c
            java.util.List r2 = (java.util.List) r2
            r0.append(r2)
            java.lang.String r2 = ", viewPort=null}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
