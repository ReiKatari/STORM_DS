package q8;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends ec.j implements mc.r {
    public int X;
    public /* synthetic */ Throwable Y;
    public /* synthetic */ long Z;

    /* JADX WARN: Type inference failed for: r3v2, types: [q8.k, ec.j] */
    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        cd.i iVar = (cd.i) obj;
        long longValue = ((Number) obj3).longValue();
        ?? jVar = new ec.j(4, (cc.c) obj4);
        jVar.Y = (Throwable) obj2;
        jVar.Z = longValue;
        return jVar.v(yb.y.f14813a);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 == 1) {
                p7.j.I(obj);
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            Throwable th2 = this.Y;
            long j2 = this.Z;
            p8.v.e().d(l.f12356a, "Cannot check for unfinished work", th2);
            long min = Math.min(j2 * 30000, l.f12357b);
            this.X = 1;
            if (zc.x.h(min, this) == aVar) {
                return aVar;
            }
        }
        return Boolean.TRUE;
    }
}
