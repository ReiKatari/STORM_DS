package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n44  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n44 implements mi2 {
    public final /* synthetic */ int A;

    public /* synthetic */ n44(sd1 sd1Var) {
        this.A = 21;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        boolean z = true;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                b44 b44Var = ((l34) ((mn) obj).c()).B;
                b44Var.getClass();
                int i2 = b44.X;
                for (b44 b44Var2 : jk2.z((xt0) b44Var)) {
                }
                return null;
            case 1:
                mn mnVar = (mn) obj;
                return t02.e(ct3.V0(700, 0, null, 6), 2);
            case 2:
                return ((l34) obj).Y;
            case 3:
                dj djVar = ((z64) obj).a;
                if (djVar != null) {
                    djVar.c();
                }
                return o27Var;
            case 4:
                return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
            case 5:
                ea4 ea4Var = (ea4) obj;
                ea4Var.getClass();
                if (ea4Var.a.a != ga4.ACHIEVEMENT_UNLOCK) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case ig7.b /* 6 */:
                ea4 ea4Var2 = (ea4) obj;
                ea4Var2.getClass();
                if (ea4Var2.a.a != ga4.ACHIEVEMENT_ACK) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                ea4 ea4Var3 = (ea4) obj;
                ea4Var3.getClass();
                return Long.valueOf(ea4Var3.a.l);
            case 8:
                if (((Long) obj).longValue() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                hb4 hb4Var = (hb4) obj;
                hb4Var.getClass();
                return Long.valueOf(hb4Var.h);
            case 10:
                if (((Long) obj).longValue() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                rz5 rz5Var = (rz5) obj;
                int i3 = vf4.b;
                return o27Var;
            case mj2.L /* 12 */:
                sm4 sm4Var = (sm4) obj;
                int i4 = mi.a;
                ye6 ye6Var = ue.b;
                sm4Var.getClass();
                Context context = (Context) l.L(sm4Var, ye6Var);
                od1 od1Var = (od1) l.L(sm4Var, ov0.h);
                sg4 sg4Var = (sg4) l.L(sm4Var, tg4.a);
                if (sg4Var == null) {
                    return null;
                }
                return new fg(context, od1Var, sg4Var.a, sg4Var.b);
            case 13:
                oc2 oc2Var = (oc2) obj;
                oc2Var.getClass();
                oc2Var.b();
                return o27Var;
            case 14:
                ll4 ll4Var = (ll4) obj;
                ll4Var.getClass();
                return ll4Var.toString();
            case ig7.e /* 15 */:
                oc2 oc2Var2 = (oc2) obj;
                oc2Var2.getClass();
                oc2Var2.b();
                return o27Var;
            case 16:
                oc2 oc2Var3 = (oc2) obj;
                oc2Var3.getClass();
                oc2Var3.b();
                return o27Var;
            case 17:
                oc2 oc2Var4 = (oc2) obj;
                oc2Var4.getClass();
                oc2Var4.b();
                return o27Var;
            case 18:
                xl4 xl4Var = (xl4) obj;
                xl4Var.getClass();
                return Long.valueOf(xl4Var.a.c());
            case 19:
                xl4 xl4Var2 = (xl4) obj;
                xl4Var2.getClass();
                return Long.valueOf(xl4Var2.a.f());
            case 20:
                xl4 xl4Var3 = (xl4) obj;
                xl4Var3.getClass();
                return xl4Var3.a.e();
            case 21:
                ne2 ne2Var = (ne2) obj;
                return "'" + ne2Var.a() + "' " + ne2Var.b();
            case 22:
                Void r13 = (Void) obj;
                return bu4.b;
            case 23:
                Context context2 = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context2.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i5);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context2.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context2.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            case 24:
                jb3 jb3Var = (jb3) obj;
                jb3Var.a = 1332;
                jb3Var.a(Float.valueOf((float) RecyclerView.A1), 0).b = yu4.e;
                jb3Var.a(Float.valueOf(290.0f), 666);
                return o27Var;
            case 25:
                rz5 rz5Var2 = (rz5) obj;
                l41 l41Var = yu4.a;
                return o27Var;
            case 26:
                jb3 jb3Var2 = (jb3) obj;
                jb3Var2.a = 1332;
                jb3Var2.a(Float.valueOf((float) RecyclerView.A1), 666).b = yu4.e;
                jb3Var2.a(Float.valueOf(290.0f), jb3Var2.a);
                return o27Var;
            case 27:
                jb3 jb3Var3 = (jb3) obj;
                jb3Var3.a = 1800;
                jb3Var3.a(Float.valueOf((float) RecyclerView.A1), 0).b = yu4.a;
                jb3Var3.a(Float.valueOf(1.0f), 750);
                return o27Var;
            case 28:
                jb3 jb3Var4 = (jb3) obj;
                jb3Var4.a = 1800;
                jb3Var4.a(Float.valueOf((float) RecyclerView.A1), 333).b = yu4.b;
                jb3Var4.a(Float.valueOf(1.0f), 1183);
                return o27Var;
            default:
                jb3 jb3Var5 = (jb3) obj;
                jb3Var5.a = 1800;
                jb3Var5.a(Float.valueOf((float) RecyclerView.A1), 1000).b = yu4.c;
                jb3Var5.a(Float.valueOf(1.0f), 1567);
                return o27Var;
        }
    }

    public /* synthetic */ n44(int i) {
        this.A = i;
    }
}
