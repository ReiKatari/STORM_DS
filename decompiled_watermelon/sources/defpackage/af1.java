package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: af1  reason: default package */
/* loaded from: classes.dex */
public final class af1 implements aj2 {
    public final /* synthetic */ l34 A;
    public final /* synthetic */ ef1 B;
    public final /* synthetic */ jt5 L;
    public final /* synthetic */ xa6 R;
    public final /* synthetic */ df1 X;

    public af1(l34 l34Var, ef1 ef1Var, kt5 kt5Var, xa6 xa6Var, df1 df1Var) {
        this.A = l34Var;
        this.B = ef1Var;
        this.L = kt5Var;
        this.R = xa6Var;
        this.X = df1Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        tu0 tu0Var = (tu0) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            sk2 sk2Var = (sk2) tu0Var;
            if (sk2Var.A()) {
                sk2Var.R();
                return o27.a;
            }
        }
        sk2 sk2Var2 = (sk2) tu0Var;
        l34 l34Var = this.A;
        boolean h = sk2Var2.h(l34Var);
        ef1 ef1Var = this.B;
        boolean h2 = h | sk2Var2.h(ef1Var);
        Object L = sk2Var2.L();
        if (h2 || L == su0.a) {
            L = new cz(this.R, l34Var, ef1Var, 9);
            sk2Var2.h0(L);
        }
        l.d(l34Var, (mi2) L, sk2Var2);
        mj2.a(l34Var, this.L, ct3.H0(-497631156, new ze1(0, this.X, l34Var), sk2Var2), sk2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
        return o27.a;
    }
}
