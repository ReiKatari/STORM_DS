package si;

import a0.j;
import ad.g;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import qi.e;
import qi.f;
import rd.k;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: k  reason: collision with root package name */
    public static final Logger f12935k;

    /* renamed from: l  reason: collision with root package name */
    public static final c f12936l;

    /* renamed from: a  reason: collision with root package name */
    public final k f12937a;

    /* renamed from: b  reason: collision with root package name */
    public final Logger f12938b;

    /* renamed from: c  reason: collision with root package name */
    public int f12939c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12940d;

    /* renamed from: e  reason: collision with root package name */
    public long f12941e;

    /* renamed from: f  reason: collision with root package name */
    public int f12942f;

    /* renamed from: g  reason: collision with root package name */
    public int f12943g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f12944h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f12945i;

    /* renamed from: j  reason: collision with root package name */
    public final g f12946j;

    static {
        Logger logger = Logger.getLogger(c.class.getName());
        logger.getClass();
        f12935k = logger;
        f12936l = new c(new k(new f(d.s(new StringBuilder(), qi.g.f12553b, " TaskRunner"), true)));
    }

    public c(k kVar) {
        Logger logger = f12935k;
        logger.getClass();
        this.f12937a = kVar;
        this.f12938b = logger;
        this.f12939c = 10000;
        this.f12944h = new ArrayList();
        this.f12945i = new ArrayList();
        this.f12946j = new g(16, this);
    }

    public static final void a(c cVar, a aVar, long j2, boolean z10) {
        TimeZone timeZone = qi.g.f12552a;
        b bVar = aVar.f12927c;
        bVar.getClass();
        if (bVar.f12932d == aVar) {
            boolean z11 = bVar.f12934f;
            bVar.f12934f = false;
            bVar.f12932d = null;
            cVar.f12944h.remove(bVar);
            if (j2 != -1 && !z11 && !bVar.f12931c) {
                bVar.e(aVar, j2, true);
            }
            if (!bVar.f12933e.isEmpty()) {
                cVar.f12945i.add(bVar);
                if (!z10) {
                    cVar.e();
                    return;
                }
                return;
            }
            return;
        }
        j.p("Check failed.");
    }

    public final a b() {
        long j2;
        a aVar;
        boolean z10;
        TimeZone timeZone = qi.g.f12552a;
        while (true) {
            ArrayList arrayList = this.f12945i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j10 = Long.MAX_VALUE;
            int i2 = 0;
            a aVar2 = null;
            while (true) {
                if (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    a aVar3 = (a) ((b) obj).f12933e.get(0);
                    j2 = nanoTime;
                    aVar = null;
                    long max = Math.max(0L, aVar3.f12928d - j2);
                    if (max > 0) {
                        j10 = Math.min(max, j10);
                    } else if (aVar2 != null) {
                        z10 = true;
                        break;
                    } else {
                        aVar2 = aVar3;
                    }
                    nanoTime = j2;
                } else {
                    j2 = nanoTime;
                    aVar = null;
                    z10 = false;
                    break;
                }
            }
            ArrayList arrayList2 = this.f12944h;
            if (aVar2 != null) {
                TimeZone timeZone2 = qi.g.f12552a;
                aVar2.f12928d = -1L;
                b bVar = aVar2.f12927c;
                bVar.getClass();
                bVar.f12933e.remove(aVar2);
                arrayList.remove(bVar);
                bVar.f12932d = aVar2;
                arrayList2.add(bVar);
                if (z10 || (!this.f12940d && !arrayList.isEmpty())) {
                    e();
                }
                return aVar2;
            } else if (this.f12940d) {
                if (j10 < this.f12941e - j2) {
                    notify();
                    return aVar;
                }
                return aVar;
            } else {
                this.f12940d = true;
                this.f12941e = j2 + j10;
                try {
                    try {
                        TimeZone timeZone3 = qi.g.f12552a;
                        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i10 > 0) {
                            long j11 = j10 / 1000000;
                            long j12 = j10 - (1000000 * j11);
                            if (j11 > 0 || i10 > 0) {
                                wait(j11, (int) j12);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = qi.g.f12552a;
                        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                            ((b) arrayList2.get(size2)).a();
                        }
                        for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                            b bVar2 = (b) arrayList.get(size3);
                            bVar2.a();
                            if (bVar2.f12933e.isEmpty()) {
                                arrayList.remove(size3);
                            }
                        }
                    }
                } finally {
                    this.f12940d = false;
                }
            }
        }
    }

    public final void c(b bVar) {
        bVar.getClass();
        TimeZone timeZone = qi.g.f12552a;
        if (bVar.f12932d == null) {
            boolean isEmpty = bVar.f12933e.isEmpty();
            ArrayList arrayList = this.f12945i;
            if (!isEmpty) {
                byte[] bArr = e.f12548a;
                arrayList.getClass();
                if (!arrayList.contains(bVar)) {
                    arrayList.add(bVar);
                }
            } else {
                arrayList.remove(bVar);
            }
        }
        if (this.f12940d) {
            notify();
        } else {
            e();
        }
    }

    public final b d() {
        int i2;
        synchronized (this) {
            i2 = this.f12939c;
            this.f12939c = i2 + 1;
        }
        return new b(this, d.l(i2, "Q"));
    }

    public final void e() {
        TimeZone timeZone = qi.g.f12552a;
        int i2 = this.f12942f;
        if (i2 > this.f12943g) {
            return;
        }
        this.f12942f = i2 + 1;
        g gVar = this.f12946j;
        gVar.getClass();
        ((ThreadPoolExecutor) this.f12937a.B).execute(gVar);
    }
}
