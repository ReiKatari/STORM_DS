package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jj2  reason: default package */
/* loaded from: classes.dex */
public final class jj2 {
    public final int a;

    public /* synthetic */ jj2(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.jj2
            if (r0 != 0) goto L5
            goto Ld
        L5:
            jj2 r2 = (defpackage.jj2) r2
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
            java.lang.String r1 = "None"
            return r1
        L7:
            r0 = 1
            if (r1 != r0) goto Ld
            java.lang.String r1 = "Weight"
            return r1
        Ld:
            r0 = 2
            if (r1 != r0) goto L13
            java.lang.String r1 = "Style"
            return r1
        L13:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L1b
            java.lang.String r1 = "All"
            return r1
        L1b:
            java.lang.String r1 = "Invalid"
            return r1
    }
}
