package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: va7  reason: default package */
/* loaded from: classes.dex */
public final class va7 {
    public static wa7 a(String str) {
        Object obj;
        Iterator<E> it = wa7.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (nb3.k(((wa7) obj).getPreferenceValue(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        wa7 wa7Var = (wa7) obj;
        if (wa7Var == null) {
            return wa7.GOOGLE;
        }
        return wa7Var;
    }
}
