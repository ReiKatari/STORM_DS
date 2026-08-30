package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: um1  reason: default package */
/* loaded from: classes.dex */
public final class um1 extends no2 {
    public static final /* synthetic */ int c = 0;
    public final sm1 a = sm1.e;
    public final k52 b = k52.DYNAMIC_RANGE;

    @Override // defpackage.no2
    public final k52 a() {
        return this.b;
    }

    @Override // defpackage.no2
    public final boolean b(td0 td0Var, me1 me1Var) {
        Set a = td0Var.a();
        a.getClass();
        ve2.v("DynamicRangeFeature", "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + a + ", this = " + this);
        sm1 sm1Var = this.a;
        if (a.contains(sm1Var)) {
            for (f47 f47Var : (List) me1Var.g) {
                Set k = f47Var.k(td0Var);
                ve2.v("DynamicRangeFeature", "isSupportedIndividually: useCaseSupportedDynamicRanges = " + k + ", this = " + this + ", useCases = " + f47Var);
                if (k != null && !k.contains(sm1Var)) {
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
