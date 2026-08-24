package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gp  reason: default package */
/* loaded from: classes.dex */
public abstract class gp {
    public static final fp a = new fp("");

    public static final List a(fp fpVar, int i, int i2, k4 k4Var) {
        List list;
        boolean z;
        if (i == i2 || (list = fpVar.A) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= fpVar.B.length()) {
            if (k4Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) k4Var.g(((ep) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            ep epVar = (ep) list.get(i3);
            if (k4Var != null) {
                z = ((Boolean) k4Var.g(epVar.a)).booleanValue();
            } else {
                z = true;
            }
            if (z) {
                int i4 = epVar.b;
                int i5 = epVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new ep((bp) epVar.a, gi2.q(epVar.b, i, i2) - i, gi2.q(i5, i, i2) - i, epVar.d));
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
