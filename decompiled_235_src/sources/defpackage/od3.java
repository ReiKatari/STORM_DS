package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od3  reason: default package */
/* loaded from: classes.dex */
public final class od3 extends ee3 implements Iterable {
    public final ArrayList A = new ArrayList();

    @Override // defpackage.ee3
    public final int a() {
        return d().a();
    }

    @Override // defpackage.ee3
    public final String c() {
        return d().c();
    }

    public final ee3 d() {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        if (size == 1) {
            return (ee3) arrayList.get(0);
        }
        i.m(lb1.g(size, "Array must have size 1, but has size "));
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof od3) || !((od3) obj).A.equals(this.A)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.A.iterator();
    }
}
