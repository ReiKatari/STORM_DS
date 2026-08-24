package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j71  reason: default package */
/* loaded from: classes.dex */
public abstract class j71 {
    public final java.util.LinkedHashMap a;

    public j71() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.a = r0
            return
    }

    public abstract java.lang.Object a(defpackage.i71 r1);

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.j71
            if (r0 == 0) goto L12
            j71 r2 = (defpackage.j71) r2
            java.util.LinkedHashMap r2 = r2.a
            java.util.LinkedHashMap r1 = r1.a
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
            java.util.LinkedHashMap r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CreationExtras(extras="
            r0.<init>(r1)
            java.util.LinkedHashMap r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
