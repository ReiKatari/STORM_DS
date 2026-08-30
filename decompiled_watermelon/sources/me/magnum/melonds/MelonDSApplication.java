package me.magnum.melonds;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.system.Os;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.common.UriFileHandler;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class MelonDSApplication extends Application implements el2 {
    public boolean A = false;
    public final ws B = new ws(new t71(24, this));
    public qr2 L;
    public w16 R;
    public os X;
    public w37 Y;
    public wp2 Z;
    public v16 c0;
    public ss d0;

    public final void a() {
        if (!this.A) {
            this.A = true;
            b81 b81Var = (b81) ((ew3) this.B.d());
            b81Var.getClass();
            e81 e81Var = new e81(3);
            e81Var.g("me.magnum.melonds.common.workers.CheatImportWorker", b81Var.g);
            e81Var.g("me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker", b81Var.o);
            e81Var.g("me.magnum.melonds.common.workers.RetroArchShaderInstallWorker", b81Var.q);
            this.L = new qr2(e81Var.f());
            this.R = (w16) b81Var.s.get();
            Context context = b81Var.a.A;
            SharedPreferences sharedPreferences = (SharedPreferences) b81Var.d.get();
            vm5 vm5Var = (vm5) b81Var.v.get();
            vp5 vp5Var = (vp5) b81Var.x.get();
            w16 w16Var = (w16) b81Var.s.get();
            uf1 uf1Var = (uf1) b81Var.y.get();
            w37 w37Var = (w37) b81Var.r.get();
            qo2 qo2Var = (qo2) b81Var.w.get();
            t63 t63Var = (t63) b81Var.h.get();
            qo2 qo2Var2 = (qo2) b81Var.w.get();
            qo2Var2.getClass();
            k91 k91Var = new k91(context, qo2Var2);
            sharedPreferences.getClass();
            vm5Var.getClass();
            vp5Var.getClass();
            w16Var.getClass();
            uf1Var.getClass();
            w37Var.getClass();
            qo2Var.getClass();
            t63Var.getClass();
            os osVar = new os(context, sharedPreferences);
            osVar.L(new oy3(sharedPreferences, 1));
            osVar.L(new ny3(context, 3));
            osVar.L(new ey3(0, vm5Var));
            osVar.L(new ey3(1, vp5Var));
            osVar.L(new gy3(w16Var, vp5Var, uf1Var, 0));
            osVar.L(new gy3(context, qo2Var, w37Var, 1));
            osVar.L(new iy3(k91Var, context));
            osVar.L(new jy3(k91Var, 0));
            osVar.L(new ky3(k91Var));
            osVar.L(new ly3(k91Var, context));
            osVar.L(new my3(context, t63Var));
            osVar.L(new ny3(context, 0));
            osVar.L(new ny3(k91Var, context));
            osVar.L(new jy3(k91Var, 1));
            osVar.L(new ny3(context, 2));
            osVar.L(new oy3(sharedPreferences, 0));
            this.X = osVar;
            this.Y = (w37) b81Var.r.get();
            this.Z = (wp2) b81Var.z.get();
            this.c0 = (v16) b81Var.e.get();
            this.d0 = (ss) b81Var.A.get();
        }
        super.onCreate();
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        context.getClass();
        super.attachBaseContext(context);
        sn1 sn1Var = sn1.g0;
        if (sn1.h0) {
            return;
        }
        synchronized (sn1Var) {
            if (sn1.h0) {
                return;
            }
            System.loadLibrary("melonDS-android-frontend");
            sn1.h0 = true;
            Log.w("NativeCore", "backend=source_multi_profile library=melonDS-android-frontend source=HEAD");
        }
    }

    @Override // defpackage.dl2
    public final Object d() {
        return this.B.d();
    }

    @Override // android.app.Application
    public final void onCreate() {
        Object kc5Var;
        NotificationChannel c;
        a();
        try {
            Os.setenv("HOME", getFilesDir().getAbsolutePath(), false);
            Os.setenv("XDG_CACHE_HOME", new File(getFilesDir(), "cache").getAbsolutePath(), false);
            kc5Var = o27.a;
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        Throwable a = nc5.a(kc5Var);
        if (a != null) {
            Log.w("MelonDSApplication", "Could not point librashader at a cache directory", a);
        }
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        String string = getString(R.string.notification_channel_background_tasks);
        k84 k84Var = new k84(this);
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            c = null;
        } else {
            c = cr0.c(string, "channel_cheat_importing");
            cr0.p(c);
            cr0.q(c);
            cr0.y(c);
            cr0.z(c);
            cr0.f(c);
            cr0.u(c);
            cr0.C(c);
            cr0.g(c);
        }
        if (i >= 26) {
            cr0.d(k84Var.b, c);
        }
        bb1 bb1Var = tg1.a;
        tq5.w(hm2.A, bt3.a, null, new ys3(this, null, 1), 2);
        os osVar = this.X;
        if (osVar != null) {
            SharedPreferences sharedPreferences = (SharedPreferences) osVar.B;
            if (sharedPreferences.getLong("last_version", 6L) < osVar.u()) {
                long j = sharedPreferences.getLong("last_version", 6L);
                long u = osVar.u();
                List g1 = tq0.g1((ArrayList) osVar.L, new hd2(21));
                ArrayList arrayList = new ArrayList();
                for (Object obj : g1) {
                    fy3 fy3Var = (fy3) obj;
                    SharedPreferences sharedPreferences2 = sharedPreferences;
                    if (fy3Var.a() >= j && fy3Var.b() <= u) {
                        arrayList.add(obj);
                    }
                    sharedPreferences = sharedPreferences2;
                }
                SharedPreferences sharedPreferences3 = sharedPreferences;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ((fy3) obj2).c();
                }
                SharedPreferences.Editor edit = sharedPreferences3.edit();
                edit.putLong("last_version", osVar.u());
                edit.apply();
            }
            v16 v16Var = this.c0;
            if (v16Var != null) {
                v16Var.i();
                ss ssVar = this.d0;
                if (ssVar != null) {
                    tq5.w(ssVar.c, null, null, new a6(ssVar, null, 2), 3);
                    if (Build.VERSION.SDK_INT < 33 || jv3.o(this, "android.permission.POST_NOTIFICATIONS") == 0) {
                        wp2 wp2Var = this.Z;
                        if (wp2Var != null) {
                            vp2 d = wp2Var.d();
                            if (d == null) {
                                d = null;
                            } else {
                                wp2Var.a();
                            }
                            if (d != null) {
                                String str = d.c;
                                int i3 = d.e;
                                int i4 = d.d;
                                if (i4 + i3 > 0) {
                                    f84 f84Var = new f84(this);
                                    Notification notification = f84Var.q;
                                    notification.icon = R.drawable.ic_melon_small;
                                    f84Var.e = f84.b(getString(R.string.offline_ra_hardcore_loss_notification_title));
                                    f84Var.f = f84.b(getString(R.string.ra_pending_process_loss_notification_message, Integer.valueOf(i4 + i3), Integer.valueOf(i4), Integer.valueOf(i3), str));
                                    f84Var.g = 0;
                                    notification.flags |= 16;
                                    Notification a2 = f84Var.a();
                                    a2.getClass();
                                    try {
                                        new k84(this).a(a2);
                                    } catch (SecurityException unused) {
                                        wp2 wp2Var2 = this.Z;
                                        if (wp2Var2 != null) {
                                            wp2Var2.c(d.d, d.e, d.a, d.b, str);
                                        } else {
                                            b53.g0("hardcoreOfflineLossTracker");
                                            throw null;
                                        }
                                    }
                                }
                            }
                        } else {
                            b53.g0("hardcoreOfflineLossTracker");
                            throw null;
                        }
                    }
                    w37 w37Var = this.Y;
                    if (w37Var != null) {
                        UriFileHandler uriFileHandler = new UriFileHandler(this, w37Var);
                        w16 w16Var = this.R;
                        if (w16Var != null) {
                            String str2 = getApplicationInfo().nativeLibraryDir;
                            str2.getClass();
                            MelonDSAndroidInterface.a.d(uriFileHandler, ((b56) w16Var).x(str2));
                            return;
                        }
                        b53.g0("settingsRepository");
                        throw null;
                    }
                    b53.g0("uriHandler");
                    throw null;
                }
                b53.g0("appLogFileRecorder");
                throw null;
            }
            b53.g0("settingsBackupManager");
            throw null;
        }
        b53.g0("migrator");
        throw null;
    }

    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        ss ssVar = this.d0;
        if (ssVar != null) {
            iq2.f(ssVar.c, null);
            MelonDSAndroidInterface.a.cleanup();
            return;
        }
        b53.g0("appLogFileRecorder");
        throw null;
    }
}
