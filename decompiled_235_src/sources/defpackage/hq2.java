package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.projection.MediaProjectionConfig;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import me.magnum.melonds.translator.capture.ScreenCaptureService;
import me.magnum.melonds.translator.ui.GameTranslationOverlayView;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hq2  reason: default package */
/* loaded from: classes.dex */
public final class hq2 {
    public final Activity a;
    public final bv1 b;
    public final wc0 c;
    public final bv1 d;
    public final bv1 e;
    public final SharedPreferences f;
    public final xk4 g;
    public final wp2 h;
    public final ci i;
    public final o41 j;
    public final Handler k;
    public GameTranslationOverlayView l;
    public ap6 m;
    public boolean n;
    public boolean o;
    public final qq2 p;
    public pu1 q;
    public String r;
    public String s;
    public String t;
    public final LinkedHashMap u;
    public long v;
    public String w;

    public hq2(Activity activity, bv1 bv1Var, wc0 wc0Var, bv1 bv1Var2, bv1 bv1Var3) {
        this.a = activity;
        this.b = bv1Var;
        this.c = wc0Var;
        this.d = bv1Var2;
        this.e = bv1Var3;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(v15.b(activity), 0);
        sharedPreferences.getClass();
        this.f = sharedPreferences;
        wk4 wk4Var = new wk4();
        wk4Var.a(10L);
        wk4Var.b(15L);
        this.g = new xk4(wk4Var);
        this.h = new wp2();
        this.i = new ci(activity);
        xe1 xe1Var = xk1.a;
        jv2 jv2Var = e04.a;
        gu6 c = oi2.c();
        jv2Var.getClass();
        this.j = g04.i(jw2.y(jv2Var, c));
        this.k = new Handler(Looper.getMainLooper());
        this.p = new qq2(activity);
        this.u = new LinkedHashMap();
        this.w = "";
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [yc1, java.lang.Object] */
    public static final f13 a(hq2 hq2Var) {
        f13 f13Var;
        xk4 xk4Var = hq2Var.g;
        va7 va7Var = wa7.Companion;
        String string = hq2Var.f.getString("translator_engine", "google");
        va7Var.getClass();
        wa7 a = va7.a(string);
        switch (aq2.a[a.ordinal()]) {
            case 1:
                f13Var = new ng0(2);
                break;
            case 2:
                f13Var = new ss2(xk4Var, 3);
                break;
            case 3:
                f13Var = new ss2(xk4Var, 0);
                break;
            case 4:
                f13Var = new ap3(xk4Var);
                break;
            case 5:
                xp2 xp2Var = new xp2(hq2Var, 7);
                xk4Var.getClass();
                ?? obj = new Object();
                obj.A = xk4Var;
                obj.B = xp2Var;
                f13Var = obj;
                break;
            case 6:
                f13Var = new bt(hq2Var.g);
                break;
            case 7:
                f13Var = new ss2(xk4Var, 1);
                break;
            case 8:
                f13Var = new eb(xk4Var, new xp2(hq2Var, 8), new xp2(hq2Var, 9), new xp2(hq2Var, 1));
                break;
            default:
                i.d();
                return null;
        }
        if (a == wa7.OFFLINE) {
            return f13Var;
        }
        return new ap3(f13Var);
    }

    public static final boolean b(hq2 hq2Var, Bitmap bitmap) {
        hq2Var.getClass();
        if (bitmap.getWidth() >= 4 && bitmap.getHeight() >= 4) {
            int width = bitmap.getWidth() / 12;
            if (width < 1) {
                width = 1;
            }
            int height = bitmap.getHeight() / 12;
            if (height < 1) {
                height = 1;
            }
            for (int i = 1; i < 12; i++) {
                for (int i2 = 1; i2 < 12; i2++) {
                    int pixel = bitmap.getPixel(i2 * width, i * height);
                    int i3 = (pixel >> 16) & 255;
                    int i4 = (pixel >> 8) & 255;
                    int i5 = pixel & 255;
                    if (i3 > 10 || i4 > 10 || i5 > 10) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void f(hq2 hq2Var, Bitmap bitmap, boolean z, boolean z2, List list, int i) {
        boolean z3;
        boolean z4;
        List list2;
        if ((i & 2) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 4) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        if ((i & 8) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        hv.L(hq2Var.j, null, null, new fq2(z4, hq2Var, bitmap, list2, z3, null), 3);
    }

    public final void c() {
        GameTranslationOverlayView gameTranslationOverlayView = this.l;
        if (gameTranslationOverlayView != null) {
            gameTranslationOverlayView.a();
        }
        GameTranslationOverlayView gameTranslationOverlayView2 = this.l;
        if (gameTranslationOverlayView2 != null) {
            gameTranslationOverlayView2.setTranslating(false);
        }
        if (this.n) {
            this.n = false;
            try {
                this.e.c();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r0 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String d() {
        String str = this.s;
        String str2 = null;
        if (str != null) {
            if (qs6.v0(str)) {
                str = null;
            }
        }
        str = this.t;
        if (str == null || qs6.v0(str)) {
            str = null;
        }
        if (str == null) {
            String str3 = this.r;
            if (str3 != null && !qs6.v0(str3)) {
                str2 = str3;
            }
            if (str2 == null) {
                str = "global";
            } else {
                str = str2;
            }
        }
        Pattern compile = Pattern.compile("[^a-zA-Z0-9_]");
        compile.getClass();
        String replaceAll = compile.matcher(str).replaceAll("_");
        replaceAll.getClass();
        String S0 = qs6.S0(32, replaceAll);
        if (S0.equals("global")) {
            return "translator_saved_regions";
        }
        return "translator_saved_regions_".concat(S0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [em5] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public final List e() {
        ?? em5Var;
        ua7 C;
        String d = d();
        SharedPreferences sharedPreferences = this.f;
        String string = sharedPreferences.getString(d, null);
        if ((string == null || qs6.v0(string)) && !d.equals("translator_saved_regions")) {
            string = sharedPreferences.getString("translator_saved_regions", null);
        }
        List<ua7> list = yt1.A;
        if (string != null && !qs6.v0(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                em5Var = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null && (C = gi2.C(optJSONObject)) != null) {
                        em5Var.add(C);
                    }
                }
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            if (!(em5Var instanceof em5)) {
                list = em5Var;
            }
            list = list;
        }
        GameTranslationOverlayView gameTranslationOverlayView = this.l;
        if (gameTranslationOverlayView != null) {
            gameTranslationOverlayView.setSavedRegions(list);
        }
        return list;
    }

    public final void g(String str, String str2) {
        str.getClass();
        str2.getClass();
        SharedPreferences sharedPreferences = this.f;
        if (!sharedPreferences.getBoolean("translator_tts_enabled", false) && !sharedPreferences.getBoolean("translator_local_voice_actor_studio", false)) {
            return;
        }
        this.p.d(str, str2);
    }

    public final void h() {
        lb7 lb7Var = mb7.Companion;
        String string = this.f.getString("translator_trigger_mode", "on_demand");
        lb7Var.getClass();
        mb7 a = lb7.a(string);
        mb7 mb7Var = mb7.AUTO_SCREEN_CHANGE;
        ap6 ap6Var = this.m;
        if (a == mb7Var) {
            if (ap6Var != null) {
                ap6Var.h(null);
            }
            this.m = hv.L(this.j, null, null, new xd1(this, null, 19), 3);
            return;
        }
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        this.m = null;
    }

    public final void i() {
        int i;
        GameTranslationOverlayView gameTranslationOverlayView = this.l;
        if (gameTranslationOverlayView == null) {
            return;
        }
        SharedPreferences sharedPreferences = this.f;
        boolean z = false;
        boolean z2 = sharedPreferences.getBoolean("translator_enabled", false);
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        gameTranslationOverlayView.setVisibility(i);
        if (z2 && sharedPreferences.getBoolean("translator_show_floating_button", true)) {
            z = true;
        }
        gameTranslationOverlayView.setShowFloatingButton(z);
        xa7 xa7Var = ya7.Companion;
        String string = sharedPreferences.getString("translator_overlay_style", "smart_background_match");
        xa7Var.getClass();
        gameTranslationOverlayView.setOverlayStyle(xa7.a(string));
        gameTranslationOverlayView.setBubbleOpacity(sharedPreferences.getInt("translator_bubble_opacity", 90) / 100.0f);
        gameTranslationOverlayView.setFontSizeScale(sharedPreferences.getInt("translator_font_size_scale", 100) / 100.0f);
        gameTranslationOverlayView.setSavedRegions(e());
        if (z2) {
            h();
            return;
        }
        ap6 ap6Var = this.m;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        this.m = null;
        gameTranslationOverlayView.a();
    }

    public final void j(boolean z) {
        Intent createScreenCaptureIntent;
        MediaProjectionConfig createConfigForDefaultDisplay;
        if (!this.f.getBoolean("translator_enabled", false)) {
            Toast.makeText(this.a, (int) R.string.translator_disabled_hint, 0).show();
            return;
        }
        GameTranslationOverlayView gameTranslationOverlayView = this.l;
        if (gameTranslationOverlayView == null || (gameTranslationOverlayView.B.isEmpty() && gameTranslationOverlayView.B0 == null)) {
            GameTranslationOverlayView gameTranslationOverlayView2 = this.l;
            boolean z2 = true;
            if (gameTranslationOverlayView2 == null || !gameTranslationOverlayView2.f0) {
                if (!this.i.B) {
                    boolean z3 = ScreenCaptureService.A;
                    if (!ScreenCaptureService.A) {
                        this.o = true;
                        try {
                            MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) this.i.R;
                            if (Build.VERSION.SDK_INT >= 34) {
                                createConfigForDefaultDisplay = MediaProjectionConfig.createConfigForDefaultDisplay();
                                createConfigForDefaultDisplay.getClass();
                                createScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent(createConfigForDefaultDisplay);
                                createScreenCaptureIntent.getClass();
                            } else {
                                createScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
                                createScreenCaptureIntent.getClass();
                            }
                            pu1 pu1Var = this.q;
                            if (pu1Var != null) {
                                pu1Var.g(createScreenCaptureIntent);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            Log.e("GameTranslatorManager", "Failed to launch MediaProjection permission request", th);
                            Toast.makeText(this.a, (int) R.string.translator_capture_failed, 0).show();
                            return;
                        }
                    }
                }
                GameTranslationOverlayView gameTranslationOverlayView3 = this.l;
                if (gameTranslationOverlayView3 != null) {
                    gameTranslationOverlayView3.setTranslating(true);
                }
                GameTranslationOverlayView gameTranslationOverlayView4 = this.l;
                if (gameTranslationOverlayView4 != null) {
                    z2 = gameTranslationOverlayView4.getShowFloatingButton();
                }
                GameTranslationOverlayView gameTranslationOverlayView5 = this.l;
                if (gameTranslationOverlayView5 != null) {
                    gameTranslationOverlayView5.setShowFloatingButton(false);
                }
                GameTranslationOverlayView gameTranslationOverlayView6 = this.l;
                if (gameTranslationOverlayView6 != null) {
                    gameTranslationOverlayView6.invalidate();
                }
                hv.L(this.j, null, null, new gq2(this, z2, z, null), 3);
                return;
            }
        }
        c();
    }
}
