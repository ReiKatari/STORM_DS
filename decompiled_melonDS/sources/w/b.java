package w;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List f13871a;

    /* renamed from: b  reason: collision with root package name */
    public final List f13872b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13873c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13874d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13875e;

    public b(List list, List list2, int i2, int i10, int i11) {
        this.f13871a = list;
        this.f13872b = list2;
        this.f13873c = i2;
        this.f13874d = i10;
        this.f13875e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            List list = bVar.f13871a;
            List list2 = this.f13871a;
            if (list2 != null ? list2.equals(list) : list == null) {
                List list3 = bVar.f13872b;
                List list4 = this.f13872b;
                if (list4 != null ? list4.equals(list3) : list3 == null) {
                    if (this.f13873c == bVar.f13873c && this.f13874d == bVar.f13874d && this.f13875e == bVar.f13875e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i2 = 0;
        List list = this.f13871a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        List list2 = this.f13872b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return ((((((i2 ^ i10) * 1000003) ^ this.f13873c) * 1000003) ^ this.f13874d) * 1000003) ^ this.f13875e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BestSizesAndMaxFpsForConfigs{bestSizes=");
        sb2.append(this.f13871a);
        sb2.append(", bestSizesForStreamUseCase=");
        sb2.append(this.f13872b);
        sb2.append(", maxFpsForBestSizes=");
        sb2.append(this.f13873c);
        sb2.append(", maxFpsForStreamUseCase=");
        sb2.append(this.f13874d);
        sb2.append(", maxFpsForAllSizes=");
        return d.q(sb2, this.f13875e, "}");
    }
}
