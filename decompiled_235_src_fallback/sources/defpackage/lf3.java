package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lf3  reason: default package */
/* loaded from: classes.dex */
public final class lf3 extends defpackage.v0 {
    public final defpackage.nd3 Y;
    public final int Z;
    public int d0;

    public lf3(defpackage.id3 r2, defpackage.nd3 r3) {
            r1 = this;
            r2.getClass()
            r0 = 0
            r1.<init>(r2, r0)
            r1.Y = r3
            java.util.List r2 = r3.A
            int r2 = r2.size()
            r1.Z = r2
            r2 = -1
            r1.d0 = r2
            return
    }

    @Override // defpackage.v0
    public final defpackage.de3 E() {
            r0 = this;
            nd3 r0 = r0.Y
            return r0
    }

    @Override // defpackage.v0
    public final defpackage.de3 d(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            int r1 = java.lang.Integer.parseInt(r1)
            nd3 r0 = r0.Y
            java.util.List r0 = r0.A
            java.lang.Object r0 = r0.get(r1)
            de3 r0 = (defpackage.de3) r0
            return r0
    }

    @Override // defpackage.ux0
    public final int q(defpackage.wb6 r2) {
            r1 = this;
            r2.getClass()
            int r2 = r1.d0
            int r0 = r1.Z
            int r0 = r0 + (-1)
            if (r2 >= r0) goto L10
            int r2 = r2 + 1
            r1.d0 = r2
            return r2
        L10:
            r1 = -1
            return r1
    }

    @Override // defpackage.v0
    public final java.lang.String x(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            return r0
    }
}
