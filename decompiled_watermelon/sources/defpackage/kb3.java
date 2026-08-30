package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kb3  reason: default package */
/* loaded from: classes.dex */
public final class kb3 implements jm1 {
    public final jb3 a;

    public kb3(jb3 jb3Var) {
        this.a = jb3Var;
    }

    @Override // defpackage.jm1, defpackage.ho
    /* renamed from: f */
    public final pd4 a(bz6 bz6Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        jb3 jb3Var = this.a;
        j14 j14Var = jb3Var.b;
        i14 i14Var = new i14(j14Var.e + 2);
        j14 j14Var2 = new j14(j14Var.e);
        int[] iArr3 = j14Var.b;
        Object[] objArr3 = j14Var.c;
        long[] jArr = j14Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            ib3 ib3Var = (ib3) objArr3[i6];
                            i14Var.a(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j14Var2.i(i7, new o77((oo) bz6Var.a.n(ib3Var.a), ib3Var.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!j14Var.a(0)) {
            int i8 = i14Var.b;
            if (i8 >= 0) {
                i14Var.b(i8 + 1);
                int[] iArr4 = i14Var.a;
                int i9 = i14Var.b;
                if (i9 != 0) {
                    nu.d0(1, 0, i9, iArr4, iArr4);
                }
                iArr4[0] = 0;
                i14Var.b++;
            } else {
                f81.q("Index must be between 0 and size");
                return null;
            }
        }
        if (!j14Var.a(jb3Var.a)) {
            i14Var.a(jb3Var.a);
        }
        int i10 = i14Var.b;
        if (i10 != 0) {
            int[] iArr5 = i14Var.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new pd4(i14Var, j14Var2, jb3Var.a, cn1.c);
    }
}
