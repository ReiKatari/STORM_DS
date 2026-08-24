package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e34  reason: default package */
/* loaded from: classes.dex */
public interface e34 {
    default int a(eb3 eb3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ce1((x24) list.get(i2), fb3.Max, jb3.Width, 0));
        }
        return d(new sb3(eb3Var, eb3Var.getLayoutDirection()), arrayList, s21.b(0, 0, 0, i, 7)).getWidth();
    }

    f34 d(g34 g34Var, List list, long j);

    default int e(eb3 eb3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ce1((x24) list.get(i2), fb3.Min, jb3.Width, 0));
        }
        return d(new sb3(eb3Var, eb3Var.getLayoutDirection()), arrayList, s21.b(0, 0, 0, i, 7)).getWidth();
    }

    default int g(eb3 eb3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ce1((x24) list.get(i2), fb3.Max, jb3.Height, 0));
        }
        return d(new sb3(eb3Var, eb3Var.getLayoutDirection()), arrayList, s21.b(0, i, 0, 0, 13)).getHeight();
    }

    default int i(eb3 eb3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ce1((x24) list.get(i2), fb3.Min, jb3.Height, 0));
        }
        return d(new sb3(eb3Var, eb3Var.getLayoutDirection()), arrayList, s21.b(0, i, 0, 0, 13)).getHeight();
    }
}
