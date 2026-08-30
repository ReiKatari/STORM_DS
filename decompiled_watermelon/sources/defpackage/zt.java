package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zt  reason: default package */
/* loaded from: classes.dex */
public final class zt extends pq0 {
    public final /* synthetic */ int b;
    public final qp3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt(m93 m93Var, int i) {
        super(m93Var);
        this.b = i;
        m93Var.getClass();
        switch (i) {
            case 1:
                super(m93Var);
                h06 e = m93Var.e();
                e.getClass();
                this.c = new vt(e, 2);
                return;
            case 2:
                super(m93Var);
                h06 e2 = m93Var.e();
                e2.getClass();
                this.c = new vt(e2, 3);
                return;
            default:
                h06 e3 = m93Var.e();
                e3.getClass();
                this.c = new vt(e3, 1);
                return;
        }
    }

    @Override // defpackage.m93
    public final h06 e() {
        switch (this.b) {
            case 0:
                return (vt) this.c;
            case 1:
                return (vt) this.c;
            default:
                return (vt) this.c;
        }
    }

    @Override // defpackage.l0
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

    @Override // defpackage.l0
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

    @Override // defpackage.l0
    public final Iterator h(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // defpackage.l0
    public final int i(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // defpackage.l0
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

    @Override // defpackage.l0
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

    @Override // defpackage.pq0
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
