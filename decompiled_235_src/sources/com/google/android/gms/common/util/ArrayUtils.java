package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static <T> T[] concat(T[]... tArr) {
        if (tArr.length != 0) {
            int i = 0;
            for (T[] tArr2 : tArr) {
                i += tArr2.length;
            }
            T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], i);
            int length = tArr[0].length;
            for (int i2 = 1; i2 < tArr.length; i2++) {
                T[] tArr4 = tArr[i2];
                int length2 = tArr4.length;
                System.arraycopy(tArr4, 0, tArr3, length, length2);
                length += length2;
            }
            return tArr3;
        }
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
    }

    public static byte[] concatByteArrays(byte[]... bArr) {
        if (bArr.length != 0) {
            int i = 0;
            for (byte[] bArr2 : bArr) {
                i += bArr2.length;
            }
            byte[] copyOf = Arrays.copyOf(bArr[0], i);
            int length = bArr[0].length;
            for (int i2 = 1; i2 < bArr.length; i2++) {
                byte[] bArr3 = bArr[i2];
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, copyOf, length, length2);
                length += length2;
            }
            return copyOf;
        }
        return new byte[0];
    }

    public static <T> boolean contains(T[] tArr, T t) {
        int i;
        if (tArr != null) {
            i = tArr.length;
        } else {
            i = 0;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            } else if (Objects.equal(tArr[i2], t)) {
                if (i2 >= 0) {
                    return true;
                }
            } else {
                i2++;
            }
        }
        return false;
    }

    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <T> T[] removeAll(T[] tArr, T... tArr2) {
        int length;
        int i;
        if (tArr == null) {
            return null;
        }
        if (tArr2 != null && (length = tArr2.length) != 0) {
            Class<?> cls = tArr2.getClass();
            T[] tArr3 = (T[]) ((Object[]) Array.newInstance(cls.getComponentType(), tArr.length));
            if (length == 1) {
                i = 0;
                for (T t : tArr) {
                    if (!Objects.equal(tArr2[0], t)) {
                        tArr3[i] = t;
                        i++;
                    }
                }
            } else {
                int i2 = 0;
                for (T t2 : tArr) {
                    if (!contains(tArr2, t2)) {
                        tArr3[i2] = t2;
                        i2++;
                    }
                }
                i = i2;
            }
            if (tArr3 == null) {
                return null;
            }
            if (i == tArr3.length) {
                return tArr3;
            }
            return (T[]) Arrays.copyOf(tArr3, i);
        }
        return (T[]) Arrays.copyOf(tArr, tArr.length);
    }

    public static <T> ArrayList<T> toArrayList(T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t : tArr) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public static int[] toPrimitiveArray(Collection<Integer> collection) {
        int i = 0;
        if (collection != null && !collection.isEmpty()) {
            int[] iArr = new int[collection.size()];
            for (Integer num : collection) {
                iArr[i] = num.intValue();
                i++;
            }
            return iArr;
        }
        return new int[0];
    }

    public static Integer[] toWrapperArray(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    public static void writeArray(StringBuilder sb, double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(dArr[i]);
        }
    }

    public static void writeStringArray(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(strArr[i]);
            sb.append("\"");
        }
    }

    public static void writeArray(StringBuilder sb, float[] fArr) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(fArr[i]);
        }
    }

    public static void writeArray(StringBuilder sb, int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(iArr[i]);
        }
    }

    public static boolean contains(int[] iArr, int i) {
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void writeArray(StringBuilder sb, long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(jArr[i]);
        }
    }

    public static <T> void writeArray(StringBuilder sb, T[] tArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(tArr[i]);
        }
    }

    public static void writeArray(StringBuilder sb, boolean[] zArr) {
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(zArr[i]);
        }
    }
}
