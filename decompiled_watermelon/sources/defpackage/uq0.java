package defpackage;

import java.util.Collection;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uq0  reason: default package */
/* loaded from: classes.dex */
public abstract class uq0 extends l07 {
    public static int y0(Iterable iterable, int i) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }
}
