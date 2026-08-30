package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t54  reason: default package */
/* loaded from: classes.dex */
public class t54 extends vv4 {
    public final /* synthetic */ int Z = 1;
    public final long c0;
    public final ka3 d0;
    public final m70 e0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t54(long r4, defpackage.ka3 r6, defpackage.hv4 r7, defpackage.h06 r8) {
        /*
            r3 = this;
            r0 = 1
            r3.Z = r0
            m70 r0 = new m70
            r0.<init>()
            r7.getClass()
            r6.getClass()
            r8.getClass()
            ka3 r1 = new ka3
            r2 = 28
            r1.<init>(r2, r0)
            r3.<init>(r7, r1, r8)
            r3.c0 = r4
            r3.d0 = r6
            r3.e0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t54.<init>(long, ka3, hv4, h06):void");
    }

    @Override // defpackage.vv4
    public void t0(h06 h06Var) {
        int i = this.Z;
        ka3 ka3Var = this.d0;
        long j = this.c0;
        m70 m70Var = this.e0;
        h06Var.getClass();
        switch (i) {
            case 0:
                ka3Var.getClass();
                m70Var.getClass();
                ka3.u(ka3Var, (m70) ka3Var.B, qv4.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
                ka3Var.M(m70Var);
                return;
            default:
                if (j != 19500) {
                    ka3Var.getClass();
                    m70Var.getClass();
                    ka3.u(ka3Var, (m70) ka3Var.B, qv4.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
                    ka3Var.M(m70Var);
                    return;
                }
                ka3Var.M(m70Var);
                return;
        }
    }

    @Override // defpackage.vv4
    public long u0(h06 h06Var, int i) {
        switch (this.Z) {
            case 0:
                h06Var.getClass();
                return jv4.DEFAULT.getSignature$kotlinx_serialization_protobuf() | 1;
            default:
                return super.u0(h06Var, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t54(hv4 hv4Var, ka3 ka3Var, long j, h06 h06Var, m70 m70Var) {
        super(hv4Var, new ka3(28, m70Var), h06Var);
        hv4Var.getClass();
        ka3Var.getClass();
        h06Var.getClass();
        this.d0 = ka3Var;
        this.c0 = j;
        this.e0 = m70Var;
    }
}
