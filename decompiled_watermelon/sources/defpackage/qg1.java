package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.Settings;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qg1  reason: default package */
/* loaded from: classes.dex */
public final class qg1 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Serializable f;
    public final Object g;
    public final Object h;
    public final Cloneable i;
    public final Object j;
    public final Object k;
    public Object l;
    public final Object m;
    public final Serializable n;

    public qg1(Context context, qn4 qn4Var, Handler handler, ka3 ka3Var, ka3 ka3Var2, af6 af6Var) {
        HandlerThread handlerThread = new HandlerThread("Picasso-Dispatcher", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = e67.a;
        jn4 jn4Var = new jn4(looper, 1);
        jn4Var.sendMessageDelayed(jn4Var.obtainMessage(), 1000L);
        this.c = context;
        this.d = qn4Var;
        this.f = new LinkedHashMap();
        this.g = new WeakHashMap();
        this.h = new WeakHashMap();
        this.i = new LinkedHashSet();
        this.j = new og1(handlerThread.getLooper(), this, 0);
        this.e = ka3Var;
        this.k = handler;
        this.l = ka3Var2;
        this.m = af6Var;
        this.n = new ArrayList(4);
        try {
            Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException | SecurityException unused) {
        }
        this.b = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        qq qqVar = new qq(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        qg1 qg1Var = (qg1) qqVar.b;
        if (qg1Var.b) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        ((Context) qg1Var.c).registerReceiver(qqVar, intentFilter);
    }

    public void a(x20 x20Var) {
        og1 og1Var = (og1) this.j;
        Future future = x20Var.h0;
        if (future != null && future.isCancelled()) {
            return;
        }
        Bitmap bitmap = x20Var.g0;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        ((ArrayList) this.n).add(x20Var);
        if (!og1Var.hasMessages(7)) {
            og1Var.sendEmptyMessageDelayed(7, 200L);
        }
    }

    public void b(x20 x20Var) {
        og1 og1Var = (og1) this.j;
        og1Var.sendMessage(og1Var.obtainMessage(4, x20Var));
    }

    public Bundle c() {
        Bundle bundle = (Bundle) this.e;
        if (bundle == null) {
            return null;
        }
        Bundle k = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
        k.putAll(bundle);
        return k;
    }

    public void d(x20 x20Var, boolean z) {
        x20Var.B.getClass();
        ((LinkedHashMap) this.f).remove(x20Var.Y);
        a(x20Var);
    }

    public void e(ex2 ex2Var, boolean z) {
        qg1 qg1Var;
        ex2 ex2Var2;
        x20 x20Var;
        qn4 qn4Var = (qn4) this.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f;
        ex2 ex2Var3 = ex2Var.e;
        n85 n85Var = ex2Var.b;
        String str = ex2Var.d;
        nn4 nn4Var = ex2Var.a;
        if (((LinkedHashSet) this.i).contains(ex2Var3)) {
            ((WeakHashMap) this.h).put(ex2Var.a(), ex2Var);
            nn4Var.getClass();
            return;
        }
        x20 x20Var2 = (x20) linkedHashMap.get(str);
        if (x20Var2 != null) {
            x20Var2.B.getClass();
            if (x20Var2.e0 == null) {
                x20Var2.e0 = ex2Var;
                return;
            }
            if (x20Var2.f0 == null) {
                x20Var2.f0 = new ArrayList(3);
            }
            x20Var2.f0.add(ex2Var);
            mn4 mn4Var = (mn4) n85Var.R;
            if (mn4Var.ordinal() > x20Var2.m0.ordinal()) {
                x20Var2.m0 = mn4Var;
            }
        } else if (qn4Var.isShutdown()) {
            nn4Var.getClass();
        } else {
            ka3 ka3Var = (ka3) this.l;
            af6 af6Var = (af6) this.m;
            Object obj = x20.n0;
            List list = nn4Var.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    fb5 fb5Var = (fb5) list.get(i);
                    if (fb5Var.a(n85Var)) {
                        qg1Var = this;
                        ex2Var2 = ex2Var;
                        x20Var = new x20(nn4Var, qg1Var, ka3Var, af6Var, ex2Var2, fb5Var);
                        break;
                    }
                    i++;
                } else {
                    qg1Var = this;
                    ex2Var2 = ex2Var;
                    x20Var = new x20(nn4Var, qg1Var, ka3Var, af6Var, ex2Var2, x20.q0);
                    break;
                }
            }
            x20Var.h0 = qn4Var.submit(x20Var);
            linkedHashMap.put(str, x20Var);
            if (z) {
                ((WeakHashMap) qg1Var.g).remove(ex2Var2.a());
            }
            nn4Var.getClass();
        }
    }

    public void f() {
        yt5 yt5Var = (yt5) this.j;
        if (!this.b) {
            yt5Var.a();
            this.b = true;
            if (((t34) this.g) != null) {
                st5.b((l34) this.c);
            }
            yt5Var.b((Bundle) this.i);
        }
        int ordinal = ((qm3) this.f).ordinal();
        int ordinal2 = ((qm3) this.l).ordinal();
        in3 in3Var = (in3) this.k;
        if (ordinal < ordinal2) {
            in3Var.h((qm3) this.f);
        } else {
            in3Var.h((qm3) this.l);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(q75.a(l34.class).c());
                sb.append("(" + ((String) this.h) + ')');
                sb.append(" destination=");
                sb.append((b44) this.d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public qg1(l34 l34Var) {
        this.c = l34Var;
        this.d = l34Var.B;
        this.e = l34Var.L;
        this.f = l34Var.R;
        this.g = l34Var.X;
        this.h = l34Var.Y;
        this.i = l34Var.Z;
        this.j = new yt5(new zt5(l34Var, new bz2(25, l34Var)));
        il6 il6Var = new il6(new vq3(7));
        this.k = new in3(l34Var, true);
        this.l = qm3.INITIALIZED;
        this.m = (bu5) il6Var.getValue();
        this.n = new il6(new vq3(8));
    }
}
