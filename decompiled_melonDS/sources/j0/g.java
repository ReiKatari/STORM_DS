package j0;

import android.hardware.camera2.CaptureRequest;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f7200a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f7201b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7202c;

    public g(String str, Class cls, CaptureRequest.Key key) {
        this.f7200a = str;
        if (cls != null) {
            this.f7201b = cls;
            this.f7202c = key;
            return;
        }
        m9.o.i("Null valueClass");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.f7200a.equals(gVar.f7200a) && this.f7201b.equals(gVar.f7201b)) {
                    Object obj2 = gVar.f7202c;
                    Object obj3 = this.f7202c;
                    if (obj3 == null) {
                        if (obj2 == null) {
                            return true;
                        }
                        return false;
                    } else if (obj3.equals(obj2)) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f7200a.hashCode() ^ 1000003) * 1000003) ^ this.f7201b.hashCode()) * 1000003;
        Object obj = this.f7202c;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "Option{id=" + this.f7200a + ", valueClass=" + this.f7201b + ", token=" + this.f7202c + "}";
    }
}
