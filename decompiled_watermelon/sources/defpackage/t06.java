package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
import androidx.preference.ListPreference;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import me.magnum.melonds.ui.settings.SettingsActivity;
import me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t06  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t06 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ t06(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.ki2
    public final Object c() {
        Object obj;
        PendingIntent actionIntent;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        jv6 jv6Var;
        boolean z;
        int i = this.A;
        boolean z2 = true;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                return ((n93) ((ArrayList) obj2).get(0)).c();
            case 1:
                int i2 = SettingsActivity.E0;
                return new d42((SettingsActivity) obj2);
            case 2:
                m26 m26Var = (m26) obj2;
                tj4 tj4Var = m26Var.L;
                if (((i76) tj4Var.getValue()).a == 9205357640488583168L || i76.f(((i76) tj4Var.getValue()).a)) {
                    return null;
                }
                return m26Var.A.b(((i76) tj4Var.getValue()).a);
            case 3:
                bb6 bb6Var = (bb6) obj2;
                while (true) {
                    Object obj3 = bb6Var.g;
                    synchronized (obj3) {
                        try {
                            if (!bb6Var.c) {
                                bb6Var.c = z2;
                                try {
                                    o24 o24Var = bb6Var.f;
                                    Object[] objArr = o24Var.A;
                                    int i3 = o24Var.L;
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        ab6 ab6Var = (ab6) objArr[i4];
                                        e24 e24Var = ab6Var.g;
                                        mi2 mi2Var = ab6Var.a;
                                        Object[] objArr2 = e24Var.b;
                                        long[] jArr = e24Var.a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i5 = 0;
                                            while (true) {
                                                long j = jArr[i5];
                                                obj = obj3;
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                                                    for (int i7 = 0; i7 < i6; i7++) {
                                                        if ((j & 255) < 128) {
                                                            try {
                                                                mi2Var.n(objArr2[(i5 << 3) + i7]);
                                                                continue;
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                bb6Var.c = false;
                                                                throw th;
                                                            }
                                                        }
                                                        j >>= 8;
                                                    }
                                                    if (i6 != 8) {
                                                    }
                                                }
                                                if (i5 != length) {
                                                    i5++;
                                                    obj3 = obj;
                                                }
                                            }
                                        } else {
                                            obj = obj3;
                                        }
                                        e24Var.b();
                                        i4++;
                                        obj3 = obj;
                                    }
                                    obj = obj3;
                                    try {
                                        bb6Var.c = false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = obj3;
                                }
                            } else {
                                obj = obj3;
                            }
                            if (!bb6Var.c()) {
                                return o27.a;
                            }
                            z2 = true;
                        } catch (Throwable th4) {
                            th = th4;
                            obj = obj3;
                        }
                    }
                }
            case 4:
                SystemPreferencesFragment systemPreferencesFragment = (SystemPreferencesFragment) obj2;
                y37 y37Var = systemPreferencesFragment.Z;
                if (y37Var != null) {
                    uf1 uf1Var = systemPreferencesFragment.c0;
                    if (uf1Var != null) {
                        return new ns4(systemPreferencesFragment, y37Var, uf1Var);
                    }
                    b53.g0("directoryAccessValidator");
                    throw null;
                }
                b53.g0("uriPermissionManager");
                throw null;
            case 5:
                qn6 qn6Var = (qn6) obj2;
                qn6Var.y0 = null;
                nl2.M(qn6Var);
                hi2.D(qn6Var);
                n40.M(qn6Var);
                return Boolean.TRUE;
            case ig7.b /* 6 */:
                actionIntent = ((RemoteAction) obj2).getActionIntent();
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
                return o27.a;
            case 7:
                po6 po6Var = (po6) obj2;
                if (po6Var.i0) {
                    return cg2.v(po6Var);
                }
                return zn6.b;
            case 8:
                return new a33(((e33) obj2).b());
            case 9:
                cs6 cs6Var = (cs6) obj2;
                cs6Var.v0 = null;
                nl2.M(cs6Var);
                hi2.D(cs6Var);
                n40.M(cs6Var);
                return Boolean.TRUE;
            case 10:
                return (Executor) ((ss6) obj2).c();
            case 11:
                ((jv6) obj2).J0.n(Boolean.valueOf(!jv6Var.I0));
                return o27.a;
            case mj2.L /* 12 */:
                return Boolean.valueOf(((af0) ((u57) obj2).B).a().a(UltraWideFlashCaptureUnderexposureQuirk.class));
            case 13:
                d87 d87Var = (d87) obj2;
                return BigInteger.valueOf(d87Var.A).shiftLeft(32).or(BigInteger.valueOf(d87Var.B)).shiftLeft(32).or(BigInteger.valueOf(d87Var.L));
            case 14:
                VideoPreferencesFragment videoPreferencesFragment = (VideoPreferencesFragment) obj2;
                y37 y37Var2 = videoPreferencesFragment.c0;
                if (y37Var2 != null) {
                    uf1 uf1Var2 = videoPreferencesFragment.d0;
                    if (uf1Var2 != null) {
                        return new ns4(videoPreferencesFragment, y37Var2, uf1Var2);
                    }
                    b53.g0("directoryAccessValidator");
                    throw null;
                }
                b53.g0("uriPermissionManager");
                throw null;
            case ig7.e /* 15 */:
                return ((ListPreference) obj2).d0;
            case 16:
                ah7 ah7Var = (ah7) obj2;
                String str = j02.a;
                kh7 kh7Var = ah7Var.a;
                WorkDatabase workDatabase = kh7Var.c;
                HashSet hashSet = new HashSet();
                hashSet.addAll(ah7Var.e);
                HashSet b = ah7.b(ah7Var);
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (b.contains((String) it.next())) {
                            z = true;
                        }
                    } else {
                        hashSet.removeAll(ah7Var.e);
                        z = false;
                    }
                }
                if (!z) {
                    ew0 ew0Var = kh7Var.b;
                    workDatabase.b();
                    try {
                        f34.v(workDatabase, ew0Var, ah7Var);
                        boolean a = j02.a(ah7Var);
                        workDatabase.p();
                        if (a) {
                            bv5.b(ew0Var, workDatabase, kh7Var.e);
                        }
                        return o27.a;
                    } finally {
                        workDatabase.f();
                    }
                }
                f81.h(ah7Var, ")", "WorkContinuation has cycles (");
                return null;
            case 17:
                return ((Worker) obj2).e();
            default:
                ce0 ce0Var = ((bk7) obj2).a;
                CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                key.getClass();
                Object c = ((ia0) ce0Var).c(key);
                if (c != null) {
                    return (StreamConfigurationMap) c;
                }
                i.n("Required value was null.");
                return null;
        }
    }
}
