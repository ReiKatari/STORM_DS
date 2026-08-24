package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ei7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ei7 implements n55 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi7 b;

    public /* synthetic */ ei7(fi7 fi7Var, int i) {
        this.a = i;
        this.b = fi7Var;
    }

    @Override // defpackage.n55
    public final Object get() {
        int i = this.a;
        fi7 fi7Var = this.b;
        switch (i) {
            case 0:
                return (sf0) fi7Var.a.g(((of0) fi7Var.d.getValue()).a);
            default:
                return ((of0) fi7Var.d.getValue()).b;
        }
    }
}
