package u1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements mc.l {
    public final /* synthetic */ int A;

    private final Object a(Object obj) {
        boolean z10;
        String n10;
        int i2;
        int i10;
        Integer valueOf;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        t7.a aVar = (t7.a) obj;
        aVar.getClass();
        t7.c T = aVar.T("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        try {
            int t5 = p7.m.t(T, "id");
            int t10 = p7.m.t(T, "state");
            int t11 = p7.m.t(T, "worker_class_name");
            int t12 = p7.m.t(T, "input_merger_class_name");
            int t13 = p7.m.t(T, "input");
            int t14 = p7.m.t(T, "output");
            int t15 = p7.m.t(T, "initial_delay");
            int t16 = p7.m.t(T, "interval_duration");
            int t17 = p7.m.t(T, "flex_duration");
            int t18 = p7.m.t(T, "run_attempt_count");
            int t19 = p7.m.t(T, "backoff_policy");
            int t20 = p7.m.t(T, "backoff_delay_duration");
            int t21 = p7.m.t(T, "last_enqueue_time");
            int t22 = p7.m.t(T, "minimum_retention_duration");
            int t23 = p7.m.t(T, "schedule_requested_at");
            int t24 = p7.m.t(T, "run_in_foreground");
            int t25 = p7.m.t(T, "out_of_quota_policy");
            int t26 = p7.m.t(T, "period_count");
            int t27 = p7.m.t(T, "generation");
            int t28 = p7.m.t(T, "next_schedule_time_override");
            int t29 = p7.m.t(T, "next_schedule_time_override_generation");
            int t30 = p7.m.t(T, "stop_reason");
            int t31 = p7.m.t(T, "trace_tag");
            int t32 = p7.m.t(T, "backoff_on_system_interruptions");
            int t33 = p7.m.t(T, "required_network_type");
            int t34 = p7.m.t(T, "required_network_request");
            int t35 = p7.m.t(T, "requires_charging");
            int t36 = p7.m.t(T, "requires_device_idle");
            int t37 = p7.m.t(T, "requires_battery_not_low");
            int t38 = p7.m.t(T, "requires_storage_not_low");
            int t39 = p7.m.t(T, "trigger_content_update_delay");
            int t40 = p7.m.t(T, "trigger_max_content_delay");
            int t41 = p7.m.t(T, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (T.N()) {
                String n11 = T.n(t5);
                int i11 = t22;
                ArrayList arrayList2 = arrayList;
                p8.e0 x9 = p7.m.x((int) T.getLong(t10));
                String n12 = T.n(t11);
                String n13 = T.n(t12);
                byte[] blob = T.getBlob(t13);
                p8.h hVar = p8.h.f11493b;
                p8.h v10 = p7.j.v(blob);
                p8.h v11 = p7.j.v(T.getBlob(t14));
                long j2 = T.getLong(t15);
                long j10 = T.getLong(t16);
                long j11 = T.getLong(t17);
                int i12 = (int) T.getLong(t18);
                int i13 = t10;
                int i14 = t11;
                p8.a u4 = p7.m.u((int) T.getLong(t19));
                long j12 = T.getLong(t20);
                long j13 = T.getLong(t21);
                long j14 = T.getLong(i11);
                int i15 = t23;
                long j15 = T.getLong(i15);
                int i16 = t5;
                int i17 = t24;
                if (((int) T.getLong(i17)) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i18 = t25;
                int i19 = t12;
                p8.c0 w10 = p7.m.w((int) T.getLong(i18));
                int i20 = t26;
                int i21 = t13;
                int i22 = (int) T.getLong(i20);
                int i23 = t27;
                int i24 = (int) T.getLong(i23);
                int i25 = t28;
                long j16 = T.getLong(i25);
                int i26 = t29;
                int i27 = (int) T.getLong(i26);
                int i28 = t30;
                int i29 = (int) T.getLong(i28);
                int i30 = t31;
                Boolean bool = null;
                if (T.isNull(i30)) {
                    n10 = null;
                } else {
                    n10 = T.n(i30);
                }
                int i31 = t32;
                if (T.isNull(i31)) {
                    i2 = i27;
                    i10 = i28;
                    valueOf = null;
                } else {
                    i2 = i27;
                    i10 = i28;
                    valueOf = Integer.valueOf((int) T.getLong(i31));
                }
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    bool = Boolean.valueOf(z15);
                }
                int i32 = t33;
                Boolean bool2 = bool;
                p8.w v12 = p7.m.v((int) T.getLong(i32));
                int i33 = t34;
                y8.f H = p7.m.H(T.getBlob(i33));
                t33 = i32;
                t34 = i33;
                int i34 = t35;
                if (((int) T.getLong(i34)) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                t35 = i34;
                int i35 = t36;
                if (((int) T.getLong(i35)) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i36 = t37;
                if (((int) T.getLong(i36)) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                t37 = i36;
                int i37 = t38;
                if (((int) T.getLong(i37)) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i38 = t39;
                int i39 = t40;
                int i40 = t41;
                t41 = i40;
                arrayList2.add(new x8.p(n11, x9, n12, n13, v10, v11, j2, j10, j11, new p8.e(H, v12, z11, z12, z13, z14, T.getLong(i38), T.getLong(i39), p7.m.f(T.getBlob(i40))), i12, u4, j12, j13, j14, j15, z10, w10, i22, i24, j16, i2, i29, n10, bool2));
                t38 = i37;
                t12 = i19;
                t25 = i18;
                t27 = i23;
                t30 = i10;
                t32 = i31;
                t39 = i38;
                t40 = i39;
                t10 = i13;
                t22 = i11;
                t11 = i14;
                arrayList = arrayList2;
                t5 = i16;
                t23 = i15;
                t24 = i17;
                t28 = i25;
                t29 = i26;
                t31 = i30;
                t36 = i35;
                t13 = i21;
                t26 = i20;
            }
            ArrayList arrayList3 = arrayList;
            T.close();
            return arrayList3;
        } catch (Throwable th2) {
            T.close();
            throw th2;
        }
    }

    private final Object e(Object obj) {
        boolean z10;
        String n10;
        int i2;
        Integer valueOf;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        t7.a aVar = (t7.a) obj;
        aVar.getClass();
        t7.c T = aVar.T("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            T.g(1, 200);
            int t5 = p7.m.t(T, "id");
            int t10 = p7.m.t(T, "state");
            int t11 = p7.m.t(T, "worker_class_name");
            int t12 = p7.m.t(T, "input_merger_class_name");
            int t13 = p7.m.t(T, "input");
            int t14 = p7.m.t(T, "output");
            int t15 = p7.m.t(T, "initial_delay");
            int t16 = p7.m.t(T, "interval_duration");
            int t17 = p7.m.t(T, "flex_duration");
            int t18 = p7.m.t(T, "run_attempt_count");
            int t19 = p7.m.t(T, "backoff_policy");
            int t20 = p7.m.t(T, "backoff_delay_duration");
            int t21 = p7.m.t(T, "last_enqueue_time");
            int t22 = p7.m.t(T, "minimum_retention_duration");
            int t23 = p7.m.t(T, "schedule_requested_at");
            int t24 = p7.m.t(T, "run_in_foreground");
            int t25 = p7.m.t(T, "out_of_quota_policy");
            int t26 = p7.m.t(T, "period_count");
            int t27 = p7.m.t(T, "generation");
            int t28 = p7.m.t(T, "next_schedule_time_override");
            int t29 = p7.m.t(T, "next_schedule_time_override_generation");
            int t30 = p7.m.t(T, "stop_reason");
            int t31 = p7.m.t(T, "trace_tag");
            int t32 = p7.m.t(T, "backoff_on_system_interruptions");
            int t33 = p7.m.t(T, "required_network_type");
            int t34 = p7.m.t(T, "required_network_request");
            int t35 = p7.m.t(T, "requires_charging");
            int t36 = p7.m.t(T, "requires_device_idle");
            int t37 = p7.m.t(T, "requires_battery_not_low");
            int t38 = p7.m.t(T, "requires_storage_not_low");
            int t39 = p7.m.t(T, "trigger_content_update_delay");
            int t40 = p7.m.t(T, "trigger_max_content_delay");
            int t41 = p7.m.t(T, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (T.N()) {
                String n11 = T.n(t5);
                int i10 = t21;
                int i11 = t22;
                p8.e0 x9 = p7.m.x((int) T.getLong(t10));
                String n12 = T.n(t11);
                String n13 = T.n(t12);
                byte[] blob = T.getBlob(t13);
                p8.h hVar = p8.h.f11493b;
                p8.h v10 = p7.j.v(blob);
                p8.h v11 = p7.j.v(T.getBlob(t14));
                long j2 = T.getLong(t15);
                long j10 = T.getLong(t16);
                long j11 = T.getLong(t17);
                int i12 = (int) T.getLong(t18);
                int i13 = t5;
                int i14 = t10;
                p8.a u4 = p7.m.u((int) T.getLong(t19));
                long j12 = T.getLong(t20);
                long j13 = T.getLong(i10);
                long j14 = T.getLong(i11);
                int i15 = t23;
                long j15 = T.getLong(i15);
                t23 = i15;
                int i16 = t24;
                int i17 = t11;
                if (((int) T.getLong(i16)) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i18 = t25;
                int i19 = t12;
                p8.c0 w10 = p7.m.w((int) T.getLong(i18));
                int i20 = t26;
                int i21 = (int) T.getLong(i20);
                int i22 = t27;
                int i23 = (int) T.getLong(i22);
                int i24 = t28;
                long j16 = T.getLong(i24);
                int i25 = t29;
                int i26 = (int) T.getLong(i25);
                t29 = i25;
                int i27 = t30;
                int i28 = (int) T.getLong(i27);
                int i29 = t31;
                Boolean bool = null;
                if (T.isNull(i29)) {
                    n10 = null;
                } else {
                    n10 = T.n(i29);
                }
                int i30 = t32;
                if (T.isNull(i30)) {
                    i2 = i29;
                    t30 = i27;
                    valueOf = null;
                } else {
                    i2 = i29;
                    t30 = i27;
                    valueOf = Integer.valueOf((int) T.getLong(i30));
                }
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    bool = Boolean.valueOf(z15);
                }
                Boolean bool2 = bool;
                int i31 = t33;
                p8.w v12 = p7.m.v((int) T.getLong(i31));
                int i32 = t34;
                y8.f H = p7.m.H(T.getBlob(i32));
                int i33 = t35;
                if (((int) T.getLong(i33)) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i34 = t36;
                if (((int) T.getLong(i34)) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i35 = t37;
                if (((int) T.getLong(i35)) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                t37 = i35;
                int i36 = t38;
                if (((int) T.getLong(i36)) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i37 = t39;
                int i38 = t40;
                t39 = i37;
                int i39 = t41;
                arrayList.add(new x8.p(n11, x9, n12, n13, v10, v11, j2, j10, j11, new p8.e(H, v12, z11, z12, z13, z14, T.getLong(i37), T.getLong(i38), p7.m.f(T.getBlob(i39))), i12, u4, j12, j13, j14, j15, z10, w10, i21, i23, j16, i26, i28, n10, bool2));
                t36 = i34;
                t12 = i19;
                t25 = i18;
                t26 = i20;
                t27 = i22;
                t28 = i24;
                t31 = i2;
                t32 = i30;
                t33 = i31;
                t34 = i32;
                t35 = i33;
                t41 = i39;
                t40 = i38;
                t38 = i36;
                t5 = i13;
                t11 = i17;
                t21 = i10;
                t22 = i11;
                t10 = i14;
                t24 = i16;
            }
            T.close();
            return arrayList;
        } catch (Throwable th2) {
            T.close();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v58, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // mc.l
    public final Object k(Object obj) {
        h1.n1 n1Var;
        l4.p0 a10;
        l4.j0 j0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        String n10;
        int i2;
        int i10;
        Integer valueOf;
        Boolean bool;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        String n11;
        int i11;
        int i12;
        Integer valueOf2;
        Boolean bool2;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29 = true;
        int i13 = 0;
        boolean z30 = false;
        switch (this.A) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                if (((Boolean) obj2).booleanValue()) {
                    n1Var = h1.n1.Vertical;
                } else {
                    n1Var = h1.n1.Horizontal;
                }
                Object obj3 = list.get(0);
                obj3.getClass();
                return new i1(n1Var, ((Float) obj3).floatValue());
            case DSiCameraSource.FrontCamera /* 1 */:
                l4.f fVar = (l4.f) obj;
                Object obj4 = fVar.f8790a;
                if ((obj4 instanceof l4.p) && (a10 = ((l4.p) obj4).a()) != null && (a10.f8871a != null || a10.f8872b != null || a10.f8873c != null || a10.f8874d != null)) {
                    Object obj5 = fVar.f8790a;
                    obj5.getClass();
                    l4.p0 a11 = ((l4.p) obj5).a();
                    if (a11 == null || (j0Var = a11.f8871a) == null) {
                        j0Var = new l4.j0(0L, 0L, (p4.j) null, (p4.h) null, (p4.i) null, (p4.p) null, (String) null, 0L, (w4.a) null, (w4.p) null, (s4.b) null, 0L, (w4.l) null, (i3.m0) null, 65535);
                    }
                    return p7.t.b(fVar, new l4.f(fVar.f8791b, fVar.f8792c, j0Var));
                }
                return p7.t.b(fVar);
            case 2:
                i4.w wVar = i4.t.A;
                yb.y yVar = yb.y.f14813a;
                ((i4.x) obj).a(wVar, yVar);
                return yVar;
            case 3:
                if (obj == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 4:
                Context context = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i14);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            case l1.c.f8511g /* 5 */:
                if (((Character) obj).charValue() == '-') {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case l1.c.f8509e /* 6 */:
                if (((Character) obj).charValue() == '-') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            case 7:
                char charValue = ((Character) obj).charValue();
                if (charValue != 'T' && charValue != 't') {
                    z13 = false;
                } else {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 8:
                if (((Character) obj).charValue() == ':') {
                    z14 = true;
                } else {
                    z14 = false;
                }
                return Boolean.valueOf(z14);
            case l1.c.f8508d /* 9 */:
                if (((Character) obj).charValue() == ':') {
                    z15 = true;
                } else {
                    z15 = false;
                }
                return Boolean.valueOf(z15);
            case l1.c.f8510f /* 10 */:
                char charValue2 = ((Character) obj).charValue();
                if ('0' <= charValue2 && charValue2 < ':') {
                    z16 = true;
                } else {
                    z16 = false;
                }
                return Boolean.valueOf(z16);
            case 11:
                ((h.a) obj).getClass();
                return yb.y.f14813a;
            case 12:
                ve.f fVar2 = (ve.f) obj;
                fVar2.getClass();
                UUID uuid = fVar2.f13798a;
                if (uuid == null) {
                    UUID randomUUID = UUID.randomUUID();
                    randomUUID.getClass();
                    return randomUUID;
                }
                return uuid;
            case 13:
                Void r02 = (Void) obj;
                return x0.f.f14319b;
            case 14:
                t7.a aVar = (t7.a) obj;
                aVar.getClass();
                t7.c T = aVar.T("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (T.N()) {
                        arrayList2.add(T.n(0));
                    }
                    return arrayList2;
                } finally {
                }
            case l1.c.f8512h /* 15 */:
                t7.a aVar2 = (t7.a) obj;
                aVar2.getClass();
                t7.c T2 = aVar2.T("DELETE FROM WorkProgress");
                try {
                    T2.N();
                    T2.close();
                    return yb.y.f14813a;
                } finally {
                }
            case 16:
                t7.a aVar3 = (t7.a) obj;
                aVar3.getClass();
                t7.c T3 = aVar3.T("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int t5 = p7.m.t(T3, "id");
                    int t10 = p7.m.t(T3, "state");
                    int t11 = p7.m.t(T3, "worker_class_name");
                    int t12 = p7.m.t(T3, "input_merger_class_name");
                    int t13 = p7.m.t(T3, "input");
                    int t14 = p7.m.t(T3, "output");
                    int t15 = p7.m.t(T3, "initial_delay");
                    int t16 = p7.m.t(T3, "interval_duration");
                    int t17 = p7.m.t(T3, "flex_duration");
                    int t18 = p7.m.t(T3, "run_attempt_count");
                    int t19 = p7.m.t(T3, "backoff_policy");
                    int t20 = p7.m.t(T3, "backoff_delay_duration");
                    int t21 = p7.m.t(T3, "last_enqueue_time");
                    int t22 = p7.m.t(T3, "minimum_retention_duration");
                    int t23 = p7.m.t(T3, "schedule_requested_at");
                    int t24 = p7.m.t(T3, "run_in_foreground");
                    int t25 = p7.m.t(T3, "out_of_quota_policy");
                    int t26 = p7.m.t(T3, "period_count");
                    int t27 = p7.m.t(T3, "generation");
                    int t28 = p7.m.t(T3, "next_schedule_time_override");
                    int t29 = p7.m.t(T3, "next_schedule_time_override_generation");
                    int t30 = p7.m.t(T3, "stop_reason");
                    int t31 = p7.m.t(T3, "trace_tag");
                    int t32 = p7.m.t(T3, "backoff_on_system_interruptions");
                    int t33 = p7.m.t(T3, "required_network_type");
                    int t34 = p7.m.t(T3, "required_network_request");
                    int t35 = p7.m.t(T3, "requires_charging");
                    int t36 = p7.m.t(T3, "requires_device_idle");
                    int t37 = p7.m.t(T3, "requires_battery_not_low");
                    int t38 = p7.m.t(T3, "requires_storage_not_low");
                    int t39 = p7.m.t(T3, "trigger_content_update_delay");
                    int t40 = p7.m.t(T3, "trigger_max_content_delay");
                    int t41 = p7.m.t(T3, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (T3.N()) {
                        String n12 = T3.n(t5);
                        int i15 = t22;
                        ArrayList arrayList4 = arrayList3;
                        p8.e0 x9 = p7.m.x((int) T3.getLong(t10));
                        String n13 = T3.n(t11);
                        String n14 = T3.n(t12);
                        byte[] blob = T3.getBlob(t13);
                        p8.h hVar = p8.h.f11493b;
                        p8.h v10 = p7.j.v(blob);
                        p8.h v11 = p7.j.v(T3.getBlob(t14));
                        long j2 = T3.getLong(t15);
                        long j10 = T3.getLong(t16);
                        long j11 = T3.getLong(t17);
                        int i16 = (int) T3.getLong(t18);
                        int i17 = t10;
                        int i18 = t11;
                        p8.a u4 = p7.m.u((int) T3.getLong(t19));
                        long j12 = T3.getLong(t20);
                        long j13 = T3.getLong(t21);
                        long j14 = T3.getLong(i15);
                        int i19 = t23;
                        long j15 = T3.getLong(i19);
                        int i20 = t5;
                        int i21 = t24;
                        if (((int) T3.getLong(i21)) != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        int i22 = t25;
                        int i23 = t12;
                        p8.c0 w10 = p7.m.w((int) T3.getLong(i22));
                        int i24 = t26;
                        int i25 = t13;
                        int i26 = (int) T3.getLong(i24);
                        int i27 = t27;
                        int i28 = (int) T3.getLong(i27);
                        int i29 = t28;
                        long j16 = T3.getLong(i29);
                        int i30 = t29;
                        int i31 = (int) T3.getLong(i30);
                        int i32 = t30;
                        int i33 = (int) T3.getLong(i32);
                        int i34 = t31;
                        if (T3.isNull(i34)) {
                            n10 = null;
                        } else {
                            n10 = T3.n(i34);
                        }
                        int i35 = t32;
                        if (T3.isNull(i35)) {
                            i2 = i31;
                            i10 = i32;
                            valueOf = null;
                        } else {
                            i2 = i31;
                            i10 = i32;
                            valueOf = Integer.valueOf((int) T3.getLong(i35));
                        }
                        if (valueOf != null) {
                            if (valueOf.intValue() != 0) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            bool = Boolean.valueOf(z22);
                        } else {
                            bool = null;
                        }
                        int i36 = t33;
                        p8.w v12 = p7.m.v((int) T3.getLong(i36));
                        int i37 = t34;
                        y8.f H = p7.m.H(T3.getBlob(i37));
                        t33 = i36;
                        t34 = i37;
                        int i38 = t35;
                        if (((int) T3.getLong(i38)) != 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        t35 = i38;
                        int i39 = t36;
                        if (((int) T3.getLong(i39)) != 0) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        int i40 = t37;
                        if (((int) T3.getLong(i40)) != 0) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        t37 = i40;
                        int i41 = t38;
                        if (((int) T3.getLong(i41)) != 0) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        int i42 = t39;
                        int i43 = t40;
                        int i44 = t41;
                        t41 = i44;
                        arrayList4.add(new x8.p(n12, x9, n13, n14, v10, v11, j2, j10, j11, new p8.e(H, v12, z18, z19, z20, z21, T3.getLong(i42), T3.getLong(i43), p7.m.f(T3.getBlob(i44))), i16, u4, j12, j13, j14, j15, z17, w10, i26, i28, j16, i2, i33, n10, bool));
                        t38 = i41;
                        t12 = i23;
                        t25 = i22;
                        t27 = i27;
                        t30 = i10;
                        t32 = i35;
                        t39 = i42;
                        t40 = i43;
                        t10 = i17;
                        t22 = i15;
                        t11 = i18;
                        arrayList3 = arrayList4;
                        t5 = i20;
                        t23 = i19;
                        t24 = i21;
                        t28 = i29;
                        t29 = i30;
                        t31 = i34;
                        t36 = i39;
                        t13 = i25;
                        t26 = i24;
                    }
                    return arrayList3;
                } finally {
                }
            case 17:
                t7.a aVar4 = (t7.a) obj;
                aVar4.getClass();
                t7.c T4 = aVar4.T("SELECT * FROM workspec WHERE state=1");
                try {
                    int t42 = p7.m.t(T4, "id");
                    int t43 = p7.m.t(T4, "state");
                    int t44 = p7.m.t(T4, "worker_class_name");
                    int t45 = p7.m.t(T4, "input_merger_class_name");
                    int t46 = p7.m.t(T4, "input");
                    int t47 = p7.m.t(T4, "output");
                    int t48 = p7.m.t(T4, "initial_delay");
                    int t49 = p7.m.t(T4, "interval_duration");
                    int t50 = p7.m.t(T4, "flex_duration");
                    int t51 = p7.m.t(T4, "run_attempt_count");
                    int t52 = p7.m.t(T4, "backoff_policy");
                    int t53 = p7.m.t(T4, "backoff_delay_duration");
                    int t54 = p7.m.t(T4, "last_enqueue_time");
                    int t55 = p7.m.t(T4, "minimum_retention_duration");
                    int t56 = p7.m.t(T4, "schedule_requested_at");
                    int t57 = p7.m.t(T4, "run_in_foreground");
                    int t58 = p7.m.t(T4, "out_of_quota_policy");
                    int t59 = p7.m.t(T4, "period_count");
                    int t60 = p7.m.t(T4, "generation");
                    int t61 = p7.m.t(T4, "next_schedule_time_override");
                    int t62 = p7.m.t(T4, "next_schedule_time_override_generation");
                    int t63 = p7.m.t(T4, "stop_reason");
                    int t64 = p7.m.t(T4, "trace_tag");
                    int t65 = p7.m.t(T4, "backoff_on_system_interruptions");
                    int t66 = p7.m.t(T4, "required_network_type");
                    int t67 = p7.m.t(T4, "required_network_request");
                    int t68 = p7.m.t(T4, "requires_charging");
                    int t69 = p7.m.t(T4, "requires_device_idle");
                    int t70 = p7.m.t(T4, "requires_battery_not_low");
                    int t71 = p7.m.t(T4, "requires_storage_not_low");
                    int t72 = p7.m.t(T4, "trigger_content_update_delay");
                    int t73 = p7.m.t(T4, "trigger_max_content_delay");
                    int t74 = p7.m.t(T4, "content_uri_triggers");
                    ArrayList arrayList5 = new ArrayList();
                    while (T4.N()) {
                        String n15 = T4.n(t42);
                        int i45 = t42;
                        ArrayList arrayList6 = arrayList5;
                        p8.e0 x10 = p7.m.x((int) T4.getLong(t43));
                        String n16 = T4.n(t44);
                        String n17 = T4.n(t45);
                        byte[] blob2 = T4.getBlob(t46);
                        p8.h hVar2 = p8.h.f11493b;
                        p8.h v13 = p7.j.v(blob2);
                        p8.h v14 = p7.j.v(T4.getBlob(t47));
                        long j17 = T4.getLong(t48);
                        long j18 = T4.getLong(t49);
                        long j19 = T4.getLong(t50);
                        int i46 = (int) T4.getLong(t51);
                        p8.a u10 = p7.m.u((int) T4.getLong(t52));
                        long j20 = T4.getLong(t53);
                        long j21 = T4.getLong(t54);
                        long j22 = T4.getLong(t55);
                        int i47 = t56;
                        long j23 = T4.getLong(i47);
                        int i48 = t43;
                        int i49 = t57;
                        int i50 = t44;
                        if (((int) T4.getLong(i49)) != 0) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        int i51 = t58;
                        p8.c0 w11 = p7.m.w((int) T4.getLong(i51));
                        int i52 = t59;
                        int i53 = (int) T4.getLong(i52);
                        int i54 = t60;
                        int i55 = (int) T4.getLong(i54);
                        int i56 = t61;
                        long j24 = T4.getLong(i56);
                        int i57 = t62;
                        int i58 = (int) T4.getLong(i57);
                        int i59 = t63;
                        int i60 = (int) T4.getLong(i59);
                        int i61 = t64;
                        if (T4.isNull(i61)) {
                            n11 = null;
                        } else {
                            n11 = T4.n(i61);
                        }
                        int i62 = t65;
                        if (T4.isNull(i62)) {
                            i11 = i58;
                            i12 = i59;
                            valueOf2 = null;
                        } else {
                            i11 = i58;
                            i12 = i59;
                            valueOf2 = Integer.valueOf((int) T4.getLong(i62));
                        }
                        if (valueOf2 != null) {
                            if (valueOf2.intValue() != 0) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            bool2 = Boolean.valueOf(z28);
                        } else {
                            bool2 = null;
                        }
                        t65 = i62;
                        int i63 = t66;
                        p8.w v15 = p7.m.v((int) T4.getLong(i63));
                        int i64 = t67;
                        y8.f H2 = p7.m.H(T4.getBlob(i64));
                        t66 = i63;
                        int i65 = t68;
                        if (((int) T4.getLong(i65)) != 0) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        t68 = i65;
                        int i66 = t69;
                        if (((int) T4.getLong(i66)) != 0) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        t69 = i66;
                        int i67 = t70;
                        if (((int) T4.getLong(i67)) != 0) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        t70 = i67;
                        int i68 = t71;
                        if (((int) T4.getLong(i68)) != 0) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        int i69 = t72;
                        int i70 = t73;
                        t72 = i69;
                        int i71 = t74;
                        t74 = i71;
                        t73 = i70;
                        arrayList5 = arrayList6;
                        arrayList5.add(new x8.p(n15, x10, n16, n17, v13, v14, j17, j18, j19, new p8.e(H2, v15, z24, z25, z26, z27, T4.getLong(i69), T4.getLong(i70), p7.m.f(T4.getBlob(i71))), i46, u10, j20, j21, j22, j23, z23, w11, i53, i55, j24, i11, i60, n11, bool2));
                        t71 = i68;
                        t42 = i45;
                        t43 = i48;
                        t56 = i47;
                        t59 = i52;
                        t60 = i54;
                        t61 = i56;
                        t62 = i57;
                        t63 = i12;
                        t64 = i61;
                        t67 = i64;
                        t44 = i50;
                        t57 = i49;
                        t58 = i51;
                    }
                    return arrayList5;
                } finally {
                }
            case 18:
                return a(obj);
            case 19:
                t7.a aVar5 = (t7.a) obj;
                aVar5.getClass();
                t7.c T5 = aVar5.T("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    if (T5.N()) {
                        i13 = (int) T5.getLong(0);
                    }
                    T5.close();
                    return Integer.valueOf(i13);
                } finally {
                }
            case 20:
                t7.a aVar6 = (t7.a) obj;
                aVar6.getClass();
                t7.c T6 = aVar6.T("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (T6.N()) {
                        if (((int) T6.getLong(0)) == 0) {
                            z29 = false;
                        }
                        z30 = z29;
                    }
                    T6.close();
                    return Boolean.valueOf(z30);
                } finally {
                }
            case 21:
                return e(obj);
            case 22:
                t7.a aVar7 = (t7.a) obj;
                aVar7.getClass();
                t7.c T7 = aVar7.T("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    T7.N();
                    int u11 = p7.l.u(aVar7);
                    T7.close();
                    return Integer.valueOf(u11);
                } finally {
                }
            case 23:
                return new y2.e((Map) obj);
            case 24:
                return obj;
            case 25:
                WorkDatabase workDatabase = (WorkDatabase) obj;
                workDatabase.getClass();
                wa.b bVar = x8.p.f14419z;
                x8.u w12 = workDatabase.w();
                w12.getClass();
                Object apply = bVar.apply((List) q8.r.K(w12.f14444a, true, true, new x8.s(w12, 1)));
                apply.getClass();
                return (List) apply;
            case 26:
                synchronized (z2.l.f14919c) {
                    ?? r32 = z2.l.f14925i;
                    int size2 = r32.size();
                    for (int i72 = 0; i72 < size2; i72++) {
                        ((mc.l) r32.get(i72)).k(obj);
                    }
                }
                return yb.y.f14813a;
            case 27:
                z2.j jVar = (z2.j) obj;
                h1 h1Var = z2.l.f14917a;
                return yb.y.f14813a;
            case 28:
                cc.e eVar = (cc.e) obj;
                if (eVar instanceof zc.q) {
                    return (zc.q) eVar;
                }
                return null;
            default:
                dg.a aVar8 = (dg.a) obj;
                aVar8.getClass();
                try {
                    return new dg.b(aVar8.k(), aVar8.m(), aVar8.q(), aVar8.o(), aVar8.r(), aVar8.n(), zf.e.d(aVar8.p()), zf.e.d(aVar8.l()));
                } catch (Exception e6) {
                    e6.printStackTrace();
                    return null;
                }
        }
    }

    public /* synthetic */ h1(int i2) {
        this.A = i2;
    }
}
