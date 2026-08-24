package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pq6  reason: default package */
/* loaded from: classes.dex */
public final class pq6 {
    public final s63 a;
    public final sk1 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    public int l;
    public int m;

    public pq6(s63 s63Var) {
        this.a = s63Var;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = ck7.a;
        ow4 ow4Var = new ow4(looper, 1);
        ow4Var.sendMessageDelayed(ow4Var.obtainMessage(), 1000L);
        this.b = new sk1(handlerThread.getLooper(), this, 4);
    }

    public final qq6 a() {
        nr1 nr1Var = (nr1) this.a.B;
        return new qq6(nr1Var.maxSize(), nr1Var.size(), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, System.currentTimeMillis());
    }
}
