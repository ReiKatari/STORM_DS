package defpackage;

import android.os.Bundle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hc4  reason: default package */
/* loaded from: classes.dex */
public final class hc4 implements Comparable {
    public final ic4 A;
    public final Bundle B;
    public final boolean L;
    public final int R;
    public final boolean X;

    public hc4(ic4 ic4Var, Bundle bundle, boolean z, int i, boolean z2) {
        this.A = ic4Var;
        this.B = bundle;
        this.L = z;
        this.R = i;
        this.X = z2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(hc4 hc4Var) {
        hc4Var.getClass();
        boolean z = hc4Var.X;
        boolean z2 = hc4Var.L;
        Bundle bundle = hc4Var.B;
        boolean z3 = this.L;
        if (!z3 || z2) {
            if (z3 || !z2) {
                int i = this.R - hc4Var.R;
                if (i <= 0) {
                    if (i >= 0) {
                        Bundle bundle2 = this.B;
                        if (bundle2 == null || bundle != null) {
                            if (bundle2 != null || bundle == null) {
                                if (bundle2 != null) {
                                    int size = bundle2.size();
                                    bundle.getClass();
                                    int size2 = size - bundle.size();
                                    if (size2 <= 0) {
                                        if (size2 < 0) {
                                            return -1;
                                        }
                                    } else {
                                        return 1;
                                    }
                                }
                                boolean z4 = this.X;
                                if (z4 && !z) {
                                    return 1;
                                }
                                if (!z4 && z) {
                                    return -1;
                                }
                                return 0;
                            }
                            return -1;
                        }
                        return 1;
                    }
                    return -1;
                }
                return 1;
            }
            return -1;
        }
        return 1;
    }
}
