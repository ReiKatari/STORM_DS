package dd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends ec.j implements mc.p {
    public final /* synthetic */ int X = 1;
    public int Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ k f4039b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ cd.i f4040c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, cd.i iVar, Object obj, cc.c cVar) {
        super(2, cVar);
        this.f4039b0 = kVar;
        this.f4040c0 = iVar;
        this.Z = obj;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((h) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((h) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new h(this.f4039b0, this.f4040c0, this.Z, cVar);
            default:
                h hVar = new h(this.f4039b0, this.f4040c0, cVar);
                hVar.Z = obj;
                return hVar;
        }
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [ec.j, mc.q] */
    @Override // ec.a
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    ?? r10 = this.f4039b0.X;
                    Object obj2 = this.Z;
                    this.Y = 1;
                    if (r10.i(this.f4040c0, obj2, this) == aVar) {
                        return aVar;
                    }
                }
                return yb.y.f14813a;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    zc.u uVar = (zc.u) this.Z;
                    Object obj3 = new Object();
                    k kVar = this.f4039b0;
                    cd.h hVar = kVar.R;
                    j jVar = new j(obj3, uVar, kVar, this.f4040c0, 0);
                    this.Y = 1;
                    if (hVar.c(jVar, this) == aVar2) {
                        return aVar2;
                    }
                }
                return yb.y.f14813a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, cd.i iVar, cc.c cVar) {
        super(2, cVar);
        this.f4039b0 = kVar;
        this.f4040c0 = iVar;
    }
}
