package defpackage;

import java.io.IOException;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: us2  reason: default package */
/* loaded from: classes.dex */
public final class us2 {
    public final s45 c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public tq2[] d = new tq2[8];
    public int e = 7;

    public us2(rt2 rt2Var) {
        this.c = new s45(rt2Var);
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
                tq2 tq2Var = this.d[length];
                tq2Var.getClass();
                int i4 = tq2Var.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            tq2[] tq2VarArr = this.d;
            System.arraycopy(tq2VarArr, i2 + 1, tq2VarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final w70 b(int i) {
        if (i >= 0) {
            tq2[] tq2VarArr = ws2.a;
            if (i <= tq2VarArr.length - 1) {
                return tq2VarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - ws2.a.length);
        if (length >= 0) {
            tq2[] tq2VarArr2 = this.d;
            if (length < tq2VarArr2.length) {
                tq2 tq2Var = tq2VarArr2[length];
                tq2Var.getClass();
                return tq2Var.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(tq2 tq2Var) {
        this.b.add(tq2Var);
        int i = tq2Var.c;
        int i2 = this.a;
        if (i > i2) {
            nu.l0(0, r7.length, null, this.d);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        tq2[] tq2VarArr = this.d;
        if (i3 > tq2VarArr.length) {
            tq2[] tq2VarArr2 = new tq2[tq2VarArr.length * 2];
            System.arraycopy(tq2VarArr, 0, tq2VarArr2, tq2VarArr.length, tq2VarArr.length);
            this.e = this.d.length - 1;
            this.d = tq2VarArr2;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = tq2Var;
        this.f++;
        this.g += i;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [f60, java.lang.Object] */
    public final w70 d() {
        boolean z;
        s45 s45Var = this.c;
        byte readByte = s45Var.readByte();
        byte[] bArr = gk7.a;
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
            int[] iArr = iu2.a;
            s45Var.getClass();
            k70 k70Var = iu2.c;
            k70 k70Var2 = k70Var;
            int i3 = 0;
            for (long j = 0; j < e; j++) {
                byte readByte2 = s45Var.readByte();
                byte[] bArr2 = gk7.a;
                i2 = (i2 << 8) | (readByte2 & 255);
                i3 += 8;
                while (i3 >= 8) {
                    k70[] k70VarArr = (k70[]) k70Var2.L;
                    k70VarArr.getClass();
                    k70Var2 = k70VarArr[(i2 >>> (i3 - 8)) & 255];
                    k70Var2.getClass();
                    if (((k70[]) k70Var2.L) == null) {
                        obj.m0(k70Var2.A);
                        i3 -= k70Var2.B;
                        k70Var2 = k70Var;
                    } else {
                        i3 -= 8;
                    }
                }
            }
            while (i3 > 0) {
                k70[] k70VarArr2 = (k70[]) k70Var2.L;
                k70VarArr2.getClass();
                k70 k70Var3 = k70VarArr2[(i2 << (8 - i3)) & 255];
                k70Var3.getClass();
                int i4 = k70Var3.B;
                if (((k70[]) k70Var3.L) != null || i4 > i3) {
                    break;
                }
                obj.m0(k70Var3.A);
                i3 -= i4;
                k70Var2 = k70Var;
            }
            return obj.r(obj.B);
        }
        return s45Var.r(e);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.c.readByte();
            byte[] bArr = gk7.a;
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
