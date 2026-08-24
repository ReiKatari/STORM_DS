package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n57  reason: default package */
/* loaded from: classes.dex */
public final class n57 implements defpackage.k61 {
    public final java.lang.ThreadLocal A;

    public n57(java.lang.ThreadLocal r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.n57
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            n57 r4 = (defpackage.n57) r4
            java.lang.ThreadLocal r3 = r3.A
            java.lang.ThreadLocal r4 = r4.A
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.ThreadLocal r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ThreadLocalKey(threadLocal="
            r0.<init>(r1)
            java.lang.ThreadLocal r2 = r2.A
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
