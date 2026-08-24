package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nm implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;
    public final /* synthetic */ String b;
    public final /* synthetic */ uw c;

    public /* synthetic */ nm(ThreadFactory threadFactory, String str, uw uwVar) {
        this.a = threadFactory;
        this.b = str;
        this.c = uwVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.getClass();
        newThread.setName(this.b + qs6.B0(2, String.valueOf(uw.b.incrementAndGet(this.c))));
        return newThread;
    }
}
