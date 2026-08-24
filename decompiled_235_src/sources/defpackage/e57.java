package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e57  reason: default package */
/* loaded from: classes.dex */
public final class e57 {
    public static g57 a(String str) {
        Object obj;
        Iterator<E> it = g57.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (nb3.k(((g57) obj).getPreferenceValue(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        g57 g57Var = (g57) obj;
        if (g57Var == null) {
            return g57.DARK;
        }
        return g57Var;
    }
}
