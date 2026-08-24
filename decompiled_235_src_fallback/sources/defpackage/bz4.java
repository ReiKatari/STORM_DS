package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bz4  reason: default package */
/* loaded from: classes.dex */
public final class bz4 {
    public final int a;

    public /* synthetic */ bz4(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static java.lang.String a(int r1) {
            r0 = 1
            if (r1 == r0) goto L18
            r0 = 2
            if (r1 == r0) goto L15
            r0 = 3
            if (r1 == r0) goto L12
            r0 = 4
            if (r1 == r0) goto Lf
            java.lang.String r1 = "Unknown"
            return r1
        Lf:
            java.lang.String r1 = "Eraser"
            return r1
        L12:
            java.lang.String r1 = "Stylus"
            return r1
        L15:
            java.lang.String r1 = "Mouse"
            return r1
        L18:
            java.lang.String r1 = "Touch"
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.bz4
            if (r0 != 0) goto L5
            goto Ld
        L5:
            bz4 r2 = (defpackage.bz4) r2
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
