package c1;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: b  reason: collision with root package name */
    public static final d1 f2401b = new d1(new s2((e1) null, (p2) null, (k0) null, (e0) null, (LinkedHashMap) null, 127));

    /* renamed from: c  reason: collision with root package name */
    public static final d1 f2402c = new d1(new s2((e1) null, (p2) null, (k0) null, (e0) null, (LinkedHashMap) null, 95));

    /* renamed from: a  reason: collision with root package name */
    public final s2 f2403a;

    public d1(s2 s2Var) {
        this.f2403a = s2Var;
    }

    public final d1 a(d1 d1Var) {
        boolean z10;
        s2 s2Var = d1Var.f2403a;
        e1 e1Var = s2Var.f2521a;
        s2 s2Var2 = this.f2403a;
        if (e1Var == null) {
            e1Var = s2Var2.f2521a;
        }
        p2 p2Var = s2Var.f2522b;
        if (p2Var == null) {
            p2Var = s2Var2.f2522b;
        }
        k0 k0Var = s2Var.f2523c;
        if (k0Var == null) {
            k0Var = s2Var2.f2523c;
        }
        if (!s2Var.f2524d && !s2Var2.f2524d) {
            z10 = false;
        } else {
            z10 = true;
        }
        Map map = s2Var2.f2525e;
        Map map2 = s2Var.f2525e;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new d1(new s2(e1Var, p2Var, k0Var, (e0) null, z10, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d1) && ((d1) obj).f2403a.equals(this.f2403a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2403a.hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (equals(f2401b)) {
            return "ExitTransition.None";
        }
        if (equals(f2402c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        s2 s2Var = this.f2403a;
        e1 e1Var = s2Var.f2521a;
        if (e1Var != null) {
            str = e1Var.toString();
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(",\nSlide - ");
        p2 p2Var = s2Var.f2522b;
        if (p2Var != null) {
            str2 = p2Var.toString();
        } else {
            str2 = null;
        }
        sb2.append(str2);
        sb2.append(",\nShrink - ");
        k0 k0Var = s2Var.f2523c;
        if (k0Var != null) {
            str3 = k0Var.toString();
        } else {
            str3 = null;
        }
        sb2.append(str3);
        sb2.append(",\nScale - ");
        sb2.append((String) null);
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(s2Var.f2524d);
        return sb2.toString();
    }
}
