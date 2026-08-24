package defpackage;

import java.nio.file.attribute.FileTime;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: md6  reason: default package */
/* loaded from: classes.dex */
public final class md6 {
    public static final md6[] q = new md6[0];
    public String a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public FileTime h;
    public FileTime i;
    public FileTime j;
    public boolean k;
    public int l;
    public boolean m;
    public long n;
    public long o;
    public List p;

    public final void a(Iterable iterable) {
        if (iterable != null) {
            final LinkedList linkedList = new LinkedList();
            iterable.forEach(new Consumer() { // from class: ld6
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    linkedList.addLast((ud6) obj);
                }
            });
            this.p = Collections.unmodifiableList(linkedList);
            return;
        }
        this.p = null;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj != null && md6.class == obj.getClass()) {
                md6 md6Var = (md6) obj;
                if (Objects.equals(this.a, md6Var.a) && this.b == md6Var.b && this.c == md6Var.c && this.d == md6Var.d && this.e == md6Var.e && this.f == md6Var.f && this.g == md6Var.g && Objects.equals(this.h, md6Var.h) && Objects.equals(this.i, md6Var.i) && Objects.equals(this.j, md6Var.j) && this.k == md6Var.k && this.l == md6Var.l && this.m == md6Var.m && this.n == md6Var.n && this.o == md6Var.o) {
                    List<ud6> list = this.p;
                    List list2 = md6Var.p;
                    if (list == null) {
                        if (list2 == null) {
                            z = true;
                            if (!z) {
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    } else {
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            for (ud6 ud6Var : list) {
                                if (it.hasNext()) {
                                    if (!ud6Var.equals(it.next())) {
                                    }
                                }
                            }
                            z = !it.hasNext();
                            if (!z) {
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
