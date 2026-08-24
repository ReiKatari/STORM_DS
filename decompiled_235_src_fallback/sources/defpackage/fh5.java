package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fh5  reason: default package */
/* loaded from: classes.dex */
public final class fh5 extends defpackage.jd1 {
    public final /* synthetic */ int B;

    public /* synthetic */ fh5(int r1) {
            r0 = this;
            r0.B = r1
            r1 = 21
            r0.<init>(r1)
            return
    }

    @Override // defpackage.jd1
    public java.lang.String f(java.lang.reflect.Method r3, int r4) {
            r2 = this;
            int r0 = r2.B
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.f(r3, r4)
            return r2
        La:
            java.lang.reflect.Parameter[] r0 = defpackage.oc3.v(r3)
            r0 = r0[r4]
            boolean r1 = defpackage.oc3.u(r0)
            if (r1 == 0) goto L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "parameter '"
            r2.<init>(r3)
            java.lang.String r3 = defpackage.oc3.g(r0)
            r2.append(r3)
            r3 = 39
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L32
        L2e:
            java.lang.String r2 = super.f(r3, r4)
        L32:
            return r2
    }

    @Override // defpackage.jd1
    public final java.lang.Object g(java.lang.reflect.Method r2, java.lang.Object r3, java.lang.Object[] r4) {
            r1 = this;
            int r1 = r1.B
            switch(r1) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = defpackage.l.A(r2, r3, r4)
            return r1
        La:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L15
            java.lang.Object r1 = defpackage.l.A(r2, r3, r4)
            goto L1b
        L15:
            java.lang.String r1 = "Calling default methods on API 24 and 25 is not supported"
            defpackage.fa6.h(r1)
            r1 = 0
        L1b:
            return r1
    }

    @Override // defpackage.jd1
    public final boolean h(java.lang.reflect.Method r1) {
            r0 = this;
            int r0 = r0.B
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r0 = r1.isDefault()
            return r0
        La:
            boolean r0 = r1.isDefault()
            return r0
    }
}
