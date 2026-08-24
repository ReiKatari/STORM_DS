package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hm5  reason: default package */
/* loaded from: classes.dex */
public final class hm5 implements java.io.Serializable {
    public final java.lang.Object A;

    public /* synthetic */ hm5(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    public static final java.lang.Throwable a(java.lang.Object r1) {
            boolean r0 = r1 instanceof defpackage.em5
            if (r0 == 0) goto L9
            em5 r1 = (defpackage.em5) r1
            java.lang.Throwable r1 = r1.A
            return r1
        L9:
            r1 = 0
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.hm5
            if (r0 != 0) goto L5
            goto L11
        L5:
            hm5 r2 = (defpackage.hm5) r2
            java.lang.Object r2 = r2.A
            java.lang.Object r1 = r1.A
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Object r0 = r0.A
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r2 = r2.A
            boolean r0 = r2 instanceof defpackage.em5
            if (r0 == 0) goto Ld
            em5 r2 = (defpackage.em5) r2
            java.lang.String r2 = r2.toString()
            return r2
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Success("
            r0.<init>(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
