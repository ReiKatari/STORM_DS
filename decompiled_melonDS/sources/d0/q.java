package d0;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3439a;

    /* renamed from: b  reason: collision with root package name */
    public final j0.h f3440b;

    public q(ArrayList arrayList, j0.h hVar) {
        this.f3439a = arrayList;
        this.f3440b = hVar;
        p7.m.g("Camera ID set cannot be empty.", !arrayList.isEmpty());
    }

    public final String a() {
        ArrayList arrayList = this.f3439a;
        boolean z10 = true;
        if (arrayList.size() != 1) {
            z10 = false;
        }
        p7.m.o("getInternalId() is only available for single-camera identifiers.", z10);
        return (String) zb.l.R(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (!this.f3439a.equals(qVar.f3439a) || !nc.k.a(this.f3440b, qVar.f3440b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.f3439a.hashCode() * 31;
        j0.h hVar = this.f3440b;
        if (hVar != null) {
            i2 = hVar.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode + i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("CameraIdentifier{cameraIds=");
        sb2.append(zb.l.Y(this.f3439a, ",", null, null, null, 62));
        j0.h hVar = this.f3440b;
        if (hVar != null) {
            str = ", compatId=" + hVar;
        } else {
            str = "";
        }
        return w.d.r(sb2, str, '}');
    }
}
