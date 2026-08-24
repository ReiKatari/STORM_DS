package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: by5  reason: default package */
/* loaded from: classes.dex */
public final class by5 extends defpackage.cy5 {
    public final boolean a;

    public by5(boolean r1) {
            r0 = this;
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
            boolean r1 = r4 instanceof defpackage.by5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            by5 r4 = (defpackage.by5) r4
            boolean r3 = r3.a
            boolean r4 = r4.a
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            boolean r0 = r0.a
            int r0 = java.lang.Boolean.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LaunchSuccessful(isGbaLoadSuccessful="
            r0.<init>(r1)
            boolean r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
