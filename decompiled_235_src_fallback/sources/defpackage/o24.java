package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o24  reason: default package */
/* loaded from: classes.dex */
public final class o24 extends defpackage.jw2 {
    public final int F;

    public o24(int r1) {
            r0 = this;
            r0.<init>()
            r0.F = r1
            return
    }

    @Override // defpackage.jw2
    public final void F(defpackage.xe6 r3, float r4) {
            r2 = this;
            p24 r3 = (defpackage.p24) r3
            float[] r0 = r3.x0
            if (r0 == 0) goto L30
            int r2 = r2.F
            r1 = r0[r2]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L30
            r0[r2] = r4
            h61 r2 = r3.z0
            if (r2 == 0) goto L2d
            float r4 = r3.h()
            java.lang.Object r2 = r2.B
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            r0 = 1038174126(0x3de147ae, float:0.11)
            float r4 = r4 * r0
            int r4 = (int) r4
            int r0 = r2.w0
            if (r0 == r4) goto L2d
            r2.w0 = r4
            r2.j()
            r2.invalidate()
        L2d:
            r3.invalidateSelf()
        L30:
            return
    }

    @Override // defpackage.jw2
    public final float t(defpackage.xe6 r1) {
            r0 = this;
            p24 r1 = (defpackage.p24) r1
            float[] r1 = r1.x0
            if (r1 == 0) goto Lb
            int r0 = r0.F
            r0 = r1[r0]
            return r0
        Lb:
            r0 = 0
            return r0
    }
}
