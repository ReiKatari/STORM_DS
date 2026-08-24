package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cf4  reason: default package */
/* loaded from: classes.dex */
public final class cf4 implements defpackage.k11 {
    public final android.net.ConnectivityManager a;

    public cf4(android.net.ConnectivityManager r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.k11
    public final boolean a(defpackage.yw7 r1) {
            r0 = this;
            boolean r0 = r0.c(r1)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported"
            defpackage.i.m(r0)
            return r1
    }

    @Override // defpackage.k11
    public final defpackage.pb0 b(defpackage.p21 r4) {
            r3 = this;
            r4.getClass()
            u12 r0 = new u12
            r1 = 0
            r2 = 18
            r0.<init>(r4, r3, r1, r2)
            pb0 r3 = defpackage.f04.p(r0)
            return r3
    }

    @Override // defpackage.k11
    public final boolean c(defpackage.yw7 r1) {
            r0 = this;
            r1.getClass()
            p21 r0 = r1.j
            android.net.NetworkRequest r0 = r0.a()
            if (r0 != 0) goto L16
            p21 r0 = r1.j
            kf4 r0 = r0.a
            kf4 r1 = defpackage.kf4.NOT_REQUIRED
            if (r0 == r1) goto L14
            goto L16
        L14:
            r0 = 0
            return r0
        L16:
            r0 = 1
            return r0
    }
}
