package pi;

import a1.z0;
import j0.o1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q implements Iterable, oc.a {
    public static final q B = new q(new String[0]);
    public final String[] A;

    public q(String[] strArr) {
        strArr.getClass();
        this.A = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.A;
        strArr.getClass();
        int length = strArr.length - 2;
        int E = a.a.E(length, 0, -2);
        if (E <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != E) {
                    length -= 2;
                } else {
                    return null;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i2) {
        String str = (String) zb.k.z(i2 * 2, this.A);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i2 + ']');
    }

    public final o1 c() {
        o1 o1Var = new o1(3, false);
        ArrayList arrayList = o1Var.f7269a;
        arrayList.getClass();
        String[] strArr = this.A;
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList.addAll(asList);
        return o1Var;
    }

    public final String d(int i2) {
        String str = (String) zb.k.z((i2 * 2) + 1, this.A);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i2 + ']');
    }

    public final List e(String str) {
        str.getClass();
        int size = size();
        List list = null;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equalsIgnoreCase(b(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(d(i2));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            list.getClass();
        }
        if (list == null) {
            return zb.q.A;
        }
        return list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            if (Arrays.equals(this.A, ((q) obj).A)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        yb.j[] jVarArr = new yb.j[size];
        for (int i2 = 0; i2 < size; i2++) {
            jVarArr[i2] = new yb.j(b(i2), d(i2));
        }
        return new z0(jVarArr);
    }

    public final int size() {
        return this.A.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String b10 = b(i2);
            String d4 = d(i2);
            sb2.append(b10);
            sb2.append(": ");
            if (qi.e.l(b10)) {
                d4 = "██";
            }
            sb2.append(d4);
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
