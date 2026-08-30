package ij;

import java.nio.file.attribute.FileTime;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: q  reason: collision with root package name */
    public static final n[] f7108q = new n[0];

    /* renamed from: a  reason: collision with root package name */
    public String f7109a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7110b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7111c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7112d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7113e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7114f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7115g;

    /* renamed from: h  reason: collision with root package name */
    public FileTime f7116h;

    /* renamed from: i  reason: collision with root package name */
    public FileTime f7117i;

    /* renamed from: j  reason: collision with root package name */
    public FileTime f7118j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7119k;

    /* renamed from: l  reason: collision with root package name */
    public int f7120l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public long f7121n;

    /* renamed from: o  reason: collision with root package name */
    public long f7122o;

    /* renamed from: p  reason: collision with root package name */
    public List f7123p;

    public final void a(Iterable iterable) {
        if (iterable != null) {
            final LinkedList linkedList = new LinkedList();
            iterable.forEach(new Consumer() { // from class: ij.m
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    linkedList.addLast((x) obj);
                }
            });
            this.f7123p = Collections.unmodifiableList(linkedList);
            return;
        }
        this.f7123p = null;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                if (Objects.equals(this.f7109a, nVar.f7109a) && this.f7110b == nVar.f7110b && this.f7111c == nVar.f7111c && this.f7112d == nVar.f7112d && this.f7113e == nVar.f7113e && this.f7114f == nVar.f7114f && this.f7115g == nVar.f7115g && Objects.equals(this.f7116h, nVar.f7116h) && Objects.equals(this.f7117i, nVar.f7117i) && Objects.equals(this.f7118j, nVar.f7118j) && this.f7119k == nVar.f7119k && this.f7120l == nVar.f7120l && this.m == nVar.m && this.f7121n == nVar.f7121n && this.f7122o == nVar.f7122o) {
                    List<x> list = this.f7123p;
                    List list2 = nVar.f7123p;
                    if (list == null) {
                        if (list2 == null) {
                            z10 = true;
                            if (!z10) {
                            }
                        }
                        z10 = false;
                        if (!z10) {
                        }
                    } else {
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            for (x xVar : list) {
                                if (it.hasNext()) {
                                    if (!xVar.equals(it.next())) {
                                    }
                                }
                            }
                            z10 = !it.hasNext();
                            if (!z10) {
                            }
                        }
                        z10 = false;
                        if (!z10) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f7109a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
