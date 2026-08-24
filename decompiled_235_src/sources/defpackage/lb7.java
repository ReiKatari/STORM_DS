package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lb7  reason: default package */
/* loaded from: classes.dex */
public final class lb7 {
    public static mb7 a(String str) {
        Object obj;
        Iterator<E> it = mb7.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (nb3.k(((mb7) obj).getPreferenceValue(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        mb7 mb7Var = (mb7) obj;
        if (mb7Var == null) {
            return mb7.ON_DEMAND;
        }
        return mb7Var;
    }
}
