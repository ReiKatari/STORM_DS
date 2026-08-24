package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j65  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j65 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ n65 B;

    public /* synthetic */ j65(n65 n65Var, int i) {
        this.A = i;
        this.B = n65Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        n65 n65Var = this.B;
        switch (i) {
            case 0:
                float a = n65Var.a() / n65Var.g.h();
                float f = 1.0f;
                if (a < 1.0f) {
                    f = 0.3f;
                }
                return Float.valueOf(f);
            default:
                return Float.valueOf(n65Var.f.h() * 0.5f);
        }
    }
}
