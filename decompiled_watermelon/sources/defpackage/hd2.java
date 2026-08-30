package defpackage;

import android.util.Size;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hd2  reason: default package */
/* loaded from: classes.dex */
public final class hd2 implements Comparator {
    public static final hd2 b = new hd2(0);
    public static final hd2 c = new hd2(1);
    public static final hd2 d = new hd2(2);
    public static final hd2 e = new hd2(3);
    public static final hd2 f = new hd2(4);
    public final /* synthetic */ int a;

    public /* synthetic */ hd2(int i) {
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
        int i3 = this.a;
        int i4 = Preference.DEFAULT_ORDER;
        int i5 = 0;
        switch (i3) {
            case 0:
                ed2 ed2Var = (ed2) obj;
                ed2 ed2Var2 = (ed2) obj2;
                if (ii7.i(ed2Var) && ii7.i(ed2Var2)) {
                    vf3 P = l.P(ed2Var);
                    vf3 P2 = l.P(ed2Var2);
                    if (!b53.x(P, P2)) {
                        vf3[] vf3VarArr = new vf3[16];
                        int i6 = 0;
                        while (P != null) {
                            int i7 = i6 + 1;
                            if (vf3VarArr.length < i7) {
                                int length = vf3VarArr.length;
                                ?? r42 = new Object[Math.max(i7, length * 2)];
                                System.arraycopy(vf3VarArr, 0, r42, 0, length);
                                vf3VarArr = r42;
                            }
                            if (i6 != 0) {
                                System.arraycopy(vf3VarArr, 0, vf3VarArr, 0 + 1, i6 + 0);
                            }
                            vf3VarArr[0] = P;
                            i6++;
                            P = P.u();
                        }
                        vf3[] vf3VarArr2 = new vf3[16];
                        int i8 = 0;
                        while (P2 != null) {
                            int i9 = i8 + 1;
                            if (vf3VarArr2.length < i9) {
                                int length2 = vf3VarArr2.length;
                                ?? r43 = new Object[Math.max(i9, length2 * 2)];
                                System.arraycopy(vf3VarArr2, 0, r43, 0, length2);
                                vf3VarArr2 = r43;
                            }
                            if (i8 != 0) {
                                System.arraycopy(vf3VarArr2, 0, vf3VarArr2, 0 + 1, i8 + 0);
                            }
                            vf3VarArr2[0] = P2;
                            i8++;
                            P2 = P2.u();
                        }
                        int min = Math.min(i6 - 1, i8 - 1);
                        if (min >= 0) {
                            int i10 = 0;
                            while (b53.x(vf3VarArr[i10], vf3VarArr2[i10])) {
                                if (i10 != min) {
                                    i10++;
                                }
                            }
                            return b53.E(vf3VarArr[i10].v(), vf3VarArr2[i10].v());
                        }
                        i.n("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else if (ii7.i(ed2Var)) {
                    return -1;
                } else {
                    if (ii7.i(ed2Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                y55 h = ((iz5) obj).h();
                y55 h2 = ((iz5) obj2).h();
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
                vf3 vf3Var = (vf3) obj;
                vf3 vf3Var2 = (vf3) obj2;
                int E = b53.E(vf3Var2.k0, vf3Var.k0);
                if (E == 0) {
                    return b53.E(vf3Var.hashCode(), vf3Var2.hashCode());
                }
                return E;
            case 3:
                y55 h3 = ((iz5) obj).h();
                y55 h4 = ((iz5) obj2).h();
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
                ti4 ti4Var = (ti4) obj;
                ti4 ti4Var2 = (ti4) obj2;
                int compare7 = Float.compare(((y55) ti4Var.A).b, ((y55) ti4Var2.A).b);
                if (compare7 == 0) {
                    return Float.compare(((y55) ti4Var.A).d, ((y55) ti4Var2.A).d);
                }
                return compare7;
            case 5:
                return iq2.i(Integer.valueOf(((k6) obj).getDisplayOrder()), Integer.valueOf(((k6) obj2).getDisplayOrder()));
            case ig7.b /* 6 */:
                return iq2.i(Integer.valueOf(((f6) obj).getDisplayOrder()), Integer.valueOf(((f6) obj2).getDisplayOrder()));
            case 7:
                return iq2.i(Integer.valueOf(((so) obj).b), Integer.valueOf(((so) obj2).b));
            case 8:
                return iq2.i(Integer.valueOf(((so) obj).b), Integer.valueOf(((so) obj2).b));
            case 9:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int min2 = Math.min(str.length(), str2.length());
                int i11 = 4;
                while (true) {
                    if (i11 < min2) {
                        char charAt = str.charAt(i11);
                        char charAt2 = str2.charAt(i11);
                        if (charAt != charAt2) {
                            if (b53.E(charAt, charAt2) < 0) {
                                return -1;
                            }
                        } else {
                            i11++;
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
                WeakHashMap weakHashMap = aa7.a;
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
                return iq2.i((String) ((ti4) obj).A, (String) ((ti4) obj2).A);
            case mj2.L /* 12 */:
                vf3 vf3Var3 = (vf3) obj;
                vf3 vf3Var4 = (vf3) obj2;
                int E2 = b53.E(vf3Var3.k0, vf3Var4.k0);
                if (E2 == 0) {
                    return b53.E(vf3Var3.hashCode(), vf3Var4.hashCode());
                }
                return E2;
            case 13:
                return iq2.i(Integer.valueOf(((f3) obj).a.getDisplayOrder()), Integer.valueOf(((f3) obj2).a.getDisplayOrder()));
            case 14:
                return iq2.i(((r62) obj).a.toString(), ((r62) obj2).a.toString());
            case ig7.e /* 15 */:
                return iq2.i(((vl5) obj).a.toString(), ((vl5) obj2).a.toString());
            case 16:
                xk2 xk2Var = (xk2) obj;
                xk2 xk2Var2 = (xk2) obj2;
                RecyclerView recyclerView = xk2Var.d;
                if (recyclerView == null) {
                    r0 = true;
                } else {
                    r0 = false;
                }
                if (xk2Var2.d == null) {
                    r4 = true;
                } else {
                    r4 = false;
                }
                if (r0 != r4) {
                    if (recyclerView != null) {
                        return -1;
                    }
                } else {
                    boolean z3 = xk2Var.a;
                    if (z3 != xk2Var2.a) {
                        if (z3) {
                            return -1;
                        }
                    } else {
                        int i12 = xk2Var2.b - xk2Var.b;
                        if (i12 == 0) {
                            int i13 = xk2Var.c - xk2Var2.c;
                            if (i13 == 0) {
                                return 0;
                            }
                            return i13;
                        }
                        return i12;
                    }
                }
                return 1;
            case 17:
                return Integer.compare(((y93) obj).a, ((y93) obj2).a);
            case 18:
                return iq2.i(Integer.valueOf(!((gr4) obj).d ? 1 : 0), Integer.valueOf(!((gr4) obj2).d ? 1 : 0));
            case 19:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 20:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return iq2.i(Long.valueOf(size.getWidth() * size.getHeight()), Long.valueOf(size2.getWidth() * size2.getHeight()));
            case 21:
                return iq2.i(Integer.valueOf(((fy3) obj).a()), Integer.valueOf(((fy3) obj2).a()));
            case 22:
                return iq2.i(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            case 23:
                return ((ob6) obj).B - ((ob6) obj2).B;
            case 24:
                return iq2.i((Integer) ((ti4) obj2).B, (Integer) ((ti4) obj).B);
            case 25:
                String str3 = (String) obj;
                str3.getClass();
                StringBuilder sb = new StringBuilder();
                int length5 = str3.length();
                for (int i14 = 0; i14 < length5; i14++) {
                    char charAt3 = str3.charAt(i14);
                    if (Character.isDigit(charAt3)) {
                        sb.append(charAt3);
                    }
                }
                Integer o0 = gh6.o0(sb.toString());
                if (o0 != null) {
                    i = o0.intValue();
                } else {
                    i = Integer.MAX_VALUE;
                }
                Integer valueOf = Integer.valueOf(i);
                String str4 = (String) obj2;
                str4.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length6 = str4.length();
                while (i5 < length6) {
                    char charAt4 = str4.charAt(i5);
                    if (Character.isDigit(charAt4)) {
                        sb2.append(charAt4);
                    }
                    i5++;
                }
                Integer o02 = gh6.o0(sb2.toString());
                if (o02 != null) {
                    i4 = o02.intValue();
                }
                return iq2.i(valueOf, Integer.valueOf(i4));
            case 26:
                String str5 = (String) ((Map.Entry) obj).getKey();
                StringBuilder sb3 = new StringBuilder();
                int length7 = str5.length();
                for (int i15 = 0; i15 < length7; i15++) {
                    char charAt5 = str5.charAt(i15);
                    if (Character.isDigit(charAt5)) {
                        sb3.append(charAt5);
                    }
                }
                Integer o03 = gh6.o0(sb3.toString());
                if (o03 != null) {
                    i2 = o03.intValue();
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                Integer valueOf2 = Integer.valueOf(i2);
                String str6 = (String) ((Map.Entry) obj2).getKey();
                StringBuilder sb4 = new StringBuilder();
                int length8 = str6.length();
                while (i5 < length8) {
                    char charAt6 = str6.charAt(i5);
                    if (Character.isDigit(charAt6)) {
                        sb4.append(charAt6);
                    }
                    i5++;
                }
                Integer o04 = gh6.o0(sb4.toString());
                if (o04 != null) {
                    i4 = o04.intValue();
                }
                return iq2.i(valueOf2, Integer.valueOf(i4));
            case 27:
                return iq2.i(Integer.valueOf(((RewindSaveState) obj2).getFrame()), Integer.valueOf(((RewindSaveState) obj).getFrame()));
            case 28:
                return iq2.i(Integer.valueOf(((f3) obj).a.getDisplayOrder()), Integer.valueOf(((f3) obj2).a.getDisplayOrder()));
            default:
                String str7 = ((qo5) obj).c;
                Locale locale = Locale.ROOT;
                String lowerCase = str7.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((qo5) obj2).c.toLowerCase(locale);
                lowerCase2.getClass();
                return iq2.i(lowerCase, lowerCase2);
        }
    }
}
