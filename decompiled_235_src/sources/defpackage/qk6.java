package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qk6  reason: default package */
/* loaded from: classes.dex */
public final class qk6 extends h1 {
    public static final qk6 B = new qk6(new Object[0]);
    public final Object[] A;

    public qk6(Object[] objArr) {
        this.A = objArr;
    }

    @Override // defpackage.l0
    public final int a() {
        return this.A.length;
    }

    @Override // defpackage.h1
    public final h1 b(int i, Object obj) {
        Object[] objArr = this.A;
        np2.y(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            fv.w0(objArr, objArr2, 0, i, 6);
            fv.t0(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new qk6(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        fv.t0(objArr, copyOf, i + 1, i, objArr.length - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new iw4(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.h1
    public final h1 c(Object obj) {
        Object[] objArr = this.A;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new qk6(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new iw4(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.h1
    public final h1 d(Collection collection) {
        Object[] objArr = this.A;
        if (collection.size() + objArr.length <= 32) {
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            int length = objArr.length;
            for (Object obj : collection) {
                copyOf[length] = obj;
                length++;
            }
            return new qk6(copyOf);
        }
        jw4 f = f();
        f.addAll(collection);
        return f.c();
    }

    @Override // defpackage.h1
    public final jw4 f() {
        return new jw4(this, null, this.A, 0);
    }

    @Override // defpackage.h1
    public final h1 g(g1 g1Var) {
        Object[] objArr = this.A;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) g1Var.g(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
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
        return new qk6(fv.y0(objArr2, 0, length));
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.A;
        np2.w(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.h1
    public final h1 h(int i) {
        Object[] objArr = this.A;
        np2.w(i, objArr.length);
        if (objArr.length == 1) {
            return B;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        fv.t0(objArr, copyOf, i, i + 1, objArr.length);
        return new qk6(copyOf);
    }

    @Override // defpackage.h1
    public final h1 i(int i, Object obj) {
        Object[] objArr = this.A;
        np2.w(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new qk6(copyOf);
    }

    @Override // defpackage.z0, java.util.List
    public final int indexOf(Object obj) {
        return fv.K0(this.A, obj);
    }

    @Override // defpackage.z0, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.A;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.z0, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.A;
        np2.y(i, objArr.length);
        return new l80(objArr, i, objArr.length);
    }
}
