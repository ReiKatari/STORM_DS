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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pe7  reason: default package */
/* loaded from: classes.dex */
public class pe7 extends bl2 {
    public static Font X(FontFamily fontFamily, int i) {
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
        int a0 = a0(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int a02 = a0(fontStyle, font2.getStyle());
            if (a02 < a0) {
                font = font2;
                a0 = a02;
            }
        }
        return font;
    }

    public static int a0(FontStyle fontStyle, FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    public final FontFamily Y(rj2[] rj2VarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (rj2 rj2Var : rj2VarArr) {
            if (Objects.equals(rj2Var.a.getScheme(), "systemfont")) {
                font = Z(rj2Var);
            } else {
                try {
                    Uri uri = rj2Var.a;
                    str = rj2Var.e;
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
                    Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(rj2Var.c).setSlant(rj2Var.d ? 1 : 0).setTtcIndex(rj2Var.b);
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

    public Font Z(rj2 rj2Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.bl2
    public final Typeface o(Context context, bj2 bj2Var, Resources resources, int i) {
        cj2[] cj2VarArr;
        try {
            FontFamily.Builder builder = null;
            for (cj2 cj2Var : bj2Var.a) {
                try {
                    Font build = new Font.Builder(resources, cj2Var.f).setWeight(cj2Var.b).setSlant(cj2Var.c ? 1 : 0).setTtcIndex(cj2Var.e).setFontVariationSettings(cj2Var.d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(X(build2, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.bl2
    public final Typeface p(Context context, rj2[] rj2VarArr, int i) {
        try {
            FontFamily Y = Y(rj2VarArr, context.getContentResolver());
            if (Y == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(Y).setStyle(X(Y, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.bl2
    public final Typeface q(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily Y = Y((rj2[]) list.get(0), contentResolver);
            if (Y == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(Y);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily Y2 = Y((rj2[]) list.get(i2), contentResolver);
                if (Y2 != null) {
                    customFallbackBuilder.addCustomFallback(Y2);
                }
            }
            return customFallbackBuilder.setStyle(X(Y, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.bl2
    public final Typeface r(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
