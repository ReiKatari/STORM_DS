package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yo7  reason: default package */
/* loaded from: classes.dex */
public interface yo7 {
    default defpackage.qo7 a(java.lang.Class r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error."
            r0.<init>(r1)
            throw r0
    }

    default defpackage.qo7 b(java.lang.Class r1, defpackage.m94 r2) {
            r0 = this;
            qo7 r0 = r0.a(r1)
            return r0
    }

    default defpackage.qo7 c(defpackage.ar0 r1, defpackage.m94 r2) {
            r0 = this;
            java.lang.Class r1 = r1.a
            r1.getClass()
            qo7 r0 = r0.b(r1, r2)
            return r0
    }
}
