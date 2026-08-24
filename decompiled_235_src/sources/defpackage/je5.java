package defpackage;

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
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: je5  reason: default package */
/* loaded from: classes.dex */
public final class je5 implements Cloneable {
    public final xk4 A;
    public final pa B;
    public final boolean L;
    public final ls1 R;
    public final ie5 X;
    public final AtomicBoolean Y;
    public Object Z;
    public w62 d0;
    public ke5 e0;
    public boolean f0;
    public bk1 g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public volatile boolean m0;
    public volatile bk1 n0;
    public final CopyOnWriteArrayList o0;

    public je5(xk4 xk4Var, pa paVar, boolean z) {
        xk4Var.getClass();
        paVar.getClass();
        this.A = xk4Var;
        this.B = paVar;
        this.L = z;
        this.R = (ls1) xk4Var.D.B;
        xk4Var.d.getClass();
        ie5 ie5Var = new ie5(this);
        ie5Var.g(0L, TimeUnit.MILLISECONDS);
        this.X = ie5Var;
        this.Y = new AtomicBoolean();
        this.l0 = true;
        this.o0 = new CopyOnWriteArrayList();
        new AtomicReference((qo2) paVar.Y);
    }

    public static final String a(je5 je5Var) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (je5Var.m0) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (je5Var.L) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(((i03) je5Var.B.B).g());
        return sb.toString();
    }

    public final void b(ke5 ke5Var) {
        ke5Var.getClass();
        TimeZone timeZone = az7.a;
        if (this.e0 == null) {
            this.e0 = ke5Var;
            ke5Var.p.add(new he5(this, this.Z));
            return;
        }
        i.m("Check failed.");
    }

    public final IOException c(IOException iOException) {
        IOException iOException2;
        Socket k;
        TimeZone timeZone = az7.a;
        ke5 ke5Var = this.e0;
        if (ke5Var != null) {
            synchronized (ke5Var) {
                k = k();
            }
            if (this.e0 == null) {
                if (k != null) {
                    az7.c(k);
                }
            } else if (k != null) {
                i.m("Check failed.");
                return null;
            }
        }
        if (this.f0 || !this.X.j()) {
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
        if (this.m0) {
            return;
        }
        this.m0 = true;
        bk1 bk1Var = this.n0;
        if (bk1Var != null) {
            ((v62) bk1Var.R).cancel();
        }
        Iterator it = this.o0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((h26) it.next()).cancel();
        }
    }

    public final Object clone() {
        return new je5(this.A, this.B, this.L);
    }

    public final void d(nb0 nb0Var) {
        if (this.Y.compareAndSet(false, true)) {
            kx4 kx4Var = kx4.a;
            this.Z = kx4.a.g();
            eb ebVar = this.A.a;
            ge5 ge5Var = new ge5(this, nb0Var);
            ebVar.getClass();
            eb.L(ebVar, ge5Var, null, null, 6);
            return;
        }
        i.m("Already Executed");
    }

    public final wl5 e() {
        if (this.Y.compareAndSet(false, true)) {
            this.X.i();
            kx4 kx4Var = kx4.a;
            this.Z = kx4.a.g();
            try {
                eb ebVar = this.A.a;
                synchronized (ebVar) {
                    ((ArrayDeque) ebVar.X).add(this);
                }
                return g();
            } finally {
                eb ebVar2 = this.A.a;
                ebVar2.getClass();
                eb.L(ebVar2, null, this, null, 5);
            }
        }
        i.m("Already Executed");
        return null;
    }

    public final void f(boolean z) {
        bk1 bk1Var;
        synchronized (this) {
            if (!this.l0) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (bk1Var = this.n0) != null) {
            ((v62) bk1Var.R).cancel();
            ((je5) bk1Var.L).i(bk1Var, true, true, true, true, null);
        }
        this.g0 = null;
    }

    public final wl5 g() {
        ArrayList arrayList = new ArrayList();
        gt0.A0(arrayList, this.A.b);
        arrayList.add(new n70(this.A));
        arrayList.add(new n70(this.A.j));
        arrayList.add(new n70(this.A.k));
        arrayList.add(jb0.c);
        if (!this.L) {
            gt0.A0(arrayList, this.A.c);
        }
        arrayList.add(jb0.b);
        pa paVar = this.B;
        xk4 xk4Var = this.A;
        try {
            try {
                wl5 f = new dp3(this, arrayList, 0, null, paVar, xk4Var.w, xk4Var.x, xk4Var.y).f(this.B);
                if (!this.m0) {
                    j(null);
                    return f;
                }
                yy7.b(f);
                throw new IOException("Canceled");
            } catch (IOException e) {
                IOException j = j(e);
                j.getClass();
                throw j;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                j(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0050 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException i(bk1 bk1Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        bk1Var.getClass();
        if (bk1Var.equals(this.n0)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.h0) {
                        }
                        if (z) {
                            this.h0 = false;
                        }
                        if (z2) {
                            this.i0 = false;
                        }
                        if (z4) {
                            this.j0 = false;
                        }
                        if (z3) {
                            this.k0 = false;
                        }
                        if (this.h0 && !this.i0 && !this.j0 && !this.k0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            if (!this.l0) {
                                z5 = true;
                            }
                        }
                        boolean z8 = z5;
                        z5 = z7;
                        z6 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if ((!z2 || !this.i0) && ((!z4 || !this.j0) && (!z3 || !this.k0))) {
                    z6 = false;
                }
                if (z) {
                }
                if (z2) {
                }
                if (z4) {
                }
                if (z3) {
                }
                if (this.h0) {
                }
                z7 = false;
                if (z7) {
                }
                boolean z82 = z5;
                z5 = z7;
                z6 = z82;
            }
            if (z5) {
                this.n0 = null;
                ke5 ke5Var = this.e0;
                if (ke5Var != null) {
                    synchronized (ke5Var) {
                        ke5Var.m++;
                    }
                }
            }
            if (z6) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException j(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.l0) {
                this.l0 = false;
                if (!this.h0 && !this.i0 && !this.j0) {
                    if (!this.k0) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return c(iOException);
        }
        return iOException;
    }

    public final Socket k() {
        ke5 ke5Var = this.e0;
        ke5Var.getClass();
        TimeZone timeZone = az7.a;
        ArrayList arrayList = ke5Var.p;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (nb3.k(((Reference) obj).get(), this)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            arrayList.remove(i);
            this.e0 = null;
            if (!arrayList.isEmpty()) {
                return null;
            }
            ke5Var.q = System.nanoTime();
            ls1 ls1Var = this.R;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ls1Var.d;
            TimeZone timeZone2 = az7.a;
            if (!ke5Var.j) {
                ((pz6) ls1Var.b).c((hk1) ls1Var.c, 0L);
                return null;
            }
            ke5Var.j = true;
            concurrentLinkedQueue.remove(ke5Var);
            if (concurrentLinkedQueue.isEmpty()) {
                pz6 pz6Var = (pz6) ls1Var.b;
                synchronized (pz6Var.a) {
                    if (pz6Var.a()) {
                        pz6Var.a.c(pz6Var);
                    }
                }
            }
            return ke5Var.e;
        }
        i.m("Check failed.");
        return null;
    }
}
