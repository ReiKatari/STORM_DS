package j7;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7612a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f7613b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f7614c;

    /* renamed from: d  reason: collision with root package name */
    public final o f7615d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7616e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7617f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7618g;

    public k(o oVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
        j jVar;
        int i2;
        j jVar2;
        int i10;
        int i11;
        int i12;
        this.f7612a = arrayList;
        this.f7613b = iArr;
        this.f7614c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f7615d = oVar;
        int h2 = oVar.h();
        this.f7616e = h2;
        int g10 = oVar.g();
        this.f7617f = g10;
        this.f7618g = true;
        if (arrayList.isEmpty()) {
            jVar = null;
        } else {
            jVar = (j) arrayList.get(0);
        }
        if (jVar == null || jVar.f7590a != 0 || jVar.f7591b != 0) {
            arrayList.add(0, new j(0, 0, 0));
        }
        arrayList.add(new j(h2, g10, 0));
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            j jVar3 = (j) obj;
            for (int i14 = 0; i14 < jVar3.f7592c; i14++) {
                int i15 = jVar3.f7590a + i14;
                int i16 = jVar3.f7591b + i14;
                if (oVar.a(i15, i16)) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                iArr[i15] = (i16 << 4) | i12;
                iArr2[i16] = (i15 << 4) | i12;
            }
        }
        if (this.f7618g) {
            int size2 = arrayList.size();
            int i17 = 0;
            int i18 = 0;
            while (i18 < size2) {
                Object obj2 = arrayList.get(i18);
                i18++;
                j jVar4 = (j) obj2;
                while (true) {
                    i2 = jVar4.f7590a;
                    if (i17 < i2) {
                        if (iArr[i17] == 0) {
                            int size3 = arrayList.size();
                            int i19 = 0;
                            int i20 = 0;
                            while (true) {
                                if (i19 < size3) {
                                    jVar2 = (j) arrayList.get(i19);
                                    while (true) {
                                        i10 = jVar2.f7591b;
                                        if (i20 < i10) {
                                            if (iArr2[i20] == 0 && oVar.b(i17, i20)) {
                                                if (oVar.a(i17, i20)) {
                                                    i11 = 8;
                                                } else {
                                                    i11 = 4;
                                                }
                                                iArr[i17] = (i20 << 4) | i11;
                                                iArr2[i20] = i11 | (i17 << 4);
                                            } else {
                                                i20++;
                                            }
                                        }
                                    }
                                }
                                i20 = jVar2.f7592c + i10;
                                i19++;
                            }
                        }
                        i17++;
                    }
                }
                i17 = jVar4.f7592c + i2;
            }
        }
    }

    public static l b(ArrayDeque arrayDeque, int i2, boolean z10) {
        l lVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (it.hasNext()) {
                lVar = (l) it.next();
                if (lVar.f7622a == i2 && lVar.f7624c == z10) {
                    it.remove();
                    break;
                }
            } else {
                lVar = null;
                break;
            }
        }
        while (it.hasNext()) {
            l lVar2 = (l) it.next();
            if (z10) {
                lVar2.f7623b--;
            } else {
                lVar2.f7623b++;
            }
        }
        return lVar;
    }

    public final void a(k0 k0Var) {
        int[] iArr;
        o oVar;
        int i2;
        l b10;
        ArrayList arrayList;
        int i10;
        b bVar = new b(new d2.t(23, k0Var));
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = this.f7612a;
        boolean z10 = true;
        int size = arrayList2.size() - 1;
        int i11 = this.f7616e;
        int i12 = this.f7617f;
        int i13 = i11;
        while (size >= 0) {
            j jVar = (j) arrayList2.get(size);
            int i14 = jVar.f7590a;
            int i15 = jVar.f7591b;
            int i16 = jVar.f7592c;
            int i17 = i14 + i16;
            int i18 = i15 + i16;
            while (true) {
                iArr = this.f7613b;
                oVar = this.f7615d;
                boolean z11 = z10;
                if (i13 <= i17) {
                    break;
                }
                i13--;
                int i19 = iArr[i13];
                if ((i19 & 12) != 0) {
                    arrayList = arrayList2;
                    l b11 = b(arrayDeque, i19 >> 4, false);
                    if (b11 != null) {
                        int i20 = (i11 - b11.f7623b) - 1;
                        bVar.c(i13, i20);
                        if ((i19 & 4) != 0) {
                            oVar.getClass();
                            bVar.b(i20, z11 ? 1 : 0);
                        }
                    } else {
                        arrayDeque.add(new l(i13, z11, (i11 - i13) - (z11 ? 1 : 0)));
                    }
                } else {
                    arrayList = arrayList2;
                    if (bVar.f7503b == 2 && (i10 = bVar.f7504c) >= i13 && i10 <= i13 + 1) {
                        bVar.f7505d++;
                        bVar.f7504c = i13;
                    } else {
                        bVar.a();
                        bVar.f7504c = i13;
                        bVar.f7505d = 1;
                        bVar.f7503b = 2;
                    }
                    i11--;
                }
                arrayList2 = arrayList;
                z10 = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i12 > i18) {
                i12--;
                int i21 = this.f7614c[i12];
                if ((i21 & 12) != 0) {
                    if (b(arrayDeque, i21 >> 4, true) == null) {
                        arrayDeque.add(new l(i12, false, i11 - i13));
                    } else {
                        bVar.c((i11 - b10.f7623b) - 1, i13);
                        if ((i21 & 4) != 0) {
                            oVar.getClass();
                            bVar.b(i13, 1);
                        }
                    }
                } else {
                    if (bVar.f7503b == 1 && i13 >= (i2 = bVar.f7504c)) {
                        int i22 = bVar.f7505d;
                        if (i13 <= i2 + i22) {
                            bVar.f7505d = i22 + 1;
                            bVar.f7504c = Math.min(i13, i2);
                            i11++;
                        }
                    }
                    bVar.a();
                    bVar.f7504c = i13;
                    bVar.f7505d = 1;
                    bVar.f7503b = 1;
                    i11++;
                }
            }
            int i23 = i14;
            for (int i24 = 0; i24 < i16; i24++) {
                if ((iArr[i23] & 15) == 2) {
                    oVar.getClass();
                    bVar.b(i23, 1);
                }
                i23++;
            }
            size--;
            z10 = true;
            i13 = i14;
            i12 = i15;
            arrayList2 = arrayList3;
        }
        bVar.a();
    }
}
