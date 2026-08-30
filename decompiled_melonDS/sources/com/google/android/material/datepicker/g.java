package com.google.android.material.datepicker;

import java.util.ArrayList;
import java.util.List;
import l.i0;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ int A;
    public final int B;
    public final Object L;

    public g(List list, int i2, Throwable th2) {
        this.A = 1;
        p7.m.l(list, "initCallbacks cannot be null");
        this.L = new ArrayList(list);
        this.B = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                ((m) this.L).f3037b0.k0(this.B);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ArrayList arrayList = (ArrayList) this.L;
                int size = arrayList.size();
                int i2 = 0;
                if (this.B != 1) {
                    while (i2 < size) {
                        ((m6.g) arrayList.get(i2)).a();
                        i2++;
                    }
                    return;
                }
                while (i2 < size) {
                    ((m6.g) arrayList.get(i2)).b();
                    i2++;
                }
                return;
            default:
                p5.b bVar = (p5.b) ((i0) this.L).B;
                if (bVar != null) {
                    bVar.i(this.B);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g(int i2, int i10, Object obj) {
        this.A = i10;
        this.L = obj;
        this.B = i2;
    }
}
