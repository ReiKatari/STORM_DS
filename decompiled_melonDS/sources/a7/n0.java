package a7;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f607b = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f608a = new LinkedHashMap();

    public final void a(m0 m0Var) {
        m0Var.getClass();
        String y10 = pc.a.y(m0Var.getClass());
        if (y10.length() > 0) {
            LinkedHashMap linkedHashMap = this.f608a;
            m0 m0Var2 = (m0) linkedHashMap.get(y10);
            if (nc.k.a(m0Var2, m0Var)) {
                return;
            }
            if (m0Var2 != null && m0Var2.f604b) {
                a0.j.j("Navigator ", m0Var, " is replacing an already attached ", m0Var2);
                return;
            } else if (!m0Var.f604b) {
                m0 m0Var3 = (m0) linkedHashMap.put(y10, m0Var);
                return;
            } else {
                fj.j.f(m0Var, " is already attached to another NavController", "Navigator ");
                return;
            }
        }
        a0.j.h("navigator name cannot be an empty string");
    }

    public final m0 b(String str) {
        str.getClass();
        if (str.length() > 0) {
            m0 m0Var = (m0) this.f608a.get(str);
            if (m0Var != null) {
                return m0Var;
            }
            a0.j.p(kc.a.g("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
            return null;
        }
        a0.j.h("navigator name cannot be an empty string");
        return null;
    }
}
