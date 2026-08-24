package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l14  reason: default package */
/* loaded from: classes.dex */
public final class l14 extends z0 {
    public final /* synthetic */ int A = 1;
    public final Object B;

    public l14(List list) {
        list.getClass();
        this.B = list;
    }

    @Override // defpackage.l0
    public final int a() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return ((n14) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.contains((String) obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.A;
        Object obj = this.B;
        switch (i2) {
            case 0:
                String group = ((n14) obj).a.group(i);
                if (group == null) {
                    return "";
                }
                return group;
            default:
                return ((List) obj).get(gt0.y0(i, this));
        }
    }

    @Override // defpackage.z0, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.indexOf((String) obj);
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.z0, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.A) {
            case 1:
                return new qp5(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.z0, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.lastIndexOf((String) obj);
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.z0, java.util.List
    public ListIterator listIterator() {
        switch (this.A) {
            case 1:
                return new qp5(this, 0);
            default:
                return super.listIterator();
        }
    }

    public l14(n14 n14Var) {
        this.B = n14Var;
    }

    @Override // defpackage.z0, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.A) {
            case 1:
                return new qp5(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
