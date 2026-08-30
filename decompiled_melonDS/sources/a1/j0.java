package a1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 extends ec.i implements mc.p {
    public k0 L;
    public l0 R;
    public long[] X;
    public int Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object f57b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ l0 f58c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ k0 f59d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, k0 k0Var, cc.c cVar) {
        super(2, cVar);
        this.f58c0 = l0Var;
        this.f59d0 = k0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((j0) t((cc.c) obj2, (uc.g) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        j0 j0Var = new j0(this.f58c0, this.f59d0, cVar);
        j0Var.f57b0 = obj;
        return j0Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        l0 l0Var;
        long[] jArr;
        int i2;
        k0 k0Var;
        uc.g gVar;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i10 = this.Z;
        if (i10 != 0) {
            if (i10 == 1) {
                int i11 = this.Y;
                long[] jArr2 = this.X;
                l0 l0Var2 = this.R;
                k0Var = this.L;
                gVar = (uc.g) this.f57b0;
                p7.j.I(obj);
                i2 = i11;
                l0Var = l0Var2;
                jArr = jArr2;
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            l0Var = this.f58c0;
            i0 i0Var = l0Var.B;
            jArr = i0Var.f50c;
            i2 = i0Var.f52e;
            k0Var = this.f59d0;
            gVar = (uc.g) this.f57b0;
        }
        while (i2 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i2] >> 31) & 2147483647L);
            k0Var.B = i2;
            Object obj2 = l0Var.B.f49b[i2];
            this.f57b0 = gVar;
            this.L = k0Var;
            this.R = l0Var;
            this.X = jArr;
            this.Y = i12;
            this.Z = 1;
            if (gVar.b(this, obj2) == aVar) {
                return aVar;
            }
            i2 = i12;
        }
        return yb.y.f14813a;
    }
}
