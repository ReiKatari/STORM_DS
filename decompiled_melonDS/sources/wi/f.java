package wi;

import d1.g2;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public final fj.a0 f14238c;

    /* renamed from: f  reason: collision with root package name */
    public int f14241f;

    /* renamed from: g  reason: collision with root package name */
    public int f14242g;

    /* renamed from: a  reason: collision with root package name */
    public int f14236a = 4096;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f14237b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public e[] f14239d = new e[8];

    /* renamed from: e  reason: collision with root package name */
    public int f14240e = 7;

    public f(s sVar) {
        this.f14238c = new fj.a0(sVar);
    }

    public final int a(int i2) {
        int i10;
        int i11 = 0;
        if (i2 > 0) {
            int length = this.f14239d.length;
            while (true) {
                length--;
                i10 = this.f14240e;
                if (length < i10 || i2 <= 0) {
                    break;
                }
                e eVar = this.f14239d[length];
                eVar.getClass();
                int i12 = eVar.f14235c;
                i2 -= i12;
                this.f14242g -= i12;
                this.f14241f--;
                i11++;
            }
            e[] eVarArr = this.f14239d;
            System.arraycopy(eVarArr, i10 + 1, eVarArr, i10 + 1 + i11, this.f14241f);
            this.f14240e += i11;
        }
        return i11;
    }

    public final fj.h b(int i2) {
        if (i2 >= 0) {
            e[] eVarArr = h.f14251a;
            if (i2 <= eVarArr.length - 1) {
                return eVarArr[i2].f14233a;
            }
        }
        int length = this.f14240e + 1 + (i2 - h.f14251a.length);
        if (length >= 0) {
            e[] eVarArr2 = this.f14239d;
            if (length < eVarArr2.length) {
                e eVar = eVarArr2[length];
                eVar.getClass();
                return eVar.f14233a;
            }
        }
        throw new IOException("Header index too large " + (i2 + 1));
    }

    public final void c(e eVar) {
        this.f14237b.add(eVar);
        int i2 = eVar.f14235c;
        int i10 = this.f14236a;
        if (i2 > i10) {
            zb.k.u(this.f14239d, null);
            this.f14240e = this.f14239d.length - 1;
            this.f14241f = 0;
            this.f14242g = 0;
            return;
        }
        a((this.f14242g + i2) - i10);
        int i11 = this.f14241f + 1;
        e[] eVarArr = this.f14239d;
        if (i11 > eVarArr.length) {
            e[] eVarArr2 = new e[eVarArr.length * 2];
            System.arraycopy(eVarArr, 0, eVarArr2, eVarArr.length, eVarArr.length);
            this.f14240e = this.f14239d.length - 1;
            this.f14239d = eVarArr2;
        }
        int i12 = this.f14240e;
        this.f14240e = i12 - 1;
        this.f14239d[i12] = eVar;
        this.f14241f++;
        this.f14242g += i2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [fj.e, java.lang.Object] */
    public final fj.h d() {
        boolean z10;
        fj.a0 a0Var = this.f14238c;
        byte readByte = a0Var.readByte();
        byte[] bArr = qi.e.f12548a;
        int i2 = readByte & 255;
        int i10 = 0;
        if ((readByte & 128) == 128) {
            z10 = true;
        } else {
            z10 = false;
        }
        long e6 = e(i2, 127);
        if (z10) {
            ?? obj = new Object();
            int[] iArr = z.f14291a;
            a0Var.getClass();
            g2 g2Var = z.f14293c;
            g2 g2Var2 = g2Var;
            int i11 = 0;
            for (long j2 = 0; j2 < e6; j2++) {
                byte readByte2 = a0Var.readByte();
                byte[] bArr2 = qi.e.f12548a;
                i10 = (i10 << 8) | (readByte2 & 255);
                i11 += 8;
                while (i11 >= 8) {
                    g2[] g2VarArr = (g2[]) g2Var2.L;
                    g2VarArr.getClass();
                    g2Var2 = g2VarArr[(i10 >>> (i11 - 8)) & 255];
                    g2Var2.getClass();
                    if (((g2[]) g2Var2.L) == null) {
                        obj.e0(g2Var2.A);
                        i11 -= g2Var2.B;
                        g2Var2 = g2Var;
                    } else {
                        i11 -= 8;
                    }
                }
            }
            while (i11 > 0) {
                g2[] g2VarArr2 = (g2[]) g2Var2.L;
                g2VarArr2.getClass();
                g2 g2Var3 = g2VarArr2[(i10 << (8 - i11)) & 255];
                g2Var3.getClass();
                int i12 = g2Var3.B;
                if (((g2[]) g2Var3.L) != null || i12 > i11) {
                    break;
                }
                obj.e0(g2Var3.A);
                i11 -= i12;
                g2Var2 = g2Var;
            }
            return obj.o(obj.B);
        }
        return a0Var.o(e6);
    }

    public final int e(int i2, int i10) {
        int i11 = i2 & i10;
        if (i11 < i10) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            byte readByte = this.f14238c.readByte();
            byte[] bArr = qi.e.f12548a;
            int i13 = readByte & 255;
            if ((readByte & 128) != 0) {
                i10 += (readByte & Byte.MAX_VALUE) << i12;
                i12 += 7;
            } else {
                return i10 + (i13 << i12);
            }
        }
    }
}
