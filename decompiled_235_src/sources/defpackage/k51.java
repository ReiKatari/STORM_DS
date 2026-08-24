package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k51  reason: default package */
/* loaded from: classes.dex */
public final class k51 implements g14 {
    public final /* synthetic */ int a;

    public /* synthetic */ k51(int i) {
        this.a = i;
    }

    @Override // defpackage.g14
    public final void a(eb ebVar, a21 a21Var) {
        boolean z = false;
        int i = 0;
        z = false;
        switch (this.a) {
            case 0:
                a21 a21Var2 = (d57) a21Var;
                ebVar.z();
                int H = ebVar.H();
                ((sn6) ebVar.R).a((char) 160);
                ebVar.M(a21Var2, H);
                ebVar.l(a21Var2);
                return;
            case 1:
                zw2 zw2Var = (zw2) a21Var;
                ebVar.z();
                int H2 = ebVar.H();
                ebVar.Q(zw2Var);
                u24.g.b((ng3) ebVar.L, Integer.valueOf(zw2Var.g));
                ebVar.M(zw2Var, H2);
                ebVar.l(zw2Var);
                return;
            case 2:
                wm6 wm6Var = (wm6) a21Var;
                ((sn6) ebVar.R).a(' ');
                return;
            case 3:
                vv2 vv2Var = (vv2) a21Var;
                ebVar.z();
                return;
            case 4:
                a21 a21Var3 = (xr4) a21Var;
                a50 a50Var = (a50) ((a21) a21Var3.b);
                if (a50Var != null) {
                    a50 a50Var2 = (a50) ((a21) a50Var.b);
                    if (a50Var2 instanceof gw3) {
                        z = ((gw3) a50Var2).g;
                    }
                }
                if (!z) {
                    ebVar.z();
                }
                int H3 = ebVar.H();
                ebVar.Q(a21Var3);
                u24.i.b((ng3) ebVar.L, Boolean.valueOf(z));
                ebVar.M(a21Var3, H3);
                if (!z) {
                    ebVar.l(a21Var3);
                    return;
                }
                return;
            case 5:
                mv3 mv3Var = (mv3) a21Var;
                int H4 = ebVar.H();
                ebVar.Q(mv3Var);
                u24.h.b((ng3) ebVar.L, mv3Var.g);
                ebVar.M(mv3Var, H4);
                return;
            case 6:
                a21 a21Var4 = (zs6) a21Var;
                int H5 = ebVar.H();
                ebVar.Q(a21Var4);
                ebVar.M(a21Var4, H5);
                return;
            case 7:
                a21 a21Var5 = (pt1) a21Var;
                int H6 = ebVar.H();
                ebVar.Q(a21Var5);
                ebVar.M(a21Var5, H6);
                return;
            case 8:
                a21 a21Var6 = (e50) a21Var;
                ebVar.z();
                int H7 = ebVar.H();
                ebVar.Q(a21Var6);
                ebVar.M(a21Var6, H7);
                ebVar.l(a21Var6);
                return;
            case 9:
                hs0 hs0Var = (hs0) a21Var;
                int H8 = ebVar.H();
                sn6 sn6Var = (sn6) ebVar.R;
                StringBuilder sb = sn6Var.A;
                sb.append((char) 160);
                sb.append(hs0Var.g);
                sn6Var.a((char) 160);
                ebVar.M(hs0Var, H8);
                return;
            case 10:
                ha2 ha2Var = (ha2) a21Var;
                m51.e(ebVar, ha2Var.j, ha2Var.k, ha2Var);
                return;
            case 11:
                i43 i43Var = (i43) a21Var;
                m51.e(ebVar, null, i43Var.g, i43Var);
                return;
            case 12:
                sn6 sn6Var2 = (sn6) ebVar.R;
                m13 m13Var = (m13) a21Var;
                d14 d14Var = (d14) ebVar.B;
                i50 i50Var = (i50) d14Var.g.A.get(m13.class);
                if (i50Var == null) {
                    ebVar.Q(m13Var);
                    return;
                }
                int H9 = ebVar.H();
                ebVar.Q(m13Var);
                if (H9 == ebVar.H()) {
                    sn6Var2.a((char) 65532);
                }
                q61 q61Var = d14Var.e;
                String str = m13Var.g;
                q61Var.getClass();
                ng3 ng3Var = (ng3) ebVar.L;
                mb3.s.b(ng3Var, str);
                mb3.t.b(ng3Var, Boolean.valueOf(((a21) m13Var.b) instanceof mv3));
                mb3.u.b(ng3Var, null);
                Object a = i50Var.a(d14Var, ng3Var);
                StringBuilder sb2 = sn6Var2.A;
                int length = sb2.length();
                int length2 = sb2.length();
                if (length > H9 && H9 >= 0 && length <= length2) {
                    sn6.c(sn6Var2, a, H9, length);
                    return;
                }
                return;
            case 13:
                a21 a21Var7 = (qw3) a21Var;
                h45 h45Var = u24.d;
                int H10 = ebVar.H();
                ng3 ng3Var2 = (ng3) ebVar.L;
                ebVar.Q(a21Var7);
                a50 a50Var3 = (a50) ((a21) a21Var7.b);
                if (a50Var3 instanceof ho4) {
                    ho4 ho4Var = (ho4) a50Var3;
                    int i2 = ho4Var.h;
                    h45Var.b(ng3Var2, n51.ORDERED);
                    u24.f.b(ng3Var2, Integer.valueOf(i2));
                    ho4Var.h++;
                } else {
                    h45Var.b(ng3Var2, n51.BULLET);
                    h45 h45Var2 = u24.e;
                    for (a21 a21Var8 = (a50) ((a21) a21Var7.b); a21Var8 != null; a21Var8 = a21Var8.c()) {
                        if (a21Var8 instanceof qw3) {
                            i++;
                        }
                    }
                    h45Var2.b(ng3Var2, Integer.valueOf(i));
                }
                ebVar.M(a21Var7, H10);
                if (((a21) a21Var7.f) != null) {
                    ebVar.z();
                    return;
                }
                return;
            default:
                ebVar.z();
                int H11 = ebVar.H();
                ebVar.Q(a21Var);
                ebVar.M(a21Var, H11);
                ebVar.l(a21Var);
                return;
        }
    }
}
