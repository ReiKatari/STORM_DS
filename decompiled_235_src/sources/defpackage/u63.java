package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Range;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.mlkit.common.MlKitException;
import com.stormds.emulator.R;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u63  reason: default package */
/* loaded from: classes.dex */
public class u63 implements go1, oy7, f36 {
    public static final int[] R = {16843067, 16843068};
    public static final u63 X;
    public final /* synthetic */ int A;
    public Object B;
    public Object L;

    static {
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf((float) RecyclerView.B1);
        X = new u63(2, new wr4(valueOf2, valueOf2), new wr4(valueOf, valueOf));
    }

    public u63(Context context) {
        this.A = 13;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(qo2.O(context, R.attr.materialCalendarStyle, f24.class.getCanonicalName()).data, a75.m);
        cs1.p(context, obtainStyledAttributes.getResourceId(4, 0));
        cs1.p(context, obtainStyledAttributes.getResourceId(2, 0));
        cs1.p(context, obtainStyledAttributes.getResourceId(3, 0));
        cs1.p(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList S = np2.S(context, obtainStyledAttributes, 7);
        this.B = cs1.p(context, obtainStyledAttributes.getResourceId(9, 0));
        cs1.p(context, obtainStyledAttributes.getResourceId(8, 0));
        this.L = cs1.p(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(S.getDefaultColor());
        obtainStyledAttributes.recycle();
    }

    public static HttpURLConnection B(u63 u63Var, String str) {
        int i = 0;
        while (i < 10) {
            URL url = new URL(str);
            URLConnection openConnection = url.openConnection();
            openConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setConnectTimeout(20000);
            httpURLConnection.setReadTimeout(45000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 14; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Mobile Safari/537.36");
            httpURLConnection.setRequestProperty("Accept", "*/*");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (hf.c0(Integer.valueOf((int) MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE), 302, 303, 307, 308).contains(Integer.valueOf(responseCode))) {
                String headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null && !qs6.v0(headerField)) {
                    if (!xs6.g0(headerField, "http://", false) && !xs6.g0(headerField, "https://", false)) {
                        str = new URL(url, headerField).toString();
                        str.getClass();
                    } else {
                        str = headerField;
                    }
                    i++;
                } else {
                    e41.i(lb1.k("HTTP redirect ", responseCode, " with missing Location header"));
                    return null;
                }
            } else if (200 <= responseCode && responseCode < 300) {
                return httpURLConnection;
            } else {
                httpURLConnection.disconnect();
                e41.i(lb1.g(responseCode, "HTTP error "));
                return null;
            }
        }
        e41.i(lb1.k("Too many redirects (", i, ")"));
        return null;
    }

    public static ga C(File file) {
        Object em5Var;
        File file2 = new File(file, "meta.json");
        if (!file2.isFile()) {
            return new ga(null, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(jc2.B0(file2));
            String optString = jSONObject.optString("name");
            optString.getClass();
            if (qs6.v0(optString)) {
                optString = null;
            }
            String optString2 = jSONObject.optString("libraryName");
            optString2.getClass();
            if (qs6.v0(optString2)) {
                optString2 = null;
            }
            em5Var = new ga(optString, optString2);
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        Object gaVar = new ga(null, null);
        if (em5Var instanceof em5) {
            em5Var = gaVar;
        }
        return (ga) em5Var;
    }

    public static File E(File file, ga gaVar) {
        List c0 = sb6.c0(new pc2(jc2.E0(file, ic2.TOP_DOWN), true, new k4(9)));
        String str = gaVar.b;
        if (str != null) {
            File canonicalFile = new File(file, str).getCanonicalFile();
            File canonicalFile2 = file.getCanonicalFile();
            String path = canonicalFile.getPath();
            path.getClass();
            String path2 = canonicalFile2.getPath();
            String str2 = File.separator;
            if (xs6.g0(path, path2 + str2, false)) {
                if (canonicalFile.isFile() && jc2.y0(canonicalFile).equalsIgnoreCase("so")) {
                    return canonicalFile;
                }
            } else {
                throw new ia(ha.InvalidZip);
            }
        }
        for (String str3 : hf.c0("libvulkan_freedreno.so", "vulkan.adreno.so")) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : c0) {
                if (xs6.Z(((File) obj).getName(), str3, true)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() == 1) {
                return (File) gt0.H0(arrayList);
            }
            if (arrayList.size() > 1) {
                throw new ia(ha.AmbiguousDriver);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : c0) {
            File file2 = (File) obj2;
            String name = file2.getName();
            name.getClass();
            if (!xs6.g0(name, "libvulkan", true)) {
                String name2 = file2.getName();
                name2.getClass();
                if (xs6.g0(name2, "vulkan.", true)) {
                    String name3 = file2.getName();
                    name3.getClass();
                    if (xs6.Y(name3, ".so", true)) {
                    }
                }
            }
            arrayList2.add(obj2);
        }
        int size = arrayList2.size();
        if (size != 0) {
            if (size == 1) {
                return (File) gt0.H0(arrayList2);
            }
            throw new ia(ha.AmbiguousDriver);
        }
        throw new ia(ha.NoDriver);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
        throw new defpackage.ia(defpackage.ha.InvalidZip);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(InputStream inputStream, File file) {
        BufferedInputStream bufferedInputStream;
        File canonicalFile = file.getCanonicalFile();
        if (inputStream instanceof BufferedInputStream) {
            bufferedInputStream = (BufferedInputStream) inputStream;
        } else {
            bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        }
        ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return;
                }
                File canonicalFile2 = new File(canonicalFile, nextEntry.getName()).getCanonicalFile();
                String path = canonicalFile2.getPath();
                path.getClass();
                String path2 = canonicalFile.getPath();
                String str = File.separator;
                if (!xs6.g0(path, path2 + str, false)) {
                    break;
                }
                if (nextEntry.isDirectory()) {
                    canonicalFile2.mkdirs();
                } else {
                    File parentFile = canonicalFile2.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(canonicalFile2);
                    f04.w(zipInputStream, fileOutputStream);
                    fileOutputStream.close();
                }
                zipInputStream.closeEntry();
            } finally {
            }
        }
    }

    public void A(String str, CameraDevice.StateCallback stateCallback) {
        t57 t57Var = (t57) this.L;
        CameraManager cameraManager = (CameraManager) ((n55) this.B).get();
        try {
            Trace.beginSection(((Object) xf0.b(str)) + "#openCamera");
            if (Build.VERSION.SDK_INT >= 28) {
                cameraManager.getClass();
                Executor executor = (Executor) t57Var.j.getValue();
                executor.getClass();
                cameraManager.openCamera(str, executor, stateCallback);
            } else {
                cameraManager.openCamera(str, stateCallback, t57Var.a());
            }
        } finally {
            Trace.endSection();
        }
    }

    public void D(String str) {
        Object obj;
        String str2;
        File parentFile;
        str.getClass();
        ng6 ng6Var = (ng6) ((kd6) this.L);
        Iterator it = ng6Var.n().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((zq7) obj).a.equals(str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        zq7 zq7Var = (zq7) obj;
        if (zq7Var != null && (str2 = zq7Var.c) != null && (parentFile = new File(str2).getParentFile()) != null) {
            jc2.x0(parentFile);
        }
        SharedPreferences sharedPreferences = ng6Var.b;
        List n = ng6Var.n();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : n) {
            if (!((zq7) obj2).a.equals(str)) {
                arrayList.add(obj2);
            }
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("video_vulkan_custom_drivers", ng6.K(arrayList));
        edit.remove("video_vulkan_custom_driver_dir");
        edit.remove("video_vulkan_custom_driver_name");
        edit.remove("video_vulkan_custom_driver_display_name");
        if (nb3.k(sharedPreferences.getString("video_vulkan_selected_driver_id", null), str)) {
            edit.remove("video_vulkan_selected_driver_id");
            String lowerCase = "SYSTEM".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            edit.putString("video_vulkan_driver_mode", lowerCase);
        }
        edit.commit();
    }

    public void F(boolean z) {
        nt1 nt1Var = (nt1) ((yc1) ((d51) this.L).B).B;
        if (nt1Var.L != z) {
            if (nt1Var.B != null) {
                ws1 a = ws1.a();
                mt1 mt1Var = nt1Var.B;
                a.getClass();
                np2.x(mt1Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(mt1Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            nt1Var.L = z;
            if (z) {
                nt1.a(nt1Var.A, ws1.a().c());
            }
        }
    }

    public void G(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.L;
        cardView.R.set(i, i2, i3, i4);
        Rect rect = cardView.L;
        CardView.a(cardView, i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public Drawable H(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id != 16908301 && id != 16908303) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                drawableArr[i] = H(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.L) == null) {
                this.L = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        } else {
            return drawable;
        }
    }

    public void I() {
        synchronized (this) {
            ((AtomicInteger) this.B).decrementAndGet();
            if (((AtomicInteger) this.B).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    @Override // defpackage.oy7
    public float a() {
        switch (this.A) {
            case 5:
                Comparable upper = ((Range) this.L).getUpper();
                upper.getClass();
                return ((Number) upper).floatValue();
            default:
                lg0 lg0Var = ((sg0) this.B).b;
                CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
                key.getClass();
                Float valueOf = Float.valueOf(1.0f);
                qc0 qc0Var = (qc0) lg0Var;
                qc0Var.getClass();
                Object c = qc0Var.c(key);
                if (c != null) {
                    valueOf = c;
                }
                Float f = valueOf;
                float floatValue = f.floatValue();
                if (Math.abs(floatValue) < Math.ulp(Math.abs(floatValue)) * 2.0d) {
                    if (!kj2.L()) {
                        return 1.0f;
                    }
                    Log.w("CXCP", "Invalid max zoom ratio of " + f + " detected, defaulting to 1.0f");
                    return 1.0f;
                }
                return f.floatValue();
        }
    }

    @Override // defpackage.go1
    public Object b(xa4 xa4Var, eo2 eo2Var, hw6 hw6Var) {
        Object a = ((dd) this.L).a(xa4Var, new c12(this, eo2Var, (r41) null), hw6Var);
        if (a == x61.COROUTINE_SUSPENDED) {
            return a;
        }
        return jg7.a;
    }

    @Override // defpackage.oy7
    public float c() {
        switch (this.A) {
            case 5:
                Comparable lower = ((Range) this.L).getLower();
                lower.getClass();
                return ((Number) lower).floatValue();
            default:
                return 1.0f;
        }
    }

    @Override // defpackage.oy7
    public jg1 d(li7 li7Var) {
        CaptureRequest.Key key;
        int i = this.A;
        li7Var.getClass();
        switch (i) {
            case 5:
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                key.getClass();
                ArrayList d0 = hf.d0(key);
                if (Build.VERSION.SDK_INT >= 34) {
                    CaptureRequest.Key g = gi.g();
                    g.getClass();
                    d0.add(g);
                }
                return li7Var.f(d0, ki7.DEFAULT);
            default:
                return li7Var.f(hf.b0(CaptureRequest.SCALER_CROP_REGION), ki7.DEFAULT);
        }
    }

    @Override // defpackage.oy7
    public jg1 e(li7 li7Var) {
        CaptureRequest.Key key;
        int i = this.A;
        li7Var.getClass();
        switch (i) {
            case 5:
                float c = c();
                if (1.0f <= a() && c <= 1.0f) {
                    key = CaptureRequest.CONTROL_ZOOM_RATIO;
                    LinkedHashMap n0 = c14.n0(new vr4(key, Float.valueOf(1.0f)));
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        kg0 kg0Var = lg0.g;
                        lg0 lg0Var = ((sg0) this.B).b;
                        kg0Var.getClass();
                        lg0Var.getClass();
                        if (i2 >= 34) {
                            CameraCharacteristics.Key f = gi.f();
                            f.getClass();
                            int[] iArr = (int[]) ((qc0) lg0Var).c(f);
                            if (iArr != null && fv.m0(iArr, 1)) {
                                n0.put(gi.g(), 1);
                            }
                        }
                    }
                    return li7.b(li7Var, n0);
                }
                i.h("Failed requirement.");
                return null;
            default:
                Rect rect = (Rect) this.L;
                if (Math.abs(1.0f) < Math.ulp(Math.abs(1.0f)) * 2.0d && kj2.L()) {
                    Log.w("CXCP", "ZoomCompat: Invalid zoom ratio of 0.0f passed in, defaulting to 1.0f");
                }
                float width = rect.width() / 1.0f;
                float height = rect.height() / 1.0f;
                float width2 = (rect.width() - width) / 2.0f;
                float height2 = (rect.height() - height) / 2.0f;
                Map singletonMap = Collections.singletonMap(CaptureRequest.SCALER_CROP_REGION, new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height)));
                singletonMap.getClass();
                return li7.b(li7Var, singletonMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc A[Catch: all -> 0x00bd, TRY_ENTER, TryCatch #6 {all -> 0x00bd, blocks: (B:60:0x00bc, B:63:0x00bf, B:64:0x00d7), top: B:70:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf A[Catch: all -> 0x00bd, TryCatch #6 {all -> 0x00bd, blocks: (B:60:0x00bc, B:63:0x00bf, B:64:0x00d7), top: B:70:0x00ba }] */
    @Override // defpackage.f36
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e36 f(String str) {
        boolean z;
        FileChannel fileChannel;
        str.getClass();
        ai1 ai1Var = (ai1) this.L;
        if (!str.equals(":memory:")) {
            str = ((bc1) ai1Var.d).a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z2 = true;
        if (!ai1Var.b && !ai1Var.c && !str.equals(":memory:")) {
            z = true;
        } else {
            z = false;
        }
        a72 a72Var = new a72(str, z);
        ReentrantLock reentrantLock = a72Var.a;
        reentrantLock.lock();
        yc1 yc1Var = a72Var.b;
        if (yc1Var != null) {
            try {
                yc1Var.G();
            } catch (Throwable th) {
                th = th;
                z2 = false;
                try {
                    if (!z2) {
                        throw th;
                    }
                    throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        try {
            if (!ai1Var.c) {
                e36 f = ((f36) this.B).f(str);
                if (!ai1Var.b) {
                    ai1Var.c = true;
                    ai1.a(ai1Var, f);
                    ai1Var.c = false;
                } else {
                    ai1.f(f);
                    if (((bc1) ai1Var.d).g == l16.WRITE_AHEAD_LOGGING) {
                        ii2.s(f, "PRAGMA synchronous = NORMAL");
                    } else {
                        ii2.s(f, "PRAGMA synchronous = FULL");
                    }
                    ((ts1) ai1Var.e).s(f);
                }
                if (yc1Var != null && (fileChannel = (FileChannel) yc1Var.B) != null) {
                    fileChannel.close();
                    yc1Var.B = null;
                }
                return f;
            }
            throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
        } catch (Throwable th2) {
            th = th2;
            if (!z2) {
            }
        }
    }

    public boolean g() {
        synchronized (this) {
            if (((AtomicBoolean) this.L).get()) {
                return false;
            }
            ((AtomicInteger) this.B).incrementAndGet();
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(hm4 hm4Var, ja7 ja7Var, s41 s41Var) {
        ka kaVar;
        int i;
        if (s41Var instanceof ka) {
            kaVar = (ka) s41Var;
            int i2 = kaVar.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kaVar.Y = i2 - Integer.MIN_VALUE;
                Object obj = kaVar.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = kaVar.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    xe1 xe1Var = xk1.a;
                    de1 de1Var = de1.L;
                    la laVar = new la(this, hm4Var, ja7Var, null, 0);
                    kaVar.Y = 1;
                    obj = hv.d0(de1Var, laVar, kaVar);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return ((hm5) obj).A;
            }
        }
        kaVar = new ka(this, s41Var);
        Object obj2 = kaVar.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = kaVar.Y;
        if (i == 0) {
        }
        return ((hm5) obj2).A;
    }

    public void i(Uri uri, File file) {
        InputStream openInputStream = ((Context) this.B).getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            try {
                j(openInputStream, file);
                openInputStream.close();
            } finally {
            }
        } else {
            throw new ia(ha.InvalidZip);
        }
    }

    public gg3 k(ar0 ar0Var) {
        Object putIfAbsent;
        switch (this.A) {
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                Class cls = ar0Var.a;
                cls.getClass();
                Object k = gi.k((cr0) this.L, cls);
                k.getClass();
                pa4 pa4Var = (pa4) k;
                Object obj = pa4Var.a.get();
                if (obj == null) {
                    synchronized (pa4Var) {
                        obj = pa4Var.a.get();
                        if (obj == null) {
                            obj = new pa0((gg3) ((qn2) this.B).g(ar0Var));
                            pa4Var.a = new SoftReference(obj);
                        }
                    }
                }
                return ((pa0) obj).a;
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.L;
                Class cls2 = ar0Var.a;
                cls2.getClass();
                Object obj2 = concurrentHashMap.get(cls2);
                if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(cls2, (obj2 = new pa0((gg3) ((qn2) this.B).g(ar0Var))))) != null) {
                    obj2 = putIfAbsent;
                }
                return ((pa0) obj2).a;
        }
    }

    public Object l(ar0 ar0Var, ArrayList arrayList) {
        Object em5Var;
        Object em5Var2;
        Object putIfAbsent;
        int i = 0;
        switch (this.A) {
            case 22:
                Class cls = ar0Var.a;
                cls.getClass();
                Object k = gi.k((cr0) this.L, cls);
                k.getClass();
                pa4 pa4Var = (pa4) k;
                Object obj = pa4Var.a.get();
                if (obj == null) {
                    synchronized (pa4Var) {
                        obj = pa4Var.a.get();
                        if (obj == null) {
                            obj = new qs4();
                            pa4Var.a = new SoftReference(obj);
                        }
                    }
                }
                qs4 qs4Var = (qs4) obj;
                ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(new ig3((hg3) obj2));
                }
                ConcurrentHashMap concurrentHashMap = qs4Var.a;
                Object obj3 = concurrentHashMap.get(arrayList2);
                if (obj3 == null) {
                    try {
                        em5Var = (gg3) ((eo2) this.B).o(ar0Var, arrayList);
                    } catch (Throwable th) {
                        em5Var = new em5(th);
                    }
                    hm5 hm5Var = new hm5(em5Var);
                    Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, hm5Var);
                    if (putIfAbsent2 == null) {
                        obj3 = hm5Var;
                    } else {
                        obj3 = putIfAbsent2;
                    }
                }
                return ((hm5) obj3).A;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.L;
                Class cls2 = ar0Var.a;
                cls2.getClass();
                Object obj4 = concurrentHashMap2.get(cls2);
                if (obj4 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(cls2, (obj4 = new qs4()))) != null) {
                    obj4 = putIfAbsent;
                }
                qs4 qs4Var2 = (qs4) obj4;
                ArrayList arrayList3 = new ArrayList(ht0.v0(arrayList, 10));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj5 = arrayList.get(i);
                    i++;
                    arrayList3.add(new ig3((hg3) obj5));
                }
                ConcurrentHashMap concurrentHashMap3 = qs4Var2.a;
                Object obj6 = concurrentHashMap3.get(arrayList3);
                if (obj6 == null) {
                    try {
                        em5Var2 = (gg3) ((eo2) this.B).o(ar0Var, arrayList);
                    } catch (Throwable th2) {
                        em5Var2 = new em5(th2);
                    }
                    hm5 hm5Var2 = new hm5(em5Var2);
                    Object putIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, hm5Var2);
                    if (putIfAbsent3 == null) {
                        obj6 = hm5Var2;
                    } else {
                        obj6 = putIfAbsent3;
                    }
                }
                return ((hm5) obj6).A;
        }
    }

    @Override // defpackage.f36
    public boolean m() {
        return ((f36) this.B).m();
    }

    public InputMethodManager n() {
        return (InputMethodManager) ((go3) this.L).getValue();
    }

    public KeyListener o(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((yc1) ((d51) this.L).B).getClass();
            if (keyListener instanceof ft1) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new ft1(keyListener);
        }
        return keyListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
        if (r0 != null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc A[Catch: ia -> 0x00bc, Exception -> 0x0110, TryCatch #6 {ia -> 0x00bc, Exception -> 0x0110, blocks: (B:43:0x009a, B:45:0x00ae, B:47:0x00b2, B:55:0x00c3, B:57:0x00cc, B:61:0x00df, B:60:0x00d9, B:63:0x0100, B:64:0x0107, B:54:0x00bf, B:65:0x0108, B:66:0x010f), top: B:79:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100 A[Catch: ia -> 0x00bc, Exception -> 0x0110, TryCatch #6 {ia -> 0x00bc, Exception -> 0x0110, blocks: (B:43:0x009a, B:45:0x00ae, B:47:0x00b2, B:55:0x00c3, B:57:0x00cc, B:61:0x00df, B:60:0x00d9, B:63:0x0100, B:64:0x0107, B:54:0x00bf, B:65:0x0108, B:66:0x010f), top: B:79:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja p(Uri uri) {
        Uri uri2;
        Object em5Var;
        String str;
        kd6 kd6Var = (kd6) this.L;
        Context context = (Context) this.B;
        uri.getClass();
        if (q60.N(context)) {
            String str2 = null;
            try {
                uri2 = uri;
            } catch (Throwable th) {
                th = th;
                uri2 = uri;
            }
            try {
                Cursor query = context.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                if (query != null) {
                    if (query.moveToFirst()) {
                        em5Var = query.getString(0);
                    } else {
                        em5Var = null;
                    }
                    query.close();
                } else {
                    em5Var = null;
                }
            } catch (Throwable th2) {
                th = th2;
                em5Var = new em5(th);
                if (em5Var instanceof em5) {
                }
                str = (String) em5Var;
                if (str != null) {
                }
                str = "Custom Vulkan driver";
                if (!xs6.Y(str, ".zip", true)) {
                }
            }
            if (em5Var instanceof em5) {
                em5Var = null;
            }
            str = (String) em5Var;
            if (str != null) {
                if (qs6.v0(str)) {
                    str = null;
                }
            }
            str = "Custom Vulkan driver";
            if (!xs6.Y(str, ".zip", true)) {
                String uuid = UUID.randomUUID().toString();
                uuid.getClass();
                File file = new File(context.getFilesDir(), "adreno-drivers");
                File file2 = new File(file, "pending-".concat(uuid));
                File file3 = new File(file, "driver-".concat(uuid));
                try {
                    file2.mkdirs();
                    i(uri2, file2);
                    ga C = C(file2);
                    File E = E(file2, C);
                    File parentFile = E.getParentFile();
                    if (parentFile != null) {
                        String str3 = C.a;
                        if (str3 != null) {
                            if (!qs6.v0(str3)) {
                                str2 = str3;
                            }
                            if (str2 != null) {
                                jc2.x0(file3);
                                if (!file2.renameTo(file3)) {
                                    String D0 = jc2.D0(parentFile, file2);
                                    if (!D0.equals(".")) {
                                        file3 = new File(file3, D0);
                                    }
                                    String absolutePath = file3.getAbsolutePath();
                                    absolutePath.getClass();
                                    String name = E.getName();
                                    name.getClass();
                                    ((ng6) kd6Var).L(uuid, absolutePath, name, str2);
                                    ((ng6) kd6Var).P(sr7.CUSTOM);
                                    return new ja(uuid, str2);
                                }
                                throw new ia(ha.InvalidZip);
                            }
                        }
                        str2 = qs6.E0(str, ".zip");
                        jc2.x0(file3);
                        if (!file2.renameTo(file3)) {
                        }
                    } else {
                        throw new ia(ha.NoDriver);
                    }
                } catch (ia e) {
                    jc2.x0(file2);
                    throw e;
                } catch (Exception unused) {
                    jc2.x0(file2);
                    throw new ia(ha.InvalidZip);
                }
            } else {
                throw new ia(ha.NotZip);
            }
        } else {
            throw new ia(ha.UnsupportedBuild);
        }
    }

    public ja q(File file, String str) {
        kd6 kd6Var = (kd6) this.L;
        Context context = (Context) this.B;
        if (q60.N(context)) {
            String uuid = UUID.randomUUID().toString();
            uuid.getClass();
            File file2 = new File(context.getFilesDir(), "adreno-drivers");
            File file3 = new File(file2, "pending-".concat(uuid));
            File file4 = new File(file2, "driver-".concat(uuid));
            try {
                file3.mkdirs();
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    j(fileInputStream, file3);
                    fileInputStream.close();
                    ga C = C(file3);
                    File E = E(file3, C);
                    File parentFile = E.getParentFile();
                    if (parentFile != null) {
                        if (qs6.v0(str)) {
                            String str2 = C.a;
                            if (str2 != null) {
                                if (qs6.v0(str2)) {
                                    str2 = null;
                                }
                                str = str2;
                                if (str == null) {
                                }
                            }
                            str = "Custom Vulkan driver";
                        }
                        jc2.x0(file4);
                        if (file3.renameTo(file4)) {
                            String D0 = jc2.D0(parentFile, file3);
                            if (!D0.equals(".")) {
                                file4 = new File(file4, D0);
                            }
                            String absolutePath = file4.getAbsolutePath();
                            absolutePath.getClass();
                            String name = E.getName();
                            name.getClass();
                            ((ng6) kd6Var).L(uuid, absolutePath, name, str);
                            ((ng6) kd6Var).O(uuid);
                            ((ng6) kd6Var).P(sr7.CUSTOM);
                            return new ja(uuid, str);
                        }
                        throw new ia(ha.InvalidZip);
                    }
                    throw new ia(ha.NoDriver);
                } finally {
                }
            } catch (ia e) {
                jc2.x0(file3);
                throw e;
            } catch (Exception unused) {
                jc2.x0(file3);
                throw new ia(ha.InvalidZip);
            }
        } else {
            throw new ia(ha.UnsupportedBuild);
        }
    }

    public void r(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.A) {
            case 1:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.B;
                m44 A = m44.A(absSeekBar.getContext(), attributeSet, R, i);
                Drawable l = A.l(0);
                if (l != null) {
                    if (l instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) l;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable H = H(animationDrawable.getFrame(i2), true);
                            H.setLevel(10000);
                            animationDrawable2.addFrame(H, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        l = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(l);
                }
                Drawable l2 = A.l(1);
                if (l2 != null) {
                    absSeekBar.setProgressDrawable(H(l2, false));
                }
                A.D();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.B).getContext().obtainStyledAttributes(attributeSet, m75.i, i, 0);
                try {
                    if (obtainStyledAttributes.hasValue(14)) {
                        z = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    F(z);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public AutofillId s(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession g = yz0.g(this.L);
            u2 z = hi2.z((View) this.B);
            Objects.requireNonNull(z);
            return rp.h(g, au.b(z.b), j);
        }
        return null;
    }

    public void t(String str) {
        str.getClass();
        for (CameraCaptureSession.StateCallback stateCallback : (List) ((xw) this.L).a) {
            stateCallback.onClosed((di5) this.B);
        }
    }

    public void u(String str) {
        str.getClass();
        for (CameraCaptureSession.StateCallback stateCallback : (List) ((xw) this.L).a) {
            stateCallback.onConfigureFailed((di5) this.B);
        }
    }

    public void v(String str) {
        str.getClass();
        for (CameraCaptureSession.StateCallback stateCallback : (List) ((xw) this.L).a) {
            stateCallback.onConfigured((di5) this.B);
        }
    }

    public ct1 w(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        d51 d51Var = (d51) this.L;
        if (inputConnection == null) {
            d51Var.getClass();
            inputConnection2 = null;
        } else {
            yc1 yc1Var = (yc1) d51Var.B;
            yc1Var.getClass();
            if (!(inputConnection instanceof ct1)) {
                inputConnection = new ct1(editorInfo, inputConnection, (EditText) yc1Var.A);
            }
            inputConnection2 = inputConnection;
        }
        return (ct1) inputConnection2;
    }

    public void x(k8 k8Var) {
        eb ebVar = (eb) this.B;
        ((ActionMode.Callback) ebVar.B).onDestroyActionMode(ebVar.C(k8Var));
        fr frVar = (fr) this.L;
        if (frVar.r0 != null) {
            frVar.h0.getDecorView().removeCallbacks(frVar.s0);
        }
        if (frVar.q0 != null) {
            ip7 ip7Var = frVar.t0;
            if (ip7Var != null) {
                ip7Var.b();
            }
            ip7 b = ao7.b(frVar.q0);
            b.a(RecyclerView.B1);
            frVar.t0 = b;
            b.d(new wq(this, 2));
        }
        frVar.p0 = null;
        ViewGroup viewGroup = frVar.v0;
        WeakHashMap weakHashMap = ao7.a;
        viewGroup.requestApplyInsets();
        frVar.M();
    }

    public boolean y(k8 k8Var, Menu menu) {
        ViewGroup viewGroup = ((fr) this.L).v0;
        WeakHashMap weakHashMap = ao7.a;
        viewGroup.requestApplyInsets();
        eb ebVar = (eb) this.B;
        ActionMode.Callback callback = (ActionMode.Callback) ebVar.B;
        hu6 C = ebVar.C(k8Var);
        ci6 ci6Var = (ci6) ebVar.X;
        Menu menu2 = (Menu) ci6Var.get(menu);
        if (menu2 == null) {
            menu2 = new e54((Context) ebVar.L, (i44) menu);
            ci6Var.put(menu, menu2);
        }
        return callback.onPrepareActionMode(C, menu2);
    }

    public void z(yi2 yi2Var) {
        d72 d72Var = (d72) this.L;
        j97 j97Var = (j97) this.B;
        int i = yi2Var.b;
        if (i == 0) {
            d72Var.execute(new uo2(5, j97Var, yi2Var.a));
        } else {
            d72Var.execute(new ub0(j97Var, i, 0));
        }
    }

    public /* synthetic */ u63(int i, Object obj, Object obj2, boolean z) {
        this.A = i;
        this.L = obj;
        this.B = obj2;
    }

    public /* synthetic */ u63(Object obj, int i) {
        this.A = i;
        this.L = obj;
    }

    public u63(Context context, kd6 kd6Var) {
        this.A = 3;
        kd6Var.getClass();
        this.B = context;
        this.L = kd6Var;
    }

    public u63(i4 i4Var) {
        this.A = 23;
        this.B = new AtomicInteger(0);
        this.L = new AtomicBoolean(false);
    }

    public u63(int i, qn2 qn2Var) {
        this.A = i;
        switch (i) {
            case 25:
                this.B = qn2Var;
                this.L = new ConcurrentHashMap();
                return;
            default:
                this.B = qn2Var;
                this.L = new cr0();
                return;
        }
    }

    public u63(AbsSeekBar absSeekBar) {
        this.A = 1;
        this.B = absSeekBar;
    }

    public u63(EditText editText) {
        this.A = 9;
        this.B = editText;
        this.L = new d51(editText);
    }

    public u63(View view) {
        this.A = 0;
        this.B = view;
        this.L = kj2.M(xr3.NONE, new er2(this, 4));
    }

    public u63(ai1 ai1Var, f36 f36Var) {
        this.A = 11;
        f36Var.getClass();
        this.L = ai1Var;
        this.B = f36Var;
    }

    public /* synthetic */ u63(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    public u63(sg0 sg0Var) {
        this.A = 28;
        this.B = sg0Var;
        lg0 lg0Var = sg0Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Object c = ((qc0) lg0Var).c(key);
        c.getClass();
        this.L = (Rect) c;
    }

    public u63(kf0 kf0Var, qf0 qf0Var) {
        this.A = 16;
        kf0Var.getClass();
        this.B = kf0Var;
        this.L = qf0Var;
    }

    public u63(n55 n55Var, t57 t57Var) {
        this.A = 15;
        n55Var.getClass();
        t57Var.getClass();
        this.B = n55Var;
        this.L = t57Var;
    }

    public u63(int i, eo2 eo2Var) {
        this.A = i;
        switch (i) {
            case SubAllocator.N4 /* 26 */:
                this.B = eo2Var;
                this.L = new ConcurrentHashMap();
                return;
            default:
                this.B = eo2Var;
                this.L = new cr0();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [jg0, java.lang.Object, android.hardware.camera2.CameraDevice$StateCallback] */
    public u63(int i) {
        this.A = i;
        yt1 yt1Var = yt1.A;
        switch (i) {
            case 10:
                return;
            case 17:
                this.B = new CameraCaptureSession();
                this.L = g04.u(yt1Var);
                return;
            case 18:
                ?? stateCallback = new CameraDevice.StateCallback();
                stateCallback.a = g04.u(yt1Var);
                this.B = stateCallback;
                this.L = new u63(17);
                return;
            case 19:
                this.B = du1.A;
                this.L = zt1.A;
                return;
            default:
                this.B = Choreographer.getInstance();
                this.L = Looper.myLooper();
                return;
        }
    }

    public u63(dd ddVar) {
        this.A = 4;
        this.L = ddVar;
        this.B = new cd(ddVar, 0);
    }
}
