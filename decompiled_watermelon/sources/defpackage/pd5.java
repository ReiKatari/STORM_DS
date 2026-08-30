package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pd5  reason: default package */
/* loaded from: classes.dex */
public final class pd5 {
    public static qd5 a(String str) {
        Object obj;
        Iterator<E> it = qd5.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (b53.x(((qd5) obj).getPreferenceValue(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        qd5 qd5Var = (qd5) obj;
        if (qd5Var == null) {
            return qd5.BUILT_IN;
        }
        return qd5Var;
    }
}
