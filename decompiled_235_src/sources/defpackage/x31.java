package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import me.magnum.melonds.MelonRomDecryptor;
import me.magnum.melonds.translator.capture.ScreenCaptureService;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x31  reason: default package */
/* loaded from: classes.dex */
public final class x31 implements z31, rs7, x92, mo2, x93, a15, jy4, t35, MelonRomDecryptor.DecryptProgressCallback, eh6 {
    public static volatile x31 B;
    public static x31 L;
    public final /* synthetic */ int A;

    public x31(d23 d23Var) {
        this.A = 9;
    }

    public static final Bitmap l(Image image) {
        boolean z = ScreenCaptureService.A;
        try {
            Image.Plane[] planes = image.getPlanes();
            ByteBuffer buffer = planes[0].getBuffer();
            int pixelStride = planes[0].getPixelStride();
            int width = image.getWidth() + ((planes[0].getRowStride() - (image.getWidth() * pixelStride)) / pixelStride);
            int height = image.getHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
            createBitmap.getClass();
            createBitmap.copyPixelsFromBuffer(buffer);
            Bitmap createBitmap2 = Bitmap.createBitmap(image.getWidth(), image.getHeight(), config);
            createBitmap2.getClass();
            Canvas canvas = new Canvas(createBitmap2);
            ColorMatrix colorMatrix = new ColorMatrix(new float[]{1.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 1.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 1.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 255.0f});
            Paint paint = new Paint();
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            canvas.drawBitmap(createBitmap, new Rect(0, 0, image.getWidth(), image.getHeight()), new Rect(0, 0, image.getWidth(), image.getHeight()), paint);
            createBitmap.recycle();
            return createBitmap2;
        } catch (Throwable th) {
            Log.e("ScreenCaptureService", "Failed to convert Image to Bitmap", th);
            return null;
        }
    }

