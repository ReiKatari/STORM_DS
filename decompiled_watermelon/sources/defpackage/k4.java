package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class k4 implements mi2 {
    public final /* synthetic */ int A;

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        f3 f3Var;
        long j;
        String str;
        String str2;
        Object kc5Var;
        Integer num;
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z = false;
        switch (i) {
            case 0:
                ((p15) obj).getClass();
                return "leaderboard";
            case 1:
                ((n6) obj).getClass();
                return "achievement";
            case 2:
                j15 j15Var = (j15) obj;
                j15Var.getClass();
                return wh1.h(j15Var.a, "leaderboard-");
            case 3:
                ((j15) obj).getClass();
                return "leaderboard";
            case 4:
                ((f3) obj).getClass();
                return Boolean.valueOf(!f3Var.b.isEmpty());
            case 5:
                mn mnVar = (mn) obj;
                mnVar.getClass();
                if (mnVar.c() == er4.SHOW_TITLE) {
                    return b53.m0(t02.a(13), t02.e(null, 3));
                }
                return b53.m0(t02.i(1, new nl0(6)).a(t02.d(null, 3)), t02.k(new k4(6)).a(t02.e(null, 3)));
            case ig7.b /* 6 */:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 7:
                t3 t3Var = (t3) obj;
                t3Var.getClass();
                if (t3Var instanceof i3) {
                    j = ((i3) t3Var).c;
                    str = "primed-";
                } else if (t3Var instanceof j3) {
                    j = ((j3) t3Var).f;
                    str = "progress-";
                } else if (t3Var instanceof m3) {
                    j = ((m3) t3Var).f;
                    str = "leaderboard-attempt-";
                } else if (t3Var instanceof n3) {
                    j = ((n3) t3Var).g;
                    str = "leaderboard-result-";
                } else if (t3Var instanceof p3) {
                    j = ((p3) t3Var).f;
                    str = "leaderboard-pending-";
                } else if (t3Var instanceof o3) {
                    return wh1.h(((o3) t3Var).j, "leaderboard-");
                } else {
                    if (t3Var instanceof k3) {
                        j = ((k3) t3Var).d;
                        str = "challenge-result-";
                    } else if (t3Var instanceof s3) {
                        j = ((s3) t3Var).d;
                        str = "server-error-";
                    } else {
                        i.c();
                        return null;
                    }
                }
                return wh1.h(j, str);
            case 8:
                Context context = (Context) obj;
                context.getClass();
                if (!(context instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) context).getBaseContext();
            case 9:
                File file = (File) obj;
                file.getClass();
                if (file.isFile() && q72.I(file).equalsIgnoreCase("so")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                return Boolean.TRUE;
            case 11:
                return Boolean.valueOf(!(((po) obj) instanceof bj4));
            case mj2.L /* 12 */:
                c73 c73Var = (c73) obj;
                c73Var.getClass();
                c73Var.b = true;
                c73Var.a = false;
                return o27Var;
            case 13:
                return (pv) obj;
            case 14:
                return Integer.valueOf(-((Integer) obj).intValue());
            case ig7.e /* 15 */:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 16:
                int i2 = BackgroundsActivity.A0;
                ((mn) obj).getClass();
                return t02.d(null, 3);
            case 17:
                int i3 = BackgroundsActivity.A0;
                ((mn) obj).getClass();
                return z02.b;
            case 18:
                int i4 = BackgroundsActivity.A0;
                ((mn) obj).getClass();
                return t02.e(null, 3);
            case 19:
                lr6 lr6Var = (lr6) obj;
                int i5 = q10.a;
                return o27Var;
            case 20:
                ((xf3) obj).a();
                return o27Var;
            case 21:
                ((String) obj).getClass();
                return Boolean.valueOf(!zg6.B0(str2));
            case 22:
                String str3 = (String) obj;
                str3.getClass();
                try {
                    kc5Var = URLDecoder.decode(str3, "UTF-8");
                } catch (Throwable th) {
                    kc5Var = new kc5(th);
                }
                if (kc5Var instanceof kc5) {
                    kc5Var = str3;
                }
                String str4 = (String) kc5Var;
                str4.getClass();
                String e = a50.e(zg6.W0(zg6.K0(str4, ".png"), " ("));
                List P0 = zg6.P0(e, new char[]{' '}, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : P0) {
                    if (((String) obj2).length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                return new z40(str3, e, tq0.s1(arrayList));
            case 23:
                ku3 ku3Var = (ku3) obj;
                ku3Var.getClass();
                return (String) ((iu3) ku3Var.a()).get(1);
            case 24:
                String str5 = (String) obj;
                str5.getClass();
                if (!gh6.n0(str5, "/", false) && !gh6.n0(str5, "..", false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 25:
                sm4 sm4Var = (sm4) obj;
                ye6 ye6Var = ue.b;
                sm4Var.getClass();
                if (!((Context) l.L(sm4Var, ye6Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    v50.a.getClass();
                    return u50.c;
                }
                return x50.b;
            case 26:
                pz5.d((rz5) obj, 0);
                return o27Var;
            case 27:
                ((lr6) obj).getClass();
                return o27Var;
            case 28:
                ls5 ls5Var = (ls5) obj;
                ls5Var.getClass();
                ns5 i0 = ls5Var.i0("DELETE FROM cheat_folder WHERE id NOT IN (SELECT DISTINCT cheat_folder_id FROM cheat)");
                try {
                    i0.a0();
                    return o27Var;
                } finally {
                    i0.close();
                }
            default:
                List list = (List) obj;
                list.getClass();
                Object obj3 = list.get(0);
                if (obj3 instanceof Integer) {
                    num = (Integer) obj3;
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 0) {
                    return zk0.b;
                }
                if (num != null && num.intValue() == 1) {
                    return al0.b;
                }
                if (num == null || num.intValue() != 2) {
                    return null;
                }
                Object obj4 = list.get(1);
                obj4.getClass();
                return new yk0(((zl0) obj4).a());
        }
    }

    public /* synthetic */ k4(int i) {
        this.A = i;
    }
}
