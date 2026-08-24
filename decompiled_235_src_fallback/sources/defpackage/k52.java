package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k52  reason: default package */
/* loaded from: classes.dex */
public final class k52 extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ defpackage.dx4 B;
    public final /* synthetic */ long L;
    public final /* synthetic */ long R;
    public final /* synthetic */ defpackage.ln X;

    public k52(defpackage.dx4 r1, long r2, long r4, defpackage.ln r6) {
            r0 = this;
            r0.B = r1
            r0.L = r2
            r0.R = r4
            r0.X = r6
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r9) {
            r8 = this;
            cx4 r9 = (defpackage.cx4) r9
            long r0 = r8.L
            r2 = 32
            long r3 = r0 >> r2
            int r3 = (int) r3
            long r4 = r8.R
            long r6 = r4 >> r2
            int r6 = (int) r6
            int r3 = r3 + r6
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r6
            int r0 = (int) r0
            long r4 = r4 & r6
            int r1 = (int) r4
            int r0 = r0 + r1
            r9.getClass()
            long r3 = (long) r3
            long r1 = r3 << r2
            long r3 = (long) r0
            long r3 = r3 & r6
            long r0 = r1 | r3
            dx4 r2 = r8.B
            defpackage.cx4.b(r9, r2)
            long r3 = r2.X
            long r0 = defpackage.i93.c(r0, r3)
            r9 = 0
            ln r8 = r8.X
            r2.h0(r0, r9, r8)
            jg7 r8 = defpackage.jg7.a
            return r8
    }
}
