package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ci3  reason: default package */
/* loaded from: classes.dex */
public final class ci3 implements pq1 {
    public final bi3 a;

    public ci3(bi3 bi3Var) {
        this.a = bi3Var;
    }

    @Override // defpackage.pq1, defpackage.to
    /* renamed from: f */
    public final qm4 a(wc7 wc7Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        bi3 bi3Var = this.a;
        p94 p94Var = bi3Var.b;
        o94 o94Var = new o94(p94Var.e + 2);
        p94 p94Var2 = new p94(p94Var.e);
        int[] iArr3 = p94Var.b;
        Object[] objArr3 = p94Var.c;
        long[] jArr = p94Var.a;
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
                            ai3 ai3Var = (ai3) objArr3[i6];
                            o94Var.a(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            p94Var2.i(i7, new nl7((ap) wc7Var.a.g(ai3Var.a), ai3Var.b));
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
        if (!p94Var.a(0)) {
            int i8 = o94Var.b;
            if (i8 >= 0) {
                o94Var.b(i8 + 1);
                int[] iArr4 = o94Var.a;
                int i9 = o94Var.b;
                if (i9 != 0) {
                    fv.r0(1, 0, i9, iArr4, iArr4);
                }
                iArr4[0] = 0;
                o94Var.b++;
            } else {
                e41.q("Index must be between 0 and size");
                return null;
            }
        }
        if (!p94Var.a(bi3Var.a)) {
            o94Var.a(bi3Var.a);
        }
        int i10 = o94Var.b;
        if (i10 != 0) {
            int[] iArr5 = o94Var.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new qm4(o94Var, p94Var2, bi3Var.a, ir1.c);
    }
}
