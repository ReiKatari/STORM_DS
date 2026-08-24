package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xf7  reason: default package */
/* loaded from: classes.dex */
public final class xf7 implements java.lang.Comparable {
    public final short A;

    public /* synthetic */ xf7(short r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object r2) {
            r1 = this;
            xf7 r2 = (defpackage.xf7) r2
            short r2 = r2.A
            short r1 = r1.A
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r2 = r2 & r0
            int r1 = defpackage.nb3.p(r1, r2)
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.xf7
            if (r0 != 0) goto L5
            goto Ld
        L5:
            xf7 r2 = (defpackage.xf7) r2
            short r2 = r2.A
            short r1 = r1.A
            if (r1 == r2) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            short r0 = r0.A
            int r0 = java.lang.Short.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            short r1 = r1.A
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }
}
