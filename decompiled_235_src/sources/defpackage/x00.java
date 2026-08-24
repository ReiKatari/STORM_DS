package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x00  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class x00 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ j04 B;

    public /* synthetic */ x00(j04 j04Var, int i) {
        this.A = i;
        this.B = j04Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        j04 j04Var = this.B;
        switch (i) {
            case 0:
                j04Var.a(new vr4(null, new String[]{"image/png", "image/jpeg"}));
                return jg7Var;
            case 1:
                j04Var.a(new String[]{"application/json", "*/*"});
                return jg7Var;
            case 2:
                j04Var.a(new String[]{"*/*"});
                return jg7Var;
            case 3:
                j04Var.a(new vr4(null, null));
                return jg7Var;
            case 4:
                j04Var.a(new vr4(null, null));
                return jg7Var;
            default:
                j04Var.a(new String[]{"application/zip", "application/x-zip-compressed", "application/octet-stream", "application/x-compressed"});
                return jg7Var;
        }
    }
}
