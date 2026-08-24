package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yf0  reason: default package */
/* loaded from: classes.dex */
public final class yf0 {
    public final ArrayList a;
    public final ky b;

    public yf0(ArrayList arrayList, ky kyVar) {
        this.a = arrayList;
        this.b = kyVar;
        np2.s("Camera ID set cannot be empty.", !arrayList.isEmpty());
    }

    public final String a() {
        ArrayList arrayList = this.a;
        boolean z = true;
        if (arrayList.size() != 1) {
            z = false;
        }
        np2.A("getInternalId() is only available for single-camera identifiers.", z);
        return (String) gt0.H0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yf0) {
                yf0 yf0Var = (yf0) obj;
                if (!this.a.equals(yf0Var.a) || !nb3.k(this.b, yf0Var.b)) {
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
        ky kyVar = this.b;
        if (kyVar != null) {
            i = kyVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraIdentifier{cameraIds=");
        sb.append(gt0.P0(this.a, ",", null, null, null, 62));
        ky kyVar = this.b;
        if (kyVar != null) {
            str = ", compatId=" + kyVar;
        } else {
            str = "";
        }
        return lb1.q(sb, str, '}');
    }
}
