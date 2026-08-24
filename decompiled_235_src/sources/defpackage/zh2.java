package defpackage;

import android.util.Size;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.File;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zh2  reason: default package */
/* loaded from: classes.dex */
public final class zh2 implements Comparator {
    public static final zh2 b = new zh2(0);
    public static final zh2 c = new zh2(1);
    public static final zh2 d = new zh2(2);
    public static final zh2 e = new zh2(3);
    public static final zh2 f = new zh2(4);
    public final /* synthetic */ int a;

    public /* synthetic */ zh2(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object[], java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ?? r0;
        ?? r4;
        int i;
        int i2;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        switch (this.a) {
            case 0:
                vh2 vh2Var = (vh2) obj;
                vh2 vh2Var2 = (vh2) obj2;
                if (yh2.A(vh2Var) && yh2.A(vh2Var2)) {
                    sm3 f0 = nc1.f0(vh2Var);
                    sm3 f02 = nc1.f0(vh2Var2);
                    if (!nb3.k(f0, f02)) {
                        sm3[] sm3VarArr = new sm3[16];
                        int i5 = 0;
                        while (f0 != null) {
                            int i6 = i5 + 1;
                            if (sm3VarArr.length < i6) {
                                int length = sm3VarArr.length;
                                ?? r42 = new Object[Math.max(i6, length * 2)];
                                System.arraycopy(sm3VarArr, 0, r42, 0, length);
                                sm3VarArr = r42;
                            }
                            if (i5 != 0) {
                                System.arraycopy(sm3VarArr, 0, sm3VarArr, 0 + 1, i5 + 0);
                            }
                            sm3VarArr[0] = f0;
                            i5++;
                            f0 = f0.v();
                        }
                        sm3[] sm3VarArr2 = new sm3[16];
                        int i7 = 0;
                        while (f02 != null) {
                            int i8 = i7 + 1;
                            if (sm3VarArr2.length < i8) {
                                int length2 = sm3VarArr2.length;
                                ?? r43 = new Object[Math.max(i8, length2 * 2)];
                                System.arraycopy(sm3VarArr2, 0, r43, 0, length2);
                                sm3VarArr2 = r43;
                            }
                            if (i7 != 0) {
                                System.arraycopy(sm3VarArr2, 0, sm3VarArr2, 0 + 1, i7 + 0);
                            }
                            sm3VarArr2[0] = f02;
                            i7++;
                            f02 = f02.v();
                        }
                        int min = Math.min(i5 - 1, i7 - 1);
                        if (min >= 0) {
                            int i9 = 0;
                            while (nb3.k(sm3VarArr[i9], sm3VarArr2[i9])) {
                                if (i9 != min) {
                                    i9++;
                                }
                            }
                            return nb3.p(sm3VarArr[i9].w(), sm3VarArr2[i9].w());
                        }
                        i.m("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else if (yh2.A(vh2Var)) {
                    return -1;
                } else {
                    if (yh2.A(vh2Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                of5 h = ((xa6) obj).h();
                of5 h2 = ((xa6) obj2).h();
                int compare = Float.compare(h.a, h2.a);
                if (compare == 0) {
                    int compare2 = Float.compare(h.b, h2.b);
                    if (compare2 == 0) {
                        int compare3 = Float.compare(h.d, h2.d);
                        if (compare3 == 0) {
                            return Float.compare(h.c, h2.c);
                        }
                        return compare3;
                    }
                    return compare2;
                }
                return compare;
            case 2:
                sm3 sm3Var = (sm3) obj;
                sm3 sm3Var2 = (sm3) obj2;
                int p = nb3.p(sm3Var2.l0, sm3Var.l0);
                if (p == 0) {
                    return nb3.p(sm3Var.hashCode(), sm3Var2.hashCode());
                }
                return p;
            case 3:
                of5 h3 = ((xa6) obj).h();
                of5 h4 = ((xa6) obj2).h();
                int compare4 = Float.compare(h4.c, h3.c);
                if (compare4 == 0) {
                    int compare5 = Float.compare(h3.b, h4.b);
                    if (compare5 == 0) {
                        int compare6 = Float.compare(h3.d, h4.d);
                        if (compare6 == 0) {
                            return Float.compare(h4.a, h3.a);
                        }
                        return compare6;
                    }
                    return compare5;
                }
                return compare4;
            case 4:
                vr4 vr4Var = (vr4) obj;
                vr4 vr4Var2 = (vr4) obj2;
                int compare7 = Float.compare(((of5) vr4Var.A).b, ((of5) vr4Var2.A).b);
                if (compare7 == 0) {
                    return Float.compare(((of5) vr4Var.A).d, ((of5) vr4Var2.A).d);
                }
                return compare7;
            case 5:
                return g04.z(Integer.valueOf(((l6) obj).getDisplayOrder()), Integer.valueOf(((l6) obj2).getDisplayOrder()));
            case 6:
                return g04.z(Integer.valueOf(((g6) obj).getDisplayOrder()), Integer.valueOf(((g6) obj2).getDisplayOrder()));
            case 7:
                return g04.z(Integer.valueOf(((ep) obj).b), Integer.valueOf(((ep) obj2).b));
            case 8:
                return g04.z(Integer.valueOf(((ep) obj).b), Integer.valueOf(((ep) obj2).b));
            case 9:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int min2 = Math.min(str.length(), str2.length());
                int i10 = 4;
                while (true) {
                    if (i10 < min2) {
                        char charAt = str.charAt(i10);
                        char charAt2 = str2.charAt(i10);
                        if (charAt != charAt2) {
                            if (nb3.p(charAt, charAt2) < 0) {
                                return -1;
                            }
                        } else {
                            i10++;
                        }
                    } else {
                        int length3 = str.length();
                        int length4 = str2.length();
                        if (length3 == length4) {
                            return 0;
                        }
                        if (length3 < length4) {
                            return -1;
                        }
                    }
                }
                return 1;
            case 10:
                WeakHashMap weakHashMap = ao7.a;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                if (z >= z2) {
                    return 0;
                }
                return 1;
            case 11:
                return g04.z((String) ((vr4) obj).A, (String) ((vr4) obj2).A);
            case 12:
                sm3 sm3Var3 = (sm3) obj;
                sm3 sm3Var4 = (sm3) obj2;
                int p2 = nb3.p(sm3Var3.l0, sm3Var4.l0);
                if (p2 == 0) {
                    return nb3.p(sm3Var3.hashCode(), sm3Var4.hashCode());
                }
                return p2;
            case 13:
                return g04.z(Integer.valueOf(((h3) obj).a.getDisplayOrder()), Integer.valueOf(((h3) obj2).a.getDisplayOrder()));
            case 14:
                return g04.z(((lb2) obj).a.toString(), ((lb2) obj2).a.toString());
            case 15:
                return g04.z(((kw5) obj).a.toString(), ((kw5) obj2).a.toString());
            case 16:
                return g04.z(Float.valueOf(((ta7) obj).c.top), Float.valueOf(((ta7) obj2).c.top));
            case 17:
                cr2 cr2Var = (cr2) obj;
                cr2 cr2Var2 = (cr2) obj2;
                RecyclerView recyclerView = cr2Var.d;
                if (recyclerView == null) {
                    r0 = true;
                } else {
                    r0 = false;
                }
                if (cr2Var2.d == null) {
                    r4 = true;
                } else {
                    r4 = false;
                }
                if (r0 != r4) {
                    if (recyclerView != null) {
                        return -1;
                    }
                } else {
                    boolean z3 = cr2Var.a;
                    if (z3 != cr2Var2.a) {
                        if (z3) {
                            return -1;
                        }
                    } else {
                        int i11 = cr2Var2.b - cr2Var.b;
                        if (i11 == 0) {
                            int i12 = cr2Var.c - cr2Var2.c;
                            if (i12 == 0) {
                                return 0;
                            }
                            return i12;
                        }
                        return i11;
                    }
                }
                return 1;
            case 18:
                return Integer.compare(((rg3) obj).a, ((rg3) obj2).a);
            case 19:
                return g04.z(Integer.valueOf(!((j05) obj).d ? 1 : 0), Integer.valueOf(!((j05) obj2).d ? 1 : 0));
            case 20:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return g04.z(Long.valueOf(size.getWidth() * size.getHeight()), Long.valueOf(size2.getWidth() * size2.getHeight()));
            case 22:
                return g04.z(Integer.valueOf(((y54) obj).a()), Integer.valueOf(((y54) obj2).a()));
            case ConnectionResult.API_DISABLED /* 23 */:
                return g04.z((Float) ((vr4) obj).B, (Float) ((vr4) obj2).B);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return g04.z(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            case 25:
                return g04.z(((hm4) obj2).d, ((hm4) obj).d);
            case SubAllocator.N4 /* 26 */:
                return ((en6) obj).B - ((en6) obj2).B;
            case 27:
                return g04.z((Integer) ((vr4) obj2).B, (Integer) ((vr4) obj).B);
            case 28:
                String str3 = (String) obj;
                str3.getClass();
                StringBuilder sb = new StringBuilder();
                int length5 = str3.length();
                for (int i13 = 0; i13 < length5; i13++) {
                    char charAt3 = str3.charAt(i13);
                    if (Character.isDigit(charAt3)) {
                        sb.append(charAt3);
                    }
                }
                Integer h0 = xs6.h0(sb.toString());
                if (h0 != null) {
                    i = h0.intValue();
                } else {
                    i = Integer.MAX_VALUE;
                }
                Integer valueOf = Integer.valueOf(i);
                String str4 = (String) obj2;
                str4.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length6 = str4.length();
                while (i4 < length6) {
                    char charAt4 = str4.charAt(i4);
                    if (Character.isDigit(charAt4)) {
                        sb2.append(charAt4);
                    }
                    i4++;
                }
                Integer h02 = xs6.h0(sb2.toString());
                if (h02 != null) {
                    i3 = h02.intValue();
                }
                return g04.z(valueOf, Integer.valueOf(i3));
            default:
                String str5 = (String) ((Map.Entry) obj).getKey();
                StringBuilder sb3 = new StringBuilder();
                int length7 = str5.length();
                for (int i14 = 0; i14 < length7; i14++) {
                    char charAt5 = str5.charAt(i14);
                    if (Character.isDigit(charAt5)) {
                        sb3.append(charAt5);
                    }
                }
                Integer h03 = xs6.h0(sb3.toString());
                if (h03 != null) {
                    i2 = h03.intValue();
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                Integer valueOf2 = Integer.valueOf(i2);
                String str6 = (String) ((Map.Entry) obj2).getKey();
                StringBuilder sb4 = new StringBuilder();
                int length8 = str6.length();
                while (i4 < length8) {
                    char charAt6 = str6.charAt(i4);
                    if (Character.isDigit(charAt6)) {
                        sb4.append(charAt6);
                    }
                    i4++;
                }
                Integer h04 = xs6.h0(sb4.toString());
                if (h04 != null) {
                    i3 = h04.intValue();
                }
                return g04.z(valueOf2, Integer.valueOf(i3));
        }
    }
}
