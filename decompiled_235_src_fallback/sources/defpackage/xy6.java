package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xy6  reason: default package */
/* loaded from: classes.dex */
public final class xy6 implements defpackage.qb6, defpackage.qp1 {
    public final defpackage.qb6 a;

    public xy6(defpackage.qb6 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.qp1
    public final defpackage.qb6 a(int r3) {
            r2 = this;
            r0 = 50
            if (r3 < r0) goto L7
            cu1 r2 = defpackage.cu1.a
            return r2
        L7:
            jt6 r1 = new jt6
            qb6 r2 = r2.a
            r1.<init>(r2, r3, r0)
            return r1
    }

    @Override // defpackage.qb6
    public final java.util.Iterator iterator() {
            r1 = this;
            op1 r0 = new op1
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.qp1
    public final defpackage.qb6 take() {
            r0 = this;
            return r0
    }
}
