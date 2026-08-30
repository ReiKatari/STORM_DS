package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xt3  reason: default package */
/* loaded from: classes.dex */
public final class xt3 extends t54 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt3(long j, ka3 ka3Var, hv4 hv4Var, h06 h06Var) {
        super(j, ka3Var, hv4Var, h06Var);
        hv4Var.getClass();
        ka3Var.getClass();
        h06Var.getClass();
    }

    @Override // defpackage.t54, defpackage.vv4
    public final long u0(h06 h06Var, int i) {
        long signature$kotlinx_serialization_protobuf;
        long j;
        h06Var.getClass();
        int i2 = i % 2;
        long j2 = this.c0;
        if (i2 == 0) {
            signature$kotlinx_serialization_protobuf = gk2.P(j2).getSignature$kotlinx_serialization_protobuf();
            j = 1;
        } else {
            signature$kotlinx_serialization_protobuf = gk2.P(j2).getSignature$kotlinx_serialization_protobuf();
            j = 2;
        }
        return signature$kotlinx_serialization_protobuf | j;
    }
}
