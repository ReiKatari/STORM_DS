package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tm2  reason: default package */
/* loaded from: classes.dex */
public final class tm2 {
    public static final ww i;
    public final long a;
    public final long b;
    public final long c;
    public final pm2 d;
    public final kw3 e;
    public final xw f;
    public final uw g;
    public final CopyOnWriteArrayList h;

    /* JADX WARN: Type inference failed for: r0v0, types: [ww, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.a = 0L;
        i = obj;
    }

    public tm2(yk5 yk5Var, long j, long j2, Set set) {
        Object obj;
        yk5Var.getClass();
        set.getClass();
        this.a = j;
        this.b = j2;
        ww wwVar = i;
        wwVar.getClass();
        this.c = ww.b.incrementAndGet(wwVar);
        this.d = new pm2(this);
        kw3 I = hf.I();
        Iterator it = yk5Var.x().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i2 = ((kr6) it.next()).a;
            Iterator it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((ki0) obj).a == i2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ki0 ki0Var = (ki0) obj;
            if (ki0Var != null) {
                ArrayList arrayList = ki0Var.b;
                uw t = g04.t(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    I.add(new qm2(this, i2, ((ir6) arrayList.get(i3)).a, t));
                }
            }
        }
        kw3 A = hf.A(I);
        this.e = A;
        this.f = g04.u(rm2.STARTED);
        ArrayList arrayList2 = new ArrayList(ht0.v0(A, 10));
        ListIterator listIterator = A.listIterator(0);
        while (true) {
            xx2 xx2Var = (xx2) listIterator;
            if (xx2Var.hasNext()) {
                arrayList2.add(new kr6(((qm2) xx2Var.next()).c));
            } else {
                this.g = g04.t(gt0.k1(gt0.o1(arrayList2)).size());
                this.h = new CopyOnWriteArrayList();
                return;
            }
        }
    }

    public final String toString() {
        return "Frame-" + ((Object) ("FrameId(value=" + this.c + ')')) + '(' + this.a + '@' + this.b + ')';
    }
}
