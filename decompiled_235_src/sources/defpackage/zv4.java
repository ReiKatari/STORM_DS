package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zv4  reason: default package */
/* loaded from: classes.dex */
public abstract class zv4 implements Iterator, zf3 {
    public final bc7[] A;
    public int B;
    public boolean L = true;

    public zv4(ac7 ac7Var, bc7[] bc7VarArr) {
        this.A = bc7VarArr;
        bc7VarArr[0].a(ac7Var.d, Integer.bitCount(ac7Var.a) * 2, 0);
        this.B = 0;
        a();
    }

    public final void a() {
        int i = this.B;
        bc7[] bc7VarArr = this.A;
        bc7 bc7Var = bc7VarArr[i];
        if (bc7Var.L < bc7Var.B) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                bc7 bc7Var2 = bc7VarArr[i];
                int i2 = bc7Var2.L;
                Object[] objArr = bc7Var2.A;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    bc7Var2.L = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.B = b;
                return;
            }
            if (i > 0) {
                bc7 bc7Var3 = bc7VarArr[i - 1];
                int i3 = bc7Var3.L;
                int length2 = bc7Var3.A.length;
                bc7Var3.L = i3 + 1;
            }
            bc7VarArr[i].a(ac7.e.d, 0, 0);
            i--;
        }
        this.L = false;
    }

    public final int b(int i) {
        bc7[] bc7VarArr = this.A;
        bc7 bc7Var = bc7VarArr[i];
        int i2 = bc7Var.L;
        if (i2 < bc7Var.B) {
            return i;
        }
        Object[] objArr = bc7Var.A;
        if (i2 < objArr.length) {
            int length = objArr.length;
            Object obj = objArr[i2];
            obj.getClass();
            ac7 ac7Var = (ac7) obj;
            if (i == 6) {
                bc7 bc7Var2 = bc7VarArr[i + 1];
                Object[] objArr2 = ac7Var.d;
                bc7Var2.a(objArr2, objArr2.length, 0);
            } else {
                bc7VarArr[i + 1].a(ac7Var.d, Integer.bitCount(ac7Var.a) * 2, 0);
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
        fa6.c();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
