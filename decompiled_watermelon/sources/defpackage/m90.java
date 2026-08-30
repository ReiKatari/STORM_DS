package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m90  reason: default package */
/* loaded from: classes.dex */
public final class m90 implements Runnable {
    public final /* synthetic */ int A;
    public final int B;
    public final Object L;

    public m90(List list, int i, Throwable th) {
        this.A = 1;
        nl2.C(list, "initCallbacks cannot be null");
        this.L = new ArrayList(list);
        this.B = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        int i2 = this.B;
        Object obj = this.L;
        switch (i) {
            case 0:
                io2 io2Var = (io2) ((dz4) obj).A;
                if (io2Var != null) {
                    io2Var.c0(i2);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 != 1) {
                    while (i3 < size) {
                        ((ko1) arrayList.get(i3)).a();
                        i3++;
                    }
                    return;
                }
                while (i3 < size) {
                    ((ko1) arrayList.get(i3)).b();
                    i3++;
                }
                return;
            default:
                ((wu3) obj).c0.k0(i2);
                return;
        }
    }

    public /* synthetic */ m90(int i, int i2, Object obj) {
        this.A = i2;
        this.L = obj;
        this.B = i;
    }
}
