package c8;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: b  reason: collision with root package name */
    public final View f2621b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2620a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2622c = new ArrayList();

    public b0(View view) {
        this.f2621b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f2621b == b0Var.f2621b && this.f2620a.equals(b0Var.f2620a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2620a.hashCode() + (this.f2621b.hashCode() * 31);
    }

    public final String toString() {
        HashMap hashMap;
        String concat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2621b + "\n").concat("    values:");
        for (String str : this.f2620a.keySet()) {
            concat = concat + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return concat;
    }
}
