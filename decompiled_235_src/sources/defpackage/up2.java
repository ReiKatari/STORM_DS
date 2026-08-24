package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: up2  reason: default package */
/* loaded from: classes.dex */
public final class up2 extends hw6 implements eo2 {
    public Bitmap X;
    public List Y;
    public Iterator Z;
    public ua7 d0;
    public Bitmap e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public final /* synthetic */ wp2 k0;
    public final /* synthetic */ Bitmap l0;
    public final /* synthetic */ List m0;
    public final /* synthetic */ String n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up2(wp2 wp2Var, Bitmap bitmap, List list, String str, r41 r41Var) {
        super(2, r41Var);
        this.k0 = wp2Var;
        this.l0 = bitmap;
        this.m0 = list;
        this.n0 = str;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((up2) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new up2(this.k0, this.l0, this.m0, this.n0, r41Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
        if (r0 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02cc, code lost:
        if (r1 == r3) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02c2  */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01ea -> B:39:0x01ef). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0298 -> B:48:0x0279). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Bitmap copy;
        x61 x61Var;
        wp2 wp2Var;
        Object b;
        Iterator it;
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        Bitmap bitmap;
        int i4;
        int i5;
        int i6;
        ua7 ua7Var;
        Bitmap bitmap2;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        int i7 = this.j0;
        String str = "x";
        String str2 = this.n0;
        Bitmap bitmap3 = this.l0;
        List list = this.m0;
        wp2 wp2Var2 = this.k0;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    copy = this.X;
                    oi2.Y(obj);
                    b = obj;
                    wp2Var = wp2Var2;
                } else {
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                int i8 = this.i0;
                int i9 = this.h0;
                int i10 = this.g0;
                int i11 = this.f0;
                Bitmap bitmap4 = this.e0;
                ua7 ua7Var2 = this.d0;
                Iterator it2 = this.Z;
                ?? r0 = this.Y;
                Bitmap bitmap5 = this.X;
                oi2.Y(obj);
                String str3 = str2;
                ArrayList arrayList2 = r0;
                Bitmap bitmap6 = bitmap3;
                int i12 = i11;
                String str4 = "x";
                Iterator it3 = it2;
                bitmap = bitmap5;
                x61Var = x61Var2;
                wp2 wp2Var3 = wp2Var2;
                Object b2 = obj;
                int i13 = i9;
                i3 = i8;
                List list2 = list;
                int i14 = i10;
                List list3 = (List) b2;
                bitmap4.recycle();
                RectF rectF = ua7Var2.b;
                float width = rectF.width();
                float height = rectF.height();
                if (list3.isEmpty()) {
                    bitmap2 = bitmap;
                    Log.i("GameTextRecognizer", xg6.m(i3, list3.size(), "Region #", " found ", " text blocks"));
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        ta7 ta7Var = (ta7) it4.next();
                        float f = rectF.left;
                        Iterator it5 = it4;
                        RectF rectF2 = ta7Var.c;
                        int i15 = i14;
                        float f2 = rectF.top;
                        arrayList2.add(ta7.a(ta7Var, null, new RectF((rectF2.left * width) + f, (rectF2.top * height) + f2, (rectF2.right * width) + f, (rectF2.bottom * height) + f2), 59));
                        it4 = it5;
                        i12 = i12;
                        i14 = i15;
                        rectF = rectF;
                    }
                } else {
                    bitmap2 = bitmap;
                }
                int i16 = i12;
                int i17 = i14;
                arrayList = arrayList2;
                i3 = i13;
                str2 = str3;
                list = list2;
                bitmap3 = bitmap6;
                bitmap = bitmap2;
                i = i16;
                i2 = i17;
                it = it3;
                wp2Var2 = wp2Var3;
                x61Var2 = x61Var;
                str = str4;
                if (!it.hasNext()) {
                    list2 = list;
                    int i18 = i3 + 1;
                    bitmap6 = bitmap3;
                    ua7 ua7Var3 = (ua7) it.next();
                    RectF rectF3 = ua7Var3.b;
                    x61 x61Var3 = x61Var2;
                    float f3 = i;
                    String str5 = str2;
                    wp2 wp2Var4 = wp2Var2;
                    int q = gi2.q((int) (rectF3.left * f3), 0, i - 1);
                    float f4 = i2;
                    int q2 = gi2.q((int) (rectF3.top * f4), 0, i2 - 1);
                    int q3 = gi2.q((int) (rectF3.right * f3), q + 1, i);
                    int q4 = gi2.q((int) (rectF3.bottom * f4), q2 + 1, i2);
                    int i19 = i2;
                    int i20 = q3 - q;
                    int i21 = i;
                    int i22 = q4 - q2;
                    if (i20 < 6 || i22 < 6) {
                        i4 = i21;
                        str4 = str;
                        it3 = it;
                        x61Var = x61Var3;
                        i5 = i19;
                        str2 = str5;
                        wp2Var3 = wp2Var4;
                        i6 = i18;
                        StringBuilder q5 = i61.q(i3, i20, "Region #", " too small (", " x ");
                        q5.append(i22);
                        q5.append("), skipping");
                        Log.w("GameTextRecognizer", q5.toString());
                    } else {
                        try {
                        } catch (Throwable th) {
                            ua7Var = ua7Var3;
                            it3 = it;
                            Log.e("GameTextRecognizer", "Failed to crop region #" + i3, th);
                            bitmap4 = null;
                        }
                        ua7Var = ua7Var3;
                        it3 = it;
                        bitmap4 = Bitmap.createBitmap(bitmap, q, q2, i20, i22);
                        if (bitmap4 == null) {
                            i4 = i21;
                            str4 = str;
                            x61Var = x61Var3;
                            i5 = i19;
                            str2 = str5;
                            wp2Var3 = wp2Var4;
                            i6 = i18;
                        } else {
                            StringBuilder q6 = i61.q(i3, q, "Region #", ": crop=[", ",");
                            lb1.x(q6, q2, ",", q3, ",");
                            lb1.x(q6, q4, "] size=", i20, str);
                            q6.append(i22);
                            Log.i("GameTextRecognizer", q6.toString());
                            this.X = bitmap;
                            this.Y = arrayList;
                            this.Z = it3;
                            ua7 ua7Var4 = ua7Var;
                            this.d0 = ua7Var4;
                            this.e0 = bitmap4;
                            i12 = i21;
                            this.f0 = i12;
                            i14 = i19;
                            this.g0 = i14;
                            i13 = i18;
                            this.h0 = i13;
                            this.i0 = i3;
                            this.j0 = 1;
                            str3 = str5;
                            wp2Var3 = wp2Var4;
                            b2 = wp2.b(wp2Var3, bitmap4, str3, this);
                            str4 = str;
                            x61Var = x61Var3;
                            if (b2 != x61Var) {
                                ArrayList arrayList3 = arrayList;
                                ua7Var2 = ua7Var4;
                                arrayList2 = arrayList3;
                                List list32 = (List) b2;
                                bitmap4.recycle();
                                RectF rectF4 = ua7Var2.b;
                                float width2 = rectF4.width();
                                float height2 = rectF4.height();
                                if (list32.isEmpty()) {
                                }
                                int i162 = i12;
                                int i172 = i14;
                                arrayList = arrayList2;
                                i3 = i13;
                                str2 = str3;
                                list = list2;
                                bitmap3 = bitmap6;
                                bitmap = bitmap2;
                                i = i162;
                                i2 = i172;
                                it = it3;
                                wp2Var2 = wp2Var3;
                                x61Var2 = x61Var;
                                str = str4;
                                if (!it.hasNext()) {
                                    List list4 = list;
                                    wp2 wp2Var5 = wp2Var2;
                                    if (bitmap != bitmap3) {
                                        bitmap.recycle();
                                    }
                                    List a = wp2.a(wp2Var5, arrayList);
                                    Log.i("GameTextRecognizer", xg6.m(a.size(), list4.size(), "OCR finished with ", " total blocks from ", " regions"));
                                    return a;
                                }
                            }
                            return x61Var;
                        }
                    }
                    i = i4;
                    i2 = i5;
                    i3 = i6;
                    list = list2;
                    bitmap3 = bitmap6;
                    it = it3;
                    wp2Var2 = wp2Var3;
                    x61Var2 = x61Var;
                    str = str4;
                    if (!it.hasNext()) {
                    }
                }
            }
        } else {
            oi2.Y(obj);
            wp2Var2.a = null;
            if (!bitmap3.isRecycled()) {
                try {
                    copy = Bitmap.createBitmap(bitmap3.getWidth(), bitmap3.getHeight(), Bitmap.Config.ARGB_8888);
                    copy.getClass();
                    Canvas canvas = new Canvas(copy);
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{1.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 1.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 1.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 255.0f});
                    Paint paint = new Paint();
                    paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    canvas.drawBitmap(bitmap3, RecyclerView.B1, RecyclerView.B1, paint);
                } catch (Throwable unused) {
                    Bitmap.Config config = bitmap3.getConfig();
                    Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                    if (config != config2) {
                        copy = bitmap3.copy(config2, false);
                    }
                }
                int width3 = copy.getWidth();
                int height3 = copy.getHeight();
                int size = list.size();
                StringBuilder q7 = i61.q(width3, height3, "OCR start: bitmap=", "x", ", regions=");
                q7.append(size);
                q7.append(", lang=");
                q7.append(str2);
                Log.i("GameTextRecognizer", q7.toString());
                if (list.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    int width4 = copy.getWidth();
                    int height4 = copy.getHeight();
                    it = list.iterator();
                    i = width4;
                    i2 = height4;
                    i3 = 0;
                    arrayList = arrayList4;
                    bitmap = copy;
                    if (!it.hasNext()) {
                    }
                } else {
                    x61Var = x61Var2;
                    wp2Var = wp2Var2;
                    this.X = copy;
                    this.j0 = 2;
                    b = wp2.b(wp2Var, copy, str2, this);
                }
            }
            copy = bitmap3;
            int width32 = copy.getWidth();
            int height32 = copy.getHeight();
            int size2 = list.size();
            StringBuilder q72 = i61.q(width32, height32, "OCR start: bitmap=", "x", ", regions=");
            q72.append(size2);
            q72.append(", lang=");
            q72.append(str2);
            Log.i("GameTextRecognizer", q72.toString());
            if (list.isEmpty()) {
            }
        }
        List list5 = (List) b;
        if (copy != bitmap3) {
            copy.recycle();
        }
        List a2 = wp2.a(wp2Var, list5);
        Log.i("GameTextRecognizer", "OCR finished fullscreen with " + a2.size() + " total blocks");
        return a2;
    }
}
