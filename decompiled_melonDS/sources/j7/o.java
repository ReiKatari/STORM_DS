package j7;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final ah.b0 f7643a = new ah.b0(5);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.lang.Object, j7.n] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, j7.m] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, j7.n] */
    public static k c(o oVar) {
        int i2;
        n nVar;
        int i10;
        m mVar;
        j jVar;
        int i11;
        int i12;
        int i13;
        n nVar2;
        int i14;
        n nVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int h2 = oVar.h();
        int g10 = oVar.g();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ?? obj = new Object();
        int i25 = 0;
        obj.f7625a = 0;
        obj.f7626b = h2;
        obj.f7627c = 0;
        obj.f7628d = g10;
        arrayList2.add(obj);
        int i26 = h2 + g10;
        int i27 = 1;
        int i28 = (((i26 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i28];
        int i29 = i28 / 2;
        int[] iArr2 = new int[i28];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            m mVar2 = (m) arrayList2.remove(arrayList2.size() - i27);
            if (mVar2.b() >= i27 && mVar2.a() >= i27) {
                int a10 = ((mVar2.a() + mVar2.b()) + i27) / 2;
                int i30 = i27 + i29;
                iArr[i30] = mVar2.f7625a;
                iArr2[i30] = mVar2.f7626b;
                int i31 = i25;
                while (i31 < a10) {
                    if (Math.abs(mVar2.b() - mVar2.a()) % 2 == i27) {
                        i11 = i27;
                    } else {
                        i11 = i25;
                    }
                    int b10 = mVar2.b() - mVar2.a();
                    int i32 = -i31;
                    int i33 = i32;
                    while (true) {
                        if (i33 <= i31) {
                            if (i33 != i32 && (i33 == i31 || iArr[i33 + 1 + i29] <= iArr[(i33 - 1) + i29])) {
                                i20 = iArr[(i33 - 1) + i29];
                                i21 = i20 + 1;
                            } else {
                                i20 = iArr[i33 + 1 + i29];
                                i21 = i20;
                            }
                            i2 = i29;
                            int i34 = ((i21 - mVar2.f7625a) + mVar2.f7627c) - i33;
                            if (i31 != 0 && i21 == i20) {
                                i22 = i21;
                                i23 = i34 - 1;
                            } else {
                                i22 = i21;
                                i23 = i34;
                            }
                            int i35 = i33;
                            int i36 = i34;
                            int i37 = i22;
                            i13 = a10;
                            while (i37 < mVar2.f7626b && i36 < mVar2.f7628d && oVar.b(i37, i36)) {
                                i37++;
                                i36++;
                            }
                            iArr[i35 + i2] = i37;
                            if (i11 != 0) {
                                int i38 = b10 - i35;
                                i24 = i11;
                                if (i38 >= i32 + 1 && i38 <= i31 - 1 && iArr2[i38 + i2] <= i37) {
                                    ?? obj2 = new Object();
                                    obj2.f7631a = i20;
                                    obj2.f7632b = i23;
                                    obj2.f7633c = i37;
                                    obj2.f7634d = i36;
                                    i12 = 0;
                                    obj2.f7635e = false;
                                    nVar2 = obj2;
                                    break;
                                }
                            } else {
                                i24 = i11;
                            }
                            i33 = i35 + 2;
                            i25 = 0;
                            i29 = i2;
                            a10 = i13;
                            i11 = i24;
                        } else {
                            i12 = i25;
                            i2 = i29;
                            i13 = a10;
                            nVar2 = null;
                            break;
                        }
                    }
                    if (nVar2 != null) {
                        nVar = nVar2;
                        break;
                    }
                    if ((mVar2.b() - mVar2.a()) % 2 == 0) {
                        i14 = 1;
                    } else {
                        i14 = i12;
                    }
                    int b11 = mVar2.b() - mVar2.a();
                    int i39 = i32;
                    while (true) {
                        if (i39 <= i31) {
                            if (i39 != i32 && (i39 == i31 || iArr2[i39 + 1 + i2] >= iArr2[(i39 - 1) + i2])) {
                                i15 = iArr2[(i39 - 1) + i2];
                                i16 = i15 - 1;
                            } else {
                                i15 = iArr2[i39 + 1 + i2];
                                i16 = i15;
                            }
                            int i40 = mVar2.f7628d - ((mVar2.f7626b - i16) - i39);
                            if (i31 != 0 && i16 == i15) {
                                i17 = i40 + 1;
                            } else {
                                i17 = i40;
                            }
                            int i41 = i14;
                            while (i16 > mVar2.f7625a && i40 > mVar2.f7627c) {
                                i18 = b11;
                                if (!oVar.b(i16 - 1, i40 - 1)) {
                                    break;
                                }
                                i16--;
                                i40--;
                                b11 = i18;
                            }
                            i18 = b11;
                            iArr2[i39 + i2] = i16;
                            if (i41 != 0 && (i19 = i18 - i39) >= i32 && i19 <= i31 && iArr[i19 + i2] >= i16) {
                                ?? obj3 = new Object();
                                obj3.f7631a = i16;
                                obj3.f7632b = i40;
                                obj3.f7633c = i15;
                                obj3.f7634d = i17;
                                obj3.f7635e = true;
                                nVar3 = obj3;
                                break;
                            }
                            i39 += 2;
                            i14 = i41;
                            b11 = i18;
                        } else {
                            nVar3 = null;
                            break;
                        }
                    }
                    if (nVar3 != null) {
                        nVar = nVar3;
                        break;
                    }
                    i31++;
                    i29 = i2;
                    a10 = i13;
                    i27 = 1;
                    i25 = 0;
                }
            }
            i2 = i29;
            nVar = null;
            if (nVar != null) {
                if (nVar.a() > 0) {
                    int i42 = nVar.f7634d;
                    int i43 = nVar.f7632b;
                    int i44 = i42 - i43;
                    int i45 = nVar.f7633c;
                    int i46 = nVar.f7631a;
                    int i47 = i45 - i46;
                    if (i44 != i47) {
                        if (nVar.f7635e) {
                            jVar = new j(i46, i43, nVar.a());
                        } else if (i44 > i47) {
                            jVar = new j(i46, i43 + 1, nVar.a());
                        } else {
                            jVar = new j(i46 + 1, i43, nVar.a());
                        }
                    } else {
                        jVar = new j(i46, i43, i47);
                    }
                    arrayList.add(jVar);
                }
                if (arrayList3.isEmpty()) {
                    i10 = 1;
                    mVar = new Object();
                } else {
                    i10 = 1;
                    mVar = (m) arrayList3.remove(arrayList3.size() - 1);
                }
                mVar.f7625a = mVar2.f7625a;
                mVar.f7627c = mVar2.f7627c;
                mVar.f7626b = nVar.f7631a;
                mVar.f7628d = nVar.f7632b;
                arrayList2.add(mVar);
                mVar2.f7626b = mVar2.f7626b;
                mVar2.f7628d = mVar2.f7628d;
                mVar2.f7625a = nVar.f7633c;
                mVar2.f7627c = nVar.f7634d;
                arrayList2.add(mVar2);
            } else {
                i10 = 1;
                arrayList3.add(mVar2);
            }
            i29 = i2;
            i27 = i10;
            i25 = 0;
        }
        Collections.sort(arrayList, f7643a);
        return new k(oVar, arrayList, iArr, iArr2);
    }

    public static int d(f1 f1Var, e0 e0Var, View view, View view2, u0 u0Var, boolean z10) {
        if (u0Var.v() != 0 && f1Var.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return Math.abs(u0.G(view) - u0.G(view2)) + 1;
            }
            return Math.min(e0Var.n(), e0Var.d(view2) - e0Var.g(view));
        }
        return 0;
    }

    public static int e(f1 f1Var, e0 e0Var, View view, View view2, u0 u0Var, boolean z10, boolean z11) {
        int max;
        if (u0Var.v() == 0 || f1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(u0.G(view), u0.G(view2));
        int max2 = Math.max(u0.G(view), u0.G(view2));
        if (z11) {
            max = Math.max(0, (f1Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z10) {
            return max;
        }
        return Math.round((max * (Math.abs(e0Var.d(view2) - e0Var.g(view)) / (Math.abs(u0.G(view) - u0.G(view2)) + 1))) + (e0Var.m() - e0Var.g(view)));
    }

    public static int f(f1 f1Var, e0 e0Var, View view, View view2, u0 u0Var, boolean z10) {
        if (u0Var.v() != 0 && f1Var.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return f1Var.b();
            }
            return (int) (((e0Var.d(view2) - e0Var.g(view)) / (Math.abs(u0.G(view) - u0.G(view2)) + 1)) * f1Var.b());
        }
        return 0;
    }

    public abstract boolean a(int i2, int i10);

    public abstract boolean b(int i2, int i10);

    public abstract int g();

    public abstract int h();
}
