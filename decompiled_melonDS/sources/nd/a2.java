package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a2 extends f1 {

    /* renamed from: c  reason: collision with root package name */
    public static final a2 f10269c = new f1(b2.f10271a);

    @Override // nd.a
    public final int i(Object obj) {
        return ((yb.x) obj).A.length;
    }

    @Override // nd.r, nd.a
    public final void k(md.a aVar, int i2, Object obj) {
        z1 z1Var = (z1) obj;
        z1Var.getClass();
        short A = aVar.k(this.f10304b, i2).A();
        z1Var.b(z1Var.d() + 1);
        short[] sArr = z1Var.f10399a;
        int i10 = z1Var.f10400b;
        z1Var.f10400b = i10 + 1;
        sArr[i10] = A;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nd.z1, java.lang.Object] */
    @Override // nd.a
    public final Object l(Object obj) {
        short[] sArr = ((yb.x) obj).A;
        ?? obj2 = new Object();
        obj2.f10399a = sArr;
        obj2.f10400b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // nd.f1
    public final Object o() {
        return new yb.x(new short[0]);
    }

    @Override // nd.f1
    public final void p(md.b bVar, Object obj, int i2) {
        short[] sArr = ((yb.x) obj).A;
        bVar.getClass();
        for (int i10 = 0; i10 < i2; i10++) {
            ((ij.a) bVar).G(this.f10304b, i10).j(sArr[i10]);
        }
    }
}
