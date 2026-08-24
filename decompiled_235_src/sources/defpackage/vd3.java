package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vd3 implements lk7 {
    public static final vd3 b = new vd3(0);
    public static final vd3 c = new vd3(1);
    public final /* synthetic */ int a;

    public /* synthetic */ vd3(int i) {
        this.a = i;
    }

    @Override // defpackage.y32
    public final void encode(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                wd3 wd3Var = xd3.e;
                ((mk7) obj2).add((String) obj);
                return;
            default:
                wd3 wd3Var2 = xd3.e;
                ((mk7) obj2).add(((Boolean) obj).booleanValue());
                return;
        }
    }
}
