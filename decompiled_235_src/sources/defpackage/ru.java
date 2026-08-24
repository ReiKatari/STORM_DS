package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ru  reason: default package */
/* loaded from: classes.dex */
public final class ru extends ct0 {
    public final /* synthetic */ int b;
    public final sw3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(gg3 gg3Var, int i) {
        super(gg3Var);
        this.b = i;
        gg3Var.getClass();
        switch (i) {
            case 1:
                super(gg3Var);
                wb6 e = gg3Var.e();
                e.getClass();
                this.c = new nu(e, 2);
                return;
            case 2:
                super(gg3Var);
                wb6 e2 = gg3Var.e();
                e2.getClass();
                this.c = new nu(e2, 3);
                return;
            default:
                wb6 e3 = gg3Var.e();
                e3.getClass();
                this.c = new nu(e3, 1);
                return;
        }
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        switch (this.b) {
            case 0:
                return (nu) this.c;
            case 1:
                return (nu) this.c;
            default:
                return (nu) this.c;
        }
    }

    @Override // defpackage.m0
    public final Object f() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.m0
    public final int g(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // defpackage.m0
    public final Iterator h(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // defpackage.m0
    public final int i(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // defpackage.m0
    public final Object l(Object obj) {
        Object obj2 = null;
        switch (this.b) {
            case 0:
                List list = (List) obj;
                list.getClass();
                if (list instanceof ArrayList) {
                    obj2 = (ArrayList) list;
                }
                if (obj2 == null) {
                    return new ArrayList(list);
                }
                return obj2;
            case 1:
                Set set = (Set) obj;
                set.getClass();
                if (set instanceof HashSet) {
                    obj2 = (HashSet) set;
                }
                if (obj2 == null) {
                    return new HashSet(set);
                }
                return obj2;
            default:
                Set set2 = (Set) obj;
                set2.getClass();
                if (set2 instanceof LinkedHashSet) {
                    obj2 = (LinkedHashSet) set2;
                }
                if (obj2 == null) {
                    return new LinkedHashSet(set2);
                }
                return obj2;
        }
    }

    @Override // defpackage.m0
    public final Object m(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // defpackage.ct0
    public final void n(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                return;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                return;
        }
    }
}
