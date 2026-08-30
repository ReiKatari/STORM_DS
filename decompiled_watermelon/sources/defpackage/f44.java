package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f44  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class f44 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;

    public /* synthetic */ f44(String str, int i) {
        this.A = i;
        this.B = str;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        String str = this.B;
        switch (i) {
            case 0:
                return new y34(str);
            default:
                if (str == null) {
                    str = "";
                }
                return me2.G(str);
        }
    }
}
