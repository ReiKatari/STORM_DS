package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ot  reason: default package */
/* loaded from: classes.dex */
public final class ot implements nt, qt {
    public final float A;
    public final boolean B;
    public final pt L;
    public final float R;

    public ot(float f, boolean z, pt ptVar) {
        this.A = f;
        this.B = z;
        this.L = ptVar;
        this.R = f;
    }

    @Override // defpackage.nt, defpackage.qt
    public final float a() {
        return this.R;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ot) {
                ot otVar = (ot) obj;
                if (!ji1.b(this.A, otVar.A) || this.B != otVar.B || !b53.x(this.L, otVar.L)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.nt
    public final void g(od1 od1Var, int i, int[] iArr, sd3 sd3Var, int[] iArr2) {
        boolean z;
        int i2;
        if (iArr.length != 0) {
            int Y = od1Var.Y(this.A);
            if (this.B && sd3Var == sd3.Rtl) {
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
                    i4 = Math.min(Y, max);
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
                    int min2 = Math.min(Y, (i - min) - i10);
                    i6++;
                    i8 = min2;
                    i7 = iArr2[i9] + i10 + min2;
                    i9++;
                }
                i2 = i - (i7 - i8);
            }
            pt ptVar = this.L;
            if (ptVar != null && i2 > 0) {
                int e = ptVar.e(i2, sd3Var);
                if (z) {
                    e -= i2;
                }
                if (e != 0) {
                    int length3 = iArr2.length;
                    for (int i11 = 0; i11 < length3; i11++) {
                        iArr2[i11] = iArr2[i11] + e;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode;
        int c = ej6.c(Float.hashCode(this.A) * 31, this.B, 31);
        pt ptVar = this.L;
        if (ptVar == null) {
            hashCode = 0;
        } else {
            hashCode = ptVar.hashCode();
        }
        return c + hashCode;
    }

    @Override // defpackage.qt
    public final void i(od1 od1Var, int i, int[] iArr, int[] iArr2) {
        g(od1Var, i, iArr, sd3.Ltr, iArr2);
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
        sb.append((Object) ji1.c(this.A));
        sb.append(", ");
        sb.append(this.L);
        sb.append(')');
        return sb.toString();
    }
}
