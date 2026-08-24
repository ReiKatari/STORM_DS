package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h47  reason: default package */
/* loaded from: classes.dex */
public final class h47 {
    public final int a;

    public /* synthetic */ h47(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.h47
            if (r0 != 0) goto L5
            goto Ld
        L5:
            h47 r2 = (defpackage.h47) r2
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
            r0 = 1
            int r1 = r1.a
            if (r1 != r0) goto L8
            java.lang.String r1 = "Linearity.Linear"
            return r1
        L8:
            r0 = 2
            if (r1 != r0) goto Le
            java.lang.String r1 = "Linearity.FontHinting"
            return r1
        Le:
            r0 = 3
            if (r1 != r0) goto L14
            java.lang.String r1 = "Linearity.None"
            return r1
        L14:
            java.lang.String r1 = "Invalid"
            return r1
    }
}
