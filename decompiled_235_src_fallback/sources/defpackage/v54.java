package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v54  reason: default package */
/* loaded from: classes.dex */
public final class v54 extends defpackage.di7 {
    public final defpackage.sg0 q;
    public final defpackage.al1 r;
    public final android.util.Size s;
    public final java.lang.Object t;
    public defpackage.mc6 u;
    public defpackage.o33 v;

    public v54(defpackage.sg0 r10, defpackage.u54 r11, defpackage.al1 r12) {
            r9 = this;
            r10.getClass()
            r12.getClass()
            r9.<init>(r11)
            r9.q = r10
            r9.r = r12
            android.util.Size r11 = defpackage.w54.a
            lg0 r10 = r10.b
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            r0.getClass()
            qc0 r10 = (defpackage.qc0) r10
            java.lang.Object r10 = r10.c(r0)
            android.hardware.camera2.params.StreamConfigurationMap r10 = (android.hardware.camera2.params.StreamConfigurationMap) r10
            r0 = 0
            java.lang.String r1 = "CXCP"
            if (r10 != 0) goto L30
            boolean r10 = defpackage.kj2.G()
            if (r10 == 0) goto L2e
            java.lang.String r10 = "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP."
            android.util.Log.e(r1, r10)
        L2e:
            r10 = r0
            goto L36
        L30:
            r2 = 34
            android.util.Size[] r10 = r10.getOutputSizes(r2)
        L36:
            if (r10 != 0) goto L3a
            goto Ld2
        L3a:
            int r2 = r10.length
            if (r2 != 0) goto L3f
            goto Ld2
        L3f:
            android.util.Size r11 = defpackage.xu6.a
            java.lang.Class<androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk> r11 = androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.class
            y65 r2 = defpackage.si1.a()
            u65 r11 = r2.b(r11)
            androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk r11 = (androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk) r11
            r2 = 0
            if (r11 != 0) goto L52
            r11 = r10
            goto L75
        L52:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r3 = r10.length
            r4 = r2
        L59:
            if (r4 >= r3) goto L6d
            r5 = r10[r4]
            ru0 r6 = defpackage.xu6.b
            android.util.Size r7 = defpackage.xu6.a
            int r6 = r6.compare(r5, r7)
            if (r6 < 0) goto L6a
            r11.add(r5)
        L6a:
            int r4 = r4 + 1
            goto L59
        L6d:
            android.util.Size[] r3 = new android.util.Size[r2]
            java.lang.Object[] r11 = r11.toArray(r3)
            android.util.Size[] r11 = (android.util.Size[]) r11
        L75:
            int r3 = r11.length
            if (r3 != 0) goto L84
            boolean r11 = defpackage.kj2.L()
            if (r11 == 0) goto L85
            java.lang.String r11 = "No supported output size list, fallback to current list"
            android.util.Log.w(r1, r11)
            goto L85
        L84:
            r10 = r11
        L85:
            int r11 = r10.length
            r1 = 1
            if (r11 <= r1) goto L96
            zh2 r11 = new zh2
            r3 = 21
            r11.<init>(r3)
            int r3 = r10.length
            if (r3 <= r1) goto L96
            java.util.Arrays.sort(r10, r11)
        L96:
            android.util.Size r11 = r12.c()
            int r12 = r11.getWidth()
            long r3 = (long) r12
            int r11 = r11.getHeight()
            long r11 = (long) r11
            long r3 = r3 * r11
            r11 = 307200(0x4b000, double:1.51777E-318)
            long r11 = java.lang.Math.min(r11, r3)
            int r1 = r10.length
            r3 = r2
        Lae:
            if (r3 >= r1) goto Lce
            r4 = r10[r3]
            int r5 = r4.getWidth()
            long r5 = (long) r5
            int r7 = r4.getHeight()
            long r7 = (long) r7
            long r5 = r5 * r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 != 0) goto Lc3
            r11 = r4
            goto Ld2
        Lc3:
            if (r5 <= 0) goto Lca
            if (r0 != 0) goto Lc8
            goto Lce
        Lc8:
            r11 = r0
            goto Ld2
        Lca:
            int r3 = r3 + 1
            r0 = r4
            goto Lae
        Lce:
            if (r0 != 0) goto Lc8
            r11 = r10[r2]
        Ld2:
            r9.s = r11
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            r9.t = r10
            return
    }

    @Override // defpackage.di7
    public final void A() {
            r3 = this;
            mc6 r0 = r3.u
            if (r0 == 0) goto L7
            r0.b()
        L7:
            r0 = 0
            r3.u = r0
            java.lang.Object r1 = r3.t
            monitor-enter(r1)
            o33 r2 = r3.v     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L17
            r2.a()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r3 = move-exception
            goto L1b
        L17:
            r3.v = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return
        L1b:
            monitor-exit(r1)
            throw r3
    }

    public final defpackage.o33 G(android.util.Size r5) {
            r4 = this;
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r1 = 0
            r0.<init>(r1)
            int r1 = r5.getWidth()
            int r2 = r5.getHeight()
            r0.setDefaultBufferSize(r1, r2)
            android.view.Surface r1 = new android.view.Surface
            r1.<init>(r0)
            o33 r2 = r4.v
            if (r2 == 0) goto L1d
            r2.a()
        L1d:
            o33 r2 = new o33
            zi7 r3 = r4.h
            int r3 = r3.q()
            r2.<init>(r1, r5, r3)
            r4.v = r2
            tb0 r4 = r2.e
            gx3 r4 = defpackage.l.F(r4)
            mf r5 = new mf
            r3 = 29
            r5.<init>(r3, r1, r0)
            uj1 r0 = defpackage.u24.j()
            r4.a(r0, r5)
            return r2
    }

    public final defpackage.lc6 H(android.util.Size r5) {
            r4 = this;
            java.lang.Object r0 = r4.t
            monitor-enter(r0)
            o33 r1 = r4.G(r5)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)
            mc6 r0 = r4.u
            if (r0 == 0) goto Lf
            r0.b()
        Lf:
            mc6 r0 = new mc6
            n13 r2 = new n13
            r3 = 1
            r2.<init>(r4, r5, r3)
            r0.<init>(r2)
            r4.u = r0
            u54 r4 = new u54
            r4.<init>()
            lc6 r4 = defpackage.lc6.d(r4, r5)
            dk0 r5 = r4.b
            r5.L = r3
            yq1 r5 = defpackage.yq1.d
            r2 = -1
            r4.b(r1, r5, r2)
            r4.f = r0
            return r4
        L32:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // defpackage.di7
    public final defpackage.zi7 g(boolean r1, defpackage.cj7 r2) {
            r0 = this;
            r2.getClass()
            sg0 r1 = r0.q
            r1.getClass()
            al1 r0 = r0.r
            r0.getClass()
            u54 r0 = new u54
            r0.<init>()
            return r0
    }

    @Override // defpackage.di7
    public final defpackage.yi7 m(defpackage.yy0 r2) {
            r1 = this;
            r2.getClass()
            q61 r2 = new q61
            sg0 r0 = r1.q
            r0.getClass()
            al1 r1 = r1.r
            r1.getClass()
            r2.<init>()
            return r2
    }

    @Override // defpackage.di7
    public final defpackage.yy z(defpackage.yy r2, defpackage.yy r3) {
            r1 = this;
            android.util.Size r3 = r1.s
            lc6 r0 = r1.H(r3)
            rc6 r0 = r0.c()
            java.util.List r0 = defpackage.hf.b0(r0)
            r1.E(r0)
            p87 r1 = r2.b()
            r1.a = r3
            yy r1 = r1.a()
            return r1
    }
}
