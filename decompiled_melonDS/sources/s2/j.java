package s2;

import a6.a1;
import a6.f0;
import java.util.Iterator;
import java.util.regex.Matcher;
import me.magnum.melonds.common.camera.DSiCameraSource;
import mh.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends zb.b {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ j(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // zb.b
    public final int a() {
        switch (this.A) {
            case 0:
                b bVar = (b) this.B;
                bVar.getClass();
                return bVar.B;
            default:
                return ((Matcher) ((b9.e) this.B).B).groupCount() + 1;
        }
    }

    public vc.d b(int i2) {
        Matcher matcher = (Matcher) ((b9.e) this.B).B;
        sc.d L = p7.j.L(matcher.start(i2), matcher.end(i2));
        if (L.A >= 0) {
            String group = matcher.group(i2);
            group.getClass();
            return new vc.d(group, L);
        }
        return null;
    }

    @Override // zb.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        boolean z10;
        switch (this.A) {
            case 0:
                return ((b) this.B).containsValue(obj);
            default:
                if (obj == null) {
                    z10 = true;
                } else {
                    z10 = obj instanceof vc.d;
                }
                if (!z10) {
                    return false;
                }
                return super.contains((vc.d) obj);
        }
    }

    @Override // zb.b, java.util.Collection
    public boolean isEmpty() {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                k kVar = ((b) this.B).A;
                l[] lVarArr = new l[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    lVarArr[i2] = new m(2);
                }
                return new c(kVar, lVarArr);
            default:
                return new f0(new uc.j(new a1(4, new sc.b(0, size() - 1, 1)), new z(23, this), 1));
        }
    }
}
