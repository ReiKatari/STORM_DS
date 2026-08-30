package j3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements i {
    public final /* synthetic */ int A;
    public final /* synthetic */ q B;

    public /* synthetic */ m(q qVar, int i2) {
        this.A = i2;
        this.B = qVar;
    }

    @Override // j3.i
    public final double a(double d4) {
        switch (this.A) {
            case 0:
                q qVar = this.B;
                return p7.j.e(qVar.f7399k.a(d4), qVar.f7393e, qVar.f7394f);
            default:
                q qVar2 = this.B;
                return qVar2.f7401n.a(p7.j.e(d4, qVar2.f7393e, qVar2.f7394f));
        }
    }
}
