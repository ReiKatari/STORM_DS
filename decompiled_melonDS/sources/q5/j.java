package q5;

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
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class j extends p7.j {
    public static Font N(FontFamily fontFamily, int i2) {
        int i10;
        int i11;
        if ((i2 & 1) != 0) {
            i10 = 700;
        } else {
            i10 = 400;
        }
        if ((i2 & 2) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        FontStyle fontStyle = new FontStyle(i10, i11);
        Font font = fontFamily.getFont(0);
        int Q = Q(fontStyle, font.getStyle());
        for (int i12 = 1; i12 < fontFamily.getSize(); i12++) {
            Font font2 = fontFamily.getFont(i12);
            int Q2 = Q(fontStyle, font2.getStyle());
            if (Q2 < Q) {
                font = font2;
                Q = Q2;
            }
        }
        return font;
    }

    public static int Q(FontStyle fontStyle, FontStyle fontStyle2) {
        int i2;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        return abs + i2;
    }

    public final FontFamily O(v5.g[] gVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (v5.g gVar : gVarArr) {
            if (Objects.equals(gVar.f13745a.getScheme(), "systemfont")) {
                font = P(gVar);
            } else {
                try {
                    Uri uri = gVar.f13745a;
                    str = gVar.f13749e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e6) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(gVar.f13747c).setSlant(gVar.f13748d ? 1 : 0).setTtcIndex(gVar.f13746b);
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

    public Font P(v5.g gVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // p7.j
    public final Typeface p(Context context, p5.e eVar, Resources resources, int i2) {
        p5.f[] fVarArr;
        try {
            FontFamily.Builder builder = null;
            for (p5.f fVar : eVar.f11336a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f11342f).setWeight(fVar.f11338b).setSlant(fVar.f11339c ? 1 : 0).setTtcIndex(fVar.f11341e).setFontVariationSettings(fVar.f11340d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(N(build2, i2).getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // p7.j
    public final Typeface q(Context context, v5.g[] gVarArr, int i2) {
        try {
            FontFamily O = O(gVarArr, context.getContentResolver());
            if (O == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(O).setStyle(N(O, i2).getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // p7.j
    public final Typeface r(Context context, List list, int i2) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily O = O((v5.g[]) list.get(0), contentResolver);
            if (O == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(O);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily O2 = O((v5.g[]) list.get(i10), contentResolver);
                if (O2 != null) {
                    customFallbackBuilder.addCustomFallback(O2);
                }
            }
            return customFallbackBuilder.setStyle(N(O, i2).getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // p7.j
    public final Typeface s(Context context, Resources resources, int i2, String str, int i10) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }
}
