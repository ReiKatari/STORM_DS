package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
import androidx.preference.ListPreference;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import me.magnum.melonds.ui.settings.SettingsActivity;
import me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
import me.magnum.melonds.ui.settings.vulkandriver.VulkanDriverManagerActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t46  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t46 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ t46(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.on2
    public final Object c() {
        long j;
        int i;
        PendingIntent actionIntent;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        z77 z77Var;
        int i2 = this.A;
        boolean z = true;
        sg sgVar = null;
        Object obj = this.B;
        switch (i2) {
            case 0:
                e56 e56Var = ((u46) obj).L;
                if (e56Var == null) {
                    return null;
                }
                Bundle l = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                e56Var.c(l);
                if (l.isEmpty()) {
                    return null;
                }
                return l;
            case 1:
                return y46.c((bp7) obj);
            case 2:
                g56 g56Var = (g56) obj;
                g56Var.getLifecycle().a(new mf5(g56Var, 0));
                return jg7.a;
            case 3:
                u76 u76Var = (u76) obj;
                tg tgVar = (tg) hf.K(u76Var, xp4.a);
                u76Var.w0 = tgVar;
                if (tgVar != null) {
                    sgVar = new sg(tgVar.a, tgVar.b, tgVar.c, tgVar.d);
                }
                u76Var.x0 = sgVar;
                return jg7.a;
            case 4:
                n96 n96Var = (n96) obj;
                ga7 ga7Var = n96Var.e;
                if (ga7Var != null) {
                    j = ((Number) ga7Var.l.getValue()).longValue();
                } else {
                    j = 0;
                }
                n96Var.f = j;
                return jg7.a;
            case 5:
                return obj;
            case 6:
                yb6 yb6Var = (yb6) obj;
                return Integer.valueOf(oi2.H(yb6Var, yb6Var.k));
            case 7:
                return ((hg3) ((ArrayList) obj).get(0)).c();
            case 8:
                int i3 = SettingsActivity.F0;
                return new v82((SettingsActivity) obj);
            case 9:
                yd6 yd6Var = (yd6) obj;
                vs4 vs4Var = yd6Var.L;
                if (((xi6) vs4Var.getValue()).a == 9205357640488583168L || xi6.f(((xi6) vs4Var.getValue()).a)) {
                    return null;
                }
                return yd6Var.A.b(((xi6) vs4Var.getValue()).a);
            case 10:
                qm6 qm6Var = (qm6) obj;
                while (true) {
                    synchronized (qm6Var.g) {
                        try {
                            if (!qm6Var.c) {
                                qm6Var.c = z;
                                ua4 ua4Var = qm6Var.f;
                                Object[] objArr = ua4Var.A;
                                int i4 = ua4Var.L;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    pm6 pm6Var = (pm6) objArr[i5];
                                    ka4 ka4Var = pm6Var.g;
                                    qn2 qn2Var = pm6Var.a;
                                    Object[] objArr2 = ka4Var.b;
                                    long[] jArr = ka4Var.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i6 = 0;
                                        while (true) {
                                            long j2 = jArr[i6];
                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i7 = 8;
                                                int i8 = 8 - ((~(i6 - length)) >>> 31);
                                                int i9 = 0;
                                                while (i9 < i8) {
                                                    if ((j2 & 255) < 128) {
                                                        i = i7;
                                                        qn2Var.g(objArr2[(i6 << 3) + i9]);
                                                    } else {
                                                        i = i7;
                                                    }
                                                    j2 >>= i;
                                                    i9++;
                                                    i7 = i;
                                                }
                                                if (i8 != i7) {
                                                }
                                            }
                                            if (i6 != length) {
                                                i6++;
                                            }
                                        }
                                    }
                                    ka4Var.b();
                                }
                                qm6Var.c = false;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!qm6Var.c()) {
                        return jg7.a;
                    }
                    z = true;
                }
            case 11:
                SystemPreferencesFragment systemPreferencesFragment = (SystemPreferencesFragment) obj;
                wh7 wh7Var = systemPreferencesFragment.Z;
                if (wh7Var != null) {
                    yj1 yj1Var = systemPreferencesFragment.d0;
                    if (yj1Var != null) {
                        return new p15(systemPreferencesFragment, wh7Var, yj1Var);
                    }
                    nb3.a0("directoryAccessValidator");
                    throw null;
                }
                nb3.a0("uriPermissionManager");
                throw null;
            case 12:
                c07 c07Var = (c07) obj;
                c07Var.z0 = null;
                bl2.G(c07Var);
                xk2.w(c07Var);
                f04.I(c07Var);
                return Boolean.TRUE;
            case 13:
                actionIntent = ((RemoteAction) obj).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                    }
                } else {
                    actionIntent.send();
                }
                return jg7.a;
            case 14:
                a17 a17Var = (a17) obj;
                if (a17Var.j0) {
                    return hi2.w(a17Var);
                }
                return l07.b;
            case 15:
                return new i93(((m93) obj).b());
            case 16:
                r47 r47Var = (r47) obj;
                r47Var.w0 = null;
                bl2.G(r47Var);
                xk2.w(r47Var);
                f04.I(r47Var);
                return Boolean.TRUE;
            case 17:
                return (Executor) ((j57) obj).c();
            case 18:
                ((z77) obj).K0.g(Boolean.valueOf(!z77Var.J0));
                return jg7.a;
            case 19:
                return Boolean.valueOf(((jh0) ((j97) obj).B).a().a(UltraWideFlashCaptureUnderexposureQuirk.class));
            case 20:
                cm7 cm7Var = (cm7) obj;
                return BigInteger.valueOf(cm7Var.A).shiftLeft(32).or(BigInteger.valueOf(cm7Var.B)).shiftLeft(32).or(BigInteger.valueOf(cm7Var.L));
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                VideoPreferencesFragment videoPreferencesFragment = (VideoPreferencesFragment) obj;
                wh7 wh7Var2 = videoPreferencesFragment.d0;
                if (wh7Var2 != null) {
                    yj1 yj1Var2 = videoPreferencesFragment.e0;
                    if (yj1Var2 != null) {
                        return new p15(videoPreferencesFragment, wh7Var2, yj1Var2);
                    }
                    nb3.a0("directoryAccessValidator");
                    throw null;
                }
                nb3.a0("uriPermissionManager");
                throw null;
            case 22:
                return ((ListPreference) obj).e0;
            case ConnectionResult.API_DISABLED /* 23 */:
                int i10 = VulkanDriverManagerActivity.B0;
                ((VulkanDriverManagerActivity) obj).finish();
                return jg7.a;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                aw7 aw7Var = (aw7) obj;
                String str = y42.a;
                lw7 lw7Var = aw7Var.a;
                WorkDatabase workDatabase = lw7Var.c;
                HashSet hashSet = new HashSet();
                hashSet.addAll(aw7Var.e);
                HashSet b = aw7.b(aw7Var);
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (b.contains((String) it.next())) {
                        }
                    } else {
                        hashSet.removeAll(aw7Var.e);
                        z = false;
                    }
                }
                if (!z) {
                    az0 az0Var = lw7Var.b;
                    workDatabase.b();
                    try {
                        vy7.S(workDatabase, az0Var, aw7Var);
                        boolean a = y42.a(aw7Var);
                        workDatabase.p();
                        if (a) {
                            h66.b(az0Var, workDatabase, lw7Var.e);
                        }
                        return jg7.a;
                    } finally {
                        workDatabase.f();
                    }
                }
                e41.o(aw7Var, ")", "WorkContinuation has cycles (");
                return null;
            case 25:
                return ((Worker) obj).e();
            default:
                lg0 lg0Var = ((ty7) obj).a;
                CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                key.getClass();
                Object c = ((qc0) lg0Var).c(key);
                if (c != null) {
                    return (StreamConfigurationMap) c;
                }
                i.m("Required value was null.");
                return null;
        }
    }
}
