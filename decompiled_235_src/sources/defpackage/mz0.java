package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mz0  reason: default package */
/* loaded from: classes.dex */
public final class mz0 extends oz0 {
    public final ArrayList a;

    public mz0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof mz0) || !this.a.equals(((mz0) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ControllersConnected(assignedInputs=" + this.a + ")";
    }
}
