package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
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
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import me.magnum.melondualds.R;
import org.json.JSONObject;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q03  reason: default package */
/* loaded from: classes.dex */
public class q03 implements ak1, wj7, ms5 {
    public static final int[] R = {16843067, 16843068};
    public static final q03 X;
    public final /* synthetic */ int A;
    public Object B;
    public Object L;

    static {
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf((float) RecyclerView.A1);
        X = new q03(2, new ui4(valueOf2, valueOf2), new ui4(valueOf, valueOf));
    }

    public q03(Context context) {
        this.A = 13;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(hk2.Q(context, R.attr.materialCalendarStyle, wu3.class.getCanonicalName()).data, ay4.m);
        y60.l(context, obtainStyledAttributes.getResourceId(4, 0));
        y60.l(context, obtainStyledAttributes.getResourceId(2, 0));
        y60.l(context, obtainStyledAttributes.getResourceId(3, 0));
        y60.l(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList C = nk2.C(context, obtainStyledAttributes, 7);
        this.B = y60.l(context, obtainStyledAttributes.getResourceId(9, 0));
        y60.l(context, obtainStyledAttributes.getResourceId(8, 0));
        this.L = y60.l(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(C.getDefaultColor());
        obtainStyledAttributes.recycle();
    }

    public static fa y(File file) {
        Object kc5Var;
        File file2 = new File(file, "meta.json");
        if (!file2.isFile()) {
            return new fa(null, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(q72.L(file2));
            String optString = jSONObject.optString("name");
            optString.getClass();
            if (zg6.B0(optString)) {
                optString = null;
            }
            String optString2 = jSONObject.optString("libraryName");
            optString2.getClass();
            if (zg6.B0(optString2)) {
                optString2 = null;
            }
            kc5Var = new fa(optString, optString2);
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        Object faVar = new fa(null, null);
        if (kc5Var instanceof kc5) {
            kc5Var = faVar;
        }
        return (fa) kc5Var;
    }

    public static File z(File file, fa faVar) {
        p72 p72Var = p72.TOP_DOWN;
        p72Var.getClass();
        List A0 = d06.A0(new w72(new o72(file, p72Var), true, new k4(9)));
        String str = faVar.b;
        if (str != null) {
            File canonicalFile = new File(file, str).getCanonicalFile();
            File canonicalFile2 = file.getCanonicalFile();
            String path = canonicalFile.getPath();
            path.getClass();
            String path2 = canonicalFile2.getPath();
            String str2 = File.separator;
            if (gh6.n0(path, path2 + str2, false)) {
                if (canonicalFile.isFile() && q72.I(canonicalFile).equalsIgnoreCase("so")) {
                    return canonicalFile;
                }
            } else {
                throw new ha(ga.InvalidZip);
            }
        }
        for (String str3 : l07.c0("libvulkan_freedreno.so", "vulkan.adreno.so")) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : A0) {
                if (gh6.g0(((File) obj).getName(), str3, true)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() == 1) {
                return (File) tq0.K0(arrayList);
            }
            if (arrayList.size() > 1) {
                throw new ha(ga.AmbiguousDriver);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : A0) {
            File file2 = (File) obj2;
            String name = file2.getName();
            name.getClass();
            if (!gh6.n0(name, "libvulkan", true)) {
                String name2 = file2.getName();
                name2.getClass();
                if (gh6.n0(name2, "vulkan.", true)) {
                    String name3 = file2.getName();
                    name3.getClass();
                    if (gh6.f0(name3, ".so", true)) {
                    }
                }
            }
            arrayList2.add(obj2);
        }
        int size = arrayList2.size();
        if (size != 0) {
            if (size == 1) {
                return (File) tq0.K0(arrayList2);
            }
            throw new ha(ga.AmbiguousDriver);
        }
        throw new ha(ga.NoDriver);
    }

    public void A(boolean z) {
        ep1 ep1Var = (ep1) ((k91) ((t71) this.L).B).B;
        if (ep1Var.L != z) {
            if (ep1Var.B != null) {
                mo1 a = mo1.a();
                dp1 dp1Var = ep1Var.B;
                a.getClass();
                nl2.C(dp1Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(dp1Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            ep1Var.L = z;
            if (z) {
                ep1.a(ep1Var.A, mo1.a().c());
            }
        }
    }

    public void B(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.L;
        cardView.R.set(i, i2, i3, i4);
        Rect rect = cardView.L;
        CardView.a(cardView, i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public Drawable C(Drawable drawable, boolean z) {
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
                drawableArr[i] = C(drawable2, z2);
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

    public void D() {
        synchronized (this) {
            ((AtomicInteger) this.B).decrementAndGet();
            if (((AtomicInteger) this.B).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    @Override // defpackage.wj7
    public float a() {
        switch (this.A) {
            case 5:
                Comparable upper = ((Range) this.L).getUpper();
                upper.getClass();
                return ((Number) upper).floatValue();
            default:
                ce0 ce0Var = ((je0) this.B).b;
                CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
                key.getClass();
                Float valueOf = Float.valueOf(1.0f);
                ia0 ia0Var = (ia0) ce0Var;
                ia0Var.getClass();
                Object c = ia0Var.c(key);
                if (c != null) {
                    valueOf = c;
                }
                Float f = valueOf;
                float floatValue = f.floatValue();
                if (Math.abs(floatValue) < Math.ulp(Math.abs(floatValue)) * 2.0d) {
                    if (!ve2.I()) {
                        return 1.0f;
                    }
                    Log.w("CXCP", "Invalid max zoom ratio of " + f + " detected, defaulting to 1.0f");
                    return 1.0f;
                }
                return f.floatValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc A[Catch: all -> 0x00bd, TRY_ENTER, TryCatch #6 {all -> 0x00bd, blocks: (B:60:0x00bc, B:63:0x00bf, B:64:0x00d7), top: B:70:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf A[Catch: all -> 0x00bd, TryCatch #6 {all -> 0x00bd, blocks: (B:60:0x00bc, B:63:0x00bf, B:64:0x00d7), top: B:70:0x00ba }] */
    @Override // defpackage.ms5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ls5 b(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q03.b(java.lang.String):ls5");
    }

    @Override // defpackage.ak1
    public Object c(r24 r24Var, aj2 aj2Var, nk6 nk6Var) {
        Object a = ((pc) this.L).a(r24Var, new rw1(this, aj2Var, (j11) null), nk6Var);
        if (a == p31.COROUTINE_SUSPENDED) {
            return a;
        }
        return o27.a;
    }

    @Override // defpackage.wj7
    public float d() {
        switch (this.A) {
            case 5:
                Comparable lower = ((Range) this.L).getLower();
                lower.getClass();
                return ((Number) lower).floatValue();
            default:
                return 1.0f;
        }
    }

    @Override // defpackage.wj7
    public ic1 e(n47 n47Var) {
        CaptureRequest.Key key;
        int i = this.A;
        n47Var.getClass();
        switch (i) {
            case 5:
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                key.getClass();
                ArrayList f0 = l07.f0(key);
                if (Build.VERSION.SDK_INT >= 34) {
                    CaptureRequest.Key h = uh.h();
                    h.getClass();
                    f0.add(h);
                }
                return n47Var.j(f0, m47.DEFAULT);
            default:
                return n47Var.j(l07.b0(CaptureRequest.SCALER_CROP_REGION), m47.DEFAULT);
        }
    }

    @Override // defpackage.wj7
    public ic1 f(n47 n47Var) {
        CaptureRequest.Key key;
        int i = this.A;
        n47Var.getClass();
        switch (i) {
            case 5:
                float d = d();
                if (1.0f <= a() && d <= 1.0f) {
                    key = CaptureRequest.CONTROL_ZOOM_RATIO;
                    LinkedHashMap m0 = zt3.m0(new ti4(key, Float.valueOf(1.0f)));
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        be0 be0Var = ce0.g;
                        ce0 ce0Var = ((je0) this.B).b;
                        be0Var.getClass();
                        ce0Var.getClass();
                        if (i2 >= 34) {
                            CameraCharacteristics.Key g = uh.g();
                            g.getClass();
                            int[] iArr = (int[]) ((ia0) ce0Var).c(g);
                            if (iArr != null && nu.Y(iArr, 1)) {
                                m0.put(uh.h(), 1);
                            }
                        }
                    }
                    return n47.d(n47Var, m0);
                }
                i.i("Failed requirement.");
                return null;
            default:
                Rect rect = (Rect) this.L;
                if (Math.abs(1.0f) < Math.ulp(Math.abs(1.0f)) * 2.0d && ve2.I()) {
                    Log.w("CXCP", "ZoomCompat: Invalid zoom ratio of 0.0f passed in, defaulting to 1.0f");
                }
                float width = rect.width() / 1.0f;
                float height = rect.height() / 1.0f;
                float width2 = (rect.width() - width) / 2.0f;
                float height2 = (rect.height() - height) / 2.0f;
                Map singletonMap = Collections.singletonMap(CaptureRequest.SCALER_CROP_REGION, new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height)));
                singletonMap.getClass();
                return n47.d(n47Var, singletonMap);
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

    public void h(Uri uri, File file) {
        BufferedInputStream bufferedInputStream;
        File canonicalFile = file.getCanonicalFile();
        InputStream openInputStream = ((Context) this.B).getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            try {
                if (openInputStream instanceof BufferedInputStream) {
                    bufferedInputStream = (BufferedInputStream) openInputStream;
                } else {
                    bufferedInputStream = new BufferedInputStream(openInputStream, 8192);
                }
                ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
                while (true) {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        zipInputStream.close();
                        openInputStream.close();
                        return;
                    }
                    File canonicalFile2 = new File(canonicalFile, nextEntry.getName()).getCanonicalFile();
                    String path = canonicalFile2.getPath();
                    path.getClass();
                    String path2 = canonicalFile.getPath();
                    String str = File.separator;
                    if (gh6.n0(path, path2 + str, false)) {
                        if (nextEntry.isDirectory()) {
                            canonicalFile2.mkdirs();
                        } else {
                            File parentFile = canonicalFile2.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(canonicalFile2);
                            pu.o(zipInputStream, fileOutputStream);
                            fileOutputStream.close();
                        }
                        zipInputStream.closeEntry();
                    } else {
                        throw new ha(ga.InvalidZip);
                    }
                }
            } finally {
            }
        } else {
            throw new ha(ga.InvalidZip);
        }
    }

    public m93 i(qo0 qo0Var) {
        Object putIfAbsent;
        switch (this.A) {
            case 21:
                Class cls = qo0Var.a;
                cls.getClass();
                Object l = uh.l((so0) this.L, cls);
                l.getClass();
                j24 j24Var = (j24) l;
                Object obj = j24Var.a.get();
                if (obj == null) {
                    synchronized (j24Var) {
                        obj = j24Var.a.get();
                        if (obj == null) {
                            obj = new h80((m93) ((mi2) this.B).n(qo0Var));
                            j24Var.a = new SoftReference(obj);
                        }
                    }
                }
                return ((h80) obj).a;
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.L;
                Class cls2 = qo0Var.a;
                cls2.getClass();
                Object obj2 = concurrentHashMap.get(cls2);
                if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(cls2, (obj2 = new h80((m93) ((mi2) this.B).n(qo0Var))))) != null) {
                    obj2 = putIfAbsent;
                }
                return ((h80) obj2).a;
        }
    }

    public Object j(qo0 qo0Var, ArrayList arrayList) {
        Object kc5Var;
        Object kc5Var2;
        Object putIfAbsent;
        int i = 0;
        switch (this.A) {
            case 22:
                Class cls = qo0Var.a;
                cls.getClass();
                Object l = uh.l((so0) this.L, cls);
                l.getClass();
                j24 j24Var = (j24) l;
                Object obj = j24Var.a.get();
                if (obj == null) {
                    synchronized (j24Var) {
                        obj = j24Var.a.get();
                        if (obj == null) {
                            obj = new oj4();
                            j24Var.a = new SoftReference(obj);
                        }
                    }
                }
                oj4 oj4Var = (oj4) obj;
                ArrayList arrayList2 = new ArrayList(uq0.y0(arrayList, 10));
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(new o93((n93) obj2));
                }
                ConcurrentHashMap concurrentHashMap = oj4Var.a;
                Object obj3 = concurrentHashMap.get(arrayList2);
                if (obj3 == null) {
                    try {
                        kc5Var = (m93) ((aj2) this.B).j(qo0Var, arrayList);
                    } catch (Throwable th) {
                        kc5Var = new kc5(th);
                    }
                    nc5 nc5Var = new nc5(kc5Var);
                    Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, nc5Var);
                    if (putIfAbsent2 == null) {
                        obj3 = nc5Var;
                    } else {
                        obj3 = putIfAbsent2;
                    }
                }
                return ((nc5) obj3).A;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.L;
                Class cls2 = qo0Var.a;
                cls2.getClass();
                Object obj4 = concurrentHashMap2.get(cls2);
                if (obj4 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(cls2, (obj4 = new oj4()))) != null) {
                    obj4 = putIfAbsent;
                }
                oj4 oj4Var2 = (oj4) obj4;
                ArrayList arrayList3 = new ArrayList(uq0.y0(arrayList, 10));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj5 = arrayList.get(i);
                    i++;
                    arrayList3.add(new o93((n93) obj5));
                }
                ConcurrentHashMap concurrentHashMap3 = oj4Var2.a;
                Object obj6 = concurrentHashMap3.get(arrayList3);
                if (obj6 == null) {
                    try {
                        kc5Var2 = (m93) ((aj2) this.B).j(qo0Var, arrayList);
                    } catch (Throwable th2) {
                        kc5Var2 = new kc5(th2);
                    }
                    nc5 nc5Var2 = new nc5(kc5Var2);
                    Object putIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, nc5Var2);
                    if (putIfAbsent3 == null) {
                        obj6 = nc5Var2;
                    } else {
                        obj6 = putIfAbsent3;
                    }
                }
                return ((nc5) obj6).A;
        }
    }

    @Override // defpackage.ms5
    public boolean k() {
        return ((ms5) this.B).k();
    }

    public InputMethodManager l() {
        return (InputMethodManager) ((gh3) this.L).getValue();
    }

    public KeyListener m(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((k91) ((t71) this.L).B).getClass();
            if (keyListener instanceof wo1) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new wo1(keyListener);
        }
        return keyListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
        if (r0 != null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd A[Catch: ha -> 0x00bc, Exception -> 0x012c, TryCatch #6 {ha -> 0x00bc, Exception -> 0x012c, blocks: (B:43:0x009a, B:45:0x00ae, B:47:0x00b2, B:55:0x00c4, B:57:0x00cd, B:61:0x00e0, B:60:0x00da, B:63:0x011c, B:64:0x0123, B:54:0x00c0, B:65:0x0124, B:66:0x012b), top: B:79:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c A[Catch: ha -> 0x00bc, Exception -> 0x012c, TryCatch #6 {ha -> 0x00bc, Exception -> 0x012c, blocks: (B:43:0x009a, B:45:0x00ae, B:47:0x00b2, B:55:0x00c4, B:57:0x00cd, B:61:0x00e0, B:60:0x00da, B:63:0x011c, B:64:0x0123, B:54:0x00c0, B:65:0x0124, B:66:0x012b), top: B:79:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ia n(android.net.Uri r11) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q03.n(android.net.Uri):ia");
    }

    public void o(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.A) {
            case 1:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.B;
                n85 q = n85.q(absSeekBar.getContext(), attributeSet, R, i);
                Drawable g = q.g(0);
                if (g != null) {
                    if (g instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) g;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable C = C(animationDrawable.getFrame(i2), true);
                            C.setLevel(10000);
                            animationDrawable2.addFrame(C, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        g = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(g);
                }
                Drawable g2 = q.g(1);
                if (g2 != null) {
                    absSeekBar.setProgressDrawable(C(g2, false));
                }
                q.t();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.B).getContext().obtainStyledAttributes(attributeSet, by4.i, i, 0);
                try {
                    if (obtainStyledAttributes.hasValue(14)) {
                        z = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    A(z);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public AutofillId p(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession g = zc.g(this.L);
            s2 u = me2.u((View) this.B);
            Objects.requireNonNull(u);
            return fp.h(g, rx.b(u.b), j);
        }
        return null;
    }

    public void q(String str) {
        str.getClass();
        for (CameraCaptureSession.StateCallback stateCallback : (List) ((fw) this.L).a) {
            stateCallback.onClosed((o85) this.B);
        }
    }

    public void r(String str) {
        str.getClass();
        for (CameraCaptureSession.StateCallback stateCallback : (List) ((fw) this.L).a) {
            stateCallback.onConfigureFailed((o85) this.B);
        }
    }

    public void s(String str) {
        str.getClass();
        for (CameraCaptureSession.StateCallback stateCallback : (List) ((fw) this.L).a) {
            stateCallback.onConfigured((o85) this.B);
        }
    }

    public to1 t(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        t71 t71Var = (t71) this.L;
        if (inputConnection == null) {
            t71Var.getClass();
            inputConnection2 = null;
        } else {
            k91 k91Var = (k91) t71Var.B;
            k91Var.getClass();
            if (!(inputConnection instanceof to1)) {
                inputConnection = new to1(editorInfo, inputConnection, (EditText) k91Var.A);
            }
            inputConnection2 = inputConnection;
        }
        return (to1) inputConnection2;
    }

    public void u(j8 j8Var) {
        q9 q9Var = (q9) this.B;
        ((ActionMode.Callback) q9Var.B).onDestroyActionMode(q9Var.B(j8Var));
        tq tqVar = (tq) this.L;
        if (tqVar.q0 != null) {
            tqVar.g0.getDecorView().removeCallbacks(tqVar.r0);
        }
        if (tqVar.p0 != null) {
            hb7 hb7Var = tqVar.s0;
            if (hb7Var != null) {
                hb7Var.b();
            }
            hb7 b = aa7.b(tqVar.p0);
            b.a(RecyclerView.A1);
            tqVar.s0 = b;
            b.d(new kq(2, this));
        }
        tqVar.o0 = null;
        ViewGroup viewGroup = tqVar.u0;
        WeakHashMap weakHashMap = aa7.a;
        viewGroup.requestApplyInsets();
        tqVar.I();
    }

    public boolean v(j8 j8Var, Menu menu) {
        ViewGroup viewGroup = ((tq) this.L).u0;
        WeakHashMap weakHashMap = aa7.a;
        viewGroup.requestApplyInsets();
        q9 q9Var = (q9) this.B;
        ActionMode.Callback callback = (ActionMode.Callback) q9Var.B;
        ni6 B = q9Var.B(j8Var);
        m66 m66Var = (m66) q9Var.X;
        Menu menu2 = (Menu) m66Var.get(menu);
        if (menu2 == null) {
            menu2 = new px3((Context) q9Var.L, (uw3) menu);
            m66Var.put(menu, menu2);
        }
        return callback.onPrepareActionMode(B, menu2);
    }

    public void w(be2 be2Var) {
        l22 l22Var = (l22) this.L;
        dz4 dz4Var = (dz4) this.B;
        int i = be2Var.b;
        if (i == 0) {
            l22Var.execute(new qj2(5, dz4Var, be2Var.a));
        } else {
            l22Var.execute(new m90(i, 0, dz4Var));
        }
    }

    public void x(String str, CameraDevice.StateCallback stateCallback) {
        ct6 ct6Var = (ct6) this.L;
        CameraManager cameraManager = (CameraManager) ((fw4) this.B).get();
        try {
            Trace.beginSection(((Object) od0.b(str)) + "#openCamera");
            if (Build.VERSION.SDK_INT >= 28) {
                cameraManager.getClass();
                Executor executor = (Executor) ct6Var.j.getValue();
                executor.getClass();
                cameraManager.openCamera(str, executor, stateCallback);
            } else {
                cameraManager.openCamera(str, stateCallback, ct6Var.a());
            }
        } finally {
            Trace.endSection();
        }
    }

    public /* synthetic */ q03(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    public /* synthetic */ q03(int i, Object obj, Object obj2, boolean z) {
        this.A = i;
        this.L = obj;
        this.B = obj2;
    }

    public q03(i4 i4Var) {
        this.A = 23;
        this.B = new AtomicInteger(0);
        this.L = new AtomicBoolean(false);
    }

    public q03(int i, mi2 mi2Var) {
        this.A = i;
        switch (i) {
            case 25:
                this.B = mi2Var;
                this.L = new ConcurrentHashMap();
                return;
            default:
                this.B = mi2Var;
                this.L = new so0();
                return;
        }
    }

    public q03(AbsSeekBar absSeekBar) {
        this.A = 1;
        this.B = absSeekBar;
    }

    public q03(EditText editText) {
        this.A = 9;
        this.B = editText;
        this.L = new t71(editText);
    }

    public q03(View view) {
        this.A = 0;
        this.B = view;
        this.L = yf2.H(wk3.NONE, new bz2(1, this));
    }

    public q03(wd1 wd1Var, ms5 ms5Var) {
        this.A = 11;
        ms5Var.getClass();
        this.L = wd1Var;
        this.B = ms5Var;
    }

    public /* synthetic */ q03(int i, Object obj) {
        this.A = i;
        this.L = obj;
    }

    public q03(je0 je0Var) {
        this.A = 28;
        this.B = je0Var;
        ce0 ce0Var = je0Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Object c = ((ia0) ce0Var).c(key);
        c.getClass();
        this.L = (Rect) c;
    }

    public q03(bd0 bd0Var, hd0 hd0Var) {
        this.A = 16;
        bd0Var.getClass();
        this.B = bd0Var;
        this.L = hd0Var;
    }

    public q03(fw4 fw4Var, ct6 ct6Var) {
        this.A = 15;
        fw4Var.getClass();
        ct6Var.getClass();
        this.B = fw4Var;
        this.L = ct6Var;
    }

    public q03(int i, aj2 aj2Var) {
        this.A = i;
        switch (i) {
            case 26:
                this.B = aj2Var;
                this.L = new ConcurrentHashMap();
                return;
            default:
                this.B = aj2Var;
                this.L = new so0();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, android.hardware.camera2.CameraDevice$StateCallback, ae0] */
    public q03(int i) {
        this.A = i;
        pp1 pp1Var = pp1.A;
        switch (i) {
            case 10:
                return;
            case 17:
                this.B = new CameraCaptureSession();
                this.L = w81.g(pp1Var);
                return;
            case 18:
                ?? stateCallback = new CameraDevice.StateCallback();
                stateCallback.a = w81.g(pp1Var);
                this.B = stateCallback;
                this.L = new q03(17);
                return;
            case 19:
                this.B = up1.A;
                this.L = qp1.A;
                return;
            default:
                this.B = Choreographer.getInstance();
                this.L = Looper.myLooper();
                return;
        }
    }

    public q03(pc pcVar) {
        this.A = 4;
        this.L = pcVar;
        this.B = new oc(0, pcVar);
    }
}
