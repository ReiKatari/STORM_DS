package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jt6  reason: default package */
/* loaded from: classes.dex */
public final class jt6 implements defpackage.qb6, defpackage.qp1 {
    public final defpackage.qb6 a;
    public final int b;
    public final int c;

    public jt6(defpackage.qb6 r2, int r3, int r4) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1 = 0
            if (r3 < 0) goto L2a
            if (r4 < 0) goto L20
            if (r4 < r3) goto L14
            return
        L14:
            java.lang.String r2 = "endIndex should be not less than startIndex, but was "
            java.lang.String r0 = " < "
            java.lang.String r2 = defpackage.lb1.j(r2, r4, r3, r0)
            defpackage.i.f(r2)
            throw r1
        L20:
            java.lang.String r2 = "endIndex should be non-negative, but is "
            java.lang.String r2 = defpackage.lb1.g(r4, r2)
            defpackage.i.f(r2)
            throw r1
        L2a:
            java.lang.String r2 = "startIndex should be non-negative, but is "
            java.lang.String r2 = defpackage.lb1.g(r3, r2)
            defpackage.i.f(r2)
            throw r1
    }

    @Override // defpackage.qp1
    public final defpackage.qb6 a(int r4) {
            r3 = this;
            int r0 = r3.c
            int r1 = r3.b
            int r2 = r0 - r1
            if (r4 < r2) goto Lb
            cu1 r3 = defpackage.cu1.a
            return r3
        Lb:
            jt6 r2 = new jt6
            qb6 r3 = r3.a
            int r1 = r1 + r4
            r2.<init>(r3, r1, r0)
            return r2
    }

    @Override // defpackage.qb6
    public final java.util.Iterator iterator() {
            r1 = this;
            rr2 r0 = new rr2
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.qp1
    public final defpackage.qb6 take() {
            r3 = this;
            int r0 = r3.c
            int r1 = r3.b
            int r0 = r0 - r1
            r2 = 50
            if (r2 < r0) goto La
            return r3
        La:
            jt6 r0 = new jt6
            int r2 = r1 + 50
            qb6 r3 = r3.a
            r0.<init>(r3, r1, r2)
            return r0
    }
}
