package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sh5  reason: default package */
/* loaded from: classes.dex */
public final class sh5 extends defpackage.rh5 {
    public final defpackage.ph4 b;

    public sh5(defpackage.ph4 r1, defpackage.th5 r2) {
            r0 = this;
            r0.<init>(r2)
            r0.b = r1
            return
    }

    @Override // defpackage.rh5
    public final java.lang.Object d() {
            r0 = this;
            ph4 r0 = r0.b
            java.lang.Object r0 = r0.e()
            return r0
    }

    @Override // defpackage.rh5
    public final java.lang.Object e(java.lang.Object r1) {
            r0 = this;
            return r1
    }

    @Override // defpackage.rh5
    public final void f(java.lang.Object r2, defpackage.hf3 r3, defpackage.qh5 r4) {
            r1 = this;
            java.lang.reflect.Field r1 = r4.b
            yc7 r0 = r4.g
            java.lang.Object r3 = r0.b(r3)
            if (r3 != 0) goto L10
            boolean r0 = r4.h
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            return
        L10:
            boolean r0 = r4.d
            if (r0 == 0) goto L18
            defpackage.vh5.b(r2, r1)
            goto L1c
        L18:
            boolean r4 = r4.i
            if (r4 != 0) goto L20
        L1c:
            r1.set(r2, r3)
            return
        L20:
            r2 = 0
            java.lang.String r1 = defpackage.oh5.d(r1, r2)
            ne3 r2 = new ne3
            java.lang.String r3 = "Cannot set value of 'static final' "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
    }
}
