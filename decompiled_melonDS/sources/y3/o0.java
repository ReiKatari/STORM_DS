package y3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14716a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p0 f14717b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14718c;

    public /* synthetic */ o0(p0 p0Var, Object obj, int i2) {
        this.f14716a = i2;
        this.f14717b = p0Var;
        this.f14718c = obj;
    }

    public h0 b() {
        p0 p0Var = this.f14717b;
        a4.o0 o0Var = (a4.o0) p0Var.f14721d0.g(this.f14718c);
        if (o0Var != null) {
            return (h0) p0Var.Y.g(o0Var);
        }
        return null;
    }

    public final boolean c() {
        n2.i1 i1Var;
        switch (this.f14716a) {
            case 0:
                return true;
            default:
                h0 b10 = b();
                if (b10 != null && (i1Var = b10.f14686f) != null) {
                    return i1Var.c();
                }
                return true;
        }
    }

    private final void a() {
    }
}
