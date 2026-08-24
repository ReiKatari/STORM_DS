package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qg0  reason: default package */
/* loaded from: classes.dex */
public final class qg0 {
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            r0 = 1
            if (r1 != r2) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof defpackage.qg0
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            r0 = 0
            int r0 = java.lang.Boolean.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "Flags(strictModeEnabled=false)"
            return r0
    }
}
