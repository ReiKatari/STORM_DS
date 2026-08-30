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
import androidx.preference.Preference;
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
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ka  reason: default package */
/* loaded from: classes.dex */
public final class ka implements wf6 {
    public final /* synthetic */ int A;
    public Object B;
    public Object L;
    public Object R;
    public Object X;
    public Object Y;
    public Object Z;

    public ka(int i) {
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

    public static final void a(ka kaVar, Throwable th) {
        xt xtVar = (xt) kaVar.Z;
        q60 q60Var = (q60) kaVar.Y;
        if (q60Var.l(th, false)) {
            for (Object o = q60Var.o(); !(o instanceof wj0); o = q60Var.o()) {
                xj0.b(o);
                xtVar.addLast(o);
            }
            if (!xtVar.isEmpty()) {
                ((mi2) kaVar.L).n(new ArrayList(xtVar));
                xtVar.clear();
            }
        }
    }

    public static boolean b(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList h(Context context, int i) {
        int c = qs6.c(context, R.attr.colorControlHighlight);
        int b = qs6.b(context, R.attr.colorButtonNormal);
        int[] iArr = qs6.b;
        int[] iArr2 = qs6.d;
        int b2 = gr0.b(c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, qs6.c, qs6.f}, new int[]{b, b2, gr0.b(c, i), i});
    }

    public static LayerDrawable i(wb5 wb5Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c = wb5Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable c2 = wb5Var.c(context, R.drawable.abc_star_half_black_48dp);
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

    public static void l(xb7 xb7Var) {
        o56 sharedValues = ConstraintLayout.getSharedValues();
        int i = xb7Var.u;
        jo1 jo1Var = new jo1(28);
        HashMap hashMap = sharedValues.a;
        HashSet hashSet = (HashSet) hashMap.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
            hashMap.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(jo1Var));
    }

    public static void s(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = vq.b;
        }
        mutate.setColorFilter(vq.c(i, mode));
    }

