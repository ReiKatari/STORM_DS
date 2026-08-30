package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x12  reason: default package */
/* loaded from: classes.dex */
public abstract class x12 implements Runnable, Comparable, eh1 {
    public long A;
    public int B = -1;
    private volatile Object _heap;

    public x12(long j) {
        this.A = j;
    }

    public final int b(long j, y12 y12Var, z12 z12Var) {
        x12 x12Var;
        boolean z;
        synchronized (this) {
            if (this._heap == a22.a) {
                return 2;
            }
            synchronized (y12Var) {
                x12[] x12VarArr = y12Var.a;
                if (x12VarArr != null) {
                    x12Var = x12VarArr[0];
                } else {
                    x12Var = null;
                }
                if (z12.d0.get(z12Var) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return 1;
                }
                if (x12Var == null) {
                    y12Var.c = j;
                } else {
                    long j2 = x12Var.A;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - y12Var.c > 0) {
                        y12Var.c = j;
                    }
                }
                long j3 = this.A;
                long j4 = y12Var.c;
                if (j3 - j4 < 0) {
                    this.A = j4;
                }
                y12Var.a(this);
                return 0;
            }
        }
    }

    public final void c(y12 y12Var) {
        if (this._heap != a22.a) {
            this._heap = y12Var;
        } else {
            i.i("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = ((this.A - ((x12) obj).A) > 0L ? 1 : ((this.A - ((x12) obj).A) == 0L ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        return 0;
    }

    @Override // defpackage.eh1
    public final void dispose() {
        y12 y12Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                an1 an1Var = a22.a;
                if (obj == an1Var) {
                    return;
                }
                ys6 ys6Var = null;
                if (obj instanceof y12) {
                    y12Var = (y12) obj;
                } else {
                    y12Var = null;
                }
                if (y12Var != null) {
                    synchronized (y12Var) {
                        Object obj2 = this._heap;
                        if (obj2 instanceof ys6) {
                            ys6Var = (ys6) obj2;
                        }
                        if (ys6Var != null) {
                            y12Var.b(this.B);
                        }
                    }
                }
                this._heap = an1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.A + ']';
    }
}
