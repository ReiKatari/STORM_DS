package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z13  reason: default package */
/* loaded from: classes.dex */
public final class z13 {
    public final int a;

    public /* synthetic */ z13(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.z13
            if (r0 != 0) goto L5
            goto Ld
        L5:
            z13 r2 = (defpackage.z13) r2
            int r2 = r2.a
            int r1 = r1.a
            if (r1 == r2) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            int r1 = r1.a
            if (r1 != 0) goto L7
            java.lang.String r1 = "Argb8888"
            return r1
        L7:
            r0 = 1
            if (r1 != r0) goto Ld
            java.lang.String r1 = "Alpha8"
            return r1
        Ld:
            r0 = 2
            if (r1 != r0) goto L13
            java.lang.String r1 = "Rgb565"
            return r1
        L13:
            r0 = 3
            if (r1 != r0) goto L19
            java.lang.String r1 = "F16"
            return r1
        L19:
            r0 = 4
            if (r1 != r0) goto L1f
            java.lang.String r1 = "Gpu"
            return r1
        L1f:
            java.lang.String r1 = "Unknown"
            return r1
    }
}
