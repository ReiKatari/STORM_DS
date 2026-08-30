package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y86  reason: default package */
/* loaded from: classes.dex */
public abstract class y86 {
    public static final int a(ArrayList arrayList, int i, int i2) {
        int e = e(arrayList, i, i2);
        if (e >= 0) {
            return e;
        }
        return -(e + 1);
    }

    public static final int b(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void c(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final w86 d(w86 w86Var) {
        if (!(w86Var instanceof w86)) {
            w86Var = null;
        }
        if (w86Var != null) {
            return w86Var;
        }
        xu0.b("Inconsistent composition");
        f81.c();
        return null;
    }

    public static final int e(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((mk2) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int E = b53.E(i5, i);
            if (E < 0) {
                i3 = i4 + 1;
            } else if (E > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
