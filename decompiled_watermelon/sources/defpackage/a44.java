package defpackage;

import android.os.Bundle;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a44  reason: default package */
/* loaded from: classes.dex */
public final class a44 implements Comparable {
    public final b44 A;
    public final Bundle B;
    public final boolean L;
    public final int R;
    public final boolean X;

    public a44(b44 b44Var, Bundle bundle, boolean z, int i, boolean z2) {
        this.A = b44Var;
        this.B = bundle;
        this.L = z;
        this.R = i;
        this.X = z2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(a44 a44Var) {
        a44Var.getClass();
        boolean z = a44Var.X;
        boolean z2 = a44Var.L;
        Bundle bundle = a44Var.B;
        boolean z3 = this.L;
        if (!z3 || z2) {
            if (z3 || !z2) {
                int i = this.R - a44Var.R;
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
