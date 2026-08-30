package q8;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: l  reason: collision with root package name */
    public static final String f12340l = p8.v.g("Processor");

    /* renamed from: b  reason: collision with root package name */
    public final Context f12342b;

    /* renamed from: c  reason: collision with root package name */
    public final p8.b f12343c;

    /* renamed from: d  reason: collision with root package name */
    public final z8.a f12344d;

    /* renamed from: e  reason: collision with root package name */
    public final WorkDatabase f12345e;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f12347g = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f12346f = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final HashSet f12349i = new HashSet();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f12350j = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public PowerManager.WakeLock f12341a = null;

    /* renamed from: k  reason: collision with root package name */
    public final Object f12351k = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f12348h = new HashMap();

    public d(Context context, p8.b bVar, z8.a aVar, WorkDatabase workDatabase) {
        this.f12342b = context;
        this.f12343c = bVar;
        this.f12344d = aVar;
        this.f12345e = workDatabase;
    }

    public static boolean d(String str, b0 b0Var, int i2) {
        String str2 = f12340l;
        if (b0Var != null) {
            b0Var.m.u(new s(i2));
            p8.v e6 = p8.v.e();
            e6.a(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        p8.v e10 = p8.v.e();
        e10.a(str2, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public final void a(a aVar) {
        synchronized (this.f12351k) {
            this.f12350j.add(aVar);
        }
    }

    public final b0 b(String str) {
        boolean z10;
        b0 b0Var = (b0) this.f12346f.remove(str);
        if (b0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            b0Var = (b0) this.f12347g.remove(str);
        }
        this.f12348h.remove(str);
        if (z10) {
            synchronized (this.f12351k) {
                try {
                    if (this.f12346f.isEmpty()) {
                        Context context = this.f12342b;
                        String str2 = w8.a.f14168d0;
                        Intent intent = new Intent(context, SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        this.f12342b.startService(intent);
                        PowerManager.WakeLock wakeLock = this.f12341a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f12341a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return b0Var;
    }

    public final b0 c(String str) {
        b0 b0Var = (b0) this.f12346f.get(str);
        if (b0Var == null) {
            return (b0) this.f12347g.get(str);
        }
        return b0Var;
    }
}
