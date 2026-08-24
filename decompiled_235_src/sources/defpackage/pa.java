package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.StatFs;
import android.util.Log;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.stormds.emulator.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pa  reason: default package */
/* loaded from: classes.dex */
public final class pa implements mr6 {
    public final /* synthetic */ int A;
    public Object B;
    public Object L;
    public Object R;
    public Object X;
    public Object Y;
    public Object Z;

    public pa(int i) {
        this.A = i;
        switch (i) {
            case 3:
                this.B = new AtomicBoolean(false);
                this.L = new CountDownLatch(1);
                this.Z = "PublicSuffixDatabase.list";
                return;
            default:
                this.B = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.L = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.R = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.X = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.Y = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.Z = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                return;
        }
    }

    public static final void a(pa paVar, Throwable th) {
        pu puVar = (pu) paVar.Z;
        v80 v80Var = (v80) paVar.Y;
        if (v80Var.k(th, false)) {
            for (Object m = v80Var.m(); !(m instanceof fm0); m = v80Var.m()) {
                gm0.b(m);
                puVar.addLast(m);
            }
            if (!puVar.isEmpty()) {
                ((qn2) paVar.L).g(new ArrayList(puVar));
                puVar.clear();
            }
        }
    }

    public static boolean e(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList j(Context context, int i) {
        int c = h57.c(context, R.attr.colorControlHighlight);
        int b = h57.b(context, R.attr.colorButtonNormal);
        int[] iArr = h57.b;
        int[] iArr2 = h57.d;
        int b2 = tt0.b(c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, h57.c, h57.f}, new int[]{b, b2, tt0.b(c, i), i});
    }

