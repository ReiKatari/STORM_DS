package me.magnum.melonds;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.system.Os;
import android.util.Log;
import com.stormds.emulator.R;
import java.io.File;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import me.magnum.melonds.MelonDSApplication;
import me.magnum.melonds.common.UriFileHandler;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MelonDSApplication extends Application implements kr2 {
    public static final /* synthetic */ int f0 = 0;
    public boolean A = false;
    public final mt B = new mt(new d51(this, 27));
    public rx2 L;
    public kd6 R;
    public m44 X;
    public uh7 Y;
    public xv2 Z;
    public jd6 d0;
    public ft e0;

    public final void a() {
        NotificationChannel notificationChannel;
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        String string = getString(R.string.notification_channel_background_tasks);
        ch4 ch4Var = new ch4(this);
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            notificationChannel = null;
        } else {
            NotificationChannel c = pt0.c(2, string, "channel_cheat_importing");
            pt0.r(c);
            pt0.s(c);
            pt0.A(c);
            pt0.B(c, uri, audioAttributes);
            pt0.f(c);
            pt0.w(c);
            pt0.E(c);
            pt0.g(c);
            notificationChannel = c;
        }
        if (i >= 26) {
            pt0.d(ch4Var.b, notificationChannel);
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        context.getClass();
        super.attachBaseContext(context);
        d90 d90Var = d90.w0;
        if (d90.x0) {
            return;
        }
        synchronized (d90Var) {
            if (d90.x0) {
                return;
            }
            System.loadLibrary("melonDS-android-frontend");
            d90.x0 = true;
            Log.w("NativeCore", "backend=source_multi_profile library=melonDS-android-frontend source=HEAD");
        }
    }

    public final void b() {
        Object em5Var;
        try {
            Os.setenv("HOME", getFilesDir().getAbsolutePath(), false);
            Os.setenv("XDG_CACHE_HOME", new File(getFilesDir(), "cache").getAbsolutePath(), false);
            em5Var = jg7.a;
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        Throwable a = hm5.a(em5Var);
        if (a != null) {
            Log.w("MelonDSApplication", "Could not point librashader at a cache directory", a);
        }
    }

    @Override // defpackage.jr2
    public final Object c() {
        return this.B.c();
    }

    public final void d() {
        if (!this.A) {
            this.A = true;
            sb1 sb1Var = (sb1) ((q34) this.B.c());
            sb1Var.getClass();
            wb1 wb1Var = new wb1(3);
            wb1Var.g("me.magnum.melonds.common.workers.CheatImportWorker", sb1Var.g);
            wb1Var.g("me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker", sb1Var.o);
            wb1Var.g("me.magnum.melonds.common.workers.RetroArchShaderInstallWorker", sb1Var.q);
            this.L = new rx2(wb1Var.f());
            this.R = (kd6) sb1Var.s.get();
            Context context = sb1Var.a.a;
            SharedPreferences sharedPreferences = (SharedPreferences) sb1Var.d.get();
            kx5 kx5Var = (kx5) sb1Var.v.get();
            p06 p06Var = (p06) sb1Var.x.get();
            kd6 kd6Var = (kd6) sb1Var.s.get();
            yj1 yj1Var = (yj1) sb1Var.y.get();
            uh7 uh7Var = (uh7) sb1Var.r.get();
            su2 su2Var = (su2) sb1Var.w.get();
            id3 id3Var = (id3) sb1Var.h.get();
            su2 su2Var2 = (su2) sb1Var.w.get();
            su2Var2.getClass();
            yc1 yc1Var = new yc1(context, su2Var2);
            sharedPreferences.getClass();
            kx5Var.getClass();
            p06Var.getClass();
            kd6Var.getClass();
            yj1Var.getClass();
            uh7Var.getClass();
            su2Var.getClass();
            id3Var.getClass();
            m44 m44Var = new m44(context, sharedPreferences);
            m44Var.E(new h64(sharedPreferences, 1));
            m44Var.E(new g64(context, 3));
            m44Var.E(new x54(kx5Var, 0));
            m44Var.E(new x54(p06Var, 1));
            m44Var.E(new z54(kd6Var, p06Var, yj1Var, 0));
            m44Var.E(new z54(context, su2Var, uh7Var, 1));
            m44Var.E(new b64(yc1Var, context));
            m44Var.E(new c64(0, yc1Var));
            m44Var.E(new d64(yc1Var));
            m44Var.E(new e64(yc1Var, context));
            m44Var.E(new f64(context, id3Var));
            m44Var.E(new g64(context, 0));
            m44Var.E(new g64(yc1Var, context));
            m44Var.E(new c64(1, yc1Var));
            m44Var.E(new g64(context, 2));
            m44Var.E(new h64(sharedPreferences, 0));
            this.X = m44Var;
            this.Y = (uh7) sb1Var.r.get();
            this.Z = (xv2) sb1Var.z.get();
            this.d0 = (jd6) sb1Var.e.get();
            this.e0 = (ft) sb1Var.A.get();
        }
        super.onCreate();
    }

    public final void e() {
        m44 m44Var = this.X;
        if (m44Var != null) {
            SharedPreferences sharedPreferences = (SharedPreferences) m44Var.L;
            if (sharedPreferences.getLong("last_version", 6L) < m44Var.j()) {
                long j = sharedPreferences.getLong("last_version", 6L);
                long j2 = m44Var.j();
                List d1 = gt0.d1((ArrayList) m44Var.R, new zh2(22));
                ArrayList arrayList = new ArrayList();
                for (Object obj : d1) {
                    y54 y54Var = (y54) obj;
                    if (y54Var.a() >= j && y54Var.c() <= j2) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    try {
                        ((y54) obj2).b();
                    } catch (Throwable unused) {
                    }
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("last_version", m44Var.j());
                edit.apply();
                return;
            }
            return;
        }
        nb3.a0("migrator");
        throw null;
    }

    public final void f() {
        if (Build.VERSION.SDK_INT < 33 || ge7.s(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            xv2 xv2Var = this.Z;
            if (xv2Var != null) {
                wv2 d = xv2Var.d();
                if (d == null) {
                    d = null;
                } else {
                    xv2Var.a();
                }
                if (d != null) {
                    String str = d.c;
                    int i = d.e;
                    int i2 = d.d;
                    if (i2 + i <= 0) {
                        return;
                    }
                    xg4 xg4Var = new xg4(this, "channel_cheat_importing");
                    xg4Var.t.icon = R.drawable.ic_melon_small;
                    xg4Var.e = xg4.b(getString(R.string.offline_ra_hardcore_loss_notification_title));
                    xg4Var.f = xg4.b(getString(R.string.ra_pending_process_loss_notification_message, Integer.valueOf(i2 + i), Integer.valueOf(i2), Integer.valueOf(i), str));
                    xg4Var.h = 0;
                    xg4Var.c(16);
                    Notification a = xg4Var.a();
                    a.getClass();
                    try {
                        new ch4(this).a(a);
                        return;
                    } catch (SecurityException unused) {
                        xv2 xv2Var2 = this.Z;
                        if (xv2Var2 != null) {
                            xv2Var2.c(d.d, d.e, d.a, d.b, str);
                            return;
                        }
                        nb3.a0("hardcoreOfflineLossTracker");
                        throw null;
                    }
                }
                return;
            }
            nb3.a0("hardcoreOfflineLossTracker");
            throw null;
        }
    }

    @Override // android.app.Application
    public final void onCreate() {
        ft ftVar;
        jd6 jd6Var;
        d();
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: o34
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                MelonDSApplication melonDSApplication = MelonDSApplication.this;
                int i = MelonDSApplication.f0;
                try {
                    StringBuilder sb = new StringBuilder("================ STORM DS CRASH REPORT ================\n");
                    String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z", Locale.US).format(new Date());
                    sb.append("Time: " + format);
                    sb.append('\n');
                    String str = Build.MANUFACTURER;
                    String str2 = Build.MODEL;
                    String str3 = Build.VERSION.RELEASE;
                    int i2 = Build.VERSION.SDK_INT;
                    sb.append("Device: " + str + " " + str2 + " (Android " + str3 + ", API " + i2 + ")");
                    sb.append('\n');
                    String name = thread.getName();
                    long id = thread.getId();
                    StringBuilder sb2 = new StringBuilder("Thread: ");
                    sb2.append(name);
                    sb2.append(" (id=");
                    sb2.append(id);
                    sb2.append(")");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    String name2 = th.getClass().getName();
                    String message = th.getMessage();
                    sb.append("Exception: " + name2 + ": " + message);
                    sb.append("\nStacktrace:\n");
                    sb.append(Log.getStackTraceString(th));
                    sb.append("\n========================================================\n");
                    String sb3 = sb.toString();
                    try {
                        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        if (externalStoragePublicDirectory != null && (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdirs())) {
                            jc2.F0(new File(externalStoragePublicDirectory, "STORM_DS_CRASH.txt"), sb3);
                        }
                    } catch (Throwable unused) {
                    }
                    try {
                        File externalFilesDir = melonDSApplication.getExternalFilesDir(null);
                        if (externalFilesDir != null) {
                            jc2.F0(new File(externalFilesDir, "storm_crash.log"), sb3);
                        }
                    } catch (Throwable unused2) {
                    }
                    jc2.F0(new File(melonDSApplication.getFilesDir(), "storm_crash.log"), sb3);
                } catch (Throwable unused3) {
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        });
        try {
            b();
        } catch (Throwable unused) {
        }
        try {
            n90.a(this);
        } catch (Throwable unused2) {
        }
        try {
            vs4 vs4Var = ht.a;
            SharedPreferences sharedPreferences = getSharedPreferences(v15.b(this), 0);
            String str = "dark";
            String string = sharedPreferences.getString("theme", "dark");
            if (string != null) {
                str = string;
            }
            vs4 vs4Var2 = ht.a;
            g57.Companion.getClass();
            vs4Var2.setValue(e57.a(str));
            sharedPreferences.registerOnSharedPreferenceChangeListener(new gt(0));
        } catch (Throwable unused3) {
        }
        try {
            SharedPreferences sharedPreferences2 = getSharedPreferences(v15.b(this), 0);
            String str2 = "file_name";
            String string2 = sharedPreferences2.getString("rom_display_name_mode", "file_name");
            if (string2 != null) {
                str2 = string2;
            }
            gi2.c = str2;
            sharedPreferences2.registerOnSharedPreferenceChangeListener(new gt(2));
        } catch (Throwable unused4) {
        }
        try {
            a();
        } catch (Throwable unused5) {
        }
        try {
            ms2 ms2Var = ms2.A;
            xe1 xe1Var = xk1.a;
            hv.L(ms2Var, e04.a, null, new ns3(this, null, 2), 2);
        } catch (Throwable unused6) {
        }
        try {
            e();
        } catch (Throwable unused7) {
        }
        try {
            jd6Var = this.d0;
        } catch (Throwable unused8) {
        }
        if (jd6Var != null) {
            jd6Var.i();
            try {
                ftVar = this.e0;
            } catch (Throwable unused9) {
            }
            if (ftVar != null) {
                hv.L(ftVar.c, null, null, new a6(ftVar, null, 2), 3);
                try {
                    f();
                } catch (Throwable unused10) {
                }
                try {
                    MelonDSAndroidInterface melonDSAndroidInterface = MelonDSAndroidInterface.a;
                    uh7 uh7Var = this.Y;
                    if (uh7Var != null) {
                        UriFileHandler uriFileHandler = new UriFileHandler(this, uh7Var);
                        kd6 kd6Var = this.R;
                        if (kd6Var != null) {
                            String str3 = getApplicationInfo().nativeLibraryDir;
                            str3.getClass();
                            melonDSAndroidInterface.d(uriFileHandler, ((ng6) kd6Var).z(str3));
                            return;
                        }
                        nb3.a0("settingsRepository");
                        throw null;
                    }
                    nb3.a0("uriHandler");
                    throw null;
                } catch (Throwable unused11) {
                    return;
                }
            }
            nb3.a0("appLogFileRecorder");
            throw null;
        }
        nb3.a0("settingsBackupManager");
        throw null;
    }

    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        ft ftVar = this.e0;
        if (ftVar != null) {
            g04.x(ftVar.c, null);
            MelonDSAndroidInterface.a.cleanup();
            return;
        }
        nb3.a0("appLogFileRecorder");
        throw null;
    }
}
