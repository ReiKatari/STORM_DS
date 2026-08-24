package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ub0  reason: default package */
/* loaded from: classes.dex */
public final class ub0 implements Runnable {
    public final /* synthetic */ int A;
    public final int B;
    public final Object L;

    public ub0(List list, int i, Throwable th) {
        this.A = 1;
        np2.x(list, "initCallbacks cannot be null");
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
                gi2 gi2Var = (gi2) ((j97) obj).B;
                if (gi2Var != null) {
                    gi2Var.K(i2);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 != 1) {
                    while (i3 < size) {
                        ((us1) arrayList.get(i3)).a();
                        i3++;
                    }
                    return;
                }
                while (i3 < size) {
                    ((us1) arrayList.get(i3)).b();
                    i3++;
                }
                return;
            default:
                ((f24) obj).d0.k0(i2);
                return;
        }
    }

    public /* synthetic */ ub0(Object obj, int i, int i2) {
        this.A = i2;
        this.L = obj;
        this.B = i;
    }
}
