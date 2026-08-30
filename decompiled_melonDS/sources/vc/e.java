package vc;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import me.magnum.melonds.common.camera.DSiCameraSource;
import z2.b0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends zb.e {
    public final /* synthetic */ int A = 0;
    public final Object B;

    public e(List list) {
        list.getClass();
        this.B = list;
    }

    @Override // zb.b
    public final int a() {
        switch (this.A) {
            case 0:
                return ((Matcher) ((b9.e) this.B).B).groupCount() + 1;
            default:
                return ((List) this.B).size();
        }
    }

    @Override // zb.b, java.util.Collection, java.util.List
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
    public final Object get(int i2) {
        switch (this.A) {
            case 0:
                String group = ((Matcher) ((b9.e) this.B).B).group(i2);
                if (group == null) {
                    return "";
                }
                return group;
            default:
                return ((List) this.B).get(zb.l.J(i2, this));
        }
    }

    @Override // zb.e, java.util.List
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

    @Override // zb.e, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return new b0(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // zb.e, java.util.List
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

    @Override // zb.e, java.util.List
    public ListIterator listIterator() {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return new b0(this, 0);
            default:
                return super.listIterator();
        }
    }

    public e(b9.e eVar) {
        this.B = eVar;
    }

    @Override // zb.e, java.util.List
    public ListIterator listIterator(int i2) {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return new b0(this, i2);
            default:
                return super.listIterator(i2);
        }
    }
}
