package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u8  reason: default package */
/* loaded from: classes.dex */
public final class u8 extends defpackage.ic4 {
    @Override // defpackage.ic4
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 == 0) goto L18
            boolean r2 = r4 instanceof defpackage.u8
            if (r2 != 0) goto Lc
            goto L18
        Lc:
            boolean r3 = super.equals(r4)
            if (r3 == 0) goto L18
            r3 = r4
            u8 r3 = (defpackage.u8) r3
            u8 r4 = (defpackage.u8) r4
            return r0
        L18:
            return r1
    }

    @Override // defpackage.ic4
    public final int hashCode() {
            r0 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 961
            return r0
    }
}
