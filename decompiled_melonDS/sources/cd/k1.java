package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k1 implements j1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2837a;

    @Override // cd.j1
    public final h a(dd.a0 a0Var) {
        switch (this.f2837a) {
            case 0:
                return new a9.i(2, g1.START);
            default:
                return new z0(new a5.o(21, null, a0Var));
        }
    }

    public final String toString() {
        switch (this.f2837a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
