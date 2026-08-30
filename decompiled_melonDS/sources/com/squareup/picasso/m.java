package com.squareup.picasso;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.Settings;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3252a = 1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3253b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3254c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3255d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f3256e;

    /* renamed from: f  reason: collision with root package name */
    public Serializable f3257f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f3258g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f3259h;

    /* renamed from: i  reason: collision with root package name */
    public final Cloneable f3260i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f3261j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f3262k;

    /* renamed from: l  reason: collision with root package name */
    public Object f3263l;
    public final Object m;

    /* renamed from: n  reason: collision with root package name */
    public final Serializable f3264n;

    public m(Context context, d0 d0Var, Handler handler, a0.b bVar, a0.b bVar2, g0 g0Var) {
        HandlerThread handlerThread = new HandlerThread("Picasso-Dispatcher", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb2 = k0.f3247a;
        w wVar = new w(looper, 1);
        wVar.sendMessageDelayed(wVar.obtainMessage(), 1000L);
        this.f3254c = context;
        this.f3255d = d0Var;
        this.f3257f = new LinkedHashMap();
        this.f3258g = new WeakHashMap();
        this.f3259h = new WeakHashMap();
        this.f3260i = new LinkedHashSet();
        this.f3261j = new j(0, handlerThread.getLooper(), this);
        this.f3256e = bVar;
        this.f3262k = handler;
        this.f3263l = bVar2;
        this.m = g0Var;
        this.f3264n = new ArrayList(4);
        try {
            Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException | SecurityException unused) {
        }
        this.f3253b = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        l lVar = new l(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        m mVar = (m) lVar.f3251b;
        if (mVar.f3253b) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        ((Context) mVar.f3254c).registerReceiver(lVar, intentFilter);
    }

    public void a(e eVar) {
        j jVar = (j) this.f3261j;
        Future future = eVar.f3206g0;
        if (future != null && future.isCancelled()) {
            return;
        }
        Bitmap bitmap = eVar.f3205f0;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        ((ArrayList) this.f3264n).add(eVar);
        if (!jVar.hasMessages(7)) {
            jVar.sendEmptyMessageDelayed(7, 200L);
        }
    }

    public void b(e eVar) {
        j jVar = (j) this.f3261j;
        jVar.sendMessage(jVar.obtainMessage(4, eVar));
    }

    public Bundle c() {
        Bundle bundle = (Bundle) this.f3256e;
        if (bundle == null) {
            return null;
        }
        Bundle b10 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
        b10.putAll(bundle);
        return b10;
    }

    public void d(e eVar, boolean z10) {
        eVar.B.getClass();
        ((LinkedHashMap) this.f3257f).remove(eVar.Y);
        a(eVar);
    }

    public void e(n nVar, boolean z10) {
        n nVar2;
        e eVar;
        m mVar;
        d0 d0Var = (d0) this.f3255d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f3257f;
        n nVar3 = nVar.f3269e;
        a4.n nVar4 = nVar.f3266b;
        String str = nVar.f3268d;
        if (((LinkedHashSet) this.f3260i).contains(nVar3)) {
            ((WeakHashMap) this.f3259h).put(nVar.a(), nVar);
            return;
        }
        e eVar2 = (e) linkedHashMap.get(str);
        if (eVar2 != null) {
            eVar2.B.getClass();
            if (eVar2.f3203d0 == null) {
                eVar2.f3203d0 = nVar;
                return;
            }
            if (eVar2.f3204e0 == null) {
                eVar2.f3204e0 = new ArrayList(3);
            }
            eVar2.f3204e0.add(nVar);
            z zVar = (z) nVar4.R;
            if (zVar.ordinal() > eVar2.f3211l0.ordinal()) {
                eVar2.f3211l0 = zVar;
                return;
            }
            return;
        }
        boolean isShutdown = d0Var.isShutdown();
        a0 a0Var = nVar.f3265a;
        if (isShutdown) {
            return;
        }
        a0.b bVar = (a0.b) this.f3263l;
        g0 g0Var = (g0) this.m;
        Object obj = e.f3198m0;
        List list = a0Var.f3182a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                f0 f0Var = (f0) list.get(i2);
                if (f0Var.a(nVar4)) {
                    mVar = this;
                    nVar2 = nVar;
                    eVar = new e(a0Var, mVar, bVar, g0Var, nVar2, f0Var);
                    break;
                }
                i2++;
            } else {
                nVar2 = nVar;
                mVar = this;
                eVar = new e(a0Var, mVar, bVar, g0Var, nVar2, e.p0);
                break;
            }
        }
        eVar.f3206g0 = d0Var.submit(eVar);
        linkedHashMap.put(str, eVar);
        if (z10) {
            ((WeakHashMap) mVar.f3258g).remove(nVar2.a());
        }
    }

    public void f() {
        q7.e eVar = (q7.e) this.f3261j;
        if (!this.f3253b) {
            eVar.a();
            this.f3253b = true;
            if (((a7.o) this.f3258g) != null) {
                s0.c((a7.i) this.f3254c);
            }
            eVar.b((Bundle) this.f3260i);
        }
        int ordinal = ((androidx.lifecycle.q) this.f3257f).ordinal();
        int ordinal2 = ((androidx.lifecycle.q) this.f3263l).ordinal();
        androidx.lifecycle.z zVar = (androidx.lifecycle.z) this.f3262k;
        if (ordinal < ordinal2) {
            zVar.h((androidx.lifecycle.q) this.f3257f);
        } else {
            zVar.h((androidx.lifecycle.q) this.f3263l);
        }
    }

    public String toString() {
        switch (this.f3252a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(nc.u.a(a7.i.class).c());
                sb2.append("(" + ((String) this.f3259h) + ')');
                sb2.append(" destination=");
                sb2.append((a7.x) this.f3255d);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public m(a7.i iVar) {
        this.f3254c = iVar;
        this.f3255d = iVar.B;
        this.f3256e = iVar.L;
        this.f3257f = iVar.R;
        this.f3258g = iVar.X;
        this.f3259h = iVar.Y;
        this.f3260i = iVar.Z;
        this.f3261j = new q7.e(new s7.a(iVar, new kf.s0(7, iVar)));
        yb.n nVar = new yb.n(new a3.g(11));
        this.f3262k = new androidx.lifecycle.z(iVar, true);
        this.f3263l = androidx.lifecycle.q.INITIALIZED;
        this.m = (v0) nVar.getValue();
        this.f3264n = new yb.n(new a3.g(12));
    }
}
