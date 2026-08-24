package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od4  reason: default package */
/* loaded from: classes.dex */
public final class od4 extends defpackage.nj2 {
    public final defpackage.hd4 i;

    public od4(defpackage.hd4 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.i = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1b
        L3:
            if (r3 == 0) goto L1d
            java.lang.Class<od4> r0 = defpackage.od4.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Le
            goto L1d
        Le:
            od4 r3 = (defpackage.od4) r3
            hd4 r2 = r2.i
            hd4 r3 = r3.i
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L1b
            goto L1d
        L1b:
            r2 = 1
            return r2
        L1d:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            hd4 r0 = r0.i
            int r0 = r0.hashCode()
            int r0 = r0 + (-31)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InProgress(latestEvent="
            r0.<init>(r1)
            hd4 r2 = r2.i
            r0.append(r2)
            java.lang.String r2 = ", direction=-1)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
