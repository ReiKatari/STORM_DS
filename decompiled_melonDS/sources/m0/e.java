package m0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements b5.j {
    public final /* synthetic */ int A;
    public final /* synthetic */ ta.a B;

    public /* synthetic */ e(ta.a aVar, int i2) {
        this.A = i2;
        this.B = aVar;
    }

    @Override // b5.j
    public final Object h(b5.i iVar) {
        switch (this.A) {
            case 0:
                a8.f fVar = new a8.f(20, iVar);
                l0.a D = ij.a.D();
                ta.a aVar = this.B;
                aVar.a(fVar, D);
                return "transformVoidFuture [" + aVar + "]";
            default:
                l0.a D2 = ij.a.D();
                ta.a aVar2 = this.B;
                i.f(false, aVar2, iVar, D2);
                return "nonCancellationPropagating[" + aVar2 + "]";
        }
    }
}
