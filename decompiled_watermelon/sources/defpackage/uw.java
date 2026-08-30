package defpackage;

import android.hardware.camera2.CaptureRequest;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uw  reason: default package */
/* loaded from: classes.dex */
public final class uw {
    public final String a;
    public final Class b;
    public final Object c;

    public uw(String str, Class cls, CaptureRequest.Key key) {
        this.a = str;
        if (cls != null) {
            this.b = cls;
            this.c = key;
            return;
        }
        c44.i("Null valueClass");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof uw) {
                uw uwVar = (uw) obj;
                if (this.a.equals(uwVar.a) && this.b.equals(uwVar.b)) {
                    Object obj2 = uwVar.c;
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
