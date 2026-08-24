package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q03  reason: default package */
/* loaded from: classes.dex */
public final class q03 {
    public final int a;

    public /* synthetic */ q03(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static java.lang.String a(int r1) {
            r0 = 1
            if (r1 != r0) goto L6
            java.lang.String r1 = "Hyphens.None"
            return r1
        L6:
            r0 = 2
            if (r1 != r0) goto Lc
            java.lang.String r1 = "Hyphens.Auto"
            return r1
        Lc:
            if (r1 != 0) goto L11
            java.lang.String r1 = "Hyphens.Unspecified"
            return r1
        L11:
            java.lang.String r1 = "Invalid"
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.q03
            if (r0 != 0) goto L5
            goto Ld
        L5:
            q03 r2 = (defpackage.q03) r2
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
            r0 = this;
            int r0 = r0.a
            java.lang.String r0 = a(r0)
            return r0
    }
}
