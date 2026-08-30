package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: th2  reason: default package */
/* loaded from: classes.dex */
public final class th2 {
    public static final ew i;
    public final long a;
    public final long b;
    public final long c;
    public final ph2 d;
    public final ip3 e;
    public final fw f;
    public final cw g;
    public final CopyOnWriteArrayList h;

    /* JADX WARN: Type inference failed for: r0v0, types: [ew, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.a = 0L;
        i = obj;
    }

    public th2(gb5 gb5Var, long j, long j2, Set set) {
        Object obj;
        gb5Var.getClass();
        set.getClass();
        this.a = j;
        this.b = j2;
        ew ewVar = i;
        ewVar.getClass();
        this.c = ew.b.incrementAndGet(ewVar);
        this.d = new ph2(this);
        ip3 C = l07.C();
        Iterator it = gb5Var.N().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i2 = ((uf6) it.next()).a;
            Iterator it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((bg0) obj).a == i2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            bg0 bg0Var = (bg0) obj;
            if (bg0Var != null) {
                ArrayList arrayList = bg0Var.b;
                cw f = w81.f(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C.add(new qh2(this, i2, ((sf6) arrayList.get(i3)).a, f));
                }
            }
        }
        ip3 t = l07.t(C);
        this.e = t;
        this.f = w81.g(rh2.STARTED);
        ArrayList arrayList2 = new ArrayList(uq0.y0(t, 10));
        ListIterator listIterator = t.listIterator(0);
        while (true) {
            wr2 wr2Var = (wr2) listIterator;
            if (wr2Var.hasNext()) {
                arrayList2.add(new uf6(((qh2) wr2Var.next()).c));
            } else {
                this.g = w81.f(tq0.n1(tq0.r1(arrayList2)).size());
                this.h = new CopyOnWriteArrayList();
                return;
            }
        }
    }

    public final String toString() {
        return "Frame-" + ((Object) ("FrameId(value=" + this.c + ')')) + '(' + this.a + '@' + this.b + ')';
    }
}
