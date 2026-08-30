package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.a;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yc0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yc0 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ yc0(ad0 ad0Var, Context context, sw swVar, mm1 mm1Var) {
        this.A = 1;
        this.R = ad0Var;
        this.B = context;
        this.L = swVar;
        this.X = mm1Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        String string;
        boolean isSupportedByOpenGlSurface;
        int i = 0;
        switch (this.A) {
            case 0:
                Context context = (Context) this.B;
                sw swVar = (sw) this.L;
                zc0 zc0Var = (zc0) this.R;
                q03 q03Var = (q03) this.X;
                Trace.beginSection("CameraFactoryAdapter#appComponent");
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                o71 o71Var = new o71(new ka(context, swVar, (ke0) ((il6) zc0Var.b).getValue(), q03Var, (qc0) zc0Var.g, (zg0) zc0Var.f));
                if (ve2.D("CXCP")) {
                    Log.d("CXCP", "Created CameraFactoryAdapter in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) / 1000000.0d)}, 1))));
                }
                return o71Var;
            case 1:
                ad0 ad0Var = (ad0) this.R;
                Context context2 = (Context) this.B;
                sw swVar2 = (sw) this.L;
                mm1 mm1Var = (mm1) this.X;
                try {
                    Trace.beginSection("Create CameraPipe");
                    long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                    Context a = i11.a(context2);
                    a.getClass();
                    ie0 ie0Var = new ie0(new g06(swVar2.a), 119);
                    q03 q03Var2 = ad0Var.a;
                    ke0 a2 = me0.a(new ge0(a, ie0Var, new fe0((ae0) q03Var2.B, (q03) q03Var2.L, mm1Var)));
                    if (ve2.D("CXCP")) {
                        Log.d("CXCP", "Created CameraPipe in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos2) / 1000000.0d)}, 1))));
                    }
                    return a2;
                } finally {
                    Trace.endSection();
                }
            case 2:
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.B;
                VideoRenderer videoRenderer = (VideoRenderer) this.L;
                int i2 = EmulatorActivity.P1;
                VideoFiltering videoFiltering = ((rg5) this.R).f.l;
                boolean z = ((vx2) this.X).g;
                String[] stringArray = emulatorActivity.getResources().getStringArray(R.array.video_filtering_options);
                stringArray.getClass();
                List b0 = l07.b0(null);
                e12 entries = VideoFiltering.getEntries();
                ArrayList arrayList = new ArrayList();
                for (Object obj : entries) {
                    VideoFiltering videoFiltering2 = (VideoFiltering) obj;
                    if (a.e[videoRenderer.ordinal()] == 1) {
                        if (videoFiltering2.isSupportedByVulkan() && (videoFiltering2 != VideoFiltering.RETROARCH || z)) {
                            isSupportedByOpenGlSurface = true;
                        } else {
                            isSupportedByOpenGlSurface = false;
                        }
                    } else {
                        isSupportedByOpenGlSurface = videoFiltering2.isSupportedByOpenGlSurface();
                    }
                    if (isSupportedByOpenGlSurface) {
                        arrayList.add(obj);
                    }
                }
                ArrayList X0 = tq0.X0(b0, arrayList);
                ArrayList arrayList2 = new ArrayList(uq0.y0(X0, 10));
                int size = X0.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = X0.get(i3);
                    i3++;
                    VideoFiltering videoFiltering3 = (VideoFiltering) obj2;
                    if (videoFiltering3 == null || (string = stringArray[videoFiltering3.ordinal()]) == null) {
                        string = emulatorActivity.getString(R.string.use_global_preference);
                        string.getClass();
                    }
                    arrayList2.add(string);
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                int indexOf = X0.indexOf(videoFiltering);
                if (indexOf >= 0) {
                    i = indexOf;
                }
                String string2 = emulatorActivity.getString(R.string.filter);
                string2.getClass();
                emulatorActivity.a0(new ar1(i, new x(26, emulatorActivity, X0), string2, nu.F0(strArr)));
                return o27.a;
            case 3:
                Number number = (Number) this.B;
                az2 az2Var = (az2) this.L;
                Number number2 = (Number) this.R;
                zy2 zy2Var = (zy2) this.X;
                if (!number.equals(az2Var.A) || !number2.equals(az2Var.B)) {
                    az2Var.A = number;
                    az2Var.B = number2;
                    az2Var.X = new zm6(zy2Var, az2Var.L, number, number2, null);
                    az2Var.d0.b.setValue(Boolean.TRUE);
                    az2Var.Y = false;
                    az2Var.Z = true;
                }
                return o27.a;
            case 4:
                x66 x66Var = (x66) this.L;
                Context context3 = (Context) this.B;
                jj5 jj5Var = (jj5) this.R;
                String string3 = context3.getString(R.string.label_rom_config_retroachievements_for_rom);
                string3.getClass();
                x66Var.a(string3, l07.c0(null, Boolean.TRUE, Boolean.FALSE), new zr4(7, context3, jj5Var), jj5Var.y, new hz(6, (mi2) this.X));
                return o27.a;
            case 5:
                uq6 uq6Var = (uq6) this.B;
                rg5 rg5Var = (rg5) this.R;
                mi2 mi2Var = (mi2) this.X;
                String str = ((jj5) this.L).i;
                if (str == null) {
                    str = rg5Var.a;
                }
                uq6.c(uq6Var, str, new hz(14, mi2Var));
                return o27.a;
            default:
                fh7 fh7Var = (fh7) this.L;
                xe2 xe2Var = (xe2) this.X;
                Context context4 = (Context) this.B;
                String uuid = ((UUID) this.R).toString();
                xh7 d = fh7Var.c.d(uuid);
                if (d != null && !d.b.isFinished()) {
                    ku4 ku4Var = fh7Var.b;
                    synchronized (ku4Var.k) {
                        try {
                            y70.f().g(ku4.l, "Moving WorkSpec (" + uuid + ") to the foreground");
                            ui7 ui7Var = (ui7) ku4Var.g.remove(uuid);
                            if (ui7Var != null) {
                                if (ku4Var.a == null) {
                                    PowerManager.WakeLock a3 = hd7.a(ku4Var.b);
                                    ku4Var.a = a3;
                                    a3.acquire();
                                }
                                ku4Var.f.put(uuid, ui7Var);
                                Intent a4 = ql6.a(ku4Var.b, ei7.b(ui7Var.a), xe2Var);
                                Context context5 = ku4Var.b;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    cr0.D(context5, a4);
                                } else {
                                    context5.startService(a4);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    gh7 b = ei7.b(d);
                    String str2 = ql6.e0;
                    Intent intent = new Intent(context4, SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", xe2Var.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", xe2Var.b);
                    intent.putExtra("KEY_NOTIFICATION", xe2Var.c);
                    intent.putExtra("KEY_WORKSPEC_ID", b.a);
                    intent.putExtra("KEY_GENERATION", b.b);
                    context4.startService(intent);
                } else {
                    i.n("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                return null;
        }
    }

    public /* synthetic */ yc0(x66 x66Var, Context context, jj5 jj5Var, mi2 mi2Var) {
        this.A = 4;
        this.L = x66Var;
        this.B = context;
        this.R = jj5Var;
        this.X = mi2Var;
    }

    public /* synthetic */ yc0(fh7 fh7Var, UUID uuid, xe2 xe2Var, Context context) {
        this.A = 6;
        this.L = fh7Var;
        this.R = uuid;
        this.X = xe2Var;
        this.B = context;
    }

    public /* synthetic */ yc0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
    }
}
