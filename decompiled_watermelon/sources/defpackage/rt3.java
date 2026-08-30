package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rt3  reason: default package */
/* loaded from: classes.dex */
public final class rt3 extends tv4 {
    public final long f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt3(hv4 hv4Var, xv4 xv4Var, long j, h06 h06Var) {
        super(hv4Var, xv4Var, h06Var);
        h06Var.getClass();
        this.f0 = j;
    }

    @Override // defpackage.tv4
    public final long x0(h06 h06Var, int i) {
        long signature$kotlinx_serialization_protobuf;
        long j;
        h06Var.getClass();
        int i2 = i % 2;
        long j2 = this.f0;
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
