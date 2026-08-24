package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.io.Serializable;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ln3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ln3 implements fo2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ Serializable B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;

    public /* synthetic */ ln3(zt5 zt5Var, String str, j37 j37Var, qn2 qn2Var, Context context, String str2, j37 j37Var2) {
        this.R = zt5Var;
        this.Z = str;
        this.L = j37Var;
        this.X = qn2Var;
        this.Y = context;
        this.B = str2;
        this.d0 = j37Var2;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        int i;
        boolean z2;
        boolean z3;
        xq2 xq2Var;
        zt5 zt5Var;
        int i2;
        int i3 = this.A;
        jg7 jg7Var = jg7.a;
        vs0 vs0Var = ox0.a;
        Object obj4 = this.d0;
        Serializable serializable = this.B;
        Object obj5 = this.Y;
        Object obj6 = this.X;
        Object obj7 = this.L;
        Object obj8 = this.Z;
        Object obj9 = this.R;
        switch (i3) {
            case 0:
                j37 j37Var = (j37) obj7;
                qa4 qa4Var = (qa4) obj9;
                String str2 = (String) obj8;
                String[] strArr = (String[]) serializable;
                qa4 qa4Var2 = (qa4) obj6;
                qa4 qa4Var3 = (qa4) obj5;
                rs4 rs4Var = (rs4) obj4;
                lq4 lq4Var = (lq4) obj;
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                lq4Var.getClass();
                if ((intValue & 6) == 0) {
                    if (((xq2) px0Var).f(lq4Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z)) {
                    String O = yh2.O(xq2Var2, R.string.layout_name);
                    String str3 = (String) qa4Var.getValue();
                    if (str3 == null) {
                        str3 = i61.l(xq2Var2, 1779153475, R.string.not_set, xq2Var2, false);
                    } else {
                        xq2Var2.b0(1779153227);
                        xq2Var2.p(false);
                    }
                    String str4 = str3;
                    boolean f = xq2Var2.f(j37Var) | xq2Var2.f(qa4Var) | xq2Var2.f(str2);
                    Object P = xq2Var2.P();
                    if (f || P == vs0Var) {
                        P = new u6(j37Var, str2, qa4Var, 12);
                        xq2Var2.l0(P);
                    }
                    nq6 nq6Var = ky0.n;
                    nw7.d(O, str4, false, (on2) P, ge7.r(lq4Var, (kk3) xq2Var2.j(nq6Var)), xq2Var2, 0);
                    String O2 = yh2.O(xq2Var2, R.string.layout_orientation);
                    int ordinal = ((ck3) qa4Var2.getValue()).ordinal();
                    if (ordinal >= 0 && ordinal < strArr.length) {
                        str = strArr[ordinal];
                    } else {
                        str = "";
                    }
                    String str5 = str;
                    List T0 = fv.T0(strArr);
                    int ordinal2 = ((ck3) qa4Var2.getValue()).ordinal();
                    boolean f2 = xq2Var2.f(qa4Var2);
                    Object P2 = xq2Var2.P();
                    if (f2 || P2 == vs0Var) {
                        P2 = new j4(qa4Var2, 12);
                        xq2Var2.l0(P2);
                    }
                    yh2.f(O2, str5, T0, ordinal2, (qn2) P2, false, ge7.r(lq4Var, (kk3) xq2Var2.j(nq6Var)), xq2Var2, 0);
                    String O3 = yh2.O(xq2Var2, R.string.layout_use_default_opacity);
                    boolean z4 = !((Boolean) qa4Var3.getValue()).booleanValue();
                    boolean f3 = xq2Var2.f(qa4Var3);
                    Object P3 = xq2Var2.P();
                    if (f3 || P3 == vs0Var) {
                        P3 = new j4(qa4Var3, 13);
                        xq2Var2.l0(P3);
                    }
                    uj2.g(O3, z4, (qn2) P3, ge7.r(lq4Var, (kk3) xq2Var2.j(nq6Var)), xq2Var2, 0);
                    String O4 = yh2.O(xq2Var2, R.string.layout_opacity);
                    float h = rs4Var.h();
                    bs0 bs0Var = new bs0(RecyclerView.B1, 100.0f);
                    boolean booleanValue = ((Boolean) qa4Var3.getValue()).booleanValue();
                    boolean f4 = xq2Var2.f(rs4Var);
                    Object P4 = xq2Var2.P();
                    if (f4 || P4 == vs0Var) {
                        P4 = new kn3(rs4Var, 0);
                        xq2Var2.l0(P4);
                    }
                    ii2.m(O4, h, bs0Var, booleanValue, (qn2) P4, ge7.r(lq4Var, (kk3) xq2Var2.j(nq6Var)), xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 1:
                zt5 zt5Var2 = (zt5) obj7;
                String[] strArr2 = (String[]) serializable;
                mi6 mi6Var = (mi6) obj9;
                Context context = (Context) obj6;
                qn2 qn2Var = (qn2) obj5;
                j04 j04Var = (j04) obj8;
                j04 j04Var2 = (j04) obj4;
                zt0 zt0Var = (zt0) obj;
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                zt0Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((xq2) px0Var2).f(zt0Var)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue2 |= i2;
                }
                int i4 = intValue2;
                if ((i4 & 19) != 18) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var3 = (xq2) px0Var2;
                if (xq2Var3.S(i4 & 1, z2)) {
                    if (zt5Var2.h.a == ax5.GbaRom) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String O5 = yh2.O(xq2Var3, R.string.label_rom_config_gba_slot);
                    String str6 = strArr2[zt5Var2.h.a.ordinal()];
                    boolean f5 = xq2Var3.f(mi6Var) | xq2Var3.h(context) | xq2Var3.h(strArr2) | xq2Var3.h(zt5Var2) | xq2Var3.f(qn2Var);
                    Object P5 = xq2Var3.P();
                    if (!f5 && P5 != vs0Var) {
                        xq2Var = xq2Var3;
                        zt5Var = zt5Var2;
                    } else {
                        xq2Var = xq2Var3;
                        zt5Var = zt5Var2;
                        jn3 jn3Var = new jn3(mi6Var, context, zt5Var, strArr2, qn2Var, 3);
                        xq2Var.l0(jn3Var);
                        P5 = jn3Var;
                    }
                    boolean z5 = z3;
                    lt5.a(O5, str6, false, z5, (on2) P5, xq2Var, 0, 4);
                    g04.c(zt0Var, z5, null, null, null, null, n16.I(911156774, new m4(zt5Var, j04Var, j04Var2, 8), xq2Var), xq2Var, (i4 & 14) | 1572864);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            default:
                final zt5 zt5Var3 = (zt5) obj9;
                String str7 = (String) obj8;
                final j37 j37Var2 = (j37) obj7;
                final qn2 qn2Var2 = (qn2) obj6;
                final Context context2 = (Context) obj5;
                String str8 = (String) serializable;
                final j37 j37Var3 = (j37) obj4;
                px0 px0Var3 = (px0) obj2;
                ((Integer) obj3).getClass();
                ((jo) obj).getClass();
                yt0 a = wt0.a(ju.c, d90.k0, px0Var3, 0);
                xq2 xq2Var4 = (xq2) px0Var3;
                int hashCode = Long.hashCode(xq2Var4.T);
                xv4 l = xq2Var4.l();
                a74 E = l.E(px0Var3, x64.a);
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2 xq2Var5 = (xq2) px0Var3;
                xq2Var5.f0();
                if (xq2Var5.S) {
                    xq2Var5.k(iy0Var);
                } else {
                    xq2Var5.o0();
                }
                yh2.K(px0Var3, ix0.f, a);
                yh2.K(px0Var3, ix0.e, l);
                yh2.K(px0Var3, ix0.g, Integer.valueOf(hashCode));
                yh2.F(px0Var3, ix0.h);
                yh2.K(px0Var3, ix0.d, E);
                String O6 = yh2.O(px0Var3, R.string.video_retroarch_shader_preset_title);
                String str9 = zt5Var3.t;
                if (str9 == null) {
                    str9 = qo2.c(context2, str7);
                }
                boolean h2 = xq2Var5.h(zt5Var3) | xq2Var5.f(j37Var2) | xq2Var5.f(qn2Var2) | xq2Var5.h(context2);
                Object P6 = xq2Var5.P();
                if (h2 || P6 == vs0Var) {
                    on2 on2Var = new on2() { // from class: rt5
                        @Override // defpackage.on2
                        public final Object c() {
                            int i5 = r5;
                            jg7 jg7Var2 = jg7.a;
                            String str10 = "";
                            qn2 qn2Var3 = qn2Var2;
                            Context context3 = context2;
                            j37 j37Var4 = j37Var2;
                            zt5 zt5Var4 = zt5Var3;
                            switch (i5) {
                                case 0:
                                    if (zt5Var4.x) {
                                        String str11 = zt5Var4.t;
                                        if (str11 != null) {
                                            str10 = str11;
                                        }
                                        j37.c(j37Var4, str10, new y00(12, qn2Var3));
                                    } else {
                                        Toast.makeText(context3, (int) R.string.retroarch_shader_root_not_valid, 1).show();
                                    }
                                    return jg7Var2;
                                default:
                                    if (zt5Var4.x) {
                                        String str12 = zt5Var4.v;
                                        if (str12 != null) {
                                            str10 = str12;
                                        }
                                        j37.c(j37Var4, str10, new y00(14, qn2Var3));
                                    } else {
                                        Toast.makeText(context3, (int) R.string.retroarch_shader_root_not_valid, 1).show();
                                    }
                                    return jg7Var2;
                            }
                        }
                    };
                    xq2Var5.l0(on2Var);
                    P6 = on2Var;
                }
                lt5.a(O6, str9, false, true, (on2) P6, px0Var3, 3072, 4);
                String O7 = yh2.O(px0Var3, R.string.video_retroarch_shader_parameters_title);
                String str10 = zt5Var3.v;
                if (str10 == null) {
                    str10 = qo2.c(context2, str8);
                }
                boolean h3 = xq2Var5.h(zt5Var3) | xq2Var5.f(j37Var3) | xq2Var5.f(qn2Var2) | xq2Var5.h(context2);
                Object P7 = xq2Var5.P();
                if (h3 || P7 == vs0Var) {
                    on2 on2Var2 = new on2() { // from class: rt5
                        @Override // defpackage.on2
                        public final Object c() {
                            int i5 = r5;
                            jg7 jg7Var2 = jg7.a;
                            String str102 = "";
                            qn2 qn2Var3 = qn2Var2;
                            Context context3 = context2;
                            j37 j37Var4 = j37Var3;
                            zt5 zt5Var4 = zt5Var3;
                            switch (i5) {
                                case 0:
                                    if (zt5Var4.x) {
                                        String str11 = zt5Var4.t;
                                        if (str11 != null) {
                                            str102 = str11;
                                        }
                                        j37.c(j37Var4, str102, new y00(12, qn2Var3));
                                    } else {
                                        Toast.makeText(context3, (int) R.string.retroarch_shader_root_not_valid, 1).show();
                                    }
                                    return jg7Var2;
                                default:
                                    if (zt5Var4.x) {
                                        String str12 = zt5Var4.v;
                                        if (str12 != null) {
                                            str102 = str12;
                                        }
                                        j37.c(j37Var4, str102, new y00(14, qn2Var3));
                                    } else {
                                        Toast.makeText(context3, (int) R.string.retroarch_shader_root_not_valid, 1).show();
                                    }
                                    return jg7Var2;
                            }
                        }
                    };
                    xq2Var5.l0(on2Var2);
                    P7 = on2Var2;
                }
                lt5.a(O7, str10, false, false, (on2) P7, px0Var3, 0, 12);
                xq2Var5.p(true);
                return jg7Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ln3(zt5 zt5Var, String[] strArr, mi6 mi6Var, Context context, qn2 qn2Var, j04 j04Var, j04 j04Var2) {
        this.L = zt5Var;
        this.B = strArr;
        this.R = mi6Var;
        this.X = context;
        this.Y = qn2Var;
        this.Z = j04Var;
        this.d0 = j04Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ln3(j37 j37Var, qa4 qa4Var, String str, String[] strArr, qa4 qa4Var2, qa4 qa4Var3, rs4 rs4Var) {
        this.L = j37Var;
        this.R = qa4Var;
        this.Z = str;
        this.B = strArr;
        this.X = qa4Var2;
        this.Y = qa4Var3;
        this.d0 = rs4Var;
    }
}
