package j0;

import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7206a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7207b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7208c;

    public g2(HashMap hashMap, HashMap hashMap2, int i2) {
        this.f7206a = hashMap;
        this.f7207b = hashMap2;
        this.f7208c = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g2) {
                g2 g2Var = (g2) obj;
                if (!this.f7206a.equals(g2Var.f7206a) || !this.f7207b.equals(g2Var.f7207b) || this.f7208c != g2Var.f7208c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f7207b.hashCode();
        return Integer.hashCode(this.f7208c) + ((hashCode + (this.f7206a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb2.append(this.f7206a);
        sb2.append(", attachedSurfaceStreamSpecs=");
        sb2.append(this.f7207b);
        sb2.append(", maxSupportedFrameRate=");
        return w.d.p(sb2, this.f7208c, ')');
    }
}
