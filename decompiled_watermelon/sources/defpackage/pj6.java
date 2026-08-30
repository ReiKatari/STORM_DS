package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pj6  reason: default package */
/* loaded from: classes.dex */
public final class pj6 {
    public static final cg6 e = cg6.DEFAULT;
    public static final lj6[] f = {lj6.S720P_16_9, lj6.S1080P_4_3, lj6.S1080P_16_9, lj6.S1440P_16_9, lj6.UHD, lj6.X_VGA};
    public static final Map g;
    public static final LinkedHashMap h;
    public final nj6 a;
    public final lj6 b;
    public final cg6 c;
    public final int d;

    static {
        Map l0 = zt3.l0(new ti4(nj6.YUV, 35), new ti4(nj6.JPEG, 256), new ti4(nj6.JPEG_R, 4101), new ti4(nj6.RAW, 32), new ti4(nj6.PRIV, 34));
        g = l0;
        Set<Map.Entry> entrySet = l0.entrySet();
        int j0 = zt3.j0(uq0.y0(entrySet, 10));
        if (j0 < 16) {
            j0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (nj6) entry.getKey());
        }
        h = linkedHashMap;
    }

    public pj6(nj6 nj6Var, lj6 lj6Var, cg6 cg6Var) {
        int i;
        nj6Var.getClass();
        lj6Var.getClass();
        cg6Var.getClass();
        this.a = nj6Var;
        this.b = lj6Var;
        this.c = cg6Var;
        Integer num = (Integer) g.get(nj6Var);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj6)) {
            return false;
        }
        pj6 pj6Var = (pj6) obj;
        if (this.a == pj6Var.a && this.b == pj6Var.b && this.c == pj6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.a + ", configSize=" + this.b + ", streamUseCase=" + this.c + ')';
    }
}
