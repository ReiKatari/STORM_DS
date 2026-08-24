package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.common.workers.RetroArchShaderInstallWorker;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ro5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ro5 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ ro5(ro5 ro5Var, xj5 xj5Var) {
        this.A = 18;
        this.B = ro5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v51, types: [ci6, java.util.Map, wu] */
    /* JADX WARN: Type inference failed for: r8v16, types: [ci6, java.util.Map, wu] */
    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        jt3 jt3Var;
        boolean isToggle;
        boolean z6;
        a87 a87Var;
        boolean toggleValue;
        sf0 c;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i3 = 3;
        int i4 = 1;
        Boolean bool = null;
        int i5 = 0;
        switch (this.A) {
            case 0:
                RetroArchShaderInstallWorker retroArchShaderInstallWorker = (RetroArchShaderInstallWorker) this.B;
                vo5 vo5Var = (vo5) obj;
                Context context = retroArchShaderInstallWorker.a;
                long currentTimeMillis = System.currentTimeMillis();
                if ((vo5Var instanceof uo5) || currentTimeMillis - retroArchShaderInstallWorker.h >= 250) {
                    retroArchShaderInstallWorker.h = currentTimeMillis;
                    if (vo5Var instanceof so5) {
                        lm1 lm1Var = ((so5) vo5Var).a;
                        long j = lm1Var.a;
                        long j2 = lm1Var.b;
                        vr4[] vr4VarArr = {new vr4("phase", "downloading"), new vr4("downloaded_bytes", Long.valueOf(j2)), new vr4("total_bytes", Long.valueOf(j))};
                        wb1 wb1Var = new wb1(0, (byte) 0);
                        for (int i6 = 0; i6 < 3; i6++) {
                            vr4 vr4Var = vr4VarArr[i6];
                            wb1Var.h(vr4Var.B, (String) vr4Var.A);
                        }
                        retroArchShaderInstallWorker.c(wb1Var.e());
                        int i7 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                        if (i7 > 0) {
                            i2 = (int) ((j2 * 100) / j);
                        } else {
                            i2 = 0;
                        }
                        String string = context.getString(R.string.video_retroarch_shader_downloading);
                        string.getClass();
                        if (i7 <= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        retroArchShaderInstallWorker.b(retroArchShaderInstallWorker.g(string, i2, z2));
                    } else if (vo5Var instanceof to5) {
                        vr4 vr4Var2 = new vr4("phase", "extracting");
                        to5 to5Var = (to5) vo5Var;
                        int i8 = to5Var.a;
                        int i9 = to5Var.b;
                        vr4[] vr4VarArr2 = {vr4Var2, new vr4("entries_done", Integer.valueOf(i8)), new vr4("entries_total", Integer.valueOf(i9))};
                        wb1 wb1Var2 = new wb1(0, (byte) 0);
                        for (int i10 = 0; i10 < 3; i10++) {
                            vr4 vr4Var3 = vr4VarArr2[i10];
                            wb1Var2.h(vr4Var3.B, (String) vr4Var3.A);
                        }
                        retroArchShaderInstallWorker.c(wb1Var2.e());
                        if (i9 > 0) {
                            i = (i8 * 100) / i9;
                        } else {
                            i = 0;
                        }
                        String string2 = context.getString(R.string.video_retroarch_shader_extracting);
                        string2.getClass();
                        if (i9 <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        retroArchShaderInstallWorker.b(retroArchShaderInstallWorker.g(string2, i, z));
                    } else if (nb3.k(vo5Var, uo5.a)) {
                        wb1 wb1Var3 = new wb1(0, (byte) 0);
                        vr4 vr4Var4 = new vr4[]{new vr4("phase", "finalizing")}[0];
                        wb1Var3.h(vr4Var4.B, (String) vr4Var4.A);
                        retroArchShaderInstallWorker.c(wb1Var3.e());
                        String string3 = context.getString(R.string.video_retroarch_shader_finalizing);
                        string3.getClass();
                        retroArchShaderInstallWorker.b(retroArchShaderInstallWorker.g(string3, 100, true));
                    } else {
                        i.d();
                        return null;
                    }
                }
                return jg7.a;
            case 1:
                Object K0 = gt0.K0(((Integer) obj).intValue(), ((ss5) this.B).a);
                if (!(K0 instanceof mr5)) {
                    return null;
                }
                return (mr5) K0;
            case 2:
                ax5 ax5Var = (ax5) obj;
                ax5Var.getClass();
                return ((String[]) this.B)[ax5Var.ordinal()];
            case 3:
                pq5 pq5Var = (pq5) obj;
                int i11 = RomDetailsActivity.J0;
                pq5Var.getClass();
                vw1 A = ((s9) this.B).A();
                A.f = new uw1(pq5Var);
                hv.L(to7.a(A), null, null, new xd1(A, pq5Var, null, 6), 3);
                return jg7.a;
            case 4:
                pq5 pq5Var2 = (pq5) obj;
                int i12 = RomListActivity.K0;
                pq5Var2.getClass();
                s9 s9Var = ((RomListActivity) this.B).E0;
                if (s9Var != null) {
                    vw1 A2 = s9Var.A();
                    A2.f = new uw1(pq5Var2);
                    hv.L(to7.a(A2), null, null, new xd1(A2, pq5Var2, null, 6), 3);
                    return jg7.a;
                }
                nb3.a0("emulatorLauncherValidatorDelegate");
                throw null;
            case 5:
                vm2 vm2Var = (vm2) obj;
                vm2Var.getClass();
                ((ai1) this.B).i = vm2Var;
                return jg7.a;
            case 6:
                q46 q46Var = ((p46) this.B).L;
                if (q46Var != null) {
                    z3 = q46Var.c(obj);
                } else {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 7:
                s76 s76Var = (s76) this.B;
                float floatValue = ((Float) obj).floatValue();
                ss4 ss4Var = s76Var.a;
                float h = ss4Var.h() + floatValue + s76Var.f;
                float p = gi2.p(h, RecyclerView.B1, s76Var.e.h());
                if (h == p) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                float h2 = p - ss4Var.h();
                int round = Math.round(h2);
                ss4Var.i(ss4Var.h() + round);
                s76Var.f = h2 - round;
                if (!z4) {
                    floatValue = h2;
                }
                return Float.valueOf(floatValue);
            case 8:
                m86 m86Var = (m86) this.B;
                return new jk4(m86Var.c(m86Var.k, ((jk4) obj).a, m86Var.j));
            case 9:
                ci ciVar = (ci) this.B;
                vy4 vy4Var = (vy4) obj;
                long j3 = vy4Var.c;
                p27 p27Var = (p27) ciVar.R;
                if (p27Var.k() && p27Var.n().a.B.length() != 0 && (jt3Var = p27Var.d) != null && jt3Var.d() != null) {
                    ciVar.q(p27Var.n(), j3, false, xd5.o0);
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    vy4Var.a();
                }
                return jg7.a;
            case 10:
                obj.getClass();
                return ((c5) this.B).c();
            case 11:
                ShortcutSetupActivity shortcutSetupActivity = (ShortcutSetupActivity) this.B;
                pq5 pq5Var3 = (pq5) obj;
                int i13 = ShortcutSetupActivity.C0;
                pq5Var3.getClass();
                String packageName = shortcutSetupActivity.getPackageName();
                Intent intent = new Intent(packageName + ".LAUNCH_ROM");
                intent.putExtra("uri", pq5Var3.d.toString());
                hv.L(bl2.C(shortcutSetupActivity), null, null, new vy5(shortcutSetupActivity, pq5Var3, intent, (r41) null), 3);
                return jg7.a;
            case 12:
                si6 si6Var = (si6) this.B;
                ob6 ob6Var = si6Var.f;
                ob6Var.getClass();
                if (!nb3.k(si6Var.f, ob6Var)) {
                    r05.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                ka4 ka4Var = si6Var.e;
                Object obj2 = si6Var.c;
                if (ka4Var == null) {
                    if (obj2 == null) {
                        si6Var.c = obj;
                    } else {
                        ka4 ka4Var2 = c66.a;
                        ka4 ka4Var3 = new ka4();
                        ka4Var3.a(obj2);
                        ka4Var3.a(obj);
                        si6Var.e = ka4Var3;
                        si6Var.c = null;
                    }
                } else {
                    if (obj2 != null) {
                        r05.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    ka4Var.a(obj);
                }
                return jg7.a;
            case 13:
                return Boolean.valueOf(nb3.k(((j92) obj).a, (el6) this.B));
            case 14:
                qm6 qm6Var = (qm6) this.B;
                synchronized (qm6Var.g) {
                    pm6 pm6Var = qm6Var.i;
                    pm6Var.getClass();
                    Object obj3 = pm6Var.b;
                    obj3.getClass();
                    int i14 = pm6Var.d;
                    y94 y94Var = pm6Var.c;
                    if (y94Var == null) {
                        y94Var = new y94();
                        pm6Var.c = y94Var;
                        pm6Var.f.m(obj3, y94Var);
                    }
                    pm6Var.b(obj, i14, obj3, y94Var);
                }
                return jg7.a;
            case 15:
                so soVar = (so) obj;
                ((eo2) this.B).o(soVar.e.getValue(), nw7.e0.b.g(soVar.f));
                return jg7.a;
            case 16:
                Drawable drawable = (Drawable) this.B;
                no1 no1Var = (no1) obj;
                xj0 G = no1Var.i0().G();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (no1Var.e() >> 32)), (int) Float.intBitsToFloat((int) (no1Var.e() & 4294967295L)));
                drawable.draw(xd.a(G));
                return jg7.a;
            case 17:
                ((qn2) obj).g((j07) this.B);
                return jg7.a;
            case 18:
                ro5 ro5Var = (ro5) this.B;
                ub7 ub7Var = (ub7) obj;
                if (ub7Var instanceof aa) {
                    ro5Var.g(((aa) ub7Var).k0);
                    return Boolean.TRUE;
                }
                i.m("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 19:
                i27 i27Var = (i27) this.B;
                float floatValue2 = ((Float) obj).floatValue();
                rs4 rs4Var = i27Var.a;
                float h3 = rs4Var.h() + floatValue2;
                rs4 rs4Var2 = i27Var.b;
                if (h3 > rs4Var2.h()) {
                    floatValue2 = rs4Var2.h() - rs4Var.h();
                } else if (h3 < RecyclerView.B1) {
                    floatValue2 = -rs4Var.h();
                }
                rs4Var.i(rs4Var.h() + floatValue2);
                return Float.valueOf(floatValue2);
            case 20:
                g47 g47Var = (g47) this.B;
                ep epVar = (ep) obj;
                bp bpVar = (bp) epVar.a;
                if (bpVar instanceof ov3) {
                    ov3 ov3Var = (ov3) bpVar;
                    if (ov3Var.b == null) {
                        return ep.a(epVar, new ov3(ov3Var.a, g47Var), 0, 14);
                    }
                }
                if (bpVar instanceof nv3) {
                    nv3 nv3Var = (nv3) bpVar;
                    if (nv3Var.b == null) {
                        return ep.a(epVar, new nv3(nv3Var.a, g47Var), 0, 14);
                    }
                    return epVar;
                }
                return epVar;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                gb6 gb6Var = (gb6) this.B;
                oh ohVar = (oh) obj;
                isToggle = ohVar.a.isToggle();
                if (isToggle) {
                    toggleValue = ohVar.a.getToggleValue();
                    bool = Boolean.valueOf(toggleValue);
                }
                if (bool != null) {
                    if (bool.booleanValue()) {
                        a87Var = a87.On;
                    } else {
                        a87Var = a87.Off;
                    }
                    fg3[] fg3VarArr = eb6.a;
                    fb6 fb6Var = bb6.K;
                    fg3 fg3Var = eb6.a[26];
                    gb6Var.a(fb6Var, a87Var);
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 22:
                Throwable th = (Throwable) obj;
                ((r87) this.B).j = null;
                return jg7.a;
            case ConnectionResult.API_DISABLED /* 23 */:
                jk4 jk4Var = (jk4) obj;
                ((o97) this.B).n0.getClass();
                return Boolean.TRUE;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                pc7 pc7Var = (pc7) this.B;
                br0 br0Var = (br0) obj;
                br0Var.getClass();
                br0.a(br0Var, "first", pc7Var.a.e());
                br0.a(br0Var, "second", pc7Var.b.e());
                br0.a(br0Var, "third", pc7Var.c.e());
                return jg7.a;
            case 25:
                kf0 kf0Var = (kf0) obj;
                kf0Var.getClass();
                tg0 tg0Var = ((gj7) this.B).a;
                synchronized (tg0Var.c) {
                    if (!tg0Var.d) {
                        StringBuilder sb = new StringBuilder("CameraGraph-");
                        uw uwVar = qf0.b;
                        uwVar.getClass();
                        sb.append(uw.b.incrementAndGet(uwVar));
                        c = tg0Var.c(kf0Var, new qf0(sb.toString()));
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                return c;
            case SubAllocator.N4 /* 26 */:
                Throwable th2 = (Throwable) obj;
                for (ig1 ig1Var : (List) this.B) {
                    ig1Var.b();
                }
                return jg7.a;
            default:
                dx7 dx7Var = (dx7) this.B;
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                j36 i0 = e36Var.i0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    i0.w(1, "cheat_import_worker");
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
                    dx7Var.b(e36Var, ci6Var);
                    dx7Var.a(e36Var, ci6Var2);
                    ArrayList arrayList = new ArrayList();
                    while (i0.f0()) {
                        String R3 = i0.R(i5);
                        iw7 f = ds7.f((int) i0.getLong(i4));
                        byte[] blob = i0.getBlob(2);
                        xb1 xb1Var = xb1.b;
                        xb1 k = u24.k(blob);
                        int i15 = (int) i0.getLong(i3);
                        int i16 = (int) i0.getLong(4);
                        long j4 = i0.getLong(14);
                        long j5 = i0.getLong(15);
                        long j6 = i0.getLong(16);
                        w10 c2 = ds7.c((int) i0.getLong(17));
                        long j7 = i0.getLong(18);
                        long j8 = i0.getLong(19);
                        int i17 = (int) i0.getLong(20);
                        long j9 = i0.getLong(21);
                        int i18 = (int) i0.getLong(22);
                        kf4 d = ds7.d((int) i0.getLong(5));
                        af4 h4 = ds7.h(i0.getBlob(6));
                        if (((int) i0.getLong(7)) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (((int) i0.getLong(8)) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (((int) i0.getLong(9)) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (((int) i0.getLong(10)) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        p21 p21Var = new p21(h4, d, z7, z8, z9, z10, i0.getLong(11), i0.getLong(12), ds7.a(i0.getBlob(13)));
                        Object j0 = c14.j0(ci6Var, i0.R(0));
                        j0.getClass();
                        Object j02 = c14.j0(ci6Var2, i0.R(0));
                        j02.getClass();
                        arrayList.add(new xw7(R3, f, k, j4, j5, j6, p21Var, i15, c2, j7, j8, i17, i16, j9, i18, (List) j0, (List) j02));
                        i3 = 3;
                        i4 = 1;
                        i5 = 0;
                    }
                    i0.close();
                    return arrayList;
                } catch (Throwable th3) {
                    i0.close();
                    throw th3;
                }
        }
    }

    public /* synthetic */ ro5(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }
}
