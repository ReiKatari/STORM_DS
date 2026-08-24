package defpackage;

import java.io.IOException;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vy2  reason: default package */
/* loaded from: classes.dex */
public final class vy2 {
    public final fe5 c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public uw2[] d = new uw2[8];
    public int e = 7;

    public vy2(sz2 sz2Var) {
        this.c = new fe5(sz2Var);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                uw2 uw2Var = this.d[length];
                uw2Var.getClass();
                int i4 = uw2Var.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            uw2[] uw2VarArr = this.d;
            System.arraycopy(uw2VarArr, i2 + 1, uw2VarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final da0 b(int i) {
        if (i >= 0) {
            uw2[] uw2VarArr = xy2.a;
            if (i <= uw2VarArr.length - 1) {
                return uw2VarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - xy2.a.length);
        if (length >= 0) {
            uw2[] uw2VarArr2 = this.d;
            if (length < uw2VarArr2.length) {
                uw2 uw2Var = uw2VarArr2[length];
                uw2Var.getClass();
                return uw2Var.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(uw2 uw2Var) {
        this.b.add(uw2Var);
        int i = uw2Var.c;
        int i2 = this.a;
        if (i > i2) {
            fv.z0(0, r7.length, null, this.d);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        uw2[] uw2VarArr = this.d;
        if (i3 > uw2VarArr.length) {
            uw2[] uw2VarArr2 = new uw2[uw2VarArr.length * 2];
            System.arraycopy(uw2VarArr, 0, uw2VarArr2, uw2VarArr.length, uw2VarArr.length);
            this.e = this.d.length - 1;
            this.d = uw2VarArr2;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = uw2Var;
        this.f++;
        this.g += i;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [k80, java.lang.Object] */
    public final da0 d() {
        boolean z;
        fe5 fe5Var = this.c;
        byte readByte = fe5Var.readByte();
        byte[] bArr = yy7.a;
        int i = readByte & 255;
        int i2 = 0;
        if ((readByte & 128) == 128) {
            z = true;
        } else {
            z = false;
        }
        long e = e(i, 127);
        if (z) {
            ?? obj = new Object();
            int[] iArr = j03.a;
            fe5Var.getClass();
            r90 r90Var = j03.c;
            r90 r90Var2 = r90Var;
            int i3 = 0;
            for (long j = 0; j < e; j++) {
                byte readByte2 = fe5Var.readByte();
                byte[] bArr2 = yy7.a;
                i2 = (i2 << 8) | (readByte2 & 255);
                i3 += 8;
                while (i3 >= 8) {
                    r90[] r90VarArr = (r90[]) r90Var2.L;
                    r90VarArr.getClass();
                    r90Var2 = r90VarArr[(i2 >>> (i3 - 8)) & 255];
                    r90Var2.getClass();
                    if (((r90[]) r90Var2.L) == null) {
                        obj.n0(r90Var2.A);
                        i3 -= r90Var2.B;
                        r90Var2 = r90Var;
                    } else {
                        i3 -= 8;
                    }
                }
            }
            while (i3 > 0) {
                r90[] r90VarArr2 = (r90[]) r90Var2.L;
                r90VarArr2.getClass();
                r90 r90Var3 = r90VarArr2[(i2 << (8 - i3)) & 255];
                r90Var3.getClass();
                int i4 = r90Var3.B;
                if (((r90[]) r90Var3.L) != null || i4 > i3) {
                    break;
                }
                obj.n0(r90Var3.A);
                i3 -= i4;
                r90Var2 = r90Var;
            }
            return obj.l(obj.B);
        }
        return fe5Var.l(e);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.c.readByte();
            byte[] bArr = yy7.a;
            int i5 = readByte & 255;
            if ((readByte & 128) != 0) {
                i2 += (readByte & Byte.MAX_VALUE) << i4;
                i4 += 7;
            } else {
                return i2 + (i5 << i4);
            }
        }
    }
}
