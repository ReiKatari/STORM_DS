package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Parcelable;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import defpackage.sz1;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
import me.magnum.melonds.ui.layouts.LayoutSelectorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u6 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ u6(xq2 xq2Var, rl0 rl0Var, lk6 lk6Var, o84 o84Var) {
        this.A = 9;
        this.B = xq2Var;
        this.R = rl0Var;
        this.L = lk6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x046d, code lost:
        if (r4.q0 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x046f, code lost:
        r5 = (defpackage.of5) r4.o0.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0478, code lost:
        if (r5 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0483, code lost:
        if (defpackage.p31.T0(r4, r5, 0, 0, 3) != true) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0485, code lost:
        r4.q0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0487, code lost:
        r0.e = defpackage.p31.R0(r4, r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0490, code lost:
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21, types: [wz5, android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.on2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c() {
        int i;
        int i2;
        boolean T0;
        boolean z;
        String str;
        String str2;
        String str3;
        Integer num;
        rc6 rc6Var;
        int i3;
        boolean z2 = true;
        String str4 = null;
        switch (this.A) {
            case 0:
                mp2.V(((w6) this.B).a, new p6((o3) this.R, (n3) this.L, 1));
                return jg7.a;
            case 1:
                mp2.V(((w6) this.B).a, new s6((o75) this.R, (n3) this.L, 0));
                return jg7.a;
            case 2:
                ((vz) this.B).a();
                vw vwVar = (vw) ((s9) this.R).c;
                int i4 = ((bh5) this.L).A;
                do {
                    i = vwVar.get();
                    if (((i >>> 27) & 15) == i4) {
                        i2 = i - 1;
                    } else {
                        i2 = i;
                    }
                } while (!vwVar.compareAndSet(i, i2));
                return jg7.a;
            case 3:
                w70 w70Var = (w70) this.B;
                of5 R0 = w70.R0(w70Var, (eg4) this.R, (le) this.L);
                if (R0 == null) {
                    return null;
                }
                p31 p31Var = w70Var.k0;
                if (q93.b(p31Var.r0, -1L)) {
                    s53.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return R0.i(p31Var.V0(R0, p31Var.S0(), 0L) ^ (-9223372034707292160L));
            case 4:
                q60 q60Var = ((il0) this.B).b;
                q60Var.getClass();
                return q60Var.q(((ea) this.L).h.d, ((pv2) this.R).a());
            case 5:
                p31 p31Var2 = (p31) this.B;
                nh7 nh7Var = (nh7) this.R;
                z70 z70Var = (z70) this.L;
                jg7 jg7Var = jg7.a;
                p70 p70Var = p31Var2.p0;
                while (true) {
                    ua4 ua4Var = p70Var.a;
                    int i5 = ua4Var.L;
                    if (i5 == 0) {
                        break;
                    } else if (i5 != 0) {
                        of5 of5Var = (of5) ((l31) ua4Var.A[i5 - 1]).a.c();
                        if (of5Var == null) {
                            T0 = true;
                        } else {
                            T0 = p31.T0(p31Var2, of5Var, 0L, 0L, 3);
                        }
                        if (!T0) {
                            break;
                        } else {
                            ua4 ua4Var2 = p70Var.a;
                            ((l31) ua4Var2.l(ua4Var2.L - 1)).b.i(jg7Var);
                        }
                    } else {
                        fa6.e("MutableVector is empty.");
                        return null;
                    }
                }
            case 6:
                sz1 sz1Var = (sz1) this.L;
                ((zg5) this.B).A = true;
                ((zg5) this.R).A = false;
                sz1Var.l0.set(false);
                ((AtomicBoolean) sz1Var.V.A).set(true);
                eb ebVar = sz1Var.h0;
                synchronized (ebVar.B) {
                    tp6 tp6Var = (tp6) ebVar.R;
                    uc5 uc5Var = uc5.a;
                    tp6Var.getClass();
                    tp6Var.m(null, uc5Var);
                }
                return jg7.a;
            case 7:
                sz1 sz1Var2 = (sz1) this.B;
                String str5 = (String) this.R;
                zg5 zg5Var = (zg5) this.L;
                synchronized (sz1Var2.P) {
                    try {
                        if (!nb3.k(sz1Var2.Q, str5)) {
                            z2 = false;
                        } else {
                            jh jhVar = sz1Var2.v;
                            jhVar.p = false;
                            jhVar.q.k();
                            MelonEmulator.a.unloadRetroAchievementsData();
                            bk1 bk1Var = ((pl) sz1Var2.g).h;
                            bk1Var.getClass();
                            synchronized (bk1Var.L) {
                                if (!bk1Var.A) {
                                    mb5 mb5Var = (mb5) bk1Var.B;
                                    if (mb5Var != null) {
                                        str2 = mb5Var.a;
                                    } else {
                                        str2 = null;
                                    }
                                    if (nb3.k(str2, str5)) {
                                        bk1Var.B = null;
                                        bk1Var.A = true;
                                        bk1Var.R = str5;
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            if (!z) {
                                str = "LeaseHandoffRejected";
                                z2 = false;
                            } else {
                                sz1Var2.Q = null;
                                if (nb3.k(sz1Var2.R, str5)) {
                                    sz1Var2.R = null;
                                }
                                sz1Var2.N = null;
                                sz1Var2.O = sz1.c.DISABLED;
                                sz1Var2.K = false;
                            }
                        }
                        str = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z2) {
                    str3 = "ra_runtime_identity_lease_handed_off";
                } else {
                    str3 = "ra_runtime_identity_lease_handoff_failed";
                }
                sz1Var2.G0(str3, new vr4("reason", "logout"), new vr4("error", str), new vr4("lease_retained", Boolean.valueOf(!z2)));
                if (z2) {
                    try {
                        sz1Var2.k0("logout");
                        sz1Var2.a1();
                        zg5Var.A = false;
                        return jg7.a;
                    } catch (Throwable th2) {
                        sz1Var2.a1();
                        throw th2;
                    }
                }
                i.m("Check failed.");
                return null;
            case 8:
                String string = ((Resources) this.R).getString(R.string.cheat_folder_default_name);
                string.getClass();
                j37.c((j37) this.B, string, new y00(2, (qn2) this.L));
                return jg7.a;
            case 9:
                xq2 xq2Var = (xq2) this.B;
                rl0 rl0Var = (rl0) this.R;
                lk6 lk6Var = (lk6) this.L;
                qx0 qx0Var = xq2Var.M;
                rl0 rl0Var2 = qx0Var.b;
                try {
                    qx0Var.b = rl0Var;
                    lk6 lk6Var2 = xq2Var.G;
                    int[] iArr = xq2Var.o;
                    p94 p94Var = xq2Var.v;
                    xq2Var.o = null;
                    xq2Var.v = null;
                    xq2Var.G = lk6Var;
                    boolean z3 = qx0Var.e;
                    try {
                        qx0Var.e = false;
                        throw null;
                    } catch (Throwable th3) {
                        qx0Var.e = z3;
                        throw th3;
                    }
                } catch (Throwable th4) {
                    qx0Var.b = rl0Var2;
                    throw th4;
                }
            case 10:
                ConnectivityManager connectivityManager = (ConnectivityManager) this.R;
                c53 c53Var = (c53) this.L;
                if (((zg5) this.B).A) {
                    ga0.f().b(zv7.a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(c53Var);
                }
                return jg7.a;
            case 11:
                ((qa4) this.R).setValue((ck3) this.B);
                ((qa4) this.L).setValue(Boolean.FALSE);
                return jg7.a;
            case 12:
                j37 j37Var = (j37) this.B;
                String str6 = (String) this.R;
                qa4 qa4Var = (qa4) this.L;
                String str7 = (String) qa4Var.getValue();
                if (str7 != null) {
                    str6 = str7;
                }
                j37.c(j37Var, str6, new j4(qa4Var, 14));
                return jg7.a;
            case 13:
                return new zq4((go2) ((qa4) this.B).getValue(), (qn2) ((qa4) this.R).getValue(), ((Number) ((on2) this.L).c()).intValue());
            case 14:
                pr3 pr3Var = (pr3) this.R;
                er3 er3Var = (er3) ((ii1) this.B).getValue();
                return new fr3(pr3Var, er3Var, (lp3) this.L, new ei((l93) pr3Var.e.f.getValue(), er3Var));
            case 15:
                sq2 sq2Var = (sq2) this.B;
                pk6 pk6Var = (pk6) this.R;
                bo4 bo4Var = (bo4) this.L;
                if (sq2Var != null) {
                    pk6Var.a(pk6Var.c(sq2Var) - pk6Var.t);
                }
                List J = ak7.J(pk6Var, null, pk6Var.t, null);
                hx0 hx0Var = (hx0) gt0.R0(J);
                if (hx0Var != null) {
                    num = hx0Var.b;
                } else {
                    num = null;
                }
                List l = bo4Var.l(num);
                if (num != null && !l.isEmpty()) {
                    l = gt0.V0(hf.b0(new hx0(((hx0) gt0.H0(l)).a, null, num)), gt0.D0(l, 1));
                }
                return new fx0(gt0.V0(J, l), bo4Var.m());
            case 16:
                ((qa4) this.L).setValue(null);
                ((qn2) this.B).g((nu4) this.R);
                return jg7.a;
            case 17:
                ((eo2) this.B).o((String) ((qa4) this.R).getValue(), (String) ((qa4) this.L).getValue());
                return jg7.a;
            case 18:
                j04 j04Var = (j04) this.R;
                Intent intent = new Intent((Context) this.B, LayoutSelectorActivity.class);
                UUID uuid = ((zt5) this.L).e;
                if (uuid != null) {
                    str4 = uuid.toString();
                }
                intent.putExtra("selected_layout_id", str4);
                j04Var.a(intent);
                return jg7.a;
            case 19:
                pq5 pq5Var = (pq5) this.L;
                int i6 = InputSetupActivity.D0;
                pq5Var.getClass();
                Intent intent2 = new Intent((Context) this.R, InputSetupActivity.class);
                ?? obj = new Object();
                obj.A = pq5Var;
                intent2.putExtra("rom", (Parcelable) obj);
                ((j04) this.B).a(intent2);
                return jg7.a;
            case 20:
                Object obj2 = this.R;
                mi6 mi6Var = (mi6) this.L;
                ((li6) this.B).e.g(obj2);
                mi6Var.a.setValue(Boolean.FALSE);
                mi6Var.b.setValue(null);
                return jg7.a;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                tc6 tc6Var = (tc6) this.B;
                pf0 pf0Var = (pf0) this.R;
                qt2 qt2Var = (qt2) this.L;
                if (((pc6) tc6Var.e.getValue()).c()) {
                    rc6Var = (rc6) tc6Var.f.getValue();
                } else {
                    rc6Var = null;
                }
                if (rc6Var != null) {
                    int i7 = rc6Var.h;
                    if (i7 == 1) {
                        i3 = 1;
                    } else if (i7 != 0) {
                        if (i7 != 0 && i7 != 1) {
                            i3 = i7;
                        } else {
                            Log.e("CXCP", "Custom operating mode " + i7 + " conflicts with standard modes");
                            i.h("kotlin.Unit");
                            return null;
                        }
                    }
                    return pf0Var.a(i3, rc6Var, false, qt2Var, null, (Map) tc6Var.c.getValue(), (Map) tc6Var.d.getValue());
                }
                i3 = 0;
                return pf0Var.a(i3, rc6Var, false, qt2Var, null, (Map) tc6Var.c.getValue(), (Map) tc6Var.d.getValue());
            default:
                tw7 tw7Var = (tw7) this.B;
                UUID uuid2 = (UUID) this.R;
                xb1 xb1Var = (xb1) this.L;
                tw7Var.getClass();
                String uuid3 = uuid2.toString();
                ga0 f = ga0.f();
                String str8 = tw7.c;
                f.b(str8, "Updating progress for " + uuid2 + " (" + xb1Var + ")");
                WorkDatabase workDatabase = tw7Var.a;
                workDatabase.b();
                try {
                    yw7 d = workDatabase.w().d(uuid3);
                    if (d != null) {
                        if (d.b == iw7.RUNNING) {
                            rw7 rw7Var = new rw7(uuid3, xb1Var);
                            sw7 v = workDatabase.v();
                            v.getClass();
                            hv.Q(v.a, false, true, new ja7(10, v, rw7Var));
                        } else {
                            ga0.f().j(str8, "Ignoring setProgressAsync(...). WorkSpec (" + uuid3 + ") is not in a RUNNING state.");
                        }
                        workDatabase.p();
                        return null;
                    }
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } finally {
                    try {
                        ga0.f().e(str8, "Error updating Worker progress", th);
                        throw th;
                    } finally {
                        workDatabase.f();
                    }
                }
        }
    }

    public /* synthetic */ u6(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.R = obj2;
        this.L = obj3;
    }
}
