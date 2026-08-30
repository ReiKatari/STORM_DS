package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uo  reason: default package */
/* loaded from: classes.dex */
public abstract class uo {
    public static final to a = new to("");

    public static final List a(to toVar, int i, int i2, k4 k4Var) {
        List list;
        boolean z;
        if (i == i2 || (list = toVar.A) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= toVar.B.length()) {
            if (k4Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) k4Var.n(((so) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            so soVar = (so) list.get(i3);
            if (k4Var != null) {
                z = ((Boolean) k4Var.n(soVar.a)).booleanValue();
            } else {
                z = true;
            }
            if (z) {
                int i4 = soVar.b;
                int i5 = soVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new so(io2.m(soVar.b, i, i2) - i, io2.m(i5, i, i2) - i, (po) soVar.a, soVar.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (i == i2) {
            z = true;
        } else {
            z = false;
        }
        if (i3 == i4) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = z | z2;
        if (i == i3) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z7 = z6 & z3;
        if (i < i4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i3 < i2) {
            z5 = true;
        }
        return (z4 & z5) | z7;
    }
}
