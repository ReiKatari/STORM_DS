package defpackage;

import java.util.Collection;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Collection B;

    public /* synthetic */ g1(int i, Collection collection) {
        this.A = i;
        this.B = collection;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        boolean contains;
        int i = this.A;
        Collection<?> collection = this.B;
        switch (i) {
            case 0:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
