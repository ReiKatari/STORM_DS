package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jz3  reason: default package */
/* loaded from: classes.dex */
public final class jz3 extends aj3 implements on2 {
    public final /* synthetic */ kz3 B;
    public final /* synthetic */ long L;
    public final /* synthetic */ long R;
    public final /* synthetic */ fx4 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz3(kz3 kz3Var, long j, long j2, fx4 fx4Var) {
        super(0);
        this.B = kz3Var;
        this.L = j;
        this.R = j2;
        this.X = fx4Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        kz3 kz3Var = this.B;
        kz3Var.J0().A = false;
        kz3Var.J0().B = this.L;
        kz3Var.J0().L = this.R;
        qn2 c = this.X.A.c();
        if (c != null) {
            c.g(kz3Var.J0());
        }
        return jg7.a;
    }
}
