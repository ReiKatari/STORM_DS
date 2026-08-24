package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f62  reason: default package */
/* loaded from: classes.dex */
public final class f62 implements defpackage.jk5 {
    public final /* synthetic */ defpackage.tu0 A;

    public f62(defpackage.tu0 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.jk5
    public final void J(defpackage.yk5 r1, long r2, defpackage.th r4) {
            r0 = this;
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            hh7 r2 = r4.L
            uh r2 = (defpackage.uh) r2
            android.hardware.camera2.CaptureResult$Key r3 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            r3.getClass()
            r2.getClass()
            android.hardware.camera2.CaptureResult r4 = r2.A
            java.lang.Object r3 = r4.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            android.hardware.camera2.CaptureResult$Key r4 = android.hardware.camera2.CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION
            r4.getClass()
            r2.getClass()
            android.hardware.camera2.CaptureResult r2 = r2.A
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            tu0 r0 = r0.A
            if (r3 == 0) goto L47
            if (r2 == 0) goto L47
            int r3 = r3.intValue()
            r4 = 2
            if (r3 == r4) goto L3d
            r4 = 3
            if (r3 == r4) goto L3d
            r4 = 4
            if (r3 == r4) goto L3d
            goto L52
        L3d:
            int r2 = r2.intValue()
            if (r2 != 0) goto L52
            r0.b0(r1)
            return
        L47:
            if (r2 == 0) goto L52
            int r2 = r2.intValue()
            if (r2 != 0) goto L52
            r0.b0(r1)
        L52:
            return
    }
}