    @Override // defpackage.wf6
    public synchronized void c(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() == ((ma) this.Z).e()) {
            if (byteBuffer.get() == ((ma) this.Z).e()) {
                this.Y = new byte[7];
                byte[] bArr2 = new byte[((ma) this.Z).a];
                byteBuffer.get(bArr2);
                byteBuffer.get((byte[]) this.Y);
                ma maVar = (ma) this.Z;
                byte[] F = nl2.F(maVar.f, maVar.g, bArr2, bArr, maVar.a + 32);
                this.B = new SecretKeySpec(F, 0, ((ma) this.Z).a, "AES");
                ma maVar2 = (ma) this.Z;
                this.L = new SecretKeySpec(F, maVar2.a, 32, maVar2.b);
                this.R = (Cipher) a02.e.a("AES/CTR/NoPadding");
                this.X = (Mac) a02.f.a(((ma) this.Z).b);
            } else {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
        } else {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
    }

    @Override // defpackage.wf6
    public synchronized void d(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        int position = byteBuffer.position();
        byte[] i2 = ma.i((ma) this.Z, (byte[]) this.Y, i, z);
        int remaining = byteBuffer.remaining();
        int i3 = ((ma) this.Z).c;
        if (remaining >= i3) {
            int i4 = (remaining - i3) + position;
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.limit(i4);
            ByteBuffer duplicate2 = byteBuffer.duplicate();
            duplicate2.position(i4);
            ((Mac) this.X).init((SecretKeySpec) this.L);
            ((Mac) this.X).update(i2);
            ((Mac) this.X).update(duplicate);
            byte[] copyOf = Arrays.copyOf(((Mac) this.X).doFinal(), ((ma) this.Z).c);
            int i5 = ((ma) this.Z).c;
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

    public c55 e() {
        Context context = (Context) this.B;
        ab1 ab1Var = (ab1) this.L;
        il6 il6Var = (il6) this.R;
        if (il6Var == null) {
            il6Var = new il6(new ki2(this) { // from class: hw2
                public final /* synthetic */ ka B;

                {
                    this.B = this;
                }

                @Override // defpackage.ki2
                public final Object c() {
                    z45 z45Var;
                    long j;
                    int i = r2;
                    ka kaVar = this.B;
                    switch (i) {
                        case 0:
                            return new nw3((Context) kaVar.B).a();
                        default:
                            iq0 iq0Var = iq0.o0;
                            Context context2 = (Context) kaVar.B;
                            synchronized (iq0Var) {
                                try {
                                    z45Var = iq0.p0;
                                    if (z45Var == null) {
                                        d93 d93Var = j62.A;
                                        bb1 bb1Var = tg1.a;
                                        ha1 ha1Var = ha1.L;
                                        Bitmap.Config[] configArr = k.a;
                                        File cacheDir = context2.getCacheDir();
                                        if (cacheDir != null) {
                                            cacheDir.mkdirs();
                                            File M = q72.M(cacheDir);
                                            String str = jk4.B;
                                            jk4 p = hm1.p(M);
                                            if (0.02d > 0.0d) {
                                                j = 10485760;
                                                try {
                                                    File file = p.toFile();
                                                    file.mkdir();
                                                    StatFs statFs = new StatFs(file.getAbsolutePath());
                                                    j = io2.o((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                                } catch (Exception unused) {
                                                }
                                            } else {
                                                j = 0;
                                            }
                                            z45 z45Var2 = new z45(j, ha1Var, d93Var, p);
                                            iq0.p0 = z45Var2;
                                            z45Var = z45Var2;
                                        } else {
                                            throw new IllegalStateException("cacheDir == null");
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return z45Var;
                    }
                }
            });
        }
        il6 il6Var2 = (il6) this.X;
        if (il6Var2 == null) {
            il6Var2 = new il6(new ki2(this) { // from class: hw2
                public final /* synthetic */ ka B;

                {
                    this.B = this;
                }

                @Override // defpackage.ki2
                public final Object c() {
                    z45 z45Var;
                    long j;
                    int i = r2;
                    ka kaVar = this.B;
                    switch (i) {
                        case 0:
                            return new nw3((Context) kaVar.B).a();
                        default:
                            iq0 iq0Var = iq0.o0;
                            Context context2 = (Context) kaVar.B;
                            synchronized (iq0Var) {
                                try {
                                    z45Var = iq0.p0;
                                    if (z45Var == null) {
                                        d93 d93Var = j62.A;
                                        bb1 bb1Var = tg1.a;
                                        ha1 ha1Var = ha1.L;
                                        Bitmap.Config[] configArr = k.a;
                                        File cacheDir = context2.getCacheDir();
                                        if (cacheDir != null) {
                                            cacheDir.mkdirs();
                                            File M = q72.M(cacheDir);
                                            String str = jk4.B;
                                            jk4 p = hm1.p(M);
                                            if (0.02d > 0.0d) {
                                                j = 10485760;
                                                try {
                                                    File file = p.toFile();
                                                    file.mkdir();
                                                    StatFs statFs = new StatFs(file.getAbsolutePath());
                                                    j = io2.o((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                                } catch (Exception unused) {
                                                }
                                            } else {
                                                j = 0;
                                            }
                                            z45 z45Var2 = new z45(j, ha1Var, d93Var, p);
                                            iq0.p0 = z45Var2;
                                            z45Var = z45Var2;
                                        } else {
                                            throw new IllegalStateException("cacheDir == null");
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return z45Var;
                    }
                }
            });
        }
        il6 il6Var3 = new il6(new do1(10));
        ct0 ct0Var = (ct0) this.Y;
        if (ct0Var == null) {
            pp1 pp1Var = pp1.A;
            ct0Var = new ct0(pp1Var, pp1Var, pp1Var, pp1Var, pp1Var);
        }
        return new c55(context, ab1Var, il6Var, il6Var2, il6Var3, ct0Var, (iw2) this.Z);
    }

    public e80 f() {
        e80 e80Var = (e80) this.Z;
        if (e80Var == null) {
            e80 e80Var2 = e80.n;
            e80 C = w81.C((xq2) this.R);
            this.Z = C;
            return C;
        }
        return e80Var;
    }

    public a90 g(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.Y;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            a90 a = ((z80) list.get(i)).a(type, annotationArr);
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
            sb.append(((z80) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public ColorStateList j(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return jv3.x(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return jv3.x(context, R.color.abc_tint_switch_track);
        }
        if (i == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d = qs6.d(context, R.attr.colorSwitchThumbNormal);
            if (d != null && d.isStateful()) {
                int[] iArr3 = qs6.b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = qs6.e;
                iArr2[1] = qs6.c(context, R.attr.colorControlActivated);
                iArr[2] = qs6.f;
                iArr2[2] = d.getDefaultColor();
            } else {
                iArr[0] = qs6.b;
                iArr2[0] = qs6.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = qs6.e;
                iArr2[1] = qs6.c(context, R.attr.colorControlActivated);
                iArr[2] = qs6.f;
                iArr2[2] = qs6.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
            return h(context, qs6.c(context, R.attr.colorButtonNormal));
        } else {
            if (i == R.drawable.abc_btn_borderless_material) {
                return h(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return h(context, qs6.c(context, R.attr.colorAccent));
            }
            if (i != R.drawable.abc_spinner_mtrl_am_alpha && i != R.drawable.abc_spinner_textfield_background_material) {
                if (b((int[]) this.L, i)) {
                    return qs6.d(context, R.attr.colorControlNormal);
                }
                if (b((int[]) this.Y, i)) {
                    return jv3.x(context, R.color.abc_tint_default);
                }
                if (b((int[]) this.Z, i)) {
                    return jv3.x(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return jv3.x(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            return jv3.x(context, R.color.abc_tint_spinner);
        }
    }

    public t13 k() {
        y01 y01Var;
        Context context;
        AssetManager assetManager;
        fo4 fo4Var = fo4.a;
        fo4 fo4Var2 = fo4.a;
        if (fo4Var2 != null) {
            y01Var = (y01) fo4Var2;
        } else {
            y01Var = null;
        }
        if (y01Var != null) {
            context = y01Var.b();
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
                f81.j("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
                return null;
            }
            f81.j("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
            return null;
        }
        InputStream open = assetManager.open((String) this.Z);
        open.getClass();
        return sn2.P(open);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r9, java.lang.Object] */
    public r9 m() {
        ?? obj = new Object();
        obj.a = (hu2) this.B;
        obj.b = (String) this.L;
        obj.d = (ua5) this.X;
        obj.e = (io2) this.Y;
        obj.c = ((xq2) this.R).d();
        return obj;
    }

    public ka3 n() {
        byte[] U;
        try {
            bq0 bq0Var = (bq0) this.X;
            if (bq0Var != null) {
                try {
                    qb3 qb3Var = (qb3) ka3.G((dz4) this.B, bq0Var).B;
                    gl2 gl2Var = (gl2) qb3Var.f(il2.NEW_BUILDER);
                    gl2Var.e(qb3Var);
                    return new ka3(2, (nb3) gl2Var);
                } catch (i53 | GeneralSecurityException e) {
                    Log.w("k45", "cannot decrypt keyset: ", e);
                }
            }
            qb3 t = qb3.t(((dz4) this.B).w(), o32.a());
            if (t.p() > 0) {
                gl2 gl2Var2 = (gl2) t.f(il2.NEW_BUILDER);
                gl2Var2.e(t);
                return new ka3(2, (nb3) gl2Var2);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (FileNotFoundException e2) {
            Log.w("k45", "keyset not found, will generate a new one", e2);
            if (((va3) this.Y) != null) {
                nb3 s = qb3.s();
                ka3 ka3Var = new ka3(2, s);
                va3 va3Var = (va3) this.Y;
                synchronized (ka3Var) {
                    ua3 ua3Var = va3Var.a;
                    synchronized (ka3Var) {
                        pb3 A = ka3Var.A(ua3Var);
                        s.c();
                        qb3.n((qb3) s.B, A);
                        int q = d67.a((qb3) ka3Var.x().B).o().q();
                        synchronized (ka3Var) {
                            for (int i = 0; i < ((qb3) ((nb3) ka3Var.B).B).p(); i++) {
                                try {
                                    pb3 o = ((qb3) ((nb3) ka3Var.B).B).o(i);
                                    if (o.r() == q) {
                                        if (o.t().equals(pa3.ENABLED)) {
                                            nb3 nb3Var = (nb3) ka3Var.B;
                                            nb3Var.c();
                                            qb3.m((qb3) nb3Var.B, q);
                                            if (((bq0) this.X) != null) {
                                                ka3 x = ka3Var.x();
                                                dz4 dz4Var = (dz4) this.L;
                                                bq0 bq0Var2 = (bq0) this.X;
                                                qb3 qb3Var2 = (qb3) x.B;
                                                byte[] c = qb3Var2.c();
                                                byte[] bArr = new byte[0];
                                                bq0Var2.getClass();
                                                try {
                                                    U = bq0Var2.U(c, bArr);
                                                } catch (GeneralSecurityException | ProviderException e3) {
                                                    Log.w("bq0", "encountered a potentially transient KeyStore error, will wait and retry", e3);
                                                    try {
                                                        Thread.sleep((int) (Math.random() * 100.0d));
                                                    } catch (InterruptedException unused) {
                                                    }
                                                    U = bq0Var2.U(c, bArr);
                                                }
                                                try {
                                                    if (qb3.t(bq0Var2.S(U, new byte[0]), o32.a()).equals(qb3Var2)) {
                                                        tz1 p = uz1.p();
                                                        v70 d = x70.d(U, 0, U.length);
                                                        p.c();
                                                        uz1.m((uz1) p.B, d);
                                                        vb3 a = d67.a(qb3Var2);
                                                        p.c();
                                                        uz1.n((uz1) p.B, a);
                                                        if (!((SharedPreferences.Editor) dz4Var.A).putString("__androidx_security_crypto_encrypted_file_keyset__", hk2.r(((uz1) p.a()).c())).commit()) {
                                                            f81.j("Failed to write to SharedPreferences");
                                                            return null;
                                                        }
                                                    } else {
                                                        throw new GeneralSecurityException("cannot encrypt keyset");
                                                    }
                                                } catch (i53 unused2) {
                                                    f81.u("invalid keyset, corrupted key material");
                                                    return null;
                                                }
                                            } else {
                                                if (!((SharedPreferences.Editor) ((dz4) this.L).A).putString("__androidx_security_crypto_encrypted_file_keyset__", hk2.r(((qb3) ka3Var.x().B).c())).commit()) {
                                                    f81.j("Failed to write to SharedPreferences");
                                                    return null;
                                                }
                                            }
                                            return ka3Var;
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
            f81.u("cannot read or generate keyset");
            return null;
        }
    }

    public bq0 o() {
        int i = k45.r0;
        bq0 bq0Var = new bq0(11);
        boolean Z = bq0Var.Z((String) this.R);
        if (!Z) {
            try {
                bq0.W((String) this.R);
            } catch (GeneralSecurityException | ProviderException e) {
                int i2 = k45.r0;
                Log.w("k45", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        }
        try {
            return bq0Var.Y((String) this.R);
        } catch (GeneralSecurityException | ProviderException e2) {
            if (!Z) {
                int i3 = k45.r0;
                Log.w("k45", "cannot use Android Keystore, it'll be disabled", e2);
                return null;
            }
            throw new KeyStoreException(wh1.A("the master key ", (String) this.R, " exists but is unusable"), e2);
        }
    }

    public void p() {
        try {
            s45 s45Var = new s45(k());
            w70 r = s45Var.r(s45Var.readInt());
            w70 r2 = s45Var.r(s45Var.readInt());
            s45Var.close();
            synchronized (this) {
                r.getClass();
                this.R = r;
                r2.getClass();
                this.X = r2;
            }
        } finally {
            ((CountDownLatch) this.L).countDown();
        }
    }

    public t11 q(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.X;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            t11 a = ((s11) list.get(i)).a(type, annotationArr, annotationArr2, this);
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
            sb.append(((s11) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public t11 r(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.X;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            t11 b = ((s11) list.get(i)).b(type, annotationArr, this);
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
            sb.append(((s11) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public void t(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.X;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((s11) list.get(i)).getClass();
        }
    }

    public String toString() {
        switch (this.A) {
            case 8:
                io2 io2Var = (io2) this.Y;
                StringBuilder sb = new StringBuilder(32);
                sb.append("Request{method=");
                sb.append((String) this.L);
                sb.append(", url=");
                sb.append((hu2) this.B);
                xq2 xq2Var = (xq2) this.R;
                if (xq2Var.size() != 0) {
                    sb.append(", headers=[");
                    int i = 0;
                    for (Object obj : xq2Var) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            ti4 ti4Var = (ti4) obj;
                            String str = (String) ti4Var.A;
                            String str2 = (String) ti4Var.B;
                            if (i > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            if (gk7.l(str)) {
                                str2 = "██";
                            }
                            sb.append(str2);
                            i = i2;
                        } else {
                            l07.v0();
                            throw null;
                        }
                    }
                    sb.append(']');
                }
                if (!b53.x(io2Var, vp1.j)) {
                    sb.append(", tags=");
                    sb.append(io2Var);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ka(r9 r9Var) {
        this.A = 8;
        r9Var.getClass();
        hu2 hu2Var = (hu2) r9Var.a;
        if (hu2Var != null) {
            this.B = hu2Var;
            this.L = (String) r9Var.b;
            this.R = ((vq2) r9Var.c).f();
            this.X = (ua5) r9Var.d;
            this.Y = (io2) r9Var.e;
            return;
        }
        i.n("url == null");
        throw null;
    }

    public ka(MotionLayout motionLayout) {
        this.A = 11;
        this.L = new ArrayList();
        this.X = "ViewTransitionController";
        this.Z = new ArrayList();
        this.B = motionLayout;
    }

    public ka(Context context, sw swVar, ke0 ke0Var, q03 q03Var, qc0 qc0Var, zg0 zg0Var) {
        this.A = 5;
        ke0Var.getClass();
        q03Var.getClass();
        qc0Var.getClass();
        this.B = context;
        this.L = swVar;
        this.R = ke0Var;
        this.X = q03Var;
        this.Y = qc0Var;
        this.Z = zg0Var;
    }

    public /* synthetic */ ka(int i, boolean z) {
        this.A = i;
    }

    public ka(z zVar, v74 v74Var) {
        this.A = 7;
        vu4 vu4Var = new vu4(2);
        this.B = zVar;
        this.L = vu4Var;
        this.R = v74Var;
        this.X = w81.e(false);
        this.Y = n40.f(Preference.DEFAULT_ORDER, null, new kb2(25, this), 2);
        this.Z = new xt();
    }

    public ka(zb4 zb4Var, hu2 hu2Var, List list, List list2, Executor executor) {
        this.A = 9;
        this.B = new ConcurrentHashMap();
        this.L = zb4Var;
        this.R = hu2Var;
        this.X = list;
        this.Y = list2;
        this.Z = executor;
    }

    public ka(Context context) {
        this.A = 6;
        this.B = context.getApplicationContext();
        this.L = h.a;
        this.R = null;
        this.X = null;
        this.Y = null;
        this.Z = new iw2();
    }

    public ka(p90 p90Var, hd0 hd0Var, bd0 bd0Var, an2 an2Var, tf6 tf6Var, xj6 xj6Var, p90 p90Var2) {
        this.A = 4;
        bd0Var.getClass();
        this.B = hd0Var;
        this.L = bd0Var;
        this.R = an2Var;
        this.X = tf6Var;
        this.Y = xj6Var;
        this.Z = p90Var2;
    }

    public ka(ma maVar) {
        this.A = 0;
        this.Z = maVar;
    }
}
