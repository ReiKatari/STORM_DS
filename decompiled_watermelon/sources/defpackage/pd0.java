package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pd0  reason: default package */
/* loaded from: classes.dex */
public final class pd0 {
    public final ArrayList a;
    public final cx b;

    public pd0(ArrayList arrayList, cx cxVar) {
        this.a = arrayList;
        this.b = cxVar;
        nl2.y("Camera ID set cannot be empty.", !arrayList.isEmpty());
    }

    public final String a() {
        ArrayList arrayList = this.a;
        boolean z = true;
        if (arrayList.size() != 1) {
            z = false;
        }
        nl2.D("getInternalId() is only available for single-camera identifiers.", z);
        return (String) tq0.K0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pd0) {
                pd0 pd0Var = (pd0) obj;
                if (!this.a.equals(pd0Var.a) || !b53.x(this.b, pd0Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        cx cxVar = this.b;
        if (cxVar != null) {
            i = cxVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraIdentifier{cameraIds=");
        sb.append(tq0.S0(this.a, ",", null, null, null, 62));
        cx cxVar = this.b;
        if (cxVar != null) {
            str = ", compatId=" + cxVar;
        } else {
            str = "";
        }
        return wh1.o(sb, str, '}');
    }
}
