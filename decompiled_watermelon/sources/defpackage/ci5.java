package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ci5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ci5 implements bj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ri5 B;
    public final /* synthetic */ mi2 L;

    public /* synthetic */ ci5(ri5 ri5Var, mi2 mi2Var, int i) {
        this.A = i;
        this.B = ri5Var;
        this.L = mi2Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z = false;
        ri5 ri5Var = this.B;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ni3) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    nk2.f(ri5Var.g, this.L, null, sk2Var, 0, 4);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((th3) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z)) {
                    nk2.f(ri5Var.g, this.L, b53.b0(wy3.a, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14), sk2Var2, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
