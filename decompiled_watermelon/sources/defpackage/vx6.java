package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vx6  reason: default package */
/* loaded from: classes.dex */
public final class vx6 {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public vx6(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vx6) {
            vx6 vx6Var = (vx6) obj;
            if (this.b == vx6Var.b && this.a.equals(vx6Var.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        HashMap hashMap;
        StringBuilder t = b31.t("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        t.append(this.b);
        t.append("\n");
        String concat = t.toString().concat("    values:");
        for (String str : this.a.keySet()) {
            concat = concat + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return concat;
    }
}
