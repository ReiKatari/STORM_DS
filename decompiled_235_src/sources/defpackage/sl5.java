package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sl5  reason: default package */
/* loaded from: classes.dex */
public abstract class sl5 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, gi2 gi2Var, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Typeface typeface = null;
            if (!charSequence2.startsWith("res/")) {
                if (gi2Var != null) {
                    gi2Var.n(-3);
                }
            } else {
                int i3 = typedValue.assetCookie;
                yz3 yz3Var = je7.b;
                Typeface typeface2 = (Typeface) yz3Var.h(je7.b(resources, i, charSequence2, i3, i2));
                if (typeface2 != null) {
                    if (gi2Var != null) {
                        new Handler(Looper.getMainLooper()).post(new q64(5, gi2Var, typeface2));
                    }
                    typeface = typeface2;
                } else if (!z2) {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            aj2 O = ej2.O(resources.getXml(i), resources);
                            if (O == null) {
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                                if (gi2Var != null) {
                                    gi2Var.n(-3);
                                }
                            } else {
                                typeface = je7.a(context, O, resources, i, charSequence2, typedValue.assetCookie, i2, gi2Var, z);
                            }
                        } else {
                            int i4 = typedValue.assetCookie;
                            Typeface r = je7.a.r(context, resources, i, charSequence2, i2);
                            if (r != null) {
                                yz3Var.l(je7.b(resources, i, charSequence2, i4, i2), r);
                            }
                            if (gi2Var != null) {
                                if (r != null) {
                                    new Handler(Looper.getMainLooper()).post(new q64(5, gi2Var, r));
                                } else {
                                    gi2Var.n(-3);
                                }
                            }
                            typeface = r;
                        }
                    } catch (IOException e) {
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                        if (gi2Var != null) {
                            gi2Var.n(-3);
                        }
                        if (typeface != null) {
                        }
                        return typeface;
                    } catch (XmlPullParserException e2) {
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                        if (gi2Var != null) {
                        }
                        if (typeface != null) {
                        }
                        return typeface;
                    }
                }
            }
            if (typeface != null && gi2Var == null && !z2) {
                String hexString = Integer.toHexString(i);
                throw new Resources.NotFoundException("Font resource ID #0x" + hexString + " could not be retrieved.");
            }
            return typeface;
        }
        String resourceName = resources.getResourceName(i);
        String hexString2 = Integer.toHexString(i);
        throw new Resources.NotFoundException("Resource \"" + resourceName + "\" (" + hexString2 + ") is not a Font: " + typedValue);
    }
}
