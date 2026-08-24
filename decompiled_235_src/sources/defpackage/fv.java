package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fv */
/* loaded from: classes.dex */
public abstract class fv extends nc1 {
    public static void A0(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList C0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object D0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        fa6.e("Array is empty.");
        return null;
    }

    public static Object E0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j93, l93] */
    public static l93 F0(int[] iArr) {
        return new j93(0, iArr.length - 1, 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j93, l93] */
    public static l93 G0(Object[] objArr) {
        objArr.getClass();
        return new j93(0, objArr.length - 1, 1);
    }

    public static int H0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Integer I0(int[] iArr, int i) {
        if (i >= 0 && i < iArr.length) {
            return Integer.valueOf(iArr[i]);
        }
        return null;
    }

    public static Object J0(int i, Object[] objArr) {
        objArr.getClass();
        if (i >= 0 && i < objArr.length) {
            return objArr[i];
        }
        return null;
    }

    public static int K0(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String L0(byte[] bArr, qn2 qn2Var) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) qn2Var.g(Byte.valueOf(b)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String M0(Object[] objArr, String str, String str2, vn0 vn0Var, int i) {
        if ((i & 32) != 0) {
            vn0Var = null;
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ", ");
            }
            hi2.s(sb, obj, vn0Var);
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public static Object[] N0(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static char O0(char[] cArr) {
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            i.h("Array has more than one element.");
            return (char) 0;
        }
        fa6.e("Array is empty.");
        return (char) 0;
    }

    public static final void P0(Object[] objArr, LinkedHashSet linkedHashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static List Q0(double[] dArr) {
        dArr.getClass();
        int length = dArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(dArr.length);
                for (double d : dArr) {
                    arrayList.add(Double.valueOf(d));
                }
                return arrayList;
            }
            return hf.b0(Double.valueOf(dArr[0]));
        }
        return yt1.A;
    }

    public static List R0(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(fArr.length);
                for (float f : fArr) {
                    arrayList.add(Float.valueOf(f));
                }
                return arrayList;
            }
            return hf.b0(Float.valueOf(fArr[0]));
        }
        return yt1.A;
    }

    public static List S0(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                for (long j : jArr) {
                    arrayList.add(Long.valueOf(j));
                }
                return arrayList;
            }
            return hf.b0(Long.valueOf(jArr[0]));
        }
        return yt1.A;
    }

    public static List T0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                List asList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
                asList.getClass();
                return asList;
            }
            return hf.b0(objArr[0]);
        }
        return yt1.A;
    }

    public static List U0(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(zArr.length);
                for (boolean z : zArr) {
                    arrayList.add(Boolean.valueOf(z));
                }
                return arrayList;
            }
            return hf.b0(Boolean.valueOf(zArr[0]));
        }
        return yt1.A;
    }

    public static Set V0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(c14.k0(objArr.length));
                P0(objArr, linkedHashSet);
                return linkedHashSet;
            }
            return ii2.R(objArr[0]);
        }
        return du1.A;
    }

    public static Integer[] W0(int[] iArr) {
        iArr.getClass();
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    public static ArrayList X0(Object[] objArr, Object[] objArr2) {
        int min = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new vr4(objArr[i], objArr2[i]));
        }
        return arrayList;
    }

    public static List l0(Object[] objArr) {
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static boolean m0(int[] iArr, int i) {
        iArr.getClass();
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (i == iArr[i2]) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return false;
        }
        return true;
    }

    public static boolean n0(long[] jArr, long j) {
        int length = jArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (j == jArr[i]) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    public static boolean o0(Object[] objArr, Object obj) {
        objArr.getClass();
        if (K0(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean p0(Object[] objArr, Object[] objArr2) {
        if (objArr != objArr2) {
            if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    Object obj2 = objArr2[i];
                    if (obj != obj2) {
                        if (obj != null && obj2 != null) {
                            if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                                if (!p0((Object[]) obj, (Object[]) obj2)) {
                                }
                            } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                                if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                                }
                            } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                                if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                                }
                            } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                                if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                                }
                            } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                                if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                                }
                            } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                                if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                                }
                            } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                                if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                                }
                            } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                                if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                                }
                            } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                                if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                                }
                            } else if ((obj instanceof af7) && (obj2 instanceof af7)) {
                                if (!Arrays.equals(((af7) obj).A, ((af7) obj2).A)) {
                                }
                            } else if ((obj instanceof yf7) && (obj2 instanceof yf7)) {
                                if (!Arrays.equals(((yf7) obj).A, ((yf7) obj2).A)) {
                                }
                            } else if ((obj instanceof nf7) && (obj2 instanceof nf7)) {
                                if (!Arrays.equals(((nf7) obj).A, ((nf7) obj2).A)) {
                                }
                            } else if ((obj instanceof sf7) && (obj2 instanceof sf7)) {
                                if (!Arrays.equals(((sf7) obj).A, ((sf7) obj2).A)) {
                                }
                            } else if (!obj.equals(obj2)) {
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static void q0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void r0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void s0(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void t0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void u0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        q0(0, i, i2, bArr, bArr2);
    }

    public static /* synthetic */ void v0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        r0(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void w0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        t0(objArr, objArr2, 0, i, i2);
    }

    public static byte[] x0(byte[] bArr, int i, int i2) {
        bArr.getClass();
        nc1.I(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static Object[] y0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        nc1.I(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static void z0(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }
}
