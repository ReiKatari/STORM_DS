package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ro4  reason: default package */
/* loaded from: classes.dex */
public final class ro4 extends defpackage.mp2 {
    public final defpackage.u16 f;
    public final defpackage.hj g;

    public ro4(defpackage.u16 r2) {
            r1 = this;
            r1.<init>()
            r1.f = r2
            boolean r0 = defpackage.mp2.P(r2)
            if (r0 != 0) goto L13
            hj r0 = defpackage.lj.a()
            defpackage.hj.c(r0, r2)
            goto L14
        L13:
            r0 = 0
        L14:
            r1.g = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof defpackage.ro4
            if (r0 != 0) goto L8
            goto L14
        L8:
            ro4 r2 = (defpackage.ro4) r2
            u16 r2 = r2.f
            u16 r1 = r1.f
            boolean r1 = r1.equals(r2)
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
            u16 r0 = r0.f
            int r0 = r0.hashCode()
            return r0
    }

    @Override // defpackage.mp2
    public final defpackage.of5 z() {
            r4 = this;
            of5 r0 = new of5
            u16 r4 = r4.f
            float r1 = r4.a
            float r2 = r4.b
            float r3 = r4.c
            float r4 = r4.d
            r0.<init>(r1, r2, r3, r4)
            return r0
    }
}
