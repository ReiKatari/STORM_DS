package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends f1 {

    /* renamed from: c  reason: collision with root package name */
    public static final f f10299c = new f1(g.f10305a);

    @Override // nd.a
    public final int i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // nd.r, nd.a
    public final void k(md.a aVar, int i2, Object obj) {
        e eVar = (e) obj;
        eVar.getClass();
        boolean w10 = aVar.w(this.f10304b, i2);
        eVar.b(eVar.d() + 1);
        boolean[] zArr = eVar.f10293a;
        int i10 = eVar.f10294b;
        eVar.f10294b = i10 + 1;
        zArr[i10] = w10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nd.e] */
    @Override // nd.a
    public final Object l(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        ?? obj2 = new Object();
        obj2.f10293a = zArr;
        obj2.f10294b = zArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // nd.f1
    public final Object o() {
        return new boolean[0];
    }

    @Override // nd.f1
    public final void p(md.b bVar, Object obj, int i2) {
        boolean[] zArr = (boolean[]) obj;
        bVar.getClass();
        zArr.getClass();
        for (int i10 = 0; i10 < i2; i10++) {
            ((ij.a) bVar).E(this.f10304b, i10, zArr[i10]);
        }
    }
}
