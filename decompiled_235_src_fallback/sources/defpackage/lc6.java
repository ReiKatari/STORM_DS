package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lc6  reason: default package */
/* loaded from: classes.dex */
public final class lc6 extends defpackage.kc6 {
    public static defpackage.lc6 d(defpackage.zi7 r11, android.util.Size r12) {
            xx r0 = defpackage.zi7.I
            r1 = 0
            java.lang.Object r0 = r11.b(r0, r1)
            wi0 r0 = (defpackage.wi0) r0
            if (r0 == 0) goto L19f
            lc6 r0 = new lc6
            r0.<init>()
            r12.getClass()
            xx r2 = defpackage.zi7.G
            java.lang.Object r2 = r11.b(r2, r1)
            rc6 r2 = (defpackage.rc6) r2
            go4 r3 = defpackage.go4.L
            r3.getClass()
            rc6 r4 = defpackage.rc6.a()
            ek0 r4 = r4.g
            int r4 = r4.c
            java.util.ArrayList r5 = r0.d
            java.util.ArrayList r6 = r0.c
            dk0 r7 = r0.b
            if (r2 == 0) goto L75
            ek0 r3 = r2.g
            int r4 = r3.c
            java.util.List r8 = r2.c
            java.util.Iterator r8 = r8.iterator()
        L3a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L51
            java.lang.Object r9 = r8.next()
            android.hardware.camera2.CameraDevice$StateCallback r9 = (android.hardware.camera2.CameraDevice.StateCallback) r9
            boolean r10 = r6.contains(r9)
            if (r10 == 0) goto L4d
            goto L3a
        L4d:
            r6.add(r9)
            goto L3a
        L51:
            java.util.List r2 = r2.d
            java.util.Iterator r2 = r2.iterator()
        L57:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L6e
            java.lang.Object r8 = r2.next()
            android.hardware.camera2.CameraCaptureSession$StateCallback r8 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r8
            boolean r9 = r5.contains(r8)
            if (r9 == 0) goto L6a
            goto L57
        L6a:
            r5.add(r8)
            goto L57
        L6e:
            java.util.List r2 = r3.d
            r7.c(r2)
            go4 r3 = r3.b
        L75:
            r7.getClass()
            da4 r2 = defpackage.da4.k(r3)
            r7.X = r2
            boolean r2 = r11 instanceof defpackage.q25
            r3 = 2
            if (r2 == 0) goto Lca
            android.util.Rational r2 = defpackage.r25.a
            java.lang.Class<androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk> r2 = androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk.class
            y65 r8 = defpackage.si1.a()
            u65 r2 = r8.b(r2)
            androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk r2 = (androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk) r2
            if (r2 != 0) goto L94
            goto Lca
        L94:
            android.util.Rational r2 = defpackage.r25.a
            android.util.Rational r8 = new android.util.Rational
            int r9 = r12.getWidth()
            int r12 = r12.getHeight()
            r8.<init>(r9, r12)
            boolean r12 = defpackage.nb3.k(r2, r8)
            if (r12 == 0) goto Laa
            goto Lca
        Laa:
            da4 r12 = defpackage.da4.d()
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.TONEMAP_MODE
            r2.getClass()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            xx r2 = defpackage.nw7.T(r2)
            r12.m(r2, r8)
            kd0 r2 = new kd0
            go4 r12 = defpackage.go4.a(r12)
            r2.<init>(r12)
            r7.e(r2)
        Lca:
            kd0 r12 = new kd0
            r12.<init>(r11)
            xx r12 = defpackage.kd0.Y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r12 = r11.b(r12, r2)
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r7.L = r12
            xx r12 = defpackage.kd0.Z
            java.lang.Object r12 = r11.b(r12, r1)
            android.hardware.camera2.CameraDevice$StateCallback r12 = (android.hardware.camera2.CameraDevice.StateCallback) r12
            if (r12 == 0) goto Lf8
            boolean r2 = r6.contains(r12)
            if (r2 == 0) goto Lf5
            goto Lf8
        Lf5:
            r6.add(r12)
        Lf8:
            xx r12 = defpackage.kd0.d0
            java.lang.Object r12 = r11.b(r12, r1)
            android.hardware.camera2.CameraCaptureSession$StateCallback r12 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r12
            if (r12 == 0) goto L10c
            boolean r2 = r5.contains(r12)
            if (r2 == 0) goto L109
            goto L10c
        L109:
            r5.add(r12)
        L10c:
            xx r12 = defpackage.kd0.e0
            java.lang.Object r12 = r11.b(r12, r1)
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r12 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r12
            if (r12 == 0) goto L129
            ti0 r2 = new ti0
            r2.<init>(r12)
            r7.d(r2)
            java.util.ArrayList r12 = r0.e
            boolean r4 = r12.contains(r2)
            if (r4 != 0) goto L129
            r12.add(r2)
        L129:
            int r12 = r11.E()
            if (r12 == 0) goto L141
            r7.getClass()
            if (r12 == 0) goto L141
            xx r2 = defpackage.zi7.U
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r4 = r7.X
            da4 r4 = (defpackage.da4) r4
            r4.m(r2, r12)
        L141:
            int r12 = r11.y()
            if (r12 == 0) goto L159
            r7.getClass()
            if (r12 == 0) goto L159
            xx r2 = defpackage.zi7.V
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r4 = r7.X
            da4 r4 = (defpackage.da4) r4
            r4.m(r2, r12)
        L159:
            da4 r12 = defpackage.da4.d()
            xx r2 = defpackage.kd0.h0
            java.lang.Object r4 = r11.b(r2, r1)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L16a
            r12.m(r2, r4)
        L16a:
            xx r2 = defpackage.kd0.f0
            java.lang.Object r1 = r11.b(r2, r1)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L17f
            long r4 = r1.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r12.m(r2, r1)
        L17f:
            r7.e(r12)
            jd0 r12 = new jd0
            r12.<init>(r3)
            pk0 r1 = new pk0
            r2 = 0
            r1.<init>(r2, r12, r11)
            r11.h(r1)
            os0 r11 = new os0
            da4 r12 = r12.B
            go4 r12 = defpackage.go4.a(r12)
            r11.<init>(r12)
            r7.e(r11)
            return r0
        L19f:
            java.lang.String r12 = r11.toString()
            xx r0 = defpackage.kz6.C
            java.lang.Object r11 = r11.b(r0, r12)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "Implementation is missing option unpacker for "
            defpackage.e41.z(r11, r12)
            return r1
    }

