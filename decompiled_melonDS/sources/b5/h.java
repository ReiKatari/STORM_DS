package b5;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h implements ta.a {
    public static final boolean R = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger X = Logger.getLogger(h.class.getName());
    public static final r Y;
    public static final Object Z;
    public volatile Object A;
    public volatile d B;
    public volatile g L;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [q8.r] */
    /* JADX WARN: Type inference failed for: r3v4 */
    static {
        e eVar;
        try {
            th = null;
            eVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "L"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "B"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "A"));
        } catch (Throwable th2) {
            th = th2;
            eVar = new Object();
        }
        Y = eVar;
        if (th != null) {
            X.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        Z = new Object();
    }

    public static void c(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.L;
        } while (!Y.n(hVar, gVar, g.f2048c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f2049a;
            if (thread != null) {
                gVar.f2049a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f2050b;
        }
        do {
            dVar2 = hVar.B;
        } while (!Y.l(hVar, dVar2, d.f2039d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f2042c;
            dVar.f2042c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f2042c;
            d(dVar3.f2040a, dVar3.f2041b);
            dVar3 = dVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            Level level = Level.SEVERE;
            X.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    public static Object e(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof c)) {
                if (obj == Z) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).f2038a);
        }
        Throwable th2 = ((a) obj).f2037a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    public static Object f(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // ta.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.B;
        d dVar2 = d.f2039d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f2042c = dVar;
                if (Y.l(this, dVar, dVar3)) {
                    return;
                }
                dVar = this.B;
            } while (dVar != dVar2);
            d(runnable, executor);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        String valueOf;
        try {
            Object f8 = f(this);
            sb2.append("SUCCESS, result=[");
            if (f8 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(f8);
            }
            sb2.append(valueOf);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e6) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e6.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        a aVar;
        Object obj = this.A;
        if (obj == null) {
            if (R) {
                aVar = new a(new CancellationException("Future.cancel() was called."), z10);
            } else if (z10) {
                aVar = a.f2035b;
            } else {
                aVar = a.f2036c;
            }
            if (Y.m(this, obj, aVar)) {
                c(this);
                return true;
            }
            return false;
        }
        return false;
    }

    public String g() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        long j10;
        Locale locale;
        boolean z10;
        g gVar = g.f2048c;
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.A;
            if (obj != null) {
                return e(obj);
            }
            if (nanos > 0) {
                j10 = System.nanoTime() + nanos;
            } else {
                j10 = 0;
            }
            if (nanos >= 1000) {
                g gVar2 = this.L;
                if (gVar2 != gVar) {
                    g gVar3 = new g();
                    do {
                        r rVar = Y;
                        rVar.O(gVar3, gVar2);
                        if (rVar.n(this, gVar2, gVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.A;
                                    if (obj2 != null) {
                                        return e(obj2);
                                    }
                                    nanos = j10 - System.nanoTime();
                                } else {
                                    h(gVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(gVar3);
                        } else {
                            gVar2 = this.L;
                        }
                    } while (gVar2 != gVar);
                    return e(this.A);
                }
                return e(this.A);
            }
            while (nanos > 0) {
                Object obj3 = this.A;
                if (obj3 != null) {
                    return e(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j10 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String hVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                int i2 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                if (i2 != 0 && nanos2 <= 1000) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i2 > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z10) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z10) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + hVar);
        }
        throw new InterruptedException();
    }

    public final void h(g gVar) {
        gVar.f2049a = null;
        while (true) {
            g gVar2 = this.L;
            if (gVar2 != g.f2048c) {
                g gVar3 = null;
                while (gVar2 != null) {
                    g gVar4 = gVar2.f2050b;
                    if (gVar2.f2049a != null) {
                        gVar3 = gVar2;
                    } else if (gVar3 != null) {
                        gVar3.f2050b = gVar4;
                        if (gVar3.f2049a == null) {
                            break;
                        }
                    } else if (!Y.n(this, gVar2, gVar4)) {
                        break;
                    }
                    gVar2 = gVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean i(Throwable th2) {
        th2.getClass();
        if (Y.m(this, null, new c(th2))) {
            c(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.A instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.A != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.A instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = g();
            } catch (RuntimeException e6) {
                str = "Exception thrown from implementation: " + e6.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        g gVar = g.f2048c;
        if (!Thread.interrupted()) {
            Object obj2 = this.A;
            if (obj2 != null) {
                return e(obj2);
            }
            g gVar2 = this.L;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    r rVar = Y;
                    rVar.O(gVar3, gVar2);
                    if (rVar.n(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.A;
                            } else {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    gVar2 = this.L;
                } while (gVar2 != gVar);
                return e(this.A);
            }
            return e(this.A);
        }
        throw new InterruptedException();
    }
}
