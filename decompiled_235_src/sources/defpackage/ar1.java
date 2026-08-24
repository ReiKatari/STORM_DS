package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar1  reason: default package */
/* loaded from: classes.dex */
public final class ar1 extends qu2 {
    public static final /* synthetic */ int c = 0;
    public final yq1 a = yq1.e;
    public final da2 b = da2.DYNAMIC_RANGE;

    @Override // defpackage.qu2
    public final da2 a() {
        return this.b;
    }

    @Override // defpackage.qu2
    public final boolean b(cg0 cg0Var, qi1 qi1Var) {
        Set a = cg0Var.a();
        a.getClass();
        kj2.t("DynamicRangeFeature", "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + a + ", this = " + this);
        yq1 yq1Var = this.a;
        if (a.contains(yq1Var)) {
            for (di7 di7Var : (List) qi1Var.g) {
                Set k = di7Var.k(cg0Var);
                kj2.t("DynamicRangeFeature", "isSupportedIndividually: useCaseSupportedDynamicRanges = " + k + ", this = " + this + ", useCases = " + di7Var);
                if (k != null && !k.contains(yq1Var)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.a + ')';
    }
}
