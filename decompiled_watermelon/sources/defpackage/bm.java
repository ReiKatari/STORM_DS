package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bm implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;
    public final /* synthetic */ String b;
    public final /* synthetic */ cw c;

    public /* synthetic */ bm(ThreadFactory threadFactory, String str, cw cwVar) {
        this.a = threadFactory;
        this.b = str;
        this.c = cwVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.getClass();
        newThread.setName(this.b + zg6.H0(2, String.valueOf(cw.b.incrementAndGet(this.c))));
        return newThread;
    }
}
