package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ja7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ja7 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ ja7(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [ci6, java.util.Map, wu] */
    /* JADX WARN: Type inference failed for: r13v1, types: [ci6, wu] */
    @Override // defpackage.qn2
    public final Object g(Object obj) {
        Object value;
        pr7 pr7Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = 3;
        int i2 = 2;
        int i3 = 1;
        switch (this.A) {
            case 0:
                ga7 ga7Var = (ga7) this.B;
                ga7 ga7Var2 = (ga7) this.L;
                gl1 gl1Var = (gl1) obj;
                ga7Var.j.add(ga7Var2);
                return new j00(8, ga7Var, ga7Var2);
            case 1:
                gl1 gl1Var2 = (gl1) obj;
                return new j00(9, (ga7) this.B, (w97) this.L);
            case 2:
                Object obj2 = this.B;
                w61 w61Var = (w61) this.L;
                on2 on2Var = (on2) obj;
                if (obj2 == Thread.currentThread()) {
                    on2Var.c();
                } else {
                    hv.L(w61Var, null, null, new y3(on2Var, (r41) null, 17), 3);
                }
                return jg7.a;
            case 3:
                ga7 ga7Var3 = (ga7) this.B;
                ca7 ca7Var = (ca7) this.L;
                gl1 gl1Var3 = (gl1) obj;
                ga7Var3.i.add(ca7Var);
                return new j00(10, ga7Var3, ca7Var);
            case 4:
                rr6 rr6Var = (rr6) this.B;
                te7 te7Var = (te7) this.L;
                we7 we7Var = (we7) obj;
                synchronized (((w31) rr6Var.B)) {
                    try {
                        boolean c = we7Var.c();
                        yz3 yz3Var = (yz3) rr6Var.L;
                        if (c) {
                            we7 we7Var2 = (we7) yz3Var.l(te7Var, we7Var);
                        } else {
                            we7 we7Var3 = (we7) yz3Var.m(te7Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return jg7.a;
            case 5:
                nh7 nh7Var = (nh7) this.B;
                ((Long) obj).getClass();
                float f = nh7Var.e;
                nh7Var.e = RecyclerView.B1;
                ((qn2) this.L).g(Float.valueOf(f));
                return jg7.a;
            case 6:
                gj7 gj7Var = (gj7) this.B;
                ed3 ed3Var = (ed3) this.L;
                Throwable th2 = (Throwable) obj;
                synchronized (gj7Var.k) {
                    gj7Var.w.remove(ed3Var);
                }
                return jg7.a;
            case 7:
                hm4 hm4Var = (hm4) this.L;
                Integer num = (Integer) obj;
                num.getClass();
                tp6 tp6Var = ((qr7) this.B).e;
                do {
                    value = tp6Var.getValue();
                    pr7Var = (pr7) value;
                } while (!tp6Var.j(value, pr7.a(pr7Var, false, null, null, null, null, null, null, null, c14.p0(pr7Var.i, new vr4(hm4Var.a, num)), null, null, 1791)));
                return jg7.a;
            case 8:
                dv7 dv7Var = (dv7) this.B;
                View view = (View) this.L;
                gl1 gl1Var4 = (gl1) obj;
                dv7Var.a(view);
                return new j00(11, dv7Var, view);
            case 9:
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                ((qw7) this.B).b.Y(e36Var, (pw7) this.L);
                return jg7.a;
            case 10:
                e36 e36Var2 = (e36) obj;
                e36Var2.getClass();
                ((sw7) this.B).b.Y(e36Var2, (rw7) this.L);
                return jg7.a;
            case 11:
                String str = (String) this.B;
                dx7 dx7Var = (dx7) this.L;
                e36 e36Var3 = (e36) obj;
                e36Var3.getClass();
                j36 i0 = e36Var3.i0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    i0.w(1, str);
                    int i4 = 0;
                    ?? ci6Var = new ci6(0);
                    ?? ci6Var2 = new ci6(0);
                    while (i0.f0()) {
                        String R = i0.R(0);
                        if (!ci6Var.containsKey(R)) {
                            ci6Var.put(R, new ArrayList());
                        }
                        String R2 = i0.R(0);
                        if (!ci6Var2.containsKey(R2)) {
                            ci6Var2.put(R2, new ArrayList());
                        }
                    }
                    i0.reset();
                    dx7Var.b(e36Var3, ci6Var);
                    dx7Var.a(e36Var3, ci6Var2);
                    ArrayList arrayList = new ArrayList();
                    Map map = ci6Var2;
                    while (i0.f0()) {
                        String R3 = i0.R(i4);
                        Map map2 = map;
                        iw7 f2 = ds7.f((int) i0.getLong(i3));
                        byte[] blob = i0.getBlob(i2);
                        xb1 xb1Var = xb1.b;
                        xb1 k = u24.k(blob);
                        int i5 = (int) i0.getLong(i);
                        int i6 = (int) i0.getLong(4);
                        long j = i0.getLong(14);
                        long j2 = i0.getLong(15);
                        long j3 = i0.getLong(16);
                        w10 c2 = ds7.c((int) i0.getLong(17));
                        long j4 = i0.getLong(18);
                        long j5 = i0.getLong(19);
                        int i7 = (int) i0.getLong(20);
                        long j6 = i0.getLong(21);
                        int i8 = (int) i0.getLong(22);
                        kf4 d = ds7.d((int) i0.getLong(5));
                        af4 h = ds7.h(i0.getBlob(6));
                        if (((int) i0.getLong(7)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (((int) i0.getLong(8)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (((int) i0.getLong(9)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (((int) i0.getLong(10)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        p21 p21Var = new p21(h, d, z, z2, z3, z4, i0.getLong(11), i0.getLong(12), ds7.a(i0.getBlob(13)));
                        Object j0 = c14.j0(ci6Var, i0.R(0));
                        j0.getClass();
                        List list = (List) j0;
                        Object j02 = c14.j0(map2, i0.R(0));
                        j02.getClass();
                        arrayList.add(new xw7(R3, f2, k, j, j2, j3, p21Var, i5, c2, j4, j5, i7, i6, j6, i8, list, (List) j02));
                        i4 = 0;
                        map = map2;
                        i = 3;
                        i2 = 2;
                        i3 = 1;
                    }
                    return arrayList;
                } catch (Throwable th3) {
                    throw th3;
                }
            case 12:
                iw7 iw7Var = (iw7) this.B;
                String str2 = (String) this.L;
                e36 e36Var4 = (e36) obj;
                e36Var4.getClass();
                j36 i02 = e36Var4.i0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    i02.c(1, ds7.g(iw7Var));
                    i02.w(2, str2);
                    i02.f0();
                    int D = oi2.D(e36Var4);
                    i02.close();
                    return Integer.valueOf(D);
                } finally {
                }
            case 13:
                e36 e36Var5 = (e36) obj;
                e36Var5.getClass();
                ((dx7) this.B).b.Y(e36Var5, (yw7) this.L);
                return jg7.a;
            case 14:
                xb1 xb1Var2 = (xb1) this.B;
                String str3 = (String) this.L;
                e36 e36Var6 = (e36) obj;
                e36Var6.getClass();
                j36 i03 = e36Var6.i0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    xb1 xb1Var3 = xb1.b;
                    i03.d(u24.H(xb1Var2), 1);
                    i03.w(2, str3);
                    i03.f0();
                    i03.close();
                    return jg7.a;
                } finally {
                }
            default:
                e36 e36Var7 = (e36) obj;
                e36Var7.getClass();
                ((fx7) this.B).b.Y(e36Var7, (ex7) this.L);
                return jg7.a;
        }
    }
}
