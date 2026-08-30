package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uk3  reason: default package */
/* loaded from: classes.dex */
public final class uk3 extends i1 implements vk3, RandomAccess {
    public final ArrayList B;

    static {
        new uk3(10).A = false;
    }

    public uk3(int i) {
        this(new ArrayList(i));
    }

    @Override // defpackage.vk3
    public final void a(v70 v70Var) {
        b();
        this.B.add(v70Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b();
        this.B.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.i1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        if (collection instanceof vk3) {
            collection = ((vk3) collection).h();
        }
        boolean addAll = this.B.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // defpackage.i1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.B.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.r33
    public final r33 e(int i) {
        ArrayList arrayList = this.B;
        if (i >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i);
            arrayList2.addAll(arrayList);
            return new uk3(arrayList2);
        }
        c44.r();
        return null;
    }

    @Override // defpackage.vk3
    public final vk3 f() {
        if (this.A) {
            return new w27(this);
        }
        return this;
    }

    @Override // defpackage.vk3
    public final Object g(int i) {
        return this.B.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.B;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof x70) {
            x70 x70Var = (x70) obj;
            Charset charset = s33.a;
            if (x70Var.size() == 0) {
                str = "";
            } else {
                v70 v70Var = (v70) x70Var;
                str = new String(v70Var.R, v70Var.k(), v70Var.size(), charset);
            }
            v70 v70Var2 = (v70) x70Var;
            int k = v70Var2.k();
            if (c67.a.G(v70Var2.R, k, v70Var2.size() + k)) {
                arrayList.set(i, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, s33.a);
        if (c67.a.G(bArr, 0, bArr.length)) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // defpackage.vk3
    public final List h() {
        return Collections.unmodifiableList(this.B);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        Object remove = this.B.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof x70) {
            x70 x70Var = (x70) remove;
            Charset charset = s33.a;
            if (x70Var.size() == 0) {
                return "";
            }
            v70 v70Var = (v70) x70Var;
            return new String(v70Var.R, v70Var.k(), v70Var.size(), charset);
        }
        return new String((byte[]) remove, s33.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.B.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof x70) {
            x70 x70Var = (x70) obj2;
            Charset charset = s33.a;
            if (x70Var.size() == 0) {
                return "";
            }
            v70 v70Var = (v70) x70Var;
            return new String(v70Var.R, v70Var.k(), v70Var.size(), charset);
        }
        return new String((byte[]) obj2, s33.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.B.size();
    }

    public uk3(ArrayList arrayList) {
        this.B = arrayList;
    }

    @Override // defpackage.i1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.B.size(), collection);
    }
}
