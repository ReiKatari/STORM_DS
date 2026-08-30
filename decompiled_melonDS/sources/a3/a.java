package a3;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List f146a;

    public a(List list) {
        this.f146a = list;
    }

    public final boolean a() {
        List list = this.f146a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((c) list.get(i2)).getClass();
        }
        return false;
    }
}
