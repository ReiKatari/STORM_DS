package r2;

import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import p7.m;
import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends c {
    public static final i B = new i(new Object[0]);
    public final Object[] A;

    public i(Object[] objArr) {
        this.A = objArr;
    }

    @Override // zb.b
    public final int a() {
        return this.A.length;
    }

    @Override // r2.c
    public final c b(int i2, Object obj) {
        Object[] objArr = this.A;
        m.m(i2, objArr.length);
        if (i2 == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            k.l(objArr, objArr2, 0, i2, 6);
            k.i(objArr, objArr2, i2 + 1, i2, objArr.length);
            objArr2[i2] = obj;
            return new i(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        k.i(objArr, copyOf, i2 + 1, i2, objArr.length - 1);
        copyOf[i2] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // r2.c
    public final c c(Object obj) {
        Object[] objArr = this.A;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new i(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new e(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // r2.c
    public final c d(Collection collection) {
        Object[] objArr = this.A;
        if (collection.size() + objArr.length <= 32) {
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            int length = objArr.length;
            for (Object obj : collection) {
                copyOf[length] = obj;
                length++;
            }
            return new i(copyOf);
        }
        f e6 = e();
        e6.addAll(collection);
        return e6.c();
    }

    @Override // r2.c
    public final f e() {
        return new f(this, null, this.A, 0);
    }

    @Override // r2.c
    public final c f(b bVar) {
        Object[] objArr = this.A;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z10 = false;
        for (int i2 = 0; i2 < length2; i2++) {
            Object obj = objArr[i2];
            if (((Boolean) bVar.k(obj)).booleanValue()) {
                if (!z10) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z10 = true;
                    length = i2;
                }
            } else if (z10) {
                objArr2[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return B;
        }
        return new i(k.n(objArr2, 0, length));
    }

    @Override // r2.c
    public final c g(int i2) {
        Object[] objArr = this.A;
        m.k(i2, objArr.length);
        if (objArr.length == 1) {
            return B;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        k.i(objArr, copyOf, i2, i2 + 1, objArr.length);
        return new i(copyOf);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Object[] objArr = this.A;
        m.k(i2, objArr.length);
        return objArr[i2];
    }

    @Override // r2.c
    public final c h(int i2, Object obj) {
        Object[] objArr = this.A;
        m.k(i2, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i2] = obj;
        return new i(copyOf);
    }

    @Override // zb.e, java.util.List
    public final int indexOf(Object obj) {
        return k.A(this.A, obj);
    }

    @Override // zb.e, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.A;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i10 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length2 = i10;
                }
            }
        }
        return -1;
    }

    @Override // zb.e, java.util.List
    public final ListIterator listIterator(int i2) {
        Object[] objArr = this.A;
        m.m(i2, objArr.length);
        return new d(objArr, i2, objArr.length);
    }
}
