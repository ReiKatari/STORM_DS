package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aj6  reason: default package */
/* loaded from: classes.dex */
public final class aj6 extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ long B;
    public final /* synthetic */ int L;
    public final /* synthetic */ int R;
    public final /* synthetic */ defpackage.g34 X;
    public final /* synthetic */ defpackage.dx4 Y;

    public aj6(defpackage.bj6 r1, long r2, int r4, int r5, defpackage.g34 r6, defpackage.dx4 r7) {
            r0 = this;
            r0.B = r2
            r0.L = r4
            r0.R = r5
            r0.X = r6
            r0.Y = r7
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r12) {
            r11 = this;
            cx4 r12 = (defpackage.cx4) r12
            int r0 = r11.L
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            int r3 = r11.R
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r0 = r0 | r3
            g34 r3 = r11.X
            kk3 r3 = r3.getLayoutDirection()
            long r7 = r0 >> r2
            int r4 = (int) r7
            long r7 = r11.B
            long r9 = r7 >> r2
            int r9 = (int) r9
            int r4 = r4 - r9
            float r4 = (float) r4
            r9 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r9
            long r0 = r0 & r5
            int r0 = (int) r0
            long r7 = r7 & r5
            int r1 = (int) r7
            int r0 = r0 - r1
            float r0 = (float) r0
            float r0 = r0 / r9
            kk3 r1 = defpackage.kk3.Ltr
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r3 != r1) goto L34
            r1 = r7
            goto L36
        L34:
            float r1 = r7 * r7
        L36:
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r3
            float r1 = r1 * r4
            float r3 = r3 + r7
            float r3 = r3 * r0
            int r0 = java.lang.Math.round(r1)
            int r1 = java.lang.Math.round(r3)
            long r3 = (long) r0
            long r2 = r3 << r2
            long r0 = (long) r1
            long r0 = r0 & r5
            long r0 = r0 | r2
            dx4 r11 = r11.Y
            defpackage.cx4.k(r12, r11, r0)
            jg7 r11 = defpackage.jg7.a
            return r11
    }
}
