package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pp1  reason: default package */
/* loaded from: classes.dex */
public final class pp1 implements defpackage.qb6, defpackage.qp1 {
    public final defpackage.qb6 a;
    public final int b;

    public pp1(defpackage.qb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            if (r2 < 0) goto Ld
            return
        Ld:
            java.lang.String r0 = "count must be non-negative, but was "
            r1 = 46
            java.lang.String r0 = defpackage.xg6.o(r0, r2, r1)
            defpackage.i.f(r0)
            r0 = 0
            throw r0
    }

    @Override // defpackage.qp1
    public final defpackage.qb6 a(int r2) {
            r1 = this;
            int r0 = r1.b
            int r0 = r0 + r2
            if (r0 >= 0) goto Lb
            pp1 r0 = new pp1
            r0.<init>(r1, r2)
            return r0
        Lb:
            pp1 r2 = new pp1
            qb6 r1 = r1.a
            r2.<init>(r1, r0)
            return r2
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
            r3 = this;
            int r0 = r3.b
            int r1 = r0 + 50
            if (r1 >= 0) goto Lc
            xy6 r0 = new xy6
            r0.<init>(r3)
            return r0
        Lc:
            jt6 r2 = new jt6
            qb6 r3 = r3.a
            r2.<init>(r3, r0, r1)
            return r2
    }
}
