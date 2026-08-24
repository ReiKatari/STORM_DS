package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lc4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lc4 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;

    public /* synthetic */ lc4(String str, int i) {
        this.A = i;
        this.B = str;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        String str = this.B;
        switch (i) {
            case 0:
                return new fc4(str);
            default:
                if (str == null) {
                    str = "";
                }
                return np2.Y(str);
        }
    }
}
