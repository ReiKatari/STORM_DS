package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o62  reason: default package */
/* loaded from: classes.dex */
public abstract class o62 implements Runnable, Comparable, il1 {
    public long A;
    public int B = -1;
    private volatile Object _heap;

    public o62(long j) {
        this.A = j;
    }

    public final int b(long j, p62 p62Var, q62 q62Var) {
        o62 o62Var;
        boolean z;
        synchronized (this) {
            if (this._heap == r62.a) {
                return 2;
            }
            synchronized (p62Var) {
                o62[] o62VarArr = p62Var.a;
                if (o62VarArr != null) {
                    o62Var = o62VarArr[0];
                } else {
                    o62Var = null;
                }
                if (q62.e0.get(q62Var) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return 1;
                }
                if (o62Var == null) {
                    p62Var.c = j;
                } else {
                    long j2 = o62Var.A;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - p62Var.c > 0) {
                        p62Var.c = j;
                    }
                }
                long j3 = this.A;
                long j4 = p62Var.c;
                if (j3 - j4 < 0) {
                    this.A = j4;
                }
                p62Var.a(this);
                return 0;
            }
        }
    }

    public final void c(p62 p62Var) {
        if (this._heap != r62.a) {
            this._heap = p62Var;
        } else {
            i.h("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = ((this.A - ((o62) obj).A) > 0L ? 1 : ((this.A - ((o62) obj).A) == 0L ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        return 0;
    }

    @Override // defpackage.il1
    public final void dispose() {
        p62 p62Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                gr1 gr1Var = r62.a;
                if (obj == gr1Var) {
                    return;
                }
                p57 p57Var = null;
                if (obj instanceof p62) {
                    p62Var = (p62) obj;
                } else {
                    p62Var = null;
                }
                if (p62Var != null) {
                    synchronized (p62Var) {
                        Object obj2 = this._heap;
                        if (obj2 instanceof p57) {
                            p57Var = (p57) obj2;
                        }
                        if (p57Var != null) {
                            p62Var.b(this.B);
                        }
                    }
                }
                this._heap = gr1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.A + ']';
    }
}
