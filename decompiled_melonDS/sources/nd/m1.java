package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m1 extends f1 {

    /* renamed from: c  reason: collision with root package name */
    public static final m1 f10334c = new f1(n1.f10338a);

    @Override // nd.a
    public final int i(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // nd.r, nd.a
    public final void k(md.a aVar, int i2, Object obj) {
        l1 l1Var = (l1) obj;
        l1Var.getClass();
        short l10 = aVar.l(this.f10304b, i2);
        l1Var.b(l1Var.d() + 1);
        short[] sArr = l1Var.f10330a;
        int i10 = l1Var.f10331b;
        l1Var.f10331b = i10 + 1;
        sArr[i10] = l10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nd.l1, java.lang.Object] */
    @Override // nd.a
    public final Object l(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        ?? obj2 = new Object();
        obj2.f10330a = sArr;
        obj2.f10331b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // nd.f1
    public final Object o() {
        return new short[0];
    }

    @Override // nd.f1
    public final void p(md.b bVar, Object obj, int i2) {
        short[] sArr = (short[]) obj;
        bVar.getClass();
        sArr.getClass();
        for (int i10 = 0; i10 < i2; i10++) {
            short s10 = sArr[i10];
            ij.a aVar = (ij.a) bVar;
            e1 e1Var = this.f10304b;
            e1Var.getClass();
            aVar.F(e1Var, i10);
            aVar.j(s10);
        }
    }
}
