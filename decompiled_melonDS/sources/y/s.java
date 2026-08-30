package y;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w.g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final r f14656a;

    public s(int i2, ArrayList arrayList, l0.h hVar, g0 g0Var) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f14656a = new q(i2, arrayList, hVar, g0Var);
        } else {
            this.f14656a = new p(i2, arrayList, hVar, g0Var);
        }
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((h) it.next()).f14638a.c());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f14656a.equals(((s) obj).f14656a);
    }

    public final int hashCode() {
        return this.f14656a.hashCode();
    }
}
