package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n13  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n13 implements defpackage.nc6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.di7 b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ n13(defpackage.di7 r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    @Override // defpackage.nc6
    public final void a(defpackage.rc6 r3, defpackage.oc6 r4) {
            r2 = this;
            int r0 = r2.a
            java.lang.Object r1 = r2.c
            di7 r2 = r2.b
            switch(r0) {
                case 0: goto L26;
                default: goto L9;
            }
        L9:
            v54 r2 = (defpackage.v54) r2
            android.util.Size r1 = (android.util.Size) r1
            r3.getClass()
            r4.getClass()
            lc6 r3 = r2.H(r1)
            rc6 r3 = r3.c()
            java.util.List r3 = defpackage.hf.b0(r3)
            r2.E(r3)
            r2.r()
            return
        L26:
            r13 r2 = (defpackage.r13) r2
            t13 r1 = (defpackage.t13) r1
            eg0 r3 = r2.d()
            if (r3 != 0) goto L31
            goto L7d
        L31:
            defpackage.nj2.h()
            mc6 r3 = r2.y
            r4 = 0
            if (r3 == 0) goto L3e
            r3.b()
            r2.y = r4
        L3e:
            o33 r3 = r2.x
            if (r3 == 0) goto L47
            r3.a()
            r2.x = r4
        L47:
            r1.d()
            r2.f()
            zi7 r3 = r2.h
            v13 r3 = (defpackage.v13) r3
            yy r4 = r2.i
            r4.getClass()
            lc6 r3 = r2.G(r3, r4)
            r2.w = r3
            rc6 r3 = r3.c()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 1
            r4.<init>(r0)
            r0 = 0
            r3 = r3[r0]
            java.util.Objects.requireNonNull(r3)
            r4.add(r3)
            java.util.List r3 = java.util.Collections.unmodifiableList(r4)
            r2.E(r3)
            r2.r()
        L7d:
            return
    }
}
