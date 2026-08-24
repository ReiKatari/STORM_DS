package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: na2  reason: default package */
/* loaded from: classes.dex */
public final class na2 {
    public final java.lang.String a;
    public final java.util.Map b;

    public na2(java.lang.String r1, java.util.Map r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static defpackage.yc1 a(java.lang.String r1) {
            yc1 r0 = new yc1
            r0.<init>(r1)
            return r0
    }

    public static defpackage.na2 c(java.lang.String r2) {
            na2 r0 = new na2
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            r0.<init>(r2, r1)
            return r0
    }

    public final java.lang.annotation.Annotation b(java.lang.Class r1) {
            r0 = this;
            java.util.Map r0 = r0.b
            java.lang.Object r0 = r0.get(r1)
            java.lang.annotation.Annotation r0 = (java.lang.annotation.Annotation) r0
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.na2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            na2 r5 = (defpackage.na2) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L21
            java.util.Map r4 = r4.b
            java.util.Map r5 = r5.b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L21
            return r0
        L21:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Map r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FieldDescriptor{name="
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", properties="
            r0.append(r1)
            java.util.Map r2 = r2.b
            java.util.Collection r2 = r2.values()
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
