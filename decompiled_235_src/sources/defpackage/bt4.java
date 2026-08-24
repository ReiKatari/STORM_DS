package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bt4  reason: default package */
/* loaded from: classes.dex */
public final class bt4 implements ud5, jz4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bt4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jz4
    public final Object b(String str, qn2 qn2Var, s41 s41Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((ft4) obj).b(str, qn2Var, s41Var);
            default:
                return ((rz4) obj).b(str, qn2Var, s41Var);
        }
    }

    @Override // defpackage.ud5
    public final e36 d() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((ft4) obj).b;
            default:
                return ((rz4) obj).b;
        }
    }
}
