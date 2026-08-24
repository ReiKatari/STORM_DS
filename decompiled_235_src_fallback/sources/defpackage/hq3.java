package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hq3  reason: default package */
/* loaded from: classes.dex */
public final class hq3 implements defpackage.pp6 {
    public final int A;
    public final int B;
    public final defpackage.vs4 L;
    public int R;

    static {
            return
    }

    public hq3(int r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            r3.A = r5
            r3.B = r6
            int r0 = r4 / r5
            int r0 = r0 * r5
            int r1 = r0 - r6
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = r0 + r5
            int r0 = r0 + r6
            l93 r5 = defpackage.gi2.R(r1, r0)
            xd5 r6 = defpackage.xd5.s0
            vs4 r0 = new vs4
            r0.<init>(r5, r6)
            r3.L = r0
            r3.R = r4
            return
    }

    public final void a(int r5) {
            r4 = this;
            int r0 = r4.R
            if (r5 == r0) goto L1e
            r4.R = r5
            int r0 = r4.A
            int r5 = r5 / r0
            int r5 = r5 * r0
            int r1 = r4.B
            int r2 = r5 - r1
            r3 = 0
            int r2 = java.lang.Math.max(r2, r3)
            int r5 = r5 + r0
            int r5 = r5 + r1
            l93 r5 = defpackage.gi2.R(r2, r5)
            vs4 r4 = r4.L
            r4.setValue(r5)
        L1e:
            return
    }

    @Override // defpackage.pp6
    public final java.lang.Object getValue() {
            r0 = this;
            vs4 r0 = r0.L
            java.lang.Object r0 = r0.getValue()
            l93 r0 = (defpackage.l93) r0
            return r0
    }
}
