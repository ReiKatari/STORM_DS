package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u04  reason: default package */
/* loaded from: classes.dex */
public final class u04 extends a55 {
    public final long g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u04(o45 o45Var, e55 e55Var, long j, wb6 wb6Var) {
        super(o45Var, e55Var, wb6Var);
        wb6Var.getClass();
        this.g0 = j;
    }

    @Override // defpackage.a55
    public final long x0(wb6 wb6Var, int i) {
        long signature$kotlinx_serialization_protobuf;
        long j;
        wb6Var.getClass();
        int i2 = i % 2;
        long j2 = this.g0;
        if (i2 == 0) {
            signature$kotlinx_serialization_protobuf = mp2.I(j2).getSignature$kotlinx_serialization_protobuf();
            j = 1;
        } else {
            signature$kotlinx_serialization_protobuf = mp2.I(j2).getSignature$kotlinx_serialization_protobuf();
            j = 2;
        }
        return signature$kotlinx_serialization_protobuf | j;
    }
}
