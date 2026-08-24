package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gu  reason: default package */
/* loaded from: classes.dex */
public final class gu implements fu, iu {
    public final float A;
    public final boolean B;
    public final hu L;
    public final float R;

    public gu(float f, boolean z, hu huVar) {
        this.A = f;
        this.B = z;
        this.L = huVar;
        this.R = f;
    }

    @Override // defpackage.fu, defpackage.iu
    public final float a() {
        return this.R;
    }

    @Override // defpackage.fu
    public final void d(qh1 qh1Var, int i, int[] iArr, kk3 kk3Var, int[] iArr2) {
        boolean z;
        int i2;
        if (iArr.length != 0) {
            int r0 = qh1Var.r0(this.A);
            if (this.B && kk3Var == kk3.Rtl) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    int max = Math.max(0, i - iArr[i3]);
                    iArr2[i5] = max;
                    i4 = Math.min(r0, max);
                    i = iArr2[i5] - i4;
                    i3++;
                    i5++;
                }
                i2 = i + i4;
            } else {
                int length2 = iArr.length;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i6 < length2) {
                    int i10 = iArr[i6];
                    int min = Math.min(i7, i - i10);
                    iArr2[i9] = min;
                    int min2 = Math.min(r0, (i - min) - i10);
                    i6++;
                    i8 = min2;
                    i7 = iArr2[i9] + i10 + min2;
                    i9++;
                }
                i2 = i - (i7 - i8);
            }
            hu huVar = this.L;
            if (huVar != null && i2 > 0) {
                int a = huVar.a(i2, kk3Var);
                if (z) {
                    a -= i2;
                }
                if (a != 0) {
                    int length3 = iArr2.length;
                    for (int i11 = 0; i11 < length3; i11++) {
                        iArr2[i11] = iArr2[i11] + a;
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gu) {
                gu guVar = (gu) obj;
                if (!om1.b(this.A, guVar.A) || this.B != guVar.B || !nb3.k(this.L, guVar.L)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.iu
    public final void g(qh1 qh1Var, int i, int[] iArr, int[] iArr2) {
        d(qh1Var, i, iArr, kk3.Ltr, iArr2);
    }

    public final int hashCode() {
        int hashCode;
        int e = xg6.e(Float.hashCode(this.A) * 31, this.B, 31);
        hu huVar = this.L;
        if (huVar == null) {
            hashCode = 0;
        } else {
            hashCode = huVar.hashCode();
        }
        return e + hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.B) {
            str = "";
        } else {
            str = "Absolute";
        }
        sb.append(str);
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) om1.c(this.A));
        sb.append(", ");
        sb.append(this.L);
        sb.append(')');
        return sb.toString();
    }
}
