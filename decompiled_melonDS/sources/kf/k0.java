package kf;

import android.net.Uri;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 extends ec.j implements mc.p {
    public Uri[] X;
    public int Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f8239b0;

    /* renamed from: c0  reason: collision with root package name */
    public /* synthetic */ Object f8240c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ l0 f8241d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, cc.c cVar) {
        super(2, cVar);
        this.f8241d0 = l0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((k0) t((cc.c) obj2, (cd.i) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        k0 k0Var = new k0(this.f8241d0, cVar);
        k0Var.f8240c0 = obj;
        return k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0046 -> B:13:0x0049). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f8240c0
            cd.i r0 = (cd.i) r0
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r8.f8239b0
            kf.l0 r3 = r8.f8241d0
            r4 = 1
            if (r2 == 0) goto L20
            if (r2 != r4) goto L19
            int r2 = r8.Z
            int r5 = r8.Y
            android.net.Uri[] r6 = r8.X
            p7.j.I(r9)
            goto L49
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r9)
            r9 = 0
            return r9
        L20:
            p7.j.I(r9)
            cf.d r9 = r3.f8246c
            kf.d2 r9 = (kf.d2) r9
            android.net.Uri[] r9 = r9.d()
            int r2 = r9.length
            r5 = 0
            r6 = r9
        L2e:
            if (r5 >= r2) goto L4b
            r9 = r6[r5]
            android.content.Context r7 = r3.f8244a
            k6.c r9 = k6.a.e(r7, r9)
            r8.f8240c0 = r0
            r8.X = r6
            r8.Y = r5
            r8.Z = r2
            r8.f8239b0 = r4
            java.lang.Object r9 = r3.c(r9, r0, r8)
            if (r9 != r1) goto L49
            return r1
        L49:
            int r5 = r5 + r4
            goto L2e
        L4b:
            yb.y r9 = yb.y.f14813a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.k0.v(java.lang.Object):java.lang.Object");
    }
}
