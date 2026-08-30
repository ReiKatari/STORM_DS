package w;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Message;
import android.util.Size;
import android.view.Surface;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import d0.p1;
import j0.o1;
import j0.r1;
import j0.s1;
import j0.w1;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.MelonDSAndroidInterface;
import me.magnum.melonds.R;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.render.GlContext;
import q.b3;
import q.k2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14088a;

    /* renamed from: b  reason: collision with root package name */
    public Object f14089b;

    /* renamed from: c  reason: collision with root package name */
    public Object f14090c;

    /* renamed from: d  reason: collision with root package name */
    public Object f14091d;

    /* renamed from: e  reason: collision with root package name */
    public Object f14092e;

    /* renamed from: f  reason: collision with root package name */
    public Object f14093f;

    /* renamed from: g  reason: collision with root package name */
    public Object f14094g;

    /* JADX WARN: Type inference failed for: r1v0, types: [we.a, java.lang.Object] */
    public x0(int i2) {
        this.f14088a = i2;
        switch (i2) {
            case 4:
                ih.g gVar = new ih.g(this);
                this.f14090c = gVar;
                ?? obj = new Object();
                obj.f14212a = false;
                obj.f14213b = 0;
                this.f14091d = obj;
                this.f14092e = new Object();
                this.f14093f = new ArrayList();
                this.f14094g = new ArrayList();
                this.f14089b = new GlContext(Long.valueOf(MelonDSAndroidInterface.f9464a.getEmulatorGlContext()));
                gVar.start();
                return;
            case l1.c.f8511g /* 5 */:
            case 7:
            default:
                this.f14089b = new AtomicBoolean(false);
                this.f14090c = new CountDownLatch(1);
                this.f14094g = "PublicSuffixDatabase.list";
                return;
            case l1.c.f8509e /* 6 */:
                return;
            case 8:
                this.f14089b = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.f14090c = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f14091d = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.f14092e = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.f14093f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f14094g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                return;
        }
    }

    public static boolean a(int[] iArr, int i2) {
        for (int i10 : iArr) {
            if (i10 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i2) {
        int c4 = b3.c(context, R.attr.colorControlHighlight);
        int b10 = b3.b(context, R.attr.colorButtonNormal);
        int[] iArr = b3.f11856b;
        int[] iArr2 = b3.f11858d;
        int b11 = q5.a.b(c4, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, b3.f11857c, b3.f11860f}, new int[]{b10, b11, q5.a.b(c4, i2), i2});
    }

    public static LayerDrawable h(k2 k2Var, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable c4 = k2Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable c10 = k2Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c4 instanceof BitmapDrawable) && c4.getIntrinsicWidth() == dimensionPixelSize && c4.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c4;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c4.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c10 instanceof BitmapDrawable) && c10.getIntrinsicWidth() == dimensionPixelSize && c10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c10;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c10.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static void l(h5.c0 c0Var) {
        i5.w sharedValues = ConstraintLayout.getSharedValues();
        int i2 = c0Var.f6117u;
        x8.e eVar = new x8.e(19);
        HashMap hashMap = sharedValues.f7015a;
        HashSet hashSet = (HashSet) hashMap.get(Integer.valueOf(i2));
        if (hashSet == null) {
            hashSet = new HashSet();
            hashMap.put(Integer.valueOf(i2), hashSet);
        }
        hashSet.add(new WeakReference(eVar));
    }

    public static void s(Drawable drawable, int i2, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = q.r.f12001b;
        }
        mutate.setColorFilter(q.r.c(i2, mode));
    }

    public pi.g b() {
        pi.g gVar = (pi.g) this.f14094g;
        if (gVar == null) {
            pi.g gVar2 = pi.g.f11711n;
            pi.g B = p7.j.B((pi.q) this.f14091d);
            this.f14094g = B;
            return B;
        }
        return gVar;
    }

    public gk.g c(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f14093f;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            gk.g a10 = ((gk.f) list.get(i2)).a(type, annotationArr);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((gk.f) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public w1 e() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.f14092e;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        r1 d4 = r1.d((w0) this.f14091d, size);
        d4.f7282b.A = 1;
        p1 p1Var = new p1(surface);
        this.f14089b = p1Var;
        ta.a d10 = m0.i.d(p1Var.f7299e);
        p1.a0 a0Var = new p1.a0(21, surface, surfaceTexture);
        d10.a(new m0.h(0, d10, a0Var), ij.a.D());
        d4.b((p1) this.f14089b, d0.a0.f3320d, -1);
        s1 s1Var = (s1) this.f14094g;
        if (s1Var != null) {
            s1Var.b();
        }
        s1 s1Var2 = new s1(new d0.p0(3, this));
        this.f14094g = s1Var2;
        d4.f7286f = s1Var2;
        return d4.c();
    }

    public void f(g1 g1Var) {
        ArrayList i2 = i();
        int size = i2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = i2.get(i10);
            i10++;
            g1 g1Var2 = (g1) obj;
            if (g1Var2 != g1Var) {
                synchronized (g1Var2.f13926a) {
                    try {
                        List<j0.u0> list = g1Var2.f13936k;
                        if (list != null) {
                            for (j0.u0 u0Var : list) {
                                u0Var.b();
                            }
                            g1Var2.f13936k = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                g1Var2.f13945u.u();
            } else {
                return;
            }
        }
    }

    public ArrayList g() {
        ArrayList arrayList;
        synchronized (this.f14090c) {
            arrayList = new ArrayList((LinkedHashSet) this.f14091d);
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.f14090c) {
            arrayList = new ArrayList();
            arrayList.addAll(g());
            synchronized (this.f14090c) {
                arrayList2 = new ArrayList((LinkedHashSet) this.f14093f);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public ColorStateList j(Context context, int i2) {
        if (i2 == R.drawable.abc_edit_text_material) {
            return aj.g.z(context, R.color.abc_tint_edittext);
        }
        if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
            return aj.g.z(context, R.color.abc_tint_switch_track);
        }
        if (i2 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d4 = b3.d(context, R.attr.colorSwitchThumbNormal);
            if (d4 != null && d4.isStateful()) {
                int[] iArr3 = b3.f11856b;
                iArr[0] = iArr3;
                iArr2[0] = d4.getColorForState(iArr3, 0);
                iArr[1] = b3.f11859e;
                iArr2[1] = b3.c(context, R.attr.colorControlActivated);
                iArr[2] = b3.f11860f;
                iArr2[2] = d4.getDefaultColor();
            } else {
                iArr[0] = b3.f11856b;
                iArr2[0] = b3.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = b3.f11859e;
                iArr2[1] = b3.c(context, R.attr.colorControlActivated);
                iArr[2] = b3.f11860f;
                iArr2[2] = b3.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
            return d(context, b3.c(context, R.attr.colorButtonNormal));
        } else {
            if (i2 == R.drawable.abc_btn_borderless_material) {
                return d(context, 0);
            }
            if (i2 == R.drawable.abc_btn_colored_material) {
                return d(context, b3.c(context, R.attr.colorAccent));
            }
            if (i2 != R.drawable.abc_spinner_mtrl_am_alpha && i2 != R.drawable.abc_spinner_textfield_background_material) {
                if (a((int[]) this.f14090c, i2)) {
                    return b3.d(context, R.attr.colorControlNormal);
                }
                if (a((int[]) this.f14093f, i2)) {
                    return aj.g.z(context, R.color.abc_tint_default);
                }
                if (a((int[]) this.f14094g, i2)) {
                    return aj.g.z(context, R.color.abc_tint_btn_checkable);
                }
                if (i2 == R.drawable.abc_seekbar_thumb_material) {
                    return aj.g.z(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            return aj.g.z(context, R.color.abc_tint_spinner);
        }
    }

    public fj.r k() {
        zi.e eVar;
        Context context;
        AssetManager assetManager;
        zi.f fVar = zi.f.f15151a;
        zi.f fVar2 = zi.f.f15151a;
        if (fVar2 != null) {
            eVar = (zi.e) fVar2;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            context = eVar.b();
        } else {
            context = null;
        }
        if (context != null) {
            assetManager = context.getAssets();
        } else {
            assetManager = null;
        }
        if (assetManager == null) {
            if (Build.FINGERPRINT == null) {
                fj.j.h("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
                return null;
            }
            fj.j.h("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
            return null;
        }
        InputStream open = assetManager.open((String) this.f14094g);
        open.getClass();
        return ij.a.w0(open);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a7.v, java.lang.Object] */
    public a7.v m() {
        ?? obj = new Object();
        obj.A = (pi.r) this.f14089b;
        obj.B = (String) this.f14090c;
        obj.R = (pi.b0) this.f14092e;
        obj.X = (p7.o) this.f14093f;
        obj.L = ((pi.q) this.f14091d).c();
        return obj;
    }

    public void n() {
        try {
            fj.a0 a0Var = new fj.a0(k());
            fj.h o5 = a0Var.o(a0Var.readInt());
            fj.h o8 = a0Var.o(a0Var.readInt());
            a0Var.close();
            synchronized (this) {
                o5.getClass();
                this.f14091d = o5;
                o8.getClass();
                this.f14092e = o8;
            }
        } finally {
            ((CountDownLatch) this.f14090c).countDown();
        }
    }

    public void o(EmulatorSurfaceView emulatorSurfaceView) {
        emulatorSurfaceView.getClass();
        synchronized (this.f14092e) {
            ((ArrayList) this.f14093f).remove(emulatorSurfaceView);
            ((ArrayList) this.f14094g).add(emulatorSurfaceView);
            ih.g gVar = (ih.g) this.f14090c;
            androidx.preference.v vVar = gVar.A;
            if (vVar != null) {
                vVar.removeMessages(2);
            }
            androidx.preference.v vVar2 = gVar.A;
            if (vVar2 != null) {
                vVar2.sendEmptyMessage(2);
            }
        }
    }

    public void p(Long l10) {
        Message obtainMessage;
        long j2;
        ih.g gVar = (ih.g) this.f14090c;
        androidx.preference.v vVar = gVar.A;
        if (vVar != null) {
            vVar.removeMessages(1);
        }
        androidx.preference.v vVar2 = gVar.A;
        if (vVar2 != null && (obtainMessage = vVar2.obtainMessage(1)) != null) {
            if (l10 != null) {
                j2 = l10.longValue();
            } else {
                j2 = 0;
            }
            obtainMessage.setData(zb.k.b(new yb.j("frame-deadline", Long.valueOf(j2))));
            androidx.preference.v vVar3 = gVar.A;
            if (vVar3 != null) {
                vVar3.sendMessage(obtainMessage);
            }
        }
    }

    public gk.n q(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.f14092e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            gk.n a10 = ((gk.m) list.get(i2)).a(type, annotationArr, annotationArr2, this);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((gk.m) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public gk.n r(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f14092e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            gk.n b10 = ((gk.m) list.get(i2)).b(type, annotationArr, this);
            if (b10 != null) {
                return b10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((gk.m) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public void t(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.f14092e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((gk.m) list.get(i2)).getClass();
        }
    }

    public String toString() {
        switch (this.f14088a) {
            case 7:
                p7.o oVar = (p7.o) this.f14093f;
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Request{method=");
                sb2.append((String) this.f14090c);
                sb2.append(", url=");
                sb2.append((pi.r) this.f14089b);
                pi.q qVar = (pi.q) this.f14091d;
                if (qVar.size() != 0) {
                    sb2.append(", headers=[");
                    int i2 = 0;
                    for (Object obj : qVar) {
                        int i10 = i2 + 1;
                        if (i2 >= 0) {
                            yb.j jVar = (yb.j) obj;
                            String str = (String) jVar.A;
                            String str2 = (String) jVar.B;
                            if (i2 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(str);
                            sb2.append(':');
                            if (qi.e.l(str)) {
                                str2 = "██";
                            }
                            sb2.append(str2);
                            i2 = i10;
                        } else {
                            p7.t.F();
                            throw null;
                        }
                    }
                    sb2.append(']');
                }
                if (!nc.k.a(oVar, qi.a.f12543c)) {
                    sb2.append(", tags=");
                    sb2.append(oVar);
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ x0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2) {
        this.f14088a = i2;
        this.f14089b = obj;
        this.f14090c = obj2;
        this.f14091d = obj3;
        this.f14092e = obj4;
        this.f14093f = obj5;
        this.f14094g = obj6;
    }

    public x0(a7.v vVar) {
        this.f14088a = 7;
        vVar.getClass();
        pi.r rVar = (pi.r) vVar.A;
        if (rVar != null) {
            this.f14089b = rVar;
            this.f14090c = (String) vVar.B;
            this.f14091d = ((o1) vVar.L).f();
            this.f14092e = (pi.b0) vVar.R;
            this.f14093f = (p7.o) vVar.X;
            return;
        }
        a0.j.p("url == null");
        throw null;
    }

    public x0(MotionLayout motionLayout) {
        this.f14088a = 3;
        this.f14090c = new ArrayList();
        this.f14092e = "ViewTransitionController";
        this.f14094g = new ArrayList();
        this.f14089b = motionLayout;
    }

    public x0(l0.h hVar) {
        this.f14088a = 9;
        this.f14090c = new Object();
        this.f14091d = new LinkedHashSet();
        this.f14092e = new LinkedHashSet();
        this.f14093f = new LinkedHashSet();
        this.f14094g = new i0(this);
        this.f14089b = hVar;
    }

    public x0(x.j jVar, q0 q0Var, l lVar) {
        Size size;
        this.f14088a = 0;
        a0.n nVar = new a0.n();
        Size size2 = null;
        this.f14094g = null;
        this.f14091d = new w0();
        this.f14093f = lVar;
        Size[] l10 = jVar.c().l(34);
        if (l10 == null) {
            aj.g.s("MeteringRepeating", "Can not get output size list.");
            size = new Size(0, 0);
        } else {
            if (nVar.f14a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                ArrayList arrayList = new ArrayList();
                for (Size size3 : l10) {
                    if (a0.n.f13c.compare(size3, a0.n.f12b) >= 0) {
                        arrayList.add(size3);
                    }
                }
                l10 = (Size[]) arrayList.toArray(new Size[0]);
            }
            List asList = Arrays.asList(l10);
            Collections.sort(asList, new a4.e0(11));
            Size e6 = q0Var.e();
            long min = Math.min(e6.getWidth() * e6.getHeight(), 307200L);
            int length = l10.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Size size4 = l10[i2];
                int i10 = ((size4.getWidth() * size4.getHeight()) > min ? 1 : ((size4.getWidth() * size4.getHeight()) == min ? 0 : -1));
                if (i10 == 0) {
                    size = size4;
                    break;
                } else if (i10 <= 0) {
                    i2++;
                    size2 = size4;
                } else if (size2 != null) {
                    size = size2;
                }
            }
            size = (Size) asList.get(0);
        }
        this.f14092e = size;
        aj.g.o("MeteringRepeating", "MeteringSession SurfaceTexture size: " + size);
        this.f14090c = e();
    }

    public x0(pi.x xVar, pi.r rVar, List list, List list2, Executor executor) {
        this.f14088a = 2;
        this.f14089b = new ConcurrentHashMap();
        this.f14090c = xVar;
        this.f14091d = rVar;
        this.f14092e = list;
        this.f14093f = list2;
        this.f14094g = executor;
    }
}
