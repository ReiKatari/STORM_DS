package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yh3  reason: default package */
/* loaded from: classes.dex */
public final class yh3 {
    public final int a;

    public /* synthetic */ yh3(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static java.lang.String a(int r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "Unspecified"
            return r1
        L5:
            r0 = 1
            if (r1 != r0) goto Lb
            java.lang.String r1 = "Text"
            return r1
        Lb:
            r0 = 2
            if (r1 != r0) goto L11
            java.lang.String r1 = "Ascii"
            return r1
        L11:
            r0 = 3
            if (r1 != r0) goto L17
            java.lang.String r1 = "Number"
            return r1
        L17:
            r0 = 4
            if (r1 != r0) goto L1d
            java.lang.String r1 = "Phone"
            return r1
        L1d:
            r0 = 5
            if (r1 != r0) goto L23
            java.lang.String r1 = "Uri"
            return r1
        L23:
            r0 = 6
            if (r1 != r0) goto L29
            java.lang.String r1 = "Email"
            return r1
        L29:
            r0 = 7
            if (r1 != r0) goto L2f
            java.lang.String r1 = "Password"
            return r1
        L2f:
            r0 = 8
            if (r1 != r0) goto L36
            java.lang.String r1 = "NumberPassword"
            return r1
        L36:
            r0 = 9
            if (r1 != r0) goto L3d
            java.lang.String r1 = "Decimal"
            return r1
        L3d:
            java.lang.String r1 = "Invalid"
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.yh3
            if (r0 != 0) goto L5
            goto Ld
        L5:
            yh3 r2 = (defpackage.yh3) r2
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
