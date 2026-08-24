package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lf1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lf1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ArrayList B;

    public /* synthetic */ lf1(int i, ArrayList arrayList) {
        this.A = i;
        this.B = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        ArrayList arrayList = this.B;
        switch (i) {
            case 0:
                wl2.a(4, arrayList);
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
