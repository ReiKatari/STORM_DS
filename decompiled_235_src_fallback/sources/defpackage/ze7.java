package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ze7  reason: default package */
/* loaded from: classes.dex */
public final class ze7 implements java.lang.Comparable {
    public final byte A;

    public /* synthetic */ ze7(byte r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            ze7 r1 = (defpackage.ze7) r1
            byte r1 = r1.A
            byte r0 = r0.A
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = defpackage.nb3.p(r0, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.ze7
            if (r0 != 0) goto L5
            goto Ld
        L5:
            ze7 r2 = (defpackage.ze7) r2
            byte r2 = r2.A
            byte r1 = r1.A
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
            byte r0 = r0.A
            int r0 = java.lang.Byte.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            byte r0 = r0.A
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
