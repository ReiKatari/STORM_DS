package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rw  reason: default package */
/* loaded from: classes.dex */
public final class rw {
    public final defpackage.ll5 a;

    public rw(defpackage.ll5 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof defpackage.rw
            if (r0 != 0) goto L8
            goto L14
        L8:
            rw r2 = (defpackage.rw) r2
            ll5 r1 = r1.a
            ll5 r2 = r2.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            ll5 r0 = r0.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Key(font="
            r0.<init>(r1)
            ll5 r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ", loaderKey=null)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
