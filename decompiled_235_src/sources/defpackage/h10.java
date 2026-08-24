package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.UUID;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h10  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h10 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ h10(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
        this.Z = obj6;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        boolean z2;
        int i;
        String c;
        int i2 = this.A;
        boolean z3 = false;
        jg7 jg7Var = jg7.a;
        vs0 vs0Var = ox0.a;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        Object obj6 = this.X;
        Object obj7 = this.R;
        Object obj8 = this.L;
        Object obj9 = this.B;
        switch (i2) {
            case 0:
                sg6 sg6Var = (sg6) obj9;
                n00 n00Var = (n00) obj8;
                sn snVar = (sn) obj7;
                Context context = (Context) obj6;
                qa4 qa4Var = (qa4) obj5;
                on2 on2Var = (on2) obj4;
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((lq4) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    xq2Var.b0(818336960);
                    UUID uuid = n00Var.a;
                    if (uuid != null) {
                        str = uuid.toString();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    sg6Var.getClass();
                    rg6 d = sg6.d(str, xq2Var);
                    x64 x64Var = x64.a;
                    a74 d2 = sg6.e(sg6Var, x64Var, d, snVar).d(dj6.c);
                    Object P = xq2Var.P();
                    if (P == vs0Var) {
                        P = new f4(qa4Var, 6);
                        xq2Var.l0(P);
                    }
                    a74 t = mb3.t(d2, null, null, false, null, (on2) P, 28);
                    x23 x23Var = new x23(context);
                    x23Var.c = n00Var.c;
                    x23Var.e = new rh(context, (byte) 0);
                    gi2.b(x23Var.a(), null, t, null, RecyclerView.B1, xq2Var, 48, 4088);
                    xq2Var.p(false);
                    a74 c2 = dj6.c(x64Var, 1.0f);
                    WeakHashMap weakHashMap = dv7.w;
                    a74 d0 = q60.d0(c2, th7.d(xq2Var).o);
                    boolean booleanValue = ((Boolean) qa4Var.getValue()).booleanValue();
                    Object P2 = xq2Var.P();
                    if (P2 == vs0Var) {
                        P2 = new k4(14);
                        xq2Var.l0(P2);
                    }
                    o52 a = i52.i(1, (qn2) P2).a(i52.d(null, 3));
                    Object P3 = xq2Var.P();
                    if (P3 == vs0Var) {
                        P3 = new k4(15);
                        xq2Var.l0(P3);
                    }
                    g04.f(booleanValue, d0, a, i52.k((qn2) P3).a(i52.e(null, 3)), null, n16.I(1706257270, new h5(1, on2Var), xq2Var), xq2Var, 200064);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                rc4 rc4Var = (rc4) obj9;
                vy7 vy7Var = (vy7) obj8;
                aq0 aq0Var = (aq0) obj7;
                w61 w61Var = (w61) obj6;
                Resources resources = (Resources) obj5;
                gl6 gl6Var = (gl6) obj4;
                lq4 lq4Var = (lq4) obj;
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                lq4Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((xq2) px0Var2).f(lq4Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) != 18) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    Object P4 = xq2Var2.P();
                    if (P4 == vs0Var) {
                        P4 = new vn0(1);
                        xq2Var2.l0(P4);
                    }
                    qn2 qn2Var = (qn2) P4;
                    Object P5 = xq2Var2.P();
                    if (P5 == vs0Var) {
                        P5 = new vn0(2);
                        xq2Var2.l0(P5);
                    }
                    qn2 qn2Var2 = (qn2) P5;
                    Object P6 = xq2Var2.P();
                    if (P6 == vs0Var) {
                        P6 = new vn0(3);
                        xq2Var2.l0(P6);
                    }
                    qn2 qn2Var3 = (qn2) P6;
                    Object P7 = xq2Var2.P();
                    if (P7 == vs0Var) {
                        P7 = new vn0(4);
                        xq2Var2.l0(P7);
                    }
                    qn2 qn2Var4 = (qn2) P7;
                    boolean h = xq2Var2.h(aq0Var);
                    if ((intValue2 & 14) == 4) {
                        z3 = true;
                    }
                    boolean h2 = h | z3 | xq2Var2.h(w61Var) | xq2Var2.h(resources);
                    Object P8 = xq2Var2.P();
                    if (h2 || P8 == vs0Var) {
                        d5 d5Var = new d5(aq0Var, lq4Var, w61Var, resources, gl6Var, 4);
                        xq2Var2.l0(d5Var);
                        P8 = d5Var;
                    }
                    hi2.h(rc4Var, vy7Var, null, null, null, qn2Var, qn2Var2, qn2Var3, qn2Var4, (qn2) P8, xq2Var2, 920125440, 1084);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            default:
                zt5 zt5Var = (zt5) obj9;
                String str2 = (String) obj8;
                mi6 mi6Var = (mi6) obj7;
                Context context2 = (Context) obj6;
                String[] strArr = (String[]) obj5;
                qn2 qn2Var5 = (qn2) obj4;
                px0 px0Var3 = (px0) obj2;
                ((Integer) obj3).getClass();
                ((jo) obj).getClass();
                String O = yh2.O(px0Var3, R.string.internal_resolution);
                Integer num = zt5Var.p;
                if (num == null || (c = strArr[gi2.r(num.intValue() - 1, fv.G0(strArr))]) == null) {
                    c = qo2.c(context2, str2);
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                boolean f = xq2Var3.f(mi6Var) | xq2Var3.h(context2) | xq2Var3.h(strArr) | xq2Var3.f(str2) | xq2Var3.h(zt5Var) | xq2Var3.f(qn2Var5);
                Object P9 = xq2Var3.P();
                if (f || P9 == vs0Var) {
                    tt5 tt5Var = new tt5(mi6Var, context2, strArr, zt5Var, str2, qn2Var5);
                    xq2Var3.l0(tt5Var);
                    P9 = tt5Var;
                }
                lt5.a(O, c, false, true, (on2) P9, xq2Var3, 3072, 4);
                return jg7Var;
        }
    }
}
