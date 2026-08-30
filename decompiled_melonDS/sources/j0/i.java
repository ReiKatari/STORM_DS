package j0;

import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final u0 f7213a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7214b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7215c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7216d;

    /* renamed from: e  reason: collision with root package name */
    public final d0.a0 f7217e;

    public i(u0 u0Var, List list, int i2, int i10, d0.a0 a0Var) {
        this.f7213a = u0Var;
        this.f7214b = list;
        this.f7215c = i2;
        this.f7216d = i10;
        this.f7217e = a0Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [a7.v, java.lang.Object] */
    public static a7.v a(u0 u0Var) {
        ?? obj = new Object();
        if (u0Var != null) {
            obj.A = u0Var;
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                obj.B = list;
                obj.L = -1;
                obj.R = -1;
                obj.X = d0.a0.f3320d;
                return obj;
            }
            m9.o.i("Null sharedSurfaces");
            return null;
        }
        m9.o.i("Null surface");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (this.f7213a.equals(iVar.f7213a) && this.f7214b.equals(iVar.f7214b) && this.f7215c == iVar.f7215c && this.f7216d == iVar.f7216d && this.f7217e.equals(iVar.f7217e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((this.f7213a.hashCode() ^ 1000003) * 1000003) ^ this.f7214b.hashCode()) * (-721379959)) ^ this.f7215c) * 1000003) ^ this.f7216d) * 1000003) ^ this.f7217e.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f7213a + ", sharedSurfaces=" + this.f7214b + ", physicalCameraId=null, mirrorMode=" + this.f7215c + ", surfaceGroupId=" + this.f7216d + ", dynamicRange=" + this.f7217e + "}";
    }
}
