package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j93  reason: default package */
/* loaded from: classes.dex */
public class j93 implements Iterable, zf3 {
    public final int A;
    public final int B;
    public final int L;

    public j93(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.A = i;
                this.B = nj2.s(i, i2, i3);
                this.L = i3;
                return;
            }
            i.h("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        i.h("Step must be non-zero.");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j93) {
            if (!isEmpty() || !((j93) obj).isEmpty()) {
                j93 j93Var = (j93) obj;
                if (this.A == j93Var.A && this.B == j93Var.B && this.L == j93Var.L) {
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
        return new k93(this.A, this.B, this.L);
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
