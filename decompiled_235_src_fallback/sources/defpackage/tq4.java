package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tq4  reason: default package */
/* loaded from: classes.dex */
public final class tq4 implements defpackage.z70 {
    public final defpackage.ue1 b;
    public final defpackage.z70 c;
    public final defpackage.kk3 d;

    public tq4(defpackage.ue1 r1, defpackage.z70 r2, defpackage.kk3 r3) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            return
    }

    @Override // defpackage.z70
    public final float a(float r9, float r10, float r11) {
            r8 = this;
            ue1 r0 = r8.b
            vs4 r1 = r0.D
            z70 r2 = r8.c
            float r2 = r2.a(r9, r10, r11)
            r3 = 0
            int r4 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 <= 0) goto L18
            float r9 = r9 + r10
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L22
        L16:
            r5 = r6
            goto L22
        L18:
            float r9 = r9 + r10
            of5 r10 = defpackage.vq7.a
            r10 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L22
            goto L16
        L22:
            float r9 = java.lang.Math.abs(r2)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            kk3 r8 = r8.d
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 != 0) goto L2f
            goto L6b
        L2f:
            if (r5 == 0) goto L6b
            kk3 r9 = defpackage.kk3.Rtl
            if (r8 != r9) goto L48
            cr4 r8 = r0.m()
            lo4 r8 = r8.e
            lo4 r9 = defpackage.lo4.Horizontal
            if (r8 != r9) goto L48
            int r8 = r0.f
            int r8 = -r8
            int r9 = r0.p()
            int r9 = r9 + r8
            goto L4a
        L48:
            int r9 = r0.f
        L4a:
            float r8 = (float) r9
            float r8 = r8 * r10
        L4c:
            int r9 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r9 <= 0) goto L5b
            int r9 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r9 >= 0) goto L5b
            int r9 = r0.p()
            float r9 = (float) r9
            float r8 = r8 + r9
            goto L4c
        L5b:
            int r9 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r9 >= 0) goto L6a
            int r9 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r9 <= 0) goto L6a
            int r9 = r0.p()
            float r9 = (float) r9
            float r8 = r8 - r9
            goto L5b
        L6a:
            return r8
        L6b:
            int r9 = r0.f
            int r9 = java.lang.Math.abs(r9)
            double r4 = (double) r9
            r6 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L7c
            return r3
        L7c:
            kk3 r9 = defpackage.kk3.Rtl
            if (r8 != r9) goto L93
            cr4 r2 = r0.m()
            lo4 r2 = r2.e
            lo4 r3 = defpackage.lo4.Horizontal
            if (r2 != r3) goto L93
            int r2 = r0.f
            int r2 = -r2
            int r3 = r0.p()
            int r3 = r3 + r2
            goto L95
        L93:
            int r3 = r0.f
        L95:
            float r2 = (float) r3
            float r2 = r2 * r10
            if (r8 != r9) goto Lb7
            cr4 r8 = r0.m()
            lo4 r8 = r8.e
            lo4 r9 = defpackage.lo4.Horizontal
            if (r8 != r9) goto Lb7
            java.lang.Object r8 = r1.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lb0
            goto Lc8
        Lb0:
            int r8 = r0.p()
        Lb4:
            float r8 = (float) r8
            float r2 = r2 + r8
            goto Lc8
        Lb7:
            java.lang.Object r8 = r1.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lc8
            int r8 = r0.p()
            goto Lb4
        Lc8:
            float r8 = -r11
            float r8 = defpackage.gi2.p(r2, r8, r11)
            return r8
    }
}
