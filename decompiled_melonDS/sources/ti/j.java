package ti;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements g {
    public final q A;
    public final si.c B;
    public long L;
    public final CopyOnWriteArrayList R;
    public final LinkedBlockingDeque X;

    public j(q qVar, si.c cVar) {
        cVar.getClass();
        this.A = qVar;
        this.B = cVar;
        this.L = Long.MIN_VALUE;
        this.R = new CopyOnWriteArrayList();
        this.X = new LinkedBlockingDeque();
    }

    public final void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.R;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            tVar.cancel();
            t a10 = tVar.a();
            if (a10 != null) {
                this.A.f13262p.addLast(a10);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final s b() {
        t hVar;
        q qVar = this.A;
        if (qVar.a(null)) {
            try {
                hVar = qVar.b();
            } catch (Throwable th2) {
                hVar = new h(th2);
            }
            if (hVar.d()) {
                return new s(hVar, (Throwable) null, 6);
            }
            if (hVar instanceof h) {
                return ((h) hVar).f13213a;
            }
            this.R.add(hVar);
            this.B.d().c(new i(qi.g.f12553b + " connect " + qVar.f13256i.f11665h.g(), hVar, this), 0L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0002, B:5:0x000a, B:12:0x001d, B:14:0x0025, B:22:0x004e, B:25:0x005a, B:28:0x0065, B:31:0x006e, B:33:0x0074, B:38:0x007d, B:40:0x0088, B:41:0x008e, B:43:0x0092, B:47:0x0099, B:50:0x00a3, B:52:0x00a7, B:55:0x00ad, B:56:0x00b1, B:57:0x00b5, B:58:0x00b6, B:60:0x00ba, B:20:0x0042, B:61:0x00c3, B:62:0x00ca), top: B:65:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0002, B:5:0x000a, B:12:0x001d, B:14:0x0025, B:22:0x004e, B:25:0x005a, B:28:0x0065, B:31:0x006e, B:33:0x0074, B:38:0x007d, B:40:0x0088, B:41:0x008e, B:43:0x0092, B:47:0x0099, B:50:0x00a3, B:52:0x00a7, B:55:0x00ad, B:56:0x00b1, B:57:0x00b5, B:58:0x00b6, B:60:0x00ba, B:20:0x0042, B:61:0x00c3, B:62:0x00ca), top: B:65:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a7 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0002, B:5:0x000a, B:12:0x001d, B:14:0x0025, B:22:0x004e, B:25:0x005a, B:28:0x0065, B:31:0x006e, B:33:0x0074, B:38:0x007d, B:40:0x0088, B:41:0x008e, B:43:0x0092, B:47:0x0099, B:50:0x00a3, B:52:0x00a7, B:55:0x00ad, B:56:0x00b1, B:57:0x00b5, B:58:0x00b6, B:60:0x00ba, B:20:0x0042, B:61:0x00c3, B:62:0x00ca), top: B:65:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0002 A[SYNTHETIC] */
    @Override // ti.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ti.o e() {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.j.e():ti.o");
    }

    @Override // ti.g
    public final q g() {
        return this.A;
    }
}
