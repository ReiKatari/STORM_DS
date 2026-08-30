package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u07  reason: default package */
/* loaded from: classes.dex */
public class u07 extends hk2 {
    public static Font W(FontFamily fontFamily, int i) {
        int i2;
        int i3;
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = 400;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        FontStyle fontStyle = new FontStyle(i2, i3);
        Font font = fontFamily.getFont(0);
        int Z = Z(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int Z2 = Z(fontStyle, font2.getStyle());
            if (Z2 < Z) {
                font = font2;
                Z = Z2;
            }
        }
        return font;
    }

    public static int Z(FontStyle fontStyle, FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    public final FontFamily X(se2[] se2VarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (se2 se2Var : se2VarArr) {
            if (Objects.equals(se2Var.a.getScheme(), "systemfont")) {
                font = Y(se2Var);
            } else {
                try {
                    Uri uri = se2Var.a;
                    str = se2Var.e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(se2Var.c).setSlant(se2Var.d ? 1 : 0).setTtcIndex(se2Var.b);
                    if (!TextUtils.isEmpty(str)) {
                        ttcIndex.setFontVariationSettings(str);
                    }
                    font = ttcIndex.build();
                    openFileDescriptor.close();
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font Y(se2 se2Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.hk2
    public final Typeface k(Context context, ee2 ee2Var, Resources resources, int i) {
        fe2[] fe2VarArr;
        try {
            FontFamily.Builder builder = null;
            for (fe2 fe2Var : ee2Var.a) {
                try {
                    Font build = new Font.Builder(resources, fe2Var.f).setWeight(fe2Var.b).setSlant(fe2Var.c ? 1 : 0).setTtcIndex(fe2Var.e).setFontVariationSettings(fe2Var.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(W(build2, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.hk2
    public final Typeface l(Context context, se2[] se2VarArr, int i) {
        try {
            FontFamily X = X(se2VarArr, context.getContentResolver());
            if (X == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(X).setStyle(W(X, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.hk2
    public final Typeface m(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily X = X((se2[]) list.get(0), contentResolver);
            if (X == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(X);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily X2 = X((se2[]) list.get(i2), contentResolver);
                if (X2 != null) {
                    customFallbackBuilder.addCustomFallback(X2);
                }
            }
            return customFallbackBuilder.setStyle(W(X, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.hk2
    public final Typeface n(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
