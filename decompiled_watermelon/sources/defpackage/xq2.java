package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xq2  reason: default package */
/* loaded from: classes.dex */
public final class xq2 implements Iterable, f93 {
    public static final xq2 B = new xq2(new String[0]);
    public final String[] A;

    public xq2(String[] strArr) {
        strArr.getClass();
        this.A = strArr;
    }

    public final String b(String str) {
        String[] strArr = this.A;
        strArr.getClass();
        int length = strArr.length - 2;
        int E = cg2.E(length, 0, -2);
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

    public final String c(int i) {
        String str = (String) nu.v0(i * 2, this.A);
        if (str != null) {
            return str;
        }
        f81.q(ej6.e("name[", i, ']'));
        return null;
    }

    public final vq2 d() {
        vq2 vq2Var = new vq2(0, (byte) 0);
        ArrayList arrayList = vq2Var.b;
        arrayList.getClass();
        String[] strArr = this.A;
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList.addAll(asList);
        return vq2Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xq2) {
            if (Arrays.equals(this.A, ((xq2) obj).A)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A);
    }

    public final String i(int i) {
        String str = (String) nu.v0((i * 2) + 1, this.A);
        if (str != null) {
            return str;
        }
        f81.q(ej6.e("value[", i, ']'));
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        ti4[] ti4VarArr = new ti4[size];
        for (int i = 0; i < size; i++) {
            ti4VarArr[i] = new ti4(c(i), i(i));
        }
        return new v0(ti4VarArr);
    }

    public final List j(String str) {
        str.getClass();
        int size = size();
        List list = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(c(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(i(i));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            list.getClass();
        }
        if (list == null) {
            return pp1.A;
        }
        return list;
    }

    public final int size() {
        return this.A.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String c = c(i);
            String i2 = i(i);
            sb.append(c);
            sb.append(": ");
            if (gk7.l(c)) {
                i2 = "██";
            }
            sb.append(i2);
            sb.append("\n");
        }
        return sb.toString();
    }
}
