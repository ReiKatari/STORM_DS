package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u9  reason: default package */
/* loaded from: classes.dex */
public class u9 implements defpackage.oo2, java.io.Serializable {
    public final java.lang.Object A;
    public final java.lang.Class B;
    public final java.lang.String L;
    public final java.lang.String R;
    public final boolean X;
    public final int Y;
    public final int Z;

    public u9(int r1, int r2, java.lang.Class r3, java.lang.Object r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.A = r4
            r0.B = r3
            r0.L = r5
            r0.R = r6
            r3 = 0
            r0.X = r3
            r0.Y = r1
            int r1 = r2 >> 1
            r0.Z = r1
            return
    }

    @Override // defpackage.oo2
    public final int d() {
            r0 = this;
            int r0 = r0.Y
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L44
        L3:
            boolean r0 = r3 instanceof defpackage.u9
            if (r0 != 0) goto L8
            goto L46
        L8:
            u9 r3 = (defpackage.u9) r3
            boolean r0 = r2.X
            boolean r1 = r3.X
            if (r0 != r1) goto L46
            int r0 = r2.Y
            int r1 = r3.Y
            if (r0 != r1) goto L46
            int r0 = r2.Z
            int r1 = r3.Z
            if (r0 != r1) goto L46
            java.lang.Object r0 = r2.A
            java.lang.Object r1 = r3.A
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L46
            java.lang.Class r0 = r2.B
            java.lang.Class r1 = r3.B
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            java.lang.String r0 = r2.L
            java.lang.String r1 = r3.L
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            java.lang.String r2 = r2.R
            java.lang.String r3 = r3.R
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L46
        L44:
            r2 = 1
            return r2
        L46:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.A
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            r1 = 31
            int r0 = r0 * r1
            java.lang.Class r2 = r3.B
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.L
            int r0 = defpackage.xg6.d(r2, r1, r0)
            java.lang.String r2 = r3.R
            int r0 = defpackage.xg6.d(r0, r1, r2)
            boolean r2 = r3.X
            if (r2 == 0) goto L28
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L2a
        L28:
            r2 = 1237(0x4d5, float:1.733E-42)
        L2a:
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r3.Y
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r3 = r3.Z
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            lh5 r0 = defpackage.gh5.a
            r0.getClass()
            java.lang.String r1 = defpackage.lh5.a(r1)
            return r1
    }
}
