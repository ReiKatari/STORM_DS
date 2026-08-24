package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class d4 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ es7 B;

    public /* synthetic */ d4(es7 es7Var, int i) {
        this.A = i;
        this.B = es7Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        x64 x64Var = x64.a;
        jg7 jg7Var = jg7.a;
        es7 es7Var = this.B;
        boolean z3 = false;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z3)) {
                    i13.a(ej2.G(), null, dj6.i(x64Var, 15.0f), es7Var.i, xq2Var, 432, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z)) {
                    e33 e33Var = g04.k;
                    if (e33Var == null) {
                        d33 d33Var = new d33("Filled.Clear", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = el7.a;
                        cn6 cn6Var = new cn6(kt0.b);
                        ww2 ww2Var = new ww2(1, (byte) 0);
                        ww2Var.o(19.0f, 6.41f);
                        ww2Var.m(17.59f, 5.0f);
                        ww2Var.m(12.0f, 10.59f);
                        ww2Var.m(6.41f, 5.0f);
                        ww2Var.m(5.0f, 6.41f);
                        ww2Var.m(10.59f, 12.0f);
                        ww2Var.m(5.0f, 17.59f);
                        ww2Var.m(6.41f, 19.0f);
                        ww2Var.m(12.0f, 13.41f);
                        ww2Var.m(17.59f, 19.0f);
                        ww2Var.m(19.0f, 17.59f);
                        ww2Var.m(13.41f, 12.0f);
                        ww2Var.g();
                        d33.a(d33Var, ww2Var.b, 0, cn6Var);
                        e33Var = d33Var.b();
                        g04.k = e33Var;
                    }
                    i13.a(e33Var, yh2.O(xq2Var2, R.string.clear), null, es7Var.h, xq2Var2, 0, 4);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z3)) {
                    i13.b(kj2.R(xq2Var3, R.drawable.ic_folder), yh2.O(xq2Var3, R.string.action_layout_import), null, es7Var.g, xq2Var3, 8, 4);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 3:
                px0 px0Var4 = (px0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(intValue4 & 1, z3)) {
                    i13.b(kn2.Z(hv.E(), xq2Var4), yh2.O(xq2Var4, R.string.action_layouts_new), null, es7Var.g, xq2Var4, 8, 4);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 4:
                px0 px0Var5 = (px0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(intValue5 & 1, z3)) {
                    i13.a(ej2.H(), yh2.O(xq2Var5, R.string.settings), dj6.i(x64Var, 22.0f), es7Var.h, xq2Var5, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            case 5:
                px0 px0Var6 = (px0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var6 = (xq2) px0Var6;
                if (xq2Var6.S(intValue6 & 1, z3)) {
                    i13.a(oi2.A(), null, dj6.i(x64Var, 22.0f), es7Var.h, xq2Var6, 432, 0);
                } else {
                    xq2Var6.V();
                }
                return jg7Var;
            case 6:
                px0 px0Var7 = (px0) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var7 = (xq2) px0Var7;
                if (xq2Var7.S(intValue7 & 1, z3)) {
                    i13.a(ej2.H(), yh2.O(xq2Var7, R.string.settings), dj6.i(x64Var, 22.0f), es7Var.h, xq2Var7, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                } else {
                    xq2Var7.V();
                }
                return jg7Var;
            case 7:
                px0 px0Var8 = (px0) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var8 = (xq2) px0Var8;
                if (xq2Var8.S(intValue8 & 1, z3)) {
                    i13.a(jw2.q(), null, dj6.i(x64Var, 22.0f), es7Var.h, xq2Var8, 432, 0);
                } else {
                    xq2Var8.V();
                }
                return jg7Var;
            case 8:
                px0 px0Var9 = (px0) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var9 = (xq2) px0Var9;
                if (xq2Var9.S(intValue9 & 1, z3)) {
                    i13.a(n16.y(), null, dj6.i(x64Var, 20.0f), es7Var.h, xq2Var9, 432, 0);
                } else {
                    xq2Var9.V();
                }
                return jg7Var;
            case 9:
                px0 px0Var10 = (px0) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var10 = (xq2) px0Var10;
                if (xq2Var10.S(intValue10 & 1, z2)) {
                    e33 e33Var2 = hi2.m;
                    if (e33Var2 == null) {
                        d33 d33Var2 = new d33("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = el7.a;
                        cn6 cn6Var2 = new cn6(kt0.b);
                        ww2 ww2Var2 = new ww2(1, (byte) 0);
                        ww2Var2.o(15.5f, 14.0f);
                        ww2Var2.l(-0.79f);
                        ww2Var2.n(-0.28f, -0.27f);
                        ww2Var2.h(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
                        ww2Var2.h(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
                        ww2Var2.p(3.0f, 5.91f, 3.0f, 9.5f);
                        ww2Var2.p(5.91f, 16.0f, 9.5f, 16.0f);
                        ww2Var2.i(1.61f, RecyclerView.B1, 3.09f, -0.59f, 4.23f, -1.57f);
                        ww2Var2.n(0.27f, 0.28f);
                        ww2Var2.u(0.79f);
                        ww2Var2.n(5.0f, 4.99f);
                        ww2Var2.m(20.49f, 19.0f);
                        ww2Var2.n(-4.99f, -5.0f);
                        ww2Var2.g();
                        ww2Var2.o(9.5f, 14.0f);
                        ww2Var2.h(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
                        ww2Var2.p(7.01f, 5.0f, 9.5f, 5.0f);
                        ww2Var2.p(14.0f, 7.01f, 14.0f, 9.5f);
                        ww2Var2.p(11.99f, 14.0f, 9.5f, 14.0f);
                        ww2Var2.g();
                        d33.a(d33Var2, ww2Var2.b, 0, cn6Var2);
                        e33Var2 = d33Var2.b();
                        hi2.m = e33Var2;
                    }
                    i13.a(e33Var2, yh2.O(xq2Var10, R.string.action_search_roms), dj6.i(x64Var, 22.0f), es7Var.h, xq2Var10, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                } else {
                    xq2Var10.V();
                }
                return jg7Var;
            case 10:
                px0 px0Var11 = (px0) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var11 = (xq2) px0Var11;
                if (xq2Var11.S(intValue11 & 1, z3)) {
                    i13.a(oi2.A(), yh2.O(xq2Var11, R.string.rom_config), dj6.i(x64Var, 19.0f), es7Var.i, xq2Var11, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                } else {
                    xq2Var11.V();
                }
                return jg7Var;
            case 11:
                px0 px0Var12 = (px0) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var12 = (xq2) px0Var12;
                if (xq2Var12.S(intValue12 & 1, z3)) {
                    x37.b("Название сохранения", null, es7Var.i, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var12, 6, 0, 131066);
                } else {
                    xq2Var12.V();
                }
                return jg7Var;
            default:
                px0 px0Var13 = (px0) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var13 = (xq2) px0Var13;
                if (xq2Var13.S(intValue13 & 1, z3)) {
                    x37.b("Например: Перед боссом 3", null, kt0.c(0.6f, es7Var.i), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var13, 6, 0, 131066);
                } else {
                    xq2Var13.V();
                }
                return jg7Var;
        }
    }
}
