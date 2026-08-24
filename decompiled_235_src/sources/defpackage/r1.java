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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r1  reason: default package */
/* loaded from: classes.dex */
public abstract class r1 implements gx3 {
    public static final boolean R = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger X = Logger.getLogger(r1.class.getName());
    public static final q60 Y;
    public static final Object Z;
    public volatile Object A;
    public volatile n1 B;
    public volatile q1 L;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [q60] */
    /* JADX WARN: Type inference failed for: r3v4 */
    static {
        o1 o1Var;
        try {
            th = null;
            o1Var = new o1(AtomicReferenceFieldUpdater.newUpdater(q1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(q1.class, q1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(r1.class, q1.class, "L"), AtomicReferenceFieldUpdater.newUpdater(r1.class, n1.class, "B"), AtomicReferenceFieldUpdater.newUpdater(r1.class, Object.class, "A"));
        } catch (Throwable th) {
            th = th;
            o1Var = new Object();
        }
        Y = o1Var;
        if (th != null) {
            X.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        Z = new Object();
    }

    public static void c(r1 r1Var) {
        q1 q1Var;
        n1 n1Var;
        n1 n1Var2;
        n1 n1Var3;
        do {
            q1Var = r1Var.L;
        } while (!Y.o(r1Var, q1Var, q1.c));
        while (true) {
            n1Var = null;
            if (q1Var == null) {
                break;
            }
            Thread thread = q1Var.a;
            if (thread != null) {
                q1Var.a = null;
                LockSupport.unpark(thread);
            }
            q1Var = q1Var.b;
        }
        do {
            n1Var2 = r1Var.B;
        } while (!Y.m(r1Var, n1Var2, n1.d));
        while (true) {
            n1Var3 = n1Var;
            n1Var = n1Var2;
            if (n1Var == null) {
                break;
            }
            n1Var2 = n1Var.c;
            n1Var.c = n1Var3;
        }
        while (n1Var3 != null) {
            n1 n1Var4 = n1Var3.c;
            d(n1Var3.b, n1Var3.a);
            n1Var3 = n1Var4;
        }
    }

    public static void d(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            X.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object e(Object obj) {
        if (!(obj instanceof k1)) {
            if (!(obj instanceof m1)) {
                if (obj == Z) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((m1) obj).a);
        }
        Throwable th = ((k1) obj).a;
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

    @Override // defpackage.gx3
    public final void a(Executor executor, Runnable runnable) {
        executor.getClass();
        n1 n1Var = this.B;
        n1 n1Var2 = n1.d;
        if (n1Var != n1Var2) {
            n1 n1Var3 = new n1(executor, runnable);
            do {
                n1Var3.c = n1Var;
                if (Y.m(this, n1Var, n1Var3)) {
                    return;
                }
                n1Var = this.B;
            } while (n1Var != n1Var2);
            d(executor, runnable);
        }
        d(executor, runnable);
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
        k1 k1Var;
        Object obj = this.A;
        if (obj == null) {
            if (R) {
                k1Var = new k1(new CancellationException("Future.cancel() was called."), z);
            } else if (z) {
                k1Var = k1.b;
            } else {
                k1Var = k1.c;
            }
            if (Y.n(this, obj, k1Var)) {
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
        q1 q1Var = q1.c;
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
                q1 q1Var2 = this.L;
                if (q1Var2 != q1Var) {
                    q1 q1Var3 = new q1();
                    do {
                        q60 q60Var = Y;
                        q60Var.S(q1Var3, q1Var2);
                        if (q60Var.o(this, q1Var2, q1Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.A;
                                    if (obj2 != null) {
                                        return e(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    h(q1Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(q1Var3);
                        } else {
                            q1Var2 = this.L;
                        }
                    } while (q1Var2 != q1Var);
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
            String r1Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            StringBuilder s = xg6.s(j, "Waited ", " ");
            s.append(timeUnit.toString().toLowerCase(locale));
            String sb = s.toString();
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
            throw new TimeoutException(lb1.m(sb, " for ", r1Var));
        }
        throw new InterruptedException();
    }

    public final void h(q1 q1Var) {
        q1Var.a = null;
        while (true) {
            q1 q1Var2 = this.L;
            if (q1Var2 != q1.c) {
                q1 q1Var3 = null;
                while (q1Var2 != null) {
                    q1 q1Var4 = q1Var2.b;
                    if (q1Var2.a != null) {
                        q1Var3 = q1Var2;
                    } else if (q1Var3 != null) {
                        q1Var3.b = q1Var4;
                        if (q1Var3.a == null) {
                            break;
                        }
                    } else if (!Y.o(this, q1Var2, q1Var4)) {
                        break;
                    }
                    q1Var2 = q1Var4;
                }
                return;
            }
            return;
        }
    }

    public boolean i(Throwable th) {
        th.getClass();
        if (Y.n(this, null, new m1(th))) {
            c(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.A instanceof k1;
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
        if (this.A instanceof k1) {
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
        q1 q1Var = q1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.A;
            if (obj2 != null) {
                return e(obj2);
            }
            q1 q1Var2 = this.L;
            if (q1Var2 != q1Var) {
                q1 q1Var3 = new q1();
                do {
                    q60 q60Var = Y;
                    q60Var.S(q1Var3, q1Var2);
                    if (q60Var.o(this, q1Var2, q1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.A;
                            } else {
                                h(q1Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    q1Var2 = this.L;
                } while (q1Var2 != q1Var);
                return e(this.A);
            }
            return e(this.A);
        }
        throw new InterruptedException();
    }
}
