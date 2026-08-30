package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ax4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ax4 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ex4 B;

    public /* synthetic */ ax4(ex4 ex4Var, int i) {
        this.A = i;
        this.B = ex4Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        ex4 ex4Var = this.B;
        switch (i) {
            case 0:
                float a = ex4Var.a() / ex4Var.g.h();
                float f = 1.0f;
                if (a < 1.0f) {
                    f = 0.3f;
                }
                return Float.valueOf(f);
            default:
                return Float.valueOf(ex4Var.f.h() * 0.5f);
        }
    }
}
