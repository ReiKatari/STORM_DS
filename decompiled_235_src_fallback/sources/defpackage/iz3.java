package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iz3  reason: default package */
/* loaded from: classes.dex */
public final class iz3 implements defpackage.qh1 {
    public boolean A;
    public long B;
    public long L;
    public final /* synthetic */ defpackage.kz3 R;

    public iz3(defpackage.kz3 r3) {
            r2 = this;
            r2.<init>()
            r2.R = r3
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r2.B = r0
            r0 = 0
            r2.L = r0
            return
    }

    @Override // defpackage.qh1
    public final float Y() {
            r0 = this;
            kz3 r0 = r0.R
            float r0 = r0.Y()
            return r0
    }

    @Override // defpackage.qh1
    public final float a() {
            r0 = this;
            kz3 r0 = r0.R
            float r0 = r0.a()
            return r0
    }

    public final void b(defpackage.hy2 r5, float r6) {
            r4 = this;
            kz3 r4 = r4.R
            z9 r0 = r4.i0
            if (r0 != 0) goto Ld
            z9 r0 = new z9
            r0.<init>()
            r4.i0 = r0
        Ld:
            java.lang.Object r4 = r0.b
            hy2[] r4 = (defpackage.hy2[]) r4
            int r4 = defpackage.fv.K0(r4, r5)
            r1 = 1
            if (r4 >= 0) goto L58
            int r4 = r0.a
            java.lang.Object r2 = r0.b
            hy2[] r2 = (defpackage.hy2[]) r2
            int r3 = r2.length
            if (r4 != r3) goto L3f
            int r3 = r4 * 2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            hy2[] r2 = (defpackage.hy2[]) r2
            r0.b = r2
            java.lang.Object r2 = r0.c
            float[] r2 = (float[]) r2
            float[] r2 = java.util.Arrays.copyOf(r2, r3)
            r0.c = r2
            java.lang.Object r2 = r0.d
            byte[] r2 = (byte[]) r2
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
            r0.d = r2
        L3f:
            java.lang.Object r2 = r0.b
            hy2[] r2 = (defpackage.hy2[]) r2
            r2[r4] = r5
            java.lang.Object r5 = r0.d
            byte[] r5 = (byte[]) r5
            r2 = 3
            r5[r4] = r2
            java.lang.Object r5 = r0.c
            float[] r5 = (float[]) r5
            r5[r4] = r6
            int r4 = r0.a
            int r4 = r4 + r1
            r0.a = r4
            return
        L58:
            java.lang.Object r5 = r0.c
            float[] r5 = (float[]) r5
            r2 = r5[r4]
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L6f
            java.lang.Object r5 = r0.d
            byte[] r5 = (byte[]) r5
            r6 = r5[r4]
            r0 = 2
            if (r6 != r0) goto L6e
            r6 = 0
            r5[r4] = r6
        L6e:
            return
        L6f:
            r5[r4] = r6
            java.lang.Object r5 = r0.d
            byte[] r5 = (byte[]) r5
            r5[r4] = r1
            return
    }
}
