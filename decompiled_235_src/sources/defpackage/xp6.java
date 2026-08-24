package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xp6  reason: default package */
/* loaded from: classes.dex */
public final class xp6 {
    public final int a;
    public final me6 b;
    public final int[][] c;
    public final me6[] d;
    public final wp6 e;
    public final wp6 f;
    public final wp6 g;
    public final wp6 h;

    public xp6(h03 h03Var) {
        this.a = h03Var.b;
        this.b = (me6) h03Var.c;
        this.c = (int[][]) h03Var.d;
        this.d = (me6[]) h03Var.e;
        this.e = (wp6) h03Var.f;
        this.f = (wp6) h03Var.g;
        this.g = (wp6) h03Var.h;
        this.h = (wp6) h03Var.i;
    }

    public static void a(h03 h03Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        int[] iArr = a75.r;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        me6 a = me6.a(context, obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), new t(RecyclerView.B1)).a();
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i = 0;
                        for (int i2 = 0; i2 < attributeCount; i2++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                            if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                int i3 = i + 1;
                                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i] = attributeNameResource;
                                i = i3;
                            }
                        }
                        h03Var.a(StateSet.trimStateSet(iArr2, i), a);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static xp6 b(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        AttributeSet asAttributeSet;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        h03 h03Var = new h03(1);
        h03Var.d();
        try {
            xml = context.getResources().getXml(resourceId);
            asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            h03Var.d();
        }
        if (next == 2) {
            if (xml.getName().equals("selector")) {
                a(h03Var, context, xml, asAttributeSet, context.getTheme());
            }
            xml.close();
            if (h03Var.b == 0) {
                return null;
            }
            return new xp6(h03Var);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public final me6 c() {
        me6 me6Var = this.b;
        wp6 wp6Var = this.h;
        wp6 wp6Var2 = this.g;
        wp6 wp6Var3 = this.f;
        wp6 wp6Var4 = this.e;
        if (wp6Var4 == null && wp6Var3 == null && wp6Var2 == null && wp6Var == null) {
            return me6Var;
        }
        le6 f = me6Var.f();
        if (wp6Var4 != null) {
            f.e = wp6Var4.b;
        }
        if (wp6Var3 != null) {
            f.f = wp6Var3.b;
        }
        if (wp6Var2 != null) {
            f.h = wp6Var2.b;
        }
        if (wp6Var != null) {
            f.g = wp6Var.b;
        }
        return f.a();
    }

    public final boolean d() {
        wp6 wp6Var;
        wp6 wp6Var2;
        wp6 wp6Var3;
        wp6 wp6Var4;
        if (this.a > 1 || (((wp6Var = this.e) != null && wp6Var.a > 1) || (((wp6Var2 = this.f) != null && wp6Var2.a > 1) || (((wp6Var3 = this.g) != null && wp6Var3.a > 1) || ((wp6Var4 = this.h) != null && wp6Var4.a > 1))))) {
            return true;
        }
        return false;
    }
}
