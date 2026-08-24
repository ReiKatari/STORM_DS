package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zd4  reason: default package */
/* loaded from: classes.dex */
public class zd4 extends c55 {
    public final /* synthetic */ int Z = 1;
    public final long d0;
    public final s35 e0;
    public final t90 f0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zd4(long j, s35 s35Var, o45 o45Var, wb6 wb6Var) {
        super(o45Var, new s35(r0), wb6Var);
        t90 t90Var = new t90();
        o45Var.getClass();
        s35Var.getClass();
        wb6Var.getClass();
        this.d0 = j;
        this.e0 = s35Var;
        this.f0 = t90Var;
    }

    @Override // defpackage.c55
    public void t0(wb6 wb6Var) {
        int i = this.Z;
        s35 s35Var = this.e0;
        long j = this.d0;
        t90 t90Var = this.f0;
        wb6Var.getClass();
        switch (i) {
            case 0:
                s35Var.getClass();
                t90Var.getClass();
                s35.s(s35Var, (t90) s35Var.A, x45.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
                s35Var.H(t90Var);
                return;
            default:
                if (j != 19500) {
                    s35Var.getClass();
                    t90Var.getClass();
                    s35.s(s35Var, (t90) s35Var.A, x45.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
                    s35Var.H(t90Var);
                    return;
                }
                s35Var.H(t90Var);
                return;
        }
    }

    @Override // defpackage.c55
    public long u0(wb6 wb6Var, int i) {
        switch (this.Z) {
            case 0:
                wb6Var.getClass();
                return q45.DEFAULT.getSignature$kotlinx_serialization_protobuf() | 1;
            default:
                return super.u0(wb6Var, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd4(o45 o45Var, s35 s35Var, long j, wb6 wb6Var, t90 t90Var) {
        super(o45Var, new s35(t90Var), wb6Var);
        o45Var.getClass();
        s35Var.getClass();
        wb6Var.getClass();
        this.e0 = s35Var;
        this.d0 = j;
        this.f0 = t90Var;
    }
}
