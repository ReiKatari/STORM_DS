package a7;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f550q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, boolean z10) {
        super(z10);
        this.f550q = i2;
    }

    public static int[] i(String str) {
        return new int[]{((Number) k0.f580b.d(str)).intValue()};
    }

    public static long[] j(String str) {
        return new long[]{((Number) k0.f583e.d(str)).longValue()};
    }

    public static boolean[] k(String str) {
        return new boolean[]{((Boolean) k0.f589k.d(str)).booleanValue()};
    }

    @Override // a7.k0
    public final Object a(Bundle bundle, String str) {
        switch (this.f550q) {
            case 0:
                if (!w.d.C(bundle, str, str) || p7.l.v(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                p7.m.z(str);
                throw null;
            case DSiCameraSource.FrontCamera /* 1 */:
                if (!w.d.C(bundle, str, str) || p7.l.v(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 != null) {
                    return zb.k.R(booleanArray2);
                }
                p7.m.z(str);
                throw null;
            case 2:
                if (!w.d.C(bundle, str, str) || p7.l.v(bundle, str)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                p7.m.z(str);
                throw null;
            case 3:
                if (!w.d.C(bundle, str, str) || p7.l.v(bundle, str)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return zb.k.O(floatArray2);
                }
                p7.m.z(str);
                throw null;
            case 4:
                if (!w.d.C(bundle, str, str) || p7.l.v(bundle, str)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                p7.m.z(str);
                throw null;
            case l1.c.f8511g /* 5 */:
                if (!w.d.C(bundle, str, str) || p7.l.v(bundle, str)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 != null) {
                    int length = intArray2.length;
                    if (length != 0) {
                        if (length != 1) {
                            ArrayList arrayList = new ArrayList(intArray2.length);
                            for (int i2 : intArray2) {
                                arrayList.add(Integer.valueOf(i2));
                            }
                            return arrayList;
                        }
                        return p7.t.x(Integer.valueOf(intArray2[0]));
                    }
                    return zb.q.A;
                }
                p7.m.z(str);
                throw null;
            case l1.c.f8509e /* 6 */:
                if (!w.d.C(bundle, str, str) || p7.l.v(bundle, str)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                p7.m.z(str);
                throw null;
            case 7:
                if (!w.d.C(bundle, str, str) || p7.l.v(bundle, str)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 != null) {
                    return zb.k.P(longArray2);
                }
                p7.m.z(str);
                throw null;
            case 8:
                if (w.d.C(bundle, str, str) && !p7.l.v(bundle, str)) {
                    return p7.l.t(bundle, str);
                }
                return null;
            default:
                if (w.d.C(bundle, str, str) && !p7.l.v(bundle, str)) {
                    return zb.k.Q(p7.l.t(bundle, str));
                }
                return null;
        }
    }

    @Override // a7.k0
    public final String b() {
        switch (this.f550q) {
            case 0:
                return "boolean[]";
            case DSiCameraSource.FrontCamera /* 1 */:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case l1.c.f8511g /* 5 */:
                return "List<Int>";
            case l1.c.f8509e /* 6 */:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // a7.k0
    public final Object c(Object obj, String str) {
        switch (this.f550q) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null) {
                    boolean[] k10 = k(str);
                    int length = zArr.length;
                    boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                    System.arraycopy(k10, 0, copyOf, length, 1);
                    return copyOf;
                }
                return k(str);
            case DSiCameraSource.FrontCamera /* 1 */:
                List list = (List) obj;
                e eVar = k0.f589k;
                if (list != null) {
                    return zb.l.e0(list, p7.t.x(eVar.d(str)));
                }
                return p7.t.x(eVar.d(str));
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
                    return zb.l.e0(list2, p7.t.x(Float.valueOf(Float.parseFloat(str))));
                }
                return p7.t.x(Float.valueOf(Float.parseFloat(str)));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    int[] i2 = i(str);
                    int length3 = iArr.length;
                    int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                    System.arraycopy(i2, 0, copyOf3, length3, 1);
                    return copyOf3;
                }
                return i(str);
            case l1.c.f8511g /* 5 */:
                List list3 = (List) obj;
                e eVar2 = k0.f580b;
                if (list3 != null) {
                    return zb.l.e0(list3, p7.t.x(eVar2.d(str)));
                }
                return p7.t.x(eVar2.d(str));
            case l1.c.f8509e /* 6 */:
                long[] jArr = (long[]) obj;
                if (jArr != null) {
                    long[] j2 = j(str);
                    int length4 = jArr.length;
                    long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                    System.arraycopy(j2, 0, copyOf4, length4, 1);
                    return copyOf4;
                }
                return j(str);
            case 7:
                List list4 = (List) obj;
                e eVar3 = k0.f583e;
                if (list4 != null) {
                    return zb.l.e0(list4, p7.t.x(eVar3.d(str)));
                }
                return p7.t.x(eVar3.d(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    int length5 = strArr.length;
                    Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                    System.arraycopy(new String[]{str}, 0, copyOf5, length5, 1);
                    return (String[]) copyOf5;
                }
                return new String[]{str};
            default:
                List list5 = (List) obj;
                if (list5 != null) {
                    return zb.l.e0(list5, p7.t.x(str));
                }
                return p7.t.x(str);
        }
    }

    @Override // a7.k0
    public final Object d(String str) {
        switch (this.f550q) {
            case 0:
                return k(str);
            case DSiCameraSource.FrontCamera /* 1 */:
                return p7.t.x(k0.f589k.d(str));
            case 2:
                return new float[]{Float.parseFloat(str)};
            case 3:
                return p7.t.x(Float.valueOf(Float.parseFloat(str)));
            case 4:
                return i(str);
            case l1.c.f8511g /* 5 */:
                return p7.t.x(k0.f580b.d(str));
            case l1.c.f8509e /* 6 */:
                return j(str);
            case 7:
                return p7.t.x(k0.f583e.d(str));
            case 8:
                return new String[]{str};
            default:
                return p7.t.x(str);
        }
    }

    @Override // a7.k0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f550q) {
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
            case DSiCameraSource.FrontCamera /* 1 */:
                List list = (List) obj;
                str.getClass();
                if (list != null) {
                    bundle.putBooleanArray(str, zb.l.m0(list));
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
                List<Number> list2 = (List) obj;
                str.getClass();
                if (list2 != null) {
                    float[] fArr2 = new float[list2.size()];
                    int i2 = 0;
                    for (Number number : list2) {
                        fArr2[i2] = number.floatValue();
                        i2++;
                    }
                    bundle.putFloatArray(str, fArr2);
                    return;
                }
                bundle.putString(str, null);
                return;
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
            case l1.c.f8511g /* 5 */:
                List list3 = (List) obj;
                str.getClass();
                if (list3 != null) {
                    bundle.putIntArray(str, zb.l.o0(list3));
                    return;
                }
                return;
            case l1.c.f8509e /* 6 */:
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
                List<Number> list4 = (List) obj;
                str.getClass();
                if (list4 != null) {
                    long[] jArr2 = new long[list4.size()];
                    int i10 = 0;
                    for (Number number2 : list4) {
                        jArr2[i10] = number2.longValue();
                        i10++;
                    }
                    bundle.putLongArray(str, jArr2);
                    return;
                }
                bundle.putString(str, null);
                return;
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

    @Override // a7.f
    public final Object g() {
        switch (this.f550q) {
            case 0:
                return new boolean[0];
            case DSiCameraSource.FrontCamera /* 1 */:
                return zb.q.A;
            case 2:
                return new float[0];
            case 3:
                return zb.q.A;
            case 4:
                return new int[0];
            case l1.c.f8511g /* 5 */:
                return zb.q.A;
            case l1.c.f8509e /* 6 */:
                return new long[0];
            case 7:
                return zb.q.A;
            case 8:
                return new String[0];
            default:
                return zb.q.A;
        }
    }

    @Override // a7.f
    public final List h(Object obj) {
        switch (this.f550q) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null) {
                    List<Boolean> R = zb.k.R(zArr);
                    ArrayList arrayList = new ArrayList(zb.m.G(R, 10));
                    for (Boolean bool : R) {
                        arrayList.add(String.valueOf(bool.booleanValue()));
                    }
                    return arrayList;
                }
                return zb.q.A;
            case DSiCameraSource.FrontCamera /* 1 */:
                List<Boolean> list = (List) obj;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(zb.m.G(list, 10));
                    for (Boolean bool2 : list) {
                        arrayList2.add(String.valueOf(bool2.booleanValue()));
                    }
                    return arrayList2;
                }
                return zb.q.A;
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null) {
                    List<Number> O = zb.k.O(fArr);
                    ArrayList arrayList3 = new ArrayList(zb.m.G(O, 10));
                    for (Number number : O) {
                        arrayList3.add(String.valueOf(number.floatValue()));
                    }
                    return arrayList3;
                }
                return zb.q.A;
            case 3:
                List<Number> list2 = (List) obj;
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(zb.m.G(list2, 10));
                    for (Number number2 : list2) {
                        arrayList4.add(String.valueOf(number2.floatValue()));
                    }
                    return arrayList4;
                }
                return zb.q.A;
            case 4:
                int[] iArr = (int[]) obj;
                List<Number> list3 = zb.q.A;
                if (iArr != null) {
                    int length = iArr.length;
                    if (length != 0) {
                        if (length != 1) {
                            ArrayList arrayList5 = new ArrayList(iArr.length);
                            for (int i2 : iArr) {
                                arrayList5.add(Integer.valueOf(i2));
                            }
                            list3 = arrayList5;
                        } else {
                            list3 = p7.t.x(Integer.valueOf(iArr[0]));
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(zb.m.G(list3, 10));
                    for (Number number3 : list3) {
                        arrayList6.add(String.valueOf(number3.intValue()));
                    }
                    return arrayList6;
                }
                return list3;
            case l1.c.f8511g /* 5 */:
                List<Number> list4 = (List) obj;
                if (list4 != null) {
                    ArrayList arrayList7 = new ArrayList(zb.m.G(list4, 10));
                    for (Number number4 : list4) {
                        arrayList7.add(String.valueOf(number4.intValue()));
                    }
                    return arrayList7;
                }
                return zb.q.A;
            case l1.c.f8509e /* 6 */:
                long[] jArr = (long[]) obj;
                if (jArr != null) {
                    List<Number> P = zb.k.P(jArr);
                    ArrayList arrayList8 = new ArrayList(zb.m.G(P, 10));
                    for (Number number5 : P) {
                        arrayList8.add(String.valueOf(number5.longValue()));
                    }
                    return arrayList8;
                }
                return zb.q.A;
            case 7:
                List<Number> list5 = (List) obj;
                if (list5 != null) {
                    ArrayList arrayList9 = new ArrayList(zb.m.G(list5, 10));
                    for (Number number6 : list5) {
                        arrayList9.add(String.valueOf(number6.longValue()));
                    }
                    return arrayList9;
                }
                return zb.q.A;
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    ArrayList arrayList10 = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        str.getClass();
                        String encode = Uri.encode(str, null);
                        encode.getClass();
                        arrayList10.add(encode);
                    }
                    return arrayList10;
                }
                return zb.q.A;
            default:
                List<String> list6 = (List) obj;
                if (list6 != null) {
                    ArrayList arrayList11 = new ArrayList(zb.m.G(list6, 10));
                    for (String str2 : list6) {
                        str2.getClass();
                        String encode2 = Uri.encode(str2, null);
                        encode2.getClass();
                        arrayList11.add(encode2);
                    }
                    return arrayList11;
                }
                return zb.q.A;
        }
    }
}
