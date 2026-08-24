package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jt0  reason: default package */
/* loaded from: classes.dex */
public abstract class jt0 extends it0 {
    public static void w0(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void x0(List list, Comparator comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
