package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fy3  reason: default package */
/* loaded from: classes.dex */
public final class fy3 {
    public final java.util.Locale a;

    public fy3(java.util.Locale r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof defpackage.fy3
            if (r1 != 0) goto L9
            return r0
        L9:
            if (r2 != r3) goto Ld
            r2 = 1
            return r2
        Ld:
            java.util.Locale r2 = r2.a
            java.lang.String r2 = r2.toLanguageTag()
            fy3 r3 = (defpackage.fy3) r3
            java.util.Locale r3 = r3.a
            java.lang.String r3 = r3.toLanguageTag()
            boolean r2 = defpackage.nb3.k(r2, r3)
            return r2
    }

    public final int hashCode() {
            r0 = this;
            java.util.Locale r0 = r0.a
            java.lang.String r0 = r0.toLanguageTag()
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.util.Locale r0 = r0.a
            java.lang.String r0 = r0.toLanguageTag()
            return r0
    }
}
