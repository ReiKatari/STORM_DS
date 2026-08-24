package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oz6  reason: default package */
/* loaded from: classes.dex */
public final class oz6 extends lz6 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ on2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz6(String str, on2 on2Var) {
        super(str, true);
        this.f = on2Var;
    }

    @Override // defpackage.lz6
    public final long a() {
        int i = this.e;
        on2 on2Var = this.f;
        switch (i) {
            case 0:
                on2Var.c();
                return -1L;
            default:
                return ((Number) on2Var.c()).longValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz6(String str, boolean z, on2 on2Var) {
        super(str, z);
        this.f = on2Var;
    }
}
