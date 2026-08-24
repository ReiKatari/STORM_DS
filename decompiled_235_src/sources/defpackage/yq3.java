package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yq3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yq3 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ zq3 B;

    public /* synthetic */ yq3(zq3 zq3Var, int i) {
        this.A = i;
        this.B = zq3Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        zq3 zq3Var = this.B;
        switch (i) {
            case 0:
                return Float.valueOf(zq3Var.l0.b());
            case 1:
                return Float.valueOf(zq3Var.l0.d());
            default:
                return Float.valueOf(zq3Var.l0.a() - zq3Var.l0.c());
        }
    }
}
