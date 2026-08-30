package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends f1 {

    /* renamed from: c  reason: collision with root package name */
    public static final t f10366c = new f1(u.f10370a);

    @Override // nd.a
    public final int i(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // nd.r, nd.a
    public final void k(md.a aVar, int i2, Object obj) {
        s sVar = (s) obj;
        sVar.getClass();
        double y10 = aVar.y(this.f10304b, i2);
        sVar.b(sVar.d() + 1);
        double[] dArr = sVar.f10358a;
        int i10 = sVar.f10359b;
        sVar.f10359b = i10 + 1;
        dArr[i10] = y10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nd.s, java.lang.Object] */
    @Override // nd.a
    public final Object l(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        ?? obj2 = new Object();
        obj2.f10358a = dArr;
        obj2.f10359b = dArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // nd.f1
    public final Object o() {
        return new double[0];
    }

    @Override // nd.f1
    public final void p(md.b bVar, Object obj, int i2) {
        double[] dArr = (double[]) obj;
        bVar.getClass();
        dArr.getClass();
        for (int i10 = 0; i10 < i2; i10++) {
            double d4 = dArr[i10];
            ij.a aVar = (ij.a) bVar;
            e1 e1Var = this.f10304b;
            e1Var.getClass();
            aVar.F(e1Var, i10);
            aVar.i(d4);
        }
    }
}
