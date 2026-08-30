package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b33  reason: default package */
/* loaded from: classes.dex */
public class b33 implements Iterable, f93 {
    public final int A;
    public final int B;
    public final int L;

    public b33(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.A = i;
                this.B = cg2.E(i, i2, i3);
                this.L = i3;
                return;
            }
            i.i("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        i.i("Step must be non-zero.");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b33) {
            if (!isEmpty() || !((b33) obj).isEmpty()) {
                b33 b33Var = (b33) obj;
                if (this.A == b33Var.A && this.B == b33Var.B && this.L == b33Var.L) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.A * 31) + this.B) * 31) + this.L;
    }

    public boolean isEmpty() {
        int i = this.B;
        int i2 = this.L;
        int i3 = this.A;
        if (i2 > 0) {
            if (i3 <= i) {
                return false;
            }
            return true;
        } else if (i3 >= i) {
            return false;
        } else {
            return true;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c33(this.A, this.B, this.L);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.B;
        int i2 = this.L;
        int i3 = this.A;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
