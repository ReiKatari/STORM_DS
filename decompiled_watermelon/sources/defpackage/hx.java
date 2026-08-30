package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hx  reason: default package */
/* loaded from: classes.dex */
public final class hx {
    public final hc1 a;
    public final List b;
    public final int c;
    public final int d;
    public final sm1 e;

    public hx(hc1 hc1Var, List list, int i, int i2, sm1 sm1Var) {
        this.a = hc1Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = sm1Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [r9, java.lang.Object] */
    public static r9 a(hc1 hc1Var) {
        ?? obj = new Object();
        if (hc1Var != null) {
            obj.a = hc1Var;
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                obj.b = list;
                obj.c = -1;
                obj.d = -1;
                obj.e = sm1.d;
                return obj;
            }
            c44.i("Null sharedSurfaces");
            return null;
        }
        c44.i("Null surface");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof hx) {
                hx hxVar = (hx) obj;
                if (this.a.equals(hxVar.a) && this.b.equals(hxVar.b) && this.c == hxVar.c && this.d == hxVar.d && this.e.equals(hxVar.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=null, mirrorMode=" + this.c + ", surfaceGroupId=" + this.d + ", dynamicRange=" + this.e + "}";
    }
}
