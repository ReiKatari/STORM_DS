package cd;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import java.io.FileOutputStream;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h1 implements pd.n {
    public int A;
    public final Object B;
    public Object L;
    public Object R;

    public h1(Bitmap bitmap, fj.g0 g0Var, com.squareup.picasso.y yVar, int i2) {
        boolean z10;
        if (bitmap != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != (g0Var != null)) {
            this.L = bitmap;
            this.R = g0Var;
            StringBuilder sb2 = com.squareup.picasso.k0.f3247a;
            if (yVar != null) {
                this.B = yVar;
                this.A = i2;
                return;
            }
            m9.o.i("loadedFrom == null");
            throw null;
        }
        throw new AssertionError();
    }

    @Override // pd.n
    public void a(char c4) {
        byte[] bArr = (byte[]) this.L;
        if (c4 < 128) {
            if (bArr.length - this.A < 1) {
                e();
            }
            int i2 = this.A;
            this.A = i2 + 1;
            bArr[i2] = (byte) c4;
        } else if (c4 < 2048) {
            if (bArr.length - this.A < 2) {
                e();
            }
            int i10 = this.A;
            int i11 = i10 + 1;
            this.A = i11;
            bArr[i10] = (byte) ((c4 >> 6) | 192);
            this.A = i10 + 2;
            bArr[i11] = (byte) ((c4 & '?') | 128);
        } else if (55296 <= c4 && c4 < 57344) {
            if (bArr.length - this.A < 1) {
                e();
            }
            int i12 = this.A;
            this.A = i12 + 1;
            bArr[i12] = (byte) 63;
        } else if (c4 < 0) {
            if (bArr.length - this.A < 3) {
                e();
            }
            int i13 = this.A;
            int i14 = i13 + 1;
            this.A = i14;
            bArr[i13] = (byte) ((c4 >> '\f') | 224);
            int i15 = i13 + 2;
            this.A = i15;
            bArr[i14] = (byte) (((c4 >> 6) & 63) | 128);
            this.A = i13 + 3;
            bArr[i15] = (byte) ((c4 & '?') | 128);
        } else if (c4 <= 65535) {
            if (bArr.length - this.A < 4) {
                e();
            }
            int i16 = this.A;
            int i17 = i16 + 1;
            this.A = i17;
            bArr[i16] = (byte) ((c4 >> 18) | 240);
            int i18 = i16 + 2;
            this.A = i18;
            bArr[i17] = (byte) (((c4 >> '\f') & 63) | 128);
            int i19 = i16 + 3;
            this.A = i19;
            bArr[i18] = (byte) (((c4 >> 6) & 63) | 128);
            this.A = i16 + 4;
            bArr[i19] = (byte) ((c4 & '?') | 128);
        } else {
            throw new IllegalArgumentException(w.d.l(c4, "Unexpected code point: "));
        }
    }

    @Override // pd.n
    public void b(String str) {
        int i2;
        str.getClass();
        c(0, str.length() + 2);
        char[] cArr = (char[]) this.R;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i10 = length + 1;
        int i11 = 1;
        while (i11 < i10) {
            char c4 = cArr[i11];
            byte[] bArr = pd.j0.f11592b;
            if (c4 < bArr.length && bArr[c4] != 0) {
                int length2 = str.length();
                for (int i12 = i11 - 1; i12 < length2; i12++) {
                    c(i11, 2);
                    char charAt = str.charAt(i12);
                    byte[] bArr2 = pd.j0.f11592b;
                    if (charAt < bArr2.length) {
                        byte b10 = bArr2[charAt];
                        if (b10 == 0) {
                            i2 = i11 + 1;
                            ((char[]) this.R)[i11] = charAt;
                        } else {
                            if (b10 == 1) {
                                String str2 = pd.j0.f11591a[charAt];
                                str2.getClass();
                                c(i11, str2.length());
                                str2.getChars(0, str2.length(), (char[]) this.R, i11);
                                i11 = str2.length() + i11;
                            } else {
                                char[] cArr2 = (char[]) this.R;
                                cArr2[i11] = '\\';
                                cArr2[i11 + 1] = (char) b10;
                                i11 += 2;
                            }
                        }
                    } else {
                        i2 = i11 + 1;
                        ((char[]) this.R)[i11] = charAt;
                    }
                    i11 = i2;
                }
                c(i11, 1);
                char[] cArr3 = (char[]) this.R;
                cArr3[i11] = '\"';
                r(cArr3, i11 + 1);
                e();
                return;
            }
            i11++;
        }
        cArr[i10] = '\"';
        r(cArr, length + 2);
        e();
    }

    public void c(int i2, int i10) {
        int i11 = i10 + i2;
        char[] cArr = (char[]) this.R;
        if (cArr.length <= i11) {
            int i12 = i2 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            this.R = Arrays.copyOf(cArr, i11);
        }
    }

    @Override // pd.n
    public void d(String str) {
        str.getClass();
        int length = str.length();
        c(0, length);
        str.getChars(0, length, (char[]) this.R, 0);
        r((char[]) this.R, length);
    }

    public void e() {
        ((FileOutputStream) this.B).write((byte[]) this.L, 0, this.A);
        this.A = 0;
    }

    public int f() {
        int i2;
        Paint.Cap strokeCap = ((Paint) this.B).getStrokeCap();
        if (strokeCap == null) {
            i2 = -1;
        } else {
            i2 = i3.g.f6632a[strokeCap.ordinal()];
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 3) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    public int g() {
        int i2;
        Paint.Join strokeJoin = ((Paint) this.B).getStrokeJoin();
        if (strokeJoin == null) {
            i2 = -1;
        } else {
            i2 = i3.g.f6633b[strokeJoin.ordinal()];
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return 2;
            }
            if (i2 == 3) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public void h(float f8) {
        ((Paint) this.B).setAlpha((int) Math.rint(f8 * 255.0f));
    }

    public void i(int i2) {
        if (this.A == i2) {
            return;
        }
        this.A = i2;
        Paint paint = (Paint) this.B;
        if (Build.VERSION.SDK_INT >= 29) {
            i3.a.f(paint, i3.z.v(i2));
        } else {
            paint.setXfermode(new PorterDuffXfermode(i3.z.C(i2)));
        }
    }

    public void j(long j2) {
        ((Paint) this.B).setColor(i3.z.y(j2));
    }

    public void k(i3.l lVar) {
        ColorFilter colorFilter;
        this.R = lVar;
        Paint paint = (Paint) this.B;
        if (lVar != null) {
            colorFilter = lVar.f6653a;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    public void l(int i2) {
        boolean z10;
        Paint paint = (Paint) this.B;
        if (i2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        paint.setFilterBitmap(!z10);
    }

    public void m(Shader shader) {
        this.L = shader;
        ((Paint) this.B).setShader(shader);
    }

    public void n(int i2) {
        Paint.Cap cap;
        Paint paint = (Paint) this.B;
        if (i2 == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i2 == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i2 == 0) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void o(int i2) {
        Paint.Join join;
        Paint paint = (Paint) this.B;
        if (i2 == 0) {
            join = Paint.Join.MITER;
        } else if (i2 == 2) {
            join = Paint.Join.BEVEL;
        } else if (i2 == 1) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public void p(float f8) {
        ((Paint) this.B).setStrokeWidth(f8);
    }

    public void q(int i2) {
        Paint.Style style;
        Paint paint = (Paint) this.B;
        if (i2 == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }

    public void r(char[] cArr, int i2) {
        char c4;
        byte[] bArr = (byte[]) this.L;
        if (i2 >= 0) {
            if (i2 <= cArr.length) {
                int i10 = 0;
                while (i10 < i2) {
                    char c10 = cArr[i10];
                    if (c10 < 128) {
                        if (bArr.length - this.A < 1) {
                            e();
                        }
                        int i11 = this.A;
                        int i12 = i11 + 1;
                        this.A = i12;
                        bArr[i11] = (byte) c10;
                        i10++;
                        int min = Math.min(i2, (bArr.length - i12) + i10);
                        while (i10 < min) {
                            char c11 = cArr[i10];
                            if (c11 < 128) {
                                int i13 = this.A;
                                this.A = i13 + 1;
                                bArr[i13] = (byte) c11;
                                i10++;
                            }
                        }
                    } else {
                        if (c10 < 2048) {
                            if (bArr.length - this.A < 2) {
                                e();
                            }
                            int i14 = this.A;
                            int i15 = i14 + 1;
                            this.A = i15;
                            bArr[i14] = (byte) ((c10 >> 6) | 192);
                            this.A = i14 + 2;
                            bArr[i15] = (byte) ((c10 & '?') | 128);
                        } else if (c10 >= 55296 && c10 <= 57343) {
                            int i16 = i10 + 1;
                            if (i16 < i2) {
                                c4 = cArr[i16];
                            } else {
                                c4 = 0;
                            }
                            if (c10 <= 56319 && 56320 <= c4 && c4 < 57344) {
                                int i17 = (((c10 & 1023) << 10) | (c4 & 1023)) + 65536;
                                if (bArr.length - this.A < 4) {
                                    e();
                                }
                                int i18 = this.A;
                                int i19 = i18 + 1;
                                this.A = i19;
                                bArr[i18] = (byte) ((i17 >> 18) | 240);
                                int i20 = i18 + 2;
                                this.A = i20;
                                bArr[i19] = (byte) (((i17 >> 12) & 63) | 128);
                                int i21 = i18 + 3;
                                this.A = i21;
                                bArr[i20] = (byte) (((i17 >> 6) & 63) | 128);
                                this.A = i18 + 4;
                                bArr[i21] = (byte) ((i17 & 63) | 128);
                                i10 += 2;
                            } else {
                                if (bArr.length - this.A < 1) {
                                    e();
                                }
                                int i22 = this.A;
                                this.A = i22 + 1;
                                bArr[i22] = (byte) 63;
                                i10 = i16;
                            }
                        } else {
                            if (bArr.length - this.A < 3) {
                                e();
                            }
                            int i23 = this.A;
                            int i24 = i23 + 1;
                            this.A = i24;
                            bArr[i23] = (byte) ((c10 >> '\f') | 224);
                            int i25 = i23 + 2;
                            this.A = i25;
                            bArr[i24] = (byte) (((c10 >> 6) & 63) | 128);
                            this.A = i23 + 3;
                            bArr[i25] = (byte) ((c10 & '?') | 128);
                        }
                        i10++;
                    }
                }
                return;
            }
            StringBuilder i26 = kc.a.i("count > string.length: ", i2, " > ");
            i26.append(cArr.length);
            throw new IllegalArgumentException(i26.toString().toString());
        }
        a0.j.h("count < 0");
    }

    @Override // pd.n
    public void writeLong(long j2) {
        d(String.valueOf(j2));
    }

    public h1(a7.i iVar, int i2) {
        this.B = iVar.Y;
        this.A = i2;
        com.squareup.picasso.m mVar = iVar.f576b0;
        this.L = mVar.c();
        Bundle b10 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
        this.R = b10;
        ((q7.e) mVar.f3261j).c(b10);
    }

    public h1(Paint paint) {
        this.B = paint;
        this.A = 3;
    }

    public h1(Bundle bundle) {
        bundle.getClass();
        this.B = p7.l.s(bundle, "nav-entry-state:id");
        this.A = p7.l.n(bundle, "nav-entry-state:destination-id");
        this.L = p7.l.p(bundle, "nav-entry-state:args");
        this.R = p7.l.p(bundle, "nav-entry-state:saved-state");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(fj.g0 g0Var, com.squareup.picasso.y yVar) {
        this((Bitmap) null, g0Var, yVar, 0);
        StringBuilder sb2 = com.squareup.picasso.k0.f3247a;
        if (g0Var != null) {
        } else {
            m9.o.i("source == null");
            throw null;
        }
    }

    public h1(FileOutputStream fileOutputStream) {
        this.B = fileOutputStream;
        this.L = pd.f.L.g(512);
        this.R = pd.h.L.h(128);
    }

    public h1(int i2, bd.a aVar, cc.g gVar, h hVar) {
        this.B = hVar;
        this.A = i2;
        this.L = aVar;
        this.R = gVar;
    }
}
