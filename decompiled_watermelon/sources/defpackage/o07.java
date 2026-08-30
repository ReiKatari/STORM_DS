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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o07  reason: default package */
/* loaded from: classes.dex */
public abstract class o07 {
    public static final hk2 a;
    public static final us3 b;
    public static Paint c;

    static {
        Trace.beginSection(io2.p0("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new hk2();
        } else if (i >= 29) {
            a = new hk2();
        } else if (i >= 28) {
            a = new s07();
        } else if (i >= 26) {
            a = new s07();
        } else {
            Method method = q07.g;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new hk2();
            } else {
                a = new hk2();
            }
        }
        b = new us3(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, dz4] */
    public static Typeface a(Context context, de2 de2Var, Resources resources, int i, String str, int i2, int i3, io2 io2Var, boolean z) {
        Typeface k;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        boolean z2;
        int i4;
        Handler handler;
        if (de2Var instanceof ge2) {
            ge2 ge2Var = (ge2) de2Var;
            String str2 = ge2Var.d;
            k = null;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = ge2Var.a;
                if (arrayList.size() == 1) {
                    build = c(((xd2) arrayList.get(0)).e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i5 = 0;
                        while (true) {
                            if (i5 < arrayList.size()) {
                                if (c(((xd2) arrayList.get(i5)).e) == null) {
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
                                    xd2 xd2Var = (xd2) arrayList.get(i6);
                                    if (i6 == arrayList.size() - 1 && TextUtils.isEmpty(xd2Var.f)) {
                                        customFallbackBuilder.setSystemFallback(xd2Var.e);
                                        break;
                                    }
                                    String str3 = xd2Var.e;
                                    String str4 = xd2Var.f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + xd2Var.e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = zq4.A(d).build();
                                    } else {
                                        try {
                                            zq4.m();
                                            zq4.B();
                                            fontVariationSettings = dr5.d(d).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = zq4.i(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder != null) {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    } else {
                                        customFallbackBuilder = zq4.d(build3);
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
                if (io2Var != null) {
                    new Handler(Looper.getMainLooper()).post(new xc4(3, io2Var, build));
                }
                b.l(b(resources, i, str, i2, i3), build);
                return build;
            }
            if (!z ? io2Var == null : ge2Var.c == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                i4 = ge2Var.b;
            } else {
                i4 = -1;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            ?? obj = new Object();
            obj.A = io2Var;
            ArrayList arrayList2 = ge2Var.a;
            l22 l22Var = new l22(handler2, 1);
            q03 q03Var = new q03(14, obj, l22Var);
            if (z2) {
                if (arrayList2.size() <= 1) {
                    xd2 xd2Var2 = (xd2) arrayList2.get(0);
                    us3 us3Var = ce2.a;
                    ArrayList arrayList3 = new ArrayList(1);
                    Object obj2 = new Object[]{xd2Var2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList3.add(obj2);
                    String a2 = ce2.a(i3, Collections.unmodifiableList(arrayList3));
                    Typeface typeface = (Typeface) ce2.a.h(a2);
                    if (typeface != null) {
                        l22Var.execute(new qj2(5, (Object) obj, typeface));
                        k = typeface;
                    } else if (i4 == -1) {
                        Object[] objArr = {xd2Var2};
                        ArrayList arrayList4 = new ArrayList(1);
                        Object obj3 = objArr[0];
                        Objects.requireNonNull(obj3);
                        arrayList4.add(obj3);
                        be2 b2 = ce2.b(a2, context, Collections.unmodifiableList(arrayList4), i3);
                        q03Var.w(b2);
                        k = b2.a;
                    } else {
                        try {
                            try {
                                try {
                                    be2 be2Var = (be2) ce2.b.submit(new ae2(a2, context, xd2Var2, i3, 0)).get(i4, TimeUnit.MILLISECONDS);
                                    q03Var.w(be2Var);
                                    k = be2Var.a;
                                } catch (InterruptedException e) {
                                    throw e;
                                }
                            } catch (ExecutionException e2) {
                                throw new RuntimeException(e2);
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException unused3) {
                            ((l22) q03Var.L).execute(new m90(-3, 0, (dz4) q03Var.B));
                        }
                    }
                } else {
                    i.i("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
            } else {
                String a3 = ce2.a(i3, arrayList2);
                Typeface typeface2 = (Typeface) ce2.a.h(a3);
                if (typeface2 != null) {
                    l22Var.execute(new qj2(5, (Object) obj, typeface2));
                    k = typeface2;
                } else {
                    dn1 dn1Var = new dn1(1, q03Var);
                    synchronized (ce2.c) {
                        try {
                            m66 m66Var = ce2.d;
                            ArrayList arrayList5 = (ArrayList) m66Var.get(a3);
                            if (arrayList5 != null) {
                                arrayList5.add(dn1Var);
                            } else {
                                ArrayList arrayList6 = new ArrayList();
                                arrayList6.add(dn1Var);
                                m66Var.put(a3, arrayList6);
                                ae2 ae2Var = new ae2(a3, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = ce2.b;
                                dn1 dn1Var2 = new dn1(2, a3);
                                if (Looper.myLooper() == null) {
                                    handler = new Handler(Looper.getMainLooper());
                                } else {
                                    handler = new Handler();
                                }
                                fs4 fs4Var = new fs4();
                                fs4Var.B = ae2Var;
                                fs4Var.L = dn1Var2;
                                fs4Var.R = handler;
                                threadPoolExecutor.execute(fs4Var);
                            }
                        } finally {
                        }
                    }
                }
            }
        } else {
            k = a.k(context, (ee2) de2Var, resources, i3);
            if (io2Var != null) {
                if (k != null) {
                    new Handler(Looper.getMainLooper()).post(new xc4(3, io2Var, k));
                } else {
                    io2Var.j(-3);
                }
            }
        }
        if (k != null) {
            b.l(b(resources, i, str, i2, i3), k);
        }
        return k;
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
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, (float) RecyclerView.A1, (float) RecyclerView.A1, false, c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount != 0) {
            font = shapeTextRun.getFont(0);
            return font;
        }
        return null;
    }
}
