package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ty6  reason: default package */
/* loaded from: classes.dex */
public final class ty6 {
    public static final defpackage.ty6 b = null;
    public final java.util.Map a;

    static {
            ty6 r0 = new ty6
            zt1 r1 = defpackage.zt1.A
            r0.<init>(r1)
            defpackage.ty6.b = r0
            return
    }

    public ty6(java.util.Map r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof defpackage.ty6
            if (r1 == 0) goto L15
            ty6 r3 = (defpackage.ty6) r3
            java.util.Map r3 = r3.a
            java.util.Map r2 = r2.a
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L15
            return r0
        L15:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            java.util.Map r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Tags(tags="
            r0.<init>(r1)
            java.util.Map r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
