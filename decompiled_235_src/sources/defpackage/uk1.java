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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uk1  reason: default package */
/* loaded from: classes.dex */
public final class uk1 {
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

    public uk1(Context context, vw4 vw4Var, Handler handler, ss2 ss2Var, s63 s63Var, pq6 pq6Var) {
        HandlerThread handlerThread = new HandlerThread("Picasso-Dispatcher", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = ck7.a;
        ow4 ow4Var = new ow4(looper, 1);
        ow4Var.sendMessageDelayed(ow4Var.obtainMessage(), 1000L);
        this.c = context;
        this.d = vw4Var;
        this.f = new LinkedHashMap();
        this.g = new WeakHashMap();
        this.h = new WeakHashMap();
        this.i = new LinkedHashSet();
        this.j = new sk1(handlerThread.getLooper(), this, 0);
        this.e = ss2Var;
        this.k = handler;
        this.l = s63Var;
        this.m = pq6Var;
        this.n = new ArrayList(4);
        try {
            Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException | SecurityException unused) {
        }
        this.b = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        cr crVar = new cr(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        uk1 uk1Var = (uk1) crVar.b;
        if (uk1Var.b) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        ((Context) uk1Var.c).registerReceiver(crVar, intentFilter);
    }

    public void a(v40 v40Var) {
        sk1 sk1Var = (sk1) this.j;
        Future future = v40Var.i0;
        if (future != null && future.isCancelled()) {
            return;
        }
        Bitmap bitmap = v40Var.h0;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        ((ArrayList) this.n).add(v40Var);
        if (!sk1Var.hasMessages(7)) {
            sk1Var.sendEmptyMessageDelayed(7, 200L);
        }
    }

    public void b(v40 v40Var) {
        sk1 sk1Var = (sk1) this.j;
        sk1Var.sendMessage(sk1Var.obtainMessage(4, v40Var));
    }

    public Bundle c() {
        Bundle bundle = (Bundle) this.e;
        if (bundle == null) {
            return null;
        }
        Bundle l = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
        l.putAll(bundle);
        return l;
    }

    public void d(v40 v40Var, boolean z) {
        v40Var.B.getClass();
        ((LinkedHashMap) this.f).remove(v40Var.Y);
        a(v40Var);
    }

    public void e(i33 i33Var, boolean z) {
        uk1 uk1Var;
        i33 i33Var2;
        v40 v40Var;
        vw4 vw4Var = (vw4) this.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f;
        i33 i33Var3 = i33Var.e;
        m44 m44Var = i33Var.b;
        String str = i33Var.d;
        sw4 sw4Var = i33Var.a;
        if (((LinkedHashSet) this.i).contains(i33Var3)) {
            ((WeakHashMap) this.h).put(i33Var.a(), i33Var);
            sw4Var.getClass();
            return;
        }
        v40 v40Var2 = (v40) linkedHashMap.get(str);
        if (v40Var2 != null) {
            v40Var2.B.getClass();
            if (v40Var2.f0 == null) {
                v40Var2.f0 = i33Var;
                return;
            }
            if (v40Var2.g0 == null) {
                v40Var2.g0 = new ArrayList(3);
            }
            v40Var2.g0.add(i33Var);
            rw4 rw4Var = (rw4) m44Var.R;
            if (rw4Var.ordinal() > v40Var2.n0.ordinal()) {
                v40Var2.n0 = rw4Var;
            }
        } else if (vw4Var.isShutdown()) {
            sw4Var.getClass();
        } else {
            s63 s63Var = (s63) this.l;
            pq6 pq6Var = (pq6) this.m;
            Object obj = v40.o0;
            List list = sw4Var.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    xk5 xk5Var = (xk5) list.get(i);
                    if (xk5Var.a(m44Var)) {
                        uk1Var = this;
                        i33Var2 = i33Var;
                        v40Var = new v40(sw4Var, uk1Var, s63Var, pq6Var, i33Var2, xk5Var);
                        break;
                    }
                    i++;
                } else {
                    uk1Var = this;
                    i33Var2 = i33Var;
                    v40Var = new v40(sw4Var, uk1Var, s63Var, pq6Var, i33Var2, v40.r0);
                    break;
                }
            }
            v40Var.i0 = vw4Var.submit(v40Var);
            linkedHashMap.put(str, v40Var);
            if (z) {
                ((WeakHashMap) uk1Var.g).remove(i33Var2.a());
            }
            sw4Var.getClass();
        }
    }

    public void f() {
        e56 e56Var = (e56) this.j;
        if (!this.b) {
            e56Var.a();
            this.b = true;
            if (((ac4) this.g) != null) {
                y46.b((sb4) this.c);
            }
            e56Var.b((Bundle) this.i);
        }
        int ordinal = ((tt3) this.f).ordinal();
        int ordinal2 = ((tt3) this.l).ordinal();
        ku3 ku3Var = (ku3) this.k;
        if (ordinal < ordinal2) {
            ku3Var.h((tt3) this.f);
        } else {
            ku3Var.h((tt3) this.l);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(gh5.a(sb4.class).c());
                sb.append("(" + ((String) this.h) + ')');
                sb.append(" destination=");
                sb.append((ic4) this.d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public uk1(sb4 sb4Var) {
        this.c = sb4Var;
        this.d = sb4Var.B;
        this.e = sb4Var.L;
        this.f = sb4Var.R;
        this.g = sb4Var.X;
        this.h = sb4Var.Y;
        this.i = sb4Var.Z;
        this.j = new e56(new f56(sb4Var, new t46(sb4Var, 2)));
        ex6 ex6Var = new ex6(new pi3(13));
        this.k = new ku3(sb4Var, true);
        this.l = tt3.INITIALIZED;
        this.m = (h56) ex6Var.getValue();
        this.n = new ex6(new pi3(14));
    }
}
