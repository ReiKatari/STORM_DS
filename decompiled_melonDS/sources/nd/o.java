package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends f1 {

    /* renamed from: c  reason: collision with root package name */
    public static final o f10340c = new f1(p.f10345a);

    @Override // nd.a
    public final int i(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // nd.r, nd.a
    public final void k(md.a aVar, int i2, Object obj) {
        n nVar = (n) obj;
        nVar.getClass();
        char x9 = aVar.x(this.f10304b, i2);
        nVar.b(nVar.d() + 1);
        char[] cArr = nVar.f10335a;
        int i10 = nVar.f10336b;
        nVar.f10336b = i10 + 1;
        cArr[i10] = x9;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nd.n, java.lang.Object] */
    @Override // nd.a
    public final Object l(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        ?? obj2 = new Object();
        obj2.f10335a = cArr;
        obj2.f10336b = cArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // nd.f1
    public final Object o() {
        return new char[0];
    }

    @Override // nd.f1
    public final void p(md.b bVar, Object obj, int i2) {
        char[] cArr = (char[]) obj;
        bVar.getClass();
        cArr.getClass();
        for (int i10 = 0; i10 < i2; i10++) {
            char c4 = cArr[i10];
            ij.a aVar = (ij.a) bVar;
            e1 e1Var = this.f10304b;
            e1Var.getClass();
            aVar.F(e1Var, i10);
            aVar.q(c4);
        }
    }
}
