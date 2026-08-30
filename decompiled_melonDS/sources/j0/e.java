package j0;

import android.util.Range;
import android.util.Size;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final f2 f7166a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7167b;

    /* renamed from: c  reason: collision with root package name */
    public final Size f7168c;

    /* renamed from: d  reason: collision with root package name */
    public final d0.a0 f7169d;

    /* renamed from: e  reason: collision with root package name */
    public final List f7170e;

    /* renamed from: f  reason: collision with root package name */
    public final r0 f7171f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7172g;

    /* renamed from: h  reason: collision with root package name */
    public final Range f7173h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f7174i;

    public e(f2 f2Var, int i2, Size size, d0.a0 a0Var, List list, r0 r0Var, int i10, Range range, boolean z10) {
        this.f7166a = f2Var;
        this.f7167b = i2;
        if (size != null) {
            this.f7168c = size;
            if (a0Var != null) {
                this.f7169d = a0Var;
                if (list != null) {
                    this.f7170e = list;
                    this.f7171f = r0Var;
                    this.f7172g = i10;
                    if (range != null) {
                        this.f7173h = range;
                        this.f7174i = z10;
                        return;
                    }
                    m9.o.i("Null targetFrameRate");
                    throw null;
                }
                m9.o.i("Null captureTypes");
                throw null;
            }
            m9.o.i("Null dynamicRange");
            throw null;
        }
        m9.o.i("Null size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f7166a.equals(eVar.f7166a) && this.f7167b == eVar.f7167b && this.f7168c.equals(eVar.f7168c) && this.f7169d.equals(eVar.f7169d) && this.f7170e.equals(eVar.f7170e)) {
                    r0 r0Var = eVar.f7171f;
                    r0 r0Var2 = this.f7171f;
                    if (r0Var2 == null) {
                        if (r0Var != null) {
                            return false;
                        }
                    } else if (!r0Var2.equals(r0Var)) {
                        return false;
                    }
                    if (this.f7172g == eVar.f7172g && this.f7173h.equals(eVar.f7173h) && this.f7174i == eVar.f7174i) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i2;
        int hashCode2 = (((((((((this.f7166a.hashCode() ^ 1000003) * 1000003) ^ this.f7167b) * 1000003) ^ this.f7168c.hashCode()) * 1000003) ^ this.f7169d.hashCode()) * 1000003) ^ this.f7170e.hashCode()) * 1000003;
        r0 r0Var = this.f7171f;
        if (r0Var == null) {
            hashCode = 0;
        } else {
            hashCode = r0Var.hashCode();
        }
        int hashCode3 = (((((hashCode2 ^ hashCode) * 1000003) ^ this.f7172g) * 1000003) ^ this.f7173h.hashCode()) * 1000003;
        if (this.f7174i) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return hashCode3 ^ i2;
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f7166a + ", imageFormat=" + this.f7167b + ", size=" + this.f7168c + ", dynamicRange=" + this.f7169d + ", captureTypes=" + this.f7170e + ", implementationOptions=" + this.f7171f + ", sessionType=" + this.f7172g + ", targetFrameRate=" + this.f7173h + ", strictFrameRateRequired=" + this.f7174i + "}";
    }
}
