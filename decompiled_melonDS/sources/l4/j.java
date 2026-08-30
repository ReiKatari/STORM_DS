package l4;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final h f8826a = new h("");

    public static final List a(h hVar, int i2, int i10, i iVar) {
        List list;
        boolean z10;
        if (i2 == i10 || (list = hVar.A) == null) {
            return null;
        }
        if (i2 == 0 && i10 >= hVar.B.length()) {
            if (iVar == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = list.get(i11);
                if (((Boolean) iVar.k(((f) obj).f8790a)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            f fVar = (f) list.get(i12);
            boolean z11 = true;
            if (iVar != null) {
                z10 = ((Boolean) iVar.k(fVar.f8790a)).booleanValue();
            } else {
                z10 = true;
            }
            if ((z10 && b(i2, i10, fVar.f8791b, fVar.f8792c)) ? false : false) {
                arrayList2.add(new f(p7.j.g(fVar.f8791b, i2, i10) - i2, p7.j.g(fVar.f8792c, i2, i10) - i2, (c) fVar.f8790a, fVar.f8793d));
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i2, int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (i2 == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z15 = z10 | z11;
        if (i2 == i11) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z16 = z15 & z12;
        if (i2 < i12) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (i11 < i10) {
            z14 = true;
        }
        return (z13 & z14) | z16;
    }
}
