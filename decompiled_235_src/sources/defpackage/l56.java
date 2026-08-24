package defpackage;

import android.util.Log;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.ui.settings.fragments.SoftInputBehaviourPreferencesFragmentKt;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l56  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class l56 implements eo2 {
    public final /* synthetic */ int A;

    public /* synthetic */ l56(int i) {
        this.A = 26;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        kp kpVar;
        Object a;
        int i = this.A;
        jd1 jd1Var = ic6.a;
        jg7 jg7Var = jg7.a;
        boolean z = false;
        boolean z2 = false;
        switch (i) {
            case 0:
                n46 n46Var = (n46) obj;
                return Integer.valueOf(((jj2) obj2).a);
            case 1:
                n46 n46Var2 = (n46) obj;
                x47 x47Var = (x47) obj2;
                long j = x47.c;
                if (x47Var != null) {
                    z = x47.a(x47Var.a, j);
                }
                if (z) {
                    return Boolean.FALSE;
                }
                return hf.w(Float.valueOf(x47.c(x47Var.a)), p56.a(new y47(x47.b(x47Var.a)), p56.y, n46Var2));
            case 2:
                nv3 nv3Var = (nv3) obj2;
                return hf.w(nv3Var.a, p56.a(nv3Var.b, p56.j, (n46) obj));
            case 3:
                n46 n46Var3 = (n46) obj;
                long j2 = ((y47) obj2).a;
                if (y47.a(j2, 8589934592L)) {
                    return 0;
                }
                if (y47.a(j2, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 4:
                n46 n46Var4 = (n46) obj;
                jk4 jk4Var = (jk4) obj2;
                if (jk4Var != null) {
                    z2 = jk4.c(jk4Var.a, 9205357640488583168L);
                }
                if (z2) {
                    return Boolean.FALSE;
                }
                return hf.w(Float.valueOf(Float.intBitsToFloat((int) (jk4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jk4Var.a & 4294967295L))));
            case 5:
                n46 n46Var5 = (n46) obj;
                ep epVar = (ep) obj2;
                Object obj3 = epVar.a;
                if (obj3 instanceof ds4) {
                    kpVar = kp.Paragraph;
                } else if (obj3 instanceof nn6) {
                    kpVar = kp.Span;
                } else if (obj3 instanceof ul7) {
                    kpVar = kp.VerbatimTts;
                } else if (obj3 instanceof zh7) {
                    kpVar = kp.Url;
                } else if (obj3 instanceof ov3) {
                    kpVar = kp.Link;
                } else if (obj3 instanceof nv3) {
                    kpVar = kp.Clickable;
                } else if (obj3 instanceof ms6) {
                    kpVar = kp.String;
                } else {
                    e41.t();
                    return null;
                }
                switch (o56.a[kpVar.ordinal()]) {
                    case 1:
                        obj3.getClass();
                        a = p56.a((ds4) obj3, p56.h, n46Var5);
                        break;
                    case 2:
                        obj3.getClass();
                        a = p56.a((nn6) obj3, p56.i, n46Var5);
                        break;
                    case 3:
                        obj3.getClass();
                        a = p56.a((ul7) obj3, p56.d, n46Var5);
                        break;
                    case 4:
                        obj3.getClass();
                        a = p56.a((zh7) obj3, p56.e, n46Var5);
                        break;
                    case 5:
                        obj3.getClass();
                        a = p56.a((ov3) obj3, p56.f, n46Var5);
                        break;
                    case 6:
                        obj3.getClass();
                        a = p56.a((nv3) obj3, p56.g, n46Var5);
                        break;
                    case 7:
                        obj3.getClass();
                        a = ((ms6) obj3).a;
                        break;
                    default:
                        i.d();
                        return null;
                }
                return hf.w(kpVar, a, Integer.valueOf(epVar.b), Integer.valueOf(epVar.c), epVar.d);
            case 6:
                n46 n46Var6 = (n46) obj;
                List list = ((gy3) obj2).A;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(p56.a((fy3) list.get(i2), p56.B, n46Var6));
                }
                return arrayList;
            case 7:
                n46 n46Var7 = (n46) obj;
                return ((fy3) obj2).a.toLanguageTag();
            case 8:
                n46 n46Var8 = (n46) obj;
                xu3 xu3Var = (xu3) obj2;
                return hf.w(p56.a(new uu3(xu3Var.a), p56.D, n46Var8), p56.a(new wu3(xu3Var.b), p56.E, n46Var8), p56.a(new vu3(xu3Var.c), p56.F, n46Var8));
            case 9:
                n46 n46Var9 = (n46) obj;
                return Float.valueOf(((uu3) obj2).a);
            case 10:
                n46 n46Var10 = (n46) obj;
                return Integer.valueOf(((wu3) obj2).a);
            case 11:
                n46 n46Var11 = (n46) obj;
                return Integer.valueOf(((vu3) obj2).a);
            case 12:
                n46 n46Var12 = (n46) obj;
                return ((ul7) obj2).a;
            case 13:
                n46 n46Var13 = (n46) obj;
                ds4 ds4Var = (ds4) obj2;
                Object a2 = p56.a(new wz6(ds4Var.a), p56.s, n46Var13);
                Object a3 = p56.a(new e17(ds4Var.b), p56.t, n46Var13);
                Object a4 = p56.a(new x47(ds4Var.c), p56.x, n46Var13);
                g37 g37Var = ds4Var.d;
                g37 g37Var2 = g37.c;
                Object a5 = p56.a(g37Var, p56.m, n46Var13);
                Object a6 = p56.a(ds4Var.e, mb3.x, n46Var13);
                xu3 xu3Var2 = ds4Var.f;
                xu3 xu3Var3 = xu3.d;
                return hf.w(a2, a3, a4, a5, a6, p56.a(xu3Var2, p56.C, n46Var13), p56.a(new su3(ds4Var.g), mb3.z, n46Var13), p56.a(new q03(ds4Var.h), p56.u, n46Var13), p56.a(ds4Var.i, mb3.A, n46Var13));
            case 14:
                n46 n46Var14 = (n46) obj;
                return ((zh7) obj2).a;
            case 15:
                n46 n46Var15 = (n46) obj;
                nn6 nn6Var = (nn6) obj2;
                kt0 kt0Var = new kt0(nn6Var.a.b());
                n56 n56Var = p56.r;
                Object a7 = p56.a(kt0Var, n56Var, n46Var15);
                x47 x47Var2 = new x47(nn6Var.b);
                n56 n56Var2 = p56.x;
                Object a8 = p56.a(x47Var2, n56Var2, n46Var15);
                oj2 oj2Var = nn6Var.c;
                oj2 oj2Var2 = oj2.B;
                Object a9 = p56.a(oj2Var, p56.n, n46Var15);
                Object a10 = p56.a(nn6Var.d, p56.v, n46Var15);
                Object a11 = p56.a(nn6Var.e, p56.w, n46Var15);
                String str = nn6Var.g;
                Object a12 = p56.a(new x47(nn6Var.h), n56Var2, n46Var15);
                Object a13 = p56.a(nn6Var.i, p56.o, n46Var15);
                Object a14 = p56.a(nn6Var.j, p56.l, n46Var15);
                gy3 gy3Var = nn6Var.k;
                gy3 gy3Var2 = gy3.L;
                Object a15 = p56.a(gy3Var, p56.A, n46Var15);
                Object a16 = p56.a(new kt0(nn6Var.l), n56Var, n46Var15);
                Object a17 = p56.a(nn6Var.m, p56.k, n46Var15);
                ge6 ge6Var = nn6Var.n;
                ge6 ge6Var2 = ge6.d;
                return hf.w(a7, a8, a9, a10, a11, -1, str, a12, a13, a14, a15, a16, a17, p56.a(ge6Var, p56.q, n46Var15));
            case 16:
                n46 n46Var16 = (n46) obj;
                g47 g47Var = (g47) obj2;
                nn6 nn6Var2 = g47Var.a;
                ap3 ap3Var = p56.i;
                return hf.w(p56.a(nn6Var2, ap3Var, n46Var16), p56.a(g47Var.b, ap3Var, n46Var16), p56.a(g47Var.c, ap3Var, n46Var16), p56.a(g47Var.d, ap3Var, n46Var16));
            case 17:
                ux4 ux4Var = (ux4) obj2;
                Boolean valueOf = Boolean.valueOf(ux4Var.a);
                ap3 ap3Var2 = p56.a;
                return hf.w(valueOf, p56.a(new jt1(ux4Var.b), mb3.y, (n46) obj));
            case 18:
                n46 n46Var17 = (n46) obj;
                return Integer.valueOf(((jt1) obj2).a);
            case 19:
                n46 n46Var18 = (n46) obj;
                return Integer.valueOf(((su3) obj2).a);
            case 20:
                i47 i47Var = (i47) obj2;
                return hf.w(p56.a(new h47(i47Var.a), mb3.B, (n46) obj), Boolean.valueOf(i47Var.b));
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                n46 n46Var19 = (n46) obj;
                return Integer.valueOf(((h47) obj2).a);
            case 22:
                n46 n46Var20 = (n46) obj;
                return Integer.valueOf(((s76) obj2).a.h());
            case ConnectionResult.API_DISABLED /* 23 */:
                ar0 ar0Var = (ar0) obj;
                List list2 = (List) obj2;
                ar0Var.getClass();
                list2.getClass();
                ArrayList O = jx2.O(jd1Var, list2, true);
                O.getClass();
                return jx2.C(ar0Var, O, new b5(3, list2));
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                ar0 ar0Var2 = (ar0) obj;
                List list3 = (List) obj2;
                ar0Var2.getClass();
                list3.getClass();
                ArrayList O2 = jx2.O(jd1Var, list3, true);
                O2.getClass();
                gg3 C = jx2.C(ar0Var2, O2, new b5(4, list3));
                if (C == null) {
                    return null;
                }
                return q60.I(C);
            case 25:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                Log.i(str2, str3);
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                ((Integer) obj2).getClass();
                SoftInputBehaviourPreferencesFragmentKt.b((px0) obj, ii2.a0(1));
                return jg7Var;
            case 27:
                return Integer.valueOf(((x24) obj).u(((Integer) obj2).intValue()));
            case 28:
                return Integer.valueOf(((x24) obj).V(((Integer) obj2).intValue()));
            default:
                return Integer.valueOf(((x24) obj).c(((Integer) obj2).intValue()));
        }
    }

    public /* synthetic */ l56(int i, byte b) {
        this.A = i;
    }
}
