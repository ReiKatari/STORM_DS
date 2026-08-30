package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: af6  reason: default package */
/* loaded from: classes.dex */
public final class af6 {
    public final ka3 a;
    public final og1 b;
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

    public af6(ka3 ka3Var) {
        this.a = ka3Var;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = e67.a;
        jn4 jn4Var = new jn4(looper, 1);
        jn4Var.sendMessageDelayed(jn4Var.obtainMessage(), 1000L);
        this.b = new og1(handlerThread.getLooper(), this, 4);
    }

    public final bf6 a() {
        ss3 ss3Var = (ss3) this.a.B;
        return new bf6(ss3Var.maxSize(), ss3Var.size(), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, System.currentTimeMillis());
    }
}
