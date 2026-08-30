package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pw0  reason: default package */
/* loaded from: classes.dex */
public final class pw0 extends rw0 {
    public final ArrayList a;

    public pw0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof pw0) || !this.a.equals(((pw0) obj).a)) {
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
