package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od0  reason: default package */
/* loaded from: classes.dex */
public final class od0 implements defpackage.yk5 {
    public final defpackage.me0 A;
    public final android.hardware.camera2.CaptureRequest B;
    public final java.util.Map L;
    public final java.util.Map R;
    public final java.util.Map X;
    public final android.util.ArrayMap Y;
    public final boolean Z;
    public final defpackage.kk5 d0;
    public final long e0;

    public od0(defpackage.me0 r1, android.hardware.camera2.CaptureRequest r2, java.util.Map r3, java.util.Map r4, java.util.Map r5, android.util.ArrayMap r6, boolean r7, defpackage.kk5 r8, long r9) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            r0.Z = r7
            r0.d0 = r8
            r0.e0 = r9
            return
    }

    @Override // defpackage.yk5
    public final boolean J() {
            r0 = this;
            boolean r0 = r0.Z
            return r0
    }

    @Override // defpackage.yk5
    public final long X() {
            r2 = this;
            long r0 = r2.e0
            return r0
    }

    @Override // defpackage.l54
    public final java.lang.Object a(defpackage.k54 r1, defpackage.sy6 r2) {
            r0 = this;
            r1.getClass()
            java.lang.Object r0 = r0.b(r1)
            if (r0 != 0) goto La
            return r2
        La:
            return r0
    }

    @Override // defpackage.l54
    public final java.lang.Object b(defpackage.k54 r4) {
            r3 = this;
            kk5 r0 = r3.d0
            java.util.Map r0 = r0.c
            r4.getClass()
            java.util.Map r1 = r3.X
            boolean r2 = r1.containsKey(r4)
            if (r2 == 0) goto L14
            java.lang.Object r3 = r1.get(r4)
            return r3
        L14:
            boolean r1 = r0.containsKey(r4)
            if (r1 == 0) goto L1f
            java.lang.Object r3 = r0.get(r4)
            return r3
        L1f:
            java.util.Map r0 = r3.R
            boolean r1 = r0.containsKey(r4)
            if (r1 == 0) goto L2c
            java.lang.Object r3 = r0.get(r4)
            return r3
        L2c:
            java.util.Map r3 = r3.L
            java.lang.Object r3 = r3.get(r4)
            return r3
    }

    @Override // defpackage.yk5
    public final defpackage.kk5 c0() {
            r0 = this;
            kk5 r0 = r0.d0
            return r0
    }

    @Override // defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r4) {
            r3 = this;
            java.lang.Class<android.hardware.camera2.CaptureRequest> r0 = android.hardware.camera2.CaptureRequest.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L12
            android.hardware.camera2.CaptureRequest r3 = r3.B
            r3.getClass()
            return r3
        L12:
            java.lang.Class<android.hardware.camera2.CameraCaptureSession> r0 = android.hardware.camera2.CameraCaptureSession.class
            ar0 r1 = defpackage.gh5.a(r0)
            boolean r1 = r4.equals(r1)
            me0 r3 = r3.A
            r2 = 0
            if (r1 == 0) goto L2d
            ar0 r4 = defpackage.gh5.a(r0)
            java.lang.Object r3 = r3.e(r4)
            if (r3 != 0) goto L2c
            goto L56
        L2c:
            return r3
        L2d:
            java.lang.Class r0 = defpackage.ma.B()
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L56
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r4 < r0) goto L51
            java.lang.Class r4 = defpackage.ma.B()
            ar0 r4 = defpackage.gh5.a(r4)
            java.lang.Object r3 = r3.e(r4)
            if (r3 != 0) goto L50
            goto L56
        L50:
            return r3
        L51:
            java.lang.String r3 = "Check failed."
            defpackage.i.m(r3)
        L56:
            return r2
    }

    @Override // defpackage.yk5
    public final java.util.Map x() {
            r0 = this;
            android.util.ArrayMap r0 = r0.Y
            return r0
    }
}
