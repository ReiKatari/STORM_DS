package q5;

import a1.s;
import a1.w0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k7.u;
import l.i0;
import p1.a0;
import q.i1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final p7.j f12290a;

    /* renamed from: b  reason: collision with root package name */
    public static final s f12291b;

    /* renamed from: c  reason: collision with root package name */
    public static Paint f12292c;

    static {
        Trace.beginSection(aj.g.v0("TypefaceCompat static init"));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f12290a = new p7.j();
        } else if (i2 >= 29) {
            f12290a = new p7.j();
        } else if (i2 >= 28) {
            f12290a = new h();
        } else if (i2 >= 26) {
            f12290a = new h();
        } else {
            Method method = g.f12300d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f12290a = new p7.j();
            } else {
                f12290a = new p7.j();
            }
        }
        f12291b = new s(16);
        f12292c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, p5.d dVar, Resources resources, int i2, String str, int i10, int i11, p5.b bVar, boolean z10) {
        Typeface p10;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        boolean z11;
        int i12;
        Handler handler;
        if (dVar instanceof p5.g) {
            p5.g gVar = (p5.g) dVar;
            String str2 = gVar.f11346d;
            p10 = null;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = gVar.f11343a;
                if (arrayList.size() == 1) {
                    build = c(((v5.c) arrayList.get(0)).f13731e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i13 = 0;
                        while (true) {
                            if (i13 < arrayList.size()) {
                                if (c(((v5.c) arrayList.get(i13)).f13731e) == null) {
                                    break;
                                }
                                i13++;
                            } else {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= arrayList.size()) {
                                        break;
                                    }
                                    v5.c cVar = (v5.c) arrayList.get(i14);
                                    if (i14 == arrayList.size() - 1 && TextUtils.isEmpty(cVar.f13732f)) {
                                        customFallbackBuilder.setSystemFallback(cVar.f13731e);
                                        break;
                                    }
                                    String str3 = cVar.f13731e;
                                    String str4 = cVar.f13732f;
                                    Font d4 = d(c(str3));
                                    if (d4 == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + cVar.f13731e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (!TextUtils.isEmpty(str4)) {
                                        build3 = i1.i(d4).build();
                                    } else {
                                        try {
                                            i1.n();
                                            i1.u();
                                            fontVariationSettings = m4.b.c(d4).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = i1.i(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder != null) {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    } else {
                                        customFallbackBuilder = i1.d(build3);
                                    }
                                    i14++;
                                }
                                build = customFallbackBuilder.build();
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new ad.c(19, bVar, build));
                }
                f12291b.l(b(resources, i2, str, i10, i11), build);
                return build;
            }
            if (!z10 ? bVar == null : gVar.f11345c == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                i12 = gVar.f11344b;
            } else {
                i12 = -1;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            i0 i0Var = new i0(28, false);
            i0Var.B = bVar;
            ArrayList arrayList2 = gVar.f11343a;
            gk.a aVar = new gk.a(handler2);
            a0 a0Var = new a0(17, i0Var, aVar);
            if (z11) {
                if (arrayList2.size() <= 1) {
                    v5.c cVar2 = (v5.c) arrayList2.get(0);
                    s sVar = v5.f.f13741a;
                    ArrayList arrayList3 = new ArrayList(1);
                    Object obj = new Object[]{cVar2}[0];
                    Objects.requireNonNull(obj);
                    arrayList3.add(obj);
                    String a10 = v5.f.a(i11, Collections.unmodifiableList(arrayList3));
                    Typeface typeface = (Typeface) v5.f.f13741a.h(a10);
                    if (typeface != null) {
                        aVar.execute(new m0.h(8, i0Var, typeface));
                        p10 = typeface;
                    } else if (i12 == -1) {
                        Object[] objArr = {cVar2};
                        ArrayList arrayList4 = new ArrayList(1);
                        Object obj2 = objArr[0];
                        Objects.requireNonNull(obj2);
                        arrayList4.add(obj2);
                        v5.e b10 = v5.f.b(a10, context, Collections.unmodifiableList(arrayList4), i11);
                        a0Var.A(b10);
                        p10 = b10.f13739a;
                    } else {
                        try {
                            try {
                                try {
                                    try {
                                        v5.e eVar = (v5.e) v5.f.f13742b.submit(new v5.d(a10, context, cVar2, i11, 0)).get(i12, TimeUnit.MILLISECONDS);
                                        a0Var.A(eVar);
                                        p10 = eVar.f13739a;
                                    } catch (TimeoutException unused2) {
                                        throw new InterruptedException("timeout");
                                    }
                                } catch (InterruptedException e6) {
                                    throw e6;
                                }
                            } catch (ExecutionException e10) {
                                throw new RuntimeException(e10);
                            }
                        } catch (InterruptedException unused3) {
                            ((gk.a) a0Var.L).execute(new com.google.android.material.datepicker.g(-3, 2, (i0) a0Var.B));
                        }
                    }
                } else {
                    a0.j.h("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
            } else {
                String a11 = v5.f.a(i11, arrayList2);
                Typeface typeface2 = (Typeface) v5.f.f13741a.h(a11);
                if (typeface2 != null) {
                    aVar.execute(new m0.h(8, i0Var, typeface2));
                    p10 = typeface2;
                } else {
                    r0.e eVar2 = new r0.e(1, a0Var);
                    synchronized (v5.f.f13743c) {
                        try {
                            w0 w0Var = v5.f.f13744d;
                            ArrayList arrayList5 = (ArrayList) w0Var.get(a11);
                            if (arrayList5 != null) {
                                arrayList5.add(eVar2);
                            } else {
                                ArrayList arrayList6 = new ArrayList();
                                arrayList6.add(eVar2);
                                w0Var.put(a11, arrayList6);
                                v5.d dVar2 = new v5.d(a11, context, arrayList2, i11, 1);
                                ThreadPoolExecutor threadPoolExecutor = v5.f.f13742b;
                                r0.e eVar3 = new r0.e(2, a11);
                                if (Looper.myLooper() == null) {
                                    handler = new Handler(Looper.getMainLooper());
                                } else {
                                    handler = new Handler();
                                }
                                u uVar = new u();
                                uVar.B = dVar2;
                                uVar.L = eVar3;
                                uVar.R = handler;
                                threadPoolExecutor.execute(uVar);
                            }
                        } finally {
                        }
                    }
                }
            }
        } else {
            p10 = f12290a.p(context, (p5.e) dVar, resources, i11);
            if (bVar != null) {
                if (p10 != null) {
                    new Handler(Looper.getMainLooper()).post(new ad.c(19, bVar, p10));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (p10 != null) {
            f12291b.l(b(resources, i2, str, i10, i11), p10);
        }
        return p10;
    }

    public static String b(Resources resources, int i2, String str, int i10, int i11) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i10 + '-' + i2 + '-' + i11;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (f12292c == null) {
            f12292c = new Paint();
        }
        f12292c.setTextSize(10.0f);
        f12292c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f12292c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount != 0) {
            font = shapeTextRun.getFont(0);
            return font;
        }
        return null;
    }
}
