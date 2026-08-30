package defpackage;

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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q1  reason: default package */
/* loaded from: classes.dex */
public abstract class q1 implements fq3 {
    public static final boolean R = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger X = Logger.getLogger(q1.class.getName());
    public static final l07 Y;
    public static final Object Z;
    public volatile Object A;
    public volatile m1 B;
    public volatile p1 L;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [l07] */
    /* JADX WARN: Type inference failed for: r3v4 */
    static {
        n1 n1Var;
        try {
            th = null;
            n1Var = new n1(AtomicReferenceFieldUpdater.newUpdater(p1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(p1.class, p1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(q1.class, p1.class, "L"), AtomicReferenceFieldUpdater.newUpdater(q1.class, m1.class, "B"), AtomicReferenceFieldUpdater.newUpdater(q1.class, Object.class, "A"));
        } catch (Throwable th) {
            th = th;
            n1Var = new Object();
        }
        Y = n1Var;
        if (th != null) {
            X.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        Z = new Object();
    }

    public static void c(q1 q1Var) {
        p1 p1Var;
        m1 m1Var;
        m1 m1Var2;
        m1 m1Var3;
        do {
            p1Var = q1Var.L;
        } while (!Y.x(q1Var, p1Var, p1.c));
        while (true) {
            m1Var = null;
            if (p1Var == null) {
                break;
            }
            Thread thread = p1Var.a;
            if (thread != null) {
                p1Var.a = null;
                LockSupport.unpark(thread);
            }
            p1Var = p1Var.b;
        }
        do {
            m1Var2 = q1Var.B;
        } while (!Y.v(q1Var, m1Var2, m1.d));
        while (true) {
            m1Var3 = m1Var;
            m1Var = m1Var2;
            if (m1Var == null) {
                break;
            }
            m1Var2 = m1Var.c;
            m1Var.c = m1Var3;
        }
        while (m1Var3 != null) {
            m1 m1Var4 = m1Var3.c;
            d(m1Var3.a, m1Var3.b);
            m1Var3 = m1Var4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            X.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object e(Object obj) {
        if (!(obj instanceof j1)) {
            if (!(obj instanceof l1)) {
                if (obj == Z) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((l1) obj).a);
        }
        Throwable th = ((j1) obj).a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object f(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // defpackage.fq3
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        m1 m1Var = this.B;
        m1 m1Var2 = m1.d;
        if (m1Var != m1Var2) {
            m1 m1Var3 = new m1(runnable, executor);
            do {
                m1Var3.c = m1Var;
                if (Y.v(this, m1Var, m1Var3)) {
                    return;
                }
                m1Var = this.B;
            } while (m1Var != m1Var2);
            d(runnable, executor);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        String valueOf;
        try {
            Object f = f(this);
            sb.append("SUCCESS, result=[");
            if (f == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(f);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        j1 j1Var;
        Object obj = this.A;
        if (obj == null) {
            if (R) {
                j1Var = new j1(new CancellationException("Future.cancel() was called."), z);
            } else if (z) {
                j1Var = j1.b;
            } else {
                j1Var = j1.c;
            }
            if (Y.w(this, obj, j1Var)) {
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
    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        boolean z;
        p1 p1Var = p1.c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.A;
            if (obj != null) {
                return e(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                p1 p1Var2 = this.L;
                if (p1Var2 != p1Var) {
                    p1 p1Var3 = new p1();
                    do {
                        l07 l07Var = Y;
                        l07Var.l0(p1Var3, p1Var2);
                        if (l07Var.x(this, p1Var2, p1Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.A;
                                    if (obj2 != null) {
                                        return e(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    h(p1Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(p1Var3);
                        } else {
                            p1Var2 = this.L;
                        }
                    } while (p1Var2 != p1Var);
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
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String q1Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            StringBuilder q = wh1.q(j, "Waited ", " ");
            q.append(timeUnit.toString().toLowerCase(locale));
            String sb = q.toString();
            if (nanos + 1000 < 0) {
                String concat = sb.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                } else {
                    z = true;
                }
                if (i > 0) {
                    String str = concat + convert + " " + lowerCase;
                    if (z) {
                        str = str.concat(",");
                    }
                    concat = str.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                sb = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(wh1.l(sb, " for ", q1Var));
        }
        throw new InterruptedException();
    }

    public final void h(p1 p1Var) {
        p1Var.a = null;
        while (true) {
            p1 p1Var2 = this.L;
            if (p1Var2 != p1.c) {
                p1 p1Var3 = null;
                while (p1Var2 != null) {
                    p1 p1Var4 = p1Var2.b;
                    if (p1Var2.a != null) {
                        p1Var3 = p1Var2;
                    } else if (p1Var3 != null) {
                        p1Var3.b = p1Var4;
                        if (p1Var3.a == null) {
                            break;
                        }
                    } else if (!Y.x(this, p1Var2, p1Var4)) {
                        break;
                    }
                    p1Var2 = p1Var4;
                }
                return;
            }
            return;
        }
    }

    public boolean i(Throwable th) {
        th.getClass();
        if (Y.w(this, null, new l1(th))) {
            c(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.A instanceof j1;
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
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.A instanceof j1) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = g();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        p1 p1Var = p1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.A;
            if (obj2 != null) {
                return e(obj2);
            }
            p1 p1Var2 = this.L;
            if (p1Var2 != p1Var) {
                p1 p1Var3 = new p1();
                do {
                    l07 l07Var = Y;
                    l07Var.l0(p1Var3, p1Var2);
                    if (l07Var.x(this, p1Var2, p1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.A;
                            } else {
                                h(p1Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    p1Var2 = this.L;
                } while (p1Var2 != p1Var);
                return e(this.A);
            }
            return e(this.A);
        }
        throw new InterruptedException();
    }
}
