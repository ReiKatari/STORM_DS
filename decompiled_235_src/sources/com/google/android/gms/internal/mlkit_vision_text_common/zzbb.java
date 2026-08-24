package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzbb {
    public static int zza(int i) {
        int i2;
        if (i < 32) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        return (i + 1) * i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r5 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        zze(r11, r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzb(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int zza = zzbc.zza(obj);
        int i2 = zza & i;
        int zzc = zzc(obj3, i2);
        if (zzc != 0) {
            int i3 = ~i;
            int i4 = zza & i3;
            int i5 = -1;
            while (true) {
                int i6 = zzc - 1;
                int i7 = iArr[i6];
                int i8 = i7 & i;
                if ((i7 & i3) != i4 || !zzw.zza(obj, objArr[i6]) || (objArr2 != null && !zzw.zza(obj2, objArr2[i6]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    zzc = i8;
                }
            }
        }
        return -1;
    }

    public static int zzc(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    public static Object zzd(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        i.h(lb1.g(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static void zze(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
