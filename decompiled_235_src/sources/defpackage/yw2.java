package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yw2  reason: default package */
/* loaded from: classes.dex */
public final class yw2 implements Iterable, zf3 {
    public static final yw2 B = new yw2(new String[0]);
    public final String[] A;

    public yw2(String[] strArr) {
        strArr.getClass();
        this.A = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.A;
        strArr.getClass();
        int length = strArr.length - 2;
        int s = nj2.s(length, 0, -2);
        if (s <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != s) {
                    length -= 2;
                } else {
                    return null;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i) {
        String str = (String) fv.J0(i * 2, this.A);
        if (str != null) {
            return str;
        }
        e41.q(xg6.o("name[", i, ']'));
        return null;
    }

    public final ww2 c() {
        ww2 ww2Var = new ww2(0, (byte) 0);
        ArrayList arrayList = ww2Var.b;
        arrayList.getClass();
        String[] strArr = this.A;
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList.addAll(asList);
        return ww2Var;
    }

    public final String d(int i) {
        String str = (String) fv.J0((i * 2) + 1, this.A);
        if (str != null) {
            return str;
        }
        e41.q(xg6.o("value[", i, ']'));
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yw2) {
            if (Arrays.equals(this.A, ((yw2) obj).A)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List f(String str) {
        str.getClass();
        int size = size();
        List list = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(d(i));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            list.getClass();
        }
        if (list == null) {
            return yt1.A;
        }
        return list;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        vr4[] vr4VarArr = new vr4[size];
        for (int i = 0; i < size; i++) {
            vr4VarArr[i] = new vr4(b(i), d(i));
        }
        return new w0(vr4VarArr);
    }

    public final int size() {
        return this.A.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b = b(i);
            String d = d(i);
            sb.append(b);
            sb.append(": ");
            if (yy7.m(b)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
