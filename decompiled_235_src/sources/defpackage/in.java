package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: in  reason: default package */
/* loaded from: classes.dex */
public abstract class in {
    public static final io6 a = ge7.U(RecyclerView.B1, RecyclerView.B1, null, 7);

    static {
        of5 of5Var = vq7.a;
        ge7.U(RecyclerView.B1, RecyclerView.B1, new om1(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final pp6 a(float f, sc7 sc7Var, px0 px0Var, int i, int i2) {
        String str;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        } else {
            str = "switch_knob";
        }
        return c(new om1(f), nw7.g0, sc7Var, null, str, px0Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }

    public static final pp6 b(float f, to toVar, String str, px0 px0Var, int i, int i2) {
        io6 io6Var;
        int i3 = i2 & 2;
        io6 io6Var2 = a;
        if (i3 != 0) {
            toVar = io6Var2;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (toVar == io6Var2) {
            xq2 xq2Var = (xq2) px0Var;
            xq2Var.b0(1144115775);
            boolean c = xq2Var.c(0.01f);
            Object P = xq2Var.P();
            if (c || P == ox0.a) {
                P = ge7.U(RecyclerView.B1, RecyclerView.B1, Float.valueOf(0.01f), 3);
                xq2Var.l0(P);
            }
            xq2Var.p(false);
            io6Var = (io6) P;
        } else {
            xq2 xq2Var2 = (xq2) px0Var;
            xq2Var2.b0(1144225701);
            xq2Var2.p(false);
            io6Var = toVar;
        }
        return c(Float.valueOf(f), nw7.e0, io6Var, null, str2, px0Var, (i << 3) & 57344, 0);
    }

    public static final pp6 c(Object obj, wc7 wc7Var, to toVar, Float f, String str, px0 px0Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        Object obj2 = ox0.a;
        if (P == obj2) {
            P = np2.Y(null);
            xq2Var.l0(P);
        }
        qa4 qa4Var = (qa4) P;
        Object P2 = xq2Var.P();
        if (P2 == obj2) {
            P2 = new gn(obj, wc7Var, f);
            xq2Var.l0(P2);
        }
        gn gnVar = (gn) P2;
        Object b0 = np2.b0(null, xq2Var);
        if (f != null && (toVar instanceof io6)) {
            io6 io6Var = (io6) toVar;
            if (!nb3.k(io6Var.c, f)) {
                toVar = new io6(io6Var.a, io6Var.b, f);
            }
        }
        Object b02 = np2.b0(toVar, xq2Var);
        Object P3 = xq2Var.P();
        if (P3 == obj2) {
            P3 = nb3.c(-1, null, null, 6);
            xq2Var.l0(P3);
        }
        Object obj3 = (ul0) P3;
        boolean h = xq2Var.h(obj3) | xq2Var.h(obj);
        Object P4 = xq2Var.P();
        if (h || P4 == obj2) {
            P4 = new q6(7, obj3, obj);
            xq2Var.l0(P4);
        }
        mb3.n((on2) P4, xq2Var);
        boolean h2 = xq2Var.h(obj3) | xq2Var.h(gnVar) | xq2Var.f(b02) | xq2Var.f(b0);
        Object P5 = xq2Var.P();
        if (h2 || P5 == obj2) {
            Object hnVar = new hn(obj3, gnVar, b02, b0, (r41) null, 0);
            xq2Var.l0(hnVar);
            P5 = hnVar;
        }
        mb3.i(xq2Var, (eo2) P5, obj3);
        pp6 pp6Var = (pp6) qa4Var.getValue();
        if (pp6Var == null) {
            return gnVar.c;
        }
        return pp6Var;
    }
}
