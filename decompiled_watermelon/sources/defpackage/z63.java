package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z63  reason: default package */
/* loaded from: classes.dex */
public final class z63 extends l73 implements Iterable {
    public final ArrayList A = new ArrayList();

    @Override // defpackage.l73
    public final int b() {
        return i().b();
    }

    @Override // defpackage.l73
    public final String d() {
        return i().d();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof z63) || !((z63) obj).A.equals(this.A)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final l73 i() {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        if (size == 1) {
            return (l73) arrayList.get(0);
        }
        i.n(wh1.g(size, "Array must have size 1, but has size "));
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.A.iterator();
    }
}
