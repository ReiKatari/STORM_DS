package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ q1 B;

    public /* synthetic */ s1(q1 q1Var, int i2) {
        this.A = i2;
        this.B = q1Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        n2.h0 h0Var = (n2.h0) obj;
        switch (this.A) {
            case 0:
                return new t1(this.B, 0);
            default:
                return new t1(this.B, 1);
        }
    }
}
