package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nw0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nw0 implements fo2 {
    public final /* synthetic */ int A;

    public /* synthetic */ nw0(int i) {
        this.A = i;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object sc7Var;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        x64 x64Var = x64.a;
        boolean z2 = false;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue & 17) != 16) {
                    z2 = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z2)) {
                    e33 B = hi2.B();
                    a74 i2 = dj6.i(x64Var, 16.0f);
                    nq6 nq6Var = vt0.a;
                    i13.a(B, null, i2, ((ut0) xq2Var.j(nq6Var)).d(), xq2Var, 432, 0);
                    gi2.h(xq2Var, dj6.l(x64Var, 6.0f));
                    x37.b("Скачать", null, ((ut0) xq2Var.j(nq6Var)).d(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 6, 0, 131066);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z)) {
                    e33 e33Var = vy7.g0;
                    if (e33Var == null) {
                        d33 d33Var = new d33("Filled.FileOpen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = el7.a;
                        cn6 cn6Var = new cn6(kt0.b);
                        ww2 ww2Var = new ww2(1, (byte) 0);
                        ww2Var.o(14.0f, 2.0f);
                        ww2Var.k(6.0f);
                        ww2Var.h(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
                        ww2Var.u(16.0f);
                        ww2Var.i(RecyclerView.B1, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
                        ww2Var.k(15.0f);
                        ww2Var.u(-8.0f);
                        ww2Var.l(5.0f);
                        ww2Var.t(8.0f);
                        ww2Var.m(14.0f, 2.0f);
                        ww2Var.g();
                        ww2Var.o(13.0f, 9.0f);
                        ww2Var.t(3.5f);
                        ww2Var.m(18.5f, 9.0f);
                        ww2Var.k(13.0f);
                        ww2Var.g();
                        ww2Var.o(17.0f, 21.66f);
                        ww2Var.t(16.0f);
                        ww2Var.l(5.66f);
                        ww2Var.u(2.0f);
                        ww2Var.l(-2.24f);
                        ww2Var.n(2.95f, 2.95f);
                        ww2Var.n(-1.41f, 1.41f);
                        ww2Var.m(19.0f, 19.41f);
                        ww2Var.n(RecyclerView.B1, 2.24f);
                        ww2Var.k(17.0f);
                        ww2Var.g();
                        d33.a(d33Var, ww2Var.b, 0, cn6Var);
                        e33Var = d33Var.b();
                        vy7.g0 = e33Var;
                    }
                    e33 e33Var2 = e33Var;
                    nq6 nq6Var2 = vt0.a;
                    i13.a(e33Var2, null, null, ((ut0) xq2Var2.j(nq6Var2)).g(), xq2Var2, 48, 4);
                    gi2.h(xq2Var2, dj6.l(x64Var, 8.0f));
                    x37.b("Установить свой ZIP файл", null, ((ut0) xq2Var2.j(nq6Var2)).g(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 6, 0, 131066);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                g34 g34Var = (g34) obj;
                int r0 = g34Var.r0(10.0f);
                int i4 = r0 * 2;
                dx4 y = ((x24) obj2).y(s21.i(((q21) obj3).a, 0, i4));
                return g34Var.K(y.A, y.B - i4, zt1.A, new fp3(y, r0, 1));
            default:
                aa7 aa7Var = (aa7) obj;
                ((Integer) obj3).getClass();
                xq2 xq2Var3 = (xq2) ((px0) obj2);
                xq2Var3.b0(1849239065);
                z63 z63Var = z63.Focused;
                z63 z63Var2 = z63.UnfocusedEmpty;
                if (aa7Var.b(z63Var, z63Var2)) {
                    sc7Var = ge7.Y(67, 0, ir1.c, 2);
                } else if (!aa7Var.b(z63Var2, z63Var) && !aa7Var.b(z63.UnfocusedNotEmpty, z63Var2)) {
                    sc7Var = ge7.U(RecyclerView.B1, RecyclerView.B1, null, 7);
                } else {
                    sc7Var = new sc7(83, 67, ir1.c);
                }
                xq2Var3.p(false);
                return sc7Var;
        }
    }
}
