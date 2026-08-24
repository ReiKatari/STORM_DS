package defpackage;

import android.hardware.camera2.CaptureRequest;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xx  reason: default package */
/* loaded from: classes.dex */
public final class xx {
    public final String a;
    public final Class b;
    public final Object c;

    public xx(String str, Class cls, CaptureRequest.Key key) {
        this.a = str;
        if (cls != null) {
            this.b = cls;
            this.c = key;
            return;
        }
        u34.x("Null valueClass");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof xx) {
                xx xxVar = (xx) obj;
                if (this.a.equals(xxVar.a) && this.b.equals(xxVar.b)) {
                    Object obj2 = xxVar.c;
                    Object obj3 = this.c;
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
        int hashCode2 = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.c;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        return "Option{id=" + this.a + ", valueClass=" + this.b + ", token=" + this.c + "}";
    }
}
