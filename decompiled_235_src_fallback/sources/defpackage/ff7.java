package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ff7  reason: default package */
/* loaded from: classes.dex */
public final class ff7 {
    public final defpackage.z66 a;
    public final defpackage.z66 b;

    public ff7(defpackage.z66 r1, defpackage.z66 r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static defpackage.ff7 a(defpackage.z66 r1, defpackage.z66 r2) {
            r1.getClass()
            r2.getClass()
            ff7 r0 = new ff7
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ defpackage.ff7 b(defpackage.ff7 r1, defpackage.z66 r2, defpackage.z66 r3, int r4) {
            r0 = r4 & 1
            if (r0 == 0) goto L6
            z66 r2 = r1.a
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            z66 r3 = r1.b
        Lc:
            ff7 r1 = a(r2, r3)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ff7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ff7 r5 = (defpackage.ff7) r5
            z66 r1 = r4.a
            z66 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            z66 r4 = r4.b
            z66 r5 = r5.b
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            z66 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            z66 r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UILayout(mainScreenLayout="
            r0.<init>(r1)
            z66 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", secondaryScreenLayout="
            r0.append(r1)
            z66 r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
