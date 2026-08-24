package defpackage;

import android.content.Context;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ft7  reason: default package */
/* loaded from: classes.dex */
public abstract class ft7 {
    public static final void a(ww2 ww2Var, String str, String str2) {
        ww2Var.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = ww2Var.b;
        arrayList.add(str);
        arrayList.add(qs6.T0(str2).toString());
    }

    public static final et7 b(px0 px0Var, int i) {
        boolean z;
        vv7 c;
        boolean z2;
        boolean z3;
        gr1 gr1Var;
        boolean z4;
        fi1 fi1Var;
        boolean z5 = true;
        if ((i & 1) != 0) {
            z = false;
        } else {
            z = true;
        }
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.b0(280825064);
        qh1 qh1Var = (qh1) xq2Var.j(ky0.h);
        zr3 zr3Var = (zr3) ((ot7) xq2Var.j(ky0.u));
        if (zr3Var.b == null) {
            on2 on2Var = zr3Var.a;
            if (on2Var == null || (fi1Var = (fi1) on2Var.c()) == null) {
                fi1Var = fi1.c;
            }
            zr3Var.b = np2.Y(fi1Var);
            zr3Var.a = null;
        }
        vs4 vs4Var = zr3Var.b;
        vs4Var.getClass();
        long q = qh1Var.q(qo2.S(((fi1) vs4Var.getValue()).a));
        xq2Var.p(false);
        if (z) {
            List list = vv7.c;
            c = wv7.c(q, um1.b, qm1.a);
        } else {
            List list2 = vv7.c;
            c = wv7.c(q, um1.a, qm1.a);
        }
        Context context = (Context) xq2Var.j(kf.b);
        boolean f = xq2Var.f(context);
        Object P = xq2Var.P();
        if (f || P == ox0.a) {
            rt7.c0.getClass();
            pb0 p = f04.p(new vy5(qt7.a(context), context, (r41) null, 18));
            xe1 xe1Var = xk1.a;
            P = new b7(f04.E(p, e04.a), 3);
            xq2Var.l0(P);
        }
        gr1 gr1Var2 = gr1.Y;
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        for (lw2 lw2Var : (List) np2.B((le2) P, yt1.A, null, xq2Var, 48, 2).getValue()) {
            gr1 a = lw2Var.a();
            w60 w60Var = lw2Var.a;
            gr1 gr1Var3 = lw2Var.c;
            if (a == gr1.d0 && gr1Var3 == gr1.f0) {
                z6 = z5;
            }
            Rect c2 = w60Var.c();
            of5 of5Var = new of5(c2.left, c2.top, c2.right, c2.bottom);
            if (gr1Var3 != gr1.e0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (lw2Var.a() != gr1.Z) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean b = lw2Var.b();
            if (w60Var.b() != 0 && w60Var.a() != 0) {
                gr1Var = gr1Var2;
            } else {
                gr1Var = gr1.X;
            }
            if (gr1Var != gr1Var2) {
                z4 = false;
            } else {
                z4 = true;
            }
            arrayList.add(new ux2(of5Var, z2, z3, b, z4));
            z5 = true;
        }
        return new et7(c, new l05(arrayList, z6));
    }

    public static final void c(String str) {
        str.getClass();
        if (str.length() > 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ('!' > charAt || charAt >= 127) {
                    StringBuilder sb = new StringBuilder("Unexpected char 0x");
                    g04.y(16);
                    String num = Integer.toString(charAt, 16);
                    num.getClass();
                    if (num.length() < 2) {
                        num = "0".concat(num);
                    }
                    sb.append(num);
                    sb.append(" at ");
                    sb.append(i);
                    sb.append(" in header name: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
            return;
        }
        i.h("name is empty");
    }

    public static final void d(String str, String str2) {
        String concat;
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                g04.y(16);
                String num = Integer.toString(charAt, 16);
                num.getClass();
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                if (yy7.m(str2)) {
                    concat = "";
                } else {
                    concat = ": ".concat(str);
                }
                sb.append(concat);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }
}
