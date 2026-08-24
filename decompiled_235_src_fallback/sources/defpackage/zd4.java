package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zd4  reason: default package */
/* loaded from: classes.dex */
public class zd4 extends defpackage.c55 {
    public final /* synthetic */ int Z;
    public final long d0;
    public final defpackage.s35 e0;
    public final defpackage.t90 f0;

    public zd4(long r3, defpackage.s35 r5, defpackage.o45 r6, defpackage.wb6 r7) {
            r2 = this;
            r0 = 1
            r2.Z = r0
            t90 r0 = new t90
            r0.<init>()
            r6.getClass()
            r5.getClass()
            r7.getClass()
            s35 r1 = new s35
            r1.<init>(r0)
            r2.<init>(r6, r1, r7)
            r2.d0 = r3
            r2.e0 = r5
            r2.f0 = r0
            return
    }

    public zd4(defpackage.o45 r2, defpackage.s35 r3, long r4, defpackage.wb6 r6, defpackage.t90 r7) {
            r1 = this;
            r0 = 0
            r1.Z = r0
            r2.getClass()
            r3.getClass()
            r6.getClass()
            s35 r0 = new s35
            r0.<init>(r7)
            r1.<init>(r2, r0, r6)
            r1.e0 = r3
            r1.d0 = r4
            r1.f0 = r7
            return
    }

    @Override // defpackage.c55
    public void t0(defpackage.wb6 r9) {
            r8 = this;
            int r0 = r8.Z
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            s35 r3 = r8.e0
            long r4 = r8.d0
            t90 r8 = r8.f0
            r9.getClass()
            switch(r0) {
                case 0: goto L35;
                default: goto L11;
            }
        L11:
            r6 = 19500(0x4c2c, double:9.6343E-320)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L31
            long r0 = r4 & r1
            int r9 = (int) r0
            r3.getClass()
            r8.getClass()
            java.lang.Object r0 = r3.A
            t90 r0 = (defpackage.t90) r0
            x45 r1 = defpackage.x45.SIZE_DELIMITED
            int r9 = r1.wireIntWithTag(r9)
            defpackage.s35.s(r3, r0, r9)
            r3.H(r8)
            goto L34
        L31:
            r3.H(r8)
        L34:
            return
        L35:
            long r0 = r4 & r1
            int r9 = (int) r0
            r3.getClass()
            r8.getClass()
            java.lang.Object r0 = r3.A
            t90 r0 = (defpackage.t90) r0
            x45 r1 = defpackage.x45.SIZE_DELIMITED
            int r9 = r1.wireIntWithTag(r9)
            defpackage.s35.s(r3, r0, r9)
            r3.H(r8)
            return
    }

    @Override // defpackage.c55
    public long u0(defpackage.wb6 r3, int r4) {
            r2 = this;
            int r0 = r2.Z
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            long r2 = super.u0(r3, r4)
            return r2
        La:
            r3.getClass()
            q45 r2 = defpackage.q45.DEFAULT
            long r2 = r2.getSignature$kotlinx_serialization_protobuf()
            r0 = 1
            long r2 = r2 | r0
            return r2
    }
}
