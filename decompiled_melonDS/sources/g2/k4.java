package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k4 extends ec.j implements mc.p {
    public int X;
    public final /* synthetic */ x3 Y;
    public final /* synthetic */ float Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ float f5219b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ float f5220c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ mc.a f5221d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(x3 x3Var, float f8, float f10, float f11, mc.a aVar, cc.c cVar) {
        super(2, cVar);
        this.Y = x3Var;
        this.Z = f8;
        this.f5219b0 = f10;
        this.f5220c0 = f11;
        this.f5221d0 = aVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((k4) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new k4(this.Y, this.Z, this.f5219b0, this.f5220c0, this.f5221d0, cVar);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        if (i2 != 0) {
            if (i2 == 1) {
                p7.j.I(obj);
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            this.X = 1;
            float f8 = p4.f5340a;
            l4 l4Var = new l4(this.Z, this.f5219b0, this.f5220c0, null);
            Object f10 = this.Y.f(f1.f1.Default, l4Var, this);
            if (f10 != aVar) {
                f10 = yVar;
            }
            if (f10 == aVar) {
                return aVar;
            }
        }
        mc.a aVar2 = this.f5221d0;
        if (aVar2 != null) {
            aVar2.b();
        }
        return yVar;
    }
}
