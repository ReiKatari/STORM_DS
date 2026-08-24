package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hc5  reason: default package */
/* loaded from: classes.dex */
public final class hc5 {
    public static ic5 a(int i) {
        Object obj;
        Iterator<E> it = ic5.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ic5) obj).getWireValue() == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (ic5) obj;
    }
}
