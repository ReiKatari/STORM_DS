package w;

import android.util.Range;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f13902a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13903b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13904c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13905d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13906e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13907f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13908g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13909h;

    /* renamed from: i  reason: collision with root package name */
    public final Range f13910i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f13911j;

    public c(int i2, boolean z10, int i10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range range, boolean z16) {
        this.f13902a = i2;
        this.f13903b = z10;
        this.f13904c = i10;
        this.f13905d = z11;
        this.f13906e = z12;
        this.f13907f = z13;
        this.f13908g = z14;
        this.f13909h = z15;
        if (range != null) {
            this.f13910i = range;
            this.f13911j = z16;
            return;
        }
        m9.o.i("Null getTargetFpsRange");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f13902a == cVar.f13902a && this.f13903b == cVar.f13903b && this.f13904c == cVar.f13904c && this.f13905d == cVar.f13905d && this.f13906e == cVar.f13906e && this.f13907f == cVar.f13907f && this.f13908g == cVar.f13908g && this.f13909h == cVar.f13909h && this.f13910i.equals(cVar.f13910i) && this.f13911j == cVar.f13911j) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = (this.f13902a ^ 1000003) * 1000003;
        int i16 = 1237;
        if (this.f13903b) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i17 = (((i15 ^ i2) * 1000003) ^ this.f13904c) * 1000003;
        if (this.f13905d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i18 = (i17 ^ i10) * 1000003;
        if (this.f13906e) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i19 = (i18 ^ i11) * 1000003;
        if (this.f13907f) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i20 = (i19 ^ i12) * 1000003;
        if (this.f13908g) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int i21 = (i20 ^ i13) * 1000003;
        if (this.f13909h) {
            i14 = 1231;
        } else {
            i14 = 1237;
        }
        int hashCode = (((i21 ^ i14) * 1000003) ^ this.f13910i.hashCode()) * 1000003;
        if (this.f13911j) {
            i16 = 1231;
        }
        return hashCode ^ i16;
    }

    public final String toString() {
        return "FeatureSettings{getCameraMode=" + this.f13902a + ", hasVideoCapture=" + this.f13903b + ", getRequiredMaxBitDepth=" + this.f13904c + ", isPreviewStabilizationOn=" + this.f13905d + ", isUltraHdrOn=" + this.f13906e + ", isHighSpeedOn=" + this.f13907f + ", isFeatureComboInvocation=" + this.f13908g + ", requiresFeatureComboQuery=" + this.f13909h + ", getTargetFpsRange=" + this.f13910i + ", isStrictFpsRequired=" + this.f13911j + "}";
    }
}
