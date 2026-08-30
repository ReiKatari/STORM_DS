package g0;

import aj.g;
import d0.a0;
import d0.b1;
import d0.v1;
import j0.b0;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends e0.b {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f5000c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final a0 f5001a = a0.f3321e;

    /* renamed from: b  reason: collision with root package name */
    public final b f5002b = b.DYNAMIC_RANGE;

    @Override // e0.b
    public final b a() {
        return this.f5002b;
    }

    @Override // e0.b
    public final boolean b(b1 b1Var, b0 b0Var) {
        Set a10 = b0Var.a();
        a10.getClass();
        g.o("DynamicRangeFeature", "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + a10 + ", this = " + this);
        a0 a0Var = this.f5001a;
        if (a10.contains(a0Var)) {
            for (v1 v1Var : (List) b1Var.f3334d) {
                Set j2 = v1Var.j(b0Var);
                g.o("DynamicRangeFeature", "isSupportedIndividually: useCaseSupportedDynamicRanges = " + j2 + ", this = " + this + ", useCases = " + v1Var);
                if (j2 != null && !j2.contains(a0Var)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.f5001a + ')';
    }
}
