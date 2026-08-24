package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yv3  reason: default package */
/* loaded from: classes.dex */
public final class yv3 extends AbstractSet {
    public final /* synthetic */ int A;
    public final /* synthetic */ Map B;

    public /* synthetic */ yv3(int i, Map map) {
        this.A = i;
        this.B = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.A;
        Map map = this.B;
        switch (i) {
            case 0:
                ((aw3) map).clear();
                return;
            case 1:
                ((aw3) map).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean contains(Object obj) {
        zv3 a;
        int i = this.A;
        Map map = this.B;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                aw3 aw3Var = (aw3) map;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                zv3 zv3Var = null;
                if (key != null) {
                    try {
                        a = aw3Var.a(false, key);
                    } catch (ClassCastException unused) {
                    }
                    if (a != null && Objects.equals(a.d0, entry.getValue())) {
                        zv3Var = a;
                    }
                    if (zv3Var != null) {
                        return false;
                    }
                    return true;
                }
                a = null;
                if (a != null) {
                    zv3Var = a;
                }
                if (zv3Var != null) {
                }
            case 1:
                return ((aw3) map).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.A;
        Map map = this.B;
        switch (i) {
            case 0:
                return new xv3((aw3) map, 0);
            case 1:
                return new xv3((aw3) map, 1);
            default:
                return new uu((wu) map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean remove(Object obj) {
        zv3 a;
        int i = this.A;
        zv3 zv3Var = null;
        Map map = this.B;
        switch (i) {
            case 0:
                aw3 aw3Var = (aw3) map;
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        a = aw3Var.a(false, key);
                    } catch (ClassCastException unused) {
                    }
                    if (a != null && Objects.equals(a.d0, entry.getValue())) {
                        zv3Var = a;
                    }
                    if (zv3Var != null) {
                        return false;
                    }
                    aw3Var.c(zv3Var, true);
                    return true;
                }
                a = null;
                if (a != null) {
                    zv3Var = a;
                }
                if (zv3Var != null) {
                }
            case 1:
                aw3 aw3Var2 = (aw3) map;
                if (obj != null) {
                    try {
                        zv3Var = aw3Var2.a(false, obj);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (zv3Var != null) {
                    aw3Var2.c(zv3Var, true);
                }
                if (zv3Var == null) {
                    return false;
                }
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.A;
        Map map = this.B;
        switch (i) {
            case 0:
                return ((aw3) map).R;
            case 1:
                return ((aw3) map).R;
            default:
                return ((wu) map).L;
        }
    }
}
