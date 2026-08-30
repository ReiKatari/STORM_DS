package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nb1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nb1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ArrayList B;

    public /* synthetic */ nb1(int i, ArrayList arrayList) {
        this.A = i;
        this.B = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        ArrayList arrayList = this.B;
        switch (i) {
            case 0:
                wg2.a(4, arrayList);
                return;
            default:
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((ExecutorService) obj).shutdownNow();
                }
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ((ExecutorService) obj2).awaitTermination(1L, TimeUnit.SECONDS);
                }
                return;
        }
    }
}
