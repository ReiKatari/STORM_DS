package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: em5  reason: default package */
/* loaded from: classes.dex */
public final class em5 implements java.io.Serializable {
    public final java.lang.Throwable A;

    public em5(java.lang.Throwable r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.em5
            if (r0 == 0) goto L12
            em5 r2 = (defpackage.em5) r2
            java.lang.Throwable r2 = r2.A
            java.lang.Throwable r1 = r1.A
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Throwable r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failure("
            r0.<init>(r1)
            java.lang.Throwable r2 = r2.A
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