    public final void a(defpackage.yy0 r1) {
            r0 = this;
            dk0 r0 = r0.b
            r0.e(r1)
            return
    }

    public final void b(defpackage.ig1 r2, defpackage.yq1 r3, int r4) {
            r1 = this;
            s9 r0 = defpackage.wy.a(r2)
            if (r3 == 0) goto L21
            r0.e = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0.c = r3
            wy r3 = r0.k()
            java.util.LinkedHashSet r4 = r1.a
            r4.add(r3)
            dk0 r1 = r1.b
            java.lang.Object r1 = r1.R
            java.util.HashSet r1 = (java.util.HashSet) r1
            r1.add(r2)
            return
        L21:
            java.lang.String r1 = "Null dynamicRange"
            defpackage.u34.x(r1)
            return
    }

    public final defpackage.rc6 c() {
            r10 = this;
            rc6 r0 = new rc6
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.LinkedHashSet r2 = r10.a
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList r3 = r10.c
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.ArrayList r4 = r10.d
            r3.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.ArrayList r5 = r10.e
            r4.<init>(r5)
            dk0 r5 = r10.b
            ek0 r5 = r5.i()
            mc6 r6 = r10.f
            android.hardware.camera2.params.InputConfiguration r7 = r10.g
            int r8 = r10.h
            wy r9 = r10.i
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }
}
