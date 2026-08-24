package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cx1  reason: default package */
/* loaded from: classes.dex */
public final class cx1 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ jq B;

    public /* synthetic */ cx1(jq jqVar, int i) {
        this.A = i;
        this.B = jqVar;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jq jqVar = this.B;
        switch (i) {
            case 0:
                return jqVar.getDefaultViewModelProviderFactory();
            case 1:
                return jqVar.getViewModelStore();
            default:
                return jqVar.getDefaultViewModelCreationExtras();
        }
    }
}
