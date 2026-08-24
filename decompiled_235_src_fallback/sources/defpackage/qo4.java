package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qo4  reason: default package */
/* loaded from: classes.dex */
public final class qo4 extends defpackage.mp2 {
    public final defpackage.of5 f;

    public qo4(defpackage.of5 r1) {
            r0 = this;
            r0.<init>()
            r0.f = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof defpackage.qo4
            if (r0 != 0) goto L8
            goto L14
        L8:
            qo4 r2 = (defpackage.qo4) r2
            of5 r2 = r2.f
            of5 r1 = r1.f
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
            of5 r0 = r0.f
            int r0 = r0.hashCode()
            return r0
    }

    @Override // defpackage.mp2
    public final defpackage.of5 z() {
            r0 = this;
            of5 r0 = r0.f
            return r0
    }
}
