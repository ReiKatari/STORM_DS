package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b04  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b04 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.c04 B;

    public /* synthetic */ b04(defpackage.c04 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r2 = this;
            int r0 = r2.A
            c04 r2 = r2.B
            switch(r0) {
                case 0: goto L2b;
                case 1: goto L23;
                default: goto L7;
            }
        L7:
            vs4 r2 = r2.q0
            java.lang.Object r2 = r2.getValue()
            jk3 r2 = (defpackage.jk3) r2
            if (r2 == 0) goto L18
            r0 = 0
            long r0 = r2.P(r0)
            goto L1d
        L18:
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L1d:
            jk4 r2 = new jk4
            r2.<init>(r0)
            return r2
        L23:
            long r0 = r2.s0
            jk4 r2 = new jk4
            r2.<init>(r0)
            return r2
        L2b:
            r2.T0()
            jg7 r2 = defpackage.jg7.a
            return r2
    }
}
