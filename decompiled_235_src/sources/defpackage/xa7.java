package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xa7  reason: default package */
/* loaded from: classes.dex */
public final class xa7 {
    public static ya7 a(String str) {
        Object obj;
        Iterator<E> it = ya7.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (nb3.k(((ya7) obj).getPreferenceValue(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ya7 ya7Var = (ya7) obj;
        if (ya7Var == null) {
            return ya7.SMART_BACKGROUND_MATCH;
        }
        return ya7Var;
    }
}
