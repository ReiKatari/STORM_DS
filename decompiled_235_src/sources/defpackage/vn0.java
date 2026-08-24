package defpackage;

import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vn0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vn0 implements qn2 {
    public final /* synthetic */ int A;

    public /* synthetic */ vn0(int i) {
        this.A = i;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        c37 c37Var;
        c37 c37Var2;
        c37 c37Var3;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                qn2 qn2Var = (qn2) c37.d.L;
                Object obj2 = list.get(0);
                obj2.getClass();
                xn0 xn0Var = new xn0(((Boolean) obj2).booleanValue());
                Object obj3 = list.get(1);
                if (obj3 == null || (c37Var = (c37) qn2Var.g(obj3)) == null) {
                    c37Var = new c37((String) null, 7, 0L);
                }
                xn0Var.b.setValue(c37Var);
                Object obj4 = list.get(2);
                if (obj4 == null || (c37Var2 = (c37) qn2Var.g(obj4)) == null) {
                    c37Var2 = new c37((String) null, 7, 0L);
                }
                xn0Var.c.setValue(c37Var2);
                Object obj5 = list.get(3);
                if (obj5 == null || (c37Var3 = (c37) qn2Var.g(obj5)) == null) {
                    c37Var3 = new c37((String) null, 7, 0L);
                }
                xn0Var.d.setValue(c37Var3);
                return xn0Var;
            case 1:
                ((yn) obj).getClass();
                return i52.h(new vn0(6));
            case 2:
                ((yn) obj).getClass();
                return i52.j(1, new vn0(7));
            case 3:
                ((yn) obj).getClass();
                return i52.h(new vn0(5));
            case 4:
                ((yn) obj).getClass();
                return i52.j(1, new vn0(6));
            case 5:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 6:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 7:
                return Integer.valueOf(-((Integer) obj).intValue());
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
                fh2 fh2Var3 = (fh2) obj;
                fh2Var3.getClass();
                fh2Var3.a();
                return jg7Var;
            case 11:
                fh2 fh2Var4 = (fh2) obj;
                fh2Var4.getClass();
                fh2Var4.a();
                return jg7Var;
            case 12:
                fh2 fh2Var5 = (fh2) obj;
                fh2Var5.getClass();
                fh2Var5.a();
                return jg7Var;
            case 13:
                fh2 fh2Var6 = (fh2) obj;
                fh2Var6.getClass();
                fh2Var6.a();
                return jg7Var;
            case 14:
                fh2 fh2Var7 = (fh2) obj;
                fh2Var7.getClass();
                fh2Var7.a();
                return jg7Var;
            case 15:
                fh2 fh2Var8 = (fh2) obj;
                fh2Var8.getClass();
                fh2Var8.a();
                return jg7Var;
            case 16:
                fh2 fh2Var9 = (fh2) obj;
                fh2Var9.getClass();
                fh2Var9.a();
                return jg7Var;
            case 17:
                j61 j61Var = (j61) obj;
                if (!(j61Var instanceof n61)) {
                    return null;
                }
                return (n61) j61Var;
            case 18:
                DSiWareTitle dSiWareTitle = (DSiWareTitle) obj;
                dSiWareTitle.getClass();
                return Long.valueOf(dSiWareTitle.getTitleId());
            case 19:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                StringBuilder r = i61.r((String) entry.getKey(), " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                r.append(value);
                return r.toString();
            case 20:
                if (obj instanceof Object[]) {
                    return fv.M0((Object[]) obj, "[", "]", new vn0(20), 25);
                }
                return String.valueOf(obj);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                List list2 = (List) obj;
                Object obj6 = list2.get(0);
                obj6.getClass();
                int intValue = ((Integer) obj6).intValue();
                Object obj7 = list2.get(1);
                obj7.getClass();
                return new ue1(intValue, ((Float) obj7).floatValue(), new b5(1, list2));
            case 22:
                jk4 jk4Var = (jk4) obj;
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                bz4 bz4Var = (bz4) obj;
                return Boolean.TRUE;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                fp1 fp1Var = (fp1) obj;
                sc7 sc7Var = dp1.a;
                return Boolean.TRUE;
            case 25:
                Map.Entry entry2 = (Map.Entry) obj;
                int i2 = EmulatorActivity.Z1;
                entry2.getClass();
                Object key = entry2.getKey();
                Object value2 = entry2.getValue();
                return key + "=" + value2;
            case SubAllocator.N4 /* 26 */:
                gb5 gb5Var = (gb5) obj;
                gb5Var.getClass();
                return new ev(gb5Var.f, 1);
            case 27:
                eb5 eb5Var = (eb5) obj;
                eb5Var.getClass();
                o75 o75Var = eb5Var.a;
                return new sj4(o75Var.a, o75Var.l);
            case 28:
                sj4 sj4Var = (sj4) obj;
                sj4Var.getClass();
                return Long.valueOf(sj4Var.a);
            default:
                gb5 gb5Var2 = (gb5) obj;
                gb5Var2.getClass();
                return new ev(gb5Var2.g, 1);
        }
    }
}
