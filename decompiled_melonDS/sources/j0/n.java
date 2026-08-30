package j0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7267a = new ArrayList();

    public n(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (!(mVar instanceof o)) {
                this.f7267a.add(mVar);
            }
        }
    }

    @Override // j0.m
    public final void a(int i2) {
        ArrayList arrayList = this.f7267a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m) obj).a(i2);
        }
    }

    @Override // j0.m
    public final void b(int i2, u uVar) {
        ArrayList arrayList = this.f7267a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m) obj).b(i2, uVar);
        }
    }

    @Override // j0.m
    public final void c(int i2, na.f fVar) {
        ArrayList arrayList = this.f7267a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m) obj).c(i2, fVar);
        }
    }

    @Override // j0.m
    public final void d(int i2) {
        ArrayList arrayList = this.f7267a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m) obj).d(i2);
        }
    }
}
