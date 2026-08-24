package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ol1  reason: default package */
/* loaded from: classes.dex */
public final class ol1 extends defpackage.t0 {
    public final java.util.Iterator L;
    public final defpackage.qn2 R;
    public final java.util.HashSet X;

    public ol1(java.util.Iterator r1, defpackage.qn2 r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.L = r1
            r0.R = r2
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.X = r1
            return
    }

    @Override // defpackage.t0
    public final void a() {
            r3 = this;
        L0:
            java.util.Iterator r0 = r3.L
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r0 = r0.next()
            qn2 r1 = r3.R
            java.lang.Object r1 = r1.g(r0)
            java.util.HashSet r2 = r3.X
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L0
            r3.B = r0
            r0 = 1
            r3.A = r0
            return
        L20:
            r0 = 2
            r3.A = r0
            return
    }
}
