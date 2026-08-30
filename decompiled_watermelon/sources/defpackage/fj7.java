package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fj7  reason: default package */
/* loaded from: classes.dex */
public abstract class fj7 {
    public static ax2 a;

    public static final h06 a(h06 h06Var, vn1 vn1Var) {
        h06Var.getClass();
        vn1Var.getClass();
        if (b53.x(h06Var.c(), l06.h)) {
            ct3.h0(h06Var);
            return h06Var;
        } else if (h06Var.f()) {
            return a(h06Var.j(0), vn1Var);
        } else {
            return h06Var;
        }
    }

    public static final ax2 b() {
        ax2 ax2Var = a;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.Folder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(10.0f, 4.0f);
        vq2Var.k(4.0f);
        vq2Var.i(-1.1f, RecyclerView.A1, -1.99f, 0.9f, -1.99f, 2.0f);
        vq2Var.m(2.0f, 18.0f);
        vq2Var.i(RecyclerView.A1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        vq2Var.l(16.0f);
        vq2Var.i(1.1f, RecyclerView.A1, 2.0f, -0.9f, 2.0f, -2.0f);
        vq2Var.t(8.0f);
        vq2Var.i(RecyclerView.A1, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        vq2Var.l(-8.0f);
        vq2Var.n(-2.0f, -2.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b = zw2Var.b();
        a = b;
        return b;
    }

    public static final ej7 c(t63 t63Var, h06 h06Var) {
        h06Var.getClass();
        ep2 c = h06Var.c();
        if (c instanceof zp4) {
            return ej7.POLY_OBJ;
        }
        if (b53.x(c, kh6.i)) {
            return ej7.LIST;
        }
        if (b53.x(c, kh6.j)) {
            h06 a2 = a(h06Var.j(0), t63Var.b);
            ep2 c2 = a2.c();
            if (!(c2 instanceof tt4) && !b53.x(c2, m06.h)) {
                throw io2.a(a2);
            }
            return ej7.MAP;
        }
        return ej7.OBJ;
    }
}
