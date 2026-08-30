package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: um4  reason: default package */
/* loaded from: classes.dex */
public abstract class um4 implements Iterator, f93 {
    public final gy6[] A;
    public int B;
    public boolean L = true;

    public um4(fy6 fy6Var, gy6[] gy6VarArr) {
        this.A = gy6VarArr;
        gy6VarArr[0].a(fy6Var.d, Integer.bitCount(fy6Var.a) * 2, 0);
        this.B = 0;
        a();
    }

    public final void a() {
        int i = this.B;
        gy6[] gy6VarArr = this.A;
        gy6 gy6Var = gy6VarArr[i];
        if (gy6Var.L < gy6Var.B) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                gy6 gy6Var2 = gy6VarArr[i];
                int i2 = gy6Var2.L;
                Object[] objArr = gy6Var2.A;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    gy6Var2.L = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.B = b;
                return;
            }
            if (i > 0) {
                gy6 gy6Var3 = gy6VarArr[i - 1];
                int i3 = gy6Var3.L;
                int length2 = gy6Var3.A.length;
                gy6Var3.L = i3 + 1;
            }
            gy6VarArr[i].a(fy6.e.d, 0, 0);
            i--;
        }
        this.L = false;
    }

    public final int b(int i) {
        gy6[] gy6VarArr = this.A;
        gy6 gy6Var = gy6VarArr[i];
        int i2 = gy6Var.L;
        if (i2 < gy6Var.B) {
            return i;
        }
        Object[] objArr = gy6Var.A;
        if (i2 < objArr.length) {
            int length = objArr.length;
            Object obj = objArr[i2];
            obj.getClass();
            fy6 fy6Var = (fy6) obj;
            if (i == 6) {
                gy6 gy6Var2 = gy6VarArr[i + 1];
                Object[] objArr2 = fy6Var.d;
                gy6Var2.a(objArr2, objArr2.length, 0);
            } else {
                gy6VarArr[i + 1].a(fy6Var.d, Integer.bitCount(fy6Var.a) * 2, 0);
            }
            return b(i + 1);
        }
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.L;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.L) {
            Object next = this.A[this.B].next();
            a();
            return next;
        }
        vd6.b();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
