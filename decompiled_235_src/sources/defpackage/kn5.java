package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kn5  reason: default package */
/* loaded from: classes.dex */
public final class kn5 {
    public static ln5 a(String str) {
        Object obj;
        Iterator<E> it = ln5.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (nb3.k(((ln5) obj).getPreferenceValue(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ln5 ln5Var = (ln5) obj;
        if (ln5Var == null) {
            return ln5.BUILT_IN;
        }
        return ln5Var;
    }
}