    public static final float m(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f7 = fArr[fArr.length - 1];
            float f8 = fArr2[fArr.length - 1];
            if (f7 == RecyclerView.B1) {
                return RecyclerView.B1;
            }
            return (f8 / f7) * f;
        }
        if (i2 == -1) {
            float f9 = fArr[0];
            f4 = fArr2[0];
            f5 = f9;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f10 = fArr[i2];
            float f11 = fArr[i];
            f2 = fArr2[i2];
            f3 = f10;
            f4 = fArr2[i];
            f5 = f11;
        }
        if (f3 == f5) {
            f6 = 0.0f;
        } else {
            f6 = (abs - f3) / (f5 - f3);
        }
        return (((f4 - f2) * Math.max((float) RecyclerView.B1, Math.min(1.0f, f6))) + f2) * signum;
    }

    public static final void n(q61 q61Var) {
        tp6 tp6Var;
        hw4 hw4Var;
        int i;
        Object obj;
        hw4 hw4Var2;
        tp6 tp6Var2 = if5.z;
        do {
            tp6Var = if5.z;
            hw4Var = (hw4) tp6Var.getValue();
            yv4 yv4Var = hw4Var.L;
            ew3 ew3Var = (ew3) yv4Var.get(q61Var);
            if (ew3Var == null) {
                hw4Var2 = hw4Var;
            } else {
                Object obj2 = ew3Var.a;
                Object obj3 = ew3Var.b;
                ac7 ac7Var = yv4Var.A;
                if (q61Var != null) {
                    i = q61Var.hashCode();
                } else {
                    i = 0;
                }
                ac7 v = ac7Var.v(q61Var, i, 0);
                if (ac7Var != v) {
                    if (v == null) {
                        yv4Var = yv4.L;
                    } else {
                        yv4Var = new yv4(v, yv4Var.B - 1);
                    }
                }
                d90 d90Var = d90.t0;
                if (obj2 != d90Var) {
                    Object obj4 = yv4Var.get(obj2);
                    obj4.getClass();
                    yv4Var = yv4Var.c(obj2, new ew3(((ew3) obj4).a, obj3));
                }
                if (obj3 != d90Var) {
                    Object obj5 = yv4Var.get(obj3);
                    obj5.getClass();
                    yv4Var = yv4Var.c(obj3, new ew3(obj2, ((ew3) obj5).b));
                }
                if (obj2 != d90Var) {
                    obj = hw4Var.A;
                } else {
                    obj = obj3;
                }
                if (obj3 != d90Var) {
                    obj2 = hw4Var.B;
                }
                hw4Var2 = new hw4(obj, obj2, yv4Var);
            }
            if (hw4Var == hw4Var2) {
                return;
            }
        } while (!tp6Var.j(hw4Var, hw4Var2));
    }

    public static final void o(List list, StringBuilder sb) {
        j93 P = gi2.P(2, gi2.R(0, list.size()));
        int i = P.A;
        int i2 = P.B;
        int i3 = P.L;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i != i2) {
                i += i3;
            } else {
                return;
            }
        }
    }

    public static final int p(int i, long j) {
        int i2 = s87.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static void q() {
        ScreenCaptureService.A = false;
        try {
            Bitmap bitmap = ScreenCaptureService.d0;
            if (bitmap != null) {
                bitmap.recycle();
            }
            ScreenCaptureService.d0 = null;
            VirtualDisplay virtualDisplay = ScreenCaptureService.X;
            if (virtualDisplay != null) {
                virtualDisplay.release();
            }
            ScreenCaptureService.X = null;
            ImageReader imageReader = ScreenCaptureService.Y;
            if (imageReader != null) {
                imageReader.close();
            }
            ScreenCaptureService.Y = null;
            MediaProjection mediaProjection = ScreenCaptureService.R;
            if (mediaProjection != null) {
                mediaProjection.stop();
            }
            ScreenCaptureService.R = null;
        } catch (Throwable th) {
            Log.e("ScreenCaptureService", "Error cleaning up screen capture", th);
        }
    }

    public static sb4 r(rh rhVar, ic4 ic4Var, Bundle bundle, tt3 tt3Var, ac4 ac4Var) {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        ic4Var.getClass();
        tt3Var.getClass();
        return new sb4(rhVar, ic4Var, bundle, tt3Var, ac4Var, uuid, null);
    }

    public static pp4 s(int i, int i2, vs0 vs0Var, qp4 qp4Var, rp4 rp4Var, sp4 sp4Var, tp4 tp4Var, Size size, String str) {
        vs0 vs0Var2;
        qp4 qp4Var2;
        sp4 sp4Var2;
        tp4 tp4Var2;
        vs0 vs0Var3 = vs0.m0;
        if ((i2 & 8) != 0) {
            vs0Var2 = vs0Var3;
        } else {
            vs0Var2 = vs0Var;
        }
        if ((i2 & 64) != 0) {
            qp4Var2 = null;
        } else {
            qp4Var2 = qp4Var;
        }
        if ((i2 & 128) != 0) {
            sp4Var2 = null;
        } else {
            sp4Var2 = sp4Var;
        }
        if ((i2 & 256) != 0) {
            tp4Var2 = null;
        } else {
            tp4Var2 = tp4Var;
        }
        size.getClass();
        vs0 vs0Var4 = vs0.o0;
        yt1 yt1Var = yt1.A;
        if (vs0Var2 != vs0Var4 && vs0Var2 != vs0.n0 && ((vs0Var2 != vs0.q0 && vs0Var2 != vs0.r0) || Build.VERSION.SDK_INT < 35)) {
            if (vs0Var2 == vs0Var3) {
                return new pp4(size, i, str, rp4Var, qp4Var2, sp4Var2, tp4Var2, yt1Var);
            }
            i.m("Check failed.");
            return null;
        }
        return new np4(size, i, str, vs0Var2, rp4Var, qp4Var2, sp4Var2, tp4Var2, yt1Var);
    }

    public static Typeface t(String str, oj2 oj2Var, int i) {
        if (i == 0 && nb3.k(oj2Var, oj2.Y) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int j0 = vy7.j0(i, oj2Var);
        if (str != null && str.length() != 0) {
            return Typeface.create(str, j0);
        }
        return Typeface.defaultFromStyle(j0);
    }

    public static Path u(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static long v(int i, int i2, int i3, int i4) {
        return ((i2 & 32767) << 15) | (i & 32767) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }

    @Override // defpackage.rs7
    public d44 a(c44 c44Var) {
        return null;
    }

    @Override // defpackage.z31
    public long c(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
            int i = a66.a;
            return floatToRawIntBits;
        }
        float d = u24.d(j, j2);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(d) << 32) | (Float.floatToRawIntBits(d) & 4294967295L);
        int i2 = a66.a;
        return floatToRawIntBits2;
    }

    @Override // defpackage.eh6
    public le2 d(yt6 yt6Var) {
        return new g21(new bf4(yt6Var, null, 19), 7);
    }

    @Override // defpackage.jy4
    public Typeface e(int i, oj2 oj2Var) {
        return t(null, oj2Var, i);
    }

    @Override // defpackage.x92
    public boolean f(rc6 rc6Var) {
        return false;
    }

    @Override // defpackage.t35
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.a15
    public CharSequence i(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(listPreference.f())) {
            return listPreference.getContext().getString(R.string.not_set);
        }
        return listPreference.f();
    }

    @Override // defpackage.t35
    public void j(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i != 6 && i != 7 && i != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override // defpackage.jy4
    public Typeface k(sr2 sr2Var, oj2 oj2Var, int i) {
        String str = sr2Var.R;
        int i2 = oj2Var.A / 100;
        if (i2 >= 0 && i2 < 2) {
            str = str.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            str = str.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                str = str.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                str = str.concat("-black");
            }
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface t = t(str, oj2Var, i);
            if (!nb3.k(t, Typeface.create(Typeface.DEFAULT, vy7.j0(i, oj2Var))) && !nb3.k(t, t(null, oj2Var, i))) {
                typeface = t;
            }
        }
        if (typeface == null) {
            return t(sr2Var.R, oj2Var, i);
        }
        return typeface;
    }

    public String toString() {
        switch (this.A) {
            case 25:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ x31(int i) {
        this.A = i;
    }

    @Override // defpackage.mo2
    public Object apply(Object obj) {
        return obj;
    }

    @Override // defpackage.rs7
    public void b(int i) {
    }

    @Override // defpackage.rs7
    public void g(c44 c44Var, Bitmap bitmap, Map map, int i) {
    }
}
