package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h52  reason: default package */
/* loaded from: classes.dex */
public final class h52 extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ qn2 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h52(int i, qn2 qn2Var) {
        super(1);
        this.B = i;
        this.L = qn2Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.B;
        qn2 qn2Var = this.L;
        switch (i) {
            case 0:
                long j = ((q93) obj).a;
                return new q93((((int) (j & 4294967295L)) & 4294967295L) | (((Number) qn2Var.g(Integer.valueOf((int) (j >> 32)))).intValue() << 32));
            case 1:
                return new i93(((Number) qn2Var.g(Integer.valueOf((int) (((q93) obj).a >> 32)))).intValue() << 32);
            case 2:
                return new i93(((Number) qn2Var.g(Integer.valueOf((int) (((q93) obj).a & 4294967295L)))).intValue() & 4294967295L);
            case 3:
                return new i93(((Number) qn2Var.g(Integer.valueOf((int) (((q93) obj).a >> 32)))).intValue() << 32);
            default:
                return new i93(((Number) qn2Var.g(Integer.valueOf((int) (((q93) obj).a & 4294967295L)))).intValue() & 4294967295L);
        }
    }
}
