package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9988a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9989b;

    public /* synthetic */ q(int i2, Object obj) {
        this.f9988a = i2;
        this.f9989b = obj;
    }

    public final void a() {
        switch (this.f9988a) {
            case 0:
                r rVar = (r) this.f9989b;
                rVar.A--;
                return;
            default:
                z2.t tVar = (z2.t) this.f9989b;
                tVar.f14943k--;
                return;
        }
    }

    public final void b() {
        switch (this.f9988a) {
            case 0:
                ((r) this.f9989b).A++;
                return;
            default:
                ((z2.t) this.f9989b).f14943k++;
                return;
        }
    }
}
