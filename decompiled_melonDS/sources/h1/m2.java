package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m2 extends ec.j implements mc.p {
    public p2 X;
    public nc.s Y;
    public long Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f5972b0;

    /* renamed from: c0  reason: collision with root package name */
    public /* synthetic */ Object f5973c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ p2 f5974d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ nc.s f5975e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ long f5976f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(p2 p2Var, nc.s sVar, long j2, cc.c cVar) {
        super(2, cVar);
        this.f5974d0 = p2Var;
        this.f5975e0 = sVar;
        this.f5976f0 = j2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((m2) t((cc.c) obj2, (n2) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        m2 m2Var = new m2(this.f5974d0, this.f5975e0, this.f5976f0, cVar);
        m2Var.f5973c0 = obj;
        return m2Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        p2 p2Var;
        nc.s sVar;
        float c4;
        long j2;
        p2 p2Var2;
        long a10;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.f5972b0;
        if (i2 != 0) {
            if (i2 == 1) {
                j2 = this.Z;
                sVar = this.Y;
                p2Var = this.X;
                p2Var2 = (p2) this.f5973c0;
                p7.j.I(obj);
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            p2Var = this.f5974d0;
            l2 l2Var = new l2(p2Var, (n2) this.f5973c0);
            q0 q0Var = p2Var.f5991c;
            sVar = this.f5975e0;
            long j10 = sVar.A;
            n1 n1Var = p2Var.f5992d;
            n1 n1Var2 = n1.Horizontal;
            long j11 = this.f5976f0;
            if (n1Var == n1Var2) {
                c4 = x4.q.b(j11);
            } else {
                c4 = x4.q.c(j11);
            }
            float d4 = p2Var.d(c4);
            this.f5973c0 = p2Var;
            this.X = p2Var;
            this.Y = sVar;
            this.Z = j10;
            this.f5972b0 = 1;
            obj = q0Var.a(l2Var, d4, this);
            if (obj == aVar) {
                return aVar;
            }
            j2 = j10;
            p2Var2 = p2Var;
        }
        float d10 = p2Var2.d(((Number) obj).floatValue());
        if (p2Var.f5992d == n1.Horizontal) {
            a10 = x4.q.a(j2, d10, 0.0f, 2);
        } else {
            a10 = x4.q.a(j2, 0.0f, d10, 1);
        }
        sVar.A = a10;
        return yb.y.f14813a;
    }
}
