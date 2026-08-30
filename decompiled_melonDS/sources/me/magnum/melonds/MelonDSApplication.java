package me.magnum.melonds;

import ah.b0;
import ah.m1;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import cf.d;
import ed.n;
import gd.f;
import java.util.ArrayList;
import java.util.List;
import kb.g;
import kf.g1;
import mb.c;
import me.magnum.melonds.common.UriFileHandler;
import p1.c1;
import rd.k;
import rd.m;
import s6.a;
import ua.h;
import zb.l;
import zc.g0;
import zc.t0;
import zc.x;
import zf.b;
import zf.e;
import zf.i;
import zf.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class MelonDSApplication extends Application implements c {
    public boolean A = false;
    public final g B = new g(new k(0, this));
    public a L;
    public d R;
    public c1 X;
    public be.c Y;

    static {
        System.loadLibrary("melonDS-android-frontend");
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, p1.c1] */
    public final void a() {
        if (!this.A) {
            this.A = true;
            rd.g gVar = (rd.g) ((m) this.B.d());
            gVar.getClass();
            m1 m1Var = new m1(2);
            m1Var.g("me.magnum.melonds.common.workers.CheatImportWorker", gVar.f12667e);
            m1Var.g("me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker", gVar.f12674l);
            this.L = new a(m1Var.d());
            this.R = (d) gVar.f12675n.get();
            Context context = gVar.f12663a.f3920a;
            SharedPreferences sharedPreferences = (SharedPreferences) gVar.f12669g.get();
            g1 g1Var = (g1) gVar.f12678q.get();
            cf.c cVar = (cf.c) gVar.f12680s.get();
            d dVar = (d) gVar.f12675n.get();
            sd.d dVar2 = (sd.d) gVar.f12681t.get();
            be.c cVar2 = (be.c) gVar.m.get();
            h hVar = (h) gVar.f12679r.get();
            od.c cVar3 = (od.c) gVar.f12668f.get();
            h hVar2 = (h) gVar.f12679r.get();
            hVar2.getClass();
            a0.g gVar2 = new a0.g(6, context, hVar2);
            sharedPreferences.getClass();
            g1Var.getClass();
            cVar.getClass();
            dVar.getClass();
            dVar2.getClass();
            cVar2.getClass();
            hVar.getClass();
            cVar3.getClass();
            ?? obj = new Object();
            obj.A = context;
            obj.B = sharedPreferences;
            obj.L = new ArrayList();
            obj.q(new zf.a(2, sharedPreferences));
            obj.q(new j(context, 3));
            obj.q(new zf.a(0, g1Var));
            obj.q(new zf.a(1, cVar));
            obj.q(new b(dVar, cVar, dVar2, 0));
            obj.q(new b(context, hVar, cVar2, 1));
            obj.q(new zf.d(gVar2, context));
            obj.q(new e(gVar2, 0));
            obj.q(new zf.g(gVar2));
            obj.q(new zf.h(gVar2, context));
            obj.q(new i(context, cVar3));
            obj.q(new j(context, 0));
            obj.q(new j(gVar2, context));
            obj.q(new e(gVar2, 1));
            obj.q(new j(context, 2));
            this.X = obj;
            this.Y = (be.c) gVar.m.get();
        }
        super.onCreate();
    }

    @Override // mb.b
    public final Object d() {
        return this.B.d();
    }

    @Override // android.app.Application
    public final void onCreate() {
        NotificationChannel b10;
        a();
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        String string = getString(R.string.notification_channel_background_tasks);
        m5.j jVar = new m5.j(this);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            b10 = null;
        } else {
            b10 = m5.g.b(string, "channel_cheat_importing");
            m5.g.g(b10);
            m5.g.h(b10);
            m5.g.m(b10);
            m5.g.n(b10);
            m5.g.d(b10);
            m5.g.j(b10);
            m5.g.p(b10);
            m5.g.e(b10);
        }
        if (i2 >= 26) {
            m5.g.c(jVar.f9265a, b10);
        }
        f fVar = g0.f15015a;
        x.v(t0.A, n.f4465a, null, new a9.b(28, null, this), 2);
        c1 c1Var = this.X;
        if (c1Var != null) {
            SharedPreferences sharedPreferences = (SharedPreferences) c1Var.B;
            if (sharedPreferences.getLong("last_version", 6L) < c1Var.g()) {
                long j2 = sharedPreferences.getLong("last_version", 6L);
                long g10 = c1Var.g();
                List l02 = l.l0((ArrayList) c1Var.L, new b0(17));
                ArrayList arrayList = new ArrayList();
                for (Object obj : l02) {
                    zf.k kVar = (zf.k) obj;
                    if (kVar.a() >= j2 && kVar.b() <= g10) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    ((zf.k) obj2).c();
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("last_version", c1Var.g());
                edit.apply();
            }
            be.c cVar = this.Y;
            if (cVar != null) {
                MelonDSAndroidInterface.f9464a.setup(new UriFileHandler(this, cVar));
                return;
            }
            nc.k.f("uriHandler");
            throw null;
        }
        nc.k.f("migrator");
        throw null;
    }

    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        MelonDSAndroidInterface.f9464a.cleanup();
    }
}
