package defpackage;

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
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: je7  reason: default package */
/* loaded from: classes.dex */
public abstract class je7 {
    public static final bl2 a;
    public static final yz3 b;
    public static Paint c;

    static {
        Trace.beginSection(ln2.f0("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new bl2();
        } else if (i >= 29) {
            a = new bl2();
        } else if (i >= 28) {
            a = new ne7();
        } else if (i >= 26) {
            a = new ne7();
        } else {
            Method method = le7.e0;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new bl2();
            } else {
                a = new bl2();
            }
        }
        b = new yz3(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, aj2 aj2Var, Resources resources, int i, String str, int i2, int i3, gi2 gi2Var, boolean z) {
        Typeface o;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        boolean z2;
        int i4;
        Handler handler;
        if (aj2Var instanceof dj2) {
            dj2 dj2Var = (dj2) aj2Var;
            String str2 = dj2Var.d;
            o = null;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = dj2Var.a;
                if (arrayList.size() == 1) {
                    build = c(((ui2) arrayList.get(0)).e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i5 = 0;
                        while (true) {
                            if (i5 < arrayList.size()) {
                                if (c(((ui2) arrayList.get(i5)).e) == null) {
                                    break;
                                }
                                i5++;
                            } else {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= arrayList.size()) {
                                        break;
                                    }
                                    ui2 ui2Var = (ui2) arrayList.get(i6);
                                    if (i6 == arrayList.size() - 1 && TextUtils.isEmpty(ui2Var.f)) {
                                        customFallbackBuilder.setSystemFallback(ui2Var.e);
                                        break;
                                    }
                                    String str3 = ui2Var.e;
                                    String str4 = ui2Var.f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + ui2Var.e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = r74.B(d).build();
                                    } else {
                                        try {
                                            r74.o();
                                            r74.C();
                                            fontVariationSettings = ij5.e(d).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = r74.k(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder != null) {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    } else {
                                        customFallbackBuilder = r74.f(build3);
                                    }
                                    i6++;
                                }
                                build = customFallbackBuilder.build();
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (gi2Var != null) {
                    new Handler(Looper.getMainLooper()).post(new q64(5, gi2Var, build));
                }
                b.l(b(resources, i, str, i2, i3), build);
                return build;
            }
            if (!z ? gi2Var == null : dj2Var.c == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                i4 = dj2Var.b;
            } else {
                i4 = -1;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            j97 j97Var = new j97(2);
            j97Var.B = gi2Var;
            ArrayList arrayList2 = dj2Var.a;
            d72 d72Var = new d72(handler2, 1);
            u63 u63Var = new u63(14, j97Var, d72Var);
            if (z2) {
                if (arrayList2.size() <= 1) {
                    ui2 ui2Var2 = (ui2) arrayList2.get(0);
                    yz3 yz3Var = zi2.a;
                    ArrayList arrayList3 = new ArrayList(1);
                    Object obj = new Object[]{ui2Var2}[0];
                    Objects.requireNonNull(obj);
                    arrayList3.add(obj);
                    String a2 = zi2.a(i3, Collections.unmodifiableList(arrayList3));
                    Typeface typeface = (Typeface) zi2.a.h(a2);
                    if (typeface != null) {
                        d72Var.execute(new uo2(5, j97Var, typeface));
                        o = typeface;
                    } else if (i4 == -1) {
                        Object[] objArr = {ui2Var2};
                        ArrayList arrayList4 = new ArrayList(1);
                        Object obj2 = objArr[0];
                        Objects.requireNonNull(obj2);
                        arrayList4.add(obj2);
                        yi2 b2 = zi2.b(a2, context, Collections.unmodifiableList(arrayList4), i3);
                        u63Var.z(b2);
                        o = b2.a;
                    } else {
                        try {
                            try {
                                try {
                                    yi2 yi2Var = (yi2) zi2.b.submit(new xi2(a2, context, ui2Var2, i3, 0)).get(i4, TimeUnit.MILLISECONDS);
                                    u63Var.z(yi2Var);
                                    o = yi2Var.a;
                                } catch (InterruptedException e) {
                                    throw e;
                                }
                            } catch (ExecutionException e2) {
                                throw new RuntimeException(e2);
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException unused3) {
                            ((d72) u63Var.L).execute(new ub0((j97) u63Var.B, -3, 0));
                        }
                    }
                } else {
                    i.h("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
            } else {
                String a3 = zi2.a(i3, arrayList2);
                Typeface typeface2 = (Typeface) zi2.a.h(a3);
                if (typeface2 != null) {
                    d72Var.execute(new uo2(5, j97Var, typeface2));
                    o = typeface2;
                } else {
                    jr1 jr1Var = new jr1(u63Var, 1);
                    synchronized (zi2.c) {
                        try {
                            ci6 ci6Var = zi2.d;
                            ArrayList arrayList5 = (ArrayList) ci6Var.get(a3);
                            if (arrayList5 != null) {
                                arrayList5.add(jr1Var);
                            } else {
                                ArrayList arrayList6 = new ArrayList();
                                arrayList6.add(jr1Var);
                                ci6Var.put(a3, arrayList6);
                                xi2 xi2Var = new xi2(a3, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = zi2.b;
                                jr1 jr1Var2 = new jr1(a3, 2);
                                if (Looper.myLooper() == null) {
                                    handler = new Handler(Looper.getMainLooper());
                                } else {
                                    handler = new Handler();
                                }
                                h15 h15Var = new h15();
                                h15Var.B = xi2Var;
                                h15Var.L = jr1Var2;
                                h15Var.R = handler;
                                threadPoolExecutor.execute(h15Var);
                            }
                        } finally {
                        }
                    }
                }
            }
        } else {
            o = a.o(context, (bj2) aj2Var, resources, i3);
            if (gi2Var != null) {
                if (o != null) {
                    new Handler(Looper.getMainLooper()).post(new q64(5, gi2Var, o));
                } else {
                    gi2Var.n(-3);
                }
            }
        }
        if (o != null) {
            b.l(b(resources, i, str, i2, i3), o);
        }
        return o;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
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
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, (float) RecyclerView.B1, (float) RecyclerView.B1, false, c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount != 0) {
            font = shapeTextRun.getFont(0);
            return font;
        }
        return null;
    }
}
