package e7;

import a7.k0;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import p7.l;
import p7.m;
import p7.t;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends a7.f {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f4378q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i2, boolean z10) {
        super(z10);
        this.f4378q = i2;
    }

    @Override // a7.k0
    public final Object a(Bundle bundle, String str) {
        switch (this.f4378q) {
            case 0:
                if (!w.d.C(bundle, str, str) || l.v(bundle, str)) {
                    return null;
                }
                double[] doubleArray = bundle.getDoubleArray(str);
                if (doubleArray != null) {
                    return doubleArray;
                }
                m.z(str);
                throw null;
            case DSiCameraSource.FrontCamera /* 1 */:
                if (!w.d.C(bundle, str, str) || l.v(bundle, str)) {
                    return null;
                }
                double[] doubleArray2 = bundle.getDoubleArray(str);
                if (doubleArray2 != null) {
                    return zb.k.N(doubleArray2);
                }
                m.z(str);
                throw null;
            case 2:
                if (w.d.C(bundle, str, str) && !l.v(bundle, str)) {
                    String[] t5 = l.t(bundle, str);
                    ArrayList arrayList = new ArrayList(t5.length);
                    for (String str2 : t5) {
                        arrayList.add((String) k0.f591n.d(str2));
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
                return null;
            default:
                if (w.d.C(bundle, str, str) && !l.v(bundle, str)) {
                    List<String> Q = zb.k.Q(l.t(bundle, str));
                    ArrayList arrayList2 = new ArrayList(zb.m.G(Q, 10));
                    for (String str3 : Q) {
                        arrayList2.add((String) k0.f591n.d(str3));
                    }
                    return arrayList2;
                }
                return null;
        }
    }

    @Override // a7.k0
    public final String b() {
        switch (this.f4378q) {
            case 0:
                return "double[]";
            case DSiCameraSource.FrontCamera /* 1 */:
                return "List<Double>";
            case 2:
                return "string_nullable[]";
            default:
                return "List<String?>";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a7.k0
    public final Object c(Object obj, String str) {
        int i2 = this.f4378q;
        a7.e eVar = k0.f591n;
        switch (i2) {
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
            case DSiCameraSource.FrontCamera /* 1 */:
                List list = (List) obj;
                if (list != null) {
                    return zb.l.e0(list, t.x(Double.valueOf(Double.parseDouble(str))));
                }
                return t.x(Double.valueOf(Double.parseDouble(str)));
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    String[] strArr2 = {eVar.d(str)};
                    int length2 = strArr.length;
                    Object[] copyOf2 = Arrays.copyOf(strArr, length2 + 1);
                    System.arraycopy(strArr2, 0, copyOf2, length2, 1);
                    return (String[]) copyOf2;
                }
                return new String[]{eVar.d(str)};
            default:
                List list2 = (List) obj;
                if (list2 != null) {
                    return zb.l.e0(list2, t.x(eVar.d(str)));
                }
                return t.x(eVar.d(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a7.k0
    public final Object d(String str) {
        int i2 = this.f4378q;
        a7.e eVar = k0.f591n;
        switch (i2) {
            case 0:
                return new double[]{Double.parseDouble(str)};
            case DSiCameraSource.FrontCamera /* 1 */:
                return t.x(Double.valueOf(Double.parseDouble(str)));
            case 2:
                return new String[]{eVar.d(str)};
            default:
                return t.x(eVar.d(str));
        }
    }

    @Override // a7.k0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f4378q) {
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
            case DSiCameraSource.FrontCamera /* 1 */:
                List<Number> list = (List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, null);
                    return;
                }
                double[] dArr2 = new double[list.size()];
                int i2 = 0;
                for (Number number : list) {
                    dArr2[i2] = number.doubleValue();
                    i2++;
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
                ArrayList arrayList2 = new ArrayList(zb.m.G(list2, 10));
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

    @Override // a7.f
    public final Object g() {
        switch (this.f4378q) {
            case 0:
                return new double[0];
            case DSiCameraSource.FrontCamera /* 1 */:
                return q.A;
            case 2:
                return new String[0];
            default:
                return q.A;
        }
    }

    @Override // a7.f
    public final List h(Object obj) {
        String str;
        String str2;
        switch (this.f4378q) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr != null) {
                    List<Number> N = zb.k.N(dArr);
                    ArrayList arrayList = new ArrayList(zb.m.G(N, 10));
                    for (Number number : N) {
                        arrayList.add(String.valueOf(number.doubleValue()));
                    }
                    return arrayList;
                }
                return q.A;
            case DSiCameraSource.FrontCamera /* 1 */:
                List<Number> list = (List) obj;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(zb.m.G(list, 10));
                    for (Number number2 : list) {
                        arrayList2.add(String.valueOf(number2.doubleValue()));
                    }
                    return arrayList2;
                }
                return q.A;
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    ArrayList arrayList3 = new ArrayList(strArr.length);
                    for (String str3 : strArr) {
                        if (str3 != null) {
                            str = Uri.encode(str3, null);
                            str.getClass();
                        } else {
                            str = "null";
                        }
                        arrayList3.add(str);
                    }
                    return arrayList3;
                }
                return q.A;
            default:
                List<String> list2 = (List) obj;
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(zb.m.G(list2, 10));
                    for (String str4 : list2) {
                        if (str4 != null) {
                            str2 = Uri.encode(str4, null);
                            str2.getClass();
                        } else {
                            str2 = "null";
                        }
                        arrayList4.add(str2);
                    }
                    return arrayList4;
                }
                return q.A;
        }
    }
}
