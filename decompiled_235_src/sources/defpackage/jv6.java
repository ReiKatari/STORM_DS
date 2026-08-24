package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jv6  reason: default package */
/* loaded from: classes.dex */
public final class jv6 {
    public static final tr6 e = tr6.DEFAULT;
    public static final fv6[] f = {fv6.S720P_16_9, fv6.S1080P_4_3, fv6.S1080P_16_9, fv6.S1440P_16_9, fv6.UHD, fv6.X_VGA};
    public static final Map g;
    public static final LinkedHashMap h;
    public final hv6 a;
    public final fv6 b;
    public final tr6 c;
    public final int d;

    static {
        Map m0 = c14.m0(new vr4(hv6.YUV, 35), new vr4(hv6.JPEG, 256), new vr4(hv6.JPEG_R, 4101), new vr4(hv6.RAW, 32), new vr4(hv6.PRIV, 34));
        g = m0;
        Set<Map.Entry> entrySet = m0.entrySet();
        int k0 = c14.k0(ht0.v0(entrySet, 10));
        if (k0 < 16) {
            k0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k0);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (hv6) entry.getKey());
        }
        h = linkedHashMap;
    }

    public jv6(hv6 hv6Var, fv6 fv6Var, tr6 tr6Var) {
        int i;
        hv6Var.getClass();
        fv6Var.getClass();
        tr6Var.getClass();
        this.a = hv6Var;
        this.b = fv6Var;
        this.c = tr6Var;
        Integer num = (Integer) g.get(hv6Var);
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
        if (!(obj instanceof jv6)) {
            return false;
        }
        jv6 jv6Var = (jv6) obj;
        if (this.a == jv6Var.a && this.b == jv6Var.b && this.c == jv6Var.c) {
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
