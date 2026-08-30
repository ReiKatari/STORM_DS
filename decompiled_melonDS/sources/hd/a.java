package hd;

import mc.q;
import nc.i;
import yb.y;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a extends i implements q {

    /* renamed from: b0  reason: collision with root package name */
    public static final a f6444b0 = new i(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        e eVar = (e) obj2;
        long j2 = bVar.f6445a;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        y yVar = y.f14813a;
        if (i2 <= 0) {
            eVar.X = yVar;
            return yVar;
        }
        ad.c cVar = new ad.c(9, eVar, bVar);
        eVar.getClass();
        cc.g gVar = eVar.A;
        eVar.L = x.m(gVar).J(j2, cVar, gVar);
        return yVar;
    }
}
