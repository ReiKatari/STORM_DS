package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzaq extends zzai {
    static final zzai zza = new zzaq(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzaq(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d1  */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaq zzg(int i, Object[] objArr, zzah zzahVar) {
        int i2;
        char c;
        int i3;
        char c2;
        byte[] bArr;
        char c3;
        short[] sArr;
        char c4;
        int i4;
        boolean z;
        int i5 = i;
        Object[] objArr2 = objArr;
        if (i5 == 0) {
            return (zzaq) zza;
        }
        ?? r3 = null;
        char c5 = 0;
        int i6 = 1;
        if (i5 == 1) {
            Object obj = objArr2[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr2[1];
            Objects.requireNonNull(obj2);
            zzw.zza(obj, obj2);
            return new zzaq(null, objArr2, 1);
        }
        zzt.zzb(i5, objArr2.length >> 1, "index");
        char c6 = 2;
        int max = Math.max(i5, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (i2 * 0.7d < max);
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                i.h("collection too large");
                return null;
            }
        }
        if (i5 == 1) {
            Object obj3 = objArr2[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArr2[1];
            Objects.requireNonNull(obj4);
            zzw.zza(obj3, obj4);
            c = 0;
            i5 = 1;
            i3 = 1;
        } else {
            int i7 = i2 - 1;
            if (i2 <= 128) {
                byte[] bArr2 = new byte[i2];
                Arrays.fill(bArr2, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i5) {
                    int i10 = i9 + i9;
                    int i11 = i8 + i8;
                    Object obj5 = objArr2[i11];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArr2[i11 ^ i6];
                    Objects.requireNonNull(obj6);
                    zzw.zza(obj5, obj6);
                    int zza2 = zzy.zza(obj5.hashCode());
                    while (true) {
                        int i12 = zza2 & i7;
                        c4 = c5;
                        i4 = i6;
                        int i13 = bArr2[i12] & 255;
                        if (i13 == 255) {
                            bArr2[i12] = (byte) i10;
                            if (i9 < i8) {
                                objArr2[i10] = obj5;
                                objArr2[i10 ^ 1] = obj6;
                            }
                            i9++;
                        } else if (obj5.equals(objArr2[i13])) {
                            int i14 = i13 ^ 1;
                            Object obj7 = objArr2[i14];
                            Objects.requireNonNull(obj7);
                            zzag zzagVar = new zzag(obj5, obj6, obj7);
                            objArr2[i14] = obj6;
                            r3 = zzagVar;
                            break;
                        } else {
                            zza2 = i12 + 1;
                            c5 = c4;
                            i6 = i4;
                        }
                    }
                    i8++;
                    c5 = c4;
                    i6 = i4;
                }
                c = c5;
                i3 = i6;
                if (i9 == i5) {
                    c2 = 2;
                    bArr = bArr2;
                    z = bArr instanceof Object[];
                    byte[] bArr3 = bArr;
                    if (z) {
                        ?? r32 = (Object[]) bArr;
                        zzag zzagVar2 = (zzag) r32[c2];
                        if (zzahVar != null) {
                            zzahVar.zzc = zzagVar2;
                            ?? r0 = r32[c];
                            int intValue = ((Integer) r32[i3]).intValue();
                            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                            bArr3 = r0;
                            i5 = intValue;
                        } else {
                            throw zzagVar2.zza();
                        }
                    }
                    return new zzaq(bArr3, objArr2, i5);
                }
                sArr = new Object[3];
                sArr[c] = bArr2;
                sArr[i3] = Integer.valueOf(i9);
                sArr[2] = r3;
                r3 = sArr;
            } else {
                c = 0;
                i3 = 1;
                if (i2 <= 32768) {
                    sArr = new short[i2];
                    Arrays.fill(sArr, (short) -1);
                    int i15 = 0;
                    for (int i16 = 0; i16 < i5; i16++) {
                        int i17 = i15 + i15;
                        int i18 = i16 + i16;
                        Object obj8 = objArr2[i18];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArr2[i18 ^ 1];
                        Objects.requireNonNull(obj9);
                        zzw.zza(obj8, obj9);
                        int zza3 = zzy.zza(obj8.hashCode());
                        while (true) {
                            int i19 = zza3 & i7;
                            char c7 = (char) sArr[i19];
                            if (c7 == 65535) {
                                sArr[i19] = (short) i17;
                                if (i15 < i16) {
                                    objArr2[i17] = obj8;
                                    objArr2[i17 ^ 1] = obj9;
                                }
                                i15++;
                            } else if (obj8.equals(objArr2[c7])) {
                                int i20 = c7 ^ 1;
                                Object obj10 = objArr2[i20];
                                Objects.requireNonNull(obj10);
                                zzag zzagVar3 = new zzag(obj8, obj9, obj10);
                                objArr2[i20] = obj9;
                                r3 = zzagVar3;
                                break;
                            } else {
                                zza3 = i19 + 1;
                            }
                        }
                    }
                    if (i15 != i5) {
                        r3 = new Object[]{sArr, Integer.valueOf(i15), r3};
                    }
                    r3 = sArr;
                } else {
                    int[] iArr = new int[i2];
                    Arrays.fill(iArr, -1);
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < i5) {
                        int i23 = i22 + i22;
                        int i24 = i21 + i21;
                        Object obj11 = objArr2[i24];
                        Objects.requireNonNull(obj11);
                        Object obj12 = objArr2[i24 ^ 1];
                        Objects.requireNonNull(obj12);
                        zzw.zza(obj11, obj12);
                        int zza4 = zzy.zza(obj11.hashCode());
                        while (true) {
                            int i25 = zza4 & i7;
                            ?? r15 = iArr[i25];
                            if (r15 == -1) {
                                iArr[i25] = i23;
                                if (i22 < i21) {
                                    objArr2[i23] = obj11;
                                    objArr2[i23 ^ 1] = obj12;
                                }
                                i22++;
                                c3 = c6;
                            } else {
                                c3 = c6;
                                if (obj11.equals(objArr2[r15])) {
                                    int i26 = r15 ^ 1;
                                    Object obj13 = objArr2[i26];
                                    Objects.requireNonNull(obj13);
                                    zzag zzagVar4 = new zzag(obj11, obj12, obj13);
                                    objArr2[i26] = obj12;
                                    r3 = zzagVar4;
                                    break;
                                }
                                zza4 = i25 + 1;
                                c6 = c3;
                            }
                        }
                        i21++;
                        c6 = c3;
                    }
                    c2 = c6;
                    if (i22 == i5) {
                        bArr = iArr;
                    } else {
                        ?? r5 = new Object[3];
                        r5[0] = iArr;
                        r5[1] = Integer.valueOf(i22);
                        r5[c2] = r3;
                        bArr = r5;
                    }
                    z = bArr instanceof Object[];
                    byte[] bArr32 = bArr;
                    if (z) {
                    }
                    return new zzaq(bArr32, objArr2, i5);
                }
            }
        }
        c2 = 2;
        bArr = r3;
        z = bArr instanceof Object[];
        byte[] bArr322 = bArr;
        if (z) {
        }
        return new zzaq(bArr322, objArr2, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_common.zzai, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int zza2 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i2 = zza2 & length;
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            } else if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            } else {
                                zza2 = i2 + 1;
                            }
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int zza3 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i4 = zza3 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            } else if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            } else {
                                zza3 = i4 + 1;
                            }
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int zza4 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i5 = zza4 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            } else if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            } else {
                                zza4 = i5 + 1;
                            }
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final zzab zza() {
        return new zzap(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final zzaj zzd() {
        return new zzan(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final zzaj zze() {
        return new zzao(this, new zzap(this.zzb, 0, this.zzd));
    }
}
