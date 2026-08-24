package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s1  reason: default package */
/* loaded from: classes.dex */
public abstract class s1 extends defpackage.l0 implements java.util.Set {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r4 != r3) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r4 instanceof java.util.Set
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.util.Set r4 = (java.util.Set) r4
            int r0 = r3.size()
            int r2 = r4.size()
            if (r0 == r2) goto L17
            return r1
        L17:
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r3 = r3.containsAll(r4)
            return r3
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
            r3 = this;
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
            r1 = r0
        L6:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r3.next()
            if (r2 == 0) goto L17
            int r2 = r2.hashCode()
            goto L18
        L17:
            r2 = r0
        L18:
            int r1 = r1 + r2
            goto L6
        L1a:
            return r1
    }
}
