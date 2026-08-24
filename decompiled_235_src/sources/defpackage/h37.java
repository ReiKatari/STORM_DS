package defpackage;

import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h37  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h37 implements qn2 {
    public final /* synthetic */ int A;

    public /* synthetic */ h37(int i) {
        this.A = i;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        g47 a;
        nn6 nn6Var;
        int i = this.A;
        boolean z = true;
        jg7 jg7Var = jg7.a;
        int i2 = 0;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                if (str.length() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                a47 a47Var = (a47) obj;
                py0 py0Var = x37.a;
                return jg7Var;
            case 2:
                ep epVar = (ep) obj;
                Object obj2 = epVar.a;
                if ((obj2 instanceof pv3) && (a = ((pv3) obj2).a()) != null && (a.a != null || a.b != null || a.c != null || a.d != null)) {
                    Object obj3 = epVar.a;
                    obj3.getClass();
                    g47 a2 = ((pv3) obj3).a();
                    if (a2 == null || (nn6Var = a2.a) == null) {
                        nn6Var = new nn6(0L, 0L, (oj2) null, (ij2) null, (jj2) null, (li2) null, (String) null, 0L, (x20) null, (f37) null, (gy3) null, 0L, (b17) null, (ge6) null, 65535);
                    }
                    return hf.w(epVar, new ep(nn6Var, epVar.b, epVar.c));
                }
                return hf.w(epVar);
            case 3:
                ((gb6) obj).a(bb6.B, jg7Var);
                return jg7Var;
            case 4:
                ub7 ub7Var = (ub7) obj;
                return Boolean.TRUE;
            case 5:
                ((fm5) obj).getClass();
                return jg7Var;
            case 6:
                j36 j36Var = (j36) obj;
                j36Var.getClass();
                return Boolean.valueOf(j36Var.f0());
            case 7:
                vy4 vy4Var = (vy4) obj;
                if (!vy4Var.d || !vy4Var.h) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                jk4 jk4Var = (jk4) obj;
                return Boolean.TRUE;
            case 9:
                n96 n96Var = (n96) obj;
                long j = n96Var.f;
                qm6 qm6Var = n96Var.h;
                if (qm6Var != null) {
                    qm6Var.d(n96Var, n16.q, n96Var.g);
                }
                long j2 = n96Var.f;
                if (j != j2) {
                    g96 g96Var = n96Var.o;
                    if (g96Var != null) {
                        if (g96Var.a > j2) {
                            n96Var.t();
                        } else {
                            g96Var.g = j2;
                            if (g96Var.b == null) {
                                g96Var.h = u24.F((1.0d - g96Var.e.a(0)) * n96Var.f);
                            }
                        }
                    } else if (j2 != 0) {
                        n96Var.w();
                    }
                }
                return jg7Var;
            case 10:
                j36 j36Var2 = (j36) obj;
                j36Var2.getClass();
                ad6 ad6Var = new ad6();
                while (j36Var2.f0()) {
                    ad6Var.add(Integer.valueOf((int) j36Var2.getLong(0)));
                }
                return ii2.p(ad6Var);
            case 11:
                throw i61.i(obj);
            case 12:
                j05 j05Var = (j05) obj;
                j05Var.getClass();
                return Boolean.valueOf(j05Var.b.isScreen());
            case 13:
                di7 di7Var = (di7) obj;
                di7Var.getClass();
                return di7Var.h;
            case 14:
                return new wo(((Float) obj).floatValue());
            case 15:
                return new wo(((Integer) obj).intValue());
            case 16:
                return Integer.valueOf((int) ((wo) obj).a);
            case 17:
                return new wo(((om1) obj).A);
            case 18:
                return new om1(((wo) obj).a);
            case 19:
                rm1 rm1Var = (rm1) obj;
                return new xo(Float.intBitsToFloat((int) (rm1Var.a >> 32)), Float.intBitsToFloat((int) (rm1Var.a & 4294967295L)));
            case 20:
                xo xoVar = (xo) obj;
                return new rm1((Float.floatToRawIntBits(xoVar.a) << 32) | (Float.floatToRawIntBits(xoVar.b) & 4294967295L));
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                xi6 xi6Var = (xi6) obj;
                return new xo(Float.intBitsToFloat((int) (xi6Var.a >> 32)), Float.intBitsToFloat((int) (xi6Var.a & 4294967295L)));
            case 22:
                xo xoVar2 = (xo) obj;
                return new xi6((Float.floatToRawIntBits(xoVar2.a) << 32) | (Float.floatToRawIntBits(xoVar2.b) & 4294967295L));
            case ConnectionResult.API_DISABLED /* 23 */:
                jk4 jk4Var2 = (jk4) obj;
                return new xo(Float.intBitsToFloat((int) (jk4Var2.a >> 32)), Float.intBitsToFloat((int) (jk4Var2.a & 4294967295L)));
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                xo xoVar3 = (xo) obj;
                return new jk4((Float.floatToRawIntBits(xoVar3.a) << 32) | (Float.floatToRawIntBits(xoVar3.b) & 4294967295L));
            case 25:
                long j3 = ((i93) obj).a;
                return new xo((int) (j3 >> 32), (int) (j3 & 4294967295L));
            case SubAllocator.N4 /* 26 */:
                xo xoVar4 = (xo) obj;
                return new i93((Math.round(xoVar4.a) << 32) | (Math.round(xoVar4.b) & 4294967295L));
            case 27:
                long j4 = ((q93) obj).a;
                return new xo((int) (j4 >> 32), (int) (j4 & 4294967295L));
            case 28:
                xo xoVar5 = (xo) obj;
                int round = Math.round(xoVar5.a);
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(xoVar5.b);
                if (round2 >= 0) {
                    i2 = round2;
                }
                return new q93((round << 32) | (i2 & 4294967295L));
            default:
                of5 of5Var = (of5) obj;
                return new zo(of5Var.a, of5Var.b, of5Var.c, of5Var.d);
        }
    }
}
