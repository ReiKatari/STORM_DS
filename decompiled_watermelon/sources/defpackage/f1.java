package defpackage;

import java.util.Collection;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Collection B;

    public /* synthetic */ f1(int i, Collection collection) {
        this.A = i;
        this.B = collection;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
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
