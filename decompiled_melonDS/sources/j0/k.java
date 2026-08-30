package j0;

import android.util.Range;
import android.util.Size;
import q.q3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: h  reason: collision with root package name */
    public static final Range f7234h = new Range(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final Size f7235a;

    /* renamed from: b  reason: collision with root package name */
    public final Size f7236b;

    /* renamed from: c  reason: collision with root package name */
    public final d0.a0 f7237c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7238d;

    /* renamed from: e  reason: collision with root package name */
    public final Range f7239e;

    /* renamed from: f  reason: collision with root package name */
    public final r0 f7240f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7241g;

    public k(Size size, Size size2, d0.a0 a0Var, int i2, Range range, r0 r0Var, boolean z10) {
        this.f7235a = size;
        this.f7236b = size2;
        this.f7237c = a0Var;
        this.f7238d = i2;
        this.f7239e = range;
        this.f7240f = r0Var;
        this.f7241g = z10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q.q3] */
    public static q3 a(Size size) {
        ?? obj = new Object();
        if (size != null) {
            obj.f11994a = size;
            obj.f11995b = size;
            obj.f11997d = 0;
            Range range = f7234h;
            if (range != null) {
                obj.f11998e = range;
                obj.f11996c = d0.a0.f3320d;
                obj.f12000g = Boolean.FALSE;
                return obj;
            }
            m9.o.i("Null expectedFrameRateRange");
            return null;
        }
        m9.o.i("Null resolution");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q.q3] */
    public final q3 b() {
        ?? obj = new Object();
        obj.f11994a = this.f7235a;
        obj.f11995b = this.f7236b;
        obj.f11996c = this.f7237c;
        obj.f11997d = Integer.valueOf(this.f7238d);
        obj.f11998e = this.f7239e;
        obj.f11999f = this.f7240f;
        obj.f12000g = Boolean.valueOf(this.f7241g);
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f7235a.equals(kVar.f7235a) && this.f7236b.equals(kVar.f7236b) && this.f7237c.equals(kVar.f7237c) && this.f7238d == kVar.f7238d && this.f7239e.equals(kVar.f7239e)) {
                r0 r0Var = kVar.f7240f;
                r0 r0Var2 = this.f7240f;
                if (r0Var2 != null ? r0Var2.equals(r0Var) : r0Var == null) {
                    if (this.f7241g == kVar.f7241g) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i2;
        int hashCode2 = (((((((((this.f7235a.hashCode() ^ 1000003) * 1000003) ^ this.f7236b.hashCode()) * 1000003) ^ this.f7237c.hashCode()) * 1000003) ^ this.f7238d) * 1000003) ^ this.f7239e.hashCode()) * 1000003;
        r0 r0Var = this.f7240f;
        if (r0Var == null) {
            hashCode = 0;
        } else {
            hashCode = r0Var.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        if (this.f7241g) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return i10 ^ i2;
    }

    public final String toString() {
        return "StreamSpec{resolution=" + this.f7235a + ", originalConfiguredResolution=" + this.f7236b + ", dynamicRange=" + this.f7237c + ", sessionType=" + this.f7238d + ", expectedFrameRateRange=" + this.f7239e + ", implementationOptions=" + this.f7240f + ", zslDisabled=" + this.f7241g + "}";
    }
}
