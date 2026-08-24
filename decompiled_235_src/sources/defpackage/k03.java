package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k03  reason: default package */
/* loaded from: classes.dex */
public final class k03 extends oi2 {
    public boolean e;
    public final o03 f;
    public final m42 g;
    public final m42 h;
    public int i;
    public byte[] j = q60.b;
    public int k;
    public final /* synthetic */ n03 l;

    public k03(n03 n03Var, o03 o03Var, int[] iArr, int[] iArr2) {
        this.l = n03Var;
        this.f = o03Var;
        this.g = n03.e(iArr);
        this.h = n03.e(iArr2);
    }

    @Override // defpackage.oi2
    public final boolean G() {
        return !this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0137, code lost:
        return r6;
     */
    @Override // defpackage.oi2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int T(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.e) {
            return -1;
        }
        int i8 = this.k - this.i;
        if (i8 > 0) {
            i3 = Math.min(i2, i8);
            System.arraycopy(this.j, this.i, bArr, i, i3);
            this.i += i3;
        } else {
            i3 = 0;
        }
        while (true) {
            if (i3 >= i2) {
                break;
            }
            n03 n03Var = this.l;
            n40 n40Var = n03Var.L;
            q qVar = n03Var.X;
            byte[] bArr2 = (byte[]) qVar.c;
            int k = n03.k(n40Var, this.g);
            int i9 = 65535;
            if (k < 256) {
                i6 = i3 + 1;
                int i10 = i3 + i;
                byte b = (byte) k;
                int i11 = qVar.a;
                bArr2[i11] = b;
                int i12 = (i11 + 1) & 65535;
                if (!qVar.b && i12 < i11) {
                    qVar.b = true;
                }
                qVar.a = i12;
                bArr[i10] = b;
                i4 = i7;
            } else if (k > 256) {
                short s = n03.Y[k - 257];
                try {
                    int addExact = Math.addExact(s >>> 5, Math.toIntExact(n03.n(n03Var.L, s & 31)));
                    int i13 = n03.Z[n03.k(n03Var.L, this.h)];
                    try {
                        int addExact2 = Math.addExact(i13 >>> 4, Math.toIntExact(n03.n(n03Var.L, i13 & 15)));
                        if (this.j.length < addExact) {
                            this.j = new byte[addExact];
                        }
                        this.k = addExact;
                        this.i = i7;
                        byte[] bArr3 = this.j;
                        if (addExact2 <= bArr2.length) {
                            int i14 = qVar.a;
                            int i15 = (i14 - addExact2) & 65535;
                            i4 = i7;
                            if (!qVar.b && i15 >= i14) {
                                i.m(lb1.g(addExact2, "Attempt to read beyond memory: dist="));
                                return i4;
                            }
                            int i16 = i4;
                            while (i16 < addExact) {
                                byte b2 = bArr2[i15];
                                int i17 = qVar.a;
                                bArr2[i17] = b2;
                                int i18 = i9;
                                int i19 = (i17 + 1) & i18;
                                if (!qVar.b && i19 < i17) {
                                    qVar.b = true;
                                }
                                qVar.a = i19;
                                bArr3[i16] = b2;
                                i16++;
                                int i20 = (i15 + 1) & i18;
                                if (!qVar.b && i20 < i15) {
                                    qVar.b = true;
                                }
                                i15 = i20;
                                i9 = i18;
                            }
                            int i21 = i + i3;
                            int i22 = i2 - i3;
                            int i23 = this.k - this.i;
                            if (i23 > 0) {
                                i5 = Math.min(i22, i23);
                                System.arraycopy(this.j, this.i, bArr, i21, i5);
                                this.i += i5;
                            } else {
                                i5 = i4;
                            }
                            i6 = i5 + i3;
                        } else {
                            int i24 = i7;
                            i.m(lb1.g(addExact2, "Illegal distance parameter: "));
                            return i24;
                        }
                    } catch (ArithmeticException e) {
                        throw new IllegalArgumentException("Argument too large or result overflows", e);
                    }
                } catch (ArithmeticException e2) {
                    throw new IllegalArgumentException("Argument too large or result overflows", e2);
                }
            } else {
                this.e = true;
                break;
            }
            i3 = i6;
            i7 = i4;
        }
    }

    @Override // defpackage.oi2
    public final o03 W() {
        if (this.e) {
            return o03.INITIAL;
        }
        return this.f;
    }

    @Override // defpackage.oi2
    public final int j() {
        return this.k - this.i;
    }
}
