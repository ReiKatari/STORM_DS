package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ro0  reason: default package */
/* loaded from: classes.dex */
public final class ro0 {
    public final String a;
    public List b = pp1.A;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public ro0(String str) {
        this.a = str;
    }

    public static void a(ro0 ro0Var, String str, h06 h06Var) {
        ro0Var.getClass();
        h06Var.getClass();
        if (ro0Var.d.add(str)) {
            ro0Var.c.add(str);
            ro0Var.e.add(h06Var);
            ro0Var.f.add(pp1.A);
            ro0Var.g.add(false);
            return;
        }
        StringBuilder u = b31.u("Element with name '", str, "' is already registered in ");
        u.append(ro0Var.a);
        throw new IllegalArgumentException(u.toString().toString());
    }
}
