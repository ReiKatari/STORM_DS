package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fn3  reason: default package */
/* loaded from: classes.dex */
public final class fn3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn3 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fn3(gn3 gn3Var, Object obj, int i) {
        this.a = i;
        this.b = gn3Var;
        this.c = obj;
    }

    public ym3 b() {
        gn3 gn3Var = this.b;
        sm3 sm3Var = (sm3) gn3Var.f0.g(this.c);
        if (sm3Var != null) {
            return (ym3) gn3Var.Y.g(sm3Var);
        }
        return null;
    }

    public final boolean c() {
        tu4 tu4Var;
        switch (this.a) {
            case 0:
                return true;
            default:
                ym3 b = b();
                if (b == null || (tu4Var = b.f) == null) {
                    return true;
                }
                return tu4Var.c();
        }
    }

    private final void a() {
    }
}
