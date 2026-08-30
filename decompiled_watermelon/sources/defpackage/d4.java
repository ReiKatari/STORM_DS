package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class d4 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ jd7 B;

    public /* synthetic */ d4(jd7 jd7Var, int i) {
        this.A = i;
        this.B = jd7Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        wy3 wy3Var = wy3.a;
        o27 o27Var = o27.a;
        jd7 jd7Var = this.B;
        boolean z2 = false;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z2)) {
                    ev2.a(hk2.C(), null, o76.h(wy3Var, 15.0f), jd7Var.i, sk2Var, 432, 0);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z2)) {
                    ev2.b(jk2.P(l07.L(), sk2Var2), me2.X(sk2Var2, R.string.action_layouts_new), null, jd7Var.g, sk2Var2, 8, 4);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 2:
                tu0 tu0Var3 = (tu0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (sk2Var3.O(intValue3 & 1, z2)) {
                    ev2.a(oo2.J(), null, o76.h(wy3Var, 22.0f), jd7Var.h, sk2Var3, 432, 0);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            case 3:
                tu0 tu0Var4 = (tu0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var4 = (sk2) tu0Var4;
                if (sk2Var4.O(intValue4 & 1, z2)) {
                    ev2.a(cg2.J(), me2.X(sk2Var4, R.string.settings), o76.h(wy3Var, 22.0f), jd7Var.h, sk2Var4, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                } else {
                    sk2Var4.R();
                }
                return o27Var;
            case 4:
                tu0 tu0Var5 = (tu0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var5 = (sk2) tu0Var5;
                if (sk2Var5.O(intValue5 & 1, z2)) {
                    ev2.a(se.A(), null, o76.h(wy3Var, 22.0f), jd7Var.h, sk2Var5, 432, 0);
                } else {
                    sk2Var5.R();
                }
                return o27Var;
            case 5:
                tu0 tu0Var6 = (tu0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var6 = (sk2) tu0Var6;
                if (sk2Var6.O(intValue6 & 1, z2)) {
                    ev2.a(ct3.i0(), null, o76.h(wy3Var, 20.0f), jd7Var.h, sk2Var6, 432, 0);
                } else {
                    sk2Var6.R();
                }
                return o27Var;
            case ig7.b /* 6 */:
                tu0 tu0Var7 = (tu0) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var7 = (sk2) tu0Var7;
                if (sk2Var7.O(intValue7 & 1, z)) {
                    ax2 ax2Var = yf2.d;
                    if (ax2Var == null) {
                        zw2 zw2Var = new zw2("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = f77.a;
                        mb6 mb6Var = new mb6(xq0.b);
                        vq2 vq2Var = new vq2(1, (byte) 0);
                        vq2Var.o(15.5f, 14.0f);
                        vq2Var.l(-0.79f);
                        vq2Var.n(-0.28f, -0.27f);
                        vq2Var.h(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
                        vq2Var.h(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
                        vq2Var.p(3.0f, 5.91f, 3.0f, 9.5f);
                        vq2Var.p(5.91f, 16.0f, 9.5f, 16.0f);
                        vq2Var.i(1.61f, RecyclerView.A1, 3.09f, -0.59f, 4.23f, -1.57f);
                        vq2Var.n(0.27f, 0.28f);
                        vq2Var.u(0.79f);
                        vq2Var.n(5.0f, 4.99f);
                        vq2Var.m(20.49f, 19.0f);
                        vq2Var.n(-4.99f, -5.0f);
                        vq2Var.g();
                        vq2Var.o(9.5f, 14.0f);
                        vq2Var.h(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
                        vq2Var.p(7.01f, 5.0f, 9.5f, 5.0f);
                        vq2Var.p(14.0f, 7.01f, 14.0f, 9.5f);
                        vq2Var.p(11.99f, 14.0f, 9.5f, 14.0f);
                        vq2Var.g();
                        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
                        ax2Var = zw2Var.b();
                        yf2.d = ax2Var;
                    }
                    ev2.a(ax2Var, me2.X(sk2Var7, R.string.action_search_roms), o76.h(wy3Var, 22.0f), jd7Var.h, sk2Var7, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                } else {
                    sk2Var7.R();
                }
                return o27Var;
            default:
                tu0 tu0Var8 = (tu0) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var8 = (sk2) tu0Var8;
                if (sk2Var8.O(intValue8 & 1, z2)) {
                    ev2.a(oo2.J(), me2.X(sk2Var8, R.string.rom_config), o76.h(wy3Var, 19.0f), jd7Var.i, sk2Var8, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                } else {
                    sk2Var8.R();
                }
                return o27Var;
        }
    }
}
