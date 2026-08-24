package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import me.magnum.melonds.MelonDSAndroidInterface;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.DldiSdCardConfiguration;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
import me.magnum.melonds.domain.model.MicSource;
import me.magnum.melonds.domain.model.RendererConfiguration;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jh  reason: default package */
/* loaded from: classes.dex */
public final class jh {
    public final Context a;
    public final kd6 b;
    public final ro6 c;
    public final d76 d;
    public final mp e;
    public final uv4 f;
    public final g91 g;
    public final sx1 h;
    public final fg i;
    public final ce6 j;
    public final fb2 k;
    public final of6 l;
    public final be5 m;
    public final of6 n;
    public final p87 o;
    public volatile boolean p;
    public final bg1 q;
    public final EmulatorMessageQueue r;

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, p87] */
    public jh(Context context, kd6 kd6Var, ro6 ro6Var, d76 d76Var, mp mpVar, uv4 uv4Var, g91 g91Var, sx1 sx1Var, fg fgVar, ce6 ce6Var, fb2 fb2Var) {
        this.a = context;
        this.b = kd6Var;
        this.c = ro6Var;
        this.d = d76Var;
        this.e = mpVar;
        this.f = uv4Var;
        this.g = g91Var;
        this.h = sx1Var;
        this.i = fgVar;
        this.j = ce6Var;
        this.k = fb2Var;
        of6 b = pf6.b(0, Integer.MAX_VALUE, null, 5);
        this.l = b;
        this.m = new be5(b);
        this.n = pf6.b(0, Integer.MAX_VALUE, null, 4);
        ?? obj = new Object();
        obj.a = context;
        obj.b = kd6Var;
        File file = new File(context.getFilesDir(), "dldi");
        obj.d = file;
        obj.e = new File(file, "sync");
        obj.f = new File(file, "dldi_sd.img");
        obj.g = new File(file, "dldi_sync_state.json");
        this.o = obj;
        this.q = new bg1(1);
        this.r = new EmulatorMessageQueue(new h61(this, 1));
    }

    public static final boolean a(jh jhVar, EmulatorConfiguration emulatorConfiguration) {
        jhVar.getClass();
        RendererConfiguration rendererConfiguration = emulatorConfiguration.getRendererConfiguration();
        po5 retroArchShader = rendererConfiguration.getRetroArchShader();
        VideoRenderer renderer = rendererConfiguration.getRenderer();
        VideoFiltering videoFiltering = rendererConfiguration.getVideoFiltering();
        String str = retroArchShader.a;
        if (str == null) {
            str = "<none>";
        }
        hp5 hp5Var = retroArchShader.b;
        int i = retroArchShader.c;
        long j = retroArchShader.d;
        boolean z = retroArchShader.f;
        Log.i("AndroidEmulatorManager", "RetroArchShaderLaunch: renderer=" + renderer + " filter=" + videoFiltering + " preset=" + str + " source=" + hp5Var + " passes=" + i + " sourceBytes=" + j + " clearHistory=" + z);
        if (emulatorConfiguration.getRendererConfiguration().getRenderer() != VideoRenderer.VULKAN) {
            return true;
        }
        po5 retroArchShader2 = emulatorConfiguration.getRendererConfiguration().getRetroArchShader();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int ordinal = emulatorConfiguration.getRendererConfiguration().getVideoFiltering().ordinal();
        String str2 = retroArchShader2.a;
        String lowerCase = retroArchShader2.b.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        boolean precompileVulkanPipelines = MelonEmulator.a.precompileVulkanPipelines(ordinal, str2, lowerCase, retroArchShader2.c, retroArchShader2.e);
        String str3 = retroArchShader2.a;
        if (precompileVulkanPipelines && str3 != null) {
            jhVar.j.a(str3, be6.VULKAN, SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        return precompileVulkanPipelines;
    }

    public static final void b(jh jhVar, EmulatorConfiguration emulatorConfiguration) {
        jhVar.getClass();
        if (emulatorConfiguration.getRendererConfiguration().getRenderer() == VideoRenderer.VULKAN) {
            kd6 kd6Var = jhVar.b;
            String str = jhVar.a.getApplicationInfo().nativeLibraryDir;
            str.getClass();
            MelonDSAndroidInterface.a.b(((ng6) kd6Var).z(str));
        }
        g91 g91Var = jhVar.g;
        d76 d76Var = jhVar.d;
        ByteBuffer byteBuffer = d76Var.a;
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocateDirect(393216).order(ByteOrder.nativeOrder());
            d76Var.a = byteBuffer;
            byteBuffer.getClass();
        }
        MelonEmulator.a.setupEmulator(emulatorConfiguration, g91Var, byteBuffer);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final EmulatorConfiguration c(jh jhVar, EmulatorConfiguration emulatorConfiguration) {
        String str;
        Uri uri;
        qi6 qi6Var;
        DldiSdCardConfiguration dldiSdCardConfiguration;
        File file;
        Object em5Var;
        Throwable a;
        DldiSdCardConfiguration copy;
        Integer h0;
        p87 p87Var = jhVar.o;
        DldiSdCardConfiguration dldiSdCardConfiguration2 = emulatorConfiguration.getDldiSdCardConfiguration();
        kd6 kd6Var = (kd6) p87Var.b;
        File file2 = (File) p87Var.f;
        File file3 = (File) p87Var.d;
        File file4 = (File) p87Var.e;
        dldiSdCardConfiguration2.getClass();
        if (!dldiSdCardConfiguration2.getEnabled()) {
            p87Var.c = null;
            copy = DldiSdCardConfiguration.copy$default(dldiSdCardConfiguration2, false, file2.getAbsolutePath(), 0, false, file4.getAbsolutePath(), 5, null);
        } else {
            SharedPreferences sharedPreferences = ((ng6) kd6Var).b;
            Set<String> stringSet = sharedPreferences.getStringSet("system_dldi_sd_card_dir", null);
            if (stringSet != null) {
                str = (String) gt0.I0(stringSet);
            } else {
                str = null;
            }
            if (str != null) {
                uri = Uri.parse(str);
            } else {
                uri = null;
            }
            if (uri != null) {
                qi6Var = zl1.h((Context) p87Var.a, uri);
            } else {
                qi6Var = null;
            }
            if (uri != null && qi6Var != null && qi6Var.e() && qi6Var.k() && qi6Var.a()) {
                if (!file3.isDirectory() && !file3.mkdirs()) {
                    Log.w("DldiFolderSync", "Could not create DLDI root directory: " + file3.getAbsolutePath());
                    p87Var.c = null;
                } else if (!file4.exists() && !file4.mkdirs()) {
                    Log.w("DldiFolderSync", "Could not create DLDI mirror directory: " + file4.getAbsolutePath());
                    p87Var.c = null;
                } else {
                    Map map = p87Var.q(uri).b;
                    Map h = p87.h(file4);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    p87.g(qi6Var, "", linkedHashMap);
                    try {
                        file = file4;
                        try {
                            p87Var.s(qi6Var, file, vl1.DOCUMENT, "", map, h, linkedHashMap);
                            p87Var.v(uri, p87.d(qi6Var, file));
                            em5Var = jg7.a;
                        } catch (Throwable th) {
                            th = th;
                            em5Var = new em5(th);
                            a = hm5.a(em5Var);
                            if (a == null) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        file = file4;
                    }
                    a = hm5.a(em5Var);
                    if (a == null) {
                        Log.w("DldiFolderSync", "Could not reconcile DLDI folder before launch", a);
                        p87Var.c = null;
                    } else {
                        p87Var.c = uri;
                        String absolutePath = file2.getAbsolutePath();
                        String string = sharedPreferences.getString("system_dldi_sd_card_image_size", "0");
                        int i = 0;
                        if (string != null && (h0 = xs6.h0(string)) != null) {
                            i = gi2.q(h0.intValue(), 0, 5);
                        }
                        copy = dldiSdCardConfiguration2.copy(true, absolutePath, i, true, file.getAbsolutePath());
                    }
                }
            } else {
                Log.w("DldiFolderSync", "DLDI SD card is enabled but the selected folder is not readable");
                p87Var.c = null;
            }
            dldiSdCardConfiguration = null;
            if (dldiSdCardConfiguration != null) {
                return null;
            }
            return EmulatorConfiguration.copy$default(emulatorConfiguration, false, false, null, null, null, null, null, null, null, null, RecyclerView.B1, RecyclerView.B1, false, 0, 0, false, false, null, false, null, null, 0, null, null, null, null, dldiSdCardConfiguration, 0L, 201326591, null);
        }
        dldiSdCardConfiguration = copy;
        if (dldiSdCardConfiguration != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0223 A[Catch: all -> 0x0133, TryCatch #6 {all -> 0x0133, blocks: (B:3:0x0066, B:7:0x00ee, B:21:0x0126, B:24:0x012c, B:29:0x0138, B:31:0x0223, B:34:0x0239, B:39:0x02e3, B:41:0x0310, B:20:0x0120), top: B:63:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02e0  */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.nio.charset.Charset, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(jh jhVar, pq5 pq5Var, String str, boolean z, String str2, String str3) {
        String str4;
        boolean z2;
        dz0 dz0Var;
        dz0 dz0Var2;
        Object em5Var;
        String str5;
        Long l;
        String str6;
        String str7;
        Context context = jhVar.a;
        fb2 fb2Var = jhVar.k;
        kd6 kd6Var = jhVar.b;
        try {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "STORM DS LOGS");
            file.mkdirs();
            String str8 = pq5Var.a;
            Pattern compile = Pattern.compile("[^a-zA-Z0-9_-]");
            compile.getClass();
            str8.getClass();
            String replaceAll = compile.matcher(str8).replaceAll("_");
            replaceAll.getClass();
            File file2 = new File(file, "STORM_DS_" + replaceAll + "_" + str + ".log");
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US).format(new Date());
            dz0 b = fb2Var.b(ConsoleType.DS);
            dz0 b2 = fb2Var.b(ConsoleType.DSi);
            VideoRenderer e = ((ng6) kd6Var).e();
            ng6 ng6Var = (ng6) kd6Var;
            String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
            strArr.getClass();
            if (strArr.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = ng6Var.b.getBoolean("enable_jit", !z2);
            boolean Q = ((ng6) kd6Var).Q();
            try {
                dz0Var = b2;
                try {
                    dz0Var2 = b;
                    try {
                        em5Var = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                    } catch (Throwable th) {
                        th = th;
                        em5Var = new em5(th);
                        if (em5Var instanceof em5) {
                        }
                        str5 = (String) em5Var;
                        if (str5 == null) {
                        }
                        StringBuilder sb = new StringBuilder("==================================================\n");
                        sb.append("STORM DS v" + str5 + " - Game Execution Diagnostic Log");
                        sb.append('\n');
                        sb.append("Timestamp: " + format);
                        sb.append('\n');
                        sb.append("Device Model: " + Build.MANUFACTURER + " " + Build.MODEL + " (Android " + Build.VERSION.RELEASE + ", API " + Build.VERSION.SDK_INT + ")");
                        sb.append("\n--------------------------------------------------\nGAME INFORMATION:\n");
                        String str9 = pq5Var.a;
                        StringBuilder sb2 = new StringBuilder("  Game Name: ");
                        sb2.append(str9);
                        sb.append(sb2.toString());
                        sb.append('\n');
                        sb.append("  File Name: " + pq5Var.c);
                        sb.append('\n');
                        sb.append("  Game Code / Title ID: " + str);
                        sb.append('\n');
                        sb.append("  ROM URI: " + pq5Var.d);
                        sb.append('\n');
                        sb.append("  Is DSiWare Title: " + pq5Var.h);
                        sb.append('\n');
                        sb.append("  Is Installed DSiWare Shortcut: " + pq5Var.c());
                        sb.append('\n');
                        l = pq5Var.l;
                        if (l != null) {
                        }
                        sb.append("  Installed DSiWare TitleId: ".concat(str6));
                        sb.append("\n--------------------------------------------------\nEMULATION CONFIGURATION:\n");
                        sb.append("  Console Target: " + pq5Var.f.a);
                        sb.append('\n');
                        sb.append("  Video Renderer: " + e);
                        sb.append('\n');
                        sb.append("  JIT Recompiler: " + z3);
                        sb.append('\n');
                        sb.append("  Custom BIOS Enabled: " + Q);
                        sb.append('\n');
                        sb.append("  DS Custom BIOS Status: " + dz0Var2.b);
                        sb.append('\n');
                        sb.append("  DSi Custom BIOS/NAND Status: " + dz0Var.b);
                        sb.append("\n--------------------------------------------------\nEXECUTION TELEMETRY:\n");
                        sb.append("  Boot Method: ".concat(str3));
                        sb.append('\n');
                        if (z) {
                        }
                        sb.append("  Status: ".concat(str7));
                        sb.append('\n');
                        sb.append("  Details: ".concat(str2));
                        sb.append("\n==================================================\n");
                        String sb3 = sb.toString();
                        str4 = qm0.a;
                        str4.getClass();
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        jc2.G0(fileOutputStream, sb3, str4);
                        fileOutputStream.close();
                        str4 = "AndroidEmulatorManager";
                        Log.i(str4, "Wrote diagnostic log to: " + file2.getAbsolutePath());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dz0Var2 = b;
                    em5Var = new em5(th);
                    if (em5Var instanceof em5) {
                    }
                    str5 = (String) em5Var;
                    if (str5 == null) {
                    }
                    StringBuilder sb4 = new StringBuilder("==================================================\n");
                    sb4.append("STORM DS v" + str5 + " - Game Execution Diagnostic Log");
                    sb4.append('\n');
                    sb4.append("Timestamp: " + format);
                    sb4.append('\n');
                    sb4.append("Device Model: " + Build.MANUFACTURER + " " + Build.MODEL + " (Android " + Build.VERSION.RELEASE + ", API " + Build.VERSION.SDK_INT + ")");
                    sb4.append("\n--------------------------------------------------\nGAME INFORMATION:\n");
                    String str92 = pq5Var.a;
                    StringBuilder sb22 = new StringBuilder("  Game Name: ");
                    sb22.append(str92);
                    sb4.append(sb22.toString());
                    sb4.append('\n');
                    sb4.append("  File Name: " + pq5Var.c);
                    sb4.append('\n');
                    sb4.append("  Game Code / Title ID: " + str);
                    sb4.append('\n');
                    sb4.append("  ROM URI: " + pq5Var.d);
                    sb4.append('\n');
                    sb4.append("  Is DSiWare Title: " + pq5Var.h);
                    sb4.append('\n');
                    sb4.append("  Is Installed DSiWare Shortcut: " + pq5Var.c());
                    sb4.append('\n');
                    l = pq5Var.l;
                    if (l != null) {
                    }
                    sb4.append("  Installed DSiWare TitleId: ".concat(str6));
                    sb4.append("\n--------------------------------------------------\nEMULATION CONFIGURATION:\n");
                    sb4.append("  Console Target: " + pq5Var.f.a);
                    sb4.append('\n');
                    sb4.append("  Video Renderer: " + e);
                    sb4.append('\n');
                    sb4.append("  JIT Recompiler: " + z3);
                    sb4.append('\n');
                    sb4.append("  Custom BIOS Enabled: " + Q);
                    sb4.append('\n');
                    sb4.append("  DS Custom BIOS Status: " + dz0Var2.b);
                    sb4.append('\n');
                    sb4.append("  DSi Custom BIOS/NAND Status: " + dz0Var.b);
                    sb4.append("\n--------------------------------------------------\nEXECUTION TELEMETRY:\n");
                    sb4.append("  Boot Method: ".concat(str3));
                    sb4.append('\n');
                    if (z) {
                    }
                    sb4.append("  Status: ".concat(str7));
                    sb4.append('\n');
                    sb4.append("  Details: ".concat(str2));
                    sb4.append("\n==================================================\n");
                    String sb32 = sb4.toString();
                    str4 = qm0.a;
                    str4.getClass();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                    jc2.G0(fileOutputStream2, sb32, str4);
                    fileOutputStream2.close();
                    str4 = "AndroidEmulatorManager";
                    Log.i(str4, "Wrote diagnostic log to: " + file2.getAbsolutePath());
                }
            } catch (Throwable th3) {
                th = th3;
                dz0Var = b2;
            }
            if (em5Var instanceof em5) {
                em5Var = null;
            }
            str5 = (String) em5Var;
            if (str5 == null) {
                str5 = "2.3.5";
            }
            StringBuilder sb42 = new StringBuilder("==================================================\n");
            sb42.append("STORM DS v" + str5 + " - Game Execution Diagnostic Log");
            sb42.append('\n');
            sb42.append("Timestamp: " + format);
            sb42.append('\n');
            sb42.append("Device Model: " + Build.MANUFACTURER + " " + Build.MODEL + " (Android " + Build.VERSION.RELEASE + ", API " + Build.VERSION.SDK_INT + ")");
            sb42.append("\n--------------------------------------------------\nGAME INFORMATION:\n");
            String str922 = pq5Var.a;
            StringBuilder sb222 = new StringBuilder("  Game Name: ");
            sb222.append(str922);
            sb42.append(sb222.toString());
            sb42.append('\n');
            sb42.append("  File Name: " + pq5Var.c);
            sb42.append('\n');
            sb42.append("  Game Code / Title ID: " + str);
            sb42.append('\n');
            sb42.append("  ROM URI: " + pq5Var.d);
            sb42.append('\n');
            sb42.append("  Is DSiWare Title: " + pq5Var.h);
            sb42.append('\n');
            sb42.append("  Is Installed DSiWare Shortcut: " + pq5Var.c());
            sb42.append('\n');
            l = pq5Var.l;
            if (l != null) {
                long longValue = l.longValue();
                g04.y(16);
                str6 = Long.toString(longValue, 16);
                str6.getClass();
            } else {
                str6 = "null";
            }
            sb42.append("  Installed DSiWare TitleId: ".concat(str6));
            sb42.append("\n--------------------------------------------------\nEMULATION CONFIGURATION:\n");
            sb42.append("  Console Target: " + pq5Var.f.a);
            sb42.append('\n');
            sb42.append("  Video Renderer: " + e);
            sb42.append('\n');
            sb42.append("  JIT Recompiler: " + z3);
            sb42.append('\n');
            sb42.append("  Custom BIOS Enabled: " + Q);
            sb42.append('\n');
            sb42.append("  DS Custom BIOS Status: " + dz0Var2.b);
            sb42.append('\n');
            sb42.append("  DSi Custom BIOS/NAND Status: " + dz0Var.b);
            sb42.append("\n--------------------------------------------------\nEXECUTION TELEMETRY:\n");
            sb42.append("  Boot Method: ".concat(str3));
            sb42.append('\n');
            if (z) {
                str7 = "SUCCESS";
            } else {
                str7 = "FAILED";
            }
            sb42.append("  Status: ".concat(str7));
            sb42.append('\n');
            sb42.append("  Details: ".concat(str2));
            sb42.append("\n==================================================\n");
            String sb322 = sb42.toString();
            str4 = qm0.a;
            str4.getClass();
            FileOutputStream fileOutputStream22 = new FileOutputStream(file2);
            try {
                jc2.G0(fileOutputStream22, sb322, str4);
                fileOutputStream22.close();
                str4 = "AndroidEmulatorManager";
                Log.i(str4, "Wrote diagnostic log to: " + file2.getAbsolutePath());
            } catch (Throwable th4) {
                th = th4;
                Log.e(str4, "Failed to write diagnostic log for " + pq5Var.a, th);
            }
        } catch (Throwable th5) {
            th = th5;
            str4 = "AndroidEmulatorManager";
        }
    }

    public static void i() {
        MelonEmulator.a.pauseEmulation();
    }

    public static Object j(boolean z, hw6 hw6Var) {
        Object d0 = hv.d0(xk1.a, new fh(z, null), hw6Var);
        if (d0 == x61.COROUTINE_SUSPENDED) {
            return d0;
        }
        return jg7.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
        if (r1 != r3) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ConsoleType consoleType, s41 s41Var) {
        yg ygVar;
        int i;
        ConsoleType consoleType2;
        if (s41Var instanceof yg) {
            ygVar = (yg) s41Var;
            int i2 = ygVar.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ygVar.Z = i2 - Integer.MIN_VALUE;
                Object obj = ygVar.X;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = ygVar.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return (EmulatorConfiguration) obj;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ConsoleType consoleType3 = ygVar.R;
                    oi2.Y(obj);
                    consoleType2 = consoleType3;
                } else {
                    oi2.Y(obj);
                    ygVar.R = consoleType;
                    ygVar.Z = 1;
                    Object k = ((ng6) this.b).k(ygVar);
                    if (k != obj2) {
                        consoleType2 = consoleType;
                        obj = k;
                    }
                    return obj2;
                }
                EmulatorConfiguration copy$default = EmulatorConfiguration.copy$default((EmulatorConfiguration) obj, true, true, null, null, null, null, null, null, null, null, RecyclerView.B1, RecyclerView.B1, false, 0, 0, false, false, consoleType2, false, null, null, 0, null, null, null, null, null, 0L, 134086652, null);
                ygVar.R = null;
                ygVar.Z = 2;
                obj = f(copy$default, ygVar);
            }
        }
        ygVar = new yg(this, s41Var);
        Object obj3 = ygVar.X;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = ygVar.Z;
        if (i == 0) {
        }
        EmulatorConfiguration copy$default2 = EmulatorConfiguration.copy$default((EmulatorConfiguration) obj3, true, true, null, null, null, null, null, null, null, null, RecyclerView.B1, RecyclerView.B1, false, 0, 0, false, false, consoleType2, false, null, null, 0, null, null, null, null, null, 0L, 134086652, null);
        ygVar.R = null;
        ygVar.Z = 2;
        obj3 = f(copy$default2, ygVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(EmulatorConfiguration emulatorConfiguration, s41 s41Var) {
        zg zgVar;
        Object obj;
        int i;
        EmulatorConfiguration emulatorConfiguration2;
        if (s41Var instanceof zg) {
            zgVar = (zg) s41Var;
            int i2 = zgVar.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zgVar.Z = i2 - Integer.MIN_VALUE;
                obj = zgVar.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = zgVar.Z;
                if (i == 0) {
                    if (i == 1) {
                        EmulatorConfiguration emulatorConfiguration3 = zgVar.R;
                        oi2.Y(obj);
                        emulatorConfiguration2 = emulatorConfiguration3;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (emulatorConfiguration.getMicSource() != MicSource.DEVICE) {
                        return emulatorConfiguration;
                    }
                    zgVar.R = emulatorConfiguration;
                    zgVar.Z = 1;
                    obj = this.f.a("android.permission.RECORD_AUDIO", zgVar);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                    emulatorConfiguration2 = emulatorConfiguration;
                }
                if (((Boolean) obj).booleanValue()) {
                    return EmulatorConfiguration.copy$default(emulatorConfiguration2, false, false, null, null, null, null, null, null, null, null, RecyclerView.B1, RecyclerView.B1, false, 0, 0, false, false, null, false, null, null, 0, null, MicSource.NONE, null, null, null, 0L, 260046847, null);
                }
                return emulatorConfiguration2;
            }
        }
        zgVar = new zg(this, s41Var);
        obj = zgVar.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = zgVar.Z;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r2 == r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0121, code lost:
        if (r2 == r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0123, code lost:
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(pq5 pq5Var, s41 s41Var) {
        ah ahVar;
        int i;
        boolean z;
        boolean z2;
        ConsoleType consoleType;
        boolean z3;
        float frameLimitSpeedMultiplier;
        a36 a36Var;
        pq5 pq5Var2 = pq5Var;
        if (s41Var instanceof ah) {
            ahVar = (ah) s41Var;
            int i2 = ahVar.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ahVar.Z = i2 - Integer.MIN_VALUE;
                Object obj = ahVar.X;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = ahVar.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return (EmulatorConfiguration) obj;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pq5Var2 = ahVar.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    jt5 jt5Var = pq5Var2.f;
                    ahVar.R = pq5Var2;
                    ahVar.Z = 1;
                    obj = ((ng6) this.b).l(jt5Var, ahVar);
                }
                EmulatorConfiguration emulatorConfiguration = (EmulatorConfiguration) obj;
                if (pq5Var2.c() && !pq5Var2.h) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && !emulatorConfiguration.getUseCustomBios() && pq5Var2.f.a == u26.DEFAULT) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z) {
                    consoleType = ConsoleType.DSi;
                } else if (!emulatorConfiguration.getUseCustomBios() && pq5Var2.f.a == u26.DEFAULT) {
                    consoleType = ConsoleType.DS;
                } else {
                    u26 u26Var = pq5Var2.f.a;
                    Object consoleType2 = emulatorConfiguration.getConsoleType();
                    if (!nb3.k(u26Var.getDefault(), u26Var)) {
                        consoleType2 = u26Var.getValue();
                    }
                    consoleType = (ConsoleType) consoleType2;
                }
                ConsoleType consoleType3 = consoleType;
                if (z || !emulatorConfiguration.getShowBootScreen() || !z2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (this.h.a) {
                    frameLimitSpeedMultiplier = 1.0f;
                } else {
                    frameLimitSpeedMultiplier = emulatorConfiguration.getFrameLimitSpeedMultiplier();
                }
                float f = frameLimitSpeedMultiplier;
                jt5 jt5Var2 = pq5Var2.f;
                boolean z4 = jt5Var2.f;
                a36Var = jt5Var2.b;
                Object micSource = emulatorConfiguration.getMicSource();
                if (!nb3.k(a36Var.getDefault(), a36Var)) {
                    micSource = a36Var.getValue();
                }
                EmulatorConfiguration copy$default = EmulatorConfiguration.copy$default(emulatorConfiguration, z2, z3, null, null, null, null, null, null, null, null, RecyclerView.B1, f, false, 0, 0, false, z4, consoleType3, false, null, null, 0, null, (MicSource) micSource, null, null, null, 0L, 125630460, null);
                ahVar.R = null;
                ahVar.Z = 2;
                obj = f(copy$default, ahVar);
            }
        }
        ahVar = new ah(this, s41Var);
        Object obj3 = ahVar.X;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = ahVar.Z;
        if (i == 0) {
        }
        EmulatorConfiguration emulatorConfiguration2 = (EmulatorConfiguration) obj3;
        if (pq5Var2.c()) {
        }
        z = true;
        if (z) {
        }
        z2 = true;
        if (!z) {
        }
        ConsoleType consoleType32 = consoleType;
        if (z) {
            z3 = true;
            if (this.h.a) {
            }
            float f2 = frameLimitSpeedMultiplier;
            jt5 jt5Var22 = pq5Var2.f;
            boolean z42 = jt5Var22.f;
            a36Var = jt5Var22.b;
            Object micSource2 = emulatorConfiguration2.getMicSource();
            if (!nb3.k(a36Var.getDefault(), a36Var)) {
            }
            EmulatorConfiguration copy$default2 = EmulatorConfiguration.copy$default(emulatorConfiguration2, z2, z3, null, null, null, null, null, null, null, null, RecyclerView.B1, f2, false, 0, 0, false, z42, consoleType32, false, null, null, 0, null, (MicSource) micSource2, null, null, null, 0L, 125630460, null);
            ahVar.R = null;
            ahVar.Z = 2;
            obj3 = f(copy$default2, ahVar);
        }
        z3 = false;
        if (this.h.a) {
        }
        float f22 = frameLimitSpeedMultiplier;
        jt5 jt5Var222 = pq5Var2.f;
        boolean z422 = jt5Var222.f;
        a36Var = jt5Var222.b;
        Object micSource22 = emulatorConfiguration2.getMicSource();
        if (!nb3.k(a36Var.getDefault(), a36Var)) {
        }
        EmulatorConfiguration copy$default22 = EmulatorConfiguration.copy$default(emulatorConfiguration2, z2, z3, null, null, null, null, null, null, null, null, RecyclerView.B1, f22, false, 0, 0, false, z422, consoleType32, false, null, null, 0, null, (MicSource) micSource22, null, null, null, 0L, 125630460, null);
        ahVar.R = null;
        ahVar.Z = 2;
        obj3 = f(copy$default22, ahVar);
    }

    public final void h(String str, long j, long j2, long j3, String str2) {
        if (!this.p) {
            return;
        }
        String obj = qs6.T0(str2).toString();
        StringBuilder sb = new StringBuilder("event_type=jni_event_received jni_event=");
        sb.append(str);
        sb.append(" leaderboard_id=");
        sb.append(j);
        xg6.B(sb, " attempt_id=", j2, " event_sequence=");
        sb.append(j3);
        sb.append(" ");
        sb.append(obj);
        Log.i("RASubmission", sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
        if (defpackage.hv.d0(r11, r5, r0) != r1) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ep2 ep2Var, RARuntimeBridgeConfig rARuntimeBridgeConfig, s41 s41Var) {
        gh ghVar;
        int i;
        ep2 ep2Var2;
        jh jhVar;
        String str;
        if (s41Var instanceof gh) {
            ghVar = (gh) s41Var;
            int i2 = ghVar.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ghVar.e0 = i2 - Integer.MIN_VALUE;
                Object obj = ghVar.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ghVar.e0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            String str2 = (String) ghVar.Y;
                            oi2.Y(obj);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jhVar = ghVar.Y;
                    rARuntimeBridgeConfig = ghVar.X;
                    ep2 ep2Var3 = ghVar.R;
                    oi2.Y(obj);
                    ep2Var2 = ep2Var3;
                } else {
                    oi2.Y(obj);
                    this.q.k();
                    wp0 C = ((ng6) this.b).C();
                    ghVar.R = ep2Var;
                    ghVar.X = rARuntimeBridgeConfig;
                    ghVar.Y = this;
                    ghVar.e0 = 1;
                    obj = f04.D(C, ghVar);
                    if (obj != x61Var) {
                        ep2Var2 = ep2Var;
                        jhVar = this;
                    }
                    return x61Var;
                }
                RARuntimeBridgeConfig rARuntimeBridgeConfig2 = rARuntimeBridgeConfig;
                jhVar.p = nb3.k(obj, Boolean.TRUE);
                if (!((ng6) this.b).b.getBoolean("ra_rich_presence", true)) {
                    str = ep2Var2.e;
                } else {
                    str = null;
                }
                xe1 xe1Var = xk1.a;
                ag agVar = new ag(ep2Var2, str, rARuntimeBridgeConfig2, null, 1);
                ghVar.R = null;
                ghVar.X = null;
                ghVar.Y = null;
                ghVar.e0 = 2;
            }
        }
        ghVar = new gh(this, s41Var);
        Object obj2 = ghVar.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ghVar.e0;
        if (i == 0) {
        }
        RARuntimeBridgeConfig rARuntimeBridgeConfig22 = rARuntimeBridgeConfig;
        jhVar.p = nb3.k(obj2, Boolean.TRUE);
        if (!((ng6) this.b).b.getBoolean("ra_rich_presence", true)) {
        }
        xe1 xe1Var2 = xk1.a;
        ag agVar2 = new ag(ep2Var2, str, rARuntimeBridgeConfig22, null, 1);
        ghVar.R = null;
        ghVar.X = null;
        ghVar.Y = null;
        ghVar.e0 = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(ConsoleType consoleType, s41 s41Var) {
        hh hhVar;
        int i;
        if (s41Var instanceof hh) {
            hhVar = (hh) s41Var;
            int i2 = hhVar.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hhVar.Y = i2 - Integer.MIN_VALUE;
                Object obj = hhVar.R;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = hhVar.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    hhVar.Y = 1;
                    obj = e(consoleType, hhVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                MelonEmulator.a.updateEmulatorConfiguration((EmulatorConfiguration) obj);
                return jg7.a;
            }
        }
        hhVar = new hh(this, s41Var);
        Object obj3 = hhVar.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = hhVar.Y;
        if (i == 0) {
        }
        MelonEmulator.a.updateEmulatorConfiguration((EmulatorConfiguration) obj3);
        return jg7.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(pq5 pq5Var, s41 s41Var) {
        ih ihVar;
        int i;
        if (s41Var instanceof ih) {
            ihVar = (ih) s41Var;
            int i2 = ihVar.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ihVar.Y = i2 - Integer.MIN_VALUE;
                Object obj = ihVar.R;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = ihVar.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ihVar.Y = 1;
                    obj = g(pq5Var, ihVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                MelonEmulator.a.updateEmulatorConfiguration((EmulatorConfiguration) obj);
                return jg7.a;
            }
        }
        ihVar = new ih(this, s41Var);
        Object obj3 = ihVar.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = ihVar.Y;
        if (i == 0) {
        }
        MelonEmulator.a.updateEmulatorConfiguration((EmulatorConfiguration) obj3);
        return jg7.a;
    }
}
