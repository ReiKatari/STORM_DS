package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Selection;
import android.util.DisplayMetrics;
import android.view.View;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q61  reason: default package */
/* loaded from: classes.dex */
public class q61 implements k61, x42, x93, yi7, cg4, i71, k76, he4 {
    public static ArrayList j(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((k55) obj) != k55.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((k55) obj2).toString());
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k80, java.lang.Object] */
    public static byte[] k(List list) {
        list.getClass();
        ?? obj = new Object();
        ArrayList j = j(list);
        int size = j.size();
        int i = 0;
        while (i < size) {
            Object obj2 = j.get(i);
            i++;
            String str = (String) obj2;
            obj.n0(str.length());
            obj.t0(str);
        }
        return obj.N(obj.B);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
        if (r11 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
        if (r10 != (-1)) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean n(ct1 ct1Var, Editable editable, int i, int i2, boolean z) {
        int min;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                    }
                                } else {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        break;
                                    } else if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else if (Character.isHighSurrogate(charAt)) {
                                        break loop0;
                                    } else {
                                        z2 = true;
                                    }
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i2, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                } else if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        break;
                                    } else if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else if (Character.isLowSurrogate(charAt2)) {
                                        break loop2;
                                    } else {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i2, editable.length());
                }
                se7[] se7VarArr = (se7[]) editable.getSpans(selectionStart, min, se7.class);
                if (se7VarArr != null && se7VarArr.length > 0) {
                    for (se7 se7Var : se7VarArr) {
                        int spanStart = editable.getSpanStart(se7Var);
                        int spanEnd = editable.getSpanEnd(se7Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    ct1Var.beginBatchEdit();
                    editable.delete(max3, min2);
                    ct1Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static il5 o(cg0 cg0Var, qi1 qi1Var) {
        ca2 f;
        d51 d51Var = new d51(cg0Var, 4);
        List list = (List) qi1Var.f;
        kj2.t("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + qi1Var + ", lensFacing = " + cg0Var.m());
        Set set = (Set) qi1Var.e;
        if (set.isEmpty() && list.isEmpty()) {
            return null;
        }
        List list2 = (List) qi1Var.g;
        if (set.isEmpty() && list.isEmpty()) {
            i.h("Must have at least one required or preferred feature");
            return null;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                di7 di7Var = (di7) it.next();
                oj7.Companion.getClass();
                if (mj7.a(di7Var) == oj7.UNDEFINED) {
                    f = new aa2(di7Var);
                    break;
                }
            } else {
                Iterator it2 = set.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ba2 j = d51.j((qu2) it2.next(), list2);
                        if (j != null) {
                            f = j;
                            break;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            ba2 j2 = d51.j((qu2) obj, list2);
                            if (j2 != null) {
                                kj2.t("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + j2);
                            } else {
                                j2 = null;
                            }
                            if (j2 == null) {
                                arrayList.add(obj);
                            }
                        }
                        kj2.t("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
                        f = d51Var.f(qi1Var, arrayList, 0, yt1.A);
                    }
                }
            }
        }
        if (f instanceof y92) {
            il5 il5Var = ((y92) f).a;
            kj2.t("ResolvedFeatureGroup", "resolvedFeatureGroup = " + il5Var);
            return il5Var;
        } else if (!(f instanceof z92)) {
            if (!(f instanceof aa2)) {
                if (!(f instanceof ba2)) {
                    i.d();
                    return null;
                }
                ba2 ba2Var = (ba2) f;
                throw new IllegalArgumentException(ba2Var.a + " must be added for " + ba2Var.b);
            }
            throw new IllegalArgumentException(((aa2) f).a + " is not supported");
        } else {
            i.h("Feature group is not supported");
            return null;
        }
    }

    @Override // defpackage.x42
    public Object a(String str, Provider provider) {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }

    @Override // defpackage.cg4
    public boolean b(z64 z64Var) {
        return false;
    }

    @Override // defpackage.cg4
    public int c() {
        return 8;
    }

    @Override // defpackage.cg4
    public boolean d(z64 z64Var) {
        return u24.w(kn2.h(nc1.f0(z64Var), false));
    }

    @Override // defpackage.cg4
    public void e(sm3 sm3Var, long j, zx2 zx2Var, int i, boolean z) {
        if0 if0Var = sm3Var.B0;
        op5 op5Var = eg4.K0;
        ((eg4) if0Var.e).d1(eg4.O0, ((eg4) if0Var.e).V0(j, true), zx2Var, 1, z);
    }

    @Override // defpackage.c82
    public da4 f() {
        return da4.d();
    }

    @Override // defpackage.cg4
    public boolean g(zx2 zx2Var, sm3 sm3Var) {
        return false;
    }

    @Override // defpackage.yi7
    public zi7 h() {
        return new u54();
    }

    @Override // defpackage.cg4
    public boolean i(sm3 sm3Var) {
        ta6 x = sm3Var.x();
        boolean z = false;
        if (x != null && x.R) {
            z = true;
        }
        return !z;
    }

    public al1 l(Context context) {
        al1 al1Var;
        context.getClass();
        al1 al1Var2 = al1.k;
        if (al1Var2 == null) {
            synchronized (this) {
                al1Var = al1.k;
                if (al1Var == null) {
                    Context a = q41.a(context);
                    a.getClass();
                    al1Var = new al1(a);
                    al1.k = al1Var;
                }
            }
            return al1Var;
        }
        return al1Var2;
    }

    public void m(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public void p(c05 c05Var, int i, int i2) {
    }

    @Override // defpackage.k76
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.k76
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
