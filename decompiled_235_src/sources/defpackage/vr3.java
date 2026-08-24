package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vr3  reason: default package */
/* loaded from: classes.dex */
public final class vr3 extends j1 implements wr3, RandomAccess {
    public final ArrayList B;

    static {
        new vr3(10).A = false;
    }

    public vr3(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.B.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.j1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof wr3) {
            collection = ((wr3) collection).n();
        }
        boolean addAll = this.B.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // defpackage.j1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.B.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.wr3
    public final void e(ca0 ca0Var) {
        a();
        this.B.add(ca0Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.B;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ea0) {
            ea0 ea0Var = (ea0) obj;
            Charset charset = aa3.a;
            if (ea0Var.size() == 0) {
                str = "";
            } else {
                ca0 ca0Var = (ca0) ea0Var;
                str = new String(ca0Var.R, ca0Var.g(), ca0Var.size(), charset);
            }
            ca0 ca0Var2 = (ca0) ea0Var;
            int g = ca0Var2.g();
            if (xj7.a.z(ca0Var2.R, g, ca0Var2.size() + g)) {
                arrayList.set(i, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, aa3.a);
        if (xj7.a.z(bArr, 0, bArr.length)) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // defpackage.z93
    public final z93 k(int i) {
        ArrayList arrayList = this.B;
        if (i >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i);
            arrayList2.addAll(arrayList);
            return new vr3(arrayList2);
        }
        u34.t();
        return null;
    }

    @Override // defpackage.wr3
    public final List n() {
        return Collections.unmodifiableList(this.B);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object remove = this.B.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof ea0) {
            ea0 ea0Var = (ea0) remove;
            Charset charset = aa3.a;
            if (ea0Var.size() == 0) {
                return "";
            }
            ca0 ca0Var = (ca0) ea0Var;
            return new String(ca0Var.R, ca0Var.g(), ca0Var.size(), charset);
        }
        return new String((byte[]) remove, aa3.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.B.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof ea0) {
            ea0 ea0Var = (ea0) obj2;
            Charset charset = aa3.a;
            if (ea0Var.size() == 0) {
                return "";
            }
            ca0 ca0Var = (ca0) ea0Var;
            return new String(ca0Var.R, ca0Var.g(), ca0Var.size(), charset);
        }
        return new String((byte[]) obj2, aa3.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.B.size();
    }

    @Override // defpackage.wr3
    public final wr3 u() {
        if (this.A) {
            return new rg7(this);
        }
        return this;
    }

    @Override // defpackage.wr3
    public final Object v(int i) {
        return this.B.get(i);
    }

    public vr3(ArrayList arrayList) {
        this.B = arrayList;
    }

    @Override // defpackage.j1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.B.size(), collection);
    }
}
