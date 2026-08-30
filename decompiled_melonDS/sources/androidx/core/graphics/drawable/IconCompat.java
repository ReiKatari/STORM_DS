package androidx.core.graphics.drawable;

import a0.j;
import a6.k;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import hi.b;
import java.lang.reflect.InvocationTargetException;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f1192k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f1193a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1194b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1195c = null;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f1196d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f1197e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1198f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1199g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f1200h = f1192k;

    /* renamed from: i  reason: collision with root package name */
    public String f1201i = null;

    /* renamed from: j  reason: collision with root package name */
    public String f1202j;

    public IconCompat(int i2) {
        this.f1193a = i2;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f8 = min;
        float f10 = 0.5f * f8;
        float f11 = 0.9166667f * f10;
        if (z10) {
            float f12 = 0.010416667f * f8;
            paint.setColor(0);
            paint.setShadowLayer(f12, 0.0f, f8 * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(b bVar, int i2) {
        Resources resources = bVar.getResources();
        String packageName = bVar.getPackageName();
        packageName.getClass();
        if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1197e = i2;
            if (resources != null) {
                try {
                    iconCompat.f1194b = resources.getResourceName(i2);
                } catch (Resources.NotFoundException unused) {
                    j.h("Icon resource cannot be found");
                    return null;
                }
            } else {
                iconCompat.f1194b = packageName;
            }
            iconCompat.f1202j = packageName;
            return iconCompat;
        }
        j.h("Drawable resource ID must not be 0");
        return null;
    }

    public final String c() {
        int i2 = this.f1193a;
        if (i2 == -1) {
            Object obj = this.f1194b;
            if (Build.VERSION.SDK_INT >= 28) {
                return k.j(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e6) {
                Log.e("IconCompat", "Unable to get icon package", e6);
                return null;
            } catch (NoSuchMethodException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            }
        } else if (i2 == 2) {
            String str = this.f1202j;
            if (str != null && !TextUtils.isEmpty(str)) {
                return this.f1202j;
            }
            return ((String) this.f1194b).split(":", -1)[0];
        } else {
            o.h(this, "called getResPackage() on ");
            return null;
        }
    }

    public final Uri d() {
        int i2 = this.f1193a;
        if (i2 == -1) {
            Object obj = this.f1194b;
            if (Build.VERSION.SDK_INT >= 28) {
                return k.q(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e6) {
                Log.e("IconCompat", "Unable to get icon uri", e6);
                return null;
            } catch (NoSuchMethodException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            }
        } else if (i2 != 4 && i2 != 6) {
            o.h(this, "called getUri() on ");
            return null;
        } else {
            return Uri.parse((String) this.f1194b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
