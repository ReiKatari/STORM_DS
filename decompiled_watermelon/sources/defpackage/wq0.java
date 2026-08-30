package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wq0  reason: default package */
/* loaded from: classes.dex */
public abstract class wq0 extends vq0 {
    public static void A0(List list, Comparator comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static void z0(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
