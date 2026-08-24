package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ev6  reason: default package */
/* loaded from: classes.dex */
public final class ev6 {
    public final ArrayList a = new ArrayList();

    public static void b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 < i2) {
                    if (i3 == iArr[i4]) {
                        break;
                    }
                    i4++;
                } else {
                    iArr[i2] = i3;
                    b(arrayList, i, iArr, i2 + 1);
                    break;
                }
            }
        }
    }

    public final void a(jv6 jv6Var) {
        this.a.add(jv6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List c(ArrayList arrayList) {
        tr6 tr6Var;
        tr6 tr6Var2;
        boolean z;
        tr6 tr6Var3;
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = this.a;
        if (size == arrayList2.size()) {
            int size2 = arrayList2.size();
            ArrayList arrayList3 = new ArrayList();
            b(arrayList3, size2, new int[size2], 0);
            jv6[] jv6VarArr = new jv6[arrayList.size()];
            int size3 = arrayList3.size();
            int i = 0;
            while (i < size3) {
                Object obj = arrayList3.get(i);
                i++;
                int[] iArr = (int[]) obj;
                boolean z2 = true;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (iArr[i2] < arrayList.size()) {
                        jv6 jv6Var = (jv6) arrayList2.get(i2);
                        jv6 jv6Var2 = (jv6) arrayList.get(iArr[i2]);
                        jv6Var.getClass();
                        jv6Var2.getClass();
                        if (jv6Var2.b.getId() > jv6Var.b.getId() || jv6Var2.a != jv6Var.a || ((tr6Var = jv6Var.c) != (tr6Var2 = tr6.DEFAULT) && (tr6Var3 = jv6Var2.c) != tr6Var2 && tr6Var3 != tr6Var)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 &= z;
                        if (!z2) {
                            break;
                        }
                        jv6VarArr[iArr[i2]] = (jv6) arrayList2.get(i2);
                    }
                }
                if (z2) {
                    return Arrays.asList(jv6VarArr);
                }
            }
            return null;
        }
        return null;
    }
}
