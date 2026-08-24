package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c42  reason: default package */
/* loaded from: classes.dex */
public final class c42 {
    public final java.lang.String a;

    public c42(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.a = r1
            return
        L8:
            java.lang.String r0 = "name is null"
            defpackage.u34.x(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.c42
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            c42 r2 = (defpackage.c42) r2
            java.lang.String r2 = r2.a
            java.lang.String r1 = r1.a
            boolean r1 = r1.equals(r2)
            return r1
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r1 = r1.a
            int r1 = r1.hashCode()
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Encoding{name=\""
            r0.<init>(r1)
            java.lang.String r2 = r2.a
            java.lang.String r1 = "\"}"
            java.lang.String r2 = defpackage.i61.n(r0, r2, r1)
            return r2
    }
}
