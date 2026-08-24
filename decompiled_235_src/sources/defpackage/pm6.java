package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pm6  reason: default package */
/* loaded from: classes.dex */
public final class pm6 {
    public final qn2 a;
    public Object b;
    public y94 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final ja4 e = mp2.q();
    public final ja4 f = new ja4();
    public final ka4 g = new ka4();
    public final ua4 h = new ua4(new ii1[16]);
    public final wq2 i = new wq2(this, 1);
    public final ja4 l = mp2.q();
    public final HashMap m = new HashMap();

    public pm6(qn2 qn2Var) {
        this.a = qn2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (((defpackage.fq6) r15).e(2) == false) goto L153;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x053c  */
    /* JADX WARN: Type inference failed for: r6v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Set set) {
        char c;
        long j;
        boolean z;
        Iterator it;
        Object obj;
        int i;
        Object g;
        boolean z2;
        Object[] objArr;
        Iterator it2;
        Object obj2;
        ja4 ja4Var;
        int i2;
        Object[] objArr2;
        long j2;
        boolean z3;
        long[] jArr;
        int i3;
        int i4;
        Object[] objArr3;
        int i5;
        ua4 ua4Var;
        ii1 ii1Var;
        int i6;
        int i7;
        ua4 ua4Var2;
        ii1 ii1Var2;
        y94 y94Var;
        long[] jArr2;
        xd5 xd5Var;
        Object[] objArr4;
        ja4 ja4Var2;
        HashMap hashMap;
        long[] jArr3;
        xd5 xd5Var2;
        Object[] objArr5;
        ja4 ja4Var3;
        HashMap hashMap2;
        int i8;
        int i9;
        int i10;
        long j3;
        HashMap hashMap3;
        Object[] objArr6;
        ja4 ja4Var4;
        HashMap hashMap4;
        int i11;
        int i12;
        long j4;
        int i13;
        long[] jArr4;
        long[] jArr5;
        xd5 xd5Var3 = xd5.s0;
        boolean z4 = set instanceof d66;
        ua4 ua4Var3 = this.h;
        ja4 ja4Var5 = this.l;
        HashMap hashMap5 = this.m;
        ja4 ja4Var6 = this.e;
        ka4 ka4Var = this.g;
        if (z4) {
            ka4 ka4Var2 = ((d66) set).A;
            Object[] objArr7 = ka4Var2.b;
            long[] jArr6 = ka4Var2.a;
            c = 7;
            int length = jArr6.length - 2;
            if (length >= 0) {
                int i14 = 0;
                z = false;
                j = -9187201950435737472L;
                while (true) {
                    int i15 = 8;
                    long j5 = jArr6[i14];
                    int i16 = i14;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j5 & 255) < 128) {
                                Object obj3 = objArr7[(i16 << 3) + i18];
                                jArr3 = jArr6;
                                if (obj3 instanceof fq6) {
                                    xd5Var2 = xd5Var3;
                                } else {
                                    xd5Var2 = xd5Var3;
                                }
                                if (!this.j && ja4Var5.c(obj3)) {
                                    this.j = true;
                                    try {
                                        Object g2 = ja4Var5.g(obj3);
                                        if (g2 != null) {
                                            if (g2 instanceof ka4) {
                                                ka4 ka4Var3 = (ka4) g2;
                                                Object[] objArr8 = ka4Var3.b;
                                                long[] jArr7 = ka4Var3.a;
                                                int length2 = jArr7.length - 2;
                                                if (length2 >= 0) {
                                                    i10 = i18;
                                                    boolean z5 = z;
                                                    int i19 = 0;
                                                    while (true) {
                                                        long j6 = jArr7[i19];
                                                        j3 = j5;
                                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                            int i21 = 0;
                                                            while (i21 < i20) {
                                                                if ((j6 & 255) < 128) {
                                                                    objArr6 = objArr7;
                                                                    ii1 ii1Var3 = (ii1) objArr8[(i19 << 3) + i21];
                                                                    ii1Var3.getClass();
                                                                    j4 = j6;
                                                                    Object obj4 = hashMap5.get(ii1Var3);
                                                                    im6 im6Var = ii1Var3.L;
                                                                    if (im6Var == null) {
                                                                        im6Var = xd5Var2;
                                                                    }
                                                                    i13 = i21;
                                                                    if (!im6Var.i(ii1Var3.i().f, obj4)) {
                                                                        Object g3 = ja4Var6.g(ii1Var3);
                                                                        if (g3 != null) {
                                                                            if (g3 instanceof ka4) {
                                                                                ka4 ka4Var4 = (ka4) g3;
                                                                                Object[] objArr9 = ka4Var4.b;
                                                                                long[] jArr8 = ka4Var4.a;
                                                                                int length3 = jArr8.length - 2;
                                                                                if (length3 >= 0) {
                                                                                    i11 = length;
                                                                                    i12 = i17;
                                                                                    int i22 = 0;
                                                                                    while (true) {
                                                                                        long j7 = jArr8[i22];
                                                                                        ja4Var4 = ja4Var5;
                                                                                        hashMap4 = hashMap5;
                                                                                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                            int i23 = 8 - ((~(i22 - length3)) >>> 31);
                                                                                            int i24 = 0;
                                                                                            while (i24 < i23) {
                                                                                                if ((j7 & 255) < 128) {
                                                                                                    jArr5 = jArr8;
                                                                                                    ka4Var.a(objArr9[(i22 << 3) + i24]);
                                                                                                    z5 = true;
                                                                                                } else {
                                                                                                    jArr5 = jArr8;
                                                                                                }
                                                                                                j7 >>= i15;
                                                                                                i24++;
                                                                                                jArr8 = jArr5;
                                                                                            }
                                                                                            jArr4 = jArr8;
                                                                                            if (i23 != i15) {
                                                                                                break;
                                                                                            }
                                                                                        } else {
                                                                                            jArr4 = jArr8;
                                                                                        }
                                                                                        if (i22 == length3) {
                                                                                            break;
                                                                                        }
                                                                                        i22++;
                                                                                        ja4Var5 = ja4Var4;
                                                                                        hashMap5 = hashMap4;
                                                                                        jArr8 = jArr4;
                                                                                        i15 = 8;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                ja4Var4 = ja4Var5;
                                                                                hashMap4 = hashMap5;
                                                                                i11 = length;
                                                                                i12 = i17;
                                                                                ka4Var.a(g3);
                                                                                z5 = true;
                                                                            }
                                                                        }
                                                                        ja4Var4 = ja4Var5;
                                                                        hashMap4 = hashMap5;
                                                                        i11 = length;
                                                                        i12 = i17;
                                                                    } else {
                                                                        ja4Var4 = ja4Var5;
                                                                        hashMap4 = hashMap5;
                                                                        i11 = length;
                                                                        i12 = i17;
                                                                        ua4Var3.b(ii1Var3);
                                                                    }
                                                                } else {
                                                                    objArr6 = objArr7;
                                                                    ja4Var4 = ja4Var5;
                                                                    hashMap4 = hashMap5;
                                                                    i11 = length;
                                                                    i12 = i17;
                                                                    j4 = j6;
                                                                    i13 = i21;
                                                                }
                                                                j6 = j4 >> 8;
                                                                i21 = i13 + 1;
                                                                i15 = 8;
                                                                objArr7 = objArr6;
                                                                length = i11;
                                                                i17 = i12;
                                                                ja4Var5 = ja4Var4;
                                                                hashMap5 = hashMap4;
                                                            }
                                                            objArr5 = objArr7;
                                                            ja4Var3 = ja4Var5;
                                                            hashMap3 = hashMap5;
                                                            i8 = length;
                                                            i9 = i17;
                                                            if (i20 != i15) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr5 = objArr7;
                                                            ja4Var3 = ja4Var5;
                                                            hashMap3 = hashMap5;
                                                            i8 = length;
                                                            i9 = i17;
                                                        }
                                                        if (i19 == length2) {
                                                            break;
                                                        }
                                                        i19++;
                                                        j5 = j3;
                                                        objArr7 = objArr5;
                                                        length = i8;
                                                        i17 = i9;
                                                        ja4Var5 = ja4Var3;
                                                        hashMap5 = hashMap3;
                                                        i15 = 8;
                                                    }
                                                    z = z5;
                                                } else {
                                                    objArr5 = objArr7;
                                                    ja4Var3 = ja4Var5;
                                                    hashMap3 = hashMap5;
                                                    i8 = length;
                                                    i9 = i17;
                                                    i10 = i18;
                                                    j3 = j5;
                                                }
                                                hashMap2 = hashMap3;
                                            } else {
                                                objArr5 = objArr7;
                                                ja4Var3 = ja4Var5;
                                                i8 = length;
                                                i9 = i17;
                                                i10 = i18;
                                                j3 = j5;
                                                ii1 ii1Var4 = (ii1) g2;
                                                hashMap2 = hashMap5;
                                                Object obj5 = hashMap2.get(ii1Var4);
                                                im6 im6Var2 = ii1Var4.L;
                                                if (im6Var2 == null) {
                                                    im6Var2 = xd5Var2;
                                                }
                                                if (!im6Var2.i(ii1Var4.i().f, obj5)) {
                                                    Object g4 = ja4Var6.g(ii1Var4);
                                                    if (g4 != null) {
                                                        if (g4 instanceof ka4) {
                                                            ka4 ka4Var5 = (ka4) g4;
                                                            Object[] objArr10 = ka4Var5.b;
                                                            long[] jArr9 = ka4Var5.a;
                                                            int length4 = jArr9.length - 2;
                                                            if (length4 >= 0) {
                                                                int i25 = 0;
                                                                while (true) {
                                                                    long j8 = jArr9[i25];
                                                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i26 = 8 - ((~(i25 - length4)) >>> 31);
                                                                        for (int i27 = 0; i27 < i26; i27++) {
                                                                            if ((j8 & 255) < 128) {
                                                                                ka4Var.a(objArr10[(i25 << 3) + i27]);
                                                                                z = true;
                                                                            }
                                                                            j8 >>= 8;
                                                                        }
                                                                        if (i26 != 8) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i25 == length4) {
                                                                        break;
                                                                    }
                                                                    i25++;
                                                                }
                                                            }
                                                        } else {
                                                            ka4Var.a(g4);
                                                            z = true;
                                                        }
                                                    }
                                                } else {
                                                    ua4Var3.b(ii1Var4);
                                                }
                                            }
                                        } else {
                                            objArr5 = objArr7;
                                            ja4Var3 = ja4Var5;
                                            hashMap2 = hashMap5;
                                            i8 = length;
                                            i9 = i17;
                                            i10 = i18;
                                            j3 = j5;
                                        }
                                        this.j = false;
                                    } finally {
                                    }
                                } else {
                                    objArr5 = objArr7;
                                    ja4Var3 = ja4Var5;
                                    hashMap2 = hashMap5;
                                    i8 = length;
                                    i9 = i17;
                                    i10 = i18;
                                    j3 = j5;
                                }
                                Object g5 = ja4Var6.g(obj3);
                                if (g5 != null) {
                                    if (g5 instanceof ka4) {
                                        ka4 ka4Var6 = (ka4) g5;
                                        Object[] objArr11 = ka4Var6.b;
                                        long[] jArr10 = ka4Var6.a;
                                        int length5 = jArr10.length - 2;
                                        if (length5 >= 0) {
                                            int i28 = 0;
                                            while (true) {
                                                long j9 = jArr10[i28];
                                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i29 = 8 - ((~(i28 - length5)) >>> 31);
                                                    long j10 = j9;
                                                    for (int i30 = 0; i30 < i29; i30++) {
                                                        if ((j10 & 255) < 128) {
                                                            ka4Var.a(objArr11[(i28 << 3) + i30]);
                                                            z = true;
                                                        }
                                                        j10 >>= 8;
                                                    }
                                                    if (i29 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i28 == length5) {
                                                    break;
                                                }
                                                i28++;
                                            }
                                        }
                                    } else {
                                        ka4Var.a(g5);
                                        z = true;
                                    }
                                }
                                i18 = i10 + 1;
                                i15 = 8;
                                jArr6 = jArr3;
                                objArr7 = objArr5;
                                length = i8;
                                i17 = i9;
                                j5 = j3 >> 8;
                                ja4Var5 = ja4Var3;
                                hashMap5 = hashMap2;
                                xd5Var3 = xd5Var2;
                            } else {
                                jArr3 = jArr6;
                                xd5Var2 = xd5Var3;
                            }
                            objArr5 = objArr7;
                            ja4Var3 = ja4Var5;
                            hashMap2 = hashMap5;
                            i8 = length;
                            i9 = i17;
                            i10 = i18;
                            j3 = j5;
                            i18 = i10 + 1;
                            i15 = 8;
                            jArr6 = jArr3;
                            objArr7 = objArr5;
                            length = i8;
                            i17 = i9;
                            j5 = j3 >> 8;
                            ja4Var5 = ja4Var3;
                            hashMap5 = hashMap2;
                            xd5Var3 = xd5Var2;
                        }
                        jArr2 = jArr6;
                        xd5Var = xd5Var3;
                        objArr4 = objArr7;
                        ja4Var2 = ja4Var5;
                        hashMap = hashMap5;
                        int i31 = length;
                        if (i17 != i15) {
                            break;
                        }
                        length = i31;
                    } else {
                        jArr2 = jArr6;
                        xd5Var = xd5Var3;
                        objArr4 = objArr7;
                        ja4Var2 = ja4Var5;
                        hashMap = hashMap5;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i14 = i16 + 1;
                    hashMap5 = hashMap;
                    jArr6 = jArr2;
                    xd5Var3 = xd5Var;
                    objArr7 = objArr4;
                    ja4Var5 = ja4Var2;
                }
            } else {
                j = -9187201950435737472L;
                z = false;
            }
        } else {
            ja4 ja4Var7 = ja4Var5;
            c = 7;
            j = -9187201950435737472L;
            Iterator it3 = set.iterator();
            boolean z6 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if ((next instanceof fq6) && !((fq6) next).e(2)) {
                    it = it3;
                } else {
                    if (!this.j) {
                        ja4 ja4Var8 = ja4Var7;
                        if (ja4Var8.c(next)) {
                            this.j = true;
                            try {
                                Object g6 = ja4Var8.g(next);
                                if (g6 != null) {
                                    if (g6 instanceof ka4) {
                                        ka4 ka4Var7 = (ka4) g6;
                                        Object[] objArr12 = ka4Var7.b;
                                        long[] jArr11 = ka4Var7.a;
                                        int length6 = jArr11.length - 2;
                                        if (length6 >= 0) {
                                            boolean z7 = z6;
                                            int i32 = 0;
                                            while (true) {
                                                long j11 = jArr11[i32];
                                                long[] jArr12 = jArr11;
                                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i33 = 8 - ((~(i32 - length6)) >>> 31);
                                                    int i34 = 0;
                                                    while (i34 < i33) {
                                                        if ((j11 & 255) < 128) {
                                                            it2 = it3;
                                                            ii1 ii1Var5 = (ii1) objArr12[(i32 << 3) + i34];
                                                            ii1Var5.getClass();
                                                            ja4Var = ja4Var8;
                                                            Object obj6 = hashMap5.get(ii1Var5);
                                                            i2 = i34;
                                                            im6 im6Var3 = ii1Var5.L;
                                                            if (im6Var3 == null) {
                                                                im6Var3 = xd5Var3;
                                                            }
                                                            objArr2 = objArr12;
                                                            if (!im6Var3.i(ii1Var5.i().f, obj6)) {
                                                                Object g7 = ja4Var6.g(ii1Var5);
                                                                if (g7 != null) {
                                                                    if (g7 instanceof ka4) {
                                                                        ka4 ka4Var8 = (ka4) g7;
                                                                        Object[] objArr13 = ka4Var8.b;
                                                                        long[] jArr13 = ka4Var8.a;
                                                                        int length7 = jArr13.length - 2;
                                                                        if (length7 >= 0) {
                                                                            j2 = j11;
                                                                            int i35 = 0;
                                                                            boolean z8 = z7;
                                                                            while (true) {
                                                                                long j12 = jArr13[i35];
                                                                                obj2 = next;
                                                                                Object[] objArr14 = objArr13;
                                                                                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                    int i36 = 8 - ((~(i35 - length7)) >>> 31);
                                                                                    int i37 = 0;
                                                                                    while (i37 < i36) {
                                                                                        if ((j12 & 255) < 128) {
                                                                                            ka4Var.a(objArr14[(i35 << 3) + i37]);
                                                                                            z8 = true;
                                                                                        }
                                                                                        j12 >>= 8;
                                                                                        i37++;
                                                                                        jArr13 = jArr13;
                                                                                    }
                                                                                    jArr = jArr13;
                                                                                    if (i36 != 8) {
                                                                                        z3 = z8;
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    jArr = jArr13;
                                                                                }
                                                                                if (i35 != length7) {
                                                                                    i35++;
                                                                                    next = obj2;
                                                                                    objArr13 = objArr14;
                                                                                    jArr13 = jArr;
                                                                                } else {
                                                                                    z7 = z8;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            z3 = z7;
                                                                        }
                                                                    } else {
                                                                        obj2 = next;
                                                                        j2 = j11;
                                                                        ka4Var.a(g7);
                                                                        z3 = true;
                                                                    }
                                                                    z7 = z3;
                                                                }
                                                                obj2 = next;
                                                                j2 = j11;
                                                                z3 = z7;
                                                                z7 = z3;
                                                            } else {
                                                                obj2 = next;
                                                                j2 = j11;
                                                                ua4Var3.b(ii1Var5);
                                                            }
                                                        } else {
                                                            it2 = it3;
                                                            obj2 = next;
                                                            ja4Var = ja4Var8;
                                                            i2 = i34;
                                                            objArr2 = objArr12;
                                                            j2 = j11;
                                                        }
                                                        i34 = i2 + 1;
                                                        it3 = it2;
                                                        j11 = j2 >> 8;
                                                        objArr12 = objArr2;
                                                        next = obj2;
                                                        ja4Var8 = ja4Var;
                                                    }
                                                    it = it3;
                                                    obj = next;
                                                    ja4Var7 = ja4Var8;
                                                    objArr = objArr12;
                                                    if (i33 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    it = it3;
                                                    obj = next;
                                                    ja4Var7 = ja4Var8;
                                                    objArr = objArr12;
                                                }
                                                if (i32 == length6) {
                                                    break;
                                                }
                                                i32++;
                                                it3 = it;
                                                jArr11 = jArr12;
                                                objArr12 = objArr;
                                                next = obj;
                                                ja4Var8 = ja4Var7;
                                            }
                                            z6 = z7;
                                        }
                                    } else {
                                        it = it3;
                                        obj = next;
                                        ja4Var7 = ja4Var8;
                                        ii1 ii1Var6 = (ii1) g6;
                                        Object obj7 = hashMap5.get(ii1Var6);
                                        im6 im6Var4 = ii1Var6.L;
                                        if (im6Var4 == null) {
                                            im6Var4 = xd5Var3;
                                        }
                                        if (!im6Var4.i(ii1Var6.i().f, obj7)) {
                                            Object g8 = ja4Var6.g(ii1Var6);
                                            if (g8 != null) {
                                                if (g8 instanceof ka4) {
                                                    ka4 ka4Var9 = (ka4) g8;
                                                    Object[] objArr15 = ka4Var9.b;
                                                    long[] jArr14 = ka4Var9.a;
                                                    int length8 = jArr14.length - 2;
                                                    if (length8 >= 0) {
                                                        boolean z9 = z6;
                                                        int i38 = 0;
                                                        while (true) {
                                                            long j13 = jArr14[i38];
                                                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i39 = 8 - ((~(i38 - length8)) >>> 31);
                                                                long j14 = j13;
                                                                for (int i40 = 0; i40 < i39; i40++) {
                                                                    if ((j14 & 255) < 128) {
                                                                        ka4Var.a(objArr15[(i38 << 3) + i40]);
                                                                        z9 = true;
                                                                    }
                                                                    j14 >>= 8;
                                                                }
                                                                if (i39 != 8) {
                                                                    z2 = z9;
                                                                    break;
                                                                }
                                                            }
                                                            if (i38 != length8) {
                                                                i38++;
                                                            } else {
                                                                z6 = z9;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    ka4Var.a(g8);
                                                    z2 = true;
                                                }
                                                z6 = z2;
                                            }
                                            z2 = z6;
                                            z6 = z2;
                                        } else {
                                            ua4Var3.b(ii1Var6);
                                        }
                                    }
                                    i = 0;
                                    this.j = false;
                                    boolean z10 = z6;
                                    g = ja4Var6.g(obj);
                                    if (g != null) {
                                        if (g instanceof ka4) {
                                            ka4 ka4Var10 = (ka4) g;
                                            Object[] objArr16 = ka4Var10.b;
                                            long[] jArr15 = ka4Var10.a;
                                            int length9 = jArr15.length - 2;
                                            if (length9 >= 0) {
                                                int i41 = i;
                                                while (true) {
                                                    long j15 = jArr15[i41];
                                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i42 = 8 - ((~(i41 - length9)) >>> 31);
                                                        long j16 = j15;
                                                        for (int i43 = i; i43 < i42; i43++) {
                                                            if ((j16 & 255) < 128) {
                                                                ka4Var.a(objArr16[(i41 << 3) + i43]);
                                                                z10 = true;
                                                            }
                                                            j16 >>= 8;
                                                        }
                                                        if (i42 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i41 == length9) {
                                                        break;
                                                    }
                                                    i41++;
                                                }
                                            }
                                        } else {
                                            ka4Var.a(g);
                                            z10 = true;
                                        }
                                    }
                                    z6 = z10;
                                }
                                it = it3;
                                obj = next;
                                ja4Var7 = ja4Var8;
                                i = 0;
                                this.j = false;
                                boolean z102 = z6;
                                g = ja4Var6.g(obj);
                                if (g != null) {
                                }
                                z6 = z102;
                            } finally {
                            }
                        } else {
                            ja4Var7 = ja4Var8;
                        }
                    }
                    it = it3;
                    obj = next;
                    i = 0;
                    boolean z1022 = z6;
                    g = ja4Var6.g(obj);
                    if (g != null) {
                    }
                    z6 = z1022;
                }
                it3 = it;
            }
            z = z6;
        }
        int i44 = 0;
        if (!this.j && (i3 = ua4Var3.L) != 0) {
            Object[] objArr17 = ua4Var3.A;
            int i45 = 0;
            while (i45 < i3) {
                ii1 ii1Var7 = (ii1) objArr17[i45];
                int hashCode = Long.hashCode(bm6.j().g());
                Object g9 = ja4Var6.g(ii1Var7);
                if (g9 != null) {
                    boolean z11 = g9 instanceof ka4;
                    ja4 ja4Var9 = this.f;
                    if (z11) {
                        ka4 ka4Var11 = (ka4) g9;
                        Object[] objArr18 = ka4Var11.b;
                        long[] jArr16 = ka4Var11.a;
                        int length10 = jArr16.length - 2;
                        if (length10 >= 0) {
                            int i46 = i44;
                            ii1 ii1Var8 = ii1Var7;
                            while (true) {
                                long j17 = jArr16[i46];
                                objArr3 = objArr17;
                                i5 = i45;
                                if ((((~j17) << c) & j17 & j) != j) {
                                    int i47 = 8 - ((~(i46 - length10)) >>> 31);
                                    int i48 = 0;
                                    while (i48 < i47) {
                                        if ((j17 & 255) < 128) {
                                            i6 = i3;
                                            Object obj8 = objArr18[(i46 << 3) + i48];
                                            y94 y94Var2 = (y94) ja4Var9.g(obj8);
                                            i7 = i48;
                                            if (y94Var2 == null) {
                                                y94Var = new y94();
                                                ja4Var9.m(obj8, y94Var);
                                            } else {
                                                y94Var = y94Var2;
                                            }
                                            ua4Var2 = ua4Var3;
                                            ii1Var2 = ii1Var8;
                                            b(ii1Var2, hashCode, obj8, y94Var);
                                        } else {
                                            i6 = i3;
                                            i7 = i48;
                                            ua4Var2 = ua4Var3;
                                            ii1Var2 = ii1Var8;
                                        }
                                        j17 >>= 8;
                                        i48 = i7 + 1;
                                        ii1Var8 = ii1Var2;
                                        ua4Var3 = ua4Var2;
                                        i3 = i6;
                                    }
                                    i4 = i3;
                                    ua4Var = ua4Var3;
                                    ii1Var = ii1Var8;
                                    if (i47 != 8) {
                                        break;
                                    }
                                } else {
                                    i4 = i3;
                                    ua4Var = ua4Var3;
                                    ii1Var = ii1Var8;
                                }
                                if (i46 != length10) {
                                    i46++;
                                    ii1Var8 = ii1Var;
                                    objArr17 = objArr3;
                                    i45 = i5;
                                    ua4Var3 = ua4Var;
                                    i3 = i4;
                                }
                            }
                        } else {
                            i4 = i3;
                            objArr3 = objArr17;
                            i5 = i45;
                            ua4Var = ua4Var3;
                        }
                    } else {
                        i4 = i3;
                        objArr3 = objArr17;
                        i5 = i45;
                        ua4Var = ua4Var3;
                        y94 y94Var3 = (y94) ja4Var9.g(g9);
                        if (y94Var3 == null) {
                            y94Var3 = new y94();
                            ja4Var9.m(g9, y94Var3);
                        }
                        b(ii1Var7, hashCode, g9, y94Var3);
                    }
                } else {
                    i4 = i3;
                    objArr3 = objArr17;
                    i5 = i45;
                    ua4Var = ua4Var3;
                }
                i45 = i5 + 1;
                objArr17 = objArr3;
                ua4Var3 = ua4Var;
                i3 = i4;
                i44 = 0;
            }
            ua4Var3.g();
        }
        return z;
    }

    public final void b(Object obj, int i, Object obj2, y94 y94Var) {
        int i2;
        if (this.k <= 0) {
            int c = y94Var.c(obj);
            if (c < 0) {
                c = ~c;
                i2 = -1;
            } else {
                i2 = y94Var.c[c];
            }
            y94Var.b[c] = obj;
            y94Var.c[c] = i;
            if ((obj instanceof ii1) && i2 != i) {
                hi1 i3 = ((ii1) obj).i();
                this.m.put(obj, i3.f);
                y94 y94Var2 = i3.e;
                ja4 ja4Var = this.l;
                mp2.W(ja4Var, obj);
                Object[] objArr = y94Var2.b;
                long[] jArr = y94Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j & 255) < 128) {
                                    eq6 eq6Var = (eq6) objArr[(i4 << 3) + i6];
                                    if (eq6Var instanceof fq6) {
                                        ((fq6) eq6Var).g(2);
                                    }
                                    mp2.g(ja4Var, eq6Var, obj);
                                }
                                j >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
            }
            if (i2 == -1) {
                if (obj instanceof fq6) {
                    ((fq6) obj).g(2);
                }
                mp2.g(this.e, obj, obj2);
            }
        }
    }

    public final void c(Object obj, Object obj2) {
        ja4 ja4Var = this.e;
        mp2.U(ja4Var, obj2, obj);
        if ((obj2 instanceof ii1) && !ja4Var.c(obj2)) {
            mp2.W(this.l, obj2);
            this.m.remove(obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        long j3;
        ja4 ja4Var = this.f;
        long[] jArr3 = ja4Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j4 = jArr3[i2];
                char c2 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j4 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            c = c2;
                            Object obj = ja4Var.b[i6];
                            j2 = j5;
                            y94 y94Var = (y94) ja4Var.c[i6];
                            obj.getClass();
                            boolean r = ((aq4) obj).r();
                            if (!r) {
                                Object[] objArr = y94Var.b;
                                int[] iArr = y94Var.c;
                                long[] jArr4 = y94Var.a;
                                int i7 = i3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j = j4;
                                    int i8 = 0;
                                    while (true) {
                                        long j6 = jArr4[i8];
                                        long[] jArr5 = jArr4;
                                        z = r;
                                        if ((((~j6) << c) & j6 & j2) != j2) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j6 & 255) < 128) {
                                                    int i11 = (i8 << 3) + i10;
                                                    j3 = j6;
                                                    Object obj2 = objArr[i11];
                                                    int i12 = iArr[i11];
                                                    c(obj, obj2);
                                                } else {
                                                    j3 = j6;
                                                }
                                                j6 = j3 >> i7;
                                            }
                                            if (i9 != i7) {
                                                break;
                                            }
                                        }
                                        if (i8 == length2) {
                                            break;
                                        }
                                        i8++;
                                        r = z;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                    if (!z) {
                                        ja4Var.l(i6);
                                    }
                                    i = 8;
                                }
                            }
                            jArr2 = jArr3;
                            j = j4;
                            z = r;
                            if (!z) {
                            }
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            j = j4;
                            c = c2;
                            j2 = j5;
                            i = i3;
                        }
                        i5++;
                        i3 = i;
                        j4 = j >> i;
                        c2 = c;
                        j5 = j2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 != length) {
                    i2++;
                    jArr3 = jArr;
                } else {
                    return;
                }
            }
        }
    }
}
