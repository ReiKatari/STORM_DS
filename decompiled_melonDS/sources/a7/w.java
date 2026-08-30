package a7;

import android.os.Bundle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w implements Comparable {
    public final x A;
    public final Bundle B;
    public final boolean L;
    public final int R;
    public final boolean X;

    public w(x xVar, Bundle bundle, boolean z10, int i2, boolean z11) {
        this.A = xVar;
        this.B = bundle;
        this.L = z10;
        this.R = i2;
        this.X = z11;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(w wVar) {
        wVar.getClass();
        boolean z10 = wVar.X;
        boolean z11 = wVar.L;
        Bundle bundle = wVar.B;
        boolean z12 = this.L;
        if (!z12 || z11) {
            if (z12 || !z11) {
                int i2 = this.R - wVar.R;
                if (i2 <= 0) {
                    if (i2 >= 0) {
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
                                boolean z13 = this.X;
                                if (z13 && !z10) {
                                    return 1;
                                }
                                if (!z13 && z10) {
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
