package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ok3  reason: default package */
/* loaded from: classes.dex */
public final class ok3 {
    public final defpackage.mk3 a;
    public final defpackage.mk3 b;

    public ok3(defpackage.mk3 r1, defpackage.mk3 r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static defpackage.ok3 a(defpackage.ok3 r1, defpackage.mk3 r2) {
            mk3 r1 = r1.a
            r1.getClass()
            ok3 r0 = new ok3
            r0.<init>(r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ok3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ok3 r5 = (defpackage.ok3) r5
            mk3 r1 = r4.a
            mk3 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            mk3 r4 = r4.b
            mk3 r5 = r5.b
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            mk3 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            mk3 r1 = r1.b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LayoutDisplayPair(mainScreenDisplay="
            r0.<init>(r1)
            mk3 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", secondaryScreenDisplay="
            r0.append(r1)
            mk3 r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
