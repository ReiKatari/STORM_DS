package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a14  reason: default package */
/* loaded from: classes.dex */
public final class a14 extends zd4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a14(long j, s35 s35Var, o45 o45Var, wb6 wb6Var) {
        super(j, s35Var, o45Var, wb6Var);
        o45Var.getClass();
        s35Var.getClass();
        wb6Var.getClass();
    }

    @Override // defpackage.zd4, defpackage.c55
    public final long u0(wb6 wb6Var, int i) {
        long signature$kotlinx_serialization_protobuf;
        long j;
        wb6Var.getClass();
        int i2 = i % 2;
        long j2 = this.d0;
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
