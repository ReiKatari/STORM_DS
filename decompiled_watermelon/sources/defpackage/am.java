package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: am  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class am implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ bm b;

    public /* synthetic */ am(int i, bm bmVar) {
        this.a = i;
        this.b = bmVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i;
        int i2;
        int i3 = 0;
        while (true) {
            i = this.a;
            i2 = 10;
            if (i3 >= 10) {
                break;
            } else if (i >= dm.a[i3]) {
                i2 = i3 + 1;
                break;
            } else {
                i3++;
            }
        }
        Thread newThread = this.b.newThread(new cm(i, runnable));
        newThread.setPriority(i2);
        return newThread;
    }
}
