package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vz3  reason: default package */
/* loaded from: classes.dex */
public final class vz3 implements defpackage.jk5 {
    public final /* synthetic */ defpackage.wz3 A;

    public vz3(defpackage.wz3 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.jk5
    public final void x(defpackage.yk5 r1, long r2, defpackage.th r4) {
            r0 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 < r2) goto L36
            wz3 r0 = r0.A
            li7 r1 = r0.c
            if (r1 == 0) goto L36
            boolean r1 = r0.e
            if (r1 == 0) goto L36
            hh7 r1 = r4.L
            uh r1 = (defpackage.uh) r1
            android.hardware.camera2.CaptureResult$Key r2 = defpackage.xp.e()
            r2.getClass()
            r1.getClass()
            android.hardware.camera2.CaptureResult r1 = r1.A
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L36
            int r1 = r1.intValue()
            s94 r2 = r0.f
            r3 = 1
            if (r1 != r3) goto L32
            goto L33
        L32:
            r3 = 0
        L33:
            r0.c(r2, r3)
        L36:
            return
    }
}
