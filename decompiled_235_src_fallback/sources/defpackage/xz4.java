package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xz4  reason: default package */
/* loaded from: classes.dex */
public final class xz4 extends defpackage.zz4 {
    public final defpackage.s95 a;

    public xz4(defpackage.s95 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.xz4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xz4 r4 = (defpackage.xz4) r4
            s95 r3 = r3.a
            s95 r4 = r4.a
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            s95 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GameMasteredPopup(event="
            r0.<init>(r1)
            s95 r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
