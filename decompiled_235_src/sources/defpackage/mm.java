package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mm implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ nm b;

    public /* synthetic */ mm(int i, nm nmVar) {
        this.a = i;
        this.b = nmVar;
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
            } else if (i >= pm.a[i3]) {
                i2 = i3 + 1;
                break;
            } else {
                i3++;
            }
        }
        Thread newThread = this.b.newThread(new om(runnable, i));
        newThread.setPriority(i2);
        return newThread;
    }
}
