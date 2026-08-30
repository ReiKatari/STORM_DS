package j0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: e  reason: collision with root package name */
    public static final z1 f7192e = z1.DEFAULT;

    /* renamed from: f  reason: collision with root package name */
    public static final b2[] f7193f = {b2.S720P_16_9, b2.S1080P_4_3, b2.S1080P_16_9, b2.S1440P_16_9, b2.UHD, b2.X_VGA};

    /* renamed from: g  reason: collision with root package name */
    public static final Object f7194g;

    /* renamed from: h  reason: collision with root package name */
    public static final LinkedHashMap f7195h;

    /* renamed from: a  reason: collision with root package name */
    public final d2 f7196a;

    /* renamed from: b  reason: collision with root package name */
    public final b2 f7197b;

    /* renamed from: c  reason: collision with root package name */
    public final z1 f7198c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7199d;

    static {
        Map F = zb.v.F(new yb.j(d2.YUV, 35), new yb.j(d2.JPEG, 256), new yb.j(d2.JPEG_R, 4101), new yb.j(d2.RAW, 32), new yb.j(d2.PRIV, 34));
        f7194g = F;
        Set<Map.Entry> entrySet = F.entrySet();
        int E = zb.v.E(zb.m.G(entrySet, 10));
        if (E < 16) {
            E = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(E);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (d2) entry.getKey());
        }
        f7195h = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    public f2(d2 d2Var, b2 b2Var, z1 z1Var) {
        int i2;
        d2Var.getClass();
        b2Var.getClass();
        z1Var.getClass();
        this.f7196a = d2Var;
        this.f7197b = b2Var;
        this.f7198c = z1Var;
        Integer num = (Integer) f7194g.get(d2Var);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        this.f7199d = i2;
    }

    public static final f2 a(d2 d2Var, b2 b2Var) {
        d2Var.getClass();
        b2Var.getClass();
        return pc.a.p(d2Var, b2Var, f7192e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        if (this.f7196a == f2Var.f7196a && this.f7197b == f2Var.f7197b && this.f7198c == f2Var.f7198c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f7197b.hashCode();
        return this.f7198c.hashCode() + ((hashCode + (this.f7196a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.f7196a + ", configSize=" + this.f7197b + ", streamUseCase=" + this.f7198c + ')';
    }
}
