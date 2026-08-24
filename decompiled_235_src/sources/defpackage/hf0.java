package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hf0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hf0 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ hf0(jf0 jf0Var, Context context, ux uxVar, sq1 sq1Var) {
        this.A = 1;
        this.R = jf0Var;
        this.B = context;
        this.L = uxVar;
        this.X = sq1Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        String string;
        int i = 0;
        switch (this.A) {
            case 0:
                Context context = (Context) this.B;
                ux uxVar = (ux) this.L;
                if0 if0Var = (if0) this.R;
                u63 u63Var = (u63) this.X;
                Trace.beginSection("CameraFactoryAdapter#appComponent");
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                eb1 eb1Var = new eb1(new pa(context, uxVar, (tg0) ((ex6) if0Var.b).getValue(), u63Var, (ze0) if0Var.g, (ij0) if0Var.f));
                if (kj2.F("CXCP")) {
                    Log.d("CXCP", "Created CameraFactoryAdapter in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) / 1000000.0d)}, 1))));
                }
                return eb1Var;
            case 1:
                jf0 jf0Var = (jf0) this.R;
                Context context2 = (Context) this.B;
                ux uxVar2 = (ux) this.L;
                sq1 sq1Var = (sq1) this.X;
                try {
                    Trace.beginSection("Create CameraPipe");
                    long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                    Context a = q41.a(context2);
                    a.getClass();
                    rg0 rg0Var = new rg0(new vb6(uxVar2.a), 119);
                    u63 u63Var2 = jf0Var.a;
                    tg0 a2 = vg0.a(new pg0(a, rg0Var, new og0((jg0) u63Var2.B, (u63) u63Var2.L, sq1Var)));
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "Created CameraPipe in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos2) / 1000000.0d)}, 1))));
                    }
                    return a2;
                } finally {
                    Trace.endSection();
                }
            case 2:
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.B;
                VideoRenderer videoRenderer = (VideoRenderer) this.L;
                int i2 = EmulatorActivity.Z1;
                VideoFiltering videoFiltering = ((pq5) this.R).f.l;
                boolean z = ((z33) this.X).g;
                String[] stringArray = emulatorActivity.getResources().getStringArray(R.array.video_filtering_options);
                stringArray.getClass();
                List b0 = hf.b0(null);
                t52 entries = VideoFiltering.getEntries();
                ArrayList arrayList = new ArrayList();
                for (Object obj : entries) {
                    VideoFiltering videoFiltering2 = (VideoFiltering) obj;
                    if (videoFiltering2.isSupportedByRenderer(videoRenderer) && (videoFiltering2 != VideoFiltering.RETROARCH || z)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList V0 = gt0.V0(b0, arrayList);
                ArrayList arrayList2 = new ArrayList(ht0.v0(V0, 10));
                int size = V0.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = V0.get(i3);
                    i3++;
                    VideoFiltering videoFiltering3 = (VideoFiltering) obj2;
                    if (videoFiltering3 != null) {
                        string = (String) fv.J0(videoFiltering3.ordinal(), stringArray);
                        if (string == null) {
                            string = videoFiltering3.name();
                        }
                        if (string != null) {
                            arrayList2.add(string);
                        }
                    }
                    string = emulatorActivity.getString(R.string.use_global_preference);
                    string.getClass();
                    arrayList2.add(string);
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                int indexOf = V0.indexOf(videoFiltering);
                if (indexOf >= 0) {
                    i = indexOf;
                }
                String string2 = emulatorActivity.getString(R.string.filter);
                string2.getClass();
                emulatorActivity.c0(new mv1(i, new y(27, emulatorActivity, V0), string2, fv.T0(strArr)));
                return jg7.a;
            case 3:
                Number number = (Number) this.B;
                e53 e53Var = (e53) this.L;
                Number number2 = (Number) this.R;
                d53 d53Var = (d53) this.X;
                if (!number.equals(e53Var.A) || !number2.equals(e53Var.B)) {
                    e53Var.A = number;
                    e53Var.B = number2;
                    e53Var.X = new jz6(d53Var, e53Var.L, number, number2, null);
                    e53Var.e0.b.setValue(Boolean.TRUE);
                    e53Var.Y = false;
                    e53Var.Z = true;
                }
                return jg7.a;
            case 4:
                mi6 mi6Var = (mi6) this.L;
                Context context3 = (Context) this.B;
                zt5 zt5Var = (zt5) this.R;
                String string3 = context3.getString(R.string.label_rom_config_retroachievements_for_rom);
                string3.getClass();
                mi6Var.a(string3, hf.c0(null, Boolean.TRUE, Boolean.FALSE), new qk4(12, context3, zt5Var), zt5Var.y, new y00(8, (qn2) this.X));
                return jg7.a;
            case 5:
                j37 j37Var = (j37) this.B;
                pq5 pq5Var = (pq5) this.R;
                qn2 qn2Var = (qn2) this.X;
                String str = ((zt5) this.L).i;
                if (str == null) {
                    str = pq5Var.a;
                }
                j37.c(j37Var, str, new y00(19, qn2Var));
                return jg7.a;
            default:
                fw7 fw7Var = (fw7) this.L;
                wj2 wj2Var = (wj2) this.X;
                Context context4 = (Context) this.B;
                String uuid = ((UUID) this.R).toString();
                yw7 d = fw7Var.c.d(uuid);
                if (d != null && !d.b.isFinished()) {
                    o35 o35Var = fw7Var.b;
                    synchronized (o35Var.k) {
                        try {
                            ga0.f().g(o35.l, "Moving WorkSpec (" + uuid + ") to the foreground");
                            rx7 rx7Var = (rx7) o35Var.g.remove(uuid);
                            if (rx7Var != null) {
                                if (o35Var.a == null) {
                                    PowerManager.WakeLock a3 = bs7.a(o35Var.b);
                                    o35Var.a = a3;
                                    a3.acquire();
                                }
                                o35Var.f.put(uuid, rx7Var);
                                Intent c = mx6.c(o35Var.b, rr7.a(rx7Var.a), wj2Var);
                                Context context5 = o35Var.b;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    pt0.F(context5, c);
                                } else {
                                    context5.startService(c);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    gw7 a4 = rr7.a(d);
                    String str2 = mx6.f0;
                    Intent intent = new Intent(context4, SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", wj2Var.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", wj2Var.b);
                    intent.putExtra("KEY_NOTIFICATION", wj2Var.c);
                    intent.putExtra("KEY_WORKSPEC_ID", a4.a);
                    intent.putExtra("KEY_GENERATION", a4.b);
                    context4.startService(intent);
                } else {
                    i.m("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                return null;
        }
    }

    public /* synthetic */ hf0(mi6 mi6Var, Context context, zt5 zt5Var, qn2 qn2Var) {
        this.A = 4;
        this.L = mi6Var;
        this.B = context;
        this.R = zt5Var;
        this.X = qn2Var;
    }

    public /* synthetic */ hf0(fw7 fw7Var, UUID uuid, wj2 wj2Var, Context context) {
        this.A = 6;
        this.L = fw7Var;
        this.R = uuid;
        this.X = wj2Var;
        this.B = context;
    }

    public /* synthetic */ hf0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
    }
}
