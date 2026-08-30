package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dn  reason: default package */
/* loaded from: classes.dex */
public final class dn extends ic3 implements aj2 {
    public final /* synthetic */ int B;
    public static final dn L = new dn(2, 0);
    public static final dn R = new dn(2, 1);
    public static final dn X = new dn(2, 2);
    public static final dn Y = new dn(2, 3);
    public static final dn Z = new dn(2, 4);
    public static final dn c0 = new dn(2, 5);
    public static final dn d0 = new dn(2, 6);
    public static final dn e0 = new dn(2, 7);
    public static final dn f0 = new dn(2, 8);
    public static final dn g0 = new dn(2, 9);
    public static final dn h0 = new dn(2, 10);
    public static final dn i0 = new dn(2, 11);
    public static final dn j0 = new dn(2, 12);
    public static final dn k0 = new dn(2, 13);
    public static final dn l0 = new dn(2, 14);
    public static final dn m0 = new dn(2, 15);
    public static final dn n0 = new dn(2, 16);
    public static final dn o0 = new dn(2, 17);
    public static final dn p0 = new dn(2, 18);
    public static final dn q0 = new dn(2, 19);
    public static final dn r0 = new dn(2, 20);
    public static final dn s0 = new dn(2, 21);
    public static final dn t0 = new dn(2, 22);
    public static final dn u0 = new dn(2, 23);
    public static final dn v0 = new dn(2, 24);
    public static final dn w0 = new dn(2, 25);
    public static final dn x0 = new dn(2, 26);
    public static final dn y0 = new dn(2, 27);
    public static final dn z0 = new dn(2, 28);
    public static final dn A0 = new dn(2, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dn(int i, int i2) {
        super(i);
        this.B = i2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.B;
        boolean z = false;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                long j = ((i33) obj).a;
                long j2 = ((i33) obj2).a;
                y55 y55Var = tc7.a;
                return ct3.P0(RecyclerView.A1, 400.0f, new i33(4294967297L), 1);
            case 1:
                k02 k02Var = (k02) obj2;
                if (((k02) obj) == k02Var && k02Var == k02.PostExit) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                String str = (String) obj;
                xy3 xy3Var = (xy3) obj2;
                if (str.length() == 0) {
                    return xy3Var.toString();
                }
                return str + ", " + xy3Var;
            case 3:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (!sk2Var.O(intValue & 1, z)) {
                    sk2Var.R();
                }
                return o27Var;
            case 4:
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (!sk2Var2.O(intValue2 & 1, z)) {
                    sk2Var2.R();
                }
                return o27Var;
            case 5:
                tu0 tu0Var3 = (tu0) obj;
                int intValue3 = ((Number) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (!sk2Var3.O(intValue3 & 1, z)) {
                    sk2Var3.R();
                }
                return o27Var;
            case ig7.b /* 6 */:
                tu0 tu0Var4 = (tu0) obj;
                int intValue4 = ((Number) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z = true;
                }
                sk2 sk2Var4 = (sk2) tu0Var4;
                if (!sk2Var4.O(intValue4 & 1, z)) {
                    sk2Var4.R();
                }
                return o27Var;
            case 7:
                ((Number) obj2).intValue();
                ((vf3) ((nu0) obj)).getClass();
                return o27Var;
            case 8:
                ((vf3) ((nu0) obj)).c0((tv3) obj2);
                return o27Var;
            case 9:
                ((vf3) ((nu0) obj)).d0((zy3) obj2);
                return o27Var;
            case 10:
                lv0 lv0Var = (lv0) obj2;
                vf3 vf3Var = (vf3) ((nu0) obj);
                vf3Var.w0 = lv0Var;
                zc0 zc0Var = vf3Var.A0;
                ye6 ye6Var = ov0.h;
                sm4 sm4Var = (sm4) lv0Var;
                sm4Var.getClass();
                vf3Var.Z((od1) l.L(sm4Var, ye6Var));
                sm4 sm4Var2 = (sm4) lv0Var;
                sd3 sd3Var = (sd3) l.L(sm4Var2, ov0.n);
                if (vf3Var.u0 != sd3Var) {
                    vf3Var.u0 = sd3Var;
                    vf3Var.E();
                    vf3 u = vf3Var.u();
                    if (u != null) {
                        u.B();
                    } else {
                        wg4 wg4Var = vf3Var.j0;
                        if (wg4Var != null) {
                            ((ee) wg4Var).invalidate();
                        }
                    }
                    vf3Var.C();
                    for (yy3 yy3Var = (yy3) zc0Var.g; yy3Var != null; yy3Var = yy3Var.Y) {
                        yy3Var.C0();
                    }
                }
                vf3Var.e0((fa7) l.L(sm4Var2, ov0.t));
                yy3 yy3Var2 = (yy3) zc0Var.g;
                if ((yy3Var2.R & 32768) != 0) {
                    while (yy3Var2 != null) {
                        if ((yy3Var2.L & 32768) != 0) {
                            yy3 yy3Var3 = yy3Var2;
                            o24 o24Var = null;
                            while (yy3Var3 != null) {
                                if (yy3Var3 instanceof jv0) {
                                    yy3 yy3Var4 = ((yy3) ((jv0) yy3Var3)).A;
                                    if (yy3Var4.i0) {
                                        n74.c(yy3Var4);
                                    } else {
                                        yy3Var4.e0 = true;
                                    }
                                } else if ((yy3Var3.L & 32768) != 0 && (yy3Var3 instanceof xc1)) {
                                    int i2 = 0;
                                    for (yy3 yy3Var5 = ((xc1) yy3Var3).k0; yy3Var5 != null; yy3Var5 = yy3Var5.Y) {
                                        if ((yy3Var5.L & 32768) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                yy3Var3 = yy3Var5;
                                            } else {
                                                if (o24Var == null) {
                                                    o24Var = new o24(new yy3[16]);
                                                }
                                                if (yy3Var3 != null) {
                                                    o24Var.b(yy3Var3);
                                                    yy3Var3 = null;
                                                }
                                                o24Var.b(yy3Var5);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                yy3Var3 = l.p(o24Var);
                            }
                        }
                        if ((yy3Var2.R & 32768) != 0) {
                            yy3Var2 = yy3Var2.Y;
                        }
                    }
                }
                return o27Var;
            case 11:
                vf3 vf3Var2 = (vf3) obj;
                ((os3) obj2).getClass();
                return o27Var;
            case mj2.L /* 12 */:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = pp1.A;
                }
                return tq0.X0(collection, list);
            case 13:
                bf bfVar = (bf) obj2;
                return (bf) obj;
            case 14:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList(list2);
                    arrayList.addAll(list3);
                    return arrayList;
                }
                return list3;
            case ig7.e /* 15 */:
                w01 w01Var = (w01) obj2;
                return (w01) obj;
            case 16:
                ch chVar = (ch) obj2;
                return (ch) obj;
            case 17:
                o27 o27Var2 = (o27) obj2;
                return (o27) obj;
            case 18:
                o27 o27Var3 = (o27) obj2;
                return (o27) obj;
            case 19:
                o27 o27Var4 = (o27) obj;
                o27 o27Var5 = (o27) obj2;
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 20:
                o27 o27Var6 = (o27) obj;
                o27 o27Var7 = (o27) obj2;
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 21:
                o27 o27Var8 = (o27) obj2;
                return (o27) obj;
            case 22:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 23:
                og5 og5Var = (og5) obj;
                int i3 = ((og5) obj2).a;
                return og5Var;
            case 24:
                y26 y26Var = (y26) obj2;
                return (y26) obj;
            case 25:
                String str4 = (String) obj2;
                return (String) obj;
            case 26:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 != null) {
                    ArrayList arrayList2 = new ArrayList(list4);
                    arrayList2.addAll(list5);
                    return arrayList2;
                }
                return list5;
            case 27:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 28:
                String str5 = (String) obj2;
                return (String) obj;
            default:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
        }
    }
}
