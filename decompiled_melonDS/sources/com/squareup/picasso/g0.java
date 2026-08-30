package com.squareup.picasso;

import android.os.HandlerThread;
import android.os.Looper;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0.b f3217a;

    /* renamed from: b  reason: collision with root package name */
    public final j f3218b;

    /* renamed from: c  reason: collision with root package name */
    public long f3219c;

    /* renamed from: d  reason: collision with root package name */
    public long f3220d;

    /* renamed from: e  reason: collision with root package name */
    public long f3221e;

    /* renamed from: f  reason: collision with root package name */
    public long f3222f;

    /* renamed from: g  reason: collision with root package name */
    public long f3223g;

    /* renamed from: h  reason: collision with root package name */
    public long f3224h;

    /* renamed from: i  reason: collision with root package name */
    public long f3225i;

    /* renamed from: j  reason: collision with root package name */
    public long f3226j;

    /* renamed from: k  reason: collision with root package name */
    public int f3227k;

    /* renamed from: l  reason: collision with root package name */
    public int f3228l;
    public int m;

    public g0(a0.b bVar) {
        this.f3217a = bVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb2 = k0.f3247a;
        w wVar = new w(looper, 1);
        wVar.sendMessageDelayed(wVar.obtainMessage(), 1000L);
        this.f3218b = new j(1, handlerThread.getLooper(), this);
    }

    public final h0 a() {
        o oVar = (o) this.f3217a.B;
        return new h0(oVar.maxSize(), oVar.size(), this.f3219c, this.f3220d, this.f3221e, this.f3222f, this.f3223g, this.f3224h, this.f3225i, this.f3226j, this.f3227k, this.f3228l, this.m, System.currentTimeMillis());
    }
}
