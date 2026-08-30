package ti;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import pi.d0;
import pi.x;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements Cloneable {
    public final x A;
    public final x0 B;
    public final p L;
    public final m R;
    public final AtomicBoolean X;
    public Object Y;
    public g Z;

    /* renamed from: b0  reason: collision with root package name */
    public o f13218b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f13219c0;

    /* renamed from: d0  reason: collision with root package name */
    public e9.a f13220d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f13221e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f13222f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f13223g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f13224h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f13225i0;

    /* renamed from: j0  reason: collision with root package name */
    public volatile boolean f13226j0;

    /* renamed from: k0  reason: collision with root package name */
    public volatile e9.a f13227k0;

    /* renamed from: l0  reason: collision with root package name */
    public final CopyOnWriteArrayList f13228l0;

    public n(x xVar, x0 x0Var) {
        xVar.getClass();
        x0Var.getClass();
        this.A = xVar;
        this.B = x0Var;
        this.L = (p) xVar.B.B;
        xVar.f11830d.getClass();
        m mVar = new m(this);
        mVar.g(0);
        this.R = mVar;
        this.X = new AtomicBoolean();
        this.f13225i0 = true;
        this.f13228l0 = new CopyOnWriteArrayList();
        new AtomicReference((p7.o) x0Var.f14093f);
    }

    public static final String a(n nVar) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (nVar.f13226j0) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("call");
        sb2.append(" to ");
        sb2.append(((pi.r) nVar.B.f14089b).g());
        return sb2.toString();
    }

    public final void b(o oVar) {
        oVar.getClass();
        TimeZone timeZone = qi.g.f12552a;
        if (this.f13218b0 == null) {
            this.f13218b0 = oVar;
            oVar.f13242p.add(new l(this, this.Y));
            return;
        }
        a0.j.p("Check failed.");
    }

    public final IOException c(IOException iOException) {
        IOException iOException2;
        Socket l10;
        TimeZone timeZone = qi.g.f12552a;
        o oVar = this.f13218b0;
        if (oVar != null) {
            synchronized (oVar) {
                l10 = l();
            }
            if (this.f13218b0 == null) {
                if (l10 != null) {
                    qi.g.b(l10);
                }
            } else if (l10 != null) {
                a0.j.p("Check failed.");
                return null;
            }
        }
        if (this.f13219c0 || !this.R.i()) {
            iOException2 = iOException;
        } else {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        }
        if (iOException != null) {
            iOException2.getClass();
        }
        return iOException2;
    }

    public final void cancel() {
        if (this.f13226j0) {
            return;
        }
        this.f13226j0 = true;
        e9.a aVar = this.f13227k0;
        if (aVar != null) {
            ((ui.e) aVar.f4417d).cancel();
        }
        Iterator it = this.f13228l0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((t) it.next()).cancel();
        }
    }

    public final Object clone() {
        return new n(this.A, this.B);
    }

    public final void e(pi.h hVar) {
        if (this.X.compareAndSet(false, true)) {
            zi.f fVar = zi.f.f15151a;
            this.Y = zi.f.f15151a.g();
            b9.e eVar = this.A.f11827a;
            k kVar = new k(this, hVar);
            eVar.getClass();
            b9.e.H(eVar, kVar, null, null, 6);
            return;
        }
        a0.j.p("Already Executed");
    }

    public final d0 f() {
        if (this.X.compareAndSet(false, true)) {
            this.R.h();
            zi.f fVar = zi.f.f15151a;
            this.Y = zi.f.f15151a.g();
            try {
                b9.e eVar = this.A.f11827a;
                synchronized (eVar) {
                    ((ArrayDeque) eVar.X).add(this);
                }
                return h();
            } finally {
                b9.e eVar2 = this.A.f11827a;
                eVar2.getClass();
                b9.e.H(eVar2, null, this, null, 5);
            }
        }
        a0.j.p("Already Executed");
        return null;
    }

    public final void g(boolean z10) {
        e9.a aVar;
        synchronized (this) {
            if (!this.f13225i0) {
                throw new IllegalStateException("released");
            }
        }
        if (z10 && (aVar = this.f13227k0) != null) {
            ((ui.e) aVar.f4417d).cancel();
            ((n) aVar.f4415b).j(aVar, true, true, true, true, null);
        }
        this.f13220d0 = null;
    }

    public final d0 h() {
        ArrayList arrayList = new ArrayList();
        zb.l.L(this.A.f11828b, arrayList);
        arrayList.add(new ri.b(this.A));
        arrayList.add(new ri.b(this.A.f11836j));
        arrayList.add(new ri.b(this.A.f11837k));
        arrayList.add(a.f13188a);
        zb.l.L(this.A.f11829c, arrayList);
        arrayList.add(ui.b.f13552a);
        x0 x0Var = this.B;
        x xVar = this.A;
        try {
            try {
                d0 b10 = new ui.g(this, arrayList, 0, null, x0Var, xVar.f11848w, xVar.f11849x, xVar.f11850y).b(this.B);
                if (!this.f13226j0) {
                    k(null);
                    return b10;
                }
                qi.e.b(b10);
                throw new IOException("Canceled");
            } catch (IOException e6) {
                IOException k10 = k(e6);
                k10.getClass();
                throw k10;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                k(null);
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0050 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException j(e9.a r4, boolean r5, boolean r6, boolean r7, boolean r8, java.io.IOException r9) {
        /*
            r3 = this;
            r4.getClass()
            e9.a r0 = r3.f13227k0
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Ld
            goto L78
        Ld:
            monitor-enter(r3)
            r4 = 1
            r0 = 0
            if (r5 == 0) goto L19
            boolean r1 = r3.f13221e0     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
            goto L19
        L17:
            r4 = move-exception
            goto L59
        L19:
            if (r6 == 0) goto L1f
            boolean r1 = r3.f13222f0     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
        L1f:
            if (r8 == 0) goto L25
            boolean r1 = r3.f13223g0     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
        L25:
            if (r7 == 0) goto L5b
            boolean r1 = r3.f13224h0     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L5b
        L2b:
            if (r5 == 0) goto L2f
            r3.f13221e0 = r0     // Catch: java.lang.Throwable -> L17
        L2f:
            if (r6 == 0) goto L33
            r3.f13222f0 = r0     // Catch: java.lang.Throwable -> L17
        L33:
            if (r8 == 0) goto L37
            r3.f13223g0 = r0     // Catch: java.lang.Throwable -> L17
        L37:
            if (r7 == 0) goto L3b
            r3.f13224h0 = r0     // Catch: java.lang.Throwable -> L17
        L3b:
            boolean r5 = r3.f13221e0     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.f13222f0     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.f13223g0     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.f13224h0     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            r5 = r4
            goto L4e
        L4d:
            r5 = r0
        L4e:
            if (r5 == 0) goto L55
            boolean r6 = r3.f13225i0     // Catch: java.lang.Throwable -> L17
            if (r6 != 0) goto L55
            r0 = r4
        L55:
            r2 = r0
            r0 = r5
            r5 = r2
            goto L5c
        L59:
            monitor-exit(r3)
            throw r4
        L5b:
            r5 = r0
        L5c:
            monitor-exit(r3)
            if (r0 == 0) goto L71
            r6 = 0
            r3.f13227k0 = r6
            ti.o r6 = r3.f13218b0
            if (r6 == 0) goto L71
            monitor-enter(r6)
            int r7 = r6.m     // Catch: java.lang.Throwable -> L6e
            int r7 = r7 + r4
            r6.m = r7     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r6)
            goto L71
        L6e:
            r4 = move-exception
            monitor-exit(r6)
            throw r4
        L71:
            if (r5 == 0) goto L78
            java.io.IOException r4 = r3.c(r9)
            return r4
        L78:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.n.j(e9.a, boolean, boolean, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException k(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f13225i0) {
                this.f13225i0 = false;
                if (!this.f13221e0 && !this.f13222f0 && !this.f13223g0) {
                    if (!this.f13224h0) {
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            return c(iOException);
        }
        return iOException;
    }

    public final Socket l() {
        o oVar = this.f13218b0;
        oVar.getClass();
        TimeZone timeZone = qi.g.f12552a;
        ArrayList arrayList = oVar.f13242p;
        int size = arrayList.size();
        int i2 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (nc.k.a(((Reference) obj).get(), this)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 != -1) {
            arrayList.remove(i2);
            this.f13218b0 = null;
            if (!arrayList.isEmpty()) {
                return null;
            }
            oVar.f13243q = System.nanoTime();
            p pVar = this.L;
            ConcurrentLinkedQueue concurrentLinkedQueue = pVar.f13247d;
            TimeZone timeZone2 = qi.g.f12552a;
            if (!oVar.f13237j) {
                pVar.f13245b.c(pVar.f13246c, 0L);
                return null;
            }
            oVar.f13237j = true;
            concurrentLinkedQueue.remove(oVar);
            if (concurrentLinkedQueue.isEmpty()) {
                si.b bVar = pVar.f13245b;
                synchronized (bVar.f12929a) {
                    if (bVar.a()) {
                        bVar.f12929a.c(bVar);
                    }
                }
            }
            return oVar.f13232e;
        }
        a0.j.p("Check failed.");
        return null;
    }
}