    public static LayerDrawable k(ol5 ol5Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c = ol5Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable c2 = ol5Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c instanceof BitmapDrawable) && c.getIntrinsicWidth() == dimensionPixelSize && c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c2 instanceof BitmapDrawable) && c2.getIntrinsicWidth() == dimensionPixelSize && c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static void n(yp7 yp7Var) {
        bh6 sharedValues = ConstraintLayout.getSharedValues();
        int i = yp7Var.u;
        Object obj = new Object();
        HashMap hashMap = sharedValues.a;
        HashSet hashSet = (HashSet) hashMap.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
            hashMap.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(obj));
    }

    public static void u(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = ir.b;
        }
        mutate.setColorFilter(ir.c(i, mode));
    }

    public void b(String str, String str2) {
        HashMap hashMap = (HashMap) this.Z;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            i.m("Property \"autoMetadata\" has not been set");
        }
    }

    @Override // defpackage.mr6
    public synchronized void c(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() == ((ra) this.Z).e()) {
            if (byteBuffer.get() == ((ra) this.Z).e()) {
                this.Y = new byte[7];
                byte[] bArr2 = new byte[((ra) this.Z).a];
                byteBuffer.get(bArr2);
                byteBuffer.get((byte[]) this.Y);
                ra raVar = (ra) this.Z;
                byte[] v = gi2.v(raVar.f, raVar.g, bArr2, bArr, raVar.a + 32);
                this.B = new SecretKeySpec(v, 0, ((ra) this.Z).a, "AES");
                ra raVar2 = (ra) this.Z;
                this.L = new SecretKeySpec(v, raVar2.a, 32, raVar2.b);
                this.R = (Cipher) p42.e.a("AES/CTR/NoPadding");
                this.X = (Mac) p42.f.a(((ra) this.Z).b);
            } else {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
        } else {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
    }

    @Override // defpackage.mr6
    public synchronized void d(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        int position = byteBuffer.position();
        byte[] i2 = ra.i((ra) this.Z, (byte[]) this.Y, i, z);
        int remaining = byteBuffer.remaining();
        int i3 = ((ra) this.Z).c;
        if (remaining >= i3) {
            int i4 = (remaining - i3) + position;
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.limit(i4);
            ByteBuffer duplicate2 = byteBuffer.duplicate();
            duplicate2.position(i4);
            ((Mac) this.X).init((SecretKeySpec) this.L);
            ((Mac) this.X).update(i2);
            ((Mac) this.X).update(duplicate);
            byte[] copyOf = Arrays.copyOf(((Mac) this.X).doFinal(), ((ra) this.Z).c);
            int i5 = ((ra) this.Z).c;
            byte[] bArr = new byte[i5];
            duplicate2.get(bArr);
            if (i5 == copyOf.length) {
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    i6 |= bArr[i7] ^ copyOf[i7];
                }
                if (i6 == 0) {
                    byteBuffer.limit(i4);
                    ((Cipher) this.R).init(1, (SecretKeySpec) this.B, new IvParameterSpec(i2));
                    ((Cipher) this.R).doFinal(byteBuffer, byteBuffer2);
                }
            }
            throw new GeneralSecurityException("Tag mismatch");
        }
        throw new GeneralSecurityException("Ciphertext too short");
    }

    public hy f() {
        String str;
        if (((String) this.B) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((w32) this.R) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.X) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.Y) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.Z) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new hy((String) this.B, (Integer) this.L, (w32) this.R, ((Long) this.X).longValue(), ((Long) this.Y).longValue(), (HashMap) this.Z);
        }
        i.m("Missing required properties:".concat(str));
        return null;
    }

    public pe5 g() {
        Context context = (Context) this.B;
        we1 we1Var = (we1) this.L;
        ex6 ex6Var = (ex6) this.R;
        if (ex6Var == null) {
            ex6Var = new ex6(new on2(this) { // from class: l23
                public final /* synthetic */ pa B;

                {
                    this.B = this;
                }

                @Override // defpackage.on2
                public final Object c() {
                    me5 me5Var;
                    long j;
                    int i = r2;
                    pa paVar = this.B;
                    switch (i) {
                        case 0:
                            return new b44((Context) paVar.B).a();
                        default:
                            vs0 vs0Var = vs0.u0;
                            Context context2 = (Context) paVar.B;
                            synchronized (vs0Var) {
                                try {
                                    me5Var = vs0.v0;
                                    if (me5Var == null) {
                                        xf3 xf3Var = db2.A;
                                        xe1 xe1Var = xk1.a;
                                        de1 de1Var = de1.L;
                                        Bitmap.Config[] configArr = k.a;
                                        File cacheDir = context2.getCacheDir();
                                        if (cacheDir != null) {
                                            cacheDir.mkdirs();
                                            File C0 = jc2.C0(cacheDir);
                                            String str = lt4.B;
                                            lt4 q = w31.q(C0);
                                            if (0.02d > 0.0d) {
                                                j = 10485760;
                                                try {
                                                    File file = q.toFile();
                                                    file.mkdir();
                                                    StatFs statFs = new StatFs(file.getAbsolutePath());
                                                    j = gi2.s((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                                } catch (Exception unused) {
                                                }
                                            } else {
                                                j = 0;
                                            }
                                            me5 me5Var2 = new me5(j, de1Var, xf3Var, q);
                                            vs0.v0 = me5Var2;
                                            me5Var = me5Var2;
                                        } else {
                                            throw new IllegalStateException("cacheDir == null");
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return me5Var;
                    }
                }
            });
        }
        ex6 ex6Var2 = (ex6) this.X;
        if (ex6Var2 == null) {
            ex6Var2 = new ex6(new on2(this) { // from class: l23
                public final /* synthetic */ pa B;

                {
                    this.B = this;
                }

                @Override // defpackage.on2
                public final Object c() {
                    me5 me5Var;
                    long j;
                    int i = r2;
                    pa paVar = this.B;
                    switch (i) {
                        case 0:
                            return new b44((Context) paVar.B).a();
                        default:
                            vs0 vs0Var = vs0.u0;
                            Context context2 = (Context) paVar.B;
                            synchronized (vs0Var) {
                                try {
                                    me5Var = vs0.v0;
                                    if (me5Var == null) {
                                        xf3 xf3Var = db2.A;
                                        xe1 xe1Var = xk1.a;
                                        de1 de1Var = de1.L;
                                        Bitmap.Config[] configArr = k.a;
                                        File cacheDir = context2.getCacheDir();
                                        if (cacheDir != null) {
                                            cacheDir.mkdirs();
                                            File C0 = jc2.C0(cacheDir);
                                            String str = lt4.B;
                                            lt4 q = w31.q(C0);
                                            if (0.02d > 0.0d) {
                                                j = 10485760;
                                                try {
                                                    File file = q.toFile();
                                                    file.mkdir();
                                                    StatFs statFs = new StatFs(file.getAbsolutePath());
                                                    j = gi2.s((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                                } catch (Exception unused) {
                                                }
                                            } else {
                                                j = 0;
                                            }
                                            me5 me5Var2 = new me5(j, de1Var, xf3Var, q);
                                            vs0.v0 = me5Var2;
                                            me5Var = me5Var2;
                                        } else {
                                            throw new IllegalStateException("cacheDir == null");
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return me5Var;
                    }
                }
            });
        }
        ex6 ex6Var3 = new ex6(new ns1(13));
        uv0 uv0Var = (uv0) this.Y;
        if (uv0Var == null) {
            yt1 yt1Var = yt1.A;
            uv0Var = new uv0(yt1Var, yt1Var, yt1Var, yt1Var, yt1Var);
        }
        return new pe5(context, we1Var, ex6Var, ex6Var2, ex6Var3, uv0Var, (m23) this.Z);
    }

    public ma0 h() {
        ma0 ma0Var = (ma0) this.Z;
        if (ma0Var == null) {
            ma0 ma0Var2 = ma0.n;
            ma0 C = u24.C((yw2) this.R);
            this.Z = C;
            return C;
        }
        return ma0Var;
    }

    public ib0 i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.Y;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            ib0 a = ((hb0) list.get(i)).a(type, annotationArr);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((hb0) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public ColorStateList l(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return ge7.A(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return ge7.A(context, R.color.abc_tint_switch_track);
        }
        if (i == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d = h57.d(context, R.attr.colorSwitchThumbNormal);
            if (d != null && d.isStateful()) {
                int[] iArr3 = h57.b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = h57.e;
                iArr2[1] = h57.c(context, R.attr.colorControlActivated);
                iArr[2] = h57.f;
                iArr2[2] = d.getDefaultColor();
            } else {
                iArr[0] = h57.b;
                iArr2[0] = h57.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = h57.e;
                iArr2[1] = h57.c(context, R.attr.colorControlActivated);
                iArr[2] = h57.f;
                iArr2[2] = h57.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
            return j(context, h57.c(context, R.attr.colorButtonNormal));
        } else {
            if (i == R.drawable.abc_btn_borderless_material) {
                return j(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return j(context, h57.c(context, R.attr.colorAccent));
            }
            if (i != R.drawable.abc_spinner_mtrl_am_alpha && i != R.drawable.abc_spinner_textfield_background_material) {
                if (e((int[]) this.L, i)) {
                    return h57.d(context, R.attr.colorControlNormal);
                }
                if (e((int[]) this.Y, i)) {
                    return ge7.A(context, R.color.abc_tint_default);
                }
                if (e((int[]) this.Z, i)) {
                    return ge7.A(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return ge7.A(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            return ge7.A(context, R.color.abc_tint_spinner);
        }
    }

    public a83 m() {
        g41 g41Var;
        Context context;
        AssetManager assetManager;
        kx4 kx4Var = kx4.a;
        kx4 kx4Var2 = kx4.a;
        if (kx4Var2 != null) {
            g41Var = (g41) kx4Var2;
        } else {
            g41Var = null;
        }
        if (g41Var != null) {
            context = g41Var.b();
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
                e41.i("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
                return null;
            }
            e41.i("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
            return null;
        }
        InputStream open = assetManager.open((String) this.Z);
        open.getClass();
        return hi2.P(open);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [s9, java.lang.Object] */
    public s9 o() {
        ?? obj = new Object();
        obj.a = (i03) this.B;
        obj.b = (String) this.L;
        obj.d = (mk5) this.X;
        obj.e = (qo2) this.Y;
        obj.c = ((yw2) this.R).c();
        return obj;
    }

    public s63 p() {
        byte[] W;
        try {
            os0 os0Var = (os0) this.X;
            if (os0Var != null) {
                try {
                    ii3 ii3Var = (ii3) s63.A((s35) this.B, os0Var).B;
                    mr2 mr2Var = (mr2) ii3Var.f(or2.NEW_BUILDER);
                    mr2Var.d(ii3Var);
                    return new s63((fi3) mr2Var, 6);
                } catch (GeneralSecurityException | ub3 e) {
                    Log.w("vs0", "cannot decrypt keyset: ", e);
                }
            }
            ii3 t = ii3.t(((s35) this.B).A(), g82.a());
            if (t.p() > 0) {
                mr2 mr2Var2 = (mr2) t.f(or2.NEW_BUILDER);
                mr2Var2.d(t);
                return new s63((fi3) mr2Var2, 6);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (FileNotFoundException e2) {
            Log.w("vs0", "keyset not found, will generate a new one", e2);
            if (((nh3) this.Y) != null) {
                fi3 s = ii3.s();
                s63 s63Var = new s63(s, 6);
                nh3 nh3Var = (nh3) this.Y;
                synchronized (s63Var) {
                    mh3 mh3Var = nh3Var.a;
                    synchronized (s63Var) {
                        hi3 r = s63Var.r(mh3Var);
                        s.c();
                        ii3.n((ii3) s.B, r);
                        int q = bk7.a((ii3) s63Var.o().B).o().q();
                        synchronized (s63Var) {
                            for (int i = 0; i < ((ii3) ((fi3) s63Var.B).B).p(); i++) {
                                try {
                                    hi3 o = ((ii3) ((fi3) s63Var.B).B).o(i);
                                    if (o.r() == q) {
                                        if (o.t().equals(hh3.ENABLED)) {
                                            fi3 fi3Var = (fi3) s63Var.B;
                                            fi3Var.c();
                                            ii3.m((ii3) fi3Var.B, q);
                                            if (((os0) this.X) != null) {
                                                s63 o2 = s63Var.o();
                                                s35 s35Var = (s35) this.L;
                                                os0 os0Var2 = (os0) this.X;
                                                ii3 ii3Var2 = (ii3) o2.B;
                                                byte[] c = ii3Var2.c();
                                                byte[] bArr = new byte[0];
                                                os0Var2.getClass();
                                                try {
                                                    W = os0Var2.W(c, bArr);
                                                } catch (GeneralSecurityException | ProviderException e3) {
                                                    Log.w("os0", "encountered a potentially transient KeyStore error, will wait and retry", e3);
                                                    try {
                                                        Thread.sleep((int) (Math.random() * 100.0d));
                                                    } catch (InterruptedException unused) {
                                                    }
                                                    W = os0Var2.W(c, bArr);
                                                }
                                                try {
                                                    if (ii3.t(os0Var2.T(W, new byte[0]), g82.a()).equals(ii3Var2)) {
                                                        i42 p = j42.p();
                                                        ca0 c2 = ea0.c(W, 0, W.length);
                                                        p.c();
                                                        j42.m((j42) p.B, c2);
                                                        ni3 a = bk7.a(ii3Var2);
                                                        p.c();
                                                        j42.n((j42) p.B, a);
                                                        if (!((SharedPreferences.Editor) s35Var.A).putString("__androidx_security_crypto_encrypted_file_keyset__", np2.L(((j42) p.a()).c())).commit()) {
                                                            e41.i("Failed to write to SharedPreferences");
                                                            return null;
                                                        }
                                                    } else {
                                                        throw new GeneralSecurityException("cannot encrypt keyset");
                                                    }
                                                } catch (ub3 unused2) {
                                                    e41.v("invalid keyset, corrupted key material");
                                                    return null;
                                                }
                                            } else {
                                                if (!((SharedPreferences.Editor) ((s35) this.L).A).putString("__androidx_security_crypto_encrypted_file_keyset__", np2.L(((ii3) s63Var.o().B).c())).commit()) {
                                                    e41.i("Failed to write to SharedPreferences");
                                                    return null;
                                                }
                                            }
                                            return s63Var;
                                        }
                                        throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + q);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            throw new GeneralSecurityException("key not found: " + q);
                        }
                    }
                }
            }
            e41.v("cannot read or generate keyset");
            return null;
        }
    }

    public os0 q() {
        int i = vs0.A0;
        os0 os0Var = new os0(11);
        boolean b0 = os0Var.b0((String) this.R);
        if (!b0) {
            try {
                os0.Y((String) this.R);
            } catch (GeneralSecurityException | ProviderException e) {
                int i2 = vs0.A0;
                Log.w("vs0", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        }
        try {
            return os0Var.a0((String) this.R);
        } catch (GeneralSecurityException | ProviderException e2) {
            if (!b0) {
                int i3 = vs0.A0;
                Log.w("vs0", "cannot use Android Keystore, it'll be disabled", e2);
                return null;
            }
            throw new KeyStoreException(lb1.A("the master key ", (String) this.R, " exists but is unusable"), e2);
        }
    }

    public void r() {
        try {
            fe5 fe5Var = new fe5(m());
            da0 l = fe5Var.l(fe5Var.readInt());
            da0 l2 = fe5Var.l(fe5Var.readInt());
            fe5Var.close();
            synchronized (this) {
                l.getClass();
                this.R = l;
                l2.getClass();
                this.X = l2;
            }
        } finally {
            ((CountDownLatch) this.L).countDown();
        }
    }

    public b51 s(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.X;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            b51 a = ((a51) list.get(i)).a(type, annotationArr, annotationArr2, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((a51) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public b51 t(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.X;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            b51 b = ((a51) list.get(i)).b(type, annotationArr, this);
            if (b != null) {
                return b;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((a51) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public String toString() {
        switch (this.A) {
            case 9:
                qo2 qo2Var = (qo2) this.Y;
                StringBuilder sb = new StringBuilder(32);
                sb.append("Request{method=");
                sb.append((String) this.L);
                sb.append(", url=");
                sb.append((i03) this.B);
                yw2 yw2Var = (yw2) this.R;
                if (yw2Var.size() != 0) {
                    sb.append(", headers=[");
                    int i = 0;
                    for (Object obj : yw2Var) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            vr4 vr4Var = (vr4) obj;
                            String str = (String) vr4Var.A;
                            String str2 = (String) vr4Var.B;
                            if (i > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            if (yy7.m(str)) {
                                str2 = "██";
                            }
                            sb.append(str2);
                            i = i2;
                        } else {
                            hf.q0();
                            throw null;
                        }
                    }
                    sb.append(']');
                }
                if (!nb3.k(qo2Var, eu1.b)) {
                    sb.append(", tags=");
                    sb.append(qo2Var);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void v(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.X;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((a51) list.get(i)).getClass();
        }
    }

    public pa(s9 s9Var) {
        this.A = 9;
        s9Var.getClass();
        i03 i03Var = (i03) s9Var.a;
        if (i03Var != null) {
            this.B = i03Var;
            this.L = (String) s9Var.b;
            this.R = ((ww2) s9Var.c).f();
            this.X = (mk5) s9Var.d;
            this.Y = (qo2) s9Var.e;
            return;
        }
        i.m("url == null");
        throw null;
    }

    public pa(MotionLayout motionLayout) {
        this.A = 12;
        this.L = new ArrayList();
        this.X = "ViewTransitionController";
        this.Z = new ArrayList();
        this.B = motionLayout;
    }

    public pa(Context context, ux uxVar, tg0 tg0Var, u63 u63Var, ze0 ze0Var, ij0 ij0Var) {
        this.A = 6;
        tg0Var.getClass();
        u63Var.getClass();
        ze0Var.getClass();
        this.B = context;
        this.L = uxVar;
        this.R = tg0Var;
        this.X = u63Var;
        this.Y = ze0Var;
        this.Z = ij0Var;
    }

    public /* synthetic */ pa(int i, boolean z) {
        this.A = i;
    }

    public pa(a0 a0Var, bf4 bf4Var) {
        this.A = 8;
        dv4 dv4Var = new dv4(14);
        this.B = a0Var;
        this.L = dv4Var;
        this.R = bf4Var;
        this.X = g04.s(false);
        this.Y = nb3.c(Integer.MAX_VALUE, null, new bg2(this, 23), 2);
        this.Z = new pu();
    }

    public pa(xk4 xk4Var, i03 i03Var, List list, List list2, Executor executor) {
        this.A = 10;
        this.B = new ConcurrentHashMap();
        this.L = xk4Var;
        this.R = i03Var;
        this.X = list;
        this.Y = list2;
        this.Z = executor;
    }

    public pa(Context context) {
        this.A = 7;
        this.B = context.getApplicationContext();
        this.L = h.a;
        this.R = null;
        this.X = null;
        this.Y = null;
        this.Z = new m23();
    }

    public pa(xb0 xb0Var, qf0 qf0Var, kf0 kf0Var, gt2 gt2Var, jr6 jr6Var, rv6 rv6Var, xb0 xb0Var2) {
        this.A = 5;
        kf0Var.getClass();
        this.B = qf0Var;
        this.L = kf0Var;
        this.R = gt2Var;
        this.X = jr6Var;
        this.Y = rv6Var;
        this.Z = xb0Var2;
    }

    public pa(ra raVar) {
        this.A = 0;
        this.Z = raVar;
    }
}
