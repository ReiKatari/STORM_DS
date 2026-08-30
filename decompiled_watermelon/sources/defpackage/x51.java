package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x51  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class x51 implements bj2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ ki2 B;
    public final /* synthetic */ mi2 L;

    public /* synthetic */ x51(ki2 ki2Var, mi2 mi2Var) {
        this.B = ki2Var;
        this.L = mi2Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        boolean z = false;
        o27 o27Var = o27.a;
        sn1 sn1Var = su0.a;
        mi2 mi2Var = this.L;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((mr0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    String X = me2.X(sk2Var, R.string.dsiware_manager_import_data);
                    boolean f = sk2Var.f(mi2Var);
                    Object L = sk2Var.L();
                    if (f || L == sn1Var) {
                        L = new v51(6, mi2Var);
                        sk2Var.h0(L);
                    }
                    n40.h(X, false, false, (ki2) L, sk2Var, 0, 6);
                    String X2 = me2.X(sk2Var, R.string.dsiware_manager_export_data);
                    boolean f2 = sk2Var.f(mi2Var);
                    Object L2 = sk2Var.L();
                    if (f2 || L2 == sn1Var) {
                        L2 = new v51(7, mi2Var);
                        sk2Var.h0(L2);
                    }
                    n40.h(X2, false, false, (ki2) L2, sk2Var, 0, 6);
                    n40.h(me2.X(sk2Var, R.string.delete), false, true, this.B, sk2Var, RendererDebugBridge.CAPTURE_HEIGHT, 2);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                zy3 zy3Var = (zy3) obj;
                ((Integer) obj3).getClass();
                sk2 sk2Var2 = (sk2) ((tu0) obj2);
                sk2Var2.X(759876635);
                Object L3 = sk2Var2.L();
                if (L3 == sn1Var) {
                    L3 = me2.q(this.B);
                    sk2Var2.h0(L3);
                }
                ae6 ae6Var = (ae6) L3;
                Object L4 = sk2Var2.L();
                if (L4 == sn1Var) {
                    L4 = new um(new mb4(((mb4) ae6Var.getValue()).a), bz5.b, new mb4(bz5.c), 8);
                    sk2Var2.h0(L4);
                }
                um umVar = (um) L4;
                boolean h = sk2Var2.h(umVar);
                Object L5 = sk2Var2.L();
                if (h || L5 == sn1Var) {
                    L5 = new zw5(ae6Var, umVar, null, 1);
                    sk2Var2.h0(L5);
                }
                l.g(sk2Var2, (aj2) L5, o27Var);
                io ioVar = umVar.c;
                boolean f3 = sk2Var2.f(ioVar);
                Object L6 = sk2Var2.L();
                if (f3 || L6 == sn1Var) {
                    L6 = new q44(ioVar, 1);
                    sk2Var2.h0(L6);
                }
                zy3 zy3Var2 = (zy3) mi2Var.n((ki2) L6);
                sk2Var2.p(false);
                return zy3Var2;
        }
    }

    public /* synthetic */ x51(mi2 mi2Var, ki2 ki2Var) {
        this.L = mi2Var;
        this.B = ki2Var;
    }
}
