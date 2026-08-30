package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends f1 {

    /* renamed from: c  reason: collision with root package name */
    public static final i f10314c = new f1(j.f10319a);

    @Override // nd.a
    public final int i(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // nd.r, nd.a
    public final void k(md.a aVar, int i2, Object obj) {
        h hVar = (h) obj;
        hVar.getClass();
        byte z10 = aVar.z(this.f10304b, i2);
        hVar.b(hVar.d() + 1);
        byte[] bArr = hVar.f10310a;
        int i10 = hVar.f10311b;
        hVar.f10311b = i10 + 1;
        bArr[i10] = z10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nd.h, java.lang.Object] */
    @Override // nd.a
    public final Object l(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        ?? obj2 = new Object();
        obj2.f10310a = bArr;
        obj2.f10311b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // nd.f1
    public final Object o() {
        return new byte[0];
    }

    @Override // nd.f1
    public final void p(md.b bVar, Object obj, int i2) {
        byte[] bArr = (byte[]) obj;
        bVar.getClass();
        bArr.getClass();
        for (int i10 = 0; i10 < i2; i10++) {
            byte b10 = bArr[i10];
            ij.a aVar = (ij.a) bVar;
            e1 e1Var = this.f10304b;
            e1Var.getClass();
            aVar.F(e1Var, i10);
            aVar.k(b10);
        }
    }
}
