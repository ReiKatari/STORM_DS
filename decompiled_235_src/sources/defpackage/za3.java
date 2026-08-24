package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: za3  reason: default package */
/* loaded from: classes.dex */
public final class za3 extends dt0 {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ za3(boolean z, int i) {
        super(z);
        this.q = i;
    }

    @Override // defpackage.fd4
    public final Object a(Bundle bundle, String str) {
        int i = this.q;
        q50 q50Var = fd4.n;
        ArrayList arrayList = null;
        switch (i) {
            case 0:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                double[] doubleArray = bundle.getDoubleArray(str);
                if (doubleArray != null) {
                    return doubleArray;
                }
                xk2.B(str);
                throw null;
            case 1:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                double[] doubleArray2 = bundle.getDoubleArray(str);
                if (doubleArray2 != null) {
                    return fv.Q0(doubleArray2);
                }
                xk2.B(str);
                throw null;
            case 2:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                String[] Q = uj2.Q(bundle, str);
                ArrayList arrayList2 = new ArrayList(Q.length);
                for (String str2 : Q) {
                    arrayList2.add((String) q50Var.d(str2));
                }
                return (String[]) arrayList2.toArray(new String[0]);
            default:
                if (i61.C(bundle, str, str) && !uj2.X(bundle, str)) {
                    List<String> T0 = fv.T0(uj2.Q(bundle, str));
                    arrayList = new ArrayList(ht0.v0(T0, 10));
                    for (String str3 : T0) {
                        arrayList.add((String) q50Var.d(str3));
                    }
                }
                return arrayList;
        }
    }

    @Override // defpackage.fd4
    public final String b() {
        switch (this.q) {
            case 0:
                return "double[]";
            case 1:
                return "List<Double>";
            case 2:
                return "string_nullable[]";
            default:
                return "List<String?>";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fd4
    public final Object c(Object obj, String str) {
        int i = this.q;
        q50 q50Var = fd4.n;
        switch (i) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr != null) {
                    double[] dArr2 = {Double.parseDouble(str)};
                    int length = dArr.length;
                    double[] copyOf = Arrays.copyOf(dArr, length + 1);
                    System.arraycopy(dArr2, 0, copyOf, length, 1);
                    return copyOf;
                }
                return new double[]{Double.parseDouble(str)};
            case 1:
                List list = (List) obj;
                if (list != null) {
                    return gt0.V0(list, hf.b0(Double.valueOf(Double.parseDouble(str))));
                }
                return hf.b0(Double.valueOf(Double.parseDouble(str)));
            case 2:
                String[] strArr = (String[]) obj;
                return strArr != null ? (String[]) fv.N0(strArr, new String[]{q50Var.d(str)}) : new String[]{q50Var.d(str)};
            default:
                List list2 = (List) obj;
                if (list2 != null) {
                    return gt0.V0(list2, hf.b0(q50Var.d(str)));
                }
                return hf.b0(q50Var.d(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fd4
    public final Object d(String str) {
        int i = this.q;
        q50 q50Var = fd4.n;
        switch (i) {
            case 0:
                return new double[]{Double.parseDouble(str)};
            case 1:
                return hf.b0(Double.valueOf(Double.parseDouble(str)));
            case 2:
                return new String[]{q50Var.d(str)};
            default:
                return hf.b0(q50Var.d(str));
        }
    }

    @Override // defpackage.fd4
    public final void e(Bundle bundle, String str, Object obj) {
        int i = 0;
        switch (this.q) {
            case 0:
                double[] dArr = (double[]) obj;
                str.getClass();
                if (dArr == null) {
                    bundle.putString(str, null);
                    return;
                } else {
                    bundle.putDoubleArray(str, dArr);
                    return;
                }
            case 1:
                List<Number> list = (List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, null);
                    return;
                }
                double[] dArr2 = new double[list.size()];
                for (Number number : list) {
                    dArr2[i] = number.doubleValue();
                    i++;
                }
                bundle.putDoubleArray(str, dArr2);
                return;
            case 2:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                    return;
                }
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str2 : strArr) {
                    if (str2 == null) {
                        str2 = "null";
                    }
                    arrayList.add(str2);
                }
                String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                strArr2.getClass();
                bundle.putStringArray(str, strArr2);
                return;
            default:
                List<String> list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList(ht0.v0(list2, 10));
                for (String str3 : list2) {
                    if (str3 == null) {
                        str3 = "null";
                    }
                    arrayList2.add(str3);
                }
                String[] strArr3 = (String[]) arrayList2.toArray(new String[0]);
                strArr3.getClass();
                bundle.putStringArray(str, strArr3);
                return;
        }
    }

    @Override // defpackage.dt0
    public final Object g() {
        int i = this.q;
        yt1 yt1Var = yt1.A;
        switch (i) {
            case 0:
                return new double[0];
            case 1:
                return yt1Var;
            case 2:
                return new String[0];
            default:
                return yt1Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [yt1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    @Override // defpackage.dt0
    public final List h(Object obj) {
        String str;
        String str2;
        int i = this.q;
        ?? r3 = yt1.A;
        switch (i) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr != null) {
                    List<Number> Q0 = fv.Q0(dArr);
                    r3 = new ArrayList(ht0.v0(Q0, 10));
                    for (Number number : Q0) {
                        r3.add(String.valueOf(number.doubleValue()));
                    }
                }
                return r3;
            case 1:
                List<Number> list = (List) obj;
                if (list != null) {
                    r3 = new ArrayList(ht0.v0(list, 10));
                    for (Number number2 : list) {
                        r3.add(String.valueOf(number2.doubleValue()));
                    }
                }
                return r3;
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    r3 = new ArrayList(strArr.length);
                    for (String str3 : strArr) {
                        if (str3 == null) {
                            str = "null";
                        } else {
                            str = Uri.encode(str3, null);
                            str.getClass();
                        }
                        r3.add(str);
                    }
                }
                return r3;
            default:
                List<String> list2 = (List) obj;
                if (list2 != null) {
                    r3 = new ArrayList(ht0.v0(list2, 10));
                    for (String str4 : list2) {
                        if (str4 == null) {
                            str2 = "null";
                        } else {
                            str2 = Uri.encode(str4, null);
                            str2.getClass();
                        }
                        r3.add(str2);
                    }
                }
                return r3;
        }
    }
}
