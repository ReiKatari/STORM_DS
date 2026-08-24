package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dy2  reason: default package */
/* loaded from: classes.dex */
public final class dy2 extends defpackage.z64 implements defpackage.xs4 {
    public defpackage.c40 k0;

    @Override // defpackage.xs4
    public final java.lang.Object t(defpackage.qh1 r1, java.lang.Object r2) {
            r0 = this;
            boolean r1 = r2 instanceof defpackage.j26
            if (r1 == 0) goto L7
            j26 r2 = (defpackage.j26) r2
            goto L8
        L7:
            r2 = 0
        L8:
            if (r2 != 0) goto Lf
            j26 r2 = new j26
            r2.<init>()
        Lf:
            c40 r0 = r0.k0
            k71 r1 = new k71
            r1.<init>(r0)
            r2.c = r1
            return r2
    }
}
