package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class o0 implements Runnable, Comparable, i0 {
    public long A;
    public int B = -1;
    private volatile Object _heap;

    public o0(long j2) {
        this.A = j2;
    }

    public final int b(long j2, p0 p0Var, q0 q0Var) {
        o0 o0Var;
        boolean z10;
        synchronized (this) {
            if (this._heap == x.f15032b) {
                return 2;
            }
            synchronized (p0Var) {
                o0[] o0VarArr = p0Var.f4470a;
                if (o0VarArr != null) {
                    o0Var = o0VarArr[0];
                } else {
                    o0Var = null;
                }
                if (q0.f15028c0.get(q0Var) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return 1;
                }
                if (o0Var == null) {
                    p0Var.f15026c = j2;
                } else {
                    long j10 = o0Var.A;
                    if (j10 - j2 < 0) {
                        j2 = j10;
                    }
                    if (j2 - p0Var.f15026c > 0) {
                        p0Var.f15026c = j2;
                    }
                }
                long j11 = this.A;
                long j12 = p0Var.f15026c;
                if (j11 - j12 < 0) {
                    this.A = j12;
                }
                p0Var.a(this);
                return 0;
            }
        }
    }

    public final void c(p0 p0Var) {
        if (this._heap != x.f15032b) {
            this._heap = p0Var;
        } else {
            a0.j.h("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i2 = ((this.A - ((o0) obj).A) > 0L ? 1 : ((this.A - ((o0) obj).A) == 0L ? 0 : -1));
        if (i2 > 0) {
            return 1;
        }
        if (i2 < 0) {
            return -1;
        }
        return 0;
    }

    @Override // zc.i0
    public final void dispose() {
        p0 p0Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                a0.c cVar = x.f15032b;
                if (obj == cVar) {
                    return;
                }
                ed.w wVar = null;
                if (obj instanceof p0) {
                    p0Var = (p0) obj;
                } else {
                    p0Var = null;
                }
                if (p0Var != null) {
                    synchronized (p0Var) {
                        Object obj2 = this._heap;
                        if (obj2 instanceof ed.w) {
                            wVar = (ed.w) obj2;
                        }
                        if (wVar != null) {
                            p0Var.b(this.B);
                        }
                    }
                }
                this._heap = cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.A + ']';
    }
}
