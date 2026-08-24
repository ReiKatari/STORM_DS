package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od3  reason: default package */
/* loaded from: classes.dex */
public final class od3 extends defpackage.ee3 implements java.lang.Iterable {
    public final java.util.ArrayList A;

    public od3() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.A = r0
            return
    }

    @Override // defpackage.ee3
    public final int a() {
            r0 = this;
            ee3 r0 = r0.d()
            int r0 = r0.a()
            return r0
    }

    @Override // defpackage.ee3
    public final java.lang.String c() {
            r0 = this;
            ee3 r0 = r0.d()
            java.lang.String r0 = r0.c()
            return r0
    }

    public final defpackage.ee3 d() {
            r2 = this;
            java.util.ArrayList r2 = r2.A
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L11
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            ee3 r2 = (defpackage.ee3) r2
            return r2
        L11:
            java.lang.String r2 = "Array must have size 1, but has size "
            java.lang.String r2 = defpackage.lb1.g(r0, r2)
            defpackage.i.m(r2)
            r2 = 0
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof defpackage.od3
            if (r0 == 0) goto L13
            od3 r2 = (defpackage.od3) r2
            java.util.ArrayList r2 = r2.A
            java.util.ArrayList r1 = r1.A
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.util.ArrayList r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r0 = this;
            java.util.ArrayList r0 = r0.A
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
