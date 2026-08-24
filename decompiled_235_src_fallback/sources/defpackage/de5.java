package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: de5  reason: default package */
/* loaded from: classes.dex */
public final class de5 implements defpackage.rp6, defpackage.le2, defpackage.ro2 {
    public final /* synthetic */ defpackage.rp6 A;

    public de5(defpackage.tp6 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r1, defpackage.r41 r2) {
            r0 = this;
            rp6 r0 = r0.A
            java.lang.Object r0 = r0.b(r1, r2)
            return r0
    }

    @Override // defpackage.ro2
    public final defpackage.le2 c(defpackage.l61 r2, int r3, defpackage.m80 r4) {
            r1 = this;
            if (r3 < 0) goto L6
            r0 = 2
            if (r3 >= r0) goto L6
            goto L9
        L6:
            r0 = -2
            if (r3 != r0) goto Le
        L9:
            m80 r0 = defpackage.m80.DROP_OLDEST
            if (r4 != r0) goto Le
            goto L12
        Le:
            le2 r1 = defpackage.pf6.d(r1, r2, r3, r4)
        L12:
            return r1
    }

    @Override // defpackage.rp6
    public final java.lang.Object getValue() {
            r0 = this;
            rp6 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            return r0
    }
}
