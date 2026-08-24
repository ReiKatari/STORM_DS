package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zc3  reason: default package */
/* loaded from: classes.dex */
public final class zc3 extends defpackage.uc3 {
    public final defpackage.v96 d0;
    public final /* synthetic */ defpackage.ed3 e0;

    public zc3(defpackage.ed3 r1, defpackage.v96 r2) {
            r0 = this;
            r0.e0 = r1
            r0.<init>()
            r0.d0 = r2
            return
    }

    @Override // defpackage.uc3
    public final boolean q() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.uc3
    public final void r(java.lang.Throwable r3) {
            r2 = this;
            ed3 r3 = r2.e0
            java.lang.Object r0 = r3.Q()
            boolean r1 = r0 instanceof defpackage.av0
            if (r1 == 0) goto Lb
            goto Lf
        Lb:
            java.lang.Object r0 = defpackage.fd3.a(r0)
        Lf:
            v96 r2 = r2.d0
            r2.k(r3, r0)
            return
    }
}
