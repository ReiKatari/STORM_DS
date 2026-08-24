package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hb6  reason: default package */
/* loaded from: classes.dex */
public abstract class hb6 {
    public static final Comparator[] a;
    public static final db6 b;

    static {
        zh2 zh2Var;
        Comparator[] comparatorArr = new Comparator[2];
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                zh2Var = zh2.e;
            } else {
                zh2Var = zh2.c;
            }
            comparatorArr[i] = new ix1(new ix1(zh2Var), 4);
        }
        a = comparatorArr;
        b = db6.X;
    }

    public static final void a(xa6 xa6Var, ArrayList arrayList, mc mcVar, mc mcVar2, p94 p94Var) {
        ta6 ta6Var = xa6Var.d;
        Object g = ta6Var.A.g(bb6.n);
        if (g == null) {
            g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g).booleanValue();
        if ((booleanValue || ((Boolean) mcVar2.g(xa6Var)).booleanValue()) && ((Boolean) mcVar.g(xa6Var)).booleanValue()) {
            arrayList.add(xa6Var);
        }
        if (booleanValue) {
            p94Var.i(xa6Var.f, b(xa6Var, mcVar, mcVar2, xa6.j(7, xa6Var)));
            return;
        }
        List j = xa6.j(7, xa6Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            a((xa6) j.get(i), arrayList, mcVar, mcVar2, p94Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed A[LOOP:1: B:12:0x0046->B:35:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5 A[EDGE_INSN: B:53:0x00f5->B:37:0x00f5 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList b(xa6 xa6Var, mc mcVar, mc mcVar2, List list) {
        char c;
        int i;
        int i2;
        int i3;
        p94 p94Var = h93.a;
        p94 p94Var2 = new p94();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            a((xa6) list.get(i4), arrayList, mcVar, mcVar2, p94Var2);
        }
        int i5 = 1;
        if (xa6Var.c.v0 == kk3.Rtl) {
            c = 1;
        } else {
            c = 0;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i6 = 0;
            while (true) {
                xa6 xa6Var2 = (xa6) arrayList.get(i6);
                if (i6 != 0) {
                    float f = xa6Var2.h().b;
                    float f2 = xa6Var2.h().d;
                    if (f >= f2) {
                        i2 = i5;
                    } else {
                        i2 = 0;
                    }
                    int size3 = arrayList2.size() - i5;
                    if (size3 >= 0) {
                        int i7 = 0;
                        while (true) {
                            of5 of5Var = (of5) ((vr4) arrayList2.get(i7)).A;
                            float f3 = of5Var.b;
                            i = i5;
                            float f4 = of5Var.d;
                            if (f3 >= f4) {
                                i3 = i;
                            } else {
                                i3 = 0;
                            }
                            if (i2 == 0 && i3 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i7, new vr4(new of5(Math.max(of5Var.a, (float) RecyclerView.B1), Math.max(of5Var.b, f), Math.min(of5Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((vr4) arrayList2.get(i7)).B));
                                ((List) ((vr4) arrayList2.get(i7)).B).add(xa6Var2);
                                break;
                            } else if (i7 == size3) {
                                break;
                            } else {
                                i7++;
                                i5 = i;
                            }
                        }
                        arrayList2.add(new vr4(xa6Var2.h(), hf.d0(xa6Var2)));
                        if (i6 != size2) {
                            break;
                        }
                        i6++;
                        i5 = i;
                    }
                }
                i = i5;
                arrayList2.add(new vr4(xa6Var2.h(), hf.d0(xa6Var2)));
                if (i6 != size2) {
                }
            }
        }
        jt0.x0(arrayList2, zh2.f);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            vr4 vr4Var = (vr4) arrayList2.get(i8);
            jt0.x0((List) vr4Var.B, comparator);
            arrayList3.addAll((Collection) vr4Var.B);
        }
        jt0.x0(arrayList3, new su0(b, 4));
        int i9 = 0;
        while (i9 <= arrayList3.size() - 1) {
            List list2 = (List) p94Var2.b(((xa6) arrayList3.get(i9)).f);
            if (list2 != null) {
                if (!((Boolean) mcVar2.g(arrayList3.get(i9))).booleanValue()) {
                    arrayList3.remove(i9);
                } else {
                    i9++;
                }
                arrayList3.addAll(i9, list2);
                i9 += list2.size();
            } else {
                i9++;
            }
        }
        return arrayList3;
    }
}
