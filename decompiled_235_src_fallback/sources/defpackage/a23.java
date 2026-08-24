package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a23  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a23 implements defpackage.nc6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ a23(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.nc6
    public final void a(defpackage.rc6 r4, defpackage.oc6 r5) {
            r3 = this;
            int r0 = r3.a
            r1 = 0
            java.lang.Object r3 = r3.b
            switch(r0) {
                case 0: goto L35;
                case 1: goto L1f;
                default: goto L8;
            }
        L8:
            pc6 r3 = (defpackage.pc6) r3
            java.util.ArrayList r3 = r3.n
            int r0 = r3.size()
        L10:
            if (r1 >= r0) goto L1e
            java.lang.Object r2 = r3.get(r1)
            int r1 = r1 + 1
            nc6 r2 = (defpackage.nc6) r2
            r2.a(r4, r5)
            goto L10
        L1e:
            return
        L1f:
            p25 r3 = (defpackage.p25) r3
            eg0 r4 = r3.d()
            if (r4 != 0) goto L28
            goto L34
        L28:
            zi7 r4 = r3.h
            q25 r4 = (defpackage.q25) r4
            yy r5 = r3.i
            r3.H(r4, r5)
            r3.r()
        L34:
            return
        L35:
            d23 r3 = (defpackage.d23) r3
            eg0 r4 = r3.d()
            if (r4 != 0) goto L3e
            goto L8b
        L3e:
            wy6 r4 = r3.w
            r4.getClass()
            defpackage.nj2.h()
            r5 = 1
            r4.R = r5
            r3.G(r5)
            java.lang.String r4 = r3.f()
            zi7 r0 = r3.h
            e23 r0 = (defpackage.e23) r0
            yy r2 = r3.i
            r2.getClass()
            lc6 r4 = r3.H(r4, r0, r2)
            r3.u = r4
            rc6 r4 = r4.c()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            r4 = r4[r1]
            java.util.Objects.requireNonNull(r4)
            r0.add(r4)
            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
            r3.E(r4)
            r3.r()
            wy6 r3 = r3.w
            r3.getClass()
            defpackage.nj2.h()
            r3.R = r1
            r3.b()
        L8b:
            return
    }
}
