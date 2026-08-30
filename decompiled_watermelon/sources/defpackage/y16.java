package defpackage;

import java.nio.file.attribute.FileTime;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y16  reason: default package */
/* loaded from: classes.dex */
public final class y16 {
    public static final y16[] q = new y16[0];
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
            iterable.forEach(new Consumer() { // from class: x16
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    linkedList.addLast((i26) obj);
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
            if (obj != null && y16.class == obj.getClass()) {
                y16 y16Var = (y16) obj;
                if (Objects.equals(this.a, y16Var.a) && this.b == y16Var.b && this.c == y16Var.c && this.d == y16Var.d && this.e == y16Var.e && this.f == y16Var.f && this.g == y16Var.g && Objects.equals(this.h, y16Var.h) && Objects.equals(this.i, y16Var.i) && Objects.equals(this.j, y16Var.j) && this.k == y16Var.k && this.l == y16Var.l && this.m == y16Var.m && this.n == y16Var.n && this.o == y16Var.o) {
                    List<i26> list = this.p;
                    List list2 = y16Var.p;
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
                            for (i26 i26Var : list) {
                                if (it.hasNext()) {
                                    if (!i26Var.equals(it.next())) {
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
