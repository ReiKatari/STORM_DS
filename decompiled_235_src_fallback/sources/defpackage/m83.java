package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m83  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class m83 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.dx4 L;
    public final /* synthetic */ int R;

    public /* synthetic */ m83(int r2, defpackage.dx4 r3, int r4) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            return
    }

    public /* synthetic */ m83(defpackage.dx4 r1, int r2, int r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.L = r1
            r0.B = r2
            r0.R = r3
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.A
            jg7 r1 = defpackage.jg7.a
            int r2 = r5.R
            int r3 = r5.B
            dx4 r5 = r5.L
            cx4 r6 = (defpackage.cx4) r6
            switch(r0) {
                case 0: goto L2b;
                case 1: goto L13;
                default: goto Lf;
            }
        Lf:
            defpackage.cx4.j(r6, r5, r3, r2)
            return r1
        L13:
            int r0 = r5.A
            int r3 = r3 - r0
            float r0 = (float) r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r3
            int r0 = defpackage.u24.E(r0)
            int r4 = r5.B
            int r2 = r2 - r4
            float r2 = (float) r2
            float r2 = r2 / r3
            int r2 = defpackage.u24.E(r2)
            defpackage.cx4.j(r6, r5, r0, r2)
            return r1
        L2b:
            defpackage.cx4.j(r6, r5, r3, r2)
            return r1
    }
}
