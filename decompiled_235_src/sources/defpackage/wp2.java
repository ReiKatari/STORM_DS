package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wp2  reason: default package */
/* loaded from: classes.dex */
public final class wp2 {
    public String a;
    public final ex6 b = new ex6(new ns1(6));
    public final ex6 c = new ex6(new ns1(7));
    public final ex6 d = new ex6(new ns1(8));

    public static final List a(wp2 wp2Var, List list) {
        boolean z;
        if (list.size() <= 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ta7 ta7Var = null;
        for (ta7 ta7Var2 : gt0.d1(list, new zh2(16))) {
            if (ta7Var != null) {
                RectF rectF = ta7Var.c;
                RectF rectF2 = ta7Var2.c;
                float f = rectF2.top - rectF.bottom;
                if (Math.min(rectF.right, rectF2.right) - Math.max(rectF.left, rectF2.left) > RecyclerView.B1) {
                    z = true;
                } else {
                    z = false;
                }
                if (-0.05f <= f && f <= 0.08f && z) {
                    ta7Var = ta7.a(ta7Var, lb1.m(ta7Var.a, " ", ta7Var2.a), new RectF(Math.min(rectF.left, rectF2.left), Math.min(rectF.top, rectF2.top), Math.max(rectF.right, rectF2.right), Math.max(rectF.bottom, rectF2.bottom)), 58);
                } else {
                    arrayList.add(ta7Var);
                }
            }
            ta7Var = ta7Var2;
        }
        if (ta7Var != null) {
            arrayList.add(ta7Var);
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:142|(1:144)|50|(4:52|(1:54)|40|41)|55|56|57|58|59|60|61|(17:63|64|(1:111)(1:68)|69|(1:110)(2:75|(9:77|78|(1:108)(1:84)|85|86|(1:107)(1:91)|(1:106)(1:96)|97|98))|109|78|(1:80)|108|85|86|(1:88)|107|(0)|106|97|98)|113|114|115|(6:102|(1:104)|36|(4:38|(1:42)|40|41)|43|(7:45|(1:47)|26|(2:29|27)|30|31|(1:34)(8:33|12|(2:15|13)|16|17|(1:19)|20|(2:22|23)(1:24)))(2:48|(0)(0)))(3:105|43|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04f6, code lost:
        r42 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0518, code lost:
        r42 = r3;
        r2 = r22;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x038f A[Catch: all -> 0x0414, TryCatch #4 {all -> 0x0414, blocks: (B:93:0x0355, B:97:0x0376, B:101:0x038f, B:103:0x0397, B:105:0x039b, B:110:0x03c1, B:111:0x03c4, B:113:0x03c9, B:117:0x03ea, B:118:0x03f3), top: B:232:0x0355 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03c9 A[Catch: all -> 0x0414, TryCatch #4 {all -> 0x0414, blocks: (B:93:0x0355, B:97:0x0376, B:101:0x038f, B:103:0x0397, B:105:0x039b, B:110:0x03c1, B:111:0x03c4, B:113:0x03c9, B:117:0x03ea, B:118:0x03f3), top: B:232:0x0355 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0486 A[Catch: all -> 0x04f6, TRY_LEAVE, TryCatch #5 {all -> 0x04f6, blocks: (B:136:0x0481, B:138:0x0486), top: B:234:0x0481 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05b2 A[LOOP:1: B:201:0x05ac->B:203:0x05b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x062b A[LOOP:0: B:209:0x0625->B:211:0x062b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0339 A[Catch: all -> 0x0368, TRY_LEAVE, TryCatch #6 {all -> 0x0368, blocks: (B:89:0x0334, B:91:0x0339), top: B:236:0x0334 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0376 A[Catch: all -> 0x0414, LOOP:4: B:96:0x0374->B:97:0x0376, LOOP_END, TryCatch #4 {all -> 0x0414, blocks: (B:93:0x0355, B:97:0x0376, B:101:0x038f, B:103:0x0397, B:105:0x039b, B:110:0x03c1, B:111:0x03c4, B:113:0x03c9, B:117:0x03ea, B:118:0x03f3), top: B:232:0x0355 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(wp2 wp2Var, Bitmap bitmap, String str, s41 s41Var) {
        vp2 vp2Var;
        int q;
        Bitmap bitmap2;
        Serializable d;
        List list;
        List list2;
        boolean z;
        String str2;
        Bitmap bitmap3;
        Bitmap bitmap4;
        String str3;
        Bitmap bitmap5;
        List list3;
        Bitmap bitmap6;
        Bitmap bitmap7;
        int i;
        int i2;
        int i3;
        String str4;
        List list4;
        Bitmap bitmap8;
        Bitmap bitmap9;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int[] iArr2;
        int i7;
        int i8;
        int i9;
        double d2;
        int i10;
        int i11;
        double d3;
        double d4;
        int i12;
        int i13;
        int i14;
        List list5;
        Bitmap bitmap10;
        Bitmap bitmap11;
        int i15;
        int i16;
        boolean z2;
        int[] iArr3;
        boolean z3;
        boolean z4;
        boolean z5;
        int i17;
        ArrayList arrayList;
        int height;
        Bitmap createBitmap;
        Serializable d5;
        Iterator it;
        Serializable d6;
        Bitmap bitmap12;
        ArrayList arrayList2;
        Bitmap bitmap13;
        ArrayList V0;
        Bitmap bitmap14 = bitmap;
        String str5 = str;
        if (s41Var instanceof vp2) {
            vp2Var = (vp2) s41Var;
            int i18 = vp2Var.l0;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                vp2Var.l0 = i18 - Integer.MIN_VALUE;
                Object obj = vp2Var.j0;
                Serializable serializable = x61.COROUTINE_SUSPENDED;
                String str6 = " blocks";
                switch (vp2Var.l0) {
                    case 0:
                        oi2.Y(obj);
                        bitmap14.getClass();
                        if (Math.min(bitmap14.getWidth(), bitmap14.getHeight()) >= 700) {
                            q = 1;
                        } else {
                            q = gi2.q(4, 2, 4);
                        }
                        if (q != 1) {
                            try {
                                int width = bitmap14.getWidth() * q;
                                int height2 = bitmap14.getHeight() * q;
                                bitmap2 = Bitmap.createBitmap(width, height2, Bitmap.Config.ARGB_8888);
                                bitmap2.getClass();
                                Canvas canvas = new Canvas(bitmap2);
                                Paint paint = new Paint();
                                paint.setFilterBitmap(false);
                                paint.setAntiAlias(false);
                                paint.setDither(false);
                                canvas.drawBitmap(bitmap14, (Rect) null, new Rect(0, 0, width, height2), paint);
                            } catch (Throwable unused) {
                                bitmap2 = bitmap14;
                            }
                            vp2Var.R = bitmap14;
                            vp2Var.X = str5;
                            vp2Var.Y = bitmap2;
                            vp2Var.l0 = 1;
                            d = wp2Var.d(bitmap2, str5, vp2Var);
                            if (d == serializable) {
                                return serializable;
                            }
                            list = (List) d;
                            if (!list.isEmpty()) {
                                Log.i("GameTextRecognizer", "OCR Pass 1 (4x Nearest-Neighbor) matched " + list.size() + " blocks");
                                if (bitmap2 != bitmap14) {
                                    bitmap2.recycle();
                                }
                                return list;
                            }
                            bitmap2.getClass();
                            try {
                                int width2 = bitmap2.getWidth();
                                int height3 = bitmap2.getHeight();
                                int i19 = width2 * height3;
                                int[] iArr4 = new int[i19];
                                Bitmap bitmap15 = bitmap2;
                                try {
                                    bitmap15.getPixels(iArr4, 0, width2, 0, 0, width2, height3);
                                    int[] iArr5 = new int[i19];
                                    z = true;
                                    int i20 = 0;
                                    while (i20 < i19) {
                                        try {
                                            i2 = iArr4[i20];
                                            list2 = list;
                                            i3 = i20;
                                        } catch (Throwable unused2) {
                                            list2 = list;
                                            str2 = str6;
                                            bitmap3 = null;
                                            if (bitmap3 == null) {
                                            }
                                        }
                                        try {
                                            iArr5[i3] = gi2.q((int) (((i2 & 255) * 0.114f) + (((i2 >> 8) & 255) * 0.587f) + (((i2 >> 16) & 255) * 0.299f)), 0, 255);
                                            i20 = i3 + 1;
                                            list = list2;
                                        } catch (Throwable unused3) {
                                            str2 = str6;
                                            bitmap3 = null;
                                            if (bitmap3 == null) {
                                            }
                                        }
                                    }
                                    list2 = list;
                                    int i21 = width2 + 1;
                                    int i22 = (height3 + 1) * i21;
                                    long[] jArr = new long[i22];
                                    long[] jArr2 = new long[i22];
                                    for (int i23 = 0; i23 < height3; i23++) {
                                        long j = 0;
                                        long j2 = 0;
                                        int i24 = 0;
                                        while (i24 < width2) {
                                            long[] jArr3 = jArr2;
                                            long[] jArr4 = jArr;
                                            long j3 = iArr5[(i23 * width2) + i24];
                                            j += j3;
                                            j2 = (j3 * j3) + j2;
                                            i24++;
                                            int i25 = ((i23 + 1) * i21) + i24;
                                            int i26 = (i23 * i21) + i24;
                                            jArr4[i25] = jArr4[i26] + j;
                                            jArr3[i25] = jArr3[i26] + j2;
                                            jArr = jArr4;
                                            jArr2 = jArr3;
                                        }
                                    }
                                    long[] jArr5 = jArr2;
                                    long[] jArr6 = jArr;
                                    int[] iArr6 = new int[i19];
                                    int i27 = 0;
                                    while (i27 < height3) {
                                        int max = Math.max(0, i27 - 12);
                                        int min = Math.min(height3 - 1, i27 + 12);
                                        int i28 = i27 * width2;
                                        int[] iArr7 = iArr6;
                                        int i29 = 0;
                                        while (i29 < width2) {
                                            int i30 = i29;
                                            int i31 = i27;
                                            int max2 = Math.max(0, i30 - 12);
                                            int min2 = Math.min(width2 - 1, i30 + 12);
                                            int i32 = ((min2 - max2) + 1) * ((min - max) + 1);
                                            int i33 = max * i21;
                                            int i34 = i33 + max2;
                                            int i35 = min2 + 1;
                                            int i36 = i33 + i35;
                                            int i37 = (min + 1) * i21;
                                            int i38 = i37 + max2;
                                            int i39 = i37 + i35;
                                            int i40 = max;
                                            int i41 = min;
                                            long j4 = ((jArr6[i39] - jArr6[i36]) - jArr6[i38]) + jArr6[i34];
                                            long j5 = (jArr5[i39] - jArr5[i36]) - jArr5[i38];
                                            int[] iArr8 = iArr5;
                                            str2 = str6;
                                            double d7 = i32;
                                            double d8 = j4 / d7;
                                            try {
                                                double sqrt = ((((Math.sqrt(Math.max(0.0d, ((j5 + jArr5[i34]) / d7) - (d8 * d8))) / 128.0d) - 1.0d) * 0.18000000715255737d) + 1.0d) * d8;
                                                int i42 = i28 + i30;
                                                if (iArr8[i42] >= sqrt) {
                                                    i = -16777216;
                                                } else {
                                                    i = -1;
                                                }
                                                iArr7[i42] = i;
                                                i29 = i30 + 1;
                                                max = i40;
                                                i27 = i31;
                                                iArr5 = iArr8;
                                                min = i41;
                                                str6 = str2;
                                            } catch (Throwable unused4) {
                                                bitmap3 = null;
                                                if (bitmap3 == null) {
                                                }
                                            }
                                        }
                                        i27++;
                                        iArr6 = iArr7;
                                    }
                                    str2 = str6;
                                    Bitmap createBitmap2 = Bitmap.createBitmap(width2, height3, Bitmap.Config.ARGB_8888);
                                    createBitmap2.getClass();
                                    createBitmap2.setPixels(iArr6, 0, width2, 0, 0, width2, height3);
                                    bitmap3 = createBitmap2;
                                } catch (Throwable unused5) {
                                    list2 = list;
                                    z = true;
                                    str2 = " blocks";
                                    bitmap2 = bitmap15;
                                }
                            } catch (Throwable unused6) {
                                list2 = list;
                                z = true;
                            }
                            if (bitmap3 == null) {
                                vp2Var.R = bitmap14;
                                vp2Var.X = str5;
                                vp2Var.Y = bitmap2;
                                vp2Var.Z = bitmap3;
                                vp2Var.l0 = 2;
                                Serializable d9 = wp2Var.d(bitmap3, str5, vp2Var);
                                if (d9 != serializable) {
                                    bitmap4 = bitmap14;
                                    bitmap6 = bitmap3;
                                    str3 = str5;
                                    bitmap7 = bitmap2;
                                    obj = d9;
                                    list3 = (List) obj;
                                    bitmap6.recycle();
                                    if (list3.isEmpty()) {
                                        Log.i("GameTextRecognizer", "OCR Pass 2 (Sauvola Adaptive Thresholding) matched " + list3.size() + str2);
                                        if (bitmap7 != bitmap4) {
                                            bitmap7.recycle();
                                        }
                                        return list3;
                                    }
                                    bitmap5 = bitmap7;
                                    str4 = str2;
                                    bitmap5.getClass();
                                    try {
                                        int width3 = bitmap5.getWidth();
                                        int height4 = bitmap5.getHeight();
                                        i4 = width3 * height4;
                                        iArr = new int[i4];
                                        bitmap5.getPixels(iArr, 0, width3, 0, 0, width3, height4);
                                        bitmap8 = bitmap5;
                                        i5 = 256;
                                        try {
                                            int[] iArr9 = new int[256];
                                            i6 = 0;
                                            while (i6 < i4) {
                                                int i43 = iArr[i6];
                                                list4 = list3;
                                                int[] iArr10 = iArr9;
                                                try {
                                                    int q2 = gi2.q((int) (((i43 & 255) * 0.114f) + (((i43 >> 8) & 255) * 0.587f) + (((i43 >> 16) & 255) * 0.299f)), 0, 255);
                                                    iArr10[q2] = iArr10[q2] + 1;
                                                    i6++;
                                                    list3 = list4;
                                                    iArr9 = iArr10;
                                                    i5 = 256;
                                                } catch (Throwable unused7) {
                                                    bitmap9 = null;
                                                    if (bitmap9 == null) {
                                                    }
                                                }
                                            }
                                            list4 = list3;
                                            iArr2 = iArr9;
                                            i8 = 0;
                                            double d10 = 0.0d;
                                            for (i7 = i5; i8 < i7; i7 = 256) {
                                                d10 += iArr2[i8] * i8;
                                                i8++;
                                            }
                                            i9 = 128;
                                            d2 = d10;
                                            i10 = 0;
                                            i11 = 0;
                                            d3 = 0.0d;
                                            d4 = 0.0d;
                                        } catch (Throwable unused8) {
                                            list4 = list3;
                                        }
                                    } catch (Throwable unused9) {
                                        list4 = list3;
                                        bitmap8 = bitmap5;
                                    }
                                    while (i11 < 256) {
                                        int i44 = i10 + iArr2[i11];
                                        int i45 = i11;
                                        if (i44 != 0) {
                                            int i46 = i4 - i44;
                                            if (i46 != 0) {
                                                double d11 = d3;
                                                d4 += i45 * i14;
                                                double d12 = i44;
                                                i10 = i44;
                                                double d13 = i46;
                                                double d14 = (d4 / d12) - ((d2 - d4) / d13);
                                                d3 = d12 * d13 * d14 * d14;
                                                if (d3 > d11) {
                                                    i9 = i45;
                                                } else {
                                                    d3 = d11;
                                                }
                                            } else {
                                                int[] iArr11 = new int[i4];
                                                i12 = 0;
                                                while (i12 < i4) {
                                                    int i47 = iArr[i12];
                                                    int i48 = i4;
                                                    int[] iArr12 = iArr11;
                                                    if (((int) (((i47 & 255) * 0.114f) + (((i47 >> 8) & 255) * 0.587f) + (((i47 >> 16) & 255) * 0.299f))) >= i9) {
                                                        i13 = -16777216;
                                                    } else {
                                                        i13 = -1;
                                                    }
                                                    iArr12[i12] = i13;
                                                    i12++;
                                                    i4 = i48;
                                                    iArr11 = iArr12;
                                                }
                                                Bitmap createBitmap3 = Bitmap.createBitmap(width3, height4, Bitmap.Config.ARGB_8888);
                                                createBitmap3.getClass();
                                                createBitmap3.setPixels(iArr11, 0, width3, 0, 0, width3, height4);
                                                bitmap9 = createBitmap3;
                                                if (bitmap9 == null) {
                                                    vp2Var.R = bitmap4;
                                                    vp2Var.X = str3;
                                                    vp2Var.Y = bitmap8;
                                                    vp2Var.Z = null;
                                                    vp2Var.d0 = bitmap9;
                                                    vp2Var.l0 = 3;
                                                    obj = wp2Var.d(bitmap9, str3, vp2Var);
                                                    if (obj == serializable) {
                                                        return serializable;
                                                    }
                                                    list3 = (List) obj;
                                                    bitmap9.recycle();
                                                    if (!list3.isEmpty()) {
                                                        Log.i("GameTextRecognizer", "OCR Pass 3 (Otsu Inverted Binarization) matched " + list3.size() + str4);
                                                        if (bitmap8 != bitmap4) {
                                                            bitmap8.recycle();
                                                        }
                                                        return list3;
                                                    }
                                                    Bitmap bitmap16 = bitmap8;
                                                    bitmap16.getClass();
                                                    int width4 = bitmap16.getWidth();
                                                    int height5 = bitmap16.getHeight();
                                                    i15 = width4 * height5;
                                                    int[] iArr13 = new int[i15];
                                                    bitmap16.getPixels(iArr13, 0, width4, 0, 0, width4, height5);
                                                    bitmap10 = bitmap16;
                                                    int[] iArr14 = new int[i15];
                                                    i16 = 0;
                                                    while (i16 < i15) {
                                                        int i49 = iArr13[i16];
                                                        int i50 = i15;
                                                        int i51 = (i49 >> 16) & 255;
                                                        list5 = list3;
                                                        int i52 = (i49 >> 8) & 255;
                                                        int i53 = i49 & 255;
                                                        if (i51 > 180 && i52 > 180 && i53 > 180) {
                                                            z2 = z;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        try {
                                                            if (i51 > 175 && i52 > 155 && i53 < 125) {
                                                                iArr3 = iArr14;
                                                                if (i51 - i53 > 40) {
                                                                    z3 = z;
                                                                    if (i51 >= 125 && i52 > 165 && i53 > 195) {
                                                                        z4 = z;
                                                                    } else {
                                                                        z4 = false;
                                                                    }
                                                                    boolean z6 = z3;
                                                                    if (i51 >= 130 && i52 > 175 && i53 < 130) {
                                                                        z5 = z;
                                                                    } else {
                                                                        z5 = false;
                                                                    }
                                                                    if (z2 && !z6 && !z4 && !z5) {
                                                                        i17 = -1;
                                                                    } else {
                                                                        i17 = -16777216;
                                                                    }
                                                                    iArr3[i16] = i17;
                                                                    i16++;
                                                                    i15 = i50;
                                                                    list3 = list5;
                                                                    iArr14 = iArr3;
                                                                }
                                                            } else {
                                                                iArr3 = iArr14;
                                                            }
                                                            iArr3[i16] = i17;
                                                            i16++;
                                                            i15 = i50;
                                                            list3 = list5;
                                                            iArr14 = iArr3;
                                                        } catch (Throwable unused10) {
                                                            bitmap11 = null;
                                                            if (bitmap11 == null) {
                                                            }
                                                        }
                                                        z3 = false;
                                                        if (i51 >= 125) {
                                                        }
                                                        z4 = false;
                                                        boolean z62 = z3;
                                                        if (i51 >= 130) {
                                                        }
                                                        z5 = false;
                                                        if (z2) {
                                                        }
                                                        i17 = -16777216;
                                                    }
                                                    list5 = list3;
                                                    Bitmap createBitmap4 = Bitmap.createBitmap(width4, height5, Bitmap.Config.ARGB_8888);
                                                    createBitmap4.getClass();
                                                    createBitmap4.setPixels(iArr14, 0, width4, 0, 0, width4, height5);
                                                    bitmap11 = createBitmap4;
                                                    if (bitmap11 == null) {
                                                        vp2Var.R = bitmap4;
                                                        vp2Var.X = str3;
                                                        vp2Var.Y = bitmap10;
                                                        vp2Var.Z = null;
                                                        vp2Var.d0 = null;
                                                        vp2Var.e0 = bitmap11;
                                                        vp2Var.l0 = 4;
                                                        obj = wp2Var.d(bitmap11, str3, vp2Var);
                                                        if (obj == serializable) {
                                                            return serializable;
                                                        }
                                                        list3 = (List) obj;
                                                        bitmap11.recycle();
                                                        if (!list3.isEmpty()) {
                                                            Log.i("GameTextRecognizer", "OCR Pass 4 (Chromatic Text Isolation) matched " + list3.size() + str4);
                                                            if (bitmap10 != bitmap4) {
                                                                bitmap10.recycle();
                                                            }
                                                            return list3;
                                                        }
                                                        if (bitmap10.getHeight() > 120) {
                                                            height = bitmap10.getHeight() / 2;
                                                            createBitmap = Bitmap.createBitmap(bitmap10, 0, 0, bitmap10.getWidth(), height);
                                                            createBitmap.getClass();
                                                            vp2Var.R = bitmap4;
                                                            vp2Var.X = str3;
                                                            vp2Var.Y = bitmap10;
                                                            vp2Var.Z = null;
                                                            vp2Var.d0 = null;
                                                            vp2Var.e0 = null;
                                                            vp2Var.f0 = createBitmap;
                                                            vp2Var.i0 = height;
                                                            vp2Var.l0 = 5;
                                                            d5 = wp2Var.d(createBitmap, str3, vp2Var);
                                                            if (d5 == serializable) {
                                                                return serializable;
                                                            }
                                                            Iterable iterable = (Iterable) d5;
                                                            ArrayList arrayList3 = new ArrayList(ht0.v0(iterable, 10));
                                                            for (it = iterable.iterator(); it.hasNext(); it = it) {
                                                                ta7 ta7Var = (ta7) it.next();
                                                                RectF rectF = ta7Var.c;
                                                                arrayList3.add(ta7.a(ta7Var, null, new RectF(rectF.left, rectF.top * 0.5f, rectF.right, rectF.bottom * 0.5f), 59));
                                                                createBitmap = createBitmap;
                                                            }
                                                            createBitmap.recycle();
                                                            Bitmap createBitmap5 = Bitmap.createBitmap(bitmap10, 0, height, bitmap10.getWidth(), height);
                                                            createBitmap5.getClass();
                                                            vp2Var.R = bitmap4;
                                                            vp2Var.X = null;
                                                            vp2Var.Y = bitmap10;
                                                            vp2Var.Z = null;
                                                            vp2Var.d0 = null;
                                                            vp2Var.e0 = null;
                                                            vp2Var.f0 = null;
                                                            vp2Var.g0 = arrayList3;
                                                            vp2Var.h0 = createBitmap5;
                                                            vp2Var.i0 = height;
                                                            vp2Var.l0 = 6;
                                                            d6 = wp2Var.d(createBitmap5, str3, vp2Var);
                                                            if (d6 == serializable) {
                                                                obj = d6;
                                                                bitmap12 = createBitmap5;
                                                                arrayList2 = arrayList3;
                                                                bitmap13 = bitmap4;
                                                                Iterable<ta7> iterable2 = (Iterable) obj;
                                                                ArrayList arrayList4 = new ArrayList(ht0.v0(iterable2, 10));
                                                                for (ta7 ta7Var2 : iterable2) {
                                                                    RectF rectF2 = ta7Var2.c;
                                                                    arrayList4.add(ta7.a(ta7Var2, null, new RectF(rectF2.left, (rectF2.top * 0.5f) + 0.5f, rectF2.right, (rectF2.bottom * 0.5f) + 0.5f), 59));
                                                                }
                                                                bitmap12.recycle();
                                                                V0 = gt0.V0(arrayList2, arrayList4);
                                                                if (!V0.isEmpty()) {
                                                                    Log.i("GameTextRecognizer", "OCR Pass 5 (Split Screen Dual-Pass) matched " + V0.size() + str4);
                                                                }
                                                                arrayList = V0;
                                                                bitmap4 = bitmap13;
                                                                if (bitmap10 != bitmap4) {
                                                                    bitmap10.recycle();
                                                                    return arrayList;
                                                                }
                                                                return arrayList;
                                                            }
                                                            return serializable;
                                                        }
                                                        arrayList = list3;
                                                        if (bitmap10 != bitmap4) {
                                                        }
                                                    } else {
                                                        list3 = list5;
                                                        if (bitmap10.getHeight() > 120) {
                                                        }
                                                    }
                                                } else {
                                                    list3 = list4;
                                                    Bitmap bitmap162 = bitmap8;
                                                    bitmap162.getClass();
                                                    int width42 = bitmap162.getWidth();
                                                    int height52 = bitmap162.getHeight();
                                                    i15 = width42 * height52;
                                                    int[] iArr132 = new int[i15];
                                                    bitmap162.getPixels(iArr132, 0, width42, 0, 0, width42, height52);
                                                    bitmap10 = bitmap162;
                                                    int[] iArr142 = new int[i15];
                                                    i16 = 0;
                                                    while (i16 < i15) {
                                                    }
                                                    list5 = list3;
                                                    Bitmap createBitmap42 = Bitmap.createBitmap(width42, height52, Bitmap.Config.ARGB_8888);
                                                    createBitmap42.getClass();
                                                    createBitmap42.setPixels(iArr142, 0, width42, 0, 0, width42, height52);
                                                    bitmap11 = createBitmap42;
                                                    if (bitmap11 == null) {
                                                    }
                                                }
                                            }
                                        } else {
                                            i10 = i44;
                                        }
                                        i11 = i45 + 1;
                                    }
                                    int[] iArr112 = new int[i4];
                                    i12 = 0;
                                    while (i12 < i4) {
                                    }
                                    Bitmap createBitmap32 = Bitmap.createBitmap(width3, height4, Bitmap.Config.ARGB_8888);
                                    createBitmap32.getClass();
                                    createBitmap32.setPixels(iArr112, 0, width3, 0, 0, width3, height4);
                                    bitmap9 = createBitmap32;
                                    if (bitmap9 == null) {
                                    }
                                } else {
                                    return serializable;
                                }
                            } else {
                                bitmap4 = bitmap14;
                                str3 = str5;
                                bitmap5 = bitmap2;
                                list3 = list2;
                                str4 = str2;
                                bitmap5.getClass();
                                int width32 = bitmap5.getWidth();
                                int height42 = bitmap5.getHeight();
                                i4 = width32 * height42;
                                iArr = new int[i4];
                                bitmap5.getPixels(iArr, 0, width32, 0, 0, width32, height42);
                                bitmap8 = bitmap5;
                                i5 = 256;
                                int[] iArr92 = new int[256];
                                i6 = 0;
                                while (i6 < i4) {
                                }
                                list4 = list3;
                                iArr2 = iArr92;
                                i8 = 0;
                                double d102 = 0.0d;
                                while (i8 < i7) {
                                }
                                i9 = 128;
                                d2 = d102;
                                i10 = 0;
                                i11 = 0;
                                d3 = 0.0d;
                                d4 = 0.0d;
                                while (i11 < 256) {
                                }
                                int[] iArr1122 = new int[i4];
                                i12 = 0;
                                while (i12 < i4) {
                                }
                                Bitmap createBitmap322 = Bitmap.createBitmap(width32, height42, Bitmap.Config.ARGB_8888);
                                createBitmap322.getClass();
                                createBitmap322.setPixels(iArr1122, 0, width32, 0, 0, width32, height42);
                                bitmap9 = createBitmap322;
                                if (bitmap9 == null) {
                                }
                            }
                        }
                        bitmap2 = bitmap14;
                        vp2Var.R = bitmap14;
                        vp2Var.X = str5;
                        vp2Var.Y = bitmap2;
                        vp2Var.l0 = 1;
                        d = wp2Var.d(bitmap2, str5, vp2Var);
                        if (d == serializable) {
                        }
                        list = (List) d;
                        if (!list.isEmpty()) {
                        }
                        break;
                    case 1:
                        Bitmap bitmap17 = vp2Var.Y;
                        str5 = vp2Var.X;
                        Bitmap bitmap18 = vp2Var.R;
                        oi2.Y(obj);
                        bitmap2 = bitmap17;
                        bitmap14 = bitmap18;
                        d = obj;
                        list = (List) d;
                        if (!list.isEmpty()) {
                        }
                        break;
                    case 2:
                        bitmap6 = vp2Var.Z;
                        bitmap7 = vp2Var.Y;
                        str3 = vp2Var.X;
                        bitmap4 = vp2Var.R;
                        oi2.Y(obj);
                        z = true;
                        str2 = " blocks";
                        list3 = (List) obj;
                        bitmap6.recycle();
                        if (list3.isEmpty()) {
                        }
                        break;
                    case 3:
                        bitmap9 = vp2Var.d0;
                        bitmap8 = vp2Var.Y;
                        str3 = vp2Var.X;
                        bitmap4 = vp2Var.R;
                        oi2.Y(obj);
                        z = true;
                        str4 = " blocks";
                        list3 = (List) obj;
                        bitmap9.recycle();
                        if (!list3.isEmpty()) {
                        }
                        Bitmap bitmap1622 = bitmap8;
                        bitmap1622.getClass();
                        int width422 = bitmap1622.getWidth();
                        int height522 = bitmap1622.getHeight();
                        i15 = width422 * height522;
                        int[] iArr1322 = new int[i15];
                        bitmap1622.getPixels(iArr1322, 0, width422, 0, 0, width422, height522);
                        bitmap10 = bitmap1622;
                        int[] iArr1422 = new int[i15];
                        i16 = 0;
                        while (i16 < i15) {
                        }
                        list5 = list3;
                        Bitmap createBitmap422 = Bitmap.createBitmap(width422, height522, Bitmap.Config.ARGB_8888);
                        createBitmap422.getClass();
                        createBitmap422.setPixels(iArr1422, 0, width422, 0, 0, width422, height522);
                        bitmap11 = createBitmap422;
                        if (bitmap11 == null) {
                        }
                        break;
                    case 4:
                        bitmap11 = vp2Var.e0;
                        bitmap10 = vp2Var.Y;
                        str3 = vp2Var.X;
                        Bitmap bitmap19 = vp2Var.R;
                        oi2.Y(obj);
                        bitmap4 = bitmap19;
                        str4 = " blocks";
                        list3 = (List) obj;
                        bitmap11.recycle();
                        if (!list3.isEmpty()) {
                        }
                        if (bitmap10.getHeight() > 120) {
                        }
                        break;
                    case 5:
                        height = vp2Var.i0;
                        Bitmap bitmap20 = vp2Var.f0;
                        Bitmap bitmap21 = vp2Var.Y;
                        String str7 = vp2Var.X;
                        bitmap4 = vp2Var.R;
                        oi2.Y(obj);
                        d5 = obj;
                        createBitmap = bitmap20;
                        bitmap10 = bitmap21;
                        str3 = str7;
                        str4 = " blocks";
                        Iterable iterable3 = (Iterable) d5;
                        ArrayList arrayList32 = new ArrayList(ht0.v0(iterable3, 10));
                        while (it.hasNext()) {
                        }
                        createBitmap.recycle();
                        Bitmap createBitmap52 = Bitmap.createBitmap(bitmap10, 0, height, bitmap10.getWidth(), height);
                        createBitmap52.getClass();
                        vp2Var.R = bitmap4;
                        vp2Var.X = null;
                        vp2Var.Y = bitmap10;
                        vp2Var.Z = null;
                        vp2Var.d0 = null;
                        vp2Var.e0 = null;
                        vp2Var.f0 = null;
                        vp2Var.g0 = arrayList32;
                        vp2Var.h0 = createBitmap52;
                        vp2Var.i0 = height;
                        vp2Var.l0 = 6;
                        d6 = wp2Var.d(createBitmap52, str3, vp2Var);
                        if (d6 == serializable) {
                        }
                        break;
                    case 6:
                        bitmap12 = vp2Var.h0;
                        arrayList2 = vp2Var.g0;
                        bitmap10 = vp2Var.Y;
                        bitmap13 = vp2Var.R;
                        oi2.Y(obj);
                        str4 = " blocks";
                        Iterable<ta7> iterable22 = (Iterable) obj;
                        ArrayList arrayList42 = new ArrayList(ht0.v0(iterable22, 10));
                        while (r3.hasNext()) {
                        }
                        bitmap12.recycle();
                        V0 = gt0.V0(arrayList2, arrayList42);
                        if (!V0.isEmpty()) {
                        }
                        arrayList = V0;
                        bitmap4 = bitmap13;
                        if (bitmap10 != bitmap4) {
                        }
                        break;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        vp2Var = new vp2(wp2Var, s41Var);
        Object obj2 = vp2Var.j0;
        Serializable serializable2 = x61.COROUTINE_SUSPENDED;
        String str62 = " blocks";
        switch (vp2Var.l0) {
        }
    }

    public static Object c(TextRecognizer textRecognizer, InputImage inputImage, tp2 tp2Var) {
        rj0 rj0Var = new rj0(1, np2.V(tp2Var));
        rj0Var.v();
        textRecognizer.process(inputImage).addOnSuccessListener(new d51(new rp2(rj0Var, 0), 25)).addOnFailureListener(new sp2(rj0Var, 0));
        Object s = rj0Var.s();
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        return s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
        if (r0.equals("ja") == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
        if (r0.equals("japanese") == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f2, code lost:
        r0 = r13.getValue();
        r0.getClass();
        r4 = r14.getValue();
        r4.getClass();
        r10 = r15.getValue();
        r10.getClass();
        r0 = defpackage.hf.c0((com.google.mlkit.vision.text.TextRecognizer) r0, (com.google.mlkit.vision.text.TextRecognizer) r4, (com.google.mlkit.vision.text.TextRecognizer) r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0147 -> B:14:0x003e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01d6 -> B:44:0x0128). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(Bitmap bitmap, String str, s41 s41Var) {
        tp2 tp2Var;
        int i;
        List c0;
        Bitmap bitmap2;
        Text text;
        InputImage inputImage;
        Iterator it;
        float f;
        int rgb;
        String str2;
        char c;
        Throwable th;
        String message;
        Iterator it2;
        TextRecognizer textRecognizer;
        if (s41Var instanceof tp2) {
            tp2Var = (tp2) s41Var;
            int i2 = tp2Var.g0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tp2Var.g0 = i2 - Integer.MIN_VALUE;
                Object obj = tp2Var.e0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = tp2Var.g0;
                char c2 = '\n';
                int i3 = 0;
                Serializable serializable = null;
                int i4 = 1;
                if (i == 0) {
                    if (i == 1) {
                        TextRecognizer textRecognizer2 = tp2Var.d0;
                        it = tp2Var.Z;
                        text = tp2Var.Y;
                        inputImage = tp2Var.X;
                        Bitmap bitmap3 = tp2Var.R;
                        try {
                            oi2.Y(obj);
                            it2 = it;
                            textRecognizer = textRecognizer2;
                            bitmap2 = bitmap3;
                        } catch (Throwable th2) {
                            th = th2;
                            c = '\n';
                            bitmap2 = bitmap3;
                            message = th.getMessage();
                            if (message == null) {
                            }
                            this.a = message;
                            Log.w("GameTextRecognizer", "ML Kit Recognizer failed: " + th.getMessage(), th);
                            c2 = c;
                            if (it.hasNext()) {
                            }
                        }
                        InputImage inputImage2 = inputImage;
                        Text text2 = text;
                        Iterator it3 = it2;
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            c = c2;
                            it = it3;
                            text = text2;
                            inputImage = inputImage2;
                        }
                        Text text3 = (Text) obj;
                        List<Text.TextBlock> textBlocks = text3.getTextBlocks();
                        textBlocks.getClass();
                        if (textBlocks.isEmpty()) {
                            try {
                            } catch (Throwable th4) {
                                th = th4;
                                c = c2;
                            }
                            String simpleName = textRecognizer.getClass().getSimpleName();
                            int size = text3.getTextBlocks().size();
                            String text4 = text3.getText();
                            text4.getClass();
                            String replace = qs6.S0(80, text4).replace(c2, ' ');
                            replace.getClass();
                            StringBuilder sb = new StringBuilder();
                            c = c2;
                            try {
                            } catch (Throwable th5) {
                                th = th5;
                                it = it3;
                                inputImage = inputImage2;
                                text = text3;
                                message = th.getMessage();
                                if (message == null) {
                                    message = th.getClass().getSimpleName();
                                }
                                this.a = message;
                                Log.w("GameTextRecognizer", "ML Kit Recognizer failed: " + th.getMessage(), th);
                                c2 = c;
                                if (it.hasNext()) {
                                }
                            }
                            sb.append("ML Kit (");
                            sb.append(simpleName);
                            sb.append(") found ");
                            sb.append(size);
                            sb.append(" blocks: \"");
                            sb.append(replace);
                            sb.append("\"");
                            Log.i("GameTextRecognizer", sb.toString());
                            text = text3;
                            if (text != null) {
                                return yt1.A;
                            }
                            ArrayList arrayList = new ArrayList();
                            float width = bitmap2.getWidth();
                            float height = bitmap2.getHeight();
                            for (Text.TextBlock textBlock : text.getTextBlocks()) {
                                Rect boundingBox = textBlock.getBoundingBox();
                                if (boundingBox != null) {
                                    String text5 = textBlock.getText();
                                    text5.getClass();
                                    String obj2 = qs6.T0(text5).toString();
                                    if (qs6.v0(obj2)) {
                                        continue;
                                    } else {
                                        Serializable serializable2 = serializable;
                                        RectF rectF = new RectF(gi2.p(boundingBox.left / width, RecyclerView.B1, 1.0f), gi2.p(boundingBox.top / height, RecyclerView.B1, 1.0f), gi2.p(boundingBox.right / width, RecyclerView.B1, 1.0f), gi2.p(boundingBox.bottom / height, RecyclerView.B1, 1.0f));
                                        int width2 = bitmap2.getWidth();
                                        int height2 = bitmap2.getHeight();
                                        int i5 = width2 - i4;
                                        int q = gi2.q(boundingBox.left, i3, i5);
                                        int i6 = height2 - i4;
                                        int q2 = gi2.q(boundingBox.top, i3, i6);
                                        int q3 = gi2.q(boundingBox.right, i3, i5);
                                        int q4 = gi2.q(boundingBox.bottom, i3, i6);
                                        ArrayList arrayList2 = new ArrayList();
                                        int max = Math.max(i4, (q3 - q) / 10);
                                        if (max > 0) {
                                            int s = nj2.s(q, q3, max);
                                            float f2 = width;
                                            if (q <= s) {
                                                int i7 = q;
                                                while (true) {
                                                    f = height;
                                                    arrayList2.add(Integer.valueOf(bitmap2.getPixel(i7, q2)));
                                                    arrayList2.add(Integer.valueOf(bitmap2.getPixel(i7, q4)));
                                                    if (i7 == s) {
                                                        break;
                                                    }
                                                    i7 += max;
                                                    height = f;
                                                }
                                            } else {
                                                f = height;
                                            }
                                            int max2 = Math.max(1, (q4 - q2) / 10);
                                            if (max2 > 0) {
                                                int s2 = nj2.s(q2, q4, max2);
                                                if (q2 <= s2) {
                                                    while (true) {
                                                        arrayList2.add(Integer.valueOf(bitmap2.getPixel(q, q2)));
                                                        arrayList2.add(Integer.valueOf(bitmap2.getPixel(q3, q2)));
                                                        if (q2 == s2) {
                                                            break;
                                                        }
                                                        q2 += max2;
                                                    }
                                                }
                                                if (arrayList2.isEmpty()) {
                                                    rgb = Color.parseColor("#E60F172A");
                                                } else {
                                                    long j = 0;
                                                    long j2 = 0;
                                                    long j3 = 0;
                                                    int i8 = 0;
                                                    for (int size2 = arrayList2.size(); i8 < size2; size2 = size2) {
                                                        Object obj3 = arrayList2.get(i8);
                                                        i8++;
                                                        int intValue = ((Number) obj3).intValue();
                                                        j += Color.red(intValue);
                                                        j2 += Color.green(intValue);
                                                        j3 += Color.blue(intValue);
                                                    }
                                                    long size3 = arrayList2.size();
                                                    rgb = Color.rgb((int) (j / size3), (int) (j2 / size3), (int) (j3 / size3));
                                                }
                                                int i9 = rgb;
                                                if (((Color.blue(i9) / 255.0d) * 0.114d) + ((Color.green(i9) / 255.0d) * 0.587d) + ((Color.red(i9) / 255.0d) * 0.299d) > 0.55d) {
                                                    str2 = "#0F172A";
                                                } else {
                                                    str2 = "#FFFFFF";
                                                }
                                                arrayList.add(new ta7(obj2, "", rectF, i9, Color.parseColor(str2)));
                                                width = f2;
                                                height = f;
                                                serializable = serializable2;
                                                i3 = 0;
                                                i4 = 1;
                                            } else {
                                                i.h(lb1.k("Step must be positive, was: ", max2, "."));
                                                return serializable2;
                                            }
                                        } else {
                                            i.h(lb1.k("Step must be positive, was: ", max, "."));
                                            return serializable2;
                                        }
                                    }
                                }
                            }
                            return arrayList;
                        }
                        it = it3;
                        text = text2;
                        inputImage = inputImage2;
                        if (it.hasNext()) {
                            TextRecognizer textRecognizer3 = (TextRecognizer) it.next();
                            try {
                            } catch (Throwable th6) {
                                th = th6;
                                c = c2;
                                message = th.getMessage();
                                if (message == null) {
                                }
                                this.a = message;
                                Log.w("GameTextRecognizer", "ML Kit Recognizer failed: " + th.getMessage(), th);
                                c2 = c;
                                if (it.hasNext()) {
                                }
                            }
                            tp2Var.R = bitmap2;
                            tp2Var.X = inputImage;
                            tp2Var.Y = text;
                            tp2Var.Z = it;
                            tp2Var.d0 = textRecognizer3;
                            tp2Var.g0 = 1;
                            Object c3 = c(textRecognizer3, inputImage, tp2Var);
                            if (c3 == x61Var) {
                                return x61Var;
                            }
                            it2 = it;
                            textRecognizer = textRecognizer3;
                            obj = c3;
                            InputImage inputImage22 = inputImage;
                            Text text22 = text;
                            Iterator it32 = it2;
                            Text text32 = (Text) obj;
                            List<Text.TextBlock> textBlocks2 = text32.getTextBlocks();
                            textBlocks2.getClass();
                            if (textBlocks2.isEmpty()) {
                            }
                        } else if (text != null) {
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    int hashCode = lowerCase.hashCode();
                    ex6 ex6Var = this.c;
                    ex6 ex6Var2 = this.b;
                    ex6 ex6Var3 = this.d;
                    if (hashCode != -752730191) {
                        if (hashCode != 3383) {
                            if (hashCode == 3886 ? lowerCase.equals("zh") : hashCode == 746330349 && lowerCase.equals("chinese")) {
                                Object value = ex6Var3.getValue();
                                value.getClass();
                                Object value2 = ex6Var2.getValue();
                                value2.getClass();
                                Object value3 = ex6Var.getValue();
                                value3.getClass();
                                c0 = hf.c0((TextRecognizer) value, (TextRecognizer) value2, (TextRecognizer) value3);
                            }
                        }
                        Object value4 = ex6Var2.getValue();
                        value4.getClass();
                        Object value5 = ex6Var.getValue();
                        value5.getClass();
                        Object value6 = ex6Var3.getValue();
                        value6.getClass();
                        c0 = hf.c0((TextRecognizer) value4, (TextRecognizer) value5, (TextRecognizer) value6);
                    }
                    bitmap2 = bitmap;
                    InputImage fromBitmap = InputImage.fromBitmap(bitmap2, 0);
                    fromBitmap.getClass();
                    text = null;
                    inputImage = fromBitmap;
                    it = c0.iterator();
                    if (it.hasNext()) {
                    }
                }
            }
        }
        tp2Var = new tp2(this, s41Var);
        Object obj4 = tp2Var.e0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = tp2Var.g0;
        char c22 = '\n';
        int i32 = 0;
        Serializable serializable3 = null;
        int i42 = 1;
        if (i == 0) {
        }
    }
}
