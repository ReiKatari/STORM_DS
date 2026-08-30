package ti;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final long f13244a;

    /* renamed from: b  reason: collision with root package name */
    public final si.b f13245b;

    /* renamed from: c  reason: collision with root package name */
    public final ri.f f13246c;

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentLinkedQueue f13247d;

    public p(si.c cVar) {
        cVar.getClass();
        TimeUnit.MINUTES.getClass();
        this.f13244a = 300000000000L;
        this.f13245b = cVar.d();
        this.f13246c = new ri.f(2, this, w.d.s(new StringBuilder(), qi.g.f12553b, " ConnectionPool connection closer"));
        this.f13247d = new ConcurrentLinkedQueue();
    }

    public final int a(o oVar, long j2) {
        TimeZone timeZone = qi.g.f12552a;
        ArrayList arrayList = oVar.f13242p;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                zi.f fVar = zi.f.f15151a;
                zi.f.f15151a.j(((l) reference).f13216a, "A connection to " + oVar.f13230c.f11725a.f11665h + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i2);
                if (arrayList.isEmpty()) {
                    oVar.f13243q = j2 - this.f13244a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
