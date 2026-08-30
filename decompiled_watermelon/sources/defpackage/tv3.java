package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tv3  reason: default package */
/* loaded from: classes.dex */
public interface tv3 {
    default int a(s43 s43Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ga1((mv3) list.get(i2), t43.Max, x43.Height, 0));
        }
        return f(new g53(s43Var, s43Var.getLayoutDirection()), arrayList, nz0.b(0, i, 0, 0, 13)).a();
    }

    default int b(s43 s43Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ga1((mv3) list.get(i2), t43.Max, x43.Width, 0));
        }
        return f(new g53(s43Var, s43Var.getLayoutDirection()), arrayList, nz0.b(0, 0, 0, i, 7)).c();
    }

    uv3 f(vv3 vv3Var, List list, long j);

    default int g(s43 s43Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ga1((mv3) list.get(i2), t43.Min, x43.Height, 0));
        }
        return f(new g53(s43Var, s43Var.getLayoutDirection()), arrayList, nz0.b(0, i, 0, 0, 13)).a();
    }

    default int i(s43 s43Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ga1((mv3) list.get(i2), t43.Min, x43.Width, 0));
        }
        return f(new g53(s43Var, s43Var.getLayoutDirection()), arrayList, nz0.b(0, 0, 0, i, 7)).c();
    }
}
