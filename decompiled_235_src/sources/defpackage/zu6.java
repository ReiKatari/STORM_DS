package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zu6  reason: default package */
/* loaded from: classes.dex */
public final class zu6 {
    public final List a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;

    public zu6(List list, List list2, int i, int i2, int i3) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zu6) {
                zu6 zu6Var = (zu6) obj;
                if (!this.a.equals(zu6Var.a) || !nb3.k(this.b, zu6Var.b) || this.c != zu6Var.c || this.d != zu6Var.d || this.e != zu6Var.e) {
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
        return Integer.hashCode(this.e) + lb1.a(this.d, lb1.a(this.c, (hashCode2 + hashCode) * 31, 31), 31);
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
        return xg6.q(sb, this.e, ')');
    }
}
