package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jo1  reason: default package */
/* loaded from: classes.dex */
public class jo1 implements ud7, e52, ij2, p33, xr4, k74, y31, r56, d31 {
    public static volatile jo1 B;
    public static jo1 L;
    public static jo1 R;
    public final /* synthetic */ int A;

    public /* synthetic */ jo1(int i) {
        this.A = i;
    }

    public static final void m(jo1 jo1Var, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            ArrayList arrayList2 = new ArrayList(uq0.y0(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new vg7(intValue, ((Number) it2.next()).intValue()));
            }
            tq0.D0(arrayList, arrayList2);
        }
        tq0.s1(arrayList);
    }

    public static final float n(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f7 = fArr[fArr.length - 1];
            float f8 = fArr2[fArr.length - 1];
            if (f7 == RecyclerView.A1) {
                return RecyclerView.A1;
            }
            return (f8 / f7) * f;
        }
        if (i2 == -1) {
            float f9 = fArr[0];
            f4 = fArr2[0];
            f5 = f9;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f10 = fArr[i2];
            float f11 = fArr[i];
            f2 = fArr2[i2];
            f3 = f10;
            f4 = fArr2[i];
            f5 = f11;
        }
        if (f3 == f5) {
            f6 = 0.0f;
        } else {
            f6 = (abs - f3) / (f5 - f3);
        }
        return (((f4 - f2) * Math.max((float) RecyclerView.A1, Math.min(1.0f, f6))) + f2) * signum;
    }

    public static final void o(List list, StringBuilder sb) {
        b33 o0 = io2.o0(2, io2.t0(0, list.size()));
        int i = o0.A;
        int i2 = o0.B;
        int i3 = o0.L;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i != i2) {
                i += i3;
            } else {
                return;
            }
        }
    }

    public static ArrayList p(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((dw4) obj) != dw4.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(uq0.y0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((dw4) obj2).toString());
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f60, java.lang.Object] */
    public static byte[] q(List list) {
        list.getClass();
        ?? obj = new Object();
        ArrayList p = p(list);
        int size = p.size();
        int i = 0;
        while (i < size) {
            Object obj2 = p.get(i);
            i++;
            String str = (String) obj2;
            obj.m0(str.length());
            obj.s0(str);
        }
        return obj.K(obj.B);
    }

    public static pj6 r(nj6 nj6Var, lj6 lj6Var, cg6 cg6Var) {
        nj6Var.getClass();
        lj6Var.getClass();
        cg6Var.getClass();
        return new pj6(nj6Var, lj6Var, cg6Var);
    }

    public static qb5 u(td0 td0Var, me1 me1Var) {
        j52 f;
        t71 t71Var = new t71(2, td0Var);
        List list = (List) me1Var.f;
        ve2.v("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + me1Var + ", lensFacing = " + td0Var.c());
        Set set = (Set) me1Var.e;
        if (set.isEmpty() && list.isEmpty()) {
            return null;
        }
        List list2 = (List) me1Var.g;
        if (set.isEmpty() && list.isEmpty()) {
            i.i("Must have at least one required or preferred feature");
            return null;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                f47 f47Var = (f47) it.next();
                r57.Companion.getClass();
                if (p57.a(f47Var) == r57.UNDEFINED) {
                    f = new h52(f47Var);
                    break;
                }
            } else {
                Iterator it2 = set.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        i52 n = t71.n((no2) it2.next(), list2);
                        if (n != null) {
                            f = n;
                            break;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            i52 n2 = t71.n((no2) obj, list2);
                            if (n2 != null) {
                                ve2.v("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + n2);
                            } else {
                                n2 = null;
                            }
                            if (n2 == null) {
                                arrayList.add(obj);
                            }
                        }
                        ve2.v("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
                        f = t71Var.f(me1Var, arrayList, 0, pp1.A);
                    }
                }
            }
        }
        if (f instanceof f52) {
            qb5 qb5Var = ((f52) f).a;
            ve2.v("ResolvedFeatureGroup", "resolvedFeatureGroup = " + qb5Var);
            return qb5Var;
        } else if (!(f instanceof g52)) {
            if (!(f instanceof h52)) {
                if (!(f instanceof i52)) {
                    i.c();
                    return null;
                }
                i52 i52Var = (i52) f;
                throw new IllegalArgumentException(i52Var.a + " must be added for " + i52Var.b);
            }
            throw new IllegalArgumentException(((h52) f).a + " is not supported");
        } else {
            i.i("Feature group is not supported");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
        if (r4 <= (r6.getHeight() * r6.getWidth())) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pj6 w(int r5, android.util.Size r6, defpackage.ox r7, int r8, defpackage.mj6 r9, defpackage.cg6 r10) {
        /*
            java.util.LinkedHashMap r0 = r7.f
            r6.getClass()
            r9.getClass()
            r10.getClass()
            java.util.LinkedHashMap r1 = defpackage.pj6.h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Object r1 = r1.get(r2)
            nj6 r1 = (defpackage.nj6) r1
            if (r1 != 0) goto L1b
            nj6 r1 = defpackage.nj6.PRIV
        L1b:
            lj6 r2 = defpackage.lj6.NOT_SUPPORT
            android.util.Size r3 = defpackage.x76.a
            int r3 = r6.getWidth()
            int r4 = r6.getHeight()
            int r4 = r4 * r3
            r3 = 1
            if (r8 != r3) goto L57
            java.util.LinkedHashMap r6 = r7.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r6.get(r8)
            android.util.Size r6 = (android.util.Size) r6
            int r6 = defpackage.x76.a(r6)
            if (r4 > r6) goto L41
            lj6 r2 = defpackage.lj6.S720P_16_9
            goto Lec
        L41:
            java.util.LinkedHashMap r6 = r7.d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r6.get(r5)
            android.util.Size r5 = (android.util.Size) r5
            int r5 = defpackage.x76.a(r5)
            if (r4 > r5) goto Lec
            lj6 r2 = defpackage.lj6.S1440P_4_3
            goto Lec
        L57:
            mj6 r3 = defpackage.mj6.FEATURE_COMBINATION_TABLE
            if (r9 != r3) goto L89
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r0.get(r5)
            android.util.Size r5 = (android.util.Size) r5
            lj6[] r7 = defpackage.pj6.f
            int r8 = r7.length
            r9 = 0
        L69:
            if (r9 >= r8) goto L7c
            r0 = r7[r9]
            android.util.Size r3 = r0.getRelatedFixedSize()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L79
            r2 = r0
            goto L7c
        L79:
            int r9 = r9 + 1
            goto L69
        L7c:
            lj6 r7 = defpackage.lj6.NOT_SUPPORT
            if (r2 != r7) goto Lec
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto Lec
            lj6 r2 = defpackage.lj6.MAXIMUM
            goto Lec
        L89:
            android.util.Size r6 = r7.a
            int r6 = defpackage.x76.a(r6)
            if (r4 > r6) goto L94
            lj6 r2 = defpackage.lj6.VGA
            goto Lec
        L94:
            android.util.Size r6 = r7.c
            int r9 = r6.getWidth()
            int r6 = r6.getHeight()
            int r6 = r6 * r9
            if (r4 > r6) goto La4
            lj6 r2 = defpackage.lj6.PREVIEW
            goto Lec
        La4:
            android.util.Size r6 = r7.e
            int r9 = r6.getWidth()
            int r6 = r6.getHeight()
            int r6 = r6 * r9
            if (r4 > r6) goto Lb4
            lj6 r2 = defpackage.lj6.RECORD
            goto Lec
        Lb4:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r0.get(r6)
            android.util.Size r6 = (android.util.Size) r6
            java.util.LinkedHashMap r7 = r7.i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r7.get(r5)
            android.util.Size r5 = (android.util.Size) r5
            if (r6 == 0) goto Ld7
            int r7 = r6.getWidth()
            int r6 = r6.getHeight()
            int r6 = r6 * r7
            if (r4 > r6) goto Ldd
        Ld7:
            r6 = 2
            if (r8 == r6) goto Ldd
            lj6 r2 = defpackage.lj6.MAXIMUM
            goto Lec
        Ldd:
            if (r5 == 0) goto Lec
            int r6 = r5.getWidth()
            int r5 = r5.getHeight()
            int r5 = r5 * r6
            if (r4 > r5) goto Lec
            lj6 r2 = defpackage.lj6.ULTRA_MAXIMUM
        Lec:
            pj6 r5 = r(r1, r2, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo1.w(int, android.util.Size, ox, int, mj6, cg6):pj6");
    }

    @Override // defpackage.ud7
    public pw3 a(ow3 ow3Var) {
        return null;
    }

    @Override // defpackage.r56
    public u92 c(gi6 gi6Var) {
        return new bz0(4, p56.START);
    }

    @Override // defpackage.k74
    public boolean d(yy3 yy3Var) {
        return false;
    }

    @Override // defpackage.k74
    public int e() {
        return 8;
    }

    @Override // defpackage.e52
    public boolean f(d16 d16Var) {
        return false;
    }

    @Override // defpackage.k74
    public boolean g(yy3 yy3Var) {
        return w81.w(ln2.l(l.P(yy3Var), false));
    }

    @Override // defpackage.k74
    public void i(vf3 vf3Var, long j, yr2 yr2Var, int i, boolean z) {
        zc0 zc0Var = vf3Var.A0;
        rf5 rf5Var = m74.J0;
        ((m74) zc0Var.e).d1(m74.N0, ((m74) zc0Var.e).V0(j, true), yr2Var, 1, z);
    }

    @Override // defpackage.k74
    public boolean j(yr2 yr2Var, vf3 vf3Var) {
        return false;
    }

    @Override // defpackage.xr4
    public CharSequence k(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(listPreference.f())) {
            return listPreference.getContext().getString(R.string.not_set);
        }
        return listPreference.f();
    }

    @Override // defpackage.k74
    public boolean l(vf3 vf3Var) {
        ez5 w = vf3Var.w();
        boolean z = false;
        if (w != null && w.R) {
            z = true;
        }
        return !z;
    }

    public void t(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public String toString() {
        switch (this.A) {
            case 22:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ jo1(int i, Object obj) {
        this.A = i;
    }

    @Override // defpackage.ij2
    public Object apply(Object obj) {
        return obj;
    }

    @Override // defpackage.ud7
    public void b(int i) {
    }

    public void v(yq4 yq4Var, int i, int i2) {
    }

    @Override // defpackage.ud7
    public void h(ow3 ow3Var, Bitmap bitmap, Map map, int i) {
    }
}
