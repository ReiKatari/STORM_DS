package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a96  reason: default package */
/* loaded from: classes.dex */
public final class a96 extends g1 {
    public static final a96 B = new a96(new Object[0]);
    public final Object[] A;

    public a96(Object[] objArr) {
        this.A = objArr;
    }

    @Override // defpackage.k0
    public final int b() {
        return this.A.length;
    }

    @Override // defpackage.g1
    public final g1 c(int i, Object obj) {
        Object[] objArr = this.A;
        sn2.q(i, objArr.length);
        if (i == objArr.length) {
            return d(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            nu.i0(objArr, objArr2, 0, i, 6);
            nu.f0(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new a96(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        nu.f0(objArr, copyOf, i + 1, i, objArr.length - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new dn4(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.g1
    public final g1 d(Object obj) {
        Object[] objArr = this.A;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new a96(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new dn4(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.A;
        sn2.p(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.g1
    public final g1 i(Collection collection) {
        Object[] objArr = this.A;
        if (collection.size() + objArr.length <= 32) {
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            int length = objArr.length;
            for (Object obj : collection) {
                copyOf[length] = obj;
                length++;
            }
            return new a96(copyOf);
        }
        en4 j = j();
        j.addAll(collection);
        return j.d();
    }

    @Override // defpackage.y0, java.util.List
    public final int indexOf(Object obj) {
        return nu.w0(this.A, obj);
    }

    @Override // defpackage.g1
    public final en4 j() {
        return new en4(this, null, this.A, 0);
    }

    @Override // defpackage.g1
    public final g1 k(f1 f1Var) {
        Object[] objArr = this.A;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) f1Var.n(obj)).booleanValue()) {
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
        return new a96(nu.k0(objArr2, 0, length));
    }

    @Override // defpackage.g1
    public final g1 l(int i) {
        Object[] objArr = this.A;
        sn2.p(i, objArr.length);
        if (objArr.length == 1) {
            return B;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        nu.f0(objArr, copyOf, i, i + 1, objArr.length);
        return new a96(copyOf);
    }

    @Override // defpackage.y0, java.util.List
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

    @Override // defpackage.y0, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.A;
        sn2.q(i, objArr.length);
        return new g60(objArr, i, objArr.length);
    }

    @Override // defpackage.g1
    public final g1 m(int i, Object obj) {
        Object[] objArr = this.A;
        sn2.p(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new a96(copyOf);
    }
}
