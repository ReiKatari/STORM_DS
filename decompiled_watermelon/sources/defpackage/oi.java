package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import java.io.FileOutputStream;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oi  reason: default package */
/* loaded from: classes.dex */
public final class oi implements b43 {
    public final /* synthetic */ int A;
    public int B;
    public final Object L;
    public Object R;
    public Object X;

    public oi(Bitmap bitmap, sb6 sb6Var, ln4 ln4Var, int i) {
        boolean z;
        this.A = 4;
        if (bitmap != null) {
            z = true;
        } else {
            z = false;
        }
        if (z != (sb6Var != null)) {
            this.R = bitmap;
            this.X = sb6Var;
            StringBuilder sb = e67.a;
            if (ln4Var != null) {
                this.L = ln4Var;
                this.B = i;
                return;
            }
            c44.i("loadedFrom == null");
            throw null;
        }
        throw new AssertionError();
    }

    public void a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.X;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.X = Arrays.copyOf(cArr, i3);
        }
    }

    public void b() {
        ((FileOutputStream) this.L).write((byte[]) this.R, 0, this.B);
        this.B = 0;
    }

    @Override // defpackage.b43
    public void c(char c) {
        byte[] bArr = (byte[]) this.R;
        if (c < 128) {
            if (bArr.length - this.B < 1) {
                b();
            }
            int i = this.B;
            this.B = i + 1;
            bArr[i] = (byte) c;
        } else if (c < 2048) {
            if (bArr.length - this.B < 2) {
                b();
            }
            int i2 = this.B;
            int i3 = i2 + 1;
            this.B = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.B = i2 + 2;
            bArr[i3] = (byte) ((c & '?') | 128);
        } else if (55296 <= c && c < 57344) {
            if (bArr.length - this.B < 1) {
                b();
            }
            int i4 = this.B;
            this.B = i4 + 1;
            bArr[i4] = 63;
        } else if (c < 0) {
            if (bArr.length - this.B < 3) {
                b();
            }
            int i5 = this.B;
            int i6 = i5 + 1;
            this.B = i6;
            bArr[i5] = (byte) ((c >> '\f') | 224);
            int i7 = i5 + 2;
            this.B = i7;
            bArr[i6] = (byte) (((c >> 6) & 63) | 128);
            this.B = i5 + 3;
            bArr[i7] = (byte) ((c & '?') | 128);
        } else if (c <= 65535) {
            if (bArr.length - this.B < 4) {
                b();
            }
            int i8 = this.B;
            int i9 = i8 + 1;
            this.B = i9;
            bArr[i8] = (byte) ((c >> 18) | 240);
            int i10 = i8 + 2;
            this.B = i10;
            bArr[i9] = (byte) (((c >> '\f') & 63) | 128);
            int i11 = i8 + 3;
            this.B = i11;
            bArr[i10] = (byte) (((c >> 6) & 63) | 128);
            this.B = i8 + 4;
            bArr[i11] = (byte) ((c & '?') | 128);
        } else {
            throw new s73(wh1.j("Unexpected code point: ", c, ". Check your strings for malformed UTF-8 sequences."), 6, null);
        }
    }

    public String d() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.B + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.R)[i2];
            if (obj instanceof h06) {
                h06 h06Var = (h06) obj;
                boolean x = b53.x(h06Var.c(), kh6.i);
                int[] iArr = (int[]) this.X;
                if (x) {
                    if (iArr[i2] != -1) {
                        sb.append("[");
                        sb.append(((int[]) this.X)[i2]);
                        sb.append("]");
                    }
                } else {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(h06Var.e(i3));
                    }
                }
            } else if (obj == y60.t0) {
                sb.append("[<debug info disabled>]");
            } else if (obj != iq0.g0) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    @Override // defpackage.b43
    public void e(String str) {
        int i;
        str.getClass();
        a(0, str.length() + 2);
        char[] cArr = (char[]) this.X;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i2 = length + 1;
        int i3 = 1;
        while (i3 < i2) {
            char c = cArr[i3];
            byte[] bArr = xg6.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i4 = i3 - 1; i4 < length2; i4++) {
                    a(i3, 2);
                    char charAt = str.charAt(i4);
                    byte[] bArr2 = xg6.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i3 + 1;
                            ((char[]) this.X)[i3] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = xg6.a[charAt];
                                str2.getClass();
                                a(i3, str2.length());
                                str2.getChars(0, str2.length(), (char[]) this.X, i3);
                                i3 = str2.length() + i3;
                            } else {
                                char[] cArr2 = (char[]) this.X;
                                cArr2[i3] = '\\';
                                cArr2[i3 + 1] = (char) b;
                                i3 += 2;
                            }
                        }
                    } else {
                        i = i3 + 1;
                        ((char[]) this.X)[i3] = charAt;
                    }
                    i3 = i;
                }
                a(i3, 1);
                char[] cArr3 = (char[]) this.X;
                cArr3[i3] = '\"';
                u(cArr3, i3 + 1);
                b();
                return;
            }
            i3++;
        }
        cArr[i2] = '\"';
        u(cArr, length + 2);
        b();
    }

    @Override // defpackage.b43
    public void f(String str) {
        str.getClass();
        int length = str.length();
        a(0, length);
        str.getChars(0, length, (char[]) this.X, 0);
        u((char[]) this.X, length);
    }

    public int g() {
        int i;
        Paint.Cap strokeCap = ((Paint) this.L).getStrokeCap();
        if (strokeCap == null) {
            i = -1;
        } else {
            i = pi.a[strokeCap.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    public int h() {
        int i;
        Paint.Join strokeJoin = ((Paint) this.L).getStrokeJoin();
        if (strokeJoin == null) {
            i = -1;
        } else {
            i = pi.b[strokeJoin.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public void i() {
        int i = this.B * 2;
        this.R = Arrays.copyOf((Object[]) this.R, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        nu.h0(0, 0, 14, (int[]) this.X, iArr);
        this.X = iArr;
    }

    public void j(float f) {
        ((Paint) this.L).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void k(int i) {
        if (this.B == i) {
            return;
        }
        this.B = i;
        Paint paint = (Paint) this.L;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(pu.J(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(pu.M(i)));
        }
    }

    public void l(long j) {
        ((Paint) this.L).setColor(mh7.h0(j));
    }

    public void m(b30 b30Var) {
        ColorFilter colorFilter;
        this.X = b30Var;
        Paint paint = (Paint) this.L;
        if (b30Var != null) {
            colorFilter = b30Var.a;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    public void n(int i) {
        boolean z;
        Paint paint = (Paint) this.L;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        paint.setFilterBitmap(!z);
    }

    public void o(wi wiVar) {
        ((Paint) this.L).setPathEffect(null);
    }

    public void p(Shader shader) {
        this.R = shader;
        ((Paint) this.L).setShader(shader);
    }

    public void q(int i) {
        Paint.Cap cap;
        Paint paint = (Paint) this.L;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i == 0) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void r(int i) {
        Paint.Join join;
        Paint paint = (Paint) this.L;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else if (i == 1) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public void s(float f) {
        ((Paint) this.L).setStrokeWidth(f);
    }

    public void t(int i) {
        Paint.Style style;
        Paint paint = (Paint) this.L;
        if (i == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }

    public String toString() {
        switch (this.A) {
            case 1:
                return d();
            default:
                return super.toString();
        }
    }

    public void u(char[] cArr, int i) {
        char c;
        byte[] bArr = (byte[]) this.R;
        if (i >= 0) {
            if (i <= cArr.length) {
                int i2 = 0;
                while (i2 < i) {
                    char c2 = cArr[i2];
                    if (c2 < 128) {
                        if (bArr.length - this.B < 1) {
                            b();
                        }
                        int i3 = this.B;
                        int i4 = i3 + 1;
                        this.B = i4;
                        bArr[i3] = (byte) c2;
                        i2++;
                        int min = Math.min(i, (bArr.length - i4) + i2);
                        while (i2 < min) {
                            char c3 = cArr[i2];
                            if (c3 < 128) {
                                int i5 = this.B;
                                this.B = i5 + 1;
                                bArr[i5] = (byte) c3;
                                i2++;
                            }
                        }
                    } else {
                        if (c2 < 2048) {
                            if (bArr.length - this.B < 2) {
                                b();
                            }
                            int i6 = this.B;
                            int i7 = i6 + 1;
                            this.B = i7;
                            bArr[i6] = (byte) ((c2 >> 6) | 192);
                            this.B = i6 + 2;
                            bArr[i7] = (byte) ((c2 & '?') | 128);
                        } else if (c2 >= 55296 && c2 <= 57343) {
                            int i8 = i2 + 1;
                            if (i8 < i) {
                                c = cArr[i8];
                            } else {
                                c = 0;
                            }
                            if (c2 <= 56319 && 56320 <= c && c < 57344) {
                                int i9 = (((c2 & 1023) << 10) | (c & 1023)) + 65536;
                                if (bArr.length - this.B < 4) {
                                    b();
                                }
                                int i10 = this.B;
                                int i11 = i10 + 1;
                                this.B = i11;
                                bArr[i10] = (byte) ((i9 >> 18) | 240);
                                int i12 = i10 + 2;
                                this.B = i12;
                                bArr[i11] = (byte) (((i9 >> 12) & 63) | 128);
                                int i13 = i10 + 3;
                                this.B = i13;
                                bArr[i12] = (byte) (((i9 >> 6) & 63) | 128);
                                this.B = i10 + 4;
                                bArr[i13] = (byte) ((i9 & 63) | 128);
                                i2 += 2;
                            } else {
                                if (bArr.length - this.B < 1) {
                                    b();
                                }
                                int i14 = this.B;
                                this.B = i14 + 1;
                                bArr[i14] = 63;
                                i2 = i8;
                            }
                        } else {
                            if (bArr.length - this.B < 3) {
                                b();
                            }
                            int i15 = this.B;
                            int i16 = i15 + 1;
                            this.B = i16;
                            bArr[i15] = (byte) ((c2 >> '\f') | 224);
                            int i17 = i15 + 2;
                            this.B = i17;
                            bArr[i16] = (byte) (((c2 >> 6) & 63) | 128);
                            this.B = i15 + 3;
                            bArr[i17] = (byte) ((c2 & '?') | 128);
                        }
                        i2++;
                    }
                }
                return;
            }
            StringBuilder s = wh1.s("count > string.length: ", i, " > ");
            s.append(cArr.length);
            throw new IllegalArgumentException(s.toString().toString());
        }
        i.i("count < 0");
    }

    @Override // defpackage.b43
    public void writeLong(long j) {
        f(String.valueOf(j));
    }

    public oi(e73 e73Var) {
        this.A = 1;
        this.L = e73Var;
        this.R = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.X = iArr;
        this.B = -1;
    }

    public oi(l34 l34Var, int i) {
        this.A = 3;
        this.L = l34Var.Y;
        this.B = i;
        qg1 qg1Var = l34Var.c0;
        this.R = qg1Var.c();
        Bundle k = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
        this.X = k;
        ((yt5) qg1Var.j).c(k);
    }

    public oi(Bundle bundle) {
        this.A = 3;
        bundle.getClass();
        this.L = hk2.D(bundle, "nav-entry-state:id");
        this.B = hk2.x(bundle, "nav-entry-state:destination-id");
        this.R = hk2.A(bundle, "nav-entry-state:args");
        this.X = hk2.A(bundle, "nav-entry-state:saved-state");
    }

    public oi(Paint paint) {
        this.A = 0;
        this.L = paint;
        this.B = 3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oi(sb6 sb6Var, ln4 ln4Var) {
        this((Bitmap) null, sb6Var, ln4Var, 0);
        this.A = 4;
        StringBuilder sb = e67.a;
        if (sb6Var != null) {
        } else {
            c44.i("source == null");
            throw null;
        }
    }

    public oi(FileOutputStream fileOutputStream) {
        this.A = 2;
        this.L = fileOutputStream;
        this.R = o70.c.c(512);
        this.X = ak0.c.d(128);
    }

    public oi(int i, h60 h60Var, e31 e31Var, u92 u92Var) {
        this.A = 5;
        this.L = u92Var;
        this.B = i;
        this.R = h60Var;
        this.X = e31Var;
    }
}
