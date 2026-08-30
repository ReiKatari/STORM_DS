package p7;

import k7.b0;
import k7.c0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public b0 Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object f11402b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ boolean f11403c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ boolean f11404d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ k7.t f11405e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ mc.l f11406f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(boolean z10, boolean z11, k7.t tVar, cc.c cVar, mc.l lVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.f11403c0 = z10;
        this.f11404d0 = z11;
        this.f11405e0 = tVar;
        this.f11406f0 = lVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((c) t(cVar, c0Var)).v(y.f14813a);
            default:
                return ((c) t(cVar, c0Var)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                c cVar2 = new c(this.f11403c0, this.f11404d0, this.f11405e0, cVar, this.f11406f0, 0);
                cVar2.f11402b0 = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.f11403c0, this.f11404d0, this.f11405e0, cVar, this.f11406f0, 1);
                cVar3.f11402b0 = obj;
                return cVar3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.c.v(java.lang.Object):java.lang.Object");
    }
}
