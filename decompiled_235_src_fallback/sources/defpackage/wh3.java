package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wh3  reason: default package */
/* loaded from: classes.dex */
public final class wh3 {
    public final int a;

    public /* synthetic */ wh3(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static java.lang.String a(int r1) {
            r0 = -1
            if (r1 != r0) goto L6
            java.lang.String r1 = "Unspecified"
            return r1
        L6:
            if (r1 != 0) goto Lb
            java.lang.String r1 = "None"
            return r1
        Lb:
            r0 = 1
            if (r1 != r0) goto L11
            java.lang.String r1 = "Characters"
            return r1
        L11:
            r0 = 2
            if (r1 != r0) goto L17
            java.lang.String r1 = "Words"
            return r1
        L17:
            r0 = 3
            if (r1 != r0) goto L1d
            java.lang.String r1 = "Sentences"
            return r1
        L1d:
            java.lang.String r1 = "Invalid"
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.wh3
            if (r0 != 0) goto L5
            goto Ld
        L5:
            wh3 r2 = (defpackage.wh3) r2
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
