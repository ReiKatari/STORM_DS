package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l71  reason: default package */
/* loaded from: classes.dex */
public final class l71 extends defpackage.lb4 {
    public final defpackage.d40 o;

    public l71(defpackage.d40 r1) {
            r0 = this;
            r0.<init>()
            r0.o = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.l71
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l71 r4 = (defpackage.l71) r4
            d40 r3 = r3.o
            d40 r4 = r4.o
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            d40 r0 = r0.o
            float r0 = r0.a
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    @Override // defpackage.lb4
    public final int m(int r1, int r2, defpackage.kk3 r3) {
            r0 = this;
            d40 r0 = r0.o
            int r0 = r0.a(r2, r1)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VerticalCrossAxisAlignment(vertical="
            r0.<init>(r1)
            d40 r2 = r2.o
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
