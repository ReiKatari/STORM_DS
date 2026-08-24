package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wy  reason: default package */
/* loaded from: classes.dex */
public final class wy {
    public final ig1 a;
    public final List b;
    public final int c;
    public final int d;
    public final yq1 e;

    public wy(ig1 ig1Var, List list, int i, int i2, yq1 yq1Var) {
        this.a = ig1Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = yq1Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [s9, java.lang.Object] */
    public static s9 a(ig1 ig1Var) {
        ?? obj = new Object();
        if (ig1Var != null) {
            obj.a = ig1Var;
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                obj.b = list;
                obj.c = -1;
                obj.d = -1;
                obj.e = yq1.d;
                return obj;
            }
            u34.x("Null sharedSurfaces");
            return null;
        }
        u34.x("Null surface");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof wy) {
                wy wyVar = (wy) obj;
                if (this.a.equals(wyVar.a) && this.b.equals(wyVar.b) && this.c == wyVar.c && this.d == wyVar.d && this.e.equals(wyVar.e)) {
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
