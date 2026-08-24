package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ei  reason: default package */
/* loaded from: classes.dex */
public final class ei implements dx6 {
    public final /* synthetic */ int A;
    public int B;
    public Object L;
    public Object R;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
        if (r9 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ei(l93 l93Var, uj2 uj2Var) {
        Object pe1Var;
        this.A = 5;
        ei J = uj2Var.J();
        int i = l93Var.A;
        if (i < 0) {
            s53.c("negative nearestRange.first");
        }
        int min = Math.min(l93Var.B, J.B - 1);
        if (min < i) {
            y94 y94Var = th4.a;
            y94Var.getClass();
            this.L = y94Var;
            this.R = new Object[0];
            this.B = 0;
            return;
        }
        int i2 = (min - i) + 1;
        this.R = new Object[i2];
        this.B = i;
        y94 y94Var2 = new y94(i2);
        ua4 ua4Var = (ua4) J.L;
        if (i < 0 || i >= J.B) {
            StringBuilder t = xg6.t("Index ", i, ", size ");
            t.append(J.B);
            s53.e(t.toString());
        }
        if (min < 0 || min >= J.B) {
            StringBuilder t2 = xg6.t("Index ", min, ", size ");
            t2.append(J.B);
            s53.e(t2.toString());
        }
        if (min < i) {
            s53.a("toIndex (" + min + ") should be not smaller than fromIndex (" + i + ')');
        }
        int f = mp2.f(i, ua4Var);
        int i3 = ((bb3) ua4Var.A[f]).a;
        while (i3 <= min) {
            bb3 bb3Var = (bb3) ua4Var.A[f];
            qn2 key = bb3Var.c.getKey();
            int i4 = bb3Var.a;
            int max = Math.max(i, i4);
            int min2 = Math.min(min, (bb3Var.b + i4) - 1);
            if (max <= min2) {
                while (true) {
                    if (key != null) {
                        pe1Var = key.g(Integer.valueOf(max - i4));
                    }
                    pe1Var = new pe1(max);
                    y94Var2.g(max, pe1Var);
                    ((Object[]) this.R)[max - this.B] = pe1Var;
                    max = max != min2 ? max + 1 : max;
                }
            }
            i3 += bb3Var.b;
            f++;
        }
        this.L = y94Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f2, code lost:
        if (r10 == 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f5, code lost:
        if (r10 == 2) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f7, code lost:
        r1 = r0.a;
        r0 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fd, code lost:
        if (r13 == 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ff, code lost:
        if (r13 == 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0201, code lost:
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0210, code lost:
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0213, code lost:
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0216, code lost:
        r12 = new android.graphics.LinearGradient(r21, r24, r25, r16, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021a, code lost:
        r12 = new android.graphics.SweepGradient(r8, r12, r0.a, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0229, code lost:
        if (r23 <= androidx.recyclerview.widget.RecyclerView.B1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x022b, code lost:
        r1 = r0.a;
        r0 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0233, code lost:
        if (r13 == 1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0235, code lost:
        if (r13 == 2) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0237, code lost:
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0246, code lost:
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0249, code lost:
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024c, code lost:
        r12 = new android.graphics.RadialGradient(r8, r12, r23, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0259, code lost:
        return new defpackage.ei(r12, 0, 3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0261, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d7, code lost:
        if (r9.size() <= 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d9, code lost:
        r0 = new defpackage.bb0(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01df, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e0, code lost:
        if (r0 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e4, code lost:
        if (r19 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e6, code lost:
        r0 = new defpackage.bb0(r6, r11, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ec, code lost:
        r0 = new defpackage.bb0(r6, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ei c(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        float f7;
        int i6;
        float f8;
        float f9;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.getClass();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    ColorStateList b = rt0.b(resources, xml, asAttributeSet, theme);
                    return new ei(null, b.getDefaultColor(), 3, b);
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            String name2 = xml.getName();
            if (name2.equals("gradient")) {
                TypedArray D = xk2.D(resources, theme, asAttributeSet, g75.e);
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) {
                    f = D.getFloat(8, RecyclerView.B1);
                } else {
                    f = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null) {
                    f2 = D.getFloat(9, RecyclerView.B1);
                } else {
                    f2 = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null) {
                    f3 = D.getFloat(10, RecyclerView.B1);
                } else {
                    f3 = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null) {
                    f4 = D.getFloat(11, RecyclerView.B1);
                } else {
                    f4 = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) {
                    f5 = D.getFloat(3, RecyclerView.B1);
                } else {
                    f5 = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null) {
                    f6 = D.getFloat(4, RecyclerView.B1);
                } else {
                    f6 = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) {
                    i2 = D.getInt(2, 0);
                } else {
                    i2 = 0;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null) {
                    i3 = D.getColor(0, 0);
                } else {
                    i3 = 0;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null) {
                    i4 = D.getColor(7, 0);
                } else {
                    i4 = 0;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
                    i5 = D.getColor(1, 0);
                } else {
                    i5 = 0;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
                    f7 = f;
                    i6 = D.getInt(6, 0);
                } else {
                    f7 = f;
                    i6 = 0;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null) {
                    f8 = D.getFloat(5, RecyclerView.B1);
                } else {
                    f8 = RecyclerView.B1;
                }
                D.recycle();
                int depth = xml.getDepth() + 1;
                ArrayList arrayList = new ArrayList(20);
                float f10 = f8;
                ArrayList arrayList2 = new ArrayList(20);
                while (true) {
                    int next2 = xml.next();
                    float f11 = f2;
                    if (next2 != 1) {
                        int depth2 = xml.getDepth();
                        f9 = f3;
                        if (depth2 < depth && next2 == 3) {
                            break;
                        }
                        if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                            TypedArray D2 = xk2.D(resources, theme, asAttributeSet, g75.f);
                            boolean hasValue = D2.hasValue(0);
                            boolean hasValue2 = D2.hasValue(1);
                            if (!hasValue || !hasValue2) {
                                break;
                            }
                            int color = D2.getColor(0, 0);
                            float f12 = D2.getFloat(1, RecyclerView.B1);
                            D2.recycle();
                            arrayList2.add(Integer.valueOf(color));
                            arrayList.add(Float.valueOf(f12));
                        }
                        f2 = f11;
                        f3 = f9;
                    } else {
                        f9 = f3;
                        break;
                    }
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static /* synthetic */ void h(ei eiVar, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        int i8;
        if ((i7 & 32) != 0) {
            i8 = -1;
        } else {
            i8 = i6;
        }
        eiVar.g(i, i2, i3, i4, i5, i8, z, z2, z3, -1);
    }

    public void a(int i, vp3 vp3Var) {
        if (i < 0) {
            s53.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        bb3 bb3Var = new bb3(this.B, i, vp3Var);
        this.B += i;
        ((ua4) this.L).b(bb3Var);
    }

    public void b() {
        wz0 wz0Var;
        ImageView imageView = (ImageView) this.L;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            bp1.a(drawable);
        }
        if (drawable != null && (wz0Var = (wz0) this.R) != null) {
            ir.e(drawable, wz0Var, imageView.getDrawableState());
        }
    }

    public bb3 d(int i) {
        if (i < 0 || i >= this.B) {
            StringBuilder t = xg6.t("Index ", i, ", size ");
            t.append(this.B);
            s53.e(t.toString());
        }
        bb3 bb3Var = (bb3) this.R;
        if (bb3Var != null) {
            int i2 = bb3Var.a;
            if (i < bb3Var.b + i2 && i2 <= i) {
                return bb3Var;
            }
        }
        ua4 ua4Var = (ua4) this.L;
        bb3 bb3Var2 = (bb3) ua4Var.A[mp2.f(i, ua4Var)];
        this.R = bb3Var2;
        return bb3Var2;
    }

    public int e(Object obj) {
        y94 y94Var = (y94) this.L;
        int d = y94Var.d(obj);
        if (d >= 0) {
            return y94Var.c[d];
        }
        return -1;
    }

    public Object f(int i) {
        Object[] objArr = (Object[]) this.R;
        int i2 = i - this.B;
        if (i2 >= 0 && i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }

    public void g(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        int i8;
        long[] jArr = (long[]) this.L;
        int i9 = this.B;
        int i10 = i9 + 3;
        this.B = i10;
        int length = jArr.length;
        if (length <= i10) {
            int max = Math.max(length * 2, i10);
            this.L = Arrays.copyOf(jArr, max);
            this.R = Arrays.copyOf((long[]) this.R, max);
        }
        long[] jArr2 = (long[]) this.L;
        jArr2[i9] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i9 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (Math.min(0, 1023) << 50) | (i11 << 25) | (i & 33554431);
        if (i6 >= 0) {
            if (i7 != -1) {
                i8 = i7;
            } else {
                i8 = i9 - 3;
            }
            while (i8 >= 0) {
                int i12 = i8 + 2;
                long j = jArr2[i12];
                if ((((int) j) & 33554431) == i11) {
                    int i13 = qf5.b;
                    jArr2[i12] = (Math.min((i9 - i8) / 3, 1023) << 50) | (j & (-1151795604700004353L));
                    return;
                }
                i8 -= 3;
            }
        }
    }

    public boolean i() {
        ColorStateList colorStateList;
        if (((Shader) this.L) == null && (colorStateList = (ColorStateList) this.R) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void j(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.L;
        Context context = imageView.getContext();
        int[] iArr = m75.f;
        m44 A = m44.A(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) A.L;
        ao7.m(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) A.L, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = hf.S(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                bp1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(A.g(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(bp1.c(typedArray.getInt(3, -1), null));
            }
            A.D();
        } catch (Throwable th) {
            A.D();
            throw th;
        }
    }

    public void k(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.L;
        int i3 = this.B;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = 8070450532247928831L & j;
                long j3 = z ? 1L : 0L;
                jArr[i5] = j2 | (1152921504606846976L * j3) | (j3 * Long.MIN_VALUE);
                return;
            }
        }
    }

    public void l(long j, int i, int i2) {
        int i3;
        int i4;
        char c;
        char c2;
        long[] jArr = (long[]) this.L;
        long[] jArr2 = (long[]) this.R;
        jArr2[0] = j;
        int i5 = 1;
        while (i5 > 0) {
            i5--;
            long j2 = jArr2[i5];
            int i6 = 33554431;
            int i7 = ((int) j2) & 33554431;
            char c3 = 25;
            int i8 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i9 = ((int) (j2 >> 50)) & 1023;
            if (i9 == 1023) {
                i3 = this.B;
            } else {
                i3 = (i9 * 3) + i8;
            }
            if (i8 >= 0) {
                while (i8 < jArr.length - 2 && i8 < i3) {
                    int i10 = i8 + 2;
                    long j3 = jArr[i10];
                    if ((((int) (j3 >> c3)) & i6) == i7) {
                        long j4 = jArr[i8];
                        int i11 = i8 + 1;
                        i4 = i6;
                        c = c3;
                        long j5 = jArr[i11];
                        c2 = c4;
                        jArr[i8] = ((((int) j4) + i2) & 4294967295L) | ((((int) (j4 >> 32)) + i) << 32);
                        jArr[i11] = ((((int) j5) + i2) & 4294967295L) | ((((int) (j5 >> 32)) + i) << 32);
                        jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                        if ((((int) (j3 >> c2)) & 1023) > 0) {
                            int i12 = qf5.b;
                            jArr2[i5] = ((-1125899873288193L) & j3) | (((i8 + 3) & i4) << c);
                            i5++;
                        }
                    } else {
                        i4 = i6;
                        c = c3;
                        c2 = c4;
                    }
                    i8 += 3;
                    i6 = i4;
                    c3 = c;
                    c4 = c2;
                }
            } else {
                return;
            }
        }
    }

    public void m(int i, go2 go2Var) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.L;
        int i3 = this.B;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                go2Var.l(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    @Override // defpackage.dx6
    public Object n() {
        int i = this.B;
        ((bt) ((p87) this.L).d).U((fz) this.R, i + 1, false);
        return null;
    }

    public String toString() {
        switch (this.A) {
            case 8:
                StringBuilder sb = new StringBuilder();
                if (((k55) this.L) == k55.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.B);
                sb.append(' ');
                sb.append((String) this.R);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ei(Object obj, int i, int i2, Object obj2) {
        this.A = i2;
        this.L = obj;
        this.R = obj2;
        this.B = i;
    }

    public ei(k55 k55Var, int i, String str) {
        this.A = 8;
        k55Var.getClass();
        this.L = k55Var;
        this.B = i;
        this.R = str;
    }

    public ei(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.A = 0;
        this.L = arrayList;
        this.B = i;
        this.R = motionEvent;
        if (arrayList.isEmpty()) {
            i.h("changes cannot be empty");
            throw null;
        }
    }

    public ei(ImageView imageView) {
        this.A = 1;
        this.B = 0;
        this.L = imageView;
    }

    public /* synthetic */ ei(int i) {
        this.A = i;
    }

    public ei() {
        this.A = 4;
        this.L = new ua4(new bb3[16]);
    }

    public ei(fo7 fo7Var) {
        this.A = 2;
        this.L = fo7Var;
    }
}
