package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fj6  reason: default package */
/* loaded from: classes.dex */
public final class fj6 {
    public final List a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;

    public fj6(List list, List list2, int i, int i2, int i3) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fj6) {
                fj6 fj6Var = (fj6) obj;
                if (!this.a.equals(fj6Var.a) || !b53.x(this.b, fj6Var.b) || this.c != fj6Var.c || this.d != fj6Var.d || this.e != fj6Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        List list = this.b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return Integer.hashCode(this.e) + wh1.a(this.d, wh1.a(this.c, (hashCode2 + hashCode) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BestSizesAndMaxFpsForConfigs(bestSizes=");
        sb.append(this.a);
        sb.append(", bestSizesForStreamUseCase=");
        sb.append(this.b);
        sb.append(", maxFpsForBestSizes=");
        sb.append(this.c);
        sb.append(", maxFpsForStreamUseCase=");
        sb.append(this.d);
        sb.append(", maxFpsForAllSizes=");
        return ej6.g(sb, this.e, ')');
    }
}
