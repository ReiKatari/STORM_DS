package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wn3  reason: default package */
/* loaded from: classes.dex */
public final class wn3 extends defpackage.z64 implements defpackage.xs4 {
    public float k0;
    public boolean l0;

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
            float r1 = r0.k0
            r2.a = r1
            boolean r0 = r0.l0
            r2.b = r0
            return r2
    }
}
