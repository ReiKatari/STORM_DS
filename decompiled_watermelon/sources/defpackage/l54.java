package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l54  reason: default package */
/* loaded from: classes.dex */
public final class l54 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(k54 k54Var) {
        k54Var.getClass();
        String x = hi2.x(k54Var.getClass());
        if (x.length() > 0) {
            LinkedHashMap linkedHashMap = this.a;
            k54 k54Var2 = (k54) linkedHashMap.get(x);
            if (b53.x(k54Var2, k54Var)) {
                return;
            }
            if (k54Var2 != null && k54Var2.b) {
                c44.k("Navigator ", k54Var, " is replacing an already attached ", k54Var2);
                return;
            } else if (!k54Var.b) {
                k54 k54Var3 = (k54) linkedHashMap.put(x, k54Var);
                return;
            } else {
                i.m(k54Var, " is already attached to another NavController", "Navigator ");
                return;
            }
        }
        i.i("navigator name cannot be an empty string");
    }

    public final k54 b(String str) {
        str.getClass();
        if (str.length() > 0) {
            k54 k54Var = (k54) this.a.get(str);
            if (k54Var != null) {
                return k54Var;
            }
            i.n(wh1.A("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
            return null;
        }
        i.i("navigator name cannot be an empty string");
        return null;
    }
}
