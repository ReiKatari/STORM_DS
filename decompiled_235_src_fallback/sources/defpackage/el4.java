package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: el4  reason: default package */
/* loaded from: classes.dex */
public final class el4 extends defpackage.kj2 {
    public final defpackage.dl4 i;
    public final defpackage.hu3 j;

    public el4(defpackage.hu3 r1, defpackage.dl4 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.i = r2
            r0.j = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.el4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            el4 r5 = (defpackage.el4) r5
            dl4 r1 = r4.i
            dl4 r3 = r5.i
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            hu3 r4 = r4.j
            hu3 r5 = r5.j
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            dl4 r0 = r1.i
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            hu3 r1 = r1.j
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
            java.lang.String r1 = "OnBackPressedCallbackInfo(callback="
            r0.<init>(r1)
            dl4 r1 = r2.i
            r0.append(r1)
            java.lang.String r1 = ", owner="
            r0.append(r1)
            hu3 r2 = r2.j
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
