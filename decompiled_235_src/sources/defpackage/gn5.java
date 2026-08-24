package defpackage;

import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.File;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gn5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gn5 implements qn2 {
    public final /* synthetic */ int A;

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        String str;
        String str2;
        nn6 nn6Var;
        nn6 nn6Var2;
        nn6 nn6Var3;
        List list;
        x47 x47Var;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        nn6 nn6Var4 = null;
        x47 x47Var2 = null;
        String str3 = null;
        nn6Var4 = null;
        boolean z = false;
        switch (i) {
            case 0:
                return qs6.T0((String) obj).toString();
            case 1:
                if (((String) obj).length() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                File file = (File) obj;
                file.getClass();
                return Boolean.valueOf(file.isFile());
            case 3:
                n14 n14Var = (n14) obj;
                n14Var.getClass();
                String str4 = (String) gt0.K0(1, n14Var.a());
                if (str4 == null) {
                    return null;
                }
                return qs6.T0(str4).toString();
            case 4:
                ((String) obj).getClass();
                return Boolean.valueOf(!qs6.v0(str));
            case 5:
                n14 n14Var2 = (n14) obj;
                n14Var2.getClass();
                String str5 = (String) gt0.K0(1, n14Var2.a());
                if (str5 == null) {
                    return null;
                }
                return qs6.T0(str5).toString();
            case 6:
                ((String) obj).getClass();
                return Boolean.valueOf(!qs6.v0(str2));
            case 7:
                ((jg7) obj).getClass();
                return Boolean.TRUE;
            case 8:
                fh2 fh2Var = (fh2) obj;
                fh2Var.getClass();
                fh2Var.a();
                return jg7Var;
            case 9:
                fh2 fh2Var2 = (fh2) obj;
                fh2Var2.getClass();
                fh2Var2.a();
                return jg7Var;
            case 10:
                pq5 pq5Var = (pq5) obj;
                pq5Var.getClass();
                String uri = pq5Var.d.toString();
                uri.getClass();
                return uri;
            case 11:
                pq5 pq5Var2 = (pq5) obj;
                pq5Var2.getClass();
                String uri2 = pq5Var2.d.toString();
                uri2.getClass();
                return uri2;
            case 12:
                fh2 fh2Var3 = (fh2) obj;
                fh2Var3.getClass();
                fh2Var3.a();
                return jg7Var;
            case 13:
                ((cp3) obj).getClass();
                return new ju2(ej2.a(cp3.b));
            case 14:
                fh2 fh2Var4 = (fh2) obj;
                fh2Var4.getClass();
                fh2Var4.f(nh2.c);
                return jg7Var;
            case 15:
                Cheat cheat = (Cheat) obj;
                cheat.getClass();
                return "cheat_" + cheat.getId();
            case 16:
                ((String) obj).getClass();
                return Boolean.TRUE;
            case 17:
                ((String) obj).getClass();
                return Boolean.TRUE;
            case 18:
                ((String) obj).getClass();
                return Boolean.TRUE;
            case 19:
                ((ta5) obj).getClass();
                return jg7Var;
            case 20:
                ((bc1) obj).getClass();
                throw new tg4(0);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                c46 c46Var = (c46) obj;
                c46Var.getClass();
                return Integer.valueOf(c46Var.a);
            case 22:
                return new p46((Map) obj);
            case ConnectionResult.API_DISABLED /* 23 */:
                return obj;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                obj.getClass();
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                qn2 qn2Var = (qn2) p56.i.L;
                Boolean bool = Boolean.FALSE;
                if (nb3.k(obj2, bool) || obj2 == null) {
                    nn6Var = null;
                } else {
                    nn6Var = (nn6) qn2Var.g(obj2);
                }
                Object obj3 = list2.get(1);
                if (nb3.k(obj3, bool) || obj3 == null) {
                    nn6Var2 = null;
                } else {
                    nn6Var2 = (nn6) qn2Var.g(obj3);
                }
                Object obj4 = list2.get(2);
                if (nb3.k(obj4, bool) || obj4 == null) {
                    nn6Var3 = null;
                } else {
                    nn6Var3 = (nn6) qn2Var.g(obj4);
                }
                Object obj5 = list2.get(3);
                if (!nb3.k(obj5, bool) && obj5 != null) {
                    nn6Var4 = (nn6) qn2Var.g(obj5);
                }
                return new g47(nn6Var, nn6Var2, nn6Var3, nn6Var4);
            case 25:
                obj.getClass();
                List list3 = (List) obj;
                Object obj6 = list3.get(1);
                ap3 ap3Var = p56.b;
                if (nb3.k(obj6, Boolean.FALSE) || obj6 == null) {
                    list = null;
                } else {
                    list = (List) ((qn2) ap3Var.L).g(obj6);
                }
                Object obj7 = list3.get(0);
                if (obj7 != null) {
                    str3 = (String) obj7;
                }
                str3.getClass();
                return new fp(list, str3);
            case SubAllocator.N4 /* 26 */:
                obj.getClass();
                return new b17(((Integer) obj).intValue());
            case 27:
                obj.getClass();
                List list4 = (List) obj;
                return new f37(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 28:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                y47[] y47VarArr = x47.b;
                qn2 qn2Var2 = p56.x.B;
                Boolean bool2 = Boolean.FALSE;
                nb3.k(obj8, bool2);
                if (obj8 != null) {
                    x47Var = (x47) qn2Var2.g(obj8);
                } else {
                    x47Var = null;
                }
                x47Var.getClass();
                long j = x47Var.a;
                Object obj9 = list5.get(1);
                nb3.k(obj9, bool2);
                if (obj9 != null) {
                    x47Var2 = (x47) qn2Var2.g(obj9);
                }
                x47Var2.getClass();
                return new g37(j, x47Var2.a);
            default:
                obj.getClass();
                return new oj2(((Integer) obj).intValue());
        }
    }

    public /* synthetic */ gn5(int i) {
        this.A = i;
    }
}
