package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sa7  reason: default package */
/* loaded from: classes.dex */
public final class sa7 {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public sa7(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sa7) {
            sa7 sa7Var = (sa7) obj;
            if (this.b == sa7Var.b && this.a.equals(sa7Var.a)) {
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
        StringBuilder r = i61.r("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        r.append(this.b);
        r.append("\n");
        String concat = r.toString().concat("    values:");
        for (String str : this.a.keySet()) {
            concat = concat + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return concat;
    }
}
