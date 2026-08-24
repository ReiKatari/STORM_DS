package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s54  reason: default package */
/* loaded from: classes.dex */
public final class s54 {
    public final defpackage.x31 a;

    public s54() {
            r2 = this;
            x31 r0 = new x31
            r1 = 15
            r0.<init>(r1)
            r2.<init>()
            r2.a = r0
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.s54
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            s54 r4 = (defpackage.s54) r4
            x31 r3 = r3.a
            x31 r4 = r4.a
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            int r1 = java.lang.Integer.hashCode(r0)
            r2 = 31
            int r1 = r1 * r2
            int r0 = defpackage.lb1.a(r0, r1, r2)
            x31 r3 = r3.a
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MetadataTransform(past=0, future=0, transformFn="
            r0.<init>(r1)
            x31 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
