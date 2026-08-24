package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p50  reason: default package */
/* loaded from: classes.dex */
public final class p50 extends dt0 {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p50(boolean z, int i) {
        super(z);
        this.q = i;
    }

    public static int[] i(String str) {
        return new int[]{((Number) fd4.b.d(str)).intValue()};
    }

    public static long[] j(String str) {
        return new long[]{((Number) fd4.e.d(str)).longValue()};
    }

    public static boolean[] k(String str) {
        return new boolean[]{((Boolean) fd4.k.d(str)).booleanValue()};
    }

    @Override // defpackage.fd4
    public final Object a(Bundle bundle, String str) {
        switch (this.q) {
            case 0:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                xk2.B(str);
                throw null;
            case 1:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 != null) {
                    return fv.U0(booleanArray2);
                }
                xk2.B(str);
                throw null;
            case 2:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                xk2.B(str);
                throw null;
            case 3:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return fv.R0(floatArray2);
                }
                xk2.B(str);
                throw null;
            case 4:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                xk2.B(str);
                throw null;
            case 5:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 != null) {
                    int length = intArray2.length;
                    if (length != 0) {
                        if (length != 1) {
                            ArrayList arrayList = new ArrayList(intArray2.length);
                            for (int i : intArray2) {
                                arrayList.add(Integer.valueOf(i));
                            }
                            return arrayList;
                        }
                        return hf.b0(Integer.valueOf(intArray2[0]));
                    }
                    return yt1.A;
                }
                xk2.B(str);
                throw null;
            case 6:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                xk2.B(str);
                throw null;
            case 7:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 != null) {
                    return fv.S0(longArray2);
                }
                xk2.B(str);
                throw null;
            case 8:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                return uj2.Q(bundle, str);
            default:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                return fv.T0(uj2.Q(bundle, str));
        }
    }

    @Override // defpackage.fd4
    public final String b() {
        switch (this.q) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // defpackage.fd4
    public final Object c(Object obj, String str) {
        switch (this.q) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null) {
                    boolean[] k = k(str);
                    int length = zArr.length;
                    boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                    System.arraycopy(k, 0, copyOf, length, 1);
                    return copyOf;
                }
                return k(str);
            case 1:
                List list = (List) obj;
                q50 q50Var = fd4.k;
                if (list != null) {
                    return gt0.V0(list, hf.b0(q50Var.d(str)));
                }
                return hf.b0(q50Var.d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null) {
                    float[] fArr2 = {Float.parseFloat(str)};
                    int length2 = fArr.length;
                    float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                    System.arraycopy(fArr2, 0, copyOf2, length2, 1);
                    return copyOf2;
                }
                return new float[]{Float.parseFloat(str)};
            case 3:
                List list2 = (List) obj;
                if (list2 != null) {
                    return gt0.V0(list2, hf.b0(Float.valueOf(Float.parseFloat(str))));
                }
                return hf.b0(Float.valueOf(Float.parseFloat(str)));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    int[] i = i(str);
                    int length3 = iArr.length;
                    int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                    System.arraycopy(i, 0, copyOf3, length3, 1);
                    return copyOf3;
                }
                return i(str);
            case 5:
                List list3 = (List) obj;
                q50 q50Var2 = fd4.b;
                if (list3 != null) {
                    return gt0.V0(list3, hf.b0(q50Var2.d(str)));
                }
                return hf.b0(q50Var2.d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr != null) {
                    long[] j = j(str);
                    int length4 = jArr.length;
                    long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                    System.arraycopy(j, 0, copyOf4, length4, 1);
                    return copyOf4;
                }
                return j(str);
            case 7:
                List list4 = (List) obj;
                q50 q50Var3 = fd4.e;
                if (list4 != null) {
                    return gt0.V0(list4, hf.b0(q50Var3.d(str)));
                }
                return hf.b0(q50Var3.d(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    return (String[]) fv.N0(strArr, new String[]{str});
                }
                return new String[]{str};
            default:
                List list5 = (List) obj;
                if (list5 != null) {
                    return gt0.V0(list5, hf.b0(str));
                }
                return hf.b0(str);
        }
    }

    @Override // defpackage.fd4
    public final Object d(String str) {
        switch (this.q) {
            case 0:
                return k(str);
            case 1:
                return hf.b0(fd4.k.d(str));
            case 2:
                return new float[]{Float.parseFloat(str)};
            case 3:
                return hf.b0(Float.valueOf(Float.parseFloat(str)));
            case 4:
                return i(str);
            case 5:
                return hf.b0(fd4.b.d(str));
            case 6:
                return j(str);
            case 7:
                return hf.b0(fd4.e.d(str));
            case 8:
                return new String[]{str};
            default:
                return hf.b0(str);
        }
    }

    @Override // defpackage.fd4
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.q) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                str.getClass();
                if (zArr != null) {
                    bundle.putBooleanArray(str, zArr);
                    return;
                } else {
                    bundle.putString(str, null);
                    return;
                }
            case 1:
                List list = (List) obj;
                str.getClass();
                if (list != null) {
                    bundle.putBooleanArray(str, gt0.g1(list));
                    return;
                } else {
                    bundle.putString(str, null);
                    return;
                }
            case 2:
                float[] fArr = (float[]) obj;
                str.getClass();
                if (fArr != null) {
                    bundle.putFloatArray(str, fArr);
                    return;
                } else {
                    bundle.putString(str, null);
                    return;
                }
            case 3:
                List list2 = (List) obj;
                str.getClass();
                if (list2 != null) {
                    bundle.putFloatArray(str, gt0.i1(list2));
                    return;
                } else {
                    bundle.putString(str, null);
                    return;
                }
            case 4:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr != null) {
                    bundle.putIntArray(str, iArr);
                    return;
                } else {
                    bundle.putString(str, null);
                    return;
                }
            case 5:
                List list3 = (List) obj;
                str.getClass();
                if (list3 != null) {
                    bundle.putIntArray(str, gt0.j1(list3));
                    return;
                }
                return;
            case 6:
                long[] jArr = (long[]) obj;
                str.getClass();
                if (jArr != null) {
                    bundle.putLongArray(str, jArr);
                    return;
                } else {
                    bundle.putString(str, null);
                    return;
                }
            case 7:
                List list4 = (List) obj;
                str.getClass();
                if (list4 != null) {
                    bundle.putLongArray(str, gt0.l1(list4));
                    return;
                } else {
                    bundle.putString(str, null);
                    return;
                }
            case 8:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr != null) {
                    bundle.putStringArray(str, strArr);
                    return;
                } else {
                    bundle.putString(str, null);
                    return;
                }
            default:
                List list5 = (List) obj;
                str.getClass();
                if (list5 != null) {
                    String[] strArr2 = (String[]) list5.toArray(new String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
                    return;
                }
                bundle.putString(str, null);
                return;
        }
    }

    @Override // defpackage.dt0
    public final Object g() {
        int i = this.q;
        yt1 yt1Var = yt1.A;
        switch (i) {
            case 0:
                return new boolean[0];
            case 1:
                return yt1Var;
            case 2:
                return new float[0];
            case 3:
                return yt1Var;
            case 4:
                return new int[0];
            case 5:
                return yt1Var;
            case 6:
                return new long[0];
            case 7:
                return yt1Var;
            case 8:
                return new String[0];
            default:
                return yt1Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, yt1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Iterable] */
    @Override // defpackage.dt0
    public final List h(Object obj) {
        int i = this.q;
        int i2 = 0;
        ?? r3 = yt1.A;
        switch (i) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null) {
                    List<Boolean> U0 = fv.U0(zArr);
                    r3 = new ArrayList(ht0.v0(U0, 10));
                    for (Boolean bool : U0) {
                        r3.add(String.valueOf(bool.booleanValue()));
                    }
                }
                return r3;
            case 1:
                List<Boolean> list = (List) obj;
                if (list != null) {
                    r3 = new ArrayList(ht0.v0(list, 10));
                    for (Boolean bool2 : list) {
                        r3.add(String.valueOf(bool2.booleanValue()));
                    }
                }
                return r3;
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null) {
                    List<Number> R0 = fv.R0(fArr);
                    r3 = new ArrayList(ht0.v0(R0, 10));
                    for (Number number : R0) {
                        r3.add(String.valueOf(number.floatValue()));
                    }
                }
                return r3;
            case 3:
                List<Number> list2 = (List) obj;
                if (list2 != null) {
                    r3 = new ArrayList(ht0.v0(list2, 10));
                    for (Number number2 : list2) {
                        r3.add(String.valueOf(number2.floatValue()));
                    }
                }
                return r3;
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    int length = iArr.length;
                    if (length != 0) {
                        if (length != 1) {
                            r3 = new ArrayList(iArr.length);
                            int length2 = iArr.length;
                            while (i2 < length2) {
                                r3.add(Integer.valueOf(iArr[i2]));
                                i2++;
                            }
                        } else {
                            r3 = hf.b0(Integer.valueOf(iArr[0]));
                        }
                    }
                    ArrayList arrayList = new ArrayList(ht0.v0(r3, 10));
                    for (Number number3 : r3) {
                        arrayList.add(String.valueOf(number3.intValue()));
                    }
                    return arrayList;
                }
                return r3;
            case 5:
                List<Number> list3 = (List) obj;
                if (list3 != null) {
                    r3 = new ArrayList(ht0.v0(list3, 10));
                    for (Number number4 : list3) {
                        r3.add(String.valueOf(number4.intValue()));
                    }
                }
                return r3;
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr != null) {
                    List<Number> S0 = fv.S0(jArr);
                    r3 = new ArrayList(ht0.v0(S0, 10));
                    for (Number number5 : S0) {
                        r3.add(String.valueOf(number5.longValue()));
                    }
                }
                return r3;
            case 7:
                List<Number> list4 = (List) obj;
                if (list4 != null) {
                    r3 = new ArrayList(ht0.v0(list4, 10));
                    for (Number number6 : list4) {
                        r3.add(String.valueOf(number6.longValue()));
                    }
                }
                return r3;
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    r3 = new ArrayList(strArr.length);
                    int length3 = strArr.length;
                    while (i2 < length3) {
                        String str = strArr[i2];
                        str.getClass();
                        String encode = Uri.encode(str, null);
                        encode.getClass();
                        r3.add(encode);
                        i2++;
                    }
                }
                return r3;
            default:
                List<String> list5 = (List) obj;
                if (list5 != null) {
                    r3 = new ArrayList(ht0.v0(list5, 10));
                    for (String str2 : list5) {
                        str2.getClass();
                        String encode2 = Uri.encode(str2, null);
                        encode2.getClass();
                        r3.add(encode2);
                    }
                }
                return r3;
        }
    }
}
