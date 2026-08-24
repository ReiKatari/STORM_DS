package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej1  reason: default package */
/* loaded from: classes.dex */
public final class ej1 implements eo2 {
    public final /* synthetic */ sb4 A;
    public final /* synthetic */ ij1 B;
    public final /* synthetic */ o46 L;
    public final /* synthetic */ mm6 R;
    public final /* synthetic */ hj1 X;

    public ej1(sb4 sb4Var, ij1 ij1Var, p46 p46Var, mm6 mm6Var, hj1 hj1Var) {
        this.A = sb4Var;
        this.B = ij1Var;
        this.L = p46Var;
        this.R = mm6Var;
        this.X = hj1Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        px0 px0Var = (px0) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            xq2 xq2Var = (xq2) px0Var;
            if (xq2Var.E()) {
                xq2Var.V();
                return jg7.a;
            }
        }
        xq2 xq2Var2 = (xq2) px0Var;
        sb4 sb4Var = this.A;
        boolean h = xq2Var2.h(sb4Var);
        ij1 ij1Var = this.B;
        boolean h2 = h | xq2Var2.h(ij1Var);
        Object P = xq2Var2.P();
        if (h2 || P == ox0.a) {
            P = new t00(this.R, sb4Var, ij1Var, 9);
            xq2Var2.l0(P);
        }
        mb3.d(sb4Var, (qn2) P, xq2Var2);
        kn2.f(sb4Var, this.L, n16.I(-497631156, new dj1(0, this.X, sb4Var), xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
        return jg7.a;
    }
}
