package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xz2  reason: default package */
/* loaded from: classes.dex */
public final class xz2 implements rm6 {
    public final int A;
    public final qz2 B;
    public final tc7 L;
    public long R;
    public long X;
    public final ArrayDeque Y;
    public boolean Z;
    public final vz2 d0;
    public final uz2 e0;
    public final wz2 f0;
    public final wz2 g0;
    public a62 h0;
    public IOException i0;

    public xz2(int i, qz2 qz2Var, boolean z, boolean z2, yw2 yw2Var) {
        qz2Var.getClass();
        this.A = i;
        this.B = qz2Var;
        this.L = new tc7(i);
        this.X = qz2Var.n0.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.Y = arrayDeque;
        this.d0 = new vz2(this, qz2Var.m0.a(), z2);
        this.e0 = new uz2(this, z);
        this.f0 = new wz2(this);
        this.g0 = new wz2(this);
        if (yw2Var != null) {
            if (!g()) {
                arrayDeque.add(yw2Var);
            } else {
                i.m("locally-initiated streams shouldn't have headers yet");
                throw null;
            }
        } else if (g()) {
        } else {
            i.m("remotely-initiated streams should have headers");
            throw null;
        }
    }

    public final void a() {
        boolean z;
        boolean h;
        TimeZone timeZone = az7.a;
        synchronized (this) {
            try {
                vz2 vz2Var = this.d0;
                if (!vz2Var.B && vz2Var.X) {
                    uz2 uz2Var = this.e0;
                    if (!uz2Var.A) {
                        if (uz2Var.L) {
                        }
                    }
                    z = true;
                    h = h();
                }
                z = false;
                h = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(a62.CANCEL, null);
        } else if (!h) {
            this.B.k(this.A);
        }
    }

    public final void b() {
        uz2 uz2Var = this.e0;
        if (!uz2Var.L) {
            if (!uz2Var.A) {
                if (f() != null) {
                    IOException iOException = this.i0;
                    if (iOException == null) {
                        a62 f = f();
                        f.getClass();
                        throw new lr6(f);
                    }
                    throw iOException;
                }
                return;
            }
            e41.i("stream finished");
            return;
        }
        e41.i("stream closed");
    }

    public final void c(a62 a62Var, IOException iOException) {
        a62Var.getClass();
        if (!d(a62Var, iOException)) {
            return;
        }
        qz2 qz2Var = this.B;
        qz2Var.getClass();
        qz2Var.s0.v(this.A, a62Var);
    }

    @Override // defpackage.rm6
    public final void cancel() {
        e(a62.CANCEL);
    }

    public final boolean d(a62 a62Var, IOException iOException) {
        TimeZone timeZone = az7.a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            this.h0 = a62Var;
            this.i0 = iOException;
            notifyAll();
            if (this.d0.B) {
                if (this.e0.A) {
                    return false;
                }
            }
            this.B.k(this.A);
            return true;
        }
    }

    public final void e(a62 a62Var) {
        a62Var.getClass();
        if (!d(a62Var, null)) {
            return;
        }
        this.B.v(this.A, a62Var);
    }

    public final a62 f() {
        a62 a62Var;
        synchronized (this) {
            a62Var = this.h0;
        }
        return a62Var;
    }

    public final boolean g() {
        boolean z;
        if ((this.A & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.B.getClass();
        if (true == z) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        synchronized (this) {
            try {
                if (f() != null) {
                    return false;
                }
                vz2 vz2Var = this.d0;
                if (!vz2Var.B) {
                    if (vz2Var.X) {
                    }
                    return true;
                }
                uz2 uz2Var = this.e0;
                if (uz2Var.A || uz2Var.L) {
                    if (this.Z) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0006, B:6:0x000b, B:8:0x0013, B:11:0x001c, B:16:0x002d, B:17:0x0031, B:14:0x0024), top: B:24:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(yw2 yw2Var, boolean z) {
        boolean h;
        yw2Var.getClass();
        TimeZone timeZone = az7.a;
        synchronized (this) {
            try {
                if (this.Z && yw2Var.a(":status") == null && yw2Var.a(":method") == null) {
                    this.d0.getClass();
                    if (z) {
                        this.d0.B = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.Z = true;
                this.Y.add(yw2Var);
                if (z) {
                }
                h = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!h) {
            this.B.k(this.A);
        }
    }

    @Override // defpackage.rm6
    public final in6 k() {
        return this.d0;
    }

    @Override // defpackage.rm6
    public final ui6 w() {
        return this.e0;
    }
}
