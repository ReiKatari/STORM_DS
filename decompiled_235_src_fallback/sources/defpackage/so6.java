package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: so6  reason: default package */
/* loaded from: classes.dex */
public final class so6 implements defpackage.r41, defpackage.y61 {
    public final defpackage.r41 A;
    public final defpackage.l61 B;

    public so6(defpackage.r41 r1, defpackage.l61 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.r41
    public final defpackage.l61 b() {
            r0 = this;
            l61 r0 = r0.B
            return r0
    }

    @Override // defpackage.y61
    public final defpackage.y61 f() {
            r1 = this;
            r41 r1 = r1.A
            boolean r0 = r1 instanceof defpackage.y61
            if (r0 == 0) goto L9
            y61 r1 = (defpackage.y61) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // defpackage.r41
    public final void i(java.lang.Object r1) {
            r0 = this;
            r41 r0 = r0.A
            r0.i(r1)
            return
    }
}
