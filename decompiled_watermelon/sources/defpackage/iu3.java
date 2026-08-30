package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iu3  reason: default package */
/* loaded from: classes.dex */
public final class iu3 extends y0 {
    public final /* synthetic */ int A = 1;
    public final Object B;

    public iu3(List list) {
        list.getClass();
        this.B = list;
    }

    @Override // defpackage.k0
    public final int b() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return ((ku3) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.k0, java.util.Collection, java.util.Set
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
                String group = ((ku3) obj).a.group(i);
                if (group == null) {
                    return "";
                }
                return group;
            default:
                return ((List) obj).get(tq0.B0(i, this));
        }
    }

    @Override // defpackage.y0, java.util.List
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

    @Override // defpackage.y0, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.A) {
            case 1:
                return new tf5(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.y0, java.util.List
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

    @Override // defpackage.y0, java.util.List
    public ListIterator listIterator() {
        switch (this.A) {
            case 1:
                return new tf5(this, 0);
            default:
                return super.listIterator();
        }
    }

    public iu3(ku3 ku3Var) {
        this.B = ku3Var;
    }

    @Override // defpackage.y0, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.A) {
            case 1:
                return new tf5(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
